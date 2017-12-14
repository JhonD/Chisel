package de.ubt.ai7.csv_validator.library.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.gson.JsonObject;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedDelimiters;
import de.ubt.ai7.csv_validator.console.Console;
import de.ubt.ai7.csv_validator.csvparser.csvParser;
import de.ubt.ai7.csv_validator.library.Cache;
import de.ubt.ai7.csv_validator.library.SculptCsvRelationItem;
import de.ubt.ai7.csv_validator.library.dataStructures.Region;
import de.ubt.ai7.csv_validator.library.dataStructures.RegionFactory;
import de.ubt.ai7.csv_validator.library.exceptions.CsvValidationException;
import de.ubt.ai7.csv_validator.library.exceptions.SchemaValidationException;
import de.ubt.ai7.csv_validator.library.exceptions.SchemaValidationExceptions;
import de.ubt.ai7.csv_validator.library.util.Converter;
import de.ubt.ai7.csv_validator.sculpt.AbstractToken;
import de.ubt.ai7.csv_validator.sculpt.Constraint;
import de.ubt.ai7.csv_validator.sculpt.ContentExpression;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionAbstractToken;
import de.ubt.ai7.csv_validator.sculpt.Delimiters;
import de.ubt.ai7.csv_validator.sculpt.NodeExpression;
import de.ubt.ai7.csv_validator.sculpt.PathExpression;
import de.ubt.ai7.csv_validator.sculpt.SchemaElement;
import de.ubt.ai7.csv_validator.sculpt.Sculpt;
import de.ubt.ai7.csv_validator.util.Coordinate;
import de.ubt.ai7.csv_validator.util.MarkerType;
import de.ubt.ai7.csv_validator.util.Pair;

public class SculptCsvRelationItemImpl extends Observable implements SculptCsvRelationItem {
	public static final String NO_CSV_ERROR_MESSAGE = "No Csv file has been loaded yet! Please load Csv file.";
	public static final String NO_SCHEMA_ERROR_MESSAGE = "No Sculpt file has been loaded yet! Please load a Sculpt file.";
	public static final String SCHEMA_VALIDATION_FAILED = "The schema is not valid, please fix the errors first.";
	public static final String FILE_LOADED = " loaded";
	public static final String CSV_VALIDATION_FAILED = " is not valid against ";

	public static final String CSV_VALIDATION_SUCESSFUL = " is valid against ";
	public static final String NO_SELECTION_FOUND = "No selection was recogniced, please move the curser to the region of the schema your want to highlight in the csv file.";
	public static final String INVALID_DELIMITERS = "None of the delimiters must be empty.";

	private final Cache interpreter;
	private XtextEditor sculptEditor;
	private AnnotationErrorInjector annotationHandler;
	private CachedDelimiters csvDataDelimiters;
	private String csvText;
	private String csvFileName;

	private enum RegionMarkMode {
		SINGLE, INTERSECTION, UNION
	}

	private RegionMarkMode prevRegionMarkMode;
	private RegionMarkMode regionMarkMode;
	private MarkerType markerType;

	private Region currentlyMarkedRegion;
	private final Map<SchemaElement, IMarker> currentlySelectedElements;

	public SculptCsvRelationItemImpl() {
		this.interpreter = new CacheImpl();

		regionMarkMode = prevRegionMarkMode = RegionMarkMode.UNION;
		markerType = MarkerType.DEFAULT_MARKER;
		currentlyMarkedRegion = emptyRegion();
		currentlySelectedElements = new HashMap<SchemaElement, IMarker>();
	}

	/////////////////////////////////////////////
	// external events which change the marking//
	/////////////////////////////////////////////

	@Override
	public void toggleMarking(final EObject element) {
		if (!currentRelationItemStateIsOk()) {
			return;
		}

		if (element == null || !(element instanceof SchemaElement)) {
			Console.INSTANCE.printlnNegative(NO_SELECTION_FOUND);
			return;
		} else if (element instanceof ContentExpressionAbstractToken) {
			final ContentExpressionAbstractToken contentExpressionToken = (ContentExpressionAbstractToken) element;
			toggleMarkingInternal(contentExpressionToken.getToken());
		} else if (element instanceof PathExpression || element instanceof ContentExpression) {
			toggleMarking(element.eContainer());
		} else {
			toggleMarkingInternal((SchemaElement) element);
		}

	}

	@Override
	public void markElements(final Coordinate cell) {
		setRegionMarkMode(RegionMarkMode.SINGLE);
		setMarkerType(MarkerType.DEFAULT_MARKER);

		if (!currentRelationItemStateIsOk()) {
			return;
		}

		try {
			for (final SchemaElement elem : interpreter.getSemanticObjects(cell)) {
				markElement(elem);
			}

			// Mark the selected Coordinate
			markRegion(Converter.coordinateToRegion(cell, interpreter.getRowNumber(), interpreter.getColumnNumber()));
			fireMarkingChanged();
		} catch (final CsvValidationException e) {
			markConstraintError(e);
		}

	}

	@Override
	public void resetMarkMode() {
		resetSculptMarkers();
		currentlyMarkedRegion = emptyRegion();

		setRegionMarkMode(RegionMarkMode.UNION);
		setMarkerType(MarkerType.DEFAULT_MARKER);

		fireMarkingChanged();
	}

	@Override
	public void setShowIntersection(final boolean showIntersection) {
		if (showIntersection) {
			setRegionMarkMode(RegionMarkMode.INTERSECTION);
		} else {
			setRegionMarkMode(RegionMarkMode.UNION);
		}
		fireMarkingChanged();
	}

	@Override
	public void showUncoveredCells() {
		if (!currentRelationItemStateIsOk()) {
			return;
		}

		Region region;
		try {
			region = interpreter.getUncoveredCells();

			System.out.println("Uncovered cells: " + region);

			setRegionMarkMode(RegionMarkMode.SINGLE);
			setMarkerType(MarkerType.DEFAULT_MARKER);
			markRegion(region);

			fireMarkingChanged();
		} catch (final CsvValidationException e) {
			markConstraintError(e);
		}

	}

	/////////////////////////////////////////////////
	// internal methods to handle and track marking//
	/////////////////////////////////////////////////

	private void setMarkerType(final MarkerType markerType) {
		this.markerType = markerType;
	}

	private void setRegionMarkMode(final RegionMarkMode regionMarkMode) {
		if (this.regionMarkMode == RegionMarkMode.SINGLE || regionMarkMode == RegionMarkMode.SINGLE) {
			resetSculptMarkers();
			currentlyMarkedRegion = emptyRegion();
		}

		if (this.regionMarkMode == regionMarkMode) {
			return;
		}

		this.prevRegionMarkMode = this.regionMarkMode;
		this.regionMarkMode = regionMarkMode;
		switch (regionMarkMode) {
		case INTERSECTION:
			currentlyMarkedRegion = RegionFactory.INSTANCE.newRegion(interpreter.getRowNumber(),
					interpreter.getColumnNumber(), true);
			currentlySelectedElements.keySet().forEach(x -> markRegion(getRegion(x)));
			break;
		case UNION:
			currentlyMarkedRegion = emptyRegion();
			currentlySelectedElements.keySet().forEach(x -> markRegion(getRegion(x)));
			break;
		default:
			break;

		}
	}

	private void toggleMarkingInternal(final SchemaElement element) {
		setMarkerType(MarkerType.DEFAULT_MARKER);
		if (this.regionMarkMode == RegionMarkMode.SINGLE) {
			setRegionMarkMode(prevRegionMarkMode);
		}

		final IMarker marker = currentlySelectedElements.get(element);

		if (marker == null) {
			final Region region = getRegion(element);

			markRegion(region);
			markElement(element);
		} else {// Selection was already in the set, it was a
			// deselection
			currentlySelectedElements.remove(element);
			reset(marker);
			if (regionMarkMode == RegionMarkMode.INTERSECTION) {
				currentlyMarkedRegion = RegionFactory.INSTANCE.newRegion(interpreter.getRowNumber(),
						interpreter.getColumnNumber(), true);
			} else {
				currentlyMarkedRegion = emptyRegion();
			}
			currentlySelectedElements.keySet().forEach(x -> markRegion(getRegion(x)));
		}

		fireMarkingChanged();
	}

	private void markConstraintError(final CsvValidationException e) {
		setMarkerType(MarkerType.ERROR_MARKER);
		setRegionMarkMode(RegionMarkMode.SINGLE);
		markRegion(e.getErrorRegion());
		SchemaElement source = (SchemaElement) e.getSource();
		if (e.getFeature() != null) {
			source = (SchemaElement) source.eGet(e.getFeature());
		}
		if (source == null)
		{
			source = (SchemaElement) e.getSource(); // Feature not set
		}

		markElement(source);

		fireMarkingChanged();
	}

	private void resetSculptMarkers() {
		currentlySelectedElements.values().forEach(x -> reset(x));
		currentlySelectedElements.clear();
	}

	private void reset(final IMarker marker) {
		if (marker == null) {
			return;
		}

		try {
			marker.delete();
		} catch (final CoreException e) {
			e.printStackTrace();
		}

	}

	private IMarker markElement(final SchemaElement element) {
		final ICompositeNode node = NodeModelUtils.findActualNodeFor(element);
		final IFileEditorInput input = (IFileEditorInput) sculptEditor.getEditorInput();
		final IFile file = input.getFile();
		IMarker marker = null;

		try {
			marker = file.createMarker(markerType.getRefference());
			marker.setAttribute(IMarker.CHAR_START, node.getOffset());
			marker.setAttribute(IMarker.CHAR_END, node.getEndOffset());
			currentlySelectedElements.put(element, marker);
		} catch (final CoreException e) {
			e.printStackTrace();
		}

		return marker;
	}

	/**
	 * marks the cells on the csv tab depending on the markMode
	 */
	private void markRegion(final Region region) {
		if (region == null) {
			return;
		}

		switch (regionMarkMode) {
		case INTERSECTION:
			currentlyMarkedRegion.logicalAnd(region);
			break;
		case UNION:
			currentlyMarkedRegion.logicalOr(region);
			break;
		case SINGLE:
			currentlyMarkedRegion = region;
			break;
		default:
			System.out.println("Change mark mode first");
			break;

		}

	}

	private void fireMarkingChanged() {
		this.setChanged();
		this.notifyObservers(new Pair<Region, MarkerType>(currentlyMarkedRegion, markerType));
	}

	///////////////////////////////////
	// modifications on csv or schema//
	///////////////////////////////////

	@Override

	public void clearCaches() {
		interpreter.clearCaches();
		Console.INSTANCE.println("Caches cleared");
	}

	@Override
	public void registerSchema(final XtextEditor sculptEditor) {

		if (this.sculptEditor == null || this.sculptEditor != sculptEditor) {
			Console.INSTANCE.println(sculptEditor.getTitle() + FILE_LOADED);
		}
		this.sculptEditor = sculptEditor;
		this.annotationHandler = new AnnotationErrorInjector(sculptEditor);

		if (updateSchema()) {
			if (delimitersChanged()) {
				this.registerCsv(this.csvText, null, this.csvFileName);
				currentlyMarkedRegion = emptyRegion();
			}
			resetSculptMarkers();
		}
		resetMarkMode();

	}

	@Override
	public boolean registerCsv(final String originalInput, final Delimiters delimiters, final String csvFileName) {
		CachedDelimiters delims;
		if (delimiters == null) {
			delims = getDelimiters();
		} else {
			if (!setDelimiters(delimiters)) {
				return false;
			}
			delims = getDelimiters();
		}
		if (originalInput == null || delims == null) {
			return false;
		}
		final List<List<String>> csvData = csvParser.parse(originalInput, delims.getColDelim(), delims.getRowDelim());

		this.csvText = originalInput;
		this.csvFileName = csvFileName;
		csvDataDelimiters = delims;
		interpreter.setCsvData(csvData);

		// notify Observers
		this.setChanged();
		this.notifyObservers();
		Console.INSTANCE.println(csvFileName + FILE_LOADED);

		return true;
	}

	@Override
	public boolean validateSculptSchema() throws IllegalStateException {
		if (markerType == MarkerType.ERROR_MARKER) {
			resetMarkMode();
		}

		if (this.sculptEditor == null) {
			Console.INSTANCE.printlnNegative(NO_SCHEMA_ERROR_MESSAGE);
			return false;
		}
		sculptEditor.doSave(null);

		if (!currentRelationItemStateIsOk()) {
			Console.INSTANCE.printlnNegative(SCHEMA_VALIDATION_FAILED);
			return false;
		}

		try {
			interpreter.validateConstraints();
			Console.INSTANCE.printlnPositive(this.csvFileName + CSV_VALIDATION_SUCESSFUL + sculptEditor.getTitle());
			return true;
		} catch (final CsvValidationException e) {
			Console.INSTANCE.printlnNegative(this.csvFileName + CSV_VALIDATION_FAILED + sculptEditor.getTitle());

			markConstraintError(e);

			return false;
		}

	}

	////////////////////////////////////////
	// helper methods, getters and setters//
	////////////////////////////////////////

	/**
	 *
	 * @return newly parsed schema
	 */
	private Sculpt retrieveSchema() {
		if (sculptEditor == null) {
			Console.INSTANCE.println(NO_SCHEMA_ERROR_MESSAGE);
			return null;
		}

		final IXtextDocument xtextDocument = sculptEditor.getDocument();
		final Sculpt schema = xtextDocument.readOnly(new IUnitOfWork<Sculpt, XtextResource>() {
			@Override
			public Sculpt exec(final XtextResource state) throws Exception {
				final Sculpt schema = (Sculpt) state.getContents().get(0);
				if (!state.getErrors().isEmpty()) {
					return null;
				}
				return schema;
			}
		});

		return schema;
	}

	/**
	 * reparses the schema
	 *
	 * @return schema is valid
	 */
	private boolean updateSchema() {
		final Sculpt schema = retrieveSchema();
		if (schema == null) {
			return false;
		}

		final BasicDiagnostic diagnostics = Diagnostician.INSTANCE.createDefaultDiagnostic(schema);

		if (!Diagnostician.INSTANCE.validate(schema, diagnostics)) {
			return false;
		}

		try {
			interpreter.setSchema(schema);
		} catch (final SchemaValidationExceptions e) {
			for (final SchemaValidationException error : e.getExceptions()) {
				diagnostics.add(annotationHandler.createDiagnostic(error));
			}

			annotationHandler.injectErrors(diagnostics);
			return false;
		}

		return true;
	}

	/**
	 * Check whether the delimiters are the same like when the CsvData was
	 * loaded
	 *
	 * @return true iff delimiters did change
	 */
	private boolean delimitersChanged() {
		final CachedDelimiters delim = getDelimiters();
		if (delim == null) {
			return false;
		}
		return !delim.equals(csvDataDelimiters);
	}

	private Region emptyRegion() {
		return RegionFactory.INSTANCE.newRegion(interpreter.getRowNumber(), interpreter.getColumnNumber(), false);
	}

	private Region getRegion(final SchemaElement element) {
		try {
			if (element instanceof NodeExpression) {
				return interpreter.getRegion((NodeExpression) element);
			}
			if (element instanceof AbstractToken) {
				return interpreter.getRegion((AbstractToken) element);
			} else if (element instanceof Constraint) {
				return interpreter.getRegion((Constraint) element);
			}
		} catch (final CsvValidationException e) {
			e.printStackTrace();
		}

		return emptyRegion();
	}

	@Override
	public List<List<String>> getCsvArray() {
		return interpreter.getCsvData();

	}

	@Override

	public String getCsvEntry(final Coordinate coord) {
		return interpreter.getCsvEntry(coord);
	}

	private boolean currentRelationItemStateIsOk() {

		if (!interpreter.isCsvDataSet()) {
			Console.INSTANCE.println(NO_CSV_ERROR_MESSAGE);
			return false;
		}

		if (!updateSchema()) {
			return false;
		}

		if (delimitersChanged()) {
			this.registerCsv(this.csvText, null, this.csvFileName);
		}
		return true;
	}

	@Override
	public boolean hasDelimiters() {
		return getDelimiters() != null;
	}

	private boolean setDelimiters(final Delimiters delim) {
		try {
			interpreter.setDelimiters(delim);
		} catch (final SchemaValidationException e) {
			Console.INSTANCE.printlnNegative(INVALID_DELIMITERS);
			return false;
		}
		return true;
	}

	public CachedDelimiters getTransformationDelimiters() {
		return interpreter.getTransformationDelimiters();
	}

	@Override
	public CachedDelimiters getDelimiters() {
		return interpreter.getDelimiters();
	}

	@Override
	public boolean hasTransformationProgram() {
		return interpreter.hasTransformationProgram();
	}

	@Override
	public char getTransformationRowDelim() {
		return getTransformationDelimiters().getRowDelim();
	}

	@Override
	public char getTransformationColDelim() {
		return getTransformationDelimiters().getColDelim();
	}

	@Override
	public Pair<List<List<String>>, JsonObject> getTransformedCsv() {
		if (!validateSculptSchema()) { // checks schema for modifications,
			// resets markers
			return null;

		}
		try {
			return interpreter.getTransformedCsv();
		} catch (final CsvValidationException e) {
			markConstraintError(e);
			return null;
		}
	}

}

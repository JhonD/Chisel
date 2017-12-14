package de.ubt.ai7.csv_validator.csv.tabularOutline.internal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Observable;
import java.util.Observer;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import de.ubt.ai7.csv_validator.console.Console;
import de.ubt.ai7.csv_validator.csvEditorMenu.SetDelimiterDialog;
import de.ubt.ai7.csv_validator.csvparser.csvParser;
import de.ubt.ai7.csv_validator.library.CsvApi;
import de.ubt.ai7.csv_validator.library.SculptCsvRelationItem;
import de.ubt.ai7.csv_validator.library.SculptCsvRelationManager;
import de.ubt.ai7.csv_validator.library.dataStructures.Region;
import de.ubt.ai7.csv_validator.sculpt.Delimiters;
import de.ubt.ai7.csv_validator.sculpt.SculptFactory;
import de.ubt.ai7.csv_validator.util.Coordinate;
import de.ubt.ai7.csv_validator.util.MarkerType;
import de.ubt.ai7.csv_validator.util.Pair;

public class TableViewTab implements Observer {

	private static final String BUTTONS_GROUP_TEXT = "Control Panel";
	private static final String BTN_TEXT_LOAD_CSV = "Load CSV";
	private static final String BTN_TEXT_DELETE_TAB = "Close Tab";
	private static final String BTN_TEXT_CLEAR_CACHES = "Clear Caches";
	private static final String BTN_TEXT_EXTRACT_MARKED = "Extract Selection";
	private static final String BTN_TEXT_TRANSFORM_CSV = "Transform CSV";
	private static final String BTN_TEXT_MARK_MODE = "Enable Selection";
	private static final String BTN_TEXT_MARK_MODE_ENABLED = "Disable Selection";
	private static final String BTN_TEXT_UNCOVERED_CELLS = "Show Uncovered Cells";
	private static final String BTN_TEXT_MARKMODE_UNION = "Show Intersection";
	private static final String BTN_TEXT_MARKMODE_INTERSECTION = "Show Union";
	private static final String BTN_TEXT_VALIDATE = "Validate";
	private static final String BTN_TEXT_LOAD_SCULPT = "Load Sculpt";

	private static final Color DEFAULT_MARK_COLOR = new Color(Display.getCurrent(), 100, 255, 100);
	private static final Color ERROR_MARK_COLOR = new Color(Display.getCurrent(), 255, 151, 151);

	private static final String[] CSV_FILTER_EXTENSIONS = { "*.csv", "*.*" };
	private static final String[] CSV_FILTER_NAMES = { "Csv Files", "All Files (*.*)" };
	private static final String TEXT_EXPORT_CSV = "Export Region";

	private static final String[] JSON_FILTER_EXTENSIONS = { "*.json", "*.*" };
	private static final String[] JSON_FILTER_NAMES = { "Json Files", "All Files (*.*)" };
	private static final String TEXT_EXPORT_JSON = "Export W3C schema";

	private static final String TEXT_ENABLED_MARKER_MODE = "Mark Mode enabled. Click a cell or double click a schema element.";

	private static final int MAX_COLUMNS = 1000;
	private static final int MAX_ROWS = 10000;

	private final SculptCsvRelationItem correspondingRelationItem;

	private final Shell shell;
	private final TabItem tabItem;
	// Buttons and Forms
	private SashForm outerSashForm;
	private Button btnLoadCsv;
	private Button btnLoadSculpt;
	private Button btnValidate;
	private Button btnMarkMode;
	private Button btnExtractMarked;
	private Button btnUncoveredCells;
	private Button btnClearCaches;
	private Button btnDeleteTab;

	private boolean csvLoaded = false;
	private boolean sculptLoaded = false;
	private boolean markModeEnabled = false;
	private boolean markModeUnion = true;
	private Region exportableRegion;

	private Table table;
	private int columnNumber;
	private int rowNumber;

	public TableViewTab(final TabItem parentItem, final SculptCsvRelationItem correspondingRelationItem,
			final Shell shell) {
		this.tabItem = parentItem;
		this.shell = shell;
		correspondingRelationItem.addObserver(this);
		this.correspondingRelationItem = correspondingRelationItem;

		createViewer(parentItem);
	}

	private void createViewer(final TabItem tabItem) {
		outerSashForm = new SashForm(tabItem.getParent(), SWT.VERTICAL);
		tabItem.setControl(outerSashForm);

		table = new Table(outerSashForm, SWT.BORDER | SWT.FULL_SELECTION);
		table.setHeaderVisible(false);
		table.setLinesVisible(true);

		// Font Setting for TableView -- IT'S A HACK! Change it later..
		// FontDialog d = new FontDialog(shell);
		// FontData data = d.open();
		// table.setFont(new Font(tabItem.getDisplay(), data));

		table.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(final Event event) {
				table.deselectAll();
			}
		});

		final Group grpButtonsGroup = new Group(outerSashForm, SWT.NONE);
		grpButtonsGroup.setText(BUTTONS_GROUP_TEXT);

		final GridLayout btnGroupLayout = new GridLayout();
		btnGroupLayout.numColumns = 4;
		btnGroupLayout.makeColumnsEqualWidth = true;

		grpButtonsGroup.setLayout(btnGroupLayout);

		btnValidate = new Button(grpButtonsGroup, SWT.NONE);
		btnValidate.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		btnValidate.setText(BTN_TEXT_VALIDATE);

		btnMarkMode = new Button(grpButtonsGroup, SWT.NONE);
		btnMarkMode.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		btnMarkMode.setText(BTN_TEXT_MARK_MODE);

		btnExtractMarked = new Button(grpButtonsGroup, SWT.NONE);
		btnExtractMarked.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		btnExtractMarked.setText(BTN_TEXT_TRANSFORM_CSV);

		btnUncoveredCells = new Button(grpButtonsGroup, SWT.NONE);
		btnUncoveredCells.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		btnUncoveredCells.setText(BTN_TEXT_UNCOVERED_CELLS);

		btnLoadCsv = new Button(grpButtonsGroup, SWT.NONE);
		btnLoadCsv.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		btnLoadCsv.setText(BTN_TEXT_LOAD_CSV);

		btnLoadSculpt = new Button(grpButtonsGroup, SWT.NONE);
		btnLoadSculpt.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		btnLoadSculpt.setText(BTN_TEXT_LOAD_SCULPT);

		btnClearCaches = new Button(grpButtonsGroup, SWT.NONE);
		btnClearCaches.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		btnClearCaches.setText(BTN_TEXT_CLEAR_CACHES);

		btnDeleteTab = new Button(grpButtonsGroup, SWT.NONE);
		btnDeleteTab.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		btnDeleteTab.setText(BTN_TEXT_DELETE_TAB);

		outerSashForm.setWeights(new int[] { 8, 2 });

		createActions();

		// Load data into Table
		fillTable();

		table.addListener(SWT.MouseDown, new TableMouseClickListener());
	}

	@Override
	public void update(final Observable o, final Object arg) {
		if (arg instanceof Pair) {
			final Pair<?, ?> pair = (Pair<?, ?>) arg;
			if (pair.left instanceof Region && pair.right instanceof MarkerType) {
				clearColors(); // reset previous colorings
				final Region region = (Region) pair.left;
				final MarkerType type = (MarkerType) pair.right;

				if (region.isEmpty()) {
					return;
				}

				Color markColor = DEFAULT_MARK_COLOR;
				if (type.equals(MarkerType.ERROR_MARKER)) {
					markColor = ERROR_MARK_COLOR;
				}
				if (type.equals(MarkerType.DEFAULT_MARKER)) { // We only want to
					// enable good
					// regions for
					// the export
					exportableRegion = region;
					checkExtractionButton();
				}

				Coordinate first = null;
				for (final Coordinate current : region.unsortedIteration()) {
					if (current.ROW > MAX_ROWS || current.COLUMN > MAX_COLUMNS) {
						if (type.equals(MarkerType.ERROR_MARKER)) {
							Console.INSTANCE.printlnNegative(
									"Error at " + current + ": " + correspondingRelationItem.getCsvEntry(current));
						}
						continue;
					}
					if (first == null || current.ROW < first.ROW
							|| (current.ROW == first.ROW && current.COLUMN < first.COLUMN)) {
						first = current;
					}
					if (this.getSculptCsvRelationItem().getCsvEntry(current) != null) {
						this.table.getItem(current.ROW - 1).setBackground(current.COLUMN - 1, markColor);
					}
				}
				if (first != null) {
					// idea: for the best focus we show the cell diagonal right
					// down of the wanted cell

					int row = first.ROW;
					int column = first.COLUMN;
					if (row >= this.table.getItemCount()) { // last row
						row--;
					}
					if (column >= this.columnNumber) { // last column
						column--;
					}

					this.table.showItem(this.table.getItem(row));
					this.table.showColumn(this.table.getColumn(column));

					// now move to the actuall cell to make sure its shown
					// this.table.showItem(this.table.getItem(row - 1));
					// this.table.showColumn(this.table.getColumn(column - 1));

				}
			}
		} else {
			updateCsvData();
		}
	}

	private void fillTable() {
		final List<List<String>> csvArray = this.correspondingRelationItem.getCsvArray();

		if (csvArray == null) { // if the csv file is not set yet
			return;
		}

		computeColumnNumber(csvArray);
		if (columnNumber > MAX_COLUMNS) {
			columnNumber = MAX_COLUMNS;
		}
		rowNumber = csvArray.size() <= MAX_ROWS ? csvArray.size() : MAX_ROWS;

		// create columns
		for (int i = 0; i < columnNumber; i++) {
			new TableColumn(table, SWT.NONE);
		}

		// fill them with information
		for (int index = 0; index < rowNumber; ++index) {
			final List<String> row = csvArray.get(index);
			final TableItem item = new TableItem(table, SWT.NONE);
			int column = 0;
			for (final String str : row) {
				// set to empty string if label doesn't contain text
				item.setText(column++, str == null ? "" : str);
			}
		}

		for (int i = 0; i < columnNumber; i++) {
			table.getColumn(i).pack();
		}
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		btnValidate.setEnabled(false);
		btnMarkMode.setEnabled(false);
		btnExtractMarked.setEnabled(false);
		btnUncoveredCells.setEnabled(false);
		btnClearCaches.setEnabled(false);

		btnValidate.addSelectionListener(new ValidateCsvSelectionListener());
		btnLoadCsv.addSelectionListener(new LoadCSVSelectionListener());
		btnLoadSculpt.addSelectionListener(new LoadSculptSelectionListener());
		btnClearCaches.addSelectionListener(new ClearCachesSelectionListener());
		btnDeleteTab.addSelectionListener(new DeleteTabSelectionListener());
		btnMarkMode.addSelectionListener(new MarkModeSelectionListener());
		btnExtractMarked.addSelectionListener(new ExportDataSelectionListener());
		btnUncoveredCells.addSelectionListener(new UncoveredCellsSelectionListener());
	}

	private void updateCsvData() {
		this.table.removeAll();
		this.fillTable();
	}

	private void clearColors() {
		for (final TableItem t : this.table.getItems()) {
			for (int i = 0; i < columnNumber; ++i) {
				t.setBackground(i, null);
			}
		}
	}

	private int computeColumnNumber(final List<List<String>> csvArray) {
		this.columnNumber = 0;
		for (final List<String> row : csvArray) {
			final int rowColumns = row.size();
			if (columnNumber < rowColumns) {
				columnNumber = rowColumns;
			}
		}
		return this.columnNumber;
	}

	/*
	 * inner classes for the different Menu selections
	 */

	private class TableMouseClickListener implements Listener {
		@Override
		public void handleEvent(final Event event) {
			if (!markModeEnabled && csvLoaded && sculptLoaded) {
				markerModeEnabled();
			}
			final Point pt = new Point(event.x, event.y);
			final TableItem item = table.getItem(pt);
			if (item == null) {
				return;
			}
			Coordinate selectedCell = null;
			for (int i = 0; i < columnNumber; i++) {
				final Rectangle rect = item.getBounds(i);
				if (rect.contains(pt)) {
					final int index = table.indexOf(item);
					System.out.println("Item " + index + "-" + i);
					selectedCell = new Coordinate(index + 1, i + 1);
				}
			}
			if (selectedCell != null) {
				correspondingRelationItem.markElements(selectedCell);
			}
		}
	}

	public Table getTable() {
		return table;
	}

	private class LoadCSVSelectionListener extends SelectionAdapter implements SelectionListener {
		@Override
		public void widgetSelected(final SelectionEvent e) {
			final IFile csvFile = openLoadCsvDialog();// get the text
			if (csvFile == null) {
				return;
			}
			String csvContent;
			try {
				csvContent = convertStreamToString(csvFile.getContents());
			} catch (CoreException | IOException exception) {
				exception.printStackTrace();
				return;
			}

			Delimiters delim = null;

			if (!correspondingRelationItem.hasDelimiters()) {
				delim = SculptFactory.eINSTANCE.createDelimiters();
				final SetDelimiterDialog delimDialog = new SetDelimiterDialog(shell);
				delimDialog.create();
				if (delimDialog.open() == Window.OK) {
					delim.setColDelim(delimDialog.getColDelim());
					delim.setRowDelim(delimDialog.getRowDelim());
				} else { // user aborted the mission.
					System.out.println("User cancled delimiter Dialog");
					Console.INSTANCE.printlnNegative("User cancled delimiter Dialog");
					return;
				}
			}

			if (!CsvApi.INSTANCE.registerCsv(csvContent, delim, correspondingRelationItem, csvFile.getName())) {
				return;
			}

			csvLoaded = true;
			if (csvLoaded && sculptLoaded)

			{
				csvAndSculptLoaded();
			}
		}
	}

	private class LoadSculptSelectionListener extends SelectionAdapter implements SelectionListener {
		@Override
		public void widgetSelected(final SelectionEvent e) {
			final XtextEditor editor = openLoadSculptDialog();
			if (editor == null) {
				return;
			}
			CsvApi.INSTANCE.registerSchema(editor, correspondingRelationItem);
			sculptLoaded = true;
			if (csvLoaded && sculptLoaded) {
				csvAndSculptLoaded();
			}
			editor.getShell().getDisplay().addFilter(SWT.MouseDoubleClick, event -> {
				if (!markModeEnabled && csvLoaded && sculptLoaded) {// Enable
					// marker
					// mode
					markerModeEnabled();

				}
				final StyledText editorWidget = (StyledText) editor.getAdapter(Control.class);
				if (editorWidget != event.widget) {
					return; // click was somewhere else!
				}
				final int caret = editorWidget.getCaretOffset() - 1;
				// int activeLine =
				// editorWidget.getLineAtOffset(editorWidget.getCaretOffset());
				// int col = caret - editorWidget.getOffsetAtLine(activeLine);
				// System.out.println("line " + activeLine + "column " + col);
				final IXtextDocument xtextDocument = editor.getDocument();
				final EObject selectedObject = xtextDocument.readOnly(new IUnitOfWork<EObject, XtextResource>() {
					@Override
					public EObject exec(final XtextResource resource) throws Exception {
						final IParseResult parseResult = resource.getParseResult();
						if (parseResult == null) {
							return null;
						}
						final ICompositeNode rootNode = parseResult.getRootNode();
						final ILeafNode node = NodeModelUtils.findLeafNodeAtOffset(rootNode, caret);
						return NodeModelUtils.findActualSemanticObjectFor(node);
					}
				});
				// System.out.println(selectedObject.getClass().toString());

				correspondingRelationItem.toggleMarking(selectedObject);
			});

			// Track Schema changes in marker mode
			editor.getDocument().addDocumentListener(new IDocumentListener() {

				@Override
				public void documentChanged(final DocumentEvent event) {
					if (markModeEnabled) {
						markerModeDisabled();
						checkExtractionButton();
					}

					if (sculptLoaded) {
						correspondingRelationItem.registerSchema(editor);
					}
				}

				@Override
				public void documentAboutToBeChanged(final DocumentEvent event) {

				}
			});
		}
	}

	private class ValidateCsvSelectionListener extends SelectionAdapter implements SelectionListener {
		@Override
		public void widgetSelected(final SelectionEvent e) {
			correspondingRelationItem.validateSculptSchema();
		}
	}

	private class ClearCachesSelectionListener extends SelectionAdapter implements SelectionListener {
		@Override
		public void widgetSelected(final SelectionEvent e) {
			correspondingRelationItem.clearCaches();
		}
	}

	private class DeleteTabSelectionListener extends SelectionAdapter implements SelectionListener {
		@Override
		public void widgetSelected(final SelectionEvent e) {
			SculptCsvRelationManager.INSTANCE.deleteRelationItem(correspondingRelationItem);
		}
	}

	private class MarkModeSelectionListener extends SelectionAdapter implements SelectionListener {
		@Override
		public void widgetSelected(final SelectionEvent e) {
			if (!markModeEnabled) {
				markerModeEnabled();
			} else {
				markerModeDisabled();
			}
		}

	}

	private void markerModeEnabled() {
		Console.INSTANCE.println(TEXT_ENABLED_MARKER_MODE);
		markModeEnabled = true;
		markModeUnion = true;
		btnMarkMode.setText(BTN_TEXT_MARK_MODE_ENABLED);
		btnUncoveredCells.setText(BTN_TEXT_MARKMODE_UNION);
		checkExtractionButton();
	}

	private void markerModeDisabled() {
		markModeEnabled = false;
		btnMarkMode.setText(BTN_TEXT_MARK_MODE);
		markModeUnion = true;
		btnUncoveredCells.setText(BTN_TEXT_UNCOVERED_CELLS);
		correspondingRelationItem.resetMarkMode();
		clearColors();
		exportableRegion = null;
		checkExtractionButton();
	}

	private void checkExtractionButton() {
		if (correspondingRelationItem.hasTransformationProgram()) {
			btnExtractMarked.setEnabled(true);
			btnExtractMarked.setText(BTN_TEXT_TRANSFORM_CSV);
		} else if (markModeEnabled) {
			btnExtractMarked.setEnabled(true);
			btnExtractMarked.setText(BTN_TEXT_EXTRACT_MARKED);
		} else {
			btnExtractMarked.setEnabled(false);
			btnExtractMarked.setText(BTN_TEXT_EXTRACT_MARKED);
		}
	}

	private class ExportDataSelectionListener extends SelectionAdapter implements SelectionListener {
		@Override
		public void widgetSelected(final SelectionEvent e) {
			final Pair<List<List<String>>, JsonObject> data = getExtractionData();
			if (data == null) {
				return;
			}
			openExportDialog(data);
		}
	}

	private class UncoveredCellsSelectionListener extends SelectionAdapter implements SelectionListener {
		@Override
		public void widgetSelected(final SelectionEvent e) {
			if (!markModeEnabled) {
				correspondingRelationItem.showUncoveredCells();
			} else {
				if (markModeUnion) {
					btnUncoveredCells.setText(BTN_TEXT_MARKMODE_INTERSECTION);
					correspondingRelationItem.setShowIntersection(true);
				} else {
					btnUncoveredCells.setText(BTN_TEXT_MARKMODE_UNION);
					correspondingRelationItem.setShowIntersection(false);
				}
				markModeUnion = !markModeUnion;
			}
		}
	}

	private IFile openLoadCsvDialog() {
		final ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(shell, new WorkbenchLabelProvider(),
				new BaseWorkbenchContentProvider());
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		dialog.setAllowMultiple(false);
		dialog.setTitle("CSV Selection");
		dialog.setMessage("Select a CSV File.");
		if (dialog.open() == Window.OK) {
			final IResource resource = (IResource) dialog.getFirstResult();
			if (resource instanceof IFile) {
				final IFile csvFile = (IFile) resource;
				return csvFile;
			} else {
				System.out.println("No file selected");
				Console.INSTANCE.printlnNegative("No file selected!");
				return null;
			}
		}
		return null;
	}

	private XtextEditor openLoadSculptDialog() {
		final ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(shell, new WorkbenchLabelProvider(),
				new BaseWorkbenchContentProvider());
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		dialog.setAllowMultiple(false);
		dialog.setTitle("Sculpt Selection");
		dialog.setMessage("Select a Sculpt schema file.");
		if (dialog.open() == Window.OK) {
			final IResource resource = (IResource) dialog.getFirstResult();
			if (resource instanceof IFile) {
				final IFile sculptFile = (IFile) resource;
				if (sculptFile.getFileExtension().equals("sculpt")) {

					final IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					try {
						final IEditorPart editor = IDE.openEditor(page, sculptFile);
						if (editor instanceof XtextEditor) {
							return ((XtextEditor) editor);
						}
					} catch (final PartInitException e) {
						e.printStackTrace();
					}
				}
			}
		}
		System.out.println("No sculpt file selected");
		Console.INSTANCE.printlnNegative("No sculpt file selected!");
		return null;
	}

	/**
	 *
	 * @return the output of the transformation program (if defined) or the currently selected cells otherwise
	 */
	private Pair<List<List<String>>, JsonObject> getExtractionData() {
		if (correspondingRelationItem.hasTransformationProgram()) {
			return correspondingRelationItem.getTransformedCsv();
		} else {
			if (exportableRegion == null || exportableRegion.isEmpty()) {
				return null; // something went wrong..
			}

			// get the data
			final List<List<String>> csvData = correspondingRelationItem.getCsvArray();
			final List<List<String>> exportData = new ArrayList<List<String>>();

			for (final Iterable<Coordinate> row : exportableRegion.rowByRowIteration()) {
				final List<String> exportRow = new ArrayList<String>();
				Coordinate first = null;
				try {
					first = row.iterator().next();
				} catch (final NoSuchElementException e) {
					// Empty row
					continue;
				}
				final List<String> currentRow = csvData.get(first.ROW - 1);
				if (currentRow == null) {
					continue; // just to be save.. this should never happen
				}
				for (final Coordinate current : row) {
					try {
						final String currentEntry = currentRow.get(current.COLUMN - 1);
						if (currentEntry != null) {
							exportRow.add(currentEntry);
						} else {
							break; // the first null value indicates, that only
							// null
							// values follow
						}
					} catch (final IndexOutOfBoundsException e) {
						break;
					}
				}
				exportData.add(exportRow);
			}
			return new Pair<List<List<String>>, JsonObject>(exportData, null);
		}
	}

	private void openExportDialog(final Pair<List<List<String>>, JsonObject> data) {
		final char rowDelim = correspondingRelationItem.getTransformationRowDelim();
		final char columnDelim = correspondingRelationItem.getTransformationColDelim();

		// Build up the text
		final String plainCsv = data.left.stream()
				.map(x -> x.stream().map(csvParser::escape).collect(Collectors.joining("" + columnDelim)))
				.collect(Collectors.joining("" + rowDelim));

		// Save CSV
		FileDialog dialog = new FileDialog(shell, SWT.SAVE);
		dialog.setFilterExtensions(CSV_FILTER_EXTENSIONS);
		dialog.setFilterNames(CSV_FILTER_NAMES);
		dialog.setFileName("export.csv");
		dialog.setText(TEXT_EXPORT_CSV);
		String absolutePath = dialog.open();
		if (absolutePath == null) {
			return;
		}
		System.out.println("Saved region to: " + absolutePath);

		Path path = Paths.get(dialog.getFilterPath() + File.separator + dialog.getFileName());

		try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
			writer.append(plainCsv);
		} catch (final IOException e1) {
			e1.printStackTrace();
		}

		// Save W3C schema
		if (data.right != null) {
			dialog = new FileDialog(shell, SWT.SAVE);
			dialog.setFilterExtensions(JSON_FILTER_EXTENSIONS);
			dialog.setFilterNames(JSON_FILTER_NAMES);
			dialog.setFileName("schema.json");
			dialog.setText(TEXT_EXPORT_JSON);
			absolutePath = dialog.open();
			if (absolutePath == null) {
				return;
			}
			System.out.println("Saved W3C schema to: " + absolutePath);

			path = Paths.get(dialog.getFilterPath() + File.separator + dialog.getFileName());
			try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
				final Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
				gson.toJson(data.right, writer);
			} catch (final IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	private static String convertStreamToString(final InputStream is) throws IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8)); // allow
		// other
		// encodings
		final StringJoiner returnStringJoiner = new StringJoiner("\n");
		String line;
		while ((line = reader.readLine()) != null) {
			returnStringJoiner.add(line);
		}
		return returnStringJoiner.toString();
	}

	private void csvAndSculptLoaded() {
		btnValidate.setEnabled(true);
		btnUncoveredCells.setEnabled(true);
		btnClearCaches.setEnabled(true);
		checkExtractionButton();
	}

	public TabItem getTabItem() {
		return this.tabItem;
	}

	public SculptCsvRelationItem getSculptCsvRelationItem() {
		return this.correspondingRelationItem;
	}

	public void deleteObject() {
		correspondingRelationItem.resetMarkMode();
		correspondingRelationItem.deleteObserver(this);
		this.outerSashForm.dispose();
	}
}
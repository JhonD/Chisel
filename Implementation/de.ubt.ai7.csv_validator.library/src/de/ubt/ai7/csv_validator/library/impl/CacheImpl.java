package de.ubt.ai7.csv_validator.library.impl;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.google.gson.JsonObject;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedAbstractToken;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedConstraint;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedDelimiters;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedNodeExpression;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedPrimaryKeyConstraint;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedRegionToken;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLPrimitive;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedToken;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedType;
import de.ubt.ai7.csv_validator.caches.dataStructures.NamedElement;
import de.ubt.ai7.csv_validator.library.Cache;
import de.ubt.ai7.csv_validator.library.dataStructures.Region;
import de.ubt.ai7.csv_validator.library.dataStructures.RegionFactory;
import de.ubt.ai7.csv_validator.library.exceptions.CsvValidationException;
import de.ubt.ai7.csv_validator.library.exceptions.SchemaValidationException;
import de.ubt.ai7.csv_validator.library.exceptions.SchemaValidationExceptions;
import de.ubt.ai7.csv_validator.library.exceptions.ValidationException;
import de.ubt.ai7.csv_validator.library.util.Converter;
import de.ubt.ai7.csv_validator.library.util.Definitions;
import de.ubt.ai7.csv_validator.sculpt.AbstractToken;
import de.ubt.ai7.csv_validator.sculpt.Constraint;
import de.ubt.ai7.csv_validator.sculpt.ContentConstraint;
import de.ubt.ai7.csv_validator.sculpt.Delimiters;
import de.ubt.ai7.csv_validator.sculpt.NodeExpression;
import de.ubt.ai7.csv_validator.sculpt.RegionToken;
import de.ubt.ai7.csv_validator.sculpt.RelationConstraint;
import de.ubt.ai7.csv_validator.sculpt.SchemaElement;
import de.ubt.ai7.csv_validator.sculpt.Sculpt;
import de.ubt.ai7.csv_validator.sculpt.TLVariable;
import de.ubt.ai7.csv_validator.sculpt.Token;
import de.ubt.ai7.csv_validator.sculpt.TransformationProgram;
import de.ubt.ai7.csv_validator.sculpt.Type;
import de.ubt.ai7.csv_validator.util.Coordinate;
import de.ubt.ai7.csv_validator.util.Pair;

public class CacheImpl implements Cache {
	private final Map<String, CachedElement> definitionCache;
	private final Map<String, NamedElement> nameCache;
	private final Map<TLVariable, CachedTLVariableBinding> bindingCache;

	private BitSet allCells;

	private final Converter converter;
	private final SculptInterpreter interpreter;
	private Sculpt schema;
	private List<List<String>> csvData;
	private int rowNumber;
	private int columnNumber;
	private CachedDelimiters cachedDelimiters;
	private CachedTransformationProgram cachedProgram;

	public CacheImpl() {
		this.interpreter = new SculptInterpreter(this);
		this.converter = new Converter(this, interpreter);
		definitionCache = new HashMap<String, CachedElement>();
		nameCache = new HashMap<String, NamedElement>();
		bindingCache = new HashMap<TLVariable, CachedTLVariableBinding>();

		allCells = new BitSet();
		cachedDelimiters = null;
	}

	/*
	 * utility methods for clearing HashMaps
	 */

	private void clearBindings() {
		// prevent concurrent modification of containedIn by remove()
		final Object[] bindings = bindingCache.values().toArray();
		bindingCache.clear();
		for (final Object e : bindings) {
			remove((CachedElement) e);
		}
	}

	@Override
	public void clearCaches() {
		definitionCache.clear();
		nameCache.clear();
		bindingCache.clear();
		cachedProgram = null;
		cachedDelimiters = null;

		// reinitialize all caches
		final List<List<String>> data = getCsvData();
		final Sculpt schema = this.schema;

		this.csvData = null;
		this.schema = null;

		setCsvData(data);
		try {
			setSchema(schema);
		} catch (final SchemaValidationExceptions e) {
			// We only store valid schemas
			e.printStackTrace();
		}
	}

	private void clearDependencies(final CachedElement elem) {
		// prevent concurrent modification of containedIn by remove()
		final CachedElement[] containingElements = (CachedElement[]) elem.getContainedIn().toArray();
		elem.getContainedIn().clear();
		for (final CachedElement e : containingElements) {
			remove(e);
		}

		final CachedElement[] containedElements = (CachedElement[]) elem.getContains().toArray();
		elem.getContains().clear();
		for (final CachedElement e : containedElements) {
			removeIfUnused(e);
		}

		if (elem.getRegion() != null) {
			elem.getRegion().clear();
		}
	}



	private int computeMaxColumns(final List<List<String>> data) {
		// recompute max columns
		int max_columns = 0;
		for (final List<?> list : data) {
			final int columns = list.size();
			if (columns > max_columns) {
				max_columns = columns;
			}
		}
		return max_columns;
	}

	/*
	 * getters for cached elements
	 */

	public BitSet getAllCells() {
		return allCells;
	}

	public CachedTLVariableBinding getBinding(final TLVariable variable) throws SchemaValidationException {
		final CachedTLVariableBinding binding = bindingCache.get(variable);
		if (binding == null) {
			throw new SchemaValidationException(SchemaValidationException.NO_REFERENCE, variable);
		}
		return binding;
	}

	@Override
	public int getColumnNumber() {
		return columnNumber;
	}

	@Override
	public List<List<String>> getCsvData() {
		return csvData;
	}

	@Override
	public String getCsvEntry(final Coordinate coordinate) {
		return getCsvEntry(coordinate.ROW, coordinate.COLUMN);
	}

	@Override
	public String getCsvEntry(final int row, final int column) {
		try {
			return this.csvData.get(row - 1).get(column - 1);
		} catch (final IndexOutOfBoundsException e) {
			return null;
		}
	}

	@Override
	public CachedDelimiters getDelimiters() {
		return cachedDelimiters;
	}

	public String[] getEntries(final int[] tupleCoords) {
		final String[] result = new String[tupleCoords.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = getCsvEntry(Definitions.toCoordinate(tupleCoords[i], rowNumber));
		}
		return result;
	}

	public CachedAbstractToken getRef(final AbstractToken tok) throws SchemaValidationException {
		if (tok == null) {
			return null;
		}

		if (tok instanceof TLVariable) {
			return getRef((TLVariable) tok);
		}

		NamedElement elem = nameCache.get(tok.getName());
		if (elem == null) {
			try {
				elem = (NamedElement) converter.convert(tok);
			} catch (final Exception e) {
				throw new SchemaValidationException(ValidationException.NO_REFERENCE, tok);
			}
			nameCache.put(tok.getName(), elem);
		}
		if (elem instanceof CachedAbstractToken) {
			return (CachedAbstractToken) elem;
		}

		throw new SchemaValidationException(ValidationException.NO_REFERENCE, tok);

	}

	public CachedConstraint getRef(final Constraint con) throws SchemaValidationException {
		CachedElement elem = definitionCache.get(Definitions.from(con));
		if (elem == null) {
			try {
				elem = converter.convert(con);
			} catch (final Exception e) {
				throw new SchemaValidationException(ValidationException.NO_REFERENCE, con);
			}
			definitionCache.put(Definitions.from(con), elem);
		}
		if (elem instanceof CachedConstraint) {
			return (CachedConstraint) elem;
		}

		throw new SchemaValidationException(ValidationException.NO_REFERENCE, con);

	}

	public CachedNodeExpression getRef(final NodeExpression region) throws SchemaValidationException {
		CachedElement elem = definitionCache.get(Definitions.from(region));
		if (elem == null) {
			try {
				elem = converter.convert(region);
			} catch (final Exception e) {
				throw new SchemaValidationException(ValidationException.NO_REFERENCE, region);
			}
			definitionCache.put(Definitions.from(region), elem);
		}
		if (elem instanceof CachedNodeExpression) {
			return (CachedNodeExpression) elem;
		}

		throw new SchemaValidationException(ValidationException.NO_REFERENCE, region);
	}

	public CachedTLVariableBinding getRef(final TLVariable var) throws SchemaValidationException {
		CachedElement elem = bindingCache.get(var);
		if (elem == null) {
			try {
				elem = converter.convert(var);
			} catch (final Exception e) {
				throw new SchemaValidationException(ValidationException.NO_REFERENCE, var);
			}
			bindingCache.put(var, (CachedTLVariableBinding) elem);
		}
		if (elem instanceof CachedTLVariableBinding) {
			return (CachedTLVariableBinding) elem;
		}

		throw new SchemaValidationException(ValidationException.NO_REFERENCE, var);

	}

	public CachedDelimiters getRefDelimiters() {
		return cachedDelimiters;
	}


	@Override
	public int getRowNumber() {
		return rowNumber;
	}

	@Override
	public Sculpt getSchema() {
		return schema;
	}

	@Override
	public List<SchemaElement> getSemanticObjects(final Coordinate cell) throws CsvValidationException {
		final List<SchemaElement> semanticObjects = new ArrayList<SchemaElement>();

		for (final Entry<String, NamedElement> entry : nameCache.entrySet()) {
			if (entry.getValue() instanceof CachedToken && matches((Token) entry.getValue().getSchemaElement(), cell)) {
				if (entry.getValue().getSchemaElement() != null) {
					semanticObjects.add(entry.getValue().getSchemaElement());
				}
			}
		}

		for (final RegionToken region : getSchema().getRegionTokens()) {
			if (getRegion(region).contains(cell)) {
				semanticObjects.add(region);
			}
		}

		for (final Constraint con : getSchema().getConstraints()) {
			if (getRegion(con).contains(cell)) {
				semanticObjects.add(con);
			}
		}

		return semanticObjects;
	}

	@Override
	public CachedDelimiters getTransformationDelimiters() {
		if (cachedProgram != null && getTransformationProgram().getDelimiters() != null) {
			return getTransformationProgram().getDelimiters();
		}
		return cachedDelimiters;
	}

	public CachedTransformationProgram getTransformationProgram() {
		return cachedProgram;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Pair<List<List<String>>, JsonObject> getTransformedCsv() throws CsvValidationException {
		if (!hasTransformationProgram()) {
			return null;
		}

		if(cachedProgram.getError() != null) {
			throw (CsvValidationException) cachedProgram.getError();
		}

		if(cachedProgram.getTransformedCsv() != null) {
			return new Pair<List<List<String>>, JsonObject>((List<List<String>>) cachedProgram.getTransformedCsv(), (JsonObject) cachedProgram.getW3cSchema());
		}

		try{
			final long start = System.currentTimeMillis();
			final Pair<List<List<String>>, JsonObject> transformedCsv = interpreter.transformCsv();
			printDuration("transforming CSV", start);

			cachedProgram.setTransformedCsv(transformedCsv.left);
			cachedProgram.setW3cSchema(transformedCsv.right);

			return transformedCsv;
		} catch (final CsvValidationException e){
			cachedProgram.setError(e);
			throw e;
		}

	}

	@Override
	public Region getUncoveredCells() throws CsvValidationException {
		final BitSet coveredCells = new BitSet();
		for (final Constraint con : schema.getConstraints()) {
			CachedConstraint cachedCon;
			try {
				cachedCon = getRef(con);
			} catch (final SchemaValidationException e) {
				throw new CsvValidationException(e);
			}
			if (cachedCon != null) {
				coveredCells.or(cachedCon.getRegion());
			}
		}

		coveredCells.xor(allCells);

		return Definitions.toRegion(coveredCells, rowNumber, columnNumber);
	}

	/**
	 * retrieves the stored value for the given cell and type
	 * @throws CsvValidationException
	 */
	public Object getValue(final Coordinate coord, final Type type) throws CsvValidationException {
		CachedType cachedType;
		try {
			cachedType = (CachedType) getRef(type);
		} catch (final SchemaValidationException e) {
			throw new CsvValidationException(e);
		}
		final int definition = Definitions.from(coord, rowNumber);
		if (cachedType.getUntestedRegion().get(definition)) {
			interpreter.computeAndCacheMatch(coord, cachedType);
		}

		return cachedType.getValues().get(definition);
	}


	/*
	 * getters for the region associated to an element
	 */

	@Override
	public Region getRegion(final AbstractToken tok) throws CsvValidationException {
		NamedElement elem;
		try {
			elem = getRef(tok);
		} catch (final SchemaValidationException e) {
			throw new CsvValidationException(e);
		}

		if (elem != null && tok.getClass().isInstance(elem.getSchemaElement())) {
			if (elem.getUntestedRegion() != null && !elem.getUntestedRegion().isEmpty()) {
				return interpreter.computeAndCacheRegion(elem);
			} else {
				return Definitions.toRegion(elem.getRegion(), rowNumber, columnNumber);
			}
		} else {
			return null;
		}
	}


	@Override
	public Region getRegion(final Constraint con) throws CsvValidationException {
		if (con instanceof ContentConstraint) {
			return getRegion(((ContentConstraint) con).getRegion());
		}
		if (con instanceof RelationConstraint) {
			return getRegion(((RelationConstraint) con).getTupleSelector().getRegion());
		}

		return RegionFactory.INSTANCE.newRegion(rowNumber, columnNumber, false);
	}


	@Override
	public Region getRegion(final NodeExpression nodeExpr) throws CsvValidationException {
		CachedNodeExpression cachedNodeExpr;
		try {
			cachedNodeExpr = getRef(nodeExpr);
		} catch (final SchemaValidationException e) {
			throw new CsvValidationException(e);
		}

		if (cachedNodeExpr == null) {
			return RegionFactory.INSTANCE.newRegion(rowNumber, columnNumber, false);
		} else if (cachedNodeExpr.getUntestedRegion() != null && !cachedNodeExpr.getUntestedRegion().isEmpty()) {
			return interpreter.computeAndCacheRegion(nodeExpr);
		} else {
			return Definitions.toRegion(cachedNodeExpr.getRegion(), rowNumber, columnNumber);
		}

	}


	public Region getRegion(final String string) {
		final Region region = RegionFactory.INSTANCE.newRegion(getRowNumber(), getColumnNumber(), false);
		if (string == null) {
			return region;
		}
		for (int row = 0; row < csvData.size(); row++) {
			final List<String> rowContent = csvData.get(row);
			for (int col = 0; col < rowContent.size(); col++) {
				if (string.equals(rowContent.get(col))) {
					region.addCoordinateToRegion(new Coordinate(row + 1, col + 1));
				}
			}
		}
		return region;
	}



	@Override
	public boolean hasTransformationProgram() {
		return cachedProgram != null;
	}

	@Override
	public boolean isCsvDataSet() {
		return getCsvData() != null;
	}


	/**
	 *
	 * @param token token to test against
	 * @param coord cell content to use
	 * @return the cached or computed result
	 * @throws CsvValidationException
	 *
	 */
	public boolean matches(final Token token, final Coordinate coord) throws CsvValidationException {
		final CachedToken cachedToken = (CachedToken) nameCache.get(token.getName());
		if (cachedToken == null) {
			return false;
		}

		final int definition = Definitions.from(coord, rowNumber);

		if (cachedToken.getUntestedRegion().get(definition)) {
			return interpreter.computeAndCacheMatch(coord, cachedToken);
		}

		return cachedToken.getRegion().get(definition);

	}

	private void printDuration(final String purpose, final long start) {
		final long delta = System.currentTimeMillis() - start;
		System.out.println("Time spend with " + purpose + ": " + delta + "ms");
	}

	/*
	 * methods for updating the cache
	 */


	/**
	 *
	 * @param coord
	 *            cell from which the values were retrieved
	 * @param type
	 *            for which the value was parsed
	 * @param value
	 *            parsed value
	 * @throws CsvValidationException
	 */
	public void put(final Coordinate coord, final Type type, final Object value) throws CsvValidationException {
		if (value == null) {
			return;
		}
		final int definition = Definitions.from(coord, rowNumber);
		CachedType cachedType;
		try {
			cachedType = (CachedType) getRef(type);
		} catch (final SchemaValidationException e) {
			throw new CsvValidationException(e);
		}

		cachedType.getValues().put(definition, value);
	}

	/**
	 *
	 * @param elem element to be removed
	 * deletes all elements referencing {@link elem}
	 * deletes unused dependent elements
	 */
	public void remove(final CachedElement elem) {
		if (elem == null) {
			return;
		}
		if (elem instanceof CachedTransformationProgram) {
			cachedProgram = null;
			clearBindings();
		}
		if (elem instanceof CachedTLVariableBinding) {
			bindingCache.remove(elem.getSchemaElement());
		}
		if (elem instanceof NamedElement) {
			nameCache.remove(((NamedElement) elem).getName());

		} else {
			definitionCache.remove(elem.getDefinition());
		}

		clearDependencies(elem);
	}

	private void removeCoordinate(final int definition) {
		for (final Entry<String, NamedElement> e : nameCache.entrySet()) {
			final NamedElement val = e.getValue();
			val.getRegion().set(definition, false);

			if (val instanceof CachedType) {
				((CachedType) val).getValues().remove(definition);
			}
		}
	}

	private void removeIfUnused(final CachedElement elem) {
		if (elem == null || elem instanceof NamedElement) {
			return;
		}
		if (elem.getContainedIn().size() == 0) {
			definitionCache.remove(elem.getDefinition());
		}
	}


	/**
	 *
	 * removes all cached information dedicated to the current csv file (all other information remains)
	 * elements that build up on {@link elem} are also recursively reset
	 */
	public void reset(final CachedElement elem) {
		if (elem == null) {
			return;
		}
		elem.getRegion().clear();

		if (elem instanceof AbstractToken) {
			elem.getUntestedRegion().or(allCells);
		} else {
			elem.getUntestedRegion().set(0); // mark untested
		}

		if (elem instanceof CachedTransformationProgram) {
			((CachedTransformationProgram) elem).setError(null);
			((CachedTransformationProgram) elem).setW3cSchema(null);
			((CachedTransformationProgram) elem).setTransformedCsv(null);
		}
		if (elem instanceof CachedPrimaryKeyConstraint) {
			((CachedPrimaryKeyConstraint) elem).getTupleCache().clear();
		}
		if (elem instanceof CachedConstraint) {
			((CachedConstraint) elem).setFulfilled(null);
		}
		if (elem instanceof CachedTLPrimitive) {
			((CachedTLPrimitive) elem).reset(); // clears cached text
		}
		if (elem instanceof CachedTLVariableBinding) {
			((CachedTLVariableBinding) elem).reset(); // clears untested region
		}
		for (final CachedElement e : elem.getContainedIn()) {
			reset(e);
		}

	}

	@Override
	public void setCsvData(final List<List<String>> csvData) {
		if (csvData == null) {
			return;
		}
		final long start = System.currentTimeMillis();
		allCells = new BitSet();

		if (this.csvData == null) {
			// initialize
			rowNumber = csvData.size();

			for (final ListIterator<List<String>> rowIt = csvData.listIterator(); rowIt.hasNext();) {
				for (final ListIterator<String> colIt = rowIt.next().listIterator(); colIt.hasNext();) {
					colIt.next();
					allCells.set(Definitions.from(rowIt.previousIndex() + 1, colIt.previousIndex() + 1, rowNumber));
				}
			}

			for (final Entry<String, NamedElement> entry : nameCache.entrySet()) {
				if(entry.getValue() instanceof CachedAbstractToken) {
					entry.getValue().getUntestedRegion().or(allCells);
				} else {
					entry.getValue().getUntestedRegion().set(0);
				}
			}

			for (final Entry<String, CachedElement> entry : definitionCache.entrySet()) {
				entry.getValue().getUntestedRegion().set(0);
			}

			printDuration("initializing cached CSV coordinates", start);

		} else {
			boolean removedCoordinates = false;
			final BitSet newCoordinates = new BitSet();

			final int newRows = csvData.size();
			final int newCols = computeMaxColumns(csvData); // compute max
			// columns

			if (newRows != this.rowNumber || newCols != this.columnNumber) {
				// adopt BitSets to new number of rows
				removedCoordinates = newRows < this.rowNumber || newCols < this.columnNumber;
				for (final Entry<String, NamedElement> e : nameCache.entrySet()) {
					final NamedElement val = e.getValue();
					val.setUntestedRegion(Definitions.remap(val.getUntestedRegion(), rowNumber, newRows));
					val.setRegion(Definitions.remap(val.getRegion(), rowNumber, newRows));

					if (val instanceof CachedType) {
						((CachedType) val)
						.setValues(Definitions.remap(((CachedType) val).getValues(), rowNumber, newRows));
					}
				}
				for (final Entry<String, CachedElement> e : definitionCache.entrySet()) {
					final CachedElement val = e.getValue();
					val.setUntestedRegion(Definitions.remap(val.getUntestedRegion(), rowNumber, newRows));
					val.setRegion(Definitions.remap(val.getRegion(), rowNumber, newRows));
				}
			}

			int row = 0;
			for (; row < csvData.size(); ++row) {
				final List<String> cellList = csvData.get(row);
				int col = 0;
				for (; col < cellList.size(); ++col) {
					final String cell = cellList.get(col);
					final String oldVal = getCsvEntry(row + 1, col + 1);

					final int definition = Definitions.from(row + 1, col + 1, newRows);
					allCells.set(definition);

					if (oldVal == null) {
						newCoordinates.set(definition);
					} else if (!oldVal.equals(cell)) {
						newCoordinates.set(definition);
						removeCoordinate(definition);
						removedCoordinates = true;
					}
				}
				if (row < rowNumber) {
					for (; col < this.csvData.get(row).size(); ++col) {
						removeCoordinate(Definitions.from(row + 1, col + 1, newRows));
						removedCoordinates = true;
					}
				}
			}
			// the remaining rows were cleared when remapping the bit sets

			if (removedCoordinates || !newCoordinates.isEmpty()) {
				bindingCache.values().stream().forEach(this::reset);
				definitionCache.values().stream().forEach(this::reset);
				nameCache.values().stream().forEach(x -> x.getUntestedRegion().or(newCoordinates));
				// containing elements are already reset
			}

			printDuration("updating cached CSV coordinates", start);

		}

		this.csvData = csvData;
		this.rowNumber = csvData.size();
		this.columnNumber = computeMaxColumns(csvData); // compute max columns

		try {
			setSchema(this.schema); // update caches
		} catch (final SchemaValidationExceptions e) {
			// We do not store invalid schemas
			e.printStackTrace();
		}
	}

	@Override
	public void setDelimiters(final Delimiters delimiters) throws SchemaValidationException {
		if (delimiters == null) {
			return;
		}
		final CachedDelimiters cachedDelim = (CachedDelimiters) converter.convert(delimiters);
		if (cachedDelimiters == null) {
			cachedDelimiters = cachedDelim;
		} else if (!cachedDelim.getDefinition().equals(cachedDelimiters.getDefinition())) {
			cachedDelim.getContainedIn().addAll(cachedDelimiters.getContainedIn());
			reset(cachedDelim);
			cachedDelimiters = cachedDelim;
		}

		if(cachedProgram != null && cachedProgram.getDelimiters() == null) {
			cachedProgram.getContains().add(cachedDelimiters);
		}
	}

	@Override
	public void setSchema(final Sculpt schema) throws SchemaValidationExceptions {
		if (schema == null) {
			return;
		}
		if (this.csvData == null) {
			allCells = new BitSet();
		}

		final long start = System.currentTimeMillis();

		final ArrayList<SchemaValidationException> errors = new ArrayList<SchemaValidationException>();

		try {
			setDelimiters(schema.getDelimiter());
		} catch (final SchemaValidationException e) {
			errors.add(e);
		}

		// keep track of old entries to remove unused ones later on
		final Set<String> outdatedNames = new HashSet<String>(nameCache.keySet());
		final Set<String> outdatedDefinitions = new HashSet<String>();
		for (final CachedElement cachedElem : definitionCache.values()) {
			if (cachedElem instanceof CachedConstraint) {
				outdatedDefinitions.add(cachedElem.getDefinition());
			}
		}

		// update tokens, constraints, node expressions, ...
		// in such a way that {@link SchemaElement schema elements} they depend
		// on are already cached
		for (final Type type : schema.getTypes()) {
			try {
				update(nameCache, type, CachedType.class);
				outdatedNames.remove(type.getName());
			} catch (final SchemaValidationException e) {
				errors.add(e);
			}
		}
		for (final Token tok : schema.getTokens()) {
			try {
				update(nameCache, tok, CachedToken.class);
				outdatedNames.remove(tok.getName());
			} catch (final SchemaValidationException e) {
				errors.add(e);
			}
		}
		for (final RegionToken tok : schema.getRegionTokens()) {
			try {
				update(nameCache, tok, CachedRegionToken.class);

				outdatedNames.remove(tok.getName());
			} catch (final SchemaValidationException e) {
				errors.add(e);
			}
		}

		for (final Constraint con : schema.getConstraints()) {
			try {
				update(definitionCache, con, CachedConstraint.class);
				outdatedDefinitions.remove(Definitions.from(con));
			} catch (final SchemaValidationException e) {
				errors.add(e);
			}
		}

		for (final String name : outdatedNames) {
			remove(nameCache.get(name));
		}
		for (final String definition : outdatedDefinitions) {
			remove(definitionCache.get(definition));
		}

		try {
			update(schema.getTransformationProgram());
		} catch (final SchemaValidationException e) {
			errors.add(e);
		}

		if (errors.size() > 0) {
			this.schema = null;
			throw new SchemaValidationExceptions("Errors occurred while setting the schema", errors);
		}

		this.schema = schema;

		printDuration("schema evaluation", start);

	}

	@SuppressWarnings("unchecked")
	private <T extends CachedElement> boolean update(final Map<String, T> cache, final SchemaElement elem,
			final Class<?> type) throws SchemaValidationException {
		final String definition = Definitions.from(elem);

		String key = definition;
		if (elem instanceof AbstractToken) {
			key = ((AbstractToken) elem).getName();
		}

		final T oldVal = cache.get(key);
		if (oldVal == null || !type.isInstance(oldVal) || !oldVal.getDefinition().equals(definition)) {
			// new or changed
			T newVal = null;
			try {
				newVal = (T) converter.convert(elem);

				if (oldVal == null) {
					cache.put(key, newVal);
				} else {
					newVal.getContainedIn().addAll(oldVal.getContainedIn());
					reset(newVal);
					cache.put(key, newVal);
				}
			} catch (final Exception e) {
				remove(oldVal);
				clearDependencies(newVal); // handle dependencies
				throw e;
			}

		} else {
			oldVal.setSchemaElement(elem);
		}
		return true;
	}

	private boolean update(final TransformationProgram prog) throws SchemaValidationException {
		final boolean deleted = prog == null;
		final boolean modified = !deleted
				&& (cachedProgram == null || !cachedProgram.getDefinition().equals(Definitions.from(prog)));
		if (deleted || modified) {
			remove(this.cachedProgram);
			this.cachedProgram = null;
		}
		if (modified) {
			try {
				cachedProgram = (CachedTransformationProgram) converter.convert(prog);
			} catch (final Exception e) {
				remove(cachedProgram); // remove previous program
				clearBindings(); // remove cached fragments from conversion
				throw e;
			}
		}

		return true;
	}

	@Override
	public void validateConstraints() throws CsvValidationException {
		final long start = System.currentTimeMillis();

		for (final Constraint con : schema.getConstraints()) {
			try {
				final CachedConstraint cachedCon = getRef(con);
				if (cachedCon.getFulfilled() == null) {
					interpreter.evaluate(cachedCon);
				}
				if (!cachedCon.getFulfilled()) {
					printDuration("csv validation against schema", start);
					throw new CsvValidationException(null, con, null,
							Definitions.toRegion(cachedCon.getRegion(), getRowNumber(), getColumnNumber()));
				}
			} catch (final SchemaValidationException e) {
				throw new CsvValidationException(e);
			}

		}

		printDuration("csv validation against schema", start);

	}

}
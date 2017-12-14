package de.ubt.ai7.csv_validator.library;

import java.util.List;

import com.google.gson.JsonObject;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedDelimiters;
import de.ubt.ai7.csv_validator.library.dataStructures.Region;
import de.ubt.ai7.csv_validator.library.exceptions.CsvValidationException;
import de.ubt.ai7.csv_validator.library.exceptions.SchemaValidationException;
import de.ubt.ai7.csv_validator.library.exceptions.SchemaValidationExceptions;
import de.ubt.ai7.csv_validator.library.impl.SculptInterpreter;
import de.ubt.ai7.csv_validator.library.util.Converter;
import de.ubt.ai7.csv_validator.sculpt.AbstractToken;
import de.ubt.ai7.csv_validator.sculpt.Constraint;
import de.ubt.ai7.csv_validator.sculpt.Delimiters;
import de.ubt.ai7.csv_validator.sculpt.NodeExpression;
import de.ubt.ai7.csv_validator.sculpt.SchemaElement;
import de.ubt.ai7.csv_validator.sculpt.Sculpt;
import de.ubt.ai7.csv_validator.util.Coordinate;
import de.ubt.ai7.csv_validator.util.Pair;

/**
 *
 * Tracks tokens, types, regions, rules, and transformation program of the schema.
 * Tracks deleted, modified, and added cells of the csv file
 *
 * Lazily triggers computations for validation, transformation, and region computation.
 * The computations themselfes are performed by {@link SculptInterpreter} for validating the csv file and by {@link Converter} for validating the schema (and doing some precomputations).
 */
public interface Cache {

	/**
	 * clears all caches
	 */
	public void clearCaches();

	public int getColumnNumber();

	public List<List<String>> getCsvData();

	public String getCsvEntry(Coordinate coordinate);

	public String getCsvEntry(int row, int column);

	public CachedDelimiters getDelimiters();

	/**
	 *
	 * @return set of cells matching the given AbstractToken
	 * @throws CsvValidationException
	 */
	public Region getRegion(AbstractToken tok) throws CsvValidationException;


	/**
	 *
	 *
	 * @return if fulfilled the set of cells it is applied to otherwise the cell
	 *         that lets the constraint fail
	 * @throws CsvValidationException
	 */
	public Region getRegion(Constraint constraint) throws CsvValidationException;

	/**
	 *
	 * @param region
	 * @return set of cells matching the given NodeExpression
	 * @throws CsvValidationException
	 */
	public Region getRegion(NodeExpression region) throws CsvValidationException;

	public int getRowNumber();

	public Sculpt getSchema();

	/**
	 *
	 * @return all schema elements that have a match for the given cell
	 * @throws CsvValidationException
	 */
	public List<SchemaElement> getSemanticObjects(Coordinate cell) throws CsvValidationException;

	public CachedDelimiters getTransformationDelimiters();

	public Pair<List<List<String>>, JsonObject> getTransformedCsv() throws CsvValidationException;

	/**
	 *
	 * @return cells on which no constraint is evaluated
	 * @throws CsvValidationException
	 */
	public Region getUncoveredCells() throws CsvValidationException;

	public boolean hasTransformationProgram();

	public boolean isCsvDataSet();

	/**
	 * in case of eager caching it updates the internal representation of cells
	 * and the associated tokens
	 *
	 * @param csvData
	 *            row wise cell entries
	 */
	public void setCsvData(List<List<String>> csvData);

	/**
	 * For lookup, does not affect the stored csv data
	 */
	public void setDelimiters(Delimiters delimiters) throws SchemaValidationException;

	/**
	 * Updates (or creates) the cached counter parts for the elements of the schema
	 * Passing the same schema won't affect the caches
	 * Computed information of unchanged elements is kept
	 *
	 * @param schema
	 * @throws SchemaValidationExceptions
	 */
	public void setSchema(Sculpt schema) throws SchemaValidationExceptions;

	/**
	 * Validates all constraints of the schema (uses the cached result if
	 * present)
	 *
	 * @param schema
	 *            Schema to validate
	 * @return the first failing Constraint or null if all constraints are valid
	 * @throws CsvValidationException
	 */
	public void validateConstraints() throws CsvValidationException;

}

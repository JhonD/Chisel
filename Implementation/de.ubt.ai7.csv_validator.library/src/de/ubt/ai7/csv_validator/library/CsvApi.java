package de.ubt.ai7.csv_validator.library;

import org.eclipse.xtext.ui.editor.XtextEditor;

import de.ubt.ai7.csv_validator.library.impl.CsvApiImpl;
import de.ubt.ai7.csv_validator.sculpt.Delimiters;
import de.ubt.ai7.csv_validator.util.Pair;

public interface CsvApi extends CommonApi{

	CsvApi INSTANCE = CsvApiImpl.INSTANCE;

	/**
	 *
	 * @return relation manager
	 */
	@Override
	public SculptCsvRelationManager getRelationManager();

	/**
	 * Get the CSV to Sculpt mapping information
	 *
	 * @return Mapping information, left Sculpt, right CSV data
	 */
	public Iterable<Pair<String, String>> getCurrentMappingInformation();

	/**
	 * Assigns the given csv data to the library
	 *
	 * @param csvData
	 *            the data to register
	 * @param delimiters
	 *            the delimiters, which should be used to load the file
	 * @param selectedRelation
	 *            number of the relation selected in the relation selection View
	 * @param csvFileName
	 *            name of the csvFile
	 */
	public void registerCsv(String originalInput, Delimiters delimiters, int selectedRelation,
			String csvFileName);

	/**
	 * Register a schema file in the main api. Stores the model, the user is currently interested in.
	 * @param sculptEditor the schema file to register
	 * @param relationItem the relation item, where the schema should be registered
	 */
	public void registerSchema(XtextEditor sculptEditor, SculptCsvRelationItem relationItem);

	/**
	 * Assigns the given csv data to the library
	 *
	 * @param csvData
	 *            the data to register
	 * @param delimiters
	 *            the delimiters, which should be used to load the file
	 * @param relationItem
	 *            the relation, for which the file should be added
	 * @param csvFileName
	 *            name of the csvFile
	 */
	public boolean registerCsv(String originalInput, Delimiters delimiters,
			SculptCsvRelationItem relationItem, String csvFileName);



	/**
	 *
	 * @return delimiters have already been associated
	 */
	public boolean hasDelimiters(int relationID);

}

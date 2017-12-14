package de.ubt.ai7.csv_validator.library;

import java.util.List;

import de.ubt.ai7.csv_validator.library.impl.SculptCsvRelationManagerImpl;
import de.ubt.ai7.csv_validator.util.Pair;

public interface SculptCsvRelationManager extends IObservable  {
	SculptCsvRelationManager INSTANCE = SculptCsvRelationManagerImpl.INSTANCE;

	public static final String TEXT_TAB_DELETED = "Tab deleted";
	public static final String ADD_COMMAND = "ADD";
	public static final String DELETE_COMMAND = "DELETE";

	/**
	 * Adds a given Sculpt schema to the selected relation and returns the relations sculptInterpreter
	 * @param relationId
	 * @param csvFileName
	 * @return Item of the relation
	 */
	public SculptCsvRelationItem addSculptToRelation(int selectedRelation, String sculptEditorToString);
	public void addSculptToRelation(SculptCsvRelationItem relationItem, String sculptEditorToString);

	/**
	 * Adds a given csv file to the selected relation and returns the relations sculptInterpreter
	 * @param relationId
	 * @param csvFileName
	 * @return sculpt interpteter of the relation
	 */
	public SculptCsvRelationItem addCsvToRelation(int selectedRelation, String csvFileName);
	public void addCsvToRelation(SculptCsvRelationItem relationItem, String csvFileName);

	public void deleteRelationItem(SculptCsvRelationItem relationItem);

	public List<SculptCsvRelationItem> getAllInterpreterForGivenSchema(String sculptEditorToString);

	public SculptCsvRelationItem getItemForRelationID(int relationID);

	public Iterable<Pair<String, String>> getMapping();

	public SculptCsvRelationItem getInitialRelation();
}

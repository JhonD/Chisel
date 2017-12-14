package de.ubt.ai7.csv_validator.library.impl;

import org.eclipse.xtext.ui.editor.XtextEditor;

import de.ubt.ai7.csv_validator.library.CommonApi;
import de.ubt.ai7.csv_validator.library.CsvApi;
import de.ubt.ai7.csv_validator.library.SculptCsvRelationItem;
import de.ubt.ai7.csv_validator.library.SculptCsvRelationManager;
import de.ubt.ai7.csv_validator.sculpt.Delimiters;
import de.ubt.ai7.csv_validator.util.Pair;

public class CsvApiImpl extends CommonApiImpl implements CsvApi {
	public static final CsvApiImpl INSTANCE = new CsvApiImpl();


	private CsvApiImpl(){
		relationManager = SculptCsvRelationManager.INSTANCE;
	}

	@Override
	public Iterable<Pair<String, String>> getCurrentMappingInformation(){
		return relationManager.getMapping();
	}

	@Override
	public void registerCsv(final String originalInput, final Delimiters delimiters, final int selectedRelation, final String csvFileName) {
		final SculptCsvRelationItem item = relationManager.addCsvToRelation(selectedRelation, csvFileName);
		item.registerCsv(originalInput, delimiters, csvFileName);
	}


	@Override
	public void registerSchema(final XtextEditor sculptEditor, final SculptCsvRelationItem relationItem) {
		relationManager.addSculptToRelation(relationItem, CommonApi.sculptEditorToString(sculptEditor));
		relationItem.registerSchema(sculptEditor);
	}

	@Override
	public boolean registerCsv(final String originalInput, final Delimiters delimiters,
			final SculptCsvRelationItem relationItem, final String csvFileName){
		relationManager.addCsvToRelation(relationItem, csvFileName);
		return relationItem.registerCsv(originalInput, delimiters, csvFileName);
	}



	@Override
	public boolean hasDelimiters(final int relationID) {
		final SculptCsvRelationItem item = relationManager.getItemForRelationID(relationID);
		return item.hasDelimiters();
	}

}

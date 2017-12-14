package de.ubt.ai7.csv_validator.library.impl;

import org.eclipse.xtext.ui.editor.XtextEditor;

import de.ubt.ai7.csv_validator.library.CommonApi;
import de.ubt.ai7.csv_validator.library.SculptCsvRelationItem;
import de.ubt.ai7.csv_validator.library.SculptCsvRelationManager;

public class CommonApiImpl implements CommonApi {

	SculptCsvRelationManager relationManager;

	@Override
	public SculptCsvRelationManager getRelationManager(){
		return this.relationManager;
	}

	@Override
	public void registerSchema(final XtextEditor sculptEditor, final int selectedRelation) {
		final SculptCsvRelationItem item = relationManager.addSculptToRelation(selectedRelation,
				CommonApi.sculptEditorToString(sculptEditor));
		item.registerSchema(sculptEditor);
	}
}

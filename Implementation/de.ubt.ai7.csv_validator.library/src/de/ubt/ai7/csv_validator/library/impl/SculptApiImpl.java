package de.ubt.ai7.csv_validator.library.impl;

import java.util.List;

import org.eclipse.xtext.ui.editor.XtextEditor;

import de.ubt.ai7.csv_validator.library.CommonApi;
import de.ubt.ai7.csv_validator.library.SculptApi;
import de.ubt.ai7.csv_validator.library.SculptCsvRelationItem;
import de.ubt.ai7.csv_validator.library.SculptCsvRelationManager;

public class SculptApiImpl extends CommonApiImpl implements SculptApi {
	public static final SculptApiImpl INSTANCE = new SculptApiImpl();

	private SculptApiImpl() {
		this.relationManager = SculptCsvRelationManager.INSTANCE;
	}

	@Override
	public void clearCaches(final XtextEditor sculptEditor) {
		final List<SculptCsvRelationItem> relationItems = relationManager
				.getAllInterpreterForGivenSchema(CommonApi.sculptEditorToString(sculptEditor));
		for (final SculptCsvRelationItem item : relationItems) {
			item.clearCaches();
		}
	}

	@Override
	public void validateSculptSchema(final XtextEditor sculptEditor) throws IllegalStateException {
		final List<SculptCsvRelationItem> relationItems = relationManager
				.getAllInterpreterForGivenSchema(CommonApi.sculptEditorToString(sculptEditor));
		for (final SculptCsvRelationItem item : relationItems) {
			item.validateSculptSchema();
		}
	}
}

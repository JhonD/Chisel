package de.ubt.ai7.csv_validator.library;

import org.eclipse.xtext.ui.editor.XtextEditor;

public interface CommonApi {



	static String sculptEditorToString(final XtextEditor sculptEditor) {
		return sculptEditor.getTitle();
	}

	void registerSchema(XtextEditor sculptEditor, int selectedRelation);

	SculptCsvRelationManager getRelationManager();
}

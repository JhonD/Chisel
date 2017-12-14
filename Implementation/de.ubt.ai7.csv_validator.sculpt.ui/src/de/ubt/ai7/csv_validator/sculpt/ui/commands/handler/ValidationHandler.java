package de.ubt.ai7.csv_validator.sculpt.ui.commands.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;

import de.ubt.ai7.csv_validator.library.SculptApi;

public class ValidationHandler extends AbstractHandler implements IHandler{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		XtextEditor sculptEditor = EditorUtils.getActiveXtextEditor();
		
		SculptApi.INSTANCE.validateSculptSchema(sculptEditor);
		
		return null;
	}
}

package de.ubt.ai7.csv_validator.sculpt.ui.commands.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;

import de.ubt.ai7.csv_validator.csvtosculptmappingview.CsvToSculptMappingView;
import de.ubt.ai7.csv_validator.library.SculptApi;

public class RegisterSchemaHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// get shell
		Shell shell = EditorUtils.getActiveXtextEditor().getShell();
		
		// get corresponding relation
		CsvToSculptMappingView mapping = new CsvToSculptMappingView(shell);
		mapping.create();
		if(mapping.open() != Window.OK){
			System.out.println("User cancled mapping Dialog");
			return null;
		}
		int selectedRelation = mapping.getSelectedRelation();
		System.out.println("Relation " + selectedRelation + " selected!");
		
		XtextEditor sculptEditor = EditorUtils.getActiveXtextEditor();
				
		SculptApi.INSTANCE.registerSchema(sculptEditor, selectedRelation);
		return null;
	}

}

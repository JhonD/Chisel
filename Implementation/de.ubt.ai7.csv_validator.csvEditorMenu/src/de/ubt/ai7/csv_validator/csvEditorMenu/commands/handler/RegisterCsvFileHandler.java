package de.ubt.ai7.csv_validator.csvEditorMenu.commands.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.texteditor.AbstractTextEditor;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;

import de.ubt.ai7.csv_validator.csvEditorMenu.Activator;
import de.ubt.ai7.csv_validator.csvEditorMenu.SetDelimiterDialog;
import de.ubt.ai7.csv_validator.csvtosculptmappingview.CsvToSculptMappingView;
import de.ubt.ai7.csv_validator.library.CsvApi;
import de.ubt.ai7.csv_validator.sculpt.Delimiters;
import de.ubt.ai7.csv_validator.sculpt.SculptFactory;

public class RegisterCsvFileHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		// get shell
		final Shell shell = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();

		// get corresponding relation
		final CsvToSculptMappingView mapping = new CsvToSculptMappingView(shell);
		mapping.create();
		if(mapping.open() != Window.OK){
			System.out.println("User cancled mapping Dialog");
			return null;
		}
		final int selectedRelation = mapping.getSelectedRelation();
		System.out.println("Relation " + selectedRelation + " selected!");

		// get editor
		final IEditorPart editorPart = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActiveEditor();
		if (!(editorPart instanceof AbstractTextEditor)) {
			//something went wrong
			return null;
		}
		final ITextEditor editor = (ITextEditor) editorPart;
		final IDocumentProvider dp = editor.getDocumentProvider();
		final IDocument doc = dp.getDocument(editor.getEditorInput());
		final String editorText = doc.get();

		// get delimiters
		final Delimiters delim = SculptFactory.eINSTANCE.createDelimiters();

		if (!CsvApi.INSTANCE.hasDelimiters(selectedRelation)) {
			final SetDelimiterDialog delimDialog = new SetDelimiterDialog(shell);
			delimDialog.create();
			if(delimDialog.open() == Window.OK){
				delim.setColDelim(delimDialog.getColDelim());
				delim.setRowDelim(delimDialog.getRowDelim());
			} else{ // user aborted the mission.
				System.out.println("User cancled delimiter Dialog");
				return null;
			}
		}
		CsvApi.INSTANCE.registerCsv(editorText, delim, selectedRelation, editor.getTitle());

		return null;
	}




}

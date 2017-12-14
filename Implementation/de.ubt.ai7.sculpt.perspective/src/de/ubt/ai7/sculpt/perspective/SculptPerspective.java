package de.ubt.ai7.sculpt.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class SculptPerspective implements IPerspectiveFactory {
	
	private static final String TABULAR_VIEW = "de.ubt.ai7.csv_validator.csv.tabularOutline.tableView";
	private static final String CONSOLE = "org.eclipse.ui.console.ConsoleView";

	@Override
	public void createInitialLayout(IPageLayout layout) {
		defineActions(layout);
		defineLayout(layout);

	}

	public void defineActions(IPageLayout layout) {
		// Add "new wizards".
		layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");
		layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");

		// Add "show views".
		layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
		layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
		layout.addShowViewShortcut(IPageLayout.ID_TASK_LIST);
		layout.addShowViewShortcut(TABULAR_VIEW);
		layout.addShowViewShortcut(CONSOLE);
	}

	public void defineLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();

		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, (float) 0.15, editorArea);
		IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, (float) 0.8, editorArea);
		IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT, (float) 0.55, editorArea);
		left.addView(IPageLayout.ID_PROJECT_EXPLORER);
		bottom.addView(CONSOLE);
		right.addView(TABULAR_VIEW);
	}
}

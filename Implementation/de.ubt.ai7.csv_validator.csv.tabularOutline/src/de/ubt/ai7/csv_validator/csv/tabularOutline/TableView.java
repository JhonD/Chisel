package de.ubt.ai7.csv_validator.csv.tabularOutline;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.part.ViewPart;

import de.ubt.ai7.csv_validator.csv.tabularOutline.internal.TableViewTab;
import de.ubt.ai7.csv_validator.library.CsvApi;
import de.ubt.ai7.csv_validator.library.SculptCsvRelationItem;
import de.ubt.ai7.csv_validator.library.SculptCsvRelationManager;
import de.ubt.ai7.csv_validator.util.Pair;

public class TableView extends ViewPart implements Observer{

	private TabFolder tabFolder;
	private List<TableViewTab> tableViewTabs;
	private List<TabItem> tabs;

	@Override
	public void createPartControl(final Composite parent) {
		tableViewTabs = new LinkedList<TableViewTab>();
		tabs = new LinkedList<TabItem>();
		createViewer(parent);
	}

	@Override
	public void setFocus() {
		tabFolder.setFocus();
	}


	@Override
	public void update(final Observable arg0, final Object arg1) {
		if(arg1 instanceof Pair) {
			final Pair<?,?> pair = (Pair<?,?>) arg1;
			if(pair.left instanceof String && pair.right instanceof SculptCsvRelationItem){
				final String code = (String) pair.left;
				final SculptCsvRelationItem relationItem = (SculptCsvRelationItem) pair.right;
				if(code.equals(SculptCsvRelationManager.ADD_COMMAND)){
					createTabForNewRelation(relationItem);
				} else if(code.equals(SculptCsvRelationManager.DELETE_COMMAND)){
					removeTabRelation(relationItem);
				}
			} else if(pair.left instanceof Integer && pair.right instanceof String){ //rename tab update
				final int tabNumber = (int) pair.left;
				final String tabName = (String) pair.right;
				renameTab(tabNumber, tabName);
			}
		}

	}

	private void createViewer(final Composite parent) {
		final SculptCsvRelationManager relationManager = CsvApi.INSTANCE.getRelationManager();
		relationManager.addObserver(this);
		tabFolder = new TabFolder(parent, SWT.NONE);
		tabFolder.setLayout(new FillLayout());

		final SculptCsvRelationItem item = relationManager.getInitialRelation();
		//Observer is not installed, thus we have to initialize the new tab
		createTabForNewRelation(item);
	}

	private void createTabForNewRelation(final SculptCsvRelationItem correspondingRelationItem){
		final TabItem tab = new TabItem(tabFolder, SWT.NONE);
		tabs.add(tab);
		tab.setText("New Tab");
		final TableViewTab tableViewTab = new TableViewTab(tab, correspondingRelationItem, getShell());
		tableViewTabs.add(tableViewTab);
	}

	private void removeTabRelation(final SculptCsvRelationItem relationItem){
		TableViewTab tabToBeDeleted = null;
		for(final TableViewTab tab : this.tableViewTabs){
			if(tab.getSculptCsvRelationItem().equals(relationItem)) {
				tabToBeDeleted = tab;
				break;
			}
		}
		if(tabToBeDeleted == null) {
			return;
		}
		tableViewTabs.remove(tabToBeDeleted);
		final TabItem tabItem = tabToBeDeleted.getTabItem();
		tabs.remove(tabItem);
		tabToBeDeleted.deleteObject();
		tabItem.dispose();
	}

	private void renameTab(final int tabNumber, final String tabName){
		tabs.get(tabNumber).setText(tabName);
	}

	private Shell getShell(){
		return this.getSite().getShell();
	}
}

package de.ubt.ai7.csv_validator.csvtosculptmappingview;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import de.ubt.ai7.csv_validator.library.CsvApi;
import de.ubt.ai7.csv_validator.util.Pair;

public class CsvToSculptMappingView extends TitleAreaDialog {
	private Table mappingTable;

	private int selectedRelation;


	public CsvToSculptMappingView(final Shell parentShell) {
		super(parentShell);
	}


	@Override
	public void create() {
		super.create();
		setTitle("Csv to Sculpt Mapping");
		setMessage("Mapping dialog", IMessageProvider.INFORMATION);
	}

	public int getSelectedRelation(){
		return selectedRelation;
	}

	@Override
	protected Control createDialogArea(final Composite parent) {
		final Composite area = (Composite) super.createDialogArea(parent);
		final Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		final GridLayout layout = new GridLayout(1, false);
		container.setLayout(layout);

		createMappingTable(container);
		mappingTable.addListener(SWT.MouseDown, new MouseClickListener());

		return area;
	}


	private void createMappingTable(final Composite container) {
		mappingTable = new Table(container, SWT.MULTI | SWT.FULL_SELECTION | SWT.BORDER);
		mappingTable.setLinesVisible(true);
		mappingTable.setHeaderVisible(true);

		// define layout for the viewer
		final GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		mappingTable.setLayoutData(gridData);

		final Iterable<Pair<String, String>> mapping = CsvApi.INSTANCE.getCurrentMappingInformation();

		final TableColumn sculptCol = new TableColumn(mappingTable, SWT.NONE);
		sculptCol.setText("Sculpt files");
		final TableColumn csvCol = new TableColumn(mappingTable, SWT.NONE);
		csvCol.setText("Csv files");
		mappingTable.setSize(container.getSize());
		for(final Pair<String, String> relationItem : mapping){
			final TableItem item = new TableItem(mappingTable, SWT.NONE);
			item.setText(0, relationItem.left);
			item.setText(1, relationItem.right);
		} // I assume the MainAPI mapping already includes an empty line for additional lines

		for(final TableColumn col : mappingTable.getColumns()){
			col.pack();
		}
	}

	private class MouseClickListener implements Listener{
		@Override
		public void handleEvent(final Event event) {
			final Point pt = new Point(event.x, event.y);
			final TableItem item = mappingTable.getItem(pt);
			if (item == null) {
				return;
			}
			selectedRelation = mappingTable.indexOf(item);
			System.out.println("Selected Row: " + selectedRelation);
		}
	}
}

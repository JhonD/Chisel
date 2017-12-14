package de.ubt.ai7.csv_validator.csvEditorMenu;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class SetDelimiterDialog extends TitleAreaDialog {
	private Text txtColumnDelimiter;
	private Text txtRowDelimiter;

	private String colDelim;
	private String rowDelim;

	public SetDelimiterDialog(final Shell parentShell) {
		super(parentShell);
	}

	@Override
	public void create() {
		super.create();
		setTitle("Please select the delimiter characters to use");
		setMessage("No sculpt file has been read yet!", IMessageProvider.INFORMATION);
	}

	@Override
	protected Control createDialogArea(final Composite parent) {
		final Composite area = (Composite) super.createDialogArea(parent);
		final Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		final GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);

		createRowDelimiter(container);
		createColumnDelimiter(container);

		return area;
	}

	private void createColumnDelimiter(final Composite container) {
		final Label labelColumnDelimiter = new Label(container, SWT.NONE);
		labelColumnDelimiter.setText("Column Delimiter");

		final GridData dataFirstName = new GridData();
		dataFirstName.grabExcessHorizontalSpace = true;
		dataFirstName.horizontalAlignment = GridData.FILL;

		txtColumnDelimiter = new Text(container, SWT.BORDER);
		txtColumnDelimiter.setLayoutData(dataFirstName);
		txtColumnDelimiter.setText(",");
	}

	private void createRowDelimiter(final Composite container) {
		final Label labelRowDelimiter = new Label(container, SWT.NONE);
		labelRowDelimiter.setText("Row Delimiter");

		final GridData dataLastName = new GridData();
		dataLastName.grabExcessHorizontalSpace = true;
		dataLastName.horizontalAlignment = GridData.FILL;
		txtRowDelimiter = new Text(container, SWT.BORDER);
		txtRowDelimiter.setLayoutData(dataLastName);
		txtRowDelimiter.setText("\\n");
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	// save content of the Text fields because they get disposed
	// as soon as the Dialog closes
	private void saveInput() {
		colDelim = removeEscapes(txtColumnDelimiter.getText());
		rowDelim = removeEscapes(txtRowDelimiter.getText());
	}

	private String removeEscapes(final String in) {
		// in.replaceAll("\\n", "\n"); <- does not work.. don't know why...
		switch (in) {
		case "\\n":
			return "\n";
		case "\\t":
			return "\t";
		case "\\b":
			return "\b";
		case "\\r":
			return "\r";
		case "\\f":
			return "\f";
		}

		return in;
	}

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}

	public String getColDelim() {
		return colDelim;
	}

	public String getRowDelim() {
		return rowDelim;
	}

}

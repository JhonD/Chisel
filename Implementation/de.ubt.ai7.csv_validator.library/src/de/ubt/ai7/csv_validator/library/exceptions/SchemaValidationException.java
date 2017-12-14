package de.ubt.ai7.csv_validator.library.exceptions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

public class SchemaValidationException extends ValidationException {


	/**
	 *
	 */
	private static final long serialVersionUID = -7130394399967088589L;
	public static final String NOT_CONVERTIBLE = "Internal error: element not convertible.";
	protected int index;
	protected String issueCode;
	protected String[] issueData;

	public SchemaValidationException(final String message, final EObject source) {
		super(message, source, null);
		this.index = ValidationMessageAcceptor.INSIGNIFICANT_INDEX;
		this.issueCode = null;
		this.issueData = null;
	}

	public SchemaValidationException(final String message, final EObject source, final EStructuralFeature feature) {
		super(message, source, feature);
		this.index = ValidationMessageAcceptor.INSIGNIFICANT_INDEX;
		this.issueCode = null;
		this.issueData = null;
	}

	public SchemaValidationException(final String message, final EObject source, final EStructuralFeature feature, final int index,
			final String issueCode, final String... issueData) {
		super(message, source, feature);
		this.index = index;
		this.issueCode = issueCode;
		this.issueData = issueData;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getIndex() {
		return index;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public String[] getIssueData() {
		return issueData;
	}

	public void setIndex(final int index) {
		this.index = index;
	}

	public void setIssueCode(final String issueCode) {
		this.issueCode = issueCode;
	}

	public void setIssueData(final String[] issueData) {
		this.issueData = issueData;
	}


}

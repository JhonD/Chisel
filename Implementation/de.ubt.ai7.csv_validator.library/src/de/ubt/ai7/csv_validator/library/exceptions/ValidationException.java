package de.ubt.ai7.csv_validator.library.exceptions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ValidationException extends Exception {


	/**
	 *
	 */
	private static final long serialVersionUID = 9084590961127850812L;
	protected EObject source;
	protected EStructuralFeature feature;

	public static final String NO_REFERENCE = "Missing reference. Check order and validity.";

	public ValidationException(final String message, final EObject source, final EStructuralFeature feature) {
		super(message);
		this.source = source;
		this.feature = feature;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public EObject getSource() {
		return source;
	}

	public EStructuralFeature getFeature() {
		return feature;
	}

	public void setSource(final EObject source) {
		this.source = source;
	}

	public void setFeature(final EStructuralFeature feature) {
		this.feature = feature;
	}

}

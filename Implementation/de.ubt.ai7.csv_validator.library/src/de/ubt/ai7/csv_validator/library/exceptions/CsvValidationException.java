package de.ubt.ai7.csv_validator.library.exceptions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.ubt.ai7.csv_validator.library.dataStructures.Region;

public class CsvValidationException extends ValidationException {


	/**
	 *
	 */
	private static final long serialVersionUID = 6157553757146339087L;
	/**
	 * cells of the csv file causing the transformation or validation to fail
	 */
	protected Region errorRegion;

	/*
	 * constructors
	 */
	public CsvValidationException(final Region errorRegion) {
		super(null, null, null);
		this.errorRegion = errorRegion;
	}

	public CsvValidationException(final String message, final EObject source, final EStructuralFeature feature, final Region errorRegion) {
		super(message, source, feature);
		this.errorRegion = errorRegion;
	}

	public CsvValidationException(final EObject source) {
		super(ValidationException.NO_REFERENCE, source, null);
		this.errorRegion = null;
	}

	public CsvValidationException(final SchemaValidationException e) {
		super(e.getMessage(), e.getSource(), e.getFeature());
		this.errorRegion = null;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Region getErrorRegion() {
		return errorRegion;
	}

	public void setErrorRegion(final Region errorRegion) {
		this.errorRegion = errorRegion;
	}

}

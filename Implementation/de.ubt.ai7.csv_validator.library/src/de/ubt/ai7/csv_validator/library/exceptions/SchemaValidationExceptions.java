package de.ubt.ai7.csv_validator.library.exceptions;

import java.util.List;

public class SchemaValidationExceptions extends Exception {


	/**
	 *
	 */
	private static final long serialVersionUID = -402615881682399748L;
	protected List<SchemaValidationException> exceptions;

	public SchemaValidationExceptions(final String message, final List<SchemaValidationException> exceptions) {
		super(message);
		this.exceptions = exceptions;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<SchemaValidationException> getExceptions() {
		return exceptions;
	}

	public SchemaValidationExceptions add(final SchemaValidationException e){
		exceptions.add(e);
		return this;
	}
}

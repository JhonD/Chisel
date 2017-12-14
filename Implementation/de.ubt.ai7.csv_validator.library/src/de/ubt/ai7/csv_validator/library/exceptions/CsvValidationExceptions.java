package de.ubt.ai7.csv_validator.library.exceptions;

import java.util.List;

/**
 *
 * chain of {@link CsvValidationException}
 *
 */
public class CsvValidationExceptions extends Exception {


	/**
	 *
	 */
	private static final long serialVersionUID = 7922916133159333735L;
	protected List<CsvValidationException> exceptions;

	public CsvValidationExceptions(final String message, final List<CsvValidationException> exceptions) {
		super(message);
		this.exceptions = exceptions;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<CsvValidationException> getExceptions() {
		return exceptions;
	}

	public CsvValidationExceptions add(final CsvValidationException e){
		exceptions.add(e);
		return this;
	}

}

package de.ubt.ai7.csv_validator.library.parser;

public interface Parser<T> {

	/**
	 *
	 *
	 * @return regular expression matching at least all possible instances that
	 * 			meet the specified parameters of this parser instance
	 *
	 * CAUTION: regex must not create a capture group
	 */
	public abstract String getRegex();

	/**
	 *
	 * @param value String to be parsed
	 * @return parses single value of specified data type if it matches the parameters
	 * 			null otherwise
	 */
	public abstract T parse(String value) throws IllegalArgumentException;


	public default void setFormat(final String format) throws IllegalArgumentException, UnsupportedOperationException{
		if(format != null) {
			throw new UnsupportedOperationException();
		}
	}

	public default void setLength(final Integer length) throws IllegalArgumentException, UnsupportedOperationException{
		if(length != null) {
			throw new UnsupportedOperationException();
		}
	}

	public default void setDefaultValue(final String defaultValue) throws IllegalArgumentException, UnsupportedOperationException{
		if(defaultValue != null) {
			throw new UnsupportedOperationException();
		}
	}

	public default void setEmptyValue(final String emptyValue) throws IllegalArgumentException, UnsupportedOperationException{
		if(emptyValue != null) {
			throw new UnsupportedOperationException();
		}
	}

	public default void setMinLength(final Integer minLength) throws IllegalArgumentException, UnsupportedOperationException{
		if(minLength != null) {
			throw new UnsupportedOperationException();
		}
	}

	public default void setMaxLength(final Integer maxLength) throws IllegalArgumentException, UnsupportedOperationException{
		if(maxLength != null) {
			throw new UnsupportedOperationException();
		}
	}

	public default void setGroupChar(final String groupChar) throws IllegalArgumentException, UnsupportedOperationException{
		if(groupChar != null) {
			throw new UnsupportedOperationException();
		}
	}

	public default void setDecimalChar(final String decimalChar) throws IllegalArgumentException, UnsupportedOperationException{
		if(decimalChar != null) {
			throw new UnsupportedOperationException();
		}
	}

	public default void setMinimum(final String minimum) throws IllegalArgumentException, UnsupportedOperationException{
		if(minimum != null) {
			throw new UnsupportedOperationException();
		}
	}

	public default void setMaximum(final String maximum) throws IllegalArgumentException, UnsupportedOperationException{
		if(maximum != null) {
			throw new UnsupportedOperationException();
		}
	}

	public default void setMinExclusive(final String minExclusive) throws IllegalArgumentException, UnsupportedOperationException{
		if(minExclusive != null) {
			throw new UnsupportedOperationException();
		}
	}

	public default void setMaxExclusive(final String maxExclusive) throws IllegalArgumentException, UnsupportedOperationException{
		if(maxExclusive != null) {
			throw new UnsupportedOperationException();
		}
	}

}

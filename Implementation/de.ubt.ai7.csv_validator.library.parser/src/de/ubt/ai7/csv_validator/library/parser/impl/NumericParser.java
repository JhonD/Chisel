package de.ubt.ai7.csv_validator.library.parser.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import de.ubt.ai7.csv_validator.library.parser.Parser;

public abstract class NumericParser<T extends Number> implements Parser<T> {
	private static final String REGEX = "\\s*[A-Za-z0-9.+\\-%‰',]+\\s*";

	protected String groupChar;
	protected T defaultValue;
	protected String emptyValue;
	protected String regex;
	protected Pattern pattern;
	protected Pattern groupCharPattern;

	protected Integer minLength;
	protected Integer maxLength;

	protected T minimum;
	protected T maximum;
	protected T minExclusive;
	protected T maxExclusive;

	public NumericParser() {
		setGroupChar(",");
		pattern = Pattern.compile(REGEX);
	}

	@Override
	public String getRegex() {
		if (regex == null) {
			return REGEX;
		}
		return regex;
	}

	@Override
	@SuppressWarnings("unchecked")
	public T parse(final String value) throws IllegalArgumentException {
		if (value == null || value.isEmpty()) {
			return defaultValue;
		}
		if (value.equals(emptyValue)) {
			return null;
		}
		if(pattern != null){
			final Matcher m = pattern.matcher(value);
			if(!m.matches()) {
				throw new IllegalArgumentException("invalid format");
			}
		}

		T parsedValue;
		parsedValue = parseInternal(value);

		if (parsedValue == null) {
			return null;
		}
		if (!checkLength(parsedValue)) {
			throw new IllegalArgumentException("invalid length");
		}

		if (!checkBounds((Comparable<T>) parsedValue)) {
			throw new IllegalArgumentException("out of range");
		}

		return parsedValue;
	}

	protected abstract T parseInternal(String value);

	protected boolean checkLength(final T value) {
		return true;
	}

	protected boolean checkBounds(final Comparable<T> value) {
		if (getMinimum() != null && !(value.compareTo(getMinimum()) >= 0)) {
			return false;
		}
		if (getMinExclusive() != null && !(value.compareTo(getMinExclusive()) > 0)) {
			return false;
		}
		if (getMaximum() != null && !(value.compareTo(getMaximum()) <= 0)) {
			return false;
		}
		if (getMaxExclusive() != null && !(value.compareTo(getMaxExclusive()) < 0)) {
			return false;
		}

		return true;
	}

	public String getGroupChar() {
		return groupChar;
	}

	public T getDefaultValue() {
		return defaultValue;
	}

	public String getEmptyValue() {
		return emptyValue;
	}

	public Integer getMinLength() {
		return minLength;
	}

	public Integer getMaxLength() {
		return maxLength;
	}

	public T getMinimum() {
		return minimum;
	}

	public T getMaximum() {
		return maximum;
	}

	public T getMinExclusive() {
		return minExclusive;
	}

	public T getMaxExclusive() {
		return maxExclusive;
	}

	@Override
	public void setDefaultValue(final String defaultValue) {
		if (defaultValue != null) {
			this.defaultValue = parseInternal(defaultValue);
		}
	}

	@Override
	public void setEmptyValue(final String emptyValue) {
		if (emptyValue != null && !emptyValue.isEmpty()) {
			this.emptyValue = emptyValue;
			regex = null;
		}
	}

	@Override
	public void setGroupChar(final String groupChar) {
		if (groupChar != null && !groupChar.isEmpty()) {
			this.groupChar = groupChar;
			groupCharPattern = Pattern.compile(groupChar, Pattern.LITERAL);
			regex = null;
		}
	}

	@Override
	public void setMinLength(final Integer minLength) {
		if (minLength == null) {
			return;
		}
		this.minLength = minLength;
	}

	@Override
	public void setMaxLength(final Integer maxLength) {
		if (maxLength == null) {
			return;
		}
		this.maxLength = maxLength;
	}

	@Override
	public void setLength(final Integer length) {
		if (length == null) {
			return;
		}
		setMinLength(length);
		setMaxLength(length);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void setMinimum(final String minimum) {
		if (minimum != null && !minimum.isEmpty()) {
			final T oldVal = getMinimum();
			try {
				final T parsedVal = parseInternal(minimum);
				this.minimum = null; // for checkBounds
				if (!checkBounds((Comparable<T>) parsedVal)) {
					throw new IllegalArgumentException("conflicts with other bound");
				}
				this.minimum = parsedVal;
			} catch (final Exception e) {
				this.minimum = oldVal;
				throw e;
			}
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public void setMaximum(final String maximum) {
		if (maximum != null && !maximum.isEmpty()) {
			final T oldVal = getMaximum();
			try {
				final T parsedVal = parseInternal(maximum);
				this.maximum = null; // for checkBounds
				if (!checkBounds((Comparable<T>) parsedVal)) {
					throw new IllegalArgumentException("conflicts with other bound");
				}
				this.maximum = parsedVal;
			} catch (final Exception e) {
				this.maximum = oldVal;
				throw e;
			}
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public void setMinExclusive(final String minExclusive) {
		if (minExclusive != null && !minExclusive.isEmpty()) {
			final T oldVal = getMinExclusive();
			try {
				final T parsedVal = parseInternal(minExclusive);
				this.minExclusive = null; // for checkBounds
				if (!checkBounds((Comparable<T>) parsedVal)) {
					throw new IllegalArgumentException("conflicts with other bound");
				}
				this.minExclusive = parsedVal;
			} catch (final Exception e) {
				this.minExclusive = oldVal;
				throw e;
			}
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public void setMaxExclusive(final String maxExclusive) {
		if (maxExclusive != null && !maxExclusive.isEmpty()) {
			final T oldVal = getMaxExclusive();
			try {
				final T parsedVal = parseInternal(maxExclusive);
				this.maxExclusive = null; // for checkBounds
				if (!checkBounds((Comparable<T>) parsedVal)) {
					throw new IllegalArgumentException("conflicts with other bound");
				}
				this.maxExclusive = parsedVal;
			} catch (final Exception e) {
				this.maxExclusive = oldVal;
				throw e;
			}
		}
	}

}

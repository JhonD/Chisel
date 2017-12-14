package de.ubt.ai7.csv_validator.library.parser.impl;

import java.util.regex.Pattern;

import de.ubt.ai7.csv_validator.library.parser.Parser;

public class StringParser implements Parser<String> {
	public static final String REGEX_TEMPLATE = ".{\uf002,\uf003}";

	protected String defaultValue;
	protected String emptyValue;

	protected Integer minLength;
	protected Integer maxLength;

	@Override
	public String getRegex() {
		String regex = null;

		String lBound = String.valueOf(getMinLength());
		if (getMinLength() == null) {
			lBound = "0";
		}

		regex = REGEX_TEMPLATE.replace("\uf002", lBound);

		String uBound = String.valueOf(getMaxLength());
		if (getMaxLength() == null) {
			uBound = "";
		}

		regex = regex.replace("\uf003", uBound);

		if (emptyValue != null && !emptyValue.isEmpty()) {
			regex += "|" + Pattern.quote(emptyValue);
		}

		return regex;
	}

	@Override
	public String parse(final String value) throws IllegalArgumentException {
		if (value == null || value.isEmpty()) {
			return getDefaultValue();
		}
		if (value.equals(getEmptyValue())) {
			return null;
		}

		if (!checkLength(value)) {
			throw new IllegalArgumentException("invalid length");
		}
		return value;
	}

	private boolean checkLength(final String value) {
		if (getMinLength() != null && value.length() < getMinLength()) {
			return false;
		}
		if (getMaxLength() != null && value.length() > getMaxLength()) {
			return false;
		}
		return true;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public String getEmptyValue() {
		return emptyValue;
	}

	public Integer getMaxLength() {
		return maxLength;
	}

	public Integer getMinLength() {
		return minLength;
	}

	@Override
	public void setDefaultValue(final String defaultValue) {
		if (defaultValue != null) {
			if (!checkLength(defaultValue)) {
				throw new IllegalArgumentException("length constraints violated");
			}
			this.defaultValue = defaultValue;
		}
	}

	@Override
	public void setEmptyValue(final String emptyValue) {
		this.emptyValue = emptyValue;
	}

	@Override
	public void setMaxLength(final Integer maxLength) {
		if (maxLength == null) {
			return;
		}
		this.maxLength = maxLength;
	}

	@Override
	public void setMinLength(final Integer minLength) {
		if (minLength == null) {
			return;
		}
		this.minLength = minLength;
	}

	@Override
	public void setLength(final Integer length) {
		if (length == null) {
			return;
		}
		setMinLength(length);
		setMaxLength(length);
	}
}

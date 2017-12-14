package de.ubt.ai7.csv_validator.library.parser.impl;

import java.util.regex.Pattern;

import de.ubt.ai7.csv_validator.library.parser.Parser;

public class IRIParser implements Parser<String> {
	public static final String REGEX_TEMPLATE = ".*:.*";

	protected String defaultValue;
	protected String emptyValue;

	@Override
	public String getRegex() {
		String regex = REGEX_TEMPLATE;

		if (emptyValue != null && !emptyValue.isEmpty()) {
			regex += "|" + Pattern.quote(emptyValue);
		}

		return regex;
	}

	@Override
	public String parse(final String value) throws IllegalArgumentException{
		if (value == null || value.isEmpty()) {
			return getDefaultValue();
		}
		if (value.equals(getEmptyValue())) {
			return null;
		}
		if(value.matches(getRegex())){
			return value;
		} else {
			throw new IllegalArgumentException("input does not match");
		}
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public String getEmptyValue() {
		return emptyValue;
	}

	@Override
	public void setDefaultValue(final String defaultValue) {
		if (defaultValue != null) {
			this.defaultValue = defaultValue;
		}
	}

	@Override
	public void setEmptyValue(final String emptyValue) {
		this.emptyValue = emptyValue;
	}
}


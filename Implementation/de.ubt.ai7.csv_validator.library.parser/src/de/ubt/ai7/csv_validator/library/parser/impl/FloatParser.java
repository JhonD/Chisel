package de.ubt.ai7.csv_validator.library.parser.impl;

import java.util.regex.Pattern;

public class FloatParser extends NumericParser<Float> {
	private String decimalChar;
	private Pattern decimalCharPattern;
	private static final String REGEX_TEMPLATE = "\\s*(?:[+\\-]?\\d{1,3}(?:(?:\uf000\\d{3})*|\\d*)(?:\uf001\\d*)?(?:[eE][+\\-]?\\d+)?[%‰]?|NaN|INF|-INF)\\s*";

	public FloatParser() {
		super();
		setDecimalChar(".");
	}

	@Override
	public Float parseInternal(final String value) throws IllegalArgumentException {
		try {
			groupCharPattern.matcher(value).replaceAll("");
			decimalCharPattern.matcher(value).replaceAll(".");
			return Float.parseFloat(value);
		} catch (final NumberFormatException e) {
			throw new IllegalArgumentException("invalid float format");
		}
	}

	@Override
	public String getRegex() {
		if (regex == null) {
			regex = REGEX_TEMPLATE.replace("\uf000", Pattern.quote(getGroupChar()));
			regex = regex.replace("\uf001", Pattern.quote(getDecimalChar()));
			if (getEmptyValue() != null) {
				regex += "|" + Pattern.quote(getEmptyValue());
			}

			pattern = Pattern.compile(regex);
		}
		return regex;
	}

	public String getDecimalChar() {
		return decimalChar;
	}

	@Override
	public void setDecimalChar(final String decimalChar) {
		if (decimalChar != null && !decimalChar.isEmpty()) {
			this.decimalChar = decimalChar;
			decimalCharPattern = Pattern.compile(decimalChar, Pattern.LITERAL);
			regex = null;
		}
	}

	@Override
	protected boolean checkLength(final Float value) {
		if (getMaxLength() != null && 4 > getMaxLength()) {
			// bytes
			return false;
		}
		if (getMinLength() != null && 4 < getMinLength()) {
			return false;
		}
		return true;
	}
}

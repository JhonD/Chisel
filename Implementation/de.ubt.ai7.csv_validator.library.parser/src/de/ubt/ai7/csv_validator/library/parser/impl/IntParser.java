package de.ubt.ai7.csv_validator.library.parser.impl;

import java.util.regex.Pattern;

public class IntParser extends NumericParser<Integer> {
	private static final String REGEX_TEMPLATE = "\\s*(?:[+\\-]?\\d+|[+\\-]?\\d{1,3}(?:\uf000\\d{3})*)\\s*";

	public IntParser() {
		super();
	}

	@Override
	public Integer parseInternal(final String value) throws IllegalArgumentException {
		try {
			groupCharPattern.matcher(value).replaceAll("");
			return Integer.parseInt(value);
		} catch (final NumberFormatException e) {
			throw new IllegalArgumentException("invalid integer format");
		}
	}

	@Override
	public String getRegex() {
		if (regex == null) {
			// groupChar always set
			final StringBuilder sb = new StringBuilder(REGEX_TEMPLATE.replace("\uf000", Pattern.quote(getGroupChar())));
			if (getEmptyValue() != null) {
				sb.append("|");
				sb.append(Pattern.quote(getEmptyValue()));
			}
			regex = sb.toString();
			pattern = Pattern.compile(regex);
		}
		return regex;
	}

	@Override
	protected boolean checkLength(final Integer value) {
		if (getMaxLength() != null && Integer.toBinaryString(value).length() > getMaxLength() * 8) {
			// given
			// in
			// bytes
			return false;
		}
		if (getMinLength() != null && Integer.toBinaryString(value).length() <= (getMinLength() - 1) * 8) {
			return false;
		}
		return true;
	}
}

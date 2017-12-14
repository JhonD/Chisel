package de.ubt.ai7.csv_validator.library.parser.impl;

import java.text.NumberFormat;
import java.text.ParseException;

public class NumberParser extends NumericParser<Number> {

	@Override
	protected Number parseInternal(final String value) throws IllegalArgumentException {
		try {
			groupCharPattern.matcher(value).replaceAll("");
			return NumberFormat.getInstance().parse(value);
		} catch (final ParseException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}
}

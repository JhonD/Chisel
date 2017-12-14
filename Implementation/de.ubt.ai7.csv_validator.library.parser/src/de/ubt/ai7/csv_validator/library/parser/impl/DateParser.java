package de.ubt.ai7.csv_validator.library.parser.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import de.ubt.ai7.csv_validator.library.parser.Parser;

public class DateParser implements Parser<Date> {
	protected static final char NULL = Character.MIN_VALUE;
	protected static final char SQ = '\'';
	protected static final String TEXT = ".*?";
	protected static final String ONE_DIGIT = "\\d";
	protected static final String TWO_DIGITS = "\\d{1,2}";
	protected static final String THREE_DIGITS = "\\d{1,3}";
	protected static final String FOUR_DIGITS = "\\d{1,4}";
	protected static final String AM_PM = "[AaPp][Mm]";
	protected static final String TIME_ZONE = TEXT;
	protected static final String TIME_ZONE_RFC_822 = "[\\-+]\\d{4}";
	protected static final String TIME_ZONE_ISO_8601 = "[\\-+]\\d{2}(?::(?:\\d{2})?)?";

	protected String format;
	protected Date defaultValue;
	protected String emptyValue;
	protected Date minimum;
	protected Date maximum;
	protected Date minExclusive;
	protected Date maxExclusive;

	protected String regex;
	protected DateFormat parser;

	public DateParser() {
		setFormat("yyyy-MM-dd");
	}

	@Override
	public String getRegex() {
		if (regex == null) {
			regex = generateRegex(format);
		}
		return regex;
	}

	private String generateRegex(final String format) {
		final StringBuilder res = new StringBuilder("\\s*");
		StringBuilder quotedString = null;
		boolean quoted = false;
		char prev = NULL;
		int count = 0;

		final int n = format.length();
		for (int i = 0; i < n; i++) {
			final char c = format.charAt(i);

			if (c == SQ && i + 1 < n && format.charAt(i + 1) == SQ) { // current
				// quotes
				// are
				// escape
				// quotes
				res.append(SQ);
				i++; // skip next char
				continue;
			}

			if (!quoted) {
				if (c == prev) {
					count++;
				} else if (c == SQ) {
					if (i + 1 < n) {
						final char next = format.charAt(i + 1);
						if (next == SQ) {
							res.append(SQ);
							i++; // skip next char
							continue;
						}
					}
					quoted = true;
					quotedString = new StringBuilder();
					res.append(regexForReservedCharSeq(prev, count));
				} else {
					res.append(regexForReservedCharSeq(prev, count));
					count = 1;
					prev = c;
				}
			} else {
				if (c == SQ) {
					if (i + 1 < n) {
						final char next = format.charAt(i + 1);
						if (next == SQ) {
							quotedString.append(SQ);
							i++; // skip next char
							continue;
						}
					}
					quoted = false;
					res.append(Pattern.quote(quotedString.toString()));
					prev = NULL;
					count = 0;
				} else {
					quotedString.append(c);
				}

			}
		}

		if (!quoted) {
			res.append(regexForReservedCharSeq(prev, count));
		} else {
			res.append(Pattern.quote(quotedString.toString()));
		}

		res.append("\\s*");
		return res.toString();
	}

	private String regexForReservedCharSeq(final char c, final int length) {
		if (c == NULL || length < 1) {
			return "";
		}

		switch (c) {
		case 'G':
		case 'E':
		case 'z': {
			return TEXT;
		}

		case 'M': {
			if (length >= 3) {
				return TEXT;
			} else {
				return TWO_DIGITS;
			}
		}
		case 'W':
		case 'F':
		case 'u': {
			return ONE_DIGIT;
		}
		case 'w':
		case 'd':
		case 'H':
		case 'k':
		case 'K':
		case 'h':
		case 'm':
		case 's': {
			return TWO_DIGITS;
		}
		case 'D':
		case 'S': {
			return THREE_DIGITS;
		}
		case 'y':
		case 'Y': {
			return FOUR_DIGITS;
		}
		case 'a': {
			return AM_PM;
		}

		case 'Z': {
			return TIME_ZONE_RFC_822;
		}

		case 'X': {
			return TIME_ZONE_ISO_8601;
		}
		default:
			final StringBuilder res = new StringBuilder(Pattern.quote("" + c));
			if (length > 1) {
				res.append("{");
				res.append(length);
				res.append("}");
			}
			return res.toString();
		}
	}

	@Override
	public Date parse(final String value) throws IllegalArgumentException {
		if (value == null || value.isEmpty()) {
			return defaultValue;
		}
		if (value.equals(emptyValue)) {
			return null;
		}

		final Date parsedValue = parseInternal(value);

		if (!checkBounds(parsedValue)) {
			throw new IllegalArgumentException("out of range");
		}

		return parsedValue;
	}

	protected Date parseInternal(final String value) throws IllegalArgumentException {
		try {
			return parser.parse(value);
		} catch (final ParseException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	protected boolean checkBounds(final Comparable<Date> value) {
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

	public String getFormat() {
		return format;
	}

	@Override
	public void setFormat(final String format) {
		if (format != null && !format.isEmpty()) {
			parser = new SimpleDateFormat(format);// DateFormat.SHORT,
			// Locale.ENGLISH);
			this.format = format;
			regex = null;
		}
	}

	public Date getDefaultValue() {
		return defaultValue;
	}

	public String getEmptyValue() {
		return emptyValue;
	}

	public Date getMinimum() {
		return minimum;
	}

	public Date getMaximum() {
		return maximum;
	}

	public Date getMinExclusive() {
		return minExclusive;
	}

	public Date getMaxExclusive() {
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
	public void setMinimum(final String minimum) {
		if (minimum != null && !minimum.isEmpty()) {
			final Date oldVal = getMinimum();
			try {
				final Date parsedVal = parseInternal(minimum);
				this.minimum = null; // for checkBounds
				if (!checkBounds(parsedVal)) {
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
	public void setMaximum(final String maximum) {
		if (maximum != null && !maximum.isEmpty()) {
			final Date oldVal = getMaximum();
			try {
				final Date parsedVal = parseInternal(maximum);
				this.maximum = null; // for checkBounds
				if (!checkBounds(parsedVal)) {
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
	public void setMinExclusive(final String minExclusive) {
		if (minExclusive != null && !minExclusive.isEmpty()) {
			final Date oldVal = getMinExclusive();
			try {
				final Date parsedVal = parseInternal(minExclusive);
				this.minExclusive = null; // for checkBounds
				if (!checkBounds(parsedVal)) {
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
	public void setMaxExclusive(final String maxExclusive) {
		if (maxExclusive != null && !maxExclusive.isEmpty()) {
			final Date oldVal = getMaxExclusive();
			try {
				final Date parsedVal = parseInternal(maxExclusive);
				this.maxExclusive = null; // for checkBounds
				if (!checkBounds(parsedVal)) {
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

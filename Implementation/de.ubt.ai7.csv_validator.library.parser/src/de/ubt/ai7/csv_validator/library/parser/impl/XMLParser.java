package de.ubt.ai7.csv_validator.library.parser.impl;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

import de.ubt.ai7.csv_validator.library.parser.Parser;

public class XMLParser implements Parser<Document> {
	private static DocumentBuilder builder;
	private static final String REGEX = "\\s*<\\?xml.*>\\s*";

	public XMLParser() {
		try {
			builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		} catch (final ParserConfigurationException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	@Override
	public Document parse(final String value) throws IllegalArgumentException {
		try {
			final Document doc = builder.parse(new ByteArrayInputStream(value.getBytes()));
			// doc.normalizeDocument(); //facilitates equality check
			return doc;
		} catch (final Exception e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	@Override
	public String getRegex() {
		return REGEX;
	}
}

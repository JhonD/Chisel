package de.ubt.ai7.csv_validator.library.parser.impl;

import de.ubt.ai7.csv_validator.library.parser.Parser;
import de.ubt.ai7.csv_validator.library.parser.ParserProvider;

public class ParserProviderImpl implements ParserProvider {

	static public Parser<?> getParser(final String datatype) throws IllegalArgumentException {
		switch(datatype){
		case "integer":
			return new IntParser();
		case "float":
			return new FloatParser();
		case "number":
			return new NumberParser();
		case "xml":
			return new XMLParser();
		case "date":
			return new DateParser();
		case "string":
			return new StringParser();
		case "word":
			return new WordParser();
		case "IRI":
			return new IRIParser();
		default:
			throw new IllegalArgumentException("No parser for " + datatype + " found");
		}

	}
}

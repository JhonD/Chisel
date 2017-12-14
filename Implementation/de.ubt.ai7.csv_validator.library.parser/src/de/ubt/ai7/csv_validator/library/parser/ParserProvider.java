package de.ubt.ai7.csv_validator.library.parser;

public interface ParserProvider {
	/**
	 * 
	 * @param datatype attribute specified for a {@link de.ubt.ai7.csv_validator.sculpt.Type}
	 * @return parser instance for this data type or null if none was found
	 */
	static public Parser<?> getParser(String datatype) throws IllegalArgumentException{
		throw new UnsupportedOperationException("No implementation found"); //requires default implementation
	}
}

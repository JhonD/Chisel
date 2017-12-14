package de.ubt.ai7.csv_validator.csvparser;

import java.util.ArrayList;
import java.util.List;

public class csvParser {
	
	/**
	 * 
	 * @param input String representation of the Csv file
	 * @param colDel character which separates the columns
	 * @param rowDel character, separating rows
	 * @return List representation of the Input sString
	 */
	public static List<List<String>> parse(String input, char colDel, char rowDel) {
		List<List<String>> csvData = new ArrayList<List<String>>();
		List<String> currentLine = new ArrayList<String>();

		StringBuilder currentCell = new StringBuilder();
		boolean quoted = false;

		int n = input.length();
		for (int i = 0; i < n; i++) {
			char c = input.charAt(i);
			if (!quoted) {
				if (c == colDel) {
					currentLine.add(currentCell.toString());
					currentCell = new StringBuilder();
					continue;
				} else if (c == rowDel) {
					// a new line also ends the current cell
					currentLine.add(currentCell.toString());
					currentCell = new StringBuilder();
					// end the line
					csvData.add(currentLine);
					currentLine = new ArrayList<String>();
					continue;
				} else if (c == '"') {
					if (i + 1 < n) {
						char next = input.charAt(i + 1);
						if (next != colDel && next != rowDel) { // more then
																// just single
																// quotes
							quoted = true;
							continue;
						}
					}
					currentCell.append(c); // either last char or next char is a
											// delimiter
				} else {
					currentCell.append(c);
				}
			} else {
				if (c == '"') {
					if (i + 1 < n) {
						char next = input.charAt(i + 1);
						if (next == '"') { // current quotes are escape quotes
							currentCell.append(c);
							i++; // skip next char
							continue;
						}
					}
					// either last char or next are not quotes too, end
					// quotation.
					quoted = false;
					continue;
				} else {
					currentCell.append(c);
				}
			}
		}
		//append the last row and return the result
		currentLine.add(currentCell.toString());
		csvData.add(currentLine);
		return csvData;
	}

	/**
	 * Escapes an input string for csv export
	 * For instance escapeString("foo bar") = "\"foo bar\"" 
	 * @param input string, which should be escaped
	 * @return escaped string
	 */
	public static String escape(String input) {
		String output = "\"" + input.replace("\"", "\"\"") + "\"";
		return output;
	}
}

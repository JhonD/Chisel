package de.ubt.ai7.csv_validator.csvParser.tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import de.ubt.ai7.csv_validator.csvparser.csvParser;

public class extractCsvDataTest {
	
	@Test
	public void extractCsvDataTestSingleLine(){
		String input = "a,b,c";
		char colDel = ',';
		char rowDel = '\n';
		
		List<List<String>> result = csvParser.parse(input, colDel, rowDel);
		
		assertEquals(result.size(), 1);
		
		List<String> firstRow = result.get(0);
		assertEquals(firstRow.size(), 3);
		assertEquals(firstRow.get(0), "a");
		assertEquals(firstRow.get(1), "b");
		assertEquals(firstRow.get(2), "c");
	}
	
	@Test
	public void extractCsvDataTestMultiLine(){
		String input = "a,b,c\nab";
		char colDel = ',';
		char rowDel = '\n';
		
		List<List<String>> result = csvParser.parse(input, colDel, rowDel);
		
		assertEquals(result.size(), 2);
		
		List<String> currentRow = result.get(0);
		assertEquals(currentRow.size(), 3);
		assertEquals(currentRow.get(0), "a");
		assertEquals(currentRow.get(1), "b");
		assertEquals(currentRow.get(2), "c");
		
		currentRow = result.get(1);
		assertEquals(currentRow.size(), 1);
		assertEquals(currentRow.get(0), "ab");
	}

	@Test
	public void extractCsvDataTestQuotations(){
		String input = "\"a\",b,\"\"\"c\"\"\"";
		char colDel = ',';
		char rowDel = '\n';
		
		List<List<String>> result = csvParser.parse(input, colDel, rowDel);
		
		assertEquals(result.size(), 1);
		
		List<String> firstRow = result.get(0);
		assertEquals(firstRow.size(), 3);
		assertEquals(firstRow.get(0), "a");
		assertEquals(firstRow.get(1), "b");
		assertEquals(firstRow.get(2), "\"c\"");
	}
	
	@Test
	public void extractCsvDataTestQuotations2(){
		String input = "ab\"c\"d";
		char colDel = ',';
		char rowDel = '\n';
		
		List<List<String>> result = csvParser.parse(input, colDel, rowDel);
		
		assertEquals(result.size(), 1);
		
		List<String> firstRow = result.get(0);
		assertEquals(firstRow.size(), 1);
		assertEquals(firstRow.get(0), "abcd");
	}
	
	@Test
	public void escapeEmptyString(){
		String input = "";
		String expected = "\"\"";
		
		String actual = csvParser.escape(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void escapeChar(){
		String input = "a";
		String expected = "\"a\"";
		
		String actual = csvParser.escape(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void escapeSpace(){
		String input = "a b";
		String expected = "\"a b\"";
		
		String actual = csvParser.escape(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void escapeQuotes(){
		String input = "\"a\"";
		String expected = "\"\"\"a\"\"\"";
		
		String actual = csvParser.escape(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void escapeQuotesInText(){
		String input = "a\"b";
		String expected = "\"a\"\"b\"";
		
		String actual = csvParser.escape(input);
		assertEquals(expected, actual);
	}

}

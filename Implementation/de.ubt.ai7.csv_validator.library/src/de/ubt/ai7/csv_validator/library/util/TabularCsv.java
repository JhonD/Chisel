package de.ubt.ai7.csv_validator.library.util;

import java.util.ArrayList;
import java.util.List;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedToken;

/**
 *
 * Data class storing the transformed cells with type annotations.
 *
 */
public class TabularCsv {
	private final List<List<String>> content;
	private final List<List<CachedToken>> typing;
	private int currentRow;
	private int currentCol;
	private int maxCols;
	private boolean tabular;

	public TabularCsv(){
		content = new ArrayList<List<String>>();
		typing = new ArrayList<List<CachedToken>>();
		currentRow = -1;
		currentCol = 0;
		maxCols = 0;
		tabular = true;
	}

	public final List<List<String>> getContent() {
		return content;
	}

	public final List<List<CachedToken>> getTyping() {
		return typing;
	}

	public boolean isTabular(){
		return tabular && currentCol == maxCols;
	}

	public void add(final String cellContent, final CachedToken type){
		content.get(currentRow).add(cellContent);
		typing.get(currentRow).add(type);
		currentCol++;
	}

	public void newLine(){
		content.add(new ArrayList<String>());
		typing.add(new ArrayList<CachedToken>());
		if(maxCols != 0) {
			tabular &= currentCol == maxCols;
		}
		maxCols = Integer.max(currentCol, maxCols);
		currentCol = 0;
		currentRow++;
	}

	public int getMaxCols() {
		return maxCols;
	}

	public int getRows() {
		return currentRow + 1;
	}

	public int getCols() {
		return currentCol + 1;
	}
}

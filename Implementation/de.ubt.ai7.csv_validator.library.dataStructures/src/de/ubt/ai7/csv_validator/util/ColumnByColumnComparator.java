package de.ubt.ai7.csv_validator.util;

import java.util.Comparator;

public class ColumnByColumnComparator implements Comparator<Coordinate> {
	@Override
	public int compare(Coordinate coord1, Coordinate coord2) {
		if (coord1.COLUMN != coord2.COLUMN) {
			return coord1.COLUMN - coord2.COLUMN;
		} else {
			return coord1.ROW - coord2.ROW;
		}
	}
}
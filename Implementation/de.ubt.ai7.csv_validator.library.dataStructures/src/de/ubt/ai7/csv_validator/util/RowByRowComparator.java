package de.ubt.ai7.csv_validator.util;

import java.util.Comparator;

public class RowByRowComparator implements Comparator<Coordinate> {

	@Override
	public int compare(Coordinate coord1, Coordinate coord2) {
		if (coord1.ROW != coord2.ROW) {
			return coord1.ROW - coord2.ROW;
		} else {
			return coord1.COLUMN - coord2.COLUMN;
		}
	}

}
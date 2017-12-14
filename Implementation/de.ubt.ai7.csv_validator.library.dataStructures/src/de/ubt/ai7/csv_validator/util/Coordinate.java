package de.ubt.ai7.csv_validator.util;

public class Coordinate {
	public final int ROW, COLUMN;

	public Coordinate(int row, int column) {
		this.ROW = row;
		this.COLUMN = column;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("(");
		sb.append(ROW);
		sb.append(',');
		sb.append(COLUMN);
		sb.append(')');
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + COLUMN;
		result = prime * result + ROW;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinate other = (Coordinate) obj;
		if (COLUMN != other.COLUMN)
			return false;
		if (ROW != other.ROW)
			return false;
		return true;
	}
}

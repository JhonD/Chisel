package de.ubt.ai7.csv_validator.library.dataStructures;

import java.util.List;

import de.ubt.ai7.csv_validator.util.Coordinate;

/**
 * Abstract class for Region representation in the validation engine.
 */
public abstract class Region {
	protected int columnSize;
	protected int rowSize;

	/**
	 * 
	 * @param rowSize
	 *            number of rows in the Region
	 * @param columnSize
	 *            max number of columns in the Region
	 * @param initVal
	 *            True iff initially all cells are in the region, False
	 *            otherwise
	 */
	public Region(int rowSize, int columnSize, boolean initVal) {
		this.rowSize = rowSize;
		this.columnSize = columnSize;
	};

	/**
	 * Copy constructor
	 * 
	 * @param other
	 *            the region to copy
	 */
	public Region(Region other) {
		// base implementation does nothing
	};

	/**
	 * Adds the given coordinate to the region
	 */
	public abstract void addCoordinateToRegion(Coordinate coordinate);

	/**
	 * 
	 * Removes the given coordinate from the region 
	 */
	public abstract void removeCoordinate(Coordinate cell);
	
	/**
	 * Logical and for the current region and the given region
	 * 
	 */
	public abstract void logicalAnd(Region other);

	/**
	 * Logical or
	 * 
	 */
	public abstract void logicalOr(Region other);

	/**
	 * Logical not
	 */
	public abstract void logicalNot();

	/**
	 * 
	 * @param other
	 * @return true iff all Coordinates of this region are in the given region
	 */
	public abstract boolean isSubRegion(Region other);

	/**
	 * Moves all coordinates in the Region, which have not been moved already,
	 * along the given axis.
	 * For instance [(1,1),(2,1)].moveRegion(AXIS.Right) =
	 * [(1,2),(2,2)] ATTENTION: this method always returns a new Region
	 * 
	 * @param axis
	 *            The axis, along which the region should be moved
	 * @return A new, moved region
	 */
	public abstract Region moveRegion(AXIS axis);

	/**
	 * Marks the contained Coordinates as moved.
	 */
	public abstract void markContainedCoordinatesAsMoved();

	/**
	 * Empty check for Regions
	 * 
	 * @return true iff the region is empty
	 */
	public abstract boolean isEmpty();

	public abstract Iterable<Coordinate> unsortedIteration();

	public abstract Iterable<Coordinate> sortedIteration();

	public abstract List<Iterable<Coordinate>> rowByRowIteration();

	public abstract List<Iterable<Coordinate>> columnByColumnIteration();

	public abstract String toString();

	public int getColumnSize() {
		return columnSize;
	}

	public int getRowSize() {
		return rowSize;
	}

	/**
	 * 
	 * @param coord
	 *            the coordinate to check
	 * @return true iff the given coordinate is in the region
	 */
	public abstract boolean contains(Coordinate coord);

	public enum AXIS {
		RIGHT {
			@Override
			public Coordinate moveCoordinate(Coordinate old) {
				return new Coordinate(old.ROW, old.COLUMN + 1);
			}

			@Override
			public AXIS reverseAxis() {
				return AXIS.LEFT;
			}
		},
		DOWN {
			@Override
			public Coordinate moveCoordinate(Coordinate old) {
				return new Coordinate(old.ROW + 1, old.COLUMN);
			}

			@Override
			public AXIS reverseAxis() {
				return AXIS.UP;
			}
		},
		LEFT {
			@Override
			public Coordinate moveCoordinate(Coordinate old) {
				return new Coordinate(old.ROW, old.COLUMN - 1);
			}

			@Override
			public AXIS reverseAxis() {
				return AXIS.RIGHT;
			}
		},
		UP {
			@Override
			public Coordinate moveCoordinate(Coordinate old) {
				return new Coordinate(old.ROW - 1, old.COLUMN);
			}

			@Override
			public AXIS reverseAxis() {
				return AXIS.DOWN;
			}
		},
		SELF {
			@Override
			public Coordinate moveCoordinate(Coordinate old) {
				return old;
			}

			@Override
			public AXIS reverseAxis() {
				return this;
			}
		};

		public abstract Coordinate moveCoordinate(Coordinate old);

		public abstract AXIS reverseAxis();

		public static AXIS fromString(String axisString) {
			switch (axisString) {
			case "right":
				return AXIS.RIGHT;
			case "down":
				return AXIS.DOWN;
			case "left":
				return AXIS.LEFT;
			case "up":
				return AXIS.UP;
			case "self":
				return AXIS.SELF;
			default:
				throw new IllegalArgumentException("AxisString does not match any axis!");
			}
		}
	}

	
}

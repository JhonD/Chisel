package de.ubt.ai7.csv_validator.library.dataStructures.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

import de.ubt.ai7.csv_validator.library.dataStructures.Region;
import de.ubt.ai7.csv_validator.library.dataStructures.RegionFactory;
import de.ubt.ai7.csv_validator.util.ColumnByColumnComparator;
import de.ubt.ai7.csv_validator.util.Coordinate;
import de.ubt.ai7.csv_validator.util.RowByRowComparator;

public class SetRegion extends Region {
	private Set<Coordinate> region;

	public SetRegion(int rowSize, int columnSize, boolean initVal) {
		super(rowSize, columnSize, initVal);

		// we use HashSets and sort them if needed with the right order
		// according to Stackoverlow this is faster then using TreeSets from the
		// beginning
		this.region = new HashSet<Coordinate>();

		if (initVal) { // fill the region
			for (int i = 1; i <= rowSize; ++i) {
				for (int j = 1; j <= columnSize; ++j) {
					region.add(new Coordinate(i, j));
				}
			}
		}

	}

	/**
	 * Copy constructor
	 * 
	 * @param other
	 *            the region to copy
	 */
	public SetRegion(Region other) {
		super(other);
		if (other instanceof SetRegion) {
			SetRegion otherSetRegion = (SetRegion) other;
			this.region = new HashSet<Coordinate>(otherSetRegion.getRegionSet());
			this.rowSize = otherSetRegion.getRowSize();
			this.columnSize = otherSetRegion.columnSize;

		} else {
			throw new UnsupportedOperationException();
		}
	};

	@Override
	public void addCoordinateToRegion(Coordinate coordinate) {
		this.region.add(coordinate);
	}

	@Override
	public void logicalAnd(Region other) {
		if (other instanceof SetRegion) {
			this.region.retainAll(((SetRegion) other).getRegionSet());
			return;
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public void logicalOr(Region other) {
		if (other instanceof SetRegion) {
			this.region.addAll(((SetRegion) other).getRegionSet());
			return;
		} else {
			throw new UnsupportedOperationException();
		}
	}

	public void logicalNot() {
		Set<Coordinate> temp = this.region;
		this.region = new HashSet<Coordinate>();
		Coordinate c;
		for (int i = 1; i <= this.getRowSize(); ++i) {
			for (int j = 1; j <= this.getColumnSize(); ++j) {
				c = new Coordinate(i, j);
				if (!temp.contains(c)) {
					this.region.add(c);
				}
			}
		}

	}

	public boolean isSubRegion(Region other) {
		for(Coordinate coord: this.unsortedIteration()){
			if(!other.contains(coord)){
				return false;
			}
		}
		return true;
	}

	public Region moveRegion(AXIS axis) {		
		Region movedRegion = RegionFactory.INSTANCE.newRegion(this.rowSize, this.columnSize, false);
		for(Coordinate old : this.unsortedIteration()){
			Coordinate newCoord = axis.moveCoordinate(old);
			if(0 < newCoord.ROW  && newCoord.ROW <= this.rowSize){
				if(0 < newCoord.COLUMN && newCoord.COLUMN <= this.columnSize){
					movedRegion.addCoordinateToRegion(newCoord);
				}
			}
		}
		return movedRegion;
	}
	
	@Override
	public boolean isEmpty(){
		return this.region.isEmpty();
	}
	
	@Override
	public Iterable<Coordinate> unsortedIteration() {
		return this.region;
	}

	@Override
	public Iterable<Coordinate> sortedIteration() {
		TreeSet<Coordinate> sortedSet = new TreeSet<Coordinate>(new RowByRowComparator());
		sortedSet.addAll(this.region);
		return sortedSet;
	}

	@Override
	public List<Iterable<Coordinate>> rowByRowIteration() {
		TreeSet<Coordinate> sortedSet = new TreeSet<Coordinate>(new RowByRowComparator());
		sortedSet.addAll(this.region);
		
		int maxRows = sortedSet.last().ROW;
		List<Iterable<Coordinate>> retList = new ArrayList<Iterable<Coordinate>>(maxRows);
		
		for(int i=0; i <= maxRows; i++){
			retList.add(sortedSet.subSet(new Coordinate(i,0), true, new Coordinate(i+1,0), false));
		}
		
		return retList;
	}

	@Override
	public List<Iterable<Coordinate>> columnByColumnIteration() {
		TreeSet<Coordinate> sortedSet = new TreeSet<Coordinate>(new ColumnByColumnComparator());
		sortedSet.addAll(this.region);
		
		int maxColumns = sortedSet.last().COLUMN;
		List<Iterable<Coordinate>> retList = new ArrayList<Iterable<Coordinate>>(maxColumns);
		
		for(int i=0; i <= maxColumns; i++){
			retList.add(sortedSet.subSet(new Coordinate(0,i), true, new Coordinate(0,i+1), false));
		}
		
		return retList;
	}

	@Override
	public String toString() {
		StringJoiner sj = new StringJoiner(", ");
		int counter = 0;
		int maxPrintedElements = 10;
		for (Coordinate c : this.sortedIteration()) {
			if (counter < maxPrintedElements) {
				counter++;
				sj.add(c.toString());
			} else {
				break;
			}
		}
		if (counter >= maxPrintedElements) {
			sj.add("...");
		}
		return sj.toString();
	}

	@Override
	public boolean contains(Coordinate coord) {
		return this.region.contains(coord);
	}

	public Set<Coordinate> getRegionSet() {
		return this.region;
	}

	@Override
	public void markContainedCoordinatesAsMoved() {
		return; //Nothing to do here
		
	}

	@Override
	public void removeCoordinate(Coordinate cell) {
		region.remove(cell);
		
	}
}

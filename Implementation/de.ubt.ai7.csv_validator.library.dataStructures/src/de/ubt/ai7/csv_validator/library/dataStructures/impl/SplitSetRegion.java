package de.ubt.ai7.csv_validator.library.dataStructures.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;
import java.util.stream.Collectors;

import de.ubt.ai7.csv_validator.library.dataStructures.Region;
import de.ubt.ai7.csv_validator.library.dataStructures.RegionFactory;
import de.ubt.ai7.csv_validator.util.ColumnByColumnComparator;
import de.ubt.ai7.csv_validator.util.Coordinate;
import de.ubt.ai7.csv_validator.util.IterableConcat;
import de.ubt.ai7.csv_validator.util.RowByRowComparator;

public class SplitSetRegion extends Region {
	private Set<Coordinate> finishedRegion; // the coordinates which have been moved already
	private Set<Coordinate> modifiedRegion; // only contains all new cells, which have not been moved by path expressions yet

	public SplitSetRegion(int rowSize, int columnSize, boolean initVal) {
		super(rowSize, columnSize, initVal);

		// we use HashSets and sort them if needed with the right order
		// according to Stackoverlow this is faster then using TreeSets from the
		// beginning. Also we have two different sets, so we have to sort either way!
		this.finishedRegion = new HashSet<Coordinate>();
		this.modifiedRegion = new HashSet<Coordinate>();

		if (initVal) { // fill the region
			for (int i = 1; i <= rowSize; ++i) {
				for (int j = 1; j <= columnSize; ++j) {
					modifiedRegion.add(new Coordinate(i, j));
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
	public SplitSetRegion(Region other) {
		super(other);
		if (other instanceof SplitSetRegion) {
			SplitSetRegion otherSplitSetRegion = (SplitSetRegion) other;
			this.modifiedRegion = new HashSet<Coordinate>(otherSplitSetRegion.getModifiedRegionSet());
			this.finishedRegion = new HashSet<Coordinate>(otherSplitSetRegion.getFinishedRegionSet());
			// ensure all Coordinates are unmoved
			this.markContainedCoordinatesAsMoved();
			Set<Coordinate> temp = this.finishedRegion;
			this.finishedRegion = this.modifiedRegion;
			this.modifiedRegion = temp;
			
			this.rowSize = otherSplitSetRegion.getRowSize();
			this.columnSize = otherSplitSetRegion.columnSize;

		} else {
			throw new UnsupportedOperationException();
		}
	};

	@Override
	public void addCoordinateToRegion(Coordinate coordinate) {
		if(!finishedRegion.contains(coordinate)) { //if coordinate is in finishedRegion we don't want to add it
			this.modifiedRegion.add(coordinate);
		}
	}

	@Override
	public void logicalAnd(Region other) {
		if (other instanceof SplitSetRegion) {
			/*
			 * Idea: this.mod      = this.mod      && (other.mod || other.finished)
			 * and   this.finished = this.finished && (other.mod || other.finished)
			 */
			SplitSetRegion otherSplitSetRegion = (SplitSetRegion) other;
			Set<Coordinate> commonMod = modifiedRegion.stream().filter(otherSplitSetRegion::contains).collect(Collectors.toSet());
			Set<Coordinate> commonFin = finishedRegion.stream().filter(otherSplitSetRegion::contains).collect(Collectors.toSet());
			modifiedRegion = commonMod;
			finishedRegion = commonFin;
			return;
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public void logicalOr(Region other) {
		if (other instanceof SplitSetRegion) {
			SplitSetRegion otherSplitSetRegion = (SplitSetRegion) other;
			
			this.modifiedRegion.addAll(otherSplitSetRegion.getFinishedRegionSet());
			this.modifiedRegion.addAll(otherSplitSetRegion.getModifiedRegionSet());
			this.modifiedRegion.removeAll(this.finishedRegion);
			return;
		} else {
			throw new UnsupportedOperationException();
		}
	}

	public void logicalNot() {
		Set<Coordinate> oldModified = this.modifiedRegion;
		Set<Coordinate> oldFinished = this.finishedRegion;
		this.modifiedRegion = new HashSet<Coordinate>();
		this.finishedRegion = new HashSet<Coordinate>();
		Coordinate c;
		for (int i = 1; i <= this.getRowSize(); ++i) {
			for (int j = 1; j <= this.getColumnSize(); ++j) {
				c = new Coordinate(i, j);
				if (!oldModified.contains(c) && !oldFinished.contains(c)) {
					this.modifiedRegion.add(c);
				}
			}
		}

	}

	@Override
	public boolean isSubRegion(Region other) {
		if(other == null) {
			throw new IllegalArgumentException();
		}
		for(Coordinate coord: this.finishedRegion){
			if(!other.contains(coord)){
				return false;
			}
		}
		for(Coordinate coord: this.modifiedRegion){
			if(!other.contains(coord)){
				return false;
			}
		}
		return true;
	}
	
	@Override
	public void markContainedCoordinatesAsMoved(){
		if(finishedRegion.size() > modifiedRegion.size()){
			this.finishedRegion.addAll(this.modifiedRegion);
			this.modifiedRegion = new HashSet<Coordinate>();
		} else {
			this.modifiedRegion.addAll(this.finishedRegion);
			this.finishedRegion = this.modifiedRegion;
			this.modifiedRegion = new HashSet<Coordinate>();
		}
	}
	
	
	@Override
	public Region moveRegion(AXIS axis) { // only moves the elements of modified Region!
		Region movedRegion = RegionFactory.INSTANCE.newRegion(this.rowSize, this.columnSize, false);
		for(Coordinate old : this.modifiedRegion){
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
		return this.finishedRegion.isEmpty() && this.modifiedRegion.isEmpty();
	}
	
	@Override
	public Iterable<Coordinate> unsortedIteration() {
		if(this.finishedRegion.isEmpty() && this.modifiedRegion.isEmpty()){
			return null;
		}
		return IterableConcat.concat(finishedRegion, modifiedRegion);
	}

	@Override
	public Iterable<Coordinate> sortedIteration() {
		TreeSet<Coordinate> sortedSet = new TreeSet<Coordinate>(new RowByRowComparator());
		sortedSet.addAll(this.finishedRegion);
		sortedSet.addAll(this.modifiedRegion);
		return sortedSet;
	}

	@Override
	public List<Iterable<Coordinate>> rowByRowIteration() {
		if(this.finishedRegion.isEmpty() && this.modifiedRegion.isEmpty()){
			return null;
		}
		TreeSet<Coordinate> sortedSet = new TreeSet<Coordinate>(new RowByRowComparator());
		sortedSet.addAll(this.finishedRegion);
		sortedSet.addAll(this.modifiedRegion);
	
		int maxRows = sortedSet.last().ROW;	
		List<Iterable<Coordinate>> retList = new ArrayList<Iterable<Coordinate>>(maxRows);
		
		for(int i=0; i <= maxRows; i++){
			retList.add(sortedSet.subSet(new Coordinate(i,0), true, new Coordinate(i+1,0), false));
		}
		
		return retList;
	}

	@Override
	public List<Iterable<Coordinate>> columnByColumnIteration() {
		if(this.finishedRegion.isEmpty() && this.modifiedRegion.isEmpty()){
			return null;
		}
		TreeSet<Coordinate> sortedSet = new TreeSet<Coordinate>(new ColumnByColumnComparator());
		sortedSet.addAll(this.finishedRegion);
		sortedSet.addAll(this.modifiedRegion);
		
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
		return this.modifiedRegion.contains(coord) || this.finishedRegion.contains(coord);
	}

	public Set<Coordinate> getFinishedRegionSet() {
		return this.finishedRegion;
	}

	public Set<Coordinate> getModifiedRegionSet() {
		return this.modifiedRegion;
	}

	@Override
	public void removeCoordinate(Coordinate cell) {
		finishedRegion.remove(cell);
		modifiedRegion.remove(cell);		
	}
}

package de.ubt.ai7.csv_validator.library.dataStructures.impl;

import de.ubt.ai7.csv_validator.library.dataStructures.Region;
import de.ubt.ai7.csv_validator.library.dataStructures.RegionFactory;

public class SplitSetRegionFacotry implements RegionFactory{
	
	public static RegionFactory init(){
		return new SplitSetRegionFacotry();
	}

	@Override
	public Region newRegion(int rowSize, int columnSize, boolean initVal) {
		return new SplitSetRegion(rowSize, columnSize, initVal);
	}

	@Override
	public Region copyRegion(Region other) {
		return new SplitSetRegion(other);
	}

}

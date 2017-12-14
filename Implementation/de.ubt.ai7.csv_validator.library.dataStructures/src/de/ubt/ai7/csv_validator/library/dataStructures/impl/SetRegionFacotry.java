package de.ubt.ai7.csv_validator.library.dataStructures.impl;

import de.ubt.ai7.csv_validator.library.dataStructures.Region;
import de.ubt.ai7.csv_validator.library.dataStructures.RegionFactory;

public class SetRegionFacotry implements RegionFactory{
	
	public static RegionFactory init(){
		return new SetRegionFacotry();
	}

	@Override
	public Region newRegion(int rowSize, int columnSize, boolean initVal) {
		return new SetRegion(rowSize, columnSize, initVal);
	}

	@Override
	public Region copyRegion(Region other) {
		return new SetRegion(other);
	}

}

package de.ubt.ai7.csv_validator.library.dataStructures;

import de.ubt.ai7.csv_validator.library.dataStructures.impl.SplitSetRegionFacotry;

public interface RegionFactory {
	//RegionFactory INSTANCE = SetRegionFacotry.init();
	RegionFactory INSTANCE = SplitSetRegionFacotry.init();
	
	public Region newRegion(int rowSize, int columnSize, boolean initVal);

	public Region copyRegion(Region other);
}

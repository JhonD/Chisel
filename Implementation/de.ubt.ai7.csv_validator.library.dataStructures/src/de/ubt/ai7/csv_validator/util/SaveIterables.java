package de.ubt.ai7.csv_validator.util;

import java.util.Collections;

public class SaveIterables{
	
	public static <T> Iterable<T> emptyIfNull(Iterable<T> iterable){
		return iterable == null ? Collections.<T>emptyList() : iterable;
	}

}

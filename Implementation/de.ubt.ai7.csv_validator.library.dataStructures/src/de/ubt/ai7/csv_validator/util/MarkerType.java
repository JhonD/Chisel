package de.ubt.ai7.csv_validator.util;

public enum MarkerType {
	DEFAULT_MARKER("de.ubt.ai7.csv_validation.sculptMarker"),
	ERROR_MARKER("de.ubt.ai7.csv_validation.sculptErrorMarker");
	
	private final String refference;
	
	MarkerType(String refference){
		this.refference = refference;
	}
	
	public String getRefference(){
		return this.refference;
	}
}

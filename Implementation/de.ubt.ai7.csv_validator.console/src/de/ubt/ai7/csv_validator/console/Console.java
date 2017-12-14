package de.ubt.ai7.csv_validator.console;


import de.ubt.ai7.csv_validator.console.impl.ConsoleImpl;

public interface Console {

	Console INSTANCE = ConsoleImpl.init();

	public void println(String text);
	public void printlnNegative(String text);
	public void printlnPositive(String text);
}

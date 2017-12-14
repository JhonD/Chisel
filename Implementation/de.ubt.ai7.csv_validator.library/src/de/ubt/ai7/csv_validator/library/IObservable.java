package de.ubt.ai7.csv_validator.library;

import java.util.Observer;

public interface IObservable {
	void addObserver(Observer o);
	void deleteObserver(Observer o);
	void notifyObservers();
}

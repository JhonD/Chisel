package de.ubt.ai7.csv_validator.library;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.gson.JsonObject;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedDelimiters;
import de.ubt.ai7.csv_validator.sculpt.Delimiters;
import de.ubt.ai7.csv_validator.util.Coordinate;
import de.ubt.ai7.csv_validator.util.Pair;

public interface SculptCsvRelationItem extends IObservable {
	/*
	 * methods for marking cells and syntax tree elements
	 */
	public void toggleMarking(EObject element);
	public void resetMarkMode();
	public void showUncoveredCells();
	public void markElements(Coordinate cell);
	public void setShowIntersection(boolean showIntersection);

	/*
	 * getters
	 */
	public List<List<String>> getCsvArray();
	public String getCsvEntry(Coordinate coord);
	public boolean hasDelimiters();
	public CachedDelimiters getDelimiters();
	public boolean hasTransformationProgram();
	public char getTransformationRowDelim();
	public char getTransformationColDelim();

	/*
	 * setters
	 */
	public void registerSchema(XtextEditor sculptEditor);
	public boolean registerCsv(String originalInput, Delimiters delimiters, String csvFileName);



	/*
	 * functions to execute
	 */
	public void clearCaches();
	public boolean validateSculptSchema();
	public Pair<List<List<String>>, JsonObject>  getTransformedCsv();

}

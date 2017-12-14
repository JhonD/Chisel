package de.ubt.ai7.csv_validator.library.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Observable;

import de.ubt.ai7.csv_validator.console.Console;
import de.ubt.ai7.csv_validator.library.SculptApi;
import de.ubt.ai7.csv_validator.library.SculptCsvRelationItem;
import de.ubt.ai7.csv_validator.library.SculptCsvRelationManager;
import de.ubt.ai7.csv_validator.util.Pair;

public class SculptCsvRelationManagerImpl extends Observable  implements SculptCsvRelationManager{
	public static final SculptCsvRelationManager INSTANCE = new SculptCsvRelationManagerImpl();
	
	private List<Pair<String, String>> mapping; //list of sculpt, csv pairs in order of the relation
	private List<SculptCsvRelationItem> relationIdToRelationItem; //relationID to Interpreter
	
	
	private SculptCsvRelationManagerImpl(){
		this.relationIdToRelationItem = new ArrayList<SculptCsvRelationItem>();
		this.mapping = new ArrayList<Pair<String, String>>();
		addRelationItem();		
	}
	
	@Override
	public SculptCsvRelationItem addCsvToRelation(int relationId, String csvFileName){
		Pair<String, String> currentEntry = mapping.get(relationId);
		Pair<String, String> newEntry = new Pair<String, String>(currentEntry.left, csvFileName);
		mapping.set(relationId, newEntry);
		
		this.setChanged();
		this.notifyObservers(new Pair<Integer, String>(relationId, csvFileName));
		
		if(relationId == this.mapping.size() - 1) {
			// last relation is "taken" now, add a new relation
			addRelationItem();
		}
		return relationIdToRelationItem.get(relationId);
	}
	
	@Override
	public void addCsvToRelation(SculptCsvRelationItem relationItem, String csvFileName){
		int relationId = getIdFromRelationItem(relationItem);
		addCsvToRelation(relationId, csvFileName);
	}


	private int getIdFromRelationItem(SculptCsvRelationItem relationItem) {
		int relationId = relationIdToRelationItem.indexOf(relationItem);
		return relationId;
	}
	
	@Override
	public SculptCsvRelationItem addSculptToRelation(int relationId, String sculptSchemaName){
		Pair<String, String> currentEntry = mapping.get(relationId);
		Pair<String, String> newEntry = new Pair<String, String>(sculptSchemaName, currentEntry.right);
		mapping.set(relationId, newEntry);
				
		if(relationId == this.mapping.size() - 1) {
			// last relation is "taken" now, add a new relation
			addRelationItem();
		}
		
		return relationIdToRelationItem.get(relationId);
	}
	
	public void addSculptToRelation(SculptCsvRelationItem relationItem, String sculptSchemaName){
		int relationId = relationIdToRelationItem.indexOf(relationItem);
		addSculptToRelation(relationId, sculptSchemaName);
	}
	
	@Override
	public void deleteRelationItem(SculptCsvRelationItem relationItem){
		int relationId = getIdFromRelationItem(relationItem);
		mapping.remove(relationId);
		relationIdToRelationItem.remove(relationId);

		this.setChanged();
		this.notifyObservers(new Pair<String, SculptCsvRelationItem>(DELETE_COMMAND, relationItem));
		
		// Check if there is at least one item left. If not add one.
		if(this.relationIdToRelationItem.size() == 0) {
			addRelationItem();
		}
		Console.INSTANCE.println(TEXT_TAB_DELETED);
	}

	@Override
	public List<SculptCsvRelationItem> getAllInterpreterForGivenSchema(String sculptSchemaName){
		List<Integer> relationsToReturn = new ArrayList<Integer>();
		
		ListIterator<Pair<String, String>> iter = mapping.listIterator();
		while(iter.hasNext()){
			Pair<String, String> entry = iter.next();
			if(entry.left.equals(sculptSchemaName)){
				relationsToReturn.add(iter.nextIndex() - 1);
			}
		}
		if(relationsToReturn.isEmpty()){
			Console.INSTANCE.printlnNegative(SculptApi.SCHEMA_NOT_REGISTERED);
		}
		return intListToSculptInterpreter(relationsToReturn);
	}

	@Override
	public SculptCsvRelationItem getItemForRelationID(int relationId){
		return relationIdToRelationItem.get(relationId);
	}

	@Override
	public Iterable<Pair<String, String>> getMapping(){
		return this.mapping;
	}

	
	private List<SculptCsvRelationItem> intListToSculptInterpreter(List<Integer> relationsToReturn) {
		List<SculptCsvRelationItem> returnList = new ArrayList<SculptCsvRelationItem>();
		for(Integer i : relationsToReturn){
			returnList.add(relationIdToRelationItem.get(i));
		}
		return returnList;
	}
	
	@Override
	public SculptCsvRelationItem getInitialRelation(){
		return relationIdToRelationItem.get(0);
	}
	
	private void addRelationItem() {
		SculptCsvRelationItem item = new SculptCsvRelationItemImpl();
		relationIdToRelationItem.add(item);
		mapping.add(new Pair<String, String>("", ""));
		
		this.setChanged();
		this.notifyObservers(new Pair<String, SculptCsvRelationItem>(ADD_COMMAND, item));
	}
}

package de.ubt.ai7.csv_validator.library.dataStructures.automaton.pathExpressions;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import de.ubt.ai7.csv_validator.library.dataStructures.Region;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.AutomatonState;

public class PathExpressionState extends AutomatonState<PathExpressionState, PathExpressionTransition>{
	
	private Region region;

	public PathExpressionState(List<PathExpressionTransition> transitions,
			Set<PathExpressionState> epsilonTransitions, Region startRegion) {
		super(transitions, epsilonTransitions);
		
		this.region = startRegion;
	}
	
	public List<PathExpressionState> moveRegion(boolean inPredicate){
		List<PathExpressionState> modifiedStates = new LinkedList<PathExpressionState>();
		for(PathExpressionState state : this.getEpsilonTransitions()){
			if(!this.region.isSubRegion(state.getRegion())){
				state.getRegion().logicalOr(this.region);
				modifiedStates.add(state);
			}
		}
		for(PathExpressionTransition trans : this.getTransitions()){
			PathExpressionState state = trans.getTargetState();
			Region movedRegion = trans.makeTransition(this.region, inPredicate);
			if(!movedRegion.isSubRegion(state.getRegion())){
				state.getRegion().logicalOr(movedRegion);
				modifiedStates.add(state);
			}
		}
		this.region.markContainedCoordinatesAsMoved();
		return modifiedStates;
	}
	
	public void setRegion(Region region) {
		this.region = region;
	}

	public Region getRegion() {
		return region;
	}

}

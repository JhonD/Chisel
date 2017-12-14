package de.ubt.ai7.csv_validator.library.dataStructures.automaton;

import java.util.HashSet;
import java.util.Set;

public class Automaton<S extends AutomatonState<S, T>, T extends AutomatonTransition<S, T>> {	
	private S startState, targetState;
	
	/**
	 * Generates an automaton with given start and target state.
	 * @param startState start state of the Automaton
	 * @param targetState target state of the Automaton
	 */
	public Automaton(S startState, S targetState){
		if(startState == null || targetState == null) {
			throw new IllegalArgumentException("Either startState or targetState are null!");
		}
		this.startState = startState;
		this.targetState = targetState;
	}
	
	/**
	 * Computes the epsilon closure of the given Set of states
	 * @param states in/out value, set containing all states in the epsilon closure of the given states set.
	 */
	public void computeEpsilonClosure(Set<S> states){
		Set<S> tempStates = new HashSet<S>(states); // used to avoid current modification exception
		for(S state : tempStates){
			state.computeEpsilonClosure(states);
		}
	}
	
	
	public S getStartState() {
		return startState;
	}


	public S getTargetState() {
		return targetState;
	}
}

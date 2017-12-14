package de.ubt.ai7.csv_validator.library.dataStructures.automaton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class AutomatonState<S extends AutomatonState<S, T>, T extends AutomatonTransition<S, T>> {
	private List<T> transitions;
	private Set<S> epsilonTransitions;

	public AutomatonState(List<T> transitions, Set<S> epsilonTransitions) {
		if (transitions == null) {
			transitions = new ArrayList<T>();
		}
		this.transitions = transitions;
		if (epsilonTransitions == null) {
			epsilonTransitions = new HashSet<S>();
		}
		this.epsilonTransitions = epsilonTransitions;
	}
	
	public void addEpsilonTransition(S epsilonReachableState){
		this.epsilonTransitions.add(epsilonReachableState);
	}
	
	public void addTransition(T transition){
		this.transitions.add(transition);
	}
	
	/**
	 * Adds all States in epsilonTransiton to the states set.
	 * @param states in/out value, the set which will after the computation contain all states in the epsilon closure of the start set
	 */
	public void computeEpsilonClosure(Set<S> states){
		for(S state : this.epsilonTransitions){
			if(!states.contains(state)){
				states.add(state);
				state.computeEpsilonClosure(states);
			}
		}
	}

	public List<T> getTransitions() {
		return transitions;
	}

	public Set<S> getEpsilonTransitions() {
		return epsilonTransitions;
	}

}

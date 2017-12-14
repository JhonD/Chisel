package de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TLContentExpressionState extends ContentExpressionState {
	private final Set<ContentExpressionState> epsilonTransitionsIterationIncrement;

	public TLContentExpressionState(final List<ContentExpressionTransition> transitions,
			final Set<ContentExpressionState> epsilonTransitions) {
		super(transitions, epsilonTransitions);
		this.epsilonTransitionsIterationIncrement = new HashSet<ContentExpressionState>();
	}

	public void addEpsilonTransitionWithIterationIncrement(final ContentExpressionState epsilonReachableState) {
		this.epsilonTransitionsIterationIncrement.add(epsilonReachableState);
	}

	public Set<ContentExpressionState> getEpsilonTransitionsWithIterationIncrement() {
		return epsilonTransitionsIterationIncrement;
	}

}

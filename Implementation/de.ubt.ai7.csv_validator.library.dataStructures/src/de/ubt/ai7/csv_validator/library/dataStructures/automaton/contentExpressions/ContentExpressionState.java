package de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions;

import java.util.List;
import java.util.Set;

import de.ubt.ai7.csv_validator.library.dataStructures.automaton.AutomatonState;

public class ContentExpressionState extends AutomatonState<ContentExpressionState, ContentExpressionTransition> {

	public ContentExpressionState(List<ContentExpressionTransition> transitions,
			Set<ContentExpressionState> epsilonTransitions) {
		super(transitions, epsilonTransitions);
	}

}
package de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions;

import de.ubt.ai7.csv_validator.library.dataStructures.automaton.AutomatonTransition;

public class ContentExpressionTransition
extends AutomatonTransition<ContentExpressionState, ContentExpressionTransition> {
	protected ContentExpressionTransitionMode transitionMode;

	public ContentExpressionTransition(final ContentExpressionState targetState,
			final ContentExpressionTransitionMode transitionMode) {
		super(targetState);
		this.transitionMode = transitionMode;
	}

	public ContentExpressionTransitionMode getTransitionMode() {
		return transitionMode;
	}


	public enum ContentExpressionTransitionMode {
		VARIABLE_BINDING, STRING, EMPTY, ANY, SOMETHING, TOKEN, COMPARISON_CONST, COMPARISON_PATH
	}

}
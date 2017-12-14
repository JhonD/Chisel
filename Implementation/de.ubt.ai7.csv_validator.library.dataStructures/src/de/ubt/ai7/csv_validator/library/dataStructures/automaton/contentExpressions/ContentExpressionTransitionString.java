package de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions;

public class ContentExpressionTransitionString extends ContentExpressionTransition {
	private final String string;

	public ContentExpressionTransitionString(final ContentExpressionState targetState, final String string) {
		super(targetState, ContentExpressionTransitionMode.STRING);
		this.string = string;
	}

	public String getString() {
		return string;
	}
}

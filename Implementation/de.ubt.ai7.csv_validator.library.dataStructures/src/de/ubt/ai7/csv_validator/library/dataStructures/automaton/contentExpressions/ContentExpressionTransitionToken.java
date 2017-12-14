package de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions;

import de.ubt.ai7.csv_validator.sculpt.Token;

public class ContentExpressionTransitionToken extends ContentExpressionTransition {

	private final Token token;

	public ContentExpressionTransitionToken(final ContentExpressionState targetState, final Token token) {
		super(targetState, ContentExpressionTransitionMode.TOKEN);
		this.token = token;
	}

	public Token getToken() {
		return token;
	}

}

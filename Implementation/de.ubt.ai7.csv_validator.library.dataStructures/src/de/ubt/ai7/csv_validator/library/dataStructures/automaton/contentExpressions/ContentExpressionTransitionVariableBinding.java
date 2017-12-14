package de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions;

import de.ubt.ai7.csv_validator.sculpt.TLVariable;

public class ContentExpressionTransitionVariableBinding extends ContentExpressionTransition {
	protected TLVariable variable;
	protected ContentExpressionTransition transition;

	public ContentExpressionTransitionVariableBinding(final ContentExpressionTransition transition, final TLVariable variable){
		super(transition.getTargetState(), ContentExpressionTransitionMode.VARIABLE_BINDING);
		this.transition = transition;
		this.variable = variable;
	}

	public TLVariable getVariable() {
		return variable;
	}

	public ContentExpressionTransition getTransition() {
		return transition;
	}
}
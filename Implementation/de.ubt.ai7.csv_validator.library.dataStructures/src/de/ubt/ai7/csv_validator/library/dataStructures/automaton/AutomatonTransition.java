package de.ubt.ai7.csv_validator.library.dataStructures.automaton;

public abstract class AutomatonTransition<S extends AutomatonState<S, T>, T extends AutomatonTransition<S, T>> {
	private S targetState;

	public AutomatonTransition(S targetState) {
		if (targetState == null) {
			throw new IllegalArgumentException("Target state can't be null!");
		}
		this.targetState = targetState;

	}

	public S getTargetState() {
		return targetState;
	}

}

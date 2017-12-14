package de.ubt.ai7.csv_validator.library.dataStructures.automaton.pathExpressions;

import de.ubt.ai7.csv_validator.library.dataStructures.Region;
import de.ubt.ai7.csv_validator.library.dataStructures.Region.AXIS;
import de.ubt.ai7.csv_validator.library.dataStructures.RegionFactory;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.AutomatonTransition;

public class PathExpressionTransition extends AutomatonTransition<PathExpressionState, PathExpressionTransition> {

	private AXIS axis;
	private Region regionRestriction; // combination of predicate and NodeTest
	private PathExpressionTransitionMode transitionMode;

	public PathExpressionTransition(PathExpressionState targetState, AXIS axis, Region regionRestriction) {
		super(targetState);
		this.axis = axis;
		this.regionRestriction = regionRestriction;
		if (regionRestriction != null) {
			this.transitionMode = PathExpressionTransitionMode.RESTRICTIVE;
		} else {

			this.transitionMode = PathExpressionTransitionMode.CONSTRAINTLESS;
		}
	}

	public Region makeTransition(Region inputRegion, boolean inPredicate) {
		Region movedRegion = null;
		if (inPredicate) {
			Region reducedRegion = inputRegion;
			if (this.transitionMode == PathExpressionTransitionMode.RESTRICTIVE) {
				reducedRegion = RegionFactory.INSTANCE.copyRegion(inputRegion); //copy to prevent side effects
				reducedRegion.logicalAnd(this.regionRestriction);
			}
			movedRegion = reducedRegion.moveRegion(axis);
		} else {
			movedRegion = inputRegion.moveRegion(axis);
			if (this.transitionMode == PathExpressionTransitionMode.RESTRICTIVE) {
				movedRegion.logicalAnd(this.regionRestriction);
			}
		}
		return movedRegion;
	}

	public enum PathExpressionTransitionMode {
		RESTRICTIVE, CONSTRAINTLESS,
	}

	public AXIS getAxis() {
		return axis;
	}

	public PathExpressionTransitionMode getTransitionMode() {
		return transitionMode;
	}

	public Region getRegionRestriction() {
		return this.regionRestriction;
	}
}

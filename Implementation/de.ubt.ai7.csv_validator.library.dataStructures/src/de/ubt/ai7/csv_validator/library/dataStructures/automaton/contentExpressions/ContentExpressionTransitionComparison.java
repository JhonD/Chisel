package de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions;

import de.ubt.ai7.csv_validator.sculpt.Comparator;
import de.ubt.ai7.csv_validator.sculpt.PathExpression;
import de.ubt.ai7.csv_validator.sculpt.Type;

public class ContentExpressionTransitionComparison extends ContentExpressionTransitionToken {

	protected Type compType;
	protected int[] valueTreePath;
	protected Comparator comp;
	protected Object value;
	protected PathExpression path;
	protected boolean r2l;

	public ContentExpressionTransitionComparison(final ContentExpressionState targetState, final Type type, final Type compType,
			final int[] left, final Comparator comp, final Object value, final PathExpression path, final boolean r2l) {
		super(targetState, type);
		this.transitionMode = path == null ? ContentExpressionTransitionMode.COMPARISON_CONST : ContentExpressionTransitionMode.COMPARISON_PATH;
		this.compType = compType;
		this.valueTreePath = left;
		this.comp = comp;
		this.value = value;
		this.path = path;
		this.r2l = r2l;
	}

	public int[] getValueTreePath() {
		return valueTreePath;
	}

	public Comparator getComp() {
		return comp;
	}

	public Object getValue() {
		return value;
	}

	public Type getType() {
		return (Type) this.getToken();
	}

	public Type getCompType() {
		return compType;
	}

	public boolean getR2l() {
		return r2l;
	}

	public PathExpression getPath() {
		return path;
	}

}

package de.ubt.ai7.csv_validator.library.dataStructures;

import de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions.ContentExpressionState;
import de.ubt.ai7.csv_validator.sculpt.TLVariable;
import de.ubt.ai7.csv_validator.sculpt.Token;

public final class EvaluationHistoryRecord {
	public final int iteration;
	public final TLVariable variable;
	public final int coordinate; //mapped like in the bitsets
	public final Token token;
	public final ContentExpressionState prevState;

	public EvaluationHistoryRecord(final int coordinate, final Token token, final TLVariable variable, final int iteration, final ContentExpressionState prevState) {
		super();
		this.iteration = iteration;
		this.variable = variable;
		this.coordinate = coordinate;
		this.token = token;
		this.prevState = prevState;
	}

	@Override
	public String toString(){
		final StringBuilder s = new StringBuilder("(");
		s.append(coordinate);
		if(variable != null){
			s.append(", ");
			s.append(variable.toString());
		}
		s.append(", ");
		s.append(iteration);
		s.append(')');
		return s.toString();
	}
}

package de.ubt.ai7.csv_validator.library.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedToken;
import de.ubt.ai7.csv_validator.library.dataStructures.EvaluationHistory;
import de.ubt.ai7.csv_validator.library.dataStructures.EvaluationHistoryRecord;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.Automaton;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions.ContentExpressionState;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions.ContentExpressionTransition;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions.ContentExpressionTransition.ContentExpressionTransitionMode;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions.ContentExpressionTransitionToken;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions.ContentExpressionTransitionVariableBinding;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions.TLContentExpressionState;
import de.ubt.ai7.csv_validator.library.exceptions.CsvValidationException;
import de.ubt.ai7.csv_validator.library.exceptions.SchemaValidationException;
import de.ubt.ai7.csv_validator.library.util.Converter;
import de.ubt.ai7.csv_validator.library.util.Definitions;
import de.ubt.ai7.csv_validator.library.util.ParsingUtil;
import de.ubt.ai7.csv_validator.sculpt.AbstractToken;
import de.ubt.ai7.csv_validator.sculpt.ContentExpression;
import de.ubt.ai7.csv_validator.sculpt.TLContentExpressionList;
import de.ubt.ai7.csv_validator.sculpt.TLVariable;
import de.ubt.ai7.csv_validator.sculpt.Token;
import de.ubt.ai7.csv_validator.util.Coordinate;

/**
 *
 * Refines the creation and running of content expression automatons by tracking one accepted word
 *
 */
public class TLContentExpressionAutomatonHandler extends ContentExpressionAutomatonHandler {
	// meta state information for construction
	protected CachedTLVariableBinding currentVariable;

	public TLContentExpressionAutomatonHandler(final CacheImpl cache, final SculptInterpreter interpreter) {
		super(cache, interpreter);
	}

	public Automaton<ContentExpressionState, ContentExpressionTransition> createAutomaton(
			final TLContentExpressionList contExprList, final Set<AbstractToken> occurringTokens, final EList<CachedTLVariableBinding> eList)
					throws SchemaValidationException {

		final ListIterator<ContentExpression> exprIter = contExprList.getList().listIterator();
		final ListIterator<CachedTLVariableBinding> varIter = eList.listIterator();

		ContentExpressionState startState = null, targetState = null;
		while (exprIter.hasNext() && varIter.hasNext()) {
			currentVariable = varIter.next();

			final Automaton<ContentExpressionState, ContentExpressionTransition> automaton = createAutomaton(exprIter.next(),
					occurringTokens);

			if (startState == null) {
				startState = automaton.getStartState();
				targetState = automaton.getTargetState();
			} else {
				targetState.addEpsilonTransition(automaton.getStartState());
				targetState = automaton.getTargetState();
			}
		}

		return new Automaton<ContentExpressionState, ContentExpressionTransition>(startState, targetState);
	}

	@Override
	protected ContentExpressionTransition wrap(final ContentExpressionTransition transition) throws SchemaValidationException {
		if (currentVariable == null) {
			return transition;
		}

		if(transition instanceof ContentExpressionTransitionToken) {
			final Token token = ((ContentExpressionTransitionToken) transition).getToken();
			final CachedToken cachedToken = (CachedToken) cache.getRef(token);
			currentVariable.getPossibleTokens().add(cachedToken);
			currentVariable.getContains().add(cachedToken);
		}
		return new ContentExpressionTransitionVariableBinding(transition, (TLVariable) currentVariable.getSchemaElement());
	}

	@Override
	protected ContentExpressionState createState(final List<ContentExpressionTransition> transitions,
			final Set<ContentExpressionState> epsilonTransitions) {
		return new TLContentExpressionState(transitions, epsilonTransitions);
	}

	public Automaton<ContentExpressionState, ContentExpressionTransition> addIncStar(
			final Automaton<ContentExpressionState, ContentExpressionTransition> innerAutomaton,
			final Set<AbstractToken> occurringTokens) {

		final ContentExpressionState startState = new ContentExpressionState(null, null);
		final TLContentExpressionState targetState = new TLContentExpressionState(null, null);

		final ContentExpressionState innerStart = innerAutomaton.getStartState();

		startState.addEpsilonTransition(innerStart);
		startState.addEpsilonTransition(targetState);
		if (innerStart instanceof TLContentExpressionState) {
			((TLContentExpressionState) innerAutomaton.getTargetState())
			.addEpsilonTransitionWithIterationIncrement(innerAutomaton.getStartState());
		} else {
			return null;
		}
		innerAutomaton.getTargetState().addEpsilonTransition(targetState);

		return new Automaton<ContentExpressionState, ContentExpressionTransition>(startState, targetState);
	}

	protected void computeEpsilonClosure(final Set<ContentExpressionState> states, final Map<ContentExpressionState, EvaluationHistory> runs) {
		final Set<ContentExpressionState> tempStates = new HashSet<ContentExpressionState>(states); // used to avoid current modification exception
		for (final ContentExpressionState state : tempStates) {
			computeEpsilonClosure(state, states, runs);
		}
	}

	protected void computeEpsilonClosure(final ContentExpressionState currentState, final Set<ContentExpressionState> states,
			final Map<ContentExpressionState, EvaluationHistory> runs) {

		final EvaluationHistory currentHistory = runs.get(currentState);
		final int currentIndex = currentHistory.size() - 1;

		for (final ContentExpressionState state : currentState.getEpsilonTransitions()) {
			EvaluationHistory targetHistory = runs.get(state);
			if(targetHistory == null){
				targetHistory = new EvaluationHistory(Math.max(currentIndex, currentHistory.size()));
				runs.put(state, targetHistory);
			}

			if (targetHistory.get(currentIndex) == null || targetHistory.getIteration() > currentHistory.getIteration()) {
				if(currentIndex >= 0) {
					targetHistory.set(currentIndex, currentHistory.getLast());
				}
				states.add(state);
				computeEpsilonClosure(state, states, runs);
			}
		}
		if (currentState instanceof TLContentExpressionState) {
			for (final ContentExpressionState state : ((TLContentExpressionState) currentState)
					.getEpsilonTransitionsWithIterationIncrement()) {
				EvaluationHistory targetHistory = runs.get(state);
				if(targetHistory == null){
					targetHistory = new EvaluationHistory(Math.max(currentIndex, currentHistory.size()));
					runs.put(state, targetHistory);
				}

				if (targetHistory.get(currentIndex) == null || targetHistory.getIteration() > currentHistory.getIteration()) {
					targetHistory.set(currentIndex, currentHistory.getLast());
					targetHistory.nextIteration();
					states.add(state);
					computeEpsilonClosure(state, states, runs);
				}
			}
		}
	}

	/**
	 *
	 * @param automaton automaton to be run
	 * @param concernedCoordinates coordinates to test
	 * @return sequence of tokens accepted by the automaton and matching the sequence of coordinates produced by concerendCoordinates
	 * @throws CsvValidationException
	 */
	protected EvaluationHistory evaluateTrackHistory(
			final Automaton<ContentExpressionState, ContentExpressionTransition> automaton,
			final Iterator<Coordinate> concernedCoordinates) throws CsvValidationException {
		boolean emptyRegion = true;
		Set<ContentExpressionState> nextStates;
		Coordinate errorCoordinate = null;

		final Map<ContentExpressionState, EvaluationHistory> runs = new HashMap<ContentExpressionState, EvaluationHistory>();
		Set<ContentExpressionState> currentStates = new HashSet<ContentExpressionState>();
		currentStates.add(automaton.getStartState());
		runs.put(automaton.getStartState(), new EvaluationHistory());
		computeEpsilonClosure(currentStates, runs);

		int index = 0;
		while (concernedCoordinates.hasNext()) {
			final Coordinate coordinate = concernedCoordinates.next();
			emptyRegion = false;
			nextStates = new HashSet<ContentExpressionState>();

			for (final ContentExpressionState state : currentStates) {
				final EvaluationHistory currentHistory = runs.get(state);
				final int currentIteration = currentHistory.getIteration();
				for (ContentExpressionTransition trans : state.getTransitions()) {
					EvaluationHistory targetHistory = runs.get(trans.getTargetState());

					if(targetHistory == null){
						targetHistory = new EvaluationHistory(Math.max(index + 1, currentHistory.size()));
						runs.put(trans.getTargetState(), targetHistory);
					}


					if (targetHistory.get(index) != null && targetHistory.getIteration() <= currentIteration) {
						continue;
					}

					TLVariable variable = null;
					Token token = null;

					if (trans.getTransitionMode() == ContentExpressionTransitionMode.VARIABLE_BINDING) {
						variable = ((ContentExpressionTransitionVariableBinding) trans).getVariable();
						trans = ((ContentExpressionTransitionVariableBinding) trans).getTransition();
					}

					if (trans instanceof ContentExpressionTransitionToken) {
						token = ((ContentExpressionTransitionToken) trans).getToken();
					}

					if (performTransition(trans, coordinate)) {
						nextStates.add(trans.getTargetState());

						targetHistory.set(index, new EvaluationHistoryRecord(Definitions.from(coordinate, cache.getRowNumber()), token, variable, currentIteration, state));
					}

				}
			}

			if (nextStates.isEmpty()) {// Automaton run into Error state!
				errorCoordinate = coordinate;
				break;
			}
			computeEpsilonClosure(nextStates, runs);
			currentStates = nextStates;
			index++;
		}

		if (emptyRegion) {
			return new EvaluationHistory();
		} else if (errorCoordinate != null) {
			if (cache.getCsvEntry(errorCoordinate) == null) { // empty cell
				// (bottom
				// symbol)
				// check if we can reach a final state
				computeEpsilonClosure(currentStates, runs);
				if(currentStates.contains(automaton.getTargetState())) {
					return generateWord(automaton.getTargetState(), runs);
				}
			}
			throw new CsvValidationException(Converter.coordinateToRegion(errorCoordinate, cache.getRowNumber(), cache.getRowNumber()));
		} else if (!currentStates.contains(automaton.getTargetState())) {
			throw new CsvValidationException(Converter.coordinateToRegion(ParsingUtil.DEFAULT_ERROR_COORDINATE,
					cache.getRowNumber(), cache.getRowNumber()));
		}

		computeEpsilonClosure(currentStates, runs);
		return generateWord(automaton.getTargetState(), runs);
	}

	protected EvaluationHistory generateWord(final ContentExpressionState acceptingState,
			final Map<ContentExpressionState, EvaluationHistory> runs) {

		EvaluationHistory currentHistory = runs.get(acceptingState);
		final EvaluationHistory resultHistory = new EvaluationHistory(currentHistory.size());

		int i = currentHistory.size() - 1;
		do{
			final EvaluationHistoryRecord currentRecord = currentHistory.get(i);
			resultHistory.set(i, currentRecord);
			currentHistory = runs.get(currentRecord.prevState);
			i--;
		} while(i >= 0);
		return resultHistory;
	}
}

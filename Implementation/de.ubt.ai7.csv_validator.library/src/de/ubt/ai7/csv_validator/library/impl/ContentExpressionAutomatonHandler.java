package de.ubt.ai7.csv_validator.library.impl;

import static de.ubt.ai7.csv_validator.util.SaveIterables.emptyIfNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import de.ubt.ai7.csv_validator.library.dataStructures.Region;
import de.ubt.ai7.csv_validator.library.dataStructures.RegionFactory;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.Automaton;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions.ContentExpressionState;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions.ContentExpressionTransition;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions.ContentExpressionTransition.ContentExpressionTransitionMode;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions.ContentExpressionTransitionComparison;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions.ContentExpressionTransitionString;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions.ContentExpressionTransitionToken;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions.ContentExpressionTransitionVariableBinding;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.pathExpressions.PathExpressionState;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.pathExpressions.PathExpressionTransition;
import de.ubt.ai7.csv_validator.library.exceptions.CsvValidationException;
import de.ubt.ai7.csv_validator.library.exceptions.SchemaValidationException;
import de.ubt.ai7.csv_validator.library.util.Converter;
import de.ubt.ai7.csv_validator.library.util.ParsingUtil;
import de.ubt.ai7.csv_validator.sculpt.AbstractToken;
import de.ubt.ai7.csv_validator.sculpt.Comparator;
import de.ubt.ai7.csv_validator.sculpt.ContentExpression;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionANY;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparisonR2L;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionEMPTY;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionList;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionOption;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionOr;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionPlus;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionSOMETHING;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionStar;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionString;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionToken;
import de.ubt.ai7.csv_validator.sculpt.PathExpression;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.Token;
import de.ubt.ai7.csv_validator.sculpt.Type;
import de.ubt.ai7.csv_validator.sculpt.ValidationMode;
import de.ubt.ai7.csv_validator.util.Coordinate;
import de.ubt.ai7.csv_validator.util.Pair;

/**
 *
 * Creates and runs the automaton to evaluate constraints.
 * When creating states and transitions one can decorate them by redefining the corresponding create*() and wrap() methods.
 *
 */
public class ContentExpressionAutomatonHandler {
	protected CacheImpl cache;
	protected SculptInterpreter interpreter;

	public ContentExpressionAutomatonHandler(final CacheImpl cache, final SculptInterpreter interpreter) {
		this.cache = cache;
		this.interpreter = interpreter;
	}

	public Automaton<ContentExpressionState, ContentExpressionTransition> createAutomaton(final ContentExpression contExpr,
			final Set<AbstractToken> occurringTokens) throws SchemaValidationException {
		ContentExpressionState startState = null, targetState = null;
		if (contExpr instanceof ContentExpressionOr) {
			final ContentExpressionOr contExprOr = (ContentExpressionOr) contExpr;
			// recursive calls
			final Automaton<ContentExpressionState, ContentExpressionTransition> automatonLeft = createAutomaton(
					contExprOr.getLeft(), occurringTokens);

			final Automaton<ContentExpressionState, ContentExpressionTransition> automatonRight = createAutomaton(
					contExprOr.getRight(), occurringTokens);
			if (automatonLeft == null || automatonRight == null) {
				return null;
			}

			targetState = createState(null, null);
			final Set<ContentExpressionState> startEpsTrans = new HashSet<ContentExpressionState>(2);
			startEpsTrans.add(automatonLeft.getStartState());
			startEpsTrans.add(automatonRight.getStartState());
			startState = createState(null, startEpsTrans);
			automatonLeft.getTargetState().addEpsilonTransition(targetState);
			automatonRight.getTargetState().addEpsilonTransition(targetState);

		} else if (contExpr instanceof ContentExpressionList) {
			final ContentExpressionList contExprList = (ContentExpressionList) contExpr;

			final Automaton<ContentExpressionState, ContentExpressionTransition> automatonFirst = createAutomaton(
					contExprList.getFirst(), occurringTokens);

			final Automaton<ContentExpressionState, ContentExpressionTransition> automatonRest = createAutomaton(
					contExprList.getRest(), occurringTokens);
			if (automatonFirst == null || automatonRest == null) {
				return null;
			}

			automatonFirst.getTargetState().addEpsilonTransition(automatonRest.getStartState());
			startState = automatonFirst.getStartState();
			targetState = automatonRest.getTargetState();
		} else if (contExpr instanceof ContentExpressionStar) {
			final ContentExpressionStar contExprStar = (ContentExpressionStar) contExpr;

			final Automaton<ContentExpressionState, ContentExpressionTransition> innerAutomaton = createAutomaton(
					contExprStar.getElement(), occurringTokens);
			if (innerAutomaton == null) {
				return null;
			}

			startState = createState(null, null);
			targetState = createState(null, null);
			startState.addEpsilonTransition(innerAutomaton.getStartState());
			startState.addEpsilonTransition(targetState);
			innerAutomaton.getTargetState().addEpsilonTransition(innerAutomaton.getStartState());
			innerAutomaton.getTargetState().addEpsilonTransition(targetState);
		} else if (contExpr instanceof ContentExpressionPlus) {
			final ContentExpressionPlus contExprPlus = (ContentExpressionPlus) contExpr;

			final Automaton<ContentExpressionState, ContentExpressionTransition> innerAutomaton = createAutomaton(
					contExprPlus.getElement(), occurringTokens);
			if (innerAutomaton == null) {
				return null;
			}

			startState = createState(null, null);
			targetState = createState(null, null);
			startState.addEpsilonTransition(innerAutomaton.getStartState());
			innerAutomaton.getTargetState().addEpsilonTransition(innerAutomaton.getStartState());
			innerAutomaton.getTargetState().addEpsilonTransition(targetState);
		} else if (contExpr instanceof ContentExpressionOption) {
			final ContentExpressionOption contExprOption = (ContentExpressionOption) contExpr;

			final Automaton<ContentExpressionState, ContentExpressionTransition> innerAutomaton = createAutomaton(
					contExprOption.getElement(), occurringTokens);
			if (innerAutomaton == null) {
				return null;
			}

			startState = createState(null, null);
			targetState = createState(null, null);
			startState.addEpsilonTransition(innerAutomaton.getStartState());
			startState.addEpsilonTransition(targetState);
			innerAutomaton.getTargetState().addEpsilonTransition(targetState);

		} else if (contExpr instanceof ContentExpressionToken) {
			final ContentExpressionToken contExprToken = (ContentExpressionToken) contExpr;

			occurringTokens.add(contExprToken.getToken());

			targetState = createState(null, null);
			final ContentExpressionTransition trans = createTransition(targetState, contExprToken.getToken());
			final List<ContentExpressionTransition> transitionList = new ArrayList<ContentExpressionTransition>();
			transitionList.add(trans);
			startState = createState(transitionList, null);
		} else if (contExpr instanceof ContentExpressionComparison) {
			final ContentExpressionComparison contExprComp = (ContentExpressionComparison) contExpr;
			final Type type = contExprComp.getType();
			occurringTokens.add(type);
			final PathExpression path = contExprComp.getPath();

			final Pair<int[], Type> valueTreePath = ParsingUtil.computeValueTreePath(type,
					contExprComp.getTypeSpecifier());

			Object value = null;
			try{
				if (path == null) {
					value = interpreter.checkComparisonValue(valueTreePath.right, contExprComp.getComp(),
							contExprComp.getValue());
					if (value == null) {
						return null;
					}
				} else {
					interpreter.validate(path, occurringTokens);
				}
			} catch(final IllegalArgumentException e){
				throw new SchemaValidationException(e.getLocalizedMessage(), contExpr, SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__VALUE);
			} catch (final Exception e) {
				throw new SchemaValidationException(e.getLocalizedMessage(), contExpr, SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__COMP);
			}

			targetState = createState(null, null);
			final ContentExpressionTransition trans = createTransition(targetState, type, valueTreePath.right,
					valueTreePath.left, contExprComp.getComp(), value, path,
					contExpr instanceof ContentExpressionComparisonR2L);
			final List<ContentExpressionTransition> transitionList = new ArrayList<ContentExpressionTransition>();
			transitionList.add(trans);
			startState = createState(transitionList, null);
		} else if (contExpr instanceof ContentExpressionString) {
			final ContentExpressionString contExprString = (ContentExpressionString) contExpr;
			targetState = createState(null, null);
			final String contStr = contExprString.getString();

			final ContentExpressionTransition trans = createTransition(targetState, contStr);
			final List<ContentExpressionTransition> transitionList = new ArrayList<ContentExpressionTransition>();
			transitionList.add(trans);
			startState = createState(transitionList, null);
		} else if (contExpr instanceof ContentExpressionANY) {
			targetState = createState(null, null);
			final ContentExpressionTransitionMode transMode = ContentExpressionTransitionMode.ANY;
			final ContentExpressionTransition trans = createTransition(targetState, transMode);
			final List<ContentExpressionTransition> transitionList = new ArrayList<ContentExpressionTransition>();
			transitionList.add(trans);
			startState = createState(transitionList, null);
		} else if (contExpr instanceof ContentExpressionEMPTY) {
			targetState = createState(null, null);
			final ContentExpressionTransitionMode transMode = ContentExpressionTransitionMode.EMPTY;
			final ContentExpressionTransition trans = createTransition(targetState, transMode);
			final List<ContentExpressionTransition> transitionList = new ArrayList<ContentExpressionTransition>();
			transitionList.add(trans);
			startState = createState(transitionList, null);
		} else if (contExpr instanceof ContentExpressionSOMETHING) {
			targetState = createState(null, null);
			final ContentExpressionTransitionMode transMode = ContentExpressionTransitionMode.SOMETHING;
			final ContentExpressionTransition trans = createTransition(targetState, transMode);
			final List<ContentExpressionTransition> transitionList = new ArrayList<ContentExpressionTransition>();
			transitionList.add(trans);
			startState = createState(transitionList, null);
		}
		return new Automaton<ContentExpressionState, ContentExpressionTransition>(startState, targetState);

	}



	/**
	 *
	 * augment transition with additional information in subclass
	 * @throws SchemaValidationException
	 */
	protected ContentExpressionTransition wrap(final ContentExpressionTransition trans) throws SchemaValidationException {
		return trans;
	}

	private ContentExpressionTransition createTransition(final ContentExpressionState targetState, final Type type, final Type compType,
			final int[] left, final Comparator comp, final Object value, final PathExpression path, final boolean r2l) throws SchemaValidationException {
		return wrap(new ContentExpressionTransitionComparison(targetState, type, compType, left, comp, value,
				path, r2l));
	}

	protected ContentExpressionTransition createTransition(final ContentExpressionState targetState,
			final ContentExpressionTransitionMode transitionMode) throws SchemaValidationException {
		return wrap(new ContentExpressionTransition(targetState, transitionMode));
	}

	protected ContentExpressionTransition createTransition(final ContentExpressionState targetState, final String string) throws SchemaValidationException {
		return wrap(new ContentExpressionTransitionString(targetState, string));
	}

	protected ContentExpressionTransition createTransition(final ContentExpressionState targetState, final Token token) throws SchemaValidationException {
		return wrap(new ContentExpressionTransitionToken(targetState, token));
	}

	protected ContentExpressionState createState(final List<ContentExpressionTransition> transitions,
			final Set<ContentExpressionState> epsilonTransitions) {
		return new ContentExpressionState(transitions, epsilonTransitions);
	}

	public void evaluate(final Automaton<ContentExpressionState, ContentExpressionTransition> automaton,
			final ValidationMode validationMode, final Region selectedRegion) throws CsvValidationException {
		if (selectedRegion == null || selectedRegion.isEmpty()) {
			return; // every constraints holds for an empty region
		}


		if (validationMode.equals(ValidationMode.COMPLETE)) {
			evaluate(
					automaton, selectedRegion.sortedIteration().iterator());
		} else if (validationMode.equals(ValidationMode.ROW_BY_ROW)) {
			// store start States
			for (final Iterable<Coordinate> row : selectedRegion.rowByRowIteration()) {
				// copy currentStates

				evaluate(automaton, row.iterator());

				// on exception: we tested all non-null cells in the region and ended in a final state
			}
		} else if (validationMode.equals(ValidationMode.COLUMN_BY_COLUMN)) {
			// store start States
			for (final Iterable<Coordinate> column : selectedRegion.columnByColumnIteration()) {
				// copy currentStates
				final Iterator<Coordinate> columnIter = column.iterator();

				evaluate(automaton, columnIter);

				// we have to check that the remaining cells are bottom symbols
				final Region errorRegion = RegionFactory.INSTANCE.newRegion(cache.getRowNumber(), cache.getColumnNumber(), false);
				while(columnIter.hasNext()){
					final Coordinate coord = columnIter.next();
					if(cache.getCsvEntry(coord) != null) {
						errorRegion.addCoordinateToRegion(coord);
					}
				}
				if(!errorRegion.isEmpty()) {
					throw new CsvValidationException(errorRegion);
				}
			}
		}
	}



	/**
	 *
	 * @param automaton
	 * @param concernedCoordinates
	 *            in-out parameter
	 * @param currentStates
	 * @return
	 * @throws CsvValidationException
	 */
	protected void evaluate(
			final Automaton<ContentExpressionState, ContentExpressionTransition> automaton,
			final Iterator<Coordinate> concernedCoordinates) throws CsvValidationException {
		boolean emptyRegion = true;
		Set<ContentExpressionState> nextStates;
		Coordinate errorCoordinate = null;

		Set<ContentExpressionState> currentStates = new HashSet<ContentExpressionState>();
		currentStates.add(automaton.getStartState());
		automaton.computeEpsilonClosure(currentStates);

		while (concernedCoordinates.hasNext()) {
			final Coordinate coordinate = concernedCoordinates.next();
			emptyRegion = false;
			nextStates = new HashSet<ContentExpressionState>();

			for (final ContentExpressionState state : currentStates) {

				for (final ContentExpressionTransition trans : state.getTransitions()) {
					if (nextStates.contains(trans.getTargetState())) {
						continue;
					}
					if (performTransition(trans, coordinate)) {
						nextStates.add(trans.getTargetState());
					}

				}
			}

			if (nextStates.isEmpty()) {// Automaton run into Error state!
				errorCoordinate = coordinate;
				break;
			}
			automaton.computeEpsilonClosure(nextStates);
			currentStates = nextStates;
		}

		if (errorCoordinate != null) {
			if (cache.getCsvEntry(errorCoordinate) == null) { // empty cell
				// (bottom
				// symbol)
				// check if we can reach a final state
				automaton.computeEpsilonClosure(currentStates);
				if (currentStates.contains(automaton.getTargetState())) {
					return;
				}
			}
			throw new CsvValidationException(Converter.coordinateToRegion(errorCoordinate, cache.getRowNumber(), cache.getRowNumber()));
		} else if (!emptyRegion && !currentStates.contains(automaton.getTargetState())) {
			throw new CsvValidationException(Converter.coordinateToRegion(ParsingUtil.DEFAULT_ERROR_COORDINATE, cache.getRowNumber(), cache.getRowNumber()));
		}
	}

	protected boolean performTransition(final ContentExpressionTransition trans, final Coordinate coordinate) throws CsvValidationException {
		final String coordString = cache.getCsvEntry(coordinate);
		switch (trans.getTransitionMode()) {
		case COMPARISON_CONST:
			ContentExpressionTransitionComparison compTrans = (ContentExpressionTransitionComparison) trans;
			if (cache.matches(compTrans.getType(), coordinate)) {
				final Object lhs = ParsingUtil.extract(cache.getValue(coordinate, compTrans.getType()),
						compTrans.getValueTreePath());
				final Object rhs = compTrans.getValue();
				boolean comparison;

				if (compTrans.getR2l()) {
					comparison = ParsingUtil.compare(rhs, lhs, compTrans.getComp());
				} else {
					comparison = ParsingUtil.compare(lhs, rhs, compTrans.getComp());
				}

				return comparison;
			}
			break;
		case COMPARISON_PATH:
			compTrans = (ContentExpressionTransitionComparison) trans;
			if (cache.matches(compTrans.getType(), coordinate)) {

				final Type type = compTrans.getCompType();
				final Object lhs = ParsingUtil.extract(cache.getValue(coordinate, compTrans.getType()),
						compTrans.getValueTreePath());

				// cannot cache automaton since its states store regions
				final Automaton<PathExpressionState, PathExpressionTransition> automaton = interpreter
						.createAutomaton(compTrans.getPath(), false);

				final Region rhRegion = interpreter.evaluate(automaton,
						Converter.coordinateToRegion(coordinate, cache.getRowNumber(), cache.getRowNumber()), false);
				boolean comparison = true;

				for (final Coordinate rhCoord : emptyIfNull(rhRegion.unsortedIteration())) {
					comparison = cache.matches(type, rhCoord);
					if (!comparison) {
						break;
					}

					final Object rhs = cache.getValue(rhCoord, type);

					if (compTrans.getR2l()) {
						comparison = comparison && ParsingUtil.compare(rhs, lhs, compTrans.getComp());
					} else {
						comparison = comparison && ParsingUtil.compare(lhs, rhs, compTrans.getComp());
					}

					if (!comparison) {
						break;
					}
				}
				return comparison;
			}
			break;
		case TOKEN:
			return cache.matches(((ContentExpressionTransitionToken) trans).getToken(), coordinate);
		case STRING:
			return ((ContentExpressionTransitionString) trans).getString().equals(coordString);
		case EMPTY:
			return coordString != null && coordString.equals("");
		case ANY:
			return coordString != null;
		case SOMETHING:
			return coordString != null && !coordString.equals("");
		case VARIABLE_BINDING:
			return performTransition(((ContentExpressionTransitionVariableBinding) trans).getTransition(), coordinate);
		default:
			break;
		}

		return false;
	}
}

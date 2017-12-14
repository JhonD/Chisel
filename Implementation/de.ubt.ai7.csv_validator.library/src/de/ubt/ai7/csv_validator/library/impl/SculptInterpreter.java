package de.ubt.ai7.csv_validator.library.impl;

import static de.ubt.ai7.csv_validator.util.SaveIterables.emptyIfNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedAtomicType;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedConstraint;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedContentConstraint;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedForeignKeyConstraint;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedListType;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedNodeExpression;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedPrimaryKeyConstraint;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedRegionToken;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLIf;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLLoop;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutput;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutputVariable;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLPrimitive;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLStatement;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLTypeInspector;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedToken;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedType;
import de.ubt.ai7.csv_validator.caches.dataStructures.NamedElement;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage;
import de.ubt.ai7.csv_validator.library.dataStructures.EvaluationHistory;
import de.ubt.ai7.csv_validator.library.dataStructures.EvaluationHistoryRecord;
import de.ubt.ai7.csv_validator.library.dataStructures.Region;
import de.ubt.ai7.csv_validator.library.dataStructures.Region.AXIS;
import de.ubt.ai7.csv_validator.library.dataStructures.RegionFactory;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.Automaton;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions.ContentExpressionState;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions.ContentExpressionTransition;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.pathExpressions.PathExpressionState;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.pathExpressions.PathExpressionTransition;
import de.ubt.ai7.csv_validator.library.exceptions.CsvValidationException;
import de.ubt.ai7.csv_validator.library.exceptions.SchemaValidationException;
import de.ubt.ai7.csv_validator.library.exceptions.ValidationException;
import de.ubt.ai7.csv_validator.library.util.Converter;
import de.ubt.ai7.csv_validator.library.util.Definitions;
import de.ubt.ai7.csv_validator.library.util.ParsingUtil;
import de.ubt.ai7.csv_validator.library.util.TabularCsv;
import de.ubt.ai7.csv_validator.sculpt.AbstractToken;
import de.ubt.ai7.csv_validator.sculpt.AtomicType;
import de.ubt.ai7.csv_validator.sculpt.Comparator;
import de.ubt.ai7.csv_validator.sculpt.CompoundType;
import de.ubt.ai7.csv_validator.sculpt.ContentConstraint;
import de.ubt.ai7.csv_validator.sculpt.ListType;
import de.ubt.ai7.csv_validator.sculpt.NodeExpression;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionAnd;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparisonR2L;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionComplete;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionCoordinate;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionNot;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionOr;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionPath;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowCol;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColCoordinate;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColLast;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColString;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColToken;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionToken;
import de.ubt.ai7.csv_validator.sculpt.PathExpression;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionList;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionOption;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionOr;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionPlus;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionPredicate;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionStar;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionStep;
import de.ubt.ai7.csv_validator.sculpt.RegionToken;
import de.ubt.ai7.csv_validator.sculpt.RelationConstraint;
import de.ubt.ai7.csv_validator.sculpt.RowCol;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.TLBoolExpr;
import de.ubt.ai7.csv_validator.sculpt.TLBoolExprEmpty;
import de.ubt.ai7.csv_validator.sculpt.TLBoolExprNot;
import de.ubt.ai7.csv_validator.sculpt.TLIf;
import de.ubt.ai7.csv_validator.sculpt.TLLoop;
import de.ubt.ai7.csv_validator.sculpt.TLVariable;
import de.ubt.ai7.csv_validator.sculpt.Type;
import de.ubt.ai7.csv_validator.sculpt.TypeSpecifier;
import de.ubt.ai7.csv_validator.sculpt.ValidationMode;
import de.ubt.ai7.csv_validator.util.Coordinate;
import de.ubt.ai7.csv_validator.util.Pair;

public class SculptInterpreter {

	private final CacheImpl cache;
	private final ContentExpressionAutomatonHandler ceHandler;
	private final TLContentExpressionAutomatonHandler tlceHandler;

	public SculptInterpreter(final CacheImpl cache) {
		this.cache = cache;
		this.ceHandler = new ContentExpressionAutomatonHandler(cache, this);
		this.tlceHandler = new TLContentExpressionAutomatonHandler(cache, this);
	}


	Object checkComparisonValue(final Type type, final Comparator comp, final String compVal) throws Exception {

		final List<Object> valueTree = ParsingUtil.parse(compVal, (CachedType) cache.getRef(type));

		if (comp == Comparator.EQ || comp == Comparator.NEQ || type instanceof CompoundType || type instanceof ListType
				|| valueTree.get(1) instanceof Comparable<?>) {
			return valueTree;
		} else {
			throw new Exception("Values of type " + type.getName() + " are not comparable");
		}

	}

	/*
	 * methods for evaluating regions, tokens, and types
	 */

	public boolean computeAndCacheMatch(final Coordinate coord, final CachedToken cachedToken) throws CsvValidationException {
		final String csvEntry = cache.getCsvEntry(coord);
		final int definition = Definitions.from(coord, cache.getRowNumber());
		cachedToken.getUntestedRegion().clear(definition);

		if (csvEntry == null || csvEntry.isEmpty()) {
			return false;
		}

		boolean matches = false;

		if (cachedToken instanceof CachedType) {
			Object value = null;

			try {
				value = ParsingUtil.parse(csvEntry, (CachedType) cachedToken);
			} catch (final IllegalArgumentException e) {
				return false;
			}

			cache.put(coord, (Type) cachedToken.getSchemaElement(), value);
			matches = true;

		} else {
			final Matcher m = cachedToken.getPattern().matcher(csvEntry);
			matches = m.matches();
		}

		if (matches) {
			cachedToken.getRegion().set(definition);
		}

		return matches;
	}

	public Region computeAndCacheRegion(final NamedElement elem) throws CsvValidationException {
		final int columnNumber = cache.getColumnNumber();
		Region region = Definitions.toRegion(elem.getRegion(), cache.getRowNumber(), columnNumber);

		if (elem instanceof CachedToken) {

			final BitSet untested = elem.getUntestedRegion();
			for (int i = untested.nextSetBit(0); i >= 0; i = untested.nextSetBit(i + 1)) {
				final Coordinate coord = Definitions.toCoordinate(i, cache.getRowNumber());
				if (computeAndCacheMatch(coord, (CachedToken) elem)) {
					region.addCoordinateToRegion(coord);
				}
			}

		} else if (elem instanceof CachedRegionToken) {
			region = computeAndCacheRegion(((RegionToken) elem.getSchemaElement()).getRegion());
			Converter.addCoordinates(elem.getRegion(), region, cache.getRowNumber());

		}
		elem.getUntestedRegion().clear();
		return region;
	}

	public Region computeAndCacheRegion(final NodeExpression nodeExpr) throws CsvValidationException {
		final Region r = evaluate(nodeExpr);
		CachedNodeExpression cachedNodeExpr;
		try {
			cachedNodeExpr = cache.getRef(nodeExpr);
		} catch (final SchemaValidationException e) {
			throw new CsvValidationException(nodeExpr);
		}
		Converter.addCoordinates(cachedNodeExpr.getRegion(), r, cache.getRowNumber());
		cachedNodeExpr.getUntestedRegion().clear();
		return r;
	}

	/*
	 * methods for evaluating path expressions
	 */

	Automaton<PathExpressionState, PathExpressionTransition> createAutomaton(final PathExpression pathExpr,
			final boolean inPredicate) throws CsvValidationException {
		PathExpressionState targetState = new PathExpressionState(null, null,
				RegionFactory.INSTANCE.newRegion(cache.getRowNumber(), cache.getColumnNumber(), false));
		PathExpressionState startState = new PathExpressionState(null, null,
				RegionFactory.INSTANCE.newRegion(cache.getRowNumber(), cache.getColumnNumber(), false));
		if (pathExpr instanceof PathExpressionList) {
			final PathExpressionList pathExprList = (PathExpressionList) pathExpr;
			final Automaton<PathExpressionState, PathExpressionTransition> firstAutomaton = createAutomaton(
					pathExprList.getFirst(), inPredicate);
			final List<Automaton<PathExpressionState, PathExpressionTransition>> restAutomatons = new ArrayList<Automaton<PathExpressionState, PathExpressionTransition>>(
					pathExprList.getRest().size());
			for (final PathExpression pe : pathExprList.getRest()) {
				final Automaton<PathExpressionState, PathExpressionTransition> automaton = createAutomaton(pe, inPredicate);
				restAutomatons.add(automaton);
			}

			if (inPredicate) {
				// desired linking: ABC => (A)<-B<-C<-
				// the partial automatons are already inverted, so we only have
				// to link them in reversed order!
				targetState = firstAutomaton.getTargetState();
				startState = restAutomatons.get(restAutomatons.size() - 1).getStartState();
				Automaton<PathExpressionState, PathExpressionTransition> last = firstAutomaton;
				// connect the partial automatons.
				for (final Automaton<PathExpressionState, PathExpressionTransition> current : restAutomatons) {
					current.getTargetState().addEpsilonTransition(last.getStartState());
					last = current;
				}
			} else {
				// desired linking: ABC => ->A->B->(C)
				startState = firstAutomaton.getStartState();
				targetState = restAutomatons.get(restAutomatons.size() - 1).getTargetState();
				Automaton<PathExpressionState, PathExpressionTransition> last = firstAutomaton;
				// connect the partial automatons.
				for (final Automaton<PathExpressionState, PathExpressionTransition> current : restAutomatons) {
					last.getTargetState().addEpsilonTransition(current.getStartState());
					last = current;
				}
			}

		} else if (pathExpr instanceof PathExpressionStar) {
			final PathExpressionStar pathExprStar = (PathExpressionStar) pathExpr;

			final Automaton<PathExpressionState, PathExpressionTransition> innerAutomaton = createAutomaton(
					pathExprStar.getElement(), inPredicate);
			// Star operation is independent of evaluation direction!
			startState.addEpsilonTransition(innerAutomaton.getStartState());
			startState.addEpsilonTransition(targetState);
			innerAutomaton.getTargetState().addEpsilonTransition(innerAutomaton.getStartState());
			innerAutomaton.getTargetState().addEpsilonTransition(targetState);
		} else if (pathExpr instanceof PathExpressionPlus) {
			final PathExpressionPlus pathExprPlus = (PathExpressionPlus) pathExpr;

			final Automaton<PathExpressionState, PathExpressionTransition> innerAutomaton = createAutomaton(
					pathExprPlus.getElement(), inPredicate);
			// Plus operation is independent of evaluation direction!
			startState.addEpsilonTransition(innerAutomaton.getStartState());
			innerAutomaton.getTargetState().addEpsilonTransition(innerAutomaton.getStartState());
			innerAutomaton.getTargetState().addEpsilonTransition(targetState);
		} else if (pathExpr instanceof PathExpressionOption) {
			final PathExpressionOption pathExprOption = (PathExpressionOption) pathExpr;

			final Automaton<PathExpressionState, PathExpressionTransition> innerAutomaton = createAutomaton(
					pathExprOption.getElement(), inPredicate);
			// Plus operation is independent of evaluation direction!
			startState.addEpsilonTransition(innerAutomaton.getStartState());
			startState.addEpsilonTransition(targetState);
			innerAutomaton.getTargetState().addEpsilonTransition(targetState);

		} else if (pathExpr instanceof PathExpressionOr) {
			final PathExpressionOr pathExprOr = (PathExpressionOr) pathExpr;

			final Automaton<PathExpressionState, PathExpressionTransition> leftAutomaton = createAutomaton(
					pathExprOr.getLeft(), inPredicate);
			final Automaton<PathExpressionState, PathExpressionTransition> rightAutomaton = createAutomaton(
					pathExprOr.getRight(), inPredicate);

			startState.addEpsilonTransition(leftAutomaton.getStartState());
			startState.addEpsilonTransition(rightAutomaton.getStartState());
			leftAutomaton.getTargetState().addEpsilonTransition(targetState);
			rightAutomaton.getTargetState().addEpsilonTransition(targetState);
		} else if (pathExpr instanceof PathExpressionStep) {
			final PathExpressionStep pathExprStep = (PathExpressionStep) pathExpr;
			final String axisString = pathExprStep.getAxes();
			AXIS axis = AXIS.fromString(axisString);
			Region transitionConstraint = null;
			if (pathExprStep.getNode_test() != null) {
				transitionConstraint = evaluate(pathExprStep.getNode_test());
				if (pathExprStep.getPredicate() != null) {
					transitionConstraint.logicalAnd(evaluate(pathExprStep.getPredicate()));
				}
			} else if (pathExprStep.getPredicate() != null) {
				transitionConstraint = evaluate(pathExprStep.getPredicate());
			}
			if (inPredicate) {
				axis = axis.reverseAxis();
			}
			final PathExpressionTransition trans = new PathExpressionTransition(targetState, axis, transitionConstraint);
			startState.addTransition(trans);
		}
		return new Automaton<PathExpressionState, PathExpressionTransition>(startState, targetState);
	}

	/**
	 *
	 * @param automaton Incorporates state, changes during execution
	 * @param startRegion Region to move
	 * @param inPredicate Determines whether the expression is part of a predicate, the default is  {@code false}
	 * @return
	 */
	Region evaluate(final Automaton<PathExpressionState, PathExpressionTransition> automaton, final Region startRegion,
			final boolean inPredicate) {
		Set<PathExpressionState> currentStates = new HashSet<PathExpressionState>();
		currentStates.add(automaton.getStartState());
		automaton.getStartState().setRegion(startRegion);
		while (!currentStates.isEmpty()) {
			final Set<PathExpressionState> nextStates = new HashSet<PathExpressionState>();
			for (final PathExpressionState state : currentStates) {
				nextStates.addAll(state.moveRegion(inPredicate));
			}
			currentStates = nextStates;
		}
		return automaton.getTargetState().getRegion();
	}

	/**
	 * Checks and stores whether the constraint is fulfilled
	 */
	public void evaluate(final CachedConstraint cachedCon) throws CsvValidationException {
		try {
			Region selectedRegion = null;

			if (cachedCon instanceof CachedContentConstraint) {

				// Content constraint
				final ContentConstraint constraint = (ContentConstraint) cachedCon.getSchemaElement();
				selectedRegion = cache.getRegion(constraint.getRegion());
				@SuppressWarnings("unchecked")
				final
				Automaton<ContentExpressionState, ContentExpressionTransition> automaton = (Automaton<ContentExpressionState, ContentExpressionTransition>) ((CachedContentConstraint) cachedCon)
				.getAutomaton();

				ceHandler.evaluate(automaton, constraint.getValidationMode(), selectedRegion);
			} else {

				// Relation constraint
				final RelationConstraint con = (RelationConstraint) cachedCon.getSchemaElement();
				selectedRegion = evaluate(con.getTupleSelector().getRegion());

				for (final Coordinate coord : emptyIfNull(selectedRegion.unsortedIteration())) {
					final int[] tupleCoords = new int[con.getTupleSelector().getSelectors().size()];
					generateAndProcessTuple(cachedCon, coord, tupleCoords, con.getTupleSelector().getSelectors(), 0);
				}
			}

			// memorize that it validated successfully
			cachedCon.setFulfilled(true);
			final BitSet cachedRegion = cachedCon.getRegion();
			Converter.addCoordinates(cachedRegion, selectedRegion, cache.getRowNumber());

		} catch (final CsvValidationException e) {
			e.setSource(cachedCon.getSchemaElement());
			cachedCon.setFulfilled(false);
			// add coordinates to be found when querying the semantic
			// objects for a cell
			Converter.addCoordinates(cachedCon.getRegion(), e.getErrorRegion(), cache.getRowNumber());
			throw e;
		}
	}

	/**
	 * Computes the region of the given NodeExpression.
	 *
	 * @param nodeExpression
	 *            Region to compute, constraint a corresponding constraint if
	 *            the region corresponds to a constraint
	 * @return Region of the expression
	 * @throws CsvValidationException
	 * @throws SchemaValidationException
	 * @throws IllegalArgumentException
	 */

	public Region evaluate(final NodeExpression ne) throws CsvValidationException {
		final int rowNumber = cache.getRowNumber();
		final int columnNumber = cache.getColumnNumber();
		Region region = RegionFactory.INSTANCE.newRegion(rowNumber, columnNumber, false);
		if (ne instanceof NodeExpressionOr) {
			final NodeExpressionOr neOr = (NodeExpressionOr) ne;
			region = evaluate(neOr.getLeft());
			region.logicalOr(evaluate(neOr.getRight()));
		} else if (ne instanceof NodeExpressionAnd) {
			final NodeExpressionAnd neAnd = (NodeExpressionAnd) ne;
			region = evaluate(neAnd.getLeft());
			region.logicalAnd(evaluate(neAnd.getRight()));
		} else if (ne instanceof NodeExpressionNot) {
			final NodeExpressionNot neNot = (NodeExpressionNot) ne;
			region = evaluate(neNot.getRegion());
			region.logicalNot();
		} else if (ne instanceof NodeExpressionPath) {
			final NodeExpressionPath nePath = (NodeExpressionPath) ne;
			// get input Region and TokenList
			Region input;
			if (nePath.getRegion() == null) { // absolute path expression
				input = RegionFactory.INSTANCE.newRegion(rowNumber, columnNumber, false);
				input.addCoordinateToRegion(new Coordinate(1, 1));
			} else {
				input = evaluate(nePath.getRegion());
			}
			final Automaton<PathExpressionState, PathExpressionTransition> pathExpressionAutomaton = this
					.createAutomaton(nePath.getPath(), false);

			region = evaluate(pathExpressionAutomaton, input, false);
		} else if (ne instanceof NodeExpressionCoordinate) {
			final NodeExpressionCoordinate neCoord = (NodeExpressionCoordinate) ne;
			region = RegionFactory.INSTANCE.newRegion(rowNumber, columnNumber, false);
			region.addCoordinateToRegion(new Coordinate(neCoord.getRow(), neCoord.getColumn()));
		} else if (ne instanceof NodeExpressionToken) {
			final AbstractToken absTok = ((NodeExpressionToken) ne).getToken();

			final Region tokenRegion = cache.getRegion(absTok);

			region = tokenRegion;
		} else if (ne instanceof NodeExpressionComparison) {
			final boolean r2l = ne instanceof NodeExpressionComparisonR2L;

			final Type type = ((NodeExpressionComparison) ne).getType();
			final List<TypeSpecifier> path = ((NodeExpressionComparison) ne).getTypeSpecifier();

			Pair<int[], Type> valueTreePath;
			try {
				valueTreePath = ParsingUtil.computeValueTreePath(type, path);
			} catch (final SchemaValidationException e) {
				throw new CsvValidationException(e);
			}

			final String compVal = ((NodeExpressionComparison) ne).getValue();

			Object rhs;
			try {
				rhs = ParsingUtil.parse(compVal, (CachedType) cache.getRef(valueTreePath.right));
			} catch (IllegalArgumentException | SchemaValidationException e) {
				throw new CsvValidationException(ne);
			}

			final Comparator comp = ((NodeExpressionComparison) ne).getComp();
			region = RegionFactory.INSTANCE.newRegion(cache.getRowNumber(), cache.getColumnNumber(), false);

			// filter those that fulfill the comparison.
			for (final Coordinate coord : emptyIfNull(cache.getRegion(type).unsortedIteration())) {
				final List<?> lhs = ParsingUtil.extract(cache.getValue(coord, type), valueTreePath.left);

				boolean comparison;

				if (r2l) {
					comparison = ParsingUtil.compare(rhs, lhs, comp);
				} else {
					comparison = ParsingUtil.compare(lhs, rhs, comp);
				}

				if (comparison) {
					region.addCoordinateToRegion(coord);
				}
			}

		} else if (ne instanceof NodeExpressionComplete) {
			region = RegionFactory.INSTANCE.newRegion(rowNumber, columnNumber, true);

		} else if (ne instanceof PathExpressionPredicate) {
			// XText Validation ensures that this element is only used in
			// predicates!
			final PathExpressionPredicate pePred = (PathExpressionPredicate) ne;
			final Region input = RegionFactory.INSTANCE.newRegion(rowNumber, columnNumber, true);

			final Automaton<PathExpressionState, PathExpressionTransition> pathExpressionAutomaton = this
					.createAutomaton(pePred.getPath(), true);

			region = evaluate(pathExpressionAutomaton, input, true);

		} else if (ne instanceof NodeExpressionRowCol) {
			Region refCells = RegionFactory.INSTANCE.newRegion(rowNumber, columnNumber, false);

			// determine cells to start from
			if (ne instanceof NodeExpressionRowColCoordinate) {
				int row = ((NodeExpressionRowColCoordinate) ne).getRow();
				int col = ((NodeExpressionRowColCoordinate) ne).getColumn();
				if (((NodeExpressionRowCol) ne).getMode() == RowCol.ROW) {
					col--;
				} else if (((NodeExpressionRowCol) ne).getMode() == RowCol.COL) {
					row--;
				}
				refCells.addCoordinateToRegion(new Coordinate(row, col));
			} else if (ne instanceof NodeExpressionRowColString) {
				refCells = cache.getRegion(((NodeExpressionRowColString) ne).getString());
			} else if (ne instanceof NodeExpressionRowColToken) {
				refCells = cache.getRegion(((NodeExpressionRowColToken) ne).getToken());
			} else if (ne instanceof NodeExpressionRowColLast) {
				if (((NodeExpressionRowCol) ne).getMode() == RowCol.ROW) {
					refCells.addCoordinateToRegion(new Coordinate(rowNumber, 0));
				} else if (((NodeExpressionRowCol) ne).getMode() == RowCol.COL) {
					refCells.addCoordinateToRegion(new Coordinate(0, columnNumber));
				}
			}

			// expand along rows / cols
			if (((NodeExpressionRowCol) ne).getMode() == RowCol.ROW) {
				for (final Coordinate coord : emptyIfNull(refCells.unsortedIteration())) {
					Coordinate current = new Coordinate(coord.ROW, coord.COLUMN + 1);
					final int row = current.ROW;
					for (int col = current.COLUMN; !region.contains(current) && col <= columnNumber;) {
						region.addCoordinateToRegion(current);
						current = new Coordinate(row, ++col);
					}
				}
			} else if (((NodeExpressionRowCol) ne).getMode() == RowCol.COL) {
				for (final Coordinate coord : emptyIfNull(refCells.unsortedIteration())) {
					Coordinate current = new Coordinate(coord.ROW + 1, coord.COLUMN);
					final int col = current.COLUMN;
					for (int row = current.ROW; !region.contains(current) && row <= rowNumber;) {
						region.addCoordinateToRegion(current);
						current = new Coordinate(++row, col);
					}
				}

			}

		}
		return region;

	}

	/*
	 * methods for performing the transformation program
	 */

	public Pair<List<List<String>>, JsonObject> transformCsv() throws CsvValidationException {
		final CachedTransformationProgram prog = cache.getTransformationProgram();

		final TabularCsv tabularCsv = new TabularCsv();

		execute(tabularCsv, prog.getStatements(), ValidationMode.ROW_BY_ROW);

		final JsonObject w3cSchema = buildW3CSchema(tabularCsv);

		return new Pair<List<List<String>>, JsonObject>(tabularCsv.getContent(), w3cSchema);
	}

	private boolean evaluate(final TLBoolExpr condition) throws CsvValidationException {
		if(condition instanceof TLBoolExprEmpty) {
			return cache.getRegion(((TLBoolExprEmpty) condition).getRegion()).isEmpty();
		} else if(condition instanceof TLBoolExprNot){
			return !evaluate(((TLBoolExprNot) condition).getExpression());
		}
		return false;
	}

	private JsonObject buildW3CSchema(final TabularCsv tabularCsv) {
		if(!tabularCsv.isTabular() || tabularCsv.getRows() <= 0) {
			return null;
		}

		final JsonArray columns = new JsonArray();
		final List<List<CachedToken>> types = tabularCsv.getTyping();
		final List<List<String>> contents = tabularCsv.getContent();
		for(int i = 0; i < types.get(0).size(); i++){
			CachedToken token = null;
			JsonObject column = new JsonObject();


			// get column type
			for(int j = 1; j < types.size(); j++){ //skip header
				final String content = contents.get(j).get(i);
				if(content == null || content.isEmpty()) { // empty cells don't matter
					continue;
				}

				final CachedToken currentToken = types.get(j).get(i);
				if(currentToken == null) { // fixed output string
					continue;
				}

				if(token != null && !token.equals(currentToken)){
					token = null;
					break;
				}

				token = currentToken;
			}

			// set empty cells to default value
			if(token instanceof CachedType && ((Type) token.getSchemaElement()).getDefaultValue() != null){
				final String defaultValue = ((Type) token.getSchemaElement()).getDefaultValue();
				for(int j = 1; j < types.size(); j++){
					if(contents.get(j).get(i) == null || contents.get(j).get(i).isEmpty()) {
						contents.get(j).set(i, defaultValue);
					}
				}
			}

			column = toJSON(token);
			column.addProperty("name", tabularCsv.getContent().get(0).get(i));
			columns.add(column);
		}

		final JsonObject tableSchema = new JsonObject();
		tableSchema.add("columns", columns);
		final JsonObject table = new JsonObject();
		table.add("tableSchema", tableSchema);
		final JsonArray tables = new JsonArray();
		tables.add(table);
		final JsonObject w3cSchema = new JsonObject();
		w3cSchema.add("tables", tables);
		return w3cSchema;
	}

	private JsonObject toJSON(final CachedToken token){
		JsonObject json = new JsonObject();
		if(token instanceof CachedListType){
			final ListType type = (ListType) token.getSchemaElement();
			json = toJSON(((CachedListType) token).getType());
			json.addProperty("separator", type.getSeparator());
		} else if(token instanceof CachedAtomicType){
			final AtomicType type = (AtomicType) ((CachedAtomicType) token).getSchemaElement();

			if(type.getDecimalChar() != null || type.getGroupChar() != null){
				final JsonObject format = new JsonObject();
				if(type.getDecimalChar() != null) {
					format.addProperty("decimalChar", type.getDecimalChar());
				}
				if(type.getGroupChar() != null) {
					format.addProperty("groupChar", type.getGroupChar());
				}
				if(type.getFormat() != null) {
					format.addProperty("pattern", type.getFormat());
				}
				json.add("format", format);
			} else if (type.getFormat() != null){
				json.addProperty("format", type.getFormat());
			}

			if(type.getLength() != null) {
				json.addProperty("length", type.getLength());
			}

			if(type.getMinLength() != null) {
				json.addProperty("minLength", type.getMinLength());
			}

			if(type.getMaxLength() != null) {
				json.addProperty("maxLength", type.getMaxLength());
			}

			if(type.getMinimum() != null) {
				json.addProperty("minimum", type.getMinimum());
			}

			if(type.getMaximum() != null) {
				json.addProperty("maximum", type.getMaximum());
			}

			if(type.getMinExclusive() != null) {
				json.addProperty("minExclusive", type.getMinExclusive());
			}

			if(type.getMaxExclusive() != null) {
				json.addProperty("maxExclusive", type.getMaxExclusive());
			}

			if(!json.entrySet().isEmpty()){
				final JsonObject typeProp = json;
				typeProp.addProperty("base", type.getBase());
				json = new JsonObject();
				json.add("datatype", typeProp);
			}
			else {
				json.addProperty("datatype", type.getBase());
			}

		} else if(token instanceof CachedToken){
			json.addProperty("datatype", "token");
		} else {
			json.addProperty("datatype", "string");
		}

		if(token instanceof CachedType){
			final Type type = (Type) token.getSchemaElement();
			if(type.getDefaultValue() != null) {
				json.addProperty("default", type.getDefaultValue());
			}
			if(type.getEmptyValue() != null) {
				json.addProperty("null", type.getDefaultValue());
			}
		}

		return json;
	}

	/**
	 *
	 * @param csv
	 *            in-out parameter for result
	 * @param statements
	 *            ordered list of statements to execute
	 * @return
	 * @throws CsvValidationException
	 */
	private void execute(final TabularCsv csv, final List<CachedTLStatement> statements, final ValidationMode mode)
			throws CsvValidationException {
		for (final CachedTLStatement statement : statements) {
			execute(csv, statement, mode);
		}
	}

	private void execute(final TabularCsv csv, final CachedTLStatement statement, final ValidationMode mode)
			throws CsvValidationException {
		if (statement instanceof CachedTLOutput) {
			execute(csv, (CachedTLOutput) statement, mode);
		} else if (statement instanceof CachedTLLoop) {
			execute(csv, (CachedTLLoop) statement, mode);
		} else if (statement instanceof CachedTLIf){
			execute(csv, (CachedTLIf) statement, mode);
		}

	}

	private void execute(final TabularCsv csv, final CachedTLIf statement, final ValidationMode mode) throws CsvValidationException {
		if(evaluate(((TLIf) statement.getSchemaElement()).getCondition())){
			execute(csv, statement.getIfBlock(), mode);
		} else {
			execute(csv, statement.getElseBlock(), mode);
		}

	}

	private void execute(final TabularCsv csv, final CachedTLLoop loop, final ValidationMode mode) throws CsvValidationException {
		final Region selectedRegion = cache.getRegion(((TLLoop) loop.getSchemaElement()).getRegion());

		final Automaton<ContentExpressionState, ContentExpressionTransition> automaton = (Automaton<ContentExpressionState, ContentExpressionTransition>) loop
				.getAutomaton();

		if (selectedRegion == null || selectedRegion.isEmpty()) {
			return;
		}
		EvaluationHistory history;

		if (mode.equals(ValidationMode.COMPLETE)) {

			try {
				history = tlceHandler.evaluateTrackHistory(automaton, selectedRegion.sortedIteration().iterator());
			} catch (final CsvValidationException e) {
				e.setSource(loop.getSchemaElement());
				e.setFeature(SculptPackage.Literals.TL_LOOP__CONTENT_EXPRESSION);
				throw e;
			}

			bindAndExecute(csv, loop, history, mode);
			return;

		}

		List<Iterable<Coordinate>> outerIter = null;
		boolean checkRemainingCells = false;
		if (mode.equals(ValidationMode.ROW_BY_ROW)) {
			outerIter = selectedRegion.rowByRowIteration();
		} else if (mode.equals(ValidationMode.COLUMN_BY_COLUMN)) {
			// store start States
			outerIter = selectedRegion.columnByColumnIteration();
			checkRemainingCells = true;
		}

		for (final Iterable<Coordinate> iter : outerIter) {
			final Iterator<Coordinate> concernedCoordinates = iter.iterator();

			try {
				history = tlceHandler.evaluateTrackHistory(automaton, concernedCoordinates);
			} catch (final CsvValidationException e) {
				e.setSource(loop.getSchemaElement());
				e.setFeature(SculptPackage.Literals.TL_LOOP__CONTENT_EXPRESSION);
				throw e;
			}

			if (checkRemainingCells) {
				// we have to check that the remaining cells are bottom symbols
				final Region errorRegion = RegionFactory.INSTANCE.newRegion(cache.getRowNumber(), cache.getColumnNumber(),
						false);
				while (concernedCoordinates.hasNext()) {
					final Coordinate coord = concernedCoordinates.next();
					if (cache.getCsvEntry(coord) != null) {
						errorRegion.addCoordinateToRegion(coord);
					}
				}
				if (!errorRegion.isEmpty()) {
					throw new CsvValidationException(errorRegion);
				}
			}

			bindAndExecute(csv, loop, history, mode);
		}

	}

	private void execute(final TabularCsv csv, final CachedTLOutput statement, final ValidationMode mode) throws CsvValidationException {
		final String listDelim = "" + cache.getTransformationDelimiters().getListDelim();
		csv.newLine();
		for (final CachedTLPrimitive cachedPrimitive : statement.getPrimitives()) {
			CachedToken token = cachedPrimitive.getToken();

			String text = cachedPrimitive.getText(); // caches output

			if (text == null) {

				if (cachedPrimitive instanceof CachedTLOutputVariable) {
					final CachedTLVariableBinding binding = ((CachedTLOutputVariable) cachedPrimitive).getBinding();
					text = binding.getContents().stream().collect(Collectors.joining(listDelim));
					token = ((CachedTLOutputVariable) cachedPrimitive).getBinding().getToken();

					if (cachedPrimitive instanceof CachedTLTypeInspector) {
						final CachedTLTypeInspector cachedInspector = (CachedTLTypeInspector) cachedPrimitive;
						token = cachedInspector.getType();

						final Region region = cache.getRegion((TLVariable) binding.getSchemaElement());
						if (binding.getContents().size() != 1) {
							throw new CsvValidationException("Expected one type, found " + binding.getContents().size(),
									binding.getSchemaElement(), SculptPackage.Literals.TL_OUTPUT_VARIABLE__VARIABLE,
									cache.getRegion((TLVariable) binding.getSchemaElement()));
						}

						final Coordinate coord = region.unsortedIteration().iterator().next();
						final Object value = cache.getValue(coord, (Type) binding.getToken().getSchemaElement());
						final List<Object> subvalue = ParsingUtil.extract(value, cachedInspector.getPath());

						text = (String) subvalue.get(0);

					}
				}
				cachedPrimitive.setText(text);
				cachedPrimitive.setToken(token);
			}

			csv.add(text, token);
		}
	}


	private void bindAndExecute(final TabularCsv csv, final CachedTLLoop cachedLoop, final EvaluationHistory history, final ValidationMode mode)
			throws CsvValidationException {
		final Iterator<EvaluationHistoryRecord> recordsIter = history.iterator();

		if (!recordsIter.hasNext()) {
			return;
		}

		int currentIteration = 0;

		for (final CachedTLVariableBinding binding : cachedLoop.getBindings()) {
			cache.reset(binding);
		}

		while (recordsIter.hasNext()) {
			final EvaluationHistoryRecord current = recordsIter.next();
			if (currentIteration < current.iteration) {
				currentIteration = current.iteration;

				for (final CachedTLVariableBinding binding : cachedLoop.getBindings()) {
					if (binding.getContents().isEmpty()) {
						binding.setDefault();
					}
				}

				execute(csv, cachedLoop.getStatements(), mode);

				for (final CachedTLVariableBinding binding : cachedLoop.getBindings()) {
					cache.reset(binding);
				}
			}

			final TLVariable variable = current.variable;
			if (variable != null) {
				try {
					final CachedTLVariableBinding binding = cache.getBinding(variable);
					binding.add(current.coordinate, cache.getCsvEntry(Definitions.toCoordinate(current.coordinate, cache.getRowNumber())), (CachedToken) cache.getRef(current.token));
				} catch (final SchemaValidationException e) {
					throw new CsvValidationException(e);
				}
			}
		}

		for (final CachedTLVariableBinding binding : cachedLoop.getBindings()) {
			if (binding.getContents().isEmpty()) {
				binding.setDefault();
			}
		}

		execute(csv, cachedLoop.getStatements(), mode);

		for (final CachedTLVariableBinding binding : cachedLoop.getBindings()) {
			cache.reset(binding);
		}
	}

	/*
	 * utility methods for primary and foreign key constraints
	 */


	/**
	 *
	 * @param cachedCon
	 *            stores state information
	 * @param seedCoord
	 * @param tupleCoords
	 *            generated tuple entries are placed here
	 * @param selectors
	 * @param i
	 *            index of the tuple entry to generate with respect to
	 *            tupleCoords
	 *
	 *            each tuple is generated as a cross product of the regions for
	 *            each entry and afterwards the tuple is processed, i. e.
	 *            checked whether its unique or contained in the referenced
	 *            relation respectively.
	 * @throws CsvValidationException
	 */
	private void generateAndProcessTuple(final CachedConstraint cachedCon, final Coordinate seedCoord, final int[] tupleCoords,
			final List<PathExpression> selectors, final int index) throws CsvValidationException {
		if (index == tupleCoords.length) {// process tuple
			processTuple(cachedCon, tupleCoords);
		} else { // generate next entry
			final Automaton<PathExpressionState, PathExpressionTransition> entryAutomaton = createAutomaton(
					selectors.get(index), false);
			final Region entryRegion = evaluate(entryAutomaton,
					Converter.coordinateToRegion(seedCoord, cache.getRowNumber(), cache.getColumnNumber()), false);
			for (final Coordinate coord : emptyIfNull(entryRegion.unsortedIteration())) {
				tupleCoords[index] = Definitions.from(coord, cache.getRowNumber());
				generateAndProcessTuple(cachedCon, seedCoord, tupleCoords, selectors, index + 1);
			}
		}

	}

	private void processTuple(final CachedConstraint cachedCon, final int[] tupleCoords) throws CsvValidationException {
		if (cachedCon instanceof CachedPrimaryKeyConstraint) {
			processTuple((CachedPrimaryKeyConstraint) cachedCon, tupleCoords);
		} else if (cachedCon instanceof CachedForeignKeyConstraint) {
			processTuple((CachedForeignKeyConstraint) cachedCon, tupleCoords);
		}
	}


	private void processTuple(final CachedForeignKeyConstraint cachedCon, final int[] tupleCoords) throws CsvValidationException {
		final String[] tuple = cache.getEntries(tupleCoords);
		final int hash = Arrays.deepHashCode(tuple);
		final Map<Integer, EList<int[]>> referencedRelation = cachedCon.getReferencedRelation().getTupleCache();
		if (referencedRelation.containsKey(hash)) {
			final EList<int[]> maybeEqualTuples = referencedRelation.get(hash);
			for (final int[] other : maybeEqualTuples) {
				if (Arrays.deepEquals(tuple, cache.getEntries(other))){
					return; // reference found
				}
			}
		}

		final Region errorRegion = RegionFactory.INSTANCE.newRegion(cache.getRowNumber(), cache.getColumnNumber(), false);
		for (final int c : tupleCoords) {
			errorRegion.addCoordinateToRegion(Definitions.toCoordinate(c, cache.getRowNumber()));
		}
		throw new CsvValidationException("No tuple in referenced relation", cachedCon.getSchemaElement(), null,
				errorRegion);
	}

	private void processTuple(final CachedPrimaryKeyConstraint cachedCon, final int[] tupleCoords) throws CsvValidationException {
		final String[] tuple = cache.getEntries(tupleCoords);
		final int hash = Arrays.deepHashCode(tuple);
		if (cachedCon.getTupleCache().containsKey(hash)) {
			final EList<int[]> maybeEqualTuples = cachedCon.getTupleCache().get(hash);
			for (final int[] other : maybeEqualTuples) {
				if (Arrays.deepEquals(tuple, cache.getEntries(other))) { // duplicate
					// tuple
					final Region errorRegion = RegionFactory.INSTANCE.newRegion(cache.getRowNumber(), cache.getColumnNumber(),
							false);
					for (final int c : tupleCoords) {
						errorRegion.addCoordinateToRegion(Definitions.toCoordinate(c, cache.getRowNumber()));
					}
					for (final int c : other) {
						errorRegion.addCoordinateToRegion(Definitions.toCoordinate(c, cache.getRowNumber()));
					}
					throw new CsvValidationException("Duplicate tuples", cachedCon.getSchemaElement(), null,
							errorRegion);
				}
			}

			// no duplicate tuple
			maybeEqualTuples.add(tupleCoords);
		} else {
			final EList<int[]> list = new EObjectEList<int[]>(int[].class, (InternalEObject) cachedCon,
					dataStructuresPackage.CACHED_PRIMARY_KEY_CONSTRAINT__TUPLE_CACHE);
			list.add(tupleCoords.clone());
			cachedCon.getTupleCache().put(hash, list);
		}
	}


	/*
	 * methods for checking the schema integrity and determining dependencies
	 */

	/**
	 *
	 * @param ne
	 * @return All AbstractTokens occurring in ne
	 * @throws SchemaValidationException
	 */
	public boolean validate(final NodeExpression ne, final Set<AbstractToken> appearingTokens) throws SchemaValidationException {
		if (ne instanceof NodeExpressionOr) {
			final NodeExpressionOr neOr = (NodeExpressionOr) ne;
			// find all errors
			final boolean lhs = validate(neOr.getLeft(), appearingTokens);
			final boolean rhs = validate(neOr.getRight(), appearingTokens);
			return lhs && rhs;
		} else if (ne instanceof NodeExpressionAnd) {
			final NodeExpressionAnd neAnd = (NodeExpressionAnd) ne;
			final boolean lhs = validate(neAnd.getLeft(), appearingTokens);
			final boolean rhs = validate(neAnd.getRight(), appearingTokens);
			return lhs && rhs;
		} else if (ne instanceof NodeExpressionNot) {
			final NodeExpressionNot neNot = (NodeExpressionNot) ne;
			return validate(neNot.getRegion(), appearingTokens);
		} else if (ne instanceof NodeExpressionPath) {
			final NodeExpressionPath nePath = (NodeExpressionPath) ne;
			final boolean path = validate(nePath.getPath(), appearingTokens);
			final boolean region = validate(nePath.getRegion(), appearingTokens);
			return path && region;
		} else if (ne instanceof NodeExpressionToken) {
			final AbstractToken absTok = ((NodeExpressionToken) ne).getToken();
			if (cache.getRef(absTok) == null) {
				throw new SchemaValidationException(ValidationException.NO_REFERENCE, ne,
						SculptPackage.Literals.NODE_EXPRESSION_TOKEN__TOKEN);
			}

			appearingTokens.add(absTok);
			return true;
		} else if (ne instanceof NodeExpressionComparison) {
			final NodeExpressionComparison neComp = (NodeExpressionComparison) ne;
			// check comparison value, throws if unparsable
			final Type type = neComp.getType();
			final List<TypeSpecifier> path = neComp.getTypeSpecifier();
			final Pair<int[], Type> valueTreePath = ParsingUtil.computeValueTreePath(type, path);

			try {
				checkComparisonValue(valueTreePath.right, neComp.getComp(), neComp.getValue());
			} catch (final IllegalArgumentException e) {
				throw new SchemaValidationException(e.getLocalizedMessage(), ne,
						SculptPackage.Literals.NODE_EXPRESSION_COMPARISON__VALUE);
			} catch (final Exception e) {
				throw new SchemaValidationException(e.getLocalizedMessage(), ne,
						SculptPackage.Literals.NODE_EXPRESSION_COMPARISON__COMP);
			}

			if (cache.getRef(type) == null) {
				throw new SchemaValidationException(ValidationException.NO_REFERENCE, ne,
						SculptPackage.Literals.NODE_EXPRESSION_COMPARISON__TYPE);
			}

			appearingTokens.add(neComp.getType());
			return true;
		} else if (ne instanceof NodeExpressionRowColToken) {
			try {
				// test validity and existance
				cache.getRef(((NodeExpressionRowColToken) ne).getToken());
			} catch (final Exception e) {
				throw new SchemaValidationException(ValidationException.NO_REFERENCE, ne,
						SculptPackage.Literals.NODE_EXPRESSION_ROW_COL_TOKEN__TOKEN);
			}

			appearingTokens.add(((NodeExpressionRowColToken) ne).getToken());
			return true;
		} else if (ne instanceof PathExpressionPredicate) {
			final PathExpressionPredicate pePred = (PathExpressionPredicate) ne;
			return validate(pePred.getPath(), appearingTokens);
		}
		return true;
	}

	public boolean validate(final PathExpression pathExpr, final Set<AbstractToken> appearingTokens)
			throws IllegalArgumentException, SchemaValidationException {
		if (pathExpr instanceof PathExpressionList) {
			boolean valid = true;
			final PathExpressionList pathExprList = (PathExpressionList) pathExpr;
			for (final PathExpression pe : pathExprList.getRest()) {
				if (!validate(pe, appearingTokens)) {
					valid = false;
				}
			}
			return valid;
		} else if (pathExpr instanceof PathExpressionStar) {
			final PathExpressionStar pathExprStar = (PathExpressionStar) pathExpr;
			return validate(pathExprStar.getElement(), appearingTokens);
		} else if (pathExpr instanceof PathExpressionPlus) {
			final PathExpressionPlus pathExprPlus = (PathExpressionPlus) pathExpr;
			return validate(pathExprPlus.getElement(), appearingTokens);
		} else if (pathExpr instanceof PathExpressionOption) {
			final PathExpressionOption pathExprOption = (PathExpressionOption) pathExpr;
			return validate(pathExprOption.getElement(), appearingTokens);
		} else if (pathExpr instanceof PathExpressionOr) {
			final PathExpressionOr pathExprOr = (PathExpressionOr) pathExpr;
			final boolean lhs = validate(pathExprOr.getLeft(), appearingTokens);
			final boolean rhs = validate(pathExprOr.getRight(), appearingTokens);
			return lhs && rhs;
		} else if (pathExpr instanceof PathExpressionStep) {
			final PathExpressionStep pathExprStep = (PathExpressionStep) pathExpr;
			boolean valid = true;
			if (pathExprStep.getNode_test() != null && !validate(pathExprStep.getNode_test(), appearingTokens)) {
				valid = false;
			}
			if (pathExprStep.getPredicate() != null && !validate(pathExprStep.getPredicate(), appearingTokens)) {
				valid = false;
			}
			return valid;
		}
		return true;
	}

	public void validate(final TLBoolExpr expr, final List<CachedElement> dependencies) throws SchemaValidationException {
		if(expr instanceof TLBoolExprEmpty){
			final NodeExpression nodeExpr = ((TLBoolExprEmpty) expr).getRegion();
			dependencies.add(cache.getRef(nodeExpr));
		} else if (expr instanceof TLBoolExprNot){
			validate(((TLBoolExprNot) expr).getExpression(), dependencies);
		}

	}

}

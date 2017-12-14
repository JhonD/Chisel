package de.ubt.ai7.csv_validator.library.util;

import static de.ubt.ai7.csv_validator.util.SaveIterables.emptyIfNull;

import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedAbstractToken;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedAtomicType;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedCompoundType;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedConstraint;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedContentConstraint;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedDelimiters;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedForeignKeyConstraint;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedListType;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedNodeExpression;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedPrimaryKeyConstraint;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedRegionToken;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLBoolExpr;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLConstant;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLElement;
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
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresFactory;
import de.ubt.ai7.csv_validator.library.dataStructures.Region;
import de.ubt.ai7.csv_validator.library.dataStructures.RegionFactory;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.Automaton;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions.ContentExpressionState;
import de.ubt.ai7.csv_validator.library.dataStructures.automaton.contentExpressions.ContentExpressionTransition;
import de.ubt.ai7.csv_validator.library.exceptions.SchemaValidationException;
import de.ubt.ai7.csv_validator.library.impl.CacheImpl;
import de.ubt.ai7.csv_validator.library.impl.ContentExpressionAutomatonHandler;
import de.ubt.ai7.csv_validator.library.impl.SculptInterpreter;
import de.ubt.ai7.csv_validator.library.impl.TLContentExpressionAutomatonHandler;
import de.ubt.ai7.csv_validator.library.parser.Parser;
import de.ubt.ai7.csv_validator.library.parser.impl.ParserProviderImpl;
import de.ubt.ai7.csv_validator.sculpt.AbstractToken;
import de.ubt.ai7.csv_validator.sculpt.AtomicType;
import de.ubt.ai7.csv_validator.sculpt.CompoundType;
import de.ubt.ai7.csv_validator.sculpt.CompoundTypePrimitive;
import de.ubt.ai7.csv_validator.sculpt.Constraint;
import de.ubt.ai7.csv_validator.sculpt.ContentConstraint;
import de.ubt.ai7.csv_validator.sculpt.ContentExpression;
import de.ubt.ai7.csv_validator.sculpt.Delimiters;
import de.ubt.ai7.csv_validator.sculpt.ForeignKeyConstraint;
import de.ubt.ai7.csv_validator.sculpt.ListType;
import de.ubt.ai7.csv_validator.sculpt.NodeExpression;
import de.ubt.ai7.csv_validator.sculpt.PathExpression;
import de.ubt.ai7.csv_validator.sculpt.PrimaryKeyConstraint;
import de.ubt.ai7.csv_validator.sculpt.RegionToken;
import de.ubt.ai7.csv_validator.sculpt.RelationConstraint;
import de.ubt.ai7.csv_validator.sculpt.SchemaElement;
import de.ubt.ai7.csv_validator.sculpt.SculptFactory;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.TLBoolExpr;
import de.ubt.ai7.csv_validator.sculpt.TLContentExpressionList;
import de.ubt.ai7.csv_validator.sculpt.TLElement;
import de.ubt.ai7.csv_validator.sculpt.TLIf;
import de.ubt.ai7.csv_validator.sculpt.TLLoop;
import de.ubt.ai7.csv_validator.sculpt.TLLoopMode;
import de.ubt.ai7.csv_validator.sculpt.TLOutput;
import de.ubt.ai7.csv_validator.sculpt.TLOutputConstant;
import de.ubt.ai7.csv_validator.sculpt.TLOutputPrimitive;
import de.ubt.ai7.csv_validator.sculpt.TLOutputVariable;
import de.ubt.ai7.csv_validator.sculpt.TLStatement;
import de.ubt.ai7.csv_validator.sculpt.TLVariable;
import de.ubt.ai7.csv_validator.sculpt.Token;
import de.ubt.ai7.csv_validator.sculpt.TransformationProgram;
import de.ubt.ai7.csv_validator.sculpt.Type;
import de.ubt.ai7.csv_validator.util.Coordinate;
import de.ubt.ai7.csv_validator.util.Pair;

/**
 *
 *         This class generates and initializes {@link CachedElements} from
 *         {@link SchemaElements}. It performs outstanding schema validations, e. g.
 *         checking the constant comparison values
 */
public class Converter {
	private final CacheImpl cache;
	private final SculptInterpreter interpreter;

	public Converter(final CacheImpl c, final SculptInterpreter interpreter) {
		cache = c;
		this.interpreter = interpreter;
	}

	/**
	 * converter functions perform computations on semantic object to determine
	 * the values that will be cached
	 *
	 * @throws SchemaValidationException
	 */

	public CachedElement convert(final SchemaElement obj) throws SchemaValidationException {
		CachedElement elem = null;

		if (obj instanceof AbstractToken) {
			elem = convert((AbstractToken) obj);
		}
		if (obj instanceof Constraint) {
			elem = convert((Constraint) obj);
		}
		if (obj instanceof NodeExpression) {
			elem = convert((NodeExpression) obj);
		}
		if (obj instanceof TransformationProgram) {
			elem = convert((TransformationProgram) obj);
		}
		if (obj instanceof TLElement) {
			elem = convert((TLElement) obj);
		}
		if (obj instanceof Delimiters) {
			elem = convert((Delimiters) obj);
		}

		if (elem == null) {
			throw new SchemaValidationException(SchemaValidationException.NOT_CONVERTIBLE, obj);
		}

		elem.setDefinition(Definitions.from(obj));
		elem.setSchemaElement(obj);
		elem.setRegion(new BitSet());

		if(elem.getUntestedRegion() == null){
			elem.setUntestedRegion(new BitSet());
			elem.getUntestedRegion().set(0);
		}

		return elem;
	}

	private CachedAbstractToken convert(final AbstractToken tok) throws SchemaValidationException {
		CachedAbstractToken elem = null;

		if (tok instanceof Token) {
			elem = convert((Token) tok);
		}
		if (tok instanceof RegionToken) {
			elem = convert((RegionToken) tok);
		}
		if (tok instanceof TLVariable) {
			elem = convert((TLVariable) tok);
		}

		if (elem == null) {
			throw new SchemaValidationException(SchemaValidationException.NOT_CONVERTIBLE, tok);
		}
		elem.setName(tok.getName());
		elem.setUntestedRegion(new BitSet());
		elem.getUntestedRegion().or(cache.getAllCells());

		return elem;
	}

	private CachedToken convert(final Token tok) throws SchemaValidationException {
		if (tok instanceof Type) {
			return convert((Type) tok);
		}

		final CachedToken cachedTok = dataStructuresFactory.eINSTANCE.createCachedToken();
		cachedTok.setPattern(Pattern.compile(tok.getTokenRegex()));
		cachedTok.setRegex(tok.getTokenRegex());

		return cachedTok;
	}

	private CachedConstraint convert(final Constraint con) throws SchemaValidationException {
		CachedConstraint cachedCon = null;
		NodeExpression region = null;
		if (con instanceof ContentConstraint) {
			cachedCon = convert((ContentConstraint) con);
			region = ((ContentConstraint) con).getRegion();
		}
		if (con instanceof RelationConstraint) {
			cachedCon = convert((RelationConstraint) con);
			region = ((RelationConstraint) con).getTupleSelector().getRegion();
		}

		if (cachedCon == null) {
			throw new SchemaValidationException(SchemaValidationException.NOT_CONVERTIBLE, con);
		}

		cachedCon.getContains().add(cache.getRef(region));

		return cachedCon;
	}

	private CachedConstraint convert(final RelationConstraint con) throws SchemaValidationException {
		CachedConstraint cachedCon = null;
		if (con instanceof PrimaryKeyConstraint) {
			cachedCon = convert((PrimaryKeyConstraint) con);
		}
		if (con instanceof ForeignKeyConstraint) {
			cachedCon = convert((ForeignKeyConstraint) con);
		}

		if (cachedCon == null) {
			throw new SchemaValidationException(SchemaValidationException.NOT_CONVERTIBLE, con);
		}

		final EList<CachedElement> containsList = cachedCon.getContains();
		final Set<AbstractToken> occurringTokens = new HashSet<AbstractToken>();
		interpreter.validate(con.getTupleSelector().getRegion(), occurringTokens);
		for (final PathExpression selector : con.getTupleSelector().getSelectors()) {
			interpreter.validate(selector, occurringTokens);
		}

		for (final AbstractToken tok : occurringTokens) {
			containsList.add(cache.getRef(tok));
		}

		return cachedCon;
	}

	private CachedContentConstraint convert(final ContentConstraint contentConstraint) throws SchemaValidationException {
		final CachedContentConstraint cachedCon = dataStructuresFactory.eINSTANCE.createCachedContentConstraint();

		final EList<CachedElement> containsList = cachedCon.getContains();

		// generate the automaton
		final Set<AbstractToken> occurringTokens = new HashSet<AbstractToken>();
		final ContentExpressionAutomatonHandler creator = new ContentExpressionAutomatonHandler(cache, interpreter);
		final Automaton<ContentExpressionState, ContentExpressionTransition> automaton = creator
				.createAutomaton(contentConstraint.getContentExpression(), occurringTokens);

		cachedCon.setAutomaton(automaton);
		for (final AbstractToken tok : occurringTokens) {
			containsList.add(cache.getRef(tok));
		}

		return cachedCon;
	}

	private CachedPrimaryKeyConstraint convert(final PrimaryKeyConstraint con) {
		final CachedPrimaryKeyConstraint cachedCon = dataStructuresFactory.eINSTANCE.createCachedPrimaryKeyConstraint();

		cachedCon.setTupleCache(new HashMap<Integer, EList<int[]>>());

		return cachedCon;
	}

	private CachedForeignKeyConstraint convert(final ForeignKeyConstraint con) throws SchemaValidationException {
		final CachedForeignKeyConstraint cachedCon = dataStructuresFactory.eINSTANCE.createCachedForeignKeyConstraint();

		final CachedPrimaryKeyConstraint referencedRelation = (CachedPrimaryKeyConstraint) cache
				.getRef(con.getReferencedRelation());
		if (referencedRelation == null) {
			throw new SchemaValidationException(SchemaValidationException.NO_REFERENCE, con,
					SculptPackage.Literals.FOREIGN_KEY_CONSTRAINT__REFERENCED_RELATION);
		}

		cachedCon.setReferencedRelation(referencedRelation);
		cachedCon.getContains().add(referencedRelation);

		return cachedCon;
	}

	private CachedRegionToken convert(final RegionToken tok) throws SchemaValidationException {
		final CachedRegionToken cachedTok = dataStructuresFactory.eINSTANCE.createCachedRegionToken();
		cachedTok.getContains().add(cache.getRef(tok.getRegion()));

		return cachedTok;

	}

	private CachedNodeExpression convert(final NodeExpression nodeExpr) throws SchemaValidationException {
		final CachedNodeExpression cachedNodeExpr = dataStructuresFactory.eINSTANCE.createCachedNodeExpression();

		final EList<CachedElement> containsList = cachedNodeExpr.getContains();
		final Set<AbstractToken> occurringTokens = new HashSet<AbstractToken>();
		interpreter.validate(nodeExpr, occurringTokens);

		for (final AbstractToken tok : occurringTokens) {
			containsList.add(cache.getRef(tok));
		}

		return cachedNodeExpr;
	}

	private CachedType convert(final Type type) throws SchemaValidationException {
		CachedType elem = null;

		if (type instanceof AtomicType) {
			elem = convert((AtomicType) type);
		}
		if (type instanceof ListType) {
			elem = convert((ListType) type);
		}
		if (type instanceof CompoundType) {
			elem = convert((CompoundType) type);
		}

		if (elem == null) {
			throw new SchemaValidationException(SchemaValidationException.NOT_CONVERTIBLE, type);
		}

		elem.setPattern(Pattern.compile(elem.getRegex()));
		elem.setValues(new HashMap<Integer, Object>());
		return elem;
	}

	private CachedAtomicType convert(final AtomicType type) {
		final CachedAtomicType cachedType = dataStructuresFactory.eINSTANCE.createCachedAtomicType();

		cachedType.setParser(ParserProviderImpl.getParser(type.getBase()));
		setParserParameters(cachedType.getParser(), type);
		cachedType.setRegex(cachedType.getParser().getRegex());

		return cachedType;
	}

	private void setParserParameters(final Parser<?> parser, final AtomicType type) {
		// order matters
		parser.setDecimalChar(type.getDecimalChar());
		parser.setGroupChar(type.getGroupChar());
		parser.setFormat(type.getFormat());
		parser.setLength(type.getLength());
		parser.setMinLength(type.getMinLength());
		parser.setMaxLength(type.getMaxLength());
		parser.setMinimum(type.getMinimum());
		parser.setMinExclusive(type.getMinExclusive());
		parser.setMaximum(type.getMaximum());
		parser.setMaxExclusive(type.getMaxExclusive());
		parser.setDefaultValue(type.getDefaultValue());
		parser.setEmptyValue(type.getEmptyValue());
	}

	private CachedListType convert(final ListType type) throws SchemaValidationException {
		final CachedListType cachedType = dataStructuresFactory.eINSTANCE.createCachedListType();

		final CachedType subtype = (CachedType) cache.getRef(type.getBase());
		if (subtype == null) {
			throw new SchemaValidationException(SchemaValidationException.NO_REFERENCE, type,
					SculptPackage.Literals.LIST_TYPE__BASE);
		}
		cachedType.setType(subtype);
		cachedType.getContains().add(subtype);

		String separator = type.getSeparator();
		if (separator == null || separator.isEmpty()) {
			separator = "" + cache.getDelimiters().getListDelim();
		}

		cachedType.setRegex(ParsingUtil.regexForMultipleValues(subtype.getRegex(), separator, type.getMinElements(),
				type.getMaxElements(), type.getEmptyValue()));

		return cachedType;
	}

	private CachedCompoundType convert(final CompoundType type) throws SchemaValidationException {
		final CachedCompoundType cachedType = dataStructuresFactory.eINSTANCE.createCachedCompoundType();

		final Pair<String, String> regexes = composeRegex(type.getPrimitives());
		cachedType.setRegex(regexes.left);
		cachedType.setCapturingPattern(Pattern.compile(regexes.right));

		for (final CompoundTypePrimitive prim : type.getPrimitives()) {
			if (prim.getType() != null) {
				final CachedType cachedSubtype = (CachedType) cache.getRef(prim.getType());
				if (cachedSubtype == null) {
					throw new SchemaValidationException(SchemaValidationException.NO_REFERENCE, prim,
							SculptPackage.Literals.COMPOUND_TYPE_PRIMITIVE__TYPE);
				}

				cachedType.getContains().add(cachedSubtype);
				cachedType.getPrimitives().add(cachedSubtype);
			}
		}

		return cachedType;
	}

	private CachedTransformationProgram convert(final TransformationProgram prog) throws SchemaValidationException {
		final CachedTransformationProgram cachedProg = dataStructuresFactory.eINSTANCE.createCachedTransformationProgram();

		CachedDelimiters delim = cache.getRefDelimiters();
		if (prog.getDelimiter() != null) {
			delim = (CachedDelimiters) convert((SchemaElement) prog.getDelimiter());
		}

		if(delim != null) {
			cachedProg.getContains().add(delim);
			cachedProg.setDelimiters(delim);
		}


		for (final TLStatement statement : prog.getStatements()) {
			final CachedTLStatement cachedStatement = (CachedTLStatement) convert((SchemaElement) statement);

			cachedProg.getContains().add(cachedStatement);
			cachedProg.getStatements().add(cachedStatement);
		}

		return cachedProg;
	}

	private CachedDelimiters convert(final Delimiters delim) throws SchemaValidationException {
		if (delim.getRowDelim() == null || delim.getRowDelim().isEmpty()) {
			throw new SchemaValidationException("Must also define row delimiters", delim,
					SculptPackage.Literals.DELIMITERS__COL_DELIM);
		}

		if (delim.getColDelim() == null || delim.getColDelim().isEmpty()) {
			throw new SchemaValidationException("Must also define column delimiters", delim,
					SculptPackage.Literals.DELIMITERS__ROW_DELIM);
		}

		final CachedDelimiters cachedDelim = dataStructuresFactory.eINSTANCE.createCachedDelimiters();
		cachedDelim.setRowDelim(delim.getRowDelim().charAt(0));
		cachedDelim.setColDelim(delim.getColDelim().charAt(0));
		if (delim.getListDelim() == null || delim.getListDelim().isEmpty()) {
			delim.setListDelim(delim.getColDelim());
		} else {
			cachedDelim.setListDelim(delim.getListDelim().charAt(0));
		}

		return cachedDelim;
	}

	private CachedTLElement convert(final TLElement element) throws SchemaValidationException {
		if (element instanceof TLOutputPrimitive) {
			return convert((TLOutputPrimitive) element);
		}
		if (element instanceof TLStatement) {
			return convert((TLStatement) element);
		}
		if(element instanceof TLBoolExpr) {
			return convert((TLBoolExpr) element);
		}
		throw new SchemaValidationException(SchemaValidationException.NOT_CONVERTIBLE, element);
	}

	private CachedTLStatement convert(final TLStatement statement) throws SchemaValidationException {
		if (statement instanceof TLLoop) {
			return convert((TLLoop) statement);
		}
		if (statement instanceof TLOutput) {
			return convert((TLOutput) statement);
		}
		if(statement instanceof TLIf) {
			return convert((TLIf) statement);
		}
		throw new SchemaValidationException(SchemaValidationException.NOT_CONVERTIBLE, statement);
	}

	private CachedTLOutput convert(final TLOutput output) throws SchemaValidationException {
		final CachedTLOutput cachedOutput = dataStructuresFactory.eINSTANCE.createCachedTLOutput();
		for (final TLOutputPrimitive prim : output.getPrimitives()) {
			final CachedTLPrimitive cachedPrim = (CachedTLPrimitive) convert((SchemaElement) prim);
			cachedOutput.getContains().add(cachedPrim);
			cachedOutput.getPrimitives().add(cachedPrim);
		}

		return cachedOutput;
	}

	private CachedTLPrimitive convert(final TLOutputPrimitive primitive) throws SchemaValidationException {
		if (primitive instanceof TLOutputConstant) {
			return convert((TLOutputConstant) primitive);
		} else if (primitive instanceof TLOutputVariable) {
			return convert((TLOutputVariable) primitive);
		}

		throw new SchemaValidationException(SchemaValidationException.NOT_CONVERTIBLE, primitive);
	}

	private CachedTLOutputVariable convert(final TLOutputVariable primitive) throws SchemaValidationException {
		final CachedTLVariableBinding binding = cache.getBinding(primitive.getVariable());
		CachedTLOutputVariable cachedPrimitive = null;

		if (primitive.getTypeSpecifier() == null || primitive.getTypeSpecifier().isEmpty()) {
			cachedPrimitive = dataStructuresFactory.eINSTANCE.createCachedTLOutputVariable();

		} else {
			if (binding.getPossibleTokens().size() > 1) {
				throw new SchemaValidationException("The variable may have multiple types", primitive.getVariable());
			}

			if (!(binding.getPossibleTokens().get(0) instanceof CachedType)) {
				throw new SchemaValidationException("The variable does not have a type", primitive.getVariable());
			}

			final CachedType type = (CachedType) binding.getPossibleTokens().get(0);

			final CachedTLTypeInspector cachedInspector = dataStructuresFactory.eINSTANCE.createCachedTLTypeInspector();
			cachedPrimitive = cachedInspector;

			final Pair<int[], Type> pathType = ParsingUtil.computeValueTreePath((Type) type.getSchemaElement(), primitive.getTypeSpecifier());
			cachedInspector.setPath(pathType.left);
			cachedInspector.setType((CachedType) cache.getRef(pathType.right));
		}

		cachedPrimitive.setBinding(binding);
		cachedPrimitive.getContains().add(binding);
		return cachedPrimitive;
	}

	private CachedTLConstant convert(final TLOutputConstant primitive) {
		final CachedTLConstant cachedConstant = dataStructuresFactory.eINSTANCE.createCachedTLConstant();
		cachedConstant.setText(primitive.getText() == null ? "" : primitive.getText());
		return cachedConstant;

	}

	private CachedTLLoop convert(final TLLoop loop) throws SchemaValidationException {
		final CachedTLLoop cachedLoop = dataStructuresFactory.eINSTANCE.createCachedTLLoop();
		final EList<CachedElement> containsList = cachedLoop.getContains();

		final List<TLVariable> variables = loop.getVariables();
		TLContentExpressionList contExprList = loop.getContentExpression();
		final TLContentExpressionAutomatonHandler constructor = new TLContentExpressionAutomatonHandler(cache, interpreter);

		// convert variables
		final Set<AbstractToken> occurringTokens = new HashSet<AbstractToken>();

		for (final TLVariable variable : variables) {
			final CachedTLVariableBinding cachedBinding = cache.getRef(variable);
			cachedLoop.getBindings().add(cachedBinding);
			containsList.add(cachedBinding);
		}

		// create automaton depending on mode
		Automaton<ContentExpressionState, ContentExpressionTransition> automaton = null;

		if (loop.getMode() == TLLoopMode.UNSPECIFIED) {
			contExprList = SculptFactory.eINSTANCE.createTLContentExpressionList();
			final EList<ContentExpression> list = contExprList.getList();
			for (final CachedTLVariableBinding binding : cachedLoop.getBindings()) {
				list.add(SculptFactory.eINSTANCE.createContentExpressionANY());
			}
		}

		automaton = constructor.createAutomaton(contExprList, occurringTokens, cachedLoop.getBindings());

		if (loop.getMode() == TLLoopMode.SPLIT) {
			automaton = constructor.addIncStar(automaton, occurringTokens);
		}

		cachedLoop.setAutomaton(automaton);

		// convert statements
		for (final TLStatement statement : loop.getStatements()) {
			final CachedTLStatement cachedStatement = (CachedTLStatement) convert((SchemaElement) statement);
			containsList.add(cachedStatement);
			cachedLoop.getStatements().add(cachedStatement);
		}

		containsList.add(cache.getRef(loop.getRegion()));

		for (final AbstractToken tok : occurringTokens) {
			containsList.add(cache.getRef(tok));
		}

		return cachedLoop;
	}

	private CachedTLVariableBinding convert(final TLVariable variable) {
		return dataStructuresFactory.eINSTANCE.createCachedTLVariableBinding();
	}

	private CachedTLIf convert(final TLIf iif) throws SchemaValidationException {
		final CachedTLIf cachedIf = dataStructuresFactory.eINSTANCE.createCachedTLIf();

		final EList<CachedElement> containsList = cachedIf.getContains();

		for (final TLStatement statement : iif.getIfBlock()) {
			final CachedTLStatement cachedStatement = (CachedTLStatement) convert((SchemaElement) statement);
			containsList.add(cachedStatement);
			cachedIf.getIfBlock().add(cachedStatement);
		}

		for (final TLStatement statement : iif.getElseBlock()) {
			final CachedTLStatement cachedStatement = (CachedTLStatement) convert((SchemaElement) statement);
			containsList.add(cachedStatement);
			cachedIf.getElseBlock().add(cachedStatement);
		}

		return cachedIf;
	}

	private CachedTLBoolExpr convert(final TLBoolExpr expr) throws SchemaValidationException{
		final CachedTLBoolExpr cachedBoolExpr = dataStructuresFactory.eINSTANCE.createCachedTLBoolExpr();

		interpreter.validate(expr, cachedBoolExpr.getContains());
		return cachedBoolExpr;
	}

	/**
	 *
	 * @param primitives
	 * @return (regex without capture groups, regex with one capture group per
	 *         subtype)
	 * @throws SchemaValidationException
	 */
	private Pair<String, String> composeRegex(final List<CompoundTypePrimitive> primitives) throws SchemaValidationException {
		String captRegex = "";
		String nonCaptRegex = "";
		if (primitives == null) {
			return new Pair<String, String>(nonCaptRegex, captRegex);
		}

		for (final CompoundTypePrimitive prim : primitives) {
			if (prim.getType() != null) {
				final CachedType cachedType = (CachedType) cache.getRef(prim.getType());
				if (cachedType != null) {
					captRegex += "(" + cachedType.getRegex() + ")";
					nonCaptRegex += "(?:" + cachedType.getRegex() + ")";
				}
			} else {
				captRegex += Pattern.quote(prim.getText()); // escape special
				// and meta
				// characters
				nonCaptRegex += Pattern.quote(prim.getText());
			}
		}
		captRegex = "\\s*(?:" + captRegex + ")\\s*";
		nonCaptRegex = "\\s*(?:" + nonCaptRegex + ")\\s*";

		return new Pair<String, String>(nonCaptRegex, captRegex);
	}

	public static Region coordinateToRegion(final Coordinate coordinate, final int rowNumber, final int columnNumber) {
		final Region region = RegionFactory.INSTANCE.newRegion(rowNumber, columnNumber, false);
		if (!coordinate.equals(ParsingUtil.DEFAULT_ERROR_COORDINATE)) {
			region.addCoordinateToRegion(coordinate);
		}
		return region;
	}

	public static void addCoordinates(final BitSet target, final Region source, final int rowNumber) {
		if (source == null || target == null) {
			return;
		}

		for (final Coordinate c : emptyIfNull(source.unsortedIteration())) {
			target.set(Definitions.from(c, rowNumber));
		}

	}

	public static String csvToString(final List<List<String>> csv, final String rowDelim, final String colDelim) {
		return csv.stream().map(x -> {
			return x.stream().collect(Collectors.joining(rowDelim));
		}).collect(Collectors.joining(colDelim));
	}

}

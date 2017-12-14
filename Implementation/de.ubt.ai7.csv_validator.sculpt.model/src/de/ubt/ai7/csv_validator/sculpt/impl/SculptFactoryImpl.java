/**
 */
package de.ubt.ai7.csv_validator.sculpt.impl;

import de.ubt.ai7.csv_validator.sculpt.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.ubt.ai7.csv_validator.sculpt.AtomicType;
import de.ubt.ai7.csv_validator.sculpt.Comparator;
import de.ubt.ai7.csv_validator.sculpt.CompoundType;
import de.ubt.ai7.csv_validator.sculpt.CompoundTypePrimitive;
import de.ubt.ai7.csv_validator.sculpt.CompoundTypeSpecifier;
import de.ubt.ai7.csv_validator.sculpt.Constraint;
import de.ubt.ai7.csv_validator.sculpt.ContentConstraint;
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
import de.ubt.ai7.csv_validator.sculpt.Delimiters;
import de.ubt.ai7.csv_validator.sculpt.ForeignKeyConstraint;
import de.ubt.ai7.csv_validator.sculpt.ListType;
import de.ubt.ai7.csv_validator.sculpt.ListTypeSpecifier;
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
import de.ubt.ai7.csv_validator.sculpt.PathExpressionList;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionOption;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionOr;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionPlus;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionPredicate;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionStar;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionStep;
import de.ubt.ai7.csv_validator.sculpt.PrimaryKeyConstraint;
import de.ubt.ai7.csv_validator.sculpt.RegionToken;
import de.ubt.ai7.csv_validator.sculpt.RelationConstraint;
import de.ubt.ai7.csv_validator.sculpt.RowCol;
import de.ubt.ai7.csv_validator.sculpt.SchemaElement;
import de.ubt.ai7.csv_validator.sculpt.Sculpt;
import de.ubt.ai7.csv_validator.sculpt.SculptFactory;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.TLContentExpressionList;
import de.ubt.ai7.csv_validator.sculpt.TLElement;
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
import de.ubt.ai7.csv_validator.sculpt.TupleSelector;
import de.ubt.ai7.csv_validator.sculpt.Type;
import de.ubt.ai7.csv_validator.sculpt.TypeSpecifier;
import de.ubt.ai7.csv_validator.sculpt.ValidationMode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SculptFactoryImpl extends EFactoryImpl implements SculptFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SculptFactory init() {
		try {
			SculptFactory theSculptFactory = (SculptFactory)EPackage.Registry.INSTANCE.getEFactory(SculptPackage.eNS_URI);
			if (theSculptFactory != null) {
				return theSculptFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SculptFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SculptFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SculptPackage.SCULPT: return createSculpt();
			case SculptPackage.SCHEMA_ELEMENT: return createSchemaElement();
			case SculptPackage.DELIMITERS: return createDelimiters();
			case SculptPackage.TYPE: return createType();
			case SculptPackage.ATOMIC_TYPE: return createAtomicType();
			case SculptPackage.COMPOUND_TYPE: return createCompoundType();
			case SculptPackage.LIST_TYPE: return createListType();
			case SculptPackage.COMPOUND_TYPE_PRIMITIVE: return createCompoundTypePrimitive();
			case SculptPackage.TOKEN: return createToken();
			case SculptPackage.REGION_TOKEN: return createRegionToken();
			case SculptPackage.CONSTRAINT: return createConstraint();
			case SculptPackage.CONTENT_CONSTRAINT: return createContentConstraint();
			case SculptPackage.RELATION_CONSTRAINT: return createRelationConstraint();
			case SculptPackage.PRIMARY_KEY_CONSTRAINT: return createPrimaryKeyConstraint();
			case SculptPackage.FOREIGN_KEY_CONSTRAINT: return createForeignKeyConstraint();
			case SculptPackage.TRANSFORMATION_PROGRAM: return createTransformationProgram();
			case SculptPackage.TUPLE_SELECTOR: return createTupleSelector();
			case SculptPackage.NODE_EXPRESSION_OR: return createNodeExpressionOr();
			case SculptPackage.NODE_EXPRESSION_AND: return createNodeExpressionAnd();
			case SculptPackage.NODE_EXPRESSION_NOT: return createNodeExpressionNot();
			case SculptPackage.NODE_EXPRESSION_PATH: return createNodeExpressionPath();
			case SculptPackage.NODE_EXPRESSION_TOKEN: return createNodeExpressionToken();
			case SculptPackage.NODE_EXPRESSION_COORDINATE: return createNodeExpressionCoordinate();
			case SculptPackage.NODE_EXPRESSION_COMPLETE: return createNodeExpressionComplete();
			case SculptPackage.NODE_EXPRESSION_ROW_COL: return createNodeExpressionRowCol();
			case SculptPackage.NODE_EXPRESSION_ROW_COL_COORDINATE: return createNodeExpressionRowColCoordinate();
			case SculptPackage.NODE_EXPRESSION_ROW_COL_TOKEN: return createNodeExpressionRowColToken();
			case SculptPackage.NODE_EXPRESSION_ROW_COL_STRING: return createNodeExpressionRowColString();
			case SculptPackage.NODE_EXPRESSION_ROW_COL_LAST: return createNodeExpressionRowColLast();
			case SculptPackage.NODE_EXPRESSION_COMPARISON: return createNodeExpressionComparison();
			case SculptPackage.NODE_EXPRESSION_COMPARISON_R2L: return createNodeExpressionComparisonR2L();
			case SculptPackage.PATH_EXPRESSION_PREDICATE: return createPathExpressionPredicate();
			case SculptPackage.PATH_EXPRESSION_LIST: return createPathExpressionList();
			case SculptPackage.PATH_EXPRESSION_STAR: return createPathExpressionStar();
			case SculptPackage.PATH_EXPRESSION_PLUS: return createPathExpressionPlus();
			case SculptPackage.PATH_EXPRESSION_OPTION: return createPathExpressionOption();
			case SculptPackage.PATH_EXPRESSION_OR: return createPathExpressionOr();
			case SculptPackage.PATH_EXPRESSION_STEP: return createPathExpressionStep();
			case SculptPackage.CONTENT_EXPRESSION: return createContentExpression();
			case SculptPackage.CONTENT_EXPRESSION_OR: return createContentExpressionOr();
			case SculptPackage.CONTENT_EXPRESSION_LIST: return createContentExpressionList();
			case SculptPackage.CONTENT_EXPRESSION_STAR: return createContentExpressionStar();
			case SculptPackage.CONTENT_EXPRESSION_PLUS: return createContentExpressionPlus();
			case SculptPackage.CONTENT_EXPRESSION_OPTION: return createContentExpressionOption();
			case SculptPackage.CONTENT_EXPRESSION_TOKEN: return createContentExpressionToken();
			case SculptPackage.CONTENT_EXPRESSION_STRING: return createContentExpressionString();
			case SculptPackage.CONTENT_EXPRESSION_ANY: return createContentExpressionANY();
			case SculptPackage.CONTENT_EXPRESSION_EMPTY: return createContentExpressionEMPTY();
			case SculptPackage.CONTENT_EXPRESSION_SOMETHING: return createContentExpressionSOMETHING();
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON: return createContentExpressionComparison();
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON_R2L: return createContentExpressionComparisonR2L();
			case SculptPackage.TL_CONTENT_EXPRESSION_LIST: return createTLContentExpressionList();
			case SculptPackage.TYPE_SPECIFIER: return createTypeSpecifier();
			case SculptPackage.COMPOUND_TYPE_SPECIFIER: return createCompoundTypeSpecifier();
			case SculptPackage.LIST_TYPE_SPECIFIER: return createListTypeSpecifier();
			case SculptPackage.TL_ELEMENT: return createTLElement();
			case SculptPackage.TL_VARIABLE: return createTLVariable();
			case SculptPackage.TL_OUTPUT_PRIMITIVE: return createTLOutputPrimitive();
			case SculptPackage.TL_OUTPUT_CONSTANT: return createTLOutputConstant();
			case SculptPackage.TL_OUTPUT_VARIABLE: return createTLOutputVariable();
			case SculptPackage.TL_STATEMENT: return createTLStatement();
			case SculptPackage.TL_OUTPUT: return createTLOutput();
			case SculptPackage.TL_LOOP: return createTLLoop();
			case SculptPackage.TL_IF: return createTLIf();
			case SculptPackage.TL_BOOL_EXPR: return createTLBoolExpr();
			case SculptPackage.TL_BOOL_EXPR_EMPTY: return createTLBoolExprEmpty();
			case SculptPackage.TL_BOOL_EXPR_NOT: return createTLBoolExprNot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SculptPackage.COMPARATOR:
				return createComparatorFromString(eDataType, initialValue);
			case SculptPackage.ROW_COL:
				return createRowColFromString(eDataType, initialValue);
			case SculptPackage.VALIDATION_MODE:
				return createValidationModeFromString(eDataType, initialValue);
			case SculptPackage.TL_LOOP_MODE:
				return createTLLoopModeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SculptPackage.COMPARATOR:
				return convertComparatorToString(eDataType, instanceValue);
			case SculptPackage.ROW_COL:
				return convertRowColToString(eDataType, instanceValue);
			case SculptPackage.VALIDATION_MODE:
				return convertValidationModeToString(eDataType, instanceValue);
			case SculptPackage.TL_LOOP_MODE:
				return convertTLLoopModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sculpt createSculpt() {
		SculptImpl sculpt = new SculptImpl();
		return sculpt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaElement createSchemaElement() {
		SchemaElementImpl schemaElement = new SchemaElementImpl();
		return schemaElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delimiters createDelimiters() {
		DelimitersImpl delimiters = new DelimitersImpl();
		return delimiters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtomicType createAtomicType() {
		AtomicTypeImpl atomicType = new AtomicTypeImpl();
		return atomicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundType createCompoundType() {
		CompoundTypeImpl compoundType = new CompoundTypeImpl();
		return compoundType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListType createListType() {
		ListTypeImpl listType = new ListTypeImpl();
		return listType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundTypePrimitive createCompoundTypePrimitive() {
		CompoundTypePrimitiveImpl compoundTypePrimitive = new CompoundTypePrimitiveImpl();
		return compoundTypePrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegionToken createRegionToken() {
		RegionTokenImpl regionToken = new RegionTokenImpl();
		return regionToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentConstraint createContentConstraint() {
		ContentConstraintImpl contentConstraint = new ContentConstraintImpl();
		return contentConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationConstraint createRelationConstraint() {
		RelationConstraintImpl relationConstraint = new RelationConstraintImpl();
		return relationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimaryKeyConstraint createPrimaryKeyConstraint() {
		PrimaryKeyConstraintImpl primaryKeyConstraint = new PrimaryKeyConstraintImpl();
		return primaryKeyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForeignKeyConstraint createForeignKeyConstraint() {
		ForeignKeyConstraintImpl foreignKeyConstraint = new ForeignKeyConstraintImpl();
		return foreignKeyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationProgram createTransformationProgram() {
		TransformationProgramImpl transformationProgram = new TransformationProgramImpl();
		return transformationProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TupleSelector createTupleSelector() {
		TupleSelectorImpl tupleSelector = new TupleSelectorImpl();
		return tupleSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentExpression createContentExpression() {
		ContentExpressionImpl contentExpression = new ContentExpressionImpl();
		return contentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeExpressionOr createNodeExpressionOr() {
		NodeExpressionOrImpl nodeExpressionOr = new NodeExpressionOrImpl();
		return nodeExpressionOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeExpressionAnd createNodeExpressionAnd() {
		NodeExpressionAndImpl nodeExpressionAnd = new NodeExpressionAndImpl();
		return nodeExpressionAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeExpressionNot createNodeExpressionNot() {
		NodeExpressionNotImpl nodeExpressionNot = new NodeExpressionNotImpl();
		return nodeExpressionNot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeExpressionPath createNodeExpressionPath() {
		NodeExpressionPathImpl nodeExpressionPath = new NodeExpressionPathImpl();
		return nodeExpressionPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeExpressionToken createNodeExpressionToken() {
		NodeExpressionTokenImpl nodeExpressionToken = new NodeExpressionTokenImpl();
		return nodeExpressionToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeExpressionCoordinate createNodeExpressionCoordinate() {
		NodeExpressionCoordinateImpl nodeExpressionCoordinate = new NodeExpressionCoordinateImpl();
		return nodeExpressionCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeExpressionComplete createNodeExpressionComplete() {
		NodeExpressionCompleteImpl nodeExpressionComplete = new NodeExpressionCompleteImpl();
		return nodeExpressionComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeExpressionRowCol createNodeExpressionRowCol() {
		NodeExpressionRowColImpl nodeExpressionRowCol = new NodeExpressionRowColImpl();
		return nodeExpressionRowCol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeExpressionRowColCoordinate createNodeExpressionRowColCoordinate() {
		NodeExpressionRowColCoordinateImpl nodeExpressionRowColCoordinate = new NodeExpressionRowColCoordinateImpl();
		return nodeExpressionRowColCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeExpressionRowColToken createNodeExpressionRowColToken() {
		NodeExpressionRowColTokenImpl nodeExpressionRowColToken = new NodeExpressionRowColTokenImpl();
		return nodeExpressionRowColToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeExpressionRowColString createNodeExpressionRowColString() {
		NodeExpressionRowColStringImpl nodeExpressionRowColString = new NodeExpressionRowColStringImpl();
		return nodeExpressionRowColString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeExpressionRowColLast createNodeExpressionRowColLast() {
		NodeExpressionRowColLastImpl nodeExpressionRowColLast = new NodeExpressionRowColLastImpl();
		return nodeExpressionRowColLast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeExpressionComparison createNodeExpressionComparison() {
		NodeExpressionComparisonImpl nodeExpressionComparison = new NodeExpressionComparisonImpl();
		return nodeExpressionComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeExpressionComparisonR2L createNodeExpressionComparisonR2L() {
		NodeExpressionComparisonR2LImpl nodeExpressionComparisonR2L = new NodeExpressionComparisonR2LImpl();
		return nodeExpressionComparisonR2L;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathExpressionPredicate createPathExpressionPredicate() {
		PathExpressionPredicateImpl pathExpressionPredicate = new PathExpressionPredicateImpl();
		return pathExpressionPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathExpressionList createPathExpressionList() {
		PathExpressionListImpl pathExpressionList = new PathExpressionListImpl();
		return pathExpressionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathExpressionStar createPathExpressionStar() {
		PathExpressionStarImpl pathExpressionStar = new PathExpressionStarImpl();
		return pathExpressionStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathExpressionPlus createPathExpressionPlus() {
		PathExpressionPlusImpl pathExpressionPlus = new PathExpressionPlusImpl();
		return pathExpressionPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathExpressionOption createPathExpressionOption() {
		PathExpressionOptionImpl pathExpressionOption = new PathExpressionOptionImpl();
		return pathExpressionOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathExpressionOr createPathExpressionOr() {
		PathExpressionOrImpl pathExpressionOr = new PathExpressionOrImpl();
		return pathExpressionOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathExpressionStep createPathExpressionStep() {
		PathExpressionStepImpl pathExpressionStep = new PathExpressionStepImpl();
		return pathExpressionStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentExpressionOr createContentExpressionOr() {
		ContentExpressionOrImpl contentExpressionOr = new ContentExpressionOrImpl();
		return contentExpressionOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentExpressionList createContentExpressionList() {
		ContentExpressionListImpl contentExpressionList = new ContentExpressionListImpl();
		return contentExpressionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentExpressionStar createContentExpressionStar() {
		ContentExpressionStarImpl contentExpressionStar = new ContentExpressionStarImpl();
		return contentExpressionStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentExpressionPlus createContentExpressionPlus() {
		ContentExpressionPlusImpl contentExpressionPlus = new ContentExpressionPlusImpl();
		return contentExpressionPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentExpressionOption createContentExpressionOption() {
		ContentExpressionOptionImpl contentExpressionOption = new ContentExpressionOptionImpl();
		return contentExpressionOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentExpressionToken createContentExpressionToken() {
		ContentExpressionTokenImpl contentExpressionToken = new ContentExpressionTokenImpl();
		return contentExpressionToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentExpressionString createContentExpressionString() {
		ContentExpressionStringImpl contentExpressionString = new ContentExpressionStringImpl();
		return contentExpressionString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentExpressionANY createContentExpressionANY() {
		ContentExpressionANYImpl contentExpressionANY = new ContentExpressionANYImpl();
		return contentExpressionANY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentExpressionEMPTY createContentExpressionEMPTY() {
		ContentExpressionEMPTYImpl contentExpressionEMPTY = new ContentExpressionEMPTYImpl();
		return contentExpressionEMPTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentExpressionSOMETHING createContentExpressionSOMETHING() {
		ContentExpressionSOMETHINGImpl contentExpressionSOMETHING = new ContentExpressionSOMETHINGImpl();
		return contentExpressionSOMETHING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentExpressionComparison createContentExpressionComparison() {
		ContentExpressionComparisonImpl contentExpressionComparison = new ContentExpressionComparisonImpl();
		return contentExpressionComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentExpressionComparisonR2L createContentExpressionComparisonR2L() {
		ContentExpressionComparisonR2LImpl contentExpressionComparisonR2L = new ContentExpressionComparisonR2LImpl();
		return contentExpressionComparisonR2L;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLContentExpressionList createTLContentExpressionList() {
		TLContentExpressionListImpl tlContentExpressionList = new TLContentExpressionListImpl();
		return tlContentExpressionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeSpecifier createTypeSpecifier() {
		TypeSpecifierImpl typeSpecifier = new TypeSpecifierImpl();
		return typeSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundTypeSpecifier createCompoundTypeSpecifier() {
		CompoundTypeSpecifierImpl compoundTypeSpecifier = new CompoundTypeSpecifierImpl();
		return compoundTypeSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListTypeSpecifier createListTypeSpecifier() {
		ListTypeSpecifierImpl listTypeSpecifier = new ListTypeSpecifierImpl();
		return listTypeSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLElement createTLElement() {
		TLElementImpl tlElement = new TLElementImpl();
		return tlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLVariable createTLVariable() {
		TLVariableImpl tlVariable = new TLVariableImpl();
		return tlVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLOutputPrimitive createTLOutputPrimitive() {
		TLOutputPrimitiveImpl tlOutputPrimitive = new TLOutputPrimitiveImpl();
		return tlOutputPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLOutputConstant createTLOutputConstant() {
		TLOutputConstantImpl tlOutputConstant = new TLOutputConstantImpl();
		return tlOutputConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLOutputVariable createTLOutputVariable() {
		TLOutputVariableImpl tlOutputVariable = new TLOutputVariableImpl();
		return tlOutputVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLStatement createTLStatement() {
		TLStatementImpl tlStatement = new TLStatementImpl();
		return tlStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLOutput createTLOutput() {
		TLOutputImpl tlOutput = new TLOutputImpl();
		return tlOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLLoop createTLLoop() {
		TLLoopImpl tlLoop = new TLLoopImpl();
		return tlLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLIf createTLIf() {
		TLIfImpl tlIf = new TLIfImpl();
		return tlIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLBoolExpr createTLBoolExpr() {
		TLBoolExprImpl tlBoolExpr = new TLBoolExprImpl();
		return tlBoolExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLBoolExprEmpty createTLBoolExprEmpty() {
		TLBoolExprEmptyImpl tlBoolExprEmpty = new TLBoolExprEmptyImpl();
		return tlBoolExprEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLBoolExprNot createTLBoolExprNot() {
		TLBoolExprNotImpl tlBoolExprNot = new TLBoolExprNotImpl();
		return tlBoolExprNot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparator createComparatorFromString(EDataType eDataType, String initialValue) {
		Comparator result = Comparator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowCol createRowColFromString(EDataType eDataType, String initialValue) {
		RowCol result = RowCol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowColToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationMode createValidationModeFromString(EDataType eDataType, String initialValue) {
		ValidationMode result = ValidationMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValidationModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLLoopMode createTLLoopModeFromString(EDataType eDataType, String initialValue) {
		TLLoopMode result = TLLoopMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTLLoopModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SculptPackage getSculptPackage() {
		return (SculptPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SculptPackage getPackage() {
		return SculptPackage.eINSTANCE;
	}

} //SculptFactoryImpl

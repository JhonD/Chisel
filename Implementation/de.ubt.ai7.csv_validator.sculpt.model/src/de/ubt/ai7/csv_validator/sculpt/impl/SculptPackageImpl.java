/**
 */
package de.ubt.ai7.csv_validator.sculpt.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.ubt.ai7.csv_validator.sculpt.AbstractToken;
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
import de.ubt.ai7.csv_validator.sculpt.NodeExpression;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionAnd;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparisonR2L;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionComplete;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionCoordinate;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionNot;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionOr;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionPath;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionPrimitive;
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
import de.ubt.ai7.csv_validator.sculpt.PrimaryKeyConstraint;
import de.ubt.ai7.csv_validator.sculpt.RegionToken;
import de.ubt.ai7.csv_validator.sculpt.RelationConstraint;
import de.ubt.ai7.csv_validator.sculpt.RowCol;
import de.ubt.ai7.csv_validator.sculpt.SchemaElement;
import de.ubt.ai7.csv_validator.sculpt.Sculpt;
import de.ubt.ai7.csv_validator.sculpt.SculptFactory;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.TLBoolExpr;
import de.ubt.ai7.csv_validator.sculpt.TLBoolExprEmpty;
import de.ubt.ai7.csv_validator.sculpt.TLBoolExprNot;
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
import de.ubt.ai7.csv_validator.sculpt.TupleSelector;
import de.ubt.ai7.csv_validator.sculpt.Type;
import de.ubt.ai7.csv_validator.sculpt.TypeSpecifier;
import de.ubt.ai7.csv_validator.sculpt.ValidationMode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SculptPackageImpl extends EPackageImpl implements SculptPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sculptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delimitersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundTypePrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryKeyConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreignKeyConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeExpressionPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeExpressionOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeExpressionAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeExpressionNotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeExpressionPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeExpressionTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeExpressionCoordinateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeExpressionCompleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeExpressionRowColEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeExpressionRowColCoordinateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeExpressionRowColTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeExpressionRowColStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeExpressionRowColLastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeExpressionComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeExpressionComparisonR2LEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathExpressionPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathExpressionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathExpressionStarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathExpressionPlusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathExpressionOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathExpressionOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathExpressionStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentExpressionOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentExpressionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentExpressionStarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentExpressionPlusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentExpressionOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentExpressionTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentExpressionStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentExpressionANYEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentExpressionEMPTYEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentExpressionSOMETHINGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentExpressionComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentExpressionComparisonR2LEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlContentExpressionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeSpecifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundTypeSpecifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listTypeSpecifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlOutputPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlOutputConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlOutputVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlBoolExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlBoolExprEmptyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlBoolExprNotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rowColEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum validationModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tlLoopModeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SculptPackageImpl() {
		super(eNS_URI, SculptFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SculptPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SculptPackage init() {
		if (isInited) return (SculptPackage)EPackage.Registry.INSTANCE.getEPackage(SculptPackage.eNS_URI);

		// Obtain or create and register package
		SculptPackageImpl theSculptPackage = (SculptPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SculptPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SculptPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSculptPackage.createPackageContents();

		// Initialize created meta-data
		theSculptPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSculptPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SculptPackage.eNS_URI, theSculptPackage);
		return theSculptPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSculpt() {
		return sculptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSculpt_Delimiter() {
		return (EReference)sculptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSculpt_Tokens() {
		return (EReference)sculptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSculpt_Constraints() {
		return (EReference)sculptEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSculpt_RegionTokens() {
		return (EReference)sculptEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSculpt_Types() {
		return (EReference)sculptEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSculpt_TransformationProgram() {
		return (EReference)sculptEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchemaElement() {
		return schemaElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDelimiters() {
		return delimitersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelimiters_RowDelim() {
		return (EAttribute)delimitersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelimiters_ColDelim() {
		return (EAttribute)delimitersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelimiters_ListDelim() {
		return (EAttribute)delimitersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractToken() {
		return abstractTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractToken_Name() {
		return (EAttribute)abstractTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getType_DefaultValue() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getType_EmptyValue() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAtomicType() {
		return atomicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomicType_Format() {
		return (EAttribute)atomicTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomicType_MinLength() {
		return (EAttribute)atomicTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomicType_MaxLength() {
		return (EAttribute)atomicTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomicType_Base() {
		return (EAttribute)atomicTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomicType_GroupChar() {
		return (EAttribute)atomicTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomicType_DecimalChar() {
		return (EAttribute)atomicTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomicType_Minimum() {
		return (EAttribute)atomicTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomicType_Maximum() {
		return (EAttribute)atomicTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomicType_MinExclusive() {
		return (EAttribute)atomicTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomicType_MaxExclusive() {
		return (EAttribute)atomicTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomicType_Length() {
		return (EAttribute)atomicTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompoundType() {
		return compoundTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompoundType_Primitives() {
		return (EReference)compoundTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListType() {
		return listTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListType_Separator() {
		return (EAttribute)listTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListType_MinElements() {
		return (EAttribute)listTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListType_MaxElements() {
		return (EAttribute)listTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListType_Base() {
		return (EReference)listTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompoundTypePrimitive() {
		return compoundTypePrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundTypePrimitive_Text() {
		return (EAttribute)compoundTypePrimitiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompoundTypePrimitive_Type() {
		return (EReference)compoundTypePrimitiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToken_TokenRegex() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegionToken() {
		return regionTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegionToken_Region() {
		return (EReference)regionTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentConstraint() {
		return contentConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentConstraint_Region() {
		return (EReference)contentConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentConstraint_ContentExpression() {
		return (EReference)contentConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentConstraint_ValidationMode() {
		return (EAttribute)contentConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationConstraint() {
		return relationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationConstraint_TupleSelector() {
		return (EReference)relationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimaryKeyConstraint() {
		return primaryKeyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimaryKeyConstraint_Name() {
		return (EAttribute)primaryKeyConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForeignKeyConstraint() {
		return foreignKeyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForeignKeyConstraint_ReferencedRelation() {
		return (EReference)foreignKeyConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransformationProgram() {
		return transformationProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransformationProgram_Delimiter() {
		return (EReference)transformationProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransformationProgram_Statements() {
		return (EReference)transformationProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTupleSelector() {
		return tupleSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTupleSelector_Region() {
		return (EReference)tupleSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTupleSelector_Selectors() {
		return (EReference)tupleSelectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentExpression() {
		return contentExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeExpression() {
		return nodeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeExpressionPrimitive() {
		return nodeExpressionPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeExpressionOr() {
		return nodeExpressionOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeExpressionOr_Left() {
		return (EReference)nodeExpressionOrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeExpressionOr_Right() {
		return (EReference)nodeExpressionOrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeExpressionAnd() {
		return nodeExpressionAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeExpressionAnd_Left() {
		return (EReference)nodeExpressionAndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeExpressionAnd_Right() {
		return (EReference)nodeExpressionAndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeExpressionNot() {
		return nodeExpressionNotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeExpressionNot_Region() {
		return (EReference)nodeExpressionNotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeExpressionPath() {
		return nodeExpressionPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeExpressionPath_Region() {
		return (EReference)nodeExpressionPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeExpressionPath_Path() {
		return (EReference)nodeExpressionPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeExpressionToken() {
		return nodeExpressionTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeExpressionToken_Token() {
		return (EReference)nodeExpressionTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeExpressionCoordinate() {
		return nodeExpressionCoordinateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeExpressionCoordinate_Row() {
		return (EAttribute)nodeExpressionCoordinateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeExpressionCoordinate_Column() {
		return (EAttribute)nodeExpressionCoordinateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeExpressionComplete() {
		return nodeExpressionCompleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeExpressionRowCol() {
		return nodeExpressionRowColEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeExpressionRowCol_Mode() {
		return (EAttribute)nodeExpressionRowColEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeExpressionRowColCoordinate() {
		return nodeExpressionRowColCoordinateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeExpressionRowColCoordinate_Index() {
		return (EAttribute)nodeExpressionRowColCoordinateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeExpressionRowColCoordinate_Row() {
		return (EAttribute)nodeExpressionRowColCoordinateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeExpressionRowColCoordinate_Column() {
		return (EAttribute)nodeExpressionRowColCoordinateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeExpressionRowColToken() {
		return nodeExpressionRowColTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeExpressionRowColToken_Token() {
		return (EReference)nodeExpressionRowColTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeExpressionRowColString() {
		return nodeExpressionRowColStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeExpressionRowColString_String() {
		return (EAttribute)nodeExpressionRowColStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeExpressionRowColLast() {
		return nodeExpressionRowColLastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeExpressionComparison() {
		return nodeExpressionComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeExpressionComparison_Comp() {
		return (EAttribute)nodeExpressionComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeExpressionComparison_Value() {
		return (EAttribute)nodeExpressionComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeExpressionComparison_Type() {
		return (EReference)nodeExpressionComparisonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeExpressionComparison_TypeSpecifier() {
		return (EReference)nodeExpressionComparisonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeExpressionComparisonR2L() {
		return nodeExpressionComparisonR2LEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPathExpressionPredicate() {
		return pathExpressionPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathExpressionPredicate_Path() {
		return (EReference)pathExpressionPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPathExpression() {
		return pathExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPathExpressionList() {
		return pathExpressionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathExpressionList_First() {
		return (EReference)pathExpressionListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathExpressionList_Rest() {
		return (EReference)pathExpressionListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPathExpressionStar() {
		return pathExpressionStarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathExpressionStar_Element() {
		return (EReference)pathExpressionStarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPathExpressionPlus() {
		return pathExpressionPlusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathExpressionPlus_Element() {
		return (EReference)pathExpressionPlusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPathExpressionOption() {
		return pathExpressionOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathExpressionOption_Element() {
		return (EReference)pathExpressionOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPathExpressionOr() {
		return pathExpressionOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathExpressionOr_Left() {
		return (EReference)pathExpressionOrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathExpressionOr_Right() {
		return (EReference)pathExpressionOrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPathExpressionStep() {
		return pathExpressionStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPathExpressionStep_Axes() {
		return (EAttribute)pathExpressionStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathExpressionStep_Node_test() {
		return (EReference)pathExpressionStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathExpressionStep_Predicate() {
		return (EReference)pathExpressionStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentExpressionOr() {
		return contentExpressionOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentExpressionOr_Left() {
		return (EReference)contentExpressionOrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentExpressionOr_Right() {
		return (EReference)contentExpressionOrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentExpressionList() {
		return contentExpressionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentExpressionList_First() {
		return (EReference)contentExpressionListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentExpressionList_Rest() {
		return (EReference)contentExpressionListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentExpressionStar() {
		return contentExpressionStarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentExpressionStar_Element() {
		return (EReference)contentExpressionStarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentExpressionPlus() {
		return contentExpressionPlusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentExpressionPlus_Element() {
		return (EReference)contentExpressionPlusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentExpressionOption() {
		return contentExpressionOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentExpressionOption_Element() {
		return (EReference)contentExpressionOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentExpressionToken() {
		return contentExpressionTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentExpressionToken_Token() {
		return (EReference)contentExpressionTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentExpressionString() {
		return contentExpressionStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentExpressionString_String() {
		return (EAttribute)contentExpressionStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentExpressionANY() {
		return contentExpressionANYEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentExpressionEMPTY() {
		return contentExpressionEMPTYEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentExpressionSOMETHING() {
		return contentExpressionSOMETHINGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentExpressionComparison() {
		return contentExpressionComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentExpressionComparison_Comp() {
		return (EAttribute)contentExpressionComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentExpressionComparison_Value() {
		return (EAttribute)contentExpressionComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentExpressionComparison_Type() {
		return (EReference)contentExpressionComparisonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentExpressionComparison_TypeSpecifier() {
		return (EReference)contentExpressionComparisonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentExpressionComparison_Path() {
		return (EReference)contentExpressionComparisonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentExpressionComparisonR2L() {
		return contentExpressionComparisonR2LEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTLContentExpressionList() {
		return tlContentExpressionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLContentExpressionList_List() {
		return (EReference)tlContentExpressionListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeSpecifier() {
		return typeSpecifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompoundTypeSpecifier() {
		return compoundTypeSpecifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompoundTypeSpecifier_Subtype() {
		return (EReference)compoundTypeSpecifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundTypeSpecifier_Index() {
		return (EAttribute)compoundTypeSpecifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListTypeSpecifier() {
		return listTypeSpecifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListTypeSpecifier_Index() {
		return (EAttribute)listTypeSpecifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTLElement() {
		return tlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTLVariable() {
		return tlVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTLOutputPrimitive() {
		return tlOutputPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTLOutputConstant() {
		return tlOutputConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLOutputConstant_Text() {
		return (EAttribute)tlOutputConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTLOutputVariable() {
		return tlOutputVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLOutputVariable_Variable() {
		return (EReference)tlOutputVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLOutputVariable_TypeSpecifier() {
		return (EReference)tlOutputVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTLStatement() {
		return tlStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTLOutput() {
		return tlOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLOutput_Primitives() {
		return (EReference)tlOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTLLoop() {
		return tlLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLLoop_Variables() {
		return (EReference)tlLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLLoop_Region() {
		return (EReference)tlLoopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLLoop_ContentExpression() {
		return (EReference)tlLoopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLLoop_Statements() {
		return (EReference)tlLoopEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLLoop_Mode() {
		return (EAttribute)tlLoopEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLIf() {
		return tlIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLIf_Condition() {
		return (EReference)tlIfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLIf_IfBlock() {
		return (EReference)tlIfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLIf_ElseBlock() {
		return (EReference)tlIfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLBoolExpr() {
		return tlBoolExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLBoolExprEmpty() {
		return tlBoolExprEmptyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLBoolExprEmpty_Region() {
		return (EReference)tlBoolExprEmptyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLBoolExprNot() {
		return tlBoolExprNotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLBoolExprNot_Expression() {
		return (EReference)tlBoolExprNotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComparator() {
		return comparatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRowCol() {
		return rowColEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getValidationMode() {
		return validationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTLLoopMode() {
		return tlLoopModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SculptFactory getSculptFactory() {
		return (SculptFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sculptEClass = createEClass(SCULPT);
		createEReference(sculptEClass, SCULPT__DELIMITER);
		createEReference(sculptEClass, SCULPT__TOKENS);
		createEReference(sculptEClass, SCULPT__CONSTRAINTS);
		createEReference(sculptEClass, SCULPT__REGION_TOKENS);
		createEReference(sculptEClass, SCULPT__TYPES);
		createEReference(sculptEClass, SCULPT__TRANSFORMATION_PROGRAM);

		schemaElementEClass = createEClass(SCHEMA_ELEMENT);

		delimitersEClass = createEClass(DELIMITERS);
		createEAttribute(delimitersEClass, DELIMITERS__ROW_DELIM);
		createEAttribute(delimitersEClass, DELIMITERS__COL_DELIM);
		createEAttribute(delimitersEClass, DELIMITERS__LIST_DELIM);

		abstractTokenEClass = createEClass(ABSTRACT_TOKEN);
		createEAttribute(abstractTokenEClass, ABSTRACT_TOKEN__NAME);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__DEFAULT_VALUE);
		createEAttribute(typeEClass, TYPE__EMPTY_VALUE);

		atomicTypeEClass = createEClass(ATOMIC_TYPE);
		createEAttribute(atomicTypeEClass, ATOMIC_TYPE__FORMAT);
		createEAttribute(atomicTypeEClass, ATOMIC_TYPE__MIN_LENGTH);
		createEAttribute(atomicTypeEClass, ATOMIC_TYPE__MAX_LENGTH);
		createEAttribute(atomicTypeEClass, ATOMIC_TYPE__BASE);
		createEAttribute(atomicTypeEClass, ATOMIC_TYPE__GROUP_CHAR);
		createEAttribute(atomicTypeEClass, ATOMIC_TYPE__DECIMAL_CHAR);
		createEAttribute(atomicTypeEClass, ATOMIC_TYPE__MINIMUM);
		createEAttribute(atomicTypeEClass, ATOMIC_TYPE__MAXIMUM);
		createEAttribute(atomicTypeEClass, ATOMIC_TYPE__MIN_EXCLUSIVE);
		createEAttribute(atomicTypeEClass, ATOMIC_TYPE__MAX_EXCLUSIVE);
		createEAttribute(atomicTypeEClass, ATOMIC_TYPE__LENGTH);

		compoundTypeEClass = createEClass(COMPOUND_TYPE);
		createEReference(compoundTypeEClass, COMPOUND_TYPE__PRIMITIVES);

		listTypeEClass = createEClass(LIST_TYPE);
		createEAttribute(listTypeEClass, LIST_TYPE__SEPARATOR);
		createEAttribute(listTypeEClass, LIST_TYPE__MIN_ELEMENTS);
		createEAttribute(listTypeEClass, LIST_TYPE__MAX_ELEMENTS);
		createEReference(listTypeEClass, LIST_TYPE__BASE);

		compoundTypePrimitiveEClass = createEClass(COMPOUND_TYPE_PRIMITIVE);
		createEAttribute(compoundTypePrimitiveEClass, COMPOUND_TYPE_PRIMITIVE__TEXT);
		createEReference(compoundTypePrimitiveEClass, COMPOUND_TYPE_PRIMITIVE__TYPE);

		tokenEClass = createEClass(TOKEN);
		createEAttribute(tokenEClass, TOKEN__TOKEN_REGEX);

		regionTokenEClass = createEClass(REGION_TOKEN);
		createEReference(regionTokenEClass, REGION_TOKEN__REGION);

		constraintEClass = createEClass(CONSTRAINT);

		contentConstraintEClass = createEClass(CONTENT_CONSTRAINT);
		createEReference(contentConstraintEClass, CONTENT_CONSTRAINT__REGION);
		createEReference(contentConstraintEClass, CONTENT_CONSTRAINT__CONTENT_EXPRESSION);
		createEAttribute(contentConstraintEClass, CONTENT_CONSTRAINT__VALIDATION_MODE);

		relationConstraintEClass = createEClass(RELATION_CONSTRAINT);
		createEReference(relationConstraintEClass, RELATION_CONSTRAINT__TUPLE_SELECTOR);

		primaryKeyConstraintEClass = createEClass(PRIMARY_KEY_CONSTRAINT);
		createEAttribute(primaryKeyConstraintEClass, PRIMARY_KEY_CONSTRAINT__NAME);

		foreignKeyConstraintEClass = createEClass(FOREIGN_KEY_CONSTRAINT);
		createEReference(foreignKeyConstraintEClass, FOREIGN_KEY_CONSTRAINT__REFERENCED_RELATION);

		transformationProgramEClass = createEClass(TRANSFORMATION_PROGRAM);
		createEReference(transformationProgramEClass, TRANSFORMATION_PROGRAM__DELIMITER);
		createEReference(transformationProgramEClass, TRANSFORMATION_PROGRAM__STATEMENTS);

		tupleSelectorEClass = createEClass(TUPLE_SELECTOR);
		createEReference(tupleSelectorEClass, TUPLE_SELECTOR__REGION);
		createEReference(tupleSelectorEClass, TUPLE_SELECTOR__SELECTORS);

		nodeExpressionEClass = createEClass(NODE_EXPRESSION);

		nodeExpressionPrimitiveEClass = createEClass(NODE_EXPRESSION_PRIMITIVE);

		nodeExpressionOrEClass = createEClass(NODE_EXPRESSION_OR);
		createEReference(nodeExpressionOrEClass, NODE_EXPRESSION_OR__LEFT);
		createEReference(nodeExpressionOrEClass, NODE_EXPRESSION_OR__RIGHT);

		nodeExpressionAndEClass = createEClass(NODE_EXPRESSION_AND);
		createEReference(nodeExpressionAndEClass, NODE_EXPRESSION_AND__LEFT);
		createEReference(nodeExpressionAndEClass, NODE_EXPRESSION_AND__RIGHT);

		nodeExpressionNotEClass = createEClass(NODE_EXPRESSION_NOT);
		createEReference(nodeExpressionNotEClass, NODE_EXPRESSION_NOT__REGION);

		nodeExpressionPathEClass = createEClass(NODE_EXPRESSION_PATH);
		createEReference(nodeExpressionPathEClass, NODE_EXPRESSION_PATH__REGION);
		createEReference(nodeExpressionPathEClass, NODE_EXPRESSION_PATH__PATH);

		nodeExpressionTokenEClass = createEClass(NODE_EXPRESSION_TOKEN);
		createEReference(nodeExpressionTokenEClass, NODE_EXPRESSION_TOKEN__TOKEN);

		nodeExpressionCoordinateEClass = createEClass(NODE_EXPRESSION_COORDINATE);
		createEAttribute(nodeExpressionCoordinateEClass, NODE_EXPRESSION_COORDINATE__ROW);
		createEAttribute(nodeExpressionCoordinateEClass, NODE_EXPRESSION_COORDINATE__COLUMN);

		nodeExpressionCompleteEClass = createEClass(NODE_EXPRESSION_COMPLETE);

		nodeExpressionRowColEClass = createEClass(NODE_EXPRESSION_ROW_COL);
		createEAttribute(nodeExpressionRowColEClass, NODE_EXPRESSION_ROW_COL__MODE);

		nodeExpressionRowColCoordinateEClass = createEClass(NODE_EXPRESSION_ROW_COL_COORDINATE);
		createEAttribute(nodeExpressionRowColCoordinateEClass, NODE_EXPRESSION_ROW_COL_COORDINATE__INDEX);
		createEAttribute(nodeExpressionRowColCoordinateEClass, NODE_EXPRESSION_ROW_COL_COORDINATE__ROW);
		createEAttribute(nodeExpressionRowColCoordinateEClass, NODE_EXPRESSION_ROW_COL_COORDINATE__COLUMN);

		nodeExpressionRowColTokenEClass = createEClass(NODE_EXPRESSION_ROW_COL_TOKEN);
		createEReference(nodeExpressionRowColTokenEClass, NODE_EXPRESSION_ROW_COL_TOKEN__TOKEN);

		nodeExpressionRowColStringEClass = createEClass(NODE_EXPRESSION_ROW_COL_STRING);
		createEAttribute(nodeExpressionRowColStringEClass, NODE_EXPRESSION_ROW_COL_STRING__STRING);

		nodeExpressionRowColLastEClass = createEClass(NODE_EXPRESSION_ROW_COL_LAST);

		nodeExpressionComparisonEClass = createEClass(NODE_EXPRESSION_COMPARISON);
		createEAttribute(nodeExpressionComparisonEClass, NODE_EXPRESSION_COMPARISON__COMP);
		createEAttribute(nodeExpressionComparisonEClass, NODE_EXPRESSION_COMPARISON__VALUE);
		createEReference(nodeExpressionComparisonEClass, NODE_EXPRESSION_COMPARISON__TYPE);
		createEReference(nodeExpressionComparisonEClass, NODE_EXPRESSION_COMPARISON__TYPE_SPECIFIER);

		nodeExpressionComparisonR2LEClass = createEClass(NODE_EXPRESSION_COMPARISON_R2L);

		pathExpressionPredicateEClass = createEClass(PATH_EXPRESSION_PREDICATE);
		createEReference(pathExpressionPredicateEClass, PATH_EXPRESSION_PREDICATE__PATH);

		pathExpressionEClass = createEClass(PATH_EXPRESSION);

		pathExpressionListEClass = createEClass(PATH_EXPRESSION_LIST);
		createEReference(pathExpressionListEClass, PATH_EXPRESSION_LIST__FIRST);
		createEReference(pathExpressionListEClass, PATH_EXPRESSION_LIST__REST);

		pathExpressionStarEClass = createEClass(PATH_EXPRESSION_STAR);
		createEReference(pathExpressionStarEClass, PATH_EXPRESSION_STAR__ELEMENT);

		pathExpressionPlusEClass = createEClass(PATH_EXPRESSION_PLUS);
		createEReference(pathExpressionPlusEClass, PATH_EXPRESSION_PLUS__ELEMENT);

		pathExpressionOptionEClass = createEClass(PATH_EXPRESSION_OPTION);
		createEReference(pathExpressionOptionEClass, PATH_EXPRESSION_OPTION__ELEMENT);

		pathExpressionOrEClass = createEClass(PATH_EXPRESSION_OR);
		createEReference(pathExpressionOrEClass, PATH_EXPRESSION_OR__LEFT);
		createEReference(pathExpressionOrEClass, PATH_EXPRESSION_OR__RIGHT);

		pathExpressionStepEClass = createEClass(PATH_EXPRESSION_STEP);
		createEAttribute(pathExpressionStepEClass, PATH_EXPRESSION_STEP__AXES);
		createEReference(pathExpressionStepEClass, PATH_EXPRESSION_STEP__NODE_TEST);
		createEReference(pathExpressionStepEClass, PATH_EXPRESSION_STEP__PREDICATE);

		contentExpressionEClass = createEClass(CONTENT_EXPRESSION);

		contentExpressionOrEClass = createEClass(CONTENT_EXPRESSION_OR);
		createEReference(contentExpressionOrEClass, CONTENT_EXPRESSION_OR__LEFT);
		createEReference(contentExpressionOrEClass, CONTENT_EXPRESSION_OR__RIGHT);

		contentExpressionListEClass = createEClass(CONTENT_EXPRESSION_LIST);
		createEReference(contentExpressionListEClass, CONTENT_EXPRESSION_LIST__FIRST);
		createEReference(contentExpressionListEClass, CONTENT_EXPRESSION_LIST__REST);

		contentExpressionStarEClass = createEClass(CONTENT_EXPRESSION_STAR);
		createEReference(contentExpressionStarEClass, CONTENT_EXPRESSION_STAR__ELEMENT);

		contentExpressionPlusEClass = createEClass(CONTENT_EXPRESSION_PLUS);
		createEReference(contentExpressionPlusEClass, CONTENT_EXPRESSION_PLUS__ELEMENT);

		contentExpressionOptionEClass = createEClass(CONTENT_EXPRESSION_OPTION);
		createEReference(contentExpressionOptionEClass, CONTENT_EXPRESSION_OPTION__ELEMENT);

		contentExpressionTokenEClass = createEClass(CONTENT_EXPRESSION_TOKEN);
		createEReference(contentExpressionTokenEClass, CONTENT_EXPRESSION_TOKEN__TOKEN);

		contentExpressionStringEClass = createEClass(CONTENT_EXPRESSION_STRING);
		createEAttribute(contentExpressionStringEClass, CONTENT_EXPRESSION_STRING__STRING);

		contentExpressionANYEClass = createEClass(CONTENT_EXPRESSION_ANY);

		contentExpressionEMPTYEClass = createEClass(CONTENT_EXPRESSION_EMPTY);

		contentExpressionSOMETHINGEClass = createEClass(CONTENT_EXPRESSION_SOMETHING);

		contentExpressionComparisonEClass = createEClass(CONTENT_EXPRESSION_COMPARISON);
		createEAttribute(contentExpressionComparisonEClass, CONTENT_EXPRESSION_COMPARISON__COMP);
		createEAttribute(contentExpressionComparisonEClass, CONTENT_EXPRESSION_COMPARISON__VALUE);
		createEReference(contentExpressionComparisonEClass, CONTENT_EXPRESSION_COMPARISON__TYPE);
		createEReference(contentExpressionComparisonEClass, CONTENT_EXPRESSION_COMPARISON__TYPE_SPECIFIER);
		createEReference(contentExpressionComparisonEClass, CONTENT_EXPRESSION_COMPARISON__PATH);

		contentExpressionComparisonR2LEClass = createEClass(CONTENT_EXPRESSION_COMPARISON_R2L);

		tlContentExpressionListEClass = createEClass(TL_CONTENT_EXPRESSION_LIST);
		createEReference(tlContentExpressionListEClass, TL_CONTENT_EXPRESSION_LIST__LIST);

		typeSpecifierEClass = createEClass(TYPE_SPECIFIER);

		compoundTypeSpecifierEClass = createEClass(COMPOUND_TYPE_SPECIFIER);
		createEReference(compoundTypeSpecifierEClass, COMPOUND_TYPE_SPECIFIER__SUBTYPE);
		createEAttribute(compoundTypeSpecifierEClass, COMPOUND_TYPE_SPECIFIER__INDEX);

		listTypeSpecifierEClass = createEClass(LIST_TYPE_SPECIFIER);
		createEAttribute(listTypeSpecifierEClass, LIST_TYPE_SPECIFIER__INDEX);

		tlElementEClass = createEClass(TL_ELEMENT);

		tlVariableEClass = createEClass(TL_VARIABLE);

		tlOutputPrimitiveEClass = createEClass(TL_OUTPUT_PRIMITIVE);

		tlOutputConstantEClass = createEClass(TL_OUTPUT_CONSTANT);
		createEAttribute(tlOutputConstantEClass, TL_OUTPUT_CONSTANT__TEXT);

		tlOutputVariableEClass = createEClass(TL_OUTPUT_VARIABLE);
		createEReference(tlOutputVariableEClass, TL_OUTPUT_VARIABLE__VARIABLE);
		createEReference(tlOutputVariableEClass, TL_OUTPUT_VARIABLE__TYPE_SPECIFIER);

		tlStatementEClass = createEClass(TL_STATEMENT);

		tlOutputEClass = createEClass(TL_OUTPUT);
		createEReference(tlOutputEClass, TL_OUTPUT__PRIMITIVES);

		tlLoopEClass = createEClass(TL_LOOP);
		createEReference(tlLoopEClass, TL_LOOP__VARIABLES);
		createEReference(tlLoopEClass, TL_LOOP__REGION);
		createEReference(tlLoopEClass, TL_LOOP__CONTENT_EXPRESSION);
		createEReference(tlLoopEClass, TL_LOOP__STATEMENTS);
		createEAttribute(tlLoopEClass, TL_LOOP__MODE);

		tlIfEClass = createEClass(TL_IF);
		createEReference(tlIfEClass, TL_IF__CONDITION);
		createEReference(tlIfEClass, TL_IF__IF_BLOCK);
		createEReference(tlIfEClass, TL_IF__ELSE_BLOCK);

		tlBoolExprEClass = createEClass(TL_BOOL_EXPR);

		tlBoolExprEmptyEClass = createEClass(TL_BOOL_EXPR_EMPTY);
		createEReference(tlBoolExprEmptyEClass, TL_BOOL_EXPR_EMPTY__REGION);

		tlBoolExprNotEClass = createEClass(TL_BOOL_EXPR_NOT);
		createEReference(tlBoolExprNotEClass, TL_BOOL_EXPR_NOT__EXPRESSION);

		// Create enums
		comparatorEEnum = createEEnum(COMPARATOR);
		rowColEEnum = createEEnum(ROW_COL);
		validationModeEEnum = createEEnum(VALIDATION_MODE);
		tlLoopModeEEnum = createEEnum(TL_LOOP_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		delimitersEClass.getESuperTypes().add(this.getSchemaElement());
		abstractTokenEClass.getESuperTypes().add(this.getSchemaElement());
		typeEClass.getESuperTypes().add(this.getToken());
		atomicTypeEClass.getESuperTypes().add(this.getType());
		compoundTypeEClass.getESuperTypes().add(this.getType());
		listTypeEClass.getESuperTypes().add(this.getType());
		compoundTypePrimitiveEClass.getESuperTypes().add(this.getSchemaElement());
		tokenEClass.getESuperTypes().add(this.getAbstractToken());
		regionTokenEClass.getESuperTypes().add(this.getAbstractToken());
		constraintEClass.getESuperTypes().add(this.getSchemaElement());
		contentConstraintEClass.getESuperTypes().add(this.getConstraint());
		relationConstraintEClass.getESuperTypes().add(this.getConstraint());
		primaryKeyConstraintEClass.getESuperTypes().add(this.getRelationConstraint());
		foreignKeyConstraintEClass.getESuperTypes().add(this.getRelationConstraint());
		transformationProgramEClass.getESuperTypes().add(this.getSchemaElement());
		nodeExpressionEClass.getESuperTypes().add(this.getPathExpression());
		nodeExpressionPrimitiveEClass.getESuperTypes().add(this.getNodeExpression());
		nodeExpressionOrEClass.getESuperTypes().add(this.getNodeExpression());
		nodeExpressionAndEClass.getESuperTypes().add(this.getNodeExpression());
		nodeExpressionNotEClass.getESuperTypes().add(this.getNodeExpression());
		nodeExpressionPathEClass.getESuperTypes().add(this.getNodeExpression());
		nodeExpressionTokenEClass.getESuperTypes().add(this.getNodeExpressionPrimitive());
		nodeExpressionCoordinateEClass.getESuperTypes().add(this.getNodeExpressionPrimitive());
		nodeExpressionCompleteEClass.getESuperTypes().add(this.getNodeExpressionPrimitive());
		nodeExpressionRowColEClass.getESuperTypes().add(this.getNodeExpressionPrimitive());
		nodeExpressionRowColCoordinateEClass.getESuperTypes().add(this.getNodeExpressionRowCol());
		nodeExpressionRowColTokenEClass.getESuperTypes().add(this.getNodeExpressionRowCol());
		nodeExpressionRowColStringEClass.getESuperTypes().add(this.getNodeExpressionRowCol());
		nodeExpressionRowColLastEClass.getESuperTypes().add(this.getNodeExpressionRowCol());
		nodeExpressionComparisonEClass.getESuperTypes().add(this.getNodeExpression());
		nodeExpressionComparisonR2LEClass.getESuperTypes().add(this.getNodeExpressionComparison());
		pathExpressionPredicateEClass.getESuperTypes().add(this.getNodeExpression());
		pathExpressionEClass.getESuperTypes().add(this.getSchemaElement());
		pathExpressionListEClass.getESuperTypes().add(this.getPathExpression());
		pathExpressionStarEClass.getESuperTypes().add(this.getPathExpression());
		pathExpressionPlusEClass.getESuperTypes().add(this.getPathExpression());
		pathExpressionOptionEClass.getESuperTypes().add(this.getPathExpression());
		pathExpressionOrEClass.getESuperTypes().add(this.getPathExpression());
		pathExpressionStepEClass.getESuperTypes().add(this.getPathExpression());
		contentExpressionEClass.getESuperTypes().add(this.getSchemaElement());
		contentExpressionOrEClass.getESuperTypes().add(this.getContentExpression());
		contentExpressionListEClass.getESuperTypes().add(this.getContentExpression());
		contentExpressionStarEClass.getESuperTypes().add(this.getContentExpression());
		contentExpressionPlusEClass.getESuperTypes().add(this.getContentExpression());
		contentExpressionOptionEClass.getESuperTypes().add(this.getContentExpression());
		contentExpressionTokenEClass.getESuperTypes().add(this.getContentExpression());
		contentExpressionStringEClass.getESuperTypes().add(this.getContentExpression());
		contentExpressionANYEClass.getESuperTypes().add(this.getContentExpression());
		contentExpressionEMPTYEClass.getESuperTypes().add(this.getContentExpression());
		contentExpressionSOMETHINGEClass.getESuperTypes().add(this.getContentExpression());
		contentExpressionComparisonEClass.getESuperTypes().add(this.getContentExpression());
		contentExpressionComparisonR2LEClass.getESuperTypes().add(this.getContentExpressionComparison());
		tlContentExpressionListEClass.getESuperTypes().add(this.getContentExpression());
		typeSpecifierEClass.getESuperTypes().add(this.getSchemaElement());
		compoundTypeSpecifierEClass.getESuperTypes().add(this.getTypeSpecifier());
		listTypeSpecifierEClass.getESuperTypes().add(this.getTypeSpecifier());
		tlElementEClass.getESuperTypes().add(this.getSchemaElement());
		tlVariableEClass.getESuperTypes().add(this.getAbstractToken());
		tlOutputPrimitiveEClass.getESuperTypes().add(this.getTLElement());
		tlOutputConstantEClass.getESuperTypes().add(this.getTLOutputPrimitive());
		tlOutputVariableEClass.getESuperTypes().add(this.getTLOutputPrimitive());
		tlStatementEClass.getESuperTypes().add(this.getTLElement());
		tlOutputEClass.getESuperTypes().add(this.getTLStatement());
		tlLoopEClass.getESuperTypes().add(this.getTLStatement());
		tlIfEClass.getESuperTypes().add(this.getTLStatement());
		tlBoolExprEClass.getESuperTypes().add(this.getTLElement());
		tlBoolExprEmptyEClass.getESuperTypes().add(this.getTLBoolExpr());
		tlBoolExprNotEClass.getESuperTypes().add(this.getTLBoolExpr());

		// Initialize classes and features; add operations and parameters
		initEClass(sculptEClass, Sculpt.class, "Sculpt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSculpt_Delimiter(), this.getDelimiters(), null, "delimiter", null, 0, 1, Sculpt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSculpt_Tokens(), this.getToken(), null, "tokens", null, 0, -1, Sculpt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSculpt_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, Sculpt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSculpt_RegionTokens(), this.getRegionToken(), null, "regionTokens", null, 0, -1, Sculpt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSculpt_Types(), this.getType(), null, "types", null, 0, -1, Sculpt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSculpt_TransformationProgram(), this.getTransformationProgram(), null, "transformationProgram", null, 0, 1, Sculpt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaElementEClass, SchemaElement.class, "SchemaElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(schemaElementEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(delimitersEClass, Delimiters.class, "Delimiters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelimiters_RowDelim(), ecorePackage.getEString(), "rowDelim", null, 1, 1, Delimiters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelimiters_ColDelim(), ecorePackage.getEString(), "colDelim", null, 1, 1, Delimiters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelimiters_ListDelim(), ecorePackage.getEString(), "listDelim", null, 0, 1, Delimiters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractTokenEClass, AbstractToken.class, "AbstractToken", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractToken_Name(), ecorePackage.getEString(), "name", null, 1, 1, AbstractToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_EmptyValue(), ecorePackage.getEString(), "emptyValue", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicTypeEClass, AtomicType.class, "AtomicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomicType_Format(), ecorePackage.getEString(), "format", null, 0, 1, AtomicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicType_MinLength(), ecorePackage.getEIntegerObject(), "minLength", null, 0, 1, AtomicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicType_MaxLength(), ecorePackage.getEIntegerObject(), "maxLength", null, 0, 1, AtomicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicType_Base(), ecorePackage.getEString(), "base", null, 1, 1, AtomicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicType_GroupChar(), ecorePackage.getEString(), "groupChar", null, 0, 1, AtomicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicType_DecimalChar(), ecorePackage.getEString(), "decimalChar", null, 0, 1, AtomicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicType_Minimum(), ecorePackage.getEString(), "minimum", null, 0, 1, AtomicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicType_Maximum(), ecorePackage.getEString(), "maximum", null, 0, 1, AtomicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicType_MinExclusive(), ecorePackage.getEString(), "minExclusive", null, 0, 1, AtomicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicType_MaxExclusive(), ecorePackage.getEString(), "maxExclusive", null, 0, 1, AtomicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicType_Length(), ecorePackage.getEIntegerObject(), "length", null, 0, 1, AtomicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundTypeEClass, CompoundType.class, "CompoundType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundType_Primitives(), this.getCompoundTypePrimitive(), null, "primitives", null, 1, -1, CompoundType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listTypeEClass, ListType.class, "ListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListType_Separator(), ecorePackage.getEString(), "separator", " ", 0, 1, ListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListType_MinElements(), ecorePackage.getEIntegerObject(), "minElements", "0", 0, 1, ListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListType_MaxElements(), ecorePackage.getEIntegerObject(), "maxElements", "-1", 0, 1, ListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListType_Base(), this.getType(), null, "base", null, 1, 1, ListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundTypePrimitiveEClass, CompoundTypePrimitive.class, "CompoundTypePrimitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompoundTypePrimitive_Text(), ecorePackage.getEString(), "text", null, 0, 1, CompoundTypePrimitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundTypePrimitive_Type(), this.getType(), null, "type", null, 0, 1, CompoundTypePrimitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToken_TokenRegex(), ecorePackage.getEString(), "tokenRegex", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionTokenEClass, RegionToken.class, "RegionToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegionToken_Region(), this.getNodeExpression(), null, "region", null, 1, 1, RegionToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentConstraintEClass, ContentConstraint.class, "ContentConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentConstraint_Region(), this.getNodeExpression(), null, "region", null, 1, 1, ContentConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentConstraint_ContentExpression(), this.getContentExpression(), null, "contentExpression", null, 1, 1, ContentConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentConstraint_ValidationMode(), this.getValidationMode(), "validationMode", null, 1, 1, ContentConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(contentConstraintEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(relationConstraintEClass, RelationConstraint.class, "RelationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationConstraint_TupleSelector(), this.getTupleSelector(), null, "tupleSelector", null, 1, 1, RelationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primaryKeyConstraintEClass, PrimaryKeyConstraint.class, "PrimaryKeyConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimaryKeyConstraint_Name(), ecorePackage.getEString(), "name", null, 1, 1, PrimaryKeyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foreignKeyConstraintEClass, ForeignKeyConstraint.class, "ForeignKeyConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForeignKeyConstraint_ReferencedRelation(), this.getPrimaryKeyConstraint(), null, "referencedRelation", null, 1, 1, ForeignKeyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationProgramEClass, TransformationProgram.class, "TransformationProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformationProgram_Delimiter(), this.getDelimiters(), null, "delimiter", null, 0, 1, TransformationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationProgram_Statements(), this.getTLStatement(), null, "statements", null, 1, -1, TransformationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tupleSelectorEClass, TupleSelector.class, "TupleSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTupleSelector_Region(), this.getNodeExpression(), null, "region", null, 1, 1, TupleSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTupleSelector_Selectors(), this.getPathExpression(), null, "selectors", null, 1, -1, TupleSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeExpressionEClass, NodeExpression.class, "NodeExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(nodeExpressionEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nodeExpressionPrimitiveEClass, NodeExpressionPrimitive.class, "NodeExpressionPrimitive", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeExpressionOrEClass, NodeExpressionOr.class, "NodeExpressionOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeExpressionOr_Left(), this.getNodeExpression(), null, "left", null, 1, 1, NodeExpressionOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeExpressionOr_Right(), this.getNodeExpression(), null, "right", null, 1, 1, NodeExpressionOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeExpressionAndEClass, NodeExpressionAnd.class, "NodeExpressionAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeExpressionAnd_Left(), this.getNodeExpression(), null, "left", null, 1, 1, NodeExpressionAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeExpressionAnd_Right(), this.getNodeExpression(), null, "right", null, 1, 1, NodeExpressionAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeExpressionNotEClass, NodeExpressionNot.class, "NodeExpressionNot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeExpressionNot_Region(), this.getNodeExpression(), null, "region", null, 1, 1, NodeExpressionNot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeExpressionPathEClass, NodeExpressionPath.class, "NodeExpressionPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeExpressionPath_Region(), this.getNodeExpression(), null, "region", null, 0, 1, NodeExpressionPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeExpressionPath_Path(), this.getPathExpression(), null, "path", null, 1, 1, NodeExpressionPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeExpressionTokenEClass, NodeExpressionToken.class, "NodeExpressionToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeExpressionToken_Token(), this.getAbstractToken(), null, "token", null, 1, 1, NodeExpressionToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeExpressionCoordinateEClass, NodeExpressionCoordinate.class, "NodeExpressionCoordinate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeExpressionCoordinate_Row(), ecorePackage.getEInt(), "row", null, 1, 1, NodeExpressionCoordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeExpressionCoordinate_Column(), ecorePackage.getEInt(), "column", null, 1, 1, NodeExpressionCoordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeExpressionCompleteEClass, NodeExpressionComplete.class, "NodeExpressionComplete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeExpressionRowColEClass, NodeExpressionRowCol.class, "NodeExpressionRowCol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeExpressionRowCol_Mode(), this.getRowCol(), "mode", null, 1, 1, NodeExpressionRowCol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeExpressionRowColCoordinateEClass, NodeExpressionRowColCoordinate.class, "NodeExpressionRowColCoordinate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeExpressionRowColCoordinate_Index(), ecorePackage.getEInt(), "index", "1", 0, 1, NodeExpressionRowColCoordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeExpressionRowColCoordinate_Row(), ecorePackage.getEInt(), "row", "1", 1, 1, NodeExpressionRowColCoordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeExpressionRowColCoordinate_Column(), ecorePackage.getEInt(), "column", "1", 1, 1, NodeExpressionRowColCoordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeExpressionRowColTokenEClass, NodeExpressionRowColToken.class, "NodeExpressionRowColToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeExpressionRowColToken_Token(), this.getToken(), null, "token", null, 1, 1, NodeExpressionRowColToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeExpressionRowColStringEClass, NodeExpressionRowColString.class, "NodeExpressionRowColString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeExpressionRowColString_String(), ecorePackage.getEString(), "string", null, 1, 1, NodeExpressionRowColString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeExpressionRowColLastEClass, NodeExpressionRowColLast.class, "NodeExpressionRowColLast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeExpressionComparisonEClass, NodeExpressionComparison.class, "NodeExpressionComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeExpressionComparison_Comp(), this.getComparator(), "comp", null, 1, 1, NodeExpressionComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeExpressionComparison_Value(), ecorePackage.getEString(), "value", null, 1, 1, NodeExpressionComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeExpressionComparison_Type(), this.getType(), null, "type", null, 1, 1, NodeExpressionComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeExpressionComparison_TypeSpecifier(), this.getTypeSpecifier(), null, "typeSpecifier", null, 0, -1, NodeExpressionComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeExpressionComparisonR2LEClass, NodeExpressionComparisonR2L.class, "NodeExpressionComparisonR2L", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pathExpressionPredicateEClass, PathExpressionPredicate.class, "PathExpressionPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathExpressionPredicate_Path(), this.getPathExpression(), null, "path", null, 1, 1, PathExpressionPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathExpressionEClass, PathExpression.class, "PathExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(pathExpressionEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pathExpressionListEClass, PathExpressionList.class, "PathExpressionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathExpressionList_First(), this.getPathExpression(), null, "first", null, 1, 1, PathExpressionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathExpressionList_Rest(), this.getPathExpression(), null, "rest", null, 0, -1, PathExpressionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathExpressionStarEClass, PathExpressionStar.class, "PathExpressionStar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathExpressionStar_Element(), this.getPathExpression(), null, "element", null, 1, 1, PathExpressionStar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathExpressionPlusEClass, PathExpressionPlus.class, "PathExpressionPlus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathExpressionPlus_Element(), this.getPathExpression(), null, "element", null, 1, 1, PathExpressionPlus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathExpressionOptionEClass, PathExpressionOption.class, "PathExpressionOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathExpressionOption_Element(), this.getPathExpression(), null, "element", null, 1, 1, PathExpressionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathExpressionOrEClass, PathExpressionOr.class, "PathExpressionOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathExpressionOr_Left(), this.getPathExpression(), null, "left", null, 1, 1, PathExpressionOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathExpressionOr_Right(), this.getPathExpression(), null, "right", null, 1, 1, PathExpressionOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathExpressionStepEClass, PathExpressionStep.class, "PathExpressionStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPathExpressionStep_Axes(), ecorePackage.getEString(), "axes", null, 1, 1, PathExpressionStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathExpressionStep_Node_test(), this.getNodeExpressionPrimitive(), null, "node_test", null, 0, 1, PathExpressionStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathExpressionStep_Predicate(), this.getNodeExpression(), null, "predicate", null, 0, 1, PathExpressionStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentExpressionEClass, ContentExpression.class, "ContentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(contentExpressionEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contentExpressionOrEClass, ContentExpressionOr.class, "ContentExpressionOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentExpressionOr_Left(), this.getContentExpression(), null, "left", null, 1, 1, ContentExpressionOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentExpressionOr_Right(), this.getContentExpression(), null, "right", null, 1, 1, ContentExpressionOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentExpressionListEClass, ContentExpressionList.class, "ContentExpressionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentExpressionList_First(), this.getContentExpression(), null, "first", null, 1, 1, ContentExpressionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentExpressionList_Rest(), this.getContentExpression(), null, "rest", null, 1, 1, ContentExpressionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentExpressionStarEClass, ContentExpressionStar.class, "ContentExpressionStar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentExpressionStar_Element(), this.getContentExpression(), null, "element", null, 1, 1, ContentExpressionStar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentExpressionPlusEClass, ContentExpressionPlus.class, "ContentExpressionPlus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentExpressionPlus_Element(), this.getContentExpression(), null, "element", null, 1, 1, ContentExpressionPlus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentExpressionOptionEClass, ContentExpressionOption.class, "ContentExpressionOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentExpressionOption_Element(), this.getContentExpression(), null, "element", null, 1, 1, ContentExpressionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentExpressionTokenEClass, ContentExpressionToken.class, "ContentExpressionToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentExpressionToken_Token(), this.getToken(), null, "token", null, 1, 1, ContentExpressionToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentExpressionStringEClass, ContentExpressionString.class, "ContentExpressionString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentExpressionString_String(), ecorePackage.getEString(), "string", null, 1, 1, ContentExpressionString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentExpressionANYEClass, ContentExpressionANY.class, "ContentExpressionANY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentExpressionEMPTYEClass, ContentExpressionEMPTY.class, "ContentExpressionEMPTY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentExpressionSOMETHINGEClass, ContentExpressionSOMETHING.class, "ContentExpressionSOMETHING", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentExpressionComparisonEClass, ContentExpressionComparison.class, "ContentExpressionComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentExpressionComparison_Comp(), this.getComparator(), "comp", null, 1, 1, ContentExpressionComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentExpressionComparison_Value(), ecorePackage.getEString(), "value", null, 0, 1, ContentExpressionComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentExpressionComparison_Type(), this.getType(), null, "type", null, 1, 1, ContentExpressionComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentExpressionComparison_TypeSpecifier(), this.getTypeSpecifier(), null, "typeSpecifier", null, 0, -1, ContentExpressionComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentExpressionComparison_Path(), this.getPathExpression(), null, "path", null, 0, 1, ContentExpressionComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentExpressionComparisonR2LEClass, ContentExpressionComparisonR2L.class, "ContentExpressionComparisonR2L", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tlContentExpressionListEClass, TLContentExpressionList.class, "TLContentExpressionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTLContentExpressionList_List(), this.getContentExpression(), null, "list", null, 1, -1, TLContentExpressionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeSpecifierEClass, TypeSpecifier.class, "TypeSpecifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compoundTypeSpecifierEClass, CompoundTypeSpecifier.class, "CompoundTypeSpecifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundTypeSpecifier_Subtype(), this.getType(), null, "subtype", null, 1, 1, CompoundTypeSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompoundTypeSpecifier_Index(), ecorePackage.getEInt(), "index", "0", 0, 1, CompoundTypeSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listTypeSpecifierEClass, ListTypeSpecifier.class, "ListTypeSpecifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListTypeSpecifier_Index(), ecorePackage.getEInt(), "index", "0", 1, 1, ListTypeSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tlElementEClass, TLElement.class, "TLElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tlVariableEClass, TLVariable.class, "TLVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tlOutputPrimitiveEClass, TLOutputPrimitive.class, "TLOutputPrimitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tlOutputConstantEClass, TLOutputConstant.class, "TLOutputConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTLOutputConstant_Text(), ecorePackage.getEString(), "text", null, 1, 1, TLOutputConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tlOutputVariableEClass, TLOutputVariable.class, "TLOutputVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTLOutputVariable_Variable(), this.getTLVariable(), null, "variable", null, 1, 1, TLOutputVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTLOutputVariable_TypeSpecifier(), this.getTypeSpecifier(), null, "typeSpecifier", null, 0, -1, TLOutputVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tlStatementEClass, TLStatement.class, "TLStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tlOutputEClass, TLOutput.class, "TLOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTLOutput_Primitives(), this.getTLOutputPrimitive(), null, "primitives", null, 0, -1, TLOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tlLoopEClass, TLLoop.class, "TLLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTLLoop_Variables(), this.getTLVariable(), null, "variables", null, 1, -1, TLLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTLLoop_Region(), this.getNodeExpression(), null, "region", null, 1, 1, TLLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTLLoop_ContentExpression(), this.getTLContentExpressionList(), null, "contentExpression", null, 0, 1, TLLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTLLoop_Statements(), this.getTLStatement(), null, "statements", null, 0, -1, TLLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLLoop_Mode(), this.getTLLoopMode(), "mode", null, 1, 1, TLLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tlIfEClass, TLIf.class, "TLIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTLIf_Condition(), this.getTLBoolExpr(), null, "condition", null, 1, 1, TLIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTLIf_IfBlock(), this.getTLStatement(), null, "ifBlock", null, 0, -1, TLIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTLIf_ElseBlock(), this.getTLStatement(), null, "elseBlock", null, 0, -1, TLIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tlBoolExprEClass, TLBoolExpr.class, "TLBoolExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tlBoolExprEmptyEClass, TLBoolExprEmpty.class, "TLBoolExprEmpty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTLBoolExprEmpty_Region(), this.getNodeExpression(), null, "region", null, 1, 1, TLBoolExprEmpty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tlBoolExprNotEClass, TLBoolExprNot.class, "TLBoolExprNot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTLBoolExprNot_Expression(), this.getTLBoolExpr(), null, "expression", null, 1, 1, TLBoolExprNot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(comparatorEEnum, Comparator.class, "Comparator");
		addEEnumLiteral(comparatorEEnum, Comparator.LT);
		addEEnumLiteral(comparatorEEnum, Comparator.LTEQ);
		addEEnumLiteral(comparatorEEnum, Comparator.EQ);
		addEEnumLiteral(comparatorEEnum, Comparator.GT);
		addEEnumLiteral(comparatorEEnum, Comparator.GTEQ);
		addEEnumLiteral(comparatorEEnum, Comparator.NEQ);

		initEEnum(rowColEEnum, RowCol.class, "RowCol");
		addEEnumLiteral(rowColEEnum, RowCol.ROW);
		addEEnumLiteral(rowColEEnum, RowCol.COL);

		initEEnum(validationModeEEnum, ValidationMode.class, "ValidationMode");
		addEEnumLiteral(validationModeEEnum, ValidationMode.COMPLETE);
		addEEnumLiteral(validationModeEEnum, ValidationMode.ROW_BY_ROW);
		addEEnumLiteral(validationModeEEnum, ValidationMode.COLUMN_BY_COLUMN);

		initEEnum(tlLoopModeEEnum, TLLoopMode.class, "TLLoopMode");
		addEEnumLiteral(tlLoopModeEEnum, TLLoopMode.UNSPECIFIED);
		addEEnumLiteral(tlLoopModeEEnum, TLLoopMode.COMPLETE);
		addEEnumLiteral(tlLoopModeEEnum, TLLoopMode.SPLIT);

		// Create resource
		createResource(eNS_URI);
	}

} //SculptPackageImpl

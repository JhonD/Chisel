/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.impl;

import java.util.BitSet;
import java.util.HashSet;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import de.ubt.ai7.csv_validator.caches.dataStructures.NamedElement;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresFactory;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage;
import de.ubt.ai7.csv_validator.library.dataStructures.Region;
import de.ubt.ai7.csv_validator.library.parser.Parser;
import de.ubt.ai7.csv_validator.sculpt.SchemaElement;
import de.ubt.ai7.csv_validator.sculpt.Token;
import de.ubt.ai7.csv_validator.util.Coordinate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class dataStructuresPackageImpl extends EPackageImpl implements dataStructuresPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedDelimitersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedAbstractTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedContentConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedPrimaryKeyConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedForeignKeyConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedNodeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedRegionTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hashSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedAtomicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedCompoundTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedTLElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedTLPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedTLConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedTLOutputVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedTLVariableBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedTLTypeInspectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedTLStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedTLOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedTLLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedTransformationProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedTLIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachedTLBoolExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType intArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType patternEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bitSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType coordinateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType regionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType schemaElementEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tokenEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType parserEDataType = null;

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
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private dataStructuresPackageImpl() {
		super(eNS_URI, dataStructuresFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link dataStructuresPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static dataStructuresPackage init() {
		if (isInited) return (dataStructuresPackage)EPackage.Registry.INSTANCE.getEPackage(dataStructuresPackage.eNS_URI);

		// Obtain or create and register package
		dataStructuresPackageImpl thedataStructuresPackage = (dataStructuresPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof dataStructuresPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new dataStructuresPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thedataStructuresPackage.createPackageContents();

		// Initialize created meta-data
		thedataStructuresPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thedataStructuresPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(dataStructuresPackage.eNS_URI, thedataStructuresPackage);
		return thedataStructuresPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHashSet() {
		return hashSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedElement() {
		return cachedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCachedElement_Contains() {
		return (EReference)cachedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCachedElement_ContainedIn() {
		return (EReference)cachedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedElement_Region() {
		return (EAttribute)cachedElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedElement_Definition() {
		return (EAttribute)cachedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedElement_SchemaElement() {
		return (EAttribute)cachedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedElement_UntestedRegion() {
		return (EAttribute)cachedElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedDelimiters() {
		return cachedDelimitersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedDelimiters_RowDelim() {
		return (EAttribute)cachedDelimitersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedDelimiters_ColDelim() {
		return (EAttribute)cachedDelimitersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedDelimiters_ListDelim() {
		return (EAttribute)cachedDelimitersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedAbstractToken() {
		return cachedAbstractTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedToken() {
		return cachedTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedToken_Pattern() {
		return (EAttribute)cachedTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedToken_Regex() {
		return (EAttribute)cachedTokenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedConstraint() {
		return cachedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedConstraint_Fulfilled() {
		return (EAttribute)cachedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedContentConstraint() {
		return cachedContentConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedContentConstraint_Automaton() {
		return (EAttribute)cachedContentConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedPrimaryKeyConstraint() {
		return cachedPrimaryKeyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedPrimaryKeyConstraint_TupleCache() {
		return (EAttribute)cachedPrimaryKeyConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedForeignKeyConstraint() {
		return cachedForeignKeyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCachedForeignKeyConstraint_ReferencedRelation() {
		return (EReference)cachedForeignKeyConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedNodeExpression() {
		return cachedNodeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @gen erated
	 */
	@Override
	public EClass getCachedRegionToken() {
		return cachedRegionTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCachedRegionToken_Type() {
		return (EReference)cachedRegionTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedType() {
		return cachedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedType_Values() {
		return (EAttribute)cachedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedAtomicType() {
		return cachedAtomicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedAtomicType_Parser() {
		return (EAttribute)cachedAtomicTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedListType() {
		return cachedListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCachedListType_Type() {
		return (EReference)cachedListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedCompoundType() {
		return cachedCompoundTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCachedCompoundType_Primitives() {
		return (EReference)cachedCompoundTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedCompoundType_CapturingPattern() {
		return (EAttribute)cachedCompoundTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedTLElement() {
		return cachedTLElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedTLPrimitive() {
		return cachedTLPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedTLPrimitive_Text() {
		return (EAttribute)cachedTLPrimitiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCachedTLPrimitive_Token() {
		return (EReference)cachedTLPrimitiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCachedTLPrimitive__Reset() {
		return cachedTLPrimitiveEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedTLConstant() {
		return cachedTLConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedTLOutputVariable() {
		return cachedTLOutputVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCachedTLOutputVariable_Binding() {
		return (EReference)cachedTLOutputVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedTLVariableBinding() {
		return cachedTLVariableBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCachedTLVariableBinding_Token() {
		return (EReference)cachedTLVariableBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCachedTLVariableBinding_PossibleTokens() {
		return (EReference)cachedTLVariableBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedTLVariableBinding_StrictType() {
		return (EAttribute)cachedTLVariableBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedTLVariableBinding_Contents() {
		return (EAttribute)cachedTLVariableBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCachedTLVariableBinding__Reset() {
		return cachedTLVariableBindingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCachedTLVariableBinding__Add__int_String_CachedToken() {
		return cachedTLVariableBindingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCachedTLVariableBinding__SetDefault() {
		return cachedTLVariableBindingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedTLTypeInspector() {
		return cachedTLTypeInspectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedTLTypeInspector_Path() {
		return (EAttribute)cachedTLTypeInspectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCachedTLTypeInspector_Type() {
		return (EReference)cachedTLTypeInspectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedTLStatement() {
		return cachedTLStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedTLOutput() {
		return cachedTLOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCachedTLOutput_Primitives() {
		return (EReference)cachedTLOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedTLLoop() {
		return cachedTLLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCachedTLLoop_Automaton() {
		return (EAttribute)cachedTLLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCachedTLLoop_Statements() {
		return (EReference)cachedTLLoopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCachedTLLoop_Bindings() {
		return (EReference)cachedTLLoopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCachedTransformationProgram() {
		return cachedTransformationProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCachedTransformationProgram_Statements() {
		return (EReference)cachedTransformationProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCachedTransformationProgram_Delimiters() {
		return (EReference)cachedTransformationProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCachedTransformationProgram_TransformedCsv() {
		return (EAttribute)cachedTransformationProgramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCachedTransformationProgram_W3cSchema() {
		return (EAttribute)cachedTransformationProgramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCachedTransformationProgram_Error() {
		return (EAttribute)cachedTransformationProgramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCachedTLIf() {
		return cachedTLIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCachedTLIf_IfBlock() {
		return (EReference)cachedTLIfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCachedTLIf_ElseBlock() {
		return (EReference)cachedTLIfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCachedTLBoolExpr() {
		return cachedTLBoolExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCachedTLBoolExpr_Fulfilled() {
		return (EAttribute)cachedTLBoolExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIntArray() {
		return intArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPattern() {
		return patternEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBitSet() {
		return bitSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCoordinate() {
		return coordinateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRegion() {
		return regionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSchemaElement() {
		return schemaElementEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getToken() {
		return tokenEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getParser() {
		return parserEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public dataStructuresFactory getdataStructuresFactory() {
		return (dataStructuresFactory)getEFactoryInstance();
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
		cachedElementEClass = createEClass(CACHED_ELEMENT);
		createEReference(cachedElementEClass, CACHED_ELEMENT__CONTAINS);
		createEReference(cachedElementEClass, CACHED_ELEMENT__CONTAINED_IN);
		createEAttribute(cachedElementEClass, CACHED_ELEMENT__DEFINITION);
		createEAttribute(cachedElementEClass, CACHED_ELEMENT__SCHEMA_ELEMENT);
		createEAttribute(cachedElementEClass, CACHED_ELEMENT__UNTESTED_REGION);
		createEAttribute(cachedElementEClass, CACHED_ELEMENT__REGION);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		cachedDelimitersEClass = createEClass(CACHED_DELIMITERS);
		createEAttribute(cachedDelimitersEClass, CACHED_DELIMITERS__ROW_DELIM);
		createEAttribute(cachedDelimitersEClass, CACHED_DELIMITERS__COL_DELIM);
		createEAttribute(cachedDelimitersEClass, CACHED_DELIMITERS__LIST_DELIM);

		cachedAbstractTokenEClass = createEClass(CACHED_ABSTRACT_TOKEN);

		cachedTokenEClass = createEClass(CACHED_TOKEN);
		createEAttribute(cachedTokenEClass, CACHED_TOKEN__PATTERN);
		createEAttribute(cachedTokenEClass, CACHED_TOKEN__REGEX);

		cachedConstraintEClass = createEClass(CACHED_CONSTRAINT);
		createEAttribute(cachedConstraintEClass, CACHED_CONSTRAINT__FULFILLED);

		cachedContentConstraintEClass = createEClass(CACHED_CONTENT_CONSTRAINT);
		createEAttribute(cachedContentConstraintEClass, CACHED_CONTENT_CONSTRAINT__AUTOMATON);

		cachedPrimaryKeyConstraintEClass = createEClass(CACHED_PRIMARY_KEY_CONSTRAINT);
		createEAttribute(cachedPrimaryKeyConstraintEClass, CACHED_PRIMARY_KEY_CONSTRAINT__TUPLE_CACHE);

		cachedForeignKeyConstraintEClass = createEClass(CACHED_FOREIGN_KEY_CONSTRAINT);
		createEReference(cachedForeignKeyConstraintEClass, CACHED_FOREIGN_KEY_CONSTRAINT__REFERENCED_RELATION);

		cachedNodeExpressionEClass = createEClass(CACHED_NODE_EXPRESSION);

		cachedRegionTokenEClass = createEClass(CACHED_REGION_TOKEN);
		createEReference(cachedRegionTokenEClass, CACHED_REGION_TOKEN__TYPE);

		cachedTypeEClass = createEClass(CACHED_TYPE);
		createEAttribute(cachedTypeEClass, CACHED_TYPE__VALUES);

		cachedAtomicTypeEClass = createEClass(CACHED_ATOMIC_TYPE);
		createEAttribute(cachedAtomicTypeEClass, CACHED_ATOMIC_TYPE__PARSER);

		cachedListTypeEClass = createEClass(CACHED_LIST_TYPE);
		createEReference(cachedListTypeEClass, CACHED_LIST_TYPE__TYPE);

		cachedCompoundTypeEClass = createEClass(CACHED_COMPOUND_TYPE);
		createEReference(cachedCompoundTypeEClass, CACHED_COMPOUND_TYPE__PRIMITIVES);
		createEAttribute(cachedCompoundTypeEClass, CACHED_COMPOUND_TYPE__CAPTURING_PATTERN);

		cachedTLVariableBindingEClass = createEClass(CACHED_TL_VARIABLE_BINDING);
		createEReference(cachedTLVariableBindingEClass, CACHED_TL_VARIABLE_BINDING__TOKEN);
		createEReference(cachedTLVariableBindingEClass, CACHED_TL_VARIABLE_BINDING__POSSIBLE_TOKENS);
		createEAttribute(cachedTLVariableBindingEClass, CACHED_TL_VARIABLE_BINDING__STRICT_TYPE);
		createEAttribute(cachedTLVariableBindingEClass, CACHED_TL_VARIABLE_BINDING__CONTENTS);
		createEOperation(cachedTLVariableBindingEClass, CACHED_TL_VARIABLE_BINDING___RESET);
		createEOperation(cachedTLVariableBindingEClass, CACHED_TL_VARIABLE_BINDING___ADD__INT_STRING_CACHEDTOKEN);
		createEOperation(cachedTLVariableBindingEClass, CACHED_TL_VARIABLE_BINDING___SET_DEFAULT);

		cachedTLElementEClass = createEClass(CACHED_TL_ELEMENT);

		cachedTLStatementEClass = createEClass(CACHED_TL_STATEMENT);

		cachedTLLoopEClass = createEClass(CACHED_TL_LOOP);
		createEAttribute(cachedTLLoopEClass, CACHED_TL_LOOP__AUTOMATON);
		createEReference(cachedTLLoopEClass, CACHED_TL_LOOP__STATEMENTS);
		createEReference(cachedTLLoopEClass, CACHED_TL_LOOP__BINDINGS);

		cachedTLOutputEClass = createEClass(CACHED_TL_OUTPUT);
		createEReference(cachedTLOutputEClass, CACHED_TL_OUTPUT__PRIMITIVES);

		cachedTLPrimitiveEClass = createEClass(CACHED_TL_PRIMITIVE);
		createEAttribute(cachedTLPrimitiveEClass, CACHED_TL_PRIMITIVE__TEXT);
		createEReference(cachedTLPrimitiveEClass, CACHED_TL_PRIMITIVE__TOKEN);
		createEOperation(cachedTLPrimitiveEClass, CACHED_TL_PRIMITIVE___RESET);

		cachedTLConstantEClass = createEClass(CACHED_TL_CONSTANT);

		cachedTLOutputVariableEClass = createEClass(CACHED_TL_OUTPUT_VARIABLE);
		createEReference(cachedTLOutputVariableEClass, CACHED_TL_OUTPUT_VARIABLE__BINDING);

		cachedTLTypeInspectorEClass = createEClass(CACHED_TL_TYPE_INSPECTOR);
		createEAttribute(cachedTLTypeInspectorEClass, CACHED_TL_TYPE_INSPECTOR__PATH);
		createEReference(cachedTLTypeInspectorEClass, CACHED_TL_TYPE_INSPECTOR__TYPE);

		cachedTransformationProgramEClass = createEClass(CACHED_TRANSFORMATION_PROGRAM);
		createEReference(cachedTransformationProgramEClass, CACHED_TRANSFORMATION_PROGRAM__STATEMENTS);
		createEReference(cachedTransformationProgramEClass, CACHED_TRANSFORMATION_PROGRAM__DELIMITERS);
		createEAttribute(cachedTransformationProgramEClass, CACHED_TRANSFORMATION_PROGRAM__TRANSFORMED_CSV);
		createEAttribute(cachedTransformationProgramEClass, CACHED_TRANSFORMATION_PROGRAM__W3C_SCHEMA);
		createEAttribute(cachedTransformationProgramEClass, CACHED_TRANSFORMATION_PROGRAM__ERROR);

		cachedTLIfEClass = createEClass(CACHED_TL_IF);
		createEReference(cachedTLIfEClass, CACHED_TL_IF__IF_BLOCK);
		createEReference(cachedTLIfEClass, CACHED_TL_IF__ELSE_BLOCK);

		cachedTLBoolExprEClass = createEClass(CACHED_TL_BOOL_EXPR);
		createEAttribute(cachedTLBoolExprEClass, CACHED_TL_BOOL_EXPR__FULFILLED);

		// Create data types
		intArrayEDataType = createEDataType(INT_ARRAY);
		hashSetEDataType = createEDataType(HASH_SET);
		patternEDataType = createEDataType(PATTERN);
		bitSetEDataType = createEDataType(BIT_SET);
		coordinateEDataType = createEDataType(COORDINATE);
		regionEDataType = createEDataType(REGION);
		schemaElementEDataType = createEDataType(SCHEMA_ELEMENT);
		tokenEDataType = createEDataType(TOKEN);
		parserEDataType = createEDataType(PARSER);
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
		addETypeParameter(hashSetEDataType, "E");

		// Set bounds for type parameters

		// Add supertypes to classes
		namedElementEClass.getESuperTypes().add(this.getCachedElement());
		cachedDelimitersEClass.getESuperTypes().add(this.getCachedElement());
		cachedAbstractTokenEClass.getESuperTypes().add(this.getNamedElement());
		cachedTokenEClass.getESuperTypes().add(this.getCachedAbstractToken());
		cachedConstraintEClass.getESuperTypes().add(this.getCachedElement());
		cachedContentConstraintEClass.getESuperTypes().add(this.getCachedConstraint());
		cachedPrimaryKeyConstraintEClass.getESuperTypes().add(this.getCachedConstraint());
		cachedForeignKeyConstraintEClass.getESuperTypes().add(this.getCachedConstraint());
		cachedNodeExpressionEClass.getESuperTypes().add(this.getCachedElement());
		cachedRegionTokenEClass.getESuperTypes().add(this.getCachedAbstractToken());
		cachedTypeEClass.getESuperTypes().add(this.getCachedToken());
		cachedAtomicTypeEClass.getESuperTypes().add(this.getCachedType());
		cachedListTypeEClass.getESuperTypes().add(this.getCachedType());
		cachedCompoundTypeEClass.getESuperTypes().add(this.getCachedType());
		cachedTLVariableBindingEClass.getESuperTypes().add(this.getCachedAbstractToken());
		cachedTLElementEClass.getESuperTypes().add(this.getCachedElement());
		cachedTLStatementEClass.getESuperTypes().add(this.getCachedTLElement());
		cachedTLLoopEClass.getESuperTypes().add(this.getCachedTLStatement());
		cachedTLOutputEClass.getESuperTypes().add(this.getCachedTLStatement());
		cachedTLPrimitiveEClass.getESuperTypes().add(this.getCachedTLElement());
		cachedTLConstantEClass.getESuperTypes().add(this.getCachedTLPrimitive());
		cachedTLOutputVariableEClass.getESuperTypes().add(this.getCachedTLPrimitive());
		cachedTLTypeInspectorEClass.getESuperTypes().add(this.getCachedTLOutputVariable());
		cachedTransformationProgramEClass.getESuperTypes().add(this.getCachedTLElement());
		cachedTLIfEClass.getESuperTypes().add(this.getCachedTLStatement());
		cachedTLBoolExprEClass.getESuperTypes().add(this.getCachedTLElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(cachedElementEClass, CachedElement.class, "CachedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCachedElement_Contains(), this.getCachedElement(), this.getCachedElement_ContainedIn(), "contains", null, 0, -1, CachedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCachedElement_ContainedIn(), this.getCachedElement(), this.getCachedElement_Contains(), "containedIn", null, 0, -1, CachedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCachedElement_Definition(), ecorePackage.getEString(), "definition", null, 1, 1, CachedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCachedElement_SchemaElement(), this.getSchemaElement(), "schemaElement", null, 0, 1, CachedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCachedElement_UntestedRegion(), this.getBitSet(), "untestedRegion", null, 1, 1, CachedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCachedElement_Region(), this.getBitSet(), "region", null, 1, 1, CachedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachedDelimitersEClass, CachedDelimiters.class, "CachedDelimiters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCachedDelimiters_RowDelim(), ecorePackage.getEChar(), "rowDelim", null, 0, 1, CachedDelimiters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCachedDelimiters_ColDelim(), ecorePackage.getEChar(), "colDelim", null, 0, 1, CachedDelimiters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCachedDelimiters_ListDelim(), ecorePackage.getEChar(), "listDelim", null, 0, 1, CachedDelimiters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachedAbstractTokenEClass, CachedAbstractToken.class, "CachedAbstractToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cachedTokenEClass, CachedToken.class, "CachedToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCachedToken_Pattern(), this.getPattern(), "pattern", null, 0, 1, CachedToken.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCachedToken_Regex(), ecorePackage.getEString(), "regex", null, 0, 1, CachedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachedConstraintEClass, CachedConstraint.class, "CachedConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCachedConstraint_Fulfilled(), ecorePackage.getEBooleanObject(), "fulfilled", null, 0, 1, CachedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachedContentConstraintEClass, CachedContentConstraint.class, "CachedContentConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCachedContentConstraint_Automaton(), ecorePackage.getEJavaObject(), "automaton", null, 1, 1, CachedContentConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachedPrimaryKeyConstraintEClass, CachedPrimaryKeyConstraint.class, "CachedPrimaryKeyConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEEList());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getIntArray());
		g2.getETypeArguments().add(g3);
		initEAttribute(getCachedPrimaryKeyConstraint_TupleCache(), g1, "tupleCache", null, 1, 1, CachedPrimaryKeyConstraint.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachedForeignKeyConstraintEClass, CachedForeignKeyConstraint.class, "CachedForeignKeyConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCachedForeignKeyConstraint_ReferencedRelation(), this.getCachedPrimaryKeyConstraint(), null, "referencedRelation", null, 1, 1, CachedForeignKeyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachedNodeExpressionEClass, CachedNodeExpression.class, "CachedNodeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cachedRegionTokenEClass, CachedRegionToken.class, "CachedRegionToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCachedRegionToken_Type(), this.getCachedType(), null, "type", null, 0, 1, CachedRegionToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachedTypeEClass, CachedType.class, "CachedType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEAttribute(getCachedType_Values(), g1, "values", null, 1, 1, CachedType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachedAtomicTypeEClass, CachedAtomicType.class, "CachedAtomicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCachedAtomicType_Parser(), this.getParser(), "parser", null, 1, 1, CachedAtomicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachedListTypeEClass, CachedListType.class, "CachedListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCachedListType_Type(), this.getCachedType(), null, "type", null, 1, 1, CachedListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachedCompoundTypeEClass, CachedCompoundType.class, "CachedCompoundType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCachedCompoundType_Primitives(), this.getCachedType(), null, "primitives", null, 0, -1, CachedCompoundType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCachedCompoundType_CapturingPattern(), this.getPattern(), "capturingPattern", null, 1, 1, CachedCompoundType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachedTLVariableBindingEClass, CachedTLVariableBinding.class, "CachedTLVariableBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCachedTLVariableBinding_Token(), this.getCachedToken(), null, "token", null, 0, 1, CachedTLVariableBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCachedTLVariableBinding_PossibleTokens(), this.getCachedToken(), null, "possibleTokens", null, 0, -1, CachedTLVariableBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCachedTLVariableBinding_StrictType(), ecorePackage.getEBoolean(), "strictType", "false", 1, 1, CachedTLVariableBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCachedTLVariableBinding_Contents(), ecorePackage.getEString(), "contents", null, 0, -1, CachedTLVariableBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCachedTLVariableBinding__Reset(), null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getCachedTLVariableBinding__Add__int_String_CachedToken(), null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "coordinate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "content", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCachedToken(), "token", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCachedTLVariableBinding__SetDefault(), null, "setDefault", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cachedTLElementEClass, CachedTLElement.class, "CachedTLElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cachedTLStatementEClass, CachedTLStatement.class, "CachedTLStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cachedTLLoopEClass, CachedTLLoop.class, "CachedTLLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCachedTLLoop_Automaton(), ecorePackage.getEJavaObject(), "automaton", null, 1, 1, CachedTLLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCachedTLLoop_Statements(), this.getCachedTLStatement(), null, "statements", null, 0, -1, CachedTLLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCachedTLLoop_Bindings(), this.getCachedTLVariableBinding(), null, "bindings", null, 1, -1, CachedTLLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachedTLOutputEClass, CachedTLOutput.class, "CachedTLOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCachedTLOutput_Primitives(), this.getCachedTLPrimitive(), null, "primitives", null, 0, -1, CachedTLOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachedTLPrimitiveEClass, CachedTLPrimitive.class, "CachedTLPrimitive", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCachedTLPrimitive_Text(), ecorePackage.getEString(), "text", null, 0, 1, CachedTLPrimitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCachedTLPrimitive_Token(), this.getCachedToken(), null, "token", null, 0, 1, CachedTLPrimitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCachedTLPrimitive__Reset(), null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cachedTLConstantEClass, CachedTLConstant.class, "CachedTLConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cachedTLOutputVariableEClass, CachedTLOutputVariable.class, "CachedTLOutputVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCachedTLOutputVariable_Binding(), this.getCachedTLVariableBinding(), null, "binding", null, 1, 1, CachedTLOutputVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachedTLTypeInspectorEClass, CachedTLTypeInspector.class, "CachedTLTypeInspector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCachedTLTypeInspector_Path(), this.getIntArray(), "path", null, 1, 1, CachedTLTypeInspector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCachedTLTypeInspector_Type(), this.getCachedType(), null, "type", null, 1, 1, CachedTLTypeInspector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachedTransformationProgramEClass, CachedTransformationProgram.class, "CachedTransformationProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCachedTransformationProgram_Statements(), this.getCachedTLStatement(), null, "statements", null, 1, -1, CachedTransformationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCachedTransformationProgram_Delimiters(), this.getCachedDelimiters(), null, "delimiters", null, 1, 1, CachedTransformationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCachedTransformationProgram_TransformedCsv(), ecorePackage.getEJavaObject(), "transformedCsv", null, 0, 1, CachedTransformationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCachedTransformationProgram_W3cSchema(), ecorePackage.getEJavaObject(), "w3cSchema", null, 0, 1, CachedTransformationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCachedTransformationProgram_Error(), ecorePackage.getEJavaObject(), "error", null, 0, 1, CachedTransformationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachedTLIfEClass, CachedTLIf.class, "CachedTLIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCachedTLIf_IfBlock(), this.getCachedTLStatement(), null, "ifBlock", null, 0, -1, CachedTLIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCachedTLIf_ElseBlock(), this.getCachedTLStatement(), null, "elseBlock", null, 0, -1, CachedTLIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachedTLBoolExprEClass, CachedTLBoolExpr.class, "CachedTLBoolExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCachedTLBoolExpr_Fulfilled(), ecorePackage.getEBooleanObject(), "fulfilled", null, 0, 1, CachedTLBoolExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(intArrayEDataType, int[].class, "IntArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hashSetEDataType, HashSet.class, "HashSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(patternEDataType, Pattern.class, "Pattern", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bitSetEDataType, BitSet.class, "BitSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(coordinateEDataType, Coordinate.class, "Coordinate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(regionEDataType, Region.class, "Region", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(schemaElementEDataType, SchemaElement.class, "SchemaElement", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tokenEDataType, Token.class, "Token", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(parserEDataType, Parser.class, "Parser", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //dataStructuresPackageImpl

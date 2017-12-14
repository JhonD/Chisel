/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.impl;

import de.ubt.ai7.csv_validator.caches.dataStructures.*;
import java.util.BitSet;
import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLConstant;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLElement;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLLoop;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutput;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutputVariable;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLStatement;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLTypeInspector;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedToken;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class dataStructuresFactoryImpl extends EFactoryImpl implements dataStructuresFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static dataStructuresFactory init() {
		try {
			dataStructuresFactory thedataStructuresFactory = (dataStructuresFactory)EPackage.Registry.INSTANCE.getEFactory(dataStructuresPackage.eNS_URI);
			if (thedataStructuresFactory != null) {
				return thedataStructuresFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new dataStructuresFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dataStructuresFactoryImpl() {
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
			case dataStructuresPackage.CACHED_ELEMENT: return createCachedElement();
			case dataStructuresPackage.NAMED_ELEMENT: return createNamedElement();
			case dataStructuresPackage.CACHED_DELIMITERS: return createCachedDelimiters();
			case dataStructuresPackage.CACHED_ABSTRACT_TOKEN: return createCachedAbstractToken();
			case dataStructuresPackage.CACHED_TOKEN: return createCachedToken();
			case dataStructuresPackage.CACHED_CONSTRAINT: return createCachedConstraint();
			case dataStructuresPackage.CACHED_CONTENT_CONSTRAINT: return createCachedContentConstraint();
			case dataStructuresPackage.CACHED_PRIMARY_KEY_CONSTRAINT: return createCachedPrimaryKeyConstraint();
			case dataStructuresPackage.CACHED_FOREIGN_KEY_CONSTRAINT: return createCachedForeignKeyConstraint();
			case dataStructuresPackage.CACHED_NODE_EXPRESSION: return createCachedNodeExpression();
			case dataStructuresPackage.CACHED_REGION_TOKEN: return createCachedRegionToken();
			case dataStructuresPackage.CACHED_ATOMIC_TYPE: return createCachedAtomicType();
			case dataStructuresPackage.CACHED_LIST_TYPE: return createCachedListType();
			case dataStructuresPackage.CACHED_COMPOUND_TYPE: return createCachedCompoundType();
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING: return createCachedTLVariableBinding();
			case dataStructuresPackage.CACHED_TL_ELEMENT: return createCachedTLElement();
			case dataStructuresPackage.CACHED_TL_STATEMENT: return createCachedTLStatement();
			case dataStructuresPackage.CACHED_TL_LOOP: return createCachedTLLoop();
			case dataStructuresPackage.CACHED_TL_OUTPUT: return createCachedTLOutput();
			case dataStructuresPackage.CACHED_TL_CONSTANT: return createCachedTLConstant();
			case dataStructuresPackage.CACHED_TL_OUTPUT_VARIABLE: return createCachedTLOutputVariable();
			case dataStructuresPackage.CACHED_TL_TYPE_INSPECTOR: return createCachedTLTypeInspector();
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM: return createCachedTransformationProgram();
			case dataStructuresPackage.CACHED_TL_IF: return createCachedTLIf();
			case dataStructuresPackage.CACHED_TL_BOOL_EXPR: return createCachedTLBoolExpr();
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
			case dataStructuresPackage.INT_ARRAY:
				return createIntArrayFromString(eDataType, initialValue);
			case dataStructuresPackage.HASH_SET:
				return createHashSetFromString(eDataType, initialValue);
			case dataStructuresPackage.BIT_SET:
				return createBitSetFromString(eDataType, initialValue);
			case dataStructuresPackage.COORDINATE:
				return createCoordinateFromString(eDataType, initialValue);
			case dataStructuresPackage.REGION:
				return createRegionFromString(eDataType, initialValue);
			case dataStructuresPackage.SCHEMA_ELEMENT:
				return createSchemaElementFromString(eDataType, initialValue);
			case dataStructuresPackage.TOKEN:
				return createTokenFromString(eDataType, initialValue);
			case dataStructuresPackage.PARSER:
				return createParserFromString(eDataType, initialValue);
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
			case dataStructuresPackage.INT_ARRAY:
				return convertIntArrayToString(eDataType, instanceValue);
			case dataStructuresPackage.HASH_SET:
				return convertHashSetToString(eDataType, instanceValue);
			case dataStructuresPackage.BIT_SET:
				return convertBitSetToString(eDataType, instanceValue);
			case dataStructuresPackage.COORDINATE:
				return convertCoordinateToString(eDataType, instanceValue);
			case dataStructuresPackage.REGION:
				return convertRegionToString(eDataType, instanceValue);
			case dataStructuresPackage.SCHEMA_ELEMENT:
				return convertSchemaElementToString(eDataType, instanceValue);
			case dataStructuresPackage.TOKEN:
				return convertTokenToString(eDataType, instanceValue);
			case dataStructuresPackage.PARSER:
				return convertParserToString(eDataType, instanceValue);
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
	public CachedElement createCachedElement() {
		CachedElementImpl cachedElement = new CachedElementImpl();
		return cachedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedDelimiters createCachedDelimiters() {
		CachedDelimitersImpl cachedDelimiters = new CachedDelimitersImpl();
		return cachedDelimiters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedAbstractToken createCachedAbstractToken() {
		CachedAbstractTokenImpl cachedAbstractToken = new CachedAbstractTokenImpl();
		return cachedAbstractToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedToken createCachedToken() {
		CachedTokenImpl cachedToken = new CachedTokenImpl();
		return cachedToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedConstraint createCachedConstraint() {
		CachedConstraintImpl cachedConstraint = new CachedConstraintImpl();
		return cachedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedContentConstraint createCachedContentConstraint() {
		CachedContentConstraintImpl cachedContentConstraint = new CachedContentConstraintImpl();
		return cachedContentConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedPrimaryKeyConstraint createCachedPrimaryKeyConstraint() {
		CachedPrimaryKeyConstraintImpl cachedPrimaryKeyConstraint = new CachedPrimaryKeyConstraintImpl();
		return cachedPrimaryKeyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedForeignKeyConstraint createCachedForeignKeyConstraint() {
		CachedForeignKeyConstraintImpl cachedForeignKeyConstraint = new CachedForeignKeyConstraintImpl();
		return cachedForeignKeyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedNodeExpression createCachedNodeExpression() {
		CachedNodeExpressionImpl cachedNodeExpression = new CachedNodeExpressionImpl();
		return cachedNodeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedRegionToken createCachedRegionToken() {
		CachedRegionTokenImpl cachedRegionToken = new CachedRegionTokenImpl();
		return cachedRegionToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedAtomicType createCachedAtomicType() {
		CachedAtomicTypeImpl cachedAtomicType = new CachedAtomicTypeImpl();
		return cachedAtomicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedListType createCachedListType() {
		CachedListTypeImpl cachedListType = new CachedListTypeImpl();
		return cachedListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedCompoundType createCachedCompoundType() {
		CachedCompoundTypeImpl cachedCompoundType = new CachedCompoundTypeImpl();
		return cachedCompoundType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedTLElement createCachedTLElement() {
		CachedTLElementImpl cachedTLElement = new CachedTLElementImpl();
		return cachedTLElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedTLConstant createCachedTLConstant() {
		CachedTLConstantImpl cachedTLConstant = new CachedTLConstantImpl();
		return cachedTLConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedTLOutputVariable createCachedTLOutputVariable() {
		CachedTLOutputVariableImpl cachedTLOutputVariable = new CachedTLOutputVariableImpl();
		return cachedTLOutputVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedTLVariableBinding createCachedTLVariableBinding() {
		CachedTLVariableBindingImpl cachedTLVariableBinding = new CachedTLVariableBindingImpl();
		return cachedTLVariableBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedTLTypeInspector createCachedTLTypeInspector() {
		CachedTLTypeInspectorImpl cachedTLTypeInspector = new CachedTLTypeInspectorImpl();
		return cachedTLTypeInspector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedTLStatement createCachedTLStatement() {
		CachedTLStatementImpl cachedTLStatement = new CachedTLStatementImpl();
		return cachedTLStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedTLOutput createCachedTLOutput() {
		CachedTLOutputImpl cachedTLOutput = new CachedTLOutputImpl();
		return cachedTLOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedTLLoop createCachedTLLoop() {
		CachedTLLoopImpl cachedTLLoop = new CachedTLLoopImpl();
		return cachedTLLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedTransformationProgram createCachedTransformationProgram() {
		CachedTransformationProgramImpl cachedTransformationProgram = new CachedTransformationProgramImpl();
		return cachedTransformationProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CachedTLIf createCachedTLIf() {
		CachedTLIfImpl cachedTLIf = new CachedTLIfImpl();
		return cachedTLIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CachedTLBoolExpr createCachedTLBoolExpr() {
		CachedTLBoolExprImpl cachedTLBoolExpr = new CachedTLBoolExprImpl();
		return cachedTLBoolExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int[] createIntArrayFromString(EDataType eDataType, String initialValue) {
		return (int[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashSet<?> createHashSetFromString(EDataType eDataType, String initialValue) {
		return (HashSet<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHashSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitSet createBitSetFromString(EDataType eDataType, String initialValue) {
		return (BitSet)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBitSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate createCoordinateFromString(EDataType eDataType, String initialValue) {
		return (Coordinate)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoordinateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegionFromString(EDataType eDataType, String initialValue) {
		return (Region)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaElement createSchemaElementFromString(EDataType eDataType, String initialValue) {
		return (SchemaElement)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchemaElementToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createTokenFromString(EDataType eDataType, String initialValue) {
		return (Token)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTokenToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parser createParserFromString(EDataType eDataType, String initialValue) {
		return (Parser)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParserToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public dataStructuresPackage getdataStructuresPackage() {
		return (dataStructuresPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static dataStructuresPackage getPackage() {
		return dataStructuresPackage.eINSTANCE;
	}

} //dataStructuresFactoryImpl

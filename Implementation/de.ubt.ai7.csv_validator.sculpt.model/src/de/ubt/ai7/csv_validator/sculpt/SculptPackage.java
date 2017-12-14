/**
 */
package de.ubt.ai7.csv_validator.sculpt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.ubt.ai7.csv_validator.sculpt.SculptFactory
 * @model kind="package"
 * @generated
 */
public interface SculptPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sculpt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ubt.de/ai7/csv_validator/Sculpt/Model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sculpt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SculptPackage eINSTANCE = de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.SculptImpl <em>Sculpt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getSculpt()
	 * @generated
	 */
	int SCULPT = 0;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPT__DELIMITER = 0;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPT__TOKENS = 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPT__CONSTRAINTS = 2;

	/**
	 * The feature id for the '<em><b>Region Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPT__REGION_TOKENS = 3;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPT__TYPES = 4;

	/**
	 * The feature id for the '<em><b>Transformation Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPT__TRANSFORMATION_PROGRAM = 5;

	/**
	 * The number of structural features of the '<em>Sculpt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.SchemaElementImpl <em>Schema Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SchemaElementImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getSchemaElement()
	 * @generated
	 */
	int SCHEMA_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Schema Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.DelimitersImpl <em>Delimiters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.DelimitersImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getDelimiters()
	 * @generated
	 */
	int DELIMITERS = 2;

	/**
	 * The feature id for the '<em><b>Row Delim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIMITERS__ROW_DELIM = SCHEMA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Col Delim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIMITERS__COL_DELIM = SCHEMA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Delim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIMITERS__LIST_DELIM = SCHEMA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Delimiters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIMITERS_FEATURE_COUNT = SCHEMA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.AbstractTokenImpl <em>Abstract Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.AbstractTokenImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getAbstractToken()
	 * @generated
	 */
	int ABSTRACT_TOKEN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOKEN__NAME = SCHEMA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOKEN_FEATURE_COUNT = SCHEMA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.TokenImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__NAME = ABSTRACT_TOKEN__NAME;

	/**
	 * The feature id for the '<em><b>Token Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__TOKEN_REGEX = ABSTRACT_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = ABSTRACT_TOKEN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.ConstraintImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 11;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionImpl <em>Path Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getPathExpression()
	 * @generated
	 */
	int PATH_EXPRESSION = 35;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionListImpl <em>Path Expression List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionListImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getPathExpressionList()
	 * @generated
	 */
	int PATH_EXPRESSION_LIST = 36;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.ValidationMode <em>Validation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.ValidationMode
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getValidationMode()
	 * @generated
	 */
	int VALIDATION_MODE = 73;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.TLLoopMode <em>TL Loop Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.TLLoopMode
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLLoopMode()
	 * @generated
	 */
	int TL_LOOP_MODE = 74;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.Comparator <em>Comparator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.Comparator
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getComparator()
	 * @generated
	 */
	int COMPARATOR = 71;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.RowCol <em>Row Col</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.RowCol
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getRowCol()
	 * @generated
	 */
	int ROW_COL = 72;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionImpl <em>Content Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpression()
	 * @generated
	 */
	int CONTENT_EXPRESSION = 42;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionImpl <em>Node Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpression()
	 * @generated
	 */
	int NODE_EXPRESSION = 18;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionPrimitiveImpl <em>Node Expression Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionPrimitiveImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionPrimitive()
	 * @generated
	 */
	int NODE_EXPRESSION_PRIMITIVE = 19;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionOrImpl <em>Node Expression Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionOrImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionOr()
	 * @generated
	 */
	int NODE_EXPRESSION_OR = 20;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionAndImpl <em>Node Expression And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionAndImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionAnd()
	 * @generated
	 */
	int NODE_EXPRESSION_AND = 21;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionNotImpl <em>Node Expression Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionNotImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionNot()
	 * @generated
	 */
	int NODE_EXPRESSION_NOT = 22;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionPathImpl <em>Node Expression Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionPathImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionPath()
	 * @generated
	 */
	int NODE_EXPRESSION_PATH = 23;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionCoordinateImpl <em>Node Expression Coordinate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionCoordinateImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionCoordinate()
	 * @generated
	 */
	int NODE_EXPRESSION_COORDINATE = 25;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionTokenImpl <em>Node Expression Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionTokenImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionToken()
	 * @generated
	 */
	int NODE_EXPRESSION_TOKEN = 24;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionCompleteImpl <em>Node Expression Complete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionCompleteImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionComplete()
	 * @generated
	 */
	int NODE_EXPRESSION_COMPLETE = 26;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionPredicateImpl <em>Path Expression Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionPredicateImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getPathExpressionPredicate()
	 * @generated
	 */
	int PATH_EXPRESSION_PREDICATE = 34;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionStarImpl <em>Path Expression Star</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionStarImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getPathExpressionStar()
	 * @generated
	 */
	int PATH_EXPRESSION_STAR = 37;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionPlusImpl <em>Path Expression Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionPlusImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getPathExpressionPlus()
	 * @generated
	 */
	int PATH_EXPRESSION_PLUS = 38;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionOptionImpl <em>Path Expression Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionOptionImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getPathExpressionOption()
	 * @generated
	 */
	int PATH_EXPRESSION_OPTION = 39;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionOrImpl <em>Path Expression Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionOrImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getPathExpressionOr()
	 * @generated
	 */
	int PATH_EXPRESSION_OR = 40;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionStepImpl <em>Path Expression Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionStepImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getPathExpressionStep()
	 * @generated
	 */
	int PATH_EXPRESSION_STEP = 41;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionOrImpl <em>Content Expression Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionOrImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionOr()
	 * @generated
	 */
	int CONTENT_EXPRESSION_OR = 43;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionListImpl <em>Content Expression List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionListImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionList()
	 * @generated
	 */
	int CONTENT_EXPRESSION_LIST = 44;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionStarImpl <em>Content Expression Star</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionStarImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionStar()
	 * @generated
	 */
	int CONTENT_EXPRESSION_STAR = 45;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionPlusImpl <em>Content Expression Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionPlusImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionPlus()
	 * @generated
	 */
	int CONTENT_EXPRESSION_PLUS = 46;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionOptionImpl <em>Content Expression Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionOptionImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionOption()
	 * @generated
	 */
	int CONTENT_EXPRESSION_OPTION = 47;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionTokenImpl <em>Content Expression Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionTokenImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionToken()
	 * @generated
	 */
	int CONTENT_EXPRESSION_TOKEN = 48;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionStringImpl <em>Content Expression String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionStringImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionString()
	 * @generated
	 */
	int CONTENT_EXPRESSION_STRING = 49;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionANYImpl <em>Content Expression ANY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionANYImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionANY()
	 * @generated
	 */
	int CONTENT_EXPRESSION_ANY = 50;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionEMPTYImpl <em>Content Expression EMPTY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionEMPTYImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionEMPTY()
	 * @generated
	 */
	int CONTENT_EXPRESSION_EMPTY = 51;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionSOMETHINGImpl <em>Content Expression SOMETHING</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionSOMETHINGImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionSOMETHING()
	 * @generated
	 */
	int CONTENT_EXPRESSION_SOMETHING = 52;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.RegionTokenImpl <em>Region Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.RegionTokenImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getRegionToken()
	 * @generated
	 */
	int REGION_TOKEN = 10;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.TypeImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = TOKEN__NAME;

	/**
	 * The feature id for the '<em><b>Token Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TOKEN_REGEX = TOKEN__TOKEN_REGEX;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DEFAULT_VALUE = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Empty Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__EMPTY_VALUE = TOKEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.AtomicTypeImpl <em>Atomic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.AtomicTypeImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getAtomicType()
	 * @generated
	 */
	int ATOMIC_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Token Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TYPE__TOKEN_REGEX = TYPE__TOKEN_REGEX;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TYPE__DEFAULT_VALUE = TYPE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Empty Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TYPE__EMPTY_VALUE = TYPE__EMPTY_VALUE;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TYPE__FORMAT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TYPE__MIN_LENGTH = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TYPE__MAX_LENGTH = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TYPE__BASE = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TYPE__GROUP_CHAR = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Decimal Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TYPE__DECIMAL_CHAR = TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TYPE__MINIMUM = TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TYPE__MAXIMUM = TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TYPE__MIN_EXCLUSIVE = TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TYPE__MAX_EXCLUSIVE = TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TYPE__LENGTH = TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Atomic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.CompoundTypeImpl <em>Compound Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.CompoundTypeImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getCompoundType()
	 * @generated
	 */
	int COMPOUND_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Token Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE__TOKEN_REGEX = TYPE__TOKEN_REGEX;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE__DEFAULT_VALUE = TYPE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Empty Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE__EMPTY_VALUE = TYPE__EMPTY_VALUE;

	/**
	 * The feature id for the '<em><b>Primitives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE__PRIMITIVES = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compound Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ListTypeImpl <em>List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.ListTypeImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getListType()
	 * @generated
	 */
	int LIST_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Token Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__TOKEN_REGEX = TYPE__TOKEN_REGEX;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__DEFAULT_VALUE = TYPE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Empty Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__EMPTY_VALUE = TYPE__EMPTY_VALUE;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__SEPARATOR = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__MIN_ELEMENTS = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__MAX_ELEMENTS = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__BASE = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.CompoundTypePrimitiveImpl <em>Compound Type Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.CompoundTypePrimitiveImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getCompoundTypePrimitive()
	 * @generated
	 */
	int COMPOUND_TYPE_PRIMITIVE = 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE_PRIMITIVE__TEXT = SCHEMA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE_PRIMITIVE__TYPE = SCHEMA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compound Type Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE_PRIMITIVE_FEATURE_COUNT = SCHEMA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TOKEN__NAME = ABSTRACT_TOKEN__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TOKEN__REGION = ABSTRACT_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Region Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TOKEN_FEATURE_COUNT = ABSTRACT_TOKEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = SCHEMA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentConstraintImpl <em>Content Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentConstraintImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentConstraint()
	 * @generated
	 */
	int CONTENT_CONSTRAINT = 12;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_CONSTRAINT__REGION = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_CONSTRAINT__CONTENT_EXPRESSION = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_CONSTRAINT__VALIDATION_MODE = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Content Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.RelationConstraintImpl <em>Relation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.RelationConstraintImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getRelationConstraint()
	 * @generated
	 */
	int RELATION_CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Tuple Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CONSTRAINT__TUPLE_SELECTOR = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.PrimaryKeyConstraintImpl <em>Primary Key Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.PrimaryKeyConstraintImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getPrimaryKeyConstraint()
	 * @generated
	 */
	int PRIMARY_KEY_CONSTRAINT = 14;

	/**
	 * The feature id for the '<em><b>Tuple Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_CONSTRAINT__TUPLE_SELECTOR = RELATION_CONSTRAINT__TUPLE_SELECTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_CONSTRAINT__NAME = RELATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primary Key Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_CONSTRAINT_FEATURE_COUNT = RELATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ForeignKeyConstraintImpl <em>Foreign Key Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.ForeignKeyConstraintImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getForeignKeyConstraint()
	 * @generated
	 */
	int FOREIGN_KEY_CONSTRAINT = 15;

	/**
	 * The feature id for the '<em><b>Tuple Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT__TUPLE_SELECTOR = RELATION_CONSTRAINT__TUPLE_SELECTOR;

	/**
	 * The feature id for the '<em><b>Referenced Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT__REFERENCED_RELATION = RELATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Foreign Key Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT_FEATURE_COUNT = RELATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TransformationProgramImpl <em>Transformation Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.TransformationProgramImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTransformationProgram()
	 * @generated
	 */
	int TRANSFORMATION_PROGRAM = 16;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_PROGRAM__DELIMITER = SCHEMA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_PROGRAM__STATEMENTS = SCHEMA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transformation Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_PROGRAM_FEATURE_COUNT = SCHEMA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TupleSelectorImpl <em>Tuple Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.TupleSelectorImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTupleSelector()
	 * @generated
	 */
	int TUPLE_SELECTOR = 17;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_SELECTOR__REGION = 0;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_SELECTOR__SELECTORS = 1;

	/**
	 * The number of structural features of the '<em>Tuple Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_SELECTOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionComparisonImpl <em>Node Expression Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionComparisonImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionComparison()
	 * @generated
	 */
	int NODE_EXPRESSION_COMPARISON = 32;

	/**
	 * The number of structural features of the '<em>Path Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_FEATURE_COUNT = SCHEMA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_FEATURE_COUNT = PATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Expression Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_PRIMITIVE_FEATURE_COUNT = NODE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_OR__LEFT = NODE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_OR__RIGHT = NODE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Expression Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_OR_FEATURE_COUNT = NODE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_AND__LEFT = NODE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_AND__RIGHT = NODE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Expression And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_AND_FEATURE_COUNT = NODE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_NOT__REGION = NODE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Expression Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_NOT_FEATURE_COUNT = NODE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_PATH__REGION = NODE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_PATH__PATH = NODE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Expression Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_PATH_FEATURE_COUNT = NODE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_TOKEN__TOKEN = NODE_EXPRESSION_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Expression Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_TOKEN_FEATURE_COUNT = NODE_EXPRESSION_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_COORDINATE__ROW = NODE_EXPRESSION_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_COORDINATE__COLUMN = NODE_EXPRESSION_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Expression Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_COORDINATE_FEATURE_COUNT = NODE_EXPRESSION_PRIMITIVE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node Expression Complete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_COMPLETE_FEATURE_COUNT = NODE_EXPRESSION_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColImpl <em>Node Expression Row Col</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionRowCol()
	 * @generated
	 */
	int NODE_EXPRESSION_ROW_COL = 27;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_ROW_COL__MODE = NODE_EXPRESSION_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Expression Row Col</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_ROW_COL_FEATURE_COUNT = NODE_EXPRESSION_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColCoordinateImpl <em>Node Expression Row Col Coordinate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColCoordinateImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionRowColCoordinate()
	 * @generated
	 */
	int NODE_EXPRESSION_ROW_COL_COORDINATE = 28;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_ROW_COL_COORDINATE__MODE = NODE_EXPRESSION_ROW_COL__MODE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_ROW_COL_COORDINATE__INDEX = NODE_EXPRESSION_ROW_COL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_ROW_COL_COORDINATE__ROW = NODE_EXPRESSION_ROW_COL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_ROW_COL_COORDINATE__COLUMN = NODE_EXPRESSION_ROW_COL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node Expression Row Col Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_ROW_COL_COORDINATE_FEATURE_COUNT = NODE_EXPRESSION_ROW_COL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColTokenImpl <em>Node Expression Row Col Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColTokenImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionRowColToken()
	 * @generated
	 */
	int NODE_EXPRESSION_ROW_COL_TOKEN = 29;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_ROW_COL_TOKEN__MODE = NODE_EXPRESSION_ROW_COL__MODE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_ROW_COL_TOKEN__TOKEN = NODE_EXPRESSION_ROW_COL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Expression Row Col Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_ROW_COL_TOKEN_FEATURE_COUNT = NODE_EXPRESSION_ROW_COL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColStringImpl <em>Node Expression Row Col String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColStringImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionRowColString()
	 * @generated
	 */
	int NODE_EXPRESSION_ROW_COL_STRING = 30;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_ROW_COL_STRING__MODE = NODE_EXPRESSION_ROW_COL__MODE;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_ROW_COL_STRING__STRING = NODE_EXPRESSION_ROW_COL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Expression Row Col String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_ROW_COL_STRING_FEATURE_COUNT = NODE_EXPRESSION_ROW_COL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColLastImpl <em>Node Expression Row Col Last</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColLastImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionRowColLast()
	 * @generated
	 */
	int NODE_EXPRESSION_ROW_COL_LAST = 31;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_ROW_COL_LAST__MODE = NODE_EXPRESSION_ROW_COL__MODE;

	/**
	 * The number of structural features of the '<em>Node Expression Row Col Last</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_ROW_COL_LAST_FEATURE_COUNT = NODE_EXPRESSION_ROW_COL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_COMPARISON__COMP = NODE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_COMPARISON__VALUE = NODE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_COMPARISON__TYPE = NODE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_COMPARISON__TYPE_SPECIFIER = NODE_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Node Expression Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_COMPARISON_FEATURE_COUNT = NODE_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionComparisonImpl <em>Content Expression Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionComparisonImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionComparison()
	 * @generated
	 */
	int CONTENT_EXPRESSION_COMPARISON = 53;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionComparisonR2LImpl <em>Content Expression Comparison R2L</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionComparisonR2LImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionComparisonR2L()
	 * @generated
	 */
	int CONTENT_EXPRESSION_COMPARISON_R2L = 54;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TypeSpecifierImpl <em>Type Specifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.TypeSpecifierImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTypeSpecifier()
	 * @generated
	 */
	int TYPE_SPECIFIER = 56;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.CompoundTypeSpecifierImpl <em>Compound Type Specifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.CompoundTypeSpecifierImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getCompoundTypeSpecifier()
	 * @generated
	 */
	int COMPOUND_TYPE_SPECIFIER = 57;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ListTypeSpecifierImpl <em>List Type Specifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.ListTypeSpecifierImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getListTypeSpecifier()
	 * @generated
	 */
	int LIST_TYPE_SPECIFIER = 58;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionComparisonR2LImpl <em>Node Expression Comparison R2L</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionComparisonR2LImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionComparisonR2L()
	 * @generated
	 */
	int NODE_EXPRESSION_COMPARISON_R2L = 33;

	/**
	 * The feature id for the '<em><b>Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_COMPARISON_R2L__COMP = NODE_EXPRESSION_COMPARISON__COMP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_COMPARISON_R2L__VALUE = NODE_EXPRESSION_COMPARISON__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_COMPARISON_R2L__TYPE = NODE_EXPRESSION_COMPARISON__TYPE;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_COMPARISON_R2L__TYPE_SPECIFIER = NODE_EXPRESSION_COMPARISON__TYPE_SPECIFIER;

	/**
	 * The number of structural features of the '<em>Node Expression Comparison R2L</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_EXPRESSION_COMPARISON_R2L_FEATURE_COUNT = NODE_EXPRESSION_COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_PREDICATE__PATH = NODE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Path Expression Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_PREDICATE_FEATURE_COUNT = NODE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_LIST__FIRST = PATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_LIST__REST = PATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Expression List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_LIST_FEATURE_COUNT = PATH_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_STAR__ELEMENT = PATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Path Expression Star</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_STAR_FEATURE_COUNT = PATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_PLUS__ELEMENT = PATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Path Expression Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_PLUS_FEATURE_COUNT = PATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_OPTION__ELEMENT = PATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Path Expression Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_OPTION_FEATURE_COUNT = PATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_OR__LEFT = PATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_OR__RIGHT = PATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Expression Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_OR_FEATURE_COUNT = PATH_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Axes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_STEP__AXES = PATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_STEP__NODE_TEST = PATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_STEP__PREDICATE = PATH_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Path Expression Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_STEP_FEATURE_COUNT = PATH_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Content Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_FEATURE_COUNT = SCHEMA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_OR__LEFT = CONTENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_OR__RIGHT = CONTENT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Content Expression Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_OR_FEATURE_COUNT = CONTENT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_LIST__FIRST = CONTENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_LIST__REST = CONTENT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Content Expression List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_LIST_FEATURE_COUNT = CONTENT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_STAR__ELEMENT = CONTENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Expression Star</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_STAR_FEATURE_COUNT = CONTENT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_PLUS__ELEMENT = CONTENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Expression Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_PLUS_FEATURE_COUNT = CONTENT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_OPTION__ELEMENT = CONTENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Expression Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_OPTION_FEATURE_COUNT = CONTENT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_TOKEN__TOKEN = CONTENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Expression Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_TOKEN_FEATURE_COUNT = CONTENT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_STRING__STRING = CONTENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Expression String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_STRING_FEATURE_COUNT = CONTENT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Content Expression ANY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_ANY_FEATURE_COUNT = CONTENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Expression EMPTY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_EMPTY_FEATURE_COUNT = CONTENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Expression SOMETHING</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_SOMETHING_FEATURE_COUNT = CONTENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_COMPARISON__COMP = CONTENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_COMPARISON__VALUE = CONTENT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_COMPARISON__TYPE = CONTENT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_COMPARISON__TYPE_SPECIFIER = CONTENT_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_COMPARISON__PATH = CONTENT_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Content Expression Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_COMPARISON_FEATURE_COUNT = CONTENT_EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_COMPARISON_R2L__COMP = CONTENT_EXPRESSION_COMPARISON__COMP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_COMPARISON_R2L__VALUE = CONTENT_EXPRESSION_COMPARISON__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_COMPARISON_R2L__TYPE = CONTENT_EXPRESSION_COMPARISON__TYPE;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_COMPARISON_R2L__TYPE_SPECIFIER = CONTENT_EXPRESSION_COMPARISON__TYPE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_COMPARISON_R2L__PATH = CONTENT_EXPRESSION_COMPARISON__PATH;

	/**
	 * The number of structural features of the '<em>Content Expression Comparison R2L</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_EXPRESSION_COMPARISON_R2L_FEATURE_COUNT = CONTENT_EXPRESSION_COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLContentExpressionListImpl <em>TL Content Expression List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLContentExpressionListImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLContentExpressionList()
	 * @generated
	 */
	int TL_CONTENT_EXPRESSION_LIST = 55;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_CONTENT_EXPRESSION_LIST__LIST = CONTENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TL Content Expression List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_CONTENT_EXPRESSION_LIST_FEATURE_COUNT = CONTENT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFIER_FEATURE_COUNT = SCHEMA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE_SPECIFIER__SUBTYPE = TYPE_SPECIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE_SPECIFIER__INDEX = TYPE_SPECIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compound Type Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE_SPECIFIER_FEATURE_COUNT = TYPE_SPECIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_SPECIFIER__INDEX = TYPE_SPECIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Type Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_SPECIFIER_FEATURE_COUNT = TYPE_SPECIFIER_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLElementImpl <em>TL Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLElementImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLElement()
	 * @generated
	 */
	int TL_ELEMENT = 59;

	/**
	 * The number of structural features of the '<em>TL Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_ELEMENT_FEATURE_COUNT = SCHEMA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLVariableImpl <em>TL Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLVariableImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLVariable()
	 * @generated
	 */
	int TL_VARIABLE = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_VARIABLE__NAME = ABSTRACT_TOKEN__NAME;

	/**
	 * The number of structural features of the '<em>TL Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_VARIABLE_FEATURE_COUNT = ABSTRACT_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLOutputPrimitiveImpl <em>TL Output Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLOutputPrimitiveImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLOutputPrimitive()
	 * @generated
	 */
	int TL_OUTPUT_PRIMITIVE = 61;

	/**
	 * The number of structural features of the '<em>TL Output Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_OUTPUT_PRIMITIVE_FEATURE_COUNT = TL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLOutputConstantImpl <em>TL Output Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLOutputConstantImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLOutputConstant()
	 * @generated
	 */
	int TL_OUTPUT_CONSTANT = 62;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_OUTPUT_CONSTANT__TEXT = TL_OUTPUT_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TL Output Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_OUTPUT_CONSTANT_FEATURE_COUNT = TL_OUTPUT_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLOutputVariableImpl <em>TL Output Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLOutputVariableImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLOutputVariable()
	 * @generated
	 */
	int TL_OUTPUT_VARIABLE = 63;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_OUTPUT_VARIABLE__VARIABLE = TL_OUTPUT_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_OUTPUT_VARIABLE__TYPE_SPECIFIER = TL_OUTPUT_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TL Output Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_OUTPUT_VARIABLE_FEATURE_COUNT = TL_OUTPUT_PRIMITIVE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLStatementImpl <em>TL Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLStatementImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLStatement()
	 * @generated
	 */
	int TL_STATEMENT = 64;

	/**
	 * The number of structural features of the '<em>TL Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_STATEMENT_FEATURE_COUNT = TL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLOutputImpl <em>TL Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLOutputImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLOutput()
	 * @generated
	 */
	int TL_OUTPUT = 65;

	/**
	 * The feature id for the '<em><b>Primitives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_OUTPUT__PRIMITIVES = TL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TL Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_OUTPUT_FEATURE_COUNT = TL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLLoopImpl <em>TL Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLLoopImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLLoop()
	 * @generated
	 */
	int TL_LOOP = 66;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_LOOP__VARIABLES = TL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_LOOP__REGION = TL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_LOOP__CONTENT_EXPRESSION = TL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_LOOP__STATEMENTS = TL_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_LOOP__MODE = TL_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TL Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_LOOP_FEATURE_COUNT = TL_STATEMENT_FEATURE_COUNT + 5;


	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLIfImpl <em>TL If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLIfImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLIf()
	 * @generated
	 */
	int TL_IF = 67;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_IF__CONDITION = TL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_IF__IF_BLOCK = TL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_IF__ELSE_BLOCK = TL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TL If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_IF_FEATURE_COUNT = TL_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLBoolExprImpl <em>TL Bool Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLBoolExprImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLBoolExpr()
	 * @generated
	 */
	int TL_BOOL_EXPR = 68;

	/**
	 * The number of structural features of the '<em>TL Bool Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_BOOL_EXPR_FEATURE_COUNT = TL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLBoolExprEmptyImpl <em>TL Bool Expr Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLBoolExprEmptyImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLBoolExprEmpty()
	 * @generated
	 */
	int TL_BOOL_EXPR_EMPTY = 69;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_BOOL_EXPR_EMPTY__REGION = TL_BOOL_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TL Bool Expr Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_BOOL_EXPR_EMPTY_FEATURE_COUNT = TL_BOOL_EXPR_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLBoolExprNotImpl <em>TL Bool Expr Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLBoolExprNotImpl
	 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLBoolExprNot()
	 * @generated
	 */
	int TL_BOOL_EXPR_NOT = 70;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_BOOL_EXPR_NOT__EXPRESSION = TL_BOOL_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TL Bool Expr Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_BOOL_EXPR_NOT_FEATURE_COUNT = TL_BOOL_EXPR_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.Sculpt <em>Sculpt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sculpt</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.Sculpt
	 * @generated
	 */
	EClass getSculpt();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.Sculpt#getDelimiter <em>Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delimiter</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.Sculpt#getDelimiter()
	 * @see #getSculpt()
	 * @generated
	 */
	EReference getSculpt_Delimiter();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.sculpt.Sculpt#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.Sculpt#getTokens()
	 * @see #getSculpt()
	 * @generated
	 */
	EReference getSculpt_Tokens();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.sculpt.Sculpt#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.Sculpt#getConstraints()
	 * @see #getSculpt()
	 * @generated
	 */
	EReference getSculpt_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.sculpt.Sculpt#getRegionTokens <em>Region Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Region Tokens</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.Sculpt#getRegionTokens()
	 * @see #getSculpt()
	 * @generated
	 */
	EReference getSculpt_RegionTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.sculpt.Sculpt#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.Sculpt#getTypes()
	 * @see #getSculpt()
	 * @generated
	 */
	EReference getSculpt_Types();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.Sculpt#getTransformationProgram <em>Transformation Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation Program</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.Sculpt#getTransformationProgram()
	 * @see #getSculpt()
	 * @generated
	 */
	EReference getSculpt_TransformationProgram();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.SchemaElement <em>Schema Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Element</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.SchemaElement
	 * @generated
	 */
	EClass getSchemaElement();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.Delimiters <em>Delimiters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delimiters</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.Delimiters
	 * @generated
	 */
	EClass getDelimiters();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.Delimiters#getRowDelim <em>Row Delim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Delim</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.Delimiters#getRowDelim()
	 * @see #getDelimiters()
	 * @generated
	 */
	EAttribute getDelimiters_RowDelim();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.Delimiters#getColDelim <em>Col Delim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col Delim</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.Delimiters#getColDelim()
	 * @see #getDelimiters()
	 * @generated
	 */
	EAttribute getDelimiters_ColDelim();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.Delimiters#getListDelim <em>List Delim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Delim</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.Delimiters#getListDelim()
	 * @see #getDelimiters()
	 * @generated
	 */
	EAttribute getDelimiters_ListDelim();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.Token#getTokenRegex <em>Token Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Regex</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.Token#getTokenRegex()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_TokenRegex();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.ContentConstraint <em>Content Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Constraint</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentConstraint
	 * @generated
	 */
	EClass getContentConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.ContentConstraint#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentConstraint#getRegion()
	 * @see #getContentConstraint()
	 * @generated
	 */
	EReference getContentConstraint_Region();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.ContentConstraint#getContentExpression <em>Content Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Expression</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentConstraint#getContentExpression()
	 * @see #getContentConstraint()
	 * @generated
	 */
	EReference getContentConstraint_ContentExpression();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.ContentConstraint#getValidationMode <em>Validation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Mode</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentConstraint#getValidationMode()
	 * @see #getContentConstraint()
	 * @generated
	 */
	EAttribute getContentConstraint_ValidationMode();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.RelationConstraint <em>Relation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Constraint</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.RelationConstraint
	 * @generated
	 */
	EClass getRelationConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.RelationConstraint#getTupleSelector <em>Tuple Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple Selector</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.RelationConstraint#getTupleSelector()
	 * @see #getRelationConstraint()
	 * @generated
	 */
	EReference getRelationConstraint_TupleSelector();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.PrimaryKeyConstraint <em>Primary Key Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key Constraint</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PrimaryKeyConstraint
	 * @generated
	 */
	EClass getPrimaryKeyConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.PrimaryKeyConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PrimaryKeyConstraint#getName()
	 * @see #getPrimaryKeyConstraint()
	 * @generated
	 */
	EAttribute getPrimaryKeyConstraint_Name();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.ForeignKeyConstraint <em>Foreign Key Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key Constraint</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ForeignKeyConstraint
	 * @generated
	 */
	EClass getForeignKeyConstraint();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai7.csv_validator.sculpt.ForeignKeyConstraint#getReferencedRelation <em>Referenced Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Relation</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ForeignKeyConstraint#getReferencedRelation()
	 * @see #getForeignKeyConstraint()
	 * @generated
	 */
	EReference getForeignKeyConstraint_ReferencedRelation();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.TransformationProgram <em>Transformation Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Program</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TransformationProgram
	 * @generated
	 */
	EClass getTransformationProgram();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.TransformationProgram#getDelimiter <em>Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delimiter</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TransformationProgram#getDelimiter()
	 * @see #getTransformationProgram()
	 * @generated
	 */
	EReference getTransformationProgram_Delimiter();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.sculpt.TransformationProgram#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TransformationProgram#getStatements()
	 * @see #getTransformationProgram()
	 * @generated
	 */
	EReference getTransformationProgram_Statements();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.TupleSelector <em>Tuple Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Selector</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TupleSelector
	 * @generated
	 */
	EClass getTupleSelector();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.TupleSelector#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TupleSelector#getRegion()
	 * @see #getTupleSelector()
	 * @generated
	 */
	EReference getTupleSelector_Region();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.sculpt.TupleSelector#getSelectors <em>Selectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selectors</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TupleSelector#getSelectors()
	 * @see #getTupleSelector()
	 * @generated
	 */
	EReference getTupleSelector_Selectors();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.PathExpression <em>Path Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Expression</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpression
	 * @generated
	 */
	EClass getPathExpression();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionList <em>Path Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Expression List</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionList
	 * @generated
	 */
	EClass getPathExpressionList();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionList#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionList#getFirst()
	 * @see #getPathExpressionList()
	 * @generated
	 */
	EReference getPathExpressionList_First();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionList#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rest</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionList#getRest()
	 * @see #getPathExpressionList()
	 * @generated
	 */
	EReference getPathExpressionList_Rest();

	/**
	 * Returns the meta object for enum '{@link de.ubt.ai7.csv_validator.sculpt.ValidationMode <em>Validation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Validation Mode</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ValidationMode
	 * @generated
	 */
	EEnum getValidationMode();

	/**
	 * Returns the meta object for enum '{@link de.ubt.ai7.csv_validator.sculpt.TLLoopMode <em>TL Loop Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TL Loop Mode</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLLoopMode
	 * @generated
	 */
	EEnum getTLLoopMode();

	/**
	 * Returns the meta object for enum '{@link de.ubt.ai7.csv_validator.sculpt.Comparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparator</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.Comparator
	 * @generated
	 */
	EEnum getComparator();

	/**
	 * Returns the meta object for enum '{@link de.ubt.ai7.csv_validator.sculpt.RowCol <em>Row Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Row Col</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.RowCol
	 * @generated
	 */
	EEnum getRowCol();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpression <em>Content Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Expression</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpression
	 * @generated
	 */
	EClass getContentExpression();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpression <em>Node Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Expression</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpression
	 * @generated
	 */
	EClass getNodeExpression();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionPrimitive <em>Node Expression Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Expression Primitive</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionPrimitive
	 * @generated
	 */
	EClass getNodeExpressionPrimitive();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionOr <em>Node Expression Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Expression Or</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionOr
	 * @generated
	 */
	EClass getNodeExpressionOr();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionOr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionOr#getLeft()
	 * @see #getNodeExpressionOr()
	 * @generated
	 */
	EReference getNodeExpressionOr_Left();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionOr#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionOr#getRight()
	 * @see #getNodeExpressionOr()
	 * @generated
	 */
	EReference getNodeExpressionOr_Right();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionAnd <em>Node Expression And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Expression And</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionAnd
	 * @generated
	 */
	EClass getNodeExpressionAnd();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionAnd#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionAnd#getLeft()
	 * @see #getNodeExpressionAnd()
	 * @generated
	 */
	EReference getNodeExpressionAnd_Left();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionAnd#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionAnd#getRight()
	 * @see #getNodeExpressionAnd()
	 * @generated
	 */
	EReference getNodeExpressionAnd_Right();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionNot <em>Node Expression Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Expression Not</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionNot
	 * @generated
	 */
	EClass getNodeExpressionNot();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionNot#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionNot#getRegion()
	 * @see #getNodeExpressionNot()
	 * @generated
	 */
	EReference getNodeExpressionNot_Region();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionPath <em>Node Expression Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Expression Path</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionPath
	 * @generated
	 */
	EClass getNodeExpressionPath();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionPath#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionPath#getRegion()
	 * @see #getNodeExpressionPath()
	 * @generated
	 */
	EReference getNodeExpressionPath_Region();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionPath#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionPath#getPath()
	 * @see #getNodeExpressionPath()
	 * @generated
	 */
	EReference getNodeExpressionPath_Path();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionCoordinate <em>Node Expression Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Expression Coordinate</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionCoordinate
	 * @generated
	 */
	EClass getNodeExpressionCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionCoordinate#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionCoordinate#getRow()
	 * @see #getNodeExpressionCoordinate()
	 * @generated
	 */
	EAttribute getNodeExpressionCoordinate_Row();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionCoordinate#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionCoordinate#getColumn()
	 * @see #getNodeExpressionCoordinate()
	 * @generated
	 */
	EAttribute getNodeExpressionCoordinate_Column();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionToken <em>Node Expression Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Expression Token</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionToken
	 * @generated
	 */
	EClass getNodeExpressionToken();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionToken#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionToken#getToken()
	 * @see #getNodeExpressionToken()
	 * @generated
	 */
	EReference getNodeExpressionToken_Token();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionComplete <em>Node Expression Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Expression Complete</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionComplete
	 * @generated
	 */
	EClass getNodeExpressionComplete();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowCol <em>Node Expression Row Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Expression Row Col</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowCol
	 * @generated
	 */
	EClass getNodeExpressionRowCol();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowCol#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowCol#getMode()
	 * @see #getNodeExpressionRowCol()
	 * @generated
	 */
	EAttribute getNodeExpressionRowCol_Mode();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColCoordinate <em>Node Expression Row Col Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Expression Row Col Coordinate</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColCoordinate
	 * @generated
	 */
	EClass getNodeExpressionRowColCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColCoordinate#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColCoordinate#getIndex()
	 * @see #getNodeExpressionRowColCoordinate()
	 * @generated
	 */
	EAttribute getNodeExpressionRowColCoordinate_Index();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColCoordinate#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColCoordinate#getRow()
	 * @see #getNodeExpressionRowColCoordinate()
	 * @generated
	 */
	EAttribute getNodeExpressionRowColCoordinate_Row();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColCoordinate#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColCoordinate#getColumn()
	 * @see #getNodeExpressionRowColCoordinate()
	 * @generated
	 */
	EAttribute getNodeExpressionRowColCoordinate_Column();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColToken <em>Node Expression Row Col Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Expression Row Col Token</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColToken
	 * @generated
	 */
	EClass getNodeExpressionRowColToken();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColToken#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColToken#getToken()
	 * @see #getNodeExpressionRowColToken()
	 * @generated
	 */
	EReference getNodeExpressionRowColToken_Token();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColString <em>Node Expression Row Col String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Expression Row Col String</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColString
	 * @generated
	 */
	EClass getNodeExpressionRowColString();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColString#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColString#getString()
	 * @see #getNodeExpressionRowColString()
	 * @generated
	 */
	EAttribute getNodeExpressionRowColString_String();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColLast <em>Node Expression Row Col Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Expression Row Col Last</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColLast
	 * @generated
	 */
	EClass getNodeExpressionRowColLast();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionPredicate <em>Path Expression Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Expression Predicate</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionPredicate
	 * @generated
	 */
	EClass getPathExpressionPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionPredicate#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionPredicate#getPath()
	 * @see #getPathExpressionPredicate()
	 * @generated
	 */
	EReference getPathExpressionPredicate_Path();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionStar <em>Path Expression Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Expression Star</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionStar
	 * @generated
	 */
	EClass getPathExpressionStar();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionStar#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionStar#getElement()
	 * @see #getPathExpressionStar()
	 * @generated
	 */
	EReference getPathExpressionStar_Element();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionPlus <em>Path Expression Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Expression Plus</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionPlus
	 * @generated
	 */
	EClass getPathExpressionPlus();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionPlus#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionPlus#getElement()
	 * @see #getPathExpressionPlus()
	 * @generated
	 */
	EReference getPathExpressionPlus_Element();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionOption <em>Path Expression Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Expression Option</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionOption
	 * @generated
	 */
	EClass getPathExpressionOption();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionOption#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionOption#getElement()
	 * @see #getPathExpressionOption()
	 * @generated
	 */
	EReference getPathExpressionOption_Element();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionOr <em>Path Expression Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Expression Or</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionOr
	 * @generated
	 */
	EClass getPathExpressionOr();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionOr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionOr#getLeft()
	 * @see #getPathExpressionOr()
	 * @generated
	 */
	EReference getPathExpressionOr_Left();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionOr#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionOr#getRight()
	 * @see #getPathExpressionOr()
	 * @generated
	 */
	EReference getPathExpressionOr_Right();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionStep <em>Path Expression Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Expression Step</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionStep
	 * @generated
	 */
	EClass getPathExpressionStep();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionStep#getAxes <em>Axes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axes</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionStep#getAxes()
	 * @see #getPathExpressionStep()
	 * @generated
	 */
	EAttribute getPathExpressionStep_Axes();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionStep#getNode_test <em>Node test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node test</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionStep#getNode_test()
	 * @see #getPathExpressionStep()
	 * @generated
	 */
	EReference getPathExpressionStep_Node_test();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionStep#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionStep#getPredicate()
	 * @see #getPathExpressionStep()
	 * @generated
	 */
	EReference getPathExpressionStep_Predicate();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionOr <em>Content Expression Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Expression Or</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionOr
	 * @generated
	 */
	EClass getContentExpressionOr();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionOr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionOr#getLeft()
	 * @see #getContentExpressionOr()
	 * @generated
	 */
	EReference getContentExpressionOr_Left();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionOr#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionOr#getRight()
	 * @see #getContentExpressionOr()
	 * @generated
	 */
	EReference getContentExpressionOr_Right();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionList <em>Content Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Expression List</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionList
	 * @generated
	 */
	EClass getContentExpressionList();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionList#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionList#getFirst()
	 * @see #getContentExpressionList()
	 * @generated
	 */
	EReference getContentExpressionList_First();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionList#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rest</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionList#getRest()
	 * @see #getContentExpressionList()
	 * @generated
	 */
	EReference getContentExpressionList_Rest();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionStar <em>Content Expression Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Expression Star</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionStar
	 * @generated
	 */
	EClass getContentExpressionStar();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionStar#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionStar#getElement()
	 * @see #getContentExpressionStar()
	 * @generated
	 */
	EReference getContentExpressionStar_Element();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionPlus <em>Content Expression Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Expression Plus</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionPlus
	 * @generated
	 */
	EClass getContentExpressionPlus();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionPlus#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionPlus#getElement()
	 * @see #getContentExpressionPlus()
	 * @generated
	 */
	EReference getContentExpressionPlus_Element();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionOption <em>Content Expression Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Expression Option</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionOption
	 * @generated
	 */
	EClass getContentExpressionOption();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionOption#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionOption#getElement()
	 * @see #getContentExpressionOption()
	 * @generated
	 */
	EReference getContentExpressionOption_Element();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionToken <em>Content Expression Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Expression Token</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionToken
	 * @generated
	 */
	EClass getContentExpressionToken();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionToken#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionToken#getToken()
	 * @see #getContentExpressionToken()
	 * @generated
	 */
	EReference getContentExpressionToken_Token();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison <em>Content Expression Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Expression Comparison</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison
	 * @generated
	 */
	EClass getContentExpressionComparison();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison#getComp <em>Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comp</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison#getComp()
	 * @see #getContentExpressionComparison()
	 * @generated
	 */
	EAttribute getContentExpressionComparison_Comp();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison#getValue()
	 * @see #getContentExpressionComparison()
	 * @generated
	 */
	EAttribute getContentExpressionComparison_Value();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison#getType()
	 * @see #getContentExpressionComparison()
	 * @generated
	 */
	EReference getContentExpressionComparison_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison#getTypeSpecifier <em>Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Specifier</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison#getTypeSpecifier()
	 * @see #getContentExpressionComparison()
	 * @generated
	 */
	EReference getContentExpressionComparison_TypeSpecifier();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison#getPath()
	 * @see #getContentExpressionComparison()
	 * @generated
	 */
	EReference getContentExpressionComparison_Path();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparisonR2L <em>Content Expression Comparison R2L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Expression Comparison R2L</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparisonR2L
	 * @generated
	 */
	EClass getContentExpressionComparisonR2L();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.TLContentExpressionList <em>TL Content Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Content Expression List</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLContentExpressionList
	 * @generated
	 */
	EClass getTLContentExpressionList();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.sculpt.TLContentExpressionList#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLContentExpressionList#getList()
	 * @see #getTLContentExpressionList()
	 * @generated
	 */
	EReference getTLContentExpressionList_List();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionString <em>Content Expression String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Expression String</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionString
	 * @generated
	 */
	EClass getContentExpressionString();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionString#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionString#getString()
	 * @see #getContentExpressionString()
	 * @generated
	 */
	EAttribute getContentExpressionString_String();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionANY <em>Content Expression ANY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Expression ANY</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionANY
	 * @generated
	 */
	EClass getContentExpressionANY();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionEMPTY <em>Content Expression EMPTY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Expression EMPTY</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionEMPTY
	 * @generated
	 */
	EClass getContentExpressionEMPTY();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionSOMETHING <em>Content Expression SOMETHING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Expression SOMETHING</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionSOMETHING
	 * @generated
	 */
	EClass getContentExpressionSOMETHING();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.TypeSpecifier <em>Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Specifier</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TypeSpecifier
	 * @generated
	 */
	EClass getTypeSpecifier();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.CompoundTypeSpecifier <em>Compound Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Type Specifier</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.CompoundTypeSpecifier
	 * @generated
	 */
	EClass getCompoundTypeSpecifier();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai7.csv_validator.sculpt.CompoundTypeSpecifier#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subtype</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.CompoundTypeSpecifier#getSubtype()
	 * @see #getCompoundTypeSpecifier()
	 * @generated
	 */
	EReference getCompoundTypeSpecifier_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.CompoundTypeSpecifier#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.CompoundTypeSpecifier#getIndex()
	 * @see #getCompoundTypeSpecifier()
	 * @generated
	 */
	EAttribute getCompoundTypeSpecifier_Index();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.ListTypeSpecifier <em>List Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Type Specifier</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ListTypeSpecifier
	 * @generated
	 */
	EClass getListTypeSpecifier();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.ListTypeSpecifier#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ListTypeSpecifier#getIndex()
	 * @see #getListTypeSpecifier()
	 * @generated
	 */
	EAttribute getListTypeSpecifier_Index();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.TLElement <em>TL Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Element</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLElement
	 * @generated
	 */
	EClass getTLElement();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.TLVariable <em>TL Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Variable</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLVariable
	 * @generated
	 */
	EClass getTLVariable();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.TLOutputPrimitive <em>TL Output Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Output Primitive</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLOutputPrimitive
	 * @generated
	 */
	EClass getTLOutputPrimitive();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.TLOutputConstant <em>TL Output Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Output Constant</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLOutputConstant
	 * @generated
	 */
	EClass getTLOutputConstant();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.TLOutputConstant#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLOutputConstant#getText()
	 * @see #getTLOutputConstant()
	 * @generated
	 */
	EAttribute getTLOutputConstant_Text();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.TLOutputVariable <em>TL Output Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Output Variable</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLOutputVariable
	 * @generated
	 */
	EClass getTLOutputVariable();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai7.csv_validator.sculpt.TLOutputVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLOutputVariable#getVariable()
	 * @see #getTLOutputVariable()
	 * @generated
	 */
	EReference getTLOutputVariable_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.sculpt.TLOutputVariable#getTypeSpecifier <em>Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Specifier</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLOutputVariable#getTypeSpecifier()
	 * @see #getTLOutputVariable()
	 * @generated
	 */
	EReference getTLOutputVariable_TypeSpecifier();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.TLStatement <em>TL Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Statement</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLStatement
	 * @generated
	 */
	EClass getTLStatement();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.TLOutput <em>TL Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Output</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLOutput
	 * @generated
	 */
	EClass getTLOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.sculpt.TLOutput#getPrimitives <em>Primitives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitives</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLOutput#getPrimitives()
	 * @see #getTLOutput()
	 * @generated
	 */
	EReference getTLOutput_Primitives();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.TLLoop <em>TL Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Loop</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLLoop
	 * @generated
	 */
	EClass getTLLoop();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.sculpt.TLLoop#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLLoop#getVariables()
	 * @see #getTLLoop()
	 * @generated
	 */
	EReference getTLLoop_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.TLLoop#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLLoop#getRegion()
	 * @see #getTLLoop()
	 * @generated
	 */
	EReference getTLLoop_Region();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.TLLoop#getContentExpression <em>Content Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Expression</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLLoop#getContentExpression()
	 * @see #getTLLoop()
	 * @generated
	 */
	EReference getTLLoop_ContentExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.sculpt.TLLoop#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLLoop#getStatements()
	 * @see #getTLLoop()
	 * @generated
	 */
	EReference getTLLoop_Statements();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.TLLoop#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLLoop#getMode()
	 * @see #getTLLoop()
	 * @generated
	 */
	EAttribute getTLLoop_Mode();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.TLIf <em>TL If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL If</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLIf
	 * @generated
	 */
	EClass getTLIf();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.TLIf#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLIf#getCondition()
	 * @see #getTLIf()
	 * @generated
	 */
	EReference getTLIf_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.sculpt.TLIf#getIfBlock <em>If Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If Block</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLIf#getIfBlock()
	 * @see #getTLIf()
	 * @generated
	 */
	EReference getTLIf_IfBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.sculpt.TLIf#getElseBlock <em>Else Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Block</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLIf#getElseBlock()
	 * @see #getTLIf()
	 * @generated
	 */
	EReference getTLIf_ElseBlock();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.TLBoolExpr <em>TL Bool Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Bool Expr</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLBoolExpr
	 * @generated
	 */
	EClass getTLBoolExpr();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.TLBoolExprEmpty <em>TL Bool Expr Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Bool Expr Empty</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLBoolExprEmpty
	 * @generated
	 */
	EClass getTLBoolExprEmpty();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.TLBoolExprEmpty#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLBoolExprEmpty#getRegion()
	 * @see #getTLBoolExprEmpty()
	 * @generated
	 */
	EReference getTLBoolExprEmpty_Region();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.TLBoolExprNot <em>TL Bool Expr Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Bool Expr Not</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLBoolExprNot
	 * @generated
	 */
	EClass getTLBoolExprNot();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.TLBoolExprNot#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLBoolExprNot#getExpression()
	 * @see #getTLBoolExprNot()
	 * @generated
	 */
	EReference getTLBoolExprNot_Expression();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparisonR2L <em>Node Expression Comparison R2L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Expression Comparison R2L</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparisonR2L
	 * @generated
	 */
	EClass getNodeExpressionComparisonR2L();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.Type#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.Type#getDefaultValue()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.Type#getEmptyValue <em>Empty Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empty Value</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.Type#getEmptyValue()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_EmptyValue();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType <em>Atomic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Type</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.AtomicType
	 * @generated
	 */
	EClass getAtomicType();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.AtomicType#getFormat()
	 * @see #getAtomicType()
	 * @generated
	 */
	EAttribute getAtomicType_Format();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.AtomicType#getMinLength()
	 * @see #getAtomicType()
	 * @generated
	 */
	EAttribute getAtomicType_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.AtomicType#getMaxLength()
	 * @see #getAtomicType()
	 * @generated
	 */
	EAttribute getAtomicType_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.AtomicType#getBase()
	 * @see #getAtomicType()
	 * @generated
	 */
	EAttribute getAtomicType_Base();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getGroupChar <em>Group Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Char</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.AtomicType#getGroupChar()
	 * @see #getAtomicType()
	 * @generated
	 */
	EAttribute getAtomicType_GroupChar();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getDecimalChar <em>Decimal Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Char</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.AtomicType#getDecimalChar()
	 * @see #getAtomicType()
	 * @generated
	 */
	EAttribute getAtomicType_DecimalChar();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.AtomicType#getMinimum()
	 * @see #getAtomicType()
	 * @generated
	 */
	EAttribute getAtomicType_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.AtomicType#getMaximum()
	 * @see #getAtomicType()
	 * @generated
	 */
	EAttribute getAtomicType_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getMinExclusive <em>Min Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Exclusive</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.AtomicType#getMinExclusive()
	 * @see #getAtomicType()
	 * @generated
	 */
	EAttribute getAtomicType_MinExclusive();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getMaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Exclusive</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.AtomicType#getMaxExclusive()
	 * @see #getAtomicType()
	 * @generated
	 */
	EAttribute getAtomicType_MaxExclusive();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.AtomicType#getLength()
	 * @see #getAtomicType()
	 * @generated
	 */
	EAttribute getAtomicType_Length();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.CompoundType <em>Compound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Type</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.CompoundType
	 * @generated
	 */
	EClass getCompoundType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.sculpt.CompoundType#getPrimitives <em>Primitives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitives</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.CompoundType#getPrimitives()
	 * @see #getCompoundType()
	 * @generated
	 */
	EReference getCompoundType_Primitives();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Type</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ListType
	 * @generated
	 */
	EClass getListType();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.ListType#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ListType#getSeparator()
	 * @see #getListType()
	 * @generated
	 */
	EAttribute getListType_Separator();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.ListType#getMinElements <em>Min Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Elements</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ListType#getMinElements()
	 * @see #getListType()
	 * @generated
	 */
	EAttribute getListType_MinElements();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.ListType#getMaxElements <em>Max Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Elements</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ListType#getMaxElements()
	 * @see #getListType()
	 * @generated
	 */
	EAttribute getListType_MaxElements();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai7.csv_validator.sculpt.ListType#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.ListType#getBase()
	 * @see #getListType()
	 * @generated
	 */
	EReference getListType_Base();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.CompoundTypePrimitive <em>Compound Type Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Type Primitive</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.CompoundTypePrimitive
	 * @generated
	 */
	EClass getCompoundTypePrimitive();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.CompoundTypePrimitive#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.CompoundTypePrimitive#getText()
	 * @see #getCompoundTypePrimitive()
	 * @generated
	 */
	EAttribute getCompoundTypePrimitive_Text();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai7.csv_validator.sculpt.CompoundTypePrimitive#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.CompoundTypePrimitive#getType()
	 * @see #getCompoundTypePrimitive()
	 * @generated
	 */
	EReference getCompoundTypePrimitive_Type();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison <em>Node Expression Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Expression Comparison</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison
	 * @generated
	 */
	EClass getNodeExpressionComparison();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison#getComp <em>Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comp</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison#getComp()
	 * @see #getNodeExpressionComparison()
	 * @generated
	 */
	EAttribute getNodeExpressionComparison_Comp();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison#getValue()
	 * @see #getNodeExpressionComparison()
	 * @generated
	 */
	EAttribute getNodeExpressionComparison_Value();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison#getType()
	 * @see #getNodeExpressionComparison()
	 * @generated
	 */
	EReference getNodeExpressionComparison_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison#getTypeSpecifier <em>Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Specifier</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison#getTypeSpecifier()
	 * @see #getNodeExpressionComparison()
	 * @generated
	 */
	EReference getNodeExpressionComparison_TypeSpecifier();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.RegionToken <em>Region Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region Token</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.RegionToken
	 * @generated
	 */
	EClass getRegionToken();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.sculpt.RegionToken#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.RegionToken#getRegion()
	 * @see #getRegionToken()
	 * @generated
	 */
	EReference getRegionToken_Region();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.sculpt.AbstractToken <em>Abstract Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Token</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.AbstractToken
	 * @generated
	 */
	EClass getAbstractToken();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.sculpt.AbstractToken#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.AbstractToken#getName()
	 * @see #getAbstractToken()
	 * @generated
	 */
	EAttribute getAbstractToken_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SculptFactory getSculptFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.SculptImpl <em>Sculpt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getSculpt()
		 * @generated
		 */
		EClass SCULPT = eINSTANCE.getSculpt();

		/**
		 * The meta object literal for the '<em><b>Delimiter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCULPT__DELIMITER = eINSTANCE.getSculpt_Delimiter();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCULPT__TOKENS = eINSTANCE.getSculpt_Tokens();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCULPT__CONSTRAINTS = eINSTANCE.getSculpt_Constraints();

		/**
		 * The meta object literal for the '<em><b>Region Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCULPT__REGION_TOKENS = eINSTANCE.getSculpt_RegionTokens();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCULPT__TYPES = eINSTANCE.getSculpt_Types();

		/**
		 * The meta object literal for the '<em><b>Transformation Program</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCULPT__TRANSFORMATION_PROGRAM = eINSTANCE.getSculpt_TransformationProgram();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.SchemaElementImpl <em>Schema Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SchemaElementImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getSchemaElement()
		 * @generated
		 */
		EClass SCHEMA_ELEMENT = eINSTANCE.getSchemaElement();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.DelimitersImpl <em>Delimiters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.DelimitersImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getDelimiters()
		 * @generated
		 */
		EClass DELIMITERS = eINSTANCE.getDelimiters();

		/**
		 * The meta object literal for the '<em><b>Row Delim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIMITERS__ROW_DELIM = eINSTANCE.getDelimiters_RowDelim();

		/**
		 * The meta object literal for the '<em><b>Col Delim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIMITERS__COL_DELIM = eINSTANCE.getDelimiters_ColDelim();

		/**
		 * The meta object literal for the '<em><b>List Delim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIMITERS__LIST_DELIM = eINSTANCE.getDelimiters_ListDelim();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.TokenImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Token Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__TOKEN_REGEX = eINSTANCE.getToken_TokenRegex();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.ConstraintImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentConstraintImpl <em>Content Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentConstraintImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentConstraint()
		 * @generated
		 */
		EClass CONTENT_CONSTRAINT = eINSTANCE.getContentConstraint();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_CONSTRAINT__REGION = eINSTANCE.getContentConstraint_Region();

		/**
		 * The meta object literal for the '<em><b>Content Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_CONSTRAINT__CONTENT_EXPRESSION = eINSTANCE.getContentConstraint_ContentExpression();

		/**
		 * The meta object literal for the '<em><b>Validation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_CONSTRAINT__VALIDATION_MODE = eINSTANCE.getContentConstraint_ValidationMode();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.RelationConstraintImpl <em>Relation Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.RelationConstraintImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getRelationConstraint()
		 * @generated
		 */
		EClass RELATION_CONSTRAINT = eINSTANCE.getRelationConstraint();

		/**
		 * The meta object literal for the '<em><b>Tuple Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CONSTRAINT__TUPLE_SELECTOR = eINSTANCE.getRelationConstraint_TupleSelector();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.PrimaryKeyConstraintImpl <em>Primary Key Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.PrimaryKeyConstraintImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getPrimaryKeyConstraint()
		 * @generated
		 */
		EClass PRIMARY_KEY_CONSTRAINT = eINSTANCE.getPrimaryKeyConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY_CONSTRAINT__NAME = eINSTANCE.getPrimaryKeyConstraint_Name();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ForeignKeyConstraintImpl <em>Foreign Key Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.ForeignKeyConstraintImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getForeignKeyConstraint()
		 * @generated
		 */
		EClass FOREIGN_KEY_CONSTRAINT = eINSTANCE.getForeignKeyConstraint();

		/**
		 * The meta object literal for the '<em><b>Referenced Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY_CONSTRAINT__REFERENCED_RELATION = eINSTANCE.getForeignKeyConstraint_ReferencedRelation();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TransformationProgramImpl <em>Transformation Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.TransformationProgramImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTransformationProgram()
		 * @generated
		 */
		EClass TRANSFORMATION_PROGRAM = eINSTANCE.getTransformationProgram();

		/**
		 * The meta object literal for the '<em><b>Delimiter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_PROGRAM__DELIMITER = eINSTANCE.getTransformationProgram_Delimiter();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_PROGRAM__STATEMENTS = eINSTANCE.getTransformationProgram_Statements();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TupleSelectorImpl <em>Tuple Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.TupleSelectorImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTupleSelector()
		 * @generated
		 */
		EClass TUPLE_SELECTOR = eINSTANCE.getTupleSelector();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_SELECTOR__REGION = eINSTANCE.getTupleSelector_Region();

		/**
		 * The meta object literal for the '<em><b>Selectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_SELECTOR__SELECTORS = eINSTANCE.getTupleSelector_Selectors();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionImpl <em>Path Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getPathExpression()
		 * @generated
		 */
		EClass PATH_EXPRESSION = eINSTANCE.getPathExpression();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionListImpl <em>Path Expression List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionListImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getPathExpressionList()
		 * @generated
		 */
		EClass PATH_EXPRESSION_LIST = eINSTANCE.getPathExpressionList();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_EXPRESSION_LIST__FIRST = eINSTANCE.getPathExpressionList_First();

		/**
		 * The meta object literal for the '<em><b>Rest</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_EXPRESSION_LIST__REST = eINSTANCE.getPathExpressionList_Rest();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.ValidationMode <em>Validation Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.ValidationMode
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getValidationMode()
		 * @generated
		 */
		EEnum VALIDATION_MODE = eINSTANCE.getValidationMode();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.TLLoopMode <em>TL Loop Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.TLLoopMode
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLLoopMode()
		 * @generated
		 */
		EEnum TL_LOOP_MODE = eINSTANCE.getTLLoopMode();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.Comparator <em>Comparator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.Comparator
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getComparator()
		 * @generated
		 */
		EEnum COMPARATOR = eINSTANCE.getComparator();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.RowCol <em>Row Col</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.RowCol
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getRowCol()
		 * @generated
		 */
		EEnum ROW_COL = eINSTANCE.getRowCol();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionImpl <em>Content Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpression()
		 * @generated
		 */
		EClass CONTENT_EXPRESSION = eINSTANCE.getContentExpression();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionImpl <em>Node Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpression()
		 * @generated
		 */
		EClass NODE_EXPRESSION = eINSTANCE.getNodeExpression();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionPrimitiveImpl <em>Node Expression Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionPrimitiveImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionPrimitive()
		 * @generated
		 */
		EClass NODE_EXPRESSION_PRIMITIVE = eINSTANCE.getNodeExpressionPrimitive();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionOrImpl <em>Node Expression Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionOrImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionOr()
		 * @generated
		 */
		EClass NODE_EXPRESSION_OR = eINSTANCE.getNodeExpressionOr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_EXPRESSION_OR__LEFT = eINSTANCE.getNodeExpressionOr_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_EXPRESSION_OR__RIGHT = eINSTANCE.getNodeExpressionOr_Right();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionAndImpl <em>Node Expression And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionAndImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionAnd()
		 * @generated
		 */
		EClass NODE_EXPRESSION_AND = eINSTANCE.getNodeExpressionAnd();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_EXPRESSION_AND__LEFT = eINSTANCE.getNodeExpressionAnd_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_EXPRESSION_AND__RIGHT = eINSTANCE.getNodeExpressionAnd_Right();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionNotImpl <em>Node Expression Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionNotImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionNot()
		 * @generated
		 */
		EClass NODE_EXPRESSION_NOT = eINSTANCE.getNodeExpressionNot();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_EXPRESSION_NOT__REGION = eINSTANCE.getNodeExpressionNot_Region();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionPathImpl <em>Node Expression Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionPathImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionPath()
		 * @generated
		 */
		EClass NODE_EXPRESSION_PATH = eINSTANCE.getNodeExpressionPath();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_EXPRESSION_PATH__REGION = eINSTANCE.getNodeExpressionPath_Region();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_EXPRESSION_PATH__PATH = eINSTANCE.getNodeExpressionPath_Path();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionCoordinateImpl <em>Node Expression Coordinate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionCoordinateImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionCoordinate()
		 * @generated
		 */
		EClass NODE_EXPRESSION_COORDINATE = eINSTANCE.getNodeExpressionCoordinate();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_EXPRESSION_COORDINATE__ROW = eINSTANCE.getNodeExpressionCoordinate_Row();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_EXPRESSION_COORDINATE__COLUMN = eINSTANCE.getNodeExpressionCoordinate_Column();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionTokenImpl <em>Node Expression Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionTokenImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionToken()
		 * @generated
		 */
		EClass NODE_EXPRESSION_TOKEN = eINSTANCE.getNodeExpressionToken();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_EXPRESSION_TOKEN__TOKEN = eINSTANCE.getNodeExpressionToken_Token();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionCompleteImpl <em>Node Expression Complete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionCompleteImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionComplete()
		 * @generated
		 */
		EClass NODE_EXPRESSION_COMPLETE = eINSTANCE.getNodeExpressionComplete();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColImpl <em>Node Expression Row Col</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionRowCol()
		 * @generated
		 */
		EClass NODE_EXPRESSION_ROW_COL = eINSTANCE.getNodeExpressionRowCol();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_EXPRESSION_ROW_COL__MODE = eINSTANCE.getNodeExpressionRowCol_Mode();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColCoordinateImpl <em>Node Expression Row Col Coordinate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColCoordinateImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionRowColCoordinate()
		 * @generated
		 */
		EClass NODE_EXPRESSION_ROW_COL_COORDINATE = eINSTANCE.getNodeExpressionRowColCoordinate();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_EXPRESSION_ROW_COL_COORDINATE__INDEX = eINSTANCE.getNodeExpressionRowColCoordinate_Index();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_EXPRESSION_ROW_COL_COORDINATE__ROW = eINSTANCE.getNodeExpressionRowColCoordinate_Row();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_EXPRESSION_ROW_COL_COORDINATE__COLUMN = eINSTANCE.getNodeExpressionRowColCoordinate_Column();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColTokenImpl <em>Node Expression Row Col Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColTokenImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionRowColToken()
		 * @generated
		 */
		EClass NODE_EXPRESSION_ROW_COL_TOKEN = eINSTANCE.getNodeExpressionRowColToken();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_EXPRESSION_ROW_COL_TOKEN__TOKEN = eINSTANCE.getNodeExpressionRowColToken_Token();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColStringImpl <em>Node Expression Row Col String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColStringImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionRowColString()
		 * @generated
		 */
		EClass NODE_EXPRESSION_ROW_COL_STRING = eINSTANCE.getNodeExpressionRowColString();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_EXPRESSION_ROW_COL_STRING__STRING = eINSTANCE.getNodeExpressionRowColString_String();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColLastImpl <em>Node Expression Row Col Last</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColLastImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionRowColLast()
		 * @generated
		 */
		EClass NODE_EXPRESSION_ROW_COL_LAST = eINSTANCE.getNodeExpressionRowColLast();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionPredicateImpl <em>Path Expression Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionPredicateImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getPathExpressionPredicate()
		 * @generated
		 */
		EClass PATH_EXPRESSION_PREDICATE = eINSTANCE.getPathExpressionPredicate();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_EXPRESSION_PREDICATE__PATH = eINSTANCE.getPathExpressionPredicate_Path();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionStarImpl <em>Path Expression Star</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionStarImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getPathExpressionStar()
		 * @generated
		 */
		EClass PATH_EXPRESSION_STAR = eINSTANCE.getPathExpressionStar();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_EXPRESSION_STAR__ELEMENT = eINSTANCE.getPathExpressionStar_Element();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionPlusImpl <em>Path Expression Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionPlusImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getPathExpressionPlus()
		 * @generated
		 */
		EClass PATH_EXPRESSION_PLUS = eINSTANCE.getPathExpressionPlus();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_EXPRESSION_PLUS__ELEMENT = eINSTANCE.getPathExpressionPlus_Element();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionOptionImpl <em>Path Expression Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionOptionImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getPathExpressionOption()
		 * @generated
		 */
		EClass PATH_EXPRESSION_OPTION = eINSTANCE.getPathExpressionOption();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_EXPRESSION_OPTION__ELEMENT = eINSTANCE.getPathExpressionOption_Element();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionOrImpl <em>Path Expression Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionOrImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getPathExpressionOr()
		 * @generated
		 */
		EClass PATH_EXPRESSION_OR = eINSTANCE.getPathExpressionOr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_EXPRESSION_OR__LEFT = eINSTANCE.getPathExpressionOr_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_EXPRESSION_OR__RIGHT = eINSTANCE.getPathExpressionOr_Right();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionStepImpl <em>Path Expression Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionStepImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getPathExpressionStep()
		 * @generated
		 */
		EClass PATH_EXPRESSION_STEP = eINSTANCE.getPathExpressionStep();

		/**
		 * The meta object literal for the '<em><b>Axes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_EXPRESSION_STEP__AXES = eINSTANCE.getPathExpressionStep_Axes();

		/**
		 * The meta object literal for the '<em><b>Node test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_EXPRESSION_STEP__NODE_TEST = eINSTANCE.getPathExpressionStep_Node_test();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_EXPRESSION_STEP__PREDICATE = eINSTANCE.getPathExpressionStep_Predicate();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionOrImpl <em>Content Expression Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionOrImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionOr()
		 * @generated
		 */
		EClass CONTENT_EXPRESSION_OR = eINSTANCE.getContentExpressionOr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_EXPRESSION_OR__LEFT = eINSTANCE.getContentExpressionOr_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_EXPRESSION_OR__RIGHT = eINSTANCE.getContentExpressionOr_Right();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionListImpl <em>Content Expression List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionListImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionList()
		 * @generated
		 */
		EClass CONTENT_EXPRESSION_LIST = eINSTANCE.getContentExpressionList();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_EXPRESSION_LIST__FIRST = eINSTANCE.getContentExpressionList_First();

		/**
		 * The meta object literal for the '<em><b>Rest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_EXPRESSION_LIST__REST = eINSTANCE.getContentExpressionList_Rest();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionStarImpl <em>Content Expression Star</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionStarImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionStar()
		 * @generated
		 */
		EClass CONTENT_EXPRESSION_STAR = eINSTANCE.getContentExpressionStar();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_EXPRESSION_STAR__ELEMENT = eINSTANCE.getContentExpressionStar_Element();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionPlusImpl <em>Content Expression Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionPlusImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionPlus()
		 * @generated
		 */
		EClass CONTENT_EXPRESSION_PLUS = eINSTANCE.getContentExpressionPlus();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_EXPRESSION_PLUS__ELEMENT = eINSTANCE.getContentExpressionPlus_Element();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionOptionImpl <em>Content Expression Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionOptionImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionOption()
		 * @generated
		 */
		EClass CONTENT_EXPRESSION_OPTION = eINSTANCE.getContentExpressionOption();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_EXPRESSION_OPTION__ELEMENT = eINSTANCE.getContentExpressionOption_Element();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionTokenImpl <em>Content Expression Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionTokenImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionToken()
		 * @generated
		 */
		EClass CONTENT_EXPRESSION_TOKEN = eINSTANCE.getContentExpressionToken();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_EXPRESSION_TOKEN__TOKEN = eINSTANCE.getContentExpressionToken_Token();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionComparisonImpl <em>Content Expression Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionComparisonImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionComparison()
		 * @generated
		 */
		EClass CONTENT_EXPRESSION_COMPARISON = eINSTANCE.getContentExpressionComparison();

		/**
		 * The meta object literal for the '<em><b>Comp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_EXPRESSION_COMPARISON__COMP = eINSTANCE.getContentExpressionComparison_Comp();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_EXPRESSION_COMPARISON__VALUE = eINSTANCE.getContentExpressionComparison_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_EXPRESSION_COMPARISON__TYPE = eINSTANCE.getContentExpressionComparison_Type();

		/**
		 * The meta object literal for the '<em><b>Type Specifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_EXPRESSION_COMPARISON__TYPE_SPECIFIER = eINSTANCE.getContentExpressionComparison_TypeSpecifier();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_EXPRESSION_COMPARISON__PATH = eINSTANCE.getContentExpressionComparison_Path();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionComparisonR2LImpl <em>Content Expression Comparison R2L</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionComparisonR2LImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionComparisonR2L()
		 * @generated
		 */
		EClass CONTENT_EXPRESSION_COMPARISON_R2L = eINSTANCE.getContentExpressionComparisonR2L();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLContentExpressionListImpl <em>TL Content Expression List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLContentExpressionListImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLContentExpressionList()
		 * @generated
		 */
		EClass TL_CONTENT_EXPRESSION_LIST = eINSTANCE.getTLContentExpressionList();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TL_CONTENT_EXPRESSION_LIST__LIST = eINSTANCE.getTLContentExpressionList_List();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionStringImpl <em>Content Expression String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionStringImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionString()
		 * @generated
		 */
		EClass CONTENT_EXPRESSION_STRING = eINSTANCE.getContentExpressionString();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_EXPRESSION_STRING__STRING = eINSTANCE.getContentExpressionString_String();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionANYImpl <em>Content Expression ANY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionANYImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionANY()
		 * @generated
		 */
		EClass CONTENT_EXPRESSION_ANY = eINSTANCE.getContentExpressionANY();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionEMPTYImpl <em>Content Expression EMPTY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionEMPTYImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionEMPTY()
		 * @generated
		 */
		EClass CONTENT_EXPRESSION_EMPTY = eINSTANCE.getContentExpressionEMPTY();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionSOMETHINGImpl <em>Content Expression SOMETHING</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionSOMETHINGImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getContentExpressionSOMETHING()
		 * @generated
		 */
		EClass CONTENT_EXPRESSION_SOMETHING = eINSTANCE.getContentExpressionSOMETHING();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TypeSpecifierImpl <em>Type Specifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.TypeSpecifierImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTypeSpecifier()
		 * @generated
		 */
		EClass TYPE_SPECIFIER = eINSTANCE.getTypeSpecifier();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.CompoundTypeSpecifierImpl <em>Compound Type Specifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.CompoundTypeSpecifierImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getCompoundTypeSpecifier()
		 * @generated
		 */
		EClass COMPOUND_TYPE_SPECIFIER = eINSTANCE.getCompoundTypeSpecifier();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_TYPE_SPECIFIER__SUBTYPE = eINSTANCE.getCompoundTypeSpecifier_Subtype();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_TYPE_SPECIFIER__INDEX = eINSTANCE.getCompoundTypeSpecifier_Index();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ListTypeSpecifierImpl <em>List Type Specifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.ListTypeSpecifierImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getListTypeSpecifier()
		 * @generated
		 */
		EClass LIST_TYPE_SPECIFIER = eINSTANCE.getListTypeSpecifier();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_TYPE_SPECIFIER__INDEX = eINSTANCE.getListTypeSpecifier_Index();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLElementImpl <em>TL Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLElementImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLElement()
		 * @generated
		 */
		EClass TL_ELEMENT = eINSTANCE.getTLElement();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLVariableImpl <em>TL Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLVariableImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLVariable()
		 * @generated
		 */
		EClass TL_VARIABLE = eINSTANCE.getTLVariable();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLOutputPrimitiveImpl <em>TL Output Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLOutputPrimitiveImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLOutputPrimitive()
		 * @generated
		 */
		EClass TL_OUTPUT_PRIMITIVE = eINSTANCE.getTLOutputPrimitive();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLOutputConstantImpl <em>TL Output Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLOutputConstantImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLOutputConstant()
		 * @generated
		 */
		EClass TL_OUTPUT_CONSTANT = eINSTANCE.getTLOutputConstant();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TL_OUTPUT_CONSTANT__TEXT = eINSTANCE.getTLOutputConstant_Text();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLOutputVariableImpl <em>TL Output Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLOutputVariableImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLOutputVariable()
		 * @generated
		 */
		EClass TL_OUTPUT_VARIABLE = eINSTANCE.getTLOutputVariable();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TL_OUTPUT_VARIABLE__VARIABLE = eINSTANCE.getTLOutputVariable_Variable();

		/**
		 * The meta object literal for the '<em><b>Type Specifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TL_OUTPUT_VARIABLE__TYPE_SPECIFIER = eINSTANCE.getTLOutputVariable_TypeSpecifier();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLStatementImpl <em>TL Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLStatementImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLStatement()
		 * @generated
		 */
		EClass TL_STATEMENT = eINSTANCE.getTLStatement();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLOutputImpl <em>TL Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLOutputImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLOutput()
		 * @generated
		 */
		EClass TL_OUTPUT = eINSTANCE.getTLOutput();

		/**
		 * The meta object literal for the '<em><b>Primitives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TL_OUTPUT__PRIMITIVES = eINSTANCE.getTLOutput_Primitives();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLLoopImpl <em>TL Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLLoopImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLLoop()
		 * @generated
		 */
		EClass TL_LOOP = eINSTANCE.getTLLoop();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TL_LOOP__VARIABLES = eINSTANCE.getTLLoop_Variables();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TL_LOOP__REGION = eINSTANCE.getTLLoop_Region();

		/**
		 * The meta object literal for the '<em><b>Content Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TL_LOOP__CONTENT_EXPRESSION = eINSTANCE.getTLLoop_ContentExpression();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TL_LOOP__STATEMENTS = eINSTANCE.getTLLoop_Statements();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TL_LOOP__MODE = eINSTANCE.getTLLoop_Mode();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLIfImpl <em>TL If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLIfImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLIf()
		 * @generated
		 */
		EClass TL_IF = eINSTANCE.getTLIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TL_IF__CONDITION = eINSTANCE.getTLIf_Condition();

		/**
		 * The meta object literal for the '<em><b>If Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TL_IF__IF_BLOCK = eINSTANCE.getTLIf_IfBlock();

		/**
		 * The meta object literal for the '<em><b>Else Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TL_IF__ELSE_BLOCK = eINSTANCE.getTLIf_ElseBlock();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLBoolExprImpl <em>TL Bool Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLBoolExprImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLBoolExpr()
		 * @generated
		 */
		EClass TL_BOOL_EXPR = eINSTANCE.getTLBoolExpr();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLBoolExprEmptyImpl <em>TL Bool Expr Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLBoolExprEmptyImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLBoolExprEmpty()
		 * @generated
		 */
		EClass TL_BOOL_EXPR_EMPTY = eINSTANCE.getTLBoolExprEmpty();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TL_BOOL_EXPR_EMPTY__REGION = eINSTANCE.getTLBoolExprEmpty_Region();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TLBoolExprNotImpl <em>TL Bool Expr Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.TLBoolExprNotImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getTLBoolExprNot()
		 * @generated
		 */
		EClass TL_BOOL_EXPR_NOT = eINSTANCE.getTLBoolExprNot();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TL_BOOL_EXPR_NOT__EXPRESSION = eINSTANCE.getTLBoolExprNot_Expression();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionComparisonR2LImpl <em>Node Expression Comparison R2L</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionComparisonR2LImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionComparisonR2L()
		 * @generated
		 */
		EClass NODE_EXPRESSION_COMPARISON_R2L = eINSTANCE.getNodeExpressionComparisonR2L();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.TypeImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__DEFAULT_VALUE = eINSTANCE.getType_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Empty Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__EMPTY_VALUE = eINSTANCE.getType_EmptyValue();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.AtomicTypeImpl <em>Atomic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.AtomicTypeImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getAtomicType()
		 * @generated
		 */
		EClass ATOMIC_TYPE = eINSTANCE.getAtomicType();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_TYPE__FORMAT = eINSTANCE.getAtomicType_Format();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_TYPE__MIN_LENGTH = eINSTANCE.getAtomicType_MinLength();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_TYPE__MAX_LENGTH = eINSTANCE.getAtomicType_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_TYPE__BASE = eINSTANCE.getAtomicType_Base();

		/**
		 * The meta object literal for the '<em><b>Group Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_TYPE__GROUP_CHAR = eINSTANCE.getAtomicType_GroupChar();

		/**
		 * The meta object literal for the '<em><b>Decimal Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_TYPE__DECIMAL_CHAR = eINSTANCE.getAtomicType_DecimalChar();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_TYPE__MINIMUM = eINSTANCE.getAtomicType_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_TYPE__MAXIMUM = eINSTANCE.getAtomicType_Maximum();

		/**
		 * The meta object literal for the '<em><b>Min Exclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_TYPE__MIN_EXCLUSIVE = eINSTANCE.getAtomicType_MinExclusive();

		/**
		 * The meta object literal for the '<em><b>Max Exclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_TYPE__MAX_EXCLUSIVE = eINSTANCE.getAtomicType_MaxExclusive();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_TYPE__LENGTH = eINSTANCE.getAtomicType_Length();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.CompoundTypeImpl <em>Compound Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.CompoundTypeImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getCompoundType()
		 * @generated
		 */
		EClass COMPOUND_TYPE = eINSTANCE.getCompoundType();

		/**
		 * The meta object literal for the '<em><b>Primitives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_TYPE__PRIMITIVES = eINSTANCE.getCompoundType_Primitives();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.ListTypeImpl <em>List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.ListTypeImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getListType()
		 * @generated
		 */
		EClass LIST_TYPE = eINSTANCE.getListType();

		/**
		 * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_TYPE__SEPARATOR = eINSTANCE.getListType_Separator();

		/**
		 * The meta object literal for the '<em><b>Min Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_TYPE__MIN_ELEMENTS = eINSTANCE.getListType_MinElements();

		/**
		 * The meta object literal for the '<em><b>Max Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_TYPE__MAX_ELEMENTS = eINSTANCE.getListType_MaxElements();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_TYPE__BASE = eINSTANCE.getListType_Base();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.CompoundTypePrimitiveImpl <em>Compound Type Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.CompoundTypePrimitiveImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getCompoundTypePrimitive()
		 * @generated
		 */
		EClass COMPOUND_TYPE_PRIMITIVE = eINSTANCE.getCompoundTypePrimitive();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_TYPE_PRIMITIVE__TEXT = eINSTANCE.getCompoundTypePrimitive_Text();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_TYPE_PRIMITIVE__TYPE = eINSTANCE.getCompoundTypePrimitive_Type();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionComparisonImpl <em>Node Expression Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionComparisonImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getNodeExpressionComparison()
		 * @generated
		 */
		EClass NODE_EXPRESSION_COMPARISON = eINSTANCE.getNodeExpressionComparison();

		/**
		 * The meta object literal for the '<em><b>Comp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_EXPRESSION_COMPARISON__COMP = eINSTANCE.getNodeExpressionComparison_Comp();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_EXPRESSION_COMPARISON__VALUE = eINSTANCE.getNodeExpressionComparison_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_EXPRESSION_COMPARISON__TYPE = eINSTANCE.getNodeExpressionComparison_Type();

		/**
		 * The meta object literal for the '<em><b>Type Specifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_EXPRESSION_COMPARISON__TYPE_SPECIFIER = eINSTANCE.getNodeExpressionComparison_TypeSpecifier();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.RegionTokenImpl <em>Region Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.RegionTokenImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getRegionToken()
		 * @generated
		 */
		EClass REGION_TOKEN = eINSTANCE.getRegionToken();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION_TOKEN__REGION = eINSTANCE.getRegionToken_Region();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.sculpt.impl.AbstractTokenImpl <em>Abstract Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.AbstractTokenImpl
		 * @see de.ubt.ai7.csv_validator.sculpt.impl.SculptPackageImpl#getAbstractToken()
		 * @generated
		 */
		EClass ABSTRACT_TOKEN = eINSTANCE.getAbstractToken();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TOKEN__NAME = eINSTANCE.getAbstractToken_Name();

	}

} //SculptPackage

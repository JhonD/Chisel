/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresFactory
 * @model kind="package"
 * @generated
 */
public interface dataStructuresPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataStructures";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ubt.de/ai7/csv_validator/CacheDataStructures/Model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DataStructures";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	dataStructuresPackage eINSTANCE = de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl.init();

	/**
	 * The meta object id for the '<em>Hash Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.HashSet
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getHashSet()
	 * @generated
	 */
	int HASH_SET = 28;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedElementImpl <em>Cached Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedElementImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedElement()
	 * @generated
	 */
	int CACHED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ELEMENT__CONTAINS = 0;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ELEMENT__CONTAINED_IN = 1;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ELEMENT__DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ELEMENT__SCHEMA_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ELEMENT__UNTESTED_REGION = 4;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ELEMENT__REGION = 5;

	/**
	 * The number of structural features of the '<em>Cached Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Cached Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.NamedElementImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__CONTAINS = CACHED_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__CONTAINED_IN = CACHED_ELEMENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DEFINITION = CACHED_ELEMENT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__SCHEMA_ELEMENT = CACHED_ELEMENT__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__UNTESTED_REGION = CACHED_ELEMENT__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__REGION = CACHED_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = CACHED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = CACHED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = CACHED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedDelimitersImpl <em>Cached Delimiters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedDelimitersImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedDelimiters()
	 * @generated
	 */
	int CACHED_DELIMITERS = 2;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_DELIMITERS__CONTAINS = CACHED_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_DELIMITERS__CONTAINED_IN = CACHED_ELEMENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_DELIMITERS__DEFINITION = CACHED_ELEMENT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_DELIMITERS__SCHEMA_ELEMENT = CACHED_ELEMENT__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_DELIMITERS__UNTESTED_REGION = CACHED_ELEMENT__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_DELIMITERS__REGION = CACHED_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Row Delim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_DELIMITERS__ROW_DELIM = CACHED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Col Delim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_DELIMITERS__COL_DELIM = CACHED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Delim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_DELIMITERS__LIST_DELIM = CACHED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cached Delimiters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_DELIMITERS_FEATURE_COUNT = CACHED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cached Delimiters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_DELIMITERS_OPERATION_COUNT = CACHED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedAbstractTokenImpl <em>Cached Abstract Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedAbstractTokenImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedAbstractToken()
	 * @generated
	 */
	int CACHED_ABSTRACT_TOKEN = 3;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ABSTRACT_TOKEN__CONTAINS = NAMED_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ABSTRACT_TOKEN__CONTAINED_IN = NAMED_ELEMENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ABSTRACT_TOKEN__DEFINITION = NAMED_ELEMENT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ABSTRACT_TOKEN__SCHEMA_ELEMENT = NAMED_ELEMENT__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ABSTRACT_TOKEN__UNTESTED_REGION = NAMED_ELEMENT__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ABSTRACT_TOKEN__REGION = NAMED_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ABSTRACT_TOKEN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Cached Abstract Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ABSTRACT_TOKEN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cached Abstract Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ABSTRACT_TOKEN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTokenImpl <em>Cached Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTokenImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedToken()
	 * @generated
	 */
	int CACHED_TOKEN = 4;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TOKEN__CONTAINS = CACHED_ABSTRACT_TOKEN__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TOKEN__CONTAINED_IN = CACHED_ABSTRACT_TOKEN__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TOKEN__DEFINITION = CACHED_ABSTRACT_TOKEN__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TOKEN__SCHEMA_ELEMENT = CACHED_ABSTRACT_TOKEN__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TOKEN__UNTESTED_REGION = CACHED_ABSTRACT_TOKEN__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TOKEN__REGION = CACHED_ABSTRACT_TOKEN__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TOKEN__NAME = CACHED_ABSTRACT_TOKEN__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TOKEN__PATTERN = CACHED_ABSTRACT_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TOKEN__REGEX = CACHED_ABSTRACT_TOKEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cached Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TOKEN_FEATURE_COUNT = CACHED_ABSTRACT_TOKEN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cached Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TOKEN_OPERATION_COUNT = CACHED_ABSTRACT_TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedConstraintImpl <em>Cached Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedConstraintImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedConstraint()
	 * @generated
	 */
	int CACHED_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_CONSTRAINT__CONTAINS = CACHED_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_CONSTRAINT__CONTAINED_IN = CACHED_ELEMENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_CONSTRAINT__DEFINITION = CACHED_ELEMENT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_CONSTRAINT__SCHEMA_ELEMENT = CACHED_ELEMENT__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_CONSTRAINT__UNTESTED_REGION = CACHED_ELEMENT__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_CONSTRAINT__REGION = CACHED_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Fulfilled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_CONSTRAINT__FULFILLED = CACHED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cached Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_CONSTRAINT_FEATURE_COUNT = CACHED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cached Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_CONSTRAINT_OPERATION_COUNT = CACHED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedContentConstraintImpl <em>Cached Content Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedContentConstraintImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedContentConstraint()
	 * @generated
	 */
	int CACHED_CONTENT_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_CONTENT_CONSTRAINT__CONTAINS = CACHED_CONSTRAINT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_CONTENT_CONSTRAINT__CONTAINED_IN = CACHED_CONSTRAINT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_CONTENT_CONSTRAINT__DEFINITION = CACHED_CONSTRAINT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_CONTENT_CONSTRAINT__SCHEMA_ELEMENT = CACHED_CONSTRAINT__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_CONTENT_CONSTRAINT__UNTESTED_REGION = CACHED_CONSTRAINT__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_CONTENT_CONSTRAINT__REGION = CACHED_CONSTRAINT__REGION;

	/**
	 * The feature id for the '<em><b>Fulfilled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_CONTENT_CONSTRAINT__FULFILLED = CACHED_CONSTRAINT__FULFILLED;

	/**
	 * The feature id for the '<em><b>Automaton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_CONTENT_CONSTRAINT__AUTOMATON = CACHED_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cached Content Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_CONTENT_CONSTRAINT_FEATURE_COUNT = CACHED_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cached Content Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_CONTENT_CONSTRAINT_OPERATION_COUNT = CACHED_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedPrimaryKeyConstraintImpl <em>Cached Primary Key Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedPrimaryKeyConstraintImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedPrimaryKeyConstraint()
	 * @generated
	 */
	int CACHED_PRIMARY_KEY_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_PRIMARY_KEY_CONSTRAINT__CONTAINS = CACHED_CONSTRAINT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_PRIMARY_KEY_CONSTRAINT__CONTAINED_IN = CACHED_CONSTRAINT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_PRIMARY_KEY_CONSTRAINT__DEFINITION = CACHED_CONSTRAINT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_PRIMARY_KEY_CONSTRAINT__SCHEMA_ELEMENT = CACHED_CONSTRAINT__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_PRIMARY_KEY_CONSTRAINT__UNTESTED_REGION = CACHED_CONSTRAINT__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_PRIMARY_KEY_CONSTRAINT__REGION = CACHED_CONSTRAINT__REGION;

	/**
	 * The feature id for the '<em><b>Fulfilled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_PRIMARY_KEY_CONSTRAINT__FULFILLED = CACHED_CONSTRAINT__FULFILLED;

	/**
	 * The feature id for the '<em><b>Tuple Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_PRIMARY_KEY_CONSTRAINT__TUPLE_CACHE = CACHED_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cached Primary Key Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_PRIMARY_KEY_CONSTRAINT_FEATURE_COUNT = CACHED_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cached Primary Key Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_PRIMARY_KEY_CONSTRAINT_OPERATION_COUNT = CACHED_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedForeignKeyConstraintImpl <em>Cached Foreign Key Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedForeignKeyConstraintImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedForeignKeyConstraint()
	 * @generated
	 */
	int CACHED_FOREIGN_KEY_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_FOREIGN_KEY_CONSTRAINT__CONTAINS = CACHED_CONSTRAINT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_FOREIGN_KEY_CONSTRAINT__CONTAINED_IN = CACHED_CONSTRAINT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_FOREIGN_KEY_CONSTRAINT__DEFINITION = CACHED_CONSTRAINT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_FOREIGN_KEY_CONSTRAINT__SCHEMA_ELEMENT = CACHED_CONSTRAINT__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_FOREIGN_KEY_CONSTRAINT__UNTESTED_REGION = CACHED_CONSTRAINT__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_FOREIGN_KEY_CONSTRAINT__REGION = CACHED_CONSTRAINT__REGION;

	/**
	 * The feature id for the '<em><b>Fulfilled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_FOREIGN_KEY_CONSTRAINT__FULFILLED = CACHED_CONSTRAINT__FULFILLED;

	/**
	 * The feature id for the '<em><b>Referenced Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_FOREIGN_KEY_CONSTRAINT__REFERENCED_RELATION = CACHED_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cached Foreign Key Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_FOREIGN_KEY_CONSTRAINT_FEATURE_COUNT = CACHED_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cached Foreign Key Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_FOREIGN_KEY_CONSTRAINT_OPERATION_COUNT = CACHED_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedNodeExpressionImpl <em>Cached Node Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedNodeExpressionImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedNodeExpression()
	 * @generated
	 */
	int CACHED_NODE_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_NODE_EXPRESSION__CONTAINS = CACHED_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_NODE_EXPRESSION__CONTAINED_IN = CACHED_ELEMENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_NODE_EXPRESSION__DEFINITION = CACHED_ELEMENT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_NODE_EXPRESSION__SCHEMA_ELEMENT = CACHED_ELEMENT__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_NODE_EXPRESSION__UNTESTED_REGION = CACHED_ELEMENT__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_NODE_EXPRESSION__REGION = CACHED_ELEMENT__REGION;

	/**
	 * The number of structural features of the '<em>Cached Node Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_NODE_EXPRESSION_FEATURE_COUNT = CACHED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cached Node Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_NODE_EXPRESSION_OPERATION_COUNT = CACHED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedRegionTokenImpl <em>Cached Region Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedRegionTokenImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedRegionToken()
	 * @generated
	 */
	int CACHED_REGION_TOKEN = 10;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_REGION_TOKEN__CONTAINS = CACHED_ABSTRACT_TOKEN__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_REGION_TOKEN__CONTAINED_IN = CACHED_ABSTRACT_TOKEN__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_REGION_TOKEN__DEFINITION = CACHED_ABSTRACT_TOKEN__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_REGION_TOKEN__SCHEMA_ELEMENT = CACHED_ABSTRACT_TOKEN__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_REGION_TOKEN__UNTESTED_REGION = CACHED_ABSTRACT_TOKEN__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_REGION_TOKEN__REGION = CACHED_ABSTRACT_TOKEN__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_REGION_TOKEN__NAME = CACHED_ABSTRACT_TOKEN__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_REGION_TOKEN__TYPE = CACHED_ABSTRACT_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cached Region Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_REGION_TOKEN_FEATURE_COUNT = CACHED_ABSTRACT_TOKEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cached Region Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_REGION_TOKEN_OPERATION_COUNT = CACHED_ABSTRACT_TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTypeImpl <em>Cached Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTypeImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedType()
	 * @generated
	 */
	int CACHED_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TYPE__CONTAINS = CACHED_TOKEN__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TYPE__CONTAINED_IN = CACHED_TOKEN__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TYPE__DEFINITION = CACHED_TOKEN__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TYPE__SCHEMA_ELEMENT = CACHED_TOKEN__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TYPE__UNTESTED_REGION = CACHED_TOKEN__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TYPE__REGION = CACHED_TOKEN__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TYPE__NAME = CACHED_TOKEN__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TYPE__PATTERN = CACHED_TOKEN__PATTERN;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TYPE__REGEX = CACHED_TOKEN__REGEX;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TYPE__VALUES = CACHED_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cached Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TYPE_FEATURE_COUNT = CACHED_TOKEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cached Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TYPE_OPERATION_COUNT = CACHED_TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedAtomicTypeImpl <em>Cached Atomic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedAtomicTypeImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedAtomicType()
	 * @generated
	 */
	int CACHED_ATOMIC_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ATOMIC_TYPE__CONTAINS = CACHED_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ATOMIC_TYPE__CONTAINED_IN = CACHED_TYPE__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ATOMIC_TYPE__DEFINITION = CACHED_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ATOMIC_TYPE__SCHEMA_ELEMENT = CACHED_TYPE__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ATOMIC_TYPE__UNTESTED_REGION = CACHED_TYPE__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ATOMIC_TYPE__REGION = CACHED_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ATOMIC_TYPE__NAME = CACHED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ATOMIC_TYPE__PATTERN = CACHED_TYPE__PATTERN;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ATOMIC_TYPE__REGEX = CACHED_TYPE__REGEX;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ATOMIC_TYPE__VALUES = CACHED_TYPE__VALUES;

	/**
	 * The feature id for the '<em><b>Parser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ATOMIC_TYPE__PARSER = CACHED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cached Atomic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ATOMIC_TYPE_FEATURE_COUNT = CACHED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cached Atomic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_ATOMIC_TYPE_OPERATION_COUNT = CACHED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedListTypeImpl <em>Cached List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedListTypeImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedListType()
	 * @generated
	 */
	int CACHED_LIST_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_LIST_TYPE__CONTAINS = CACHED_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_LIST_TYPE__CONTAINED_IN = CACHED_TYPE__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_LIST_TYPE__DEFINITION = CACHED_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_LIST_TYPE__SCHEMA_ELEMENT = CACHED_TYPE__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_LIST_TYPE__UNTESTED_REGION = CACHED_TYPE__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_LIST_TYPE__REGION = CACHED_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_LIST_TYPE__NAME = CACHED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_LIST_TYPE__PATTERN = CACHED_TYPE__PATTERN;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_LIST_TYPE__REGEX = CACHED_TYPE__REGEX;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_LIST_TYPE__VALUES = CACHED_TYPE__VALUES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_LIST_TYPE__TYPE = CACHED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cached List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_LIST_TYPE_FEATURE_COUNT = CACHED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cached List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_LIST_TYPE_OPERATION_COUNT = CACHED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedCompoundTypeImpl <em>Cached Compound Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedCompoundTypeImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedCompoundType()
	 * @generated
	 */
	int CACHED_COMPOUND_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_COMPOUND_TYPE__CONTAINS = CACHED_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_COMPOUND_TYPE__CONTAINED_IN = CACHED_TYPE__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_COMPOUND_TYPE__DEFINITION = CACHED_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_COMPOUND_TYPE__SCHEMA_ELEMENT = CACHED_TYPE__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_COMPOUND_TYPE__UNTESTED_REGION = CACHED_TYPE__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_COMPOUND_TYPE__REGION = CACHED_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_COMPOUND_TYPE__NAME = CACHED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_COMPOUND_TYPE__PATTERN = CACHED_TYPE__PATTERN;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_COMPOUND_TYPE__REGEX = CACHED_TYPE__REGEX;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_COMPOUND_TYPE__VALUES = CACHED_TYPE__VALUES;

	/**
	 * The feature id for the '<em><b>Primitives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_COMPOUND_TYPE__PRIMITIVES = CACHED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capturing Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_COMPOUND_TYPE__CAPTURING_PATTERN = CACHED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cached Compound Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_COMPOUND_TYPE_FEATURE_COUNT = CACHED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cached Compound Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_COMPOUND_TYPE_OPERATION_COUNT = CACHED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLElementImpl <em>Cached TL Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLElementImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLElement()
	 * @generated
	 */
	int CACHED_TL_ELEMENT = 16;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLPrimitiveImpl <em>Cached TL Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLPrimitiveImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLPrimitive()
	 * @generated
	 */
	int CACHED_TL_PRIMITIVE = 20;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLConstantImpl <em>Cached TL Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLConstantImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLConstant()
	 * @generated
	 */
	int CACHED_TL_CONSTANT = 21;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLOutputVariableImpl <em>Cached TL Output Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLOutputVariableImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLOutputVariable()
	 * @generated
	 */
	int CACHED_TL_OUTPUT_VARIABLE = 22;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLVariableBindingImpl <em>Cached TL Variable Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLVariableBindingImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLVariableBinding()
	 * @generated
	 */
	int CACHED_TL_VARIABLE_BINDING = 15;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_VARIABLE_BINDING__CONTAINS = CACHED_ABSTRACT_TOKEN__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_VARIABLE_BINDING__CONTAINED_IN = CACHED_ABSTRACT_TOKEN__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_VARIABLE_BINDING__DEFINITION = CACHED_ABSTRACT_TOKEN__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_VARIABLE_BINDING__SCHEMA_ELEMENT = CACHED_ABSTRACT_TOKEN__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_VARIABLE_BINDING__UNTESTED_REGION = CACHED_ABSTRACT_TOKEN__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_VARIABLE_BINDING__REGION = CACHED_ABSTRACT_TOKEN__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_VARIABLE_BINDING__NAME = CACHED_ABSTRACT_TOKEN__NAME;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_VARIABLE_BINDING__TOKEN = CACHED_ABSTRACT_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Possible Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_VARIABLE_BINDING__POSSIBLE_TOKENS = CACHED_ABSTRACT_TOKEN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Strict Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_VARIABLE_BINDING__STRICT_TYPE = CACHED_ABSTRACT_TOKEN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_VARIABLE_BINDING__CONTENTS = CACHED_ABSTRACT_TOKEN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cached TL Variable Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_VARIABLE_BINDING_FEATURE_COUNT = CACHED_ABSTRACT_TOKEN_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_VARIABLE_BINDING___RESET = CACHED_ABSTRACT_TOKEN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_VARIABLE_BINDING___ADD__INT_STRING_CACHEDTOKEN = CACHED_ABSTRACT_TOKEN_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_VARIABLE_BINDING___SET_DEFAULT = CACHED_ABSTRACT_TOKEN_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cached TL Variable Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_VARIABLE_BINDING_OPERATION_COUNT = CACHED_ABSTRACT_TOKEN_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_ELEMENT__CONTAINS = CACHED_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_ELEMENT__CONTAINED_IN = CACHED_ELEMENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_ELEMENT__DEFINITION = CACHED_ELEMENT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_ELEMENT__SCHEMA_ELEMENT = CACHED_ELEMENT__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_ELEMENT__UNTESTED_REGION = CACHED_ELEMENT__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_ELEMENT__REGION = CACHED_ELEMENT__REGION;

	/**
	 * The number of structural features of the '<em>Cached TL Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_ELEMENT_FEATURE_COUNT = CACHED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cached TL Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_ELEMENT_OPERATION_COUNT = CACHED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLTypeInspectorImpl <em>Cached TL Type Inspector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLTypeInspectorImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLTypeInspector()
	 * @generated
	 */
	int CACHED_TL_TYPE_INSPECTOR = 23;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLStatementImpl <em>Cached TL Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLStatementImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLStatement()
	 * @generated
	 */
	int CACHED_TL_STATEMENT = 17;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_STATEMENT__CONTAINS = CACHED_TL_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_STATEMENT__CONTAINED_IN = CACHED_TL_ELEMENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_STATEMENT__DEFINITION = CACHED_TL_ELEMENT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_STATEMENT__SCHEMA_ELEMENT = CACHED_TL_ELEMENT__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_STATEMENT__UNTESTED_REGION = CACHED_TL_ELEMENT__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_STATEMENT__REGION = CACHED_TL_ELEMENT__REGION;

	/**
	 * The number of structural features of the '<em>Cached TL Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_STATEMENT_FEATURE_COUNT = CACHED_TL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cached TL Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_STATEMENT_OPERATION_COUNT = CACHED_TL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLOutputImpl <em>Cached TL Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLOutputImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLOutput()
	 * @generated
	 */
	int CACHED_TL_OUTPUT = 19;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLLoopImpl <em>Cached TL Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLLoopImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLLoop()
	 * @generated
	 */
	int CACHED_TL_LOOP = 18;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_LOOP__CONTAINS = CACHED_TL_STATEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_LOOP__CONTAINED_IN = CACHED_TL_STATEMENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_LOOP__DEFINITION = CACHED_TL_STATEMENT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_LOOP__SCHEMA_ELEMENT = CACHED_TL_STATEMENT__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_LOOP__UNTESTED_REGION = CACHED_TL_STATEMENT__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_LOOP__REGION = CACHED_TL_STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Automaton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_LOOP__AUTOMATON = CACHED_TL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_LOOP__STATEMENTS = CACHED_TL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_LOOP__BINDINGS = CACHED_TL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cached TL Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_LOOP_FEATURE_COUNT = CACHED_TL_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cached TL Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_LOOP_OPERATION_COUNT = CACHED_TL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT__CONTAINS = CACHED_TL_STATEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT__CONTAINED_IN = CACHED_TL_STATEMENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT__DEFINITION = CACHED_TL_STATEMENT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT__SCHEMA_ELEMENT = CACHED_TL_STATEMENT__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT__UNTESTED_REGION = CACHED_TL_STATEMENT__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT__REGION = CACHED_TL_STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Primitives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT__PRIMITIVES = CACHED_TL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cached TL Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT_FEATURE_COUNT = CACHED_TL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cached TL Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT_OPERATION_COUNT = CACHED_TL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_PRIMITIVE__CONTAINS = CACHED_TL_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_PRIMITIVE__CONTAINED_IN = CACHED_TL_ELEMENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_PRIMITIVE__DEFINITION = CACHED_TL_ELEMENT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_PRIMITIVE__SCHEMA_ELEMENT = CACHED_TL_ELEMENT__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_PRIMITIVE__UNTESTED_REGION = CACHED_TL_ELEMENT__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_PRIMITIVE__REGION = CACHED_TL_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_PRIMITIVE__TEXT = CACHED_TL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_PRIMITIVE__TOKEN = CACHED_TL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cached TL Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_PRIMITIVE_FEATURE_COUNT = CACHED_TL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_PRIMITIVE___RESET = CACHED_TL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cached TL Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_PRIMITIVE_OPERATION_COUNT = CACHED_TL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_CONSTANT__CONTAINS = CACHED_TL_PRIMITIVE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_CONSTANT__CONTAINED_IN = CACHED_TL_PRIMITIVE__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_CONSTANT__DEFINITION = CACHED_TL_PRIMITIVE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_CONSTANT__SCHEMA_ELEMENT = CACHED_TL_PRIMITIVE__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_CONSTANT__UNTESTED_REGION = CACHED_TL_PRIMITIVE__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_CONSTANT__REGION = CACHED_TL_PRIMITIVE__REGION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_CONSTANT__TEXT = CACHED_TL_PRIMITIVE__TEXT;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_CONSTANT__TOKEN = CACHED_TL_PRIMITIVE__TOKEN;

	/**
	 * The number of structural features of the '<em>Cached TL Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_CONSTANT_FEATURE_COUNT = CACHED_TL_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_CONSTANT___RESET = CACHED_TL_PRIMITIVE___RESET;

	/**
	 * The number of operations of the '<em>Cached TL Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_CONSTANT_OPERATION_COUNT = CACHED_TL_PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT_VARIABLE__CONTAINS = CACHED_TL_PRIMITIVE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT_VARIABLE__CONTAINED_IN = CACHED_TL_PRIMITIVE__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT_VARIABLE__DEFINITION = CACHED_TL_PRIMITIVE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT_VARIABLE__SCHEMA_ELEMENT = CACHED_TL_PRIMITIVE__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT_VARIABLE__UNTESTED_REGION = CACHED_TL_PRIMITIVE__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT_VARIABLE__REGION = CACHED_TL_PRIMITIVE__REGION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT_VARIABLE__TEXT = CACHED_TL_PRIMITIVE__TEXT;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT_VARIABLE__TOKEN = CACHED_TL_PRIMITIVE__TOKEN;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT_VARIABLE__BINDING = CACHED_TL_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cached TL Output Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT_VARIABLE_FEATURE_COUNT = CACHED_TL_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT_VARIABLE___RESET = CACHED_TL_PRIMITIVE___RESET;

	/**
	 * The number of operations of the '<em>Cached TL Output Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_OUTPUT_VARIABLE_OPERATION_COUNT = CACHED_TL_PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_TYPE_INSPECTOR__CONTAINS = CACHED_TL_OUTPUT_VARIABLE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_TYPE_INSPECTOR__CONTAINED_IN = CACHED_TL_OUTPUT_VARIABLE__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_TYPE_INSPECTOR__DEFINITION = CACHED_TL_OUTPUT_VARIABLE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_TYPE_INSPECTOR__SCHEMA_ELEMENT = CACHED_TL_OUTPUT_VARIABLE__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_TYPE_INSPECTOR__UNTESTED_REGION = CACHED_TL_OUTPUT_VARIABLE__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_TYPE_INSPECTOR__REGION = CACHED_TL_OUTPUT_VARIABLE__REGION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_TYPE_INSPECTOR__TEXT = CACHED_TL_OUTPUT_VARIABLE__TEXT;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_TYPE_INSPECTOR__TOKEN = CACHED_TL_OUTPUT_VARIABLE__TOKEN;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_TYPE_INSPECTOR__BINDING = CACHED_TL_OUTPUT_VARIABLE__BINDING;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_TYPE_INSPECTOR__PATH = CACHED_TL_OUTPUT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_TYPE_INSPECTOR__TYPE = CACHED_TL_OUTPUT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cached TL Type Inspector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_TYPE_INSPECTOR_FEATURE_COUNT = CACHED_TL_OUTPUT_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_TYPE_INSPECTOR___RESET = CACHED_TL_OUTPUT_VARIABLE___RESET;

	/**
	 * The number of operations of the '<em>Cached TL Type Inspector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_TYPE_INSPECTOR_OPERATION_COUNT = CACHED_TL_OUTPUT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTransformationProgramImpl <em>Cached Transformation Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTransformationProgramImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTransformationProgram()
	 * @generated
	 */
	int CACHED_TRANSFORMATION_PROGRAM = 24;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TRANSFORMATION_PROGRAM__CONTAINS = CACHED_TL_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TRANSFORMATION_PROGRAM__CONTAINED_IN = CACHED_TL_ELEMENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TRANSFORMATION_PROGRAM__DEFINITION = CACHED_TL_ELEMENT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TRANSFORMATION_PROGRAM__SCHEMA_ELEMENT = CACHED_TL_ELEMENT__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TRANSFORMATION_PROGRAM__UNTESTED_REGION = CACHED_TL_ELEMENT__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TRANSFORMATION_PROGRAM__REGION = CACHED_TL_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TRANSFORMATION_PROGRAM__STATEMENTS = CACHED_TL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delimiters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TRANSFORMATION_PROGRAM__DELIMITERS = CACHED_TL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transformed Csv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TRANSFORMATION_PROGRAM__TRANSFORMED_CSV = CACHED_TL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>W3c Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TRANSFORMATION_PROGRAM__W3C_SCHEMA = CACHED_TL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TRANSFORMATION_PROGRAM__ERROR = CACHED_TL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Cached Transformation Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TRANSFORMATION_PROGRAM_FEATURE_COUNT = CACHED_TL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Cached Transformation Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TRANSFORMATION_PROGRAM_OPERATION_COUNT = CACHED_TL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLIfImpl <em>Cached TL If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLIfImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLIf()
	 * @generated
	 */
	int CACHED_TL_IF = 25;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_IF__CONTAINS = CACHED_TL_STATEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_IF__CONTAINED_IN = CACHED_TL_STATEMENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_IF__DEFINITION = CACHED_TL_STATEMENT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_IF__SCHEMA_ELEMENT = CACHED_TL_STATEMENT__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_IF__UNTESTED_REGION = CACHED_TL_STATEMENT__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_IF__REGION = CACHED_TL_STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>If Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_IF__IF_BLOCK = CACHED_TL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_IF__ELSE_BLOCK = CACHED_TL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cached TL If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_IF_FEATURE_COUNT = CACHED_TL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cached TL If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_IF_OPERATION_COUNT = CACHED_TL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLBoolExprImpl <em>Cached TL Bool Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLBoolExprImpl
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLBoolExpr()
	 * @generated
	 */
	int CACHED_TL_BOOL_EXPR = 26;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_BOOL_EXPR__CONTAINS = CACHED_TL_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_BOOL_EXPR__CONTAINED_IN = CACHED_TL_ELEMENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_BOOL_EXPR__DEFINITION = CACHED_TL_ELEMENT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_BOOL_EXPR__SCHEMA_ELEMENT = CACHED_TL_ELEMENT__SCHEMA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_BOOL_EXPR__UNTESTED_REGION = CACHED_TL_ELEMENT__UNTESTED_REGION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_BOOL_EXPR__REGION = CACHED_TL_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Fulfilled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_BOOL_EXPR__FULFILLED = CACHED_TL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cached TL Bool Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_BOOL_EXPR_FEATURE_COUNT = CACHED_TL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cached TL Bool Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHED_TL_BOOL_EXPR_OPERATION_COUNT = CACHED_TL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Int Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getIntArray()
	 * @generated
	 */
	int INT_ARRAY = 27;

	/**
	 * The meta object id for the '<em>Pattern</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.regex.Pattern
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 29;

	/**
	 * The meta object id for the '<em>Bit Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.BitSet
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getBitSet()
	 * @generated
	 */
	int BIT_SET = 30;

	/**
	 * The meta object id for the '<em>Coordinate</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.util.Coordinate
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCoordinate()
	 * @generated
	 */
	int COORDINATE = 31;

	/**
	 * The meta object id for the '<em>Region</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.library.dataStructures.Region
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 32;

	/**
	 * The meta object id for the '<em>Schema Element</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.SchemaElement
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getSchemaElement()
	 * @generated
	 */
	int SCHEMA_ELEMENT = 33;

	/**
	 * The meta object id for the '<em>Token</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.sculpt.Token
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 34;

	/**
	 * The meta object id for the '<em>Parser</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai7.csv_validator.library.parser.Parser
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getParser()
	 * @generated
	 */
	int PARSER = 35;


	/**
	 * Returns the meta object for data type '{@link java.util.HashSet <em>Hash Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hash Set</em>'.
	 * @see java.util.HashSet
	 * @model instanceClass="java.util.HashSet" typeParameters="E"
	 * @generated
	 */
	EDataType getHashSet();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement <em>Cached Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached Element</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement
	 * @generated
	 */
	EClass getCachedElement();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getContains()
	 * @see #getCachedElement()
	 * @generated
	 */
	EReference getCachedElement_Contains();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getContainedIn <em>Contained In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained In</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getContainedIn()
	 * @see #getCachedElement()
	 * @generated
	 */
	EReference getCachedElement_ContainedIn();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getRegion()
	 * @see #getCachedElement()
	 * @generated
	 */
	EAttribute getCachedElement_Region();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getDefinition()
	 * @see #getCachedElement()
	 * @generated
	 */
	EAttribute getCachedElement_Definition();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getSchemaElement <em>Schema Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Element</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getSchemaElement()
	 * @see #getCachedElement()
	 * @generated
	 */
	EAttribute getCachedElement_SchemaElement();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getUntestedRegion <em>Untested Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Untested Region</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getUntestedRegion()
	 * @see #getCachedElement()
	 * @generated
	 */
	EAttribute getCachedElement_UntestedRegion();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedDelimiters <em>Cached Delimiters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached Delimiters</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedDelimiters
	 * @generated
	 */
	EClass getCachedDelimiters();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedDelimiters#getRowDelim <em>Row Delim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Delim</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedDelimiters#getRowDelim()
	 * @see #getCachedDelimiters()
	 * @generated
	 */
	EAttribute getCachedDelimiters_RowDelim();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedDelimiters#getColDelim <em>Col Delim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col Delim</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedDelimiters#getColDelim()
	 * @see #getCachedDelimiters()
	 * @generated
	 */
	EAttribute getCachedDelimiters_ColDelim();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedDelimiters#getListDelim <em>List Delim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Delim</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedDelimiters#getListDelim()
	 * @see #getCachedDelimiters()
	 * @generated
	 */
	EAttribute getCachedDelimiters_ListDelim();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedAbstractToken <em>Cached Abstract Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached Abstract Token</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedAbstractToken
	 * @generated
	 */
	EClass getCachedAbstractToken();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedToken <em>Cached Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached Token</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedToken
	 * @generated
	 */
	EClass getCachedToken();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedToken#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedToken#getPattern()
	 * @see #getCachedToken()
	 * @generated
	 */
	EAttribute getCachedToken_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedToken#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedToken#getRegex()
	 * @see #getCachedToken()
	 * @generated
	 */
	EAttribute getCachedToken_Regex();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedConstraint <em>Cached Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached Constraint</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedConstraint
	 * @generated
	 */
	EClass getCachedConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedConstraint#getFulfilled <em>Fulfilled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fulfilled</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedConstraint#getFulfilled()
	 * @see #getCachedConstraint()
	 * @generated
	 */
	EAttribute getCachedConstraint_Fulfilled();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedContentConstraint <em>Cached Content Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached Content Constraint</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedContentConstraint
	 * @generated
	 */
	EClass getCachedContentConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedContentConstraint#getAutomaton <em>Automaton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automaton</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedContentConstraint#getAutomaton()
	 * @see #getCachedContentConstraint()
	 * @generated
	 */
	EAttribute getCachedContentConstraint_Automaton();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedPrimaryKeyConstraint <em>Cached Primary Key Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached Primary Key Constraint</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedPrimaryKeyConstraint
	 * @generated
	 */
	EClass getCachedPrimaryKeyConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedPrimaryKeyConstraint#getTupleCache <em>Tuple Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tuple Cache</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedPrimaryKeyConstraint#getTupleCache()
	 * @see #getCachedPrimaryKeyConstraint()
	 * @generated
	 */
	EAttribute getCachedPrimaryKeyConstraint_TupleCache();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedForeignKeyConstraint <em>Cached Foreign Key Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached Foreign Key Constraint</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedForeignKeyConstraint
	 * @generated
	 */
	EClass getCachedForeignKeyConstraint();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedForeignKeyConstraint#getReferencedRelation <em>Referenced Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Relation</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedForeignKeyConstraint#getReferencedRelation()
	 * @see #getCachedForeignKeyConstraint()
	 * @generated
	 */
	EReference getCachedForeignKeyConstraint_ReferencedRelation();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedNodeExpression <em>Cached Node Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached Node Expression</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedNodeExpression
	 * @generated
	 */
	EClass getCachedNodeExpression();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedRegionToken <em>Cached Region Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached Region Token</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedRegionToken
	 * @generated
	 */
	EClass getCachedRegionToken();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedRegionToken#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedRegionToken#getType()
	 * @see #getCachedRegionToken()
	 * @generated
	 */
	EReference getCachedRegionToken_Type();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedType <em>Cached Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached Type</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedType
	 * @generated
	 */
	EClass getCachedType();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedType#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedType#getValues()
	 * @see #getCachedType()
	 * @generated
	 */
	EAttribute getCachedType_Values();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedAtomicType <em>Cached Atomic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached Atomic Type</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedAtomicType
	 * @generated
	 */
	EClass getCachedAtomicType();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedAtomicType#getParser <em>Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parser</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedAtomicType#getParser()
	 * @see #getCachedAtomicType()
	 * @generated
	 */
	EAttribute getCachedAtomicType_Parser();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedListType <em>Cached List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached List Type</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedListType
	 * @generated
	 */
	EClass getCachedListType();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedListType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedListType#getType()
	 * @see #getCachedListType()
	 * @generated
	 */
	EReference getCachedListType_Type();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedCompoundType <em>Cached Compound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached Compound Type</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedCompoundType
	 * @generated
	 */
	EClass getCachedCompoundType();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedCompoundType#getPrimitives <em>Primitives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Primitives</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedCompoundType#getPrimitives()
	 * @see #getCachedCompoundType()
	 * @generated
	 */
	EReference getCachedCompoundType_Primitives();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedCompoundType#getCapturingPattern <em>Capturing Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capturing Pattern</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedCompoundType#getCapturingPattern()
	 * @see #getCachedCompoundType()
	 * @generated
	 */
	EAttribute getCachedCompoundType_CapturingPattern();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLElement <em>Cached TL Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached TL Element</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLElement
	 * @generated
	 */
	EClass getCachedTLElement();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLPrimitive <em>Cached TL Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached TL Primitive</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLPrimitive
	 * @generated
	 */
	EClass getCachedTLPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLPrimitive#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLPrimitive#getText()
	 * @see #getCachedTLPrimitive()
	 * @generated
	 */
	EAttribute getCachedTLPrimitive_Text();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLPrimitive#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLPrimitive#getToken()
	 * @see #getCachedTLPrimitive()
	 * @generated
	 */
	EReference getCachedTLPrimitive_Token();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLPrimitive#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset</em>' operation.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLPrimitive#reset()
	 * @generated
	 */
	EOperation getCachedTLPrimitive__Reset();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLConstant <em>Cached TL Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached TL Constant</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLConstant
	 * @generated
	 */
	EClass getCachedTLConstant();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutputVariable <em>Cached TL Output Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached TL Output Variable</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutputVariable
	 * @generated
	 */
	EClass getCachedTLOutputVariable();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutputVariable#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutputVariable#getBinding()
	 * @see #getCachedTLOutputVariable()
	 * @generated
	 */
	EReference getCachedTLOutputVariable_Binding();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding <em>Cached TL Variable Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached TL Variable Binding</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding
	 * @generated
	 */
	EClass getCachedTLVariableBinding();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#getToken()
	 * @see #getCachedTLVariableBinding()
	 * @generated
	 */
	EReference getCachedTLVariableBinding_Token();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#getPossibleTokens <em>Possible Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Possible Tokens</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#getPossibleTokens()
	 * @see #getCachedTLVariableBinding()
	 * @generated
	 */
	EReference getCachedTLVariableBinding_PossibleTokens();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#isStrictType <em>Strict Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strict Type</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#isStrictType()
	 * @see #getCachedTLVariableBinding()
	 * @generated
	 */
	EAttribute getCachedTLVariableBinding_StrictType();

	/**
	 * Returns the meta object for the attribute list '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Contents</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#getContents()
	 * @see #getCachedTLVariableBinding()
	 * @generated
	 */
	EAttribute getCachedTLVariableBinding_Contents();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset</em>' operation.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#reset()
	 * @generated
	 */
	EOperation getCachedTLVariableBinding__Reset();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#add(int, java.lang.String, de.ubt.ai7.csv_validator.caches.dataStructures.CachedToken) <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#add(int, java.lang.String, de.ubt.ai7.csv_validator.caches.dataStructures.CachedToken)
	 * @generated
	 */
	EOperation getCachedTLVariableBinding__Add__int_String_CachedToken();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#setDefault() <em>Set Default</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Default</em>' operation.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#setDefault()
	 * @generated
	 */
	EOperation getCachedTLVariableBinding__SetDefault();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLTypeInspector <em>Cached TL Type Inspector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached TL Type Inspector</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLTypeInspector
	 * @generated
	 */
	EClass getCachedTLTypeInspector();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLTypeInspector#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLTypeInspector#getPath()
	 * @see #getCachedTLTypeInspector()
	 * @generated
	 */
	EAttribute getCachedTLTypeInspector_Path();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLTypeInspector#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLTypeInspector#getType()
	 * @see #getCachedTLTypeInspector()
	 * @generated
	 */
	EReference getCachedTLTypeInspector_Type();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLStatement <em>Cached TL Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached TL Statement</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLStatement
	 * @generated
	 */
	EClass getCachedTLStatement();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutput <em>Cached TL Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached TL Output</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutput
	 * @generated
	 */
	EClass getCachedTLOutput();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutput#getPrimitives <em>Primitives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Primitives</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutput#getPrimitives()
	 * @see #getCachedTLOutput()
	 * @generated
	 */
	EReference getCachedTLOutput_Primitives();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLLoop <em>Cached TL Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached TL Loop</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLLoop
	 * @generated
	 */
	EClass getCachedTLLoop();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLLoop#getAutomaton <em>Automaton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automaton</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLLoop#getAutomaton()
	 * @see #getCachedTLLoop()
	 * @generated
	 */
	EAttribute getCachedTLLoop_Automaton();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLLoop#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLLoop#getStatements()
	 * @see #getCachedTLLoop()
	 * @generated
	 */
	EReference getCachedTLLoop_Statements();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLLoop#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLLoop#getBindings()
	 * @see #getCachedTLLoop()
	 * @generated
	 */
	EReference getCachedTLLoop_Bindings();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram <em>Cached Transformation Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached Transformation Program</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram
	 * @generated
	 */
	EClass getCachedTransformationProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram#getStatements()
	 * @see #getCachedTransformationProgram()
	 * @generated
	 */
	EReference getCachedTransformationProgram_Statements();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram#getDelimiters <em>Delimiters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delimiters</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram#getDelimiters()
	 * @see #getCachedTransformationProgram()
	 * @generated
	 */
	EReference getCachedTransformationProgram_Delimiters();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram#getTransformedCsv <em>Transformed Csv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformed Csv</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram#getTransformedCsv()
	 * @see #getCachedTransformationProgram()
	 * @generated
	 */
	EAttribute getCachedTransformationProgram_TransformedCsv();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram#getW3cSchema <em>W3c Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>W3c Schema</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram#getW3cSchema()
	 * @see #getCachedTransformationProgram()
	 * @generated
	 */
	EAttribute getCachedTransformationProgram_W3cSchema();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram#getError()
	 * @see #getCachedTransformationProgram()
	 * @generated
	 */
	EAttribute getCachedTransformationProgram_Error();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLIf <em>Cached TL If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached TL If</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLIf
	 * @generated
	 */
	EClass getCachedTLIf();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLIf#getIfBlock <em>If Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If Block</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLIf#getIfBlock()
	 * @see #getCachedTLIf()
	 * @generated
	 */
	EReference getCachedTLIf_IfBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLIf#getElseBlock <em>Else Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Block</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLIf#getElseBlock()
	 * @see #getCachedTLIf()
	 * @generated
	 */
	EReference getCachedTLIf_ElseBlock();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLBoolExpr <em>Cached TL Bool Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached TL Bool Expr</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLBoolExpr
	 * @generated
	 */
	EClass getCachedTLBoolExpr();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLBoolExpr#getFulfilled <em>Fulfilled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fulfilled</em>'.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLBoolExpr#getFulfilled()
	 * @see #getCachedTLBoolExpr()
	 * @generated
	 */
	EAttribute getCachedTLBoolExpr_Fulfilled();

	/**
	 * Returns the meta object for data type '<em>Int Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Int Array</em>'.
	 * @model instanceClass="int[]"
	 * @generated
	 */
	EDataType getIntArray();

	/**
	 * Returns the meta object for data type '{@link java.util.regex.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pattern</em>'.
	 * @see java.util.regex.Pattern
	 * @model instanceClass="java.util.regex.Pattern" serializeable="false"
	 * @generated
	 */
	EDataType getPattern();

	/**
	 * Returns the meta object for data type '{@link java.util.BitSet <em>Bit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bit Set</em>'.
	 * @see java.util.BitSet
	 * @model instanceClass="java.util.BitSet"
	 * @generated
	 */
	EDataType getBitSet();

	/**
	 * Returns the meta object for data type '{@link de.ubt.ai7.csv_validator.util.Coordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Coordinate</em>'.
	 * @see de.ubt.ai7.csv_validator.util.Coordinate
	 * @model instanceClass="de.ubt.ai7.csv_validator.util.Coordinate"
	 * @generated
	 */
	EDataType getCoordinate();

	/**
	 * Returns the meta object for data type '{@link de.ubt.ai7.csv_validator.library.dataStructures.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Region</em>'.
	 * @see de.ubt.ai7.csv_validator.library.dataStructures.Region
	 * @model instanceClass="de.ubt.ai7.csv_validator.library.dataStructures.Region"
	 * @generated
	 */
	EDataType getRegion();

	/**
	 * Returns the meta object for data type '{@link de.ubt.ai7.csv_validator.sculpt.SchemaElement <em>Schema Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Schema Element</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.SchemaElement
	 * @model instanceClass="de.ubt.ai7.csv_validator.sculpt.SchemaElement"
	 * @generated
	 */
	EDataType getSchemaElement();

	/**
	 * Returns the meta object for data type '{@link de.ubt.ai7.csv_validator.sculpt.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Token</em>'.
	 * @see de.ubt.ai7.csv_validator.sculpt.Token
	 * @model instanceClass="de.ubt.ai7.csv_validator.sculpt.Token"
	 * @generated
	 */
	EDataType getToken();

	/**
	 * Returns the meta object for data type '{@link de.ubt.ai7.csv_validator.library.parser.Parser <em>Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Parser</em>'.
	 * @see de.ubt.ai7.csv_validator.library.parser.Parser
	 * @model instanceClass="de.ubt.ai7.csv_validator.library.parser.Parser"
	 * @generated
	 */
	EDataType getParser();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	dataStructuresFactory getdataStructuresFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '<em>Hash Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.HashSet
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getHashSet()
		 * @generated
		 */
		EDataType HASH_SET = eINSTANCE.getHashSet();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedElementImpl <em>Cached Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedElementImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedElement()
		 * @generated
		 */
		EClass CACHED_ELEMENT = eINSTANCE.getCachedElement();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHED_ELEMENT__CONTAINS = eINSTANCE.getCachedElement_Contains();

		/**
		 * The meta object literal for the '<em><b>Contained In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHED_ELEMENT__CONTAINED_IN = eINSTANCE.getCachedElement_ContainedIn();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_ELEMENT__REGION = eINSTANCE.getCachedElement_Region();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_ELEMENT__DEFINITION = eINSTANCE.getCachedElement_Definition();

		/**
		 * The meta object literal for the '<em><b>Schema Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_ELEMENT__SCHEMA_ELEMENT = eINSTANCE.getCachedElement_SchemaElement();

		/**
		 * The meta object literal for the '<em><b>Untested Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_ELEMENT__UNTESTED_REGION = eINSTANCE.getCachedElement_UntestedRegion();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.NamedElementImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedDelimitersImpl <em>Cached Delimiters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedDelimitersImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedDelimiters()
		 * @generated
		 */
		EClass CACHED_DELIMITERS = eINSTANCE.getCachedDelimiters();

		/**
		 * The meta object literal for the '<em><b>Row Delim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_DELIMITERS__ROW_DELIM = eINSTANCE.getCachedDelimiters_RowDelim();

		/**
		 * The meta object literal for the '<em><b>Col Delim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_DELIMITERS__COL_DELIM = eINSTANCE.getCachedDelimiters_ColDelim();

		/**
		 * The meta object literal for the '<em><b>List Delim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_DELIMITERS__LIST_DELIM = eINSTANCE.getCachedDelimiters_ListDelim();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedAbstractTokenImpl <em>Cached Abstract Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedAbstractTokenImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedAbstractToken()
		 * @generated
		 */
		EClass CACHED_ABSTRACT_TOKEN = eINSTANCE.getCachedAbstractToken();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTokenImpl <em>Cached Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTokenImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedToken()
		 * @generated
		 */
		EClass CACHED_TOKEN = eINSTANCE.getCachedToken();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_TOKEN__PATTERN = eINSTANCE.getCachedToken_Pattern();

		/**
		 * The meta object literal for the '<em><b>Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_TOKEN__REGEX = eINSTANCE.getCachedToken_Regex();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedConstraintImpl <em>Cached Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedConstraintImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedConstraint()
		 * @generated
		 */
		EClass CACHED_CONSTRAINT = eINSTANCE.getCachedConstraint();

		/**
		 * The meta object literal for the '<em><b>Fulfilled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_CONSTRAINT__FULFILLED = eINSTANCE.getCachedConstraint_Fulfilled();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedContentConstraintImpl <em>Cached Content Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedContentConstraintImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedContentConstraint()
		 * @generated
		 */
		EClass CACHED_CONTENT_CONSTRAINT = eINSTANCE.getCachedContentConstraint();

		/**
		 * The meta object literal for the '<em><b>Automaton</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_CONTENT_CONSTRAINT__AUTOMATON = eINSTANCE.getCachedContentConstraint_Automaton();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedPrimaryKeyConstraintImpl <em>Cached Primary Key Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedPrimaryKeyConstraintImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedPrimaryKeyConstraint()
		 * @generated
		 */
		EClass CACHED_PRIMARY_KEY_CONSTRAINT = eINSTANCE.getCachedPrimaryKeyConstraint();

		/**
		 * The meta object literal for the '<em><b>Tuple Cache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_PRIMARY_KEY_CONSTRAINT__TUPLE_CACHE = eINSTANCE.getCachedPrimaryKeyConstraint_TupleCache();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedForeignKeyConstraintImpl <em>Cached Foreign Key Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedForeignKeyConstraintImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedForeignKeyConstraint()
		 * @generated
		 */
		EClass CACHED_FOREIGN_KEY_CONSTRAINT = eINSTANCE.getCachedForeignKeyConstraint();

		/**
		 * The meta object literal for the '<em><b>Referenced Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHED_FOREIGN_KEY_CONSTRAINT__REFERENCED_RELATION = eINSTANCE.getCachedForeignKeyConstraint_ReferencedRelation();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedNodeExpressionImpl <em>Cached Node Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedNodeExpressionImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedNodeExpression()
		 * @generated
		 */
		EClass CACHED_NODE_EXPRESSION = eINSTANCE.getCachedNodeExpression();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedRegionTokenImpl <em>Cached Region Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedRegionTokenImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedRegionToken()
		 * @generated
		 */
		EClass CACHED_REGION_TOKEN = eINSTANCE.getCachedRegionToken();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHED_REGION_TOKEN__TYPE = eINSTANCE.getCachedRegionToken_Type();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTypeImpl <em>Cached Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTypeImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedType()
		 * @generated
		 */
		EClass CACHED_TYPE = eINSTANCE.getCachedType();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_TYPE__VALUES = eINSTANCE.getCachedType_Values();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedAtomicTypeImpl <em>Cached Atomic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedAtomicTypeImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedAtomicType()
		 * @generated
		 */
		EClass CACHED_ATOMIC_TYPE = eINSTANCE.getCachedAtomicType();

		/**
		 * The meta object literal for the '<em><b>Parser</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_ATOMIC_TYPE__PARSER = eINSTANCE.getCachedAtomicType_Parser();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedListTypeImpl <em>Cached List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedListTypeImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedListType()
		 * @generated
		 */
		EClass CACHED_LIST_TYPE = eINSTANCE.getCachedListType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHED_LIST_TYPE__TYPE = eINSTANCE.getCachedListType_Type();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedCompoundTypeImpl <em>Cached Compound Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedCompoundTypeImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedCompoundType()
		 * @generated
		 */
		EClass CACHED_COMPOUND_TYPE = eINSTANCE.getCachedCompoundType();

		/**
		 * The meta object literal for the '<em><b>Primitives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHED_COMPOUND_TYPE__PRIMITIVES = eINSTANCE.getCachedCompoundType_Primitives();

		/**
		 * The meta object literal for the '<em><b>Capturing Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_COMPOUND_TYPE__CAPTURING_PATTERN = eINSTANCE.getCachedCompoundType_CapturingPattern();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLElementImpl <em>Cached TL Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLElementImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLElement()
		 * @generated
		 */
		EClass CACHED_TL_ELEMENT = eINSTANCE.getCachedTLElement();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLPrimitiveImpl <em>Cached TL Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLPrimitiveImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLPrimitive()
		 * @generated
		 */
		EClass CACHED_TL_PRIMITIVE = eINSTANCE.getCachedTLPrimitive();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_TL_PRIMITIVE__TEXT = eINSTANCE.getCachedTLPrimitive_Text();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHED_TL_PRIMITIVE__TOKEN = eINSTANCE.getCachedTLPrimitive_Token();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CACHED_TL_PRIMITIVE___RESET = eINSTANCE.getCachedTLPrimitive__Reset();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLConstantImpl <em>Cached TL Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLConstantImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLConstant()
		 * @generated
		 */
		EClass CACHED_TL_CONSTANT = eINSTANCE.getCachedTLConstant();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLOutputVariableImpl <em>Cached TL Output Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLOutputVariableImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLOutputVariable()
		 * @generated
		 */
		EClass CACHED_TL_OUTPUT_VARIABLE = eINSTANCE.getCachedTLOutputVariable();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHED_TL_OUTPUT_VARIABLE__BINDING = eINSTANCE.getCachedTLOutputVariable_Binding();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLVariableBindingImpl <em>Cached TL Variable Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLVariableBindingImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLVariableBinding()
		 * @generated
		 */
		EClass CACHED_TL_VARIABLE_BINDING = eINSTANCE.getCachedTLVariableBinding();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHED_TL_VARIABLE_BINDING__TOKEN = eINSTANCE.getCachedTLVariableBinding_Token();

		/**
		 * The meta object literal for the '<em><b>Possible Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHED_TL_VARIABLE_BINDING__POSSIBLE_TOKENS = eINSTANCE.getCachedTLVariableBinding_PossibleTokens();

		/**
		 * The meta object literal for the '<em><b>Strict Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_TL_VARIABLE_BINDING__STRICT_TYPE = eINSTANCE.getCachedTLVariableBinding_StrictType();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_TL_VARIABLE_BINDING__CONTENTS = eINSTANCE.getCachedTLVariableBinding_Contents();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CACHED_TL_VARIABLE_BINDING___RESET = eINSTANCE.getCachedTLVariableBinding__Reset();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CACHED_TL_VARIABLE_BINDING___ADD__INT_STRING_CACHEDTOKEN = eINSTANCE.getCachedTLVariableBinding__Add__int_String_CachedToken();

		/**
		 * The meta object literal for the '<em><b>Set Default</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CACHED_TL_VARIABLE_BINDING___SET_DEFAULT = eINSTANCE.getCachedTLVariableBinding__SetDefault();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLTypeInspectorImpl <em>Cached TL Type Inspector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLTypeInspectorImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLTypeInspector()
		 * @generated
		 */
		EClass CACHED_TL_TYPE_INSPECTOR = eINSTANCE.getCachedTLTypeInspector();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_TL_TYPE_INSPECTOR__PATH = eINSTANCE.getCachedTLTypeInspector_Path();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHED_TL_TYPE_INSPECTOR__TYPE = eINSTANCE.getCachedTLTypeInspector_Type();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLStatementImpl <em>Cached TL Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLStatementImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLStatement()
		 * @generated
		 */
		EClass CACHED_TL_STATEMENT = eINSTANCE.getCachedTLStatement();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLOutputImpl <em>Cached TL Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLOutputImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLOutput()
		 * @generated
		 */
		EClass CACHED_TL_OUTPUT = eINSTANCE.getCachedTLOutput();

		/**
		 * The meta object literal for the '<em><b>Primitives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHED_TL_OUTPUT__PRIMITIVES = eINSTANCE.getCachedTLOutput_Primitives();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLLoopImpl <em>Cached TL Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLLoopImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLLoop()
		 * @generated
		 */
		EClass CACHED_TL_LOOP = eINSTANCE.getCachedTLLoop();

		/**
		 * The meta object literal for the '<em><b>Automaton</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_TL_LOOP__AUTOMATON = eINSTANCE.getCachedTLLoop_Automaton();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHED_TL_LOOP__STATEMENTS = eINSTANCE.getCachedTLLoop_Statements();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHED_TL_LOOP__BINDINGS = eINSTANCE.getCachedTLLoop_Bindings();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTransformationProgramImpl <em>Cached Transformation Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTransformationProgramImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTransformationProgram()
		 * @generated
		 */
		EClass CACHED_TRANSFORMATION_PROGRAM = eINSTANCE.getCachedTransformationProgram();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHED_TRANSFORMATION_PROGRAM__STATEMENTS = eINSTANCE.getCachedTransformationProgram_Statements();

		/**
		 * The meta object literal for the '<em><b>Delimiters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHED_TRANSFORMATION_PROGRAM__DELIMITERS = eINSTANCE.getCachedTransformationProgram_Delimiters();

		/**
		 * The meta object literal for the '<em><b>Transformed Csv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_TRANSFORMATION_PROGRAM__TRANSFORMED_CSV = eINSTANCE.getCachedTransformationProgram_TransformedCsv();

		/**
		 * The meta object literal for the '<em><b>W3c Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_TRANSFORMATION_PROGRAM__W3C_SCHEMA = eINSTANCE.getCachedTransformationProgram_W3cSchema();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_TRANSFORMATION_PROGRAM__ERROR = eINSTANCE.getCachedTransformationProgram_Error();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLIfImpl <em>Cached TL If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLIfImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLIf()
		 * @generated
		 */
		EClass CACHED_TL_IF = eINSTANCE.getCachedTLIf();

		/**
		 * The meta object literal for the '<em><b>If Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHED_TL_IF__IF_BLOCK = eINSTANCE.getCachedTLIf_IfBlock();

		/**
		 * The meta object literal for the '<em><b>Else Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHED_TL_IF__ELSE_BLOCK = eINSTANCE.getCachedTLIf_ElseBlock();

		/**
		 * The meta object literal for the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLBoolExprImpl <em>Cached TL Bool Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLBoolExprImpl
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCachedTLBoolExpr()
		 * @generated
		 */
		EClass CACHED_TL_BOOL_EXPR = eINSTANCE.getCachedTLBoolExpr();

		/**
		 * The meta object literal for the '<em><b>Fulfilled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHED_TL_BOOL_EXPR__FULFILLED = eINSTANCE.getCachedTLBoolExpr_Fulfilled();

		/**
		 * The meta object literal for the '<em>Int Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getIntArray()
		 * @generated
		 */
		EDataType INT_ARRAY = eINSTANCE.getIntArray();

		/**
		 * The meta object literal for the '<em>Pattern</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.regex.Pattern
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getPattern()
		 * @generated
		 */
		EDataType PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em>Bit Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.BitSet
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getBitSet()
		 * @generated
		 */
		EDataType BIT_SET = eINSTANCE.getBitSet();

		/**
		 * The meta object literal for the '<em>Coordinate</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.util.Coordinate
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getCoordinate()
		 * @generated
		 */
		EDataType COORDINATE = eINSTANCE.getCoordinate();

		/**
		 * The meta object literal for the '<em>Region</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.library.dataStructures.Region
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getRegion()
		 * @generated
		 */
		EDataType REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em>Schema Element</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.SchemaElement
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getSchemaElement()
		 * @generated
		 */
		EDataType SCHEMA_ELEMENT = eINSTANCE.getSchemaElement();

		/**
		 * The meta object literal for the '<em>Token</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.sculpt.Token
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getToken()
		 * @generated
		 */
		EDataType TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em>Parser</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai7.csv_validator.library.parser.Parser
		 * @see de.ubt.ai7.csv_validator.caches.dataStructures.impl.dataStructuresPackageImpl#getParser()
		 * @generated
		 */
		EDataType PARSER = eINSTANCE.getParser();

	}

} //dataStructuresPackage

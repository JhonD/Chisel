/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cached Transformation Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram#getStatements <em>Statements</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram#getDelimiters <em>Delimiters</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram#getTransformedCsv <em>Transformed Csv</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram#getW3cSchema <em>W3c Schema</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram#getError <em>Error</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTransformationProgram()
 * @model
 * @generated
 */
public interface CachedTransformationProgram extends CachedTLElement {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTransformationProgram_Statements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CachedTLStatement> getStatements();

	/**
	 * Returns the value of the '<em><b>Delimiters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimiters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimiters</em>' containment reference.
	 * @see #setDelimiters(CachedDelimiters)
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTransformationProgram_Delimiters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CachedDelimiters getDelimiters();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram#getDelimiters <em>Delimiters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimiters</em>' containment reference.
	 * @see #getDelimiters()
	 * @generated
	 */
	void setDelimiters(CachedDelimiters value);

	/**
	 * Returns the value of the '<em><b>Transformed Csv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformed Csv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformed Csv</em>' attribute.
	 * @see #setTransformedCsv(Object)
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTransformationProgram_TransformedCsv()
	 * @model
	 * @generated
	 */
	Object getTransformedCsv();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram#getTransformedCsv <em>Transformed Csv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformed Csv</em>' attribute.
	 * @see #getTransformedCsv()
	 * @generated
	 */
	void setTransformedCsv(Object value);

	/**
	 * Returns the value of the '<em><b>W3c Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>W3c Schema</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>W3c Schema</em>' attribute.
	 * @see #setW3cSchema(Object)
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTransformationProgram_W3cSchema()
	 * @model
	 * @generated
	 */
	Object getW3cSchema();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram#getW3cSchema <em>W3c Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>W3c Schema</em>' attribute.
	 * @see #getW3cSchema()
	 * @generated
	 */
	void setW3cSchema(Object value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' attribute.
	 * @see #setError(Object)
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTransformationProgram_Error()
	 * @model
	 * @generated
	 */
	Object getError();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram#getError <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' attribute.
	 * @see #getError()
	 * @generated
	 */
	void setError(Object value);

} // CachedTransformationProgram

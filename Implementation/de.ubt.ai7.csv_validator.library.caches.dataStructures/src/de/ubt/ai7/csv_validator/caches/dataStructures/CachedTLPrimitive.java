/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cached TL Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLPrimitive#getText <em>Text</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLPrimitive#getToken <em>Token</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTLPrimitive()
 * @model abstract="true"
 * @generated
 */
public interface CachedTLPrimitive extends CachedTLElement {



	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTLPrimitive_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLPrimitive#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' reference.
	 * @see #setToken(CachedToken)
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTLPrimitive_Token()
	 * @model
	 * @generated
	 */
	CachedToken getToken();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLPrimitive#getToken <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(CachedToken value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reset();
} // CachedTLPrimitive

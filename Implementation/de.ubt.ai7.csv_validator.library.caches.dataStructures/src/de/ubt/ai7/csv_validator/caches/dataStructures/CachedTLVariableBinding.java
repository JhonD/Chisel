/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cached TL Variable Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#getToken <em>Token</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#getPossibleTokens <em>Possible Tokens</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#isStrictType <em>Strict Type</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTLVariableBinding()
 * @model
 * @generated
 */
public interface CachedTLVariableBinding extends CachedAbstractToken {
	/**
	 * Returns the value of the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' reference.
	 * @see #isSetToken()
	 * @see #unsetToken()
	 * @see #setToken(CachedToken)
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTLVariableBinding_Token()
	 * @model unsettable="true"
	 * @generated
	 */
	CachedToken getToken();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#getToken <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' reference.
	 * @see #isSetToken()
	 * @see #unsetToken()
	 * @see #getToken()
	 * @generated
	 */
	void setToken(CachedToken value);

	/**
	 * Unsets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#getToken <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetToken()
	 * @see #getToken()
	 * @see #setToken(CachedToken)
	 * @generated
	 */
	void unsetToken();

	/**
	 * Returns whether the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#getToken <em>Token</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Token</em>' reference is set.
	 * @see #unsetToken()
	 * @see #getToken()
	 * @see #setToken(CachedToken)
	 * @generated
	 */
	boolean isSetToken();

	/**
	 * Returns the value of the '<em><b>Possible Tokens</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possible Tokens</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Tokens</em>' reference list.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTLVariableBinding_PossibleTokens()
	 * @model
	 * @generated
	 */
	EList<CachedToken> getPossibleTokens();

	/**
	 * Returns the value of the '<em><b>Strict Type</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strict Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strict Type</em>' attribute.
	 * @see #isSetStrictType()
	 * @see #unsetStrictType()
	 * @see #setStrictType(boolean)
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTLVariableBinding_StrictType()
	 * @model default="false" unsettable="true" required="true"
	 * @generated
	 */
	boolean isStrictType();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#isStrictType <em>Strict Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strict Type</em>' attribute.
	 * @see #isSetStrictType()
	 * @see #unsetStrictType()
	 * @see #isStrictType()
	 * @generated
	 */
	void setStrictType(boolean value);

	/**
	 * Unsets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#isStrictType <em>Strict Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrictType()
	 * @see #isStrictType()
	 * @see #setStrictType(boolean)
	 * @generated
	 */
	void unsetStrictType();

	/**
	 * Returns whether the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#isStrictType <em>Strict Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Strict Type</em>' attribute is set.
	 * @see #unsetStrictType()
	 * @see #isStrictType()
	 * @see #setStrictType(boolean)
	 * @generated
	 */
	boolean isSetStrictType();

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' attribute list.
	 * @see #isSetContents()
	 * @see #unsetContents()
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTLVariableBinding_Contents()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	EList<String> getContents();

	/**
	 * Unsets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#getContents <em>Contents</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContents()
	 * @see #getContents()
	 * @generated
	 */
	void unsetContents();

	/**
	 * Returns whether the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding#getContents <em>Contents</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contents</em>' attribute list is set.
	 * @see #unsetContents()
	 * @see #getContents()
	 * @generated
	 */
	boolean isSetContents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model coordinateRequired="true" contentRequired="true"
	 * @generated
	 */
	void add(int coordinate, String content, CachedToken token);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setDefault();

} // CachedTLVariableBinding

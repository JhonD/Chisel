/**
 */
package de.ubt.ai7.csv_validator.sculpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.Token#getTokenRegex <em>Token Regex</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getToken()
 * @model
 * @generated
 */
public interface Token extends AbstractToken {
	/**
	 * Returns the value of the '<em><b>Token Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Regex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Regex</em>' attribute.
	 * @see #setTokenRegex(String)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getToken_TokenRegex()
	 * @model
	 * @generated
	 */
	String getTokenRegex();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.Token#getTokenRegex <em>Token Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Regex</em>' attribute.
	 * @see #getTokenRegex()
	 * @generated
	 */
	void setTokenRegex(String value);

} // Token

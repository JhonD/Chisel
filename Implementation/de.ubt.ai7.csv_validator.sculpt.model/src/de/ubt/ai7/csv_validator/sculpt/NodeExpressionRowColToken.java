/**
 */
package de.ubt.ai7.csv_validator.sculpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Expression Row Col Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColToken#getToken <em>Token</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getNodeExpressionRowColToken()
 * @model
 * @generated
 */
public interface NodeExpressionRowColToken extends NodeExpressionRowCol {
	/**
	 * Returns the value of the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' reference.
	 * @see #setToken(Token)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getNodeExpressionRowColToken_Token()
	 * @model required="true"
	 * @generated
	 */
	Token getToken();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColToken#getToken <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(Token value);

} // NodeExpressionRowColToken

/**
 */
package de.ubt.ai7.csv_validator.sculpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TL Bool Expr Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.TLBoolExprNot#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLBoolExprNot()
 * @model
 * @generated
 */
public interface TLBoolExprNot extends TLBoolExpr {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(TLBoolExpr)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLBoolExprNot_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TLBoolExpr getExpression();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.TLBoolExprNot#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(TLBoolExpr value);

} // TLBoolExprNot

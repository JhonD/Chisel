/**
 */
package de.ubt.ai7.csv_validator.sculpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Expression Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionOr#getLeft <em>Left</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionOr#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getNodeExpressionOr()
 * @model
 * @generated
 */
public interface NodeExpressionOr extends NodeExpression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(NodeExpression)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getNodeExpressionOr_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NodeExpression getLeft();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionOr#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(NodeExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(NodeExpression)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getNodeExpressionOr_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NodeExpression getRight();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionOr#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(NodeExpression value);

} // NodeExpressionOr

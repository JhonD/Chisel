/**
 */
package de.ubt.ai7.csv_validator.sculpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Expression Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionOr#getLeft <em>Left</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionOr#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getContentExpressionOr()
 * @model
 * @generated
 */
public interface ContentExpressionOr extends ContentExpression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(ContentExpression)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getContentExpressionOr_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ContentExpression getLeft();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionOr#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(ContentExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(ContentExpression)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getContentExpressionOr_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ContentExpression getRight();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionOr#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(ContentExpression value);

} // ContentExpressionOr

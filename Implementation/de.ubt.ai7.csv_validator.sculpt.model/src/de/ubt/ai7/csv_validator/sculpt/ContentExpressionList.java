/**
 */
package de.ubt.ai7.csv_validator.sculpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Expression List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionList#getFirst <em>First</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionList#getRest <em>Rest</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getContentExpressionList()
 * @model
 * @generated
 */
public interface ContentExpressionList extends ContentExpression {
	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(ContentExpression)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getContentExpressionList_First()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ContentExpression getFirst();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionList#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(ContentExpression value);

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest</em>' containment reference.
	 * @see #setRest(ContentExpression)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getContentExpressionList_Rest()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ContentExpression getRest();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionList#getRest <em>Rest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest</em>' containment reference.
	 * @see #getRest()
	 * @generated
	 */
	void setRest(ContentExpression value);

} // ContentExpressionList

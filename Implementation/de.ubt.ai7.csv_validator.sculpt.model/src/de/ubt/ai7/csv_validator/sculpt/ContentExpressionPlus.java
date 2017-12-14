/**
 */
package de.ubt.ai7.csv_validator.sculpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Expression Plus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionPlus#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getContentExpressionPlus()
 * @model
 * @generated
 */
public interface ContentExpressionPlus extends ContentExpression {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(ContentExpression)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getContentExpressionPlus_Element()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ContentExpression getElement();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionPlus#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(ContentExpression value);

} // ContentExpressionPlus

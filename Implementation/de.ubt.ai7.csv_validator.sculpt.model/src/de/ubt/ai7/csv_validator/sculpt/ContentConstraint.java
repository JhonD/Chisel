/**
 */
package de.ubt.ai7.csv_validator.sculpt;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Constraint</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.ContentConstraint#getRegion <em>Region</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.ContentConstraint#getContentExpression <em>Content Expression</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.ContentConstraint#getValidationMode <em>Validation Mode</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getContentConstraint()
 * @model
 * @generated
 */
public interface ContentConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference.
	 * @see #setRegion(NodeExpression)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getContentConstraint_Region()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NodeExpression getRegion();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.ContentConstraint#getRegion <em>Region</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' containment reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(NodeExpression value);

	/**
	 * Returns the value of the '<em><b>Content Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Expression</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Expression</em>' containment reference.
	 * @see #setContentExpression(ContentExpression)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getContentConstraint_ContentExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ContentExpression getContentExpression();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.ContentConstraint#getContentExpression <em>Content Expression</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Expression</em>' containment reference.
	 * @see #getContentExpression()
	 * @generated
	 */
	void setContentExpression(ContentExpression value);

	/**
	 * Returns the value of the '<em><b>Validation Mode</b></em>' attribute. The
	 * literals are from the enumeration
	 * {@link de.ubt.ai7.csv_validator.sculpt.ValidationMode}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Validation Mode</em>' attribute.
	 * @see de.ubt.ai7.csv_validator.sculpt.ValidationMode
	 * @see #setValidationMode(ValidationMode)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getConstraint_ValidationMode()
	 * @model
	 * @generated
	 */
	ValidationMode getValidationMode();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.ContentConstraint#getValidationMode <em>Validation Mode</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Validation Mode</em>' attribute.
	 * @see de.ubt.ai7.csv_validator.sculpt.ValidationMode
	 * @see #getValidationMode()
	 * @generated
	 */
	void setValidationMode(ValidationMode value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toString();

} // Constraint

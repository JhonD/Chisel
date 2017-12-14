/**
 */
package de.ubt.ai7.csv_validator.sculpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Expression Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionPath#getRegion <em>Region</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionPath#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getNodeExpressionPath()
 * @model
 * @generated
 */
public interface NodeExpressionPath extends NodeExpression {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference.
	 * @see #setRegion(NodeExpression)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getNodeExpressionPath_Region()
	 * @model containment="true"
	 * @generated
	 */
	NodeExpression getRegion();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionPath#getRegion <em>Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' containment reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(NodeExpression value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(PathExpression)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getNodeExpressionPath_Path()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PathExpression getPath();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionPath#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(PathExpression value);

} // NodeExpressionPath

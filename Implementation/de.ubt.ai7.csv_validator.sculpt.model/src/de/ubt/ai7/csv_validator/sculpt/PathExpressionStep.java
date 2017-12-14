/**
 */
package de.ubt.ai7.csv_validator.sculpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Expression Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionStep#getAxes <em>Axes</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionStep#getNode_test <em>Node test</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionStep#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getPathExpressionStep()
 * @model
 * @generated
 */
public interface PathExpressionStep extends PathExpression {
	/**
	 * Returns the value of the '<em><b>Axes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axes</em>' attribute.
	 * @see #setAxes(String)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getPathExpressionStep_Axes()
	 * @model required="true"
	 * @generated
	 */
	String getAxes();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionStep#getAxes <em>Axes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axes</em>' attribute.
	 * @see #getAxes()
	 * @generated
	 */
	void setAxes(String value);

	/**
	 * Returns the value of the '<em><b>Node test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node test</em>' containment reference.
	 * @see #setNode_test(NodeExpressionPrimitive)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getPathExpressionStep_Node_test()
	 * @model containment="true"
	 * @generated
	 */
	NodeExpressionPrimitive getNode_test();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionStep#getNode_test <em>Node test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node test</em>' containment reference.
	 * @see #getNode_test()
	 * @generated
	 */
	void setNode_test(NodeExpressionPrimitive value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(NodeExpression)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getPathExpressionStep_Predicate()
	 * @model containment="true"
	 * @generated
	 */
	NodeExpression getPredicate();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionStep#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(NodeExpression value);

} // PathExpressionStep

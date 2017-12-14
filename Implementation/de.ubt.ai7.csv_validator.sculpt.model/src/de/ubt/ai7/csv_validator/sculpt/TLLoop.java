/**
 */
package de.ubt.ai7.csv_validator.sculpt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TL Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.TLLoop#getVariables <em>Variables</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.TLLoop#getRegion <em>Region</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.TLLoop#getContentExpression <em>Content Expression</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.TLLoop#getStatements <em>Statements</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.TLLoop#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLLoop()
 * @model
 * @generated
 */
public interface TLLoop extends TLStatement {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.sculpt.TLVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLLoop_Variables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TLVariable> getVariables();

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference.
	 * @see #setRegion(NodeExpression)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLLoop_Region()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NodeExpression getRegion();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.TLLoop#getRegion <em>Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' containment reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(NodeExpression value);

	/**
	 * Returns the value of the '<em><b>Content Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Expression</em>' containment reference.
	 * @see #setContentExpression(TLContentExpressionList)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLLoop_ContentExpression()
	 * @model containment="true"
	 * @generated
	 */
	TLContentExpressionList getContentExpression();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.TLLoop#getContentExpression <em>Content Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Expression</em>' containment reference.
	 * @see #getContentExpression()
	 * @generated
	 */
	void setContentExpression(TLContentExpressionList value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.sculpt.TLStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLLoop_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TLStatement> getStatements();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.ubt.ai7.csv_validator.sculpt.TLLoopMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLLoopMode
	 * @see #setMode(TLLoopMode)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLLoop_Mode()
	 * @model required="true"
	 * @generated
	 */
	TLLoopMode getMode();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.TLLoop#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLLoopMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(TLLoopMode value);

} // TLLoop

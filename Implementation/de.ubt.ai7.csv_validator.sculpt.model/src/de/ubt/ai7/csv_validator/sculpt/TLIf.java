/**
 */
package de.ubt.ai7.csv_validator.sculpt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TL If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.TLIf#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.TLIf#getIfBlock <em>If Block</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.TLIf#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLIf()
 * @model
 * @generated
 */
public interface TLIf extends TLStatement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(TLBoolExpr)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLIf_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TLBoolExpr getCondition();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.TLIf#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(TLBoolExpr value);

	/**
	 * Returns the value of the '<em><b>If Block</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.sculpt.TLStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Block</em>' containment reference list.
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLIf_IfBlock()
	 * @model containment="true"
	 * @generated
	 */
	EList<TLStatement> getIfBlock();

	/**
	 * Returns the value of the '<em><b>Else Block</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.sculpt.TLStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Block</em>' containment reference list.
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLIf_ElseBlock()
	 * @model containment="true"
	 * @generated
	 */
	EList<TLStatement> getElseBlock();

} // TLIf

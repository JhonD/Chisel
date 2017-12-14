/**
 */
package de.ubt.ai7.csv_validator.sculpt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Expression List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionList#getFirst <em>First</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionList#getRest <em>Rest</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getPathExpressionList()
 * @model
 * @generated
 */
public interface PathExpressionList extends PathExpression {
	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(PathExpression)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getPathExpressionList_First()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PathExpression getFirst();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionList#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(PathExpression value);

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.sculpt.PathExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest</em>' containment reference list.
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getPathExpressionList_Rest()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathExpression> getRest();

} // PathExpressionList

/**
 */
package de.ubt.ai7.csv_validator.sculpt;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.TupleSelector#getRegion <em>Region</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.TupleSelector#getSelectors <em>Selectors</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTupleSelector()
 * @model
 * @generated
 */
public interface TupleSelector extends EObject {
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
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTupleSelector_Region()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NodeExpression getRegion();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.TupleSelector#getRegion <em>Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' containment reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(NodeExpression value);

	/**
	 * Returns the value of the '<em><b>Selectors</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.sculpt.PathExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectors</em>' containment reference list.
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTupleSelector_Selectors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PathExpression> getSelectors();

} // TupleSelector

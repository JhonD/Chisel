/**
 */
package de.ubt.ai7.csv_validator.sculpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.RelationConstraint#getTupleSelector <em>Tuple Selector</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getRelationConstraint()
 * @model
 * @generated
 */
public interface RelationConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Tuple Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple Selector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple Selector</em>' containment reference.
	 * @see #setTupleSelector(TupleSelector)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getRelationConstraint_TupleSelector()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TupleSelector getTupleSelector();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.RelationConstraint#getTupleSelector <em>Tuple Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple Selector</em>' containment reference.
	 * @see #getTupleSelector()
	 * @generated
	 */
	void setTupleSelector(TupleSelector value);

} // RelationConstraint

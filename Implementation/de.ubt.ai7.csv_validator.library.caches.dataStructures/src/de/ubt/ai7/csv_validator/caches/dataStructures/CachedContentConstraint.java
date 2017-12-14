/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cached Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedContentConstraint#getAutomaton <em>Automaton</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedContentConstraint()
 * @model
 * @generated
 */
public interface CachedContentConstraint extends CachedConstraint {
	/**
	 * Returns the value of the '<em><b>Automaton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automaton</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automaton</em>' attribute.
	 * @see #setAutomaton(Object)
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedContentConstraint_Automaton()
	 * @model required="true"
	 * @generated
	 */
	Object getAutomaton();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedContentConstraint#getAutomaton <em>Automaton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automaton</em>' attribute.
	 * @see #getAutomaton()
	 * @generated
	 */
	void setAutomaton(Object value);

} // CachedConstraint

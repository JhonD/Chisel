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
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedConstraint#getFulfilled <em>Fulfilled</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedConstraint()
 * @model
 * @generated
 */
public interface CachedConstraint extends CachedElement {
	/**
	 * Returns the value of the '<em><b>Fulfilled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fulfilled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfilled</em>' attribute.
	 * @see #setFulfilled(Boolean)
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedConstraint_Fulfilled()
	 * @model
	 * @generated
	 */
	Boolean getFulfilled();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedConstraint#getFulfilled <em>Fulfilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fulfilled</em>' attribute.
	 * @see #getFulfilled()
	 * @generated
	 */
	void setFulfilled(Boolean value);

} // CachedConstraint

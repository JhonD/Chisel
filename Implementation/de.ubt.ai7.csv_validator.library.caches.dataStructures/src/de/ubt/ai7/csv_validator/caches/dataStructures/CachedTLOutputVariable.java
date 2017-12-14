/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cached TL Output Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutputVariable#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTLOutputVariable()
 * @model
 * @generated
 */
public interface CachedTLOutputVariable extends CachedTLPrimitive {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference.
	 * @see #setBinding(CachedTLVariableBinding)
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTLOutputVariable_Binding()
	 * @model required="true"
	 * @generated
	 */
	CachedTLVariableBinding getBinding();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutputVariable#getBinding <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(CachedTLVariableBinding value);

} // CachedTLOutputVariable

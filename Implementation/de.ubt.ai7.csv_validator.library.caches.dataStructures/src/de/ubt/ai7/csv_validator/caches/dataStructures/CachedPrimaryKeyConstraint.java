/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cached Primary Key Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedPrimaryKeyConstraint#getTupleCache <em>Tuple Cache</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedPrimaryKeyConstraint()
 * @model
 * @generated
 */
public interface CachedPrimaryKeyConstraint extends CachedConstraint {
	/**
	 * Returns the value of the '<em><b>Tuple Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple Cache</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple Cache</em>' attribute.
	 * @see #setTupleCache(Map)
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedPrimaryKeyConstraint_TupleCache()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Map<Integer, EList<int[]>> getTupleCache();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedPrimaryKeyConstraint#getTupleCache <em>Tuple Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple Cache</em>' attribute.
	 * @see #getTupleCache()
	 * @generated
	 */
	void setTupleCache(Map<Integer, EList<int[]>> value);

} // CachedPrimaryKeyConstraint

/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cached Foreign Key Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedForeignKeyConstraint#getReferencedRelation <em>Referenced Relation</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedForeignKeyConstraint()
 * @model
 * @generated
 */
public interface CachedForeignKeyConstraint extends CachedConstraint {
	/**
	 * Returns the value of the '<em><b>Referenced Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Relation</em>' reference.
	 * @see #setReferencedRelation(CachedPrimaryKeyConstraint)
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedForeignKeyConstraint_ReferencedRelation()
	 * @model required="true"
	 * @generated
	 */
	CachedPrimaryKeyConstraint getReferencedRelation();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedForeignKeyConstraint#getReferencedRelation <em>Referenced Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Relation</em>' reference.
	 * @see #getReferencedRelation()
	 * @generated
	 */
	void setReferencedRelation(CachedPrimaryKeyConstraint value);

} // CachedForeignKeyConstraint

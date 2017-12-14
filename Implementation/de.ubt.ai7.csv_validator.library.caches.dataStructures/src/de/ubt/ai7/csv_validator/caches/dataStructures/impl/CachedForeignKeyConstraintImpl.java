/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedForeignKeyConstraint;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedPrimaryKeyConstraint;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cached Foreign Key Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedForeignKeyConstraintImpl#getReferencedRelation <em>Referenced Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CachedForeignKeyConstraintImpl extends CachedConstraintImpl implements CachedForeignKeyConstraint {
	/**
	 * The cached value of the '{@link #getReferencedRelation() <em>Referenced Relation</em>}' reference.
	 * <!-- begin-us er-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedRelation()
	 * @generated
	 * @ordered
	 */
	protected CachedPrimaryKeyConstraint referencedRelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedForeignKeyConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return dataStructuresPackage.Literals.CACHED_FOREIGN_KEY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedPrimaryKeyConstraint getReferencedRelation() {
		if (referencedRelation != null && referencedRelation.eIsProxy()) {
			InternalEObject oldReferencedRelation = (InternalEObject)referencedRelation;
			referencedRelation = (CachedPrimaryKeyConstraint)eResolveProxy(oldReferencedRelation);
			if (referencedRelation != oldReferencedRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, dataStructuresPackage.CACHED_FOREIGN_KEY_CONSTRAINT__REFERENCED_RELATION, oldReferencedRelation, referencedRelation));
			}
		}
		return referencedRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CachedPrimaryKeyConstraint basicGetReferencedRelation() {
		return referencedRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedRelation(CachedPrimaryKeyConstraint newReferencedRelation) {
		CachedPrimaryKeyConstraint oldReferencedRelation = referencedRelation;
		referencedRelation = newReferencedRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_FOREIGN_KEY_CONSTRAINT__REFERENCED_RELATION, oldReferencedRelation, referencedRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_FOREIGN_KEY_CONSTRAINT__REFERENCED_RELATION:
				if (resolve) return getReferencedRelation();
				return basicGetReferencedRelation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_FOREIGN_KEY_CONSTRAINT__REFERENCED_RELATION:
				setReferencedRelation((CachedPrimaryKeyConstraint)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_FOREIGN_KEY_CONSTRAINT__REFERENCED_RELATION:
				setReferencedRelation((CachedPrimaryKeyConstraint)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_FOREIGN_KEY_CONSTRAINT__REFERENCED_RELATION:
				return referencedRelation != null;
		}
		return super.eIsSet(featureID);
	}

} //CachedForeignKeyConstraintImpl

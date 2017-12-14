/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedPrimaryKeyConstraint;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cached Primary Key Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedPrimaryKeyConstraintImpl#getTupleCache <em>Tuple Cache</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CachedPrimaryKeyConstraintImpl extends CachedConstraintImpl implements CachedPrimaryKeyConstraint {
	/**
	 * The cached value of the '{@link #getTupleCache() <em>Tuple Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTupleCache()
	 * @generated
	 * @ordered
	 */
	protected Map<Integer, EList<int[]>> tupleCache;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedPrimaryKeyConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return dataStructuresPackage.Literals.CACHED_PRIMARY_KEY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Map<Integer, EList<int[]>> getTupleCache() {
		return tupleCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTupleCache(Map<Integer, EList<int[]>> newTupleCache) {
		Map<Integer, EList<int[]>> oldTupleCache = tupleCache;
		tupleCache = newTupleCache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_PRIMARY_KEY_CONSTRAINT__TUPLE_CACHE, oldTupleCache, tupleCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_PRIMARY_KEY_CONSTRAINT__TUPLE_CACHE:
				return getTupleCache();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_PRIMARY_KEY_CONSTRAINT__TUPLE_CACHE:
				setTupleCache((Map<Integer, EList<int[]>>)newValue);
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
			case dataStructuresPackage.CACHED_PRIMARY_KEY_CONSTRAINT__TUPLE_CACHE:
				setTupleCache((Map<Integer, EList<int[]>>)null);
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
			case dataStructuresPackage.CACHED_PRIMARY_KEY_CONSTRAINT__TUPLE_CACHE:
				return tupleCache != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tupleCache: ");
		result.append(tupleCache);
		result.append(')');
		return result.toString();
	}

} //CachedPrimaryKeyConstraintImpl

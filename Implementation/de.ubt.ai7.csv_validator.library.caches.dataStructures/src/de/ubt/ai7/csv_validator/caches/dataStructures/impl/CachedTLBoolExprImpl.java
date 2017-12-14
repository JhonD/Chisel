/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.impl;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLBoolExpr;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cached TL Bool Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLBoolExprImpl#getFulfilled <em>Fulfilled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CachedTLBoolExprImpl extends CachedTLElementImpl implements CachedTLBoolExpr {
	/**
	 * The default value of the '{@link #getFulfilled() <em>Fulfilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfilled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FULFILLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFulfilled() <em>Fulfilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfilled()
	 * @generated
	 * @ordered
	 */
	protected Boolean fulfilled = FULFILLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedTLBoolExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return dataStructuresPackage.Literals.CACHED_TL_BOOL_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getFulfilled() {
		return fulfilled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFulfilled(Boolean newFulfilled) {
		Boolean oldFulfilled = fulfilled;
		fulfilled = newFulfilled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_TL_BOOL_EXPR__FULFILLED, oldFulfilled, fulfilled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_TL_BOOL_EXPR__FULFILLED:
				return getFulfilled();
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
			case dataStructuresPackage.CACHED_TL_BOOL_EXPR__FULFILLED:
				setFulfilled((Boolean)newValue);
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
			case dataStructuresPackage.CACHED_TL_BOOL_EXPR__FULFILLED:
				setFulfilled(FULFILLED_EDEFAULT);
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
			case dataStructuresPackage.CACHED_TL_BOOL_EXPR__FULFILLED:
				return FULFILLED_EDEFAULT == null ? fulfilled != null : !FULFILLED_EDEFAULT.equals(fulfilled);
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
		result.append(" (fulfilled: ");
		result.append(fulfilled);
		result.append(')');
		return result.toString();
	}

} //CachedTLBoolExprImpl

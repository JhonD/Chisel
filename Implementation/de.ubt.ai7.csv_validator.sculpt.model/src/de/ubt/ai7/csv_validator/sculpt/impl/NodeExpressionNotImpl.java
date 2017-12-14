/**
 */
package de.ubt.ai7.csv_validator.sculpt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai7.csv_validator.sculpt.NodeExpression;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionNot;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Expression Not</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionNotImpl#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeExpressionNotImpl extends NodeExpressionImpl implements NodeExpressionNot {
	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected NodeExpression region;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeExpressionNotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.NODE_EXPRESSION_NOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeExpression getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(NodeExpression newRegion, NotificationChain msgs) {
		NodeExpression oldRegion = region;
		region = newRegion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptPackage.NODE_EXPRESSION_NOT__REGION, oldRegion, newRegion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegion(NodeExpression newRegion) {
		if (newRegion != region) {
			NotificationChain msgs = null;
			if (region != null)
				msgs = ((InternalEObject)region).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptPackage.NODE_EXPRESSION_NOT__REGION, null, msgs);
			if (newRegion != null)
				msgs = ((InternalEObject)newRegion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptPackage.NODE_EXPRESSION_NOT__REGION, null, msgs);
			msgs = basicSetRegion(newRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.NODE_EXPRESSION_NOT__REGION, newRegion, newRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptPackage.NODE_EXPRESSION_NOT__REGION:
				return basicSetRegion(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptPackage.NODE_EXPRESSION_NOT__REGION:
				return getRegion();
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
			case SculptPackage.NODE_EXPRESSION_NOT__REGION:
				setRegion((NodeExpression)newValue);
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
			case SculptPackage.NODE_EXPRESSION_NOT__REGION:
				setRegion((NodeExpression)null);
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
			case SculptPackage.NODE_EXPRESSION_NOT__REGION:
				return region != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	@Override
	public String toString() {
		return "not(" + this.getRegion().toString() + ")";
	}

} //NodeExpressionNotImpl

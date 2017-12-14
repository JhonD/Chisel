/**
 */
package de.ubt.ai7.csv_validator.sculpt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai7.csv_validator.sculpt.AbstractToken;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionToken;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Node
 * Expression Token</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionTokenImpl#getToken <em>Token</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeExpressionTokenImpl extends NodeExpressionPrimitiveImpl implements NodeExpressionToken {
	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected AbstractToken token;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeExpressionTokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.NODE_EXPRESSION_TOKEN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractToken getToken() {
		if (token != null && token.eIsProxy()) {
			InternalEObject oldToken = (InternalEObject)token;
			token = (AbstractToken)eResolveProxy(oldToken);
			if (token != oldToken) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptPackage.NODE_EXPRESSION_TOKEN__TOKEN, oldToken, token));
			}
		}
		return token;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractToken basicGetToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToken(AbstractToken newToken) {
		AbstractToken oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.NODE_EXPRESSION_TOKEN__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptPackage.NODE_EXPRESSION_TOKEN__TOKEN:
				if (resolve) return getToken();
				return basicGetToken();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SculptPackage.NODE_EXPRESSION_TOKEN__TOKEN:
				setToken((AbstractToken)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SculptPackage.NODE_EXPRESSION_TOKEN__TOKEN:
				setToken((AbstractToken)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SculptPackage.NODE_EXPRESSION_TOKEN__TOKEN:
				return token != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated Not
	 */
	@Override
	public String toString() {
		return this.getToken().getName();
	}

} // NodeExpressionTokenImpl

/**
 */
package de.ubt.ai7.csv_validator.sculpt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai7.csv_validator.sculpt.ContentExpression;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionList;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Expression List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionListImpl#getFirst <em>First</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionListImpl#getRest <em>Rest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentExpressionListImpl extends ContentExpressionImpl implements ContentExpressionList {
	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected ContentExpression first;

	/**
	 * The cached value of the '{@link #getRest() <em>Rest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest()
	 * @generated
	 * @ordered
	 */
	protected ContentExpression rest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentExpressionListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.CONTENT_EXPRESSION_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentExpression getFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirst(ContentExpression newFirst, NotificationChain msgs) {
		ContentExpression oldFirst = first;
		first = newFirst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptPackage.CONTENT_EXPRESSION_LIST__FIRST, oldFirst, newFirst);
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
	public void setFirst(ContentExpression newFirst) {
		if (newFirst != first) {
			NotificationChain msgs = null;
			if (first != null)
				msgs = ((InternalEObject)first).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptPackage.CONTENT_EXPRESSION_LIST__FIRST, null, msgs);
			if (newFirst != null)
				msgs = ((InternalEObject)newFirst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptPackage.CONTENT_EXPRESSION_LIST__FIRST, null, msgs);
			msgs = basicSetFirst(newFirst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.CONTENT_EXPRESSION_LIST__FIRST, newFirst, newFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentExpression getRest() {
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRest(ContentExpression newRest, NotificationChain msgs) {
		ContentExpression oldRest = rest;
		rest = newRest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptPackage.CONTENT_EXPRESSION_LIST__REST, oldRest, newRest);
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
	public void setRest(ContentExpression newRest) {
		if (newRest != rest) {
			NotificationChain msgs = null;
			if (rest != null)
				msgs = ((InternalEObject)rest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptPackage.CONTENT_EXPRESSION_LIST__REST, null, msgs);
			if (newRest != null)
				msgs = ((InternalEObject)newRest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptPackage.CONTENT_EXPRESSION_LIST__REST, null, msgs);
			msgs = basicSetRest(newRest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.CONTENT_EXPRESSION_LIST__REST, newRest, newRest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptPackage.CONTENT_EXPRESSION_LIST__FIRST:
				return basicSetFirst(null, msgs);
			case SculptPackage.CONTENT_EXPRESSION_LIST__REST:
				return basicSetRest(null, msgs);
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
			case SculptPackage.CONTENT_EXPRESSION_LIST__FIRST:
				return getFirst();
			case SculptPackage.CONTENT_EXPRESSION_LIST__REST:
				return getRest();
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
			case SculptPackage.CONTENT_EXPRESSION_LIST__FIRST:
				setFirst((ContentExpression)newValue);
				return;
			case SculptPackage.CONTENT_EXPRESSION_LIST__REST:
				setRest((ContentExpression)newValue);
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
			case SculptPackage.CONTENT_EXPRESSION_LIST__FIRST:
				setFirst((ContentExpression)null);
				return;
			case SculptPackage.CONTENT_EXPRESSION_LIST__REST:
				setRest((ContentExpression)null);
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
			case SculptPackage.CONTENT_EXPRESSION_LIST__FIRST:
				return first != null;
			case SculptPackage.CONTENT_EXPRESSION_LIST__REST:
				return rest != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return this.first.toString() + " " + this.rest.toString();
	}

} //ContentExpressionListImpl

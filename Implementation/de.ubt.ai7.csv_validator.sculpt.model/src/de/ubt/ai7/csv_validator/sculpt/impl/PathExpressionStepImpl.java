/**
 */
package de.ubt.ai7.csv_validator.sculpt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai7.csv_validator.sculpt.NodeExpression;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionPrimitive;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionStep;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Expression Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionStepImpl#getAxes <em>Axes</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionStepImpl#getNode_test <em>Node test</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.PathExpressionStepImpl#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathExpressionStepImpl extends PathExpressionImpl implements PathExpressionStep {
	/**
	 * The default value of the '{@link #getAxes() <em>Axes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxes()
	 * @generated
	 * @ordered
	 */
	protected static final String AXES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAxes() <em>Axes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxes()
	 * @generated
	 * @ordered
	 */
	protected String axes = AXES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNode_test() <em>Node test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode_test()
	 * @generated
	 * @ordered
	 */
	protected NodeExpressionPrimitive node_test;

	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected NodeExpression predicate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathExpressionStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.PATH_EXPRESSION_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAxes() {
		return axes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAxes(String newAxes) {
		String oldAxes = axes;
		axes = newAxes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.PATH_EXPRESSION_STEP__AXES, oldAxes, axes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeExpressionPrimitive getNode_test() {
		return node_test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode_test(NodeExpressionPrimitive newNode_test, NotificationChain msgs) {
		NodeExpressionPrimitive oldNode_test = node_test;
		node_test = newNode_test;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptPackage.PATH_EXPRESSION_STEP__NODE_TEST, oldNode_test, newNode_test);
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
	public void setNode_test(NodeExpressionPrimitive newNode_test) {
		if (newNode_test != node_test) {
			NotificationChain msgs = null;
			if (node_test != null)
				msgs = ((InternalEObject)node_test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptPackage.PATH_EXPRESSION_STEP__NODE_TEST, null, msgs);
			if (newNode_test != null)
				msgs = ((InternalEObject)newNode_test).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptPackage.PATH_EXPRESSION_STEP__NODE_TEST, null, msgs);
			msgs = basicSetNode_test(newNode_test, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.PATH_EXPRESSION_STEP__NODE_TEST, newNode_test, newNode_test));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeExpression getPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredicate(NodeExpression newPredicate, NotificationChain msgs) {
		NodeExpression oldPredicate = predicate;
		predicate = newPredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptPackage.PATH_EXPRESSION_STEP__PREDICATE, oldPredicate, newPredicate);
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
	public void setPredicate(NodeExpression newPredicate) {
		if (newPredicate != predicate) {
			NotificationChain msgs = null;
			if (predicate != null)
				msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptPackage.PATH_EXPRESSION_STEP__PREDICATE, null, msgs);
			if (newPredicate != null)
				msgs = ((InternalEObject)newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptPackage.PATH_EXPRESSION_STEP__PREDICATE, null, msgs);
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.PATH_EXPRESSION_STEP__PREDICATE, newPredicate, newPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptPackage.PATH_EXPRESSION_STEP__NODE_TEST:
				return basicSetNode_test(null, msgs);
			case SculptPackage.PATH_EXPRESSION_STEP__PREDICATE:
				return basicSetPredicate(null, msgs);
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
			case SculptPackage.PATH_EXPRESSION_STEP__AXES:
				return getAxes();
			case SculptPackage.PATH_EXPRESSION_STEP__NODE_TEST:
				return getNode_test();
			case SculptPackage.PATH_EXPRESSION_STEP__PREDICATE:
				return getPredicate();
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
			case SculptPackage.PATH_EXPRESSION_STEP__AXES:
				setAxes((String)newValue);
				return;
			case SculptPackage.PATH_EXPRESSION_STEP__NODE_TEST:
				setNode_test((NodeExpressionPrimitive)newValue);
				return;
			case SculptPackage.PATH_EXPRESSION_STEP__PREDICATE:
				setPredicate((NodeExpression)newValue);
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
			case SculptPackage.PATH_EXPRESSION_STEP__AXES:
				setAxes(AXES_EDEFAULT);
				return;
			case SculptPackage.PATH_EXPRESSION_STEP__NODE_TEST:
				setNode_test((NodeExpressionPrimitive)null);
				return;
			case SculptPackage.PATH_EXPRESSION_STEP__PREDICATE:
				setPredicate((NodeExpression)null);
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
			case SculptPackage.PATH_EXPRESSION_STEP__AXES:
				return AXES_EDEFAULT == null ? axes != null : !AXES_EDEFAULT.equals(axes);
			case SculptPackage.PATH_EXPRESSION_STEP__NODE_TEST:
				return node_test != null;
			case SculptPackage.PATH_EXPRESSION_STEP__PREDICATE:
				return predicate != null;
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
		final StringBuilder result = new StringBuilder();
		result.append(this.getAxes());
		if(this.getNode_test() != null) {
			result.append("::");
			result.append(this.getNode_test().toString());
		}
		if(this.getPredicate() != null) {
			result.append("[");
			result.append(this.getPredicate().toString());
			result.append("]");
		}
		return result.toString();
	}

} //PathExpressionStepImpl

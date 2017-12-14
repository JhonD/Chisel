/**
 */
package de.ubt.ai7.csv_validator.sculpt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai7.csv_validator.sculpt.RelationConstraint;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.TupleSelector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.RelationConstraintImpl#getTupleSelector <em>Tuple Selector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationConstraintImpl extends ConstraintImpl implements RelationConstraint {
	/**
	 * The cached value of the '{@link #getTupleSelector() <em>Tuple Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTupleSelector()
	 * @generated
	 * @ordered
	 */
	protected TupleSelector tupleSelector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.RELATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TupleSelector getTupleSelector() {
		return tupleSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTupleSelector(TupleSelector newTupleSelector, NotificationChain msgs) {
		TupleSelector oldTupleSelector = tupleSelector;
		tupleSelector = newTupleSelector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptPackage.RELATION_CONSTRAINT__TUPLE_SELECTOR, oldTupleSelector, newTupleSelector);
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
	public void setTupleSelector(TupleSelector newTupleSelector) {
		if (newTupleSelector != tupleSelector) {
			NotificationChain msgs = null;
			if (tupleSelector != null)
				msgs = ((InternalEObject)tupleSelector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptPackage.RELATION_CONSTRAINT__TUPLE_SELECTOR, null, msgs);
			if (newTupleSelector != null)
				msgs = ((InternalEObject)newTupleSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptPackage.RELATION_CONSTRAINT__TUPLE_SELECTOR, null, msgs);
			msgs = basicSetTupleSelector(newTupleSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.RELATION_CONSTRAINT__TUPLE_SELECTOR, newTupleSelector, newTupleSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptPackage.RELATION_CONSTRAINT__TUPLE_SELECTOR:
				return basicSetTupleSelector(null, msgs);
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
			case SculptPackage.RELATION_CONSTRAINT__TUPLE_SELECTOR:
				return getTupleSelector();
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
			case SculptPackage.RELATION_CONSTRAINT__TUPLE_SELECTOR:
				setTupleSelector((TupleSelector)newValue);
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
			case SculptPackage.RELATION_CONSTRAINT__TUPLE_SELECTOR:
				setTupleSelector((TupleSelector)null);
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
			case SculptPackage.RELATION_CONSTRAINT__TUPLE_SELECTOR:
				return tupleSelector != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationConstraintImpl

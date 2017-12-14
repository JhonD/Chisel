/**
 */
package de.ubt.ai7.csv_validator.sculpt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai7.csv_validator.sculpt.ForeignKeyConstraint;
import de.ubt.ai7.csv_validator.sculpt.PrimaryKeyConstraint;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.ForeignKeyConstraintImpl#getReferencedRelation <em>Referenced Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignKeyConstraintImpl extends RelationConstraintImpl implements ForeignKeyConstraint {
	/**
	 * The cached value of the '{@link #getReferencedRelation() <em>Referenced Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedRelation()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKeyConstraint referencedRelation;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.FOREIGN_KEY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimaryKeyConstraint getReferencedRelation() {
		if (referencedRelation != null && referencedRelation.eIsProxy()) {
			InternalEObject oldReferencedRelation = (InternalEObject)referencedRelation;
			referencedRelation = (PrimaryKeyConstraint)eResolveProxy(oldReferencedRelation);
			if (referencedRelation != oldReferencedRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_RELATION, oldReferencedRelation, referencedRelation));
			}
		}
		return referencedRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKeyConstraint basicGetReferencedRelation() {
		return referencedRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedRelation(PrimaryKeyConstraint newReferencedRelation) {
		PrimaryKeyConstraint oldReferencedRelation = referencedRelation;
		referencedRelation = newReferencedRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_RELATION, oldReferencedRelation, referencedRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_RELATION:
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
			case SculptPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_RELATION:
				setReferencedRelation((PrimaryKeyConstraint)newValue);
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
			case SculptPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_RELATION:
				setReferencedRelation((PrimaryKeyConstraint)null);
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
			case SculptPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_RELATION:
				return referencedRelation != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String toString(){
		if (eIsProxy()) {
			return super.toString();
		}

		final StringBuffer result = new StringBuffer("foreign key ");
		result.append(getTupleSelector().toString());
		result.append(" references ");
		result.append(getReferencedRelation().getName());
		return result.toString();
	}

} //ForeignKeyConstraintImpl

/**
 */
package de.ubt.ai7.csv_validator.sculpt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai7.csv_validator.sculpt.CompoundTypeSpecifier;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Compound Type Specifier</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.CompoundTypeSpecifierImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.CompoundTypeSpecifierImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompoundTypeSpecifierImpl extends TypeSpecifierImpl implements CompoundTypeSpecifier {
	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected Type subtype;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundTypeSpecifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.COMPOUND_TYPE_SPECIFIER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getSubtype() {
		if (subtype != null && subtype.eIsProxy()) {
			InternalEObject oldSubtype = (InternalEObject)subtype;
			subtype = (Type)eResolveProxy(oldSubtype);
			if (subtype != oldSubtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptPackage.COMPOUND_TYPE_SPECIFIER__SUBTYPE, oldSubtype, subtype));
			}
		}
		return subtype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetSubtype() {
		return subtype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubtype(Type newSubtype) {
		Type oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.COMPOUND_TYPE_SPECIFIER__SUBTYPE, oldSubtype, subtype));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.COMPOUND_TYPE_SPECIFIER__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptPackage.COMPOUND_TYPE_SPECIFIER__SUBTYPE:
				if (resolve) return getSubtype();
				return basicGetSubtype();
			case SculptPackage.COMPOUND_TYPE_SPECIFIER__INDEX:
				return getIndex();
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
			case SculptPackage.COMPOUND_TYPE_SPECIFIER__SUBTYPE:
				setSubtype((Type)newValue);
				return;
			case SculptPackage.COMPOUND_TYPE_SPECIFIER__INDEX:
				setIndex((Integer)newValue);
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
			case SculptPackage.COMPOUND_TYPE_SPECIFIER__SUBTYPE:
				setSubtype((Type)null);
				return;
			case SculptPackage.COMPOUND_TYPE_SPECIFIER__INDEX:
				setIndex(INDEX_EDEFAULT);
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
			case SculptPackage.COMPOUND_TYPE_SPECIFIER__SUBTYPE:
				return subtype != null;
			case SculptPackage.COMPOUND_TYPE_SPECIFIER__INDEX:
				return index != INDEX_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		final StringBuffer result = new StringBuffer();
		result.append('.');
		result.append(getSubtype().getName());
		if (index != 0) {
			result.append("<");
			result.append(index);
			result.append('>');
		}
		return result.toString();
	}

} // CompoundTypeSpecifierImpl

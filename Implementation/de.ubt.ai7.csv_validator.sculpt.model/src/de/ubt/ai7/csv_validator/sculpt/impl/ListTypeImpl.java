/**
 */
package de.ubt.ai7.csv_validator.sculpt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai7.csv_validator.sculpt.ListType;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.ListTypeImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.ListTypeImpl#getMinElements <em>Min Elements</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.ListTypeImpl#getMaxElements <em>Max Elements</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.ListTypeImpl#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListTypeImpl extends TypeImpl implements ListType {
	/**
	 * The default value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String SEPARATOR_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected String separator = SEPARATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinElements() <em>Min Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinElements()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_ELEMENTS_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getMinElements() <em>Min Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinElements()
	 * @generated
	 * @ordered
	 */
	protected Integer minElements = MIN_ELEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxElements() <em>Max Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxElements()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_ELEMENTS_EDEFAULT = new Integer(-1);

	/**
	 * The cached value of the '{@link #getMaxElements() <em>Max Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxElements()
	 * @generated
	 * @ordered
	 */
	protected Integer maxElements = MAX_ELEMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected Type base;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeparator() {
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeparator(String newSeparator) {
		String oldSeparator = separator;
		separator = newSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.LIST_TYPE__SEPARATOR, oldSeparator, separator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinElements() {
		return minElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinElements(Integer newMinElements) {
		Integer oldMinElements = minElements;
		minElements = newMinElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.LIST_TYPE__MIN_ELEMENTS, oldMinElements, minElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxElements() {
		return maxElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxElements(Integer newMaxElements) {
		Integer oldMaxElements = maxElements;
		maxElements = newMaxElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.LIST_TYPE__MAX_ELEMENTS, oldMaxElements, maxElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getBase() {
		if (base != null && base.eIsProxy()) {
			InternalEObject oldBase = (InternalEObject)base;
			base = (Type)eResolveProxy(oldBase);
			if (base != oldBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptPackage.LIST_TYPE__BASE, oldBase, base));
			}
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(Type newBase) {
		Type oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.LIST_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptPackage.LIST_TYPE__SEPARATOR:
				return getSeparator();
			case SculptPackage.LIST_TYPE__MIN_ELEMENTS:
				return getMinElements();
			case SculptPackage.LIST_TYPE__MAX_ELEMENTS:
				return getMaxElements();
			case SculptPackage.LIST_TYPE__BASE:
				if (resolve) return getBase();
				return basicGetBase();
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
			case SculptPackage.LIST_TYPE__SEPARATOR:
				setSeparator((String)newValue);
				return;
			case SculptPackage.LIST_TYPE__MIN_ELEMENTS:
				setMinElements((Integer)newValue);
				return;
			case SculptPackage.LIST_TYPE__MAX_ELEMENTS:
				setMaxElements((Integer)newValue);
				return;
			case SculptPackage.LIST_TYPE__BASE:
				setBase((Type)newValue);
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
			case SculptPackage.LIST_TYPE__SEPARATOR:
				setSeparator(SEPARATOR_EDEFAULT);
				return;
			case SculptPackage.LIST_TYPE__MIN_ELEMENTS:
				setMinElements(MIN_ELEMENTS_EDEFAULT);
				return;
			case SculptPackage.LIST_TYPE__MAX_ELEMENTS:
				setMaxElements(MAX_ELEMENTS_EDEFAULT);
				return;
			case SculptPackage.LIST_TYPE__BASE:
				setBase((Type)null);
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
			case SculptPackage.LIST_TYPE__SEPARATOR:
				return SEPARATOR_EDEFAULT == null ? separator != null : !SEPARATOR_EDEFAULT.equals(separator);
			case SculptPackage.LIST_TYPE__MIN_ELEMENTS:
				return MIN_ELEMENTS_EDEFAULT == null ? minElements != null : !MIN_ELEMENTS_EDEFAULT.equals(minElements);
			case SculptPackage.LIST_TYPE__MAX_ELEMENTS:
				return MAX_ELEMENTS_EDEFAULT == null ? maxElements != null : !MAX_ELEMENTS_EDEFAULT.equals(maxElements);
			case SculptPackage.LIST_TYPE__BASE:
				return base != null;
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
		final StringBuffer result = new StringBuffer("list<");
		result.append("base=");
		result.append(getBase().getName());
		result.append(" separator='");
		result.append(separator);
		result.append("' minElements=");
		result.append(minElements);
		result.append(" maxElements=");
		result.append(maxElements);
		result.append("> ");
		result.append(super.toString());
		return result.toString();
	}

} //ListTypeImpl

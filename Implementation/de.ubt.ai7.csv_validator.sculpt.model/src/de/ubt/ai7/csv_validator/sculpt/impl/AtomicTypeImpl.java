/**
 */
package de.ubt.ai7.csv_validator.sculpt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai7.csv_validator.sculpt.AtomicType;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.AtomicTypeImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.AtomicTypeImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.AtomicTypeImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.AtomicTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.AtomicTypeImpl#getGroupChar <em>Group Char</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.AtomicTypeImpl#getDecimalChar <em>Decimal Char</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.AtomicTypeImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.AtomicTypeImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.AtomicTypeImpl#getMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.AtomicTypeImpl#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.AtomicTypeImpl#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicTypeImpl extends TypeImpl implements AtomicType {
	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected Integer minLength = MIN_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected Integer maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected String base = BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupChar() <em>Group Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupChar()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupChar() <em>Group Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupChar()
	 * @generated
	 * @ordered
	 */
	protected String groupChar = GROUP_CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecimalChar() <em>Decimal Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalChar()
	 * @generated
	 * @ordered
	 */
	protected static final String DECIMAL_CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecimalChar() <em>Decimal Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalChar()
	 * @generated
	 * @ordered
	 */
	protected String decimalChar = DECIMAL_CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected String minimum = MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected String maximum = MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinExclusive() <em>Min Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExclusive()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_EXCLUSIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinExclusive() <em>Min Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExclusive()
	 * @generated
	 * @ordered
	 */
	protected String minExclusive = MIN_EXCLUSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxExclusive() <em>Max Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxExclusive()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_EXCLUSIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxExclusive() <em>Max Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxExclusive()
	 * @generated
	 * @ordered
	 */
	protected String maxExclusive = MAX_EXCLUSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected Integer length = LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.ATOMIC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.ATOMIC_TYPE__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinLength() {
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinLength(Integer newMinLength) {
		Integer oldMinLength = minLength;
		minLength = newMinLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.ATOMIC_TYPE__MIN_LENGTH, oldMinLength, minLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLength(Integer newMaxLength) {
		Integer oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.ATOMIC_TYPE__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(String newBase) {
		String oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.ATOMIC_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupChar() {
		return groupChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupChar(String newGroupChar) {
		String oldGroupChar = groupChar;
		groupChar = newGroupChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.ATOMIC_TYPE__GROUP_CHAR, oldGroupChar, groupChar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecimalChar() {
		return decimalChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecimalChar(String newDecimalChar) {
		String oldDecimalChar = decimalChar;
		decimalChar = newDecimalChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.ATOMIC_TYPE__DECIMAL_CHAR, oldDecimalChar, decimalChar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimum(String newMinimum) {
		String oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.ATOMIC_TYPE__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximum(String newMaximum) {
		String oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.ATOMIC_TYPE__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMinExclusive() {
		return minExclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinExclusive(String newMinExclusive) {
		String oldMinExclusive = minExclusive;
		minExclusive = newMinExclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.ATOMIC_TYPE__MIN_EXCLUSIVE, oldMinExclusive, minExclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaxExclusive() {
		return maxExclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxExclusive(String newMaxExclusive) {
		String oldMaxExclusive = maxExclusive;
		maxExclusive = newMaxExclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.ATOMIC_TYPE__MAX_EXCLUSIVE, oldMaxExclusive, maxExclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(Integer newLength) {
		Integer oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.ATOMIC_TYPE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptPackage.ATOMIC_TYPE__FORMAT:
				return getFormat();
			case SculptPackage.ATOMIC_TYPE__MIN_LENGTH:
				return getMinLength();
			case SculptPackage.ATOMIC_TYPE__MAX_LENGTH:
				return getMaxLength();
			case SculptPackage.ATOMIC_TYPE__BASE:
				return getBase();
			case SculptPackage.ATOMIC_TYPE__GROUP_CHAR:
				return getGroupChar();
			case SculptPackage.ATOMIC_TYPE__DECIMAL_CHAR:
				return getDecimalChar();
			case SculptPackage.ATOMIC_TYPE__MINIMUM:
				return getMinimum();
			case SculptPackage.ATOMIC_TYPE__MAXIMUM:
				return getMaximum();
			case SculptPackage.ATOMIC_TYPE__MIN_EXCLUSIVE:
				return getMinExclusive();
			case SculptPackage.ATOMIC_TYPE__MAX_EXCLUSIVE:
				return getMaxExclusive();
			case SculptPackage.ATOMIC_TYPE__LENGTH:
				return getLength();
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
			case SculptPackage.ATOMIC_TYPE__FORMAT:
				setFormat((String)newValue);
				return;
			case SculptPackage.ATOMIC_TYPE__MIN_LENGTH:
				setMinLength((Integer)newValue);
				return;
			case SculptPackage.ATOMIC_TYPE__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case SculptPackage.ATOMIC_TYPE__BASE:
				setBase((String)newValue);
				return;
			case SculptPackage.ATOMIC_TYPE__GROUP_CHAR:
				setGroupChar((String)newValue);
				return;
			case SculptPackage.ATOMIC_TYPE__DECIMAL_CHAR:
				setDecimalChar((String)newValue);
				return;
			case SculptPackage.ATOMIC_TYPE__MINIMUM:
				setMinimum((String)newValue);
				return;
			case SculptPackage.ATOMIC_TYPE__MAXIMUM:
				setMaximum((String)newValue);
				return;
			case SculptPackage.ATOMIC_TYPE__MIN_EXCLUSIVE:
				setMinExclusive((String)newValue);
				return;
			case SculptPackage.ATOMIC_TYPE__MAX_EXCLUSIVE:
				setMaxExclusive((String)newValue);
				return;
			case SculptPackage.ATOMIC_TYPE__LENGTH:
				setLength((Integer)newValue);
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
			case SculptPackage.ATOMIC_TYPE__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case SculptPackage.ATOMIC_TYPE__MIN_LENGTH:
				setMinLength(MIN_LENGTH_EDEFAULT);
				return;
			case SculptPackage.ATOMIC_TYPE__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case SculptPackage.ATOMIC_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case SculptPackage.ATOMIC_TYPE__GROUP_CHAR:
				setGroupChar(GROUP_CHAR_EDEFAULT);
				return;
			case SculptPackage.ATOMIC_TYPE__DECIMAL_CHAR:
				setDecimalChar(DECIMAL_CHAR_EDEFAULT);
				return;
			case SculptPackage.ATOMIC_TYPE__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case SculptPackage.ATOMIC_TYPE__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case SculptPackage.ATOMIC_TYPE__MIN_EXCLUSIVE:
				setMinExclusive(MIN_EXCLUSIVE_EDEFAULT);
				return;
			case SculptPackage.ATOMIC_TYPE__MAX_EXCLUSIVE:
				setMaxExclusive(MAX_EXCLUSIVE_EDEFAULT);
				return;
			case SculptPackage.ATOMIC_TYPE__LENGTH:
				setLength(LENGTH_EDEFAULT);
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
			case SculptPackage.ATOMIC_TYPE__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case SculptPackage.ATOMIC_TYPE__MIN_LENGTH:
				return MIN_LENGTH_EDEFAULT == null ? minLength != null : !MIN_LENGTH_EDEFAULT.equals(minLength);
			case SculptPackage.ATOMIC_TYPE__MAX_LENGTH:
				return MAX_LENGTH_EDEFAULT == null ? maxLength != null : !MAX_LENGTH_EDEFAULT.equals(maxLength);
			case SculptPackage.ATOMIC_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case SculptPackage.ATOMIC_TYPE__GROUP_CHAR:
				return GROUP_CHAR_EDEFAULT == null ? groupChar != null : !GROUP_CHAR_EDEFAULT.equals(groupChar);
			case SculptPackage.ATOMIC_TYPE__DECIMAL_CHAR:
				return DECIMAL_CHAR_EDEFAULT == null ? decimalChar != null : !DECIMAL_CHAR_EDEFAULT.equals(decimalChar);
			case SculptPackage.ATOMIC_TYPE__MINIMUM:
				return MINIMUM_EDEFAULT == null ? minimum != null : !MINIMUM_EDEFAULT.equals(minimum);
			case SculptPackage.ATOMIC_TYPE__MAXIMUM:
				return MAXIMUM_EDEFAULT == null ? maximum != null : !MAXIMUM_EDEFAULT.equals(maximum);
			case SculptPackage.ATOMIC_TYPE__MIN_EXCLUSIVE:
				return MIN_EXCLUSIVE_EDEFAULT == null ? minExclusive != null : !MIN_EXCLUSIVE_EDEFAULT.equals(minExclusive);
			case SculptPackage.ATOMIC_TYPE__MAX_EXCLUSIVE:
				return MAX_EXCLUSIVE_EDEFAULT == null ? maxExclusive != null : !MAX_EXCLUSIVE_EDEFAULT.equals(maxExclusive);
			case SculptPackage.ATOMIC_TYPE__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
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

		final StringBuffer result = new StringBuffer("base='");
		result.append(base);
		result.append("' format='");
		result.append(format);
		result.append("' minLength=");
		result.append(minLength);
		result.append(" maxLength=");
		result.append(maxLength);
		result.append(" groupChar='");
		result.append(groupChar);
		result.append("' decimalChar='");
		result.append(decimalChar);
		result.append("' minimum='");
		result.append(minimum);
		result.append("' maximum='");
		result.append(maximum);
		result.append("' minimumExclusive='");
		result.append(minExclusive);
		result.append("' maximumExclusive='");
		result.append(maxExclusive);
		result.append(' ');
		result.append(super.toString());
		return result.toString();
	}

} //AtomicTypeImpl

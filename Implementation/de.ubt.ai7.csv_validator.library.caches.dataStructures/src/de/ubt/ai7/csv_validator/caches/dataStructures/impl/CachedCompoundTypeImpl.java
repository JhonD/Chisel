/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedCompoundType;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedType;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cached Compound Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedCompoundTypeImpl#getPrimitives <em>Primitives</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedCompoundTypeImpl#getCapturingPattern <em>Capturing Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CachedCompoundTypeImpl extends CachedTypeImpl implements CachedCompoundType {
	/**
	 * The cached value of the '{@link #getPrimitives() <em>Primitives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitives()
	 * @generated NOT
	 * @ordered
	 */
	protected ArrayList<CachedType> primitives;

	/**
	 * The default value of the '{@link #getCapturingPattern() <em>Capturing Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapturingPattern()
	 * @generated
	 * @ordered
	 */
	protected static final Pattern CAPTURING_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapturingPattern() <em>Capturing Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapturingPattern()
	 * @generated
	 * @ordered
	 */
	protected Pattern capturingPattern = CAPTURING_PATTERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedCompoundTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return dataStructuresPackage.Literals.CACHED_COMPOUND_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * generated code always enforced uniqueness in spite of specified otherwise
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ArrayList<CachedType> getPrimitives() {
		if (primitives == null) {
			primitives = new ArrayList<CachedType>();
		}
		return primitives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern getCapturingPattern() {
		return capturingPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapturingPattern(Pattern newCapturingPattern) {
		Pattern oldCapturingPattern = capturingPattern;
		capturingPattern = newCapturingPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_COMPOUND_TYPE__CAPTURING_PATTERN, oldCapturingPattern, capturingPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_COMPOUND_TYPE__PRIMITIVES:
				return getPrimitives();
			case dataStructuresPackage.CACHED_COMPOUND_TYPE__CAPTURING_PATTERN:
				return getCapturingPattern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_COMPOUND_TYPE__PRIMITIVES:
				getPrimitives().clear();
				getPrimitives().addAll((Collection<? extends CachedType>)newValue);
				return;
			case dataStructuresPackage.CACHED_COMPOUND_TYPE__CAPTURING_PATTERN:
				setCapturingPattern((Pattern)newValue);
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
			case dataStructuresPackage.CACHED_COMPOUND_TYPE__PRIMITIVES:
				getPrimitives().clear();
				return;
			case dataStructuresPackage.CACHED_COMPOUND_TYPE__CAPTURING_PATTERN:
				setCapturingPattern(CAPTURING_PATTERN_EDEFAULT);
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
			case dataStructuresPackage.CACHED_COMPOUND_TYPE__PRIMITIVES:
				return primitives != null && !primitives.isEmpty();
			case dataStructuresPackage.CACHED_COMPOUND_TYPE__CAPTURING_PATTERN:
				return CAPTURING_PATTERN_EDEFAULT == null ? capturingPattern != null : !CAPTURING_PATTERN_EDEFAULT.equals(capturingPattern);
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
		result.append(" (capturingPattern: ");
		result.append(capturingPattern);
		result.append(')');
		return result.toString();
	}

} //CachedCompoundTypeImpl

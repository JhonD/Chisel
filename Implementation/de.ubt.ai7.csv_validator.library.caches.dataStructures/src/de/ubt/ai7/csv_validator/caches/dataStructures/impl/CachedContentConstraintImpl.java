/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedContentConstraint;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cached Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedContentConstraintImpl#getAutomaton <em>Automaton</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CachedContentConstraintImpl extends CachedConstraintImpl implements CachedContentConstraint {
	/**
	 * The default value of the '{@link #getAutomaton() <em>Automaton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaton()
	 * @generated
	 * @ordered
	 */
	protected static final Object AUTOMATON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutomaton() <em>Automaton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaton()
	 * @generated
	 * @ordered
	 */
	protected Object automaton = AUTOMATON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedContentConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return dataStructuresPackage.Literals.CACHED_CONTENT_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAutomaton() {
		return automaton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomaton(Object newAutomaton) {
		Object oldAutomaton = automaton;
		automaton = newAutomaton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_CONTENT_CONSTRAINT__AUTOMATON, oldAutomaton, automaton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_CONTENT_CONSTRAINT__AUTOMATON:
				return getAutomaton();
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
			case dataStructuresPackage.CACHED_CONTENT_CONSTRAINT__AUTOMATON:
				setAutomaton(newValue);
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
			case dataStructuresPackage.CACHED_CONTENT_CONSTRAINT__AUTOMATON:
				setAutomaton(AUTOMATON_EDEFAULT);
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
			case dataStructuresPackage.CACHED_CONTENT_CONSTRAINT__AUTOMATON:
				return AUTOMATON_EDEFAULT == null ? automaton != null : !AUTOMATON_EDEFAULT.equals(automaton);
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
		result.append(" (automaton: ");
		result.append(automaton);
		result.append(')');
		return result.toString();
	}

} //CachedConstraintImpl

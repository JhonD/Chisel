/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLLoop;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLStatement;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cached TL Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLLoopImpl#getAutomaton <em>Automaton</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLLoopImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLLoopImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CachedTLLoopImpl extends CachedTLStatementImpl implements CachedTLLoop {
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
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<CachedTLStatement> statements;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<CachedTLVariableBinding> bindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedTLLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return dataStructuresPackage.Literals.CACHED_TL_LOOP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_TL_LOOP__AUTOMATON, oldAutomaton, automaton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CachedTLStatement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<CachedTLStatement>(CachedTLStatement.class, this, dataStructuresPackage.CACHED_TL_LOOP__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CachedTLVariableBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<CachedTLVariableBinding>(CachedTLVariableBinding.class, this, dataStructuresPackage.CACHED_TL_LOOP__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_TL_LOOP__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
			case dataStructuresPackage.CACHED_TL_LOOP__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
			case dataStructuresPackage.CACHED_TL_LOOP__AUTOMATON:
				return getAutomaton();
			case dataStructuresPackage.CACHED_TL_LOOP__STATEMENTS:
				return getStatements();
			case dataStructuresPackage.CACHED_TL_LOOP__BINDINGS:
				return getBindings();
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
			case dataStructuresPackage.CACHED_TL_LOOP__AUTOMATON:
				setAutomaton(newValue);
				return;
			case dataStructuresPackage.CACHED_TL_LOOP__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends CachedTLStatement>)newValue);
				return;
			case dataStructuresPackage.CACHED_TL_LOOP__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends CachedTLVariableBinding>)newValue);
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
			case dataStructuresPackage.CACHED_TL_LOOP__AUTOMATON:
				setAutomaton(AUTOMATON_EDEFAULT);
				return;
			case dataStructuresPackage.CACHED_TL_LOOP__STATEMENTS:
				getStatements().clear();
				return;
			case dataStructuresPackage.CACHED_TL_LOOP__BINDINGS:
				getBindings().clear();
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
			case dataStructuresPackage.CACHED_TL_LOOP__AUTOMATON:
				return AUTOMATON_EDEFAULT == null ? automaton != null : !AUTOMATON_EDEFAULT.equals(automaton);
			case dataStructuresPackage.CACHED_TL_LOOP__STATEMENTS:
				return statements != null && !statements.isEmpty();
			case dataStructuresPackage.CACHED_TL_LOOP__BINDINGS:
				return bindings != null && !bindings.isEmpty();
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

} //CachedTLLoopImpl

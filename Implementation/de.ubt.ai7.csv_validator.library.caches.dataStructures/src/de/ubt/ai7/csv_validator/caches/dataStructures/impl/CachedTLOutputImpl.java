/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutput;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLPrimitive;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cached TL Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLOutputImpl#getPrimitives <em>Primitives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CachedTLOutputImpl extends CachedTLStatementImpl implements CachedTLOutput {
	/**
	 * The cached value of the '{@link #getPrimitives() <em>Primitives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitives()
	 * @generated
	 * @ordered
	 */
	protected EList<CachedTLPrimitive> primitives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedTLOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return dataStructuresPackage.Literals.CACHED_TL_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CachedTLPrimitive> getPrimitives() {
		if (primitives == null) {
			primitives = new EObjectResolvingEList<CachedTLPrimitive>(CachedTLPrimitive.class, this, dataStructuresPackage.CACHED_TL_OUTPUT__PRIMITIVES);
		}
		return primitives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_TL_OUTPUT__PRIMITIVES:
				return getPrimitives();
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
			case dataStructuresPackage.CACHED_TL_OUTPUT__PRIMITIVES:
				getPrimitives().clear();
				getPrimitives().addAll((Collection<? extends CachedTLPrimitive>)newValue);
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
			case dataStructuresPackage.CACHED_TL_OUTPUT__PRIMITIVES:
				getPrimitives().clear();
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
			case dataStructuresPackage.CACHED_TL_OUTPUT__PRIMITIVES:
				return primitives != null && !primitives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CachedTLOutputImpl

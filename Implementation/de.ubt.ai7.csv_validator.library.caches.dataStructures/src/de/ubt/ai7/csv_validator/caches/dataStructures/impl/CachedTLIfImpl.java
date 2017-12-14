/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.impl;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLIf;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLStatement;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cached TL If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLIfImpl#getIfBlock <em>If Block</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLIfImpl#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CachedTLIfImpl extends CachedTLStatementImpl implements CachedTLIf {
	/**
	 * The cached value of the '{@link #getIfBlock() <em>If Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<CachedTLStatement> ifBlock;

	/**
	 * The cached value of the '{@link #getElseBlock() <em>Else Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<CachedTLStatement> elseBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedTLIfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return dataStructuresPackage.Literals.CACHED_TL_IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CachedTLStatement> getIfBlock() {
		if (ifBlock == null) {
			ifBlock = new EObjectContainmentEList<CachedTLStatement>(CachedTLStatement.class, this, dataStructuresPackage.CACHED_TL_IF__IF_BLOCK);
		}
		return ifBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CachedTLStatement> getElseBlock() {
		if (elseBlock == null) {
			elseBlock = new EObjectContainmentEList<CachedTLStatement>(CachedTLStatement.class, this, dataStructuresPackage.CACHED_TL_IF__ELSE_BLOCK);
		}
		return elseBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_TL_IF__IF_BLOCK:
				return ((InternalEList<?>)getIfBlock()).basicRemove(otherEnd, msgs);
			case dataStructuresPackage.CACHED_TL_IF__ELSE_BLOCK:
				return ((InternalEList<?>)getElseBlock()).basicRemove(otherEnd, msgs);
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
			case dataStructuresPackage.CACHED_TL_IF__IF_BLOCK:
				return getIfBlock();
			case dataStructuresPackage.CACHED_TL_IF__ELSE_BLOCK:
				return getElseBlock();
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
			case dataStructuresPackage.CACHED_TL_IF__IF_BLOCK:
				getIfBlock().clear();
				getIfBlock().addAll((Collection<? extends CachedTLStatement>)newValue);
				return;
			case dataStructuresPackage.CACHED_TL_IF__ELSE_BLOCK:
				getElseBlock().clear();
				getElseBlock().addAll((Collection<? extends CachedTLStatement>)newValue);
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
			case dataStructuresPackage.CACHED_TL_IF__IF_BLOCK:
				getIfBlock().clear();
				return;
			case dataStructuresPackage.CACHED_TL_IF__ELSE_BLOCK:
				getElseBlock().clear();
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
			case dataStructuresPackage.CACHED_TL_IF__IF_BLOCK:
				return ifBlock != null && !ifBlock.isEmpty();
			case dataStructuresPackage.CACHED_TL_IF__ELSE_BLOCK:
				return elseBlock != null && !elseBlock.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CachedTLIfImpl

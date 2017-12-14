/**
 */
package de.ubt.ai7.csv_validator.sculpt.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.TLOutput;
import de.ubt.ai7.csv_validator.sculpt.TLOutputPrimitive;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TL Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.TLOutputImpl#getPrimitives <em>Primitives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TLOutputImpl extends TLStatementImpl implements TLOutput {
	/**
	 * The cached value of the '{@link #getPrimitives() <em>Primitives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitives()
	 * @generated
	 * @ordered
	 */
	protected EList<TLOutputPrimitive> primitives;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TLOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.TL_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TLOutputPrimitive> getPrimitives() {
		if (primitives == null) {
			primitives = new EObjectContainmentEList<TLOutputPrimitive>(TLOutputPrimitive.class, this, SculptPackage.TL_OUTPUT__PRIMITIVES);
		}
		return primitives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
		switch (featureID) {
		case SculptPackage.TL_OUTPUT__PRIMITIVES:
			return ((InternalEList<?>)getPrimitives()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case SculptPackage.TL_OUTPUT__PRIMITIVES:
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
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case SculptPackage.TL_OUTPUT__PRIMITIVES:
			getPrimitives().clear();
			getPrimitives().addAll((Collection<? extends TLOutputPrimitive>)newValue);
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
	public void eUnset(final int featureID) {
		switch (featureID) {
		case SculptPackage.TL_OUTPUT__PRIMITIVES:
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
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case SculptPackage.TL_OUTPUT__PRIMITIVES:
			return primitives != null && !primitives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String toString(){
		final StringBuilder s = new StringBuilder("output(");
		final Iterator<TLOutputPrimitive> primIter = primitives.iterator();
		if(primIter.hasNext()){
			s.append(primIter.next().toString());
			while(primIter.hasNext()){
				s.append(", ");
				s.append(primIter.next().toString());
			}
		}
		s.append(");");
		return s.toString();
	}
} //TLOutputImpl

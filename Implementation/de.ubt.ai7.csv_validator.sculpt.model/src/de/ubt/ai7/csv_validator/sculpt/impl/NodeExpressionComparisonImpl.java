/**
 */
package de.ubt.ai7.csv_validator.sculpt.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai7.csv_validator.sculpt.Comparator;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.Type;
import de.ubt.ai7.csv_validator.sculpt.TypeSpecifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Expression Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionComparisonImpl#getComp <em>Comp</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionComparisonImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionComparisonImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionComparisonImpl#getTypeSpecifier <em>Type Specifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeExpressionComparisonImpl extends NodeExpressionImpl implements NodeExpressionComparison {
	/**
	 * The default value of the '{@link #getComp() <em>Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp()
	 * @generated
	 * @ordered
	 */
	protected static final Comparator COMP_EDEFAULT = Comparator.LT;

	/**
	 * The cached value of the '{@link #getComp() <em>Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp()
	 * @generated
	 * @ordered
	 */
	protected Comparator comp = COMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getTypeSpecifier() <em>Type Specifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSpecifier()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeSpecifier> typeSpecifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeExpressionComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.NODE_EXPRESSION_COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comparator getComp() {
		return comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComp(Comparator newComp) {
		Comparator oldComp = comp;
		comp = newComp == null ? COMP_EDEFAULT : newComp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.NODE_EXPRESSION_COMPARISON__COMP, oldComp, comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.NODE_EXPRESSION_COMPARISON__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptPackage.NODE_EXPRESSION_COMPARISON__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.NODE_EXPRESSION_COMPARISON__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeSpecifier> getTypeSpecifier() {
		if (typeSpecifier == null) {
			typeSpecifier = new EObjectContainmentEList<TypeSpecifier>(TypeSpecifier.class, this, SculptPackage.NODE_EXPRESSION_COMPARISON__TYPE_SPECIFIER);
		}
		return typeSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptPackage.NODE_EXPRESSION_COMPARISON__TYPE_SPECIFIER:
				return ((InternalEList<?>)getTypeSpecifier()).basicRemove(otherEnd, msgs);
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
			case SculptPackage.NODE_EXPRESSION_COMPARISON__COMP:
				return getComp();
			case SculptPackage.NODE_EXPRESSION_COMPARISON__VALUE:
				return getValue();
			case SculptPackage.NODE_EXPRESSION_COMPARISON__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case SculptPackage.NODE_EXPRESSION_COMPARISON__TYPE_SPECIFIER:
				return getTypeSpecifier();
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
			case SculptPackage.NODE_EXPRESSION_COMPARISON__COMP:
				setComp((Comparator)newValue);
				return;
			case SculptPackage.NODE_EXPRESSION_COMPARISON__VALUE:
				setValue((String)newValue);
				return;
			case SculptPackage.NODE_EXPRESSION_COMPARISON__TYPE:
				setType((Type)newValue);
				return;
			case SculptPackage.NODE_EXPRESSION_COMPARISON__TYPE_SPECIFIER:
				getTypeSpecifier().clear();
				getTypeSpecifier().addAll((Collection<? extends TypeSpecifier>)newValue);
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
			case SculptPackage.NODE_EXPRESSION_COMPARISON__COMP:
				setComp(COMP_EDEFAULT);
				return;
			case SculptPackage.NODE_EXPRESSION_COMPARISON__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SculptPackage.NODE_EXPRESSION_COMPARISON__TYPE:
				setType((Type)null);
				return;
			case SculptPackage.NODE_EXPRESSION_COMPARISON__TYPE_SPECIFIER:
				getTypeSpecifier().clear();
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
			case SculptPackage.NODE_EXPRESSION_COMPARISON__COMP:
				return comp != COMP_EDEFAULT;
			case SculptPackage.NODE_EXPRESSION_COMPARISON__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SculptPackage.NODE_EXPRESSION_COMPARISON__TYPE:
				return type != null;
			case SculptPackage.NODE_EXPRESSION_COMPARISON__TYPE_SPECIFIER:
				return typeSpecifier != null && !typeSpecifier.isEmpty();
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
		final StringBuffer result = new StringBuffer(type.getName());
		for(final TypeSpecifier spec : getTypeSpecifier()){
			result.append(spec.toString());
		}
		result.append(" ");
		result.append(comp);
		result.append(" ");
		result.append(value);
		return result.toString();
	}

} //NodeExpressionComparisonImpl

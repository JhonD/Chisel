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
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison;
import de.ubt.ai7.csv_validator.sculpt.PathExpression;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.Type;
import de.ubt.ai7.csv_validator.sculpt.TypeSpecifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Expression Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionComparisonImpl#getComp <em>Comp</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionComparisonImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionComparisonImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionComparisonImpl#getTypeSpecifier <em>Type Specifier</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentExpressionComparisonImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentExpressionComparisonImpl extends ContentExpressionImpl implements ContentExpressionComparison {
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
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected PathExpression path;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentExpressionComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.CONTENT_EXPRESSION_COMPARISON__COMP, oldComp, comp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.CONTENT_EXPRESSION_COMPARISON__VALUE, oldValue, value));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptPackage.CONTENT_EXPRESSION_COMPARISON__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.CONTENT_EXPRESSION_COMPARISON__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeSpecifier> getTypeSpecifier() {
		if (typeSpecifier == null) {
			typeSpecifier = new EObjectContainmentEList<TypeSpecifier>(TypeSpecifier.class, this, SculptPackage.CONTENT_EXPRESSION_COMPARISON__TYPE_SPECIFIER);
		}
		return typeSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathExpression getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(PathExpression newPath, NotificationChain msgs) {
		PathExpression oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptPackage.CONTENT_EXPRESSION_COMPARISON__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(PathExpression newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptPackage.CONTENT_EXPRESSION_COMPARISON__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptPackage.CONTENT_EXPRESSION_COMPARISON__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.CONTENT_EXPRESSION_COMPARISON__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__TYPE_SPECIFIER:
				return ((InternalEList<?>)getTypeSpecifier()).basicRemove(otherEnd, msgs);
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__PATH:
				return basicSetPath(null, msgs);
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
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__COMP:
				return getComp();
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__VALUE:
				return getValue();
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__TYPE_SPECIFIER:
				return getTypeSpecifier();
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__PATH:
				return getPath();
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
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__COMP:
				setComp((Comparator)newValue);
				return;
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__VALUE:
				setValue((String)newValue);
				return;
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__TYPE:
				setType((Type)newValue);
				return;
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__TYPE_SPECIFIER:
				getTypeSpecifier().clear();
				getTypeSpecifier().addAll((Collection<? extends TypeSpecifier>)newValue);
				return;
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__PATH:
				setPath((PathExpression)newValue);
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
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__COMP:
				setComp(COMP_EDEFAULT);
				return;
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__TYPE:
				setType((Type)null);
				return;
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__TYPE_SPECIFIER:
				getTypeSpecifier().clear();
				return;
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__PATH:
				setPath((PathExpression)null);
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
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__COMP:
				return comp != COMP_EDEFAULT;
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__TYPE:
				return type != null;
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__TYPE_SPECIFIER:
				return typeSpecifier != null && !typeSpecifier.isEmpty();
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__PATH:
				return path != null;
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
		if(value != null) {
			result.append(value);
		} else {
			result.append(path.toString());
		}
		return result.toString();
	}

} //ContentExpressionComparisonImpl

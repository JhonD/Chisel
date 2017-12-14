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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai7.csv_validator.sculpt.Constraint;
import de.ubt.ai7.csv_validator.sculpt.Delimiters;
import de.ubt.ai7.csv_validator.sculpt.RegionToken;
import de.ubt.ai7.csv_validator.sculpt.Sculpt;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.Token;
import de.ubt.ai7.csv_validator.sculpt.TransformationProgram;
import de.ubt.ai7.csv_validator.sculpt.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sculpt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.SculptImpl#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.SculptImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.SculptImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.SculptImpl#getRegionTokens <em>Region Tokens</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.SculptImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.SculptImpl#getTransformationProgram <em>Transformation Program</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SculptImpl extends MinimalEObjectImpl.Container implements Sculpt {
	/**
	 * The cached value of the '{@link #getDelimiter() <em>Delimiter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiter()
	 * @generated
	 * @ordered
	 */
	protected Delimiters delimiter;

	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> tokens;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getRegionTokens() <em>Region Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<RegionToken> regionTokens;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getTransformationProgram() <em>Transformation Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationProgram()
	 * @generated
	 * @ordered
	 */
	protected TransformationProgram transformationProgram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SculptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.SCULPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delimiters getDelimiter() {
		return delimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelimiter(Delimiters newDelimiter, NotificationChain msgs) {
		Delimiters oldDelimiter = delimiter;
		delimiter = newDelimiter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptPackage.SCULPT__DELIMITER, oldDelimiter, newDelimiter);
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
	public void setDelimiter(Delimiters newDelimiter) {
		if (newDelimiter != delimiter) {
			NotificationChain msgs = null;
			if (delimiter != null)
				msgs = ((InternalEObject)delimiter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptPackage.SCULPT__DELIMITER, null, msgs);
			if (newDelimiter != null)
				msgs = ((InternalEObject)newDelimiter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptPackage.SCULPT__DELIMITER, null, msgs);
			msgs = basicSetDelimiter(newDelimiter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.SCULPT__DELIMITER, newDelimiter, newDelimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Token> getTokens() {
		if (tokens == null) {
			tokens = new EObjectContainmentEList<Token>(Token.class, this, SculptPackage.SCULPT__TOKENS);
		}
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, SculptPackage.SCULPT__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RegionToken> getRegionTokens() {
		if (regionTokens == null) {
			regionTokens = new EObjectContainmentEList<RegionToken>(RegionToken.class, this, SculptPackage.SCULPT__REGION_TOKENS);
		}
		return regionTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, SculptPackage.SCULPT__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationProgram getTransformationProgram() {
		return transformationProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformationProgram(TransformationProgram newTransformationProgram, NotificationChain msgs) {
		TransformationProgram oldTransformationProgram = transformationProgram;
		transformationProgram = newTransformationProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptPackage.SCULPT__TRANSFORMATION_PROGRAM, oldTransformationProgram, newTransformationProgram);
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
	public void setTransformationProgram(TransformationProgram newTransformationProgram) {
		if (newTransformationProgram != transformationProgram) {
			NotificationChain msgs = null;
			if (transformationProgram != null)
				msgs = ((InternalEObject)transformationProgram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptPackage.SCULPT__TRANSFORMATION_PROGRAM, null, msgs);
			if (newTransformationProgram != null)
				msgs = ((InternalEObject)newTransformationProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptPackage.SCULPT__TRANSFORMATION_PROGRAM, null, msgs);
			msgs = basicSetTransformationProgram(newTransformationProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.SCULPT__TRANSFORMATION_PROGRAM, newTransformationProgram, newTransformationProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptPackage.SCULPT__DELIMITER:
				return basicSetDelimiter(null, msgs);
			case SculptPackage.SCULPT__TOKENS:
				return ((InternalEList<?>)getTokens()).basicRemove(otherEnd, msgs);
			case SculptPackage.SCULPT__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case SculptPackage.SCULPT__REGION_TOKENS:
				return ((InternalEList<?>)getRegionTokens()).basicRemove(otherEnd, msgs);
			case SculptPackage.SCULPT__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case SculptPackage.SCULPT__TRANSFORMATION_PROGRAM:
				return basicSetTransformationProgram(null, msgs);
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
			case SculptPackage.SCULPT__DELIMITER:
				return getDelimiter();
			case SculptPackage.SCULPT__TOKENS:
				return getTokens();
			case SculptPackage.SCULPT__CONSTRAINTS:
				return getConstraints();
			case SculptPackage.SCULPT__REGION_TOKENS:
				return getRegionTokens();
			case SculptPackage.SCULPT__TYPES:
				return getTypes();
			case SculptPackage.SCULPT__TRANSFORMATION_PROGRAM:
				return getTransformationProgram();
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
			case SculptPackage.SCULPT__DELIMITER:
				setDelimiter((Delimiters)newValue);
				return;
			case SculptPackage.SCULPT__TOKENS:
				getTokens().clear();
				getTokens().addAll((Collection<? extends Token>)newValue);
				return;
			case SculptPackage.SCULPT__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case SculptPackage.SCULPT__REGION_TOKENS:
				getRegionTokens().clear();
				getRegionTokens().addAll((Collection<? extends RegionToken>)newValue);
				return;
			case SculptPackage.SCULPT__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case SculptPackage.SCULPT__TRANSFORMATION_PROGRAM:
				setTransformationProgram((TransformationProgram)newValue);
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
			case SculptPackage.SCULPT__DELIMITER:
				setDelimiter((Delimiters)null);
				return;
			case SculptPackage.SCULPT__TOKENS:
				getTokens().clear();
				return;
			case SculptPackage.SCULPT__CONSTRAINTS:
				getConstraints().clear();
				return;
			case SculptPackage.SCULPT__REGION_TOKENS:
				getRegionTokens().clear();
				return;
			case SculptPackage.SCULPT__TYPES:
				getTypes().clear();
				return;
			case SculptPackage.SCULPT__TRANSFORMATION_PROGRAM:
				setTransformationProgram((TransformationProgram)null);
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
			case SculptPackage.SCULPT__DELIMITER:
				return delimiter != null;
			case SculptPackage.SCULPT__TOKENS:
				return tokens != null && !tokens.isEmpty();
			case SculptPackage.SCULPT__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case SculptPackage.SCULPT__REGION_TOKENS:
				return regionTokens != null && !regionTokens.isEmpty();
			case SculptPackage.SCULPT__TYPES:
				return types != null && !types.isEmpty();
			case SculptPackage.SCULPT__TRANSFORMATION_PROGRAM:
				return transformationProgram != null;
		}
		return super.eIsSet(featureID);
	}

} //SculptImpl

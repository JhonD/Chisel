/**
 */
package de.ubt.ai7.csv_validator.sculpt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai7.csv_validator.sculpt.ContentConstraint;
import de.ubt.ai7.csv_validator.sculpt.ContentExpression;
import de.ubt.ai7.csv_validator.sculpt.NodeExpression;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.ValidationMode;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Constraint</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentConstraintImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentConstraintImpl#getContentExpression <em>Content Expression</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.ContentConstraintImpl#getValidationMode <em>Validation Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentConstraintImpl extends ConstraintImpl implements ContentConstraint {
	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected NodeExpression region;

	/**
	 * The cached value of the '{@link #getContentExpression() <em>Content Expression</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getContentExpression()
	 * @generated
	 * @ordered
	 */
	protected ContentExpression contentExpression;

	/**
	 * The default value of the '{@link #getValidationMode() <em>Validation Mode</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValidationMode()
	 * @generated
	 * @ordered
	 */
	protected static final ValidationMode VALIDATION_MODE_EDEFAULT = ValidationMode.COMPLETE;

	/**
	 * The cached value of the '{@link #getValidationMode() <em>Validation Mode</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValidationMode()
	 * @generated
	 * @ordered
	 */
	protected ValidationMode validationMode = VALIDATION_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.CONTENT_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeExpression getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(NodeExpression newRegion, NotificationChain msgs) {
		NodeExpression oldRegion = region;
		region = newRegion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptPackage.CONTENT_CONSTRAINT__REGION, oldRegion, newRegion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegion(NodeExpression newRegion) {
		if (newRegion != region) {
			NotificationChain msgs = null;
			if (region != null)
				msgs = ((InternalEObject)region).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptPackage.CONTENT_CONSTRAINT__REGION, null, msgs);
			if (newRegion != null)
				msgs = ((InternalEObject)newRegion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptPackage.CONTENT_CONSTRAINT__REGION, null, msgs);
			msgs = basicSetRegion(newRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.CONTENT_CONSTRAINT__REGION, newRegion, newRegion));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationMode getValidationMode() {
		return validationMode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidationMode(ValidationMode newValidationMode) {
		ValidationMode oldValidationMode = validationMode;
		validationMode = newValidationMode == null ? VALIDATION_MODE_EDEFAULT : newValidationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.CONTENT_CONSTRAINT__VALIDATION_MODE, oldValidationMode, validationMode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentExpression getContentExpression() {
		return contentExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentExpression(ContentExpression newContentExpression, NotificationChain msgs) {
		ContentExpression oldContentExpression = contentExpression;
		contentExpression = newContentExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptPackage.CONTENT_CONSTRAINT__CONTENT_EXPRESSION, oldContentExpression, newContentExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentExpression(ContentExpression newContentExpression) {
		if (newContentExpression != contentExpression) {
			NotificationChain msgs = null;
			if (contentExpression != null)
				msgs = ((InternalEObject)contentExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptPackage.CONTENT_CONSTRAINT__CONTENT_EXPRESSION, null, msgs);
			if (newContentExpression != null)
				msgs = ((InternalEObject)newContentExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptPackage.CONTENT_CONSTRAINT__CONTENT_EXPRESSION, null, msgs);
			msgs = basicSetContentExpression(newContentExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.CONTENT_CONSTRAINT__CONTENT_EXPRESSION, newContentExpression, newContentExpression));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return this.region.toString() + validationMode.toString() + this.contentExpression.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptPackage.CONTENT_CONSTRAINT__REGION:
				return basicSetRegion(null, msgs);
			case SculptPackage.CONTENT_CONSTRAINT__CONTENT_EXPRESSION:
				return basicSetContentExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptPackage.CONTENT_CONSTRAINT__REGION:
				return getRegion();
			case SculptPackage.CONTENT_CONSTRAINT__CONTENT_EXPRESSION:
				return getContentExpression();
			case SculptPackage.CONTENT_CONSTRAINT__VALIDATION_MODE:
				return getValidationMode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SculptPackage.CONTENT_CONSTRAINT__REGION:
				setRegion((NodeExpression)newValue);
				return;
			case SculptPackage.CONTENT_CONSTRAINT__CONTENT_EXPRESSION:
				setContentExpression((ContentExpression)newValue);
				return;
			case SculptPackage.CONTENT_CONSTRAINT__VALIDATION_MODE:
				setValidationMode((ValidationMode)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SculptPackage.CONTENT_CONSTRAINT__REGION:
				setRegion((NodeExpression)null);
				return;
			case SculptPackage.CONTENT_CONSTRAINT__CONTENT_EXPRESSION:
				setContentExpression((ContentExpression)null);
				return;
			case SculptPackage.CONTENT_CONSTRAINT__VALIDATION_MODE:
				setValidationMode(VALIDATION_MODE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SculptPackage.CONTENT_CONSTRAINT__REGION:
				return region != null;
			case SculptPackage.CONTENT_CONSTRAINT__CONTENT_EXPRESSION:
				return contentExpression != null;
			case SculptPackage.CONTENT_CONSTRAINT__VALIDATION_MODE:
				return validationMode != VALIDATION_MODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} // ConstraintImpl

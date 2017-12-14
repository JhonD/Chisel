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

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedDelimiters;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLStatement;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cached Transformation Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTransformationProgramImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTransformationProgramImpl#getDelimiters <em>Delimiters</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTransformationProgramImpl#getTransformedCsv <em>Transformed Csv</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTransformationProgramImpl#getW3cSchema <em>W3c Schema</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTransformationProgramImpl#getError <em>Error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CachedTransformationProgramImpl extends CachedTLElementImpl implements CachedTransformationProgram {
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
	 * The cached value of the '{@link #getDelimiters() <em>Delimiters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiters()
	 * @generated
	 * @ordered
	 */
	protected CachedDelimiters delimiters;

	/**
	 * The default value of the '{@link #getTransformedCsv() <em>Transformed Csv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformedCsv()
	 * @generated
	 * @ordered
	 */
	protected static final Object TRANSFORMED_CSV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformedCsv() <em>Transformed Csv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformedCsv()
	 * @generated
	 * @ordered
	 */
	protected Object transformedCsv = TRANSFORMED_CSV_EDEFAULT;

	/**
	 * The default value of the '{@link #getW3cSchema() <em>W3c Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW3cSchema()
	 * @generated
	 * @ordered
	 */
	protected static final Object W3C_SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getW3cSchema() <em>W3c Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW3cSchema()
	 * @generated
	 * @ordered
	 */
	protected Object w3cSchema = W3C_SCHEMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected static final Object ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected Object error = ERROR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedTransformationProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return dataStructuresPackage.Literals.CACHED_TRANSFORMATION_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CachedTLStatement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<CachedTLStatement>(CachedTLStatement.class, this, dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedDelimiters getDelimiters() {
		return delimiters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelimiters(CachedDelimiters newDelimiters, NotificationChain msgs) {
		CachedDelimiters oldDelimiters = delimiters;
		delimiters = newDelimiters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__DELIMITERS, oldDelimiters, newDelimiters);
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
	public void setDelimiters(CachedDelimiters newDelimiters) {
		if (newDelimiters != delimiters) {
			NotificationChain msgs = null;
			if (delimiters != null)
				msgs = ((InternalEObject)delimiters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__DELIMITERS, null, msgs);
			if (newDelimiters != null)
				msgs = ((InternalEObject)newDelimiters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__DELIMITERS, null, msgs);
			msgs = basicSetDelimiters(newDelimiters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__DELIMITERS, newDelimiters, newDelimiters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTransformedCsv() {
		return transformedCsv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformedCsv(Object newTransformedCsv) {
		Object oldTransformedCsv = transformedCsv;
		transformedCsv = newTransformedCsv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__TRANSFORMED_CSV, oldTransformedCsv, transformedCsv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getW3cSchema() {
		return w3cSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setW3cSchema(Object newW3cSchema) {
		Object oldW3cSchema = w3cSchema;
		w3cSchema = newW3cSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__W3C_SCHEMA, oldW3cSchema, w3cSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(Object newError) {
		Object oldError = error;
		error = newError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__ERROR, oldError, error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__DELIMITERS:
				return basicSetDelimiters(null, msgs);
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
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__STATEMENTS:
				return getStatements();
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__DELIMITERS:
				return getDelimiters();
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__TRANSFORMED_CSV:
				return getTransformedCsv();
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__W3C_SCHEMA:
				return getW3cSchema();
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__ERROR:
				return getError();
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
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends CachedTLStatement>)newValue);
				return;
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__DELIMITERS:
				setDelimiters((CachedDelimiters)newValue);
				return;
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__TRANSFORMED_CSV:
				setTransformedCsv(newValue);
				return;
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__W3C_SCHEMA:
				setW3cSchema(newValue);
				return;
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__ERROR:
				setError(newValue);
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
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__STATEMENTS:
				getStatements().clear();
				return;
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__DELIMITERS:
				setDelimiters((CachedDelimiters)null);
				return;
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__TRANSFORMED_CSV:
				setTransformedCsv(TRANSFORMED_CSV_EDEFAULT);
				return;
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__W3C_SCHEMA:
				setW3cSchema(W3C_SCHEMA_EDEFAULT);
				return;
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__ERROR:
				setError(ERROR_EDEFAULT);
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
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__STATEMENTS:
				return statements != null && !statements.isEmpty();
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__DELIMITERS:
				return delimiters != null;
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__TRANSFORMED_CSV:
				return TRANSFORMED_CSV_EDEFAULT == null ? transformedCsv != null : !TRANSFORMED_CSV_EDEFAULT.equals(transformedCsv);
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__W3C_SCHEMA:
				return W3C_SCHEMA_EDEFAULT == null ? w3cSchema != null : !W3C_SCHEMA_EDEFAULT.equals(w3cSchema);
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM__ERROR:
				return ERROR_EDEFAULT == null ? error != null : !ERROR_EDEFAULT.equals(error);
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
		result.append(" (transformedCsv: ");
		result.append(transformedCsv);
		result.append(", w3cSchema: ");
		result.append(w3cSchema);
		result.append(", error: ");
		result.append(error);
		result.append(')');
		return result.toString();
	}

} //CachedTransformationProgramImpl

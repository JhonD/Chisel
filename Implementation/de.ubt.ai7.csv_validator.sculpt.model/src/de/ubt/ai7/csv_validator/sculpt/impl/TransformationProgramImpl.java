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

import de.ubt.ai7.csv_validator.sculpt.Delimiters;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.TLStatement;
import de.ubt.ai7.csv_validator.sculpt.TransformationProgram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.TransformationProgramImpl#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.TransformationProgramImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationProgramImpl extends SchemaElementImpl implements TransformationProgram {
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
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<TLStatement> statements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.TRANSFORMATION_PROGRAM;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptPackage.TRANSFORMATION_PROGRAM__DELIMITER, oldDelimiter, newDelimiter);
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
				msgs = ((InternalEObject)delimiter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptPackage.TRANSFORMATION_PROGRAM__DELIMITER, null, msgs);
			if (newDelimiter != null)
				msgs = ((InternalEObject)newDelimiter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptPackage.TRANSFORMATION_PROGRAM__DELIMITER, null, msgs);
			msgs = basicSetDelimiter(newDelimiter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.TRANSFORMATION_PROGRAM__DELIMITER, newDelimiter, newDelimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TLStatement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<TLStatement>(TLStatement.class, this, SculptPackage.TRANSFORMATION_PROGRAM__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptPackage.TRANSFORMATION_PROGRAM__DELIMITER:
				return basicSetDelimiter(null, msgs);
			case SculptPackage.TRANSFORMATION_PROGRAM__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
			case SculptPackage.TRANSFORMATION_PROGRAM__DELIMITER:
				return getDelimiter();
			case SculptPackage.TRANSFORMATION_PROGRAM__STATEMENTS:
				return getStatements();
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
			case SculptPackage.TRANSFORMATION_PROGRAM__DELIMITER:
				setDelimiter((Delimiters)newValue);
				return;
			case SculptPackage.TRANSFORMATION_PROGRAM__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends TLStatement>)newValue);
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
			case SculptPackage.TRANSFORMATION_PROGRAM__DELIMITER:
				setDelimiter((Delimiters)null);
				return;
			case SculptPackage.TRANSFORMATION_PROGRAM__STATEMENTS:
				getStatements().clear();
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
			case SculptPackage.TRANSFORMATION_PROGRAM__DELIMITER:
				return delimiter != null;
			case SculptPackage.TRANSFORMATION_PROGRAM__STATEMENTS:
				return statements != null && !statements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String toString(){
		final StringBuilder s = new StringBuilder();
		if(getDelimiter() != null) {
			s.append(getDelimiter().toString());
		}
		s.append("\n\n");
		for(final TLStatement statement : statements){
			s.append(statement.toString());
			s.append('\n');
		}
		return s.toString();
	}

} //TransformationProgramImpl

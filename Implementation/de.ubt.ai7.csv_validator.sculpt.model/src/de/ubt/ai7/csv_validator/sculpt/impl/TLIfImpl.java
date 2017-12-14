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

import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.TLBoolExpr;
import de.ubt.ai7.csv_validator.sculpt.TLIf;
import de.ubt.ai7.csv_validator.sculpt.TLStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TL If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.TLIfImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.TLIfImpl#getIfBlock <em>If Block</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.TLIfImpl#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TLIfImpl extends TLStatementImpl implements TLIf {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected TLBoolExpr condition;

	/**
	 * The cached value of the '{@link #getIfBlock() <em>If Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<TLStatement> ifBlock;

	/**
	 * The cached value of the '{@link #getElseBlock() <em>Else Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<TLStatement> elseBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TLIfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.TL_IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLBoolExpr getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(TLBoolExpr newCondition, NotificationChain msgs) {
		TLBoolExpr oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptPackage.TL_IF__CONDITION, oldCondition, newCondition);
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
	public void setCondition(TLBoolExpr newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptPackage.TL_IF__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptPackage.TL_IF__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.TL_IF__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TLStatement> getIfBlock() {
		if (ifBlock == null) {
			ifBlock = new EObjectContainmentEList<TLStatement>(TLStatement.class, this, SculptPackage.TL_IF__IF_BLOCK);
		}
		return ifBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TLStatement> getElseBlock() {
		if (elseBlock == null) {
			elseBlock = new EObjectContainmentEList<TLStatement>(TLStatement.class, this, SculptPackage.TL_IF__ELSE_BLOCK);
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
			case SculptPackage.TL_IF__CONDITION:
				return basicSetCondition(null, msgs);
			case SculptPackage.TL_IF__IF_BLOCK:
				return ((InternalEList<?>)getIfBlock()).basicRemove(otherEnd, msgs);
			case SculptPackage.TL_IF__ELSE_BLOCK:
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
			case SculptPackage.TL_IF__CONDITION:
				return getCondition();
			case SculptPackage.TL_IF__IF_BLOCK:
				return getIfBlock();
			case SculptPackage.TL_IF__ELSE_BLOCK:
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
			case SculptPackage.TL_IF__CONDITION:
				setCondition((TLBoolExpr)newValue);
				return;
			case SculptPackage.TL_IF__IF_BLOCK:
				getIfBlock().clear();
				getIfBlock().addAll((Collection<? extends TLStatement>)newValue);
				return;
			case SculptPackage.TL_IF__ELSE_BLOCK:
				getElseBlock().clear();
				getElseBlock().addAll((Collection<? extends TLStatement>)newValue);
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
			case SculptPackage.TL_IF__CONDITION:
				setCondition((TLBoolExpr)null);
				return;
			case SculptPackage.TL_IF__IF_BLOCK:
				getIfBlock().clear();
				return;
			case SculptPackage.TL_IF__ELSE_BLOCK:
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
			case SculptPackage.TL_IF__CONDITION:
				return condition != null;
			case SculptPackage.TL_IF__IF_BLOCK:
				return ifBlock != null && !ifBlock.isEmpty();
			case SculptPackage.TL_IF__ELSE_BLOCK:
				return elseBlock != null && !elseBlock.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String toString(){
		if(this.eIsProxy()) {
			return super.toString();
		}

		final StringBuilder s = new StringBuilder("if (");
		s.append(condition.toString());
		s.append(") {\n");
		for(final TLStatement statement : getIfBlock()){
			final String statementString = statement.toString();
			s.append('\t');
			s.append(statementString.replace("\n", "\n\t"));
			s.append('\n');
		}
		s.append("}");

		if(!getElseBlock().isEmpty()){
			s.append(" else {\n");
			for(final TLStatement statement : getElseBlock()){
				final String statementString = statement.toString();
				s.append('\t');
				s.append(statementString.replace("\n", "\n\t"));
				s.append('\n');
			}
			s.append("}");
		}

		return s.toString();
	}

} //TLIfImpl

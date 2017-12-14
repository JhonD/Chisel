/**
 */
package de.ubt.ai7.csv_validator.sculpt.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai7.csv_validator.sculpt.NodeExpression;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.TLContentExpressionList;
import de.ubt.ai7.csv_validator.sculpt.TLLoop;
import de.ubt.ai7.csv_validator.sculpt.TLLoopMode;
import de.ubt.ai7.csv_validator.sculpt.TLStatement;
import de.ubt.ai7.csv_validator.sculpt.TLVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TL Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.TLLoopImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.TLLoopImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.TLLoopImpl#getContentExpression <em>Content Expression</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.TLLoopImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.TLLoopImpl#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TLLoopImpl extends TLStatementImpl implements TLLoop {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<TLVariable> variables;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected NodeExpression region;

	/**
	 * The cached value of the '{@link #getContentExpression() <em>Content Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentExpression()
	 * @generated
	 * @ordered
	 */
	protected TLContentExpressionList contentExpression;

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
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final TLLoopMode MODE_EDEFAULT = TLLoopMode.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected TLLoopMode mode = MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TLLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.TL_LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TLVariable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<TLVariable>(TLVariable.class, this, SculptPackage.TL_LOOP__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeExpression getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(final NodeExpression newRegion, NotificationChain msgs) {
		final NodeExpression oldRegion = region;
		region = newRegion;
		if (eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptPackage.TL_LOOP__REGION, oldRegion, newRegion);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegion(final NodeExpression newRegion) {
		if (newRegion != region) {
			NotificationChain msgs = null;
			if (region != null) {
				msgs = ((InternalEObject)region).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptPackage.TL_LOOP__REGION, null, msgs);
			}
			if (newRegion != null) {
				msgs = ((InternalEObject)newRegion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptPackage.TL_LOOP__REGION, null, msgs);
			}
			msgs = basicSetRegion(newRegion, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.TL_LOOP__REGION, newRegion, newRegion));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLContentExpressionList getContentExpression() {
		return contentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentExpression(final TLContentExpressionList newContentExpression, NotificationChain msgs) {
		final TLContentExpressionList oldContentExpression = contentExpression;
		contentExpression = newContentExpression;
		if (eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptPackage.TL_LOOP__CONTENT_EXPRESSION, oldContentExpression, newContentExpression);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentExpression(final TLContentExpressionList newContentExpression) {
		if (newContentExpression != contentExpression) {
			NotificationChain msgs = null;
			if (contentExpression != null) {
				msgs = ((InternalEObject)contentExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptPackage.TL_LOOP__CONTENT_EXPRESSION, null, msgs);
			}
			if (newContentExpression != null) {
				msgs = ((InternalEObject)newContentExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptPackage.TL_LOOP__CONTENT_EXPRESSION, null, msgs);
			}
			msgs = basicSetContentExpression(newContentExpression, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.TL_LOOP__CONTENT_EXPRESSION, newContentExpression, newContentExpression));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TLStatement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<TLStatement>(TLStatement.class, this, SculptPackage.TL_LOOP__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLLoopMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMode(final TLLoopMode newMode) {
		final TLLoopMode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.TL_LOOP__MODE, oldMode, mode));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
		switch (featureID) {
		case SculptPackage.TL_LOOP__VARIABLES:
			return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
		case SculptPackage.TL_LOOP__REGION:
			return basicSetRegion(null, msgs);
		case SculptPackage.TL_LOOP__CONTENT_EXPRESSION:
			return basicSetContentExpression(null, msgs);
		case SculptPackage.TL_LOOP__STATEMENTS:
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
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case SculptPackage.TL_LOOP__VARIABLES:
			return getVariables();
		case SculptPackage.TL_LOOP__REGION:
			return getRegion();
		case SculptPackage.TL_LOOP__CONTENT_EXPRESSION:
			return getContentExpression();
		case SculptPackage.TL_LOOP__STATEMENTS:
			return getStatements();
		case SculptPackage.TL_LOOP__MODE:
			return getMode();
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
		case SculptPackage.TL_LOOP__VARIABLES:
			getVariables().clear();
			getVariables().addAll((Collection<? extends TLVariable>)newValue);
			return;
		case SculptPackage.TL_LOOP__REGION:
			setRegion((NodeExpression)newValue);
			return;
		case SculptPackage.TL_LOOP__CONTENT_EXPRESSION:
			setContentExpression((TLContentExpressionList)newValue);
			return;
		case SculptPackage.TL_LOOP__STATEMENTS:
			getStatements().clear();
			getStatements().addAll((Collection<? extends TLStatement>)newValue);
			return;
		case SculptPackage.TL_LOOP__MODE:
			setMode((TLLoopMode)newValue);
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
		case SculptPackage.TL_LOOP__VARIABLES:
			getVariables().clear();
			return;
		case SculptPackage.TL_LOOP__REGION:
			setRegion((NodeExpression)null);
			return;
		case SculptPackage.TL_LOOP__CONTENT_EXPRESSION:
			setContentExpression((TLContentExpressionList)null);
			return;
		case SculptPackage.TL_LOOP__STATEMENTS:
			getStatements().clear();
			return;
		case SculptPackage.TL_LOOP__MODE:
			setMode(MODE_EDEFAULT);
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
		case SculptPackage.TL_LOOP__VARIABLES:
			return variables != null && !variables.isEmpty();
		case SculptPackage.TL_LOOP__REGION:
			return region != null;
		case SculptPackage.TL_LOOP__CONTENT_EXPRESSION:
			return contentExpression != null;
		case SculptPackage.TL_LOOP__STATEMENTS:
			return statements != null && !statements.isEmpty();
		case SculptPackage.TL_LOOP__MODE:
			return mode != MODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String toString(){
		final StringBuilder s = new StringBuilder("for each (");
		final Iterator<TLVariable> varIter = variables.iterator();
		s.append(varIter.next().toString());
		while(varIter.hasNext()){
			s.append(", ");
			s.append(varIter.next().toString());
		}
		s.append(") in ");
		s.append(region.toString());
		switch(getMode()){
		case COMPLETE:s.append(".is");
		break;
		case SPLIT: s.append(".split");
		break;
		default: break;
		}
		if(contentExpression != null && contentExpression.getList().size() > 0){
			s.append(contentExpression.toString());
		}
		s.append("{\n");
		for(final TLStatement statement : getStatements()){
			final String statementString = statement.toString();
			s.append('\t');
			s.append(statementString.replace("\n", "\n\t"));
			s.append('\n');
		}
		s.append("}");
		return s.toString();
	}

} //TLLoopImpl

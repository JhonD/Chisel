/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedToken;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedType;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage;
import de.ubt.ai7.csv_validator.sculpt.Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Cached
 * TL Variable Binding</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLVariableBindingImpl#getToken <em>Token</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLVariableBindingImpl#getPossibleTokens <em>Possible Tokens</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLVariableBindingImpl#isStrictType <em>Strict Type</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedTLVariableBindingImpl#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CachedTLVariableBindingImpl extends CachedAbstractTokenImpl implements CachedTLVariableBinding {
	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected CachedToken token;
	/**
	 * This is true if the Token reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tokenESet;
	/**
	 * The cached value of the '{@link #getPossibleTokens() <em>Possible
	 * Tokens</em>}' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see #getPossibleTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<CachedToken> possibleTokens;

	/**
	 * The default value of the '{@link #isStrictType() <em>Strict Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isStrictType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRICT_TYPE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isStrictType() <em>Strict Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isStrictType()
	 * @generated
	 * @ordered
	 */
	protected boolean strictType = STRICT_TYPE_EDEFAULT;
	/**
	 * This is true if the Strict Type attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	protected boolean strictTypeESet;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<String> contents;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedTLVariableBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return dataStructuresPackage.Literals.CACHED_TL_VARIABLE_BINDING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachedToken getToken() {
		if (token != null && token.eIsProxy()) {
			InternalEObject oldToken = (InternalEObject)token;
			token = (CachedToken)eResolveProxy(oldToken);
			if (token != oldToken) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__TOKEN, oldToken, token));
			}
		}
		return token;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CachedToken basicGetToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToken(CachedToken newToken) {
		CachedToken oldToken = token;
		token = newToken;
		boolean oldTokenESet = tokenESet;
		tokenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__TOKEN, oldToken, token, !oldTokenESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetToken() {
		CachedToken oldToken = token;
		boolean oldTokenESet = tokenESet;
		token = null;
		tokenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__TOKEN, oldToken, null, oldTokenESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetToken() {
		return tokenESet;
	}

	/**
	 * <!-- begin-user-doc --> from static content expression analysis each
	 * generated token transition (when building the automaton) creates an entry
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CachedToken> getPossibleTokens() {
		if (possibleTokens == null) {
			possibleTokens = new EObjectResolvingEList<CachedToken>(CachedToken.class, this, dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__POSSIBLE_TOKENS);
		}
		return possibleTokens;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStrictType() {
		return strictType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrictType(boolean newStrictType) {
		boolean oldStrictType = strictType;
		strictType = newStrictType;
		boolean oldStrictTypeESet = strictTypeESet;
		strictTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__STRICT_TYPE, oldStrictType, strictType, !oldStrictTypeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStrictType() {
		boolean oldStrictType = strictType;
		boolean oldStrictTypeESet = strictTypeESet;
		strictType = STRICT_TYPE_EDEFAULT;
		strictTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__STRICT_TYPE, oldStrictType, STRICT_TYPE_EDEFAULT, oldStrictTypeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStrictType() {
		return strictTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getContents() {
		if (contents == null) {
			contents = new EDataTypeEList.Unsettable<String>(String.class, this, dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetContents() {
		if (contents != null) ((InternalEList.Unsettable<?>)contents).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetContents() {
		return contents != null && ((InternalEList.Unsettable<?>)contents).isSet();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void reset() {
		getContents().clear();
		getRegion().clear();
		getUntestedRegion().clear();
		strictType = true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void add(final int coordinate, final String content, final CachedToken token) {
		getContents().add(content);
		if (strictType) {
			if (token == null) {
				strictType = false;
				setToken(null);
			} else if (getToken() == null) {
				setToken(token);
			} else if (!token.equals(getToken())) {
				strictType = false;
				setToken(null);
			}
		}

		getRegion().set(coordinate);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void setDefault() {
		getContents().clear();
		for (final CachedToken token : getPossibleTokens()){
			if (token != null && token instanceof CachedType){
				final Type type = (Type) ((CachedType) token).getSchemaElement();
				if(type.getDefaultValue() != null){
					getContents().add(type.getDefaultValue());
					setToken(token);
					setStrictType(true);
					return;
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__TOKEN:
				if (resolve) return getToken();
				return basicGetToken();
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__POSSIBLE_TOKENS:
				return getPossibleTokens();
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__STRICT_TYPE:
				return isStrictType();
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__CONTENTS:
				return getContents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__TOKEN:
				setToken((CachedToken)newValue);
				return;
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__POSSIBLE_TOKENS:
				getPossibleTokens().clear();
				getPossibleTokens().addAll((Collection<? extends CachedToken>)newValue);
				return;
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__STRICT_TYPE:
				setStrictType((Boolean)newValue);
				return;
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends String>)newValue);
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
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__TOKEN:
				unsetToken();
				return;
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__POSSIBLE_TOKENS:
				getPossibleTokens().clear();
				return;
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__STRICT_TYPE:
				unsetStrictType();
				return;
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__CONTENTS:
				unsetContents();
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
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__TOKEN:
				return isSetToken();
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__POSSIBLE_TOKENS:
				return possibleTokens != null && !possibleTokens.isEmpty();
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__STRICT_TYPE:
				return isSetStrictType();
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__CONTENTS:
				return isSetContents();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING___RESET:
				reset();
				return null;
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING___ADD__INT_STRING_CACHEDTOKEN:
				add((Integer)arguments.get(0), (String)arguments.get(1), (CachedToken)arguments.get(2));
				return null;
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING___SET_DEFAULT:
				setDefault();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (strictType: ");
		if (strictTypeESet) result.append(strictType); else result.append("<unset>");
		result.append(", contents: ");
		result.append(contents);
		result.append(')');
		return result.toString();
	}

} // CachedTLVariableBindingImpl

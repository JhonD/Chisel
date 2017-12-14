/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedAtomicType;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage;
import de.ubt.ai7.csv_validator.library.parser.Parser;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cached Atomic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedAtomicTypeImpl#getParser <em>Parser</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CachedAtomicTypeImpl extends CachedTypeImpl implements CachedAtomicType {
	/**
	 * The default value of the '{@link #getParser() <em>Parser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParser()
	 * @generated
	 * @ordered
	 */
	protected static final Parser PARSER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParser() <em>Parser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParser()
	 * @generated
	 * @ordered
	 */
	protected Parser parser = PARSER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedAtomicTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return dataStructuresPackage.Literals.CACHED_ATOMIC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parser getParser() {
		return parser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParser(Parser newParser) {
		Parser oldParser = parser;
		parser = newParser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_ATOMIC_TYPE__PARSER, oldParser, parser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_ATOMIC_TYPE__PARSER:
				return getParser();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_ATOMIC_TYPE__PARSER:
				setParser((Parser)newValue);
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
			case dataStructuresPackage.CACHED_ATOMIC_TYPE__PARSER:
				setParser(PARSER_EDEFAULT);
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
			case dataStructuresPackage.CACHED_ATOMIC_TYPE__PARSER:
				return PARSER_EDEFAULT == null ? parser != null : !PARSER_EDEFAULT.equals(parser);
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
		result.append(" (parser: ");
		result.append(parser);
		result.append(')');
		return result.toString();
	}

} //CachedAtomicTypeImpl

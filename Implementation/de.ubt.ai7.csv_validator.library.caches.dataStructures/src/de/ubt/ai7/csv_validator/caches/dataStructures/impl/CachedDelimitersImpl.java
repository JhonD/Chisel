/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedDelimiters;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cached Delimiters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedDelimitersImpl#getRowDelim <em>Row Delim</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedDelimitersImpl#getColDelim <em>Col Delim</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedDelimitersImpl#getListDelim <em>List Delim</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CachedDelimitersImpl extends CachedElementImpl implements CachedDelimiters {
	/**
	 * The default value of the '{@link #getRowDelim() <em>Row Delim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowDelim()
	 * @generated
	 * @ordered
	 */
	protected static final char ROW_DELIM_EDEFAULT = '\u0000';
	/**
	 * The cached value of the '{@link #getRowDelim() <em>Row Delim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowDelim()
	 * @generated
	 * @ordered
	 */
	protected char rowDelim = ROW_DELIM_EDEFAULT;
	/**
	 * The default value of the '{@link #getColDelim() <em>Col Delim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColDelim()
	 * @generated
	 * @ordered
	 */
	protected static final char COL_DELIM_EDEFAULT = '\u0000';
	/**
	 * The cached value of the '{@link #getColDelim() <em>Col Delim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColDelim()
	 * @generated
	 * @ordered
	 */
	protected char colDelim = COL_DELIM_EDEFAULT;
	/**
	 * The default value of the '{@link #getListDelim() <em>List Delim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListDelim()
	 * @generated
	 * @ordered
	 */
	protected static final char LIST_DELIM_EDEFAULT = '\u0000';
	/**
	 * The cached value of the '{@link #getListDelim() <em>List Delim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListDelim()
	 * @generated
	 * @ordered
	 */
	protected char listDelim = LIST_DELIM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedDelimitersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return dataStructuresPackage.Literals.CACHED_DELIMITERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public char getRowDelim() {
		return rowDelim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowDelim(char newRowDelim) {
		char oldRowDelim = rowDelim;
		rowDelim = newRowDelim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_DELIMITERS__ROW_DELIM, oldRowDelim, rowDelim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public char getColDelim() {
		return colDelim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColDelim(char newColDelim) {
		char oldColDelim = colDelim;
		colDelim = newColDelim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_DELIMITERS__COL_DELIM, oldColDelim, colDelim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public char getListDelim() {
		return listDelim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListDelim(char newListDelim) {
		char oldListDelim = listDelim;
		listDelim = newListDelim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_DELIMITERS__LIST_DELIM, oldListDelim, listDelim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_DELIMITERS__ROW_DELIM:
				return getRowDelim();
			case dataStructuresPackage.CACHED_DELIMITERS__COL_DELIM:
				return getColDelim();
			case dataStructuresPackage.CACHED_DELIMITERS__LIST_DELIM:
				return getListDelim();
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
			case dataStructuresPackage.CACHED_DELIMITERS__ROW_DELIM:
				setRowDelim((Character)newValue);
				return;
			case dataStructuresPackage.CACHED_DELIMITERS__COL_DELIM:
				setColDelim((Character)newValue);
				return;
			case dataStructuresPackage.CACHED_DELIMITERS__LIST_DELIM:
				setListDelim((Character)newValue);
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
			case dataStructuresPackage.CACHED_DELIMITERS__ROW_DELIM:
				setRowDelim(ROW_DELIM_EDEFAULT);
				return;
			case dataStructuresPackage.CACHED_DELIMITERS__COL_DELIM:
				setColDelim(COL_DELIM_EDEFAULT);
				return;
			case dataStructuresPackage.CACHED_DELIMITERS__LIST_DELIM:
				setListDelim(LIST_DELIM_EDEFAULT);
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
			case dataStructuresPackage.CACHED_DELIMITERS__ROW_DELIM:
				return rowDelim != ROW_DELIM_EDEFAULT;
			case dataStructuresPackage.CACHED_DELIMITERS__COL_DELIM:
				return colDelim != COL_DELIM_EDEFAULT;
			case dataStructuresPackage.CACHED_DELIMITERS__LIST_DELIM:
				return listDelim != LIST_DELIM_EDEFAULT;
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
		result.append(" (rowDelim: ");
		result.append(rowDelim);
		result.append(", colDelim: ");
		result.append(colDelim);
		result.append(", listDelim: ");
		result.append(listDelim);
		result.append(')');
		return result.toString();
	}

} //CachedDelimitersImpl

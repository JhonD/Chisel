/**
 */
package de.ubt.ai7.csv_validator.sculpt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai7.csv_validator.sculpt.Delimiters;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delimiters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.DelimitersImpl#getRowDelim <em>Row Delim</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.DelimitersImpl#getColDelim <em>Col Delim</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.DelimitersImpl#getListDelim <em>List Delim</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelimitersImpl extends SchemaElementImpl implements Delimiters {
	/**
	 * The default value of the '{@link #getRowDelim() <em>Row Delim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowDelim()
	 * @generated
	 * @ordered
	 */
	protected static final String ROW_DELIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowDelim() <em>Row Delim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowDelim()
	 * @generated
	 * @ordered
	 */
	protected String rowDelim = ROW_DELIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getColDelim() <em>Col Delim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColDelim()
	 * @generated
	 * @ordered
	 */
	protected static final String COL_DELIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColDelim() <em>Col Delim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColDelim()
	 * @generated
	 * @ordered
	 */
	protected String colDelim = COL_DELIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getListDelim() <em>List Delim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListDelim()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_DELIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListDelim() <em>List Delim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListDelim()
	 * @generated
	 * @ordered
	 */
	protected String listDelim = LIST_DELIM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelimitersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.DELIMITERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRowDelim() {
		return rowDelim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowDelim(String newRowDelim) {
		String oldRowDelim = rowDelim;
		rowDelim = newRowDelim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.DELIMITERS__ROW_DELIM, oldRowDelim, rowDelim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColDelim() {
		return colDelim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColDelim(String newColDelim) {
		String oldColDelim = colDelim;
		colDelim = newColDelim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.DELIMITERS__COL_DELIM, oldColDelim, colDelim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getListDelim() {
		return listDelim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListDelim(String newListDelim) {
		String oldListDelim = listDelim;
		listDelim = newListDelim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.DELIMITERS__LIST_DELIM, oldListDelim, listDelim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptPackage.DELIMITERS__ROW_DELIM:
				return getRowDelim();
			case SculptPackage.DELIMITERS__COL_DELIM:
				return getColDelim();
			case SculptPackage.DELIMITERS__LIST_DELIM:
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
			case SculptPackage.DELIMITERS__ROW_DELIM:
				setRowDelim((String)newValue);
				return;
			case SculptPackage.DELIMITERS__COL_DELIM:
				setColDelim((String)newValue);
				return;
			case SculptPackage.DELIMITERS__LIST_DELIM:
				setListDelim((String)newValue);
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
			case SculptPackage.DELIMITERS__ROW_DELIM:
				setRowDelim(ROW_DELIM_EDEFAULT);
				return;
			case SculptPackage.DELIMITERS__COL_DELIM:
				setColDelim(COL_DELIM_EDEFAULT);
				return;
			case SculptPackage.DELIMITERS__LIST_DELIM:
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
			case SculptPackage.DELIMITERS__ROW_DELIM:
				return ROW_DELIM_EDEFAULT == null ? rowDelim != null : !ROW_DELIM_EDEFAULT.equals(rowDelim);
			case SculptPackage.DELIMITERS__COL_DELIM:
				return COL_DELIM_EDEFAULT == null ? colDelim != null : !COL_DELIM_EDEFAULT.equals(colDelim);
			case SculptPackage.DELIMITERS__LIST_DELIM:
				return LIST_DELIM_EDEFAULT == null ? listDelim != null : !LIST_DELIM_EDEFAULT.equals(listDelim);
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
		if (eIsProxy()) {
			return super.toString();
		}

		final StringBuffer result = new StringBuffer("row delim = '");
		result.append(rowDelim);
		result.append("'\ncol delim = '");
		result.append(colDelim);

		if(getListDelim() != null){
			result.append("'\nlist delim = '");
			result.append(listDelim);
		}

		return result.toString();
	}

} //DelimitersImpl

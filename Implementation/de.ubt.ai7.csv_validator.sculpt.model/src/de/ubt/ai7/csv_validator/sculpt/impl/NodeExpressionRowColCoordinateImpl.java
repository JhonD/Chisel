/**
 */
package de.ubt.ai7.csv_validator.sculpt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColCoordinate;
import de.ubt.ai7.csv_validator.sculpt.RowCol;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Node
 * Expression Row Col Coordinate</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColCoordinateImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColCoordinateImpl#getRow <em>Row</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.impl.NodeExpressionRowColCoordinateImpl#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeExpressionRowColCoordinateImpl extends NodeExpressionRowColImpl
implements NodeExpressionRowColCoordinate {
	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected int row = ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected int column = COLUMN_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeExpressionRowColCoordinateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.NODE_EXPRESSION_ROW_COL_COORDINATE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void setIndex(final int newIndex) {
		final int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					SculptPackage.NODE_EXPRESSION_ROW_COL_COORDINATE__INDEX, oldIndex, index));
		}
		if (getMode() == RowCol.ROW) {
			setRow(newIndex);
		}
		if (getMode() == RowCol.COL) {
			setColumn(newIndex);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRow(int newRow) {
		int oldRow = row;
		row = newRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.NODE_EXPRESSION_ROW_COL_COORDINATE__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumn(int newColumn) {
		int oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptPackage.NODE_EXPRESSION_ROW_COL_COORDINATE__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptPackage.NODE_EXPRESSION_ROW_COL_COORDINATE__INDEX:
				return getIndex();
			case SculptPackage.NODE_EXPRESSION_ROW_COL_COORDINATE__ROW:
				return getRow();
			case SculptPackage.NODE_EXPRESSION_ROW_COL_COORDINATE__COLUMN:
				return getColumn();
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
			case SculptPackage.NODE_EXPRESSION_ROW_COL_COORDINATE__INDEX:
				setIndex((Integer)newValue);
				return;
			case SculptPackage.NODE_EXPRESSION_ROW_COL_COORDINATE__ROW:
				setRow((Integer)newValue);
				return;
			case SculptPackage.NODE_EXPRESSION_ROW_COL_COORDINATE__COLUMN:
				setColumn((Integer)newValue);
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
			case SculptPackage.NODE_EXPRESSION_ROW_COL_COORDINATE__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case SculptPackage.NODE_EXPRESSION_ROW_COL_COORDINATE__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case SculptPackage.NODE_EXPRESSION_ROW_COL_COORDINATE__COLUMN:
				setColumn(COLUMN_EDEFAULT);
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
			case SculptPackage.NODE_EXPRESSION_ROW_COL_COORDINATE__INDEX:
				return index != INDEX_EDEFAULT;
			case SculptPackage.NODE_EXPRESSION_ROW_COL_COORDINATE__ROW:
				return row != ROW_EDEFAULT;
			case SculptPackage.NODE_EXPRESSION_ROW_COL_COORDINATE__COLUMN:
				return column != COLUMN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		final StringBuffer result = new StringBuffer(super.toString());
		result.append("(");
		result.append(row);
		result.append(",");
		result.append(column);
		result.append(')');
		return result.toString();
	}

} // NodeExpressionRowColCoordinateImpl

/**
 */
package de.ubt.ai7.csv_validator.sculpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Expression Row Col</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowCol#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getNodeExpressionRowCol()
 * @model
 * @generated
 */
public interface NodeExpressionRowCol extends NodeExpressionPrimitive {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.ubt.ai7.csv_validator.sculpt.RowCol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see de.ubt.ai7.csv_validator.sculpt.RowCol
	 * @see #setMode(RowCol)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getNodeExpressionRowCol_Mode()
	 * @model required="true"
	 * @generated
	 */
	RowCol getMode();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowCol#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see de.ubt.ai7.csv_validator.sculpt.RowCol
	 * @see #getMode()
	 * @generated
	 */
	void setMode(RowCol value);

} // NodeExpressionRowCol

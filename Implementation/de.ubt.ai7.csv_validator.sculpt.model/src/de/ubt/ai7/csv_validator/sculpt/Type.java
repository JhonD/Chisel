/**
 */
package de.ubt.ai7.csv_validator.sculpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.Type#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.Type#getEmptyValue <em>Empty Value</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getType()
 * @model
 * @generated
 */
public interface Type extends Token {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getType_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.Type#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Empty Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empty Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty Value</em>' attribute.
	 * @see #setEmptyValue(String)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getType_EmptyValue()
	 * @model
	 * @generated
	 */
	String getEmptyValue();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.Type#getEmptyValue <em>Empty Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty Value</em>' attribute.
	 * @see #getEmptyValue()
	 * @generated
	 */
	void setEmptyValue(String value);

} // Type

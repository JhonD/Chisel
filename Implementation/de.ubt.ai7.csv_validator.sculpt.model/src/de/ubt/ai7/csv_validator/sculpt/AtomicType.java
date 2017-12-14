/**
 */
package de.ubt.ai7.csv_validator.sculpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getFormat <em>Format</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getBase <em>Base</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getGroupChar <em>Group Char</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getDecimalChar <em>Decimal Char</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getAtomicType()
 * @model
 * @generated
 */
public interface AtomicType extends Type {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getAtomicType_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #setMinLength(Integer)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getAtomicType_MinLength()
	 * @model
	 * @generated
	 */
	Integer getMinLength();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(Integer)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getAtomicType_MaxLength()
	 * @model
	 * @generated
	 */
	Integer getMaxLength();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(String)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getAtomicType_Base()
	 * @model required="true"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Group Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Char</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Char</em>' attribute.
	 * @see #setGroupChar(String)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getAtomicType_GroupChar()
	 * @model
	 * @generated
	 */
	String getGroupChar();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getGroupChar <em>Group Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Char</em>' attribute.
	 * @see #getGroupChar()
	 * @generated
	 */
	void setGroupChar(String value);

	/**
	 * Returns the value of the '<em><b>Decimal Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Char</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Char</em>' attribute.
	 * @see #setDecimalChar(String)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getAtomicType_DecimalChar()
	 * @model
	 * @generated
	 */
	String getDecimalChar();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getDecimalChar <em>Decimal Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Char</em>' attribute.
	 * @see #getDecimalChar()
	 * @generated
	 */
	void setDecimalChar(String value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(String)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getAtomicType_Minimum()
	 * @model
	 * @generated
	 */
	String getMinimum();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(String value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(String)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getAtomicType_Maximum()
	 * @model
	 * @generated
	 */
	String getMaximum();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(String value);

	/**
	 * Returns the value of the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Exclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Exclusive</em>' attribute.
	 * @see #setMinExclusive(String)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getAtomicType_MinExclusive()
	 * @model
	 * @generated
	 */
	String getMinExclusive();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getMinExclusive <em>Min Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Exclusive</em>' attribute.
	 * @see #getMinExclusive()
	 * @generated
	 */
	void setMinExclusive(String value);

	/**
	 * Returns the value of the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Exclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Exclusive</em>' attribute.
	 * @see #setMaxExclusive(String)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getAtomicType_MaxExclusive()
	 * @model
	 * @generated
	 */
	String getMaxExclusive();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getMaxExclusive <em>Max Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Exclusive</em>' attribute.
	 * @see #getMaxExclusive()
	 * @generated
	 */
	void setMaxExclusive(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(Integer)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getAtomicType_Length()
	 * @model
	 * @generated
	 */
	Integer getLength();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(Integer value);

} // AtomicType

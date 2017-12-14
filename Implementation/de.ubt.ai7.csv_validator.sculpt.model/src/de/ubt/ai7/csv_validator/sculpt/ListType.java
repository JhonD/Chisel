/**
 */
package de.ubt.ai7.csv_validator.sculpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.ListType#getSeparator <em>Separator</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.ListType#getMinElements <em>Min Elements</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.ListType#getMaxElements <em>Max Elements</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.ListType#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getListType()
 * @model
 * @generated
 */
public interface ListType extends Type {
	/**
	 * Returns the value of the '<em><b>Separator</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Separator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separator</em>' attribute.
	 * @see #setSeparator(String)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getListType_Separator()
	 * @model default=" "
	 * @generated
	 */
	String getSeparator();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.ListType#getSeparator <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator</em>' attribute.
	 * @see #getSeparator()
	 * @generated
	 */
	void setSeparator(String value);

	/**
	 * Returns the value of the '<em><b>Min Elements</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Elements</em>' attribute.
	 * @see #setMinElements(Integer)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getListType_MinElements()
	 * @model default="0"
	 * @generated
	 */
	Integer getMinElements();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.ListType#getMinElements <em>Min Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Elements</em>' attribute.
	 * @see #getMinElements()
	 * @generated
	 */
	void setMinElements(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Elements</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Elements</em>' attribute.
	 * @see #setMaxElements(Integer)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getListType_MaxElements()
	 * @model default="-1"
	 * @generated
	 */
	Integer getMaxElements();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.ListType#getMaxElements <em>Max Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Elements</em>' attribute.
	 * @see #getMaxElements()
	 * @generated
	 */
	void setMaxElements(Integer value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(Type)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getListType_Base()
	 * @model required="true"
	 * @generated
	 */
	Type getBase();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.ListType#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Type value);

} // ListType

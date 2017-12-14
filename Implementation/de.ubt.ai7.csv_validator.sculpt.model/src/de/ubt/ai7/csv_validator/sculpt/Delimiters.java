/**
 */
package de.ubt.ai7.csv_validator.sculpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delimiters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.Delimiters#getRowDelim <em>Row Delim</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.Delimiters#getColDelim <em>Col Delim</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.Delimiters#getListDelim <em>List Delim</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getDelimiters()
 * @model
 * @generated
 */
public interface Delimiters extends SchemaElement {
	/**
	 * Returns the value of the '<em><b>Row Delim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Delim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Delim</em>' attribute.
	 * @see #setRowDelim(String)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getDelimiters_RowDelim()
	 * @model required="true"
	 * @generated
	 */
	String getRowDelim();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.Delimiters#getRowDelim <em>Row Delim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Delim</em>' attribute.
	 * @see #getRowDelim()
	 * @generated
	 */
	void setRowDelim(String value);

	/**
	 * Returns the value of the '<em><b>Col Delim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Delim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Delim</em>' attribute.
	 * @see #setColDelim(String)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getDelimiters_ColDelim()
	 * @model required="true"
	 * @generated
	 */
	String getColDelim();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.Delimiters#getColDelim <em>Col Delim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Delim</em>' attribute.
	 * @see #getColDelim()
	 * @generated
	 */
	void setColDelim(String value);

	/**
	 * Returns the value of the '<em><b>List Delim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Delim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Delim</em>' attribute.
	 * @see #setListDelim(String)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getDelimiters_ListDelim()
	 * @model
	 * @generated
	 */
	String getListDelim();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.Delimiters#getListDelim <em>List Delim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Delim</em>' attribute.
	 * @see #getListDelim()
	 * @generated
	 */
	void setListDelim(String value);

} // Delimiters

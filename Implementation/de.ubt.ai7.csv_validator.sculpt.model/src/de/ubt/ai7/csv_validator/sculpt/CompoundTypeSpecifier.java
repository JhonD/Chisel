/**
 */
package de.ubt.ai7.csv_validator.sculpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Type Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.CompoundTypeSpecifier#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.CompoundTypeSpecifier#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getCompoundTypeSpecifier()
 * @model
 * @generated
 */
public interface CompoundTypeSpecifier extends TypeSpecifier {
	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' reference.
	 * @see #setSubtype(Type)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getCompoundTypeSpecifier_Subtype()
	 * @model required="true"
	 * @generated
	 */
	Type getSubtype();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.CompoundTypeSpecifier#getSubtype <em>Subtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype</em>' reference.
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(Type value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getCompoundTypeSpecifier_Index()
	 * @model default="0"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.CompoundTypeSpecifier#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

} // CompoundTypeSpecifier

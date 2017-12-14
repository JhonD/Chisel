/**
 */
package de.ubt.ai7.csv_validator.sculpt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TL Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.TLSpecifier#getToken <em>Token</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.TLSpecifier#getMult <em>Mult</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLSpecifier()
 * @model
 * @generated
 */
public interface TLSpecifier extends SchemaElement {
	/**
	 * Returns the value of the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' reference.
	 * @see #setToken(Token)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLSpecifier_Token()
	 * @model required="true"
	 * @generated
	 */
	Token getToken();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.TLSpecifier#getToken <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(Token value);

	/**
	 * Returns the value of the '<em><b>Mult</b></em>' attribute.
	 * The literals are from the enumeration {@link de.ubt.ai7.csv_validator.sculpt.TLSpecifierMultiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mult</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult</em>' attribute.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLSpecifierMultiplicity
	 * @see #setMult(TLSpecifierMultiplicity)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLSpecifier_Mult()
	 * @model required="true"
	 * @generated
	 */
	TLSpecifierMultiplicity getMult();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.TLSpecifier#getMult <em>Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult</em>' attribute.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLSpecifierMultiplicity
	 * @see #getMult()
	 * @generated
	 */
	void setMult(TLSpecifierMultiplicity value);

} // TLSpecifier

/**
 */
package de.ubt.ai7.csv_validator.sculpt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TL Output Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.TLOutputVariable#getVariable <em>Variable</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.TLOutputVariable#getTypeSpecifier <em>Type Specifier</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLOutputVariable()
 * @model
 * @generated
 */
public interface TLOutputVariable extends TLOutputPrimitive {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(TLVariable)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLOutputVariable_Variable()
	 * @model required="true"
	 * @generated
	 */
	TLVariable getVariable();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.TLOutputVariable#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(TLVariable value);

	/**
	 * Returns the value of the '<em><b>Type Specifier</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.sculpt.TypeSpecifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Specifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Specifier</em>' containment reference list.
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLOutputVariable_TypeSpecifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeSpecifier> getTypeSpecifier();

} // TLOutputVariable

/**
 */
package de.ubt.ai7.csv_validator.sculpt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.Bool_Expression#getComp <em>Comp</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.Bool_Expression#getValue <em>Value</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.Bool_Expression#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getBool_Expression()
 * @model
 * @generated
 */
public interface Bool_Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Comp</b></em>' attribute.
	 * The literals are from the enumeration {@link de.ubt.ai7.csv_validator.sculpt.Comparator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp</em>' attribute.
	 * @see de.ubt.ai7.csv_validator.sculpt.Comparator
	 * @see #setComp(Comparator)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getBool_Expression_Comp()
	 * @model required="true"
	 * @generated
	 */
	Comparator getComp();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.Bool_Expression#getComp <em>Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp</em>' attribute.
	 * @see de.ubt.ai7.csv_validator.sculpt.Comparator
	 * @see #getComp()
	 * @generated
	 */
	void setComp(Comparator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getBool_Expression_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.Bool_Expression#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getBool_Expression_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.Bool_Expression#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Bool_Expression

/**
 */
package de.ubt.ai7.csv_validator.sculpt;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Expression Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison#getComp <em>Comp</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison#getValue <em>Value</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison#getType <em>Type</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison#getTypeSpecifier <em>Type Specifier</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getNodeExpressionComparison()
 * @model
 * @generated
 */
public interface NodeExpressionComparison extends NodeExpression {
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
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getNodeExpressionComparison_Comp()
	 * @model required="true"
	 * @generated
	 */
	Comparator getComp();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison#getComp <em>Comp</em>}' attribute.
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
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getNodeExpressionComparison_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison#getValue <em>Value</em>}' attribute.
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
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getNodeExpressionComparison_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Type Specifier</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.sculpt.TypeSpecifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Specifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Specifier</em>' containment reference list.
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getNodeExpressionComparison_TypeSpecifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeSpecifier> getTypeSpecifier();

} // NodeExpressionComparison

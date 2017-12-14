/**
 */
package de.ubt.ai7.csv_validator.sculpt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.TransformationProgram#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.TransformationProgram#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTransformationProgram()
 * @model
 * @generated
 */
public interface TransformationProgram extends SchemaElement {
	/**
	 * Returns the value of the '<em><b>Delimiter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimiter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimiter</em>' containment reference.
	 * @see #setDelimiter(Delimiters)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTransformationProgram_Delimiter()
	 * @model containment="true"
	 * @generated
	 */
	Delimiters getDelimiter();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.TransformationProgram#getDelimiter <em>Delimiter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimiter</em>' containment reference.
	 * @see #getDelimiter()
	 * @generated
	 */
	void setDelimiter(Delimiters value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.sculpt.TLStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTransformationProgram_Statements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TLStatement> getStatements();

} // TransformationProgram

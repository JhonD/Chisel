/**
 */
package de.ubt.ai7.csv_validator.sculpt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sculpt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.Sculpt#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.Sculpt#getTokens <em>Tokens</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.Sculpt#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.Sculpt#getRegionTokens <em>Region Tokens</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.Sculpt#getTypes <em>Types</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.Sculpt#getTransformationProgram <em>Transformation Program</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getSculpt()
 * @model
 * @generated
 */
public interface Sculpt extends EObject {
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
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getSculpt_Delimiter()
	 * @model containment="true"
	 * @generated
	 */
	Delimiters getDelimiter();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.Sculpt#getDelimiter <em>Delimiter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimiter</em>' containment reference.
	 * @see #getDelimiter()
	 * @generated
	 */
	void setDelimiter(Delimiters value);

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.sculpt.Token}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getSculpt_Tokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Token> getTokens();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.sculpt.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getSculpt_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Region Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.sculpt.RegionToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Tokens</em>' containment reference list.
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getSculpt_RegionTokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<RegionToken> getRegionTokens();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.sculpt.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getSculpt_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Transformation Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Program</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Program</em>' containment reference.
	 * @see #setTransformationProgram(TransformationProgram)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getSculpt_TransformationProgram()
	 * @model containment="true"
	 * @generated
	 */
	TransformationProgram getTransformationProgram();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.Sculpt#getTransformationProgram <em>Transformation Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Program</em>' containment reference.
	 * @see #getTransformationProgram()
	 * @generated
	 */
	void setTransformationProgram(TransformationProgram value);

} // Sculpt

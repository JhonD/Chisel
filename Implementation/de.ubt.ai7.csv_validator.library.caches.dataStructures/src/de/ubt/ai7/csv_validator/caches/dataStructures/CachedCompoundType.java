/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures;

import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cached Compound Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedCompoundType#getPrimitives <em>Primitives</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedCompoundType#getCapturingPattern <em>Capturing Pattern</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedCompoundType()
 * @model
 * @generated
 */
public interface CachedCompoundType extends CachedType {
	/**
	 * Returns the value of the '<em><b>Primitives</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitives</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitives</em>' reference list.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedCompoundType_Primitives()
	 * @model
	 * @generated NOT
	 */
	ArrayList<CachedType> getPrimitives();

	/**
	 * Returns the value of the '<em><b>Capturing Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capturing Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capturing Pattern</em>' attribute.
	 * @see #setCapturingPattern(Pattern)
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedCompoundType_CapturingPattern()
	 * @model dataType="de.ubt.ai7.csv_validator.caches.dataStructures.Pattern" required="true" transient="true"
	 * @generated
	 */
	Pattern getCapturingPattern();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedCompoundType#getCapturingPattern <em>Capturing Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capturing Pattern</em>' attribute.
	 * @see #getCapturingPattern()
	 * @generated
	 */
	void setCapturingPattern(Pattern value);

} // CachedCompoundType

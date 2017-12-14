/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cached TL Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutput#getPrimitives <em>Primitives</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTLOutput()
 * @model
 * @generated
 */
public interface CachedTLOutput extends CachedTLStatement {
	/**
	 * Returns the value of the '<em><b>Primitives</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitives</em>' reference list.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTLOutput_Primitives()
	 * @model
	 * @generated
	 */
	EList<CachedTLPrimitive> getPrimitives();

} // CachedTLOutput

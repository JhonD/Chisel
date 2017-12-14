/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cached TL If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLIf#getIfBlock <em>If Block</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLIf#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTLIf()
 * @model
 * @generated
 */
public interface CachedTLIf extends CachedTLStatement {
	/**
	 * Returns the value of the '<em><b>If Block</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Block</em>' containment reference list.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTLIf_IfBlock()
	 * @model containment="true"
	 * @generated
	 */
	EList<CachedTLStatement> getIfBlock();

	/**
	 * Returns the value of the '<em><b>Else Block</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Block</em>' containment reference list.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedTLIf_ElseBlock()
	 * @model containment="true"
	 * @generated
	 */
	EList<CachedTLStatement> getElseBlock();

} // CachedTLIf

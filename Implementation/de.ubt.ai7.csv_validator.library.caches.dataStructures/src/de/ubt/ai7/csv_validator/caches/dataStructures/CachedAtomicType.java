/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures;

import de.ubt.ai7.csv_validator.library.parser.Parser;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cached Atomic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedAtomicType#getParser <em>Parser</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedAtomicType()
 * @model
 * @generated
 */
public interface CachedAtomicType extends CachedType {
	/**
	 * Returns the value of the '<em><b>Parser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parser</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parser</em>' attribute.
	 * @see #setParser(Parser)
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedAtomicType_Parser()
	 * @model dataType="de.ubt.ai7.csv_validator.caches.dataStructures.Parser" required="true"
	 * @generated
	 */
	Parser getParser();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedAtomicType#getParser <em>Parser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parser</em>' attribute.
	 * @see #getParser()
	 * @generated
	 */
	void setParser(Parser value);

} // CachedAtomicType

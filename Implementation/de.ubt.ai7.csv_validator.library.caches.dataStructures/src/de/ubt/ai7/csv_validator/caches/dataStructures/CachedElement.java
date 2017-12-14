/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures;

import de.ubt.ai7.csv_validator.sculpt.SchemaElement;
import java.util.BitSet;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cached Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getContains <em>Contains</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getContainedIn <em>Contained In</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getDefinition <em>Definition</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getSchemaElement <em>Schema Element</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getUntestedRegion <em>Untested Region</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedElement()
 * @model
 * @generated
 */
public interface CachedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getContainedIn <em>Contained In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedElement_Contains()
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getContainedIn
	 * @model opposite="containedIn"
	 * @generated
	 */
	EList<CachedElement> getContains();

	/**
	 * Returns the value of the '<em><b>Contained In</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained In</em>' reference list.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedElement_ContainedIn()
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getContains
	 * @model opposite="contains"
	 * @generated
	 */
	EList<CachedElement> getContainedIn();

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(BitSet)
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedElement_Region()
	 * @model dataType="de.ubt.ai7.csv_validator.caches.dataStructures.BitSet" required="true"
	 * @generated
	 */
	BitSet getRegion();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(BitSet value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' attribute.
	 * @see #setDefinition(String)
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedElement_Definition()
	 * @model required="true"
	 * @generated
	 */
	String getDefinition();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getDefinition <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' attribute.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Schema Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Element</em>' attribute.
	 * @see #setSchemaElement(SchemaElement)
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedElement_SchemaElement()
	 * @model dataType="de.ubt.ai7.csv_validator.caches.dataStructures.SchemaElement"
	 * @generated
	 */
	SchemaElement getSchemaElement();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getSchemaElement <em>Schema Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Element</em>' attribute.
	 * @see #getSchemaElement()
	 * @generated
	 */
	void setSchemaElement(SchemaElement value);

	/**
	 * Returns the value of the '<em><b>Untested Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Untested Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Untested Region</em>' attribute.
	 * @see #setUntestedRegion(BitSet)
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage#getCachedElement_UntestedRegion()
	 * @model dataType="de.ubt.ai7.csv_validator.caches.dataStructures.BitSet" required="true"
	 * @generated
	 */
	BitSet getUntestedRegion();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement#getUntestedRegion <em>Untested Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Untested Region</em>' attribute.
	 * @see #getUntestedRegion()
	 * @generated
	 */
	void setUntestedRegion(BitSet value);

} // CachedElement

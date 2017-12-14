/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.impl;

import java.util.BitSet;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage;
import de.ubt.ai7.csv_validator.sculpt.SchemaElement;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cached Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedElementImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedElementImpl#getContainedIn <em>Contained In</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedElementImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedElementImpl#getSchemaElement <em>Schema Element</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedElementImpl#getUntestedRegion <em>Untested Region</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.caches.dataStructures.impl.CachedElementImpl#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CachedElementImpl extends MinimalEObjectImpl.Container implements CachedElement {
	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<CachedElement> contains;

	/**
	 * The cached value of the '{@link #getContainedIn() <em>Contained In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<CachedElement> containedIn;

	/**
	 * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected String definition = DEFINITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemaElement() <em>Schema Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaElement()
	 * @generated
	 * @ordered
	 */
	protected static final SchemaElement SCHEMA_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaElement() <em>Schema Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaElement()
	 * @generated
	 * @ordered
	 */
	protected SchemaElement schemaElement = SCHEMA_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUntestedRegion() <em>Untested Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntestedRegion()
	 * @generated
	 * @ordered
	 */
	protected static final BitSet UNTESTED_REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUntestedRegion() <em>Untested Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntestedRegion()
	 * @generated
	 * @ordered
	 */
	protected BitSet untestedRegion = UNTESTED_REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final BitSet REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected BitSet region = REGION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return dataStructuresPackage.Literals.CACHED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CachedElement> getContains() {
		if (contains == null) {
			contains = new EObjectWithInverseResolvingEList.ManyInverse<CachedElement>(CachedElement.class, this, dataStructuresPackage.CACHED_ELEMENT__CONTAINS, dataStructuresPackage.CACHED_ELEMENT__CONTAINED_IN);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CachedElement> getContainedIn() {
		if (containedIn == null) {
			containedIn = new EObjectWithInverseResolvingEList.ManyInverse<CachedElement>(CachedElement.class, this, dataStructuresPackage.CACHED_ELEMENT__CONTAINED_IN, dataStructuresPackage.CACHED_ELEMENT__CONTAINS);
		}
		return containedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BitSet getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegion(BitSet newRegion) {
		BitSet oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_ELEMENT__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinition(String newDefinition) {
		String oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_ELEMENT__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaElement getSchemaElement() {
		return schemaElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaElement(SchemaElement newSchemaElement) {
		SchemaElement oldSchemaElement = schemaElement;
		schemaElement = newSchemaElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_ELEMENT__SCHEMA_ELEMENT, oldSchemaElement, schemaElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BitSet getUntestedRegion() {
		return untestedRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUntestedRegion(BitSet newUntestedRegion) {
		BitSet oldUntestedRegion = untestedRegion;
		untestedRegion = newUntestedRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dataStructuresPackage.CACHED_ELEMENT__UNTESTED_REGION, oldUntestedRegion, untestedRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_ELEMENT__CONTAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains()).basicAdd(otherEnd, msgs);
			case dataStructuresPackage.CACHED_ELEMENT__CONTAINED_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedIn()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_ELEMENT__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case dataStructuresPackage.CACHED_ELEMENT__CONTAINED_IN:
				return ((InternalEList<?>)getContainedIn()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_ELEMENT__CONTAINS:
				return getContains();
			case dataStructuresPackage.CACHED_ELEMENT__CONTAINED_IN:
				return getContainedIn();
			case dataStructuresPackage.CACHED_ELEMENT__DEFINITION:
				return getDefinition();
			case dataStructuresPackage.CACHED_ELEMENT__SCHEMA_ELEMENT:
				return getSchemaElement();
			case dataStructuresPackage.CACHED_ELEMENT__UNTESTED_REGION:
				return getUntestedRegion();
			case dataStructuresPackage.CACHED_ELEMENT__REGION:
				return getRegion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_ELEMENT__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends CachedElement>)newValue);
				return;
			case dataStructuresPackage.CACHED_ELEMENT__CONTAINED_IN:
				getContainedIn().clear();
				getContainedIn().addAll((Collection<? extends CachedElement>)newValue);
				return;
			case dataStructuresPackage.CACHED_ELEMENT__DEFINITION:
				setDefinition((String)newValue);
				return;
			case dataStructuresPackage.CACHED_ELEMENT__SCHEMA_ELEMENT:
				setSchemaElement((SchemaElement)newValue);
				return;
			case dataStructuresPackage.CACHED_ELEMENT__UNTESTED_REGION:
				setUntestedRegion((BitSet)newValue);
				return;
			case dataStructuresPackage.CACHED_ELEMENT__REGION:
				setRegion((BitSet)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_ELEMENT__CONTAINS:
				getContains().clear();
				return;
			case dataStructuresPackage.CACHED_ELEMENT__CONTAINED_IN:
				getContainedIn().clear();
				return;
			case dataStructuresPackage.CACHED_ELEMENT__DEFINITION:
				setDefinition(DEFINITION_EDEFAULT);
				return;
			case dataStructuresPackage.CACHED_ELEMENT__SCHEMA_ELEMENT:
				setSchemaElement(SCHEMA_ELEMENT_EDEFAULT);
				return;
			case dataStructuresPackage.CACHED_ELEMENT__UNTESTED_REGION:
				setUntestedRegion(UNTESTED_REGION_EDEFAULT);
				return;
			case dataStructuresPackage.CACHED_ELEMENT__REGION:
				setRegion(REGION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case dataStructuresPackage.CACHED_ELEMENT__CONTAINS:
				return contains != null && !contains.isEmpty();
			case dataStructuresPackage.CACHED_ELEMENT__CONTAINED_IN:
				return containedIn != null && !containedIn.isEmpty();
			case dataStructuresPackage.CACHED_ELEMENT__DEFINITION:
				return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
			case dataStructuresPackage.CACHED_ELEMENT__SCHEMA_ELEMENT:
				return SCHEMA_ELEMENT_EDEFAULT == null ? schemaElement != null : !SCHEMA_ELEMENT_EDEFAULT.equals(schemaElement);
			case dataStructuresPackage.CACHED_ELEMENT__UNTESTED_REGION:
				return UNTESTED_REGION_EDEFAULT == null ? untestedRegion != null : !UNTESTED_REGION_EDEFAULT.equals(untestedRegion);
			case dataStructuresPackage.CACHED_ELEMENT__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (definition: ");
		result.append(definition);
		result.append(", schemaElement: ");
		result.append(schemaElement);
		result.append(", untestedRegion: ");
		result.append(untestedRegion);
		result.append(", region: ");
		result.append(region);
		result.append(')');
		return result.toString();
	}

} //CachedElementImpl

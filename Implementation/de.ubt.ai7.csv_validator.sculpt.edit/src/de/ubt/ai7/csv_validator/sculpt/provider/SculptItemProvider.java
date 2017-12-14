/**
 */
package de.ubt.ai7.csv_validator.sculpt.provider;


import de.ubt.ai7.csv_validator.sculpt.Sculpt;
import de.ubt.ai7.csv_validator.sculpt.SculptFactory;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.ubt.ai7.csv_validator.sculpt.Sculpt} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SculptItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SculptItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTypesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sculpt_types_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sculpt_types_feature", "_UI_Sculpt_type"),
				 SculptPackage.Literals.SCULPT__TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SculptPackage.Literals.SCULPT__DELIMITER);
			childrenFeatures.add(SculptPackage.Literals.SCULPT__TOKENS);
			childrenFeatures.add(SculptPackage.Literals.SCULPT__CONSTRAINTS);
			childrenFeatures.add(SculptPackage.Literals.SCULPT__REGION_TOKENS);
			childrenFeatures.add(SculptPackage.Literals.SCULPT__TRANSFORMATION_PROGRAM);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Sculpt.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Sculpt"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Sculpt_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Sculpt.class)) {
			case SculptPackage.SCULPT__DELIMITER:
			case SculptPackage.SCULPT__TOKENS:
			case SculptPackage.SCULPT__CONSTRAINTS:
			case SculptPackage.SCULPT__REGION_TOKENS:
			case SculptPackage.SCULPT__TRANSFORMATION_PROGRAM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.SCULPT__DELIMITER,
				 SculptFactory.eINSTANCE.createDelimiters()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.SCULPT__TOKENS,
				 SculptFactory.eINSTANCE.createToken()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.SCULPT__TOKENS,
				 SculptFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.SCULPT__TOKENS,
				 SculptFactory.eINSTANCE.createAtomicType()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.SCULPT__TOKENS,
				 SculptFactory.eINSTANCE.createCompoundType()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.SCULPT__TOKENS,
				 SculptFactory.eINSTANCE.createListType()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.SCULPT__CONSTRAINTS,
				 SculptFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.SCULPT__CONSTRAINTS,
				 SculptFactory.eINSTANCE.createContentConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.SCULPT__CONSTRAINTS,
				 SculptFactory.eINSTANCE.createRelationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.SCULPT__CONSTRAINTS,
				 SculptFactory.eINSTANCE.createPrimaryKeyConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.SCULPT__CONSTRAINTS,
				 SculptFactory.eINSTANCE.createForeignKeyConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.SCULPT__REGION_TOKENS,
				 SculptFactory.eINSTANCE.createRegionToken()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.SCULPT__TRANSFORMATION_PROGRAM,
				 SculptFactory.eINSTANCE.createTransformationProgram()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SculptEditPlugin.INSTANCE;
	}

}

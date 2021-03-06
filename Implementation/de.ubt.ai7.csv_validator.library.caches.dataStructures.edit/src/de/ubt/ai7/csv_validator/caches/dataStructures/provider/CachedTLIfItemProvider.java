/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.provider;


import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLIf;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresFactory;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLIf} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CachedTLIfItemProvider extends CachedTLStatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CachedTLIfItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(dataStructuresPackage.Literals.CACHED_TL_IF__IF_BLOCK);
			childrenFeatures.add(dataStructuresPackage.Literals.CACHED_TL_IF__ELSE_BLOCK);
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
	 * This returns CachedTLIf.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CachedTLIf"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CachedTLIf)object).getDefinition();
		return label == null || label.length() == 0 ?
			getString("_UI_CachedTLIf_type") :
			getString("_UI_CachedTLIf_type") + " " + label;
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

		switch (notification.getFeatureID(CachedTLIf.class)) {
			case dataStructuresPackage.CACHED_TL_IF__IF_BLOCK:
			case dataStructuresPackage.CACHED_TL_IF__ELSE_BLOCK:
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
				(dataStructuresPackage.Literals.CACHED_TL_IF__IF_BLOCK,
				 dataStructuresFactory.eINSTANCE.createCachedTLStatement()));

		newChildDescriptors.add
			(createChildParameter
				(dataStructuresPackage.Literals.CACHED_TL_IF__IF_BLOCK,
				 dataStructuresFactory.eINSTANCE.createCachedTLLoop()));

		newChildDescriptors.add
			(createChildParameter
				(dataStructuresPackage.Literals.CACHED_TL_IF__IF_BLOCK,
				 dataStructuresFactory.eINSTANCE.createCachedTLOutput()));

		newChildDescriptors.add
			(createChildParameter
				(dataStructuresPackage.Literals.CACHED_TL_IF__IF_BLOCK,
				 dataStructuresFactory.eINSTANCE.createCachedTLIf()));

		newChildDescriptors.add
			(createChildParameter
				(dataStructuresPackage.Literals.CACHED_TL_IF__ELSE_BLOCK,
				 dataStructuresFactory.eINSTANCE.createCachedTLStatement()));

		newChildDescriptors.add
			(createChildParameter
				(dataStructuresPackage.Literals.CACHED_TL_IF__ELSE_BLOCK,
				 dataStructuresFactory.eINSTANCE.createCachedTLLoop()));

		newChildDescriptors.add
			(createChildParameter
				(dataStructuresPackage.Literals.CACHED_TL_IF__ELSE_BLOCK,
				 dataStructuresFactory.eINSTANCE.createCachedTLOutput()));

		newChildDescriptors.add
			(createChildParameter
				(dataStructuresPackage.Literals.CACHED_TL_IF__ELSE_BLOCK,
				 dataStructuresFactory.eINSTANCE.createCachedTLIf()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == dataStructuresPackage.Literals.CACHED_TL_IF__IF_BLOCK ||
			childFeature == dataStructuresPackage.Literals.CACHED_TL_IF__ELSE_BLOCK;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

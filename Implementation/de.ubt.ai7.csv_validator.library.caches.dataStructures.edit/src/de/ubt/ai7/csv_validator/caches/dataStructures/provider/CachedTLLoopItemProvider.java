/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.provider;


import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLLoop;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresFactory;
import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLLoop} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CachedTLLoopItemProvider extends CachedTLStatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CachedTLLoopItemProvider(AdapterFactory adapterFactory) {
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

			addAutomatonPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Automaton feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutomatonPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CachedTLLoop_automaton_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CachedTLLoop_automaton_feature", "_UI_CachedTLLoop_type"),
				 dataStructuresPackage.Literals.CACHED_TL_LOOP__AUTOMATON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(dataStructuresPackage.Literals.CACHED_TL_LOOP__STATEMENTS);
			childrenFeatures.add(dataStructuresPackage.Literals.CACHED_TL_LOOP__BINDINGS);
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
	 * This returns CachedTLLoop.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CachedTLLoop"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CachedTLLoop)object).getDefinition();
		return label == null || label.length() == 0 ?
			getString("_UI_CachedTLLoop_type") :
			getString("_UI_CachedTLLoop_type") + " " + label;
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

		switch (notification.getFeatureID(CachedTLLoop.class)) {
			case dataStructuresPackage.CACHED_TL_LOOP__AUTOMATON:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case dataStructuresPackage.CACHED_TL_LOOP__STATEMENTS:
			case dataStructuresPackage.CACHED_TL_LOOP__BINDINGS:
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
				(dataStructuresPackage.Literals.CACHED_TL_LOOP__STATEMENTS,
				 dataStructuresFactory.eINSTANCE.createCachedTLStatement()));

		newChildDescriptors.add
			(createChildParameter
				(dataStructuresPackage.Literals.CACHED_TL_LOOP__STATEMENTS,
				 dataStructuresFactory.eINSTANCE.createCachedTLLoop()));

		newChildDescriptors.add
			(createChildParameter
				(dataStructuresPackage.Literals.CACHED_TL_LOOP__STATEMENTS,
				 dataStructuresFactory.eINSTANCE.createCachedTLOutput()));

		newChildDescriptors.add
			(createChildParameter
				(dataStructuresPackage.Literals.CACHED_TL_LOOP__STATEMENTS,
				 dataStructuresFactory.eINSTANCE.createCachedTLIf()));

		newChildDescriptors.add
			(createChildParameter
				(dataStructuresPackage.Literals.CACHED_TL_LOOP__BINDINGS,
				 dataStructuresFactory.eINSTANCE.createCachedTLVariableBinding()));
	}

}

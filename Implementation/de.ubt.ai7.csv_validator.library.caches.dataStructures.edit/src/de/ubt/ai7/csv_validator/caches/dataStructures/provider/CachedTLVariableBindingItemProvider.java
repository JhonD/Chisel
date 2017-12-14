/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.provider;


import de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding;

import de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CachedTLVariableBindingItemProvider extends CachedAbstractTokenItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CachedTLVariableBindingItemProvider(AdapterFactory adapterFactory) {
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

			addTokenPropertyDescriptor(object);
			addPossibleTokensPropertyDescriptor(object);
			addStrictTypePropertyDescriptor(object);
			addContentsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Token feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTokenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CachedTLVariableBinding_token_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CachedTLVariableBinding_token_feature", "_UI_CachedTLVariableBinding_type"),
				 dataStructuresPackage.Literals.CACHED_TL_VARIABLE_BINDING__TOKEN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Possible Tokens feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPossibleTokensPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CachedTLVariableBinding_possibleTokens_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CachedTLVariableBinding_possibleTokens_feature", "_UI_CachedTLVariableBinding_type"),
				 dataStructuresPackage.Literals.CACHED_TL_VARIABLE_BINDING__POSSIBLE_TOKENS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strict Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrictTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CachedTLVariableBinding_strictType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CachedTLVariableBinding_strictType_feature", "_UI_CachedTLVariableBinding_type"),
				 dataStructuresPackage.Literals.CACHED_TL_VARIABLE_BINDING__STRICT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CachedTLVariableBinding_contents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CachedTLVariableBinding_contents_feature", "_UI_CachedTLVariableBinding_type"),
				 dataStructuresPackage.Literals.CACHED_TL_VARIABLE_BINDING__CONTENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CachedTLVariableBinding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CachedTLVariableBinding"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CachedTLVariableBinding)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CachedTLVariableBinding_type") :
			getString("_UI_CachedTLVariableBinding_type") + " " + label;
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

		switch (notification.getFeatureID(CachedTLVariableBinding.class)) {
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__POSSIBLE_TOKENS:
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__STRICT_TYPE:
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING__CONTENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}

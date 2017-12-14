/**
 */
package de.ubt.ai7.csv_validator.sculpt.provider;


import de.ubt.ai7.csv_validator.sculpt.Comparator;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison;
import de.ubt.ai7.csv_validator.sculpt.SculptFactory;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;

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
 * This is the item provider adapter for a {@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentExpressionComparisonItemProvider extends ContentExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentExpressionComparisonItemProvider(AdapterFactory adapterFactory) {
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

			addCompPropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Comp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentExpressionComparison_comp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentExpressionComparison_comp_feature", "_UI_ContentExpressionComparison_type"),
				 SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__COMP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentExpressionComparison_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentExpressionComparison_value_feature", "_UI_ContentExpressionComparison_type"),
				 SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentExpressionComparison_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentExpressionComparison_type_feature", "_UI_ContentExpressionComparison_type"),
				 SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__TYPE,
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
			childrenFeatures.add(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__TYPE_SPECIFIER);
			childrenFeatures.add(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH);
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
	 * This returns ContentExpressionComparison.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContentExpressionComparison"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Comparator labelValue = ((ContentExpressionComparison)object).getComp();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ContentExpressionComparison_type") :
			getString("_UI_ContentExpressionComparison_type") + " " + label;
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

		switch (notification.getFeatureID(ContentExpressionComparison.class)) {
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__COMP:
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__TYPE_SPECIFIER:
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON__PATH:
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
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__TYPE_SPECIFIER,
				 SculptFactory.eINSTANCE.createTypeSpecifier()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__TYPE_SPECIFIER,
				 SculptFactory.eINSTANCE.createCompoundTypeSpecifier()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__TYPE_SPECIFIER,
				 SculptFactory.eINSTANCE.createListTypeSpecifier()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createNodeExpressionOr()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createNodeExpressionAnd()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createNodeExpressionNot()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createNodeExpressionPath()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createNodeExpressionToken()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createNodeExpressionCoordinate()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createNodeExpressionComplete()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createNodeExpressionRowCol()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createNodeExpressionRowColCoordinate()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createNodeExpressionRowColToken()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createNodeExpressionRowColString()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createNodeExpressionRowColLast()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createNodeExpressionComparison()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createNodeExpressionComparisonR2L()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createPathExpressionPredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createPathExpressionList()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createPathExpressionStar()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createPathExpressionPlus()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createPathExpressionOption()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createPathExpressionOr()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON__PATH,
				 SculptFactory.eINSTANCE.createPathExpressionStep()));
	}

}

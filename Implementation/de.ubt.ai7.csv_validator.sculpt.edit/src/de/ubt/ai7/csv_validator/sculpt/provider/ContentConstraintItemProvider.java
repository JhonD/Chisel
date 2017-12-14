/**
 */
package de.ubt.ai7.csv_validator.sculpt.provider;


import de.ubt.ai7.csv_validator.sculpt.ContentConstraint;
import de.ubt.ai7.csv_validator.sculpt.SculptFactory;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.ValidationMode;

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
 * This is the item provider adapter for a {@link de.ubt.ai7.csv_validator.sculpt.ContentConstraint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentConstraintItemProvider extends ConstraintItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentConstraintItemProvider(AdapterFactory adapterFactory) {
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

			addValidationModePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Validation Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidationModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentConstraint_validationMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentConstraint_validationMode_feature", "_UI_ContentConstraint_type"),
				 SculptPackage.Literals.CONTENT_CONSTRAINT__VALIDATION_MODE,
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
			childrenFeatures.add(SculptPackage.Literals.CONTENT_CONSTRAINT__REGION);
			childrenFeatures.add(SculptPackage.Literals.CONTENT_CONSTRAINT__CONTENT_EXPRESSION);
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
	 * This returns ContentConstraint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContentConstraint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ValidationMode labelValue = ((ContentConstraint)object).getValidationMode();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ContentConstraint_type") :
			getString("_UI_ContentConstraint_type") + " " + label;
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

		switch (notification.getFeatureID(ContentConstraint.class)) {
			case SculptPackage.CONTENT_CONSTRAINT__VALIDATION_MODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SculptPackage.CONTENT_CONSTRAINT__REGION:
			case SculptPackage.CONTENT_CONSTRAINT__CONTENT_EXPRESSION:
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
				(SculptPackage.Literals.CONTENT_CONSTRAINT__REGION,
				 SculptFactory.eINSTANCE.createNodeExpressionOr()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__REGION,
				 SculptFactory.eINSTANCE.createNodeExpressionAnd()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__REGION,
				 SculptFactory.eINSTANCE.createNodeExpressionNot()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__REGION,
				 SculptFactory.eINSTANCE.createNodeExpressionPath()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__REGION,
				 SculptFactory.eINSTANCE.createNodeExpressionToken()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__REGION,
				 SculptFactory.eINSTANCE.createNodeExpressionCoordinate()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__REGION,
				 SculptFactory.eINSTANCE.createNodeExpressionComplete()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__REGION,
				 SculptFactory.eINSTANCE.createNodeExpressionRowCol()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__REGION,
				 SculptFactory.eINSTANCE.createNodeExpressionRowColCoordinate()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__REGION,
				 SculptFactory.eINSTANCE.createNodeExpressionRowColToken()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__REGION,
				 SculptFactory.eINSTANCE.createNodeExpressionRowColString()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__REGION,
				 SculptFactory.eINSTANCE.createNodeExpressionRowColLast()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__REGION,
				 SculptFactory.eINSTANCE.createNodeExpressionComparison()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__REGION,
				 SculptFactory.eINSTANCE.createNodeExpressionComparisonR2L()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__REGION,
				 SculptFactory.eINSTANCE.createPathExpressionPredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__CONTENT_EXPRESSION,
				 SculptFactory.eINSTANCE.createContentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__CONTENT_EXPRESSION,
				 SculptFactory.eINSTANCE.createContentExpressionOr()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__CONTENT_EXPRESSION,
				 SculptFactory.eINSTANCE.createContentExpressionList()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__CONTENT_EXPRESSION,
				 SculptFactory.eINSTANCE.createContentExpressionStar()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__CONTENT_EXPRESSION,
				 SculptFactory.eINSTANCE.createContentExpressionPlus()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__CONTENT_EXPRESSION,
				 SculptFactory.eINSTANCE.createContentExpressionOption()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__CONTENT_EXPRESSION,
				 SculptFactory.eINSTANCE.createContentExpressionToken()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__CONTENT_EXPRESSION,
				 SculptFactory.eINSTANCE.createContentExpressionString()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__CONTENT_EXPRESSION,
				 SculptFactory.eINSTANCE.createContentExpressionANY()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__CONTENT_EXPRESSION,
				 SculptFactory.eINSTANCE.createContentExpressionEMPTY()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__CONTENT_EXPRESSION,
				 SculptFactory.eINSTANCE.createContentExpressionSOMETHING()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__CONTENT_EXPRESSION,
				 SculptFactory.eINSTANCE.createContentExpressionComparison()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__CONTENT_EXPRESSION,
				 SculptFactory.eINSTANCE.createContentExpressionComparisonR2L()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_CONSTRAINT__CONTENT_EXPRESSION,
				 SculptFactory.eINSTANCE.createTLContentExpressionList()));
	}

}

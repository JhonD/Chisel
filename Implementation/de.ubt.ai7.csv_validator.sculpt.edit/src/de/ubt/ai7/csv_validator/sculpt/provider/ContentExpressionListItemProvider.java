/**
 */
package de.ubt.ai7.csv_validator.sculpt.provider;


import de.ubt.ai7.csv_validator.sculpt.ContentExpressionList;
import de.ubt.ai7.csv_validator.sculpt.SculptFactory;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionList} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentExpressionListItemProvider extends ContentExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentExpressionListItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__FIRST);
			childrenFeatures.add(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__REST);
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
	 * This returns ContentExpressionList.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContentExpressionList"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ContentExpressionList_type");
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

		switch (notification.getFeatureID(ContentExpressionList.class)) {
			case SculptPackage.CONTENT_EXPRESSION_LIST__FIRST:
			case SculptPackage.CONTENT_EXPRESSION_LIST__REST:
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
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__FIRST,
				 SculptFactory.eINSTANCE.createContentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__FIRST,
				 SculptFactory.eINSTANCE.createContentExpressionOr()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__FIRST,
				 SculptFactory.eINSTANCE.createContentExpressionList()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__FIRST,
				 SculptFactory.eINSTANCE.createContentExpressionStar()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__FIRST,
				 SculptFactory.eINSTANCE.createContentExpressionPlus()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__FIRST,
				 SculptFactory.eINSTANCE.createContentExpressionOption()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__FIRST,
				 SculptFactory.eINSTANCE.createContentExpressionToken()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__FIRST,
				 SculptFactory.eINSTANCE.createContentExpressionString()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__FIRST,
				 SculptFactory.eINSTANCE.createContentExpressionANY()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__FIRST,
				 SculptFactory.eINSTANCE.createContentExpressionEMPTY()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__FIRST,
				 SculptFactory.eINSTANCE.createContentExpressionSOMETHING()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__FIRST,
				 SculptFactory.eINSTANCE.createContentExpressionComparison()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__FIRST,
				 SculptFactory.eINSTANCE.createContentExpressionComparisonR2L()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__FIRST,
				 SculptFactory.eINSTANCE.createTLContentExpressionList()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__REST,
				 SculptFactory.eINSTANCE.createContentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__REST,
				 SculptFactory.eINSTANCE.createContentExpressionOr()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__REST,
				 SculptFactory.eINSTANCE.createContentExpressionList()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__REST,
				 SculptFactory.eINSTANCE.createContentExpressionStar()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__REST,
				 SculptFactory.eINSTANCE.createContentExpressionPlus()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__REST,
				 SculptFactory.eINSTANCE.createContentExpressionOption()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__REST,
				 SculptFactory.eINSTANCE.createContentExpressionToken()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__REST,
				 SculptFactory.eINSTANCE.createContentExpressionString()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__REST,
				 SculptFactory.eINSTANCE.createContentExpressionANY()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__REST,
				 SculptFactory.eINSTANCE.createContentExpressionEMPTY()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__REST,
				 SculptFactory.eINSTANCE.createContentExpressionSOMETHING()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__REST,
				 SculptFactory.eINSTANCE.createContentExpressionComparison()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__REST,
				 SculptFactory.eINSTANCE.createContentExpressionComparisonR2L()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.CONTENT_EXPRESSION_LIST__REST,
				 SculptFactory.eINSTANCE.createTLContentExpressionList()));
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
			childFeature == SculptPackage.Literals.CONTENT_EXPRESSION_LIST__FIRST ||
			childFeature == SculptPackage.Literals.CONTENT_EXPRESSION_LIST__REST;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

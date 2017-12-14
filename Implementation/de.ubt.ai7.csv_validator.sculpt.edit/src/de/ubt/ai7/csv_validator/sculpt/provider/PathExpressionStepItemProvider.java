/**
 */
package de.ubt.ai7.csv_validator.sculpt.provider;


import de.ubt.ai7.csv_validator.sculpt.PathExpressionStep;
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
 * This is the item provider adapter for a {@link de.ubt.ai7.csv_validator.sculpt.PathExpressionStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PathExpressionStepItemProvider extends PathExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathExpressionStepItemProvider(AdapterFactory adapterFactory) {
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

			addAxesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Axes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAxesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PathExpressionStep_axes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PathExpressionStep_axes_feature", "_UI_PathExpressionStep_type"),
				 SculptPackage.Literals.PATH_EXPRESSION_STEP__AXES,
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
			childrenFeatures.add(SculptPackage.Literals.PATH_EXPRESSION_STEP__NODE_TEST);
			childrenFeatures.add(SculptPackage.Literals.PATH_EXPRESSION_STEP__PREDICATE);
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
	 * This returns PathExpressionStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PathExpressionStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PathExpressionStep)object).getAxes();
		return label == null || label.length() == 0 ?
			getString("_UI_PathExpressionStep_type") :
			getString("_UI_PathExpressionStep_type") + " " + label;
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

		switch (notification.getFeatureID(PathExpressionStep.class)) {
			case SculptPackage.PATH_EXPRESSION_STEP__AXES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SculptPackage.PATH_EXPRESSION_STEP__NODE_TEST:
			case SculptPackage.PATH_EXPRESSION_STEP__PREDICATE:
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
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__NODE_TEST,
				 SculptFactory.eINSTANCE.createNodeExpressionToken()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__NODE_TEST,
				 SculptFactory.eINSTANCE.createNodeExpressionCoordinate()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__NODE_TEST,
				 SculptFactory.eINSTANCE.createNodeExpressionComplete()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__NODE_TEST,
				 SculptFactory.eINSTANCE.createNodeExpressionRowCol()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__NODE_TEST,
				 SculptFactory.eINSTANCE.createNodeExpressionRowColCoordinate()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__NODE_TEST,
				 SculptFactory.eINSTANCE.createNodeExpressionRowColToken()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__NODE_TEST,
				 SculptFactory.eINSTANCE.createNodeExpressionRowColString()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__NODE_TEST,
				 SculptFactory.eINSTANCE.createNodeExpressionRowColLast()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__PREDICATE,
				 SculptFactory.eINSTANCE.createNodeExpressionOr()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__PREDICATE,
				 SculptFactory.eINSTANCE.createNodeExpressionAnd()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__PREDICATE,
				 SculptFactory.eINSTANCE.createNodeExpressionNot()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__PREDICATE,
				 SculptFactory.eINSTANCE.createNodeExpressionPath()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__PREDICATE,
				 SculptFactory.eINSTANCE.createNodeExpressionToken()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__PREDICATE,
				 SculptFactory.eINSTANCE.createNodeExpressionCoordinate()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__PREDICATE,
				 SculptFactory.eINSTANCE.createNodeExpressionComplete()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__PREDICATE,
				 SculptFactory.eINSTANCE.createNodeExpressionRowCol()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__PREDICATE,
				 SculptFactory.eINSTANCE.createNodeExpressionRowColCoordinate()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__PREDICATE,
				 SculptFactory.eINSTANCE.createNodeExpressionRowColToken()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__PREDICATE,
				 SculptFactory.eINSTANCE.createNodeExpressionRowColString()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__PREDICATE,
				 SculptFactory.eINSTANCE.createNodeExpressionRowColLast()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__PREDICATE,
				 SculptFactory.eINSTANCE.createNodeExpressionComparison()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__PREDICATE,
				 SculptFactory.eINSTANCE.createNodeExpressionComparisonR2L()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.PATH_EXPRESSION_STEP__PREDICATE,
				 SculptFactory.eINSTANCE.createPathExpressionPredicate()));
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
			childFeature == SculptPackage.Literals.PATH_EXPRESSION_STEP__NODE_TEST ||
			childFeature == SculptPackage.Literals.PATH_EXPRESSION_STEP__PREDICATE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.util;

import de.ubt.ai7.csv_validator.caches.dataStructures.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage
 * @generated
 */
public class dataStructuresAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static dataStructuresPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dataStructuresAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = dataStructuresPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected dataStructuresSwitch<Adapter> modelSwitch =
		new dataStructuresSwitch<Adapter>() {
			@Override
			public Adapter caseCachedElement(CachedElement object) {
				return createCachedElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseCachedDelimiters(CachedDelimiters object) {
				return createCachedDelimitersAdapter();
			}
			@Override
			public Adapter caseCachedAbstractToken(CachedAbstractToken object) {
				return createCachedAbstractTokenAdapter();
			}
			@Override
			public Adapter caseCachedToken(CachedToken object) {
				return createCachedTokenAdapter();
			}
			@Override
			public Adapter caseCachedConstraint(CachedConstraint object) {
				return createCachedConstraintAdapter();
			}
			@Override
			public Adapter caseCachedContentConstraint(CachedContentConstraint object) {
				return createCachedContentConstraintAdapter();
			}
			@Override
			public Adapter caseCachedPrimaryKeyConstraint(CachedPrimaryKeyConstraint object) {
				return createCachedPrimaryKeyConstraintAdapter();
			}
			@Override
			public Adapter caseCachedForeignKeyConstraint(CachedForeignKeyConstraint object) {
				return createCachedForeignKeyConstraintAdapter();
			}
			@Override
			public Adapter caseCachedNodeExpression(CachedNodeExpression object) {
				return createCachedNodeExpressionAdapter();
			}
			@Override
			public Adapter caseCachedRegionToken(CachedRegionToken object) {
				return createCachedRegionTokenAdapter();
			}
			@Override
			public Adapter caseCachedType(CachedType object) {
				return createCachedTypeAdapter();
			}
			@Override
			public Adapter caseCachedAtomicType(CachedAtomicType object) {
				return createCachedAtomicTypeAdapter();
			}
			@Override
			public Adapter caseCachedListType(CachedListType object) {
				return createCachedListTypeAdapter();
			}
			@Override
			public Adapter caseCachedCompoundType(CachedCompoundType object) {
				return createCachedCompoundTypeAdapter();
			}
			@Override
			public Adapter caseCachedTLVariableBinding(CachedTLVariableBinding object) {
				return createCachedTLVariableBindingAdapter();
			}
			@Override
			public Adapter caseCachedTLElement(CachedTLElement object) {
				return createCachedTLElementAdapter();
			}
			@Override
			public Adapter caseCachedTLStatement(CachedTLStatement object) {
				return createCachedTLStatementAdapter();
			}
			@Override
			public Adapter caseCachedTLLoop(CachedTLLoop object) {
				return createCachedTLLoopAdapter();
			}
			@Override
			public Adapter caseCachedTLOutput(CachedTLOutput object) {
				return createCachedTLOutputAdapter();
			}
			@Override
			public Adapter caseCachedTLPrimitive(CachedTLPrimitive object) {
				return createCachedTLPrimitiveAdapter();
			}
			@Override
			public Adapter caseCachedTLConstant(CachedTLConstant object) {
				return createCachedTLConstantAdapter();
			}
			@Override
			public Adapter caseCachedTLOutputVariable(CachedTLOutputVariable object) {
				return createCachedTLOutputVariableAdapter();
			}
			@Override
			public Adapter caseCachedTLTypeInspector(CachedTLTypeInspector object) {
				return createCachedTLTypeInspectorAdapter();
			}
			@Override
			public Adapter caseCachedTransformationProgram(CachedTransformationProgram object) {
				return createCachedTransformationProgramAdapter();
			}
			@Override
			public Adapter caseCachedTLIf(CachedTLIf object) {
				return createCachedTLIfAdapter();
			}
			@Override
			public Adapter caseCachedTLBoolExpr(CachedTLBoolExpr object) {
				return createCachedTLBoolExprAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement <em>Cached Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement
	 * @generated
	 */
	public Adapter createCachedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedDelimiters <em>Cached Delimiters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedDelimiters
	 * @generated
	 */
	public Adapter createCachedDelimitersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedAbstractToken <em>Cached Abstract Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedAbstractToken
	 * @generated
	 */
	public Adapter createCachedAbstractTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedToken <em>Cached Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedToken
	 * @generated
	 */
	public Adapter createCachedTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedConstraint <em>Cached Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedConstraint
	 * @generated
	 */
	public Adapter createCachedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedContentConstraint <em>Cached Content Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedContentConstraint
	 * @generated
	 */
	public Adapter createCachedContentConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedPrimaryKeyConstraint <em>Cached Primary Key Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedPrimaryKeyConstraint
	 * @generated
	 */
	public Adapter createCachedPrimaryKeyConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedForeignKeyConstraint <em>Cached Foreign Key Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedForeignKeyConstraint
	 * @generated
	 */
	public Adapter createCachedForeignKeyConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedNodeExpression <em>Cached Node Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedNodeExpression
	 * @generated
	 */
	public Adapter createCachedNodeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedRegionToken <em>Cached Region Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedRegionToken
	 * @generated
	 */
	public Adapter createCachedRegionTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedType <em>Cached Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedType
	 * @generated
	 */
	public Adapter createCachedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedAtomicType <em>Cached Atomic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedAtomicType
	 * @generated
	 */
	public Adapter createCachedAtomicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedListType <em>Cached List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedListType
	 * @generated
	 */
	public Adapter createCachedListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedCompoundType <em>Cached Compound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedCompoundType
	 * @generated
	 */
	public Adapter createCachedCompoundTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLElement <em>Cached TL Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLElement
	 * @generated
	 */
	public Adapter createCachedTLElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLPrimitive <em>Cached TL Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLPrimitive
	 * @generated
	 */
	public Adapter createCachedTLPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLConstant <em>Cached TL Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLConstant
	 * @generated
	 */
	public Adapter createCachedTLConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutputVariable <em>Cached TL Output Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutputVariable
	 * @generated
	 */
	public Adapter createCachedTLOutputVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding <em>Cached TL Variable Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding
	 * @generated
	 */
	public Adapter createCachedTLVariableBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLTypeInspector <em>Cached TL Type Inspector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLTypeInspector
	 * @generated
	 */
	public Adapter createCachedTLTypeInspectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLStatement <em>Cached TL Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLStatement
	 * @generated
	 */
	public Adapter createCachedTLStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutput <em>Cached TL Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutput
	 * @generated
	 */
	public Adapter createCachedTLOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLLoop <em>Cached TL Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLLoop
	 * @generated
	 */
	public Adapter createCachedTLLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram <em>Cached Transformation Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram
	 * @generated
	 */
	public Adapter createCachedTransformationProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLIf <em>Cached TL If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLIf
	 * @generated
	 */
	public Adapter createCachedTLIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLBoolExpr <em>Cached TL Bool Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLBoolExpr
	 * @generated
	 */
	public Adapter createCachedTLBoolExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //dataStructuresAdapterFactory

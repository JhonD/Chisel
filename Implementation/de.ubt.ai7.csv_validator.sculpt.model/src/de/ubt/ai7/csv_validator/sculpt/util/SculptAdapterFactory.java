/**
 */
package de.ubt.ai7.csv_validator.sculpt.util;

import de.ubt.ai7.csv_validator.sculpt.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage
 * @generated
 */
public class SculptAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SculptPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SculptAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SculptPackage.eINSTANCE;
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
	protected SculptSwitch<Adapter> modelSwitch =
		new SculptSwitch<Adapter>() {
			@Override
			public Adapter caseSculpt(Sculpt object) {
				return createSculptAdapter();
			}
			@Override
			public Adapter caseSchemaElement(SchemaElement object) {
				return createSchemaElementAdapter();
			}
			@Override
			public Adapter caseDelimiters(Delimiters object) {
				return createDelimitersAdapter();
			}
			@Override
			public Adapter caseAbstractToken(AbstractToken object) {
				return createAbstractTokenAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseAtomicType(AtomicType object) {
				return createAtomicTypeAdapter();
			}
			@Override
			public Adapter caseCompoundType(CompoundType object) {
				return createCompoundTypeAdapter();
			}
			@Override
			public Adapter caseListType(ListType object) {
				return createListTypeAdapter();
			}
			@Override
			public Adapter caseCompoundTypePrimitive(CompoundTypePrimitive object) {
				return createCompoundTypePrimitiveAdapter();
			}
			@Override
			public Adapter caseToken(Token object) {
				return createTokenAdapter();
			}
			@Override
			public Adapter caseRegionToken(RegionToken object) {
				return createRegionTokenAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseContentConstraint(ContentConstraint object) {
				return createContentConstraintAdapter();
			}
			@Override
			public Adapter caseRelationConstraint(RelationConstraint object) {
				return createRelationConstraintAdapter();
			}
			@Override
			public Adapter casePrimaryKeyConstraint(PrimaryKeyConstraint object) {
				return createPrimaryKeyConstraintAdapter();
			}
			@Override
			public Adapter caseForeignKeyConstraint(ForeignKeyConstraint object) {
				return createForeignKeyConstraintAdapter();
			}
			@Override
			public Adapter caseTransformationProgram(TransformationProgram object) {
				return createTransformationProgramAdapter();
			}
			@Override
			public Adapter caseTupleSelector(TupleSelector object) {
				return createTupleSelectorAdapter();
			}
			@Override
			public Adapter caseNodeExpression(NodeExpression object) {
				return createNodeExpressionAdapter();
			}
			@Override
			public Adapter caseNodeExpressionPrimitive(NodeExpressionPrimitive object) {
				return createNodeExpressionPrimitiveAdapter();
			}
			@Override
			public Adapter caseNodeExpressionOr(NodeExpressionOr object) {
				return createNodeExpressionOrAdapter();
			}
			@Override
			public Adapter caseNodeExpressionAnd(NodeExpressionAnd object) {
				return createNodeExpressionAndAdapter();
			}
			@Override
			public Adapter caseNodeExpressionNot(NodeExpressionNot object) {
				return createNodeExpressionNotAdapter();
			}
			@Override
			public Adapter caseNodeExpressionPath(NodeExpressionPath object) {
				return createNodeExpressionPathAdapter();
			}
			@Override
			public Adapter caseNodeExpressionToken(NodeExpressionToken object) {
				return createNodeExpressionTokenAdapter();
			}
			@Override
			public Adapter caseNodeExpressionCoordinate(NodeExpressionCoordinate object) {
				return createNodeExpressionCoordinateAdapter();
			}
			@Override
			public Adapter caseNodeExpressionComplete(NodeExpressionComplete object) {
				return createNodeExpressionCompleteAdapter();
			}
			@Override
			public Adapter caseNodeExpressionRowCol(NodeExpressionRowCol object) {
				return createNodeExpressionRowColAdapter();
			}
			@Override
			public Adapter caseNodeExpressionRowColCoordinate(NodeExpressionRowColCoordinate object) {
				return createNodeExpressionRowColCoordinateAdapter();
			}
			@Override
			public Adapter caseNodeExpressionRowColToken(NodeExpressionRowColToken object) {
				return createNodeExpressionRowColTokenAdapter();
			}
			@Override
			public Adapter caseNodeExpressionRowColString(NodeExpressionRowColString object) {
				return createNodeExpressionRowColStringAdapter();
			}
			@Override
			public Adapter caseNodeExpressionRowColLast(NodeExpressionRowColLast object) {
				return createNodeExpressionRowColLastAdapter();
			}
			@Override
			public Adapter caseNodeExpressionComparison(NodeExpressionComparison object) {
				return createNodeExpressionComparisonAdapter();
			}
			@Override
			public Adapter caseNodeExpressionComparisonR2L(NodeExpressionComparisonR2L object) {
				return createNodeExpressionComparisonR2LAdapter();
			}
			@Override
			public Adapter casePathExpressionPredicate(PathExpressionPredicate object) {
				return createPathExpressionPredicateAdapter();
			}
			@Override
			public Adapter casePathExpression(PathExpression object) {
				return createPathExpressionAdapter();
			}
			@Override
			public Adapter casePathExpressionList(PathExpressionList object) {
				return createPathExpressionListAdapter();
			}
			@Override
			public Adapter casePathExpressionStar(PathExpressionStar object) {
				return createPathExpressionStarAdapter();
			}
			@Override
			public Adapter casePathExpressionPlus(PathExpressionPlus object) {
				return createPathExpressionPlusAdapter();
			}
			@Override
			public Adapter casePathExpressionOption(PathExpressionOption object) {
				return createPathExpressionOptionAdapter();
			}
			@Override
			public Adapter casePathExpressionOr(PathExpressionOr object) {
				return createPathExpressionOrAdapter();
			}
			@Override
			public Adapter casePathExpressionStep(PathExpressionStep object) {
				return createPathExpressionStepAdapter();
			}
			@Override
			public Adapter caseContentExpression(ContentExpression object) {
				return createContentExpressionAdapter();
			}
			@Override
			public Adapter caseContentExpressionOr(ContentExpressionOr object) {
				return createContentExpressionOrAdapter();
			}
			@Override
			public Adapter caseContentExpressionList(ContentExpressionList object) {
				return createContentExpressionListAdapter();
			}
			@Override
			public Adapter caseContentExpressionStar(ContentExpressionStar object) {
				return createContentExpressionStarAdapter();
			}
			@Override
			public Adapter caseContentExpressionPlus(ContentExpressionPlus object) {
				return createContentExpressionPlusAdapter();
			}
			@Override
			public Adapter caseContentExpressionOption(ContentExpressionOption object) {
				return createContentExpressionOptionAdapter();
			}
			@Override
			public Adapter caseContentExpressionToken(ContentExpressionToken object) {
				return createContentExpressionTokenAdapter();
			}
			@Override
			public Adapter caseContentExpressionString(ContentExpressionString object) {
				return createContentExpressionStringAdapter();
			}
			@Override
			public Adapter caseContentExpressionANY(ContentExpressionANY object) {
				return createContentExpressionANYAdapter();
			}
			@Override
			public Adapter caseContentExpressionEMPTY(ContentExpressionEMPTY object) {
				return createContentExpressionEMPTYAdapter();
			}
			@Override
			public Adapter caseContentExpressionSOMETHING(ContentExpressionSOMETHING object) {
				return createContentExpressionSOMETHINGAdapter();
			}
			@Override
			public Adapter caseContentExpressionComparison(ContentExpressionComparison object) {
				return createContentExpressionComparisonAdapter();
			}
			@Override
			public Adapter caseContentExpressionComparisonR2L(ContentExpressionComparisonR2L object) {
				return createContentExpressionComparisonR2LAdapter();
			}
			@Override
			public Adapter caseTLContentExpressionList(TLContentExpressionList object) {
				return createTLContentExpressionListAdapter();
			}
			@Override
			public Adapter caseTypeSpecifier(TypeSpecifier object) {
				return createTypeSpecifierAdapter();
			}
			@Override
			public Adapter caseCompoundTypeSpecifier(CompoundTypeSpecifier object) {
				return createCompoundTypeSpecifierAdapter();
			}
			@Override
			public Adapter caseListTypeSpecifier(ListTypeSpecifier object) {
				return createListTypeSpecifierAdapter();
			}
			@Override
			public Adapter caseTLElement(TLElement object) {
				return createTLElementAdapter();
			}
			@Override
			public Adapter caseTLVariable(TLVariable object) {
				return createTLVariableAdapter();
			}
			@Override
			public Adapter caseTLOutputPrimitive(TLOutputPrimitive object) {
				return createTLOutputPrimitiveAdapter();
			}
			@Override
			public Adapter caseTLOutputConstant(TLOutputConstant object) {
				return createTLOutputConstantAdapter();
			}
			@Override
			public Adapter caseTLOutputVariable(TLOutputVariable object) {
				return createTLOutputVariableAdapter();
			}
			@Override
			public Adapter caseTLStatement(TLStatement object) {
				return createTLStatementAdapter();
			}
			@Override
			public Adapter caseTLOutput(TLOutput object) {
				return createTLOutputAdapter();
			}
			@Override
			public Adapter caseTLLoop(TLLoop object) {
				return createTLLoopAdapter();
			}
			@Override
			public Adapter caseTLIf(TLIf object) {
				return createTLIfAdapter();
			}
			@Override
			public Adapter caseTLBoolExpr(TLBoolExpr object) {
				return createTLBoolExprAdapter();
			}
			@Override
			public Adapter caseTLBoolExprEmpty(TLBoolExprEmpty object) {
				return createTLBoolExprEmptyAdapter();
			}
			@Override
			public Adapter caseTLBoolExprNot(TLBoolExprNot object) {
				return createTLBoolExprNotAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.Sculpt <em>Sculpt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.Sculpt
	 * @generated
	 */
	public Adapter createSculptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.SchemaElement <em>Schema Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.SchemaElement
	 * @generated
	 */
	public Adapter createSchemaElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.Delimiters <em>Delimiters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.Delimiters
	 * @generated
	 */
	public Adapter createDelimitersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.AbstractToken <em>Abstract Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.AbstractToken
	 * @generated
	 */
	public Adapter createAbstractTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.AtomicType <em>Atomic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.AtomicType
	 * @generated
	 */
	public Adapter createAtomicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.CompoundType <em>Compound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.CompoundType
	 * @generated
	 */
	public Adapter createCompoundTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.ListType
	 * @generated
	 */
	public Adapter createListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.CompoundTypePrimitive <em>Compound Type Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.CompoundTypePrimitive
	 * @generated
	 */
	public Adapter createCompoundTypePrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.Token
	 * @generated
	 */
	public Adapter createTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.RegionToken <em>Region Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.RegionToken
	 * @generated
	 */
	public Adapter createRegionTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.ContentConstraint <em>Content Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentConstraint
	 * @generated
	 */
	public Adapter createContentConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.RelationConstraint <em>Relation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.RelationConstraint
	 * @generated
	 */
	public Adapter createRelationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.PrimaryKeyConstraint <em>Primary Key Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.PrimaryKeyConstraint
	 * @generated
	 */
	public Adapter createPrimaryKeyConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.ForeignKeyConstraint <em>Foreign Key Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.ForeignKeyConstraint
	 * @generated
	 */
	public Adapter createForeignKeyConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.TransformationProgram <em>Transformation Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.TransformationProgram
	 * @generated
	 */
	public Adapter createTransformationProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.TupleSelector <em>Tuple Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.TupleSelector
	 * @generated
	 */
	public Adapter createTupleSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpression <em>Node Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpression
	 * @generated
	 */
	public Adapter createNodeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionPrimitive <em>Node Expression Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionPrimitive
	 * @generated
	 */
	public Adapter createNodeExpressionPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionOr <em>Node Expression Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionOr
	 * @generated
	 */
	public Adapter createNodeExpressionOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionAnd <em>Node Expression And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionAnd
	 * @generated
	 */
	public Adapter createNodeExpressionAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionNot <em>Node Expression Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionNot
	 * @generated
	 */
	public Adapter createNodeExpressionNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionPath <em>Node Expression Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionPath
	 * @generated
	 */
	public Adapter createNodeExpressionPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionToken <em>Node Expression Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionToken
	 * @generated
	 */
	public Adapter createNodeExpressionTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionCoordinate <em>Node Expression Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionCoordinate
	 * @generated
	 */
	public Adapter createNodeExpressionCoordinateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionComplete <em>Node Expression Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionComplete
	 * @generated
	 */
	public Adapter createNodeExpressionCompleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowCol <em>Node Expression Row Col</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowCol
	 * @generated
	 */
	public Adapter createNodeExpressionRowColAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColCoordinate <em>Node Expression Row Col Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColCoordinate
	 * @generated
	 */
	public Adapter createNodeExpressionRowColCoordinateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColToken <em>Node Expression Row Col Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColToken
	 * @generated
	 */
	public Adapter createNodeExpressionRowColTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColString <em>Node Expression Row Col String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColString
	 * @generated
	 */
	public Adapter createNodeExpressionRowColStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColLast <em>Node Expression Row Col Last</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColLast
	 * @generated
	 */
	public Adapter createNodeExpressionRowColLastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison <em>Node Expression Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison
	 * @generated
	 */
	public Adapter createNodeExpressionComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparisonR2L <em>Node Expression Comparison R2L</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparisonR2L
	 * @generated
	 */
	public Adapter createNodeExpressionComparisonR2LAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionPredicate <em>Path Expression Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionPredicate
	 * @generated
	 */
	public Adapter createPathExpressionPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.PathExpression <em>Path Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpression
	 * @generated
	 */
	public Adapter createPathExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionList <em>Path Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionList
	 * @generated
	 */
	public Adapter createPathExpressionListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionStar <em>Path Expression Star</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionStar
	 * @generated
	 */
	public Adapter createPathExpressionStarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionPlus <em>Path Expression Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionPlus
	 * @generated
	 */
	public Adapter createPathExpressionPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionOption <em>Path Expression Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionOption
	 * @generated
	 */
	public Adapter createPathExpressionOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionOr <em>Path Expression Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionOr
	 * @generated
	 */
	public Adapter createPathExpressionOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.PathExpressionStep <em>Path Expression Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.PathExpressionStep
	 * @generated
	 */
	public Adapter createPathExpressionStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpression <em>Content Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpression
	 * @generated
	 */
	public Adapter createContentExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionOr <em>Content Expression Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionOr
	 * @generated
	 */
	public Adapter createContentExpressionOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionList <em>Content Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionList
	 * @generated
	 */
	public Adapter createContentExpressionListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionStar <em>Content Expression Star</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionStar
	 * @generated
	 */
	public Adapter createContentExpressionStarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionPlus <em>Content Expression Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionPlus
	 * @generated
	 */
	public Adapter createContentExpressionPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionOption <em>Content Expression Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionOption
	 * @generated
	 */
	public Adapter createContentExpressionOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionToken <em>Content Expression Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionToken
	 * @generated
	 */
	public Adapter createContentExpressionTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionString <em>Content Expression String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionString
	 * @generated
	 */
	public Adapter createContentExpressionStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionANY <em>Content Expression ANY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionANY
	 * @generated
	 */
	public Adapter createContentExpressionANYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionEMPTY <em>Content Expression EMPTY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionEMPTY
	 * @generated
	 */
	public Adapter createContentExpressionEMPTYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionSOMETHING <em>Content Expression SOMETHING</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionSOMETHING
	 * @generated
	 */
	public Adapter createContentExpressionSOMETHINGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison <em>Content Expression Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison
	 * @generated
	 */
	public Adapter createContentExpressionComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparisonR2L <em>Content Expression Comparison R2L</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparisonR2L
	 * @generated
	 */
	public Adapter createContentExpressionComparisonR2LAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.TLContentExpressionList <em>TL Content Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLContentExpressionList
	 * @generated
	 */
	public Adapter createTLContentExpressionListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.TypeSpecifier <em>Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.TypeSpecifier
	 * @generated
	 */
	public Adapter createTypeSpecifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.CompoundTypeSpecifier <em>Compound Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.CompoundTypeSpecifier
	 * @generated
	 */
	public Adapter createCompoundTypeSpecifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.ListTypeSpecifier <em>List Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.ListTypeSpecifier
	 * @generated
	 */
	public Adapter createListTypeSpecifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.TLElement <em>TL Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLElement
	 * @generated
	 */
	public Adapter createTLElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.TLVariable <em>TL Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLVariable
	 * @generated
	 */
	public Adapter createTLVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.TLOutputPrimitive <em>TL Output Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLOutputPrimitive
	 * @generated
	 */
	public Adapter createTLOutputPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.TLOutputConstant <em>TL Output Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLOutputConstant
	 * @generated
	 */
	public Adapter createTLOutputConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.TLOutputVariable <em>TL Output Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLOutputVariable
	 * @generated
	 */
	public Adapter createTLOutputVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.TLStatement <em>TL Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLStatement
	 * @generated
	 */
	public Adapter createTLStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.TLOutput <em>TL Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLOutput
	 * @generated
	 */
	public Adapter createTLOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.TLLoop <em>TL Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLLoop
	 * @generated
	 */
	public Adapter createTLLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.TLIf <em>TL If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLIf
	 * @generated
	 */
	public Adapter createTLIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.TLBoolExpr <em>TL Bool Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLBoolExpr
	 * @generated
	 */
	public Adapter createTLBoolExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.TLBoolExprEmpty <em>TL Bool Expr Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLBoolExprEmpty
	 * @generated
	 */
	public Adapter createTLBoolExprEmptyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai7.csv_validator.sculpt.TLBoolExprNot <em>TL Bool Expr Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai7.csv_validator.sculpt.TLBoolExprNot
	 * @generated
	 */
	public Adapter createTLBoolExprNotAdapter() {
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

} //SculptAdapterFactory

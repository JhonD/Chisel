/**
 */
package de.ubt.ai7.csv_validator.sculpt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage
 * @generated
 */
public interface SculptFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SculptFactory eINSTANCE = de.ubt.ai7.csv_validator.sculpt.impl.SculptFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sculpt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sculpt</em>'.
	 * @generated
	 */
	Sculpt createSculpt();

	/**
	 * Returns a new object of class '<em>Schema Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema Element</em>'.
	 * @generated
	 */
	SchemaElement createSchemaElement();

	/**
	 * Returns a new object of class '<em>Delimiters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delimiters</em>'.
	 * @generated
	 */
	Delimiters createDelimiters();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token</em>'.
	 * @generated
	 */
	Token createToken();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Content Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Constraint</em>'.
	 * @generated
	 */
	ContentConstraint createContentConstraint();

	/**
	 * Returns a new object of class '<em>Relation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Constraint</em>'.
	 * @generated
	 */
	RelationConstraint createRelationConstraint();

	/**
	 * Returns a new object of class '<em>Primary Key Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primary Key Constraint</em>'.
	 * @generated
	 */
	PrimaryKeyConstraint createPrimaryKeyConstraint();

	/**
	 * Returns a new object of class '<em>Foreign Key Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foreign Key Constraint</em>'.
	 * @generated
	 */
	ForeignKeyConstraint createForeignKeyConstraint();

	/**
	 * Returns a new object of class '<em>Transformation Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Program</em>'.
	 * @generated
	 */
	TransformationProgram createTransformationProgram();

	/**
	 * Returns a new object of class '<em>Tuple Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuple Selector</em>'.
	 * @generated
	 */
	TupleSelector createTupleSelector();

	/**
	 * Returns a new object of class '<em>Content Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Expression</em>'.
	 * @generated
	 */
	ContentExpression createContentExpression();

	/**
	 * Returns a new object of class '<em>Node Expression Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Expression Or</em>'.
	 * @generated
	 */
	NodeExpressionOr createNodeExpressionOr();

	/**
	 * Returns a new object of class '<em>Node Expression And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Expression And</em>'.
	 * @generated
	 */
	NodeExpressionAnd createNodeExpressionAnd();

	/**
	 * Returns a new object of class '<em>Node Expression Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Expression Not</em>'.
	 * @generated
	 */
	NodeExpressionNot createNodeExpressionNot();

	/**
	 * Returns a new object of class '<em>Node Expression Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Expression Path</em>'.
	 * @generated
	 */
	NodeExpressionPath createNodeExpressionPath();

	/**
	 * Returns a new object of class '<em>Node Expression Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Expression Token</em>'.
	 * @generated
	 */
	NodeExpressionToken createNodeExpressionToken();

	/**
	 * Returns a new object of class '<em>Node Expression Coordinate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Expression Coordinate</em>'.
	 * @generated
	 */
	NodeExpressionCoordinate createNodeExpressionCoordinate();

	/**
	 * Returns a new object of class '<em>Node Expression Complete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Expression Complete</em>'.
	 * @generated
	 */
	NodeExpressionComplete createNodeExpressionComplete();

	/**
	 * Returns a new object of class '<em>Node Expression Row Col</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Expression Row Col</em>'.
	 * @generated
	 */
	NodeExpressionRowCol createNodeExpressionRowCol();

	/**
	 * Returns a new object of class '<em>Node Expression Row Col Coordinate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Expression Row Col Coordinate</em>'.
	 * @generated
	 */
	NodeExpressionRowColCoordinate createNodeExpressionRowColCoordinate();

	/**
	 * Returns a new object of class '<em>Node Expression Row Col Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Expression Row Col Token</em>'.
	 * @generated
	 */
	NodeExpressionRowColToken createNodeExpressionRowColToken();

	/**
	 * Returns a new object of class '<em>Node Expression Row Col String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Expression Row Col String</em>'.
	 * @generated
	 */
	NodeExpressionRowColString createNodeExpressionRowColString();

	/**
	 * Returns a new object of class '<em>Node Expression Row Col Last</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Expression Row Col Last</em>'.
	 * @generated
	 */
	NodeExpressionRowColLast createNodeExpressionRowColLast();

	/**
	 * Returns a new object of class '<em>Path Expression Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Expression Predicate</em>'.
	 * @generated
	 */
	PathExpressionPredicate createPathExpressionPredicate();

	/**
	 * Returns a new object of class '<em>Path Expression List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Expression List</em>'.
	 * @generated
	 */
	PathExpressionList createPathExpressionList();

	/**
	 * Returns a new object of class '<em>Path Expression Star</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Expression Star</em>'.
	 * @generated
	 */
	PathExpressionStar createPathExpressionStar();

	/**
	 * Returns a new object of class '<em>Path Expression Plus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Expression Plus</em>'.
	 * @generated
	 */
	PathExpressionPlus createPathExpressionPlus();

	/**
	 * Returns a new object of class '<em>Path Expression Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Expression Option</em>'.
	 * @generated
	 */
	PathExpressionOption createPathExpressionOption();

	/**
	 * Returns a new object of class '<em>Path Expression Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Expression Or</em>'.
	 * @generated
	 */
	PathExpressionOr createPathExpressionOr();

	/**
	 * Returns a new object of class '<em>Path Expression Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Expression Step</em>'.
	 * @generated
	 */
	PathExpressionStep createPathExpressionStep();

	/**
	 * Returns a new object of class '<em>Content Expression Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Expression Or</em>'.
	 * @generated
	 */
	ContentExpressionOr createContentExpressionOr();

	/**
	 * Returns a new object of class '<em>Content Expression List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Expression List</em>'.
	 * @generated
	 */
	ContentExpressionList createContentExpressionList();

	/**
	 * Returns a new object of class '<em>Content Expression Star</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Expression Star</em>'.
	 * @generated
	 */
	ContentExpressionStar createContentExpressionStar();

	/**
	 * Returns a new object of class '<em>Content Expression Plus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Expression Plus</em>'.
	 * @generated
	 */
	ContentExpressionPlus createContentExpressionPlus();

	/**
	 * Returns a new object of class '<em>Content Expression Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Expression Option</em>'.
	 * @generated
	 */
	ContentExpressionOption createContentExpressionOption();

	/**
	 * Returns a new object of class '<em>Content Expression Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Expression Token</em>'.
	 * @generated
	 */
	ContentExpressionToken createContentExpressionToken();

	/**
	 * Returns a new object of class '<em>Content Expression Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Expression Comparison</em>'.
	 * @generated
	 */
	ContentExpressionComparison createContentExpressionComparison();

	/**
	 * Returns a new object of class '<em>Content Expression Comparison R2L</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Expression Comparison R2L</em>'.
	 * @generated
	 */
	ContentExpressionComparisonR2L createContentExpressionComparisonR2L();

	/**
	 * Returns a new object of class '<em>TL Content Expression List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TL Content Expression List</em>'.
	 * @generated
	 */
	TLContentExpressionList createTLContentExpressionList();

	/**
	 * Returns a new object of class '<em>Content Expression String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Expression String</em>'.
	 * @generated
	 */
	ContentExpressionString createContentExpressionString();

	/**
	 * Returns a new object of class '<em>Content Expression ANY</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Expression ANY</em>'.
	 * @generated
	 */
	ContentExpressionANY createContentExpressionANY();

	/**
	 * Returns a new object of class '<em>Content Expression EMPTY</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Expression EMPTY</em>'.
	 * @generated
	 */
	ContentExpressionEMPTY createContentExpressionEMPTY();

	/**
	 * Returns a new object of class '<em>Content Expression SOMETHING</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Expression SOMETHING</em>'.
	 * @generated
	 */
	ContentExpressionSOMETHING createContentExpressionSOMETHING();

	/**
	 * Returns a new object of class '<em>Type Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Specifier</em>'.
	 * @generated
	 */
	TypeSpecifier createTypeSpecifier();

	/**
	 * Returns a new object of class '<em>Compound Type Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound Type Specifier</em>'.
	 * @generated
	 */
	CompoundTypeSpecifier createCompoundTypeSpecifier();

	/**
	 * Returns a new object of class '<em>List Type Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Type Specifier</em>'.
	 * @generated
	 */
	ListTypeSpecifier createListTypeSpecifier();

	/**
	 * Returns a new object of class '<em>TL Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TL Element</em>'.
	 * @generated
	 */
	TLElement createTLElement();

	/**
	 * Returns a new object of class '<em>TL Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TL Variable</em>'.
	 * @generated
	 */
	TLVariable createTLVariable();

	/**
	 * Returns a new object of class '<em>TL Output Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TL Output Primitive</em>'.
	 * @generated
	 */
	TLOutputPrimitive createTLOutputPrimitive();

	/**
	 * Returns a new object of class '<em>TL Output Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TL Output Constant</em>'.
	 * @generated
	 */
	TLOutputConstant createTLOutputConstant();

	/**
	 * Returns a new object of class '<em>TL Output Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TL Output Variable</em>'.
	 * @generated
	 */
	TLOutputVariable createTLOutputVariable();

	/**
	 * Returns a new object of class '<em>TL Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TL Statement</em>'.
	 * @generated
	 */
	TLStatement createTLStatement();

	/**
	 * Returns a new object of class '<em>TL Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TL Output</em>'.
	 * @generated
	 */
	TLOutput createTLOutput();

	/**
	 * Returns a new object of class '<em>TL Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TL Loop</em>'.
	 * @generated
	 */
	TLLoop createTLLoop();

	/**
	 * Returns a new object of class '<em>TL If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TL If</em>'.
	 * @generated
	 */
	TLIf createTLIf();

	/**
	 * Returns a new object of class '<em>TL Bool Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TL Bool Expr</em>'.
	 * @generated
	 */
	TLBoolExpr createTLBoolExpr();

	/**
	 * Returns a new object of class '<em>TL Bool Expr Empty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TL Bool Expr Empty</em>'.
	 * @generated
	 */
	TLBoolExprEmpty createTLBoolExprEmpty();

	/**
	 * Returns a new object of class '<em>TL Bool Expr Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TL Bool Expr Not</em>'.
	 * @generated
	 */
	TLBoolExprNot createTLBoolExprNot();

	/**
	 * Returns a new object of class '<em>Node Expression Comparison R2L</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Expression Comparison R2L</em>'.
	 * @generated
	 */
	NodeExpressionComparisonR2L createNodeExpressionComparisonR2L();

	/**
	 * Returns a new object of class '<em>Region Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region Token</em>'.
	 * @generated
	 */
	RegionToken createRegionToken();

	/**
	 * Returns a new object of class '<em>Atomic Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Type</em>'.
	 * @generated
	 */
	AtomicType createAtomicType();

	/**
	 * Returns a new object of class '<em>Compound Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound Type</em>'.
	 * @generated
	 */
	CompoundType createCompoundType();

	/**
	 * Returns a new object of class '<em>List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Type</em>'.
	 * @generated
	 */
	ListType createListType();

	/**
	 * Returns a new object of class '<em>Compound Type Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound Type Primitive</em>'.
	 * @generated
	 */
	CompoundTypePrimitive createCompoundTypePrimitive();

	/**
	 * Returns a new object of class '<em>Node Expression Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Expression Comparison</em>'.
	 * @generated
	 */
	NodeExpressionComparison createNodeExpressionComparison();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SculptPackage getSculptPackage();

} //SculptFactory

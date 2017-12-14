/**
 */
package de.ubt.ai7.csv_validator.sculpt.util;

import de.ubt.ai7.csv_validator.sculpt.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.ubt.ai7.csv_validator.sculpt.AbstractToken;
import de.ubt.ai7.csv_validator.sculpt.AtomicType;
import de.ubt.ai7.csv_validator.sculpt.CompoundType;
import de.ubt.ai7.csv_validator.sculpt.CompoundTypePrimitive;
import de.ubt.ai7.csv_validator.sculpt.CompoundTypeSpecifier;
import de.ubt.ai7.csv_validator.sculpt.Constraint;
import de.ubt.ai7.csv_validator.sculpt.ContentConstraint;
import de.ubt.ai7.csv_validator.sculpt.ContentExpression;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionANY;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparisonR2L;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionEMPTY;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionList;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionOption;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionOr;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionPlus;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionSOMETHING;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionStar;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionString;
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionToken;
import de.ubt.ai7.csv_validator.sculpt.Delimiters;
import de.ubt.ai7.csv_validator.sculpt.ForeignKeyConstraint;
import de.ubt.ai7.csv_validator.sculpt.ListType;
import de.ubt.ai7.csv_validator.sculpt.ListTypeSpecifier;
import de.ubt.ai7.csv_validator.sculpt.NodeExpression;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionAnd;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparisonR2L;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionComplete;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionCoordinate;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionNot;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionOr;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionPath;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionPrimitive;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowCol;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColCoordinate;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColLast;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColString;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionRowColToken;
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionToken;
import de.ubt.ai7.csv_validator.sculpt.PathExpression;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionList;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionOption;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionOr;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionPlus;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionPredicate;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionStar;
import de.ubt.ai7.csv_validator.sculpt.PathExpressionStep;
import de.ubt.ai7.csv_validator.sculpt.PrimaryKeyConstraint;
import de.ubt.ai7.csv_validator.sculpt.RegionToken;
import de.ubt.ai7.csv_validator.sculpt.RelationConstraint;
import de.ubt.ai7.csv_validator.sculpt.SchemaElement;
import de.ubt.ai7.csv_validator.sculpt.Sculpt;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.TLContentExpressionList;
import de.ubt.ai7.csv_validator.sculpt.TLElement;
import de.ubt.ai7.csv_validator.sculpt.TLLoop;
import de.ubt.ai7.csv_validator.sculpt.TLOutput;
import de.ubt.ai7.csv_validator.sculpt.TLOutputConstant;
import de.ubt.ai7.csv_validator.sculpt.TLOutputPrimitive;
import de.ubt.ai7.csv_validator.sculpt.TLOutputVariable;
import de.ubt.ai7.csv_validator.sculpt.TLStatement;
import de.ubt.ai7.csv_validator.sculpt.TLVariable;
import de.ubt.ai7.csv_validator.sculpt.Token;
import de.ubt.ai7.csv_validator.sculpt.TransformationProgram;
import de.ubt.ai7.csv_validator.sculpt.TupleSelector;
import de.ubt.ai7.csv_validator.sculpt.Type;
import de.ubt.ai7.csv_validator.sculpt.TypeSpecifier;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage
 * @generated
 */
public class SculptSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static SculptPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public SculptSwitch() {
		if (modelPackage == null) {
			modelPackage = SculptPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param ePackage
	 *            the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SculptPackage.SCULPT: {
				Sculpt sculpt = (Sculpt)theEObject;
				T result = caseSculpt(sculpt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.SCHEMA_ELEMENT: {
				SchemaElement schemaElement = (SchemaElement)theEObject;
				T result = caseSchemaElement(schemaElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.DELIMITERS: {
				Delimiters delimiters = (Delimiters)theEObject;
				T result = caseDelimiters(delimiters);
				if (result == null) result = caseSchemaElement(delimiters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.ABSTRACT_TOKEN: {
				AbstractToken abstractToken = (AbstractToken)theEObject;
				T result = caseAbstractToken(abstractToken);
				if (result == null) result = caseSchemaElement(abstractToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseToken(type);
				if (result == null) result = caseAbstractToken(type);
				if (result == null) result = caseSchemaElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.ATOMIC_TYPE: {
				AtomicType atomicType = (AtomicType)theEObject;
				T result = caseAtomicType(atomicType);
				if (result == null) result = caseType(atomicType);
				if (result == null) result = caseToken(atomicType);
				if (result == null) result = caseAbstractToken(atomicType);
				if (result == null) result = caseSchemaElement(atomicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.COMPOUND_TYPE: {
				CompoundType compoundType = (CompoundType)theEObject;
				T result = caseCompoundType(compoundType);
				if (result == null) result = caseType(compoundType);
				if (result == null) result = caseToken(compoundType);
				if (result == null) result = caseAbstractToken(compoundType);
				if (result == null) result = caseSchemaElement(compoundType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.LIST_TYPE: {
				ListType listType = (ListType)theEObject;
				T result = caseListType(listType);
				if (result == null) result = caseType(listType);
				if (result == null) result = caseToken(listType);
				if (result == null) result = caseAbstractToken(listType);
				if (result == null) result = caseSchemaElement(listType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.COMPOUND_TYPE_PRIMITIVE: {
				CompoundTypePrimitive compoundTypePrimitive = (CompoundTypePrimitive)theEObject;
				T result = caseCompoundTypePrimitive(compoundTypePrimitive);
				if (result == null) result = caseSchemaElement(compoundTypePrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.TOKEN: {
				Token token = (Token)theEObject;
				T result = caseToken(token);
				if (result == null) result = caseAbstractToken(token);
				if (result == null) result = caseSchemaElement(token);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.REGION_TOKEN: {
				RegionToken regionToken = (RegionToken)theEObject;
				T result = caseRegionToken(regionToken);
				if (result == null) result = caseAbstractToken(regionToken);
				if (result == null) result = caseSchemaElement(regionToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = caseSchemaElement(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.CONTENT_CONSTRAINT: {
				ContentConstraint contentConstraint = (ContentConstraint)theEObject;
				T result = caseContentConstraint(contentConstraint);
				if (result == null) result = caseConstraint(contentConstraint);
				if (result == null) result = caseSchemaElement(contentConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.RELATION_CONSTRAINT: {
				RelationConstraint relationConstraint = (RelationConstraint)theEObject;
				T result = caseRelationConstraint(relationConstraint);
				if (result == null) result = caseConstraint(relationConstraint);
				if (result == null) result = caseSchemaElement(relationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.PRIMARY_KEY_CONSTRAINT: {
				PrimaryKeyConstraint primaryKeyConstraint = (PrimaryKeyConstraint)theEObject;
				T result = casePrimaryKeyConstraint(primaryKeyConstraint);
				if (result == null) result = caseRelationConstraint(primaryKeyConstraint);
				if (result == null) result = caseConstraint(primaryKeyConstraint);
				if (result == null) result = caseSchemaElement(primaryKeyConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.FOREIGN_KEY_CONSTRAINT: {
				ForeignKeyConstraint foreignKeyConstraint = (ForeignKeyConstraint)theEObject;
				T result = caseForeignKeyConstraint(foreignKeyConstraint);
				if (result == null) result = caseRelationConstraint(foreignKeyConstraint);
				if (result == null) result = caseConstraint(foreignKeyConstraint);
				if (result == null) result = caseSchemaElement(foreignKeyConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.TRANSFORMATION_PROGRAM: {
				TransformationProgram transformationProgram = (TransformationProgram)theEObject;
				T result = caseTransformationProgram(transformationProgram);
				if (result == null) result = caseSchemaElement(transformationProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.TUPLE_SELECTOR: {
				TupleSelector tupleSelector = (TupleSelector)theEObject;
				T result = caseTupleSelector(tupleSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.NODE_EXPRESSION: {
				NodeExpression nodeExpression = (NodeExpression)theEObject;
				T result = caseNodeExpression(nodeExpression);
				if (result == null) result = casePathExpression(nodeExpression);
				if (result == null) result = caseSchemaElement(nodeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.NODE_EXPRESSION_PRIMITIVE: {
				NodeExpressionPrimitive nodeExpressionPrimitive = (NodeExpressionPrimitive)theEObject;
				T result = caseNodeExpressionPrimitive(nodeExpressionPrimitive);
				if (result == null) result = caseNodeExpression(nodeExpressionPrimitive);
				if (result == null) result = casePathExpression(nodeExpressionPrimitive);
				if (result == null) result = caseSchemaElement(nodeExpressionPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.NODE_EXPRESSION_OR: {
				NodeExpressionOr nodeExpressionOr = (NodeExpressionOr)theEObject;
				T result = caseNodeExpressionOr(nodeExpressionOr);
				if (result == null) result = caseNodeExpression(nodeExpressionOr);
				if (result == null) result = casePathExpression(nodeExpressionOr);
				if (result == null) result = caseSchemaElement(nodeExpressionOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.NODE_EXPRESSION_AND: {
				NodeExpressionAnd nodeExpressionAnd = (NodeExpressionAnd)theEObject;
				T result = caseNodeExpressionAnd(nodeExpressionAnd);
				if (result == null) result = caseNodeExpression(nodeExpressionAnd);
				if (result == null) result = casePathExpression(nodeExpressionAnd);
				if (result == null) result = caseSchemaElement(nodeExpressionAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.NODE_EXPRESSION_NOT: {
				NodeExpressionNot nodeExpressionNot = (NodeExpressionNot)theEObject;
				T result = caseNodeExpressionNot(nodeExpressionNot);
				if (result == null) result = caseNodeExpression(nodeExpressionNot);
				if (result == null) result = casePathExpression(nodeExpressionNot);
				if (result == null) result = caseSchemaElement(nodeExpressionNot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.NODE_EXPRESSION_PATH: {
				NodeExpressionPath nodeExpressionPath = (NodeExpressionPath)theEObject;
				T result = caseNodeExpressionPath(nodeExpressionPath);
				if (result == null) result = caseNodeExpression(nodeExpressionPath);
				if (result == null) result = casePathExpression(nodeExpressionPath);
				if (result == null) result = caseSchemaElement(nodeExpressionPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.NODE_EXPRESSION_TOKEN: {
				NodeExpressionToken nodeExpressionToken = (NodeExpressionToken)theEObject;
				T result = caseNodeExpressionToken(nodeExpressionToken);
				if (result == null) result = caseNodeExpressionPrimitive(nodeExpressionToken);
				if (result == null) result = caseNodeExpression(nodeExpressionToken);
				if (result == null) result = casePathExpression(nodeExpressionToken);
				if (result == null) result = caseSchemaElement(nodeExpressionToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.NODE_EXPRESSION_COORDINATE: {
				NodeExpressionCoordinate nodeExpressionCoordinate = (NodeExpressionCoordinate)theEObject;
				T result = caseNodeExpressionCoordinate(nodeExpressionCoordinate);
				if (result == null) result = caseNodeExpressionPrimitive(nodeExpressionCoordinate);
				if (result == null) result = caseNodeExpression(nodeExpressionCoordinate);
				if (result == null) result = casePathExpression(nodeExpressionCoordinate);
				if (result == null) result = caseSchemaElement(nodeExpressionCoordinate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.NODE_EXPRESSION_COMPLETE: {
				NodeExpressionComplete nodeExpressionComplete = (NodeExpressionComplete)theEObject;
				T result = caseNodeExpressionComplete(nodeExpressionComplete);
				if (result == null) result = caseNodeExpressionPrimitive(nodeExpressionComplete);
				if (result == null) result = caseNodeExpression(nodeExpressionComplete);
				if (result == null) result = casePathExpression(nodeExpressionComplete);
				if (result == null) result = caseSchemaElement(nodeExpressionComplete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.NODE_EXPRESSION_ROW_COL: {
				NodeExpressionRowCol nodeExpressionRowCol = (NodeExpressionRowCol)theEObject;
				T result = caseNodeExpressionRowCol(nodeExpressionRowCol);
				if (result == null) result = caseNodeExpressionPrimitive(nodeExpressionRowCol);
				if (result == null) result = caseNodeExpression(nodeExpressionRowCol);
				if (result == null) result = casePathExpression(nodeExpressionRowCol);
				if (result == null) result = caseSchemaElement(nodeExpressionRowCol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.NODE_EXPRESSION_ROW_COL_COORDINATE: {
				NodeExpressionRowColCoordinate nodeExpressionRowColCoordinate = (NodeExpressionRowColCoordinate)theEObject;
				T result = caseNodeExpressionRowColCoordinate(nodeExpressionRowColCoordinate);
				if (result == null) result = caseNodeExpressionRowCol(nodeExpressionRowColCoordinate);
				if (result == null) result = caseNodeExpressionPrimitive(nodeExpressionRowColCoordinate);
				if (result == null) result = caseNodeExpression(nodeExpressionRowColCoordinate);
				if (result == null) result = casePathExpression(nodeExpressionRowColCoordinate);
				if (result == null) result = caseSchemaElement(nodeExpressionRowColCoordinate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.NODE_EXPRESSION_ROW_COL_TOKEN: {
				NodeExpressionRowColToken nodeExpressionRowColToken = (NodeExpressionRowColToken)theEObject;
				T result = caseNodeExpressionRowColToken(nodeExpressionRowColToken);
				if (result == null) result = caseNodeExpressionRowCol(nodeExpressionRowColToken);
				if (result == null) result = caseNodeExpressionPrimitive(nodeExpressionRowColToken);
				if (result == null) result = caseNodeExpression(nodeExpressionRowColToken);
				if (result == null) result = casePathExpression(nodeExpressionRowColToken);
				if (result == null) result = caseSchemaElement(nodeExpressionRowColToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.NODE_EXPRESSION_ROW_COL_STRING: {
				NodeExpressionRowColString nodeExpressionRowColString = (NodeExpressionRowColString)theEObject;
				T result = caseNodeExpressionRowColString(nodeExpressionRowColString);
				if (result == null) result = caseNodeExpressionRowCol(nodeExpressionRowColString);
				if (result == null) result = caseNodeExpressionPrimitive(nodeExpressionRowColString);
				if (result == null) result = caseNodeExpression(nodeExpressionRowColString);
				if (result == null) result = casePathExpression(nodeExpressionRowColString);
				if (result == null) result = caseSchemaElement(nodeExpressionRowColString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.NODE_EXPRESSION_ROW_COL_LAST: {
				NodeExpressionRowColLast nodeExpressionRowColLast = (NodeExpressionRowColLast)theEObject;
				T result = caseNodeExpressionRowColLast(nodeExpressionRowColLast);
				if (result == null) result = caseNodeExpressionRowCol(nodeExpressionRowColLast);
				if (result == null) result = caseNodeExpressionPrimitive(nodeExpressionRowColLast);
				if (result == null) result = caseNodeExpression(nodeExpressionRowColLast);
				if (result == null) result = casePathExpression(nodeExpressionRowColLast);
				if (result == null) result = caseSchemaElement(nodeExpressionRowColLast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.NODE_EXPRESSION_COMPARISON: {
				NodeExpressionComparison nodeExpressionComparison = (NodeExpressionComparison)theEObject;
				T result = caseNodeExpressionComparison(nodeExpressionComparison);
				if (result == null) result = caseNodeExpression(nodeExpressionComparison);
				if (result == null) result = casePathExpression(nodeExpressionComparison);
				if (result == null) result = caseSchemaElement(nodeExpressionComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.NODE_EXPRESSION_COMPARISON_R2L: {
				NodeExpressionComparisonR2L nodeExpressionComparisonR2L = (NodeExpressionComparisonR2L)theEObject;
				T result = caseNodeExpressionComparisonR2L(nodeExpressionComparisonR2L);
				if (result == null) result = caseNodeExpressionComparison(nodeExpressionComparisonR2L);
				if (result == null) result = caseNodeExpression(nodeExpressionComparisonR2L);
				if (result == null) result = casePathExpression(nodeExpressionComparisonR2L);
				if (result == null) result = caseSchemaElement(nodeExpressionComparisonR2L);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.PATH_EXPRESSION_PREDICATE: {
				PathExpressionPredicate pathExpressionPredicate = (PathExpressionPredicate)theEObject;
				T result = casePathExpressionPredicate(pathExpressionPredicate);
				if (result == null) result = caseNodeExpression(pathExpressionPredicate);
				if (result == null) result = casePathExpression(pathExpressionPredicate);
				if (result == null) result = caseSchemaElement(pathExpressionPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.PATH_EXPRESSION: {
				PathExpression pathExpression = (PathExpression)theEObject;
				T result = casePathExpression(pathExpression);
				if (result == null) result = caseSchemaElement(pathExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.PATH_EXPRESSION_LIST: {
				PathExpressionList pathExpressionList = (PathExpressionList)theEObject;
				T result = casePathExpressionList(pathExpressionList);
				if (result == null) result = casePathExpression(pathExpressionList);
				if (result == null) result = caseSchemaElement(pathExpressionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.PATH_EXPRESSION_STAR: {
				PathExpressionStar pathExpressionStar = (PathExpressionStar)theEObject;
				T result = casePathExpressionStar(pathExpressionStar);
				if (result == null) result = casePathExpression(pathExpressionStar);
				if (result == null) result = caseSchemaElement(pathExpressionStar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.PATH_EXPRESSION_PLUS: {
				PathExpressionPlus pathExpressionPlus = (PathExpressionPlus)theEObject;
				T result = casePathExpressionPlus(pathExpressionPlus);
				if (result == null) result = casePathExpression(pathExpressionPlus);
				if (result == null) result = caseSchemaElement(pathExpressionPlus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.PATH_EXPRESSION_OPTION: {
				PathExpressionOption pathExpressionOption = (PathExpressionOption)theEObject;
				T result = casePathExpressionOption(pathExpressionOption);
				if (result == null) result = casePathExpression(pathExpressionOption);
				if (result == null) result = caseSchemaElement(pathExpressionOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.PATH_EXPRESSION_OR: {
				PathExpressionOr pathExpressionOr = (PathExpressionOr)theEObject;
				T result = casePathExpressionOr(pathExpressionOr);
				if (result == null) result = casePathExpression(pathExpressionOr);
				if (result == null) result = caseSchemaElement(pathExpressionOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.PATH_EXPRESSION_STEP: {
				PathExpressionStep pathExpressionStep = (PathExpressionStep)theEObject;
				T result = casePathExpressionStep(pathExpressionStep);
				if (result == null) result = casePathExpression(pathExpressionStep);
				if (result == null) result = caseSchemaElement(pathExpressionStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.CONTENT_EXPRESSION: {
				ContentExpression contentExpression = (ContentExpression)theEObject;
				T result = caseContentExpression(contentExpression);
				if (result == null) result = caseSchemaElement(contentExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.CONTENT_EXPRESSION_OR: {
				ContentExpressionOr contentExpressionOr = (ContentExpressionOr)theEObject;
				T result = caseContentExpressionOr(contentExpressionOr);
				if (result == null) result = caseContentExpression(contentExpressionOr);
				if (result == null) result = caseSchemaElement(contentExpressionOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.CONTENT_EXPRESSION_LIST: {
				ContentExpressionList contentExpressionList = (ContentExpressionList)theEObject;
				T result = caseContentExpressionList(contentExpressionList);
				if (result == null) result = caseContentExpression(contentExpressionList);
				if (result == null) result = caseSchemaElement(contentExpressionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.CONTENT_EXPRESSION_STAR: {
				ContentExpressionStar contentExpressionStar = (ContentExpressionStar)theEObject;
				T result = caseContentExpressionStar(contentExpressionStar);
				if (result == null) result = caseContentExpression(contentExpressionStar);
				if (result == null) result = caseSchemaElement(contentExpressionStar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.CONTENT_EXPRESSION_PLUS: {
				ContentExpressionPlus contentExpressionPlus = (ContentExpressionPlus)theEObject;
				T result = caseContentExpressionPlus(contentExpressionPlus);
				if (result == null) result = caseContentExpression(contentExpressionPlus);
				if (result == null) result = caseSchemaElement(contentExpressionPlus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.CONTENT_EXPRESSION_OPTION: {
				ContentExpressionOption contentExpressionOption = (ContentExpressionOption)theEObject;
				T result = caseContentExpressionOption(contentExpressionOption);
				if (result == null) result = caseContentExpression(contentExpressionOption);
				if (result == null) result = caseSchemaElement(contentExpressionOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.CONTENT_EXPRESSION_TOKEN: {
				ContentExpressionToken contentExpressionToken = (ContentExpressionToken)theEObject;
				T result = caseContentExpressionToken(contentExpressionToken);
				if (result == null) result = caseContentExpression(contentExpressionToken);
				if (result == null) result = caseSchemaElement(contentExpressionToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.CONTENT_EXPRESSION_STRING: {
				ContentExpressionString contentExpressionString = (ContentExpressionString)theEObject;
				T result = caseContentExpressionString(contentExpressionString);
				if (result == null) result = caseContentExpression(contentExpressionString);
				if (result == null) result = caseSchemaElement(contentExpressionString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.CONTENT_EXPRESSION_ANY: {
				ContentExpressionANY contentExpressionANY = (ContentExpressionANY)theEObject;
				T result = caseContentExpressionANY(contentExpressionANY);
				if (result == null) result = caseContentExpression(contentExpressionANY);
				if (result == null) result = caseSchemaElement(contentExpressionANY);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.CONTENT_EXPRESSION_EMPTY: {
				ContentExpressionEMPTY contentExpressionEMPTY = (ContentExpressionEMPTY)theEObject;
				T result = caseContentExpressionEMPTY(contentExpressionEMPTY);
				if (result == null) result = caseContentExpression(contentExpressionEMPTY);
				if (result == null) result = caseSchemaElement(contentExpressionEMPTY);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.CONTENT_EXPRESSION_SOMETHING: {
				ContentExpressionSOMETHING contentExpressionSOMETHING = (ContentExpressionSOMETHING)theEObject;
				T result = caseContentExpressionSOMETHING(contentExpressionSOMETHING);
				if (result == null) result = caseContentExpression(contentExpressionSOMETHING);
				if (result == null) result = caseSchemaElement(contentExpressionSOMETHING);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON: {
				ContentExpressionComparison contentExpressionComparison = (ContentExpressionComparison)theEObject;
				T result = caseContentExpressionComparison(contentExpressionComparison);
				if (result == null) result = caseContentExpression(contentExpressionComparison);
				if (result == null) result = caseSchemaElement(contentExpressionComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.CONTENT_EXPRESSION_COMPARISON_R2L: {
				ContentExpressionComparisonR2L contentExpressionComparisonR2L = (ContentExpressionComparisonR2L)theEObject;
				T result = caseContentExpressionComparisonR2L(contentExpressionComparisonR2L);
				if (result == null) result = caseContentExpressionComparison(contentExpressionComparisonR2L);
				if (result == null) result = caseContentExpression(contentExpressionComparisonR2L);
				if (result == null) result = caseSchemaElement(contentExpressionComparisonR2L);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.TL_CONTENT_EXPRESSION_LIST: {
				TLContentExpressionList tlContentExpressionList = (TLContentExpressionList)theEObject;
				T result = caseTLContentExpressionList(tlContentExpressionList);
				if (result == null) result = caseContentExpression(tlContentExpressionList);
				if (result == null) result = caseSchemaElement(tlContentExpressionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.TYPE_SPECIFIER: {
				TypeSpecifier typeSpecifier = (TypeSpecifier)theEObject;
				T result = caseTypeSpecifier(typeSpecifier);
				if (result == null) result = caseSchemaElement(typeSpecifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.COMPOUND_TYPE_SPECIFIER: {
				CompoundTypeSpecifier compoundTypeSpecifier = (CompoundTypeSpecifier)theEObject;
				T result = caseCompoundTypeSpecifier(compoundTypeSpecifier);
				if (result == null) result = caseTypeSpecifier(compoundTypeSpecifier);
				if (result == null) result = caseSchemaElement(compoundTypeSpecifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.LIST_TYPE_SPECIFIER: {
				ListTypeSpecifier listTypeSpecifier = (ListTypeSpecifier)theEObject;
				T result = caseListTypeSpecifier(listTypeSpecifier);
				if (result == null) result = caseTypeSpecifier(listTypeSpecifier);
				if (result == null) result = caseSchemaElement(listTypeSpecifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.TL_ELEMENT: {
				TLElement tlElement = (TLElement)theEObject;
				T result = caseTLElement(tlElement);
				if (result == null) result = caseSchemaElement(tlElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.TL_VARIABLE: {
				TLVariable tlVariable = (TLVariable)theEObject;
				T result = caseTLVariable(tlVariable);
				if (result == null) result = caseAbstractToken(tlVariable);
				if (result == null) result = caseSchemaElement(tlVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.TL_OUTPUT_PRIMITIVE: {
				TLOutputPrimitive tlOutputPrimitive = (TLOutputPrimitive)theEObject;
				T result = caseTLOutputPrimitive(tlOutputPrimitive);
				if (result == null) result = caseTLElement(tlOutputPrimitive);
				if (result == null) result = caseSchemaElement(tlOutputPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.TL_OUTPUT_CONSTANT: {
				TLOutputConstant tlOutputConstant = (TLOutputConstant)theEObject;
				T result = caseTLOutputConstant(tlOutputConstant);
				if (result == null) result = caseTLOutputPrimitive(tlOutputConstant);
				if (result == null) result = caseTLElement(tlOutputConstant);
				if (result == null) result = caseSchemaElement(tlOutputConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.TL_OUTPUT_VARIABLE: {
				TLOutputVariable tlOutputVariable = (TLOutputVariable)theEObject;
				T result = caseTLOutputVariable(tlOutputVariable);
				if (result == null) result = caseTLOutputPrimitive(tlOutputVariable);
				if (result == null) result = caseTLElement(tlOutputVariable);
				if (result == null) result = caseSchemaElement(tlOutputVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.TL_STATEMENT: {
				TLStatement tlStatement = (TLStatement)theEObject;
				T result = caseTLStatement(tlStatement);
				if (result == null) result = caseTLElement(tlStatement);
				if (result == null) result = caseSchemaElement(tlStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.TL_OUTPUT: {
				TLOutput tlOutput = (TLOutput)theEObject;
				T result = caseTLOutput(tlOutput);
				if (result == null) result = caseTLStatement(tlOutput);
				if (result == null) result = caseTLElement(tlOutput);
				if (result == null) result = caseSchemaElement(tlOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.TL_LOOP: {
				TLLoop tlLoop = (TLLoop)theEObject;
				T result = caseTLLoop(tlLoop);
				if (result == null) result = caseTLStatement(tlLoop);
				if (result == null) result = caseTLElement(tlLoop);
				if (result == null) result = caseSchemaElement(tlLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.TL_IF: {
				TLIf tlIf = (TLIf)theEObject;
				T result = caseTLIf(tlIf);
				if (result == null) result = caseTLStatement(tlIf);
				if (result == null) result = caseTLElement(tlIf);
				if (result == null) result = caseSchemaElement(tlIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.TL_BOOL_EXPR: {
				TLBoolExpr tlBoolExpr = (TLBoolExpr)theEObject;
				T result = caseTLBoolExpr(tlBoolExpr);
				if (result == null) result = caseTLElement(tlBoolExpr);
				if (result == null) result = caseSchemaElement(tlBoolExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.TL_BOOL_EXPR_EMPTY: {
				TLBoolExprEmpty tlBoolExprEmpty = (TLBoolExprEmpty)theEObject;
				T result = caseTLBoolExprEmpty(tlBoolExprEmpty);
				if (result == null) result = caseTLBoolExpr(tlBoolExprEmpty);
				if (result == null) result = caseTLElement(tlBoolExprEmpty);
				if (result == null) result = caseSchemaElement(tlBoolExprEmpty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptPackage.TL_BOOL_EXPR_NOT: {
				TLBoolExprNot tlBoolExprNot = (TLBoolExprNot)theEObject;
				T result = caseTLBoolExprNot(tlBoolExprNot);
				if (result == null) result = caseTLBoolExpr(tlBoolExprNot);
				if (result == null) result = caseTLElement(tlBoolExprNot);
				if (result == null) result = caseSchemaElement(tlBoolExprNot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sculpt</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sculpt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSculpt(Sculpt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Element</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaElement(SchemaElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delimiters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delimiters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelimiters(Delimiters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToken(Token object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationProgram(TransformationProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleSelector(TupleSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Expression</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathExpression(PathExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Expression List</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Expression List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathExpressionList(PathExpressionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Expression</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentExpression(ContentExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Expression</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeExpression(NodeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Expression Primitive</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Expression Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeExpressionPrimitive(NodeExpressionPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Expression Or</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Expression Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeExpressionOr(NodeExpressionOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Expression And</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Expression And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeExpressionAnd(NodeExpressionAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Expression Not</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Expression Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeExpressionNot(NodeExpressionNot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Expression Path</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Expression Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeExpressionPath(NodeExpressionPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Expression Coordinate</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Expression Coordinate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeExpressionCoordinate(NodeExpressionCoordinate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Expression Token</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Expression Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeExpressionToken(NodeExpressionToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Expression Complete</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Expression Complete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeExpressionComplete(NodeExpressionComplete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Expression Row Col</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Expression Row Col</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeExpressionRowCol(NodeExpressionRowCol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Expression Row Col Coordinate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Expression Row Col Coordinate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeExpressionRowColCoordinate(NodeExpressionRowColCoordinate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Expression Row Col Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Expression Row Col Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeExpressionRowColToken(NodeExpressionRowColToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Expression Row Col String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Expression Row Col String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeExpressionRowColString(NodeExpressionRowColString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Expression Row Col Last</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Expression Row Col Last</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeExpressionRowColLast(NodeExpressionRowColLast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Expression Predicate</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Expression Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathExpressionPredicate(PathExpressionPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Expression Star</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Expression Star</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathExpressionStar(PathExpressionStar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Expression Plus</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Expression Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathExpressionPlus(PathExpressionPlus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Expression Option</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Expression Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathExpressionOption(PathExpressionOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Expression Or</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Expression Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathExpressionOr(PathExpressionOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Expression Step</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Expression Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathExpressionStep(PathExpressionStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Expression Or</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Expression Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentExpressionOr(ContentExpressionOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Expression List</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Expression List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentExpressionList(ContentExpressionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Expression Star</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Expression Star</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentExpressionStar(ContentExpressionStar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Expression Plus</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Expression Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentExpressionPlus(ContentExpressionPlus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Expression Option</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Expression Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentExpressionOption(ContentExpressionOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Expression Token</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Expression Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentExpressionToken(ContentExpressionToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Expression Comparison</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Expression Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentExpressionComparison(ContentExpressionComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Expression Comparison R2L</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Expression Comparison R2L</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentExpressionComparisonR2L(ContentExpressionComparisonR2L object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TL Content Expression List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TL Content Expression List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLContentExpressionList(TLContentExpressionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Expression String</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Expression String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentExpressionString(ContentExpressionString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Expression ANY</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Expression ANY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentExpressionANY(ContentExpressionANY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Expression EMPTY</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Expression EMPTY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentExpressionEMPTY(ContentExpressionEMPTY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Expression SOMETHING</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Expression SOMETHING</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentExpressionSOMETHING(ContentExpressionSOMETHING object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Specifier</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Specifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSpecifier(TypeSpecifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Type Specifier</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Type Specifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundTypeSpecifier(CompoundTypeSpecifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Type Specifier</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Type Specifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListTypeSpecifier(ListTypeSpecifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TL Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TL Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLElement(TLElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TL Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TL Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLVariable(TLVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TL Output Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TL Output Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLOutputPrimitive(TLOutputPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TL Output Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TL Output Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLOutputConstant(TLOutputConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TL Output Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TL Output Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLOutputVariable(TLOutputVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TL Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TL Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLStatement(TLStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TL Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TL Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLOutput(TLOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TL Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TL Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLLoop(TLLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TL If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TL If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLIf(TLIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TL Bool Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TL Bool Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLBoolExpr(TLBoolExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TL Bool Expr Empty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TL Bool Expr Empty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLBoolExprEmpty(TLBoolExprEmpty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TL Bool Expr Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TL Bool Expr Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLBoolExprNot(TLBoolExprNot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Expression Comparison R2L</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Expression Comparison R2L</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeExpressionComparisonR2L(NodeExpressionComparisonR2L object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Type</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicType(AtomicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Type</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundType(CompoundType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List
	 * Type</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List
	 *         Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListType(ListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Type Primitive</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Type Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundTypePrimitive(CompoundTypePrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Expression Comparison</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Expression Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeExpressionComparison(NodeExpressionComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region Token</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionToken(RegionToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentConstraint(ContentConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationConstraint(RelationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Key Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Key Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryKeyConstraint(PrimaryKeyConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foreign Key Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foreign Key Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForeignKeyConstraint(ForeignKeyConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Token</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractToken(AbstractToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // SculptSwitch

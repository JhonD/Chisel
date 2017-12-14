/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.util;

import de.ubt.ai7.csv_validator.caches.dataStructures.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.ubt.ai7.csv_validator.caches.dataStructures.dataStructuresPackage
 * @generated
 */
public class dataStructuresSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static dataStructuresPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dataStructuresSwitch() {
		if (modelPackage == null) {
			modelPackage = dataStructuresPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case dataStructuresPackage.CACHED_ELEMENT: {
				CachedElement cachedElement = (CachedElement)theEObject;
				T result = caseCachedElement(cachedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseCachedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_DELIMITERS: {
				CachedDelimiters cachedDelimiters = (CachedDelimiters)theEObject;
				T result = caseCachedDelimiters(cachedDelimiters);
				if (result == null) result = caseCachedElement(cachedDelimiters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_ABSTRACT_TOKEN: {
				CachedAbstractToken cachedAbstractToken = (CachedAbstractToken)theEObject;
				T result = caseCachedAbstractToken(cachedAbstractToken);
				if (result == null) result = caseNamedElement(cachedAbstractToken);
				if (result == null) result = caseCachedElement(cachedAbstractToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_TOKEN: {
				CachedToken cachedToken = (CachedToken)theEObject;
				T result = caseCachedToken(cachedToken);
				if (result == null) result = caseCachedAbstractToken(cachedToken);
				if (result == null) result = caseNamedElement(cachedToken);
				if (result == null) result = caseCachedElement(cachedToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_CONSTRAINT: {
				CachedConstraint cachedConstraint = (CachedConstraint)theEObject;
				T result = caseCachedConstraint(cachedConstraint);
				if (result == null) result = caseCachedElement(cachedConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_CONTENT_CONSTRAINT: {
				CachedContentConstraint cachedContentConstraint = (CachedContentConstraint)theEObject;
				T result = caseCachedContentConstraint(cachedContentConstraint);
				if (result == null) result = caseCachedConstraint(cachedContentConstraint);
				if (result == null) result = caseCachedElement(cachedContentConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_PRIMARY_KEY_CONSTRAINT: {
				CachedPrimaryKeyConstraint cachedPrimaryKeyConstraint = (CachedPrimaryKeyConstraint)theEObject;
				T result = caseCachedPrimaryKeyConstraint(cachedPrimaryKeyConstraint);
				if (result == null) result = caseCachedConstraint(cachedPrimaryKeyConstraint);
				if (result == null) result = caseCachedElement(cachedPrimaryKeyConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_FOREIGN_KEY_CONSTRAINT: {
				CachedForeignKeyConstraint cachedForeignKeyConstraint = (CachedForeignKeyConstraint)theEObject;
				T result = caseCachedForeignKeyConstraint(cachedForeignKeyConstraint);
				if (result == null) result = caseCachedConstraint(cachedForeignKeyConstraint);
				if (result == null) result = caseCachedElement(cachedForeignKeyConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_NODE_EXPRESSION: {
				CachedNodeExpression cachedNodeExpression = (CachedNodeExpression)theEObject;
				T result = caseCachedNodeExpression(cachedNodeExpression);
				if (result == null) result = caseCachedElement(cachedNodeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_REGION_TOKEN: {
				CachedRegionToken cachedRegionToken = (CachedRegionToken)theEObject;
				T result = caseCachedRegionToken(cachedRegionToken);
				if (result == null) result = caseCachedAbstractToken(cachedRegionToken);
				if (result == null) result = caseNamedElement(cachedRegionToken);
				if (result == null) result = caseCachedElement(cachedRegionToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_TYPE: {
				CachedType cachedType = (CachedType)theEObject;
				T result = caseCachedType(cachedType);
				if (result == null) result = caseCachedToken(cachedType);
				if (result == null) result = caseCachedAbstractToken(cachedType);
				if (result == null) result = caseNamedElement(cachedType);
				if (result == null) result = caseCachedElement(cachedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_ATOMIC_TYPE: {
				CachedAtomicType cachedAtomicType = (CachedAtomicType)theEObject;
				T result = caseCachedAtomicType(cachedAtomicType);
				if (result == null) result = caseCachedType(cachedAtomicType);
				if (result == null) result = caseCachedToken(cachedAtomicType);
				if (result == null) result = caseCachedAbstractToken(cachedAtomicType);
				if (result == null) result = caseNamedElement(cachedAtomicType);
				if (result == null) result = caseCachedElement(cachedAtomicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_LIST_TYPE: {
				CachedListType cachedListType = (CachedListType)theEObject;
				T result = caseCachedListType(cachedListType);
				if (result == null) result = caseCachedType(cachedListType);
				if (result == null) result = caseCachedToken(cachedListType);
				if (result == null) result = caseCachedAbstractToken(cachedListType);
				if (result == null) result = caseNamedElement(cachedListType);
				if (result == null) result = caseCachedElement(cachedListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_COMPOUND_TYPE: {
				CachedCompoundType cachedCompoundType = (CachedCompoundType)theEObject;
				T result = caseCachedCompoundType(cachedCompoundType);
				if (result == null) result = caseCachedType(cachedCompoundType);
				if (result == null) result = caseCachedToken(cachedCompoundType);
				if (result == null) result = caseCachedAbstractToken(cachedCompoundType);
				if (result == null) result = caseNamedElement(cachedCompoundType);
				if (result == null) result = caseCachedElement(cachedCompoundType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_TL_VARIABLE_BINDING: {
				CachedTLVariableBinding cachedTLVariableBinding = (CachedTLVariableBinding)theEObject;
				T result = caseCachedTLVariableBinding(cachedTLVariableBinding);
				if (result == null) result = caseCachedAbstractToken(cachedTLVariableBinding);
				if (result == null) result = caseNamedElement(cachedTLVariableBinding);
				if (result == null) result = caseCachedElement(cachedTLVariableBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_TL_ELEMENT: {
				CachedTLElement cachedTLElement = (CachedTLElement)theEObject;
				T result = caseCachedTLElement(cachedTLElement);
				if (result == null) result = caseCachedElement(cachedTLElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_TL_STATEMENT: {
				CachedTLStatement cachedTLStatement = (CachedTLStatement)theEObject;
				T result = caseCachedTLStatement(cachedTLStatement);
				if (result == null) result = caseCachedTLElement(cachedTLStatement);
				if (result == null) result = caseCachedElement(cachedTLStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_TL_LOOP: {
				CachedTLLoop cachedTLLoop = (CachedTLLoop)theEObject;
				T result = caseCachedTLLoop(cachedTLLoop);
				if (result == null) result = caseCachedTLStatement(cachedTLLoop);
				if (result == null) result = caseCachedTLElement(cachedTLLoop);
				if (result == null) result = caseCachedElement(cachedTLLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_TL_OUTPUT: {
				CachedTLOutput cachedTLOutput = (CachedTLOutput)theEObject;
				T result = caseCachedTLOutput(cachedTLOutput);
				if (result == null) result = caseCachedTLStatement(cachedTLOutput);
				if (result == null) result = caseCachedTLElement(cachedTLOutput);
				if (result == null) result = caseCachedElement(cachedTLOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_TL_PRIMITIVE: {
				CachedTLPrimitive cachedTLPrimitive = (CachedTLPrimitive)theEObject;
				T result = caseCachedTLPrimitive(cachedTLPrimitive);
				if (result == null) result = caseCachedTLElement(cachedTLPrimitive);
				if (result == null) result = caseCachedElement(cachedTLPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_TL_CONSTANT: {
				CachedTLConstant cachedTLConstant = (CachedTLConstant)theEObject;
				T result = caseCachedTLConstant(cachedTLConstant);
				if (result == null) result = caseCachedTLPrimitive(cachedTLConstant);
				if (result == null) result = caseCachedTLElement(cachedTLConstant);
				if (result == null) result = caseCachedElement(cachedTLConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_TL_OUTPUT_VARIABLE: {
				CachedTLOutputVariable cachedTLOutputVariable = (CachedTLOutputVariable)theEObject;
				T result = caseCachedTLOutputVariable(cachedTLOutputVariable);
				if (result == null) result = caseCachedTLPrimitive(cachedTLOutputVariable);
				if (result == null) result = caseCachedTLElement(cachedTLOutputVariable);
				if (result == null) result = caseCachedElement(cachedTLOutputVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_TL_TYPE_INSPECTOR: {
				CachedTLTypeInspector cachedTLTypeInspector = (CachedTLTypeInspector)theEObject;
				T result = caseCachedTLTypeInspector(cachedTLTypeInspector);
				if (result == null) result = caseCachedTLOutputVariable(cachedTLTypeInspector);
				if (result == null) result = caseCachedTLPrimitive(cachedTLTypeInspector);
				if (result == null) result = caseCachedTLElement(cachedTLTypeInspector);
				if (result == null) result = caseCachedElement(cachedTLTypeInspector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_TRANSFORMATION_PROGRAM: {
				CachedTransformationProgram cachedTransformationProgram = (CachedTransformationProgram)theEObject;
				T result = caseCachedTransformationProgram(cachedTransformationProgram);
				if (result == null) result = caseCachedTLElement(cachedTransformationProgram);
				if (result == null) result = caseCachedElement(cachedTransformationProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_TL_IF: {
				CachedTLIf cachedTLIf = (CachedTLIf)theEObject;
				T result = caseCachedTLIf(cachedTLIf);
				if (result == null) result = caseCachedTLStatement(cachedTLIf);
				if (result == null) result = caseCachedTLElement(cachedTLIf);
				if (result == null) result = caseCachedElement(cachedTLIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case dataStructuresPackage.CACHED_TL_BOOL_EXPR: {
				CachedTLBoolExpr cachedTLBoolExpr = (CachedTLBoolExpr)theEObject;
				T result = caseCachedTLBoolExpr(cachedTLBoolExpr);
				if (result == null) result = caseCachedTLElement(cachedTLBoolExpr);
				if (result == null) result = caseCachedElement(cachedTLBoolExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedElement(CachedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached Delimiters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached Delimiters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedDelimiters(CachedDelimiters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached Abstract Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached Abstract Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedAbstractToken(CachedAbstractToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedToken(CachedToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedConstraint(CachedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached Content Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached Content Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedContentConstraint(CachedContentConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached Primary Key Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached Primary Key Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedPrimaryKeyConstraint(CachedPrimaryKeyConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached Foreign Key Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached Foreign Key Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedForeignKeyConstraint(CachedForeignKeyConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached Node Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached Node Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedNodeExpression(CachedNodeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached Region Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached Region Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedRegionToken(CachedRegionToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedType(CachedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached Atomic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached Atomic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedAtomicType(CachedAtomicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedListType(CachedListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached Compound Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached Compound Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedCompoundType(CachedCompoundType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached TL Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached TL Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedTLElement(CachedTLElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached TL Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached TL Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedTLPrimitive(CachedTLPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached TL Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached TL Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedTLConstant(CachedTLConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached TL Output Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached TL Output Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedTLOutputVariable(CachedTLOutputVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached TL Variable Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached TL Variable Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedTLVariableBinding(CachedTLVariableBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached TL Type Inspector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached TL Type Inspector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedTLTypeInspector(CachedTLTypeInspector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached TL Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached TL Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedTLStatement(CachedTLStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached TL Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached TL Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedTLOutput(CachedTLOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached TL Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached TL Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedTLLoop(CachedTLLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached Transformation Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached Transformation Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedTransformationProgram(CachedTransformationProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached TL If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached TL If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedTLIf(CachedTLIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cached TL Bool Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached TL Bool Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachedTLBoolExpr(CachedTLBoolExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //dataStructuresSwitch

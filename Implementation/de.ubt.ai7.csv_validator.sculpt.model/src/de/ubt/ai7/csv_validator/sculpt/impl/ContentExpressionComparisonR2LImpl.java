/**
 */
package de.ubt.ai7.csv_validator.sculpt.impl;

import org.eclipse.emf.ecore.EClass;

import de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparisonR2L;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.TypeSpecifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Expression Comparison R2L</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ContentExpressionComparisonR2LImpl extends ContentExpressionComparisonImpl implements ContentExpressionComparisonR2L {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentExpressionComparisonR2LImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.CONTENT_EXPRESSION_COMPARISON_R2L;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		final StringBuffer result = new StringBuffer(type.getName());
		result.append(value);
		result.append(" ");
		result.append(comp);
		result.append(" ");
		for(final TypeSpecifier spec : getTypeSpecifier()){
			result.append(spec.toString());
		}
		return result.toString();
	}
} //ContentExpressionComparisonR2LImpl

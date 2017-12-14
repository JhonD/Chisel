/**
 */
package de.ubt.ai7.csv_validator.sculpt.impl;

import org.eclipse.emf.ecore.EClass;

import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.TLVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TL Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TLVariableImpl extends AbstractTokenImpl implements TLVariable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TLVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptPackage.Literals.TL_VARIABLE;
	}

	@Override
	public String toString(){
		return name;
	}
} //TLVariableImpl

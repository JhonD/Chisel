/*
 * generated by Xtext
 */
package de.ubt.ai7.csv_validator.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractSculptValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.ubt.de/ai7/csv_validator/Sculpt/Model"));
		return result;
	}
}

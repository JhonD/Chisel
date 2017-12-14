package de.ubt.ai7.csv_validator.validation;

import org.eclipse.emf.common.util.EList;

import de.ubt.ai7.csv_validator.sculpt.CompoundTypePrimitive;
import de.ubt.ai7.csv_validator.sculpt.Type;

public class ValidationUtil {

	/**
	 *
	 * @param primitives
	 *            the composition of a CompoundType
	 * @param subtype
	 *            the part of the CompoundType that should be accessed
	 * @param subtypeOffset
	 *            in case a type is used several times in the definition of a
	 *            Compound type, this indicates which one to access
	 * @return the index at which the requested subtype is stored in a given
	 *         valueTree -1 in case no appropriate child was found
	 */
	public static int getChildIndex(final EList<CompoundTypePrimitive> primitives, final Type subtype, int subtypeOffset) {
		int childIndex = 0;
		for (final CompoundTypePrimitive prim : primitives) {
			if (prim.getType() != null) {
				if (prim.getType().equals(subtype)) {
					if (subtypeOffset == 0) {
						return childIndex;
					}
					--subtypeOffset; // looking for a later match
				}
				++childIndex;
			}
		}
		return -1;
	}

}

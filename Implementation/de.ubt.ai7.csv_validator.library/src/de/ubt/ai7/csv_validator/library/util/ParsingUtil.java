package de.ubt.ai7.csv_validator.library.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import de.ubt.ai7.csv_validator.caches.dataStructures.CachedAtomicType;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedCompoundType;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedListType;
import de.ubt.ai7.csv_validator.caches.dataStructures.CachedType;
import de.ubt.ai7.csv_validator.library.exceptions.SchemaValidationException;
import de.ubt.ai7.csv_validator.sculpt.AtomicType;
import de.ubt.ai7.csv_validator.sculpt.Comparator;
import de.ubt.ai7.csv_validator.sculpt.CompoundType;
import de.ubt.ai7.csv_validator.sculpt.CompoundTypeSpecifier;
import de.ubt.ai7.csv_validator.sculpt.ListType;
import de.ubt.ai7.csv_validator.sculpt.ListTypeSpecifier;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.Type;
import de.ubt.ai7.csv_validator.sculpt.TypeSpecifier;
import de.ubt.ai7.csv_validator.util.Coordinate;
import de.ubt.ai7.csv_validator.util.Pair;
import de.ubt.ai7.csv_validator.validation.ValidationUtil;

/**
 *
 *
 *         Performs the parsing process which converts a string into a value
 *         tree (internal hierarchical representation of a value). Performs
 *         additional steps like trimming the string and extracting subvalues.
 *
 */
public class ParsingUtil {
	private static final String REGEX_TEMPLATE_0_1 = "(?:\uf000)?";
	private static final String REGEX_TEMPLATE_0_N = "(?:\uf000\\s*(?:\\s*\uf001\\s*\uf000){0,\uf003})?";
	private static final String REGEX_TEMPLATE_N_M = "\uf000\\s*(?:\\s*\uf001\\s*\uf000){\uf002,\uf003}";

	/**
	 *
	 * selects the appropriate parsing method
	 * a tree is returned where each node is a list with the first element being the string representation and the remaining entries being the parsed values (java types or subtrees)
	 *
	 * @throws IllegalArgumentException
	 *             value does not conform cachedType, see error message for more
	 *             detail
	 */
	public static List<Object> parse(final String value, final CachedType cachedType) throws IllegalArgumentException {
		if (cachedType instanceof CachedAtomicType) {
			return parse(value, (CachedAtomicType) cachedType);
		}
		if (cachedType instanceof CachedListType) {
			return parse(value, (CachedListType) cachedType);
		}
		if (cachedType instanceof CachedCompoundType) {
			return parse(value, (CachedCompoundType) cachedType);
		}
		return null;
	}

	private static List<Object> parse(final String value, final CachedCompoundType cachedType) throws IllegalArgumentException {
		final CompoundType type = (CompoundType) cachedType.getSchemaElement();
		if (value == null || value.isEmpty()) {
			return Arrays.asList(value, type.getDefaultValue());
		}
		if (value.equals(type.getEmptyValue())) {
			return null;
		}

		final Matcher m = cachedType.getCapturingPattern().matcher(value.trim());
		if (m.matches()) {

			if (m.groupCount() != cachedType.getPrimitives().size()) {
				final StringBuilder sb = new StringBuilder("Captured ");
				sb.append(m.groupCount());
				sb.append(" subtypes but expected ");
				sb.append(cachedType.getPrimitives().size());
				sb.append(" when parsing \"");
				sb.append(value);
				sb.append("\" as type ");
				sb.append(cachedType.getName());
				throw new IllegalArgumentException(sb.toString());
			}

			// check whether all used data types are valid
			int captureGroupNr = 1;
			final List<Object> parsedValues = new ArrayList<Object>(cachedType.getPrimitives().size());
			parsedValues.add(value);
			for (final CachedType cachedSubtype : cachedType.getPrimitives()) {
				Object parsedValue = null;
				try {
					parsedValue = parse(m.group(captureGroupNr++), cachedSubtype);
				} catch (final IllegalArgumentException e) {
					final StringBuilder sb = new StringBuilder(e.getMessage());
					sb.append("\n\t in ");
					sb.append(value);
					sb.append(" as type ");
					sb.append(cachedType.getName());
					sb.append(" at subtype position ");
					sb.append(captureGroupNr - 1);
					throw new IllegalArgumentException(sb.toString(), e);
				}

				parsedValues.add(parsedValue);
			}

			return parsedValues;
		} else {
			final StringBuilder sb = new StringBuilder("Matching \"");
			sb.append(value);
			sb.append("\" against the format of the compound type ");
			sb.append(cachedType.getName());
			sb.append(" failed");
			throw new IllegalArgumentException(sb.toString());
		}
	}

	private static List<Object> parse(final String value, final CachedAtomicType cachedType) throws IllegalArgumentException {
		try {
			return Arrays.asList(value, cachedType.getParser().parse(value.trim()));
		} catch (final IllegalArgumentException e) {
			final StringBuilder sb = new StringBuilder("Error \"");
			sb.append(e.getMessage());
			sb.append("\" occurred when parsing \"");
			sb.append(value);
			sb.append("\" as type ");
			sb.append(cachedType.getName());
			throw new IllegalArgumentException(sb.toString(), e);
		}
	}

	private static List<Object> parse(final String value, final CachedListType cachedType) throws IllegalArgumentException {
		final ListType type = (ListType) cachedType.getSchemaElement();
		final String[] entries = preprocessCell(value, type.getSeparator(), type.getDefaultValue(), type.getEmptyValue());
		if (entries == null) {
			return null;
		}
		final ArrayList<Object> parsedValues = new ArrayList<Object>(entries.length);
		parsedValues.add(value);
		if (entries.length < type.getMinElements()
				|| (type.getMaxElements() >= 1 && entries.length > type.getMaxElements())) {
			throw new IllegalArgumentException(entries.length + " elements are not allowed");
		}

		for (int i = 0; i < entries.length; ++i) {
			Object parsedValue = null;
			try {
				parsedValue = parse(entries[i], cachedType.getType());
			} catch (final IllegalArgumentException e) {
				final StringBuilder sb = new StringBuilder(e.getMessage());
				sb.append("\n\t in ");
				sb.append(value);
				sb.append(" as type ");
				sb.append(cachedType.getName());
				sb.append(" at index ");
				sb.append(i);
				throw new IllegalArgumentException(sb.toString(), e);
			}

			parsedValues.add(parsedValue);
		}

		return parsedValues;
	}

	/**
	 *
	 * performs string operations prior to parsing as recommended in
	 * https://www.w3.org/TR/2015/REC-tabular-data-model-20151217/#parsing-cells
	 */
	private static String[] preprocessCell(String cellValue, final String separator, final String defaultValue,
			final String emptyValue) {
		if (cellValue == null) {
			return new String[0];
		}
		cellValue = cellValue.replaceAll("[\n\r\t]", " ");
		cellValue = cellValue.trim();
		cellValue = cellValue.replaceAll("\\s+", " ");
		if (defaultValue != null && cellValue.isEmpty()) {
			cellValue = defaultValue;
		}
		if (cellValue.isEmpty() || cellValue.equals(emptyValue)) {
			return new String[0];
		}
		if (separator == null || separator.isEmpty()) {
			return new String[]{cellValue};
		} else {
			// separator not empty
			return cellValue.split("\\s*" + Pattern.quote(separator) + "\\s*");
		}
	}

	/**
	 *
	 * extracts a subvalue (string representation and value) from valueTree following the given path
	 */
	@SuppressWarnings("unchecked")
	public static List<Object> extract(Object valueTree, final int[] path) {

		for (final int i : path) {
			if (!(valueTree instanceof List<?>) || ((List<?>) valueTree).size() <= i) {
				// null
				return Arrays.asList(null, null);
			}
			valueTree = ((List<?>) valueTree).get(i);
		}

		if(valueTree instanceof List<?>){
			return (List<Object>) valueTree;
		} else {
			return Arrays.asList(null, null);
		}
	}

	/**
	 *
	 * converts the TypeSpecifiers, which can contain references to other types
	 * as specifiers, to a list of indices
	 * @throws SchemaValidationException
	 *
	 */
	public static Pair<int[], Type> computeValueTreePath(Type type, final List<TypeSpecifier> path) throws SchemaValidationException {
		if (path == null) {
			return new Pair<int[], Type>(new int[0], type);
		}

		final int[] valueTreePath = new int[path.size()];
		int i = 0;
		for (final TypeSpecifier typeSpec : path) {
			if (type instanceof AtomicType) {
				throw new SchemaValidationException("The atomic type " + type.getName() + " cannot be subdivided", typeSpec);
			} else if (typeSpec instanceof ListTypeSpecifier) {
				final int index = ((ListTypeSpecifier) typeSpec).getIndex();

				if(!(type instanceof ListType)) {
					throw new SchemaValidationException("Type " + type.getName() + " is not a list", typeSpec,
							SculptPackage.Literals.LIST_TYPE_SPECIFIER__INDEX);
				}

				if (((ListType) type).getMaxElements() != null && ((ListType) type).getMaxElements() >= 0 && ((ListType) type).getMaxElements() <= index) {
					throw new SchemaValidationException("Index out of bounds for type " + type.getName(), typeSpec,
							SculptPackage.Literals.LIST_TYPE_SPECIFIER__INDEX);
				}


				// update for next iteration
				valueTreePath[i] = index + 1;
				type = ((ListType) type).getBase();

			} else if (typeSpec instanceof CompoundTypeSpecifier) {
				final Type subtype = ((CompoundTypeSpecifier) typeSpec).getSubtype();
				final int subtypeOffset = ((CompoundTypeSpecifier) typeSpec).getIndex();
				final int childNr = ValidationUtil.getChildIndex(((CompoundType) type).getPrimitives(), subtype,
						subtypeOffset);
				if (childNr == -1) {
					if (subtypeOffset == 0) {
						throw new SchemaValidationException("Type " + type.getName() + " does not contain such a type", typeSpec,
								SculptPackage.Literals.COMPOUND_TYPE_SPECIFIER__SUBTYPE);
					} else {
						throw new SchemaValidationException("Type " + type.getName() + " does not contain that type such often", typeSpec,
								SculptPackage.Literals.COMPOUND_TYPE_SPECIFIER__INDEX);
					}
				}

				valueTreePath[i] = childNr + 1;
				type = subtype;
			} else {
				throw new SchemaValidationException(SchemaValidationException.NOT_CONVERTIBLE, typeSpec);
			}
			i++;
		}
		return new Pair<int[], Type>(valueTreePath, type);
	}

	public static String regexForMultipleValues(final String oneValueRegex, final String separator, final int lowerBound, final int upperBound,
			final String emptyValue) {
		String regex;
		if (upperBound == 1) {
			if (lowerBound == 0) {
				regex = REGEX_TEMPLATE_0_1.replace("\uf000", oneValueRegex);
			} else {
				regex = oneValueRegex;
			}
		} else {
			// upperBound > 1 || upperBound == -1
			String uBound = String.valueOf(upperBound - 1);
			if (upperBound == -1) {
				uBound = "";
			}

			String regex_temp;
			if (lowerBound == 0) {
				regex_temp = REGEX_TEMPLATE_0_N;
			} else {
				final String lBound = String.valueOf(lowerBound - 1);
				regex_temp = REGEX_TEMPLATE_N_M.replace("\uf002", lBound);
			}
			regex_temp = regex_temp.replace("\uf003", uBound);
			regex_temp = regex_temp.replace("\uf001", Pattern.quote(separator));
			regex = regex_temp.replace("\uf000", oneValueRegex);
		}

		if (emptyValue != null && !emptyValue.isEmpty()) {
			regex += "|" + Pattern.quote(emptyValue);
		}

		return "\\s*(?:" + regex + ")\\s*";
	}

	public static final Coordinate DEFAULT_ERROR_COORDINATE = new Coordinate(-1, -1);

	public static boolean compare(final Object lhs, final Object rhs, final Comparator comp) {
		if (lhs == null || rhs == null) {
			return false;
		}

		// compare lists
		if (lhs instanceof List<?> && rhs instanceof List<?>) {
			final List<?> lList = (List<?>) lhs;
			final List<?> rList = (List<?>) rhs;
			if (lList.size() != rList.size()) {
				return false;
			}
			for (int i = 1; i < lList.size(); ++i) { //first entry is the string representation
				if (!compare(lList.get(i), rList.get(i), comp)) {
					return false;
				}
			}
			return true;
		}

		// compare single values
		if (comp == Comparator.EQ) {
			return lhs.equals(rhs);
		}
		if (comp == Comparator.NEQ) {
			return !lhs.equals(rhs);
		}
		if (lhs instanceof Comparable<?> && rhs instanceof Comparable<?>) {
			try {
				@SuppressWarnings("unchecked")
				final
				int result = ((Comparable<Object>) lhs).compareTo(rhs);
				switch (comp) {
				case GT:
					return result > 0;
				case GTEQ:
					return result >= 0;
				case LT:
					return result < 0;
				case LTEQ:
					return result <= 0;
				default:
					return false;
				}
			} catch (final Exception e) {
			}
		}
		return false;
	}




}

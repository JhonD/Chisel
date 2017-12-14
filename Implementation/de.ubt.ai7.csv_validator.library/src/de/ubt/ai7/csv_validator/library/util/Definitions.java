package de.ubt.ai7.csv_validator.library.util;

import static de.ubt.ai7.csv_validator.util.SaveIterables.emptyIfNull;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import de.ubt.ai7.csv_validator.caches.dataStructures.NamedElement;
import de.ubt.ai7.csv_validator.library.dataStructures.Region;
import de.ubt.ai7.csv_validator.library.dataStructures.RegionFactory;
import de.ubt.ai7.csv_validator.sculpt.AbstractToken;
import de.ubt.ai7.csv_validator.sculpt.Constraint;
import de.ubt.ai7.csv_validator.sculpt.Delimiters;
import de.ubt.ai7.csv_validator.sculpt.NodeExpression;
import de.ubt.ai7.csv_validator.sculpt.RegionToken;
import de.ubt.ai7.csv_validator.sculpt.SchemaElement;
import de.ubt.ai7.csv_validator.sculpt.TLElement;
import de.ubt.ai7.csv_validator.sculpt.TLLoop;
import de.ubt.ai7.csv_validator.sculpt.TLVariable;
import de.ubt.ai7.csv_validator.sculpt.Token;
import de.ubt.ai7.csv_validator.sculpt.TransformationProgram;
import de.ubt.ai7.csv_validator.sculpt.Type;
import de.ubt.ai7.csv_validator.util.Coordinate;

/**
 *
 * This class generates the unique identifier for the given {@link SchemaElement}, used for
 *         equality checks when receiving a new schema. In case the element is not an instance of {@link NamedElement}
 *         the identifier is used as the key when putting the corresponding cached element into the HashMap of the Cache.
 */
public class Definitions {

	/**
	 *
	 * @param obj
	 * @return unique identifier for the given {@link SchemaElement}, used for
	 *         equality checks
	 */
	public static String from(final SchemaElement obj) {
		if (obj instanceof AbstractToken) {
			return from((AbstractToken) obj);
		} else if (obj instanceof Constraint) {
			return from((Constraint) obj);
		} else if (obj instanceof NodeExpression) {
			return from((NodeExpression) obj);
		} else if(obj instanceof Delimiters) {
			return from((Delimiters) obj);
		} else if(obj instanceof TransformationProgram) {
			return from((TransformationProgram) obj);
		} else if(obj instanceof TLElement) {
			return from((TLElement) obj);
		}
		throw new UnsupportedOperationException();
	}

	public static String from(final AbstractToken tok) {
		if (tok instanceof Token) {
			return from((Token) tok);
		}
		if (tok instanceof RegionToken) {
			return from((RegionToken) tok);
		}
		if (tok instanceof TLVariable) {
			return from((TLVariable) tok);
		}
		throw new UnsupportedOperationException();
	}

	public static String from(final Delimiters delim) {
		return delim.toString();
	}

	public static String from(final Token tok) {
		if (tok instanceof Type) {
			return from((Type) tok);
		}
		return tok.getTokenRegex();
	}

	public static String from(final Type type) {
		return type.toString();
	}

	public static String from(final RegionToken tok) {
		return tok.getRegion().toString();
	}

	public static String from(final TLVariable var) {
		return var.toString();
	}

	public static String from(final Constraint con) {
		return con.toString();
	}

	public static String from(final TLElement element) {
		return element.toString();
	}

	public static String from(final TLLoop loop) {
		return loop.toString();
	}

	public static String from(final NodeExpression nodeExpr) {
		return nodeExpr.toString();
	}

	public static String from(final TransformationProgram prog){
		return prog.toString();
	}

	/**
	 *
	 * @return coordinate to coordinate index
	 */
	public static int from(final Coordinate c, final int maxRows) {
		return from(c.ROW, c.COLUMN, maxRows);
	}

	/**
	 *
	 * @return coordinate to coordinate index
	 */
	public static int from(final int row, final int column, final int maxRows) {
		// maxRows += 8 - maxRows % 8;
		return (column - 1) * maxRows + row - 1;
	}

	/**
	 *
	 * @return coordinate index to coordinate
	 */
	public static Coordinate toCoordinate(final int definition, final int maxRows) {
		// maxRows += 8 - maxRows % 8;
		return new Coordinate(definition % maxRows + 1, definition / maxRows + 1);
	}

	public static BitSet remap(final BitSet oldSet, final int oldMaxRows, final int newMaxRows) {
		final int inc = newMaxRows - oldMaxRows;
		final BitSet newSet = new BitSet(oldSet.length() + (oldSet.length() / oldMaxRows) * inc);

		for (int i = oldSet.nextSetBit(0); i >= 0; i = oldSet.nextSetBit(i + 1)) {
			if (i % oldMaxRows >= newMaxRows) {
				continue;
			}
			newSet.set(i + (i / oldMaxRows) * inc);
		}

		return newSet;
	}

	public static <T> HashMap<Integer, T> remap(final Map<Integer, T> oldMap, final int oldMaxRows, final int newMaxRows) {
		final int inc = newMaxRows - oldMaxRows;
		final HashMap<Integer, T> newMap = new HashMap<Integer, T>(oldMap.size());

		for (final Entry<Integer, T> entry : oldMap.entrySet()) {
			if (entry.getKey() % oldMaxRows >= newMaxRows) {
				continue;
			}
			final Integer newKey = entry.getKey() + (entry.getKey() / oldMaxRows) * inc;
			newMap.put(newKey, entry.getValue());
		}

		return newMap;
	}

	public static Region toRegion(final BitSet set, final int rowNumber, final int columnNumber) {
		final Region region = RegionFactory.INSTANCE.newRegion(rowNumber, columnNumber, false);
		for (int i = set.nextSetBit(0); i >= 0; i = set.nextSetBit(i + 1)) {
			region.addCoordinateToRegion(Definitions.toCoordinate(i, rowNumber));
		}
		return region;
	}

	public static BitSet toBitSet(final Region region) {
		final BitSet set = new BitSet();
		final int maxRows = region.getRowSize();
		for (final Coordinate coord : emptyIfNull(region.unsortedIteration())) {
			set.set(Definitions.from(coord, maxRows));
		}
		return set;
	}

}

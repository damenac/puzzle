package org.eposoft.jccd.comparators;

import org.eposoft.jccd.data.ASourceUnit;

/**
 * A comparator takes several criteria of source units to decide if two source
 * units are at least similar.
 * 
 * @author biegel
 * 
 * @param <T>
 */
public interface IComparator<T extends ASourceUnit> {

	/**
	 * Checks if both source units are similar by custom criteria.
	 * 
	 * @param firstSourceUnit
	 *            any source unit of the first revision
	 * @param secondSourceUnit
	 *            any source unit of the second revision
	 * @return are those two source units similar?
	 */
	public abstract boolean checkSimilarity(final T firstSourceUnit,
			final T secondSourceUnit);

}
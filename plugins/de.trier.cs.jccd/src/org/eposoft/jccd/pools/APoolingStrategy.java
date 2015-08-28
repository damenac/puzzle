package org.eposoft.jccd.pools;

import org.eposoft.jccd.data.APool;
import org.eposoft.jccd.data.SourceUnitManager;

/**
 * A kind of compare guide which selects source units, puts them in a pool and
 * (optional) sorts all pools in a special order.
 * 
 * @author biegel
 */
public abstract class APoolingStrategy<T extends SourceUnitManager> {

	/**
	 * Returns all pools in specific order.
	 * 
	 * @param firstContainer
	 *            container of the first revision
	 * @param secondContainer
	 *            container of the second revision
	 * @return pools in specific order
	 */
	public abstract APool[] getPools(final T firstContainer,
			final T secondContainer);

	/**
	 * Returns all pools in specific order. For single-version-mode.
	 * 
	 * @param container
	 *            container of the first revision
	 * @return pools in specific order
	 */
	public abstract APool[] getPools(final T container);
}

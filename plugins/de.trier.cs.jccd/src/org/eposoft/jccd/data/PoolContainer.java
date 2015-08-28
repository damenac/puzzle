package org.eposoft.jccd.data;

/**
 * This container holds pools.
 * 
 * @author biegel
 */
public final class PoolContainer {

	/** pools of this container */
	final APool[] pools;

	/**
	 * Standard constructor.
	 * 
	 * @param pools
	 *            pools for this container
	 */
	public PoolContainer(final APool[] pools) {
		this.pools = pools;
	}

	/**
	 * @return all pools of this container
	 */
	public APool[] getPools() {
		return this.pools;
	}
}

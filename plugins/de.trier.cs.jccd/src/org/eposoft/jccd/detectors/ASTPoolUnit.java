package org.eposoft.jccd.detectors;

import org.eposoft.jccd.data.PoolContainer;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.pools.APoolingStrategy;

/**
 * Manager for pooling of AST-nodes.
 * 
 * @author biegel
 */
public final class ASTPoolUnit {

	/** the pooling strategy to generate pools in a specific order */
	final APoolingStrategy poolingStrategy;

	/**
	 * Standard constructor.
	 * 
	 * @param poolingStrategy
	 *            strategy for pooling the nodes of the AST
	 */
	public ASTPoolUnit(final APoolingStrategy poolingStrategy) {
		this.poolingStrategy = poolingStrategy;
	}

	public PoolContainer getPoolContainer(final ASTManager container) {
		return this.getPoolContainer(container, null);
	}

	public PoolContainer getPoolContainer(final ASTManager firstContainer,
			final ASTManager secondContainer) {
		if (null == firstContainer) {
			// XXX exception would be nice!
			return null;
		}
		if (null == this.poolingStrategy) {
			return null;
		}
		if (null == secondContainer) {
			return new PoolContainer(this.poolingStrategy
					.getPools(firstContainer));
		}
		return new PoolContainer(this.poolingStrategy.getPools(firstContainer,
				secondContainer));
	}
}

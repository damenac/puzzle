package org.eposoft.jccd.data;

import java.util.HashSet;

/**
 * Used for comparison in two versions.
 * 
 * @author biegel
 */
public final class PoolDouble extends APool {

	/** nodes of the second revision */
	private HashSet<ASourceUnit> secondRevisionNodes = new HashSet<ASourceUnit>();

	/**
	 * Adds a new node to this pool.
	 * 
	 * @param node
	 *            second revision node
	 */
	public void addSecondRevisionNode(final ASourceUnit node) {
		this.secondRevisionNodes.add(node);
	}

	/**
	 * @return all nodes of this pool which are in the second revision
	 */
	public ASourceUnit[] getSecondRevisionNodes() {
		return getArrayFromSet(this.secondRevisionNodes);
	}

}

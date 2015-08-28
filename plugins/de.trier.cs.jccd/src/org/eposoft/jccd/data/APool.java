package org.eposoft.jccd.data;

import java.util.HashSet;

/**
 * Represents a pool of nodes which could be similar.
 * 
 * @author biegel
 */
public abstract class APool {

	/** nodes of the first revision */
	protected HashSet<ASourceUnit> firstRevisionNodes = new HashSet<ASourceUnit>();

	/**
	 * Adds a new node to this pool.
	 * 
	 * @param node
	 *            first revision node
	 */
	public void addFirstRevisionNode(final ASourceUnit node) {
		this.firstRevisionNodes.add(node);
	}

	/**
	 * @return all nodes of this pool which are in the first revision
	 */
	public ASourceUnit[] getFirstRevisionNodes() {
		return getArrayFromSet(this.firstRevisionNodes);
	}

	/**
	 * Builds an array of nodes from a hash set.
	 * 
	 * @param set
	 *            hash set of unique nodes
	 * @return array of nodes
	 */
	protected ASourceUnit[] getArrayFromSet(final HashSet<ASourceUnit> set) {
		final ASourceUnit[] nodes = new ASourceUnit[set.size()];
		int i = 0;
		for (final ASourceUnit node : set) {
			nodes[i] = node;
			++i;
		}
		return nodes;
	}
}

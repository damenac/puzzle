package org.eposoft.jccd.data;

import java.util.HashSet;

/**
 * Manages similar nodes and keeps them in a set.
 * 
 * @author biegel
 */
public final class SimilarityGroup {

	/** Logger */
	// private static final Logger log = Logger.getLogger(SimilarityGroup.class
	// .getName());
	/** id counter for similarity groups */
	private static int groupIdCounter = 0;

	/** id for this similarity group */
	private final int groupId;

	/**
	 * Standard constructor. Sets groupId.
	 */
	public SimilarityGroup() {
		this.groupId = getNextGroupId();
	}

	/** all equal/ similar pairs */
	private HashSet<SimilarityPair> similarPairs = new HashSet<SimilarityPair>();

	/** contains all node ids which are added to this group */
	private HashSet<ASourceUnit> addedNodes = new HashSet<ASourceUnit>();

	/**
	 * Add similarity pairs to this similarity group.
	 * 
	 * @param pair
	 *            any node from the AST
	 */
	public void addPair(final SimilarityPair pair) {
		this.similarPairs.add(pair);
		this.addedNodes.add(pair.getFirstNode());
		this.addedNodes.add(pair.getSecondNode());
	}

	/**
	 * Getter for similar nodes of this group.
	 * 
	 * @return similar nodes
	 */
	public ASourceUnit[] getNodes() {
		final ASourceUnit[] nodes = new ASourceUnit[this.addedNodes.size()];
		return this.addedNodes.toArray(nodes);
	}

	/**
	 * Getter for similar pairs of this group.
	 * 
	 * @return similar pairs
	 */
	public SimilarityPair[] getPairs() {
		final SimilarityPair[] pairs = new SimilarityPair[this.similarPairs
				.size()];
		return this.similarPairs.toArray(pairs);
	}

	/**
	 * Getter for the id of this group.
	 * 
	 * @return group id
	 */
	public int getGroupId() {
		return this.groupId;
	}

	/**
	 * @return amount of nodes
	 */
	public int getNodesCount() {
		return this.addedNodes.size();
	}

	/**
	 * @return amount of pairs
	 */
	public int getPairCount() {
		return this.similarPairs.size();
	}

	/**
	 * Returns the next group id.
	 * 
	 * @return next group id
	 */
	private static int getNextGroupId() {
		++groupIdCounter;
		return groupIdCounter;
	}

	@Override
	public int hashCode() {
		return this.groupId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimilarityGroup other = (SimilarityGroup) obj;
		return (this.hashCode() == other.hashCode());
	}

}

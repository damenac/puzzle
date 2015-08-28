package org.eposoft.jccd.data;


/**
 * Represents a pair (actually a binary set, simulated by a fix order) of two
 * similar nodes. Fix order! The node with the smallest id is always the first
 * node.
 * 
 * @author biegel
 */
public final class SimilarityPair {

	/** id counter for similarity groups */
	private static int pairIdCounter = 0;

	/** id for this similarity group */
	private final int pairId;

	/** first node of the similarity pair */
	private final ASourceUnit firstNode;

	/** second node of the similarity pair */
	private final ASourceUnit secondNode;

	/**
	 * Standard constructor.
	 * 
	 * @param firstNode
	 *            any node of the AST
	 * @param secondNode
	 *            any node of the AST
	 */
	public SimilarityPair(final ASourceUnit firstNode,
			final ASourceUnit secondNode) {
		this.pairId = getNextPairId();
		if (firstNode.getId() < secondNode.getId()) {
			this.firstNode = firstNode;
			this.secondNode = secondNode;
		} else {
			this.firstNode = secondNode;
			this.secondNode = firstNode;
		}

	}

	public int getIdNumber() {
		return this.pairId;
	}

	private static int getNextPairId() {
		++pairIdCounter;
		return pairIdCounter;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimilarityPair other = (SimilarityPair) obj;

		return (this.hashCode() == other.hashCode());
	}

	/**
	 * @return the firstNode
	 */
	public ASourceUnit getFirstNode() {
		return firstNode;
	}

	/**
	 * @return the secondNode
	 */
	public ASourceUnit getSecondNode() {
		return secondNode;
	}

	@Override
	public int hashCode() {
		final StringBuffer sb = new StringBuffer();
		sb.append(this.firstNode.getId());
		sb.append(',');
		sb.append(this.secondNode.getId());
		return sb.toString().hashCode();
	}

}

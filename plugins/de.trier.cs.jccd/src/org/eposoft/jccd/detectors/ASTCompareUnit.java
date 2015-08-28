package org.eposoft.jccd.detectors;

import java.util.ArrayList;

import org.eposoft.jccd.comparators.IComparator;
import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.APool;
import org.eposoft.jccd.data.ASourceUnit;
import org.eposoft.jccd.data.PoolContainer;
import org.eposoft.jccd.data.PoolDouble;
import org.eposoft.jccd.data.PoolSingle;
import org.eposoft.jccd.data.SimilarityGroupManager;
import org.eposoft.jccd.data.SimilarityPair;
import org.eposoft.jccd.data.ast.ANode;

/**
 * The real comparison step. The user defines which comparators should be used.
 * 
 * @author biegel
 */
public final class ASTCompareUnit {

	/**
	 * Different modes to concatenate the similarity groups.
	 * 
	 * @author biegel
	 */
	protected enum Mode {
		INIT, AND, OR, MINUS
	}

	/** all comparators */
	final private ArrayList<IComparator<ANode>> comparators;

	/** amount of or-comparators */
	final private int orComparatorCount;

	/**
	 * Standard constructor.
	 * 
	 * @param comparators
	 *            comparator list
	 */
	public ASTCompareUnit(final ArrayList<IComparator<ANode>> comparators) {
		if (null == comparators) {
			this.comparators = new ArrayList<IComparator<ANode>>();
			this.orComparatorCount = 0;
			return;
		}

		this.comparators = comparators;

		// count or-comparators
		int orCount = 0;
		for (final IComparator<ANode> comparator : comparators) {
			if (comparator instanceof AOrComparator) {
				++orCount;
			}
		}
		this.orComparatorCount = orCount;
	}

	/**
	 * Helper method for checking and adding a similarity pair to the similarity
	 * pair set.
	 * 
	 * @param simPair
	 *            similarity pair
	 * @param previousSimPairSet
	 *            previous similarity pair set
	 * @param simPairSet
	 *            similarity pair set
	 * @param mergeMode
	 *            merge mode
	 */
	private void addPair(final SimilarityPair simPair,
			final SimilarityGroupManager previousSimPairSet,
			final SimilarityGroupManager simPairSet, final Mode mergeMode) {
		// for OR-mode only, check if pair is still in the set,
		// on true: skip
		if ((Mode.OR == mergeMode) && (simPairSet.containsPair(simPair))) {
			return;
		}

		// check if at least one comparator sees a similarity
		// between these two nodes
		if (!this.checkNodeSimilarity((ANode) simPair.getFirstNode(),
				(ANode) simPair.getSecondNode())) {
			return;
		}

		// => both nodes are similar
		switch (mergeMode) {
		case AND:
			if (previousSimPairSet.containsPair(simPair)) {
				simPairSet.addPair(simPair);
			}
			break;
		case MINUS:
			simPairSet.removePair(simPair);
			break;
		default:
			simPairSet.addPair(simPair);
			break;
		}
	}

	/**
	 * Checks if both nodes (and children) are similar for at least one of the
	 * comparators.
	 * 
	 * @param simPair
	 *            possible similarity pair
	 * @return
	 */
	private boolean checkNodeSimilarity(final ANode firstNode,
			final ANode secondNode) {
		// first check first two nodes with or-comparators
		boolean oneOrTrue = false;
		int falseOrComparators = 0;
		for (final IComparator<ANode> comparator : this.comparators) {
			// check if comparator is an or-comparator
			if (comparator instanceof AOrComparator) {
				// check next or-comparator if no previous one was true
				if (!oneOrTrue) {
					final boolean areSimilar = comparator.checkSimilarity(
							firstNode, secondNode);
					if (areSimilar) {
						// now no further or-comparators must be tested
						oneOrTrue = true;
					} else {
						++falseOrComparators;
						// abort with false if all or-comparators were tested
						if (falseOrComparators == this.orComparatorCount) {
							return false;
						}
					}
				}
			} else {
				// comparator is an and-comparator!
				// abort with false if only one and-comparator is false
				final boolean areSimilar = comparator.checkSimilarity(
						firstNode, secondNode);
				if (!areSimilar) {
					return false;
				}
			}
		}

		if (firstNode.isLeaf() || secondNode.isLeaf()) {
			return true;
		}

		if (firstNode.getChildCount() != secondNode.getChildCount()) {
			return false;
		}

		for (int i = 0; i < firstNode.getChildCount(); i++) {
			if (!this.checkNodeSimilarity(firstNode.getChild(i), secondNode
					.getChild(i))) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Walk through all pools and check if two nodes are for at least one
	 * comparator similar.
	 * 
	 * @param pool
	 *            all pools
	 * @return
	 */
	public final SimilarityGroupManager compare(final PoolContainer pool) {
		return this.compare(pool, new SimilarityGroupManager(), Mode.INIT);
	}

	/**
	 * Walk through all pools and check if two nodes are for at least one
	 * comparator similar. Optimizations for different merging-modes
	 * (conjunction, disjunction and minus).
	 * 
	 * @param pool
	 *            all pools
	 * @param previousSimGroupContainer
	 *            similarity pair set with pairs which were found in previous
	 *            comparisons
	 * @param mode
	 *            merge the new founded similarity groups with the previous in a
	 *            specific mode (disjunction, conjunction, minus)
	 * @return
	 */
	public final SimilarityGroupManager compare(final PoolContainer pool,
			final SimilarityGroupManager previousSimGroupContainer,
			final Mode mode) {
		// abort if no comparator was set
		if (this.comparators.isEmpty()) {
			return previousSimGroupContainer;
		}

		final Mode mergeMode;
		if (null == mode) {
			mergeMode = Mode.INIT;
		} else {
			mergeMode = mode;
		}

		final SimilarityGroupManager simPairSet = new SimilarityGroupManager();
		// copy all pairs in OR-mode or in MINUS-mode
		if ((Mode.OR == mergeMode) || (Mode.MINUS == mergeMode)) {
			final SimilarityPair[] previousPairs = previousSimGroupContainer
					.getPairs();
			for (final SimilarityPair previousPair : previousPairs) {
				simPairSet.addPair(previousPair);
			}
		}

		// walk over all pools (with possible similarity group candidates)
		for (final APool poolCandidates : pool.getPools()) {
			final ASourceUnit[] firstCandidates = poolCandidates
					.getFirstRevisionNodes();
			if (poolCandidates instanceof PoolSingle) {
				// ### single version mode
				// walk over all nodes
				for (int i = 0; i < firstCandidates.length - 1; i++) {
					final ASourceUnit currentNode = firstCandidates[i];
					// compare current node with the next nodes
					for (int j = i + 1; j < firstCandidates.length; j++) {
						final SimilarityPair simPair = new SimilarityPair(
								currentNode, firstCandidates[j]);
						// check pair and add it to the simPairSet (side
						// effect!)
						this.addPair(simPair, previousSimGroupContainer,
								simPairSet, mergeMode);
					}
				}
			} else {
				// ### two version mode.
				// walk over nodes of the first revision
				for (final ASourceUnit firstNode : firstCandidates) {
					// compare first node with nodes from the second revision
					for (final ASourceUnit secondNode : ((PoolDouble) poolCandidates)
							.getSecondRevisionNodes()) {
						final SimilarityPair simPair = new SimilarityPair(
								firstNode, secondNode);
						// check pair and add it to the simPairSet (side
						// effect!)
						this.addPair(simPair, previousSimGroupContainer,
								simPairSet, mergeMode);
					}
				}
			}
		}

		return simPairSet;
	}

}

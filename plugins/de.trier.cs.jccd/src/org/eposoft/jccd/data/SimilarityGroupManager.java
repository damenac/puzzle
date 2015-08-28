package org.eposoft.jccd.data;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

import org.eposoft.jccd.filters.IFilter;

/**
 * Represents a set of similarity pairs.
 * 
 * @author biegel
 */
public final class SimilarityGroupManager {

	/** set of similarity pairs */
	private final ConcurrentHashMap<SimilarityPair, Integer> pairSet = new ConcurrentHashMap<SimilarityPair, Integer>();

	/**
	 * Adds a new similarity pair to the set.
	 * 
	 * @param pair
	 *            a similarity pair
	 */
	public void addPair(final SimilarityPair pair) {
		this.pairSet.put(pair, 0);
	}

	/**
	 * Checks if given pair is in the set
	 * 
	 * @param pair
	 *            similarity pair
	 */
	public boolean containsPair(final SimilarityPair pair) {
		return this.pairSet.contains(pair);
	}

	/**
	 * @return all similarity pairs in this set
	 */
	public SimilarityPair[] getPairs() {
		final SimilarityPair[] pairs = new SimilarityPair[this.pairSet.size()];
		return this.pairSet.keySet().toArray(pairs);
	}

	/**
	 * 
	 * @param filters
	 */
	public void filter(final IFilter[] filters) {
		if (null == filters) {
			return;
		}

		for (final IFilter filter : filters) {
			filter.start(this);
		}
	}

	/**
	 * Generates similarity groups from the similarity pairs.
	 * 
	 * @return similarity groups
	 */
	public SimilarityGroup[] getSimilarityGroups() {
		final SimilarityPair[] simPairs = this.getPairs();
		if (0 == simPairs.length) {
			return new SimilarityGroup[0];
		}

		// merge pairs to similarity groups
		final HashMap<Integer, SimilarityGroup> nodesInGroups = new HashMap<Integer, SimilarityGroup>();
		for (int i = 0; i < simPairs.length; i++) {
			final ASourceUnit firstNode = simPairs[i].getFirstNode();
			final ASourceUnit secondNode = simPairs[i].getSecondNode();
			final SimilarityGroup simGroupFirst = nodesInGroups.get(simPairs[i]
					.getFirstNode().getId());
			final SimilarityGroup simGroupSecond = nodesInGroups
					.get(simPairs[i].getSecondNode().getId());

			if ((null == simGroupFirst) && (null == simGroupSecond)) {
				// ### both nodes are not in a similarity group yet
				final SimilarityGroup newGroup = new SimilarityGroup();
				newGroup.addPair(simPairs[i]);
				nodesInGroups.put(firstNode.getId(), newGroup);
				nodesInGroups.put(secondNode.getId(), newGroup);
			} else if ((null != simGroupFirst) && (null == simGroupSecond)) {
				// ### second node is not in a similarity group yet
				simGroupFirst.addPair(simPairs[i]);
				nodesInGroups.put(secondNode.getId(), simGroupFirst);
			} else if ((null == simGroupFirst) && (null != simGroupSecond)) {
				// ### first node is not in a similarity group yet
				simGroupSecond.addPair(simPairs[i]);
				nodesInGroups.put(firstNode.getId(), simGroupSecond);
			} else if (simGroupFirst.getGroupId() != simGroupSecond
					.getGroupId()) {
				// ### both nodes are in different similarity groups => merge
				final SimilarityPair[] secondPairs = simGroupSecond.getPairs();
				for (final SimilarityPair pair : secondPairs) {
					simGroupFirst.addPair(pair);
					nodesInGroups.put(pair.getFirstNode().getId(),
							simGroupFirst);
					nodesInGroups.put(pair.getSecondNode().getId(),
							simGroupFirst);
				}
			} else {
				// ### first and second group are identically =>
				// ### both nodes are in this similarity group but not this pair
				simGroupFirst.addPair(simPairs[i]);
			}
		}

		// collapse similarity groups
		final HashSet<SimilarityGroup> simGroups = new HashSet<SimilarityGroup>();

		int added = 0;
		for (final SimilarityGroup group : nodesInGroups.values()) {
			simGroups.add(group);
			added += group.getPairCount();
		}

		final SimilarityGroup[] simGroupArr = new SimilarityGroup[simGroups
				.size()];
		return simGroups.toArray(simGroupArr);
	}

	/**
	 * Removes a similarity pair.
	 * 
	 * @param pair
	 *            similarity pair
	 */
	public void removePair(final SimilarityPair pair) {
		this.pairSet.remove(pair);
	}

	public void clear() {
		this.pairSet.clear();
	}
}

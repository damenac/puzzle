package org.eposoft.jccd.filters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eposoft.jccd.data.ASourceUnit;
import org.eposoft.jccd.data.SimilarityGroup;
import org.eposoft.jccd.data.SimilarityGroupManager;
import org.eposoft.jccd.data.SimilarityPair;
import org.eposoft.jccd.data.ast.ANode;

/**
 * Standard-filter which will prune overlapped similarity groups which contain
 * AST nodes.
 * 
 * @author biegel
 */
public final class StandardOverlapPruningFilter implements IFilter {

	@Override
	public void start(SimilarityGroupManager simContainer) {
		final SimilarityGroup[] simGroups = simContainer.getSimilarityGroups();
		// mark in which similarity group a node can be found
		final HashMap<Integer, SimilarityGroup> nodesInGroups = new HashMap<Integer, SimilarityGroup>();
		final HashSet<SimilarityGroup> simGroupsHash = new HashSet<SimilarityGroup>();
		for (final SimilarityGroup simGroup : simGroups) {
			simGroupsHash.add(simGroup);
			final ASourceUnit[] nodes = simGroup.getNodes();
			for (final ASourceUnit node : nodes) {
				nodesInGroups.put(node.getId(), simGroup);
			}
		}

		// prune similarity groups
		for (final SimilarityGroup simGroup : simGroups) {
			final ASourceUnit[] nodes = simGroup.getNodes();

			int childCount = -1;
			boolean hasSameChildCount = true;
			final HashMap<SimilarityGroup, Integer> simGroupAmount = new HashMap<SimilarityGroup, Integer>();
			for (final ASourceUnit node : nodes) {
				// check if nodes have the same child count
				if (-1 == childCount) {
					childCount = ((ANode) node).getChildCount();
				} else if (((ANode) node).getChildCount() != childCount) {
					hasSameChildCount = false;
					break;
				}

				// check similarity group amount in the children
				for (int i = 0; i < ((ANode) node).getChildCount(); i++) {
					final ASourceUnit child = ((ANode) node).getChild(i);
					final SimilarityGroup childSimGroup = nodesInGroups
							.get(child.getId());
					if (null != childSimGroup) {
						final Integer amount = simGroupAmount
								.get(childSimGroup);
						if (null == amount) {
							simGroupAmount.put(childSimGroup, 1);
						} else {
							simGroupAmount.put(childSimGroup, amount + 1);
						}
					}
				}
			}

			if (!hasSameChildCount) {
				continue;
			}

			// check founded similarity group amounts
			final Set<SimilarityGroup> keys = simGroupAmount.keySet();
			for (final SimilarityGroup candidateSimGroup : keys) {
				if (candidateSimGroup.getNodesCount() == simGroupAmount
						.get(candidateSimGroup)) {
					simGroupsHash.remove(candidateSimGroup);
					final SimilarityPair[] pairs = candidateSimGroup.getPairs();
					for (final SimilarityPair pair : pairs) {
						simContainer.removePair(pair);
					}
				}
			}
		}
		// XXX hack!!!
		// remove all pairs
		simContainer.clear();

		// add filtered groups
		for (final SimilarityGroup simGroup : simGroupsHash) {
			final SimilarityPair[] pairs = simGroup.getPairs();
			for (final SimilarityPair pair : pairs) {
				simContainer.addPair(pair);
			}
		}
	}
}

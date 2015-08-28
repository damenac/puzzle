package org.eposoft.jccd.comparators.ast;

import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.data.ast.NodeTypes;

/**
 * Accepts all file nodes.
 * 
 * @author biegel
 */
public final class AcceptFileNames extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return ((firstNode.getType() == NodeTypes.FILE.getType()) && (secondNode
				.getType() == NodeTypes.FILE.getType()));
	}

}

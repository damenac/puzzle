package org.eposoft.jccd.comparators.ast;

import org.eposoft.jccd.data.ast.ANode;

/**
 * Checks if two nodes are equal by type, child count and node text.
 * 
 * @author biegel
 */
public final class CheckEquality extends AOrComparator {

	@Override
	public boolean checkSimilarity(final ANode firstNode, final ANode secondNode) {
		if (firstNode.getType() != secondNode.getType()) {
			return false;
		}

		if (firstNode.getChildCount() != secondNode.getChildCount()) {
			return false;
		}

		if (!firstNode.getText().equals(secondNode.getText())) {
			return false;
		}

		// if (firstNode instanceof NodeAst) {
		// if (!(secondNode instanceof NodeAst)) {
		// return false;
		// }
		//
		// if (!((NodeAst) firstNode).getToken().equals(
		// ((NodeAst) secondNode).getToken())) {
		// return false;
		// }
		// }

		return true;
	}

}

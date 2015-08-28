package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts both equal comparators (`==` and `!=`).
 * 
 * @author biegel
 */
public final class AcceptEquals extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (this.isEqualsComparator(firstNode) && this
				.isEqualsComparator(secondNode));
	}

	/**
	 * Checks if node is an equal comparator.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return equal comparator true/false?
	 */
	private boolean isEqualsComparator(final ANode node) {
		if (null == node) {
			return false;
		}

		switch (node.getType()) {
		case Antlr3JavaParser.EQUAL:
		case Antlr3JavaParser.NOT_EQUAL:
			return true;
		}
		return false;
	}

}

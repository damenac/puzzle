package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts both kinds of OR (`||` and `|`).
 * 
 * @author biegel
 */
public final class AcceptOrs extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (this.isOr(firstNode) && this.isOr(secondNode));
	}

	/**
	 * Checks if node is a logical or.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return logical or true/false?
	 */
	private boolean isOr(final ANode node) {
		if (null == node) {
			return false;
		}

		switch (node.getType()) {
		case Antlr3JavaParser.OR:
		case Antlr3JavaParser.LOGICAL_OR:
			return true;
		}
		return false;
	}

}

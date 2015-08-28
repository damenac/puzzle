package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts both kinds of AND (`&&` and `&`).
 * 
 * @author biegel
 */
public final class AcceptAnds extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (this.isAnd(firstNode) && this.isAnd(secondNode));
	}

	/**
	 * Checks if node is a logical or.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return logical or true/false?
	 */
	private boolean isAnd(final ANode node) {
		if (null == node) {
			return false;
		}

		switch (node.getType()) {
		case Antlr3JavaParser.AND:
		case Antlr3JavaParser.LOGICAL_AND:
			return true;
		}
		return false;
	}

}

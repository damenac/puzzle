package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts all bit operators (`&`, `|` and `^`).
 * 
 * @author biegel
 */
public final class AcceptBitOperators extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (this.isBitOperator(firstNode) && this.isBitOperator(secondNode));
	}

	/**
	 * Checks if node is a bit operator.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return bit operator true/false?
	 */
	private boolean isBitOperator(final ANode node) {
		if (null == node) {
			return false;
		}

		switch (node.getType()) {
		case Antlr3JavaParser.AND:
		case Antlr3JavaParser.OR:
		case Antlr3JavaParser.XOR:
			return true;
		}
		return false;
	}

}

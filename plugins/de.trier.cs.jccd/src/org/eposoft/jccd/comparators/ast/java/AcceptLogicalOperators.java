package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts all logical operators (`||`, `&&`,`|`, `&`, `^`).
 * 
 * @author biegel
 */
public final class AcceptLogicalOperators extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (this.isLogicalOperator(firstNode) && this
				.isLogicalOperator(secondNode));
	}

	/**
	 * Checks if node is a logical operator.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return logical operator true/false?
	 */
	private boolean isLogicalOperator(final ANode node) {
		if (null == node) {
			return false;
		}

		switch (node.getType()) {
		case Antlr3JavaParser.OR:
		case Antlr3JavaParser.LOGICAL_OR:
		case Antlr3JavaParser.XOR:
		case Antlr3JavaParser.AND:
		case Antlr3JavaParser.LOGICAL_AND:
			return true;
		}
		return false;
	}

}

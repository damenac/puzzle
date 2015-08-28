package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts both additive operators (`+` and `-`).
 * 
 * @author biegel
 */
public final class AcceptAdditiveOperators extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (this.isAdditiveOperator(firstNode) && this
				.isAdditiveOperator(secondNode));
	}

	/**
	 * Checks if node is an additive operator.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return additive operator true/false?
	 */
	private boolean isAdditiveOperator(final ANode node) {
		if (null == node) {
			return false;
		}

		switch (node.getType()) {
		case Antlr3JavaParser.PLUS:
		case Antlr3JavaParser.MINUS:
			return true;
		}
		return false;
	}

}

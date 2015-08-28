package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts the post- and prefix increment operator.
 * 
 * @author biegel
 */
public final class AcceptIncrementOperators extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (this.isIncrementOperator(firstNode) && this
				.isIncrementOperator(secondNode));
	}

	/**
	 * Checks if node is an increment operator.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return increment operator true/false?
	 */
	private boolean isIncrementOperator(final ANode node) {
		if (null == node) {
			return false;
		}

		switch (node.getType()) {
		case Antlr3JavaParser.POST_INC:
		case Antlr3JavaParser.PRE_INC:
			return true;
		}
		return false;
	}

}

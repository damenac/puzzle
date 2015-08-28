package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts the post- and prefix decrement operator.
 * 
 * @author biegel
 */
public final class AcceptDecrementOperators extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (this.isDecrementOperator(firstNode) && this
				.isDecrementOperator(secondNode));
	}

	/**
	 * Checks if node is a decrement operator.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return decrement operator true/false?
	 */
	private boolean isDecrementOperator(final ANode node) {
		if (null == node) {
			return false;
		}

		switch (node.getType()) {
		case Antlr3JavaParser.POST_DEC:
		case Antlr3JavaParser.PRE_DEC:
			return true;
		}
		return false;
	}

}

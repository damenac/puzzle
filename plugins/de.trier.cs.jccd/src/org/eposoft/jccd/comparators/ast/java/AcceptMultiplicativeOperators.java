package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts all multiplicative operators (`*`, `/` and `%`).
 * 
 * @author biegel
 */
public final class AcceptMultiplicativeOperators extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (this.isMultiplicativeOperator(firstNode) && this
				.isMultiplicativeOperator(secondNode));
	}

	/**
	 * Checks if node is a multiplicative operator.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return multiplicative operator true/false?
	 */
	private boolean isMultiplicativeOperator(final ANode node) {
		if (null == node) {
			return false;
		}

		switch (node.getType()) {
		case Antlr3JavaParser.STAR:
		case Antlr3JavaParser.DIV:
		case Antlr3JavaParser.MOD:
			return true;
		}
		return false;
	}

}

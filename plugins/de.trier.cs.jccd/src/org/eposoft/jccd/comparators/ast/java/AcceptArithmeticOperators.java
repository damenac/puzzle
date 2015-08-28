package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts all arithmetic operators (`+`, `-`, `*`, `/` and `%`).
 * 
 * @author biegel
 */
public final class AcceptArithmeticOperators extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (this.isArithmeticOperator(firstNode) && this
				.isArithmeticOperator(secondNode));
	}

	/**
	 * Checks if node is an arithmetic operator.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return arithmetic operator true/false?
	 */
	private boolean isArithmeticOperator(final ANode node) {
		if (null == node) {
			return false;
		}

		switch (node.getType()) {
		case Antlr3JavaParser.PLUS:
		case Antlr3JavaParser.MINUS:
		case Antlr3JavaParser.STAR:
		case Antlr3JavaParser.DIV:
		case Antlr3JavaParser.MOD:
			return true;
		}
		return false;
	}

}

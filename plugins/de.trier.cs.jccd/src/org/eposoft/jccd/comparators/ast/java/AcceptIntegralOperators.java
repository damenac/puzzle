package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts all shift operators (`&`, `|`, `^``<<`, `>>` and `>>>`).
 * 
 * @author biegel
 */
public final class AcceptIntegralOperators extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (this.isShiftOperator(firstNode) && this
				.isShiftOperator(secondNode));
	}

	/**
	 * Checks if node is a shift operator.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return shift operator true/false?
	 */
	private boolean isShiftOperator(final ANode node) {
		if (null == node) {
			return false;
		}

		switch (node.getType()) {
		case Antlr3JavaParser.AND:
		case Antlr3JavaParser.OR:
		case Antlr3JavaParser.XOR:
		case Antlr3JavaParser.SHIFT_LEFT:
		case Antlr3JavaParser.SHIFT_RIGHT:
		case Antlr3JavaParser.BIT_SHIFT_RIGHT:
			return true;
		}
		return false;
	}

}

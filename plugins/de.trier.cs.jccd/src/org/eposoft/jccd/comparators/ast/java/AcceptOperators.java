package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts all operators (arithmetic, bit and shift operators). Except: logical
 * operators!
 * 
 * @author biegel
 */
public final class AcceptOperators extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (this.isOperator(firstNode) && this.isOperator(secondNode));
	}

	/**
	 * Checks if node is an operator.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return operator true/false?
	 */
	private boolean isOperator(final ANode node) {
		if (null == node) {
			return false;
		}

		switch (node.getType()) {
		// arithmetic
		case Antlr3JavaParser.PLUS:
		case Antlr3JavaParser.MINUS:
		case Antlr3JavaParser.STAR:
		case Antlr3JavaParser.DIV:
		case Antlr3JavaParser.MOD:

			// bit
		case Antlr3JavaParser.AND:
		case Antlr3JavaParser.OR:
		case Antlr3JavaParser.XOR:

			// shift
		case Antlr3JavaParser.SHIFT_LEFT:
		case Antlr3JavaParser.SHIFT_RIGHT:
		case Antlr3JavaParser.BIT_SHIFT_RIGHT:
			return true;
		}
		return false;
	}

}

package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts all number literal nodes.
 * 
 * @author biegel
 */
public final class AcceptNumberLiterals extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (this.isNumberLiteral(firstNode) && this
				.isNumberLiteral(secondNode));
	}

	/**
	 * Checks if node is a number literal.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return number literal true/false?
	 */
	private boolean isNumberLiteral(final ANode node) {
		if (null == node) {
			return false;
		}

		switch (node.getType()) {
		case Antlr3JavaParser.CHARACTER_LITERAL:
		case Antlr3JavaParser.FLOATING_POINT_LITERAL:
		case Antlr3JavaParser.HEX_LITERAL:
		case Antlr3JavaParser.DECIMAL_LITERAL:
		case Antlr3JavaParser.OCTAL_LITERAL:
			return true;
		}
		return false;
	}

}

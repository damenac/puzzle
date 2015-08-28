package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts all primitives (number literals, true and false).
 * 
 * @author biegel
 */
public final class AcceptPrimitives extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (this.isPrimitive(firstNode) && this.isPrimitive(secondNode));
	}

	/**
	 * Checks if node is a primitive.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return primitive true/false?
	 */
	private boolean isPrimitive(final ANode node) {
		if (null == node) {
			return false;
		}

		switch (node.getType()) {
		case Antlr3JavaParser.TRUE:
		case Antlr3JavaParser.FALSE:
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

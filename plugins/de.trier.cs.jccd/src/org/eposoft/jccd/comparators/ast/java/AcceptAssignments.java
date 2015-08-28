package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts all assignments (`=`, `+=`, `|=` etc.).
 * 
 * @author biegel
 */
public final class AcceptAssignments extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (this.isAssignment(firstNode) && this.isAssignment(secondNode));
	}

	/**
	 * Checks if node is an assignment.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return assignment true/false?
	 */
	private boolean isAssignment(final ANode node) {
		if (null == node) {
			return false;
		}

		switch (node.getType()) {
		case Antlr3JavaParser.ASSIGN:
		case Antlr3JavaParser.STAR_ASSIGN:
		case Antlr3JavaParser.DIV_ASSIGN:
		case Antlr3JavaParser.MOD_ASSIGN:
		case Antlr3JavaParser.PLUS_ASSIGN:
		case Antlr3JavaParser.MINUS_ASSIGN:
		case Antlr3JavaParser.SHIFT_LEFT_ASSIGN:
		case Antlr3JavaParser.SHIFT_RIGHT_ASSIGN:
		case Antlr3JavaParser.BIT_SHIFT_RIGHT_ASSIGN:
		case Antlr3JavaParser.AND_ASSIGN:
		case Antlr3JavaParser.XOR_ASSIGN:
		case Antlr3JavaParser.OR_ASSIGN:
			return true;
		}
		return false;
	}

}

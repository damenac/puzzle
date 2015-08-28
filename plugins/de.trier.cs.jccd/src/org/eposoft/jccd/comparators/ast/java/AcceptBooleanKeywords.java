package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts true and false.
 * 
 * @author biegel
 */
public final class AcceptBooleanKeywords extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (this.isBooleanKeyword(firstNode) && this
				.isBooleanKeyword(secondNode));
	}

	/**
	 * Checks if node is a boolean keyword.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return boolean keyword true/false?
	 */
	private boolean isBooleanKeyword(final ANode node) {
		if (null == node) {
			return false;
		}

		switch (node.getType()) {
		case Antlr3JavaParser.TRUE:
		case Antlr3JavaParser.FALSE:
			return true;
		}
		return false;
	}

}

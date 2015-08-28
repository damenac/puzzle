package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts identifier nodes (`IDENT` and `DOT`).
 * 
 * @author biegel
 */
public final class AcceptIdentifiers extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (this.isIdentifier(firstNode) && this.isIdentifier(secondNode));
	}

	/**
	 * Checks if node is an identifier.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return equal identifier true/false?
	 */
	private boolean isIdentifier(final ANode node) {
		if (null == node) {
			return false;
		}

		switch (node.getType()) {
		case Antlr3JavaParser.IDENT:
		case Antlr3JavaParser.DOT:
			return true;
		}
		return false;
	}

}

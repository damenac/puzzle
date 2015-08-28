/**
 * 
 */
package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts all class kinds (class, enum, interface) and class blocks
 * 
 * @author biegel
 */
public final class AcceptClassKinds extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (this.isClassOrClassBlock(firstNode) && this
				.isClassOrClassBlock(secondNode));
	}

	/**
	 * Checks if node is a class kind or class block.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return class kind or class block true/false?
	 */
	private boolean isClassOrClassBlock(final ANode node) {
		if (null == node) {
			return false;
		}

		switch (node.getType()) {
		case Antlr3JavaParser.CLASS:
		case Antlr3JavaParser.ENUM:
		case Antlr3JavaParser.INTERFACE:
		case Antlr3JavaParser.CLASS_TOP_LEVEL_SCOPE:
		case Antlr3JavaParser.ENUM_TOP_LEVEL_SCOPE:
		case Antlr3JavaParser.INTERFACE_TOP_LEVEL_SCOPE:
			return true;
		}
		return false;
	}
}

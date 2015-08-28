package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts all primitive types (number types and boolean type)
 * 
 * @author biegel
 */
public final class AcceptPrimitiveTypes extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (this.isPrimitiveType(firstNode) && this
				.isPrimitiveType(secondNode));
	}

	/**
	 * Checks if node is primitive type.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return is primitive type?
	 */
	private boolean isPrimitiveType(final ANode node) {
		if ((null == node) || (null == node.getParent())) {
			return false;
		}

		// first check node type
		switch (node.getType()) {
		case Antlr3JavaParser.BOOLEAN:
		case Antlr3JavaParser.CHAR:
		case Antlr3JavaParser.BYTE:
		case Antlr3JavaParser.DOUBLE:
		case Antlr3JavaParser.FLOAT:
		case Antlr3JavaParser.INT:
		case Antlr3JavaParser.LONG:
		case Antlr3JavaParser.SHORT:
			break;
		default:
			return false;
		}

		// check parent type
		switch (node.getParent().getType()) {
		case Antlr3JavaParser.TYPE:
		case Antlr3JavaParser.QUALIFIED_TYPE_IDENT:
			return true;
		}
		return false;
	}

}

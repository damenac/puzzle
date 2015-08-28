package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.data.ast.NodeAst;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Accepts number literal nodes which are equal if they are converted into
 * double
 * 
 * @author biegel
 */
public final class NumberLiteralToDouble extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		final Double firstValue = this.convertToDouble(firstNode);
		if (null == firstValue) {
			return false;
		}

		final Double secondValue = this.convertToDouble(secondNode);
		if (null == secondValue) {
			return false;
		}

		return (firstValue.equals(secondValue));
	}

	/**
	 * Converts from any number format to double.
	 * 
	 * @param node
	 *            any node from the AST
	 * @return double value of the number
	 */
	private Double convertToDouble(final ANode node) {
		if ((null == node) || !(node instanceof NodeAst)) {
			return null;
		}

		final Double value;
		switch (node.getType()) {
		case Antlr3JavaParser.CHARACTER_LITERAL:
			return (double) ((NodeAst) node).getToken().charAt(1);
		case Antlr3JavaParser.FLOATING_POINT_LITERAL:
			value = Double.valueOf(((NodeAst) node).getToken());
			break;
		case Antlr3JavaParser.HEX_LITERAL:
		case Antlr3JavaParser.DECIMAL_LITERAL:
		case Antlr3JavaParser.OCTAL_LITERAL:
			String nodeValue = ((NodeAst) node).getToken();
			if (nodeValue.endsWith("l") || nodeValue.endsWith("L")) {
				nodeValue = nodeValue.substring(0, nodeValue.length() - 1);
			}
			value = Double.valueOf(Long.decode(nodeValue));
			break;
		default:
			value = null;
		}
		if (null == value) {
			return null;
		}

		return value;
	}

}

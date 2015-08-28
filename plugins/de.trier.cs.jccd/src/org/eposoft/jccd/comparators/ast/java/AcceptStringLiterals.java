package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Checks if both nodes represents string literals.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public class AcceptStringLiterals extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return ((Antlr3JavaParser.STRING_LITERAL == firstNode.getType()) && (Antlr3JavaParser.STRING_LITERAL == secondNode
				.getType()));
	}

}

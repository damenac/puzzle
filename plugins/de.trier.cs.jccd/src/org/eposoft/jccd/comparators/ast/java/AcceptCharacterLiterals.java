package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Checks if both nodes represents character literals.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public class AcceptCharacterLiterals extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return ((Antlr3JavaParser.CHARACTER_LITERAL == firstNode.getType()) && (Antlr3JavaParser.CHARACTER_LITERAL == secondNode
				.getType()));
	}

}

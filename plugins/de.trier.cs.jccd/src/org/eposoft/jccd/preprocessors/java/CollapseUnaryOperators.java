package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Collapses all unary operator nodes and hangs the representing nodes for
 * variable identifier, number literal, boolean literal etc. under the parent.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class CollapseUnaryOperators extends ACollapseNodes {

	@Override
	protected HashSet<Integer> getNodeTypesToCollapse() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.UNARY_PLUS);
		types.add(Antlr3JavaParser.UNARY_MINUS);
		types.add(Antlr3JavaParser.LOGICAL_NOT);
		types.add(Antlr3JavaParser.NOT);
		return types;
	}
}

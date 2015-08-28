package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Collapses unary plus nodes and hangs the representing nodes for variable
 * identifier, number literal, boolean literal etc. under the parent.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class CollapseUnaryPlus extends ACollapseNodes {

	@Override
	protected HashSet<Integer> getNodeTypesToCollapse() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.UNARY_PLUS);
		return types;
	}
}

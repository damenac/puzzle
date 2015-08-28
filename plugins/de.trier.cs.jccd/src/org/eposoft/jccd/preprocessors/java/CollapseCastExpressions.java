package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Collapses cast expression nodes and hangs the representing nodes vor variable
 * identifier, number literal, string literal etc. under the parent.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class CollapseCastExpressions extends ACollapseNodes {

	@Override
	protected HashSet<Integer> getNodeTypesToCollapse() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.CAST_EXPR);
		return types;
	}

	@Override
	protected HashSet<Integer> getChildNodeTypes() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.TYPE);
		types.add(Antlr3JavaParser.RPAREN);
		return types;
	}

	@Override
	protected Mode getModeForChildNodes() {
		return Mode.REMOVE_CHILDREN;
	}
}

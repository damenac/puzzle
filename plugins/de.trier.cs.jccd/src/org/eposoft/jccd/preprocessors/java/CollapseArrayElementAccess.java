package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Collapses array element access nodes and hangs the variable identifier node
 * under the parent.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class CollapseArrayElementAccess extends ACollapseNodes {

	@Override
	protected HashSet<Integer> getNodeTypesToCollapse() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.ARRAY_ELEMENT_ACCESS);
		return types;
	}

	@Override
	protected HashSet<Integer> getChildNodeTypes() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.IDENT);
		types.add(Antlr3JavaParser.DOT);
		return types;
	}

	/**
	 * @return mode for the child nodes (remove or accept)
	 */
	@Override
	protected Mode getModeForChildNodes() {
		return Mode.ONLY_ACCEPT_CHILDREN;
	}
}

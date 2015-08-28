package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Collapses qualified type ident nodes and hangs the variable identifier node
 * under the parent. This will save a bit of space after removing generics with
 * the RemoveGenericTypes preprocessor.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class CollapseQualifiedTypeIdentNodes extends ACollapseNodes {

	@Override
	protected HashSet<Integer> getNodeTypesToCollapse() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.QUALIFIED_TYPE_IDENT);
		return types;
	}

	/**
	 * @return mode for the child nodes (remove or accept)
	 */
	@Override
	protected Mode getModeForChildNodes() {
		return Mode.ACCEPT_ALL_CHILDREN;
	}
}

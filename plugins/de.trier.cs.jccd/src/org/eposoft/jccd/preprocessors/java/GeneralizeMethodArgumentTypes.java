package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Removes all method return type nodes.
 * 
 * @author biegel
 */
public class GeneralizeMethodArgumentTypes extends ARemoveNodes {

	@Override
	protected HashSet<Integer> getNodeTypesToRemove() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.TYPE);
		types.add(Antlr3JavaParser.QUALIFIED_TYPE_IDENT);
		return types;
	}

	@Override
	protected HashSet<Integer> getParentNodeTypesToRemove() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.FORMAL_PARAM_STD_DECL);
		types.add(Antlr3JavaParser.FORMAL_PARAM_VARARG_DECL);
		return types;
	}

}

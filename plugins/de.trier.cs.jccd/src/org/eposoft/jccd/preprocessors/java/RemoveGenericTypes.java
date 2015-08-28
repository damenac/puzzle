package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Removes all generic type nodes.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class RemoveGenericTypes extends ARemoveNodes {
	@Override
	protected HashSet<Integer> getNodeTypesToRemove() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.GENERIC_TYPE_ARG_LIST);
		types.add(Antlr3JavaParser.GENERIC_TYPE_PARAM_LIST);
		return types;
	}
}

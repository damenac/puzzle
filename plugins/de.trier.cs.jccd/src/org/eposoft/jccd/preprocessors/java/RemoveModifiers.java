package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Removes all modifier list nodes.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class RemoveModifiers extends ARemoveNodes {
	@Override
	protected HashSet<Integer> getNodeTypesToRemove() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.MODIFIER_LIST);
		types.add(Antlr3JavaParser.LOCAL_MODIFIER_LIST);
		return types;
	}
}

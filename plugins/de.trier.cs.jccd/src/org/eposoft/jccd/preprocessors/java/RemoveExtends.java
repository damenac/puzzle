package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Removes all extends clauses.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class RemoveExtends extends ARemoveNodes {
	@Override
	protected HashSet<Integer> getNodeTypesToRemove() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.EXTENDS_CLAUSE);
		return types;
	}
}

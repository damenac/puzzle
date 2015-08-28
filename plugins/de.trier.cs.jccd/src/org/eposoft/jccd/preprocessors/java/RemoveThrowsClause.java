package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Removes all assert nodes.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class RemoveThrowsClause extends ARemoveNodes {
	@Override
	protected HashSet<Integer> getNodeTypesToRemove() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.THROWS_CLAUSE);
		return types;
	}
}

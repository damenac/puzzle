package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Removes all import information.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class RemoveImports extends ARemoveNodes {
	@Override
	protected HashSet<Integer> getNodeTypesToRemove() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.IMPORT);
		return types;
	}
}

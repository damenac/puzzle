package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Removes all annotation nodes.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class RemoveAnnotations extends ARemoveNodes {
	@Override
	protected HashSet<Integer> getNodeTypesToRemove() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.ANNOTATION_LIST);
		types.add(Antlr3JavaParser.AT);
		return types;
	}
}

package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Abstract class for all identifier remove preprocessors.
 * 
 * @author biegel
 */
public abstract class ARemoveIdentifierNodes extends ARemoveNodes {

	@Override
	protected HashSet<Integer> getNodeTypesToRemove() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.DOT);
		types.add(Antlr3JavaParser.IDENT);
		return types;
	}

	@Override
	protected abstract HashSet<Integer> getParentNodeTypesToRemove();

}

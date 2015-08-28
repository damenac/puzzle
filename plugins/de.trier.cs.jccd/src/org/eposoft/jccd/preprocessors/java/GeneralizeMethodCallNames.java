package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Removes all identifier of method calls.
 * 
 * @author biegel
 */
public class GeneralizeMethodCallNames extends ARemoveIdentifierNodes {

	@Override
	protected HashSet<Integer> getParentNodeTypesToRemove() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.METHOD_CALL);
		return types;
	}

}

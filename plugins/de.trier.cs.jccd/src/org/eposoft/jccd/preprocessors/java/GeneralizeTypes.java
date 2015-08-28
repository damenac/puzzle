package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Removes all type nodes.
 * 
 * @author biegel
 */
public class GeneralizeTypes extends ARemoveNodes {

	@Override
	protected HashSet<Integer> getNodeTypesToRemove() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.TYPE);
		types.add(Antlr3JavaParser.QUALIFIED_TYPE_IDENT);
		return types;
	}

}

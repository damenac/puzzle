package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Removes all identifier of classes, enums and interfaces.
 * 
 * @author biegel
 */
public class GeneralizeClassDeclarationNames extends ARemoveIdentifierNodes {

	@Override
	protected HashSet<Integer> getParentNodeTypesToRemove() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.CLASS);
		types.add(Antlr3JavaParser.ENUM);
		types.add(Antlr3JavaParser.INTERFACE);
		return types;
	}

}

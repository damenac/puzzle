package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Removes all identifier of method declarations.
 * 
 * @author biegel
 */
public class GeneralizeMethodDeclarationNames extends ARemoveIdentifierNodes {

	@Override
	protected HashSet<Integer> getParentNodeTypesToRemove() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.VOID_METHOD_DECL);
		types.add(Antlr3JavaParser.FUNCTION_METHOD_DECL);
		return types;
	}

}

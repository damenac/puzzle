package org.eposoft.jccd.preprocessors.java;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Removes all get method declarations (e.g. `public String getName() {...}`).
 * The next character must be capitalized.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class RemoveIsMethodDeclarations extends
		ARemovePrefixedMethodDeclarations {

	@Override
	protected String getPrefixString() {
		return "is";
	}

	@Override
	protected int getRemovableNode() {
		return Antlr3JavaParser.FUNCTION_METHOD_DECL;
	}

}

package org.eposoft.jccd.preprocessors.java;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Removes all set method declarations (e.g. `public void setName(int name)
 * {...}`). The next character must be capitalized.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class RemoveSetMethodDeclarations extends
		ARemovePrefixedMethodDeclarations {

	@Override
	protected String getPrefixString() {
		 return "set";
	}

	@Override
	protected int getRemovableNode() {
		 return Antlr3JavaParser.VOID_METHOD_DECL;
	}

}

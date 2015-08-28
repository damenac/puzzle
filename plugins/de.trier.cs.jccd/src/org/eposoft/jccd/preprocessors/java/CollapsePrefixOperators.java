package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Collapses prefix operator nodes and hangs the child nodes under the parent.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class CollapsePrefixOperators extends ACollapseNodes {

	@Override
	protected HashSet<Integer> getNodeTypesToCollapse() {
		final HashSet<Integer> types = new HashSet<Integer>();
		types.add(Antlr3JavaParser.PRE_INC);
		types.add(Antlr3JavaParser.PRE_DEC);
		return types;
	}
}

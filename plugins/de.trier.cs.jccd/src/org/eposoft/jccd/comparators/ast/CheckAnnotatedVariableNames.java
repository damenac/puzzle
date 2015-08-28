package org.eposoft.jccd.comparators.ast;

import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.preprocessors.java.ARenameVariableNames;

/**
 * Checks if all varname annotations of variable identifier nodes are equal.
 * 
 * @author biegel
 */
public final class CheckAnnotatedVariableNames extends AAndComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		final String firstName = (String) firstNode.getAnnotation(
				ARenameVariableNames.class, "varname");
		if (null == firstName) {
			return true;
		}
		final String secondName = (String) secondNode.getAnnotation(
				ARenameVariableNames.class, "varname");

		return firstName.equals(secondName);
	}
}

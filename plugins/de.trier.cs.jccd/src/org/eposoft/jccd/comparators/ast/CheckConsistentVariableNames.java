package org.eposoft.jccd.comparators.ast;

import java.util.HashMap;

import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.preprocessors.java.ARenameVariableNames;

/**
 * Checks if all variable identifier have a consistent used name (p-match).
 * 
 * @author biegel
 */
public final class CheckConsistentVariableNames extends AAndComparator {

	/** map of all variable names */
	final HashMap<String, String> variableNames = new HashMap<String, String>();

	@Override
	public boolean checkSimilarity(final ANode firstNode, final ANode secondNode) {
		final boolean areSimilar = walkThroughTree(firstNode, secondNode);
		this.variableNames.clear();
		return areSimilar;
	}

	/**
	 * Walk through the whole AST and check if annotated variable names are
	 * consistent.
	 * 
	 * @param firstNode
	 *            any node of the AST
	 * @param secondNode
	 *            any node of the AST
	 * @return
	 */
	private boolean walkThroughTree(final ANode firstNode,
			final ANode secondNode) {
		final String firstName = (String) firstNode.getAnnotation(
				ARenameVariableNames.class, "varname");
		final String secondName = (String) secondNode.getAnnotation(
				ARenameVariableNames.class, "varname");

		// if only one name is not set, then return false
		if ((null == firstName) || (null == secondName)) {
			if ((null != secondName) || (null != firstName)) {
				return false;
			}
		} else {
			// variable name given, check names
			final String expectedVariableName = this.variableNames
					.get(firstName);
			if (null == expectedVariableName) {
				// check if second also wasn't set yet
				if (null != this.variableNames.get(secondName)) {
					return false;
				}

				// name not set yet
				this.variableNames.put(firstName, secondName);
				this.variableNames.put(secondName, firstName);
			} else {
				// name found, check equality ...
				if (!secondName.equals(expectedVariableName)) {
					return false;
				}
			}
		}

		if (firstNode.getChildCount() != secondNode.getChildCount()) {
			return false;
		}

		if (0 == firstNode.getChildCount()) {
			return true;
		}

		boolean areSimilar = true;
		for (int i = 0; i < firstNode.getChildCount(); i++) {
			areSimilar &= walkThroughTree(firstNode.getChild(i), secondNode
					.getChild(i));
		}
		return areSimilar;
	}
}

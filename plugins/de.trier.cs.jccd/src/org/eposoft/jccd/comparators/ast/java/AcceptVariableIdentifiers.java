package org.eposoft.jccd.comparators.ast.java;

import org.eposoft.jccd.comparators.ast.AOrComparator;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.preprocessors.java.ARenameVariableNames;

/**
 * Accepts variable identifier nodes.
 * 
 * @author biegel
 */
public final class AcceptVariableIdentifiers extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return (ARenameVariableNames.isVariableIdentifier(firstNode) && ARenameVariableNames
				.isVariableIdentifier(secondNode));
	}
}

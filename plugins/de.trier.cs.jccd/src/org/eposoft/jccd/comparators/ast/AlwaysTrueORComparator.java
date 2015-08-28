package org.eposoft.jccd.comparators.ast;

import org.eposoft.jccd.data.ast.ANode;

/**
 * This comparator returns always true.
 * 
 * @author biegel
 */
public final class AlwaysTrueORComparator extends AOrComparator {

	@Override
	public boolean checkSimilarity(ANode firstNode, ANode secondNode) {
		return true;
	}

}

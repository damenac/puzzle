package org.eposoft.jccd.comparators.ast;

import org.eposoft.jccd.comparators.IComparator;
import org.eposoft.jccd.data.ast.ANode;

/**
 * Compares two nodes of an AST for similarities. Two subtrees are marked as
 * similar only if this comparator type returns true.
 * 
 * @author biegel
 */
public abstract class AAndComparator implements IComparator<ANode> {
}

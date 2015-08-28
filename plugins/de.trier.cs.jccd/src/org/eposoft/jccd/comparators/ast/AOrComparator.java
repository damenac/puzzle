package org.eposoft.jccd.comparators.ast;

import org.eposoft.jccd.comparators.IComparator;
import org.eposoft.jccd.data.ast.ANode;

/**
 * Compares two nodes of an AST for similarities. At least one or-comparator
 * must be true to mark two nodes as similar.
 * 
 * @author biegel
 */
public abstract class AOrComparator implements IComparator<ANode> {
}

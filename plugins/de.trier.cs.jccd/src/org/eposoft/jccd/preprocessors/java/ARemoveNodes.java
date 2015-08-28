package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.preprocessors.APreprocessor;

/**
 * Abstract class to remove different kinds of nodes (optional: dependency of
 * the parent node)
 * 
 * @author biegel
 */
public abstract class ARemoveNodes extends APreprocessor {

	/** set of all node types which will be removed */
	final HashSet<Integer> types;

	/** set of all parent node types */
	final HashSet<Integer> parentTypes;

	/**
	 * Standard constructor to set the types hashset.
	 */
	public ARemoveNodes() {
		this.types = this.getNodeTypesToRemove();
		this.parentTypes = this.getParentNodeTypesToRemove();
	}

	/**
	 * Setups the node types which will be removed.
	 */
	protected abstract HashSet<Integer> getNodeTypesToRemove();

	/**
	 * Setups the node types of the parents.
	 * 
	 * @return
	 */
	protected HashSet<Integer> getParentNodeTypesToRemove() {
		return null;
	}

	@Override
	protected final void process(final SourceUnitManager container) {
		walkThroughTree((ASTManager) container);
	}

	/**
	 * Walks through whole tree and removes special nodes.
	 * 
	 * @param container
	 *            preprocessing container
	 */
	private void walkThroughTree(final ASTManager container) {
		int i = 0;
		while (i < container.getChildCountOfMarkedNode()) {
			final ANode child = container.getMarkedNode().getChild(i);
			final boolean removeNode = this.types.contains(child.getType());

			final boolean isCorrectParent;
			if (null == this.parentTypes) {
				isCorrectParent = true;
			} else {
				if (null == child.getParent()) {
					isCorrectParent = false;
				} else {
					isCorrectParent = this.parentTypes.contains(child
							.getParent().getType());
				}
			}

			if (removeNode && isCorrectParent) {
				container.removeChildOfMarkedNode(i);
			} else {
				container.markChild(i);
				walkThroughTree(container);
				++i;
				container.markParentNode();
			}
		}
	}
}

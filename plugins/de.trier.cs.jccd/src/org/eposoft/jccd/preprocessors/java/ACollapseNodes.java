package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.preprocessors.APreprocessor;

/**
 * Abstract class to collapse different kinds of nodes (optional: remove special
 * child nodes)
 * 
 * @author biegel
 */
public abstract class ACollapseNodes extends APreprocessor {

	/**
	 * Two different modes for the given child types.
	 * 
	 * @author biegel
	 */
	protected enum Mode {
		ACCEPT_ALL_CHILDREN, REMOVE_CHILDREN, ONLY_ACCEPT_CHILDREN
	}

	/** mode for the given child nodes */
	private final Mode mode;

	/** set of all node types which will be collapsed */
	final HashSet<Integer> collapseTypes;

	/**
	 * set of all child node types which will be hanged under the parent node or
	 * will be removed
	 */
	final HashSet<Integer> childTypes;

	/**
	 * Standard constructor to set the types hashset.
	 */
	public ACollapseNodes() {
		this.collapseTypes = this.getNodeTypesToCollapse();
		this.childTypes = this.getChildNodeTypes();
		final Mode mode = this.getModeForChildNodes();
		if (null == mode) {
			this.mode = Mode.ACCEPT_ALL_CHILDREN;
		} else {
			this.mode = mode;
		}
	}

	/**
	 * Setups the node types which will be removed.
	 */
	protected abstract HashSet<Integer> getNodeTypesToCollapse();

	/**
	 * Setups the node types of the children which will be hanged under the
	 * parent node or will be removed.
	 * 
	 * @return
	 */
	protected HashSet<Integer> getChildNodeTypes() {
		return null;
	}

	/**
	 * @return mode for the child nodes (remove or accept)
	 */
	protected Mode getModeForChildNodes() {
		return null;
	}

	@Override
	protected final void process(final SourceUnitManager container) {
		walkThroughTree((ASTManager)container);
	}

	/**
	 * Walks through whole tree and collapse special nodes.
	 * 
	 * @param container
	 *            preprocessing container
	 * @param collapseTypes
	 *            type names which will be collapsed
	 */
	private void walkThroughTree(final ASTManager container) {
		int i = 0;
		while (i < container.getChildCountOfMarkedNode()) {
			final ANode child = container.getMarkedNode().getChild(i);
			final boolean isCollapseNode = this.collapseTypes.contains(child
					.getType());
			if (isCollapseNode) {
				// remove special child node types
				if ((Mode.ACCEPT_ALL_CHILDREN != this.mode)
						&& (null != this.childTypes)) {
					int j = 0;
					while (j < child.getChildCount()) {
						final boolean removeChild;
						final int childType = child.getChild(j).getType();
						if (Mode.ONLY_ACCEPT_CHILDREN == this.mode) {
							removeChild = !((this.childTypes
									.contains(childType)) || (this.collapseTypes
									.contains(childType)));
						} else {
							removeChild = (this.childTypes.contains(childType) && !(this.collapseTypes
									.contains(childType)));
						}

						if (removeChild) {
							container.markChild(i);
							container.removeChildOfMarkedNode(j);
							container.markParentNode();
						} else {
							++j;
						}
					}
				}
				container.collapseChildOfMarkedNode(i);
			} else {
				container.markChild(i);
				walkThroughTree(container);
				container.markParentNode();
				++i;
			}
		}
	}
}

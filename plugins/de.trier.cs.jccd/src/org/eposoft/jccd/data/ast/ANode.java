package org.eposoft.jccd.data.ast;

import java.util.Vector;

import org.eposoft.jccd.data.ASourceUnit;
import org.eposoft.jccd.data.SourceUnitPosition;

/**
 * The AST representation of a source unit.
 * 
 * @author biegel
 */
public abstract class ANode extends ASourceUnit implements Cloneable {

	/** all child-nodes */
	private Vector<ANode> children = null;

	/**
	 * position number in respect of the parent (e.g. 3th child node of the
	 * parent )
	 */
	private int treePosition = -1;

	/** parent of this node */
	private ANode parent = null;

	/** node-type */
	private int type = -1;

	@Override
	public ANode clone() throws CloneNotSupportedException {
		final ANode clonedNode = (ANode) super.clone();

		if (null != this.position) {
			clonedNode.position = new SourceUnitPosition(this.position
					.getLine(), this.position.getCharacter());
		}

		// clone annotations
		if (null != this.annotations) {
			clonedNode.annotations = null;
			for (final Class<?> group : this.annotations.keySet()) {
				for (final Object key : this.annotations.get(group).keySet()) {
					clonedNode.addAnnotation(group, key, this.annotations.get(
							group).get(key));
				}
			}
		}

		clonedNode.children = null;
		clonedNode.parent = null;

		if (this.hasChildren()) {
			for (final ANode child : this.children) {
				clonedNode.addChild(child.clone());
			}
		}

		return clonedNode;
	}

	/**
	 * @param _parent
	 *            parent of this node
	 */
	void setParent(final ANode _parent) {
		parent = _parent;
	}

	/**
	 * Adds a child to this node.
	 * 
	 * @param child
	 *            any SimrfTree-node
	 */
	void addChild(final ANode child) {
		this.addChild(child, -1);
	}

	/**
	 * Swap two children.
	 * 
	 * @param i
	 *            first child
	 * @param j
	 *            second child
	 */
	void swapChildren(int i, int j) {
		if (i < 0 || j < 0) {
			return;
		}

		if ((this.getChildCount() - 1 < i) || (this.getChildCount() - 1 < j)) {
			return;
		}

		final ANode child1 = this.getChild(i);
		final ANode child2 = this.getChild(j);
		this.removeChild(i);
		this.addChild(child2, i);
		this.removeChild(j);
		this.addChild(child1, j);

	}

	void addChild(final ANode child, final int childPosition) {
		if (this.children == null) {
			this.children = new Vector<ANode>();
		}

		if (-1 == childPosition) {
			child.treePosition = this.children.size();
			this.children.add(child);
		} else {
			child.treePosition = childPosition;
			this.children.add(childPosition, child);
			this.correctChildPosition(childPosition);
		}
		child.setParent(this);
	}

	/**
	 * @return parent of this node
	 */
	public ANode getParent() {
		return parent;
	}

	/**
	 * @param i
	 *            child number
	 * @return child with specific number
	 */
	public ANode getChild(int i) {
		return this.children.get(i);
	}

	/**
	 * @return has this node children?
	 */
	public boolean hasChildren() {
		return (0 < this.getChildCount());
	}

	/**
	 * @return children amount
	 */
	public int getChildCount() {
		if (this.children == null) {
			return 0;
		}
		return children.size();
	}

	/**
	 * Computes an unique identifier for this node.
	 * 
	 * @return unique identifier
	 */
	public String getNodeIdentifier() {
		if (this.isRoot()) {
			return this.getText();
		}

		final StringBuffer sb = new StringBuffer();
		// sb.append(this.treePosition);
		ANode parent = this;
		boolean showSeperator = false;
		while (null != parent) {
			if (showSeperator) {
				sb.insert(0, '|');
			}

			showSeperator = true;

			if (parent.isRoot()) {
				sb.insert(0, parent.getText());
			} else {
				sb.insert(0, parent.treePosition);
			}
			parent = parent.getParent();
		}

		return sb.toString();
	}

	/**
	 * @return is this node a leaf or not?
	 */
	public boolean isLeaf() {
		return (getChildCount() == 0);
	}

	/**
	 * @return is this node root or not?
	 */
	public boolean isRoot() {
		return (parent == null);
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return this.type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	void setType(int type) {
		this.type = type;
	}

	/**
	 * Collapses a child with given index
	 * 
	 * @param childPosition
	 *            index of the child
	 */
	void collapseChild(final int childPosition) {
		if ((null == this.parent) || (null == this.children)) {
			return;
		}

		final ANode collapseNode = this.children.get(childPosition);
		this.children.remove(childPosition);
		if (0 != collapseNode.getChildCount()) {
			for (int i = collapseNode.getChildCount(); --i >= 0;) {
				this.children.add(childPosition, collapseNode.getChild(i));
				collapseNode.getChild(i).setParent(this);
			}
		}
		this.correctChildPosition(childPosition);
	}

	/**
	 * Removes a child with given index.
	 * 
	 * @param childPosition
	 *            index of the child
	 */
	void removeChild(int childPosition) {
		if (null == this.children) {
			return;
		}

		this.children.remove(childPosition);
		this.correctChildPosition(childPosition);
	}

	/**
	 * Correct all child positions from given index
	 * 
	 * @param fromChildPosition
	 *            all child tree-positions after this index will be updated
	 */
	private void correctChildPosition(final int fromChildPosition) {
		if (fromChildPosition < this.children.size()) {
			for (int i = fromChildPosition; i < this.children.size(); i++) {
				this.children.get(i).treePosition = i;
			}
		}
	}

	/**
	 * Removes all children.
	 */
	void removeAllChildren() {
		this.children = null;
	}

}

package org.eposoft.jccd.data.ast;

import java.util.Vector;

import org.eposoft.jccd.data.ASourceUnit;
import org.eposoft.jccd.data.JCCDFile;
import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.parser.AParser;
import org.eposoft.jccd.preprocessors.APreprocessor;

/**
 * Manager for ASTs.
 * 
 * This includes all functionalities like creating, adding, removing, sorting,
 * collapsing, and merging nodes.
 * 
 * @author biegel
 */
public class ASTManager extends SourceUnitManager {

	/** current marked node to manipulate */
	protected ANode currentNode;

	/** root node of the SimRF-AST */
	protected ANode root;

	/**
	 * Standard constructor.
	 */
	public ASTManager() {
		this.root = new NodeAst();
	}

	/**
	 * Constructor with initial values for the root node.
	 */
	public ASTManager(final int rootType, final String rootText) {
		this.root = new NodeAst();
		this.root.setType(rootType);
		this.root.setText(rootText);
	}

	/**
	 * Adds a group node under the current marked node and hangs the children
	 * under this new node.
	 * 
	 * @param childPosition
	 *            position of the child which will be hang under the new group
	 *            node
	 * @param text
	 *            text of the node
	 * @param type
	 *            type of the node
	 */
	public void addGroupNodeOverChild(final int childPosition,
			final String text, final int type) {
		final NodeAstGroup groupNode = new NodeAstGroup();
		groupNode.setText(text);
		groupNode.setType(type);
		groupNode.addChild(this.currentNode.getChild(childPosition));
		this.currentNode.removeChild(childPosition);
		this.currentNode.addChild(groupNode, childPosition);
	}

	public void addNodeOverChild(final int childPosition, final String text,
			final int type) {
		final NodeAst node = new NodeAst();
		node.setText(text);
		node.setType(type);
		node.setLine(this.currentNode.getChild(childPosition).getLine());
		node.setCharPositionInLine(this.currentNode.getChild(childPosition)
				.getCharPositionInLine());
		node.addChild(this.currentNode.getChild(childPosition));
		this.currentNode.removeChild(childPosition);
		this.currentNode.addChild(node, childPosition);
	}

	/**
	 * Adds a new node to the root node.
	 * 
	 * @param node
	 *            any node
	 */
	public void addNodeToRoot(final ANode node) {
		this.root.addChild(node);
	}

	@Override
	public ASTManager clone() {
		final ASTManager clonedContainer = new ASTManager();
		for (final Class<? extends APreprocessor> preprocessor : this.preprocessors) {
			clonedContainer.addPreprocessor(preprocessor);
		}
		try {
			clonedContainer.root = this.root.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clonedContainer;
	}

	/**
	 * Collapses the child with the given position of the current node.
	 * 
	 * @param i
	 *            child position
	 */
	public void collapseChildOfMarkedNode(final int i) {
		if (null == this.currentNode) {
			return;
		}
		this.currentNode.collapseChild(i);
	}

	/**
	 * Swaps two children.
	 * 
	 * @param i
	 *            first child
	 * @param j
	 *            second child
	 */
	public void swapChildrenOfMarkedNode(int i, int j) {
		this.getMarkedNode().swapChildren(i, j);
	}

	/**
	 * Creates a new child group node of the current marked node.
	 */
	public void createChildGroupNode() {
		final ANode child = new NodeAstGroup();
		this.currentNode.addChild(child);
	}

	/**
	 * Creates a new child group node of the current marked node.
	 */
	public void createChildGroupNode(final String text, final int type) {
		final ANode child = new NodeAstGroup();
		child.setText(text);
		child.setType(type);
		this.currentNode.addChild(child);
	}

	/**
	 * Creates a new child node of the current marked node.
	 */
	public void createChildNode() {
		final ANode child = new NodeAst();
		this.currentNode.addChild(child);
	}

	/**
	 * Returns annotation of the current marked node.
	 * 
	 * @param group
	 *            group name
	 * @param key
	 *            key name
	 * @return value
	 */
	public Object getCurrentAnnotation(final Class<?> group, final Object key) {
		if (null == this.currentNode) {
			return null;
		}

		return this.currentNode.getAnnotation(group, key);
	}

	/**
	 * @return child count of current node
	 */
	public int getChildCountOfMarkedNode() {
		if (null == this.currentNode) {
			return -1;
		}
		return this.currentNode.getChildCount();
	}

	/**
	 * @return current marked node
	 */
	public ANode getMarkedNode() {
		return this.currentNode;
	}

	/**
	 * @return the root
	 */
	public ANode getRoot() {
		return root;
	}

	/**
	 * @return all used preprocessors as vector (copy)
	 */
	public Vector<Class<? extends APreprocessor>> getUsedPreprocessors() {
		final Vector<Class<? extends APreprocessor>> preprocessors = new Vector<Class<? extends APreprocessor>>();
		for (final Class<? extends APreprocessor> preprocessor : this.preprocessors) {
			preprocessors.add(preprocessor);
		}
		return preprocessors;
	}

	/**
	 * @return AST has file nodes or not
	 */
	@Override
	public boolean isEmpty() {
		return (0 == this.root.getChildCount());
	}

	/**
	 * Marks child with given position number.
	 * 
	 * @param child
	 *            position number
	 */
	public void markChild(final int child) {
		this.currentNode = this.currentNode.getChild(child);
	}

	/**
	 * Marks the parent node of the current marked node as 'current node'.
	 */
	public void markParentNode() {
		if (null != this.currentNode.getParent()) {
			this.currentNode = this.currentNode.getParent();
		}
	}

	/**
	 * Marks root node.
	 */
	public void markRootNode() {
		this.currentNode = this.root;
	}

	/**
	 * Merges this container managers with another one.
	 * 
	 * @param container
	 *            container manager which will be merged to this one
	 */
	public void mergeWith(final ASTManager container) {
		if (null == container) {
			// XXX exception would be nice!
			return;
		}

		// clone version container
		final ASTManager mergedContainer = container.clone();

		final ANode secondRoot = mergedContainer.getRoot();
		if (0 == secondRoot.getChildCount()) {
			return;
		}

		// remove file nodes with same name and prefix
		final JCCDFile[] secondFiles = new JCCDFile[secondRoot.getChildCount()];
		for (int i = secondRoot.getChildCount(); --i >= 0;) {
			final ASourceUnit child = secondRoot.getChild(i);
			final String prefix = (String) child.getAnnotation(AParser.class,
					"file_prefix");
			secondFiles[i] = new JCCDFile(prefix + child.getText(), prefix);
		}
		this.removeFiles(secondFiles);

		// now add all cloned files nodes from the second version to the first
		// version
		for (int i = secondRoot.getChildCount(); --i >= 0;) {
			final ANode child = secondRoot.getChild(i);
			try {
				this.addNodeToRoot(child.clone());
			} catch (CloneNotSupportedException e) {
				// XXX exception would be nice.
				e.printStackTrace();
			}
		}
	}

	/**
	 * Removes the children of the current node.
	 */
	public void removeAllChildrenOfMarkedNode() {
		if (null == this.currentNode) {
			return;
		}

		this.currentNode.removeAllChildren();
	}

	/**
	 * Removes child with given position of current node
	 * 
	 * @param i
	 *            child position
	 */
	public void removeChildOfMarkedNode(final int i) {
		if (null == this.currentNode) {
			return;
		}

		this.currentNode.removeChild(i);
	}

	/**
	 * Removes file nodes.
	 * 
	 * @param files
	 *            files to remove
	 */
	public void removeFiles(final JCCDFile[] files) {
		this.removeFiles(files, false);
	}

	/**
	 * Removes file nodes.
	 * 
	 * @param files
	 *            files to remove
	 * @param checkPrefix
	 *            check also the prefix of the JCCDFile
	 */
	public void removeFiles(final JCCDFile[] files, final boolean checkPrefix) {
		if ((null == files) || (0 == files.length)) {
			// XXX exception would be nice here
			return;
		}

		this.markRootNode();
		final ASTManager pContainer = this;
		if (0 == pContainer.getChildCountOfMarkedNode()) {
			return;
		}

		// put files to a vector to optimize the runtime
		final Vector<JCCDFile> fileVec = new Vector<JCCDFile>();
		for (final JCCDFile file : files) {
			fileVec.add(file);
		}

		int i = pContainer.getChildCountOfMarkedNode() - 1;
		while (i >= 0) {
			pContainer.markRootNode();
			pContainer.markChild(i);
			// check if current node represents one of the removable files
			for (int j = fileVec.size(); --j >= 0;) {
				// check simple file name without prefix
				if ((null == fileVec.get(j).getName())
						|| (!fileVec.get(j).getNameWithoutPrefix().equals(
								pContainer.getMarkedNode().getText()))) {
					continue;
				}

				// check prefix
				if (checkPrefix && (null != fileVec.get(j).getPrefix())) {
					final String prefix = (String) pContainer
							.getCurrentAnnotation(AParser.class, "file_prefix");
					if (!fileVec.get(j).getPrefix().equals(prefix)) {
						continue;
					}
				}

				// remove node
				fileVec.remove(j);
				pContainer.markRootNode();
				pContainer.removeChildOfMarkedNode(i);
				break;
			}
			--i;
		}
	}

	/**
	 * @param charPositionInLine
	 */
	public void setCharPositionInLine(final int charPositionInLine) {
		this.currentNode.setCharPositionInLine(charPositionInLine);
	}

	/**
	 * @param line
	 */
	public void setLine(final int line) {
		this.currentNode.setLine(line);
	}

	/**
	 * @param text
	 */
	public void setText(final String text) {
		this.currentNode.setText(text);
	}

	/**
	 * @param type
	 */
	public void setType(final int type) {
		this.currentNode.setType(type);
	}

	@Override
	public void rewind() {
		this.markRootNode();
	}

}

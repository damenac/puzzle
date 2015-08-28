package org.eposoft.jccd.preprocessors.java;

import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.data.ast.NodeAstGroup;
import org.eposoft.jccd.preprocessors.APreprocessor;

/**
 * Removes all empty group nodes.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class RemoveEmptyGroupNodes extends APreprocessor {

	@Override
	protected void process(SourceUnitManager container) {
		walkThroughTree((ASTManager) container);
	}

	/**
	 * Walks through whole tree and removes empty group nodes.
	 * 
	 * @param container
	 *            preprocessing container
	 * @return remove child, true -> remove
	 */
	private boolean walkThroughTree(final ASTManager container) {
		if ((0 == container.getChildCountOfMarkedNode())
				&& (container.getMarkedNode() instanceof NodeAstGroup)) {
			return true;
		} else if (0 == container.getChildCountOfMarkedNode()) {
			return false;
		}

		int i = 0;
		while (i < container.getChildCountOfMarkedNode()) {
			container.markChild(i);
			final boolean removeNode = walkThroughTree(container);
			container.markParentNode();

			if (removeNode) {
				container.removeChildOfMarkedNode(i);
			} else {
				++i;
			}
		}

		return ((0 == container.getChildCountOfMarkedNode()) && (container
				.getMarkedNode() instanceof NodeAstGroup));
	}

}

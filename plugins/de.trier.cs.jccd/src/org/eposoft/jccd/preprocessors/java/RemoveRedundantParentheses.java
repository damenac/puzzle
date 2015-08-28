package org.eposoft.jccd.preprocessors.java;

import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;
import org.eposoft.jccd.preprocessors.APreprocessor;

/**
 * Removes all redundant parentheses.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class RemoveRedundantParentheses extends APreprocessor {

	@Override
	protected void process(SourceUnitManager container) {
		walkThroughTree((ASTManager) container);
	}

	/**
	 * Walks through whole tree and removes redundant parentheses.
	 * 
	 * @param container
	 *            preprocessing container
	 */
	private void walkThroughTree(final ASTManager container) {
		int i = 0;
		while (i < container.getChildCountOfMarkedNode()) {
			final ANode child = container.getMarkedNode().getChild(i);

			boolean isParenthesis = (Antlr3JavaParser.PARENTESIZED_EXPR == child
					.getType());
			if (isParenthesis) {
				// collapse EXPR-node
				if (0 < child.getChildCount()) {
					container.markChild(i);
					// remove closing brace
					if (1 < child.getChildCount()) {
						container.removeChildOfMarkedNode(1);
					}
					container.collapseChildOfMarkedNode(0);
					container.markParentNode();
				}
				container.collapseChildOfMarkedNode(i);
			}

			container.markChild(i);
			walkThroughTree(container);
			container.markParentNode();

			if (!isParenthesis) {
				++i;
			}
		}
	}

}

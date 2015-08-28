package org.eposoft.jccd.preprocessors.java;

import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;
import org.eposoft.jccd.preprocessors.APreprocessor;

/**
 * Removes all empty block nodes.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class RemoveSimpleMethods extends APreprocessor {

	@Override
	protected void process(SourceUnitManager container) {
		walkThroughTree((ASTManager) container);
	}

	/**
	 * Walks through whole tree and removes empty block nodes.
	 * 
	 * @param container
	 *            preprocessing container
	 */
	private void walkThroughTree(final ASTManager container) {
		int i = 0;
		while (i < container.getChildCountOfMarkedNode()) {
			final ANode child = container.getMarkedNode().getChild(i);
			final boolean candidateNode = ((child.getType() == Antlr3JavaParser.VOID_METHOD_DECL) || (child
					.getType() == Antlr3JavaParser.FUNCTION_METHOD_DECL));

			boolean nodeRemoved = false;
			// check if node is a method node
			if (candidateNode) {
				// remove if block has only 1 element
				if (child.hasChildren()) {
					for (int j = 0; j < child.getChildCount(); j++) {
						if (child.getChild(j).getType() == Antlr3JavaParser.BLOCK_SCOPE) {
							if (child.getChild(j).getChildCount() < 4) {
								container.removeChildOfMarkedNode(i);
								nodeRemoved = true;
							}
							break;
						}
					}
				}
			}

			if (!nodeRemoved) {
				container.markChild(i);
				walkThroughTree(container);
				++i;
				container.markParentNode();
			}
		}
	}

}

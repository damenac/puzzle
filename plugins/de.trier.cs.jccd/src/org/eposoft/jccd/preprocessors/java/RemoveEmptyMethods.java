package org.eposoft.jccd.preprocessors.java;

import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;
import org.eposoft.jccd.preprocessors.APreprocessor;

/**
 * Removes all empty methods (definitions e.g. in interfaces or methods without
 * a block-node as child).
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class RemoveEmptyMethods extends APreprocessor {

	@Override
	protected void process(SourceUnitManager container) {
		walkThroughTree((ASTManager) container);
	}

	/**
	 * Walks through whole tree and removes empty methods.
	 * 
	 * @param container
	 *            preprocessing container
	 */
	private void walkThroughTree(final ASTManager container) {
		int i = 0;
		while (i < container.getChildCountOfMarkedNode()) {
			final ANode child = container.getMarkedNode().getChild(i);
			final boolean isMethod;
			switch (child.getType()) {
			case Antlr3JavaParser.VOID_METHOD_DECL:
			case Antlr3JavaParser.FUNCTION_METHOD_DECL:
				isMethod = true;
				break;
			default:
				isMethod = false;
				break;
			}

			boolean nodeRemoved = false;
			if (isMethod) {
				if ((0 < child.getChildCount())
						&& (Antlr3JavaParser.BLOCK_SCOPE != child.getChild(
								child.getChildCount() - 1).getType())) {
					container.removeChildOfMarkedNode(i);
					nodeRemoved = true;
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

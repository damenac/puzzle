package org.eposoft.jccd.preprocessors.java;

import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;
import org.eposoft.jccd.preprocessors.APreprocessor;

/**
 * Reduces fully qualified identifier string to the last substring. e.g.:
 * org.eposoft.epos.MyParentClass.MyClass -> MyClass
 * 
 * @author biegel
 */
public final class ReduceIdentifiersToLastSubstring extends APreprocessor {

	@Override
	protected final void process(SourceUnitManager container) {
		walkThroughTree((ASTManager) container);
	}

	/**
	 * Walks through whole tree and reduce special nodes.
	 * 
	 * @param container
	 *            preprocessing container
	 */
	private void walkThroughTree(final ASTManager container) {
		if (0 == container.getChildCountOfMarkedNode()) {
			return;
		}

		for (int i = container.getChildCountOfMarkedNode(); --i >= 0;) {
			final ANode child = container.getMarkedNode().getChild(i);
			if (0 == container.getChildCountOfMarkedNode()) {
				continue;
			}
			if (Antlr3JavaParser.DOT == child.getType()) {
				if (1 < child.getChildCount()) {
					container.markChild(i);
					container.removeChildOfMarkedNode(0);
					container.markParentNode();
				}
				container.collapseChildOfMarkedNode(i);
				continue;
			}
			container.markChild(i);
			walkThroughTree(container);
			container.markParentNode();
		}
	}

}

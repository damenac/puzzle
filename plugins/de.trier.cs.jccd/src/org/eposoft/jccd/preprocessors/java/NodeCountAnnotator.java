package org.eposoft.jccd.preprocessors.java;

import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.preprocessors.APreprocessor;

/**
 * Annotates node depth.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class NodeCountAnnotator extends APreprocessor {

	@Override
	protected void process(final SourceUnitManager container) {
		walkThroughTree((ASTManager) container, new StringBuffer());
	}

	/**
	 * Walks through whole tree and makes annotations.
	 * 
	 * @param container
	 *            preprocessing container
	 * @param sb
	 *            global string buffer
	 * @param parserName
	 *            parser name which generates this tree part
	 */
	private int walkThroughTree(final ASTManager container,
			final StringBuffer sb) {
		int nodes = 1;

		if (0 < container.getChildCountOfMarkedNode()) {
			for (int i = 0; i < container.getChildCountOfMarkedNode(); i++) {
				container.markChild(i);
				nodes += walkThroughTree(container, sb);
				container.markParentNode();
			}
		}

		if (0 < nodes) {
			setAnnotation(container, "nodes", nodes);
		}

		return nodes;
	}
}

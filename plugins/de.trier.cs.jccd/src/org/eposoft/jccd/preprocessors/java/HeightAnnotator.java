package org.eposoft.jccd.preprocessors.java;

import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;
import org.eposoft.jccd.preprocessors.APreprocessor;

/**
 * Annotates node depth.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class HeightAnnotator extends APreprocessor {

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
	 */
	private void walkThroughTree(final ASTManager container,
			final StringBuffer sb) {
		int maxDepth = 0;
		int nodeCount = 0;

		if (0 < container.getChildCountOfMarkedNode()) {
			for (int i = 0; i < container.getChildCountOfMarkedNode(); i++) {
				container.markChild(i);
				walkThroughTree(container, sb);
				final Integer depth = (Integer) container.getMarkedNode()
						.getAnnotation(this.getClass(), "depth");
				if (null != depth) {
					if (depth > maxDepth) {
						maxDepth = depth;
					}
				}

				final Integer nodes = (Integer) container.getMarkedNode()
						.getAnnotation(this.getClass(), "nodes");
				if (null != nodes) {
					nodeCount += nodes;
				}
				++nodeCount;
				container.markParentNode();
			}
		}

		final boolean incrementDepth;

		// increment if marked node has one of the following types
		switch (container.getMarkedNode().getType()) {
		case Antlr3JavaParser.BLOCK_SCOPE:
		case Antlr3JavaParser.CLASS_TOP_LEVEL_SCOPE:
		case Antlr3JavaParser.INTERFACE_TOP_LEVEL_SCOPE:
		case Antlr3JavaParser.ENUM_TOP_LEVEL_SCOPE:
		case Antlr3JavaParser.VOID_METHOD_DECL:
		case Antlr3JavaParser.FUNCTION_METHOD_DECL:
			incrementDepth = true;
			break;
		default:
			incrementDepth = false;
			break;
		}

		if (incrementDepth) {
			setAnnotation(container, "depth", (maxDepth + 1));
		} else {
			if (0 < maxDepth) {
				setAnnotation(container, "depth", maxDepth);
			}
		}

		if (0 < nodeCount) {
			setAnnotation(container, "nodes", nodeCount);
		}
	}
}

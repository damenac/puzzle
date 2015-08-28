package org.eposoft.jccd.preprocessors.java;

import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;
import org.eposoft.jccd.preprocessors.APreprocessor;

/**
 * Normalizes the block of a single statement after for(), do, else, if(),
 * while().
 * 
 * Contrary to the name this preprocessor removes block_scope elements.
 * 
 * @author biegel
 */
public final class CompleteToBlock extends APreprocessor {

	@Override
	protected final void process(SourceUnitManager container) {
		walkThroughTree((ASTManager) container);
	}

	/**
	 * Walks through whole tree and complete single statements.
	 * 
	 * @param container
	 *            preprocessing container
	 */
	private void walkThroughTree(final ASTManager container) {
		final boolean isCandidate;
		switch (container.getMarkedNode().getType()) {
		case Antlr3JavaParser.IF:
		case Antlr3JavaParser.FOR:
		case Antlr3JavaParser.DO:
		case Antlr3JavaParser.ELSE:
		case Antlr3JavaParser.WHILE:
			isCandidate = true;
			break;
		default:
			isCandidate = false;
			break;
		}

		for (int i = 0; i < container.getChildCountOfMarkedNode(); i++) {
			container.markChild(i);
			walkThroughTree(container);
			container.markParentNode();

			if (isCandidate) {
				final ANode child = container.getMarkedNode().getChild(i);
				if (Antlr3JavaParser.BLOCK_SCOPE == child.getType()) {
					container.markChild(i);
					// remove closing brace
					container.removeChildOfMarkedNode(container
							.getChildCountOfMarkedNode() - 1);
					container.markParentNode();
					// remove opening brace
					container.collapseChildOfMarkedNode(i);
				}
			}
		}
	}
}

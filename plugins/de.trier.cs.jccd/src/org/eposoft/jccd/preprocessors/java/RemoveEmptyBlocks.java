package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

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
public final class RemoveEmptyBlocks extends APreprocessor {

	/** contains all block types */
	private final HashSet<Integer> types = new HashSet<Integer>();

	/**
	 * Standard constructor. Set all block types.
	 */
	public RemoveEmptyBlocks() {
		this.types.add(Antlr3JavaParser.BLOCK_SCOPE);
		this.types.add(Antlr3JavaParser.CLASS_TOP_LEVEL_SCOPE);
		this.types.add(Antlr3JavaParser.INTERFACE_TOP_LEVEL_SCOPE);
		this.types.add(Antlr3JavaParser.ENUM_TOP_LEVEL_SCOPE);
		this.types.add(Antlr3JavaParser.ANNOTATION_TOP_LEVEL_SCOPE);
	}

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
			final boolean candidateNode = this.types.contains(child.getType());

			boolean nodeRemoved = false;
			if (candidateNode) {
				if ((1 == child.getChildCount())
						&& (Antlr3JavaParser.RCURLY == child.getChild(0)
								.getType())) {
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

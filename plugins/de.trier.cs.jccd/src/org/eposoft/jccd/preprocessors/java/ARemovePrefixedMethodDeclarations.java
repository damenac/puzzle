package org.eposoft.jccd.preprocessors.java;

import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;
import org.eposoft.jccd.preprocessors.APreprocessor;

/**
 * Removes all prefixed method declarations (e.g. `public void setName(int name)
 * {...}`). Normally for setters and getters. The prefix must be equal and the
 * next character must be capitalized.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public abstract class ARemovePrefixedMethodDeclarations extends APreprocessor {

	@Override
	protected void process(SourceUnitManager container) {
		walkThroughTree((ASTManager) container);
	}

	/**
	 * @return prefix string
	 */
	protected abstract String getPrefixString();

	/**
	 * @return which node will be removed
	 */
	protected abstract int getRemovableNode();

	/**
	 * Walks through whole tree and removes all prefixed method declarations.
	 * 
	 * @param container
	 *            preprocessing container
	 * @return prefix identifier found?
	 */
	private boolean walkThroughTree(final ASTManager container) {
		if (container.getMarkedNode().isLeaf()) {
			// check if parent is a method declaration node
			if ((null == container.getMarkedNode().getParent())) {
				return false;
			}

			if ((this.getRemovableNode() != container.getMarkedNode()
					.getParent().getType())) {
				return false;
			}

			// check if leaf has type `IDENT` and its text is longer than the
			// prefix
			if ((Antlr3JavaParser.IDENT != container.getMarkedNode().getType())
					|| (this.getPrefixString().length() >= container
							.getMarkedNode().getText().length())) {
				return false;
			}

			// starts identifier with prefix?
			if (!container.getMarkedNode().getText().substring(0,
					this.getPrefixString().length()).equals(
					this.getPrefixString())) {
				return false;
			}

			// check if first character after the prefix is a capital letter
			final String nextChar = container.getMarkedNode().getText()
					.substring(this.getPrefixString().length(),
							this.getPrefixString().length() + 1);
			if (nextChar.equals(nextChar.toLowerCase())) {
				return false;
			}

			// okay, identifier is a candidate
			return true;
		}

		// a bit tricky now :-)
		int i = 0;
		while (i < container.getChildCountOfMarkedNode()) {
			container.markChild(i);
			final boolean prefixFound = walkThroughTree(container);
			container.markParentNode();

			if (prefixFound) {
				if (this.getRemovableNode() == container.getMarkedNode()
						.getType()) {
					return true;
				} else {
					container.removeChildOfMarkedNode(i);
				}
			} else {
				++i;
			}
		}
		return false;
	}
}

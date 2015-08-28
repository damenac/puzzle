package org.eposoft.jccd.preprocessors.java;

import org.eposoft.jccd.data.ASourceUnit;
import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;
import org.eposoft.jccd.preprocessors.APreprocessor;

/**
 * Reduces fully qualified identifier string to the substrings with a beginning
 * capital letter. e.g.: org.eposoft.epos.MyParentClass.MyClass ->
 * MyParentClass.MyClass
 * 
 * @author biegel
 */
public final class ReduceIdentifiersToCapitalLetterSubstring extends
		APreprocessor {

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

		// ### first check if current node is a qualified type ident node
		int i = 0;
		if (Antlr3JavaParser.QUALIFIED_TYPE_IDENT == container.getMarkedNode()
				.getType()) {
			i = container.getChildCountOfMarkedNode() - 2;
			boolean deleteNode = false;
			while (i >= 0) {
				final ASourceUnit child = container.getMarkedNode().getChild(i);
				final String firstLetter = child.getText().substring(0, 1);
				if (deleteNode || firstLetter.equals(firstLetter.toLowerCase())) {
					container.removeChildOfMarkedNode(i);
					deleteNode = true;
				}
				--i;
			}

			// check children of last node
			final int lastNodeId = container.getChildCountOfMarkedNode() - 1;
			final ANode lastNode = container.getMarkedNode().getChild(
					lastNodeId);
			if (0 < lastNode.getChildCount()) {
				container.markChild(lastNodeId);
				walkThroughTree(container);
				container.markParentNode();
			}

			return;
		} // current node is not a qualified type node

		// ### check if node is an ident or dot node
		i = 0;
		while (i < container.getChildCountOfMarkedNode()) {
			final ANode child = container.getMarkedNode().getChild(i);
			if (0 == container.getChildCountOfMarkedNode()) {
				continue;
			}

			final boolean parentIsDot = (Antlr3JavaParser.DOT == child
					.getParent().getType());
			final boolean childIsDot = (Antlr3JavaParser.DOT == child.getType());
			if (childIsDot) {
				container.markChild(i);
				final ASourceUnit childOfChild;
				if (parentIsDot) {
					childOfChild = container.getMarkedNode().getChild(1);
				} else {
					if (Antlr3JavaParser.DOT == child.getChild(0).getType()) {
						childOfChild = null;
					} else {
						childOfChild = child.getChild(0);
					}
				}

				if (null != childOfChild) {
					final String firstLetter = childOfChild.getText()
							.substring(0, 1);
					// check if first letter is lower case, true -> remove
					// substring
					if (firstLetter.equals(firstLetter.toLowerCase())) {
						container.removeChildOfMarkedNode(0);
						container.markParentNode();
						container.collapseChildOfMarkedNode(i);
					} else {
						container.markParentNode();
					}
				} else {
					container.markParentNode();
				}
			}

			container.markChild(i);
			walkThroughTree(container);
			container.markParentNode();

			// collapse dots with only one child
			if (childIsDot && (2 > child.getChildCount())) {
				if (Antlr3JavaParser.DOT == container.getMarkedNode().getChild(
						i).getType()
						|| parentIsDot) {
					container.collapseChildOfMarkedNode(i);
				} else {
					++i;
				}
			} else {
				++i;
			}
		}
	}
}

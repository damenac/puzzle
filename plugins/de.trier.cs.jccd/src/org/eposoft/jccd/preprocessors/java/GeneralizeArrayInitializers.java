package org.eposoft.jccd.preprocessors.java;

import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;
import org.eposoft.jccd.preprocessors.APreprocessor;

/**
 * Removes array initializations. => e.g. {1,2,3} or new int[]{1,2,3}
 * 
 * @author biegel
 */
public final class GeneralizeArrayInitializers extends APreprocessor {

	@Override
	protected final void process(SourceUnitManager container) {
		walkThroughTree((ASTManager) container);
	}

	/**
	 * Walks through whole tree and removes array initializations.
	 * 
	 * @param container
	 *            preprocessing container
	 * @return ARRAY_INITIALIZER node found in the children?
	 */
	private boolean walkThroughTree(final ASTManager container) {
		if (Antlr3JavaParser.ARRAY_INITIALIZER == container.getMarkedNode()
				.getType()) {
			return true;
		} else if (0 == container.getChildCountOfMarkedNode()) {
			return false;
		}

		boolean arrayInitializerFound = false;
		int i = container.getChildCountOfMarkedNode() - 1;
		while (i >= 0) {
			container.markChild(i);
			final boolean arrayInitializerFoundInChild = walkThroughTree(container);
			container.markParentNode();

			if (arrayInitializerFoundInChild
					&& container.getMarkedNode().getType() == Antlr3JavaParser.VAR_DECLARATOR) {
				container.removeChildOfMarkedNode(i);
				arrayInitializerFound = false;
			}

			arrayInitializerFound |= arrayInitializerFoundInChild;
			--i;
		}

		return arrayInitializerFound;
	}

}

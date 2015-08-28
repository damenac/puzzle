package org.eposoft.jccd.preprocessors.java;

import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.data.ast.NodeAst;
import org.eposoft.jccd.preprocessors.APreprocessor;

/**
 * Annotates node depth.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class TokenLengthAnnotator extends APreprocessor {

	final int minLength;

	public TokenLengthAnnotator() {
		this.minLength = 50;
	}

	public TokenLengthAnnotator(final int length) {
		this.minLength = length;
	}

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
	private int walkThroughTree(final ASTManager container,
			final StringBuffer sb) {
		int tokens;
		if (container.getMarkedNode() instanceof NodeAst) {
			tokens = 1;
		} else {
			tokens = 0;
		}

		if (0 < container.getChildCountOfMarkedNode()) {
			for (int i = 0; i < container.getChildCountOfMarkedNode(); i++) {
				container.markChild(i);
				tokens += walkThroughTree(container, sb);
				container.markParentNode();
			}
		}

		if (this.minLength <= tokens) {
			setAnnotation(container, "tokens", tokens);
		}

		return tokens;
	}
}

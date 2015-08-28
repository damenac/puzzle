package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

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
public final class TokenTypesAnnotator extends APreprocessor {

	final int minLength;

	public TokenTypesAnnotator() {
		this.minLength = 12;
	}

	public TokenTypesAnnotator(final int length) {
		this.minLength = length;
	}

	@Override
	protected void process(final SourceUnitManager container) {
		walkThroughTree((ASTManager) container);
	}

	/**
	 * Walks through whole tree and makes annotations.
	 * 
	 * @param container
	 *            preprocessing container
	 * @param sb
	 *            global string buffer
	 */
	private HashSet<Integer> walkThroughTree(final ASTManager container) {
		if (container.getMarkedNode().isLeaf()) {
			if (container.getMarkedNode() instanceof NodeAst) {
				final HashSet<Integer> types = new HashSet<Integer>();
				types.add(container.getMarkedNode().getType());
				if (this.minLength == 1) {
					setAnnotation(container, "tokentypes", "1");
				}
				return types;
			} else {
				return null;
			}
		}

		final HashSet<Integer> types = new HashSet<Integer>();
		if (0 < container.getChildCountOfMarkedNode()) {
			for (int i = 0; i < container.getChildCountOfMarkedNode(); i++) {
				container.markChild(i);
				final HashSet<Integer> childTypes = walkThroughTree(container);
				container.markParentNode();
				if (null != childTypes) {
					for (Integer value : childTypes) {
						types.add(value);
					}
				}
			}
		}

		if (container.getMarkedNode() instanceof NodeAst) {
			types.add(container.getMarkedNode().getType());
		}

		if (this.minLength <= types.size()) {
			setAnnotation(container, "tokentypes", types.size());
		}

		if (types.isEmpty()) {
			return null;
		}
		return types;
	}
}

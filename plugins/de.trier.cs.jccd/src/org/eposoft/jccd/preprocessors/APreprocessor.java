package org.eposoft.jccd.preprocessors;

import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ASTManager;

/**
 * Modifies the AST by several normalisations, annotations, removings etc.
 * 
 * @author biegel
 */
public abstract class APreprocessor {

	/** all annotations will be found over the given class */
	private Class<? extends APreprocessor> annotationGroup = null;

	/**
	 * Starts AST-modification. Writes preprocessor information to the tree
	 * container.
	 * 
	 * @param ast
	 *            container of the SimRF-AST
	 */
	public final void start(final SourceUnitManager ast) {
		if (ast.isEmpty()) {
			return;
		}
		ast.rewind();
		this.process(ast);
	}

	/**
	 * Sets an annotation to a node.
	 * 
	 * @param container
	 *            any node which should be annotated
	 * @param key
	 *            annotation name
	 * @param value
	 *            annotation value
	 */
	protected final void setAnnotation(final ASTManager container,
			final String key, final Object value) {
		container.getMarkedNode().addAnnotation(this.getClass(), key, value);
	}

	/**
	 * Sets specific annotations to the AST-nodes.
	 * 
	 * @param container
	 *            preprocessing container
	 * @see #start(ContainerParsing)
	 */
	protected abstract void process(final SourceUnitManager container);

	/**
	 * @param annotationGroup
	 *            group for the annotations of this preprocessor
	 */
	protected final void setAnnotationGroup(
			final Class<? extends APreprocessor> annotationGroup) {
		if (!annotationGroup.isInstance(this)) {
			throw new ClassCastException(
					"Only super classes can be set as annotation group.");
		}
		this.annotationGroup = annotationGroup;
	}

	/**
	 * @return the annotationGroup
	 */
	public final Class<? extends APreprocessor> getAnnotationGroup() {
		if (null == this.annotationGroup) {
			return this.getClass();
		}
		return annotationGroup;
	}

}

package org.eposoft.jccd.data;

import java.util.HashSet;

import org.apache.log4j.Logger;
import org.eposoft.jccd.preprocessors.APreprocessor;

/**
 * @author biegel
 * 
 */
public abstract class SourceUnitManager {

	/** Logger */
	private static final Logger log = Logger
			.getLogger(SourceUnitManager.class.getSimpleName());
	/** list of all used preprocessors */
	protected final HashSet<Class<? extends APreprocessor>> preprocessors = new HashSet<Class<? extends APreprocessor>>();

	/**
	 * Adds the preprocessor which was used.
	 * 
	 * @param classType
	 *            class type of the preprocessor
	 */
	public void addPreprocessor(final Class<? extends APreprocessor> classType) {
		if (null != classType) {
			this.preprocessors.add(classType);
		}
	}

	/**
	 * Pre-processes the containing AST with given pre-processors.
	 * 
	 * @param preprocessors
	 *            list of pre-processors
	 */
	public void preprocess(final APreprocessor[] preprocessors) {
		// apply preprocessors
		log.info("START PREPROCESSING ` ...");
		for (final APreprocessor preprocessor : preprocessors) {
			if (this.preprocessors.contains(preprocessor)) {
				continue;
			}
			this.addPreprocessor(preprocessor.getClass());
			log.debug("Using preprocessor: "
					+ preprocessor.getClass().getSimpleName());
			preprocessor.start(this);
		}
	}

	public abstract boolean isEmpty();

	public abstract void rewind();
}

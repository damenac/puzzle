package org.eposoft.jccd.parser;

import org.eposoft.jccd.data.JCCDFile;

/**
 * Factory for the parsers which will generate ASTs.
 * 
 * @author biegel
 */
public final class StandardParserSelector implements IParserSelector {

	/**
	 * Checks if a parser exists for the given file extension.
	 * 
	 * @param file
	 *            file
	 * @return parser exists?
	 */
	private boolean acceptFile(final JCCDFile file) {
		// check for java parser
		final String fileName = file.getName();
		final boolean endsWithJava = fileName.endsWith(".java");
		final boolean isLongEnough = (fileName.length() > 5);
		return (endsWithJava && isLongEnough);
	}

	/**
	 * Selects a special parser for a given file extension.
	 * 
	 * @param file
	 *            file
	 * @return specific parser
	 */
	public AParser getParserForFile(final JCCDFile file) {
		// check for java parser
		if ((acceptFile(file))) {
			return new JavaParser();
		}

		// no parser found
		return null;
	}
}

package org.eposoft.jccd.parser;

import org.eposoft.jccd.data.JCCDFile;

/**
 * Interface for parser selectors.
 * 
 * @author biegel
 */
public interface IParserSelector {

	/**
	 * Selects a special parser for a given file extension.
	 * 
	 * @param file
	 *            file
	 * @return specific parser
	 */
	public AParser getParserForFile(final JCCDFile file);
}

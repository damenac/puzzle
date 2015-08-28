package org.eposoft.jccd.detectors;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.eposoft.jccd.data.JCCDFile;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.data.ast.NodeTypes;
import org.eposoft.jccd.parser.AParser;
import org.eposoft.jccd.parser.IParserSelector;
import org.eposoft.jccd.parser.ParseException;

/**
 * Manager for the parsing step of source code into an AST.
 * 
 * @author biegel
 */
public final class ASTParseUnit {

	/** Logger */
	private static final Logger log = Logger.getLogger(ASTParseUnit.class
			.getSimpleName());

	/** parser selector to select the specific parser */
	final IParserSelector parserSelector;

	/**
	 * Constructor.
	 * 
	 * @param parserSelector
	 *            parser selector to select the specific parser
	 */
	public ASTParseUnit(final IParserSelector parserSelector) {
		this.parserSelector = parserSelector;
	}

	/**
	 * Parse documents and builds a container manager containing an AST.
	 * 
	 * @param files
	 *            all files of this version (with prefix information)
	 * @return container manager with AST of the current source code
	 * @throws ContainerException
	 */
	public ASTManager parse(final JCCDFile[] files) {
		if (null == this.parserSelector) {
			// XXX exception
			return null;
		}

		if (null == files) {
			// XXX exception
			return null;
		}

		// parse files
		final ASTManager container = new ASTManager(
				NodeTypes.PROJECT.getType(), null);
		for (final JCCDFile file : files) {
			container.markRootNode();
			parseTree(file, container);
		}

		return container;
	}

	/**
	 * Builds the AST and adds it to the project node of the container.
	 * 
	 * @param file
	 *            source code
	 * @param version
	 *            container of the current version
	 */
	private void parseTree(final JCCDFile file, final ASTManager version) {
		// XXX settings for parser selector
		final IParserSelector parserSelector = this.parserSelector;
		if (file.isDirectory()) {
			if (log.isDebugEnabled()) {
				try {
					StringBuffer msg = new StringBuffer(
							"read files for directory ´");
					msg.append(file.getCanonicalPath());
					msg.append("´:");
					msg = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			// only accept directories and files which are supported by a parser
			final FileFilter parserFilter = new FileFilter() {
				public boolean accept(File checkFile) {
					if (checkFile.isDirectory()
							&& !checkFile.getName().startsWith(".")) {
						return true;
					}

					return (null != parserSelector
							.getParserForFile(new JCCDFile(checkFile, file
									.getPrefix())));
				}
			};

			final JCCDFile[] files = file.listFiles(parserFilter);
			for (int i = files.length; --i >= 0;) {
				parseTree(files[i], version);
			}

			return;
		}

		if (null == parserSelector.getParserForFile(file)) {
			return;
		}

		try {
			final AParser parser = parserSelector.getParserForFile(file);
			final boolean wasParsed = parser.parse(file, version);

			if (!wasParsed) {
			} else {
				if (log.isDebugEnabled()) {
					StringBuffer msg = new StringBuffer("AST built for File: ´");
					msg.append(file.getCanonicalPath());
					msg.append("´");
					msg = null;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}

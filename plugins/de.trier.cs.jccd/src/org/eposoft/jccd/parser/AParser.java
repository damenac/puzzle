package org.eposoft.jccd.parser;

import java.io.IOException;

import org.eposoft.jccd.data.JCCDFile;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.data.ast.NodeTypes;

/**
 * Abstract for a parser.
 * 
 * @author biegel
 */
public abstract class AParser {

	/**
	 * Parses a File.
	 * 
	 * @param f
	 *            source code as File
	 * @param treeContainer
	 *            container with the AST
	 * @return document parsed/ not parsed?
	 * @throws IOException
	 * @throws ParseException
	 */
	public final boolean parse(final JCCDFile f,
			final ASTManager treeContainer) throws IOException,
			ParseException {
		if (null == treeContainer) {
			return false;
		}

		treeContainer.markRootNode();
		treeContainer.createChildGroupNode();
		treeContainer.markChild(treeContainer.getChildCountOfMarkedNode() - 1);
		treeContainer.setType(NodeTypes.FILE.getType());
		treeContainer.setText(f.getNameWithoutPrefix());
		treeContainer.getMarkedNode().addAnnotation(AParser.class, "parser",
				this.getClass());
		if (null != f.getPrefix()) {
			treeContainer.getMarkedNode().addAnnotation(AParser.class,
					"file_prefix", f.getPrefix());
		}

		return parseFile(f, treeContainer);
	}

	/**
	 * Parses a File.
	 * 
	 * @param f
	 *            source code as File
	 * @param treeContainer
	 *            container with the AST
	 * @return document parsed/ not parsed?
	 * @throws IOException
	 * @throws ParseException
	 */
	protected abstract boolean parseFile(final JCCDFile f,
			final ASTManager treeContainer) throws IOException,
			ParseException;

}

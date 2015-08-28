package org.eposoft.jccd.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.eposoft.jccd.data.JCCDFile;
import org.eposoft.jccd.data.SourceUnitPosition;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaLexer;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * A java parser for generating an AST.
 * 
 * @author biegel
 */
public final class JavaParser extends AParser {

	/**
	 * singleton pattern.
	 */
	JavaParser() {

	}

	/**
	 * Adds end nodes to embracing tokens kile `{}`, `()` etc.
	 * 
	 * @param tree
	 *            any node of the tree
	 * @param tokens
	 *            token stream with all tokens
	 */
	private void addEndNode(final CommonTree tree, final TokenStream tokens) {
		final int index = tree.token.getTokenIndex();
		if (-1 == index) {
			return;
		}

		final int leftBrace = tokens.get(index).getType();
		final int rightBrace;
		int countBraces = 1;
		switch (leftBrace) {
		// {}
		case Antlr3JavaLexer.LCURLY:
			rightBrace = Antlr3JavaLexer.RCURLY;
			break;

		// ()
		case Antlr3JavaLexer.LPAREN:
			rightBrace = Antlr3JavaLexer.RPAREN;
			break;

		// []
		case Antlr3JavaLexer.LBRACK:
			rightBrace = Antlr3JavaLexer.RBRACK;
			break;

		// <>
		case Antlr3JavaLexer.LESS_THAN:
			// first check if this is a generic type list
			if ((tree.getType() != Antlr3JavaParser.GENERIC_TYPE_ARG_LIST)
					&& (tree.getType() != Antlr3JavaParser.GENERIC_TYPE_PARAM_LIST)) {
				return;
			}
			rightBrace = Antlr3JavaLexer.GREATER_THAN;
			break;

		default:
			return;
		}

		for (int i = index + 1; i < tokens.size(); i++) {
			if (rightBrace == tokens.get(i).getType()) {
				--countBraces;
			} else if (leftBrace == tokens.get(i).getType()) {
				++countBraces;
			}

			if (0 == countBraces) {
				final CommonTree newNode = new CommonTree(tokens.get(i));
				tree.addChild(newNode);
				break;
			}
		}
	}

	/**
	 * Walks recursive through parser generated tree and builds a new JCCDTree.
	 * 
	 * @param tree
	 *            parser generated tree (current node)
	 * @param container
	 *            current parent node of the new SimrfTree
	 * @param tokens
	 *            stream of all available tokens
	 */
	private void buildJCCDTree(final CommonTree tree,
			final ASTManager container, final TokenStream tokens) {
		// add end node if possible (token is a kind of opening brace)
		addEndNode(tree, tokens);

		// create new node in the container
		if (-1 == tree.getToken().getTokenIndex()) {
			container.createChildGroupNode();
		} else {
			container.createChildNode();
		}
		container.markChild(container.getChildCountOfMarkedNode() - 1);
		container.setText(tree.getText());
		container.setType(tree.getType());
		if (0 < tree.getLine()) {
			container.setLine(tree.getLine());
			container.setCharPositionInLine(tree.getCharPositionInLine());
		}

		walkThroughChildren(tree, container, tokens);
	}

	@Override
	protected boolean parseFile(JCCDFile f, final ASTManager treeContainer)
			throws ParseException, IOException {
		BufferedReader in = new BufferedReader(new FileReader(f.getFile()));

		final Antlr3JavaLexer lexer = new Antlr3JavaLexer();

		// save whitespaces and comments?
		lexer.preserveWhitespacesAndComments = false;
		try {
			lexer.setCharStream(new ANTLRReaderStream(in));
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		final CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		tokens.LT(10); // force load

		// Create a parser that reads from the scanner
		Antlr3JavaParser parser = new Antlr3JavaParser(tokens);

		// start parsing at the compilationUnit rule
		CommonTree tree;
		try {
			tree = (CommonTree) parser.compilationUnit().getTree();
		} catch (RecognitionException e) {
			e.printStackTrace();
			return false;
		}

		walkThroughChildren(tree, treeContainer, parser.getTokenStream());

		in.close();

		this.fixPositions(treeContainer);
		return true;
	}

	private SourceUnitPosition fixPositions(final ASTManager container) {
		SourceUnitPosition smallest = new SourceUnitPosition(container
				.getMarkedNode().getLine(), container.getMarkedNode()
				.getCharPositionInLine());
		if (0 < container.getChildCountOfMarkedNode()) {
			for (int i = 0; i < container.getChildCountOfMarkedNode(); i++) {
				container.markChild(i);
				final SourceUnitPosition pos = fixPositions(container);
				container.markParentNode();

				if (pos.getLine() != -1) {
					if (smallest.getLine() == -1) {
						smallest = pos;
					} else if (pos.getLine() < smallest.getLine()) {
						smallest = pos;
					} else if (pos.getLine() == smallest.getLine()) {
						if (pos.getCharacter() < smallest.getCharacter()) {
							smallest = pos;
						}
					}
				}
			}
		}

		container.setLine(smallest.getLine());
		container.setCharPositionInLine(smallest.getCharacter());
		return new SourceUnitPosition(smallest.getLine(), smallest
				.getCharacter());
	}

	/**
	 * Walks over all children of a node, adds new children and sets ranges.
	 * 
	 * @param tree
	 *            parser generated tree (current node)
	 * @param container
	 *            current parent node of the new SimrfTree
	 * @param tokens
	 *            stream of all available tokens
	 */
	private void walkThroughChildren(final CommonTree tree,
			final ASTManager container, final TokenStream tokens) {

		while (0 < tree.getChildCount()) {
			final CommonTree child = (CommonTree) tree.getChild(0);
			tree.deleteChild(0);
			buildJCCDTree(child, container, tokens);

			container.markParentNode();
		}

	}

}

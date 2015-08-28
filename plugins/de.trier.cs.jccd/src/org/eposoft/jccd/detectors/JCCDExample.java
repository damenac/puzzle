package org.eposoft.jccd.detectors;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.eposoft.jccd.comparators.IComparator;
import org.eposoft.jccd.comparators.ast.AcceptFileNames;
import org.eposoft.jccd.comparators.ast.CheckConsistentVariableNames;
import org.eposoft.jccd.comparators.ast.CheckEquality;
import org.eposoft.jccd.comparators.ast.java.AcceptBooleanKeywords;
import org.eposoft.jccd.comparators.ast.java.AcceptCharacterLiterals;
import org.eposoft.jccd.comparators.ast.java.AcceptIdentifiers;
import org.eposoft.jccd.comparators.ast.java.AcceptNumberLiterals;
import org.eposoft.jccd.comparators.ast.java.AcceptNumberTypeNames;
import org.eposoft.jccd.comparators.ast.java.AcceptStringLiterals;
import org.eposoft.jccd.data.ASourceUnit;
import org.eposoft.jccd.data.JCCDFile;
import org.eposoft.jccd.data.PoolContainer;
import org.eposoft.jccd.data.SimilarityGroup;
import org.eposoft.jccd.data.SimilarityGroupManager;
import org.eposoft.jccd.data.SourceUnitPosition;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.data.ast.NodeTypes;
import org.eposoft.jccd.filters.StandardOverlapPruningFilter;
import org.eposoft.jccd.parser.StandardParserSelector;
import org.eposoft.jccd.pools.TokenLengthPoolingStrategy;
import org.eposoft.jccd.preprocessors.APreprocessor;
import org.eposoft.jccd.preprocessors.java.ARenameVariableNames;
import org.eposoft.jccd.preprocessors.java.TokenLengthAnnotator;

/**
 * An example implementation of an AST-based code clone detector.
 * 
 * @author biegel
 */
public class JCCDExample {

	/**
	 * @param node
	 *            any node of the AST
	 * @return first usable position (!= -1) in the tree
	 */
	public static SourceUnitPosition getFirstNodePosition(final ANode node) {
		if (-1 != node.getLine() || node.isLeaf()) {
			return new SourceUnitPosition(node.getLine(), node
					.getCharPositionInLine());
		}

		for (int i = 0; i < node.getChildCount(); i++) {
			final SourceUnitPosition pos = getFirstNodePosition(node
					.getChild(i));
			if (-1 != pos.getLine()) {
				return pos;
			}
		}

		return new SourceUnitPosition(-1, -1);
	}

	/**
	 * @param node
	 *            any node of the AST
	 * @return biggest position in the tree
	 */
	public static SourceUnitPosition getLastNodePosition(final ANode node) {
		SourceUnitPosition max = new SourceUnitPosition(node.getLine(), node
				.getCharPositionInLine());
		if (node.isLeaf()) {
			return max;
		}

		for (int i = 0; i < node.getChildCount(); i++) {
			final SourceUnitPosition pos = getLastNodePosition(node.getChild(i));
			if (pos.getLine() > max.getLine()) {
				max = pos;
			} else if (pos.getLine() == max.getLine()) {
				if (pos.getCharacter() > max.getCharacter()) {
					max = pos;
				}
			}
		}

		return max;
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 *            parameters, not needed yet
	 */
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		SimilarityGroup[] simGroups = null;

		final ASTParseUnit parser = new ASTParseUnit(new StandardParserSelector());
		final JCCDFile[] files = {
		// new JCCDFile(
		// "../jedit-4-3-1/jars/MacOSX/macosx/OSXAdapter.java"),
		new JCCDFile("org/eposoft/jccd/tests/Error.java") };
		// "../jedit-4-3-1/net/sourceforge/jarbundler/Service.java"),
		// new JCCDFile(
		// "../jedit-4-3-1/net/sourceforge/jarbundler/DocumentType.java") };
		// final JCCDFile[] files2 = { new JCCDFile(
		// "org/eposoft/epos/jccd/tests/Test3.java",
		// "org/eposoft/epos/jccd/tests/") };

		final ASTManager container = parser.parse(files);
		// walkRecursive(container.getVisitingContainer());
		// final ASTContainer container2 = parser.parse(files2);
		// container.mergeWith(container2);

		final APreprocessor[] preprocessors = {
		// new RemoveExtends(),
		// new RemoveImplements(),
		// new RemoveAnnotations(),
		new TokenLengthAnnotator(1),
		// new TokenTypesAnnotator(12),
		// // new RemoveThrow(),
		// new RemoveThrowsClause(),
		//					
		// new RemoveAssertions(),
		// new RemoveGenericTypes(),
		// new CollapseQualifiedTypeIdentNodes(),
		// new RemoveInterfaces(),
		// new RemoveImports(),
		// new RemoveModifiers(),
		// new RemovePackageInformation(),
		// new RemoveRedundantParentheses(),
		// //new RemoveSimpleMethods(),
		// // new RemoveSetMethodDeclarations(),
		// // new RemoveGetMethodDeclarations(),
		// // new RemoveIsMethodDeclarations(),
		// // new RemoveVariableDeclarationNodes(),
		// // new CollapseArrayElementAccess(),
		// // new CollapseCastExpressions(),
		// // new CollapsePostfixOperators(),
		// // new CollapsePrefixOperators(),
		// // new CollapseUnaryPlus(),
		// // new CollapseUnaryOperators(),
		// // new MarkVariablesWithParentId(),
		// // new RenameVariableNamesLocalConsistent(),
		// new GeneralizeArrayInitializers(),
		// // new GeneralizeClassDeclarationNames(),
		// // new GeneralizeMethodCallNames(),
		// // new ReduceIdentifiersToLastSubstring(),
		// new ReduceIdentifiersToCapitalLetterSubstring(),
		// // new GeneralizeMethodDeclarationNames(),
		// // new GeneralizeTypes(),
		// // new GeneralizeMethodReturnTypes(),
		// // new GeneralizeMethodArgumentTypes(),
		// // new GeneralizeVariableDeclarationTypes(),
		// // new GeneralizeNewOperatorTypes(),
		// // new GeneralizeVariableNames(),
		// new CompleteToBlock(),
		// new RemoveEmptyBlocks(),
		// new RemoveEmptyMethods(),
		// // new RemoveEmptyGroupNodes(),
		// // , new NodeCountAnnotator()
		// new DepthAnnotator(),
		};
		// container.preprocess(preprocessors);

		// pooling
		final ASTPoolUnit poolUnit = new ASTPoolUnit(new TokenLengthPoolingStrategy());
		final PoolContainer poolContainer = poolUnit
				.getPoolContainer(container);

		// comparing
		final ArrayList<IComparator<ANode>> comp = new ArrayList<IComparator<ANode>>();
		comp.add(new CheckEquality());
		comp.add(new AcceptNumberLiterals());
		comp.add(new AcceptNumberTypeNames());
		comp.add(new AcceptBooleanKeywords());
		comp.add(new AcceptStringLiterals());
		comp.add(new AcceptCharacterLiterals());
		comp.add(new AcceptFileNames());
		comp.add(new AcceptIdentifiers());
		comp.add(new CheckConsistentVariableNames());

		final ASTCompareUnit compareUnit = new ASTCompareUnit(comp);
		final SimilarityGroupManager simGroupContainer = compareUnit
				.compare(poolContainer);

		// filtering
		new StandardOverlapPruningFilter().start(simGroupContainer);
		simGroups = simGroupContainer.getSimilarityGroups();
		time = System.currentTimeMillis() - time;

		printRecursive(container.getRoot(), new StringBuffer());
		writeTreeToFreeMind(container, "/tmp/comparator.mm");

		// output similarity groups
		System.out.println("SIMILARITY GROUPS");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		if (null == simGroups) {
			simGroups = new SimilarityGroup[0];
		}
		int filteredAmount = 0;
		if ((null != simGroups) && (0 < simGroups.length)) {
			for (int i = 0; i < simGroups.length; i++) {
				final ASourceUnit[] nodes = simGroups[i].getNodes();
				// if (getLastNodePosition(nodes[0]).getLine()
				// - getFirstNodePosition(nodes[0]).getLine() < 10) {
				// ++filteredAmount;
				// continue;
				// }
				System.out.println("");
				System.out.println("Similarity Group "
						+ simGroups[i].getGroupId());
				System.out.println("========================================");
				for (int j = 0; j < nodes.length; j++) {
					final SourceUnitPosition minPos = getFirstNodePosition((ANode) nodes[j]);
					final SourceUnitPosition maxPos = getLastNodePosition((ANode) nodes[j]);

					ANode fileNode = (ANode) nodes[j];
					while (fileNode.getType() != NodeTypes.FILE.getType()) {
						fileNode = fileNode.getParent();
					}
					System.out.print(fileNode.getParent().getText());
					System.out.print(" (");
					System.out.print(nodes[j].getId());
					System.out.print("): ");
					System.out.print(nodes[j].getText());
					System.out.print(" -> ");
					System.out.print(fileNode.getText());
					System.out.print(" (");
					// System.out.print(nodes[j].getRange());

					System.out.print(minPos.getLine());
					System.out.print(".");
					System.out.print(minPos.getCharacter());
					System.out.print(" - ");

					System.out.print(maxPos.getLine());
					System.out.print(".");
					System.out.print(maxPos.getCharacter());
					System.out.println(')');
				}
				System.out.println("========================================");
			}
		} else {
			System.out.println("No similar nodes found.");
		}

		System.out.println("");
		System.out.println("");

		// statistics
		System.out.println("STATISTICS");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Time: " + time + " ms");
		System.out.println("Detected similarity groups: "
				+ ((null == simGroups) ? 0 : simGroups.length));
		System.out.println("Filtered Groups: " + filteredAmount);
	}

	// private void simpleUse() {
	// IParserSelector parserSelector = new StandardParserSelector();
	// JCCDParseUnit parser = new JCCDParseUnit(parserSelector);
	// JCCDFile[] files = { new JCCDFile("foo/bar/test.java", "foo/bar/") };
	// ASTContainer container = parser.parse(files);
	// container.setVersionName("version1");
	//
	// // pooling
	// final JCCDPoolUnit poolUnit = new JCCDPoolUnit(
	// new DepthPoolingStrategy());
	// final PoolContainer poolContainer = poolUnit
	// .getPoolContainer(container);
	//
	// // comparing
	// final JCCDCompareUnit compareUnit = new JCCDCompareUnit(
	// new IComparator[] { new CheckEquality() });
	// final SimilarityGroupContainer simGroupContainer = compareUnit
	// .compare(poolContainer);
	//
	// SimilarityGroup[] simGroups = simGroupContainer.getSimilarityGroups();
	//
	// // filtering
	// ASimilarityGroupFilter filter = new StandardOverlapPruningFilter();
	// SimilarityGroup[] filteredSimGroups = filter.process(simGroups);
	// }

	/**
	 * Helper method to test CSAST structure.
	 * 
	 * @param _node
	 *            current symbol
	 * @param _tab
	 *            tab width
	 */
	public final static void printRecursive(final ANode _node,
			final StringBuffer tab) {
		StringBuffer output = new StringBuffer();
		ANode node = _node;

		output.append(tab);
		output.append("|_ ");
		output.append(node.getText());
		output.append(' ');
		output.append(node.getLine());
		output.append(':');
		output.append(node.getCharPositionInLine());
		// output.append(" (ident:");
		// output.append(node.getNodeIdentifier());
		// output.append(", ");
		output.append('(');
		output.append(node.getId());
		output.append(')');
		System.out.println(output.toString());
		output.delete(0, output.length());

		tab.append(".  ");
		if (node.getChildCount() < 1) {
			return;
		}

		// show children
		for (int i = 0; i < node.getChildCount(); i++) {
			ANode node2 = node.getChild(i);
			printSymbolAnnotations(node2, tab);
			printRecursive(node2, tab);
			tab.delete(tab.length() - 3, tab.length());
		}
	}

	/**
	 * Helper method to print annotations of a symbol.
	 * 
	 * @param node
	 *            current symbol
	 * @param _tab
	 *            tab width
	 */
	private static final void printSymbolAnnotations(final ASourceUnit node,
			final StringBuffer tab) {
		final StringBuffer text = new StringBuffer("");
		if (null == node.getAnnotations()) {
			return;
		}

		final Iterator<Class<?>> groupIterator = node.getAnnotations().keySet()
				.iterator();
		while (groupIterator.hasNext()) {
			final Class<?> group = groupIterator.next();
			text.append(tab);
			text.append("   ");
			text.append('@');
			text.append(group);
			text.append(" (");

			// get values
			final HashMap<Object, Object> annotations = node.getAnnotations()
					.get(group);
			final Iterator<Object> annoIterator = annotations.keySet()
					.iterator();
			String comma = "";
			while (annoIterator.hasNext()) {
				final Object annoKey = annoIterator.next();
				text.append(comma);
				comma = ", ";
				text.append(annoKey);
				text.append(": ");
				text.append(annotations.get(annoKey));
			}

			text.append(") \n");
		}

		System.out.print(text.toString());
	}

	/**
	 * Walks through whole tree and writes all nodes to a file in the
	 * freemind-format.
	 * 
	 * @param node
	 *            any node of the AST
	 * @param bw
	 *            buffered reader with reference to the target file
	 * @throws IOException
	 */
	private static void writeRecursiveToFreeMind(final ANode node,
			final BufferedWriter bw) throws IOException {
		if (0 == node.getChildCount()) {
			return;
		}

		for (int i = 0; i < node.getChildCount(); i++) {
			final ANode child = node.getChild(i);
			bw.write("<node ID=\"");
			bw.write(Integer.toString(child.getId()));
			bw.write("\" STYLE=\"bubble\" TEXT=\"");
			bw.write(child.getText().replace("\"", "&quot;"));
			bw.write("\">\n");
			writeRecursiveToFreeMind(child, bw);
			bw.write("</node>\n");
		}
	}

	public static void walkRecursive(ASTManager visitor) {
		System.out.print("node ");
		System.out.print(visitor.getMarkedNode().getId());
		System.out.print(": ");
		System.out.print(visitor.getMarkedNode().getText());
		System.out.print(", ");
		System.out.println(visitor.getCurrentAnnotation(
				ARenameVariableNames.class, "varname"));
		System.out.println("---");

		if (0 == visitor.getChildCountOfMarkedNode()) {
			return;
		}

		for (int i = 0; i < visitor.getChildCountOfMarkedNode(); i++) {
			visitor.markChild(i);
			walkRecursive(visitor);
			visitor.markParentNode();
		}
	}

	/**
	 * Creates a freemind file containing the given AST.
	 * 
	 * @param container
	 *            any visiting container
	 * @param filename
	 *            file name of the freemind file
	 */
	private static void writeTreeToFreeMind(final ASTManager container,
			final String filename) {
		final File file = new File(filename);
		try {
			final BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write("<map version=\"0.8.0\">\n");
			bw.write("<node ID=\"");
			bw.write(Integer.toString(container.getRoot().getId()));
			bw.write("\" STYLE=\"bubble\" TEXT=\"");
			bw.write(container.getRoot().getText());
			bw.write("\">\n");
			bw.write("<edge STYLE=\"linear\"/>\n");
			writeRecursiveToFreeMind(container.getRoot(), bw);
			bw.write("</node>\n");
			bw.write("</map>\n");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

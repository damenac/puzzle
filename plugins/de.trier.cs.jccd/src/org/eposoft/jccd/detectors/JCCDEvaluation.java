package org.eposoft.jccd.detectors;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

import org.eposoft.jccd.comparators.IComparator;
import org.eposoft.jccd.comparators.ast.AcceptFileNames;
import org.eposoft.jccd.comparators.ast.CheckEquality;
import org.eposoft.jccd.comparators.ast.java.AcceptBooleanKeywords;
import org.eposoft.jccd.comparators.ast.java.AcceptCharacterLiterals;
import org.eposoft.jccd.comparators.ast.java.AcceptNumberLiterals;
import org.eposoft.jccd.comparators.ast.java.AcceptNumberTypeNames;
import org.eposoft.jccd.comparators.ast.java.AcceptStringLiterals;
import org.eposoft.jccd.comparators.ast.java.AcceptVariableIdentifiers;
import org.eposoft.jccd.data.JCCDFile;
import org.eposoft.jccd.data.PoolContainer;
import org.eposoft.jccd.data.SimilarityGroup;
import org.eposoft.jccd.data.SimilarityGroupManager;
import org.eposoft.jccd.data.SimilarityPair;
import org.eposoft.jccd.data.SourceUnitPosition;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.data.ast.NodeTypes;
import org.eposoft.jccd.filters.StandardOverlapPruningFilter;
import org.eposoft.jccd.parser.StandardParserSelector;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;
import org.eposoft.jccd.pools.TokenLengthPoolingStrategy;
import org.eposoft.jccd.preprocessors.APreprocessor;
import org.eposoft.jccd.preprocessors.java.CollapseQualifiedTypeIdentNodes;
import org.eposoft.jccd.preprocessors.java.CompleteToBlock;
import org.eposoft.jccd.preprocessors.java.GeneralizeArrayInitializers;
import org.eposoft.jccd.preprocessors.java.HeightAnnotator;
import org.eposoft.jccd.preprocessors.java.ReduceIdentifiersToCapitalLetterSubstring;
import org.eposoft.jccd.preprocessors.java.RemoveAnnotations;
import org.eposoft.jccd.preprocessors.java.RemoveAssertions;
import org.eposoft.jccd.preprocessors.java.RemoveEmptyBlocks;
import org.eposoft.jccd.preprocessors.java.RemoveEmptyMethods;
import org.eposoft.jccd.preprocessors.java.RemoveExtends;
import org.eposoft.jccd.preprocessors.java.RemoveGenericTypes;
import org.eposoft.jccd.preprocessors.java.RemoveImplements;
import org.eposoft.jccd.preprocessors.java.RemoveImports;
import org.eposoft.jccd.preprocessors.java.RemoveInterfaces;
import org.eposoft.jccd.preprocessors.java.RemoveModifiers;
import org.eposoft.jccd.preprocessors.java.RemovePackageInformation;
import org.eposoft.jccd.preprocessors.java.RemoveRedundantParentheses;
import org.eposoft.jccd.preprocessors.java.RemoveThrowsClause;
import org.eposoft.jccd.preprocessors.java.TokenLengthAnnotator;
import org.eposoft.jccd.preprocessors.java.TokenTypesAnnotator;

/**
 * AST-Based code clone detection by using the JCCD API.
 * 
 * Created for our first evaluation.
 * 
 * @author biegel
 */
public class JCCDEvaluation {

	/**
	 * Main method.
	 * 
	 * @param args
	 *            parameters, not needed yet
	 */
	public static void main(String[] args) {
		if (args.length < 1) {
			System.err.println("Dateien angeben.");
			System.exit(0);
		}

		boolean useThreading = false;
		boolean useConsistentRenaming = true;
		String writePairs = null;

		int threadAmount = -1;
		final Vector<JCCDFile> fileVec = new Vector<JCCDFile>();
		Vector<JCCDFile> fileVec2 = null;
		for (int i = 0; i < args.length; i++) {
			if (args[i].startsWith("--threads=")) {
				useThreading = true;
				threadAmount = Integer.parseInt(args[i].substring(10));
				System.err
						.println("threading activated (" + threadAmount + ")");
			} else if (args[i].equals("--wrt")) {
				fileVec2 = new Vector<JCCDFile>();
				System.err.println("Compare between two file sets.");
			} else if (args[i].equals("--no-pmatch")) {
				useConsistentRenaming = false;
				System.err.println("p-matching deactivated.");
			} else if (args[i].startsWith("--write=")) {
				writePairs = args[i].substring(8);
				System.err.println("write similarity pairs to file ("
						+ writePairs + ")");
			} else {
				if (null != fileVec2) {
					fileVec2.add(new JCCDFile(args[i]));
				} else {
					fileVec.add(new JCCDFile(args[i]));
				}
				System.out.println(args[i]);
			}

		}

		// config

		// apply pre-processors
		final APreprocessor[] preprocessors = {
				new RemoveExtends(),
				new RemoveImplements(),
				new RemoveAnnotations(),
				new TokenLengthAnnotator(30),
				new TokenTypesAnnotator(12),
				// new RemoveThrow(),
				new RemoveThrowsClause(),

				new RemoveAssertions(),
				new RemoveGenericTypes(),
				new CollapseQualifiedTypeIdentNodes(),
				new RemoveInterfaces(),
				new RemoveImports(),
				new RemoveModifiers(),
				new RemovePackageInformation(),
				new RemoveRedundantParentheses(),
				// new RemoveSimpleMethods(),
				// new RemoveSetMethodDeclarations(),
				// new RemoveGetMethodDeclarations(),
				// new RemoveIsMethodDeclarations(),
				// new RemoveVariableDeclarationNodes(),
				// new CollapseArrayElementAccess(),
				// new CollapseCastExpressions(),
				// new CollapsePostfixOperators(),
				// new CollapsePrefixOperators(),
				// new CollapseUnaryPlus(),
				// new CollapseUnaryOperators(),
				// new MarkVariablesWithParentId(),
				// new RenameVariableNamesLocalConsistent(),
				new GeneralizeArrayInitializers(),
				// new GeneralizeClassDeclarationNames(),
				// new GeneralizeMethodCallNames(),
				// new ReduceIdentifiersToLastSubstring(),
				new ReduceIdentifiersToCapitalLetterSubstring(),
				// new GeneralizeMethodDeclarationNames(),
				// new GeneralizeTypes(),
				// new GeneralizeMethodReturnTypes(),
				// new GeneralizeMethodArgumentTypes(),
				// new GeneralizeVariableDeclarationTypes(),
				// new GeneralizeNewOperatorTypes(),
				// new GeneralizeVariableNames(),
				new CompleteToBlock(), new RemoveEmptyBlocks(),
				new RemoveEmptyMethods(),
				// new RemoveEmptyGroupNodes(),
				// , new NodeCountAnnotator()
				new HeightAnnotator(), };

		final ArrayList<IComparator<ANode>> comparators;

		if (useConsistentRenaming) {
			final ArrayList<IComparator<ANode>> comp = new ArrayList<IComparator<ANode>>();
			comp.add(new CheckEquality());
			comp.add(new AcceptNumberLiterals());
			comp.add(new AcceptNumberTypeNames());
			comp.add(new AcceptBooleanKeywords());
			comp.add(new AcceptStringLiterals());
			comp.add(new AcceptCharacterLiterals());
			comp.add(new AcceptFileNames());
			comp.add(new AcceptVariableIdentifiers());
			// new CheckConsistentVariableNames()
			comparators = comp;
		} else {
			final ArrayList<IComparator<ANode>> comp = new ArrayList<IComparator<ANode>>();
			comp.add(new CheckEquality());
			comp.add(new AcceptNumberLiterals());
			comp.add(new AcceptNumberTypeNames());
			comp.add(new AcceptBooleanKeywords());
			comp.add(new AcceptStringLiterals());
			comp.add(new AcceptCharacterLiterals());
			comp.add(new AcceptFileNames());
			comp.add(new AcceptVariableIdentifiers());
			// new CheckConsistentVariableNames()
			comparators = comp;
		}

		// start
		System.out.print("start parsing ...");
		long loc = 0;
		long parseTime = System.currentTimeMillis();
		long preprocessTime = 0;
		long poolingTime = 0;
		long comparingTime = 0;
		long filteringTime = 0;
		long nodeCount = 0;
		long classCount = 0;
		long anonymousClassCount = 0;
		long enumCount = 0;
		long interfaceCount = 0;
		long methodCount = 0;
		long constructorCount = 0;
		long fileCount = 0;
		SimilarityGroup[] simGroups = null;

		final ASTParseUnit parser = new ASTParseUnit(new StandardParserSelector());

		JCCDFile[] files = new JCCDFile[fileVec.size()];
		files = fileVec.toArray(files);

		final ASTManager container = parser.parse(files);

		final ASTManager container2;
		if (null != fileVec2) {
			JCCDFile[] files2 = new JCCDFile[fileVec2.size()];
			files2 = fileVec2.toArray(files2);

			container2 = parser.parse(files2);
		} else {
			container2 = null;
		}

		parseTime = System.currentTimeMillis() - parseTime;
		System.out.println(" finished (" + parseTime + "ms).");

		System.out.print("count nodes ...");
		long tmpTime = System.currentTimeMillis();
		// count nodes, classes and interfaces
		loc = countLOC(container);
		nodeCount = countNodes(container, null);
		classCount = countNodes(container, new int[] { Antlr3JavaParser.CLASS });
		anonymousClassCount = countNodes(container,
				new int[] { Antlr3JavaParser.CLASS_CONSTRUCTOR_CALL });
		enumCount = countNodes(container, new int[] { Antlr3JavaParser.ENUM });
		interfaceCount = countNodes(container,
				new int[] { Antlr3JavaParser.INTERFACE });
		methodCount = countNodes(container,
				new int[] { Antlr3JavaParser.FUNCTION_METHOD_DECL });
		constructorCount = countNodes(container,
				new int[] { Antlr3JavaParser.CONSTRUCTOR_DECL });
		fileCount = container.getRoot().getChildCount();

		if (null != container2) {
			loc += countLOC(container2);
			nodeCount += countNodes(container2, null);
			classCount += countNodes(container2,
					new int[] { Antlr3JavaParser.CLASS });
			anonymousClassCount += countNodes(container2,
					new int[] { Antlr3JavaParser.CLASS_CONSTRUCTOR_CALL });
			enumCount += countNodes(container2,
					new int[] { Antlr3JavaParser.ENUM });
			interfaceCount += countNodes(container2,
					new int[] { Antlr3JavaParser.INTERFACE });
			methodCount += countNodes(container2,
					new int[] { Antlr3JavaParser.FUNCTION_METHOD_DECL });
			constructorCount += countNodes(container2,
					new int[] { Antlr3JavaParser.CONSTRUCTOR_DECL });
			fileCount += container2.getRoot().getChildCount();
		}
		System.out.println(" finished ("
				+ (System.currentTimeMillis() - tmpTime) + "ms).");

		preprocessTime = System.currentTimeMillis();
		System.out.print("start preprocessing ...");

		// preprocessing
		container.preprocess(preprocessors);
		if (null != container2) {
			container2.preprocess(preprocessors);
		}
		preprocessTime = System.currentTimeMillis() - preprocessTime;
		System.out.println(" finished (" + preprocessTime + "ms).");
		poolingTime = System.currentTimeMillis();
		System.out.print("start pooling ...");

		// pooling
		final ASTPoolUnit poolUnit = new ASTPoolUnit(new TokenLengthPoolingStrategy());
		final PoolContainer poolContainer = poolUnit.getPoolContainer(
				container, container2);
		poolingTime = System.currentTimeMillis() - poolingTime;
		System.out.println(" finished (" + poolingTime + "ms).");
		System.out.print("start comparing ...");
		comparingTime = System.currentTimeMillis();

		// comparing
		final SimilarityGroupManager simGroupContainer;
		if (useThreading) {
			System.out.println("\t-> threading activated.");
			final CompareUnitThreading compareUnit = new CompareUnitThreading(
					comparators);
			simGroupContainer = compareUnit
					.compare(poolContainer, threadAmount);
		} else {
			final ASTCompareUnit compareUnit = new ASTCompareUnit(comparators);
			simGroupContainer = compareUnit.compare(poolContainer);
		}

		final int similarityPairCount = simGroupContainer.getPairs().length;
		simGroups = simGroupContainer.getSimilarityGroups();
		comparingTime = System.currentTimeMillis() - comparingTime;
		System.out.println(" finished (" + comparingTime + "ms).");
		System.out.print("start filtering ...");

		// filtering
		int simGroupCount = (null == simGroups) ? 0 : simGroups.length;
		int simNodeCount = 0;
		int simPairsCount = 0;
		if (null != simGroups) {
			for (SimilarityGroup simGroup : simGroups) {
				simNodeCount += simGroup.getNodesCount();
				simPairsCount += simGroup.getPairCount();
			}
		}
		filteringTime = System.currentTimeMillis();

		new StandardOverlapPruningFilter().start(simGroupContainer);
		simGroups = simGroupContainer.getSimilarityGroups();

		int simNodeCount2 = 0;
		if (null != simGroups) {
			for (SimilarityGroup simGroup : simGroups) {
				simNodeCount2 += simGroup.getNodesCount();
			}
		}

		filteringTime = System.currentTimeMillis() - filteringTime;
		System.out.println(" finished (" + filteringTime + "ms).");

		// statistics
		System.out.println("STATISTICS");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out
				.println("Time: "
						+ (parseTime + preprocessTime + poolingTime
								+ comparingTime + filteringTime) + " ms");
		System.out.println("parsing time: " + parseTime + " ms");
		System.out.println("preprocessing time: " + preprocessTime + " ms");
		System.out.println("pooling time: " + poolingTime + " ms");
		System.out.println("comparing time: " + comparingTime + " ms");
		System.out.println("filtering time: " + filteringTime + " ms");
		System.out.println("LOC: " + loc);
		System.out.println("Detected similarity pairs before pruning: "
				+ similarityPairCount + " : " + simPairsCount);
		System.out.println("Detected similarity groups before pruning: "
				+ simGroupCount);
		System.out.println("-- containing nodes count: " + simNodeCount);
		System.out.println("Detected similarity groups after pruning: "
				+ ((null == simGroups) ? 0 : simGroups.length));
		System.out.println("-- containing nodes count: " + simNodeCount2);
		System.out.println("node amount before preprocessing: " + nodeCount);
		System.out.println("node amount after preprocessing: "
				+ countNodes(container, null));
		System.out.println("class amount: " + classCount);
		System.out.println("anonymous class amount: " + anonymousClassCount);
		System.out.println("enum amount: " + enumCount);
		System.out.println("interface amount: " + interfaceCount);
		System.out.println("method amount: " + methodCount);
		System.out.println("constructor amount: " + constructorCount);
		System.out.println("file amount: " + fileCount);

		// write to file
		FileWriter fstream;
		try {
			fstream = new FileWriter(writePairs);
			BufferedWriter out = new BufferedWriter(fstream);
			for (SimilarityGroup group : simGroups) {
				final SimilarityPair[] pairs = group.getPairs();
				for (SimilarityPair pair : pairs) {
					final ANode first = (ANode) pair.getFirstNode();
					final ANode second = (ANode) pair.getSecondNode();
					ANode parent = first;
					while (parent.getType() != NodeTypes.FILE.getType()) {
						parent = parent.getParent();
					}
					out.write(parent.getText());
					out.write("\t");
					SourceUnitPosition pos = getFirstNodePosition(first);
					out.write(String.valueOf(pos.getLine()));
					out.write("\t");
					out.write(String.valueOf(pos.getCharacter()));
					out.write("\t");
					pos = getLastNodePosition(first);
					out.write(String.valueOf(pos.getLine()));
					out.write("\t");
					out.write(String.valueOf(pos.getCharacter()));
					out.write("\t");

					parent = second;
					while (parent.getType() != NodeTypes.FILE.getType()) {
						parent = parent.getParent();
					}
					out.write(parent.getText());
					out.write("\t");
					pos = getFirstNodePosition(second);
					out.write(String.valueOf(pos.getLine()));
					out.write("\t");
					out.write(String.valueOf(pos.getCharacter()));
					out.write("\t");
					pos = getLastNodePosition(second);
					out.write(String.valueOf(pos.getLine()));
					out.write("\t");
					out.write(String.valueOf(pos.getCharacter()));
					out.write("\t");
					out.write("\n");
				}
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static long countNodes(ASTManager visitor, int[] types) {
		long count = 0;
		if (null == types) {
			count = 1;
		} else {
			for (int type : types) {
				if (visitor.getMarkedNode().getType() == type) {
					count = 1;
					break;
				}
			}
		}

		if (0 == visitor.getChildCountOfMarkedNode()) {
			return count;
		}

		for (int i = 0; i < visitor.getChildCountOfMarkedNode(); i++) {
			visitor.markChild(i);
			count += countNodes(visitor, types);
			visitor.markParentNode();
		}

		return count;
	}

	public static long countLOC(ASTManager visitor) {
		long loc = 0;
		visitor.markRootNode();
		for (int i = 0; i < visitor.getChildCountOfMarkedNode(); i++) {
			final HashSet<Integer> locset = new HashSet<Integer>();
			visitor.markChild(i);
			countLOC(visitor, locset);
			visitor.markParentNode();
			loc += locset.size();
			loc--;
		}
		return loc;
	}

	public static void countLOC(ASTManager visitor, final HashSet<Integer> loc) {
		loc.add(visitor.getMarkedNode().getLine());

		if (0 == visitor.getChildCountOfMarkedNode()) {
			return;
		}

		for (int i = 0; i < visitor.getChildCountOfMarkedNode(); i++) {
			visitor.markChild(i);
			countLOC(visitor, loc);
			visitor.markParentNode();
		}
	}

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
}

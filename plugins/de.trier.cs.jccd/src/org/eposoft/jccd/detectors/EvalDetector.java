/**
 * 
 */
package org.eposoft.jccd.detectors;

import java.util.ArrayList;

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
import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.filters.IFilter;
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
 * An AST-based code clone detector used for a first evaluation.
 * 
 * @author biegel
 * @see JCCDEvaluation
 */
public class EvalDetector extends APipeline<ANode> {

	/**
	 * Standard constructor.
	 */
	public EvalDetector() {
		this.addOperator(new CheckEquality());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Start ASTDetector.");
		final APipeline<ANode> det = new EvalDetector();
		final JCCDFile[] files = { new JCCDFile("/home/biegel/analyse/jEdit") };
		det.setSourceFiles(files);
		det.addOperator(new RemoveExtends());
		det.addOperator(new RemoveImplements());
		det.addOperator(new RemoveAnnotations());
		det.addOperator(new TokenLengthAnnotator(30));
		det.addOperator(new TokenTypesAnnotator(12));
		// det.addOperator( new RemoveThrow());
		det.addOperator(new RemoveThrowsClause());

		det.addOperator(new RemoveAssertions());
		det.addOperator(new RemoveGenericTypes());
		det.addOperator(new CollapseQualifiedTypeIdentNodes());
		det.addOperator(new RemoveInterfaces());
		det.addOperator(new RemoveImports());
		det.addOperator(new RemoveModifiers());
		det.addOperator(new RemovePackageInformation());
		det.addOperator(new RemoveRedundantParentheses());
		// det.addOperator(new RemoveSimpleMethods());
		// det.addOperator(new RemoveSetMethodDeclarations());
		// det.addOperator(new RemoveGetMethodDeclarations());
		// det.addOperator(new RemoveIsMethodDeclarations());
		// det.addOperator(new RemoveVariableDeclarationNodes());
		// det.addOperator(new CollapseArrayElementAccess());
		// det.addOperator(new CollapseCastExpressions());
		// det.addOperator(new CollapsePostfixOperators());
		// det.addOperator(new CollapsePrefixOperators())
		// det.addOperator(new CollapseUnaryPlus());
		// det.addOperator(new CollapseUnaryOperators());
		// det.addOperator(new MarkVariablesWithParentId());
		// det.addOperator(new RenameVariableNamesLocalConsistent());
		det.addOperator(new GeneralizeArrayInitializers());
		// det.addOperator(new GeneralizeClassDeclarationNames());
		// det.addOperator(new GeneralizeMethodCallNames());
		// det.addOperator(new ReduceIdentifiersToLastSubstring());
		det.addOperator(new ReduceIdentifiersToCapitalLetterSubstring());
		// det.addOperator(new GeneralizeMethodDeclarationNames());
		// det.addOperator(new GeneralizeTypes());
		// det.addOperator(new GeneralizeMethodReturnTypes());
		// det.addOperator(new GeneralizeMethodArgumentTypes());
		// det.addOperator(new GeneralizeVariableDeclarationTypes());
		// det.addOperator(new GeneralizeNewOperatorTypes());
		// det.addOperator(new GeneralizeVariableNames());
		det.addOperator(new CompleteToBlock());
		det.addOperator(new RemoveEmptyBlocks());
		det.addOperator(new RemoveEmptyMethods());
		// det.addOperator(new RemoveEmptyGroupNodes());
		// det.addOperator(new NodeCountAnnotator());
		det.addOperator(new HeightAnnotator());

		// comparators
		det.addOperator(new CheckEquality());
		det.addOperator(new AcceptNumberLiterals());
		det.addOperator(new AcceptNumberTypeNames());
		det.addOperator(new AcceptBooleanKeywords());
		det.addOperator(new AcceptStringLiterals());
		det.addOperator(new AcceptCharacterLiterals());
		det.addOperator(new AcceptFileNames());
		det.addOperator(new AcceptVariableIdentifiers());
		det.setFilters(new IFilter[] { new StandardOverlapPruningFilter() });
		det.process();
	}

	@Override
	protected SourceUnitManager parse(JCCDFile[] filesSet) {
		final ASTParseUnit parser = new ASTParseUnit(new StandardParserSelector());
		return parser.parse(filesSet);
	}

	@Override
	protected PoolContainer pool(SourceUnitManager sourceUnits1,
			SourceUnitManager sourceUnits2) {
		final ASTPoolUnit poolUnit = new ASTPoolUnit(new TokenLengthPoolingStrategy());
		final PoolContainer poolContainer = poolUnit.getPoolContainer(
				(ASTManager) sourceUnits1, (ASTManager) sourceUnits2);
		return poolContainer;
	}

	@Override
	protected SimilarityGroupManager compare(
			ArrayList<IComparator<ANode>> comparators, PoolContainer pools) {
		final CompareUnitThreading compareUnit = new CompareUnitThreading(
				comparators);
		return compareUnit.compare(pools, 1);
	}

	/**
	 * @return
	 */
	@Override
	public SimilarityGroupManager process() {
		if (null == this.getFileSet1()) {
			// XXX exception
			return null;
		}

		final ArrayList<IComparator<ANode>> comparators = this.getComparators();

		if ((null == comparators) || (this.getComparators().isEmpty())) {
			// XXX exception
			return null;
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

		// parsing
		SourceUnitManager sourceUnits1, sourceUnits2;
		sourceUnits1 = this.parse(this.getFileSet1());

		if (null != this.getFileSet2()) {
			sourceUnits2 = this.parse(this.getFileSet2());
		} else {
			sourceUnits2 = null;
		}

		parseTime = System.currentTimeMillis() - parseTime;
		System.out.println(" finished (" + parseTime + "ms).");

		System.out.print("count nodes ...");
		long tmpTime = System.currentTimeMillis();
		// count nodes, classes and interfaces
		ASTManager container = (ASTManager) sourceUnits1;
		ASTManager container2 = (ASTManager) sourceUnits2;
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
		APreprocessor[] preprocessors = this.getPreprocessors();
		if (null != preprocessors) {
			sourceUnits1 = this.preprocess(preprocessors, sourceUnits1);
			if (null != sourceUnits2) {
				sourceUnits2 = this.preprocess(preprocessors, sourceUnits2);
			}
		}

		preprocessTime = System.currentTimeMillis() - preprocessTime;
		System.out.println(" finished (" + preprocessTime + "ms).");
		poolingTime = System.currentTimeMillis();
		System.out.print("start pooling ...");

		// pooling
		final PoolContainer pools = this.pool(sourceUnits1, sourceUnits2);

		poolingTime = System.currentTimeMillis() - poolingTime;
		System.out.println(" finished (" + poolingTime + "ms).");
		System.out.print("start comparing ...");
		comparingTime = System.currentTimeMillis();

		// comparing
		SimilarityGroupManager similarityGroups = this.compare(comparators,
				pools);

		final int similarityPairCount = similarityGroups.getPairs().length;
		simGroups = similarityGroups.getSimilarityGroups();
		comparingTime = System.currentTimeMillis() - comparingTime;
		System.out.println(" finished (" + comparingTime + "ms).");
		System.out.print("start filtering ...");
		int simGroupCount = (null == simGroups) ? 0 : simGroups.length;
		int simNodeCount = 0;
		int simPairsCount = 0;
		if (null != simGroups) {
			for (SimilarityGroup simGroup : simGroups) {
				simNodeCount += simGroup.getNodesCount();
				simPairsCount += simGroup.getPairCount();
			}
		}

		// filtering

		if (this.getFilters() != null) {
			filteringTime = System.currentTimeMillis();
			similarityGroups = this.filter(this.getFilters(), similarityGroups);
			filteringTime = System.currentTimeMillis() - filteringTime;
			simGroups = similarityGroups.getSimilarityGroups();
			System.out.println(" finished (" + filteringTime + "ms).");
		}

		int simNodeCount2 = 0;
		if (null != simGroups) {
			for (SimilarityGroup simGroup : simGroups) {
				simNodeCount2 += simGroup.getNodesCount();
			}
		}

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

		return similarityGroups;
	}

}

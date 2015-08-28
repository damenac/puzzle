package org.eposoft.jccd.detectors;

import java.util.ArrayList;

import org.eposoft.jccd.comparators.IComparator;
import org.eposoft.jccd.comparators.ast.AcceptFileNames;
import org.eposoft.jccd.comparators.ast.CheckEquality;
import org.eposoft.jccd.comparators.ast.java.NumberLiteralToDouble;
import org.eposoft.jccd.data.JCCDFile;
import org.eposoft.jccd.data.PoolContainer;
import org.eposoft.jccd.data.SimilarityGroupManager;
import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.filters.IFilter;
import org.eposoft.jccd.filters.StandardOverlapPruningFilter;
import org.eposoft.jccd.parser.StandardParserSelector;
import org.eposoft.jccd.pools.HeightPoolingStrategy;
import org.eposoft.jccd.preprocessors.APreprocessor;
import org.eposoft.jccd.preprocessors.java.CompleteToBlock;
import org.eposoft.jccd.preprocessors.java.GeneralizeClassDeclarationNames;
import org.eposoft.jccd.preprocessors.java.GeneralizeMethodArgumentTypes;
import org.eposoft.jccd.preprocessors.java.GeneralizeMethodDeclarationNames;
import org.eposoft.jccd.preprocessors.java.GeneralizeMethodReturnTypes;
import org.eposoft.jccd.preprocessors.java.GeneralizeVariableDeclarationTypes;
import org.eposoft.jccd.preprocessors.java.GeneralizeVariableNames;
import org.eposoft.jccd.preprocessors.java.HeightAnnotator;

/**
 * An AST-based code clone detector.
 * 
 * @author biegel
 */
public class ASTDetector extends APipeline<ANode> {

	/**
	 * Standard constructor.
	 */
	public ASTDetector() {
		// standard configuration
		this.addOperator(new CheckEquality());
		this.setFilters(new IFilter[] { new StandardOverlapPruningFilter() });
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Start ASTDetector.");
		final APipeline<ANode> det = new ASTDetector();
		final JCCDFile[] files = {
				new JCCDFile("org/eposoft/jccd/tests/TestFileOne.java"),
				new JCCDFile("org/eposoft/jccd/tests/TestFileTwo.java") };
		det.setSourceFiles(files);
		det.addOperator(new GeneralizeMethodDeclarationNames());
		det.addOperator(new GeneralizeVariableNames());
		det.addOperator(new CompleteToBlock());
		det.addOperator(new GeneralizeMethodArgumentTypes());
		det.addOperator(new GeneralizeMethodReturnTypes());
		det.addOperator(new GeneralizeVariableDeclarationTypes());
		det.addOperator(new GeneralizeClassDeclarationNames());

		// comparators
		det.addOperator(new NumberLiteralToDouble());
		det.addOperator(new AcceptFileNames());
		det.addOperator(new CheckEquality());
		APipeline.printSimilarityGroups(det.process());
	}

	@Override
	public APreprocessor[] getPreprocessors() {
		final APreprocessor[] preprocessors = super.getPreprocessors();
		if (null == preprocessors) {
			return new APreprocessor[] { new HeightAnnotator() };
		}
		// check if the array contains a HeighAnnotator
		for (APreprocessor preprocessor : preprocessors) {
			if (preprocessor instanceof HeightAnnotator) {
				return preprocessors;
			}
		}

		// add HeightAnnotator, necessary for the HeightPoolingStrategy
		final APreprocessor[] manipulatedPreprocessors = new APreprocessor[preprocessors.length + 1];
		System.arraycopy(preprocessors, 0, manipulatedPreprocessors, 0,
				preprocessors.length);
		manipulatedPreprocessors[manipulatedPreprocessors.length - 1] = new HeightAnnotator();
		return manipulatedPreprocessors;
	}

	@Override
	protected SourceUnitManager parse(JCCDFile[] filesSet) {
		final ASTParseUnit parser = new ASTParseUnit(
				new StandardParserSelector());
		return parser.parse(filesSet);
	}

	@Override
	protected PoolContainer pool(SourceUnitManager sourceUnits1,
			SourceUnitManager sourceUnits2) {
		final ASTPoolUnit poolUnit = new ASTPoolUnit(
				new HeightPoolingStrategy());
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
}

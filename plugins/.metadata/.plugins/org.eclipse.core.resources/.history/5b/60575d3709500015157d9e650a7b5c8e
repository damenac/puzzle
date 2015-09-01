package org.eposoft.jccd.detectors;

import java.util.ArrayList;
import java.util.HashSet;

import org.eposoft.jccd.comparators.IComparator;
import org.eposoft.jccd.data.ASourceUnit;
import org.eposoft.jccd.data.JCCDFile;
import org.eposoft.jccd.data.PoolContainer;
import org.eposoft.jccd.data.SimilarityGroup;
import org.eposoft.jccd.data.SimilarityGroupManager;
import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.SourceUnitPosition;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.data.ast.NodeTypes;
import org.eposoft.jccd.filters.IFilter;
import org.eposoft.jccd.preprocessors.APreprocessor;

/**
 * All processing steps of the pipeline plugged together -- custom detector
 * might inherit from this class.
 * 
 * @author biegel
 */
public abstract class APipeline<T extends ASourceUnit> {

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

	/**
	 * @param node
	 *            any node of the AST
	 * @return first usable position (!= -1) in the tree
	 */
	public static SourceUnitPosition getFirstNodePosition(final ANode node) {
		if (-1 != node.getLine() || node.isLeaf()) {
			return new SourceUnitPosition(node.getLine(),
					node.getCharPositionInLine());
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
		SourceUnitPosition max = new SourceUnitPosition(node.getLine(),
				node.getCharPositionInLine());
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

	public static void printSimilarityGroups(
			final SimilarityGroupManager groupContainer) {
		// output similarity groups
		SimilarityGroup[] simGroups = groupContainer.getSimilarityGroups();

		if (null == simGroups) {
			simGroups = new SimilarityGroup[0];
		}
		if ((null != simGroups) && (0 < simGroups.length)) {
			for (int i = 0; i < simGroups.length; i++) {
				final ASourceUnit[] nodes = simGroups[i].getNodes();
				System.out.println("");
				System.out.println("Similarity Group "
						+ simGroups[i].getGroupId());
				System.out.print("========================================");
				System.out.println("========================================");
				for (int j = 0; j < nodes.length; j++) {
					final SourceUnitPosition minPos = getFirstNodePosition((ANode) nodes[j]);
					final SourceUnitPosition maxPos = getLastNodePosition((ANode) nodes[j]);

					ANode fileNode = (ANode) nodes[j];
					while (fileNode.getType() != NodeTypes.FILE.getType()) {
						fileNode = fileNode.getParent();
					}
					// System.out.print(fileNode.getParent().getText());
					// System.out.print(" (");
					// System.out.print(nodes[j].getId());
					// System.out.print("): ");
					// System.out.print(nodes[j].getText());
					// System.out.print(" -> ");
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
				System.out.print("========================================");
				System.out.println("========================================");
			}
		} else {
			System.out.println("No similar nodes found.");
		}
	}

	private ArrayList<IComparator<T>> comparators = new ArrayList<IComparator<T>>();

	private JCCDFile[] fileSet1 = null;

	private JCCDFile[] fileSet2 = null;

	private IFilter[] filters = null;

	private ArrayList<APreprocessor> preprocessors = new ArrayList<APreprocessor>();

	/**
	 * @return
	 */
	protected abstract SimilarityGroupManager compare(
			ArrayList<IComparator<T>> comparators, PoolContainer pools);

	/**
	 * @return
	 */
	protected SimilarityGroupManager filter(IFilter[] filters,
			SimilarityGroupManager simGroups) {
		simGroups.filter(filters);
		return simGroups;
	}

	/**
	 * @return the comparators
	 */
	public ArrayList<IComparator<T>> getComparators() {
		return this.comparators;
	}

	/**
	 * @return the fileSet1
	 */
	public JCCDFile[] getFileSet1() {
		return this.fileSet1;
	}

	/**
	 * @return the fileSet2
	 */
	public JCCDFile[] getFileSet2() {
		return this.fileSet2;
	}

	/**
	 * @return the filters
	 */
	public IFilter[] getFilters() {
		return this.filters;
	}

	/**
	 * @return the preprocessors
	 */
	public APreprocessor[] getPreprocessors() {
		APreprocessor[] preprocessors = new APreprocessor[this.preprocessors
				.size()];
		return this.preprocessors.toArray(preprocessors);
	}

	/**
	 * @return
	 */
	protected abstract SourceUnitManager parse(JCCDFile[] filesSet);

	/**
	 * @return
	 */
	protected abstract PoolContainer pool(SourceUnitManager sourceUnits1,
			SourceUnitManager sourceUnits2);

	/**
	 * @return
	 */
	protected SourceUnitManager preprocess(final APreprocessor[] preprocessors,
			final SourceUnitManager sourceUnits) {
		if (null == preprocessors) {
			return null;
		}
		sourceUnits.preprocess(preprocessors);
		return sourceUnits;
	}

	/**
	 * @return
	 */
	public SimilarityGroupManager process() {
		if (null == this.fileSet1) {
			// XXX exception
			return null;
		}

		final ArrayList<IComparator<T>> comparators = this.getComparators();

		if ((null == comparators) || (this.comparators.isEmpty())) {
			// XXX exception
			return null;
		}

		// parsing
		SourceUnitManager sourceUnits1, sourceUnits2;
		sourceUnits1 = this.parse(this.fileSet1);

		if (null != this.fileSet2) {
			sourceUnits2 = this.parse(this.fileSet2);
		} else {
			sourceUnits2 = null;
		}

		// preprocessing
		APreprocessor[] preprocessors = this.getPreprocessors();
		if (null != preprocessors) {
			sourceUnits1 = this.preprocess(preprocessors, sourceUnits1);
			if (null != sourceUnits2) {
				sourceUnits2 = this.preprocess(preprocessors, sourceUnits2);
			}
		}

		// pooling
		final PoolContainer pools = this.pool(sourceUnits1, sourceUnits2);

		// comparing
		SimilarityGroupManager similarityGroups = this.compare(comparators,
				pools);

		// filtering
		if (this.getFilters() != null) {
			similarityGroups = this.filter(this.getFilters(), similarityGroups);
		}

		return similarityGroups;
	}

	/**
	 * @param preprocessor
	 */
	public void addOperator(APreprocessor preprocessor) {
		if (null == preprocessor) {
			return;
		}
		this.preprocessors.add(preprocessor);
	}

	/**
	 * @param preprocessors
	 */
	// public void addOperator(APreprocessor... preprocessors) {
	// if (null == preprocessors) {
	// return;
	// }
	//
	// for (APreprocessor preprocessor : preprocessors) {
	// this.preprocessors.add(preprocessor);
	// }
	// }

	/**
	 * @param comparator
	 */
	public void addOperator(IComparator<T> comparator) {
		if (null == comparator) {
			return;
		}
		this.comparators.add(comparator);
	}

	/**
	 * @param comparator
	 */
	// public void addOperator(IComparator<T>... comparators) {
	// if (null == comparators) {
	// return;
	// }
	// for (IComparator<T> comparator : comparators) {
	// this.comparators.add(comparator);
	// }
	// }

	/**
	 * @param filters
	 *            the filters to set
	 */
	public void setFilters(IFilter[] filters) {
		this.filters = filters;
	}

	/**
	 * @param fileSet
	 */
	public void setSourceFiles(final JCCDFile[] fileSet) {
		this.setSourceFiles(fileSet, null);
	}

	/**
	 * @param fileSet1
	 * @param fileSet2
	 */
	public void setSourceFiles(final JCCDFile[] fileSet1,
			final JCCDFile[] fileSet2) {
		if (null != fileSet1) {
			this.fileSet1 = fileSet1;
			this.fileSet2 = fileSet2;
			return;
		}

		// first file set is null.
		if (null != fileSet2) {
			this.fileSet1 = fileSet2;
			this.fileSet2 = null;
			return;
		}

		// at least one file set must not be null!
		// XXX exception!

	}
}

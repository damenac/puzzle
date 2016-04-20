package fr.inria.diverse.puzzle.metrics.auxiliarMetrics;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

/**
 * A pairwise cohesion matrix according to a collection of meta-classes
 * @author David Mendez Acuna
 *
 */
public class PairwiseCohesionMatrix {

	
	public static double[][] computePairwiseCohesionMatrix(List<EClass> metaClasses){
		double[][] matrix = new double[metaClasses.size()][metaClasses.size()];
		int totalReferences = ContextReferences.countTotalReferences(metaClasses);
		
		for (int i = 0; i < metaClasses.size(); i++) {
			for (int j = i + 1; j < matrix.length; j++) {
				matrix[i][j] = PairwiseCohesion.computePairwiseCohesion(
						metaClasses.get(i), metaClasses.get(j), totalReferences);
			}
		}
		return matrix;
	}
}

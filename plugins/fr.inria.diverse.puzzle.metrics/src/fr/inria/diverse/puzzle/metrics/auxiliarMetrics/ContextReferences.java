package fr.inria.diverse.puzzle.metrics.auxiliarMetrics;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ContextReferences {

	/**
	 * Returns the number of references among the metaclasses in the parameters.
	 * @param contextMetaClasses
	 * @return
	 */
	public static int countTotalReferences(List<EClass> contextMetaClasses) {
		int result = 0;
		
		for (EClass eClass : contextMetaClasses) {
			for (EStructuralFeature eStructuralFeature : eClass.getEStructuralFeatures()) {
				if(eStructuralFeature instanceof EReference)
					result++;
			}
			result += eClass.getESuperTypes().size();
		}
		
		return result;
	}
}

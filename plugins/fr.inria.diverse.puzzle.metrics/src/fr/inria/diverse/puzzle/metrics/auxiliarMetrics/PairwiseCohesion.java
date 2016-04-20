package fr.inria.diverse.puzzle.metrics.auxiliarMetrics;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Metric that measures the degree of cohesion between two meta-classes
 * The level of cohesion is defined by the function coh(x,y)
 *             0                                                                                     if (x.refs + y.refs) = 0
 * coh(x,y) =  (|{r|r in x.refs | r.type = y}| + |{r|r in y.refs | r.type = x}|)/(x.refs + y.refs)   otherwise
 * 
 * @author dmendeza
 *
 */
public class PairwiseCohesion {

	/**
	 * Computes the level of cohesion between two classes in the parameter. 
	 * The level of cohesion is defined by the function coh(x,y)
     *             0                                                                                     if (x.refs + y.refs) = 0
     * coh(x,y) =  (|{r|r in x.refs | r.type = y}| + |{r|r in y.refs | r.type = x}|)/(x.refs + y.refs)   otherwise
	 * @param x
	 * @param y
	 * @return
	 */
	public static double computePairwiseCohesion(EClass x, EClass y, int contextReferences){
		int refsFromXToY = computeCrossReferences(x, y);
		int refsFromYtoX = computeCrossReferences(y, x);
		
		if(contextReferences == 0)
			return 0;
		else{
			double result = 0;
			result = ((double) (refsFromXToY + refsFromYtoX))/(contextReferences);
			return result;
		}
	}
	

	/**
	 * Return the amount of references that go from the class 'from' to the class 'to'
	 * @param from
	 * @param to
	 * @return
	 */
	public static int computeCrossReferences(EClass from, EClass to){
		int result = 0;
		
		for (EStructuralFeature eStructuralFeature : from.getEStructuralFeatures()) {
			if(eStructuralFeature instanceof EReference){
				EReference eReference = (EReference) eStructuralFeature;
				if(eReference.getEType().getName().equals(to.getName()))
				result++;
			}
		}
		
		for (EClass eSuperType : from.getESuperTypes()) {
			if(eSuperType.getName().equals(to.getName()))
				result++;
		}
		
		return result;
	}
	
	/**
	 * Returns the amount of EReferences in the meta-class given in the parameter.
	 * @param eClass
	 * @return
	 */
	public static int countReferences(EClass eClass){
		int result = 0;
		for (EStructuralFeature eStructuralFeature : eClass.getEStructuralFeatures()) {
			if(eStructuralFeature instanceof EReference)
				result ++;
		}
		return result + eClass.getESuperTypes().size();
	}
}

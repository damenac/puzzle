package fr.inria.diverse.puzzle.metrics.evaluators.syntax;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.utils.EcoreQueries;

public class ReusabilityBenefit {

	public static String evaluate(ArrayList<EPackage> ePackages){
		double SoC = SizeOfCommonality.evaluateForSyntax(ePackages);
		String result = "";
		
		for (EPackage ePackageI : ePackages) {
			for (EPackage ePackageJ : ePackages) {
				if(!ePackageI.getName().equals(ePackageJ.getName())){
					double currentValue = SoC / EcoreQueries.getIntersection(ePackageI, ePackageJ).size();
					
					result += "  - " + ePackageI.getName() + " vs " + ePackageJ.getName() + ": " + currentValue + "\n";
					
//					for (String string : EcoreQueries.getIntersection(ePackageI, ePackageJ)) {
//						result += "       * " + string + "\n";
//					}
				}
			}
		}
		
		return result;
	}
	
}

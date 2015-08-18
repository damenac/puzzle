package fr.inria.diverse.puzzle.metrics.evaluators.syntax;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;

public class ProductRelatedReusability {

	public static String evaluate(ArrayList<EPackage> ePackages){
		double SoSC = SizeOfCommonality.evaluateMetric(ePackages);
		String result = "";
		
		for (EPackage ePackage : ePackages) {
			double currentValue = SoSC / countConstructs(ePackage);
			result += ePackage.getName() + ": " + currentValue + "\n";
		}
		
		return result;
	}
	
	private static double countConstructs(EPackage ePackage){
		double count = ePackage.getEClassifiers().size();
		
		for (EPackage eSubPackage : ePackage.getESubpackages()) {
			count += countConstructs(eSubPackage);
		}
		
		return count;
	}
}
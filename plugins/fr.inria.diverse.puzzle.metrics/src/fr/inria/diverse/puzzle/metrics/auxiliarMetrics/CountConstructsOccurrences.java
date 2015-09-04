package fr.inria.diverse.puzzle.metrics.auxiliarMetrics;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.utils.MelangeServices;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class CountConstructsOccurrences {

	public static int intCountConstructOccurrences(ArrayList<Language> languages, ConceptComparison comparisonOperator, EClassifier construct) throws Exception{
		int occurrences = 0;
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		for (EPackage ePackage : ePackages) {
			if(constructExists(ePackage, construct, comparisonOperator)){
				occurrences ++;
			}
		}
		return occurrences;
	}
	
	public static boolean constructExists(EPackage ePackage, EClassifier eClassifier, ConceptComparison comparisonOperator){
		for (EClassifier currentClassifier : ePackage.getEClassifiers()) {
			if(comparisonOperator.equals(eClassifier, currentClassifier))
				return true;
		}
		for (EPackage eSubPackage : ePackage.getESubpackages()) {
			if(constructExists(eSubPackage, eClassifier, comparisonOperator))
				return true;
		}
		return false;
	}
	
	
}

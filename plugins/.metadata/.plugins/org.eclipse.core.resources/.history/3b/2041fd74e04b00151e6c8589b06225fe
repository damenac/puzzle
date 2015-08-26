package fr.inria.diverse.puzzle.metrics.chartMetrics;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.common.types.JvmOperation;

import fr.inria.diverse.k3.sle.common.comparisonOperators.ConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.MethodComparison;
import fr.inria.diverse.k3.sle.common.utils.MelangeServices;
import fr.inria.diverse.melange.metamodel.melange.Aspect;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.puzzle.metrics.auxiliarMetrics.TotalAmountOfConcepts;
import fr.inria.diverse.puzzle.metrics.auxiliarMetrics.TotalAmountOfMethods;

/**
 * Chart metric for the Product Related Reusability (PRR)
 * @author David Mendez-Acuna
 */
public class ProductRelatedReusability implements ChartMetric {

	// ---------------------------------------------------
	// Methods
	// ---------------------------------------------------

	@Override
	public String getVariablesDeclaration(ArrayList<Language> languages, ConceptComparison comparisonOperator, MethodComparison methodComparisonOperator) throws Exception{
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		String answer = "var barProductRelatedReusability = {\n";
		boolean first = true;
		String labels = "";
		for (EPackage ePackage : ePackages) {
			if(!first) labels += ",";
			labels += "\"" + ePackage.getName() + "\"";
			first = false;
		}
		
		answer += "   labels : [" + labels + "],\n";
		answer += "   datasets : [\n";
		answer += "     {\n";
		answer += "        fillColor : \"rgba(220,220,220,0.5)\",\n";
		answer += "        strokeColor : \"rgba(220,220,220,0.8)\",\n";
		answer += "        highlightFill: \"rgba(220,220,220,0.75)\",\n";
		answer += "        highlightStroke: \"rgba(220,220,220,1)\",\n";
		answer += "        data : [" + evaluateForSyntax(languages, comparisonOperator) + "]\n";
		answer += "      },\n";
		answer += "      {\n";
		answer += "        fillColor : \"rgba(151,187,205,0.5)\",\n";
		answer += "        strokeColor : \"rgba(151,187,205,0.8)\",\n";
		answer += "        highlightFill : \"rgba(151,187,205,0.75)\",\n";
		answer += "        highlightStroke : \"rgba(151,187,205,1)\",\n";
		answer += "        data : [" + evaluateForSemantics(languages, comparisonOperator, methodComparisonOperator) + "]\n"; 
		answer += "      }\n";
		answer += "    ]\n";
		answer += "};\n";
		
		return answer;
	}
	
	@Override
	public String getWindow(ArrayList<Language> languages){
		String answer = "    var ctxProductRelatedReusability = document.getElementById(\"pie-product-reusability\").getContext(\"2d\");\n";
		answer += "    window.myBarProductReusability = new Chart(ctxProductRelatedReusability).Bar(barProductRelatedReusability, {\n";
		answer += "       responsive : false\n";
		answer += "    });\n\n";
		return answer;
	}
	
	// ---------------------------------------------------
	// Auxiliar Services
	// ---------------------------------------------------
	
	public String evaluateForSyntax(ArrayList<Language> languages, ConceptComparison comparisonOperator) throws Exception{
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		String values = "";
		double SoSC = SizeOfCommonality.evaluateForSyntax(languages, comparisonOperator);
		boolean first = true;
		for (EPackage ePackage : ePackages) {
			double currentValue = (SoSC / TotalAmountOfConcepts.countConstructs(ePackage))*100;
			if(!first)
				values +=  ",";
			values += currentValue;
			first = false;
		}
		
		return values;
	}
	
	public String evaluateForSemantics(ArrayList<Language> languages, ConceptComparison comparisonOperator, MethodComparison methodComparisonOperator) throws Exception{
		String values = "";
		double SoSC = SizeOfCommonality.evaluateForSemantics(languages, comparisonOperator, methodComparisonOperator);
		boolean first = true;
		for (Language language : languages) {
			double currentValue = (SoSC / TotalAmountOfMethods.countMethods(language))*100;
			if(!first)
				values +=  ",";
			values += currentValue;
			first = false;
		}
		return values;
	}
}
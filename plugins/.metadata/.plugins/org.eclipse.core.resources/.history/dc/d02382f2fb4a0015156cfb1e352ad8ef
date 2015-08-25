package fr.inria.diverse.puzzle.metrics.evaluators.syntax;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.comparisonOperators.ConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.MethodComparison;
import fr.inria.diverse.k3.sle.common.tuples.ConceptMemberVO;
import fr.inria.diverse.k3.sle.common.tuples.ConceptMembersGroupVO;
import fr.inria.diverse.k3.sle.common.tuples.ConceptMethodMemberVO;
import fr.inria.diverse.k3.sle.common.tuples.ConceptMethodMembersGroupVO;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.k3.sle.common.utils.MelangeServices;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class IndividualizationRatio {

	public static String evaluateForSyntax(ArrayList<Language> languages, ConceptComparison comparisonOperator) throws Exception{
		String answer = "";
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		ArrayList<ConceptMemberVO> conceptMemberList = FamiliesServices.getInstance().getConceptMemberMappingList(ePackages);
		ArrayList<ConceptMembersGroupVO> conceptMemberGroupList = FamiliesServices.getInstance().getConceptMemberGroupList(conceptMemberList, comparisonOperator);
		boolean first = true;
		for (EPackage ePackage : ePackages) {
			double count = 0;
			for (ConceptMembersGroupVO conceptMembersGroupVO : conceptMemberGroupList) {
				if(conceptMembersGroupVO.getMemberGroup().size() >= 2 && conceptMembersGroupVO.getMemberGroup().contains(ePackage.getName())){
					count++;
				}
			}
			double individualizationRatio = (count/countConstructs(ePackage))*100;
			
			if(!first)
				answer +=  ",";
			answer += individualizationRatio;
			first = false;
		}
		
		return answer;
	}
	
	public static String evaluateForSemantics(ArrayList<Language> languages, ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator) throws Exception{
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		String answer = "";
		ArrayList<ConceptMethodMemberVO> conceptMethodMemberList = FamiliesServices.getInstance().getConceptMethodMemberMappingList(languages);
		ArrayList<ConceptMethodMembersGroupVO> conceptMethodMemberGroupList = FamiliesServices.getInstance().getConceptMethodMemberGroupList(conceptMethodMemberList, conceptComparisonOperator, methodComparisonOperator);
		
		boolean first = true;
		for (EPackage ePackage : ePackages) {
			double count = 0;
			for (ConceptMethodMembersGroupVO conceptMethodMembersGroupVO : conceptMethodMemberGroupList) {
				if(conceptMethodMembersGroupVO.getMemberGroup().size() >= 2 && conceptMethodMembersGroupVO.getMemberGroup().contains(ePackage.getName())){
					count++;
				}
			}
			double individualizationRatio = (count/countConstructs(ePackage))*100;
			
			if(!first)
				answer +=  ",";
			answer += individualizationRatio;
			first = false;
		}
		
		return answer;
	}
	
	private static double countConstructs(EPackage ePackage){
		double count = ePackage.getEClassifiers().size();
		
		for (EPackage eSubPackage : ePackage.getESubpackages()) {
			count += countConstructs(eSubPackage);
		}
		
		return count;
	}
	
	public static String getVariablesDeclaration(ArrayList<Language> languages, ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator) throws Exception{
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		
		String answer = "var barIndividualizationRatio = {\n";
		
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
		answer += "        data : [" + evaluateForSyntax(languages, conceptComparisonOperator) + "]\n";
		answer += "      },\n";
		answer += "      {\n";
		answer += "        fillColor : \"rgba(151,187,205,0.5)\",\n";
		answer += "        strokeColor : \"rgba(151,187,205,0.8)\",\n";
		answer += "        highlightFill : \"rgba(151,187,205,0.75)\",\n";
		answer += "        highlightStroke : \"rgba(151,187,205,1)\",\n";
		answer += "        data : [" + evaluateForSemantics(languages, conceptComparisonOperator, methodComparisonOperator) + "]\n"; 
		answer += "      }\n";
		answer += "    ]\n";
		answer += "};\n";
		
		return answer;
	}
	
	public static String getWindow(){
		String answer = "    var ctxIndividualizationRatio = document.getElementById(\"pie-individualization-ratio\").getContext(\"2d\");\n";
		answer += "    window.window.myBarIndividualizationRatio = new Chart(ctxIndividualizationRatio).Bar(barIndividualizationRatio, {\n";
		answer += "       responsive : false\n";
		answer += "    });\n\n";
		return answer;
	}
}

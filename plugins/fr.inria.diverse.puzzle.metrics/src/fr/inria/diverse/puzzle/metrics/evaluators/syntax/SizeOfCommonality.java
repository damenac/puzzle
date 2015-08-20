package fr.inria.diverse.puzzle.metrics.evaluators.syntax;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.k3.sle.common.vos.ConceptMemberVO;
import fr.inria.diverse.k3.sle.common.vos.ConceptMembersGroupVO;

public class SizeOfCommonality {

	public static int evaluateForSyntax(ArrayList<EPackage> ePackages){
		ArrayList<ConceptMemberVO> conceptMemberList = FamiliesServices.getInstance().getConceptMemberMappingList(ePackages);
		ArrayList<ConceptMembersGroupVO> conceptMemberGroupList = FamiliesServices.getInstance().getConceptMemberGroupList(conceptMemberList);
		
		int count = 0;
		for (ConceptMembersGroupVO conceptMembersGroupVO : conceptMemberGroupList) {
			if(conceptMembersGroupVO.getMemberGroup().size() == ePackages.size()){
				count++;
			}
		}
		
		return count;
	}
	
	public static int evaluateForSemantics(ArrayList<EPackage> ePackages){
		ArrayList<ConceptMemberVO> conceptMemberList = FamiliesServices.getInstance().getConceptMemberMappingList(ePackages);
		ArrayList<ConceptMembersGroupVO> conceptMemberGroupList = FamiliesServices.getInstance().getConceptMemberGroupList(conceptMemberList);
		
		int count = 0;
		for (ConceptMembersGroupVO conceptMembersGroupVO : conceptMemberGroupList) {
			if(conceptMembersGroupVO.getMemberGroup().size() == ePackages.size()){
				count++;
			}
		}
		
		return count;
	}
	
	public static String getVariablesDeclaration(ArrayList<EPackage> ePackages){
		String answer = "";
		answer += "var pieDataSyntacticCommonality = [{\n";
		answer += "        value: " + evaluateForSyntax(ePackages) + ",\n";
		answer += "        color:\"#FAAC58\",\n";
		answer += "        highlight: \"#F7BE81\",\n";
		answer += "        label: \"Commonalities\"\n";
		answer += "    },\n";
		answer += "    {\n";
		answer += "        value: " + TotalAmountOfConcepts.evaluateMetric(ePackages) + ",\n";
		answer += "        color:\"#F5F6CE\",\n";
		answer += "        highlight: \"#FBFBEF\",\n";
		answer += "        label: \"Particularities\"\n";
		answer += "    }\n";
		answer += "];\n\n";
		
		answer += "var pieDataSemanticCommonality = [{\n";
		answer += "        value: " + evaluateForSemantics(ePackages) + ",\n";
		answer += "        color:\"#FAAC58\",\n";
		answer += "        highlight: \"#F7BE81\",\n";
		answer += "        label: \"Commonalities\"\n";
		answer += "    },\n";
		answer += "    {\n";
		answer += "        value: " + TotalAmountOfConcepts.evaluateMetric(ePackages) + ",\n";
		answer += "        color:\"#F5F6CE\",\n";
		answer += "        highlight: \"#FBFBEF\",\n";
		answer += "        label: \"Particularities\"\n";
		answer += "    }\n";
		answer += "];\n\n";
		
		return answer;
	}
	
	public static String getWindow(){
		String answer = "    var ctxSyntacticCommonalities = document.getElementById(\"chart-syntactic-commonalities\").getContext(\"2d\");\n";
		answer += "    window.myPieSyntacticCommonalities = new Chart(ctxSyntacticCommonalities).Pie(pieDataSyntacticCommonality);\n\n";
		answer += "    var ctxSemanticCommonalities = document.getElementById(\"chart-semantic-commonalities\").getContext(\"2d\");\n";
		answer += "    window.myPieSemanticCommonalities = new Chart(ctxSemanticCommonalities).Pie(pieDataSemanticCommonality);\n\n";
		return answer;
	}
}

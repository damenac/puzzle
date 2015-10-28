package fr.inria.diverse.puzzle.metrics.specialCharts;

import java.util.ArrayList;
import java.util.Hashtable;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.commands.MethodComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.SignatureAndSourceMethodComparison;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMethodMember;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMethodMembers;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class SemanticSignatureAndBodyVennDiagram implements SpecialFamilySemanticChart {

	// ------------------------------------------------------
	// Methods
	// ------------------------------------------------------
	
	@Override
	public String getVariablesDeclaration(ArrayList<Language> languages, ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator){
		methodComparisonOperator = SignatureAndSourceMethodComparison.getInstance();
		Hashtable<String, Integer> membersSizeTable = new Hashtable<String, Integer>();
		ArrayList<TupleConceptMethodMember> conceptMethodMemberList = FamiliesServices.getInstance().getConceptMethodMemberMappingList(languages);
		ArrayList<TupleConceptMethodMembers> conceptMethodMemberGroupList = FamiliesServices.getInstance().getConceptMethodMemberGroupList(conceptMethodMemberList, conceptComparisonOperator, methodComparisonOperator);
		
		for (TupleConceptMethodMember conceptMethodMemberVO : conceptMethodMemberList) {
			if(membersSizeTable.get(conceptMethodMemberVO.getMemberName()) == null)
				membersSizeTable.put(conceptMethodMemberVO.getMemberName(), 1);
			else{
				Integer currentValue = membersSizeTable.get(conceptMethodMemberVO.getMemberName());
				membersSizeTable.put(conceptMethodMemberVO.getMemberName(), currentValue + 1);
			}
		}
		
		String answer = "var semanticSignatureAndBodyVennData = [";
		for (int i = 0; i < languages.size(); i++) {
			Language currentLanguage =  languages.get(i);
			answer += "{sets : [" + i + "], label : '" + currentLanguage.getName() + "', size : " + membersSizeTable.get(currentLanguage.getName()) + ",}";
			answer += ",\n              ";
		}
		
		boolean first = true;
		for (int i = 0; i < languages.size(); i++) {
			Language languageI = languages.get(i);
			for (int j = i + 1; j < languages.size(); j++) {
				Language languageJ = languages.get(j);
				if(!first) answer += ",\n              ";
				answer += "{sets : [" + i + "," + j + "], size:" + getIntersection(conceptMethodMemberGroupList, languageI, languageJ, methodComparisonOperator).size() + "}";
				first = false;
			}
		}
		
		answer += "];";
		
		return answer;
	}
	
	// ------------------------------------------------------
	// Auxiliary Methods
	// ------------------------------------------------------
	
	private static ArrayList<String> getIntersection(
			ArrayList<TupleConceptMethodMembers> conceptMethodMemberGroupList, Language languageI, Language languageJ,
			MethodComparison methodComparisonOperator) {

		String languageIName = languageI.getName();
		String languageJName = languageJ.getName();
		ArrayList<String> answer = new ArrayList<String>();
		for (TupleConceptMethodMembers conceptMethodMembersGroupVO : conceptMethodMemberGroupList) {
			boolean isInI = conceptMethodMembersGroupVO.getMembers().contains(languageIName);
			boolean isInJ = conceptMethodMembersGroupVO.getMembers().contains(languageJName);
			if(isInI && isInJ)
				answer.add(conceptMethodMembersGroupVO.getConcept().getSimpleName() + "." + conceptMethodMembersGroupVO.getMethod().getSimpleName());
		}
		return answer;
	}
}

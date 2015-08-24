package fr.inria.diverse.puzzle.metrics.evaluators.syntax;

import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.comparisonOperators.ConceptComparison;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.k3.sle.common.utils.MelangeServices;
import fr.inria.diverse.k3.sle.common.vos.ConceptMemberVO;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class SyntactOverlapping {

	public static String evaluate(ArrayList<Language> languages, ConceptComparison comparisonOperator){
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		Hashtable<String, Integer> membersSizeTable = new Hashtable<String, Integer>();
		ArrayList<ConceptMemberVO> conceptMemberList = FamiliesServices.getInstance().getConceptMemberMappingList(ePackages);
	
		for (ConceptMemberVO conceptMemberVO : conceptMemberList) {
			if(membersSizeTable.get(conceptMemberVO.getMemberName()) == null)
				membersSizeTable.put(conceptMemberVO.getMemberName(), 1);
			else{
				Integer currentValue = membersSizeTable.get(conceptMemberVO.getMemberName());
				membersSizeTable.put(conceptMemberVO.getMemberName(), currentValue + 1);
			}
		}
		
		String answer = "var syntacticVennData = [";
		for (int i = 0; i < ePackages.size(); i++) {
			EPackage currentEPackage = ePackages.get(i);
			answer += "{sets : [" + i + "], label : '" + currentEPackage.getName() + "', size : " + membersSizeTable.get(currentEPackage.getName()) + ",}";
			answer += ",\n              ";
		}
		
		boolean first = true;
		for (int i = 0; i < ePackages.size(); i++) {
			EPackage ePackageI = ePackages.get(i);
			for (int j = i + 1; j < ePackages.size(); j++) {
				EPackage ePackageJ = ePackages.get(j);
				if(!first) answer += ",\n              ";
				answer += "{sets : [" + i + "," + j + "], size:" + FamiliesServices.getIntersection(ePackageI, ePackageJ, comparisonOperator).size() + "}";
				first = false;
			}
		}
		
		answer += "];";
		
		return answer;
	}
}

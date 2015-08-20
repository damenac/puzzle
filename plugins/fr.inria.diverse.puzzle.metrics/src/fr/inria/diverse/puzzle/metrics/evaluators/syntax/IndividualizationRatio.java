package fr.inria.diverse.puzzle.metrics.evaluators.syntax;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.k3.sle.common.vos.ConceptMemberVO;
import fr.inria.diverse.k3.sle.common.vos.ConceptMembersGroupVO;

public class IndividualizationRatio {

	public static String evaluate(ArrayList<EPackage> ePackages){
		String answer = "";
		ArrayList<ConceptMemberVO> conceptMemberList = FamiliesServices.getInstance().getConceptMemberMappingList(ePackages);
		ArrayList<ConceptMembersGroupVO> conceptMemberGroupList = FamiliesServices.getInstance().getConceptMemberGroupList(conceptMemberList);
		
		for (EPackage ePackage : ePackages) {
			double count = 0;
			for (ConceptMembersGroupVO conceptMembersGroupVO : conceptMemberGroupList) {
				if(conceptMembersGroupVO.getMemberGroup().size() >= 2 && conceptMembersGroupVO.getMemberGroup().contains(ePackage.getName())){
					count++;
				}
			}
			double individualizationRatio = count/countConstructs(ePackage);
			answer += ePackage.getName() + ": " + individualizationRatio + "\n";
			
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
}

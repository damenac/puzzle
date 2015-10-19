package fr.inria.diverse.puzzle.metrics.specialCharts;

import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMember;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.k3.sle.common.utils.MelangeServices;
import fr.inria.diverse.melange.metamodel.melange.Language;

/**
 * Prints the Venn diagram representing the syntactic core of the family of DSLs
 * @author David Mendez-Acuna
 *
 */
public class SyntacticVennDiagram implements SpecialFamilySyntacticChart {

	// ------------------------------------------------------
	// Methods
	// ------------------------------------------------------
	
	@Override
	public String getVariablesDeclaration(ArrayList<Language> languages, ConceptComparison comparisonOperator){
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		Hashtable<String, Integer> membersSizeTable = new Hashtable<String, Integer>();
		ArrayList<TupleConceptMember> conceptMemberList = FamiliesServices.getInstance().getConceptMemberMappingList(languages);
	
		for (TupleConceptMember conceptMemberVO : conceptMemberList) {
			if(membersSizeTable.get(conceptMemberVO.getMemberName()) == null)
				membersSizeTable.put(conceptMemberVO.getMemberName(), 1);
			else{
				Integer currentValue = membersSizeTable.get(conceptMemberVO.getMemberName());
				membersSizeTable.put(conceptMemberVO.getMemberName(), currentValue + 1);
			}
		}
		
		String answer = "var syntacticVennData = [";
		for (int i = 0; i < languages.size(); i++) {
			Language currentLanguage = languages.get(i);
			answer += "{sets : [" + i + "], label : '" + currentLanguage.getName() + "', size : " + membersSizeTable.get(currentLanguage.getName()) + ",}";
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
	
	public int[][] getCommonalitiesMatrix(ArrayList<Language> languages, ConceptComparison comparisonOperator){
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
	
		int[][] matrix = new int[ePackages.size()][ePackages.size()];
		
		for (int i = 0; i < ePackages.size(); i++) {
			EPackage ePackageI = ePackages.get(i);
			for (int j = 0; j < ePackages.size(); j++) {
				if(i!=j){
					EPackage ePackageJ = ePackages.get(j);
					matrix[i][j] = FamiliesServices.getIntersection(ePackageI, ePackageJ, comparisonOperator).size();
				}
			}
		}
		return matrix;
	}
	
	public Hashtable<Integer, Integer> computeConstructsCommonality(int[][] commonalitiesMatrix){
		Hashtable<Integer, Integer> answer = new Hashtable<Integer, Integer>();
		for (int i = 0; i < commonalitiesMatrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < commonalitiesMatrix[0].length; j++) {
				if(i!=j)
					sum += commonalitiesMatrix[i][j];
			}
			answer.put(new Integer(i), new Integer(sum));
		}
		return answer;
	}
	
	public Hashtable<Integer, Integer> computeLanguagesCommonality(int[][] commonalitiesMatrix){
		Hashtable<Integer, Integer> answer = new Hashtable<Integer, Integer>();
		for (int i = 0; i < commonalitiesMatrix.length; i++) {
			int count = 0;
			for (int j = 0; j < commonalitiesMatrix[0].length; j++) {
				if(i != j && commonalitiesMatrix[i][j] > 0)
					count++;
			}
			answer.put(new Integer(i), new Integer(count));
		}
		return answer;
	}
}
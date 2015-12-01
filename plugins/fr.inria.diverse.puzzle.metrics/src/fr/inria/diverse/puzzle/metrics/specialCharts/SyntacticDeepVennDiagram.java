package fr.inria.diverse.puzzle.metrics.specialCharts;

import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.DeepConceptComparison;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMember;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.k3.sle.common.utils.MelangeServices;
import fr.inria.diverse.melange.metamodel.melange.Language;

/**
 * Prints the Venn diagram representing the syntactic core of the family of DSLs
 * @author David Mendez-Acuna
 *
 */
public class SyntacticDeepVennDiagram implements SpecialFamilySyntacticChart {

	// ------------------------------------------------------
	// Methods
	// ------------------------------------------------------
	
	@Override
	public String getVariablesDeclaration(ArrayList<Language> languages, ConceptComparison comparisonOperator){
		comparisonOperator = new DeepConceptComparison();
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
		
		ArrayList<IndexPackage> indexes = new ArrayList<IndexPackage>();
		String answer = "var syntacticDeepVennData = [";
		for (int i = 0; i < languages.size(); i++) {
			Language currentLanguage = languages.get(i);
			answer += "{sets : [" + i + "], label : '" + currentLanguage.getName() + "', size : " + membersSizeTable.get(currentLanguage.getName()) + ",}";
			answer += ",\n              ";
			indexes.add(new IndexPackage(i, currentLanguage));
		}
		
		boolean first = true;
		ArrayList<ArrayList<Language>> pairs = this.intersectionPairs(languages);
		for (ArrayList<Language> pair : pairs) {
			int commonalitySize = 0;
			try {
				commonalitySize = FamiliesServices.getIntersection(pair, comparisonOperator).size();
				System.out.println("intersection: " + pair + " -> " + FamiliesServices.getIntersection(pair, comparisonOperator));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if(!first) answer += ",\n              ";
			answer += "{sets : [";
			for (Language language : pair) {
				answer += IndexPackage.getIndexByEPackage(indexes, language) + ",";
			}
			answer = answer.substring(0, answer.length() - 1);
			answer += "], size:" + commonalitySize + "}";
			first = false;
		}
		answer += "\n];";
		
		return answer;
	}
	
	public ArrayList<ArrayList<Language>> intersectionPairs(ArrayList<Language> languages){
		ArrayList<ArrayList<Language>> pairs = new ArrayList<ArrayList<Language>>();
		int i = 1;
		for (Language langauge : languages) {
			ArrayList<Language> temp = new ArrayList<Language>();
			temp.add(langauge);
			this.intersectionPairsRecursive(pairs, languages, temp, i);
			i++;
		}
		return pairs;
	}
	
	public void intersectionPairsRecursive(ArrayList<ArrayList<Language>> combinatory, 
			ArrayList<Language> languages, ArrayList<Language> temp, int index){
		
		// caso base: agregue temp + los que faltan
		int i = index;
		while(i < languages.size()){
			if(!temp.contains(languages.get(i))){
				ArrayList<Language> newGroup = new ArrayList<Language>();
				newGroup.addAll(temp);
				newGroup.add(languages.get(i));
				combinatory.add(newGroup);
				
				// caso recursivo: por cada nuevo grupo, haga la recursion. 
				this.intersectionPairsRecursive(combinatory, languages, newGroup, i + 1);
			}
			i++;
		}
	}
	
	public int[][] getCommonalitiesMatrix(ArrayList<Language> languages, ConceptComparison comparisonOperator){
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
	
		int[][] matrix = new int[ePackages.size()][ePackages.size()];
		
		for (int i = 0; i < ePackages.size(); i++) {
			EPackage ePackageI = ePackages.get(i);
			for (int j = 0; j < ePackages.size(); j++) {
				if(i!=j){
					EPackage ePackageJ = ePackages.get(j);
					ArrayList<String> inter = FamiliesServices.getIntersection(ePackageI, ePackageJ, comparisonOperator);
					matrix[i][j] = inter.size();
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
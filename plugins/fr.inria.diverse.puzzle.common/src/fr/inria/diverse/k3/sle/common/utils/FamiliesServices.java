package fr.inria.diverse.k3.sle.common.utils;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.common.types.JvmOperation;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.commands.MethodComparison;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMember;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMembers;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMethodMember;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMethodMembers;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMethodsMembers;
import fr.inria.diverse.k3.sle.common.tuples.TupleMembersConcepts;
import fr.inria.diverse.k3.sle.common.tuples.TupleMethodMembers;
import fr.inria.diverse.k3.sle.common.tuples.TupleModuleConceptsMembers;
import fr.inria.diverse.melange.metamodel.melange.Aspect;
import fr.inria.diverse.melange.metamodel.melange.Language;

/**
 * Services for manipulating families of domain-specific languages
 * @author David Mendez-Acuna
 * 
 * TODO We need to use the name of the language as member name instead of the root package name.
 * TODO We need to use the meta-class in the annotation to identify the construct of a method instead of just removing the Aspect segment
 */
public class FamiliesServices {
	
	// -----------------------------------------------
	// Attributes
	// -----------------------------------------------
	
	private static FamiliesServices instance;
	
	// -----------------------------------------------
	// Constructor and singleton
	// -----------------------------------------------
	
	private FamiliesServices(){}

	public static FamiliesServices getInstance(){
		if(instance == null){
			instance = new FamiliesServices();
		}
		return instance;
	}
	
	// -----------------------------------------------
	// Methods
	// -----------------------------------------------
	
	/**
	 * Returns a list with the mapping between the concept and the language it belongs to. 
	 * @param ePackages. List of ePackages 
	 * @return
	 */
	public ArrayList<TupleConceptMember> getConceptMemberMappingList(ArrayList<EPackage> ePackages){
		ArrayList<TupleConceptMember> conceptMemberList = new ArrayList<TupleConceptMember>();
		for (EPackage ePackage : ePackages) {
			this.fillConceptMemberList(conceptMemberList, ePackage, ePackage.getName());
		}
		return conceptMemberList;
	}
	
	/**
	 * Fills the list in the parameter with the mapping between the concept and the language it belongs to. 
	 */
	private void fillConceptMemberList(ArrayList<TupleConceptMember> conceptMemberList, EPackage ePackage, String memberName) {
		for (EClassifier concept : ePackage.getEClassifiers()) {
			TupleConceptMember conceptMember = new TupleConceptMember(concept, memberName);
			conceptMemberList.add(conceptMember);
		}
		for (EPackage subPackage : ePackage.getESubpackages()) {
			this.fillConceptMemberList(conceptMemberList, subPackage, memberName);
		}
	}
	
	/**
	 * Returns a list with the mapping between the method and the language it belongs to.
	 * @param languages. List of languages 
	 * @return
	 */
	public ArrayList<TupleConceptMethodMember> getConceptMethodMemberMappingList(ArrayList<Language> languages){
		ArrayList<TupleConceptMethodMember> conceptMethodMemberList = new ArrayList<TupleConceptMethodMember>();
		for (Language language : languages) {
			EPackage ePackage = MelangeServices.getEPackageFromLanguage(language);
			this.fillConceptMethodMemberList(conceptMethodMemberList, language, ePackage.getName());
		}
		return conceptMethodMemberList;
	}
	
	/**
	 * Fills the list in the parameter with the mapping between the concept, the method, and the language they belong to. 
	 */
	private void fillConceptMethodMemberList(
			ArrayList<TupleConceptMethodMember> conceptMethodMemberList, Language language, String memberName) {
		for (Aspect aspect : language.getSemantics()) {
			for (EObject aspectContent : aspect.getAspectTypeRef().getType().eContents()) {
				if(aspectContent instanceof JvmOperation){
					JvmOperation aspectOperation = (JvmOperation) aspectContent;
					// We remove this 'super' and 'privk3' methods because they are generated by k3.
					if(!aspectOperation.getSimpleName().contains("super_") &&
							!aspectOperation.getSimpleName().contains("_privk3_")){
						TupleConceptMethodMember conceptMethodMember = new TupleConceptMethodMember(aspectOperation.getDeclaringType(), aspectOperation, memberName);
						conceptMethodMemberList.add(conceptMethodMember);
					}
				}
			}
		}
	}

	/**
	 * Returns a list where each concept is related to the set of family members it belongs to. 
	 * @param conceptMemberList
	 * @return
	 * @throws Exception 
	 */
	public ArrayList<TupleConceptMembers> getConceptMemberGroupList(ArrayList<TupleConceptMember> conceptMemberList, ConceptComparison comparisonOperator) throws Exception{
		ArrayList<TupleConceptMembers> conceptMemberGroupList = new ArrayList<TupleConceptMembers>();
		for (TupleConceptMember conceptMemberVO : conceptMemberList) {
			TupleConceptMembers conceptMemberGroupLegacy = getConceptMemberGroup(conceptMemberGroupList, conceptMemberVO, comparisonOperator);
			if(conceptMemberGroupLegacy == null){
				TupleConceptMembers conceptMemberGroupVO = new TupleConceptMembers(conceptMemberVO.getConcept());
				conceptMemberGroupVO.getMembers().add(conceptMemberVO.getMemberName());
				conceptMemberGroupList.add(conceptMemberGroupVO);
			}else{
				conceptMemberGroupLegacy.getMembers().add(conceptMemberVO.getMemberName());
			}
		}
		
		return conceptMemberGroupList;
	}
	
	/**
	 * Returns the group at which one concept belongs to.
	 * @param conceptMemberGroupList
	 * @param conceptMemberVO
	 * @return
	 * @throws IllegalAccessException 
	 * @throws Exception 
	 */
	private TupleConceptMembers getConceptMemberGroup(ArrayList<TupleConceptMembers> conceptMemberGroupList,
			TupleConceptMember conceptMemberVO, ConceptComparison comparisonOperator) throws Exception {
		for (TupleConceptMembers conceptMembersGroupVO : conceptMemberGroupList) {
			// *.*
			// Here we have the equals operator!!!!!!
			if(comparisonOperator.equals(conceptMembersGroupVO.getConcept(), conceptMemberVO.getConcept())){
				return conceptMembersGroupVO;
			}
		}
		return null;
	}
	
	/**
	 * Returns a list where each method is related to the set of family members it belongs to. 
	 * @param comparisonOperator 
	 * @param conceptMemberList
	 * @return
	 */
	public ArrayList<TupleConceptMethodMembers> getConceptMethodMemberGroupList(ArrayList<TupleConceptMethodMember> conceptMethodMemberList, ConceptComparison conceptComparisonOperator,
			MethodComparison methodComparisonOperator){
		ArrayList<TupleConceptMethodMembers> conceptMemberGroupList = new ArrayList<TupleConceptMethodMembers>();
		for (TupleConceptMethodMember conceptMethodMembersVO : conceptMethodMemberList) {
			TupleConceptMethodMembers conceptMethodMemberGroupLegacy = getConceptMethodMemberGroup(conceptMemberGroupList, conceptMethodMembersVO, conceptComparisonOperator, methodComparisonOperator);
			
			if(conceptMethodMemberGroupLegacy == null){
				TupleConceptMethodMembers newConceptMethodMembersGroup = new TupleConceptMethodMembers(conceptMethodMembersVO.getConcept(), conceptMethodMembersVO.getMethod());
				newConceptMethodMembersGroup.getMembers().add(conceptMethodMembersVO.getMemberName());
				conceptMemberGroupList.add(newConceptMethodMembersGroup);
			}else{
				if(!conceptMethodMemberGroupLegacy.getMembers().contains(conceptMethodMembersVO.getMemberName()))
					conceptMethodMemberGroupLegacy.getMembers().add(conceptMethodMembersVO.getMemberName());
			}
		}
		return conceptMemberGroupList;
	}
	
	private TupleConceptMethodMembers getConceptMethodMemberGroup(ArrayList<TupleConceptMethodMembers> conceptMemberGroupList,
			TupleConceptMethodMember conceptMethodMembersVO, ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator) {
		for (TupleConceptMethodMembers currentConceptMethodMembersGroupVO : conceptMemberGroupList) {
			// *.*
			// Here we have the equals operator!!!!!!
			//TODO FIX THIS
			boolean conceptsAreTheSame = currentConceptMethodMembersGroupVO.getConcept().getSimpleName().equals(conceptMethodMembersVO.getConcept().getSimpleName());
			boolean methodsAreTheSame = methodComparisonOperator.equal(currentConceptMethodMembersGroupVO.getMethod(), conceptMethodMembersVO.getMethod());
			if(conceptsAreTheSame && methodsAreTheSame)
				return currentConceptMethodMembersGroupVO;
		}
		return null;
	}

	public ArrayList<TupleConceptMethodsMembers> getConceptMethodsMembersGroupTupleList(ArrayList<TupleConceptMethodMembers> conceptMethodMemberGroupList,
			ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator){
		ArrayList<TupleConceptMethodsMembers> answer = new ArrayList<TupleConceptMethodsMembers>();

		for (TupleConceptMethodMembers conceptMethodMembersGroupVO : conceptMethodMemberGroupList) {
			TupleConceptMethodsMembers conceptMethodsMemberGroupLegacy = getConceptMethodsMemberTuple(conceptMethodMembersGroupVO, answer, conceptComparisonOperator, methodComparisonOperator);
			if(conceptMethodsMemberGroupLegacy == null){
				TupleMethodMembers methodMembers = new TupleMethodMembers(conceptMethodMembersGroupVO.getMethod());
				methodMembers.getMembers().addAll(conceptMethodMembersGroupVO.getMembers());
				TupleConceptMethodsMembers newConcept = new TupleConceptMethodsMembers(conceptMethodMembersGroupVO.getConcept());
				newConcept.getMethodsMembers().add(methodMembers);
				answer.add(newConcept);
			}else{
				TupleMethodMembers methodMembers = new TupleMethodMembers(conceptMethodMembersGroupVO.getMethod());
				methodMembers.getMembers().addAll(conceptMethodMembersGroupVO.getMembers());
				conceptMethodsMemberGroupLegacy.getMethodsMembers().add(methodMembers);
			}
		}
		return answer;
	}

	private TupleConceptMethodsMembers getConceptMethodsMemberTuple(
			TupleConceptMethodMembers conceptMethodMembersGroupVO,
			ArrayList<TupleConceptMethodsMembers> answer,
			ConceptComparison conceptComparisonOperator,
			MethodComparison methodComparisonOperator) {
		for (TupleConceptMethodsMembers conceptMethodsMembersGroupVO : answer) {
			if(conceptMethodsMembersGroupVO.getConcept().getSimpleName().equals(conceptMethodMembersGroupVO.getConcept().getSimpleName()))
				return conceptMethodsMembersGroupVO;
		}
		return null;
	}
	
	public ArrayList<TupleModuleConceptsMembers> obtainConceptsOwenerLanguagesList(ArrayList<EPackage> ePackages, ConceptComparison comparisonOperator) throws Exception{
		// Step 1: Scan the metamodels creating the concept-member list.
		ArrayList<TupleConceptMember> conceptMemberList = this.getConceptMemberMappingList(ePackages);
		
		// Step 2: For each concept, get the group of members it belongs.
		ArrayList<TupleConceptMembers> conceptMemberGroupList = this.getConceptMemberGroupList(conceptMemberList, comparisonOperator);
		
		ArrayList<TupleModuleConceptsMembers> moduleConceptsList = new ArrayList<TupleModuleConceptsMembers>();
		int i = 1;
		for (TupleConceptMembers conceptMembersGroupVO : conceptMemberGroupList) {
			TupleModuleConceptsMembers legacyModule = getLegacyFeature(moduleConceptsList, conceptMembersGroupVO);
			if(legacyModule == null){
				TupleModuleConceptsMembers newModule = new TupleModuleConceptsMembers("module" + i, conceptMembersGroupVO.getMembers().toString());
				newModule.getConcepts().add(conceptMembersGroupVO.getConcept());
				moduleConceptsList.add(newModule);
				i++;
			}else{
				legacyModule.getConcepts().add(conceptMembersGroupVO.getConcept());
			}
		}
		return moduleConceptsList;
	}
	
	
	
	private TupleModuleConceptsMembers getLegacyFeature(
			ArrayList<TupleModuleConceptsMembers> featureConceptsList,
			TupleConceptMembers conceptMembersGroupVO) {
		for (TupleModuleConceptsMembers featureConceptsVO : featureConceptsList) {
			if(featureConceptsVO.getMembers().equals(conceptMembersGroupVO.getMembers().toString()))
				return featureConceptsVO;
		}
		return null;
	}
	
	
	public ArrayList<TupleMembersConcepts> getMembersGroupVsConceptVOList(ArrayList<TupleConceptMembers> conceptMembersGroupList){
		ArrayList<TupleMembersConcepts> answer = new ArrayList<TupleMembersConcepts>();
		for (TupleConceptMembers conceptMembersGroupVO : conceptMembersGroupList) {
			TupleMembersConcepts pivot = new TupleMembersConcepts(conceptMembersGroupVO.getMembers());
			if(answer.indexOf(pivot) == -1){
				pivot.getConcepts().add(conceptMembersGroupVO.getConcept());
				answer.add(pivot);
			}
			else{
				TupleMembersConcepts legacy = answer.get(answer.indexOf(pivot));
				legacy.getConcepts().add(conceptMembersGroupVO.getConcept());
			}
		}
		return answer;
	}
	
	
	/**
	 * Returns the intersection between two EPackages by using the concepts comparison in the parameter. 
	 * @param left
	 * @param right
	 * @return
	 */
	public static ArrayList<String> getIntersection(EPackage left, EPackage right, ConceptComparison comparisonOperator){
		ArrayList<EClassifier> leftClassifiers = new ArrayList<EClassifier>();
		getClassifiersArray(left, leftClassifiers);
		
		ArrayList<EClassifier> rightClassifiers = new ArrayList<EClassifier>();
		getClassifiersArray(right, rightClassifiers);
		
		ArrayList<String> answer = new ArrayList<String>();
		
		for (EClassifier eClassifier : leftClassifiers) {
			if(EcoreQueries.searchEClassifierByComparisonOperator(right, eClassifier, comparisonOperator) != null && !answer.contains(eClassifier.getName()))
				answer.add(eClassifier.getName());
		}
		
		for (EClassifier eClassifier : rightClassifiers) {
			if(EcoreQueries.searchEClassifierByComparisonOperator(left, eClassifier, comparisonOperator) != null && !answer.contains(eClassifier.getName()))
				answer.add(eClassifier.getName());
				
		}
		
		return answer;
	}

	private static void getClassifiersArray(EPackage ePackage, ArrayList<EClassifier> classifiersArray) {
		classifiersArray.addAll(ePackage.getEClassifiers());
		for (EPackage eSubPackage : ePackage.getESubpackages()) {
			getClassifiersArray(eSubPackage, classifiersArray);
		}
	}
	
	
	public static ArrayList<String> getUnion(EPackage left, EPackage right){
		ArrayList<EClassifier> leftClassifiers = new ArrayList<EClassifier>();
		getClassifiersArray(left, leftClassifiers);
		
		ArrayList<EClassifier> rightClassifiers = new ArrayList<EClassifier>();
		getClassifiersArray(right, rightClassifiers);
		
		ArrayList<String> answer = new ArrayList<String>();
		
		for (EClassifier eClassifier : leftClassifiers) {
			if(!answer.contains(eClassifier.getName()))
				answer.add(eClassifier.getName());
		}
		
		for (EClassifier eClassifier : rightClassifiers) {
			if(!answer.contains(eClassifier.getName()))
				answer.add(eClassifier.getName());
				
		}
		
		return answer;
	}
	
	/**
	 * Returns the intersection between the two languages in the parameter and according to the comparison operator. 
	 * @param left
	 * @param right
	 * @param comparisonOperator
	 * @return
	 */
	public static ArrayList<String> getIntersection(Language left, Language right, MethodComparison comparisonOperator) {
		ArrayList<JvmOperation> leftOperations = new ArrayList<JvmOperation>();
		ArrayList<JvmOperation> rightOperations = new ArrayList<JvmOperation>();
		ArrayList<String> answer = new ArrayList<String>();
		for (JvmOperation operation : leftOperations) {
			String operationId = operation.getDeclaringType().getSimpleName() + "." + operation.getSimpleName();
			if(XtendQueries.searchJvmOperationByComparisonOperator(right, operation, comparisonOperator) != null && !answer.contains(operationId))
				answer.add(operationId);
		}
		for (JvmOperation operation : rightOperations) {
			String operationId = operation.getDeclaringType().getSimpleName() + "." + operation.getSimpleName();
			if(XtendQueries.searchJvmOperationByComparisonOperator(left, operation, comparisonOperator) != null && !answer.contains(operationId))
				answer.add(operationId);
		}
		return answer;
	}
}
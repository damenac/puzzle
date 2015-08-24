package fr.inria.diverse.k3.sle.common.utils;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.common.types.JvmOperation;

import fr.inria.diverse.k3.sle.common.comparisonOperators.ConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.MethodComparison;
import fr.inria.diverse.k3.sle.common.vos.ConceptMemberVO;
import fr.inria.diverse.k3.sle.common.vos.ConceptMembersGroupVO;
import fr.inria.diverse.k3.sle.common.vos.ConceptMethodMemberVO;
import fr.inria.diverse.k3.sle.common.vos.ConceptMethodMembersGroupVO;
import fr.inria.diverse.k3.sle.common.vos.ConceptMethodsMembersGroupVO;
import fr.inria.diverse.k3.sle.common.vos.EcoreArc;
import fr.inria.diverse.k3.sle.common.vos.EcoreGraph;
import fr.inria.diverse.k3.sle.common.vos.EcoreNode;
import fr.inria.diverse.k3.sle.common.vos.MembersGroupVsConceptVO;
import fr.inria.diverse.k3.sle.common.vos.ModuleConceptsVO;
import fr.inria.diverse.melange.metamodel.melange.Aspect;
import fr.inria.diverse.melange.metamodel.melange.Language;

/**
 * Services for manipulating families of domain-specific languages
 * @author David Mendez-Acuna
 * 
 * TODO We need to use the name of the language as member name instead of the root package name.
 * TODO We need to use the meta-class in the annotation to identify the construct of a method insteaad of just removing the Aspect segment
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
	public ArrayList<ConceptMemberVO> getConceptMemberMappingList(ArrayList<EPackage> ePackages){
		ArrayList<ConceptMemberVO> conceptMemberList = new ArrayList<ConceptMemberVO>();
		for (EPackage ePackage : ePackages) {
			this.fillConceptMemberList(conceptMemberList, ePackage, ePackage.getName());
		}
		return conceptMemberList;
	}
	
	/**
	 * Fills the list in the parameter with the mapping between the concept and the language it belongs to. 
	 */
	private void fillConceptMemberList(ArrayList<ConceptMemberVO> conceptMemberList, EPackage ePackage, String memberName) {
		for (EClassifier concept : ePackage.getEClassifiers()) {
			ConceptMemberVO conceptMember = new ConceptMemberVO(concept, memberName);
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
	public ArrayList<ConceptMethodMemberVO> getConceptMethodMemberMappingList(ArrayList<Language> languages){
		ArrayList<ConceptMethodMemberVO> conceptMethodMemberList = new ArrayList<ConceptMethodMemberVO>();
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
			ArrayList<ConceptMethodMemberVO> conceptMethodMemberList, Language language, String memberName) {
		for (Aspect aspect : language.getSemantics()) {
			for (EObject aspectContent : aspect.getAspectTypeRef().getType().eContents()) {
				if(aspectContent instanceof JvmOperation){
					JvmOperation aspectOperation = (JvmOperation) aspectContent;
					
					// We remove this 'super' and 'privk3' methods because they are generated by k3.
					if(!aspectOperation.getSimpleName().contains("super_") &&
							!aspectOperation.getSimpleName().contains("_privk3_")){
						ConceptMethodMemberVO conceptMethodMember = new ConceptMethodMemberVO(aspectOperation.getDeclaringType(), aspectOperation, memberName);
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
	public ArrayList<ConceptMembersGroupVO> getConceptMemberGroupList(ArrayList<ConceptMemberVO> conceptMemberList, ConceptComparison comparisonOperator) throws Exception{
		ArrayList<ConceptMembersGroupVO> conceptMemberGroupList = new ArrayList<ConceptMembersGroupVO>();
		for (ConceptMemberVO conceptMemberVO : conceptMemberList) {
			ConceptMembersGroupVO conceptMemberGroupLegacy = getConceptMemberGroup(conceptMemberGroupList, conceptMemberVO, comparisonOperator);
			if(conceptMemberGroupLegacy == null){
				ConceptMembersGroupVO conceptMemberGroupVO = new ConceptMembersGroupVO(conceptMemberVO.getConcept());
				conceptMemberGroupVO.getMemberGroup().add(conceptMemberVO.getMemberName());
				conceptMemberGroupList.add(conceptMemberGroupVO);
			}else{
				conceptMemberGroupLegacy.getMemberGroup().add(conceptMemberVO.getMemberName());
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
	private ConceptMembersGroupVO getConceptMemberGroup(ArrayList<ConceptMembersGroupVO> conceptMemberGroupList,
			ConceptMemberVO conceptMemberVO, ConceptComparison comparisonOperator) throws Exception {
		for (ConceptMembersGroupVO conceptMembersGroupVO : conceptMemberGroupList) {
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
	public ArrayList<ConceptMethodMembersGroupVO> getConceptMethodMemberGroupList(ArrayList<ConceptMethodMemberVO> conceptMethodMemberList, ConceptComparison conceptComparisonOperator,
			MethodComparison methodComparisonOperator){
		ArrayList<ConceptMethodMembersGroupVO> conceptMemberGroupList = new ArrayList<ConceptMethodMembersGroupVO>();
		for (ConceptMethodMemberVO conceptMethodMembersVO : conceptMethodMemberList) {
			ConceptMethodMembersGroupVO conceptMethodMemberGroupLegacy = getConceptMethodMemberGroup(conceptMemberGroupList, conceptMethodMembersVO, conceptComparisonOperator, methodComparisonOperator);
			
			if(conceptMethodMemberGroupLegacy == null){
				ConceptMethodMembersGroupVO newConceptMethodMembersGroup = new ConceptMethodMembersGroupVO(conceptMethodMembersVO.getConcept(), conceptMethodMembersVO.getMethod());
				newConceptMethodMembersGroup.getMemberGroup().add(conceptMethodMembersVO.getMemberName());
				conceptMemberGroupList.add(newConceptMethodMembersGroup);
			}else{
				if(!conceptMethodMemberGroupLegacy.getMemberGroup().contains(conceptMethodMembersVO.getMemberName()))
					conceptMethodMemberGroupLegacy.getMemberGroup().add(conceptMethodMembersVO.getMemberName());
			}
		}
		return conceptMemberGroupList;
	}
	
	private ConceptMethodMembersGroupVO getConceptMethodMemberGroup(ArrayList<ConceptMethodMembersGroupVO> conceptMemberGroupList,
			ConceptMethodMemberVO conceptMethodMembersVO, ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator) {
		for (ConceptMethodMembersGroupVO currentConceptMethodMembersGroupVO : conceptMemberGroupList) {
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

	public ArrayList<ConceptMethodsMembersGroupVO> getConceptMethodsMembersGroupVOList(ArrayList<ConceptMethodMembersGroupVO> ConceptMethodMemberGroupList,
			ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator){
		ArrayList<ConceptMethodsMembersGroupVO> answer = new ArrayList<ConceptMethodsMembersGroupVO>();
		for (ConceptMethodMembersGroupVO conceptMethodMembersGroupVO : ConceptMethodMemberGroupList) {
			ConceptMethodsMembersGroupVO conceptMethodsMemberGroupLegacy = getConceptMethodsMemberGroup(conceptMethodMembersGroupVO, answer, conceptComparisonOperator, methodComparisonOperator);
			
			if(conceptMethodsMemberGroupLegacy == null){
				ConceptMethodsMembersGroupVO newConcept = new ConceptMethodsMembersGroupVO(conceptMethodMembersGroupVO.getConcept());
				newConcept.getMemberGroup().addAll(conceptMethodMembersGroupVO.getMemberGroup());
				newConcept.getMethods().add(conceptMethodMembersGroupVO.getMethod());
				answer.add(newConcept);
			}else{
				conceptMethodsMemberGroupLegacy.getMethods().add(conceptMethodMembersGroupVO.getMethod());
			}
		}
		return answer;
	}
	

	private ConceptMethodsMembersGroupVO getConceptMethodsMemberGroup(
			ConceptMethodMembersGroupVO conceptMethodMembersGroupVO,
			ArrayList<ConceptMethodsMembersGroupVO> answer,
			ConceptComparison conceptComparisonOperator,
			MethodComparison methodComparisonOperator) {
		for (ConceptMethodsMembersGroupVO conceptMethodsMembersGroupVO : answer) {
			if(conceptMethodsMembersGroupVO.getConcept().getSimpleName().equals(conceptMethodMembersGroupVO.getConcept().getSimpleName()))
				return conceptMethodsMembersGroupVO;
		}
		return null;
	}

	public ArrayList<ModuleConceptsVO> obtainConceptsOwenerLanguagesList(ArrayList<EPackage> ePackages, ConceptComparison comparisonOperator) throws Exception{
		// Step 1: Scan the metamodels creating the concept-member list.
		ArrayList<ConceptMemberVO> conceptMemberList = this.getConceptMemberMappingList(ePackages);
		
		// Step 2: For each concept, get the group of members it belongs.
		ArrayList<ConceptMembersGroupVO> conceptMemberGroupList = this.getConceptMemberGroupList(conceptMemberList, comparisonOperator);
		
		ArrayList<ModuleConceptsVO> moduleConceptsList = new ArrayList<ModuleConceptsVO>();
		int i = 1;
		for (ConceptMembersGroupVO conceptMembersGroupVO : conceptMemberGroupList) {
			ModuleConceptsVO legacyModule = getLegacyFeature(moduleConceptsList, conceptMembersGroupVO);
			if(legacyModule == null){
				ModuleConceptsVO newModule = new ModuleConceptsVO("module" + i, conceptMembersGroupVO.getMemberGroup().toString());
				newModule.getConcepts().add(conceptMembersGroupVO.getConcept());
				moduleConceptsList.add(newModule);
				i++;
			}else{
				legacyModule.getConcepts().add(conceptMembersGroupVO.getConcept());
			}
		}
		return moduleConceptsList;
	}
	
	
	
	private ModuleConceptsVO getLegacyFeature(
			ArrayList<ModuleConceptsVO> featureConceptsList,
			ConceptMembersGroupVO conceptMembersGroupVO) {
		for (ModuleConceptsVO featureConceptsVO : featureConceptsList) {
			if(featureConceptsVO.getMembers().equals(conceptMembersGroupVO.getMemberGroup().toString()))
				return featureConceptsVO;
		}
		return null;
	}
	
	
	public ArrayList<MembersGroupVsConceptVO> getMembersGroupVsConceptVOList(ArrayList<ConceptMembersGroupVO> conceptMembersGroupList){
		ArrayList<MembersGroupVsConceptVO> answer = new ArrayList<MembersGroupVsConceptVO>();
		for (ConceptMembersGroupVO conceptMembersGroupVO : conceptMembersGroupList) {
			String groupId = "[";
			boolean first = true;
			for (String member : conceptMembersGroupVO.getMemberGroup()) {
				if(!first) groupId += ", ";
				groupId += member;
				first = false;
			}
			groupId += "]";
			
			MembersGroupVsConceptVO pivot = new MembersGroupVsConceptVO(groupId);
			if(answer.indexOf(pivot) == -1){
				pivot.getConcepts().add(conceptMembersGroupVO.getConcept().getName());
				answer.add(pivot);
			}
			else{
				MembersGroupVsConceptVO legacy = answer.get(answer.indexOf(pivot));
				legacy.getConcepts().add(conceptMembersGroupVO.getConcept().getName());
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
	
	public EcoreGraph computeDependenciesGraph(ArrayList<ConceptMembersGroupVO> conceptMembersGroupList){
		EcoreGraph graph = new EcoreGraph();
		for (ConceptMembersGroupVO conceptMembersGroupVO : conceptMembersGroupList) {
			EClassifier currentClassifier = conceptMembersGroupVO.getConcept();
			EcoreNode node = new EcoreNode(currentClassifier);
			graph.getNodes().add(node);
		}
		
		// Adding one arc for each reference
		for (EcoreNode node : graph.getNodes()) {
			EClassifier currentClassifier = node.getClassifier();
			
			if(currentClassifier instanceof EClass){
				EClass currentEClass = (EClass) currentClassifier;
				for (EStructuralFeature structuralFeature : currentEClass.getEStructuralFeatures()) {
					if(structuralFeature instanceof EReference){
						EReference currentEReference = (EReference) structuralFeature;
						EcoreNode toNode = getNodeByName(graph, currentEReference.getEType().getName());
						if(toNode != null){
							EcoreArc arc = new EcoreArc(node, toNode);
							graph.getArcs().add(arc);
						}
					}
					
					if(structuralFeature instanceof EAttribute){
						EAttribute currentEAttribute = (EAttribute) structuralFeature;
						if(currentEAttribute.getEType() instanceof EEnum){
							EcoreNode toNode = getNodeByName(graph, currentEAttribute.getEType().getName());
							if(toNode != null){
								EcoreArc arc = new EcoreArc(node, toNode);
								graph.getArcs().add(arc);
							}
						}
					}
				}
			}
		}
		
		// Adding one arc for each inheritance
		for (EcoreNode node : graph.getNodes()) {
			EClassifier currentClassifier = node.getClassifier();
			
			if(currentClassifier instanceof EClass){
				EClass currentEClass = (EClass) currentClassifier;
				for (EClass superClass : currentEClass.getESuperTypes()) {
					EcoreNode toNode = getNodeByName(graph, superClass.getName());
					if(toNode != null){
						EcoreArc arc = new EcoreArc(node, toNode);
						graph.getArcs().add(arc);
					}
				}
			}
		}
		return graph;
	}
	
	private EcoreNode getNodeByName(EcoreGraph graph, String nodeName){
		for (EcoreNode node : graph.getNodes()) {
			if(node.getClassifier().getName().equals(nodeName))
				return node;
		} return null;
	}
}
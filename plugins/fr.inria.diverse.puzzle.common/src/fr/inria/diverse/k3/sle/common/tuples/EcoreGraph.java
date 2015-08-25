package fr.inria.diverse.k3.sle.common.tuples;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.inria.diverse.k3.sle.common.comparisonOperators.ConceptComparison;

public class EcoreGraph {

	// -----------------------------------------------
	// Attributes
	// -----------------------------------------------
	
	private ArrayList<EcoreNode> nodes;
	private ArrayList<EcoreArc> arcs;
	private ArrayList<ArrayList<EcoreNode>> groups;
	
	// -----------------------------------------------
	// Constructor
	// -----------------------------------------------
	
	/**
	 * Constructor by default. Returns an emtpy graph. 
	 */
	public EcoreGraph(){
		this.nodes = new ArrayList<EcoreNode>();
		this.arcs = new ArrayList<EcoreArc>();
		this.groups = new ArrayList<ArrayList<EcoreNode>>();
	}
	
	/**
	 * Constructor that builds a dependencies graph from a list of Concept-Members tuple
	 */
	public EcoreGraph(ArrayList<TupleMembersConcepts> membersConceptList, ConceptComparison conceptComparisonOperator){
		this.nodes = new ArrayList<EcoreNode>();
		this.arcs = new ArrayList<EcoreArc>();
		this.groups = new ArrayList<ArrayList<EcoreNode>>();
		this.computeDependenciesGraph(membersConceptList, conceptComparisonOperator);
	}
	
	// -----------------------------------------------
	// Getters
	// -----------------------------------------------

	public ArrayList<EcoreNode> getNodes() {
		return nodes;
	}

	public ArrayList<EcoreArc> getArcs() {
		return arcs;
	}
	
	public ArrayList<ArrayList<EcoreNode>> getGroups() {
		return groups;
	}
	
	// -----------------------------------------------
	// Methods
	// -----------------------------------------------

	/**
	 * Computes the dependencies graph from a list of tuples Concept-Members
	 * @param conceptMembersList
	 * @return
	 */
	public void computeDependenciesGraph(ArrayList<TupleMembersConcepts> membersConceptList, ConceptComparison conceptComparisonOperator){
		for (TupleMembersConcepts conceptMembersTuple : membersConceptList) {
			for (EClassifier currentClassifier : conceptMembersTuple.getConcepts()) {
				EcoreNode node = new EcoreNode(currentClassifier.getName() + ": " + conceptMembersTuple.getMembersString(), currentClassifier);
				this.getNodes().add(node);
			}
			
		}
		
		// Adding one arc for each reference
		for (EcoreNode node : this.getNodes()) {
			EClassifier currentClassifier = node.getClassifier();
			
			if(currentClassifier instanceof EClass){
				EClass currentEClass = (EClass) currentClassifier;
				for (EStructuralFeature structuralFeature : currentEClass.getEStructuralFeatures()) {
					if(structuralFeature instanceof EReference){
						EReference currentEReference = (EReference) structuralFeature;
						EcoreNode toNode = getNodeByConceptComparisonOperator(this, currentEReference.getEType(), conceptComparisonOperator);
						if(toNode != null){
							EcoreArc arc = new EcoreArc(node, toNode);
							this.getArcs().add(arc);
						}
					}
					
					if(structuralFeature instanceof EAttribute){
						EAttribute currentEAttribute = (EAttribute) structuralFeature;
						if(currentEAttribute.getEType() instanceof EEnum){
							EcoreNode toNode = getNodeByConceptComparisonOperator(this, currentEAttribute.getEType(), conceptComparisonOperator);
							if(toNode != null){
								EcoreArc arc = new EcoreArc(node, toNode);
								this.getArcs().add(arc);
							}
						}
					}
				}
			}
		}
		
		// Adding one arc for each inheritance
		for (EcoreNode node : this.getNodes()) {
			EClassifier currentClassifier = node.getClassifier();
			
			if(currentClassifier instanceof EClass){
				EClass currentEClass = (EClass) currentClassifier;
				for (EClass superClass : currentEClass.getESuperTypes()) {
					EcoreNode toNode = getNodeByConceptComparisonOperator(this, superClass, conceptComparisonOperator);
					if(toNode != null){
						EcoreArc arc = new EcoreArc(node, toNode);
						this.getArcs().add(arc);
					}
				}
			}
		}
	}
	
	private EcoreNode getNodeByConceptComparisonOperator(EcoreGraph graph,
			EClassifier eType, ConceptComparison conceptComparisonOperator) {
		for (EcoreNode node : graph.getNodes()) {
			if(conceptComparisonOperator.equals(node.getClassifier(),eType))
				return node;
		} return null;
	}

	/**
	 * Returns a node by its name in the graph in the paramter
	 * @param graph
	 * @param nodeName
	 * @return
	 */
	public EcoreNode getNodeByName(EcoreGraph graph, String nodeName){
		for (EcoreNode node : graph.getNodes()) {
			if(node.getClassifier().getName().equals(nodeName))
				return node;
		} return null;
	}
	
	/**
	 * Returns a node by its name in the graph in the paramter
	 * @param graph
	 * @param nodeName
	 * @return
	 */
	public EcoreNode getNodeByEClassifier(EcoreGraph graph, EClassifier eClassifier){
		for (EcoreNode node : graph.getNodes()) {
			if(node.getClassifier().equals(eClassifier))
				return node;
		} return null;
	}
	
	/**
	 * Returns a node by its string representation in the graph in the paramter
	 * @param graph
	 * @param nodeName
	 * @return
	 */
	public EcoreNode getNodeById(EcoreGraph graph, String id){
		for (EcoreNode node : graph.getNodes()) {
			if(node.getNodeId().equals(id))
				return node;
		} return null;
	}
	
	/**
	 * Groups the current graphs according to the membership of each of its nodes.
	 */
	public void groupGraphByFamilyMembership(ArrayList<TupleMembersConcepts> membersConceptList, ConceptComparison conceptComparisonOperator){
		
		for (TupleMembersConcepts membersGroupVsConceptVO : membersConceptList) {
			ArrayList<EcoreNode> currentGroup = new ArrayList<EcoreNode>();
			for (EClassifier currentConcept : membersGroupVsConceptVO.getConcepts()) {
				currentGroup.add(this.getNodeByConceptComparisonOperator(this, currentConcept, conceptComparisonOperator));
			}
			this.groups.add(currentGroup);
		}
	}
}
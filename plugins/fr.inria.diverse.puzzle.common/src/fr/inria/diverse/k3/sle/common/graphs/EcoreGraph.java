package fr.inria.diverse.k3.sle.common.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.tuples.TupleMembersConcepts;

public class EcoreGraph {

	// -----------------------------------------------
	// Attributes
	// -----------------------------------------------
	
	private ArrayList<EcoreVertex> vertex;
	private ArrayList<EcoreArc> arcs;
	private int tarjansIndex;
	private Stack<EcoreVertex> tarjansStack;
	private ArrayList<ArrayList<EcoreVertex>> groups;
	
	// -----------------------------------------------
	// Constructor
	// -----------------------------------------------
	
	/**
	 * Constructor by default. Returns an emtpy graph. 
	 */
	public EcoreGraph(){
		this.vertex = new ArrayList<EcoreVertex>();
		this.arcs = new ArrayList<EcoreArc>();
		this.groups = new ArrayList<ArrayList<EcoreVertex>>();
	}
	
	/**
	 * Constructor that builds a dependencies graph from a list of Concept-Members tuple
	 */
	public EcoreGraph(ArrayList<TupleMembersConcepts> membersConceptList, ConceptComparison conceptComparisonOperator){
		this.vertex = new ArrayList<EcoreVertex>();
		this.arcs = new ArrayList<EcoreArc>();
		this.groups = new ArrayList<ArrayList<EcoreVertex>>();
		this.computeDependenciesGraph(membersConceptList, conceptComparisonOperator);
	}
	
	// -----------------------------------------------
	// Getters
	// -----------------------------------------------

	public ArrayList<EcoreVertex> getVertex() {
		return vertex;
	}

	public ArrayList<EcoreArc> getArcs() {
		return arcs;
	}
	
	public ArrayList<ArrayList<EcoreVertex>> getGroups() {
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
				EcoreVertex node = new EcoreVertex(currentClassifier.getName() + ": " + conceptMembersTuple.getMembersString(), currentClassifier);
				this.getVertex().add(node);
			}
			
		}
		
		// Adding one arc for each reference
		for (EcoreVertex node : this.getVertex()) {
			EClassifier currentClassifier = node.getClassifier();
			
			if(currentClassifier instanceof EClass){
				EClass currentEClass = (EClass) currentClassifier;
				for (EStructuralFeature structuralFeature : currentEClass.getEStructuralFeatures()) {
					if(structuralFeature instanceof EReference){
						EReference currentEReference = (EReference) structuralFeature;
						EcoreVertex toNode = getNodeByConceptComparisonOperator(this, currentEReference.getEType(), conceptComparisonOperator);
						if(toNode != null){
							EcoreArc arc = new EcoreArc(node, toNode);
							this.getArcs().add(arc);
						}
					}
					
					if(structuralFeature instanceof EAttribute){
						EAttribute currentEAttribute = (EAttribute) structuralFeature;
						if(currentEAttribute.getEType() instanceof EEnum){
							EcoreVertex toNode = getNodeByConceptComparisonOperator(this, currentEAttribute.getEType(), conceptComparisonOperator);
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
		for (EcoreVertex node : this.getVertex()) {
			EClassifier currentClassifier = node.getClassifier();
			
			if(currentClassifier instanceof EClass){
				EClass currentEClass = (EClass) currentClassifier;
				for (EClass superClass : currentEClass.getESuperTypes()) {
					EcoreVertex toNode = getNodeByConceptComparisonOperator(this, superClass, conceptComparisonOperator);
					if(toNode != null){
						EcoreArc arc = new EcoreArc(node, toNode);
						this.getArcs().add(arc);
					}
				}
			}
		}
	}
	
	private EcoreVertex getNodeByConceptComparisonOperator(EcoreGraph graph,
			EClassifier eType, ConceptComparison conceptComparisonOperator) {
		for (EcoreVertex node : graph.getVertex()) {
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
	public EcoreVertex getNodeByName(EcoreGraph graph, String nodeName){
		for (EcoreVertex node : graph.getVertex()) {
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
	public EcoreVertex getNodeByEClassifier(EcoreGraph graph, EClassifier eClassifier){
		for (EcoreVertex node : graph.getVertex()) {
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
	public EcoreVertex getNodeById(EcoreGraph graph, String id){
		for (EcoreVertex currentVertex : graph.getVertex()) {
			if(currentVertex.getVertexId().equals(id))
				return currentVertex;
		} return null;
	}
	
	public void groupByDefault(
			ArrayList<TupleMembersConcepts> membersConceptList,
			ConceptComparison conceptComparisonOperator) {
		this.groups = new ArrayList<ArrayList<EcoreVertex>>();
		ArrayList<EcoreVertex> uniqueGroup = new ArrayList<EcoreVertex>();
		uniqueGroup.addAll(this.vertex);
		this.groups.add(uniqueGroup);
	}
	
	/**
	 * Groups the current graphs according to the membership of each of its nodes.
	 */
	public void groupGraphByFamilyMembership(ArrayList<TupleMembersConcepts> membersConceptList, ConceptComparison conceptComparisonOperator){
		this.groups = new ArrayList<ArrayList<EcoreVertex>>();
		for (TupleMembersConcepts membersGroupVsConceptVO : membersConceptList) {
			ArrayList<EcoreVertex> currentGroup = new ArrayList<EcoreVertex>();
			for (EClassifier currentConcept : membersGroupVsConceptVO.getConcepts()) {
				currentGroup.add(this.getNodeByConceptComparisonOperator(this, currentConcept, conceptComparisonOperator));
			}
			this.groups.add(currentGroup);
		}
	}
	
	/**
	 * 
	 */
	public void groupByTarjansAlgorithm(){
		this.tarjansIndex = 0;
		tarjansStack = new Stack<EcoreVertex>();
		this.groups = new ArrayList<ArrayList<EcoreVertex>>();
		for (EcoreVertex currentVertex : this.getVertex()) {
			if(currentVertex.getTarjansIndex() == -1){
				this.strongConnect(currentVertex);
			}
		}
	}

	private void strongConnect(EcoreVertex theVertex) {
		theVertex.setTarjansIndex(this.tarjansIndex);
		theVertex.setTarjansLowlink(this.tarjansIndex);
		this.tarjansIndex++;
		this.tarjansStack.push(theVertex);
		theVertex.setOnTarjansStack(true);
		
		for (EcoreVertex sucessor : this.getSucessors(theVertex)) {
			if(sucessor.getTarjansIndex() == -1){
				this.strongConnect(sucessor);
				theVertex.setTarjansLowlink(Math.min(theVertex.getTarjansLowlink(), sucessor.getTarjansLowlink()));
			}
			else if(sucessor.isOnTarjansStack()){
				theVertex.setTarjansLowlink(Math.min(theVertex.getTarjansLowlink(), sucessor.getTarjansLowlink()));
			}
		}
		
		if(theVertex.getTarjansLowlink() == theVertex.getTarjansIndex()){
			ArrayList<EcoreVertex> newGroup = new ArrayList<EcoreVertex>();
			EcoreVertex sucessor = null;
			do{
				sucessor = tarjansStack.pop();
				sucessor.setOnTarjansStack(false);
				newGroup.add(sucessor);
			} while(!theVertex.getVertexId().equals(sucessor.getVertexId()));
			this.groups.add(newGroup);
		}
	}

	private List<EcoreVertex> getSucessors(EcoreVertex theVertex) {
		List<EcoreVertex> sucessors = new ArrayList<EcoreVertex>();
		for (EcoreArc arc : this.arcs) {
			if(arc.getFrom().getVertexId().equals(theVertex.getVertexId()))
				sucessors.add(arc.getTo());
		}
		return sucessors;
	}
}
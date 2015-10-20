package fr.inria.diverse.k3.sle.common.graphsOperators;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClassifier;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.commands.GraphPartition;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGroup;
import fr.inria.diverse.k3.sle.common.graphs.EcoreVertex;
import fr.inria.diverse.k3.sle.common.tuples.TupleMembersConcepts;

public class MinimumAcyclicPartition implements GraphPartition {

	// -----------------------------------------------
	// Methods
	// -----------------------------------------------
	
	@Override
	public void graphPartition(EcoreGraph graph,
			ArrayList<TupleMembersConcepts> membersConceptList,
			ConceptComparison conceptComparisonOperator) {
		graph.setGroups(new ArrayList<EcoreGroup>());
		
		ArrayList<EcoreGroup> familyMembershipGroup = new ArrayList<EcoreGroup>();
		for (TupleMembersConcepts membersGroupVsConceptVO : membersConceptList) {
			EcoreGroup currentGroup = new EcoreGroup("");
			for (EClassifier currentConcept : membersGroupVsConceptVO.getConcepts()) {
				currentGroup.getVertex().add(graph.getNodeByConceptComparisonOperator(graph, currentConcept, conceptComparisonOperator));
			}
			familyMembershipGroup.add(currentGroup);
		}
		
		int granularityLevel = 1;
		if(granularityLevel>0){
			for (EcoreGroup membershipParition : familyMembershipGroup) {
				ArrayList<EcoreGroup> partitionedGroup = this.deepLevelPartition(granularityLevel, membershipParition, graph);
				graph.getGroups().addAll(partitionedGroup);
			}
		}else{
			graph.getGroups().addAll(familyMembershipGroup);
		}
		
		// Assigning the correct names to each ecore group. 
		for (EcoreGroup ecoreGroup : graph.getGroups()) {
			ecoreGroup.setName(EcoreGraph.getLanguageModuleName(ecoreGroup.getVertex()));
		}
	}

//	private ArrayList<EcoreGroup> deepPartition(
//			EcoreGroup membershipParition, EcoreGraph graph) {
//		ArrayList<EcoreGroup> newPartitionSet = 
//				this.recursivelyBifurcatePartition(membershipParition, graph);
//		
//		if(newPartitionSet.size() == 1){
//			return newPartitionSet;
//		}
//		else{
//			ArrayList<EcoreGroup> answer = new ArrayList<EcoreGroup>();
//			for (EcoreGroup partitionSet : newPartitionSet) {
//				ArrayList<EcoreGroup> subPartition = this.deepPartition(partitionSet, graph);
//				answer.addAll(subPartition);
//			}
//			return answer;
//		}
//	}
	
	private ArrayList<EcoreGroup> deepLevelPartition(int level,
			EcoreGroup membershipParition, EcoreGraph graph) {
		ArrayList<EcoreGroup> newPartitionSet = 
				this.recursivelyBifurcatePartition(membershipParition, graph);
		
		if(newPartitionSet.size() == 1 || level == 1){
			return newPartitionSet;
		}
		else{
			ArrayList<EcoreGroup> answer = new ArrayList<EcoreGroup>();
			for (EcoreGroup partitionSet : newPartitionSet) {
				ArrayList<EcoreGroup> subPartition = this.deepLevelPartition(level -1, partitionSet, graph);
				answer.addAll(subPartition);
			}
			return answer;
		}
	}

	/**
	 * 
	 * @param newPartitionSet
	 * @param membershipParition
	 * @param graph
	 */
	private ArrayList<EcoreGroup> recursivelyBifurcatePartition(EcoreGroup membershipParition, EcoreGraph graph) {
		ArrayList<EcoreGroup> newPartitionSet = new ArrayList<EcoreGroup>();
		ArrayList<EcoreVertex> A = new ArrayList<EcoreVertex>();
		ArrayList<EcoreVertex> B = new ArrayList<EcoreVertex>();
		int direction = -1;
		
		for (EcoreVertex ecoreVertex : membershipParition.getVertex()) {
			boolean attachedToA = false;
			boolean attachedToB = false;
			
			for (int i = 0; i < A.size(); i++) {
				EcoreVertex AEcoreVertex = A.get(i);
				if(graph.thereIsPath(ecoreVertex, AEcoreVertex) &&
						graph.thereIsPath(AEcoreVertex, ecoreVertex)){
					attachedToA = true;
					break;
				}
			}
			
			for (int i = 0; i < B.size(); i++) {
				EcoreVertex BEcoreVertex = B.get(i);
				if(graph.thereIsPath(ecoreVertex, BEcoreVertex) &&
						graph.thereIsPath(BEcoreVertex, ecoreVertex)){
					attachedToB = true;
					break;
				}
			}
			
			if(attachedToA){
				A.add(ecoreVertex);
			}
			else if(attachedToB){
				B.add(ecoreVertex);
			}
			else{
				boolean currentDependsOnA = false;
				boolean ADependsOnCurrent = false;
				for (EcoreVertex currentA : A) {
					if(graph.thereIsPath(ecoreVertex, currentA)){
						currentDependsOnA = true;
					}
					if(graph.thereIsPath(currentA, ecoreVertex)){
						ADependsOnCurrent = true;
					}
				}
			
				boolean currentDependsOnB = false;
				boolean BDependsOnCurrent = false;
				for (EcoreVertex currentB : B) {
					if(graph.thereIsPath(ecoreVertex, currentB)){
						currentDependsOnB = true;
					}
					if(graph.thereIsPath(currentB, ecoreVertex)){
						BDependsOnCurrent = true;
					}
				}
				
				// No hay direccion. Agreguelo al componente con mayor cantidad de nodos y establezca la decision
				if(direction == -1){
					if(A.size() <= B.size()){
						A.add(ecoreVertex);
						// A depends on B
						if(currentDependsOnB)
							direction = 0;
					}else{
						B.add(ecoreVertex);
						// B depends on A
						if(currentDependsOnA)
							direction = 1;
					}
				}
				// Cuando A depende de B
				else if(direction == 0){
					// Si current depende de A, entonces tiene que agregarse en A para evitar el doble ciclo.
					if(currentDependsOnA){
						A.add(ecoreVertex);
					}
					else if(BDependsOnCurrent){
						B.add(ecoreVertex);
					}
					// De lo contrario, no hay restriccion. Entonces agreguelo donde haya menos nodos. 
					else{
						if(A.size() <= B.size()){
							A.add(ecoreVertex);
						}else{
							B.add(ecoreVertex);
						}
					}
				}
				// Cuando B depende de A
				else if(direction == 1){
					// Si current depende de A, entonces tiene que agregarse en B para evitar el doble ciclo.
					if(currentDependsOnB){
						B.add(ecoreVertex);
					}
					else if(ADependsOnCurrent){
						A.add(ecoreVertex);
					}
					// De lo contrario, no hay restriccion. Entonces agreguelo donde haya menos nodos. 
					else{
						if(A.size() <= B.size()){
							A.add(ecoreVertex);
						}else{
							B.add(ecoreVertex);
						}
					}
				}
			}
		}
		
		if(A.size() != 0){
			EcoreGroup gA = new EcoreGroup("");
			gA.getVertex().addAll(A);
			newPartitionSet.add(gA);
		}
		
		if(B.size() != 0){
			EcoreGroup gB = new EcoreGroup("");
			gB.getVertex().addAll(B);
			newPartitionSet.add(gB);
		}
		
		return newPartitionSet;
	}
}

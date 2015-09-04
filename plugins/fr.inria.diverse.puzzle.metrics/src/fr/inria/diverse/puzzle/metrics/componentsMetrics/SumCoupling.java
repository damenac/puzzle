package fr.inria.diverse.puzzle.metrics.componentsMetrics;

import java.util.ArrayList;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.commands.GraphPartition;
import fr.inria.diverse.k3.sle.common.graphs.EcoreArc;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.graphs.EcoreVertex;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMember;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMembers;
import fr.inria.diverse.k3.sle.common.tuples.TupleMembersConcepts;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class SumCoupling {

	public int compute(ArrayList<Language> languages, ConceptComparison conceptComparisonOperator, GraphPartition graphPartition) throws Exception{
		int coupling = 0;
		ArrayList<TupleConceptMember> conceptMemberList = FamiliesServices.getInstance().getConceptMemberMappingList(languages);
		ArrayList<TupleConceptMembers> conceptMembersList = FamiliesServices.getInstance().getConceptMemberGroupList(conceptMemberList, conceptComparisonOperator);
		ArrayList<TupleMembersConcepts> membersConceptList = FamiliesServices.getInstance().getMembersGroupVsConceptVOList(conceptMembersList);
		EcoreGraph dependenciesGraph = new EcoreGraph(membersConceptList, conceptComparisonOperator);
		graphPartition.graphPartition(dependenciesGraph, membersConceptList, conceptComparisonOperator);
	
		for (int i = 0; i < dependenciesGraph.getGroups().size(); i++) {
			ArrayList<EcoreVertex> groupI = dependenciesGraph.getGroups().get(i);
			for (int j = i + 1; j < dependenciesGraph.getGroups().size(); j++) {
				if(i!=j){
					ArrayList<EcoreVertex> groupJ = dependenciesGraph.getGroups().get(j);
					int pairCoupling = getCouplingByGroupsPair(groupI, groupJ, dependenciesGraph.getArcs());
					coupling += pairCoupling;
				}
			}
		}
		return coupling;
	}
	
	public int getCouplingByGroupsPair(ArrayList<EcoreVertex> groupA, ArrayList<EcoreVertex> groupB, ArrayList<EcoreArc> arcs){
		int coupling = 0;
		for (EcoreArc ecoreArc : arcs) {
			if(this.belongsToGroup(ecoreArc.getFrom(), groupA) && this.belongsToGroup(ecoreArc.getTo(), groupB))
				coupling++;
			if(this.belongsToGroup(ecoreArc.getFrom(), groupB) && this.belongsToGroup(ecoreArc.getTo(), groupA))
				coupling++;
		}
		return coupling;
	}
	
	private boolean belongsToGroup(EcoreVertex vertex, ArrayList<EcoreVertex> group){
		for (EcoreVertex ecoreVertex : group) {
			if(vertex.getVertexId().equals(ecoreVertex.getVertexId()))
				return true;
		}
		return false;
	}
}

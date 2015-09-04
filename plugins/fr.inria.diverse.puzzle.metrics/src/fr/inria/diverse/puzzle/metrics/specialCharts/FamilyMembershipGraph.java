package fr.inria.diverse.puzzle.metrics.specialCharts;

import java.util.ArrayList;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.graphs.EcoreArc;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.graphs.EcoreVertex;
import fr.inria.diverse.k3.sle.common.graphsOperators.MembershipGraphPartition;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMember;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMembers;
import fr.inria.diverse.k3.sle.common.tuples.TupleMembersConcepts;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class FamilyMembershipGraph {

	public static String getVariablesDeclaration(ArrayList<Language> languages, ConceptComparison conceptComparisonOperator) throws Exception{
		String answer = "";
		ArrayList<TupleConceptMember> conceptMemberList = FamiliesServices.getInstance().getConceptMemberMappingList(languages);
		ArrayList<TupleConceptMembers> conceptMembersList = FamiliesServices.getInstance().getConceptMemberGroupList(conceptMemberList, conceptComparisonOperator);
		ArrayList<TupleMembersConcepts> membersConceptList = FamiliesServices.getInstance().getMembersGroupVsConceptVOList(conceptMembersList);
		EcoreGraph dependenciesGraph = new EcoreGraph(membersConceptList, conceptComparisonOperator);
		(new MembershipGraphPartition()).graphPartition(dependenciesGraph, membersConceptList, conceptComparisonOperator);
		
		answer += "var G = new jsnx.DiGraph();\n";
		int i = 0;
		for (ArrayList<EcoreVertex> group : dependenciesGraph.getGroups()) {
			String nodes = "";
			boolean first = true;
			for (EcoreVertex currentNode : group) {
				if(!first)
					nodes += ",";
				nodes += "\"" + currentNode.getVertexId() + "\"";
				first = false;
			}
			answer += "G.addNodesFrom([" + nodes + "], {group:" + i + "});\n";
			i++;
		}
		answer += "\n";
		if(dependenciesGraph.getArcs().size() > 0){
			answer += "G.addEdgesFrom([";
			
			boolean first = true;
			for (EcoreArc arc : dependenciesGraph.getArcs()) {
				if(!first) answer += ",";
				answer += "[\"" + arc.getFrom().getVertexId() + "\",\""+ arc.getTo().getVertexId() +"\"]";
				first = false;
			}
			answer += "]);\n";
		}
		return answer;
	}
}
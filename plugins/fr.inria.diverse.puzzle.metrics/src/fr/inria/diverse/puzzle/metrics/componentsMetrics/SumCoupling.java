package fr.inria.diverse.puzzle.metrics.componentsMetrics;

import java.util.ArrayList;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.graphs.EcoreArc;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.graphs.EcoreVertex;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class SumCoupling {

	public int compute(ArrayList<Language> languages, ConceptComparison conceptComparisonOperator, EcoreGraph modularizationGraph) throws Exception{
		int coupling = 0;

		for (int i = 0; i < modularizationGraph.getGroups().size(); i++) {
			ArrayList<EcoreVertex> groupI = modularizationGraph.getGroups().get(i).getVertex();
			for (int j = i + 1; j < modularizationGraph.getGroups().size(); j++) {
				if(i!=j){
					ArrayList<EcoreVertex> groupJ = modularizationGraph.getGroups().get(j).getVertex();
					int pairCoupling = getCouplingByGroupsPair(groupI, groupJ, modularizationGraph.getArcs());
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

package fr.inria.diverse.puzzle.breaker.breakers;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClassifier;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.commands.GraphPartition;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGroup;
import fr.inria.diverse.k3.sle.common.tuples.TupleMembersConcepts;

/**
 * Class implementing a graph partition that uses family membership as partition criteria. 
 * A module is generated by each parents configuration.
 * 
 * @author David Mendez-Acuna
 *
 */
public class MembershipGraphPartition implements GraphPartition {

	// -----------------------------------------------
	// Methods
	// -----------------------------------------------
	
	@Override
	public void graphPartition(EcoreGraph graph, ArrayList<TupleMembersConcepts> membersConceptList, ConceptComparison conceptComparisonOperator) {
		graph.setGroups(new ArrayList<EcoreGroup>());
		for (TupleMembersConcepts membersGroupVsConceptVO : membersConceptList) {
			EcoreGroup currentGroup = new EcoreGroup("");
			for (EClassifier currentConcept : membersGroupVsConceptVO.getConcepts()) {
				currentGroup.getVertex().add(graph.getNodeByConceptComparisonOperator(graph, currentConcept, conceptComparisonOperator));
			}
			currentGroup.setName(EcoreGraph.getLanguageModuleName(currentGroup.getVertex()));
			graph.getGroups().add(currentGroup);
		}
	}
}
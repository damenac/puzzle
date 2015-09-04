package fr.inria.diverse.k3.sle.common.commands;

import java.util.ArrayList;

/**
 * Contract for the graph partition command. 
 * @author David Mendez-Acuna
 */
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.tuples.TupleMembersConcepts;

public interface GraphPartition {

	public void graphPartition(EcoreGraph graph, ArrayList<TupleMembersConcepts> membersConceptList, ConceptComparison conceptComparisonOperator);
}

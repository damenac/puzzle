package fr.inria.diverse.puzzle.breaker.popup.actions;

import java.util.ArrayList;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.commands.GraphPartition;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.tuples.TupleMembersConcepts;
import fr.inria.diverse.puzzle.metrics.componentsMetrics.ModularizationQuality;

public class SimulatedAnnealingPartitioning implements GraphPartition {

	// -----------------------------------------------
	// Attributes
	// -----------------------------------------------
	/**
	 * Attribute that save the start time of the control execution
	 */
	private long startTime;
	
	/**
	 * Attribute that save the max time of the control execution
	 */
	private long stopTime;
	
	/**
	 * Attribute that is used to stop the execution of the control
	 */
	private boolean optimalAchieved;
	
	/**
	 * The Number of visited neighbors during the execution of the control
	 */
	private int numberOfVisitedNeighbors = 0;
		
	private ModularizationQuality gamma;
	
	// -----------------------------------------------
	// Constructor
	// -----------------------------------------------
	
	/**
	 * Constructor of the class
	 */
	public SimulatedAnnealingPartitioning() {

	}

	// -----------------------------------------------
	// Methods
	// -----------------------------------------------

	@Override
	public void graphPartition(EcoreGraph graph,
			ArrayList<TupleMembersConcepts> membersConceptList,
			ConceptComparison conceptComparisonOperator) {
		
		gamma = new ModularizationQuality();
		MinimumAcyclicPartition decoder = new MinimumAcyclicPartition();
		
		// Compute an initial solution
		decoder.graphPartition(graph, membersConceptList, conceptComparisonOperator);
		double initialGama = gamma.compute(graph);
		double temperature = 10;
		
		
	}
	
	public void simulatedAnnealing (EcoreGraph graph, double temperature) throws Exception{

		EcoreGraph X = graph;
		double XCMax = gamma.compute(X);
		
		// Initializes the best solution (XBest) as the first one (X)
		EcoreGraph XBest = X.cloneGraph();
	}
		
		
}

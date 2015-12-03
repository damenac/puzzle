package fr.inria.diverse.puzzle.breaker.breakers;

//import java.util.ArrayList;
//
//import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
//import fr.inria.diverse.k3.sle.common.commands.GraphPartition;
//import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
//import fr.inria.diverse.k3.sle.common.graphs.EcoreVertex;
//import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMember;
//import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMembers;
//import fr.inria.diverse.k3.sle.common.tuples.TupleMembersConcepts;
//import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
//import fr.inria.diverse.k3.sle.common.utils.RandomNumber;
//import fr.inria.diverse.k3.sle.common.vos.PairVO;
//import fr.inria.diverse.puzzle.metrics.componentsMetrics.ModularizationQuality;

public class SimulatedAnnealingPartitioning /*implements GraphPartition */{

//	// -----------------------------------------------
//	// Attributes
//	// -----------------------------------------------
//	/**
//	 * Attribute that save the start time of the control execution
//	 */
//	private long startTime;
//	
//	/**
//	 * Attribute that save the max time of the control execution
//	 */
//	private long stopTime;
//	
//	/**
//	 * Attribute that is used to stop the execution of the control
//	 */
//	private boolean optimalAchieved;
//	
//	/**
//	 * The Number of visited neighbors during the execution of the control
//	 */
//	private int numberOfVisitedNeighbors = 0;
//		
//	private ModularizationQuality gamma;
//	
//	// -----------------------------------------------
//	// Constructor
//	// -----------------------------------------------
//	
//	/**
//	 * Constructor of the class
//	 */
//	public SimulatedAnnealingPartitioning() {
//
//	}
//
//	// -----------------------------------------------
//	// Methods
//	// -----------------------------------------------
//
//	@Override
//	public void graphPartition(EcoreGraph graph,
//			ArrayList<TupleMembersConcepts> membersConceptList,
//			ConceptComparison conceptComparisonOperator) {
//		
//		gamma = new ModularizationQuality();
//		MinimumAcyclicPartition decoder = new MinimumAcyclicPartition();
//		
//		// Compute an initial solution
//		EcoreGraph baseGraph = graph.cloneGraph();
//		decoder.graphPartition(baseGraph, membersConceptList, conceptComparisonOperator);
//		double temperature = 10;
//		
//		EcoreGraph bestFound = null;
//		try {
//			bestFound = this.simulatedAnnealing(decoder, baseGraph, temperature, 
//					membersConceptList, conceptComparisonOperator);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		graph.reOrderVertex(bestFound);
//		decoder.graphPartition(graph, membersConceptList, conceptComparisonOperator);
//	}
//	
//	public EcoreGraph simulatedAnnealing (MinimumAcyclicPartition decoder, 
//			EcoreGraph graph, double temperature,
//			ArrayList<TupleMembersConcepts> membersConceptList,
//			ConceptComparison conceptComparisonOperator) throws Exception{
//
//		EcoreGraph X = graph;
//		decoder.graphPartition(X, membersConceptList, conceptComparisonOperator);
//		double XCMax = gamma.compute(X);
//		
//		// Initializes the best solution (XBest) as the first one (X)
//		EcoreGraph XBest = X.cloneGraph();
//		decoder.graphPartition(XBest, membersConceptList, conceptComparisonOperator);
//		double XBestCMax = gamma.compute(XBest);
//		System.out.println("initial solution (XBestCMax): " + XBestCMax);
//		
//		double boltzmann = 0.5;
//		double finalTemperature = 0;
//		
//		while (temperature >= finalTemperature) {
//			Integer k = 10;
//			
//			while (k > 0){
//				
//				PairVO YMovement = calculateNeighbor(X);
//				EcoreGraph Y = this.modifyGraph(X, YMovement);
//				decoder.graphPartition(Y, membersConceptList, conceptComparisonOperator);
//				
//				if(Y == null){
//					long actualTime = System.currentTimeMillis();
//				    long elapsedTime = actualTime - startTime;
//				    
//				    if(elapsedTime>=stopTime){
//				    	optimalAchieved = true;
//				    }
//					continue;
//				}
//				numberOfVisitedNeighbors++;
//
//				double YCMax = gamma.compute(Y);
//				System.out.println("YCMax: " + YCMax);
//				double deltaXY = YCMax - XCMax;
//				
//				if(deltaXY < 0){
//					double acceptaceValue = Math.pow(Math.E, (-deltaXY/(boltzmann*temperature)));
//					double acceptanceRandom = RandomNumber.getInstance().randomDouble();
//					
//					if(acceptanceRandom <= acceptaceValue){
//						X = Y.cloneGraph();
//						decoder.graphPartition(X, membersConceptList, conceptComparisonOperator);
//						XCMax = gamma.compute(X);
//					}
//				}
//				else{
//					X = Y.cloneGraph();
//					decoder.graphPartition(X, membersConceptList, conceptComparisonOperator);
//					XCMax = gamma.compute(X);
//				}
//				
//				if(XCMax > XBestCMax){
//					XBest = X.cloneGraph();
//					decoder.graphPartition(XBest, membersConceptList, conceptComparisonOperator);
//					XBestCMax = gamma.compute(XBest);
//					System.out.println("CMax improvement: " + XBestCMax);
//				}
//				k--;
//			}
//			
//			// Temperature reductions
//			Double coolingFactor =  new Double(0.5);
//			temperature = temperature * (coolingFactor);
//		}
//		return XBest;
//	}
//
//	private PairVO calculateNeighbor(EcoreGraph x) {
//		int size = x.getVertex().size();
//		return new PairVO(0 + (int)(Math.random()*size), 0 + (int)(Math.random()*size));
////		return new PairVO(31,1);
//	}
//	
//	private EcoreGraph modifyGraph(EcoreGraph graph, PairVO movement){
//		EcoreGraph modified = graph.cloneGraph();
//		
//		EcoreVertex firstVertex = modified.getVertex().get(movement.getA());
//		EcoreVertex secondVertex = modified.getVertex().get(movement.getB());
//				
//		modified.getVertex().set(movement.getA(), secondVertex);
//		modified.getVertex().set(movement.getB(), firstVertex);
//		
//		return modified;
//	}
}
package fr.inria.diverse.puzzle.graphsgenerator.impl;

import java.util.Random;

import fr.inria.diverse.k3.sle.common.graphs.DependencyArc;
import fr.inria.diverse.k3.sle.common.graphs.DependencyGraph;
import fr.inria.diverse.k3.sle.common.graphs.DependencyVertex;

public class GraphGenerator {

	public static DependencyGraph generateGraph(int size, long seed){
		Random generator = new Random(seed);
		
		// Creating an empty graph (without arcs)
		DependencyGraph graph = new DependencyGraph();
		for (int i = 0; i < size; i++) {
			DependencyVertex vertex = new DependencyVertex(Integer.toString(i));
			graph.getVertex().add(vertex);
		}
		
		int iterations = size * 2;
		while(iterations > 0){
			int i = 0 + (int)(generator.nextDouble() * (size - 1));
			int j = 0 + (int)(generator.nextDouble() * (size - 1));
			
			DependencyVertex vertexI = graph.getVertex().get(i);
			DependencyVertex vertexJ = graph.getVertex().get(j);
			
			DependencyArc arc = new DependencyArc(vertexI, vertexJ);
			
			if(!graph.getArcs().contains(arc)){
				graph.getArcs().add(arc);
				
				if(graph.thereIsLoop()){
					graph.getArcs().remove(arc);
				}
			}
			
			iterations--;
		}
		return graph;
	}
}

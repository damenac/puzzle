package fr.inria.diverse.dag.generator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

import fr.inria.diverse.graph.Arc;
import fr.inria.diverse.graph.Graph;
import fr.inria.diverse.graph.Vertex;

/**
 * Random generator of acyclic directed graph.
 * The algorithm is the one proposed by Malecon et al. [1]
 * 
 * [1]: G. Melançon, I. Dutour, M. Bousquet-Mélou, Random Generation of Directed Acyclic Graphs, 
 * Electronic Notes in Discrete Mathematics, Volume 10, November 2001, Pages 202-207, 
 * ISSN 1571-0653, http://dx.doi.org/10.1016/S1571-0653(04)00394-4.
 * 
 * @author David Mendez-Acuna
 *
 */
public class GraphGenerator {

	// -------------------------------------------------------
	// Methods
	// -------------------------------------------------------
	
	/**
	 * Generates a random acyclic directed graph by using the given seed. 
	 * @param size. Number of vertex of the desired graph.
	 * @param seed. Seed for generation of the random positions of the graph. 
	 * @return
	 */
	public Graph<Vertex, Arc> generateGraph(String namePrefix, int size, long seed, int chainLenght){
		Random generator = new Random(seed);
		
		// Creating an empty graph (without arcs)
		Graph<Vertex, Arc> graph = new Graph<Vertex, Arc>();
		for (int i = 1; i <= size; i++) {
			Vertex vertex = new Vertex(namePrefix + Integer.toString(i));
			graph.getVertex().add(vertex);
		}
		
		// Creating the arcs between vertex using a Markov chain. 
		int iterations = chainLenght;
		
		if(chainLenght == -1)
			iterations = size * 3;
		
		while(iterations > 0){
			int i = 0 + (int)(generator.nextDouble() * (size));
			int j = 0 + (int)(generator.nextDouble() * (size));
			
			Vertex vertexI = (Vertex) graph.getVertex().get(i);
			Vertex vertexJ = (Vertex) graph.getVertex().get(j);
			
			
			if(graph.thereIsArc(vertexI, vertexJ)){
				// (a) If the position (i,j) corresponds to an arc e in Xt, then Xt+1 = Xt\e
				Arc oldArc = (Arc) graph.getArc(vertexI, vertexJ);
				oldArc.getFrom().getOutgoingArcs().remove(oldArc);
				oldArc.getTo().getIncomingArcs().remove(oldArc);
				graph.getArcs().remove(oldArc);
			}else{
				// (b) If the position (i,j) does not correspond to an arc in Xt, then Xt+1 is obtained from Xt
				//     by adding this arc while avoiding loops. 
				Arc arc = new Arc(vertexI, vertexJ);
				graph.getArcs().add(arc);
				
				if(graph.thereIsLoop()){
					arc.getFrom().getOutgoingArcs().remove(arc);
					arc.getTo().getIncomingArcs().remove(arc);
					graph.getArcs().remove(arc);
					iterations++;
				}
			}
			iterations--;
		}
		return graph;
	}
	
	public Properties readProperties() throws IOException{
		Properties prop = new Properties();
		InputStream input = null;
		input = new FileInputStream("parameters.properties");
		prop.load(input);
		input.close();
		return prop;
	}
	
	// -------------------------------------------------------
	// Main
	// -------------------------------------------------------
	
	public static void main(String[] args){
		GraphGenerator generator = new GraphGenerator();
		try {
			Properties prop = generator.readProperties();
			int size = Integer.parseInt(prop.getProperty("size"));
			String prefix = prop.getProperty("vertexPrefix");
			long seed = Long.parseLong(prop.getProperty("seed"));
			int chainLenght = Integer.parseInt(prop.getProperty("chainLenght"));
			
			Graph<Vertex, Arc> graph = generator.generateGraph(prefix, size, seed, chainLenght);
			String[][] adjacencyMatrix = graph.adjacencyMatrix();
			
			for (int i = 0; i < adjacencyMatrix.length; i++) {
				for (int j = 0; j < adjacencyMatrix[0].length; j++) {
					System.out.print(adjacencyMatrix[i][j] + "|");
				}
				System.out.println();
			}
			
			System.out.println();
			System.out.println(graph.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

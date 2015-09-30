package fr.inria.diverse.generator.pcm;

import fr.inria.diverse.graph.Arc;
import fr.inria.diverse.graph.Graph;
import fr.inria.diverse.graph.Vertex;

public class InstanceVO {

	// -------------------------------------------------
	// Attributes
	// -------------------------------------------------
	
	private Graph<Vertex, Arc> dependenciesGraph;
	private String openPCM;
	private String closedPCM;
	private int featuresAmount;
	private int productsAmount;
	private int id;
	private long graphSeed;
	private long PCMSeed;
	
	// -------------------------------------------------
	// Constructor
	// -------------------------------------------------
	
	public InstanceVO(Graph<Vertex, Arc> dependenciesGraph, String openPCM,
			String closedPCM, int featuresAmount, int productsAmount, long graphSeed, long PCMSeed) {
		super();
		this.dependenciesGraph = dependenciesGraph;
		this.openPCM = openPCM;
		this.closedPCM = closedPCM;
		this.featuresAmount = featuresAmount;
		this.productsAmount = productsAmount;
		this.graphSeed = graphSeed;
		this.PCMSeed = PCMSeed;
	}
	
	// -------------------------------------------------
	// Getters and setters
	// -------------------------------------------------
	
	public Graph<Vertex, Arc> getDependenciesGraph() {
		return dependenciesGraph;
	}

	public void setDependenciesGraph(Graph<Vertex, Arc> dependenciesGraph) {
		this.dependenciesGraph = dependenciesGraph;
	}

	public String getOpenPCM() {
		return openPCM;
	}

	public void setOpenPCM(String openPCM) {
		this.openPCM = openPCM;
	}

	public String getClosedPCM() {
		return closedPCM;
	}

	public void setClosedPCM(String closedPCM) {
		this.closedPCM = closedPCM;
	}

	public int getFeaturesAmount() {
		return featuresAmount;
	}

	public void setFeaturesAmount(int featuresAmount) {
		this.featuresAmount = featuresAmount;
	}

	public int getProductsAmount() {
		return productsAmount;
	}

	public void setProductsAmount(int productsAmount) {
		this.productsAmount = productsAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getGraphSeed() {
		return graphSeed;
	}

	public void setGraphSeed(long graphSeed) {
		this.graphSeed = graphSeed;
	}

	public long getPCMSeed() {
		return PCMSeed;
	}

	public void setPCMSeed(long pCMSeed) {
		PCMSeed = pCMSeed;
	}
}
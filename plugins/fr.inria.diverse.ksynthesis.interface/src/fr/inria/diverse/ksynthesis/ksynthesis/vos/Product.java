package fr.inria.diverse.ksynthesis.ksynthesis.vos;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String identifier;

	private List<Feature> features;
	
	public Product(String identifier) {
		super();
		this.identifier = identifier;
		this.features = new ArrayList<Feature>();
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public List<Feature> getFeatures() {
		return features;
	}
}
package fr.inria.diverse.ksynthesis.ksynthesis.vos;

import java.util.ArrayList;
import java.util.List;

public class ProductLine {

	private List<Product> products;
	
	private List<Feature> features;
	
	public ProductLine(){
		products = new ArrayList<Product>();
		features = new ArrayList<Feature>();
	}

	public List<Product> getProducts() {
		return products;
	}

	public List<Feature> getFeatures() {
		return features;
	}
	
	public Feature findFeature(String identifier){
		for (Feature feature : features) {
			if(feature.getIdentifier().equals(identifier))
				return feature;
		}
		return null;
	}
}

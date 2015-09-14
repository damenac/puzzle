package fr.inria.diverse.ksynthesis.ksynthesis.auxiliary;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that represents a product line in PCMs for KSynthesis.
 * @author David Mendez-Acuna
 */
public class ProductLine {

	// ----------------------------------------------------------
	// Attributes
	// ----------------------------------------------------------
	
	private List<Product> products;
	
	private List<Feature> features;
	
	// ----------------------------------------------------------
	// Constructor
	// ----------------------------------------------------------
	
	public ProductLine(){
		products = new ArrayList<Product>();
		features = new ArrayList<Feature>();
	}

	// ----------------------------------------------------------
	// Getters and setters
	// ----------------------------------------------------------
	
	public List<Product> getProducts() {
		return products;
	}

	public List<Feature> getFeatures() {
		return features;
	}
	
	/**
	 * Finds a feature by its identifier.
	 * @param identifier. Identifier of the feature that should be returned. 
	 * @return
	 */
	public Feature findFeature(String identifier){
		for (Feature feature : features) {
			if(feature.getIdentifier().equals(identifier))
				return feature;
		}
		return null;
	}
}
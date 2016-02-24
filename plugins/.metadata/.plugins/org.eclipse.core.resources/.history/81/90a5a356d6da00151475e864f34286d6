package fr.inria.diverse.puzzle.configurator;

import vm.PFeature;
import vm.PFeatureGroup;
import vm.PFeatureModel;
import es.us.isa.FAMA.models.FAMAfeatureModel.FAMAFeatureModel;
import es.us.isa.FAMA.models.FAMAfeatureModel.Feature;
import es.us.isa.FAMA.models.FAMAfeatureModel.Relation;
import es.us.isa.FAMA.models.featureModel.Cardinality;

/**
 * Offers the services for translating feature models from diverse formats to the VM metamodel.
 * @author David Mendez-Acuna
 *
 */
public class FromPFeatureModelToFAMA {

	// -----------------------------------------------------------
	// Attributes
	// -----------------------------------------------------------
	
	private static FromPFeatureModelToFAMA instance;
	
	// -----------------------------------------------------------
	// Constructor and singleton
	// -----------------------------------------------------------
	
	private FromPFeatureModelToFAMA(){
		
	}
	
	public static FromPFeatureModelToFAMA getInstance(){
		if(instance == null)
			instance = new FromPFeatureModelToFAMA();
		return instance;
	}

	// -----------------------------------------------------------
	// Methods
	// -----------------------------------------------------------

	/**
	 * Translates from a features model from FAMAFeatureModel (FAMA) to FeatureModel (Puzzle).
	 * @param famafm The feature model as an FAMAFeatureModel object.
	 * @return
	 */
	public FAMAFeatureModel fromPFeatureModelToFAMA(
			PFeatureModel pFeatureModel) {
		
		FAMAFeatureModel famaFeatureModel = new FAMAFeatureModel();
		famaFeatureModel.setRoot(fromFAMAFeatureToPFeature(pFeatureModel.getRootFeature()));
		return famaFeatureModel;
	}
	
	/**
	 * In-deep translating of the FAMA feature in the parameter to a new puzzle feature.
	 * @param famaFeature. The FAMA feature that should be translated. 
	 * @return
	 */
	private Feature fromFAMAFeatureToPFeature(PFeature pFeature){
		Feature feature = new Feature(pFeature.getName());
		
		for (PFeatureGroup group : pFeature.getGroups()) {
			Relation relation = new Relation();
			relation.setParent(feature);
			
			Cardinality cardinality = new Cardinality(group.getCardinality().getLowerBound(), group.getCardinality().getUpperBound());
			relation.addCardinality(cardinality);
			
			for (PFeature groupFeature : group.getFeatures()) {
				Feature relationFeature = this.fromFAMAFeatureToPFeature(groupFeature);
				relation.addDestination(relationFeature);
			}
		}
		
		return feature;
	}
	

}
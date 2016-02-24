package fr.inria.diverse.ksynthesis.ksynthesis.auxiliary;

import vm.PFeature;
import vm.PFeatureModel;
import vm.VmFactory;
import fr.familiar.variable.FeatureModelVariable;

/**
 * Offers the services for translating feature models from diverse formats to the VM metamodel.
 * @author David Mendez-Acuna
 *
 */
public class PuzzleFMTranslator {

	// -----------------------------------------------------------
	// Attributes
	// -----------------------------------------------------------
	
	private static PuzzleFMTranslator instance;
	
	// -----------------------------------------------------------
	// Constructor and singleton
	// -----------------------------------------------------------
	
	private PuzzleFMTranslator(){
		
	}
	
	public static PuzzleFMTranslator getInstance(){
		if(instance == null)
			instance = new PuzzleFMTranslator();
		return instance;
	}

	// -----------------------------------------------------------
	// Methods
	// -----------------------------------------------------------
	
	/**
	 * Translates from a features model from FeatureModelVariable (Familiar) to FeatureModel (Puzzle).
	 * @param fmv The feature model as an FeatureModelVariable object.
	 * @return
	 */
	public PFeatureModel fromFeatureModelVariableToFeatureModel(
			FeatureModelVariable fmv) {
		PFeatureModel fm = VmFactory.eINSTANCE.createPFeatureModel();
		
		gsd.synthesis.FeatureModel<String> originalFeatureModel = fmv.getHierarchy();
		gsd.synthesis.FeatureGraph<String> diagram = originalFeatureModel.getDiagram();
		
		return fm;
	}
	
	/**
	 * Finds a PFeature by the name in the features model in the parameter.
	 * @param featureName. Name of the feature.
	 * @param featuresModelRoot. Root of the features model where the feature should be searched. 
	 * @return
	 */
	private PFeature getPFeatureByName(String featureName, PFeature featureModelRoot) {
		if(featureModelRoot.getName().equals(featureName)){
			return featureModelRoot;
		}
		for (PFeature feature : featureModelRoot.getChildren()) {
			PFeature found = this.getPFeatureByName(featureName, feature);
			if(found != null)
				return found;
		}
		return null;
	}
}
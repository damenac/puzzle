package fr.inria.diverse.ksynthesis.ksynthesis.auxiliary;

import vm.LanguageFeature;
import vm.LanguageFeatureModel;
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
	public LanguageFeatureModel fromFeatureModelVariableToFeatureModel(
			FeatureModelVariable fmv) {
		LanguageFeatureModel fm = VmFactory.eINSTANCE.createLanguageFeatureModel();
		
		gsd.synthesis.FeatureModel<String> originalFeatureModel = fmv.getHierarchy();
		gsd.synthesis.FeatureGraph<String> diagram = originalFeatureModel.getDiagram();
		
		return fm;
	}
	
	/**
	 * Finds a LanguageFeature by the name in the features model in the parameter.
	 * @param featureName. Name of the feature.
	 * @param featuresModelRoot. Root of the features model where the feature should be searched. 
	 * @return
	 */
	public LanguageFeature getLanguageFeatureByName(String featureName, LanguageFeature featureModelRoot) {
		if(featureModelRoot.getName().equals(featureName)){
			return featureModelRoot;
		}
		for (LanguageFeature feature : featureModelRoot.getChildren()) {
			LanguageFeature found = this.getLanguageFeatureByName(featureName, feature);
			if(found != null)
				return found;
		}
		return null;
	}
}
package fr.inria.diverse.puzzle.vmsynthesis.impl;

import java.util.ArrayList;
import java.util.List;

import vm.LanguageFeature;
import vm.LanguageFeatureModel;
import de.ovgu.featureide.core.fstmodel.FSTFeature;
import de.ovgu.featureide.core.fstmodel.FSTModel;

/**
 * Provides translation from feature models from the puzzle format to FeatureIDE.
 * @author David Mendez-Acuna
 *
 */
public class FromPuzzleToFeatureIDE {

	// -----------------------------------------------------------
	// Attributes
	// -----------------------------------------------------------
	
	private static FromPuzzleToFeatureIDE instance;
	
	// -----------------------------------------------------------
	// Constructor and singleton
	// -----------------------------------------------------------
	
	private FromPuzzleToFeatureIDE(){
		
	}
	
	public static FromPuzzleToFeatureIDE getInstance(){
		if(instance == null)
			instance = new FromPuzzleToFeatureIDE();
		return instance;
	}
	
	// -----------------------------------------------------------
	// Methods
	// -----------------------------------------------------------
	
	public FSTModel fromPuzzleToFeatureIDE(LanguageFeatureModel featureModel){
		
//		FMFactoryManager.getFactory().
//		IFeatureModel
		FSTModel model = new FSTModel(null);
		List<LanguageFeature> features = new ArrayList<LanguageFeature>();
		this.collectAllFeatures(featureModel.getRootFeature(), features);

		for (LanguageFeature languageFeature : features) {
			FSTFeature translatedFeature = this.fromPuzzleFeatureToFeatureIDEPuzzle(languageFeature, model);
			
			model.addFeature(translatedFeature);
		}
		
		return model;
	}

	private void collectAllFeatures(LanguageFeature languageFeature,
			List<LanguageFeature> features) {
		features.add(languageFeature);
		for(LanguageFeature children : languageFeature.getChildren()){
			this.collectAllFeatures(children, features);
		}
	}
	
	private FSTFeature fromPuzzleFeatureToFeatureIDEPuzzle(
			LanguageFeature languageFeature, FSTModel model) {
		FSTFeature translatedFeature = new FSTFeature(languageFeature.getName(), model);
		return translatedFeature;
	}
}

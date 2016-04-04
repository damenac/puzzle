package fr.inria.diverse.puzzle.vmsynthesis.impl;

import vm.BinaryExpression;
import vm.BinaryOperator;
import vm.LanguageConstraint;
import vm.LanguageFeature;
import vm.LanguageFeatureGroup;
import vm.LanguageFeatureModel;
import vm.LanguageFeatureRef;
import vm.UnaryExpression;
import vm.UninaryOperator;

import es.us.isa.FAMA.models.FAMAfeatureModel.Dependency;
import es.us.isa.FAMA.models.FAMAfeatureModel.ExcludesDependency;
import es.us.isa.FAMA.models.FAMAfeatureModel.FAMAFeatureModel;
import es.us.isa.FAMA.models.FAMAfeatureModel.Feature;
import es.us.isa.FAMA.models.FAMAfeatureModel.Relation;
import es.us.isa.FAMA.models.FAMAfeatureModel.RequiresDependency;
import es.us.isa.FAMA.models.featureModel.Cardinality;

/**
 * Provides translation from feature models from the puzzle format to FAMA.
 * @author David Mendez-Acuna
 *
 */
public class FromPuzzleModelToFAMA {

	// -----------------------------------------------------------
	// Attributes
	// -----------------------------------------------------------
	
	private static FromPuzzleModelToFAMA instance;
	
	// -----------------------------------------------------------
	// Constructor and singleton
	// -----------------------------------------------------------
	
	private FromPuzzleModelToFAMA(){
		
	}
	
	public static FromPuzzleModelToFAMA getInstance(){
		if(instance == null)
			instance = new FromPuzzleModelToFAMA();
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
	public FAMAFeatureModel fromLanguageFeatureModelToFAMA(
			LanguageFeatureModel pFeatureModel) {
		
		FAMAFeatureModel famaFeatureModel = new FAMAFeatureModel();
		famaFeatureModel.setRoot(fromFAMAFeatureToLanguageFeature(pFeatureModel.getRootFeature()));
		
		for (LanguageConstraint pConstraint : pFeatureModel.getConstraints()) {
			
			if(pConstraint.getExpression() instanceof BinaryExpression){
				BinaryExpression pBinaryExpression = (BinaryExpression) pConstraint.getExpression();
				
				if(pBinaryExpression.getOperator().equals(BinaryOperator.IMPLIES)){
					if(pBinaryExpression.getLeft() instanceof LanguageFeatureRef &&
							pBinaryExpression.getRight() instanceof LanguageFeatureRef){
						
						Dependency dependency = new RequiresDependency(pConstraint.getName());

						LanguageFeatureRef leftFeatureRef = (LanguageFeatureRef) pBinaryExpression.getLeft();
						LanguageFeatureRef rightFeatureRef = (LanguageFeatureRef) pBinaryExpression.getRight();
						
						dependency.setOrigin(this.getFamaFeatureByName(leftFeatureRef.getRef().getName(), 
								famaFeatureModel.getRoot()));
						
						dependency.setDestination(this.getFamaFeatureByName(rightFeatureRef.getRef().getName(), 
								famaFeatureModel.getRoot()));
						
						famaFeatureModel.addDependency(dependency);
					}
					
					if(pBinaryExpression.getLeft() instanceof LanguageFeatureRef &&
							pBinaryExpression.getRight() instanceof UnaryExpression){
						UnaryExpression not = (UnaryExpression) pBinaryExpression.getRight();
						 if(not.getOperator().getName().equals(UninaryOperator.NOT.getName())){
							 if(not.getExpr() instanceof LanguageFeatureRef){
								 Dependency dependency = new ExcludesDependency(pConstraint.getName());
								 
								LanguageFeatureRef leftFeatureRef = (LanguageFeatureRef) pBinaryExpression.getLeft();
								LanguageFeatureRef rightFeatureRef = (LanguageFeatureRef) not.getExpr();
								
								dependency.setOrigin(this.getFamaFeatureByName(leftFeatureRef.getRef().getName(), 
										famaFeatureModel.getRoot()));
								
								dependency.setDestination(this.getFamaFeatureByName(rightFeatureRef.getRef().getName(), 
										famaFeatureModel.getRoot()));
								
								famaFeatureModel.addDependency(dependency);
							 }
						 }
					}
				}
			}
		}
		return famaFeatureModel;
	}
	
	/**
	 * Finds a FAMA feature by the name in the features model in the parameter
	 * @param name
	 * @param root
	 * @return
	 */
	private Feature getFamaFeatureByName(String name, Feature root) {
		if(root.getName().equals(name))
			return root;
		else{
			for (Feature currentFeature : root.getChilds()) {
				Feature feature = this.getFamaFeatureByName(name, currentFeature);
				if(feature != null)
					return feature;
			}
		}
		return null;
	}

	/**
	 * In-deep translating of the FAMA feature in the parameter to a new puzzle feature.
	 * @param famaFeature. The FAMA feature that should be translated. 
	 * @return
	 */
	private Feature fromFAMAFeatureToLanguageFeature(LanguageFeature pFeature){
		Feature feature = new Feature(pFeature.getName());
		
		for (LanguageFeatureGroup group : pFeature.getGroups()) {
			Relation relation = new Relation();
			relation.setParent(feature);
			
			Cardinality cardinality = new Cardinality(group.getCardinality().getLowerBound(), group.getCardinality().getUpperBound());
			relation.addCardinality(cardinality);
			
			for (LanguageFeature groupFeature : group.getFeatures()) {
				Feature relationFeature = this.fromFAMAFeatureToLanguageFeature(groupFeature);
				relation.addDestination(relationFeature);
			}
			
			feature.addRelation(relation);
		}
		return feature;
	}
}
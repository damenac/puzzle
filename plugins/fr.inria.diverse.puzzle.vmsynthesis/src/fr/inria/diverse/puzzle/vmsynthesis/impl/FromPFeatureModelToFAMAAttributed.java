package fr.inria.diverse.puzzle.vmsynthesis.impl;

import es.us.isa.FAMA.models.FAMAAttributedfeatureModel.AttributedFeature;
import es.us.isa.FAMA.models.FAMAAttributedfeatureModel.ComplexConstraint;
import es.us.isa.FAMA.models.FAMAAttributedfeatureModel.Dependency;
import es.us.isa.FAMA.models.FAMAAttributedfeatureModel.FAMAAttributedFeatureModel;
import es.us.isa.FAMA.models.FAMAAttributedfeatureModel.Relation;
import es.us.isa.FAMA.models.featureModel.Cardinality;
import es.us.isa.util.Tree;
import vm.PBinaryExpression;
import vm.PBinaryOperator;
import vm.PConstraint;
import vm.PFeature;
import vm.PFeatureGroup;
import vm.PFeatureModel;
import vm.PFeatureRef;
import vm.PUnaryExpression;
import vm.PUninaryOperator;

/**
 * Offers the services for translating feature models from diverse formats to the VM metamodel.
 * @author David Mendez-Acuna
 *
 */
public class FromPFeatureModelToFAMAAttributed {

	// -----------------------------------------------------------
	// Attributes
	// -----------------------------------------------------------
	
	private static FromPFeatureModelToFAMAAttributed instance;
	
	// -----------------------------------------------------------
	// Constructor and singleton
	// -----------------------------------------------------------
	
	private FromPFeatureModelToFAMAAttributed(){
		
	}
	
	public static FromPFeatureModelToFAMAAttributed getInstance(){
		if(instance == null)
			instance = new FromPFeatureModelToFAMAAttributed();
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
	public FAMAAttributedFeatureModel fromPFeatureModelToFAMA(
			PFeatureModel pFeatureModel) {
		
		FAMAAttributedFeatureModel famaFeatureModel = new FAMAAttributedFeatureModel();
		famaFeatureModel.setRoot(fromFAMAFeatureToPFeature(pFeatureModel.getRootFeature()));
		
		for (PConstraint pConstraint : pFeatureModel.getConstraints()) {
			
			if(pConstraint.getExpression() instanceof PBinaryExpression){
				PBinaryExpression pBinaryExpression = (PBinaryExpression) pConstraint.getExpression();
				
				if(pBinaryExpression.getOperator().equals(PBinaryOperator.IMPLIES)){
					if(pBinaryExpression.getLeft() instanceof PFeatureRef &&
							pBinaryExpression.getRight() instanceof PFeatureRef){
						
						Dependency dependency = new ComplexConstraint(null);

						PFeatureRef leftFeatureRef = (PFeatureRef) pBinaryExpression.getLeft();
						PFeatureRef rightFeatureRef = (PFeatureRef) pBinaryExpression.getRight();
						
						dependency.setOrigin(this.getFamaFeatureByName(leftFeatureRef.getRef().getName(), 
								famaFeatureModel.getRoot()));
						
						dependency.setDestination(this.getFamaFeatureByName(rightFeatureRef.getRef().getName(), 
								famaFeatureModel.getRoot()));
						
						famaFeatureModel.addDependency(dependency);
					}
					
					if(pBinaryExpression.getLeft() instanceof PFeatureRef &&
							pBinaryExpression.getRight() instanceof PUnaryExpression){
						PUnaryExpression not = (PUnaryExpression) pBinaryExpression.getRight();
						 if(not.getOperator().getName().equals(PUninaryOperator.NOT.getName())){
							 if(not.getExpr() instanceof PFeatureRef){
								 Dependency dependency = new ExcludesDependency(pConstraint.getName());
								 
								PFeatureRef leftFeatureRef = (PFeatureRef) pBinaryExpression.getLeft();
								PFeatureRef rightFeatureRef = (PFeatureRef) not.getExpr();
								
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
	private AttributedFeature getFamaFeatureByName(String name, AttributedFeature root) {
		if(root.getName().equals(name))
			return root;
		else{
			for (AttributedFeature currentFeature : root.getChilds()) {
				AttributedFeature feature = this.getFamaFeatureByName(name, currentFeature);
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
	private AttributedFeature fromFAMAFeatureToPFeature(PFeature pFeature){
		AttributedFeature feature = new AttributedFeature(pFeature.getName());
		
		for (PFeatureGroup group : pFeature.getGroups()) {
			Relation relation = new Relation();
			relation.setParent(feature);
			
			Cardinality cardinality = new Cardinality(group.getCardinality().getLowerBound(), group.getCardinality().getUpperBound());
			relation.addCardinality(cardinality);
			
			for (PFeature groupFeature : group.getFeatures()) {
				AttributedFeature relationFeature = this.fromFAMAFeatureToPFeature(groupFeature);
				relation.addDestination(relationFeature);
			}
			
			feature.addRelation(relation);
		}
		return feature;
	}
}
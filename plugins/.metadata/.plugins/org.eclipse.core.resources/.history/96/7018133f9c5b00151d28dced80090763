package fr.inria.diverse.puzzle.variabilityinferer.auxiliar;

import java.util.Hashtable;
import java.util.Iterator;

import vm.PBinaryExpression;
import vm.PBinaryOperator;
import vm.PConstraint;
import vm.PFeature;
import vm.PFeatureGroup;
import vm.PFeatureModel;
import vm.PFeatureRef;
import vm.PGroupKind;
import vm.PUnaryExpression;
import vm.PUninaryOperator;
import vm.VmFactory;
import es.us.isa.FAMA.models.FAMAfeatureModel.Dependency;
import es.us.isa.FAMA.models.FAMAfeatureModel.ExcludesDependency;
import es.us.isa.FAMA.models.FAMAfeatureModel.FAMAFeatureModel;
import es.us.isa.FAMA.models.FAMAfeatureModel.Feature;
import es.us.isa.FAMA.models.FAMAfeatureModel.Relation;
import es.us.isa.FAMA.models.FAMAfeatureModel.RequiresDependency;

/**
 * Offers the services for translating feature models from diverse formats to the VM metamodel.
 * @author David Mendez-Acuna
 *
 */
public class FromFAMAToPFeatureModel {

	// -----------------------------------------------------------
	// Attributes
	// -----------------------------------------------------------
	
	private static FromFAMAToPFeatureModel instance;
	
	// -----------------------------------------------------------
	// Constructor and singleton
	// -----------------------------------------------------------
	
	private FromFAMAToPFeatureModel(){
		
	}
	
	public static FromFAMAToPFeatureModel getInstance(){
		if(instance == null)
			instance = new FromFAMAToPFeatureModel();
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
	public PFeatureModel fromFAMAFeatureModelToFeatureModel(
			FAMAFeatureModel famafm) {
		Hashtable<String, String> famasIndexVsLanguageModules = PCMsGenerator.getInstance().getFamasIndexVsModulesName();
		PFeatureModel fm = VmFactory.eINSTANCE.createPFeatureModel();
		PFeature root = this.fromFAMAFeatureToPFeature(famafm.getRoot());
		fm.setRootFeature(root);
		root.setMandatory(true);
		
		Iterator<Dependency> dependenciesIterator = famafm.getDependencies();
		while (dependenciesIterator.hasNext()) {
			Dependency dependency = (Dependency) dependenciesIterator.next();
			System.out.println("dependency: " + dependency);
			
			// A requires B is the same than A implies B
			if(dependency instanceof RequiresDependency){
				PConstraint constraint = VmFactory.eINSTANCE.createPConstraint();
				PBinaryExpression expression = VmFactory.eINSTANCE.createPBinaryExpression();
				PFeatureRef originRef = VmFactory.eINSTANCE.createPFeatureRef();
				
				String originFeatureName = famasIndexVsLanguageModules.get(dependency.getOrigin().getName());
				if(originFeatureName == null)
					originFeatureName = dependency.getOrigin().getName();
				
				originRef.setRef(this.getPFeatureByName(originFeatureName, root));
				PFeatureRef destinationRef = VmFactory.eINSTANCE.createPFeatureRef();
				
				String destinationFeatureName = famasIndexVsLanguageModules.get(dependency.getDestination().getName());
				if(destinationFeatureName == null)
					destinationFeatureName = dependency.getDestination().getName();
				
				destinationRef.setRef(this.getPFeatureByName(destinationFeatureName, root));
				expression.setLeft(originRef);
				expression.setRight(destinationRef);
				expression.setOperator(PBinaryOperator.IMPLIES);
				constraint.setExpression(expression);
				fm.getConstraints().add(constraint);
			}
			// A excludes B is the same than A implies not B
			else if(dependency instanceof ExcludesDependency){
				PConstraint constraint = VmFactory.eINSTANCE.createPConstraint();
				PBinaryExpression expression = VmFactory.eINSTANCE.createPBinaryExpression();
				PFeatureRef originRef = VmFactory.eINSTANCE.createPFeatureRef();
				
				String originFeatureName = famasIndexVsLanguageModules.get(dependency.getOrigin().getName());
				if(originFeatureName == null)
					originFeatureName = dependency.getOrigin().getName();
				
				originRef.setRef(this.getPFeatureByName(originFeatureName, root));
				
				PFeatureRef destinationRef = VmFactory.eINSTANCE.createPFeatureRef();
				
				String destinationFeatureName = famasIndexVsLanguageModules.get(dependency.getDestination().getName());
				if(destinationFeatureName == null)
					destinationFeatureName = dependency.getDestination().getName();
				
				destinationRef.setRef(this.getPFeatureByName(destinationFeatureName, root));
				PUnaryExpression notDestination = VmFactory.eINSTANCE.createPUnaryExpression();
				notDestination.setExpr(destinationRef);
				notDestination.setOperator(PUninaryOperator.NOT);
				
				expression.setLeft(originRef);
				expression.setRight(notDestination);
				expression.setOperator(PBinaryOperator.IMPLIES);
				constraint.setExpression(expression);
				fm.getConstraints().add(constraint);
			}
		}
		return fm;
	}
	
	/**
	 * In-deep translating of the FAMA feature in the parameter to a new puzzle feature.
	 * @param famaFeature. The FAMA feature that should be translated. 
	 * @return
	 */
	private PFeature fromFAMAFeatureToPFeature(Feature famaFeature){
		Hashtable<String, String> famasIndexVsLanguageModules = PCMsGenerator.getInstance().getFamasIndexVsModulesName();
		PFeature pf = VmFactory.eINSTANCE.createPFeature();

		String featureName = famasIndexVsLanguageModules.get(famaFeature.getName());
		if(featureName == null)
			featureName = famaFeature.getName();
		pf.setName(featureName);
		
		Iterator<Relation> relations = famaFeature.getRelations();
		while (relations.hasNext()) {
			Relation currentRelation = (Relation) relations.next();
			PFeatureGroup featureGroup = VmFactory.eINSTANCE.createPFeatureGroup();
			
			if(currentRelation.isAlternative())
				featureGroup.setKind(PGroupKind.ALTERNATIVE);
			else if(currentRelation.isOptional())
				featureGroup.setKind(PGroupKind.OPTIONAL);
			
			Iterator<Feature> featuresIterator = currentRelation.getDestination();
			while (featuresIterator.hasNext()) {
				Feature childFAMAFeature = (Feature) featuresIterator.next();
				PFeature childPFeatture = this.fromFAMAFeatureToPFeature(childFAMAFeature);
				childPFeatture.setMandatory(currentRelation.isMandatory());
				pf.getChildren().add(childPFeatture);
				featureGroup.getFeatures().add(childPFeatture);
			}
			pf.getGroups().add(featureGroup);
		}
		return pf;
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
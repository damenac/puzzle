package fr.inria.diverse.puzzle.vmsynthesis.impl;

import java.util.ArrayList;
import java.util.List;

import fr.inria.diverse.k3.sle.common.graphs.DependencyArc;
import fr.inria.diverse.k3.sle.common.graphs.DependencyGraph;
import fr.inria.diverse.k3.sle.common.graphs.DependencyVertex;
import vm.PBinaryExpression;
import vm.PBinaryOperator;
import vm.PBooleanExpression;
import vm.PConstraint;
import vm.PFeature;
import vm.PFeatureGroup;
import vm.PFeatureGroupCardinality;
import vm.PFeatureModel;
import vm.PFeatureRef;
import vm.PUnaryExpression;
import vm.PUninaryOperator;
import vm.VmFactory;

/**
 * Algorithm for synthesizing feature models from PCMs and dependencies graphs. 
 * @author David Mendez-Acuna
 *
 */
public class VmSynthesis {
	
	// ----------------------------------------------------------
	// Attributes
	// ----------------------------------------------------------
	
	private static VmSynthesis instance;
	
	// ----------------------------------------------------------
	// Constructor and singleton
	// ----------------------------------------------------------
	
	private VmSynthesis(){
		
	}
	
	public static VmSynthesis getInstance(){
		if(instance == null)
			instance = new VmSynthesis();
		return instance;
	}
	
	// ----------------------------------------------------------
	// Methods
	// ----------------------------------------------------------
	
	public PFeatureModel synthesizeOpenFeatureModel(DependencyGraph dependenciesGraph){
		PFeatureModel featureModel = VmFactory.eINSTANCE.createPFeatureModel();
		
		//TODO Put a real family name to the feature model.
		featureModel.setName("FeatureModel");
		
		PFeature rootFeature = VmFactory.eINSTANCE.createPFeature();
		rootFeature.setMandatory(true);
		rootFeature.setName("Root");
		
		// Step 2: The first level features are those vertex in the graph such that they have not dependencies with other vertex.
		List<DependencyVertex> firstLevelVertex = dependenciesGraph.getIndendependentVertex();
		for (DependencyVertex dependencyVertex : firstLevelVertex) {
			dependencyVertex.setIncluded(true);
			
			PFeature feature = VmFactory.eINSTANCE.createPFeature();
			feature.setName(dependencyVertex.getIdentifier());
			feature.setParent(rootFeature);
			
			PFeatureGroup featureGroup = VmFactory.eINSTANCE.createPFeatureGroup();
			featureGroup.getFeatures().add(feature);
			
			PFeatureGroupCardinality cardinality = VmFactory.eINSTANCE.createPFeatureGroupCardinality();
			cardinality.setLowerBound(0);
			cardinality.setUpperBound(1);
			featureGroup.setCardinality(cardinality);
			
			rootFeature.getGroups().add(featureGroup);
		}
		
		List<DependencyVertex> currentLevel = firstLevelVertex;
		
		while(!dependenciesGraph.allIncluded()){
			List<DependencyVertex> directDependentVertex = dependenciesGraph.getDirectDependentVertex(currentLevel);
			for (DependencyVertex dependencyVertex : directDependentVertex) {
				if(!dependencyVertex.isIncluded()){
					PFeature feature = VmFactory.eINSTANCE.createPFeature();
					feature.setName(dependencyVertex.getIdentifier());
					dependencyVertex.setIncluded(true);
					
					boolean first = true;
					for (DependencyArc dependencyArc : dependencyVertex.getOutgoingArcs()) {
						if(currentLevel.contains(dependencyArc.getTo())){
							if(first){
								// Esta feature no tiene padre. Asignelo.
								PFeature parent = this.getPFeatureByName(dependencyArc.getTo().getIdentifier(), rootFeature);
								feature.setParent(parent);
								
								PFeatureGroup featureGroup = VmFactory.eINSTANCE.createPFeatureGroup();
								featureGroup.getFeatures().add(feature);
								
								PFeatureGroupCardinality cardinality = VmFactory.eINSTANCE.createPFeatureGroupCardinality();
								cardinality.setLowerBound(0);
								cardinality.setUpperBound(1);
								featureGroup.setCardinality(cardinality);
								
								parent.getGroups().add(featureGroup);
							}else{
								// Esta feature ya tiene padre. Cree la constraint.
								PFeature requiredFeature = this.getPFeatureByName(dependencyArc.getTo().getIdentifier(), rootFeature);
								PConstraint constraint = VmFactory.eINSTANCE.createPConstraint();
								PBinaryExpression binaryExpression = VmFactory.eINSTANCE.createPBinaryExpression();
								PFeatureRef left = VmFactory.eINSTANCE.createPFeatureRef();
								left.setRef(feature);
								PFeatureRef right = VmFactory.eINSTANCE.createPFeatureRef();
								right.setRef(requiredFeature);
								binaryExpression.setLeft(left);
								binaryExpression.setRight(right);
								binaryExpression.setOperator(PBinaryOperator.IMPLIES);
								constraint.setExpression(binaryExpression);
								constraint.setName(left.getRef().getName() + " implies " + right.getRef().getName());
								featureModel.getConstraints().add(constraint);
							}
							first = false;
						}
					}
				}
			}
			currentLevel = directDependentVertex;
		}
		
		featureModel.setRootFeature(rootFeature);
		return featureModel;
	}
	
	public PFeatureModel synthesizeClosedFeatureModel(String PCM, PFeatureModel openFeatureModel) throws Exception{
		PFeatureModel closedFeatureModel = this.cloneFeatureModel(openFeatureModel);
		PCMQueryServices.getInstance().loadPCM(PCM);
		
		this.identifyMandatoryFeatures(closedFeatureModel);
		this.identifyXORs(closedFeatureModel);
		
		return closedFeatureModel;
	}
	
	/**
	 * Identifies the mandatory features in the feature model received in the parameter.
	 * @param fm. Feature model under study. 
	 */
	public void identifyMandatoryFeatures(PFeatureModel fm){
		for (PFeature child : fm.getRootFeature().getChildren()) {
			this.identifyMandatoryFeatures(child, true);
		}
	}
	
	/**
	 * Identifies the mandatory features recursively starting by the feature in the parameter.
	 * @param rootFeature. The root feature of the hierarchy.
	 * @param isRoot. Indicates if the current feature is the feature of the feature model. 
	 */
	private void identifyMandatoryFeatures(PFeature rootFeature, boolean isRoot) {
		if(isRoot){
			if(PCMQueryServices.getInstance().existsProductWithoutFeature(rootFeature.getName()))
				rootFeature.setMandatory(false);
			else{
				rootFeature.setMandatory(true);
				if(rootFeature.getParent() != null){
					for (PFeatureGroup parentGroup : rootFeature.getParent().getGroups()) {
						if(parentGroup.getFeatures().get(0).getName().equals(rootFeature.getName())){
							parentGroup.getCardinality().setLowerBound(1);
							parentGroup.getCardinality().setUpperBound(1);
						}
					}
				}
			}
		}else{
			boolean optional = PCMQueryServices.getInstance().
				existsProductWithFeatureAWithoutFeatureB(rootFeature.getParent().getName(), rootFeature.getName());
			
			if(optional){
				rootFeature.setMandatory(false);
			}else{
				rootFeature.setMandatory(true);
				if(rootFeature.getParent() != null){
					for (PFeatureGroup parentGroup : rootFeature.getParent().getGroups()) {
						if(parentGroup.getFeatures().get(0).getName().equals(rootFeature.getName())){
							parentGroup.getCardinality().setLowerBound(1);
							parentGroup.getCardinality().setUpperBound(1);
						}
					}
				}
			}
		}
		
		for (PFeature child : rootFeature.getChildren()) {
			this.identifyMandatoryFeatures(child, false);
		}
	}
	
	/**
	 * Identifies the XOR groups in the feature model received in the parameter.
	 * @param fm. Feature model under study. 
	 */
	public void identifyXORs(PFeatureModel fm) {
		this.identifyXORs(fm.getRootFeature());
	}
	
	/**
	 * Identifies the XOR groups recursively starting by the feature in the parameter.
	 * @param rootFeature. The root feature of the hierarchy.
	 * @param allXORs. A collection where the XOR groups will be acumulated. 
	 */
	private void identifyXORs(PFeature rootFeature){
		ArrayList<ArrayList<PFeature>> allXORs = new ArrayList<ArrayList<PFeature>>();
		ArrayList<PFeature> initialGroup = new ArrayList<PFeature>();
		for (PFeatureGroup group : rootFeature.getGroups()) {
			if(group.getCardinality().getLowerBound() == 0 && group.getCardinality().getUpperBound() == 1 &&
					group.getFeatures().size() > 0){
				initialGroup.add(group.getFeatures().get(0));
			}
		}
		this.identifyXORByCombination(initialGroup, allXORs);
		for (PFeature child : rootFeature.getChildren()) {
			this.identifyXORs(child);
		}
		
		this.sortBySize(allXORs);
		
		ArrayList<PFeature> added = new ArrayList<PFeature>();
		
		for (ArrayList<PFeature> xor : allXORs) {
			if(this.isStillValid(added, xor)){
				// Create new XOR group
				for (PFeature pFeature : xor) {
					PFeatureGroup featureGroup = this.getGroupByFeature(rootFeature, pFeature);
					rootFeature.getGroups().remove(featureGroup);
				}
				this.createXORGroup(rootFeature, xor);
				// Add to the already considered elements. 
				added.addAll(xor);
			}
		}
	}

	private PFeatureGroup getGroupByFeature(PFeature rootFeature, PFeature feature) {
		for (PFeatureGroup currentGroup : rootFeature.getGroups()) {
			if(currentGroup.getFeatures().contains(feature))
				return currentGroup;
		}
		return null;
	}

	private void createXORGroup(PFeature rootFeature, ArrayList<PFeature> xor) {
		PFeatureGroup XORGroup = VmFactory.eINSTANCE.createPFeatureGroup();
		XORGroup.getFeatures().addAll(xor);
		
		PFeatureGroupCardinality cardinality = VmFactory.eINSTANCE.createPFeatureGroupCardinality();
		ArrayList<String> features = new ArrayList<String>();
		for (PFeature pFeature : xor) {
			features.add(pFeature.getName());
		}
		ArrayList<String> consideredProducts = new ArrayList<String>();
		for (PFeature pFeature : xor) {
			ArrayList<String> currentProducts = PCMQueryServices.getInstance().getProductsContainingFeature(pFeature.getName());
			for (String p : currentProducts) {
				if(!consideredProducts.contains(p))
					consideredProducts.add(p);
			}
		}
		
		System.out.println("xor: " + xor);
		System.out.println("consideredProducts: " + consideredProducts);
		cardinality.setLowerBound(PCMQueryServices.getInstance().minFeaturesOccurrences(features, consideredProducts));
		cardinality.setUpperBound(1);
		XORGroup.setCardinality(cardinality);
		
		rootFeature.getGroups().add(XORGroup);
	}
	
	private void sortBySize(ArrayList<ArrayList<PFeature>> group) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Returns true if the XOR in the parameter does not contains any of the features in the array
	 * @param features
	 * @param xor
	 * @return
	 */
	private boolean isStillValid(ArrayList<PFeature> features, ArrayList<PFeature> xor) {
		for (int i = 0; i < features.size(); i++) {
			for (int j = 0; j < xor.size(); j++) {
				if(features.get(i).getName().equals(xor.get(j).getName()))
					return false;
			}
		}
		return true;
	}

	/**
	 * Identifies the XOR groups existing in the feature in the parameter. This method considers 
	 * all the possible group combinations.
	 * @param group
	 * @param allXORs
	 */
	private void identifyXORByCombination(ArrayList<PFeature> group, ArrayList<ArrayList<PFeature>> allXORs){
		ArrayList<String> features = new ArrayList<String>();
		for (PFeature feature : group) {
			features.add(feature.getName());
		}
		boolean xor = PCMQueryServices.getInstance().xor(features);
		if(xor && group.size() >= 2){
			allXORs.add(group);
			return;
		}
		else{
			for (PFeature feature : group) {
				ArrayList<PFeature> recursiveFeatures = new ArrayList<PFeature>();
				for (PFeature recursiveFeature : group) {
					if(!recursiveFeature.getName().equals(feature.getName()))
						recursiveFeatures.add(recursiveFeature);
				}
				if(recursiveFeatures.size() >= 2){
					this.identifyXORByCombination(recursiveFeatures, allXORs);
				}
			}
		}
	}

	// ----------------------------------------------------------
	// Auxiliary Methods
	// ----------------------------------------------------------
	
	/**
	 * Clones the feature model in the parameter.
	 * @param openFeatureModel
	 * @return
	 * @throws Exception
	 */
	public PFeatureModel cloneFeatureModel(PFeatureModel openFeatureModel) throws Exception {
		PFeatureModel clone = VmFactory.eINSTANCE.createPFeatureModel();
		clone.setName(openFeatureModel.getName());
		clone.setRootFeature(this.cloneFeature(openFeatureModel.getRootFeature()));
		
		for (PConstraint constraint : openFeatureModel.getConstraints()) {
			PConstraint clonedConstraint = this.cloneConstraint(clone.getRootFeature(), constraint);
			clone.getConstraints().add(clonedConstraint);
		}
		return clone;
	}

	/**
	 * Clones (recursively) the feature in the parameter.
	 * @param rootFeature
	 * @return
	 */
	private PFeature cloneFeature(PFeature rootFeature) {
		PFeature clone = VmFactory.eINSTANCE.createPFeature();
		clone.setMandatory(rootFeature.isMandatory());
		clone.setName(rootFeature.getName());
		
		for (PFeature child : rootFeature.getChildren()) {
			PFeature cloneChild = this.cloneFeature(child);
			clone.getChildren().add(cloneChild);
		}
		
		for (PFeatureGroup group : rootFeature.getGroups()) {
			PFeatureGroup newGroup = this.cloneFeatureGroup(group);
			clone.getGroups().add(newGroup);
			
			for (PFeature feature : group.getFeatures()) {
				PFeature groupFeature = this.getPFeatureByName(feature.getName(), clone);
				newGroup.getFeatures().add(groupFeature);
			}
		}
		return clone;
	}

	/**
	 * Clones the group in the parameter. 
	 * @param group
	 * @return
	 */
	private PFeatureGroup cloneFeatureGroup(PFeatureGroup group) {
		PFeatureGroup clone = VmFactory.eINSTANCE.createPFeatureGroup();
		PFeatureGroupCardinality clonedCardinality = this.cloneFeatureGroupCardinality(group.getCardinality());
		clone.setCardinality(clonedCardinality);
		return clone;
	}
	
	/**
	 * Clones the feature group cardinality in the parameter.
	 * @param cardinality
	 * @return
	 */
	private PFeatureGroupCardinality cloneFeatureGroupCardinality(
			PFeatureGroupCardinality cardinality) {
		PFeatureGroupCardinality clone = VmFactory.eINSTANCE.createPFeatureGroupCardinality();
		clone.setLowerBound(cardinality.getLowerBound());
		clone.setUpperBound(cardinality.getUpperBound());
		return clone;
	}

	/**
	 * Clones the constraint in the parameter.
	 * @param root
	 * @param constraint
	 * @return
	 * @throws Exception
	 */
	private PConstraint cloneConstraint(PFeature root, PConstraint constraint) throws Exception {
		PConstraint clone = VmFactory.eINSTANCE.createPConstraint();
		clone.setName(constraint.getName());
		clone.setExpression(this.cloneExpression(root, constraint.getExpression()));
		return clone;
	}
	
	/**
	 * Clones the expression in the parameter.
	 * @param root
	 * @param expression
	 * @return
	 * @throws Exception
	 */
	private PBooleanExpression cloneExpression(PFeature root, PBooleanExpression expression) throws Exception {
		if(expression instanceof PBinaryExpression){
			PBinaryExpression binaryExpression = (PBinaryExpression)expression;
			PBinaryExpression clone = VmFactory.eINSTANCE.createPBinaryExpression();
			clone.setLeft(this.cloneExpression(root, binaryExpression.getLeft()));
			clone.setRight(this.cloneExpression(root, binaryExpression.getRight()));
			clone.setOperator(this.getOperator(binaryExpression.getOperator()));
			return clone;
		}
		else if(expression instanceof PFeatureRef){
			PFeatureRef featureRef = (PFeatureRef) expression;
			PFeatureRef clone = VmFactory.eINSTANCE.createPFeatureRef();
			clone.setRef(this.getPFeatureByName(featureRef.getRef().getName(), root));
			return clone;
		}
		else if(expression instanceof PUnaryExpression){
			PUnaryExpression punaryExpression = (PUnaryExpression) expression;
			PUnaryExpression clone = VmFactory.eINSTANCE.createPUnaryExpression();
			clone.setExpr(this.cloneExpression(root, punaryExpression));
			clone.setOperator(this.getOperator(punaryExpression.getOperator()));
			return clone;
		}else{
			throw new Exception("Type does not supported!");
		}
	}

	private PBinaryOperator getOperator(PBinaryOperator operator) {
		if(operator.getName().equals(PBinaryOperator.AND))
			return PBinaryOperator.AND;
		else if(operator.getName().equals(PBinaryOperator.OR))
			return PBinaryOperator.OR;
		else if(operator.getName().equals(PBinaryOperator.IMPLIES))
			return PBinaryOperator.IMPLIES;
		else if(operator.getName().equals(PBinaryOperator.XOR))
			return PBinaryOperator.XOR;
		else
			return null;
	}
	
	private PUninaryOperator getOperator(PUninaryOperator operator) {
		if(operator.getName().equals(PUninaryOperator.NOT))
			return PUninaryOperator.NOT;
		else
			return null;
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

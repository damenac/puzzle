package fr.inria.diverse.puzzle.vmsynthesis.impl;

import java.util.List;

import fr.inria.diverse.k3.sle.common.graphs.DependencyArc;
import fr.inria.diverse.k3.sle.common.graphs.DependencyGraph;
import fr.inria.diverse.k3.sle.common.graphs.DependencyVertex;
import vm.PBinaryExpression;
import vm.PBinaryOperator;
import vm.PBooleanExpression;
import vm.PConstraint;
import vm.PFeature;
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
		
		PFeature rootFeature = VmFactory.eINSTANCE.createPFeature();
		rootFeature.setMandatory(true);
		rootFeature.setName("Root");
		
		// Step 2: The first level features are those vertex in the graph such that they have not dependencies with other vertex.
		List<DependencyVertex> firstLevelVertex = dependenciesGraph.getIndendependentVertex();
		for (DependencyVertex dependencyVertex : firstLevelVertex) {
			PFeature feature = VmFactory.eINSTANCE.createPFeature();
			feature.setName(dependencyVertex.getIdentifier());
			feature.setParent(rootFeature);
			dependencyVertex.setIncluded(true);
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
		
		this.identifyMandatoryFeatures(closedFeatureModel.getRootFeature());
		
		return closedFeatureModel;
	}
	
	private void identifyMandatoryFeatures(PFeature rootFeature) {
		if(PCMQueryServices.getInstance().existsProductWithoutFeature(rootFeature.getName()))
			rootFeature.setMandatory(false);
		else
			rootFeature.setMandatory(true);
		
		for (PFeature child : rootFeature.getChildren()) {
			this.identifyMandatoryFeatures(child);
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
	private PFeatureModel cloneFeatureModel(PFeatureModel openFeatureModel) throws Exception {
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

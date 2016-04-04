package fr.inria.diverse.puzzle.vmsynthesis.impl;

import java.util.Iterator;

import vm.BinaryExpression;
import vm.BinaryOperator;
import vm.BooleanExpression;
import vm.LanguageConstraint;
import vm.LanguageFeature;
import vm.LanguageFeatureGroup;
import vm.LanguageFeatureModel;
import vm.LanguageFeatureRef;
import vm.UnaryExpression;
import vm.UninaryOperator;
import es.us.isa.FAMA.models.FAMAAttributedfeatureModel.AttributedFeature;
import es.us.isa.FAMA.models.FAMAAttributedfeatureModel.ComplexConstraint;
import es.us.isa.FAMA.models.FAMAAttributedfeatureModel.FAMAAttributedFeatureModel;
import es.us.isa.FAMA.models.FAMAAttributedfeatureModel.Relation;
import es.us.isa.FAMA.models.featureModel.Cardinality;
import es.us.isa.FAMA.models.featureModel.Constraint;
import es.us.isa.FAMA.models.featureModel.KeyWords;
import es.us.isa.util.Node;
import es.us.isa.util.Tree;

/**
 * Provides translation from feature models from the puzzle format to FAMA attributed models.
 * @author David Mendez-Acuna
 *
 */
public class FromPuzzleToFAMAAttributed {

	// -----------------------------------------------------------
	// Attributes
	// -----------------------------------------------------------
	
	private static FromPuzzleToFAMAAttributed instance;
	
	// -----------------------------------------------------------
	// Constructor and singleton
	// -----------------------------------------------------------
	
	private FromPuzzleToFAMAAttributed(){
		
	}
	
	public static FromPuzzleToFAMAAttributed getInstance(){
		if(instance == null)
			instance = new FromPuzzleToFAMAAttributed();
		return instance;
	}

	// -----------------------------------------------------------
	// Methods
	// -----------------------------------------------------------

	/**
	 * Translates a feature model from the Puzzle format to FAMA attributed model.
	 * @param featureModel. Feature model in the Puzzle format.
	 * @return
	 */
	public FAMAAttributedFeatureModel fromPuzzleToFamaAttributed(
			LanguageFeatureModel featureModel) {
		
		FAMAAttributedFeatureModel famaFeatureModel = new FAMAAttributedFeatureModel();
		famaFeatureModel.setRoot(fromFAMAFeatureToLanguageFeature(featureModel.getRootFeature()));
		
		for (LanguageConstraint pConstraint : featureModel.getConstraints()) {
			Tree<String> constraintAST = new Tree<String>(this.createNode(pConstraint.getExpression()));
			Constraint constraint = new ComplexConstraint(constraintAST);
			famaFeatureModel.addConstraint(constraint);
		}
		return famaFeatureModel;
	}
	
	private Node<String> createNode(BooleanExpression expression) {
		if(expression instanceof BinaryExpression){
			BinaryExpression binaryExpression = (BinaryExpression) expression;
			String operator = this.getOperatorByString(binaryExpression.getOperator().getName());
			Node<String> treeRoot = new Node<String>(operator);
			Node<String> leftNode = this.createNode(binaryExpression.getLeft());
			Node<String> rightNode = this.createNode(binaryExpression.getRight());
			treeRoot.addChild(leftNode);
			treeRoot.addChild(rightNode);
			return treeRoot;
		}
		else if(expression instanceof UnaryExpression){
			UnaryExpression unaryExpression = (UnaryExpression) expression;
			String operator = this.getOperatorByString(unaryExpression.getOperator().getName());
			Node<String> treeRoot = new Node<String>(operator);
			Node<String> exprNode = this.createNode(unaryExpression.getExpr());
			treeRoot.addChild(exprNode);
			return treeRoot;
		}
		else if(expression instanceof LanguageFeatureRef){
			LanguageFeatureRef featureRef = (LanguageFeatureRef) expression;
			Node<String> treeRoot = new Node<String>(featureRef.getRef().getName());
			return treeRoot;
		}
		else
			return null;
	}

	private String getOperatorByString(String name) {
		if(name.equals(BinaryOperator.IMPLIES.getName()))
			return KeyWords.IMPLIES;
		else if(name.equals(BinaryOperator.AND.getName()))
			return KeyWords.AND;
		else if(name.equals(BinaryOperator.OR.getName()))
			return KeyWords.OR;
		else if(name.equals(UninaryOperator.NOT.getName()))
			return KeyWords.NOT;
		else
			return null;
	}

	/**
	 * Finds a FAMA feature by the name in the features model in the parameter
	 * @param name
	 * @param root
	 * @return
	 */
	public AttributedFeature getFamaFeatureByName(String name, AttributedFeature root) {
		if(root.getName().equals(name))
			return root;
		else{
			Iterator<Relation> it = root.getRelations();
			while (it.hasNext()) {
				Relation relation = (Relation) it.next();
				Iterator<AttributedFeature> ito = relation.getDestination();
				while (ito.hasNext()) {
					AttributedFeature attributedFeature = (AttributedFeature) ito.next();
					if(attributedFeature != null)
						return attributedFeature;
				}
			}
		}
		return null;
	}

	/**
	 * In-deep translating of the FAMA feature in the parameter to a new puzzle feature.
	 * @param famaFeature. The FAMA feature that should be translated. 
	 * @return
	 */
	private AttributedFeature fromFAMAFeatureToLanguageFeature(LanguageFeature pFeature){
		AttributedFeature feature = new AttributedFeature(pFeature.getName());
		
		for (LanguageFeatureGroup group : pFeature.getGroups()) {
			Relation relation = new Relation();
			relation.setParent(feature);
			
			Cardinality cardinality = new Cardinality(group.getCardinality().getLowerBound(), group.getCardinality().getUpperBound());
			relation.addCardinality(cardinality);
			
			for (LanguageFeature groupFeature : group.getFeatures()) {
				AttributedFeature relationFeature = this.fromFAMAFeatureToLanguageFeature(groupFeature);
				relation.addDestination(relationFeature);
			}
			
			feature.addRelation(relation);
		}
		return feature;
	}
}
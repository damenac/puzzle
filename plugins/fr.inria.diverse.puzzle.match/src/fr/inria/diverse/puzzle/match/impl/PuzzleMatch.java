package fr.inria.diverse.puzzle.match.impl;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.inria.diverse.puzzle.match.vo.MatchingDiagnostic;
import fr.inria.diverse.puzzle.match.vo.MatchingDiagnosticItem;

/**
 * Implementation of matching for metamodels-based DSLs
 * DiverSE Team - INRIA/IRISA Rennes.
 * 
 * @author David Mendez-Acuna
 */
public class PuzzleMatch {

	// -----------------------------------------------------
	// Attributes
	// -----------------------------------------------------
	
	private static PuzzleMatch instance;
	
	// -----------------------------------------------------
	// Constructor and singleton
	// -----------------------------------------------------
	
	private PuzzleMatch(){}
	
	public static PuzzleMatch getInstance(){
		if(instance == null)
			instance = new PuzzleMatch();
		return instance;
	}
	
	// -----------------------------------------------------
	// Methods
	// -----------------------------------------------------
	
	/**
	 * Matches two ecore objects and departing from the root types i.e., packages
	 * @param left
	 * @param right
	 * @return
	 */
	public MatchingDiagnostic match(EObject left, EObject right){
		MatchingDiagnostic diagnostic = new MatchingDiagnostic();
		ArrayList<MatchingDiagnosticItem> matches = new ArrayList<MatchingDiagnosticItem>();
		
		if(left instanceof EPackage && right instanceof EPackage){
			matchEPackage((EPackage)left, (EPackage)right, matches);
		}
		diagnostic.getItems().addAll(matches);
		return diagnostic;
	}
	
	/**
	 * Matches two packages and their internal elements i.e., classifiers
	 * @param left
	 * @param right
	 * @param matches
	 */
	private void matchEPackage(EPackage left, EPackage right, ArrayList<MatchingDiagnosticItem> matches){
		if(left.getName().equals(right.getName())){
			MatchingDiagnosticItem match = new MatchingDiagnosticItem(left, right);
			matches.add(match);
		}
		
		for (int i = 0; i < left.getEClassifiers().size(); i++) {
			for (int j = 0; j < right.getEClassifiers().size(); j++) {
				EClassifier candiateI = left.getEClassifiers().get(i);
				EClassifier candiateJ = right.getEClassifiers().get(j);
				
				if(eClassifiersEqual(candiateI, candiateJ)){
					MatchingDiagnosticItem match = new MatchingDiagnosticItem(candiateI, candiateJ);
					matches.add(match);
					matchEClassifiers(candiateI, candiateJ, matches);
				}
			}
		}
		
		for (int i = 0; i < left.getESubpackages().size(); i++) {
			for (int j = 0; j < right.getESubpackages().size(); j++) {
				EPackage candiateI = left.getESubpackages().get(i);
				EPackage candiateJ = right.getESubpackages().get(j);
				this.matchEPackage(candiateI, candiateJ, matches);
			}
		}
	}

	/**
	 * Compares two classifiers in the parameter
	 * @param left
	 * @param right
	 * @return
	 */
	private boolean eClassifiersEqual(EClassifier left, EClassifier right){
		return left.getName().equals(right.getName()) && left.getClass().getName().equals(right.getClass().getName());
	}
	
	/**
	 * Matches two classifiers according to their types i.e., classes or enumerations
	 * @param left
	 * @param right
	 * @param matches
	 */
	private void matchEClassifiers(EClassifier left,
			EClassifier right, ArrayList<MatchingDiagnosticItem> matches) {
		
		if(left instanceof EClass && right instanceof EClass){
			matchEClasses((EClass)left, (EClass)right, matches);
		}
		else if(left instanceof EEnum && right instanceof EEnum){
			matchEEnums((EEnum)left, (EEnum)right, matches);
		}
	}

	/**
	 * Matches two classes with their internal elements i.e., structural features and operations.
	 * @param left
	 * @param right
	 * @param matches
	 */
	private void matchEClasses(EClass left, EClass right,
			ArrayList<MatchingDiagnosticItem> matches) {
		
		for (int i = 0; i < left.getEStructuralFeatures().size(); i++) {
			EStructuralFeature candidateI = left.getEStructuralFeatures().get(i);
			for (int j = 0; j < right.getEStructuralFeatures().size(); j++) {
				EStructuralFeature candidateJ = right.getEStructuralFeatures().get(j);
				matchEStructuralFeatures(candidateI, candidateJ, matches);
			}
		}
		
		for (int i = 0; i < left.getEOperations().size(); i++) {
			EOperation candidateI = left.getEOperations().get(i);
			for (int j = 0; j < right.getEOperations().size(); j++) {
				EOperation candidateJ = right.getEOperations().get(j);
				matchEOperations(candidateI, candidateJ, matches);
			}
		}
	}
	
	/**
	 * Matches two structural features according to their types i.e., classes or references
	 * @param candidateI
	 * @param candidateJ
	 * @param matches
	 */
	private void matchEStructuralFeatures(EStructuralFeature left,
			EStructuralFeature right,
			ArrayList<MatchingDiagnosticItem> matches) {
		
		if(eStructuralFeaturesEqual(left, right)){
			if(left instanceof EReference && right instanceof EReference)
				matchEReferences(left, right, matches);
		}
	}

	/**
	 * Compares two structural features according to their names and types.
	 * @param left
	 * @param right
	 * @return
	 */
	private boolean eStructuralFeaturesEqual(EStructuralFeature left,
			EStructuralFeature right) {
		return left.getName().equals(right.getName()) && left.getClass().getName().equals(right.getClass().getName());
	}

	/**
	 * Matches two references
	 * @param left
	 * @param right
	 * @param matches
	 */
	private void matchEReferences(EStructuralFeature left,
			EStructuralFeature right, ArrayList<MatchingDiagnosticItem> matches) {
		
		//TODO Improve comparison while considering types and parameters. 
		if(left.getName().equals(right.getName())){
			MatchingDiagnosticItem match = new MatchingDiagnosticItem(left, right);
			matches.add(match);
		}
		
	}
	
	/**
	 * Matches two operations
	 * @param candidateI
	 * @param candidateJ
	 * @param matches
	 */
	private void matchEOperations(EOperation left, EOperation right,
			ArrayList<MatchingDiagnosticItem> matches) {
		
		//TODO Improve comparison while considering types and parameters. 
		if(left.getName().equals(right.getName())){
			MatchingDiagnosticItem match = new MatchingDiagnosticItem(left, right);
			matches.add(match);
		}
		
	}

	/**
	 * Matches two enumerations and their internal elements
	 * @param left
	 * @param right
	 * @param matches
	 */
	private void matchEEnums(EEnum left, EEnum right,
			ArrayList<MatchingDiagnosticItem> matches) {
		// TODO Auto-generated method stub
		
	}
}
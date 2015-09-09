package fr.inria.diverse.k3.sle.common.utils;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;

/**
 * @author David Mendez Acuna
 */
public class EcoreQueries {

	/**
	 * Returns the eclass by the name in the parameter.
	 * @param metamodel
	 * @return
	 */
	public static EClass searchEClassByName(EPackage language, String name) {
		for (EClassifier eClassifier : language.getEClassifiers()) {
			if(eClassifier instanceof EClass && ((EClass)eClassifier).getName().equals(name))
				return (EClass)eClassifier;
		}
		for(EPackage ePackage : language.getESubpackages()){
			EClass eClass = searchEClassByName(ePackage, name);
			if(eClass != null)
				return eClass;
		}
		return null;
	}
	
	public static EClassifier searchEClassifierByName(EPackage language, String name) {
		for (EClassifier eClassifier : language.getEClassifiers()) {
			if(eClassifier.getName().equals(name))
				return eClassifier;
		}
		for(EPackage ePackage : language.getESubpackages()){
			EClassifier eClassifier = searchEClassifierByName(ePackage, name);
			if(eClassifier != null)
				return eClassifier;
		}
		return null;
	}
	
	/**
	 * Searches a classifier in the language by using a specific comparison operator. 
	 * @param language
	 * @param toCompare
	 * @param comparisonOperator
	 * @return
	 */
	public static EClassifier searchEClassifierByComparisonOperator(EPackage language,
			EClassifier toCompare, ConceptComparison comparisonOperator) {
		for (EClassifier eClassifier : language.getEClassifiers()) {
			if(comparisonOperator.equals(eClassifier, toCompare))
				return eClassifier;
		}
		for(EPackage ePackage : language.getESubpackages()){
			EClassifier eClassifier = searchEClassifierByComparisonOperator(ePackage, toCompare, comparisonOperator);
			if(eClassifier != null)
				return eClassifier;
		}
		return null;
	}
	
	public static EReference searchEReferenceByName(EClass eClass, String name){
		for (EStructuralFeature eStructuralFeature : eClass.getEStructuralFeatures()) {
			if((eStructuralFeature instanceof EReference) && (eStructuralFeature.getName().equals(name))){
				return (EReference)eStructuralFeature;
			}
		}
		return null;
	}
	
	/**
	 * Returns the eclassifier annotated with @Required
	 * TODO This should support not only one but several annotated eclassifiers.
	 * @param metamodel
	 * @return
	 */
	public static EClassifier searchRequiredConcept(EPackage metamodel) {
		for (EClassifier eClassifier : metamodel.getEClassifiers()) {
			if(eClassifier.getEAnnotation("Required") != null)
				return eClassifier;
		}
		for(EPackage ePackage : metamodel.getESubpackages()){
			EClassifier annotatedEClassifier = searchRequiredConcept(ePackage);
			if(annotatedEClassifier != null)
				return annotatedEClassifier;
		}
		return null;
	}
	
	/**
	 * Returns true if the 'pivot' class is contained directly by the 'eClass class' in the language 'language'. 
	 * Otherwise, the method returns false.
	 * @param language
	 * @param father
	 * @param child
	 * @return
	 */
	public static boolean isDirectlyContainedBy(EPackage language, EClass pivot, EClass eClass){
		for (EStructuralFeature eStructuralFeature : eClass.getEStructuralFeatures()) {
			if(eStructuralFeature instanceof EReference){
				EReference eReference = (EReference) eStructuralFeature;
				if(eReference.isContainment() && eReference.getEType().getName().equals(pivot.getName())){
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Returns true if the 'pivot' class is contained directly or indirectly by the 'eClass class' in the language 'language'. 
	 * Otherwise, the method returns false.
	 * @param language
	 * @param father
	 * @param child
	 * @return
	 */
	public static boolean isRecursivelyContainedBy(EPackage language, EClass pivot, EClass eClass){
		if(isDirectlyContainedBy(language, pivot, eClass))
			return true;
		
		for (EStructuralFeature eStructuralFeature : eClass.getEStructuralFeatures()) {
			if(eStructuralFeature instanceof EReference){
				EReference eReference = (EReference) eStructuralFeature;
				if(eReference.isContainment() && isRecursivelyContainedBy(language, pivot, (EClass)eReference.getEType())){
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Returns true of the 'pivot' class contains directly the 'eClass' class in the language 'language'.
	 * Otherwise, the method returns false.
	 * @param language
	 * @param container
	 * @param contained
	 * @return
	 */
	public static boolean isDirectContainerOf(EPackage language, EClass pivot, EClass eClass){
		for (EStructuralFeature eStructuralFeature : pivot.getEStructuralFeatures()) {
			if(eStructuralFeature instanceof EReference){
				EReference eReference = (EReference) eStructuralFeature;
				if(eReference.isContainment() && eReference.getEType().getName().equals(eClass.getName())){
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Returns true of the 'pivot' class contains directly or indirectly the 'eClass' class in the language 'language'.
	 * Otherwise, the method returns false.
	 * @param language
	 * @param container
	 * @param contained
	 * @return
	 */
	public static boolean isRecursiveContainerOf(EPackage language, EClass pivot, EClass eClass){
		if(isDirectContainerOf(language, pivot, eClass))
			return true;
		
		for (EStructuralFeature eStructuralFeature : pivot.getEStructuralFeatures()) {
			if(eStructuralFeature instanceof EReference){
				EReference eReference = (EReference) eStructuralFeature;
				if(eReference.isContainment() && isRecursiveContainerOf(language, (EClass)eReference.getEType(), eClass)){
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Returns true if the 'pivot' class is referenced directly or indirectly by the 'eClass class' in the language 'language'. 
	 * Otherwise, the method returns false.
	 * @param language
	 * @param father
	 * @param child
	 * @return
	 */
	public static boolean isDirectlylyReferencedBy(EPackage language, EClass pivot, EClass eClass){
		for (EStructuralFeature eStructuralFeature : eClass.getEStructuralFeatures()) {
			if(eStructuralFeature instanceof EReference){
				EReference eReference = (EReference) eStructuralFeature;
				if(eReference.getEType().getName().equals(pivot.getName())){
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Returns true if the 'pivot' class is referenced directly or indirectly by the 'eClass class' in the language 'language'. 
	 * Otherwise, the method returns false.
	 * @param language
	 * @param father
	 * @param child
	 * @return
	 */
	public static boolean isRecursivelyReferencedBy(EPackage language, EClass pivot, EClass eClass){
		if(isDirectlylyReferencedBy(language, pivot, eClass))
			return true;
		
		for (EStructuralFeature eStructuralFeature : eClass.getEStructuralFeatures()) {
			if(eStructuralFeature instanceof EReference){
				EReference eReference = (EReference) eStructuralFeature;
				if(eReference.isContainment() && isRecursivelyContainedBy(language, pivot, (EClass)eReference.getEType())){
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Returns true of the 'pivot' class refers directly the 'eClass' class in the language 'language'.
	 * Otherwise, the method returns false.
	 * @param language
	 * @param container
	 * @param contained
	 * @return
	 */
	public static boolean isDirectReferenceOf(EPackage language, EClass pivot, EClass eClass){
		for (EStructuralFeature eStructuralFeature : pivot.getEStructuralFeatures()) {
			if(eStructuralFeature instanceof EReference){
				EReference eReference = (EReference) eStructuralFeature;
				if(eReference.getEType().getName().equals(eClass.getName())){
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Returns true of the 'pivot' class refers directly or indirectly the 'eClass' class in the language 'language'.
	 * Otherwise, the method returns false.
	 * @param language
	 * @param container
	 * @param contained
	 * @return
	 */
	public static boolean isRecursiveReferenceOf(EPackage language, EClass pivot, EClass eClass){
		if(isDirectReferenceOf(language, pivot, eClass))
			return true;
		
		for (EStructuralFeature eStructuralFeature : pivot.getEStructuralFeatures()) {
			if(eStructuralFeature instanceof EReference){
				EReference eReference = (EReference) eStructuralFeature;
				if(isRecursiveReferenceOf(language, (EClass)eReference.getEType(), eClass)){
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Returns true of the 'pivot' class is direct ancestor of the 'eClass' class in the language 'language'.
	 * Otherwise, the method returns false.
	 * @param language
	 * @param pivot
	 * @param eClass
	 * @return
	 */
	public static boolean isDirectAncestorOf(EPackage language, EClass pivot, EClass eClass){
		for(EClass superType : eClass.getESuperTypes()){
			if(superType.getName().equals(pivot.getName()))
				return true;
		}
		return false;
	}
	
	/**
	 * Returns true of the 'pivot' class is ancestor directly or indirectly of the 'eClass' class in the language 'language'.
	 * Otherwise, the method returns false.
	 * @param language
	 * @param pivot
	 * @param eClass
	 * @return
	 */
	public static boolean isRecursiveAncestorOf(EPackage language, EClass pivot, EClass eClass){
		if(isDirectAncestorOf(language, pivot, eClass))
			return true;
		
		for(EClass superType : eClass.getESuperTypes()){
			if(isRecursiveAncestorOf(language, pivot, superType))
				return true;
		}
		return false;
	}
	
	/**
	 * Returns true of the 'pivot' class is direct descendent of the 'eClass' class in the language 'language'.
	 * Otherwise, the method returns false.
	 * @param language
	 * @param pivot
	 * @param eClass
	 * @return
	 */
	public static boolean isDirectDescendentOf(EPackage language, EClass pivot, EClass eClass){
		for(EClass superType : pivot.getESuperTypes()){
			if(superType.getName().equals(eClass.getName()))
				return true;
		}
		return false;
	}
	
	/**
	 * Returns true if the 'pivot' class is recursive descendent of the eClass class in the language 'language'. 
	 * Otherwise, the method returns false.
	 * @param language
	 * @param pivot
	 * @param eClass
	 * @return
	 */
	public static boolean isRecursiveDescendentOf(EPackage language, EClass pivot, EClass eClass){
		if(isDirectDescendentOf(language, pivot, eClass))
			return true;
		
		for(EClass superType : pivot.getESuperTypes()){
			if(isRecursiveDescendentOf(language, superType, eClass))
				return true;
		}
		return false;
	}
	
	public static EClassifier getRootClass(EPackage metamodel){
		//TODO To something real here!
		return metamodel.getEClassifiers().get(0);
	}
}
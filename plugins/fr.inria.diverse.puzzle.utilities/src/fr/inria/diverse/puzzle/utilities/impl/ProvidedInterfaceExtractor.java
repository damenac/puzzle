package fr.inria.diverse.puzzle.utilities.impl;

import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

import fr.inria.diverse.k3.sle.common.utils.EcoreQueries;

/**
 * Service to extract the provided interface of a metamodel from the annotations @Provided
 * @author David Mendez-Acuna
 */
public class ProvidedInterfaceExtractor {

	// ----------------------------------------------------------
	// Attributes
	// ----------------------------------------------------------
	
	private static ProvidedInterfaceExtractor instance;
	
	// ----------------------------------------------------------
	// Constructor and singleton
	// ----------------------------------------------------------
	
	private ProvidedInterfaceExtractor(){}
	
	public static ProvidedInterfaceExtractor getInstance(){
		if(instance == null)
			instance = new ProvidedInterfaceExtractor();
		return instance;
	}
	
	// ----------------------------------------------------------
	// Methods
	// ----------------------------------------------------------
	
	/**
	 * Computes the provided interface of the metamodel in the paramter from the annotations @Required
	 * @param metamodel. Input metamodel.
	 * @return
	 */
	public EPackage extractProvidedInterface(EPackage metamodel){
		EPackage providedInterface = EcoreFactory.eINSTANCE.createEPackage();
		providedInterface.setName(metamodel.getName() + "Prov");
		providedInterface.setNsPrefix(metamodel.getNsPrefix() + "Prov");
		providedInterface.setNsURI(metamodel.getNsURI() + "Prov");
		
		Hashtable<String, EClassifier> oldEClassifiers = new Hashtable<String, EClassifier>();
		Hashtable<String, EClassifier> unifiedEClassifiers = new Hashtable<String, EClassifier>();
		
		ArrayList<EClass> annotatedEClasses = new ArrayList<EClass>();
		this.collectProvidedEClasses(annotatedEClasses, metamodel);
		
		for (EClass annotatedEClass : annotatedEClasses) {
			oldEClassifiers.put(annotatedEClass.getName(), annotatedEClass);
			EClass newEClass =this.cloneEClass(EcoreFactory.eINSTANCE, annotatedEClass);
			providedInterface.getEClassifiers().add(newEClass);
			unifiedEClassifiers.put(newEClass.getName(), newEClass);
		}
		
		resolveLocalEAttributes(oldEClassifiers, unifiedEClassifiers, providedInterface);
		resolveLocalEReferences(oldEClassifiers, unifiedEClassifiers, providedInterface, false);
		resolveLocalEOperationTypes(oldEClassifiers, unifiedEClassifiers, providedInterface);
		resolveLocalSuperTypes(oldEClassifiers, unifiedEClassifiers, providedInterface);
		
		return providedInterface;
	}
	
	/**
	 * Collects the eclasses contained in the ePackage annotated with @Provided. 
	 * @param eClasses. Array to store the annotated classes
	 * @param ePackage. EPackage
	 */
	private void collectProvidedEClasses(ArrayList<EClass> eClasses, EPackage ePackage){
		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			if(eClassifier instanceof EClass){
				EClass eClass = (EClass) eClassifier;
				if(eClass.getEAnnotation("Private") == null && eClass.getEAnnotation("Required") == null)
					eClasses.add(eClass);
			}
		}
		
		for (EPackage eSubPackage : ePackage.getESubpackages()) {
			this.collectProvidedEClasses(eClasses, eSubPackage);
		}
	}
	
	/**
	 * Clones a EClass in the parameter by using the ECORE factory.
	 * @param ecoreFactory
	 * @param oldClass
	 * @return newClass A clone of the target class.
	 */
	public EClass cloneEClass(EcoreFactory ecoreFactory, EClass oldClass) {
		EClass newClass = ecoreFactory.createEClass();
		newClass.setName(oldClass.getName());
		newClass.setAbstract(oldClass.isAbstract());
		newClass.setInterface(oldClass.isInterface());
		
		//Clone the attributes
		for (EAttribute eAttribute : oldClass.getEAttributes()) {
			if(eAttribute.getEAnnotation("Private") == null && eAttribute.getEAnnotation("Required") == null){
				EAttribute newAttribute = ecoreFactory.createEAttribute();
				newAttribute.setName(eAttribute.getName());
				if(!(eAttribute.getEType() instanceof EEnum)){
					newAttribute.setEType(eAttribute.getEType());
					newClass.getEStructuralFeatures().add(newAttribute);
				} 
				
				for(EAnnotation annotation : eAttribute.getEAnnotations()){
					EAnnotation newEAnnotation = ecoreFactory.createEAnnotation();
					newEAnnotation.setSource(annotation.getSource());
					newAttribute.getEAnnotations().add(newEAnnotation);
				}
			}
		}
		
		//Clone the references
		for (EReference eReference : oldClass.getEReferences()) {
			if(eReference.getEAnnotation("Private") == null && eReference.getEAnnotation("Required") == null
					&& eReference.getEType() != null && eReference.getEType().getEAnnotation("Private") == null && eReference.getEType().getEAnnotation("Required") == null){
				EReference newEReference = ecoreFactory.createEReference();
				newEReference.setName(eReference.getName());
				newEReference.setLowerBound(eReference.getLowerBound());
				newEReference.setUpperBound(eReference.getUpperBound());
				newEReference.setContainment(eReference.isContainment());
				newEReference.setChangeable(eReference.isChangeable());
				newEReference.setDerived(eReference.isDerived());
				newClass.getEStructuralFeatures().add(newEReference);
				
				for(EAnnotation eAnnotation : eReference.getEAnnotations()){
					EAnnotation newEAnnotation = ecoreFactory.createEAnnotation();
					newEAnnotation.setSource(eAnnotation.getSource());
					newEReference.getEAnnotations().add(newEAnnotation);
				}
			}
		}
		
		//Clone the operations
		for (EOperation operation : oldClass.getEOperations()) {
			if(operation.getEAnnotation("Private") == null && operation.getEAnnotation("Required") == null){
				EOperation newOperation = ecoreFactory.createEOperation();
				newOperation.setName(operation.getName());
				
				// Clone the parameters of the operation... 
				for(EParameter _parameter : operation.getEParameters()){
					EParameter newParameter = ecoreFactory.createEParameter();
					newParameter.setName(_parameter.getName());
					newParameter.setOrdered(_parameter.isOrdered());
					newParameter.setUnique(_parameter.isUnique());
					newParameter.setLowerBound(_parameter.getLowerBound());
					newParameter.setUpperBound(_parameter.getUpperBound());
					newOperation.getEParameters().add(newParameter);
				}
				newClass.getEOperations().add(newOperation);
			}
		}
		
		//Clone the annotations
		for(EAnnotation annotation : oldClass.getEAnnotations()){
			EAnnotation newEAnnotation = ecoreFactory.createEAnnotation();
			newEAnnotation.setSource(annotation.getSource());
			newClass.getEAnnotations().add(newEAnnotation);
		}
		return newClass;
	}
	
	/**
	 * Resolution of the local attributes of the recently cloned metamodel
	 * @param _oldClassifiers
	 * @param metamodel
	 */
	public void resolveLocalEAttributes(Hashtable<String, EClassifier> _oldClassifiers, 
			Hashtable<String, EClassifier> _newClassifiers, EPackage metamodel){
	
		for (EClassifier _eClassifier : metamodel.getEClassifiers()) {
			if(_eClassifier instanceof EClass){
				EClass newClass = (EClass) _eClassifier;
				EClass oldClass = (EClass) _oldClassifiers.get(_eClassifier.getName());
			
				if(newClass != null && oldClass != null){
					for(EAttribute eAttribute : newClass.getEAttributes()){
						EAttribute _oldAttribute = ((EAttribute)searchStructuralFeatureByName(oldClass, eAttribute.getName()));
						String _resolvedTypeName = _oldAttribute.getEType().getName();
						
						if(_resolvedTypeName != null && ( _oldAttribute.getEType() instanceof EEnum)){
							EClassifier _resolvedType = _newClassifiers.get(_resolvedTypeName);
							eAttribute.setEType(_resolvedType);
						}
					}
				}
			}
		}
		
		for(EPackage _subPackage : metamodel.getESubpackages()){
			resolveLocalEAttributes(_oldClassifiers, _newClassifiers, _subPackage);
		}
	}
	
	/**
	 * Search a structural feature by name in the given class and in the corresponding inheritance hierarchy.
	 * @param name
	 * @param eclass
	 * @return
	 */
	private EStructuralFeature searchStructuralFeatureByName(
			EClass _class, String name) {
		
		// Searching the structural feature in the given class
		for (EStructuralFeature _feature : _class.getEStructuralFeatures()) {
			if(_feature.getName().equals(name))
				return _feature;
		}
		// Searching the structural feature in the super classes
		for(EClass _superClass : _class.getESuperTypes()){
			EStructuralFeature _feature = searchStructuralFeatureByName(_superClass, name);
			if(_feature != null)
				return _feature;
		}
		
		return null;
	}
	
	/**
	 * Resolution of the local references of the recently cloned metamodel
	 * @param _oldClassifiers
	 * @param metamodel
	 */
	public void resolveLocalEReferences(Hashtable<String, EClassifier> _oldClassifiers, 
			Hashtable<String, EClassifier> _newClassifiers, EPackage metamodel, boolean deleteUntyped){
		
		for (EClassifier _eClassifier : metamodel.getEClassifiers()) {
			if(_eClassifier instanceof EClass){
				EClass newClass = (EClass) _eClassifier;
				EClass oldClass = (EClass) _oldClassifiers.get(_eClassifier.getName());
				if(oldClass != null){
					ArrayList<EReference> toDelete = new ArrayList<EReference>();
					for (EReference _newReference : newClass.getEReferences() ) {
						EReference _oldReference = ((EReference) searchStructuralFeatureByName(oldClass, _newReference.getName()));
						
						if(_oldReference != null && _oldReference.getEType() != null){
							String _resolvedTypeName = _oldReference.getEType().getName();
							if(_resolvedTypeName != null){
								EClassifier _resolvedType = _newClassifiers.get(_resolvedTypeName);
								_newReference.setEType(_resolvedType);
							}
							if(_newReference.getEType() == null)
								toDelete.add(_newReference);
						}
					}
					
					if(deleteUntyped){
						for (EReference eReference : toDelete) {
							newClass.getEStructuralFeatures().remove(eReference);
						}
					}
				}
			}
		}
		
		for(EPackage _subPackage : metamodel.getESubpackages()){
			resolveLocalEReferences(_oldClassifiers, _newClassifiers, _subPackage, deleteUntyped);
		}
	}
	
	/**
	 * Resolution of the local references of the recently cloned metamodel
	 * @param _oldClassifiers
	 * @param metamodel
	 */
	public void resolveLocalEOperationTypes(Hashtable<String, EClassifier> _oldClassifiers, 
			Hashtable<String, EClassifier> _newClassifiers, EPackage metamodel){
		
		for (EClassifier _eClassifier : metamodel.getEClassifiers()) {
			if(_eClassifier instanceof EClass){
				EClass newClass = (EClass) _eClassifier;
				EClass oldClass = (EClass) _oldClassifiers.get(_eClassifier.getName());
				
				if(oldClass != null){
					for (EOperation _newEOperation : newClass.getEOperations()) {
						EOperation _legacyOperation = searchEOperationByName(oldClass, _newEOperation.getName());
						if(_legacyOperation != null && _legacyOperation.getEType() != null){
							String _resolvedTypeName = _legacyOperation.getEType().getName();
							if(_resolvedTypeName != null){
								if(_legacyOperation.getEType() instanceof EDataType){
									EClassifier eType = EcoreQueries.searchNativeTypeByName(_resolvedTypeName);
									_legacyOperation.setEType(eType);
								}else{
									EClassifier _resolvedType = _newClassifiers.get(_resolvedTypeName);
									_newEOperation.setEType(_resolvedType);
								}
							}
						}
						
						// Now, it is time for the types of the parameters..
						if(_legacyOperation != null){
							for(EParameter _newEParameter : _newEOperation.getEParameters()){
								EParameter _legacyParameter = searchEParameterByName(_legacyOperation, _newEParameter.getName());
								if(_legacyParameter != null && _legacyParameter.getEType() != null){
									String _resolvedTypeName = _legacyParameter.getEType().getName();
									if(_resolvedTypeName != null){
										if(_legacyParameter.getEType() instanceof EDataType){
											EClassifier eType = EcoreQueries.searchNativeTypeByName(_resolvedTypeName);
											_newEParameter.setEType(eType);
										}else{
											EClassifier _resolvedType = _newClassifiers.get(_resolvedTypeName);
											_newEParameter.setEType(_resolvedType);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		for(EPackage _subPackage : metamodel.getESubpackages()){
			resolveLocalEOperationTypes(_oldClassifiers, _newClassifiers, _subPackage);
		}
	}
	
	public EOperation searchEOperationByName(EClass _class,
			String name) {
		// TODO Adicionar el tema de tipos y parametros a esta comparacion.
		if(_class != null && _class.getEOperations() != null){
			for(EOperation _eOperation : _class.getEOperations()){
				if(_eOperation.getName().equals(name))
					return _eOperation;
			}
		}
		return null;
	}
	
	private EParameter searchEParameterByName(EOperation operation,
			String name) {
		for(EParameter _parameter : operation.getEParameters()){
			if(_parameter.getName().equals(name))
				return _parameter;
		}
		return null;
	}
	
	/**
	 * Resolution of the local super types of the recently cloned metamodel
	 * @param _oldClassifiers
	 * @param metamodel
	 */
	public void resolveLocalSuperTypes(Hashtable<String, EClassifier> _oldClassifiers,
			Hashtable<String, EClassifier> _newClassifiers, EPackage metamodel) {
		
		for (EClassifier _eClassifier : metamodel.getEClassifiers()) {
			if(_eClassifier instanceof EClass){
				EClass newClass = (EClass) _eClassifier;
				EClass oldClass = (EClass) _oldClassifiers.get(_eClassifier.getName());
				
				if(oldClass != null){
					for (EClass _oldSuperType : oldClass.getESuperTypes() ) {
						newClass.getESuperTypes().add((EClass)_newClassifiers.get(_oldSuperType.getName()));
					}
				}
			}
		}
		
		for(EPackage _subPackage : metamodel.getESubpackages()){
			resolveLocalSuperTypes(_oldClassifiers, _newClassifiers, _subPackage);
		}
	}
}
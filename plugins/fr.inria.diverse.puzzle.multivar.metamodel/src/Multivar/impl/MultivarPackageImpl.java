/**
 */
package Multivar.impl;

import Multivar.AlternativeGroup;
import Multivar.LanguageFeature;
import Multivar.LanguageProductLine;
import Multivar.LanguageVariability;
import Multivar.MandatoryChild;
import Multivar.MultivarFactory;
import Multivar.MultivarPackage;
import Multivar.NamedElement;
import Multivar.OptionalChild;
import Multivar.OrGroupChild;
import Multivar.ProductLineVariability;
import Multivar.Relation;
import Multivar.VariabilityPoint;
import Multivar.Variation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultivarPackageImpl extends EPackageImpl implements MultivarPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageProductLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productLineVariabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mandatoryChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionalChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orGroupChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageVariabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variabilityPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Multivar.MultivarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MultivarPackageImpl() {
		super(eNS_URI, MultivarFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MultivarPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MultivarPackage init() {
		if (isInited) return (MultivarPackage)EPackage.Registry.INSTANCE.getEPackage(MultivarPackage.eNS_URI);

		// Obtain or create and register package
		MultivarPackageImpl theMultivarPackage = (MultivarPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MultivarPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MultivarPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMultivarPackage.createPackageContents();

		// Initialize created meta-data
		theMultivarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMultivarPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MultivarPackage.eNS_URI, theMultivarPackage);
		return theMultivarPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageProductLine() {
		return languageProductLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageProductLine_ImplementationFile() {
		return (EAttribute)languageProductLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageProductLine_ProductLineVariability() {
		return (EReference)languageProductLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageProductLine_LanguageVariability() {
		return (EReference)languageProductLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductLineVariability() {
		return productLineVariabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductLineVariability_RootFeature() {
		return (EReference)productLineVariabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductLineVariability_Features() {
		return (EReference)productLineVariabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageFeature() {
		return languageFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageFeature_Abstract() {
		return (EAttribute)languageFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageFeature_Module() {
		return (EAttribute)languageFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageFeature_Depends() {
		return (EReference)languageFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageFeature_Excludes() {
		return (EReference)languageFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageFeature_Children() {
		return (EReference)languageFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMandatoryChild() {
		return mandatoryChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandatoryChild_Feature() {
		return (EReference)mandatoryChildEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionalChild() {
		return optionalChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionalChild_Feature() {
		return (EReference)optionalChildEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrGroupChild() {
		return orGroupChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrGroupChild_Features() {
		return (EReference)orGroupChildEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternativeGroup() {
		return alternativeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternativeGroup_Features() {
		return (EReference)alternativeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageVariability() {
		return languageVariabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageVariability_VariabilityPoints() {
		return (EReference)languageVariabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariabilityPoint() {
		return variabilityPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariabilityPoint_Variations() {
		return (EReference)variabilityPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariabilityPoint_InvolvedFeatures() {
		return (EReference)variabilityPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariabilityPoint_Default() {
		return (EReference)variabilityPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariation() {
		return variationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariation_Module() {
		return (EAttribute)variationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultivarFactory getMultivarFactory() {
		return (MultivarFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		languageProductLineEClass = createEClass(LANGUAGE_PRODUCT_LINE);
		createEAttribute(languageProductLineEClass, LANGUAGE_PRODUCT_LINE__IMPLEMENTATION_FILE);
		createEReference(languageProductLineEClass, LANGUAGE_PRODUCT_LINE__PRODUCT_LINE_VARIABILITY);
		createEReference(languageProductLineEClass, LANGUAGE_PRODUCT_LINE__LANGUAGE_VARIABILITY);

		productLineVariabilityEClass = createEClass(PRODUCT_LINE_VARIABILITY);
		createEReference(productLineVariabilityEClass, PRODUCT_LINE_VARIABILITY__ROOT_FEATURE);
		createEReference(productLineVariabilityEClass, PRODUCT_LINE_VARIABILITY__FEATURES);

		languageFeatureEClass = createEClass(LANGUAGE_FEATURE);
		createEAttribute(languageFeatureEClass, LANGUAGE_FEATURE__ABSTRACT);
		createEAttribute(languageFeatureEClass, LANGUAGE_FEATURE__MODULE);
		createEReference(languageFeatureEClass, LANGUAGE_FEATURE__DEPENDS);
		createEReference(languageFeatureEClass, LANGUAGE_FEATURE__EXCLUDES);
		createEReference(languageFeatureEClass, LANGUAGE_FEATURE__CHILDREN);

		relationEClass = createEClass(RELATION);

		mandatoryChildEClass = createEClass(MANDATORY_CHILD);
		createEReference(mandatoryChildEClass, MANDATORY_CHILD__FEATURE);

		optionalChildEClass = createEClass(OPTIONAL_CHILD);
		createEReference(optionalChildEClass, OPTIONAL_CHILD__FEATURE);

		orGroupChildEClass = createEClass(OR_GROUP_CHILD);
		createEReference(orGroupChildEClass, OR_GROUP_CHILD__FEATURES);

		alternativeGroupEClass = createEClass(ALTERNATIVE_GROUP);
		createEReference(alternativeGroupEClass, ALTERNATIVE_GROUP__FEATURES);

		languageVariabilityEClass = createEClass(LANGUAGE_VARIABILITY);
		createEReference(languageVariabilityEClass, LANGUAGE_VARIABILITY__VARIABILITY_POINTS);

		variabilityPointEClass = createEClass(VARIABILITY_POINT);
		createEReference(variabilityPointEClass, VARIABILITY_POINT__VARIATIONS);
		createEReference(variabilityPointEClass, VARIABILITY_POINT__INVOLVED_FEATURES);
		createEReference(variabilityPointEClass, VARIABILITY_POINT__DEFAULT);

		variationEClass = createEClass(VARIATION);
		createEAttribute(variationEClass, VARIATION__MODULE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		languageFeatureEClass.getESuperTypes().add(this.getNamedElement());
		mandatoryChildEClass.getESuperTypes().add(this.getRelation());
		optionalChildEClass.getESuperTypes().add(this.getRelation());
		orGroupChildEClass.getESuperTypes().add(this.getRelation());
		alternativeGroupEClass.getESuperTypes().add(this.getRelation());
		variabilityPointEClass.getESuperTypes().add(this.getNamedElement());
		variationEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageProductLineEClass, LanguageProductLine.class, "LanguageProductLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguageProductLine_ImplementationFile(), ecorePackage.getEString(), "implementationFile", null, 0, 1, LanguageProductLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageProductLine_ProductLineVariability(), this.getProductLineVariability(), null, "productLineVariability", null, 0, 1, LanguageProductLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageProductLine_LanguageVariability(), this.getLanguageVariability(), null, "languageVariability", null, 0, 1, LanguageProductLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productLineVariabilityEClass, ProductLineVariability.class, "ProductLineVariability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductLineVariability_RootFeature(), this.getLanguageFeature(), null, "rootFeature", null, 1, 1, ProductLineVariability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductLineVariability_Features(), this.getLanguageFeature(), null, "features", null, 1, -1, ProductLineVariability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageFeatureEClass, LanguageFeature.class, "LanguageFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguageFeature_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, LanguageFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguageFeature_Module(), ecorePackage.getEString(), "module", null, 0, 1, LanguageFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageFeature_Depends(), this.getLanguageFeature(), null, "depends", null, 0, -1, LanguageFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageFeature_Excludes(), this.getLanguageFeature(), null, "excludes", null, 0, -1, LanguageFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageFeature_Children(), this.getRelation(), null, "children", null, 0, -1, LanguageFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mandatoryChildEClass, MandatoryChild.class, "MandatoryChild", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMandatoryChild_Feature(), this.getLanguageFeature(), null, "feature", null, 1, 1, MandatoryChild.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionalChildEClass, OptionalChild.class, "OptionalChild", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionalChild_Feature(), this.getLanguageFeature(), null, "feature", null, 1, 1, OptionalChild.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orGroupChildEClass, OrGroupChild.class, "OrGroupChild", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrGroupChild_Features(), this.getLanguageFeature(), null, "features", null, 1, -1, OrGroupChild.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeGroupEClass, AlternativeGroup.class, "AlternativeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlternativeGroup_Features(), this.getLanguageFeature(), null, "features", null, 1, -1, AlternativeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageVariabilityEClass, LanguageVariability.class, "LanguageVariability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLanguageVariability_VariabilityPoints(), this.getVariabilityPoint(), null, "variabilityPoints", null, 0, -1, LanguageVariability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variabilityPointEClass, VariabilityPoint.class, "VariabilityPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariabilityPoint_Variations(), this.getVariation(), null, "variations", null, 1, -1, VariabilityPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariabilityPoint_InvolvedFeatures(), this.getLanguageFeature(), null, "involvedFeatures", null, 0, -1, VariabilityPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariabilityPoint_Default(), this.getVariation(), null, "default", null, 1, 1, VariabilityPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variationEClass, Variation.class, "Variation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariation_Module(), ecorePackage.getEString(), "module", null, 0, 1, Variation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MultivarPackageImpl

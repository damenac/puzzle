/**
 */
package PuzzleADL.impl;

import PuzzleADL.AggregationLink;
import PuzzleADL.CompositeLanguage;
import PuzzleADL.CompositionLink;
import PuzzleADL.PuzzleADLFactory;
import PuzzleADL.PuzzleADLPackage;

import fr.inria.diverse.melange.metamodel.melange.MelangePackage;

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
public class PuzzleADLPackageImpl extends EPackageImpl implements PuzzleADLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationLinkEClass = null;

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
	 * @see PuzzleADL.PuzzleADLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PuzzleADLPackageImpl() {
		super(eNS_URI, PuzzleADLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PuzzleADLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PuzzleADLPackage init() {
		if (isInited) return (PuzzleADLPackage)EPackage.Registry.INSTANCE.getEPackage(PuzzleADLPackage.eNS_URI);

		// Obtain or create and register package
		PuzzleADLPackageImpl thePuzzleADLPackage = (PuzzleADLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PuzzleADLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PuzzleADLPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MelangePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePuzzleADLPackage.createPackageContents();

		// Initialize created meta-data
		thePuzzleADLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePuzzleADLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PuzzleADLPackage.eNS_URI, thePuzzleADLPackage);
		return thePuzzleADLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeLanguage() {
		return compositeLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeLanguage_Links() {
		return (EReference)compositeLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionLink() {
		return compositionLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionLink_Left() {
		return (EReference)compositionLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionLink_Right() {
		return (EReference)compositionLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregationLink() {
		return aggregationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuzzleADLFactory getPuzzleADLFactory() {
		return (PuzzleADLFactory)getEFactoryInstance();
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
		compositeLanguageEClass = createEClass(COMPOSITE_LANGUAGE);
		createEReference(compositeLanguageEClass, COMPOSITE_LANGUAGE__LINKS);

		compositionLinkEClass = createEClass(COMPOSITION_LINK);
		createEReference(compositionLinkEClass, COMPOSITION_LINK__LEFT);
		createEReference(compositionLinkEClass, COMPOSITION_LINK__RIGHT);

		aggregationLinkEClass = createEClass(AGGREGATION_LINK);
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

		// Obtain other dependent packages
		MelangePackage theMelangePackage = (MelangePackage)EPackage.Registry.INSTANCE.getEPackage(MelangePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositeLanguageEClass.getESuperTypes().add(theMelangePackage.getElement());
		aggregationLinkEClass.getESuperTypes().add(this.getCompositionLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(compositeLanguageEClass, CompositeLanguage.class, "CompositeLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeLanguage_Links(), this.getCompositionLink(), null, "links", null, 0, -1, CompositeLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionLinkEClass, CompositionLink.class, "CompositionLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositionLink_Left(), theMelangePackage.getLanguage(), null, "left", null, 1, 1, CompositionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositionLink_Right(), theMelangePackage.getLanguage(), null, "right", null, 1, 1, CompositionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregationLinkEClass, AggregationLink.class, "AggregationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PuzzleADLPackageImpl

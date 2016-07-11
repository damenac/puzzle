/**
 */
package Classes.Interfaces.impl;

import Classes.AssociationClasses.AssociationClassesPackage;

import Classes.AssociationClasses.impl.AssociationClassesPackageImpl;

import Classes.Dependencies.DependenciesPackage;

import Classes.Dependencies.impl.DependenciesPackageImpl;

import Classes.Interfaces.BehavioredClassifier;
import Classes.Interfaces.Interface;
import Classes.Interfaces.InterfaceRealization;
import Classes.Interfaces.InterfacesFactory;
import Classes.Interfaces.InterfacesPackage;

import Classes.Kernel.KernelPackage;

import Classes.Kernel.impl.KernelPackageImpl;

import Classes.PowerTypes.PowerTypesPackage;

import Classes.PowerTypes.impl.PowerTypesPackageImpl;

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
public class InterfacesPackageImpl extends EPackageImpl implements InterfacesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioredClassifierEClass = null;

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
	 * @see Classes.Interfaces.InterfacesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InterfacesPackageImpl() {
		super(eNS_URI, InterfacesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InterfacesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InterfacesPackage init() {
		if (isInited) return (InterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);

		// Obtain or create and register package
		InterfacesPackageImpl theInterfacesPackage = (InterfacesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InterfacesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InterfacesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) instanceof KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) : KernelPackage.eINSTANCE);
		DependenciesPackageImpl theDependenciesPackage = (DependenciesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DependenciesPackage.eNS_URI) instanceof DependenciesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DependenciesPackage.eNS_URI) : DependenciesPackage.eINSTANCE);
		AssociationClassesPackageImpl theAssociationClassesPackage = (AssociationClassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssociationClassesPackage.eNS_URI) instanceof AssociationClassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssociationClassesPackage.eNS_URI) : AssociationClassesPackage.eINSTANCE);
		PowerTypesPackageImpl thePowerTypesPackage = (PowerTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PowerTypesPackage.eNS_URI) instanceof PowerTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PowerTypesPackage.eNS_URI) : PowerTypesPackage.eINSTANCE);

		// Create package meta-data objects
		theInterfacesPackage.createPackageContents();
		theKernelPackage.createPackageContents();
		theDependenciesPackage.createPackageContents();
		theAssociationClassesPackage.createPackageContents();
		thePowerTypesPackage.createPackageContents();

		// Initialize created meta-data
		theInterfacesPackage.initializePackageContents();
		theKernelPackage.initializePackageContents();
		theDependenciesPackage.initializePackageContents();
		theAssociationClassesPackage.initializePackageContents();
		thePowerTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInterfacesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InterfacesPackage.eNS_URI, theInterfacesPackage);
		return theInterfacesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_NestedClassifier() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_RedefinedInterface() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedAttribute() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedOperation() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceRealization() {
		return interfaceRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceRealization_ImplementingClassifier() {
		return (EReference)interfaceRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceRealization_Contract() {
		return (EReference)interfaceRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioredClassifier() {
		return behavioredClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_InterfaceRealization() {
		return (EReference)behavioredClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesFactory getInterfacesFactory() {
		return (InterfacesFactory)getEFactoryInstance();
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
		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__NESTED_CLASSIFIER);
		createEReference(interfaceEClass, INTERFACE__REDEFINED_INTERFACE);
		createEReference(interfaceEClass, INTERFACE__OWNED_ATTRIBUTE);
		createEReference(interfaceEClass, INTERFACE__OWNED_OPERATION);

		interfaceRealizationEClass = createEClass(INTERFACE_REALIZATION);
		createEReference(interfaceRealizationEClass, INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER);
		createEReference(interfaceRealizationEClass, INTERFACE_REALIZATION__CONTRACT);

		behavioredClassifierEClass = createEClass(BEHAVIORED_CLASSIFIER);
		createEReference(behavioredClassifierEClass, BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION);
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
		KernelPackage theKernelPackage = (KernelPackage)EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI);
		DependenciesPackage theDependenciesPackage = (DependenciesPackage)EPackage.Registry.INSTANCE.getEPackage(DependenciesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interfaceEClass.getESuperTypes().add(theKernelPackage.getClassifier());
		interfaceRealizationEClass.getESuperTypes().add(theDependenciesPackage.getRealization());
		behavioredClassifierEClass.getESuperTypes().add(theKernelPackage.getClassifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_NestedClassifier(), theKernelPackage.getClassifier(), null, "nestedClassifier", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_RedefinedInterface(), this.getInterface(), null, "redefinedInterface", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_OwnedAttribute(), theKernelPackage.getProperty(), theKernelPackage.getProperty_Interface(), "ownedAttribute", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_OwnedOperation(), theKernelPackage.getOperation(), theKernelPackage.getOperation_Interface(), "ownedOperation", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceRealizationEClass, InterfaceRealization.class, "InterfaceRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceRealization_ImplementingClassifier(), this.getBehavioredClassifier(), this.getBehavioredClassifier_InterfaceRealization(), "implementingClassifier", null, 1, 1, InterfaceRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceRealization_Contract(), this.getInterface(), null, "contract", null, 1, 1, InterfaceRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behavioredClassifierEClass, BehavioredClassifier.class, "BehavioredClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavioredClassifier_InterfaceRealization(), this.getInterfaceRealization(), this.getInterfaceRealization_ImplementingClassifier(), "interfaceRealization", null, 0, -1, BehavioredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Required
		createRequiredAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Required</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRequiredAnnotations() {
		String source = "Required";	
		addAnnotation
		  (behavioredClassifierEClass, 
		   source, 
		   new String[] {
		   });
	}

} //InterfacesPackageImpl

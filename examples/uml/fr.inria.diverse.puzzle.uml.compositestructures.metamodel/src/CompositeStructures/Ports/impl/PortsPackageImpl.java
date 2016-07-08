/**
 */
package CompositeStructures.Ports.impl;

import CompositeStructures.Collaborations.CollaborationsPackage;

import CompositeStructures.Collaborations.impl.CollaborationsPackageImpl;

import CompositeStructures.InternalStructures.InternalStructuresPackage;

import CompositeStructures.InternalStructures.impl.InternalStructuresPackageImpl;

import CompositeStructures.InvocationActions.InvocationActionsPackage;

import CompositeStructures.InvocationActions.impl.InvocationActionsPackageImpl;

import CompositeStructures.Ports.EncapsulatedClassifier;
import CompositeStructures.Ports.Interface;
import CompositeStructures.Ports.Port;
import CompositeStructures.Ports.PortsFactory;
import CompositeStructures.Ports.PortsPackage;

import CompositeStructures.StructuredActivities.StructuredActivitiesPackage;

import CompositeStructures.StructuredActivities.impl.StructuredActivitiesPackageImpl;

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
public class PortsPackageImpl extends EPackageImpl implements PortsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

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
	private EClass encapsulatedClassifierEClass = null;

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
	 * @see CompositeStructures.Ports.PortsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PortsPackageImpl() {
		super(eNS_URI, PortsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PortsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PortsPackage init() {
		if (isInited) return (PortsPackage)EPackage.Registry.INSTANCE.getEPackage(PortsPackage.eNS_URI);

		// Obtain or create and register package
		PortsPackageImpl thePortsPackage = (PortsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PortsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PortsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		InternalStructuresPackageImpl theInternalStructuresPackage = (InternalStructuresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InternalStructuresPackage.eNS_URI) instanceof InternalStructuresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InternalStructuresPackage.eNS_URI) : InternalStructuresPackage.eINSTANCE);
		CollaborationsPackageImpl theCollaborationsPackage = (CollaborationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollaborationsPackage.eNS_URI) instanceof CollaborationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollaborationsPackage.eNS_URI) : CollaborationsPackage.eINSTANCE);
		InvocationActionsPackageImpl theInvocationActionsPackage = (InvocationActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InvocationActionsPackage.eNS_URI) instanceof InvocationActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InvocationActionsPackage.eNS_URI) : InvocationActionsPackage.eINSTANCE);
		StructuredActivitiesPackageImpl theStructuredActivitiesPackage = (StructuredActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructuredActivitiesPackage.eNS_URI) instanceof StructuredActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructuredActivitiesPackage.eNS_URI) : StructuredActivitiesPackage.eINSTANCE);

		// Create package meta-data objects
		thePortsPackage.createPackageContents();
		theInternalStructuresPackage.createPackageContents();
		theCollaborationsPackage.createPackageContents();
		theInvocationActionsPackage.createPackageContents();
		theStructuredActivitiesPackage.createPackageContents();

		// Initialize created meta-data
		thePortsPackage.initializePackageContents();
		theInternalStructuresPackage.initializePackageContents();
		theCollaborationsPackage.initializePackageContents();
		theInvocationActionsPackage.initializePackageContents();
		theStructuredActivitiesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePortsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PortsPackage.eNS_URI, thePortsPackage);
		return thePortsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_IsBehavior() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_IsService() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_IsConjugated() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Required() {
		return (EReference)portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Provided() {
		return (EReference)portEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_RedefinedPort() {
		return (EReference)portEClass.getEStructuralFeatures().get(5);
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
	public EClass getEncapsulatedClassifier() {
		return encapsulatedClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncapsulatedClassifier_OwnedPort() {
		return (EReference)encapsulatedClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsFactory getPortsFactory() {
		return (PortsFactory)getEFactoryInstance();
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
		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__IS_BEHAVIOR);
		createEAttribute(portEClass, PORT__IS_SERVICE);
		createEAttribute(portEClass, PORT__IS_CONJUGATED);
		createEReference(portEClass, PORT__REQUIRED);
		createEReference(portEClass, PORT__PROVIDED);
		createEReference(portEClass, PORT__REDEFINED_PORT);

		interfaceEClass = createEClass(INTERFACE);

		encapsulatedClassifierEClass = createEClass(ENCAPSULATED_CLASSIFIER);
		createEReference(encapsulatedClassifierEClass, ENCAPSULATED_CLASSIFIER__OWNED_PORT);
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
		InternalStructuresPackage theInternalStructuresPackage = (InternalStructuresPackage)EPackage.Registry.INSTANCE.getEPackage(InternalStructuresPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		portEClass.getESuperTypes().add(theInternalStructuresPackage.getProperty());
		encapsulatedClassifierEClass.getESuperTypes().add(theInternalStructuresPackage.getStructuredClassifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_IsBehavior(), ecorePackage.getEBoolean(), "isBehavior", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_IsService(), ecorePackage.getEBoolean(), "isService", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_IsConjugated(), ecorePackage.getEBoolean(), "isConjugated", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Required(), this.getInterface(), null, "required", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Provided(), this.getInterface(), null, "provided", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_RedefinedPort(), this.getPort(), null, "redefinedPort", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(encapsulatedClassifierEClass, EncapsulatedClassifier.class, "EncapsulatedClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEncapsulatedClassifier_OwnedPort(), this.getPort(), null, "ownedPort", null, 0, -1, EncapsulatedClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (interfaceEClass, 
		   source, 
		   new String[] {
		   });
	}

} //PortsPackageImpl

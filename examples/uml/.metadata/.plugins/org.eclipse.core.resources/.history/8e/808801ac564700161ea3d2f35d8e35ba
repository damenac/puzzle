/**
 */
package CompositeStructures.InvocationActions.impl;

import CompositeStructures.Collaborations.CollaborationsPackage;

import CompositeStructures.Collaborations.impl.CollaborationsPackageImpl;

import CompositeStructures.InternalStructures.InternalStructuresPackage;

import CompositeStructures.InternalStructures.impl.InternalStructuresPackageImpl;

import CompositeStructures.InvocationActions.InvocationAction;
import CompositeStructures.InvocationActions.InvocationActionsFactory;
import CompositeStructures.InvocationActions.InvocationActionsPackage;
import CompositeStructures.InvocationActions.Trigger;

import CompositeStructures.Ports.PortsPackage;

import CompositeStructures.Ports.impl.PortsPackageImpl;

import CompositeStructures.StructuredActivities.StructuredActivitiesPackage;

import CompositeStructures.StructuredActivities.impl.StructuredActivitiesPackageImpl;

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
public class InvocationActionsPackageImpl extends EPackageImpl implements InvocationActionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

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
	 * @see CompositeStructures.InvocationActions.InvocationActionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InvocationActionsPackageImpl() {
		super(eNS_URI, InvocationActionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InvocationActionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InvocationActionsPackage init() {
		if (isInited) return (InvocationActionsPackage)EPackage.Registry.INSTANCE.getEPackage(InvocationActionsPackage.eNS_URI);

		// Obtain or create and register package
		InvocationActionsPackageImpl theInvocationActionsPackage = (InvocationActionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InvocationActionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InvocationActionsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		InternalStructuresPackageImpl theInternalStructuresPackage = (InternalStructuresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InternalStructuresPackage.eNS_URI) instanceof InternalStructuresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InternalStructuresPackage.eNS_URI) : InternalStructuresPackage.eINSTANCE);
		PortsPackageImpl thePortsPackage = (PortsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PortsPackage.eNS_URI) instanceof PortsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PortsPackage.eNS_URI) : PortsPackage.eINSTANCE);
		CollaborationsPackageImpl theCollaborationsPackage = (CollaborationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollaborationsPackage.eNS_URI) instanceof CollaborationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollaborationsPackage.eNS_URI) : CollaborationsPackage.eINSTANCE);
		StructuredActivitiesPackageImpl theStructuredActivitiesPackage = (StructuredActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructuredActivitiesPackage.eNS_URI) instanceof StructuredActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructuredActivitiesPackage.eNS_URI) : StructuredActivitiesPackage.eINSTANCE);

		// Create package meta-data objects
		theInvocationActionsPackage.createPackageContents();
		theInternalStructuresPackage.createPackageContents();
		thePortsPackage.createPackageContents();
		theCollaborationsPackage.createPackageContents();
		theStructuredActivitiesPackage.createPackageContents();

		// Initialize created meta-data
		theInvocationActionsPackage.initializePackageContents();
		theInternalStructuresPackage.initializePackageContents();
		thePortsPackage.initializePackageContents();
		theCollaborationsPackage.initializePackageContents();
		theStructuredActivitiesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInvocationActionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InvocationActionsPackage.eNS_URI, theInvocationActionsPackage);
		return theInvocationActionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocationAction() {
		return invocationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocationAction_OnPort() {
		return (EReference)invocationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Port() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationActionsFactory getInvocationActionsFactory() {
		return (InvocationActionsFactory)getEFactoryInstance();
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
		invocationActionEClass = createEClass(INVOCATION_ACTION);
		createEReference(invocationActionEClass, INVOCATION_ACTION__ON_PORT);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__PORT);
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
		PortsPackage thePortsPackage = (PortsPackage)EPackage.Registry.INSTANCE.getEPackage(PortsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(invocationActionEClass, InvocationAction.class, "InvocationAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvocationAction_OnPort(), thePortsPackage.getPort(), null, "onPort", null, 0, 1, InvocationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_Port(), thePortsPackage.getPort(), null, "port", null, 0, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //InvocationActionsPackageImpl

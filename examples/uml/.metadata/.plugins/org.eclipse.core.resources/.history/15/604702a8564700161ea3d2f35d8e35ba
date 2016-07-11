/**
 */
package CompositeStructures.StructuredActivities.impl;

import CompositeStructures.Collaborations.CollaborationsPackage;

import CompositeStructures.Collaborations.impl.CollaborationsPackageImpl;

import CompositeStructures.InternalStructures.InternalStructuresPackage;

import CompositeStructures.InternalStructures.impl.InternalStructuresPackageImpl;

import CompositeStructures.InvocationActions.InvocationActionsPackage;

import CompositeStructures.InvocationActions.impl.InvocationActionsPackageImpl;

import CompositeStructures.Ports.PortsPackage;

import CompositeStructures.Ports.impl.PortsPackageImpl;

import CompositeStructures.StructuredActivities.StructuredActivitiesFactory;
import CompositeStructures.StructuredActivities.StructuredActivitiesPackage;
import CompositeStructures.StructuredActivities.Variable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredActivitiesPackageImpl extends EPackageImpl implements StructuredActivitiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

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
	 * @see CompositeStructures.StructuredActivities.StructuredActivitiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StructuredActivitiesPackageImpl() {
		super(eNS_URI, StructuredActivitiesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StructuredActivitiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StructuredActivitiesPackage init() {
		if (isInited) return (StructuredActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredActivitiesPackage.eNS_URI);

		// Obtain or create and register package
		StructuredActivitiesPackageImpl theStructuredActivitiesPackage = (StructuredActivitiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StructuredActivitiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StructuredActivitiesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		InternalStructuresPackageImpl theInternalStructuresPackage = (InternalStructuresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InternalStructuresPackage.eNS_URI) instanceof InternalStructuresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InternalStructuresPackage.eNS_URI) : InternalStructuresPackage.eINSTANCE);
		PortsPackageImpl thePortsPackage = (PortsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PortsPackage.eNS_URI) instanceof PortsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PortsPackage.eNS_URI) : PortsPackage.eINSTANCE);
		CollaborationsPackageImpl theCollaborationsPackage = (CollaborationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollaborationsPackage.eNS_URI) instanceof CollaborationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollaborationsPackage.eNS_URI) : CollaborationsPackage.eINSTANCE);
		InvocationActionsPackageImpl theInvocationActionsPackage = (InvocationActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InvocationActionsPackage.eNS_URI) instanceof InvocationActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InvocationActionsPackage.eNS_URI) : InvocationActionsPackage.eINSTANCE);

		// Create package meta-data objects
		theStructuredActivitiesPackage.createPackageContents();
		theInternalStructuresPackage.createPackageContents();
		thePortsPackage.createPackageContents();
		theCollaborationsPackage.createPackageContents();
		theInvocationActionsPackage.createPackageContents();

		// Initialize created meta-data
		theStructuredActivitiesPackage.initializePackageContents();
		theInternalStructuresPackage.initializePackageContents();
		thePortsPackage.initializePackageContents();
		theCollaborationsPackage.initializePackageContents();
		theInvocationActionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStructuredActivitiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StructuredActivitiesPackage.eNS_URI, theStructuredActivitiesPackage);
		return theStructuredActivitiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivitiesFactory getStructuredActivitiesFactory() {
		return (StructuredActivitiesFactory)getEFactoryInstance();
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
		variableEClass = createEClass(VARIABLE);
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
		variableEClass.getESuperTypes().add(theInternalStructuresPackage.getConnectableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //StructuredActivitiesPackageImpl

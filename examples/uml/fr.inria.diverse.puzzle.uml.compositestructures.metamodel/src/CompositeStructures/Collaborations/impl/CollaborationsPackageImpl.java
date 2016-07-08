/**
 */
package CompositeStructures.Collaborations.impl;

import CompositeStructures.Collaborations.BehavioredClassifier;
import CompositeStructures.Collaborations.Collaboration;
import CompositeStructures.Collaborations.CollaborationUse;
import CompositeStructures.Collaborations.CollaborationsFactory;
import CompositeStructures.Collaborations.CollaborationsPackage;
import CompositeStructures.Collaborations.Dependency;
import CompositeStructures.Collaborations.NamedElement;
import CompositeStructures.Collaborations.Parameter;

import CompositeStructures.InternalStructures.InternalStructuresPackage;

import CompositeStructures.InternalStructures.impl.InternalStructuresPackageImpl;

import CompositeStructures.InvocationActions.InvocationActionsPackage;

import CompositeStructures.InvocationActions.impl.InvocationActionsPackageImpl;

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
public class CollaborationsPackageImpl extends EPackageImpl implements CollaborationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioredClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationUseEClass = null;

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
	private EClass dependencyEClass = null;

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
	 * @see CompositeStructures.Collaborations.CollaborationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CollaborationsPackageImpl() {
		super(eNS_URI, CollaborationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CollaborationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CollaborationsPackage init() {
		if (isInited) return (CollaborationsPackage)EPackage.Registry.INSTANCE.getEPackage(CollaborationsPackage.eNS_URI);

		// Obtain or create and register package
		CollaborationsPackageImpl theCollaborationsPackage = (CollaborationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CollaborationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CollaborationsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		InternalStructuresPackageImpl theInternalStructuresPackage = (InternalStructuresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InternalStructuresPackage.eNS_URI) instanceof InternalStructuresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InternalStructuresPackage.eNS_URI) : InternalStructuresPackage.eINSTANCE);
		PortsPackageImpl thePortsPackage = (PortsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PortsPackage.eNS_URI) instanceof PortsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PortsPackage.eNS_URI) : PortsPackage.eINSTANCE);
		InvocationActionsPackageImpl theInvocationActionsPackage = (InvocationActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InvocationActionsPackage.eNS_URI) instanceof InvocationActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InvocationActionsPackage.eNS_URI) : InvocationActionsPackage.eINSTANCE);
		StructuredActivitiesPackageImpl theStructuredActivitiesPackage = (StructuredActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructuredActivitiesPackage.eNS_URI) instanceof StructuredActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructuredActivitiesPackage.eNS_URI) : StructuredActivitiesPackage.eINSTANCE);

		// Create package meta-data objects
		theCollaborationsPackage.createPackageContents();
		theInternalStructuresPackage.createPackageContents();
		thePortsPackage.createPackageContents();
		theInvocationActionsPackage.createPackageContents();
		theStructuredActivitiesPackage.createPackageContents();

		// Initialize created meta-data
		theCollaborationsPackage.initializePackageContents();
		theInternalStructuresPackage.initializePackageContents();
		thePortsPackage.initializePackageContents();
		theInvocationActionsPackage.initializePackageContents();
		theStructuredActivitiesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCollaborationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CollaborationsPackage.eNS_URI, theCollaborationsPackage);
		return theCollaborationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaboration() {
		return collaborationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_CollaborationRole() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(0);
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
	public EClass getCollaborationUse() {
		return collaborationUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationUse_Type() {
		return (EReference)collaborationUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationUse_RoleBinding() {
		return (EReference)collaborationUseEClass.getEStructuralFeatures().get(1);
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
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationsFactory getCollaborationsFactory() {
		return (CollaborationsFactory)getEFactoryInstance();
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
		parameterEClass = createEClass(PARAMETER);

		collaborationEClass = createEClass(COLLABORATION);
		createEReference(collaborationEClass, COLLABORATION__COLLABORATION_ROLE);

		behavioredClassifierEClass = createEClass(BEHAVIORED_CLASSIFIER);

		collaborationUseEClass = createEClass(COLLABORATION_USE);
		createEReference(collaborationUseEClass, COLLABORATION_USE__TYPE);
		createEReference(collaborationUseEClass, COLLABORATION_USE__ROLE_BINDING);

		namedElementEClass = createEClass(NAMED_ELEMENT);

		dependencyEClass = createEClass(DEPENDENCY);
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
		parameterEClass.getESuperTypes().add(theInternalStructuresPackage.getConnectableElement());
		collaborationEClass.getESuperTypes().add(theInternalStructuresPackage.getStructuredClassifier());
		collaborationEClass.getESuperTypes().add(this.getBehavioredClassifier());
		collaborationUseEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collaborationEClass, Collaboration.class, "Collaboration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaboration_CollaborationRole(), theInternalStructuresPackage.getConnectableElement(), null, "collaborationRole", null, 0, -1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behavioredClassifierEClass, BehavioredClassifier.class, "BehavioredClassifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collaborationUseEClass, CollaborationUse.class, "CollaborationUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborationUse_Type(), this.getCollaboration(), null, "type", null, 1, 1, CollaborationUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborationUse_RoleBinding(), this.getDependency(), null, "roleBinding", null, 0, -1, CollaborationUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (parameterEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (behavioredClassifierEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (namedElementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (dependencyEClass, 
		   source, 
		   new String[] {
		   });
	}

} //CollaborationsPackageImpl

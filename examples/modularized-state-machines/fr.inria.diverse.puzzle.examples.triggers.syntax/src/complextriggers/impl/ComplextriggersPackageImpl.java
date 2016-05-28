/**
 */
package complextriggers.impl;

import complextriggers.AndTrigger;
import complextriggers.ComplextriggersFactory;
import complextriggers.ComplextriggersPackage;
import complextriggers.NotTrigger;
import complextriggers.OrTrigger;
import complextriggers.Trigger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplextriggersPackageImpl extends EPackageImpl implements ComplextriggersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orTriggerEClass = null;

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
	 * @see complextriggers.ComplextriggersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComplextriggersPackageImpl() {
		super(eNS_URI, ComplextriggersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComplextriggersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComplextriggersPackage init() {
		if (isInited) return (ComplextriggersPackage)EPackage.Registry.INSTANCE.getEPackage(ComplextriggersPackage.eNS_URI);

		// Obtain or create and register package
		ComplextriggersPackageImpl theComplextriggersPackage = (ComplextriggersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComplextriggersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComplextriggersPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theComplextriggersPackage.createPackageContents();

		// Initialize created meta-data
		theComplextriggersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComplextriggersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComplextriggersPackage.eNS_URI, theComplextriggersPackage);
		return theComplextriggersPackage;
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
	public EOperation getTrigger__EvalTrigger__EList() {
		return triggerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotTrigger() {
		return notTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotTrigger_Trigger() {
		return (EReference)notTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndTrigger() {
		return andTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndTrigger_Left() {
		return (EReference)andTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndTrigger_Right() {
		return (EReference)andTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrTrigger() {
		return orTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrTrigger_Left() {
		return (EReference)orTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrTrigger_Right() {
		return (EReference)orTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplextriggersFactory getComplextriggersFactory() {
		return (ComplextriggersFactory)getEFactoryInstance();
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
		triggerEClass = createEClass(TRIGGER);
		createEOperation(triggerEClass, TRIGGER___EVAL_TRIGGER__ELIST);

		notTriggerEClass = createEClass(NOT_TRIGGER);
		createEReference(notTriggerEClass, NOT_TRIGGER__TRIGGER);

		andTriggerEClass = createEClass(AND_TRIGGER);
		createEReference(andTriggerEClass, AND_TRIGGER__LEFT);
		createEReference(andTriggerEClass, AND_TRIGGER__RIGHT);

		orTriggerEClass = createEClass(OR_TRIGGER);
		createEReference(orTriggerEClass, OR_TRIGGER__LEFT);
		createEReference(orTriggerEClass, OR_TRIGGER__RIGHT);
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
		notTriggerEClass.getESuperTypes().add(this.getTrigger());
		andTriggerEClass.getESuperTypes().add(this.getTrigger());
		orTriggerEClass.getESuperTypes().add(this.getTrigger());

		// Initialize classes, features, and operations; add parameters
		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getTrigger__EvalTrigger__EList(), ecorePackage.getEBoolean(), "evalTrigger", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "event", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(notTriggerEClass, NotTrigger.class, "NotTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotTrigger_Trigger(), this.getTrigger(), null, "trigger", null, 1, 1, NotTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andTriggerEClass, AndTrigger.class, "AndTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndTrigger_Left(), this.getTrigger(), null, "left", null, 1, 1, AndTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAndTrigger_Right(), this.getTrigger(), null, "right", null, 1, 1, AndTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orTriggerEClass, OrTrigger.class, "OrTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrTrigger_Left(), this.getTrigger(), null, "left", null, 1, 1, OrTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrTrigger_Right(), this.getTrigger(), null, "right", null, 1, 1, OrTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (triggerEClass, 
		   source, 
		   new String[] {
		   });
	}

} //ComplextriggersPackageImpl

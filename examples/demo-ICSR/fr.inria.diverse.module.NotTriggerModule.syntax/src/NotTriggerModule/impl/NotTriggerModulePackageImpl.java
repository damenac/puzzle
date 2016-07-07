/**
 */
package NotTriggerModule.impl;

import NotTriggerModule.NotTrigger;
import NotTriggerModule.NotTriggerModuleFactory;
import NotTriggerModule.NotTriggerModulePackage;
import NotTriggerModule.OrTrigger;
import NotTriggerModule.Trigger;

import org.eclipse.emf.ecore.EClass;
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
public class NotTriggerModulePackageImpl extends EPackageImpl implements NotTriggerModulePackage {
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
	private EClass orTriggerEClass = null;

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
	 * @see NotTriggerModule.NotTriggerModulePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NotTriggerModulePackageImpl() {
		super(eNS_URI, NotTriggerModuleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NotTriggerModulePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NotTriggerModulePackage init() {
		if (isInited) return (NotTriggerModulePackage)EPackage.Registry.INSTANCE.getEPackage(NotTriggerModulePackage.eNS_URI);

		// Obtain or create and register package
		NotTriggerModulePackageImpl theNotTriggerModulePackage = (NotTriggerModulePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NotTriggerModulePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NotTriggerModulePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theNotTriggerModulePackage.createPackageContents();

		// Initialize created meta-data
		theNotTriggerModulePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNotTriggerModulePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NotTriggerModulePackage.eNS_URI, theNotTriggerModulePackage);
		return theNotTriggerModulePackage;
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
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrigger__EvalTrigger__Object() {
		return triggerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotTriggerModuleFactory getNotTriggerModuleFactory() {
		return (NotTriggerModuleFactory)getEFactoryInstance();
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
		notTriggerEClass = createEClass(NOT_TRIGGER);
		createEReference(notTriggerEClass, NOT_TRIGGER__TRIGGER);

		orTriggerEClass = createEClass(OR_TRIGGER);
		createEReference(orTriggerEClass, OR_TRIGGER__LEFT);
		createEReference(orTriggerEClass, OR_TRIGGER__RIGHT);

		triggerEClass = createEClass(TRIGGER);
		createEOperation(triggerEClass, TRIGGER___EVAL_TRIGGER__OBJECT);
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
		orTriggerEClass.getESuperTypes().add(this.getTrigger());

		// Initialize classes, features, and operations; add parameters
		initEClass(notTriggerEClass, NotTrigger.class, "NotTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotTrigger_Trigger(), this.getTrigger(), null, "trigger", null, 1, 1, NotTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orTriggerEClass, OrTrigger.class, "OrTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrTrigger_Left(), this.getTrigger(), null, "left", null, 1, 1, OrTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrTrigger_Right(), this.getTrigger(), null, "right", null, 1, 1, OrTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getTrigger__EvalTrigger__Object(), ecorePackage.getEBoolean(), "evalTrigger", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "events", 0, 1, IS_UNIQUE, IS_ORDERED);

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

} //NotTriggerModulePackageImpl

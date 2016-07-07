/**
 */
package NotTriggerModuleProv.impl;

import NotTriggerModuleProv.NotTrigger;
import NotTriggerModuleProv.NotTriggerModuleProvFactory;
import NotTriggerModuleProv.NotTriggerModuleProvPackage;
import NotTriggerModuleProv.OrTrigger;
import NotTriggerModuleProv.Trigger;

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
public class NotTriggerModuleProvPackageImpl extends EPackageImpl implements NotTriggerModuleProvPackage {
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
	 * @see NotTriggerModuleProv.NotTriggerModuleProvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NotTriggerModuleProvPackageImpl() {
		super(eNS_URI, NotTriggerModuleProvFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NotTriggerModuleProvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NotTriggerModuleProvPackage init() {
		if (isInited) return (NotTriggerModuleProvPackage)EPackage.Registry.INSTANCE.getEPackage(NotTriggerModuleProvPackage.eNS_URI);

		// Obtain or create and register package
		NotTriggerModuleProvPackageImpl theNotTriggerModuleProvPackage = (NotTriggerModuleProvPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NotTriggerModuleProvPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NotTriggerModuleProvPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theNotTriggerModuleProvPackage.createPackageContents();

		// Initialize created meta-data
		theNotTriggerModuleProvPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNotTriggerModuleProvPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NotTriggerModuleProvPackage.eNS_URI, theNotTriggerModuleProvPackage);
		return theNotTriggerModuleProvPackage;
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
	public EOperation getNotTrigger__EvalTrigger__Object() {
		return notTriggerEClass.getEOperations().get(0);
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
	public EOperation getOrTrigger__EvalTrigger__Object() {
		return orTriggerEClass.getEOperations().get(0);
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
	public NotTriggerModuleProvFactory getNotTriggerModuleProvFactory() {
		return (NotTriggerModuleProvFactory)getEFactoryInstance();
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
		createEOperation(notTriggerEClass, NOT_TRIGGER___EVAL_TRIGGER__OBJECT);

		orTriggerEClass = createEClass(OR_TRIGGER);
		createEReference(orTriggerEClass, OR_TRIGGER__LEFT);
		createEReference(orTriggerEClass, OR_TRIGGER__RIGHT);
		createEOperation(orTriggerEClass, OR_TRIGGER___EVAL_TRIGGER__OBJECT);

		triggerEClass = createEClass(TRIGGER);
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

		EOperation op = initEOperation(getNotTrigger__EvalTrigger__Object(), ecorePackage.getEBoolean(), "evalTrigger", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "events", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(orTriggerEClass, OrTrigger.class, "OrTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrTrigger_Left(), this.getTrigger(), null, "left", null, 1, 1, OrTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrTrigger_Right(), this.getTrigger(), null, "right", null, 1, 1, OrTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOrTrigger__EvalTrigger__Object(), ecorePackage.getEBoolean(), "evalTrigger", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "events", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //NotTriggerModuleProvPackageImpl

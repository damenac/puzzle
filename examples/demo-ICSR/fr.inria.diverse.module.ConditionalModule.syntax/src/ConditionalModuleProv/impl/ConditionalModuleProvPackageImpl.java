/**
 */
package ConditionalModuleProv.impl;

import ConditionalModuleProv.Conditional;
import ConditionalModuleProv.ConditionalModuleProvFactory;
import ConditionalModuleProv.ConditionalModuleProvPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionalModuleProvPackageImpl extends EPackageImpl implements ConditionalModuleProvPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalEClass = null;

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
	 * @see ConditionalModuleProv.ConditionalModuleProvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConditionalModuleProvPackageImpl() {
		super(eNS_URI, ConditionalModuleProvFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConditionalModuleProvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConditionalModuleProvPackage init() {
		if (isInited) return (ConditionalModuleProvPackage)EPackage.Registry.INSTANCE.getEPackage(ConditionalModuleProvPackage.eNS_URI);

		// Obtain or create and register package
		ConditionalModuleProvPackageImpl theConditionalModuleProvPackage = (ConditionalModuleProvPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConditionalModuleProvPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConditionalModuleProvPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theConditionalModuleProvPackage.createPackageContents();

		// Initialize created meta-data
		theConditionalModuleProvPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConditionalModuleProvPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConditionalModuleProvPackage.eNS_URI, theConditionalModuleProvPackage);
		return theConditionalModuleProvPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditional() {
		return conditionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalModuleProvFactory getConditionalModuleProvFactory() {
		return (ConditionalModuleProvFactory)getEFactoryInstance();
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
		conditionalEClass = createEClass(CONDITIONAL);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(conditionalEClass, Conditional.class, "Conditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ConditionalModuleProvPackageImpl

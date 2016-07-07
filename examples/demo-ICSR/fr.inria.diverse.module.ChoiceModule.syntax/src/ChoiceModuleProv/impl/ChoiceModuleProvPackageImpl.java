/**
 */
package ChoiceModuleProv.impl;

import ChoiceModuleProv.Choice;
import ChoiceModuleProv.ChoiceModuleProvFactory;
import ChoiceModuleProv.ChoiceModuleProvPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChoiceModuleProvPackageImpl extends EPackageImpl implements ChoiceModuleProvPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

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
	 * @see ChoiceModuleProv.ChoiceModuleProvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ChoiceModuleProvPackageImpl() {
		super(eNS_URI, ChoiceModuleProvFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ChoiceModuleProvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ChoiceModuleProvPackage init() {
		if (isInited) return (ChoiceModuleProvPackage)EPackage.Registry.INSTANCE.getEPackage(ChoiceModuleProvPackage.eNS_URI);

		// Obtain or create and register package
		ChoiceModuleProvPackageImpl theChoiceModuleProvPackage = (ChoiceModuleProvPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ChoiceModuleProvPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ChoiceModuleProvPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theChoiceModuleProvPackage.createPackageContents();

		// Initialize created meta-data
		theChoiceModuleProvPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theChoiceModuleProvPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ChoiceModuleProvPackage.eNS_URI, theChoiceModuleProvPackage);
		return theChoiceModuleProvPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceModuleProvFactory getChoiceModuleProvFactory() {
		return (ChoiceModuleProvFactory)getEFactoryInstance();
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
		choiceEClass = createEClass(CHOICE);
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
		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ChoiceModuleProvPackageImpl

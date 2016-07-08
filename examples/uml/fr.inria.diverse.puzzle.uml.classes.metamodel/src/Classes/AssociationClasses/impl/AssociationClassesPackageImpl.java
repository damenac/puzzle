/**
 */
package Classes.AssociationClasses.impl;

import Classes.AssociationClasses.AssociationClass;
import Classes.AssociationClasses.AssociationClassesFactory;
import Classes.AssociationClasses.AssociationClassesPackage;

import Classes.Dependencies.DependenciesPackage;

import Classes.Dependencies.impl.DependenciesPackageImpl;

import Classes.Interfaces.InterfacesPackage;

import Classes.Interfaces.impl.InterfacesPackageImpl;

import Classes.Kernel.KernelPackage;

import Classes.Kernel.impl.KernelPackageImpl;

import Classes.PowerTypes.PowerTypesPackage;

import Classes.PowerTypes.impl.PowerTypesPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociationClassesPackageImpl extends EPackageImpl implements AssociationClassesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationClassEClass = null;

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
	 * @see Classes.AssociationClasses.AssociationClassesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssociationClassesPackageImpl() {
		super(eNS_URI, AssociationClassesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AssociationClassesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AssociationClassesPackage init() {
		if (isInited) return (AssociationClassesPackage)EPackage.Registry.INSTANCE.getEPackage(AssociationClassesPackage.eNS_URI);

		// Obtain or create and register package
		AssociationClassesPackageImpl theAssociationClassesPackage = (AssociationClassesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AssociationClassesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AssociationClassesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) instanceof KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) : KernelPackage.eINSTANCE);
		DependenciesPackageImpl theDependenciesPackage = (DependenciesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DependenciesPackage.eNS_URI) instanceof DependenciesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DependenciesPackage.eNS_URI) : DependenciesPackage.eINSTANCE);
		InterfacesPackageImpl theInterfacesPackage = (InterfacesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI) instanceof InterfacesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI) : InterfacesPackage.eINSTANCE);
		PowerTypesPackageImpl thePowerTypesPackage = (PowerTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PowerTypesPackage.eNS_URI) instanceof PowerTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PowerTypesPackage.eNS_URI) : PowerTypesPackage.eINSTANCE);

		// Create package meta-data objects
		theAssociationClassesPackage.createPackageContents();
		theKernelPackage.createPackageContents();
		theDependenciesPackage.createPackageContents();
		theInterfacesPackage.createPackageContents();
		thePowerTypesPackage.createPackageContents();

		// Initialize created meta-data
		theAssociationClassesPackage.initializePackageContents();
		theKernelPackage.initializePackageContents();
		theDependenciesPackage.initializePackageContents();
		theInterfacesPackage.initializePackageContents();
		thePowerTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAssociationClassesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AssociationClassesPackage.eNS_URI, theAssociationClassesPackage);
		return theAssociationClassesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationClass() {
		return associationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationClassesFactory getAssociationClassesFactory() {
		return (AssociationClassesFactory)getEFactoryInstance();
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
		associationClassEClass = createEClass(ASSOCIATION_CLASS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		associationClassEClass.getESuperTypes().add(theKernelPackage.getClass_());
		associationClassEClass.getESuperTypes().add(theKernelPackage.getAssociation());

		// Initialize classes, features, and operations; add parameters
		initEClass(associationClassEClass, AssociationClass.class, "AssociationClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AssociationClassesPackageImpl

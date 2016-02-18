/**
 */
package simpleconstraintsprov.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simpleconstraintsprov.Constraint;
import simpleconstraintsprov.SimpleconstraintsprovFactory;
import simpleconstraintsprov.SimpleconstraintsprovPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleconstraintsprovPackageImpl extends EPackageImpl implements SimpleconstraintsprovPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

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
	 * @see simpleconstraintsprov.SimpleconstraintsprovPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimpleconstraintsprovPackageImpl() {
		super(eNS_URI, SimpleconstraintsprovFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SimpleconstraintsprovPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimpleconstraintsprovPackage init() {
		if (isInited) return (SimpleconstraintsprovPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleconstraintsprovPackage.eNS_URI);

		// Obtain or create and register package
		SimpleconstraintsprovPackageImpl theSimpleconstraintsprovPackage = (SimpleconstraintsprovPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimpleconstraintsprovPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimpleconstraintsprovPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSimpleconstraintsprovPackage.createPackageContents();

		// Initialize created meta-data
		theSimpleconstraintsprovPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimpleconstraintsprovPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimpleconstraintsprovPackage.eNS_URI, theSimpleconstraintsprovPackage);
		return theSimpleconstraintsprovPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleconstraintsprovFactory getSimpleconstraintsprovFactory() {
		return (SimpleconstraintsprovFactory)getEFactoryInstance();
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
		constraintEClass = createEClass(CONSTRAINT);
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
		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SimpleconstraintsprovPackageImpl

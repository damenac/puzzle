/**
 */
package Activities.CompleteStructuredActivities.impl;

import Activities.BasicActivities.BasicActivitiesPackage;

import Activities.BasicActivities.impl.BasicActivitiesPackageImpl;

import Activities.CompleteStructuredActivities.CompleteStructuredActivitiesFactory;
import Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage;
import Activities.CompleteStructuredActivities.InputPin;

import Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage;

import Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl;

import Activities.FundamentalActivities.FundamentalActivitiesPackage;

import Activities.FundamentalActivities.impl.FundamentalActivitiesPackageImpl;

import Activities.IntermediateActivities.IntermediateActivitiesPackage;

import Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl;

import Activities.StructuredActivities.StructuredActivitiesPackage;

import Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompleteStructuredActivitiesPackageImpl extends EPackageImpl implements CompleteStructuredActivitiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPinEClass = null;

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
	 * @see Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CompleteStructuredActivitiesPackageImpl() {
		super(eNS_URI, CompleteStructuredActivitiesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CompleteStructuredActivitiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CompleteStructuredActivitiesPackage init() {
		if (isInited) return (CompleteStructuredActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(CompleteStructuredActivitiesPackage.eNS_URI);

		// Obtain or create and register package
		CompleteStructuredActivitiesPackageImpl theCompleteStructuredActivitiesPackage = (CompleteStructuredActivitiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CompleteStructuredActivitiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CompleteStructuredActivitiesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FundamentalActivitiesPackageImpl theFundamentalActivitiesPackage = (FundamentalActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FundamentalActivitiesPackage.eNS_URI) instanceof FundamentalActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FundamentalActivitiesPackage.eNS_URI) : FundamentalActivitiesPackage.eINSTANCE);
		BasicActivitiesPackageImpl theBasicActivitiesPackage = (BasicActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActivitiesPackage.eNS_URI) instanceof BasicActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActivitiesPackage.eNS_URI) : BasicActivitiesPackage.eINSTANCE);
		IntermediateActivitiesPackageImpl theIntermediateActivitiesPackage = (IntermediateActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) instanceof IntermediateActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) : IntermediateActivitiesPackage.eINSTANCE);
		StructuredActivitiesPackageImpl theStructuredActivitiesPackage = (StructuredActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructuredActivitiesPackage.eNS_URI) instanceof StructuredActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructuredActivitiesPackage.eNS_URI) : StructuredActivitiesPackage.eINSTANCE);
		ExtraStructuredActivitiesPackageImpl theExtraStructuredActivitiesPackage = (ExtraStructuredActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtraStructuredActivitiesPackage.eNS_URI) instanceof ExtraStructuredActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtraStructuredActivitiesPackage.eNS_URI) : ExtraStructuredActivitiesPackage.eINSTANCE);

		// Create package meta-data objects
		theCompleteStructuredActivitiesPackage.createPackageContents();
		theFundamentalActivitiesPackage.createPackageContents();
		theBasicActivitiesPackage.createPackageContents();
		theIntermediateActivitiesPackage.createPackageContents();
		theStructuredActivitiesPackage.createPackageContents();
		theExtraStructuredActivitiesPackage.createPackageContents();

		// Initialize created meta-data
		theCompleteStructuredActivitiesPackage.initializePackageContents();
		theFundamentalActivitiesPackage.initializePackageContents();
		theBasicActivitiesPackage.initializePackageContents();
		theIntermediateActivitiesPackage.initializePackageContents();
		theStructuredActivitiesPackage.initializePackageContents();
		theExtraStructuredActivitiesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCompleteStructuredActivitiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CompleteStructuredActivitiesPackage.eNS_URI, theCompleteStructuredActivitiesPackage);
		return theCompleteStructuredActivitiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPin() {
		return inputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteStructuredActivitiesFactory getCompleteStructuredActivitiesFactory() {
		return (CompleteStructuredActivitiesFactory)getEFactoryInstance();
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
		inputPinEClass = createEClass(INPUT_PIN);
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
		initEClass(inputPinEClass, InputPin.class, "InputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (inputPinEClass, 
		   source, 
		   new String[] {
		   });
	}

} //CompleteStructuredActivitiesPackageImpl

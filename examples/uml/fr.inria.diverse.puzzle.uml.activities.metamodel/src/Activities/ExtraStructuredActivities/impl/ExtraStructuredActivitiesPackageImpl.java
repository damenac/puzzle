/**
 */
package Activities.ExtraStructuredActivities.impl;

import Activities.BasicActivities.BasicActivitiesPackage;

import Activities.BasicActivities.impl.BasicActivitiesPackageImpl;

import Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage;

import Activities.CompleteStructuredActivities.impl.CompleteStructuredActivitiesPackageImpl;

import Activities.ExtraStructuredActivities.Classifier;
import Activities.ExtraStructuredActivities.ExceptionHandler;
import Activities.ExtraStructuredActivities.ExpansionKind;
import Activities.ExtraStructuredActivities.ExpansionNode;
import Activities.ExtraStructuredActivities.ExpansionRegion;
import Activities.ExtraStructuredActivities.ExtraStructuredActivitiesFactory;
import Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage;

import Activities.FundamentalActivities.FundamentalActivitiesPackage;

import Activities.FundamentalActivities.impl.FundamentalActivitiesPackageImpl;

import Activities.IntermediateActivities.IntermediateActivitiesPackage;

import Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl;

import Activities.StructuredActivities.StructuredActivitiesPackage;

import Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtraStructuredActivitiesPackageImpl extends EPackageImpl implements ExtraStructuredActivitiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum expansionKindEEnum = null;

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
	 * @see Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExtraStructuredActivitiesPackageImpl() {
		super(eNS_URI, ExtraStructuredActivitiesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExtraStructuredActivitiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExtraStructuredActivitiesPackage init() {
		if (isInited) return (ExtraStructuredActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(ExtraStructuredActivitiesPackage.eNS_URI);

		// Obtain or create and register package
		ExtraStructuredActivitiesPackageImpl theExtraStructuredActivitiesPackage = (ExtraStructuredActivitiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExtraStructuredActivitiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExtraStructuredActivitiesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FundamentalActivitiesPackageImpl theFundamentalActivitiesPackage = (FundamentalActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FundamentalActivitiesPackage.eNS_URI) instanceof FundamentalActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FundamentalActivitiesPackage.eNS_URI) : FundamentalActivitiesPackage.eINSTANCE);
		BasicActivitiesPackageImpl theBasicActivitiesPackage = (BasicActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActivitiesPackage.eNS_URI) instanceof BasicActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActivitiesPackage.eNS_URI) : BasicActivitiesPackage.eINSTANCE);
		IntermediateActivitiesPackageImpl theIntermediateActivitiesPackage = (IntermediateActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) instanceof IntermediateActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) : IntermediateActivitiesPackage.eINSTANCE);
		StructuredActivitiesPackageImpl theStructuredActivitiesPackage = (StructuredActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructuredActivitiesPackage.eNS_URI) instanceof StructuredActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructuredActivitiesPackage.eNS_URI) : StructuredActivitiesPackage.eINSTANCE);
		CompleteStructuredActivitiesPackageImpl theCompleteStructuredActivitiesPackage = (CompleteStructuredActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompleteStructuredActivitiesPackage.eNS_URI) instanceof CompleteStructuredActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompleteStructuredActivitiesPackage.eNS_URI) : CompleteStructuredActivitiesPackage.eINSTANCE);

		// Create package meta-data objects
		theExtraStructuredActivitiesPackage.createPackageContents();
		theFundamentalActivitiesPackage.createPackageContents();
		theBasicActivitiesPackage.createPackageContents();
		theIntermediateActivitiesPackage.createPackageContents();
		theStructuredActivitiesPackage.createPackageContents();
		theCompleteStructuredActivitiesPackage.createPackageContents();

		// Initialize created meta-data
		theExtraStructuredActivitiesPackage.initializePackageContents();
		theFundamentalActivitiesPackage.initializePackageContents();
		theBasicActivitiesPackage.initializePackageContents();
		theIntermediateActivitiesPackage.initializePackageContents();
		theStructuredActivitiesPackage.initializePackageContents();
		theCompleteStructuredActivitiesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExtraStructuredActivitiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExtraStructuredActivitiesPackage.eNS_URI, theExtraStructuredActivitiesPackage);
		return theExtraStructuredActivitiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionHandler() {
		return exceptionHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_HandlerBody() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_ProtectedNode() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_ExceptionInput() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_ExceptionType() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionRegion() {
		return expansionRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpansionRegion_Mode() {
		return (EAttribute)expansionRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionRegion_InputElement() {
		return (EReference)expansionRegionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionRegion_OutputElement() {
		return (EReference)expansionRegionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionNode() {
		return expansionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionNode_RegionAsInput() {
		return (EReference)expansionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionNode_RegionAsOutput() {
		return (EReference)expansionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExpansionKind() {
		return expansionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtraStructuredActivitiesFactory getExtraStructuredActivitiesFactory() {
		return (ExtraStructuredActivitiesFactory)getEFactoryInstance();
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
		exceptionHandlerEClass = createEClass(EXCEPTION_HANDLER);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__HANDLER_BODY);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__PROTECTED_NODE);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__EXCEPTION_INPUT);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__EXCEPTION_TYPE);

		classifierEClass = createEClass(CLASSIFIER);

		expansionRegionEClass = createEClass(EXPANSION_REGION);
		createEAttribute(expansionRegionEClass, EXPANSION_REGION__MODE);
		createEReference(expansionRegionEClass, EXPANSION_REGION__INPUT_ELEMENT);
		createEReference(expansionRegionEClass, EXPANSION_REGION__OUTPUT_ELEMENT);

		expansionNodeEClass = createEClass(EXPANSION_NODE);
		createEReference(expansionNodeEClass, EXPANSION_NODE__REGION_AS_INPUT);
		createEReference(expansionNodeEClass, EXPANSION_NODE__REGION_AS_OUTPUT);

		// Create enums
		expansionKindEEnum = createEEnum(EXPANSION_KIND);
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
		IntermediateActivitiesPackage theIntermediateActivitiesPackage = (IntermediateActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI);
		StructuredActivitiesPackage theStructuredActivitiesPackage = (StructuredActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredActivitiesPackage.eNS_URI);
		BasicActivitiesPackage theBasicActivitiesPackage = (BasicActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(BasicActivitiesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		exceptionHandlerEClass.getESuperTypes().add(theIntermediateActivitiesPackage.getElement());
		expansionRegionEClass.getESuperTypes().add(theStructuredActivitiesPackage.getStructuredActivityNode());
		expansionNodeEClass.getESuperTypes().add(theBasicActivitiesPackage.getObjectNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(exceptionHandlerEClass, ExceptionHandler.class, "ExceptionHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExceptionHandler_HandlerBody(), theStructuredActivitiesPackage.getExecutableNode(), null, "handlerBody", null, 1, 1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExceptionHandler_ProtectedNode(), theStructuredActivitiesPackage.getExecutableNode(), theStructuredActivitiesPackage.getExecutableNode_Handler(), "protectedNode", null, 1, 1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExceptionHandler_ExceptionInput(), theBasicActivitiesPackage.getObjectNode(), null, "exceptionInput", null, 1, 1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExceptionHandler_ExceptionType(), this.getClassifier(), null, "exceptionType", null, 1, -1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expansionRegionEClass, ExpansionRegion.class, "ExpansionRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpansionRegion_Mode(), this.getExpansionKind(), "mode", null, 0, 1, ExpansionRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpansionRegion_InputElement(), this.getExpansionNode(), this.getExpansionNode_RegionAsInput(), "inputElement", null, 1, -1, ExpansionRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpansionRegion_OutputElement(), this.getExpansionNode(), this.getExpansionNode_RegionAsOutput(), "outputElement", null, 0, -1, ExpansionRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expansionNodeEClass, ExpansionNode.class, "ExpansionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpansionNode_RegionAsInput(), this.getExpansionRegion(), this.getExpansionRegion_InputElement(), "regionAsInput", null, 0, 1, ExpansionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpansionNode_RegionAsOutput(), this.getExpansionRegion(), this.getExpansionRegion_OutputElement(), "regionAsOutput", null, 0, 1, ExpansionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(expansionKindEEnum, ExpansionKind.class, "ExpansionKind");
		addEEnumLiteral(expansionKindEEnum, ExpansionKind.PARALLEL);
		addEEnumLiteral(expansionKindEEnum, ExpansionKind.ITERATIVE);
		addEEnumLiteral(expansionKindEEnum, ExpansionKind.STREAM);

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
		  (classifierEClass, 
		   source, 
		   new String[] {
		   });
	}

} //ExtraStructuredActivitiesPackageImpl

/**
 */
package CommonBehavior.BasicBehavior.impl;

import CommonBehavior.BasicBehavior.BasicBehaviorFactory;
import CommonBehavior.BasicBehavior.BasicBehaviorPackage;
import CommonBehavior.BasicBehavior.Behavior;
import CommonBehavior.BasicBehavior.BehavioralFeature;
import CommonBehavior.BasicBehavior.BehavioredClassifier;
import CommonBehavior.BasicBehavior.Classifier;
import CommonBehavior.BasicBehavior.Constraint;
import CommonBehavior.BasicBehavior.FunctionBehavior;
import CommonBehavior.BasicBehavior.OpaqueBehavior;
import CommonBehavior.BasicBehavior.OpaqueExpression;
import CommonBehavior.BasicBehavior.Parameter;
import CommonBehavior.BasicBehavior.RedefinableElement;

import CommonBehavior.Communications.CommunicationsPackage;

import CommonBehavior.Communications.impl.CommunicationsPackageImpl;

import CommonBehavior.SimpleTime.SimpleTimePackage;

import CommonBehavior.SimpleTime.impl.SimpleTimePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
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
public class BasicBehaviorPackageImpl extends EPackageImpl implements BasicBehaviorPackage {
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
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioralFeatureEClass = null;

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
	private EClass opaqueExpressionEClass = null;

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
	 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasicBehaviorPackageImpl() {
		super(eNS_URI, BasicBehaviorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BasicBehaviorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasicBehaviorPackage init() {
		if (isInited) return (BasicBehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorPackage.eNS_URI);

		// Obtain or create and register package
		BasicBehaviorPackageImpl theBasicBehaviorPackage = (BasicBehaviorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasicBehaviorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasicBehaviorPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CommunicationsPackageImpl theCommunicationsPackage = (CommunicationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommunicationsPackage.eNS_URI) instanceof CommunicationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommunicationsPackage.eNS_URI) : CommunicationsPackage.eINSTANCE);
		SimpleTimePackageImpl theSimpleTimePackage = (SimpleTimePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SimpleTimePackage.eNS_URI) instanceof SimpleTimePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SimpleTimePackage.eNS_URI) : SimpleTimePackage.eINSTANCE);

		// Create package meta-data objects
		theBasicBehaviorPackage.createPackageContents();
		theCommunicationsPackage.createPackageContents();
		theSimpleTimePackage.createPackageContents();

		// Initialize created meta-data
		theBasicBehaviorPackage.initializePackageContents();
		theCommunicationsPackage.initializePackageContents();
		theSimpleTimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasicBehaviorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasicBehaviorPackage.eNS_URI, theBasicBehaviorPackage);
		return theBasicBehaviorPackage;
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
	public EReference getBehavioredClassifier_OwnedBehavior() {
		return (EReference)behavioredClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_ClassifierBehavior() {
		return (EReference)behavioredClassifierEClass.getEStructuralFeatures().get(1);
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
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedReception() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavior() {
		return behaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Context() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_IsReentrant() {
		return (EAttribute)behaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_RedefinedBehavior() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Specification() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_OwnedParameter() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Precondition() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Postcondition() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinableElement() {
		return redefinableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueBehavior() {
		return opaqueBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueBehavior_Body() {
		return (EAttribute)opaqueBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueBehavior_Language() {
		return (EAttribute)opaqueBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionBehavior() {
		return functionBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioralFeature() {
		return behavioralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_Method() {
		return (EReference)behavioralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavioralFeature_Concurrency() {
		return (EAttribute)behavioralFeatureEClass.getEStructuralFeatures().get(1);
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
	public EClass getOpaqueExpression() {
		return opaqueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueExpression_Result() {
		return (EReference)opaqueExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueExpression_Behavior() {
		return (EReference)opaqueExpressionEClass.getEStructuralFeatures().get(1);
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
	public BasicBehaviorFactory getBasicBehaviorFactory() {
		return (BasicBehaviorFactory)getEFactoryInstance();
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
		behavioredClassifierEClass = createEClass(BEHAVIORED_CLASSIFIER);
		createEReference(behavioredClassifierEClass, BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR);
		createEReference(behavioredClassifierEClass, BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR);

		classifierEClass = createEClass(CLASSIFIER);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__OWNED_RECEPTION);

		behaviorEClass = createEClass(BEHAVIOR);
		createEReference(behaviorEClass, BEHAVIOR__CONTEXT);
		createEAttribute(behaviorEClass, BEHAVIOR__IS_REENTRANT);
		createEReference(behaviorEClass, BEHAVIOR__REDEFINED_BEHAVIOR);
		createEReference(behaviorEClass, BEHAVIOR__SPECIFICATION);
		createEReference(behaviorEClass, BEHAVIOR__OWNED_PARAMETER);
		createEReference(behaviorEClass, BEHAVIOR__PRECONDITION);
		createEReference(behaviorEClass, BEHAVIOR__POSTCONDITION);

		redefinableElementEClass = createEClass(REDEFINABLE_ELEMENT);

		opaqueBehaviorEClass = createEClass(OPAQUE_BEHAVIOR);
		createEAttribute(opaqueBehaviorEClass, OPAQUE_BEHAVIOR__BODY);
		createEAttribute(opaqueBehaviorEClass, OPAQUE_BEHAVIOR__LANGUAGE);

		functionBehaviorEClass = createEClass(FUNCTION_BEHAVIOR);

		behavioralFeatureEClass = createEClass(BEHAVIORAL_FEATURE);
		createEReference(behavioralFeatureEClass, BEHAVIORAL_FEATURE__METHOD);
		createEAttribute(behavioralFeatureEClass, BEHAVIORAL_FEATURE__CONCURRENCY);

		parameterEClass = createEClass(PARAMETER);

		opaqueExpressionEClass = createEClass(OPAQUE_EXPRESSION);
		createEReference(opaqueExpressionEClass, OPAQUE_EXPRESSION__RESULT);
		createEReference(opaqueExpressionEClass, OPAQUE_EXPRESSION__BEHAVIOR);

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

		// Obtain other dependent packages
		CommunicationsPackage theCommunicationsPackage = (CommunicationsPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		behavioredClassifierEClass.getESuperTypes().add(this.getClassifier());
		classifierEClass.getESuperTypes().add(this.getRedefinableElement());
		classEClass.getESuperTypes().add(this.getClassifier());
		classEClass.getESuperTypes().add(this.getBehavioredClassifier());
		behaviorEClass.getESuperTypes().add(this.getClass_());
		opaqueBehaviorEClass.getESuperTypes().add(this.getBehavior());
		functionBehaviorEClass.getESuperTypes().add(this.getOpaqueBehavior());

		// Initialize classes, features, and operations; add parameters
		initEClass(behavioredClassifierEClass, BehavioredClassifier.class, "BehavioredClassifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavioredClassifier_OwnedBehavior(), this.getBehavior(), null, "ownedBehavior", null, 0, -1, BehavioredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehavioredClassifier_ClassifierBehavior(), this.getBehavior(), null, "classifierBehavior", null, 0, 1, BehavioredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classEClass, CommonBehavior.BasicBehavior.Class.class, "Class", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_OwnedReception(), theCommunicationsPackage.getReception(), null, "ownedReception", null, 0, -1, CommonBehavior.BasicBehavior.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorEClass, Behavior.class, "Behavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavior_Context(), this.getBehavioredClassifier(), null, "context", null, 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehavior_IsReentrant(), ecorePackage.getEBoolean(), "isReentrant", null, 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehavior_RedefinedBehavior(), this.getBehavior(), null, "redefinedBehavior", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehavior_Specification(), this.getBehavioralFeature(), this.getBehavioralFeature_Method(), "specification", null, 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehavior_OwnedParameter(), this.getParameter(), null, "ownedParameter", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehavior_Precondition(), this.getConstraint(), null, "precondition", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehavior_Postcondition(), this.getConstraint(), null, "postcondition", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(redefinableElementEClass, RedefinableElement.class, "RedefinableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opaqueBehaviorEClass, OpaqueBehavior.class, "OpaqueBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpaqueBehavior_Body(), ecorePackage.getEString(), "body", null, 0, -1, OpaqueBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpaqueBehavior_Language(), ecorePackage.getEString(), "language", null, 0, -1, OpaqueBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionBehaviorEClass, FunctionBehavior.class, "FunctionBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(behavioralFeatureEClass, BehavioralFeature.class, "BehavioralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavioralFeature_Method(), this.getBehavior(), this.getBehavior_Specification(), "method", null, 0, -1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehavioralFeature_Concurrency(), theCommunicationsPackage.getCallConcurrencyFeature(), "concurrency", null, 0, 1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opaqueExpressionEClass, OpaqueExpression.class, "OpaqueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpaqueExpression_Result(), this.getParameter(), null, "result", null, 0, 1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpaqueExpression_Behavior(), this.getBehavior(), null, "behavior", null, 0, 1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (redefinableElementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (opaqueExpressionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (constraintEClass, 
		   source, 
		   new String[] {
		   });
	}

} //BasicBehaviorPackageImpl

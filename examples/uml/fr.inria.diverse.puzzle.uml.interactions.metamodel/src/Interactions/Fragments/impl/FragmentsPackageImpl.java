/**
 */
package Interactions.Fragments.impl;

import Interactions.BasicInteractions.BasicInteractionsPackage;

import Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl;

import Interactions.Fragments.CombinedFragment;
import Interactions.Fragments.ConsiderIgnoreFragment;
import Interactions.Fragments.Continuation;
import Interactions.Fragments.FragmentsFactory;
import Interactions.Fragments.FragmentsPackage;
import Interactions.Fragments.Gate;
import Interactions.Fragments.InteractionConstraint;
import Interactions.Fragments.InteractionOperand;
import Interactions.Fragments.InteractionOperandKind;
import Interactions.Fragments.InteractionUse;
import Interactions.Fragments.Namespace;
import Interactions.Fragments.PartDecomposition;
import Interactions.Fragments.Property;

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
public class FragmentsPackageImpl extends EPackageImpl implements FragmentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionOperandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinedFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass considerIgnoreFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partDecompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interactionOperandKindEEnum = null;

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
	 * @see Interactions.Fragments.FragmentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FragmentsPackageImpl() {
		super(eNS_URI, FragmentsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FragmentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FragmentsPackage init() {
		if (isInited) return (FragmentsPackage)EPackage.Registry.INSTANCE.getEPackage(FragmentsPackage.eNS_URI);

		// Obtain or create and register package
		FragmentsPackageImpl theFragmentsPackage = (FragmentsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FragmentsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FragmentsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasicInteractionsPackageImpl theBasicInteractionsPackage = (BasicInteractionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicInteractionsPackage.eNS_URI) instanceof BasicInteractionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicInteractionsPackage.eNS_URI) : BasicInteractionsPackage.eINSTANCE);

		// Create package meta-data objects
		theFragmentsPackage.createPackageContents();
		theBasicInteractionsPackage.createPackageContents();

		// Initialize created meta-data
		theFragmentsPackage.initializePackageContents();
		theBasicInteractionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFragmentsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FragmentsPackage.eNS_URI, theFragmentsPackage);
		return theFragmentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionOperand() {
		return interactionOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionOperand_Fragment() {
		return (EReference)interactionOperandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionOperand_Guard() {
		return (EReference)interactionOperandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinedFragment() {
		return combinedFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedFragment_Operand() {
		return (EReference)combinedFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCombinedFragment_InteractionOperator() {
		return (EAttribute)combinedFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedFragment_CfragmentGate() {
		return (EReference)combinedFragmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsiderIgnoreFragment() {
		return considerIgnoreFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsiderIgnoreFragment_Message() {
		return (EReference)considerIgnoreFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuation() {
		return continuationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinuation_Setting() {
		return (EAttribute)continuationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionConstraint() {
		return interactionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionConstraint_Maxint() {
		return (EReference)interactionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionConstraint_Minint() {
		return (EReference)interactionConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGate() {
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionUse() {
		return interactionUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_ActualGate() {
		return (EReference)interactionUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_Argument() {
		return (EReference)interactionUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_ReturnValue() {
		return (EReference)interactionUseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_ReturnValueRecipient() {
		return (EReference)interactionUseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_RefersTo() {
		return (EReference)interactionUseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartDecomposition() {
		return partDecompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInteractionOperandKind() {
		return interactionOperandKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FragmentsFactory getFragmentsFactory() {
		return (FragmentsFactory)getEFactoryInstance();
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
		interactionOperandEClass = createEClass(INTERACTION_OPERAND);
		createEReference(interactionOperandEClass, INTERACTION_OPERAND__FRAGMENT);
		createEReference(interactionOperandEClass, INTERACTION_OPERAND__GUARD);

		namespaceEClass = createEClass(NAMESPACE);

		combinedFragmentEClass = createEClass(COMBINED_FRAGMENT);
		createEReference(combinedFragmentEClass, COMBINED_FRAGMENT__OPERAND);
		createEAttribute(combinedFragmentEClass, COMBINED_FRAGMENT__INTERACTION_OPERATOR);
		createEReference(combinedFragmentEClass, COMBINED_FRAGMENT__CFRAGMENT_GATE);

		considerIgnoreFragmentEClass = createEClass(CONSIDER_IGNORE_FRAGMENT);
		createEReference(considerIgnoreFragmentEClass, CONSIDER_IGNORE_FRAGMENT__MESSAGE);

		continuationEClass = createEClass(CONTINUATION);
		createEAttribute(continuationEClass, CONTINUATION__SETTING);

		interactionConstraintEClass = createEClass(INTERACTION_CONSTRAINT);
		createEReference(interactionConstraintEClass, INTERACTION_CONSTRAINT__MAXINT);
		createEReference(interactionConstraintEClass, INTERACTION_CONSTRAINT__MININT);

		gateEClass = createEClass(GATE);

		interactionUseEClass = createEClass(INTERACTION_USE);
		createEReference(interactionUseEClass, INTERACTION_USE__ACTUAL_GATE);
		createEReference(interactionUseEClass, INTERACTION_USE__ARGUMENT);
		createEReference(interactionUseEClass, INTERACTION_USE__RETURN_VALUE);
		createEReference(interactionUseEClass, INTERACTION_USE__RETURN_VALUE_RECIPIENT);
		createEReference(interactionUseEClass, INTERACTION_USE__REFERS_TO);

		propertyEClass = createEClass(PROPERTY);

		partDecompositionEClass = createEClass(PART_DECOMPOSITION);

		// Create enums
		interactionOperandKindEEnum = createEEnum(INTERACTION_OPERAND_KIND);
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
		BasicInteractionsPackage theBasicInteractionsPackage = (BasicInteractionsPackage)EPackage.Registry.INSTANCE.getEPackage(BasicInteractionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interactionOperandEClass.getESuperTypes().add(this.getNamespace());
		considerIgnoreFragmentEClass.getESuperTypes().add(this.getCombinedFragment());
		continuationEClass.getESuperTypes().add(theBasicInteractionsPackage.getInteractionFragment());
		interactionConstraintEClass.getESuperTypes().add(theBasicInteractionsPackage.getConstraint());
		gateEClass.getESuperTypes().add(theBasicInteractionsPackage.getMessageEnd());
		interactionUseEClass.getESuperTypes().add(theBasicInteractionsPackage.getInteractionFragment());
		partDecompositionEClass.getESuperTypes().add(this.getInteractionUse());

		// Initialize classes, features, and operations; add parameters
		initEClass(interactionOperandEClass, InteractionOperand.class, "InteractionOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionOperand_Fragment(), theBasicInteractionsPackage.getInteractionFragment(), theBasicInteractionsPackage.getInteractionFragment_EnclosingOperand(), "fragment", null, 0, -1, InteractionOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionOperand_Guard(), this.getInteractionConstraint(), null, "guard", null, 0, 1, InteractionOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespaceEClass, Namespace.class, "Namespace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(combinedFragmentEClass, CombinedFragment.class, "CombinedFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCombinedFragment_Operand(), this.getInteractionOperand(), null, "operand", null, 1, 1, CombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCombinedFragment_InteractionOperator(), this.getInteractionOperandKind(), "interactionOperator", null, 0, 1, CombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombinedFragment_CfragmentGate(), this.getGate(), null, "cfragmentGate", null, 0, -1, CombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(considerIgnoreFragmentEClass, ConsiderIgnoreFragment.class, "ConsiderIgnoreFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConsiderIgnoreFragment_Message(), theBasicInteractionsPackage.getNamedElement(), null, "message", null, 0, -1, ConsiderIgnoreFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(continuationEClass, Continuation.class, "Continuation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuation_Setting(), ecorePackage.getEBoolean(), "setting", null, 0, 1, Continuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionConstraintEClass, InteractionConstraint.class, "InteractionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionConstraint_Maxint(), theBasicInteractionsPackage.getValueSpecification(), null, "maxint", null, 0, 1, InteractionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionConstraint_Minint(), theBasicInteractionsPackage.getValueSpecification(), null, "minint", null, 0, 1, InteractionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gateEClass, Gate.class, "Gate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionUseEClass, InteractionUse.class, "InteractionUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionUse_ActualGate(), this.getGate(), null, "actualGate", null, 0, -1, InteractionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionUse_Argument(), theBasicInteractionsPackage.getValueSpecification(), null, "argument", null, 0, -1, InteractionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionUse_ReturnValue(), theBasicInteractionsPackage.getValueSpecification(), null, "returnValue", null, 0, 1, InteractionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionUse_ReturnValueRecipient(), this.getProperty(), null, "returnValueRecipient", null, 0, 1, InteractionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionUse_RefersTo(), theBasicInteractionsPackage.getInteraction(), null, "refersTo", null, 1, 1, InteractionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partDecompositionEClass, PartDecomposition.class, "PartDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(interactionOperandKindEEnum, InteractionOperandKind.class, "InteractionOperandKind");
		addEEnumLiteral(interactionOperandKindEEnum, InteractionOperandKind.SEQ);
		addEEnumLiteral(interactionOperandKindEEnum, InteractionOperandKind.ALT);
		addEEnumLiteral(interactionOperandKindEEnum, InteractionOperandKind.OPT);
		addEEnumLiteral(interactionOperandKindEEnum, InteractionOperandKind.BREAK);
		addEEnumLiteral(interactionOperandKindEEnum, InteractionOperandKind.PAR);
		addEEnumLiteral(interactionOperandKindEEnum, InteractionOperandKind.STRICT);
		addEEnumLiteral(interactionOperandKindEEnum, InteractionOperandKind.LOOP);
		addEEnumLiteral(interactionOperandKindEEnum, InteractionOperandKind.CRITICAL);
		addEEnumLiteral(interactionOperandKindEEnum, InteractionOperandKind.NEG);
		addEEnumLiteral(interactionOperandKindEEnum, InteractionOperandKind.ASSERT);
		addEEnumLiteral(interactionOperandKindEEnum, InteractionOperandKind.IGNORE);
		addEEnumLiteral(interactionOperandKindEEnum, InteractionOperandKind.CONSIDER);

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
		  (namespaceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
		   });
	}

} //FragmentsPackageImpl

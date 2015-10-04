/**
 */
package vm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import vm.PBinaryExpression;
import vm.PBinaryOperator;
import vm.PBooleanExpression;
import vm.PConstraint;
import vm.PFeature;
import vm.PFeatureGroup;
import vm.PFeatureGroupCardinality;
import vm.PFeatureModel;
import vm.PFeatureRef;
import vm.PNamedElement;
import vm.PUnaryExpression;
import vm.PUninaryOperator;
import vm.VmFactory;
import vm.VmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmPackageImpl extends EPackageImpl implements VmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pFeatureModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pFeatureGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pFeatureGroupCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pBooleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pFeatureRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pUnaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pBinaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pUninaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pBinaryOperatorEEnum = null;

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
	 * @see vm.VmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VmPackageImpl() {
		super(eNS_URI, VmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VmPackage init() {
		if (isInited) return (VmPackage)EPackage.Registry.INSTANCE.getEPackage(VmPackage.eNS_URI);

		// Obtain or create and register package
		VmPackageImpl theVmPackage = (VmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVmPackage.createPackageContents();

		// Initialize created meta-data
		theVmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VmPackage.eNS_URI, theVmPackage);
		return theVmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPNamedElement() {
		return pNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPNamedElement_Name() {
		return (EAttribute)pNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPFeatureModel() {
		return pFeatureModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPFeatureModel_RootFeature() {
		return (EReference)pFeatureModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPFeatureModel_Constraints() {
		return (EReference)pFeatureModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPFeature() {
		return pFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPFeature_Mandatory() {
		return (EAttribute)pFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPFeature_Children() {
		return (EReference)pFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPFeature_Parent() {
		return (EReference)pFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPFeature_Groups() {
		return (EReference)pFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPFeature_ParentGroup() {
		return (EReference)pFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPFeatureGroup() {
		return pFeatureGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPFeatureGroup_Features() {
		return (EReference)pFeatureGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPFeatureGroup_Cardinality() {
		return (EReference)pFeatureGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPFeatureGroupCardinality() {
		return pFeatureGroupCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPFeatureGroupCardinality_LowerBound() {
		return (EAttribute)pFeatureGroupCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPFeatureGroupCardinality_UpperBound() {
		return (EAttribute)pFeatureGroupCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPConstraint() {
		return pConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPConstraint_Expression() {
		return (EReference)pConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPBooleanExpression() {
		return pBooleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPFeatureRef() {
		return pFeatureRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPFeatureRef_Ref() {
		return (EReference)pFeatureRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPUnaryExpression() {
		return pUnaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPUnaryExpression_Expr() {
		return (EReference)pUnaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPUnaryExpression_Operator() {
		return (EAttribute)pUnaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPBinaryExpression() {
		return pBinaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPBinaryExpression_Left() {
		return (EReference)pBinaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPBinaryExpression_Right() {
		return (EReference)pBinaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPBinaryExpression_Operator() {
		return (EAttribute)pBinaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPUninaryOperator() {
		return pUninaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPBinaryOperator() {
		return pBinaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmFactory getVmFactory() {
		return (VmFactory)getEFactoryInstance();
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
		pNamedElementEClass = createEClass(PNAMED_ELEMENT);
		createEAttribute(pNamedElementEClass, PNAMED_ELEMENT__NAME);

		pFeatureModelEClass = createEClass(PFEATURE_MODEL);
		createEReference(pFeatureModelEClass, PFEATURE_MODEL__ROOT_FEATURE);
		createEReference(pFeatureModelEClass, PFEATURE_MODEL__CONSTRAINTS);

		pFeatureEClass = createEClass(PFEATURE);
		createEAttribute(pFeatureEClass, PFEATURE__MANDATORY);
		createEReference(pFeatureEClass, PFEATURE__CHILDREN);
		createEReference(pFeatureEClass, PFEATURE__PARENT);
		createEReference(pFeatureEClass, PFEATURE__GROUPS);
		createEReference(pFeatureEClass, PFEATURE__PARENT_GROUP);

		pFeatureGroupEClass = createEClass(PFEATURE_GROUP);
		createEReference(pFeatureGroupEClass, PFEATURE_GROUP__FEATURES);
		createEReference(pFeatureGroupEClass, PFEATURE_GROUP__CARDINALITY);

		pFeatureGroupCardinalityEClass = createEClass(PFEATURE_GROUP_CARDINALITY);
		createEAttribute(pFeatureGroupCardinalityEClass, PFEATURE_GROUP_CARDINALITY__LOWER_BOUND);
		createEAttribute(pFeatureGroupCardinalityEClass, PFEATURE_GROUP_CARDINALITY__UPPER_BOUND);

		pConstraintEClass = createEClass(PCONSTRAINT);
		createEReference(pConstraintEClass, PCONSTRAINT__EXPRESSION);

		pBooleanExpressionEClass = createEClass(PBOOLEAN_EXPRESSION);

		pFeatureRefEClass = createEClass(PFEATURE_REF);
		createEReference(pFeatureRefEClass, PFEATURE_REF__REF);

		pUnaryExpressionEClass = createEClass(PUNARY_EXPRESSION);
		createEReference(pUnaryExpressionEClass, PUNARY_EXPRESSION__EXPR);
		createEAttribute(pUnaryExpressionEClass, PUNARY_EXPRESSION__OPERATOR);

		pBinaryExpressionEClass = createEClass(PBINARY_EXPRESSION);
		createEReference(pBinaryExpressionEClass, PBINARY_EXPRESSION__LEFT);
		createEReference(pBinaryExpressionEClass, PBINARY_EXPRESSION__RIGHT);
		createEAttribute(pBinaryExpressionEClass, PBINARY_EXPRESSION__OPERATOR);

		// Create enums
		pUninaryOperatorEEnum = createEEnum(PUNINARY_OPERATOR);
		pBinaryOperatorEEnum = createEEnum(PBINARY_OPERATOR);
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
		pFeatureModelEClass.getESuperTypes().add(this.getPNamedElement());
		pFeatureEClass.getESuperTypes().add(this.getPNamedElement());
		pConstraintEClass.getESuperTypes().add(this.getPNamedElement());
		pFeatureRefEClass.getESuperTypes().add(this.getPBooleanExpression());
		pUnaryExpressionEClass.getESuperTypes().add(this.getPBooleanExpression());
		pBinaryExpressionEClass.getESuperTypes().add(this.getPBooleanExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(pNamedElementEClass, PNamedElement.class, "PNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, PNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pFeatureModelEClass, PFeatureModel.class, "PFeatureModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPFeatureModel_RootFeature(), this.getPFeature(), null, "rootFeature", null, 0, 1, PFeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPFeatureModel_Constraints(), this.getPConstraint(), null, "constraints", null, 0, -1, PFeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pFeatureEClass, PFeature.class, "PFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPFeature_Mandatory(), ecorePackage.getEBoolean(), "mandatory", null, 0, 1, PFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPFeature_Children(), this.getPFeature(), this.getPFeature_Parent(), "children", null, 0, -1, PFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPFeature_Parent(), this.getPFeature(), this.getPFeature_Children(), "parent", null, 0, 1, PFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPFeature_Groups(), this.getPFeatureGroup(), null, "groups", null, 0, -1, PFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPFeature_ParentGroup(), this.getPFeatureGroup(), this.getPFeatureGroup_Features(), "parentGroup", null, 0, 1, PFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pFeatureGroupEClass, PFeatureGroup.class, "PFeatureGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPFeatureGroup_Features(), this.getPFeature(), this.getPFeature_ParentGroup(), "features", null, 1, -1, PFeatureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPFeatureGroup_Cardinality(), this.getPFeatureGroupCardinality(), null, "cardinality", null, 1, 1, PFeatureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pFeatureGroupCardinalityEClass, PFeatureGroupCardinality.class, "PFeatureGroupCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPFeatureGroupCardinality_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 1, 1, PFeatureGroupCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPFeatureGroupCardinality_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 1, 1, PFeatureGroupCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pConstraintEClass, PConstraint.class, "PConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPConstraint_Expression(), this.getPBooleanExpression(), null, "expression", null, 1, 1, PConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pBooleanExpressionEClass, PBooleanExpression.class, "PBooleanExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pFeatureRefEClass, PFeatureRef.class, "PFeatureRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPFeatureRef_Ref(), this.getPFeature(), null, "ref", null, 0, 1, PFeatureRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pUnaryExpressionEClass, PUnaryExpression.class, "PUnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPUnaryExpression_Expr(), this.getPBooleanExpression(), null, "expr", null, 1, 1, PUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPUnaryExpression_Operator(), this.getPUninaryOperator(), "operator", null, 0, 1, PUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pBinaryExpressionEClass, PBinaryExpression.class, "PBinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPBinaryExpression_Left(), this.getPBooleanExpression(), null, "left", null, 1, 1, PBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPBinaryExpression_Right(), this.getPBooleanExpression(), null, "right", null, 1, 1, PBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPBinaryExpression_Operator(), this.getPBinaryOperator(), "operator", null, 0, 1, PBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(pUninaryOperatorEEnum, PUninaryOperator.class, "PUninaryOperator");
		addEEnumLiteral(pUninaryOperatorEEnum, PUninaryOperator.NOT);

		initEEnum(pBinaryOperatorEEnum, PBinaryOperator.class, "PBinaryOperator");
		addEEnumLiteral(pBinaryOperatorEEnum, PBinaryOperator.AND);
		addEEnumLiteral(pBinaryOperatorEEnum, PBinaryOperator.OR);
		addEEnumLiteral(pBinaryOperatorEEnum, PBinaryOperator.IMPLIES);
		addEEnumLiteral(pBinaryOperatorEEnum, PBinaryOperator.XOR);

		// Create resource
		createResource(eNS_URI);
	}

} //VmPackageImpl

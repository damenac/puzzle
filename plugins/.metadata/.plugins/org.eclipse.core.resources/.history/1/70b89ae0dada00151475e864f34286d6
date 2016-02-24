/**
 */
package vm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import vm.AbstractSyntax;
import vm.BinaryExpression;
import vm.BinaryOperator;
import vm.BooleanExpression;
import vm.LanguageConstraint;
import vm.LanguageFeature;
import vm.LanguageFeatureGroup;
import vm.LanguageFeatureGroupCardinality;
import vm.LanguageFeatureModel;
import vm.LanguageFeatureRef;
import vm.LanguageModule;
import vm.PNamedElement;
import vm.Semantics;
import vm.UnaryExpression;
import vm.UninaryOperator;
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
	private EClass languageFeatureModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageFeatureGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageFeatureGroupCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageFeatureRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSyntaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum uninaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryOperatorEEnum = null;

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
	public EClass getLanguageFeatureModel() {
		return languageFeatureModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageFeatureModel_RootFeature() {
		return (EReference)languageFeatureModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageFeatureModel_Constraints() {
		return (EReference)languageFeatureModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageFeature() {
		return languageFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageFeature_Mandatory() {
		return (EAttribute)languageFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageFeature_Children() {
		return (EReference)languageFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageFeature_Parent() {
		return (EReference)languageFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageFeature_Groups() {
		return (EReference)languageFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageFeature_ParentGroup() {
		return (EReference)languageFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageFeature_ImplementationModule() {
		return (EReference)languageFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageFeatureGroup() {
		return languageFeatureGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageFeatureGroup_Features() {
		return (EReference)languageFeatureGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageFeatureGroup_Cardinality() {
		return (EReference)languageFeatureGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageFeatureGroupCardinality() {
		return languageFeatureGroupCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageFeatureGroupCardinality_LowerBound() {
		return (EAttribute)languageFeatureGroupCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageFeatureGroupCardinality_UpperBound() {
		return (EAttribute)languageFeatureGroupCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageConstraint() {
		return languageConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageConstraint_Expression() {
		return (EReference)languageConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageFeatureRef() {
		return languageFeatureRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageFeatureRef_Ref() {
		return (EReference)languageFeatureRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Expr() {
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryExpression_Operator() {
		return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Left() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Right() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryExpression_Operator() {
		return (EAttribute)binaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageModule() {
		return languageModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageModule_As() {
		return (EReference)languageModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageModule_Sem() {
		return (EReference)languageModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSyntax() {
		return abstractSyntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSyntax_EcorePath() {
		return (EAttribute)abstractSyntaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSyntax_EcoreProject() {
		return (EAttribute)abstractSyntaxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSyntax_EcoreRequiredInterfacePath() {
		return (EAttribute)abstractSyntaxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSyntax_EcoreProvidedInterfacePath() {
		return (EAttribute)abstractSyntaxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemantics() {
		return semanticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemantics_XtendPath() {
		return (EAttribute)semanticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemantics_XtendProject() {
		return (EAttribute)semanticsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUninaryOperator() {
		return uninaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryOperator() {
		return binaryOperatorEEnum;
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

		languageFeatureModelEClass = createEClass(LANGUAGE_FEATURE_MODEL);
		createEReference(languageFeatureModelEClass, LANGUAGE_FEATURE_MODEL__ROOT_FEATURE);
		createEReference(languageFeatureModelEClass, LANGUAGE_FEATURE_MODEL__CONSTRAINTS);

		languageFeatureEClass = createEClass(LANGUAGE_FEATURE);
		createEAttribute(languageFeatureEClass, LANGUAGE_FEATURE__MANDATORY);
		createEReference(languageFeatureEClass, LANGUAGE_FEATURE__CHILDREN);
		createEReference(languageFeatureEClass, LANGUAGE_FEATURE__PARENT);
		createEReference(languageFeatureEClass, LANGUAGE_FEATURE__GROUPS);
		createEReference(languageFeatureEClass, LANGUAGE_FEATURE__PARENT_GROUP);
		createEReference(languageFeatureEClass, LANGUAGE_FEATURE__IMPLEMENTATION_MODULE);

		languageFeatureGroupEClass = createEClass(LANGUAGE_FEATURE_GROUP);
		createEReference(languageFeatureGroupEClass, LANGUAGE_FEATURE_GROUP__FEATURES);
		createEReference(languageFeatureGroupEClass, LANGUAGE_FEATURE_GROUP__CARDINALITY);

		languageFeatureGroupCardinalityEClass = createEClass(LANGUAGE_FEATURE_GROUP_CARDINALITY);
		createEAttribute(languageFeatureGroupCardinalityEClass, LANGUAGE_FEATURE_GROUP_CARDINALITY__LOWER_BOUND);
		createEAttribute(languageFeatureGroupCardinalityEClass, LANGUAGE_FEATURE_GROUP_CARDINALITY__UPPER_BOUND);

		languageConstraintEClass = createEClass(LANGUAGE_CONSTRAINT);
		createEReference(languageConstraintEClass, LANGUAGE_CONSTRAINT__EXPRESSION);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);

		languageFeatureRefEClass = createEClass(LANGUAGE_FEATURE_REF);
		createEReference(languageFeatureRefEClass, LANGUAGE_FEATURE_REF__REF);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__EXPR);
		createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__OPERATOR);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT);
		createEAttribute(binaryExpressionEClass, BINARY_EXPRESSION__OPERATOR);

		languageModuleEClass = createEClass(LANGUAGE_MODULE);
		createEReference(languageModuleEClass, LANGUAGE_MODULE__AS);
		createEReference(languageModuleEClass, LANGUAGE_MODULE__SEM);

		abstractSyntaxEClass = createEClass(ABSTRACT_SYNTAX);
		createEAttribute(abstractSyntaxEClass, ABSTRACT_SYNTAX__ECORE_PATH);
		createEAttribute(abstractSyntaxEClass, ABSTRACT_SYNTAX__ECORE_PROJECT);
		createEAttribute(abstractSyntaxEClass, ABSTRACT_SYNTAX__ECORE_REQUIRED_INTERFACE_PATH);
		createEAttribute(abstractSyntaxEClass, ABSTRACT_SYNTAX__ECORE_PROVIDED_INTERFACE_PATH);

		semanticsEClass = createEClass(SEMANTICS);
		createEAttribute(semanticsEClass, SEMANTICS__XTEND_PATH);
		createEAttribute(semanticsEClass, SEMANTICS__XTEND_PROJECT);

		// Create enums
		uninaryOperatorEEnum = createEEnum(UNINARY_OPERATOR);
		binaryOperatorEEnum = createEEnum(BINARY_OPERATOR);
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
		languageFeatureModelEClass.getESuperTypes().add(this.getPNamedElement());
		languageFeatureEClass.getESuperTypes().add(this.getPNamedElement());
		languageConstraintEClass.getESuperTypes().add(this.getPNamedElement());
		languageFeatureRefEClass.getESuperTypes().add(this.getBooleanExpression());
		unaryExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		binaryExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		languageModuleEClass.getESuperTypes().add(this.getPNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(pNamedElementEClass, PNamedElement.class, "PNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, PNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageFeatureModelEClass, LanguageFeatureModel.class, "LanguageFeatureModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLanguageFeatureModel_RootFeature(), this.getLanguageFeature(), null, "rootFeature", null, 0, 1, LanguageFeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageFeatureModel_Constraints(), this.getLanguageConstraint(), null, "constraints", null, 0, -1, LanguageFeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageFeatureEClass, LanguageFeature.class, "LanguageFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguageFeature_Mandatory(), ecorePackage.getEBoolean(), "mandatory", null, 0, 1, LanguageFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageFeature_Children(), this.getLanguageFeature(), this.getLanguageFeature_Parent(), "children", null, 0, -1, LanguageFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageFeature_Parent(), this.getLanguageFeature(), this.getLanguageFeature_Children(), "parent", null, 0, 1, LanguageFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageFeature_Groups(), this.getLanguageFeatureGroup(), null, "groups", null, 0, -1, LanguageFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageFeature_ParentGroup(), this.getLanguageFeatureGroup(), this.getLanguageFeatureGroup_Features(), "parentGroup", null, 0, 1, LanguageFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageFeature_ImplementationModule(), this.getLanguageModule(), null, "implementationModule", null, 0, 1, LanguageFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageFeatureGroupEClass, LanguageFeatureGroup.class, "LanguageFeatureGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLanguageFeatureGroup_Features(), this.getLanguageFeature(), this.getLanguageFeature_ParentGroup(), "features", null, 1, -1, LanguageFeatureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageFeatureGroup_Cardinality(), this.getLanguageFeatureGroupCardinality(), null, "cardinality", null, 1, 1, LanguageFeatureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageFeatureGroupCardinalityEClass, LanguageFeatureGroupCardinality.class, "LanguageFeatureGroupCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguageFeatureGroupCardinality_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 1, 1, LanguageFeatureGroupCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguageFeatureGroupCardinality_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 1, 1, LanguageFeatureGroupCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageConstraintEClass, LanguageConstraint.class, "LanguageConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLanguageConstraint_Expression(), this.getBooleanExpression(), null, "expression", null, 1, 1, LanguageConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(languageFeatureRefEClass, LanguageFeatureRef.class, "LanguageFeatureRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLanguageFeatureRef_Ref(), this.getLanguageFeature(), null, "ref", null, 0, 1, LanguageFeatureRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryExpression_Expr(), this.getBooleanExpression(), null, "expr", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryExpression_Operator(), this.getUninaryOperator(), "operator", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_Left(), this.getBooleanExpression(), null, "left", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_Right(), this.getBooleanExpression(), null, "right", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryExpression_Operator(), this.getBinaryOperator(), "operator", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageModuleEClass, LanguageModule.class, "LanguageModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLanguageModule_As(), this.getAbstractSyntax(), null, "as", null, 0, 1, LanguageModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageModule_Sem(), this.getSemantics(), null, "sem", null, 0, 1, LanguageModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractSyntaxEClass, AbstractSyntax.class, "AbstractSyntax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractSyntax_EcorePath(), ecorePackage.getEString(), "ecorePath", null, 0, 1, AbstractSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractSyntax_EcoreProject(), ecorePackage.getEString(), "ecoreProject", null, 0, 1, AbstractSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractSyntax_EcoreRequiredInterfacePath(), ecorePackage.getEString(), "ecoreRequiredInterfacePath", null, 0, 1, AbstractSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractSyntax_EcoreProvidedInterfacePath(), ecorePackage.getEString(), "ecoreProvidedInterfacePath", null, 0, 1, AbstractSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semanticsEClass, Semantics.class, "Semantics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemantics_XtendPath(), ecorePackage.getEString(), "xtendPath", null, 0, 1, Semantics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemantics_XtendProject(), ecorePackage.getEString(), "xtendProject", null, 0, 1, Semantics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(uninaryOperatorEEnum, UninaryOperator.class, "UninaryOperator");
		addEEnumLiteral(uninaryOperatorEEnum, UninaryOperator.NOT);

		initEEnum(binaryOperatorEEnum, BinaryOperator.class, "BinaryOperator");
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.AND);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.OR);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.IMPLIES);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.XOR);

		// Create resource
		createResource(eNS_URI);
	}

} //VmPackageImpl

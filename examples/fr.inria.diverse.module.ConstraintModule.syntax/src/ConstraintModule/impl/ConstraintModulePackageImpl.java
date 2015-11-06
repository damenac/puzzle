/**
 */
package ConstraintModule.impl;

import ConstraintModule.ArithmeticExpression;
import ConstraintModule.ArithmeticOperator;
import ConstraintModule.BoolLit;
import ConstraintModule.Constraint;
import ConstraintModule.ConstraintModuleFactory;
import ConstraintModule.ConstraintModulePackage;
import ConstraintModule.Expression;
import ConstraintModule.IntegerLit;
import ConstraintModule.Literal;
import ConstraintModule.RelationalConstraint;
import ConstraintModule.RelationalExpression;
import ConstraintModule.RelationalOperator;
import ConstraintModule.StringLit;
import ConstraintModule.VarReference;

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
public class ConstraintModulePackageImpl extends EPackageImpl implements ConstraintModulePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerLitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolLitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arithmeticOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationalOperatorEEnum = null;

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
	 * @see ConstraintModule.ConstraintModulePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConstraintModulePackageImpl() {
		super(eNS_URI, ConstraintModuleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConstraintModulePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConstraintModulePackage init() {
		if (isInited) return (ConstraintModulePackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintModulePackage.eNS_URI);

		// Obtain or create and register package
		ConstraintModulePackageImpl theConstraintModulePackage = (ConstraintModulePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConstraintModulePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConstraintModulePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theConstraintModulePackage.createPackageContents();

		// Initialize created meta-data
		theConstraintModulePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConstraintModulePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConstraintModulePackage.eNS_URI, theConstraintModulePackage);
		return theConstraintModulePackage;
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
	public EClass getRelationalConstraint() {
		return relationalConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalConstraint_Expression() {
		return (EReference)relationalConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerLit() {
		return integerLitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerLit_Value() {
		return (EAttribute)integerLitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringLit() {
		return stringLitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringLit_Value() {
		return (EAttribute)stringLitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolLit() {
		return boolLitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolLit_Value() {
		return (EAttribute)boolLitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmeticExpression() {
		return arithmeticExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArithmeticExpression_Operator() {
		return (EAttribute)arithmeticExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmeticExpression_Left() {
		return (EReference)arithmeticExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmeticExpression_Right() {
		return (EReference)arithmeticExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalExpression() {
		return relationalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationalExpression_Operator() {
		return (EAttribute)relationalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalExpression_Left() {
		return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalExpression_Right() {
		return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarReference() {
		return varReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarReference_Key() {
		return (EAttribute)varReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArithmeticOperator() {
		return arithmeticOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationalOperator() {
		return relationalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintModuleFactory getConstraintModuleFactory() {
		return (ConstraintModuleFactory)getEFactoryInstance();
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

		relationalConstraintEClass = createEClass(RELATIONAL_CONSTRAINT);
		createEReference(relationalConstraintEClass, RELATIONAL_CONSTRAINT__EXPRESSION);

		expressionEClass = createEClass(EXPRESSION);

		literalEClass = createEClass(LITERAL);

		integerLitEClass = createEClass(INTEGER_LIT);
		createEAttribute(integerLitEClass, INTEGER_LIT__VALUE);

		stringLitEClass = createEClass(STRING_LIT);
		createEAttribute(stringLitEClass, STRING_LIT__VALUE);

		boolLitEClass = createEClass(BOOL_LIT);
		createEAttribute(boolLitEClass, BOOL_LIT__VALUE);

		arithmeticExpressionEClass = createEClass(ARITHMETIC_EXPRESSION);
		createEAttribute(arithmeticExpressionEClass, ARITHMETIC_EXPRESSION__OPERATOR);
		createEReference(arithmeticExpressionEClass, ARITHMETIC_EXPRESSION__LEFT);
		createEReference(arithmeticExpressionEClass, ARITHMETIC_EXPRESSION__RIGHT);

		relationalExpressionEClass = createEClass(RELATIONAL_EXPRESSION);
		createEAttribute(relationalExpressionEClass, RELATIONAL_EXPRESSION__OPERATOR);
		createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__LEFT);
		createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__RIGHT);

		varReferenceEClass = createEClass(VAR_REFERENCE);
		createEAttribute(varReferenceEClass, VAR_REFERENCE__KEY);

		// Create enums
		arithmeticOperatorEEnum = createEEnum(ARITHMETIC_OPERATOR);
		relationalOperatorEEnum = createEEnum(RELATIONAL_OPERATOR);
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
		relationalConstraintEClass.getESuperTypes().add(this.getConstraint());
		literalEClass.getESuperTypes().add(this.getExpression());
		integerLitEClass.getESuperTypes().add(this.getLiteral());
		stringLitEClass.getESuperTypes().add(this.getLiteral());
		boolLitEClass.getESuperTypes().add(this.getLiteral());
		arithmeticExpressionEClass.getESuperTypes().add(this.getExpression());
		relationalExpressionEClass.getESuperTypes().add(this.getExpression());
		varReferenceEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationalConstraintEClass, RelationalConstraint.class, "RelationalConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalConstraint_Expression(), this.getExpression(), null, "expression", null, 1, 1, RelationalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalEClass, Literal.class, "Literal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerLitEClass, IntegerLit.class, "IntegerLit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerLit_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerLit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringLitEClass, StringLit.class, "StringLit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLit_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringLit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boolLitEClass, BoolLit.class, "BoolLit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolLit_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BoolLit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arithmeticExpressionEClass, ArithmeticExpression.class, "ArithmeticExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArithmeticExpression_Operator(), this.getArithmeticOperator(), "operator", null, 0, 1, ArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArithmeticExpression_Left(), this.getExpression(), null, "left", null, 1, 1, ArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArithmeticExpression_Right(), this.getExpression(), null, "right", null, 1, 1, ArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalExpressionEClass, RelationalExpression.class, "RelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalExpression_Operator(), this.getRelationalOperator(), "operator", null, 0, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalExpression_Left(), this.getExpression(), null, "left", null, 1, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalExpression_Right(), this.getExpression(), null, "right", null, 1, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varReferenceEClass, VarReference.class, "VarReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarReference_Key(), ecorePackage.getEString(), "key", null, 0, 1, VarReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(arithmeticOperatorEEnum, ArithmeticOperator.class, "ArithmeticOperator");
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.PLUS);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.MINUS);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.MULT);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.DIV);

		initEEnum(relationalOperatorEEnum, RelationalOperator.class, "RelationalOperator");
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.LESS_THAN);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.GREATER_THAN);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.EQUALS);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.NOT_EQUAL);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.LESS_THAN_OR_EQUAL_TO);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.GREATER_THAN_OR_EQUAL_TO);

		// Create resource
		createResource(eNS_URI);
	}

} //ConstraintModulePackageImpl

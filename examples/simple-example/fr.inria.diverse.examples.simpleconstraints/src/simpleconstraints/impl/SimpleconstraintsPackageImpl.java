/**
 */
package simpleconstraints.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simpleconstraints.BooleanExpr;
import simpleconstraints.Constraint;
import simpleconstraints.OperationKind;
import simpleconstraints.PrimitiveType;
import simpleconstraints.Program;
import simpleconstraints.Real;
import simpleconstraints.RelationalExpression;
import simpleconstraints.SimpleconstraintsFactory;
import simpleconstraints.SimpleconstraintsPackage;
import simpleconstraints.StmtBlock;
import simpleconstraints.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleconstraintsPackageImpl extends EPackageImpl implements SimpleconstraintsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

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
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stmtBlockEClass = null;

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
	private EEnum operationKindEEnum = null;

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
	 * @see simpleconstraints.SimpleconstraintsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimpleconstraintsPackageImpl() {
		super(eNS_URI, SimpleconstraintsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SimpleconstraintsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimpleconstraintsPackage init() {
		if (isInited) return (SimpleconstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleconstraintsPackage.eNS_URI);

		// Obtain or create and register package
		SimpleconstraintsPackageImpl theSimpleconstraintsPackage = (SimpleconstraintsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimpleconstraintsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimpleconstraintsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSimpleconstraintsPackage.createPackageContents();

		// Initialize created meta-data
		theSimpleconstraintsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimpleconstraintsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimpleconstraintsPackage.eNS_URI, theSimpleconstraintsPackage);
		return theSimpleconstraintsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Constraints() {
		return (EReference)programEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getConstraint_Name() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Body() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Value() {
		return (EReference)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Type() {
		return (EReference)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger() {
		return integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean() {
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString() {
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReal() {
		return realEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpr() {
		return booleanExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStmtBlock() {
		return stmtBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStmtBlock_Statements() {
		return (EReference)stmtBlockEClass.getEStructuralFeatures().get(0);
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
	public EReference getRelationalExpression_Left() {
		return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalExpression_Right() {
		return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationalExpression_Op() {
		return (EAttribute)relationalExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationKind() {
		return operationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleconstraintsFactory getSimpleconstraintsFactory() {
		return (SimpleconstraintsFactory)getEFactoryInstance();
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
		programEClass = createEClass(PROGRAM);
		createEReference(programEClass, PROGRAM__CONSTRAINTS);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__NAME);
		createEReference(constraintEClass, CONSTRAINT__BODY);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEReference(variableEClass, VARIABLE__VALUE);
		createEReference(variableEClass, VARIABLE__TYPE);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

		integerEClass = createEClass(INTEGER);

		booleanEClass = createEClass(BOOLEAN);

		stringEClass = createEClass(STRING);

		realEClass = createEClass(REAL);

		booleanExprEClass = createEClass(BOOLEAN_EXPR);

		stmtBlockEClass = createEClass(STMT_BLOCK);
		createEReference(stmtBlockEClass, STMT_BLOCK__STATEMENTS);

		relationalExpressionEClass = createEClass(RELATIONAL_EXPRESSION);
		createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__LEFT);
		createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__RIGHT);
		createEAttribute(relationalExpressionEClass, RELATIONAL_EXPRESSION__OP);

		// Create enums
		operationKindEEnum = createEEnum(OPERATION_KIND);
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
		integerEClass.getESuperTypes().add(this.getPrimitiveType());
		booleanEClass.getESuperTypes().add(this.getPrimitiveType());
		stringEClass.getESuperTypes().add(this.getPrimitiveType());
		realEClass.getESuperTypes().add(this.getPrimitiveType());
		stmtBlockEClass.getESuperTypes().add(this.getBooleanExpr());
		relationalExpressionEClass.getESuperTypes().add(this.getBooleanExpr());

		// Initialize classes, features, and operations; add parameters
		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgram_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_Body(), this.getStmtBlock(), null, "body", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Type(), this.getPrimitiveType(), null, "type", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerEClass, simpleconstraints.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanEClass, simpleconstraints.Boolean.class, "Boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringEClass, simpleconstraints.String.class, "String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realEClass, Real.class, "Real", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanExprEClass, BooleanExpr.class, "BooleanExpr", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stmtBlockEClass, StmtBlock.class, "StmtBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStmtBlock_Statements(), this.getBooleanExpr(), null, "statements", null, 0, -1, StmtBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalExpressionEClass, RelationalExpression.class, "RelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalExpression_Left(), this.getBooleanExpr(), null, "left", null, 0, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalExpression_Right(), this.getBooleanExpr(), null, "right", null, 0, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalExpression_Op(), this.getOperationKind(), "op", null, 0, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(operationKindEEnum, OperationKind.class, "OperationKind");
		addEEnumLiteral(operationKindEEnum, OperationKind.AND);
		addEEnumLiteral(operationKindEEnum, OperationKind.OR);
		addEEnumLiteral(operationKindEEnum, OperationKind.XOR);
		addEEnumLiteral(operationKindEEnum, OperationKind.EQUALS);
		addEEnumLiteral(operationKindEEnum, OperationKind.NOT_EQUALS);
		addEEnumLiteral(operationKindEEnum, OperationKind.GREATER_THAN);
		addEEnumLiteral(operationKindEEnum, OperationKind.LESS_THAN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Private
		createPrivateAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Private</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrivateAnnotations() {
		String source = "Private";	
		addAnnotation
		  (variableEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getVariable_Name(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getVariable_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getVariable_Type(), 
		   source, 
		   new String[] {
		   });
	}

} //SimpleconstraintsPackageImpl

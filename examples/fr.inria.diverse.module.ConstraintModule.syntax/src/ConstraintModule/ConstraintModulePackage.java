/**
 */
package ConstraintModule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ConstraintModule.ConstraintModuleFactory
 * @model kind="package"
 * @generated
 */
public interface ConstraintModulePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ConstraintModule";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ConstraintModule";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ConstraintModule";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintModulePackage eINSTANCE = ConstraintModule.impl.ConstraintModulePackageImpl.init();

	/**
	 * The meta object id for the '{@link ConstraintModule.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintModule.impl.ConstraintImpl
	 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ConstraintModule.impl.RelationalConstraintImpl <em>Relational Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintModule.impl.RelationalConstraintImpl
	 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getRelationalConstraint()
	 * @generated
	 */
	int RELATIONAL_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONSTRAINT__EXPRESSION = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relational Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relational Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ConstraintModule.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintModule.impl.StatementImpl
	 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 2;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ConstraintModule.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintModule.impl.ProgramImpl
	 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 3;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ConstraintModule.impl.ConditionalImpl <em>Conditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintModule.impl.ConditionalImpl
	 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getConditional()
	 * @generated
	 */
	int CONDITIONAL = 4;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ConstraintModule.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintModule.impl.LoopImpl
	 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 5;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__GUARD = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ConstraintModule.impl.VarDeclImpl <em>Var Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintModule.impl.VarDeclImpl
	 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getVarDecl()
	 * @generated
	 */
	int VAR_DECL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL__EXPR = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ConstraintModule.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintModule.impl.ExpressionImpl
	 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 14;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Eval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___EVAL__OBJECT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ConstraintModule.impl.VarReferenceImpl <em>Var Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintModule.impl.VarReferenceImpl
	 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getVarReference()
	 * @generated
	 */
	int VAR_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REFERENCE__KEY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Eval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REFERENCE___EVAL__OBJECT = EXPRESSION___EVAL__OBJECT;

	/**
	 * The number of operations of the '<em>Var Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REFERENCE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ConstraintModule.impl.ConsoleOutputImpl <em>Console Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintModule.impl.ConsoleOutputImpl
	 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getConsoleOutput()
	 * @generated
	 */
	int CONSOLE_OUTPUT = 8;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLE_OUTPUT__INPUT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Console Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLE_OUTPUT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Console Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLE_OUTPUT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ConstraintModule.impl.PrintlnImpl <em>Println</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintModule.impl.PrintlnImpl
	 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getPrintln()
	 * @generated
	 */
	int PRINTLN = 9;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTLN__INPUT = CONSOLE_OUTPUT__INPUT;

	/**
	 * The number of structural features of the '<em>Println</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTLN_FEATURE_COUNT = CONSOLE_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Println</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTLN_OPERATION_COUNT = CONSOLE_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ConstraintModule.impl.PrintImpl <em>Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintModule.impl.PrintImpl
	 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getPrint()
	 * @generated
	 */
	int PRINT = 10;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__INPUT = CONSOLE_OUTPUT__INPUT;

	/**
	 * The number of structural features of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_FEATURE_COUNT = CONSOLE_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_OPERATION_COUNT = CONSOLE_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ConstraintModule.impl.AssignationImpl <em>Assignation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintModule.impl.AssignationImpl
	 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getAssignation()
	 * @generated
	 */
	int ASSIGNATION = 11;

	/**
	 * The feature id for the '<em><b>Var Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNATION__VAR_REF = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNATION__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assignation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ConstraintModule.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintModule.impl.WaitImpl
	 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 12;

	/**
	 * The feature id for the '<em><b>Miliseconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__MILISECONDS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ConstraintModule.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintModule.impl.NamedElementImpl
	 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ConstraintModule.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see ConstraintModule.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link ConstraintModule.RelationalConstraint <em>Relational Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Constraint</em>'.
	 * @see ConstraintModule.RelationalConstraint
	 * @generated
	 */
	EClass getRelationalConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link ConstraintModule.RelationalConstraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see ConstraintModule.RelationalConstraint#getExpression()
	 * @see #getRelationalConstraint()
	 * @generated
	 */
	EReference getRelationalConstraint_Expression();

	/**
	 * Returns the meta object for class '{@link ConstraintModule.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see ConstraintModule.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link ConstraintModule.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see ConstraintModule.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link ConstraintModule.Program#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see ConstraintModule.Program#getStatements()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Statements();

	/**
	 * Returns the meta object for class '{@link ConstraintModule.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional</em>'.
	 * @see ConstraintModule.Conditional
	 * @generated
	 */
	EClass getConditional();

	/**
	 * Returns the meta object for the containment reference '{@link ConstraintModule.Conditional#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see ConstraintModule.Conditional#getCondition()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link ConstraintModule.Conditional#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see ConstraintModule.Conditional#getBody()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_Body();

	/**
	 * Returns the meta object for class '{@link ConstraintModule.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see ConstraintModule.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link ConstraintModule.Loop#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see ConstraintModule.Loop#getGuard()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Guard();

	/**
	 * Returns the meta object for the containment reference '{@link ConstraintModule.Loop#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see ConstraintModule.Loop#getBody()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Body();

	/**
	 * Returns the meta object for class '{@link ConstraintModule.VarDecl <em>Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Decl</em>'.
	 * @see ConstraintModule.VarDecl
	 * @generated
	 */
	EClass getVarDecl();

	/**
	 * Returns the meta object for the attribute '{@link ConstraintModule.VarDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConstraintModule.VarDecl#getName()
	 * @see #getVarDecl()
	 * @generated
	 */
	EAttribute getVarDecl_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ConstraintModule.VarDecl#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see ConstraintModule.VarDecl#getExpr()
	 * @see #getVarDecl()
	 * @generated
	 */
	EReference getVarDecl_Expr();

	/**
	 * Returns the meta object for class '{@link ConstraintModule.VarReference <em>Var Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Reference</em>'.
	 * @see ConstraintModule.VarReference
	 * @generated
	 */
	EClass getVarReference();

	/**
	 * Returns the meta object for the attribute '{@link ConstraintModule.VarReference#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see ConstraintModule.VarReference#getKey()
	 * @see #getVarReference()
	 * @generated
	 */
	EAttribute getVarReference_Key();

	/**
	 * Returns the meta object for class '{@link ConstraintModule.ConsoleOutput <em>Console Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Console Output</em>'.
	 * @see ConstraintModule.ConsoleOutput
	 * @generated
	 */
	EClass getConsoleOutput();

	/**
	 * Returns the meta object for the attribute '{@link ConstraintModule.ConsoleOutput#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see ConstraintModule.ConsoleOutput#getInput()
	 * @see #getConsoleOutput()
	 * @generated
	 */
	EAttribute getConsoleOutput_Input();

	/**
	 * Returns the meta object for class '{@link ConstraintModule.Println <em>Println</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Println</em>'.
	 * @see ConstraintModule.Println
	 * @generated
	 */
	EClass getPrintln();

	/**
	 * Returns the meta object for class '{@link ConstraintModule.Print <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print</em>'.
	 * @see ConstraintModule.Print
	 * @generated
	 */
	EClass getPrint();

	/**
	 * Returns the meta object for class '{@link ConstraintModule.Assignation <em>Assignation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignation</em>'.
	 * @see ConstraintModule.Assignation
	 * @generated
	 */
	EClass getAssignation();

	/**
	 * Returns the meta object for the reference '{@link ConstraintModule.Assignation#getVarRef <em>Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var Ref</em>'.
	 * @see ConstraintModule.Assignation#getVarRef()
	 * @see #getAssignation()
	 * @generated
	 */
	EReference getAssignation_VarRef();

	/**
	 * Returns the meta object for the containment reference '{@link ConstraintModule.Assignation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see ConstraintModule.Assignation#getExpression()
	 * @see #getAssignation()
	 * @generated
	 */
	EReference getAssignation_Expression();

	/**
	 * Returns the meta object for class '{@link ConstraintModule.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see ConstraintModule.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for the attribute '{@link ConstraintModule.Wait#getMiliseconds <em>Miliseconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Miliseconds</em>'.
	 * @see ConstraintModule.Wait#getMiliseconds()
	 * @see #getWait()
	 * @generated
	 */
	EAttribute getWait_Miliseconds();

	/**
	 * Returns the meta object for class '{@link ConstraintModule.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see ConstraintModule.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ConstraintModule.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConstraintModule.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link ConstraintModule.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see ConstraintModule.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the '{@link ConstraintModule.Expression#eval(java.lang.Object) <em>Eval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval</em>' operation.
	 * @see ConstraintModule.Expression#eval(java.lang.Object)
	 * @generated
	 */
	EOperation getExpression__Eval__Object();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConstraintModuleFactory getConstraintModuleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ConstraintModule.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintModule.impl.ConstraintImpl
		 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link ConstraintModule.impl.RelationalConstraintImpl <em>Relational Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintModule.impl.RelationalConstraintImpl
		 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getRelationalConstraint()
		 * @generated
		 */
		EClass RELATIONAL_CONSTRAINT = eINSTANCE.getRelationalConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONSTRAINT__EXPRESSION = eINSTANCE.getRelationalConstraint_Expression();

		/**
		 * The meta object literal for the '{@link ConstraintModule.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintModule.impl.StatementImpl
		 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link ConstraintModule.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintModule.impl.ProgramImpl
		 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__STATEMENTS = eINSTANCE.getProgram_Statements();

		/**
		 * The meta object literal for the '{@link ConstraintModule.impl.ConditionalImpl <em>Conditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintModule.impl.ConditionalImpl
		 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getConditional()
		 * @generated
		 */
		EClass CONDITIONAL = eINSTANCE.getConditional();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__CONDITION = eINSTANCE.getConditional_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__BODY = eINSTANCE.getConditional_Body();

		/**
		 * The meta object literal for the '{@link ConstraintModule.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintModule.impl.LoopImpl
		 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__GUARD = eINSTANCE.getLoop_Guard();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__BODY = eINSTANCE.getLoop_Body();

		/**
		 * The meta object literal for the '{@link ConstraintModule.impl.VarDeclImpl <em>Var Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintModule.impl.VarDeclImpl
		 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getVarDecl()
		 * @generated
		 */
		EClass VAR_DECL = eINSTANCE.getVarDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_DECL__NAME = eINSTANCE.getVarDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_DECL__EXPR = eINSTANCE.getVarDecl_Expr();

		/**
		 * The meta object literal for the '{@link ConstraintModule.impl.VarReferenceImpl <em>Var Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintModule.impl.VarReferenceImpl
		 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getVarReference()
		 * @generated
		 */
		EClass VAR_REFERENCE = eINSTANCE.getVarReference();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_REFERENCE__KEY = eINSTANCE.getVarReference_Key();

		/**
		 * The meta object literal for the '{@link ConstraintModule.impl.ConsoleOutputImpl <em>Console Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintModule.impl.ConsoleOutputImpl
		 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getConsoleOutput()
		 * @generated
		 */
		EClass CONSOLE_OUTPUT = eINSTANCE.getConsoleOutput();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSOLE_OUTPUT__INPUT = eINSTANCE.getConsoleOutput_Input();

		/**
		 * The meta object literal for the '{@link ConstraintModule.impl.PrintlnImpl <em>Println</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintModule.impl.PrintlnImpl
		 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getPrintln()
		 * @generated
		 */
		EClass PRINTLN = eINSTANCE.getPrintln();

		/**
		 * The meta object literal for the '{@link ConstraintModule.impl.PrintImpl <em>Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintModule.impl.PrintImpl
		 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getPrint()
		 * @generated
		 */
		EClass PRINT = eINSTANCE.getPrint();

		/**
		 * The meta object literal for the '{@link ConstraintModule.impl.AssignationImpl <em>Assignation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintModule.impl.AssignationImpl
		 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getAssignation()
		 * @generated
		 */
		EClass ASSIGNATION = eINSTANCE.getAssignation();

		/**
		 * The meta object literal for the '<em><b>Var Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNATION__VAR_REF = eINSTANCE.getAssignation_VarRef();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNATION__EXPRESSION = eINSTANCE.getAssignation_Expression();

		/**
		 * The meta object literal for the '{@link ConstraintModule.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintModule.impl.WaitImpl
		 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getWait()
		 * @generated
		 */
		EClass WAIT = eINSTANCE.getWait();

		/**
		 * The meta object literal for the '<em><b>Miliseconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT__MILISECONDS = eINSTANCE.getWait_Miliseconds();

		/**
		 * The meta object literal for the '{@link ConstraintModule.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintModule.impl.NamedElementImpl
		 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link ConstraintModule.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintModule.impl.ExpressionImpl
		 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Eval</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION___EVAL__OBJECT = eINSTANCE.getExpression__Eval__Object();

	}

} //ConstraintModulePackage

/**
 */
package simpleconstraints;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see simpleconstraints.SimpleconstraintsFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleconstraintsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simpleconstraints";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "simpleconstraints";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simpleconstraints";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleconstraintsPackage eINSTANCE = simpleconstraints.impl.SimpleconstraintsPackageImpl.init();

	/**
	 * The meta object id for the '{@link simpleconstraints.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleconstraints.impl.ProgramImpl
	 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleconstraints.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleconstraints.impl.ConstraintImpl
	 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__BODY = 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleconstraints.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleconstraints.impl.VariableImpl
	 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleconstraints.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleconstraints.impl.PrimitiveTypeImpl
	 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleconstraints.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleconstraints.impl.IntegerImpl
	 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 4;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleconstraints.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleconstraints.impl.BooleanImpl
	 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 5;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleconstraints.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleconstraints.impl.StringImpl
	 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getString()
	 * @generated
	 */
	int STRING = 6;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleconstraints.impl.RealImpl <em>Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleconstraints.impl.RealImpl
	 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getReal()
	 * @generated
	 */
	int REAL = 7;

	/**
	 * The number of structural features of the '<em>Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleconstraints.impl.BooleanExprImpl <em>Boolean Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleconstraints.impl.BooleanExprImpl
	 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getBooleanExpr()
	 * @generated
	 */
	int BOOLEAN_EXPR = 8;

	/**
	 * The number of structural features of the '<em>Boolean Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Boolean Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleconstraints.impl.StmtBlockImpl <em>Stmt Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleconstraints.impl.StmtBlockImpl
	 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getStmtBlock()
	 * @generated
	 */
	int STMT_BLOCK = 9;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STMT_BLOCK__STATEMENTS = BOOLEAN_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stmt Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STMT_BLOCK_FEATURE_COUNT = BOOLEAN_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stmt Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STMT_BLOCK_OPERATION_COUNT = BOOLEAN_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleconstraints.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleconstraints.impl.RelationalExpressionImpl
	 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getRelationalExpression()
	 * @generated
	 */
	int RELATIONAL_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__LEFT = BOOLEAN_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__RIGHT = BOOLEAN_EXPR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__OP = BOOLEAN_EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_OPERATION_COUNT = BOOLEAN_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleconstraints.OperationKind <em>Operation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleconstraints.OperationKind
	 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getOperationKind()
	 * @generated
	 */
	int OPERATION_KIND = 11;


	/**
	 * Returns the meta object for class '{@link simpleconstraints.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see simpleconstraints.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleconstraints.Program#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see simpleconstraints.Program#getConstraints()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Constraints();

	/**
	 * Returns the meta object for class '{@link simpleconstraints.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see simpleconstraints.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link simpleconstraints.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleconstraints.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for the containment reference '{@link simpleconstraints.Constraint#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see simpleconstraints.Constraint#getBody()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Body();

	/**
	 * Returns the meta object for class '{@link simpleconstraints.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see simpleconstraints.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link simpleconstraints.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleconstraints.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link simpleconstraints.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see simpleconstraints.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Value();

	/**
	 * Returns the meta object for the containment reference '{@link simpleconstraints.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see simpleconstraints.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for class '{@link simpleconstraints.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see simpleconstraints.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link simpleconstraints.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see simpleconstraints.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for class '{@link simpleconstraints.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see simpleconstraints.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link simpleconstraints.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see simpleconstraints.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for class '{@link simpleconstraints.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real</em>'.
	 * @see simpleconstraints.Real
	 * @generated
	 */
	EClass getReal();

	/**
	 * Returns the meta object for class '{@link simpleconstraints.BooleanExpr <em>Boolean Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expr</em>'.
	 * @see simpleconstraints.BooleanExpr
	 * @generated
	 */
	EClass getBooleanExpr();

	/**
	 * Returns the meta object for class '{@link simpleconstraints.StmtBlock <em>Stmt Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stmt Block</em>'.
	 * @see simpleconstraints.StmtBlock
	 * @generated
	 */
	EClass getStmtBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleconstraints.StmtBlock#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see simpleconstraints.StmtBlock#getStatements()
	 * @see #getStmtBlock()
	 * @generated
	 */
	EReference getStmtBlock_Statements();

	/**
	 * Returns the meta object for class '{@link simpleconstraints.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Expression</em>'.
	 * @see simpleconstraints.RelationalExpression
	 * @generated
	 */
	EClass getRelationalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link simpleconstraints.RelationalExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see simpleconstraints.RelationalExpression#getLeft()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link simpleconstraints.RelationalExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see simpleconstraints.RelationalExpression#getRight()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_Right();

	/**
	 * Returns the meta object for the attribute '{@link simpleconstraints.RelationalExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see simpleconstraints.RelationalExpression#getOp()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EAttribute getRelationalExpression_Op();

	/**
	 * Returns the meta object for enum '{@link simpleconstraints.OperationKind <em>Operation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Kind</em>'.
	 * @see simpleconstraints.OperationKind
	 * @generated
	 */
	EEnum getOperationKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimpleconstraintsFactory getSimpleconstraintsFactory();

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
		 * The meta object literal for the '{@link simpleconstraints.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleconstraints.impl.ProgramImpl
		 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__CONSTRAINTS = eINSTANCE.getProgram_Constraints();

		/**
		 * The meta object literal for the '{@link simpleconstraints.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleconstraints.impl.ConstraintImpl
		 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__BODY = eINSTANCE.getConstraint_Body();

		/**
		 * The meta object literal for the '{@link simpleconstraints.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleconstraints.impl.VariableImpl
		 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link simpleconstraints.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleconstraints.impl.PrimitiveTypeImpl
		 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link simpleconstraints.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleconstraints.impl.IntegerImpl
		 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '{@link simpleconstraints.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleconstraints.impl.BooleanImpl
		 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link simpleconstraints.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleconstraints.impl.StringImpl
		 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '{@link simpleconstraints.impl.RealImpl <em>Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleconstraints.impl.RealImpl
		 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getReal()
		 * @generated
		 */
		EClass REAL = eINSTANCE.getReal();

		/**
		 * The meta object literal for the '{@link simpleconstraints.impl.BooleanExprImpl <em>Boolean Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleconstraints.impl.BooleanExprImpl
		 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getBooleanExpr()
		 * @generated
		 */
		EClass BOOLEAN_EXPR = eINSTANCE.getBooleanExpr();

		/**
		 * The meta object literal for the '{@link simpleconstraints.impl.StmtBlockImpl <em>Stmt Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleconstraints.impl.StmtBlockImpl
		 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getStmtBlock()
		 * @generated
		 */
		EClass STMT_BLOCK = eINSTANCE.getStmtBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STMT_BLOCK__STATEMENTS = eINSTANCE.getStmtBlock_Statements();

		/**
		 * The meta object literal for the '{@link simpleconstraints.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleconstraints.impl.RelationalExpressionImpl
		 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getRelationalExpression()
		 * @generated
		 */
		EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__LEFT = eINSTANCE.getRelationalExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__RIGHT = eINSTANCE.getRelationalExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_EXPRESSION__OP = eINSTANCE.getRelationalExpression_Op();

		/**
		 * The meta object literal for the '{@link simpleconstraints.OperationKind <em>Operation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleconstraints.OperationKind
		 * @see simpleconstraints.impl.SimpleconstraintsPackageImpl#getOperationKind()
		 * @generated
		 */
		EEnum OPERATION_KIND = eINSTANCE.getOperationKind();

	}

} //SimpleconstraintsPackage

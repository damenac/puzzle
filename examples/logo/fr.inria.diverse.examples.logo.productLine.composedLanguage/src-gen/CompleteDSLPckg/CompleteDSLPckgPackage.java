/**
 */
package CompleteDSLPckg;

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
 * @see CompleteDSLPckg.CompleteDSLPckgFactory
 * @model kind="package"
 * @generated
 */
public interface CompleteDSLPckgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CompleteDSLPckg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://CompleteDSLPckg";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CompleteDSLPckg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompleteDSLPckgPackage eINSTANCE = CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl.init();

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.ExpressionImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.LiteralImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 1;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.IntegerImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.VoidImpl <em>Void</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.VoidImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getVoid()
	 * @generated
	 */
	int VOID = 3;

	/**
	 * The number of structural features of the '<em>Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.DoubleImpl <em>Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.DoubleImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.StringImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getString()
	 * @generated
	 */
	int STRING = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.BooleanImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.LogoProgramImpl <em>Logo Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.LogoProgramImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getLogoProgram()
	 * @generated
	 */
	int LOGO_PROGRAM = 7;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGO_PROGRAM__INSTRUCTIONS = 0;

	/**
	 * The number of structural features of the '<em>Logo Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGO_PROGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Logo Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGO_PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.InstructionImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 8;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.PrimitiveImpl <em>Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.PrimitiveImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 9;

	/**
	 * The number of structural features of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.ForwardImpl <em>Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.ForwardImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getForward()
	 * @generated
	 */
	int FORWARD = 10;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD__STEPS = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.BackImpl <em>Back</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.BackImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getBack()
	 * @generated
	 */
	int BACK = 11;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__STEPS = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.LeftImpl <em>Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.LeftImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getLeft()
	 * @generated
	 */
	int LEFT = 12;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT__ANGLE = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.RightImpl <em>Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.RightImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getRight()
	 * @generated
	 */
	int RIGHT = 13;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__ANGLE = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.BinaryExprImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getBinaryExpr()
	 * @generated
	 */
	int BINARY_EXPR = 14;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR__LEFT_EXPR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR__RIGHT_EXPR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.ArithmeticExprImpl <em>Arithmetic Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.ArithmeticExprImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getArithmeticExpr()
	 * @generated
	 */
	int ARITHMETIC_EXPR = 15;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPR__LEFT_EXPR = BINARY_EXPR__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPR__RIGHT_EXPR = BINARY_EXPR__RIGHT_EXPR;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPR__OPERATOR = BINARY_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arithmetic Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPR_FEATURE_COUNT = BINARY_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arithmetic Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPR_OPERATION_COUNT = BINARY_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.BooleanExprImpl <em>Boolean Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.BooleanExprImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getBooleanExpr()
	 * @generated
	 */
	int BOOLEAN_EXPR = 16;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__LEFT_EXPR = BINARY_EXPR__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__RIGHT_EXPR = BINARY_EXPR__RIGHT_EXPR;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__OPERATOR = BINARY_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR_FEATURE_COUNT = BINARY_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR_OPERATION_COUNT = BINARY_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.ArithmeticOperator
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getArithmeticOperator()
	 * @generated
	 */
	int ARITHMETIC_OPERATOR = 17;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.BooleanOperator
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 18;


	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see CompleteDSLPckg.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see CompleteDSLPckg.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see CompleteDSLPckg.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for the attribute '{@link CompleteDSLPckg.Integer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CompleteDSLPckg.Integer#getValue()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_Value();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.Void <em>Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void</em>'.
	 * @see CompleteDSLPckg.Void
	 * @generated
	 */
	EClass getVoid();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double</em>'.
	 * @see CompleteDSLPckg.Double
	 * @generated
	 */
	EClass getDouble();

	/**
	 * Returns the meta object for the attribute '{@link CompleteDSLPckg.Double#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CompleteDSLPckg.Double#getValue()
	 * @see #getDouble()
	 * @generated
	 */
	EAttribute getDouble_Value();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see CompleteDSLPckg.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute '{@link CompleteDSLPckg.String#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CompleteDSLPckg.String#getValue()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Value();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see CompleteDSLPckg.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for the attribute '{@link CompleteDSLPckg.Boolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CompleteDSLPckg.Boolean#isValue()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_Value();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.LogoProgram <em>Logo Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logo Program</em>'.
	 * @see CompleteDSLPckg.LogoProgram
	 * @generated
	 */
	EClass getLogoProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link CompleteDSLPckg.LogoProgram#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see CompleteDSLPckg.LogoProgram#getInstructions()
	 * @see #getLogoProgram()
	 * @generated
	 */
	EReference getLogoProgram_Instructions();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see CompleteDSLPckg.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive</em>'.
	 * @see CompleteDSLPckg.Primitive
	 * @generated
	 */
	EClass getPrimitive();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward</em>'.
	 * @see CompleteDSLPckg.Forward
	 * @generated
	 */
	EClass getForward();

	/**
	 * Returns the meta object for the containment reference '{@link CompleteDSLPckg.Forward#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Steps</em>'.
	 * @see CompleteDSLPckg.Forward#getSteps()
	 * @see #getForward()
	 * @generated
	 */
	EReference getForward_Steps();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.Back <em>Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Back</em>'.
	 * @see CompleteDSLPckg.Back
	 * @generated
	 */
	EClass getBack();

	/**
	 * Returns the meta object for the containment reference '{@link CompleteDSLPckg.Back#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Steps</em>'.
	 * @see CompleteDSLPckg.Back#getSteps()
	 * @see #getBack()
	 * @generated
	 */
	EReference getBack_Steps();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.Left <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left</em>'.
	 * @see CompleteDSLPckg.Left
	 * @generated
	 */
	EClass getLeft();

	/**
	 * Returns the meta object for the containment reference '{@link CompleteDSLPckg.Left#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see CompleteDSLPckg.Left#getAngle()
	 * @see #getLeft()
	 * @generated
	 */
	EReference getLeft_Angle();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right</em>'.
	 * @see CompleteDSLPckg.Right
	 * @generated
	 */
	EClass getRight();

	/**
	 * Returns the meta object for the containment reference '{@link CompleteDSLPckg.Right#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see CompleteDSLPckg.Right#getAngle()
	 * @see #getRight()
	 * @generated
	 */
	EReference getRight_Angle();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.BinaryExpr <em>Binary Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expr</em>'.
	 * @see CompleteDSLPckg.BinaryExpr
	 * @generated
	 */
	EClass getBinaryExpr();

	/**
	 * Returns the meta object for the containment reference '{@link CompleteDSLPckg.BinaryExpr#getLeftExpr <em>Left Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Expr</em>'.
	 * @see CompleteDSLPckg.BinaryExpr#getLeftExpr()
	 * @see #getBinaryExpr()
	 * @generated
	 */
	EReference getBinaryExpr_LeftExpr();

	/**
	 * Returns the meta object for the containment reference '{@link CompleteDSLPckg.BinaryExpr#getRightExpr <em>Right Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Expr</em>'.
	 * @see CompleteDSLPckg.BinaryExpr#getRightExpr()
	 * @see #getBinaryExpr()
	 * @generated
	 */
	EReference getBinaryExpr_RightExpr();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.ArithmeticExpr <em>Arithmetic Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Expr</em>'.
	 * @see CompleteDSLPckg.ArithmeticExpr
	 * @generated
	 */
	EClass getArithmeticExpr();

	/**
	 * Returns the meta object for the attribute '{@link CompleteDSLPckg.ArithmeticExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see CompleteDSLPckg.ArithmeticExpr#getOperator()
	 * @see #getArithmeticExpr()
	 * @generated
	 */
	EAttribute getArithmeticExpr_Operator();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.BooleanExpr <em>Boolean Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expr</em>'.
	 * @see CompleteDSLPckg.BooleanExpr
	 * @generated
	 */
	EClass getBooleanExpr();

	/**
	 * Returns the meta object for the attribute '{@link CompleteDSLPckg.BooleanExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see CompleteDSLPckg.BooleanExpr#getOperator()
	 * @see #getBooleanExpr()
	 * @generated
	 */
	EAttribute getBooleanExpr_Operator();

	/**
	 * Returns the meta object for enum '{@link CompleteDSLPckg.ArithmeticOperator <em>Arithmetic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arithmetic Operator</em>'.
	 * @see CompleteDSLPckg.ArithmeticOperator
	 * @generated
	 */
	EEnum getArithmeticOperator();

	/**
	 * Returns the meta object for enum '{@link CompleteDSLPckg.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator</em>'.
	 * @see CompleteDSLPckg.BooleanOperator
	 * @generated
	 */
	EEnum getBooleanOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompleteDSLPckgFactory getCompleteDSLPckgFactory();

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
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.ExpressionImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.LiteralImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.IntegerImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__VALUE = eINSTANCE.getInteger_Value();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.VoidImpl <em>Void</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.VoidImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getVoid()
		 * @generated
		 */
		EClass VOID = eINSTANCE.getVoid();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.DoubleImpl <em>Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.DoubleImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getDouble()
		 * @generated
		 */
		EClass DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE__VALUE = eINSTANCE.getDouble_Value();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.StringImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__VALUE = eINSTANCE.getString_Value();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.BooleanImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__VALUE = eINSTANCE.getBoolean_Value();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.LogoProgramImpl <em>Logo Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.LogoProgramImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getLogoProgram()
		 * @generated
		 */
		EClass LOGO_PROGRAM = eINSTANCE.getLogoProgram();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGO_PROGRAM__INSTRUCTIONS = eINSTANCE.getLogoProgram_Instructions();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.InstructionImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.PrimitiveImpl <em>Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.PrimitiveImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getPrimitive()
		 * @generated
		 */
		EClass PRIMITIVE = eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.ForwardImpl <em>Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.ForwardImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getForward()
		 * @generated
		 */
		EClass FORWARD = eINSTANCE.getForward();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORWARD__STEPS = eINSTANCE.getForward_Steps();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.BackImpl <em>Back</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.BackImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getBack()
		 * @generated
		 */
		EClass BACK = eINSTANCE.getBack();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACK__STEPS = eINSTANCE.getBack_Steps();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.LeftImpl <em>Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.LeftImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getLeft()
		 * @generated
		 */
		EClass LEFT = eINSTANCE.getLeft();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEFT__ANGLE = eINSTANCE.getLeft_Angle();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.RightImpl <em>Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.RightImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getRight()
		 * @generated
		 */
		EClass RIGHT = eINSTANCE.getRight();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT__ANGLE = eINSTANCE.getRight_Angle();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.BinaryExprImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getBinaryExpr()
		 * @generated
		 */
		EClass BINARY_EXPR = eINSTANCE.getBinaryExpr();

		/**
		 * The meta object literal for the '<em><b>Left Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPR__LEFT_EXPR = eINSTANCE.getBinaryExpr_LeftExpr();

		/**
		 * The meta object literal for the '<em><b>Right Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPR__RIGHT_EXPR = eINSTANCE.getBinaryExpr_RightExpr();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.ArithmeticExprImpl <em>Arithmetic Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.ArithmeticExprImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getArithmeticExpr()
		 * @generated
		 */
		EClass ARITHMETIC_EXPR = eINSTANCE.getArithmeticExpr();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_EXPR__OPERATOR = eINSTANCE.getArithmeticExpr_Operator();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.BooleanExprImpl <em>Boolean Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.BooleanExprImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getBooleanExpr()
		 * @generated
		 */
		EClass BOOLEAN_EXPR = eINSTANCE.getBooleanExpr();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXPR__OPERATOR = eINSTANCE.getBooleanExpr_Operator();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.ArithmeticOperator
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getArithmeticOperator()
		 * @generated
		 */
		EEnum ARITHMETIC_OPERATOR = eINSTANCE.getArithmeticOperator();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.BooleanOperator <em>Boolean Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.BooleanOperator
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

	}

} //CompleteDSLPckgPackage

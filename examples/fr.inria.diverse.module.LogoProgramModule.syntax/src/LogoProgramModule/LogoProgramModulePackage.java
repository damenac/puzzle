/**
 */
package LogoProgramModule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see LogoProgramModule.LogoProgramModuleFactory
 * @model kind="package"
 * @generated
 */
public interface LogoProgramModulePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LogoProgramModule";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "LogoProgramModule";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "LogoProgramModule";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogoProgramModulePackage eINSTANCE = LogoProgramModule.impl.LogoProgramModulePackageImpl.init();

	/**
	 * The meta object id for the '{@link LogoProgramModule.impl.LogoProgramImpl <em>Logo Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.LogoProgramImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getLogoProgram()
	 * @generated
	 */
	int LOGO_PROGRAM = 0;

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
	 * The meta object id for the '{@link LogoProgramModule.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.InstructionImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 1;

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
	 * The meta object id for the '{@link LogoProgramModule.impl.PrimitiveImpl <em>Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.PrimitiveImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 2;

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
	 * The meta object id for the '{@link LogoProgramModule.impl.BackImpl <em>Back</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.BackImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getBack()
	 * @generated
	 */
	int BACK = 3;

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
	 * The meta object id for the '{@link LogoProgramModule.impl.ForwardImpl <em>Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.ForwardImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getForward()
	 * @generated
	 */
	int FORWARD = 4;

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
	 * The meta object id for the '{@link LogoProgramModule.impl.LeftImpl <em>Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.LeftImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getLeft()
	 * @generated
	 */
	int LEFT = 5;

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
	 * The meta object id for the '{@link LogoProgramModule.impl.RightImpl <em>Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.RightImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getRight()
	 * @generated
	 */
	int RIGHT = 6;

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
	 * The meta object id for the '{@link LogoProgramModule.impl.PenDownImpl <em>Pen Down</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.PenDownImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getPenDown()
	 * @generated
	 */
	int PEN_DOWN = 7;

	/**
	 * The number of structural features of the '<em>Pen Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_DOWN_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pen Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_DOWN_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LogoProgramModule.impl.PenUpImpl <em>Pen Up</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.PenUpImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getPenUp()
	 * @generated
	 */
	int PEN_UP = 8;

	/**
	 * The number of structural features of the '<em>Pen Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_UP_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pen Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_UP_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LogoProgramModule.impl.ClearImpl <em>Clear</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.ClearImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getClear()
	 * @generated
	 */
	int CLEAR = 9;

	/**
	 * The number of structural features of the '<em>Clear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LogoProgramModule.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.ExpressionImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 19;

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
	 * The meta object id for the '{@link LogoProgramModule.impl.ProcCallImpl <em>Proc Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.ProcCallImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getProcCall()
	 * @generated
	 */
	int PROC_CALL = 10;

	/**
	 * The feature id for the '<em><b>Actual Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_CALL__ACTUAL_ARGS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_CALL__DECLARATION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Proc Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Proc Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LogoProgramModule.impl.ProcDeclarationImpl <em>Proc Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.ProcDeclarationImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getProcDeclaration()
	 * @generated
	 */
	int PROC_DECLARATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_DECLARATION__NAME = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_DECLARATION__ARGS = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Proc Call</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_DECLARATION__PROC_CALL = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_DECLARATION__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Proc Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_DECLARATION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Proc Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_DECLARATION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LogoProgramModule.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.BlockImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 12;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LogoProgramModule.impl.ControlStructureImpl <em>Control Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.ControlStructureImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getControlStructure()
	 * @generated
	 */
	int CONTROL_STRUCTURE = 14;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__CONDITION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LogoProgramModule.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.IfImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getIf()
	 * @generated
	 */
	int IF = 13;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = CONTROL_STRUCTURE__CONDITION;

	/**
	 * The feature id for the '<em><b>Then Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__THEN_PART = CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE_PART = CONTROL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = CONTROL_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = CONTROL_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LogoProgramModule.impl.RepeatImpl <em>Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.RepeatImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getRepeat()
	 * @generated
	 */
	int REPEAT = 15;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__CONDITION = CONTROL_STRUCTURE__CONDITION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__BLOCK = CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_FEATURE_COUNT = CONTROL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_OPERATION_COUNT = CONTROL_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LogoProgramModule.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.WhileImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 16;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONDITION = CONTROL_STRUCTURE__CONDITION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__BLOCK = CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = CONTROL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_OPERATION_COUNT = CONTROL_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LogoProgramModule.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.ParameterImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LogoProgramModule.impl.ParameterCallImpl <em>Parameter Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LogoProgramModule.impl.ParameterCallImpl
	 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getParameterCall()
	 * @generated
	 */
	int PARAMETER_CALL = 18;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL__PARAMETER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link LogoProgramModule.LogoProgram <em>Logo Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logo Program</em>'.
	 * @see LogoProgramModule.LogoProgram
	 * @generated
	 */
	EClass getLogoProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link LogoProgramModule.LogoProgram#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see LogoProgramModule.LogoProgram#getInstructions()
	 * @see #getLogoProgram()
	 * @generated
	 */
	EReference getLogoProgram_Instructions();

	/**
	 * Returns the meta object for class '{@link LogoProgramModule.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see LogoProgramModule.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link LogoProgramModule.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive</em>'.
	 * @see LogoProgramModule.Primitive
	 * @generated
	 */
	EClass getPrimitive();

	/**
	 * Returns the meta object for class '{@link LogoProgramModule.Back <em>Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Back</em>'.
	 * @see LogoProgramModule.Back
	 * @generated
	 */
	EClass getBack();

	/**
	 * Returns the meta object for the containment reference '{@link LogoProgramModule.Back#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Steps</em>'.
	 * @see LogoProgramModule.Back#getSteps()
	 * @see #getBack()
	 * @generated
	 */
	EReference getBack_Steps();

	/**
	 * Returns the meta object for class '{@link LogoProgramModule.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward</em>'.
	 * @see LogoProgramModule.Forward
	 * @generated
	 */
	EClass getForward();

	/**
	 * Returns the meta object for the containment reference '{@link LogoProgramModule.Forward#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Steps</em>'.
	 * @see LogoProgramModule.Forward#getSteps()
	 * @see #getForward()
	 * @generated
	 */
	EReference getForward_Steps();

	/**
	 * Returns the meta object for class '{@link LogoProgramModule.Left <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left</em>'.
	 * @see LogoProgramModule.Left
	 * @generated
	 */
	EClass getLeft();

	/**
	 * Returns the meta object for the containment reference '{@link LogoProgramModule.Left#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see LogoProgramModule.Left#getAngle()
	 * @see #getLeft()
	 * @generated
	 */
	EReference getLeft_Angle();

	/**
	 * Returns the meta object for class '{@link LogoProgramModule.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right</em>'.
	 * @see LogoProgramModule.Right
	 * @generated
	 */
	EClass getRight();

	/**
	 * Returns the meta object for the containment reference '{@link LogoProgramModule.Right#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see LogoProgramModule.Right#getAngle()
	 * @see #getRight()
	 * @generated
	 */
	EReference getRight_Angle();

	/**
	 * Returns the meta object for class '{@link LogoProgramModule.PenDown <em>Pen Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pen Down</em>'.
	 * @see LogoProgramModule.PenDown
	 * @generated
	 */
	EClass getPenDown();

	/**
	 * Returns the meta object for class '{@link LogoProgramModule.PenUp <em>Pen Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pen Up</em>'.
	 * @see LogoProgramModule.PenUp
	 * @generated
	 */
	EClass getPenUp();

	/**
	 * Returns the meta object for class '{@link LogoProgramModule.Clear <em>Clear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear</em>'.
	 * @see LogoProgramModule.Clear
	 * @generated
	 */
	EClass getClear();

	/**
	 * Returns the meta object for class '{@link LogoProgramModule.ProcCall <em>Proc Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proc Call</em>'.
	 * @see LogoProgramModule.ProcCall
	 * @generated
	 */
	EClass getProcCall();

	/**
	 * Returns the meta object for the containment reference list '{@link LogoProgramModule.ProcCall#getActualArgs <em>Actual Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actual Args</em>'.
	 * @see LogoProgramModule.ProcCall#getActualArgs()
	 * @see #getProcCall()
	 * @generated
	 */
	EReference getProcCall_ActualArgs();

	/**
	 * Returns the meta object for the reference '{@link LogoProgramModule.ProcCall#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see LogoProgramModule.ProcCall#getDeclaration()
	 * @see #getProcCall()
	 * @generated
	 */
	EReference getProcCall_Declaration();

	/**
	 * Returns the meta object for class '{@link LogoProgramModule.ProcDeclaration <em>Proc Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proc Declaration</em>'.
	 * @see LogoProgramModule.ProcDeclaration
	 * @generated
	 */
	EClass getProcDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link LogoProgramModule.ProcDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see LogoProgramModule.ProcDeclaration#getName()
	 * @see #getProcDeclaration()
	 * @generated
	 */
	EAttribute getProcDeclaration_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link LogoProgramModule.ProcDeclaration#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see LogoProgramModule.ProcDeclaration#getArgs()
	 * @see #getProcDeclaration()
	 * @generated
	 */
	EReference getProcDeclaration_Args();

	/**
	 * Returns the meta object for the reference list '{@link LogoProgramModule.ProcDeclaration#getProcCall <em>Proc Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Proc Call</em>'.
	 * @see LogoProgramModule.ProcDeclaration#getProcCall()
	 * @see #getProcDeclaration()
	 * @generated
	 */
	EReference getProcDeclaration_ProcCall();

	/**
	 * Returns the meta object for the containment reference list '{@link LogoProgramModule.ProcDeclaration#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see LogoProgramModule.ProcDeclaration#getInstructions()
	 * @see #getProcDeclaration()
	 * @generated
	 */
	EReference getProcDeclaration_Instructions();

	/**
	 * Returns the meta object for class '{@link LogoProgramModule.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see LogoProgramModule.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link LogoProgramModule.Block#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see LogoProgramModule.Block#getInstructions()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Instructions();

	/**
	 * Returns the meta object for class '{@link LogoProgramModule.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see LogoProgramModule.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link LogoProgramModule.If#getThenPart <em>Then Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Part</em>'.
	 * @see LogoProgramModule.If#getThenPart()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ThenPart();

	/**
	 * Returns the meta object for the containment reference '{@link LogoProgramModule.If#getElsePart <em>Else Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Part</em>'.
	 * @see LogoProgramModule.If#getElsePart()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ElsePart();

	/**
	 * Returns the meta object for class '{@link LogoProgramModule.ControlStructure <em>Control Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Structure</em>'.
	 * @see LogoProgramModule.ControlStructure
	 * @generated
	 */
	EClass getControlStructure();

	/**
	 * Returns the meta object for the containment reference '{@link LogoProgramModule.ControlStructure#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see LogoProgramModule.ControlStructure#getCondition()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_Condition();

	/**
	 * Returns the meta object for class '{@link LogoProgramModule.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat</em>'.
	 * @see LogoProgramModule.Repeat
	 * @generated
	 */
	EClass getRepeat();

	/**
	 * Returns the meta object for the containment reference '{@link LogoProgramModule.Repeat#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see LogoProgramModule.Repeat#getBlock()
	 * @see #getRepeat()
	 * @generated
	 */
	EReference getRepeat_Block();

	/**
	 * Returns the meta object for class '{@link LogoProgramModule.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see LogoProgramModule.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the containment reference '{@link LogoProgramModule.While#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see LogoProgramModule.While#getBlock()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Block();

	/**
	 * Returns the meta object for class '{@link LogoProgramModule.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see LogoProgramModule.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link LogoProgramModule.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see LogoProgramModule.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link LogoProgramModule.ParameterCall <em>Parameter Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Call</em>'.
	 * @see LogoProgramModule.ParameterCall
	 * @generated
	 */
	EClass getParameterCall();

	/**
	 * Returns the meta object for the reference '{@link LogoProgramModule.ParameterCall#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see LogoProgramModule.ParameterCall#getParameter()
	 * @see #getParameterCall()
	 * @generated
	 */
	EReference getParameterCall_Parameter();

	/**
	 * Returns the meta object for class '{@link LogoProgramModule.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see LogoProgramModule.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogoProgramModuleFactory getLogoProgramModuleFactory();

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
		 * The meta object literal for the '{@link LogoProgramModule.impl.LogoProgramImpl <em>Logo Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.LogoProgramImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getLogoProgram()
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
		 * The meta object literal for the '{@link LogoProgramModule.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.InstructionImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link LogoProgramModule.impl.PrimitiveImpl <em>Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.PrimitiveImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getPrimitive()
		 * @generated
		 */
		EClass PRIMITIVE = eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '{@link LogoProgramModule.impl.BackImpl <em>Back</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.BackImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getBack()
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
		 * The meta object literal for the '{@link LogoProgramModule.impl.ForwardImpl <em>Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.ForwardImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getForward()
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
		 * The meta object literal for the '{@link LogoProgramModule.impl.LeftImpl <em>Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.LeftImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getLeft()
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
		 * The meta object literal for the '{@link LogoProgramModule.impl.RightImpl <em>Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.RightImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getRight()
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
		 * The meta object literal for the '{@link LogoProgramModule.impl.PenDownImpl <em>Pen Down</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.PenDownImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getPenDown()
		 * @generated
		 */
		EClass PEN_DOWN = eINSTANCE.getPenDown();

		/**
		 * The meta object literal for the '{@link LogoProgramModule.impl.PenUpImpl <em>Pen Up</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.PenUpImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getPenUp()
		 * @generated
		 */
		EClass PEN_UP = eINSTANCE.getPenUp();

		/**
		 * The meta object literal for the '{@link LogoProgramModule.impl.ClearImpl <em>Clear</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.ClearImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getClear()
		 * @generated
		 */
		EClass CLEAR = eINSTANCE.getClear();

		/**
		 * The meta object literal for the '{@link LogoProgramModule.impl.ProcCallImpl <em>Proc Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.ProcCallImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getProcCall()
		 * @generated
		 */
		EClass PROC_CALL = eINSTANCE.getProcCall();

		/**
		 * The meta object literal for the '<em><b>Actual Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROC_CALL__ACTUAL_ARGS = eINSTANCE.getProcCall_ActualArgs();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROC_CALL__DECLARATION = eINSTANCE.getProcCall_Declaration();

		/**
		 * The meta object literal for the '{@link LogoProgramModule.impl.ProcDeclarationImpl <em>Proc Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.ProcDeclarationImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getProcDeclaration()
		 * @generated
		 */
		EClass PROC_DECLARATION = eINSTANCE.getProcDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROC_DECLARATION__NAME = eINSTANCE.getProcDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROC_DECLARATION__ARGS = eINSTANCE.getProcDeclaration_Args();

		/**
		 * The meta object literal for the '<em><b>Proc Call</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROC_DECLARATION__PROC_CALL = eINSTANCE.getProcDeclaration_ProcCall();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROC_DECLARATION__INSTRUCTIONS = eINSTANCE.getProcDeclaration_Instructions();

		/**
		 * The meta object literal for the '{@link LogoProgramModule.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.BlockImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__INSTRUCTIONS = eINSTANCE.getBlock_Instructions();

		/**
		 * The meta object literal for the '{@link LogoProgramModule.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.IfImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Then Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__THEN_PART = eINSTANCE.getIf_ThenPart();

		/**
		 * The meta object literal for the '<em><b>Else Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE_PART = eINSTANCE.getIf_ElsePart();

		/**
		 * The meta object literal for the '{@link LogoProgramModule.impl.ControlStructureImpl <em>Control Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.ControlStructureImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getControlStructure()
		 * @generated
		 */
		EClass CONTROL_STRUCTURE = eINSTANCE.getControlStructure();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__CONDITION = eINSTANCE.getControlStructure_Condition();

		/**
		 * The meta object literal for the '{@link LogoProgramModule.impl.RepeatImpl <em>Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.RepeatImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getRepeat()
		 * @generated
		 */
		EClass REPEAT = eINSTANCE.getRepeat();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT__BLOCK = eINSTANCE.getRepeat_Block();

		/**
		 * The meta object literal for the '{@link LogoProgramModule.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.WhileImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__BLOCK = eINSTANCE.getWhile_Block();

		/**
		 * The meta object literal for the '{@link LogoProgramModule.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.ParameterImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link LogoProgramModule.impl.ParameterCallImpl <em>Parameter Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.ParameterCallImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getParameterCall()
		 * @generated
		 */
		EClass PARAMETER_CALL = eINSTANCE.getParameterCall();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CALL__PARAMETER = eINSTANCE.getParameterCall_Parameter();

		/**
		 * The meta object literal for the '{@link LogoProgramModule.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LogoProgramModule.impl.ExpressionImpl
		 * @see LogoProgramModule.impl.LogoProgramModulePackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

	}

} //LogoProgramModulePackage

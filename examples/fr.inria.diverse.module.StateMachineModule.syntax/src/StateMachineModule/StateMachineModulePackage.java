/**
 */
package StateMachineModule;

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
 * @see StateMachineModule.StateMachineModuleFactory
 * @model kind="package"
 * @generated
 */
public interface StateMachineModulePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "StateMachineModule";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "StateMachineModule";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "StateMachineModule";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateMachineModulePackage eINSTANCE = StateMachineModule.impl.StateMachineModulePackageImpl.init();

	/**
	 * The meta object id for the '{@link StateMachineModule.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.NamedElementImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 17;

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
	 * The meta object id for the '{@link StateMachineModule.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.StateMachineImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Subvertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__SUBVERTEX = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StateMachineModule.impl.AbstractStateImpl <em>Abstract State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.AbstractStateImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getAbstractState()
	 * @generated
	 */
	int ABSTRACT_STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__INCOMING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StateMachineModule.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.StateImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = ABSTRACT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING = ABSTRACT_STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING = ABSTRACT_STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DO_ACTIVITY = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENTRY = ABSTRACT_STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXIT = ABSTRACT_STATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = ABSTRACT_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StateMachineModule.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.TransitionImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EFFECT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StateMachineModule.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.TriggerImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 4;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link StateMachineModule.impl.PseudostateImpl <em>Pseudostate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.PseudostateImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getPseudostate()
	 * @generated
	 */
	int PSEUDOSTATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__NAME = ABSTRACT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__INCOMING = ABSTRACT_STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__OUTGOING = ABSTRACT_STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__KIND = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE_OPERATION_COUNT = ABSTRACT_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StateMachineModule.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.FinalStateImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__INCOMING = STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OUTGOING = STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__DO_ACTIVITY = STATE__DO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ENTRY = STATE__ENTRY;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__EXIT = STATE__EXIT;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StateMachineModule.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.StatementImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 7;

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
	 * The meta object id for the '{@link StateMachineModule.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.ProgramImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 8;

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
	 * The meta object id for the '{@link StateMachineModule.impl.ConditionalImpl <em>Conditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.ConditionalImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getConditional()
	 * @generated
	 */
	int CONDITIONAL = 9;

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
	 * The meta object id for the '{@link StateMachineModule.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.LoopImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 10;

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
	 * The meta object id for the '{@link StateMachineModule.impl.VarDeclImpl <em>Var Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.VarDeclImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getVarDecl()
	 * @generated
	 */
	int VAR_DECL = 11;

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
	 * The meta object id for the '{@link StateMachineModule.impl.ConsoleOutputImpl <em>Console Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.ConsoleOutputImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getConsoleOutput()
	 * @generated
	 */
	int CONSOLE_OUTPUT = 12;

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
	 * The meta object id for the '{@link StateMachineModule.impl.PrintlnImpl <em>Println</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.PrintlnImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getPrintln()
	 * @generated
	 */
	int PRINTLN = 13;

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
	 * The meta object id for the '{@link StateMachineModule.impl.PrintImpl <em>Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.PrintImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getPrint()
	 * @generated
	 */
	int PRINT = 14;

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
	 * The meta object id for the '{@link StateMachineModule.impl.AssignationImpl <em>Assignation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.AssignationImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getAssignation()
	 * @generated
	 */
	int ASSIGNATION = 15;

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
	 * The meta object id for the '{@link StateMachineModule.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.WaitImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 16;

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
	 * The meta object id for the '{@link StateMachineModule.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.ConstraintImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 18;

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
	 * The meta object id for the '{@link StateMachineModule.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.impl.ExpressionImpl
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getExpression()
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
	 * The meta object id for the '{@link StateMachineModule.PseudostateKind <em>Pseudostate Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModule.PseudostateKind
	 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getPseudostateKind()
	 * @generated
	 */
	int PSEUDOSTATE_KIND = 20;


	/**
	 * Returns the meta object for class '{@link StateMachineModule.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see StateMachineModule.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link StateMachineModule.StateMachine#getSubvertex <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subvertex</em>'.
	 * @see StateMachineModule.StateMachine#getSubvertex()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Subvertex();

	/**
	 * Returns the meta object for the containment reference list '{@link StateMachineModule.StateMachine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see StateMachineModule.StateMachine#getTransitions()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Transitions();

	/**
	 * Returns the meta object for class '{@link StateMachineModule.AbstractState <em>Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract State</em>'.
	 * @see StateMachineModule.AbstractState
	 * @generated
	 */
	EClass getAbstractState();

	/**
	 * Returns the meta object for the reference list '{@link StateMachineModule.AbstractState#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see StateMachineModule.AbstractState#getIncoming()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link StateMachineModule.AbstractState#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see StateMachineModule.AbstractState#getOutgoing()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_Outgoing();

	/**
	 * Returns the meta object for class '{@link StateMachineModule.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see StateMachineModule.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference '{@link StateMachineModule.State#getDoActivity <em>Do Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do Activity</em>'.
	 * @see StateMachineModule.State#getDoActivity()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_DoActivity();

	/**
	 * Returns the meta object for the containment reference '{@link StateMachineModule.State#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see StateMachineModule.State#getEntry()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Entry();

	/**
	 * Returns the meta object for the containment reference '{@link StateMachineModule.State#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit</em>'.
	 * @see StateMachineModule.State#getExit()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Exit();

	/**
	 * Returns the meta object for class '{@link StateMachineModule.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see StateMachineModule.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link StateMachineModule.Transition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see StateMachineModule.Transition#getTrigger()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Trigger();

	/**
	 * Returns the meta object for the reference '{@link StateMachineModule.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see StateMachineModule.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the reference '{@link StateMachineModule.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see StateMachineModule.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link StateMachineModule.Transition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effect</em>'.
	 * @see StateMachineModule.Transition#getEffect()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Effect();

	/**
	 * Returns the meta object for the containment reference '{@link StateMachineModule.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see StateMachineModule.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for class '{@link StateMachineModule.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see StateMachineModule.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link StateMachineModule.Trigger#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see StateMachineModule.Trigger#getExpression()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Expression();

	/**
	 * Returns the meta object for class '{@link StateMachineModule.Pseudostate <em>Pseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudostate</em>'.
	 * @see StateMachineModule.Pseudostate
	 * @generated
	 */
	EClass getPseudostate();

	/**
	 * Returns the meta object for the attribute '{@link StateMachineModule.Pseudostate#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see StateMachineModule.Pseudostate#getKind()
	 * @see #getPseudostate()
	 * @generated
	 */
	EAttribute getPseudostate_Kind();

	/**
	 * Returns the meta object for class '{@link StateMachineModule.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see StateMachineModule.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link StateMachineModule.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see StateMachineModule.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link StateMachineModule.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see StateMachineModule.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link StateMachineModule.Program#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see StateMachineModule.Program#getStatements()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Statements();

	/**
	 * Returns the meta object for class '{@link StateMachineModule.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional</em>'.
	 * @see StateMachineModule.Conditional
	 * @generated
	 */
	EClass getConditional();

	/**
	 * Returns the meta object for the containment reference '{@link StateMachineModule.Conditional#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see StateMachineModule.Conditional#getCondition()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link StateMachineModule.Conditional#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see StateMachineModule.Conditional#getBody()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_Body();

	/**
	 * Returns the meta object for class '{@link StateMachineModule.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see StateMachineModule.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link StateMachineModule.Loop#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see StateMachineModule.Loop#getGuard()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Guard();

	/**
	 * Returns the meta object for the containment reference '{@link StateMachineModule.Loop#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see StateMachineModule.Loop#getBody()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Body();

	/**
	 * Returns the meta object for class '{@link StateMachineModule.VarDecl <em>Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Decl</em>'.
	 * @see StateMachineModule.VarDecl
	 * @generated
	 */
	EClass getVarDecl();

	/**
	 * Returns the meta object for the attribute '{@link StateMachineModule.VarDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see StateMachineModule.VarDecl#getName()
	 * @see #getVarDecl()
	 * @generated
	 */
	EAttribute getVarDecl_Name();

	/**
	 * Returns the meta object for the containment reference '{@link StateMachineModule.VarDecl#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see StateMachineModule.VarDecl#getExpr()
	 * @see #getVarDecl()
	 * @generated
	 */
	EReference getVarDecl_Expr();

	/**
	 * Returns the meta object for class '{@link StateMachineModule.ConsoleOutput <em>Console Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Console Output</em>'.
	 * @see StateMachineModule.ConsoleOutput
	 * @generated
	 */
	EClass getConsoleOutput();

	/**
	 * Returns the meta object for the attribute '{@link StateMachineModule.ConsoleOutput#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see StateMachineModule.ConsoleOutput#getInput()
	 * @see #getConsoleOutput()
	 * @generated
	 */
	EAttribute getConsoleOutput_Input();

	/**
	 * Returns the meta object for class '{@link StateMachineModule.Println <em>Println</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Println</em>'.
	 * @see StateMachineModule.Println
	 * @generated
	 */
	EClass getPrintln();

	/**
	 * Returns the meta object for class '{@link StateMachineModule.Print <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print</em>'.
	 * @see StateMachineModule.Print
	 * @generated
	 */
	EClass getPrint();

	/**
	 * Returns the meta object for class '{@link StateMachineModule.Assignation <em>Assignation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignation</em>'.
	 * @see StateMachineModule.Assignation
	 * @generated
	 */
	EClass getAssignation();

	/**
	 * Returns the meta object for the reference '{@link StateMachineModule.Assignation#getVarRef <em>Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var Ref</em>'.
	 * @see StateMachineModule.Assignation#getVarRef()
	 * @see #getAssignation()
	 * @generated
	 */
	EReference getAssignation_VarRef();

	/**
	 * Returns the meta object for the containment reference '{@link StateMachineModule.Assignation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see StateMachineModule.Assignation#getExpression()
	 * @see #getAssignation()
	 * @generated
	 */
	EReference getAssignation_Expression();

	/**
	 * Returns the meta object for class '{@link StateMachineModule.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see StateMachineModule.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for the attribute '{@link StateMachineModule.Wait#getMiliseconds <em>Miliseconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Miliseconds</em>'.
	 * @see StateMachineModule.Wait#getMiliseconds()
	 * @see #getWait()
	 * @generated
	 */
	EAttribute getWait_Miliseconds();

	/**
	 * Returns the meta object for class '{@link StateMachineModule.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see StateMachineModule.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link StateMachineModule.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see StateMachineModule.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link StateMachineModule.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see StateMachineModule.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link StateMachineModule.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see StateMachineModule.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for enum '{@link StateMachineModule.PseudostateKind <em>Pseudostate Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pseudostate Kind</em>'.
	 * @see StateMachineModule.PseudostateKind
	 * @generated
	 */
	EEnum getPseudostateKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StateMachineModuleFactory getStateMachineModuleFactory();

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
		 * The meta object literal for the '{@link StateMachineModule.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.StateMachineImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Subvertex</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__SUBVERTEX = eINSTANCE.getStateMachine_Subvertex();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__TRANSITIONS = eINSTANCE.getStateMachine_Transitions();

		/**
		 * The meta object literal for the '{@link StateMachineModule.impl.AbstractStateImpl <em>Abstract State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.AbstractStateImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getAbstractState()
		 * @generated
		 */
		EClass ABSTRACT_STATE = eINSTANCE.getAbstractState();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATE__INCOMING = eINSTANCE.getAbstractState_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATE__OUTGOING = eINSTANCE.getAbstractState_Outgoing();

		/**
		 * The meta object literal for the '{@link StateMachineModule.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.StateImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Do Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DO_ACTIVITY = eINSTANCE.getState_DoActivity();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENTRY = eINSTANCE.getState_Entry();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EXIT = eINSTANCE.getState_Exit();

		/**
		 * The meta object literal for the '{@link StateMachineModule.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.TransitionImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGER = eINSTANCE.getTransition_Trigger();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EFFECT = eINSTANCE.getTransition_Effect();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '{@link StateMachineModule.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.TriggerImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__EXPRESSION = eINSTANCE.getTrigger_Expression();

		/**
		 * The meta object literal for the '{@link StateMachineModule.impl.PseudostateImpl <em>Pseudostate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.PseudostateImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getPseudostate()
		 * @generated
		 */
		EClass PSEUDOSTATE = eINSTANCE.getPseudostate();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSEUDOSTATE__KIND = eINSTANCE.getPseudostate_Kind();

		/**
		 * The meta object literal for the '{@link StateMachineModule.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.FinalStateImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link StateMachineModule.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.StatementImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link StateMachineModule.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.ProgramImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getProgram()
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
		 * The meta object literal for the '{@link StateMachineModule.impl.ConditionalImpl <em>Conditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.ConditionalImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getConditional()
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
		 * The meta object literal for the '{@link StateMachineModule.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.LoopImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getLoop()
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
		 * The meta object literal for the '{@link StateMachineModule.impl.VarDeclImpl <em>Var Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.VarDeclImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getVarDecl()
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
		 * The meta object literal for the '{@link StateMachineModule.impl.ConsoleOutputImpl <em>Console Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.ConsoleOutputImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getConsoleOutput()
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
		 * The meta object literal for the '{@link StateMachineModule.impl.PrintlnImpl <em>Println</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.PrintlnImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getPrintln()
		 * @generated
		 */
		EClass PRINTLN = eINSTANCE.getPrintln();

		/**
		 * The meta object literal for the '{@link StateMachineModule.impl.PrintImpl <em>Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.PrintImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getPrint()
		 * @generated
		 */
		EClass PRINT = eINSTANCE.getPrint();

		/**
		 * The meta object literal for the '{@link StateMachineModule.impl.AssignationImpl <em>Assignation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.AssignationImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getAssignation()
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
		 * The meta object literal for the '{@link StateMachineModule.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.WaitImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getWait()
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
		 * The meta object literal for the '{@link StateMachineModule.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.NamedElementImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link StateMachineModule.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.ConstraintImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link StateMachineModule.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.impl.ExpressionImpl
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link StateMachineModule.PseudostateKind <em>Pseudostate Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModule.PseudostateKind
		 * @see StateMachineModule.impl.StateMachineModulePackageImpl#getPseudostateKind()
		 * @generated
		 */
		EEnum PSEUDOSTATE_KIND = eINSTANCE.getPseudostateKind();

	}

} //StateMachineModulePackage

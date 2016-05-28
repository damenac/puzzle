/**
 */
package CompleteDSLPckg;

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
	 * The meta object id for the '{@link CompleteDSLPckg.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.NamedElementImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 9;

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
	 * The meta object id for the '{@link CompleteDSLPckg.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.StateMachineImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getStateMachine()
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
	 * The feature id for the '<em><b>Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__REGIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.RegionImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Subvertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__SUBVERTEX = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__OWNER_STATE_MACHINE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.AbstractStateImpl <em>Abstract State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.AbstractStateImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getAbstractState()
	 * @generated
	 */
	int ABSTRACT_STATE = 2;

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
	 * The feature id for the '<em><b>Owner Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__OWNER_REGION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.StateImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getState()
	 * @generated
	 */
	int STATE = 3;

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
	 * The feature id for the '<em><b>Owner Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNER_REGION = ABSTRACT_STATE__OWNER_REGION;

	/**
	 * The feature id for the '<em><b>Entry Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENTRY_ACTION = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Do Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DO_ACTION = ABSTRACT_STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exit Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXIT_ACTION = ABSTRACT_STATE_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link CompleteDSLPckg.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.TransitionImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 4;

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
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.TriggerImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 5;

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
	 * The meta object id for the '{@link CompleteDSLPckg.impl.PseudostateImpl <em>Pseudostate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.PseudostateImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getPseudostate()
	 * @generated
	 */
	int PSEUDOSTATE = 6;

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
	 * The feature id for the '<em><b>Owner Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__OWNER_REGION = ABSTRACT_STATE__OWNER_REGION;

	/**
	 * The number of structural features of the '<em>Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE_OPERATION_COUNT = ABSTRACT_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.InitialStateImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__NAME = PSEUDOSTATE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__INCOMING = PSEUDOSTATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__OUTGOING = PSEUDOSTATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Owner Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__OWNER_REGION = PSEUDOSTATE__OWNER_REGION;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = PSEUDOSTATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_OPERATION_COUNT = PSEUDOSTATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.FinalStateImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 8;

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
	 * The feature id for the '<em><b>Owner Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OWNER_REGION = STATE__OWNER_REGION;

	/**
	 * The feature id for the '<em><b>Entry Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ENTRY_ACTION = STATE__ENTRY_ACTION;

	/**
	 * The feature id for the '<em><b>Do Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__DO_ACTION = STATE__DO_ACTION;

	/**
	 * The feature id for the '<em><b>Exit Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__EXIT_ACTION = STATE__EXIT_ACTION;

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
	 * The meta object id for the '{@link CompleteDSLPckg.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.BlockImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 10;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Eval Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK___EVAL_STATEMENT__MAP = 0;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.NotTriggerImpl <em>Not Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.NotTriggerImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getNotTrigger()
	 * @generated
	 */
	int NOT_TRIGGER = 11;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TRIGGER__EXPRESSION = TRIGGER__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TRIGGER__TRIGGER = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.AndTriggerImpl <em>And Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.AndTriggerImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getAndTrigger()
	 * @generated
	 */
	int AND_TRIGGER = 12;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TRIGGER__EXPRESSION = TRIGGER__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TRIGGER__LEFT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TRIGGER__RIGHT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>And Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompleteDSLPckg.impl.OrTriggerImpl <em>Or Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompleteDSLPckg.impl.OrTriggerImpl
	 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getOrTrigger()
	 * @generated
	 */
	int OR_TRIGGER = 13;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TRIGGER__EXPRESSION = TRIGGER__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TRIGGER__LEFT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TRIGGER__RIGHT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Or Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Or Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see CompleteDSLPckg.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link CompleteDSLPckg.StateMachine#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regions</em>'.
	 * @see CompleteDSLPckg.StateMachine#getRegions()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Regions();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see CompleteDSLPckg.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the containment reference list '{@link CompleteDSLPckg.Region#getSubvertex <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subvertex</em>'.
	 * @see CompleteDSLPckg.Region#getSubvertex()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Subvertex();

	/**
	 * Returns the meta object for the containment reference list '{@link CompleteDSLPckg.Region#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see CompleteDSLPckg.Region#getTransitions()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Transitions();

	/**
	 * Returns the meta object for the container reference '{@link CompleteDSLPckg.Region#getOwnerStateMachine <em>Owner State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner State Machine</em>'.
	 * @see CompleteDSLPckg.Region#getOwnerStateMachine()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_OwnerStateMachine();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.AbstractState <em>Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract State</em>'.
	 * @see CompleteDSLPckg.AbstractState
	 * @generated
	 */
	EClass getAbstractState();

	/**
	 * Returns the meta object for the reference list '{@link CompleteDSLPckg.AbstractState#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see CompleteDSLPckg.AbstractState#getIncoming()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link CompleteDSLPckg.AbstractState#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see CompleteDSLPckg.AbstractState#getOutgoing()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_Outgoing();

	/**
	 * Returns the meta object for the container reference '{@link CompleteDSLPckg.AbstractState#getOwnerRegion <em>Owner Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Region</em>'.
	 * @see CompleteDSLPckg.AbstractState#getOwnerRegion()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_OwnerRegion();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see CompleteDSLPckg.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference '{@link CompleteDSLPckg.State#getEntryAction <em>Entry Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Action</em>'.
	 * @see CompleteDSLPckg.State#getEntryAction()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EntryAction();

	/**
	 * Returns the meta object for the containment reference '{@link CompleteDSLPckg.State#getDoAction <em>Do Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do Action</em>'.
	 * @see CompleteDSLPckg.State#getDoAction()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_DoAction();

	/**
	 * Returns the meta object for the containment reference '{@link CompleteDSLPckg.State#getExitAction <em>Exit Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit Action</em>'.
	 * @see CompleteDSLPckg.State#getExitAction()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ExitAction();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see CompleteDSLPckg.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link CompleteDSLPckg.Transition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see CompleteDSLPckg.Transition#getTrigger()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Trigger();

	/**
	 * Returns the meta object for the reference '{@link CompleteDSLPckg.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see CompleteDSLPckg.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the reference '{@link CompleteDSLPckg.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see CompleteDSLPckg.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see CompleteDSLPckg.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link CompleteDSLPckg.Trigger#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see CompleteDSLPckg.Trigger#getExpression()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Expression();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.Pseudostate <em>Pseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudostate</em>'.
	 * @see CompleteDSLPckg.Pseudostate
	 * @generated
	 */
	EClass getPseudostate();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see CompleteDSLPckg.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see CompleteDSLPckg.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see CompleteDSLPckg.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link CompleteDSLPckg.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CompleteDSLPckg.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see CompleteDSLPckg.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the '{@link CompleteDSLPckg.Block#evalStatement(java.util.Map) <em>Eval Statement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval Statement</em>' operation.
	 * @see CompleteDSLPckg.Block#evalStatement(java.util.Map)
	 * @generated
	 */
	EOperation getBlock__EvalStatement__Map();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.NotTrigger <em>Not Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Trigger</em>'.
	 * @see CompleteDSLPckg.NotTrigger
	 * @generated
	 */
	EClass getNotTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link CompleteDSLPckg.NotTrigger#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see CompleteDSLPckg.NotTrigger#getTrigger()
	 * @see #getNotTrigger()
	 * @generated
	 */
	EReference getNotTrigger_Trigger();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.AndTrigger <em>And Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Trigger</em>'.
	 * @see CompleteDSLPckg.AndTrigger
	 * @generated
	 */
	EClass getAndTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link CompleteDSLPckg.AndTrigger#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see CompleteDSLPckg.AndTrigger#getLeft()
	 * @see #getAndTrigger()
	 * @generated
	 */
	EReference getAndTrigger_Left();

	/**
	 * Returns the meta object for the containment reference '{@link CompleteDSLPckg.AndTrigger#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see CompleteDSLPckg.AndTrigger#getRight()
	 * @see #getAndTrigger()
	 * @generated
	 */
	EReference getAndTrigger_Right();

	/**
	 * Returns the meta object for class '{@link CompleteDSLPckg.OrTrigger <em>Or Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Trigger</em>'.
	 * @see CompleteDSLPckg.OrTrigger
	 * @generated
	 */
	EClass getOrTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link CompleteDSLPckg.OrTrigger#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see CompleteDSLPckg.OrTrigger#getLeft()
	 * @see #getOrTrigger()
	 * @generated
	 */
	EReference getOrTrigger_Left();

	/**
	 * Returns the meta object for the containment reference '{@link CompleteDSLPckg.OrTrigger#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see CompleteDSLPckg.OrTrigger#getRight()
	 * @see #getOrTrigger()
	 * @generated
	 */
	EReference getOrTrigger_Right();

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
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.StateMachineImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__REGIONS = eINSTANCE.getStateMachine_Regions();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.RegionImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Subvertex</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__SUBVERTEX = eINSTANCE.getRegion_Subvertex();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__TRANSITIONS = eINSTANCE.getRegion_Transitions();

		/**
		 * The meta object literal for the '<em><b>Owner State Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__OWNER_STATE_MACHINE = eINSTANCE.getRegion_OwnerStateMachine();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.AbstractStateImpl <em>Abstract State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.AbstractStateImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getAbstractState()
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
		 * The meta object literal for the '<em><b>Owner Region</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATE__OWNER_REGION = eINSTANCE.getAbstractState_OwnerRegion();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.StateImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Entry Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENTRY_ACTION = eINSTANCE.getState_EntryAction();

		/**
		 * The meta object literal for the '<em><b>Do Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DO_ACTION = eINSTANCE.getState_DoAction();

		/**
		 * The meta object literal for the '<em><b>Exit Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EXIT_ACTION = eINSTANCE.getState_ExitAction();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.TransitionImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getTransition()
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
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.TriggerImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getTrigger()
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
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.PseudostateImpl <em>Pseudostate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.PseudostateImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getPseudostate()
		 * @generated
		 */
		EClass PSEUDOSTATE = eINSTANCE.getPseudostate();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.InitialStateImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.FinalStateImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.NamedElementImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.BlockImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Eval Statement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOCK___EVAL_STATEMENT__MAP = eINSTANCE.getBlock__EvalStatement__Map();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.NotTriggerImpl <em>Not Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.NotTriggerImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getNotTrigger()
		 * @generated
		 */
		EClass NOT_TRIGGER = eINSTANCE.getNotTrigger();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_TRIGGER__TRIGGER = eINSTANCE.getNotTrigger_Trigger();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.AndTriggerImpl <em>And Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.AndTriggerImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getAndTrigger()
		 * @generated
		 */
		EClass AND_TRIGGER = eINSTANCE.getAndTrigger();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_TRIGGER__LEFT = eINSTANCE.getAndTrigger_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_TRIGGER__RIGHT = eINSTANCE.getAndTrigger_Right();

		/**
		 * The meta object literal for the '{@link CompleteDSLPckg.impl.OrTriggerImpl <em>Or Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompleteDSLPckg.impl.OrTriggerImpl
		 * @see CompleteDSLPckg.impl.CompleteDSLPckgPackageImpl#getOrTrigger()
		 * @generated
		 */
		EClass OR_TRIGGER = eINSTANCE.getOrTrigger();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_TRIGGER__LEFT = eINSTANCE.getOrTrigger_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_TRIGGER__RIGHT = eINSTANCE.getOrTrigger_Right();

	}

} //CompleteDSLPckgPackage

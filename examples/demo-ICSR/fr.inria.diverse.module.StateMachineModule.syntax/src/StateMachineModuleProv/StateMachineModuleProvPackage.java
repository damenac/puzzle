/**
 */
package StateMachineModuleProv;

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
 * @see StateMachineModuleProv.StateMachineModuleProvFactory
 * @model kind="package"
 * @generated
 */
public interface StateMachineModuleProvPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "StateMachineModuleProv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "StateMachineModuleProv";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "StateMachineModuleProv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateMachineModuleProvPackage eINSTANCE = StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl.init();

	/**
	 * The meta object id for the '{@link StateMachineModuleProv.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModuleProv.impl.NamedElementImpl
	 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 16;

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
	 * The meta object id for the '{@link StateMachineModuleProv.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModuleProv.impl.StateMachineImpl
	 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getStateMachine()
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
	 * The meta object id for the '{@link StateMachineModuleProv.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModuleProv.impl.RegionImpl
	 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getRegion()
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
	 * The feature id for the '<em><b>Owner State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__OWNER_STATE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Init Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___INIT_REGION__OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context Path By Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___GET_CONTEXT_PATH_BY_REGION = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___STEP__OBJECT_OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Remove States From Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___REMOVE_STATES_FROM_CONTEXT__OBJECT_OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add States To Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___ADD_STATES_TO_CONTEXT__OBJECT_OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Current State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___GET_CURRENT_STATE__OBJECT_OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Active Transitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___GET_ACTIVE_TRANSITIONS__ABSTRACTSTATE_OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Find Old Active States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___FIND_OLD_ACTIVE_STATES__OBJECT_TRANSITION_OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Find New Active States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___FIND_NEW_ACTIVE_STATES__OBJECT_TRANSITION_OBJECT_OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Find New Active Transitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___FIND_NEW_ACTIVE_TRANSITIONS__OBJECT_TRANSITION_OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___GET_ALL_PARENTS__ABSTRACTSTATE_OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get All Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___GET_ALL_CHILDREN__ABSTRACTSTATE_OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Deepest Conflicting Transition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___DEEPEST_CONFLICTING_TRANSITION__OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Context Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___GET_CONTEXT_PATH__ABSTRACTSTATE = NAMED_ELEMENT_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get All Substates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___GET_ALL_SUBSTATES__ABSTRACTSTATE_OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Save History State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___SAVE_HISTORY_STATE__OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___DEEP_HISTORY = NAMED_ELEMENT_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___DEEP_HISTORY__OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___HISTORY = NAMED_ELEMENT_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___HISTORY__STATE = NAMED_ELEMENT_OPERATION_COUNT + 19;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 20;

	/**
	 * The meta object id for the '{@link StateMachineModuleProv.impl.AbstractStateImpl <em>Abstract State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModuleProv.impl.AbstractStateImpl
	 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getAbstractState()
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
	 * The feature id for the '<em><b>Owner Region</b></em>' reference.
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
	 * The meta object id for the '{@link StateMachineModuleProv.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModuleProv.impl.StateImpl
	 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getState()
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
	 * The feature id for the '<em><b>Owner Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNER_REGION = ABSTRACT_STATE__OWNER_REGION;

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
	 * The feature id for the '<em><b>Owned Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNED_REGIONS = ABSTRACT_STATE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Entry State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___ENTRY_STATE__OBJECT = ABSTRACT_STATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Eval State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___EVAL_STATE__OBJECT = ABSTRACT_STATE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Exit State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___EXIT_STATE__OBJECT = ABSTRACT_STATE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = ABSTRACT_STATE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link StateMachineModuleProv.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModuleProv.impl.TransitionImpl
	 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getTransition()
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
	 * The operation id for the '<em>Eval Transition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___EVAL_TRANSITION__OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Valid Guard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___VALID_GUARD__OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Already Fired</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ALREADY_FIRED__OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Reset Fired</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___RESET_FIRED = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Fired</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___FIRED = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Fired</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___FIRED__BOOLEAN = NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link StateMachineModuleProv.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModuleProv.impl.TriggerImpl
	 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getTrigger()
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
	 * The operation id for the '<em>Eval Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER___EVAL_TRIGGER__OBJECT = 0;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link StateMachineModuleProv.impl.PseudostateImpl <em>Pseudostate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModuleProv.impl.PseudostateImpl
	 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getPseudostate()
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
	 * The feature id for the '<em><b>Owner Region</b></em>' reference.
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
	 * The meta object id for the '{@link StateMachineModuleProv.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModuleProv.impl.InitialStateImpl
	 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getInitialState()
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
	 * The feature id for the '<em><b>Owner Region</b></em>' reference.
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
	 * The meta object id for the '{@link StateMachineModuleProv.impl.ForkImpl <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModuleProv.impl.ForkImpl
	 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getFork()
	 * @generated
	 */
	int FORK = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__NAME = PSEUDOSTATE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__INCOMING = PSEUDOSTATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__OUTGOING = PSEUDOSTATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Owner Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__OWNER_REGION = PSEUDOSTATE__OWNER_REGION;

	/**
	 * The number of structural features of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_FEATURE_COUNT = PSEUDOSTATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_OPERATION_COUNT = PSEUDOSTATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StateMachineModuleProv.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModuleProv.impl.JoinImpl
	 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__NAME = PSEUDOSTATE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__INCOMING = PSEUDOSTATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__OUTGOING = PSEUDOSTATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Owner Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__OWNER_REGION = PSEUDOSTATE__OWNER_REGION;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = PSEUDOSTATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = PSEUDOSTATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StateMachineModuleProv.impl.ShallowHistoryImpl <em>Shallow History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModuleProv.impl.ShallowHistoryImpl
	 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getShallowHistory()
	 * @generated
	 */
	int SHALLOW_HISTORY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHALLOW_HISTORY__NAME = PSEUDOSTATE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHALLOW_HISTORY__INCOMING = PSEUDOSTATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHALLOW_HISTORY__OUTGOING = PSEUDOSTATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Owner Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHALLOW_HISTORY__OWNER_REGION = PSEUDOSTATE__OWNER_REGION;

	/**
	 * The number of structural features of the '<em>Shallow History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHALLOW_HISTORY_FEATURE_COUNT = PSEUDOSTATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shallow History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHALLOW_HISTORY_OPERATION_COUNT = PSEUDOSTATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StateMachineModuleProv.impl.JunctionImpl <em>Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModuleProv.impl.JunctionImpl
	 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getJunction()
	 * @generated
	 */
	int JUNCTION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__NAME = PSEUDOSTATE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__INCOMING = PSEUDOSTATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__OUTGOING = PSEUDOSTATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Owner Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__OWNER_REGION = PSEUDOSTATE__OWNER_REGION;

	/**
	 * The number of structural features of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_FEATURE_COUNT = PSEUDOSTATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_OPERATION_COUNT = PSEUDOSTATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StateMachineModuleProv.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModuleProv.impl.FinalStateImpl
	 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 12;

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
	 * The feature id for the '<em><b>Owner Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OWNER_REGION = STATE__OWNER_REGION;

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
	 * The feature id for the '<em><b>Owned Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OWNED_REGIONS = STATE__OWNED_REGIONS;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Entry State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___ENTRY_STATE__OBJECT = STATE___ENTRY_STATE__OBJECT;

	/**
	 * The operation id for the '<em>Eval State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___EVAL_STATE__OBJECT = STATE___EVAL_STATE__OBJECT;

	/**
	 * The operation id for the '<em>Exit State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___EXIT_STATE__OBJECT = STATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Super exit State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___SUPER_EXIT_STATE__OBJECT = STATE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link StateMachineModuleProv.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModuleProv.impl.ConstraintImpl
	 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 13;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Eval Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___EVAL_CONSTRAINT__OBJECT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link StateMachineModuleProv.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModuleProv.impl.StatementImpl
	 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 14;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Eval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT___EVAL__OBJECT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link StateMachineModuleProv.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachineModuleProv.impl.ProgramImpl
	 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 15;

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
	 * The operation id for the '<em>Eval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM___EVAL__OBJECT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link StateMachineModuleProv.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see StateMachineModuleProv.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link StateMachineModuleProv.StateMachine#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regions</em>'.
	 * @see StateMachineModuleProv.StateMachine#getRegions()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Regions();

	/**
	 * Returns the meta object for class '{@link StateMachineModuleProv.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see StateMachineModuleProv.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the containment reference list '{@link StateMachineModuleProv.Region#getSubvertex <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subvertex</em>'.
	 * @see StateMachineModuleProv.Region#getSubvertex()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Subvertex();

	/**
	 * Returns the meta object for the containment reference list '{@link StateMachineModuleProv.Region#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see StateMachineModuleProv.Region#getTransitions()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Transitions();

	/**
	 * Returns the meta object for the reference '{@link StateMachineModuleProv.Region#getOwnerState <em>Owner State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner State</em>'.
	 * @see StateMachineModuleProv.Region#getOwnerState()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_OwnerState();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#initRegion(java.lang.Object) <em>Init Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Region</em>' operation.
	 * @see StateMachineModuleProv.Region#initRegion(java.lang.Object)
	 * @generated
	 */
	EOperation getRegion__InitRegion__Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#getContextPathByRegion() <em>Get Context Path By Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Context Path By Region</em>' operation.
	 * @see StateMachineModuleProv.Region#getContextPathByRegion()
	 * @generated
	 */
	EOperation getRegion__GetContextPathByRegion();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#step(java.lang.Object, java.lang.Object) <em>Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Step</em>' operation.
	 * @see StateMachineModuleProv.Region#step(java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getRegion__Step__Object_Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#removeStatesFromContext(java.lang.Object, java.lang.Object) <em>Remove States From Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove States From Context</em>' operation.
	 * @see StateMachineModuleProv.Region#removeStatesFromContext(java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getRegion__RemoveStatesFromContext__Object_Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#addStatesToContext(java.lang.Object, java.lang.Object) <em>Add States To Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add States To Context</em>' operation.
	 * @see StateMachineModuleProv.Region#addStatesToContext(java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getRegion__AddStatesToContext__Object_Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#getCurrentState(java.lang.Object, java.lang.Object) <em>Get Current State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current State</em>' operation.
	 * @see StateMachineModuleProv.Region#getCurrentState(java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getRegion__GetCurrentState__Object_Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#getActiveTransitions(StateMachineModuleProv.AbstractState, java.lang.Object) <em>Get Active Transitions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Active Transitions</em>' operation.
	 * @see StateMachineModuleProv.Region#getActiveTransitions(StateMachineModuleProv.AbstractState, java.lang.Object)
	 * @generated
	 */
	EOperation getRegion__GetActiveTransitions__AbstractState_Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#findOldActiveStates(java.lang.Object, StateMachineModuleProv.Transition, java.lang.Object) <em>Find Old Active States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Old Active States</em>' operation.
	 * @see StateMachineModuleProv.Region#findOldActiveStates(java.lang.Object, StateMachineModuleProv.Transition, java.lang.Object)
	 * @generated
	 */
	EOperation getRegion__FindOldActiveStates__Object_Transition_Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#findNewActiveStates(java.lang.Object, StateMachineModuleProv.Transition, java.lang.Object, java.lang.Object) <em>Find New Active States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find New Active States</em>' operation.
	 * @see StateMachineModuleProv.Region#findNewActiveStates(java.lang.Object, StateMachineModuleProv.Transition, java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getRegion__FindNewActiveStates__Object_Transition_Object_Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#findNewActiveTransitions(java.lang.Object, StateMachineModuleProv.Transition, java.lang.Object) <em>Find New Active Transitions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find New Active Transitions</em>' operation.
	 * @see StateMachineModuleProv.Region#findNewActiveTransitions(java.lang.Object, StateMachineModuleProv.Transition, java.lang.Object)
	 * @generated
	 */
	EOperation getRegion__FindNewActiveTransitions__Object_Transition_Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#getAllParents(StateMachineModuleProv.AbstractState, java.lang.Object) <em>Get All Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parents</em>' operation.
	 * @see StateMachineModuleProv.Region#getAllParents(StateMachineModuleProv.AbstractState, java.lang.Object)
	 * @generated
	 */
	EOperation getRegion__GetAllParents__AbstractState_Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#getAllChildren(StateMachineModuleProv.AbstractState, java.lang.Object) <em>Get All Children</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Children</em>' operation.
	 * @see StateMachineModuleProv.Region#getAllChildren(StateMachineModuleProv.AbstractState, java.lang.Object)
	 * @generated
	 */
	EOperation getRegion__GetAllChildren__AbstractState_Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#deepestConflictingTransition(java.lang.Object) <em>Deepest Conflicting Transition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deepest Conflicting Transition</em>' operation.
	 * @see StateMachineModuleProv.Region#deepestConflictingTransition(java.lang.Object)
	 * @generated
	 */
	EOperation getRegion__DeepestConflictingTransition__Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#getContextPath(StateMachineModuleProv.AbstractState) <em>Get Context Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Context Path</em>' operation.
	 * @see StateMachineModuleProv.Region#getContextPath(StateMachineModuleProv.AbstractState)
	 * @generated
	 */
	EOperation getRegion__GetContextPath__AbstractState();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#getAllSubstates(StateMachineModuleProv.AbstractState, java.lang.Object) <em>Get All Substates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Substates</em>' operation.
	 * @see StateMachineModuleProv.Region#getAllSubstates(StateMachineModuleProv.AbstractState, java.lang.Object)
	 * @generated
	 */
	EOperation getRegion__GetAllSubstates__AbstractState_Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#saveHistoryState(java.lang.Object) <em>Save History State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save History State</em>' operation.
	 * @see StateMachineModuleProv.Region#saveHistoryState(java.lang.Object)
	 * @generated
	 */
	EOperation getRegion__SaveHistoryState__Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#deepHistory() <em>Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deep History</em>' operation.
	 * @see StateMachineModuleProv.Region#deepHistory()
	 * @generated
	 */
	EOperation getRegion__DeepHistory();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#deepHistory(java.lang.Object) <em>Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deep History</em>' operation.
	 * @see StateMachineModuleProv.Region#deepHistory(java.lang.Object)
	 * @generated
	 */
	EOperation getRegion__DeepHistory__Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#history() <em>History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>History</em>' operation.
	 * @see StateMachineModuleProv.Region#history()
	 * @generated
	 */
	EOperation getRegion__History();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Region#history(StateMachineModuleProv.State) <em>History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>History</em>' operation.
	 * @see StateMachineModuleProv.Region#history(StateMachineModuleProv.State)
	 * @generated
	 */
	EOperation getRegion__History__State();

	/**
	 * Returns the meta object for class '{@link StateMachineModuleProv.AbstractState <em>Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract State</em>'.
	 * @see StateMachineModuleProv.AbstractState
	 * @generated
	 */
	EClass getAbstractState();

	/**
	 * Returns the meta object for the reference list '{@link StateMachineModuleProv.AbstractState#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see StateMachineModuleProv.AbstractState#getIncoming()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link StateMachineModuleProv.AbstractState#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see StateMachineModuleProv.AbstractState#getOutgoing()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_Outgoing();

	/**
	 * Returns the meta object for the reference '{@link StateMachineModuleProv.AbstractState#getOwnerRegion <em>Owner Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner Region</em>'.
	 * @see StateMachineModuleProv.AbstractState#getOwnerRegion()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_OwnerRegion();

	/**
	 * Returns the meta object for class '{@link StateMachineModuleProv.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see StateMachineModuleProv.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference '{@link StateMachineModuleProv.State#getDoActivity <em>Do Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do Activity</em>'.
	 * @see StateMachineModuleProv.State#getDoActivity()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_DoActivity();

	/**
	 * Returns the meta object for the containment reference '{@link StateMachineModuleProv.State#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see StateMachineModuleProv.State#getEntry()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Entry();

	/**
	 * Returns the meta object for the containment reference '{@link StateMachineModuleProv.State#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit</em>'.
	 * @see StateMachineModuleProv.State#getExit()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Exit();

	/**
	 * Returns the meta object for the containment reference list '{@link StateMachineModuleProv.State#getOwnedRegions <em>Owned Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Regions</em>'.
	 * @see StateMachineModuleProv.State#getOwnedRegions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OwnedRegions();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.State#entryState(java.lang.Object) <em>Entry State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Entry State</em>' operation.
	 * @see StateMachineModuleProv.State#entryState(java.lang.Object)
	 * @generated
	 */
	EOperation getState__EntryState__Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.State#evalState(java.lang.Object) <em>Eval State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval State</em>' operation.
	 * @see StateMachineModuleProv.State#evalState(java.lang.Object)
	 * @generated
	 */
	EOperation getState__EvalState__Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.State#exitState(java.lang.Object) <em>Exit State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exit State</em>' operation.
	 * @see StateMachineModuleProv.State#exitState(java.lang.Object)
	 * @generated
	 */
	EOperation getState__ExitState__Object();

	/**
	 * Returns the meta object for class '{@link StateMachineModuleProv.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see StateMachineModuleProv.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link StateMachineModuleProv.Transition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see StateMachineModuleProv.Transition#getTrigger()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Trigger();

	/**
	 * Returns the meta object for the reference '{@link StateMachineModuleProv.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see StateMachineModuleProv.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the reference '{@link StateMachineModuleProv.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see StateMachineModuleProv.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link StateMachineModuleProv.Transition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effect</em>'.
	 * @see StateMachineModuleProv.Transition#getEffect()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Effect();

	/**
	 * Returns the meta object for the containment reference '{@link StateMachineModuleProv.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see StateMachineModuleProv.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Transition#evalTransition(java.lang.Object) <em>Eval Transition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval Transition</em>' operation.
	 * @see StateMachineModuleProv.Transition#evalTransition(java.lang.Object)
	 * @generated
	 */
	EOperation getTransition__EvalTransition__Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Transition#validGuard(java.lang.Object) <em>Valid Guard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Guard</em>' operation.
	 * @see StateMachineModuleProv.Transition#validGuard(java.lang.Object)
	 * @generated
	 */
	EOperation getTransition__ValidGuard__Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Transition#alreadyFired(java.lang.Object) <em>Already Fired</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Already Fired</em>' operation.
	 * @see StateMachineModuleProv.Transition#alreadyFired(java.lang.Object)
	 * @generated
	 */
	EOperation getTransition__AlreadyFired__Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Transition#resetFired() <em>Reset Fired</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Fired</em>' operation.
	 * @see StateMachineModuleProv.Transition#resetFired()
	 * @generated
	 */
	EOperation getTransition__ResetFired();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Transition#fired() <em>Fired</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fired</em>' operation.
	 * @see StateMachineModuleProv.Transition#fired()
	 * @generated
	 */
	EOperation getTransition__Fired();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Transition#fired(boolean) <em>Fired</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fired</em>' operation.
	 * @see StateMachineModuleProv.Transition#fired(boolean)
	 * @generated
	 */
	EOperation getTransition__Fired__boolean();

	/**
	 * Returns the meta object for class '{@link StateMachineModuleProv.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see StateMachineModuleProv.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link StateMachineModuleProv.Trigger#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see StateMachineModuleProv.Trigger#getExpression()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Expression();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Trigger#evalTrigger(java.lang.Object) <em>Eval Trigger</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval Trigger</em>' operation.
	 * @see StateMachineModuleProv.Trigger#evalTrigger(java.lang.Object)
	 * @generated
	 */
	EOperation getTrigger__EvalTrigger__Object();

	/**
	 * Returns the meta object for class '{@link StateMachineModuleProv.Pseudostate <em>Pseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudostate</em>'.
	 * @see StateMachineModuleProv.Pseudostate
	 * @generated
	 */
	EClass getPseudostate();

	/**
	 * Returns the meta object for class '{@link StateMachineModuleProv.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see StateMachineModuleProv.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link StateMachineModuleProv.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see StateMachineModuleProv.Fork
	 * @generated
	 */
	EClass getFork();

	/**
	 * Returns the meta object for class '{@link StateMachineModuleProv.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see StateMachineModuleProv.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for class '{@link StateMachineModuleProv.ShallowHistory <em>Shallow History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shallow History</em>'.
	 * @see StateMachineModuleProv.ShallowHistory
	 * @generated
	 */
	EClass getShallowHistory();

	/**
	 * Returns the meta object for class '{@link StateMachineModuleProv.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction</em>'.
	 * @see StateMachineModuleProv.Junction
	 * @generated
	 */
	EClass getJunction();

	/**
	 * Returns the meta object for class '{@link StateMachineModuleProv.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see StateMachineModuleProv.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.FinalState#exitState(java.lang.Object) <em>Exit State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exit State</em>' operation.
	 * @see StateMachineModuleProv.FinalState#exitState(java.lang.Object)
	 * @generated
	 */
	EOperation getFinalState__ExitState__Object();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.FinalState#super_exitState(java.lang.Object) <em>Super exit State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Super exit State</em>' operation.
	 * @see StateMachineModuleProv.FinalState#super_exitState(java.lang.Object)
	 * @generated
	 */
	EOperation getFinalState__Super_exitState__Object();

	/**
	 * Returns the meta object for class '{@link StateMachineModuleProv.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see StateMachineModuleProv.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Constraint#evalConstraint(java.lang.Object) <em>Eval Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval Constraint</em>' operation.
	 * @see StateMachineModuleProv.Constraint#evalConstraint(java.lang.Object)
	 * @generated
	 */
	EOperation getConstraint__EvalConstraint__Object();

	/**
	 * Returns the meta object for class '{@link StateMachineModuleProv.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see StateMachineModuleProv.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Statement#eval(java.lang.Object) <em>Eval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval</em>' operation.
	 * @see StateMachineModuleProv.Statement#eval(java.lang.Object)
	 * @generated
	 */
	EOperation getStatement__Eval__Object();

	/**
	 * Returns the meta object for class '{@link StateMachineModuleProv.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see StateMachineModuleProv.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link StateMachineModuleProv.Program#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see StateMachineModuleProv.Program#getStatements()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Statements();

	/**
	 * Returns the meta object for the '{@link StateMachineModuleProv.Program#eval(java.lang.Object) <em>Eval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval</em>' operation.
	 * @see StateMachineModuleProv.Program#eval(java.lang.Object)
	 * @generated
	 */
	EOperation getProgram__Eval__Object();

	/**
	 * Returns the meta object for class '{@link StateMachineModuleProv.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see StateMachineModuleProv.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link StateMachineModuleProv.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see StateMachineModuleProv.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StateMachineModuleProvFactory getStateMachineModuleProvFactory();

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
		 * The meta object literal for the '{@link StateMachineModuleProv.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModuleProv.impl.StateMachineImpl
		 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getStateMachine()
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
		 * The meta object literal for the '{@link StateMachineModuleProv.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModuleProv.impl.RegionImpl
		 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getRegion()
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
		 * The meta object literal for the '<em><b>Owner State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__OWNER_STATE = eINSTANCE.getRegion_OwnerState();

		/**
		 * The meta object literal for the '<em><b>Init Region</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___INIT_REGION__OBJECT = eINSTANCE.getRegion__InitRegion__Object();

		/**
		 * The meta object literal for the '<em><b>Get Context Path By Region</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___GET_CONTEXT_PATH_BY_REGION = eINSTANCE.getRegion__GetContextPathByRegion();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___STEP__OBJECT_OBJECT = eINSTANCE.getRegion__Step__Object_Object();

		/**
		 * The meta object literal for the '<em><b>Remove States From Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___REMOVE_STATES_FROM_CONTEXT__OBJECT_OBJECT = eINSTANCE.getRegion__RemoveStatesFromContext__Object_Object();

		/**
		 * The meta object literal for the '<em><b>Add States To Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___ADD_STATES_TO_CONTEXT__OBJECT_OBJECT = eINSTANCE.getRegion__AddStatesToContext__Object_Object();

		/**
		 * The meta object literal for the '<em><b>Get Current State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___GET_CURRENT_STATE__OBJECT_OBJECT = eINSTANCE.getRegion__GetCurrentState__Object_Object();

		/**
		 * The meta object literal for the '<em><b>Get Active Transitions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___GET_ACTIVE_TRANSITIONS__ABSTRACTSTATE_OBJECT = eINSTANCE.getRegion__GetActiveTransitions__AbstractState_Object();

		/**
		 * The meta object literal for the '<em><b>Find Old Active States</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___FIND_OLD_ACTIVE_STATES__OBJECT_TRANSITION_OBJECT = eINSTANCE.getRegion__FindOldActiveStates__Object_Transition_Object();

		/**
		 * The meta object literal for the '<em><b>Find New Active States</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___FIND_NEW_ACTIVE_STATES__OBJECT_TRANSITION_OBJECT_OBJECT = eINSTANCE.getRegion__FindNewActiveStates__Object_Transition_Object_Object();

		/**
		 * The meta object literal for the '<em><b>Find New Active Transitions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___FIND_NEW_ACTIVE_TRANSITIONS__OBJECT_TRANSITION_OBJECT = eINSTANCE.getRegion__FindNewActiveTransitions__Object_Transition_Object();

		/**
		 * The meta object literal for the '<em><b>Get All Parents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___GET_ALL_PARENTS__ABSTRACTSTATE_OBJECT = eINSTANCE.getRegion__GetAllParents__AbstractState_Object();

		/**
		 * The meta object literal for the '<em><b>Get All Children</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___GET_ALL_CHILDREN__ABSTRACTSTATE_OBJECT = eINSTANCE.getRegion__GetAllChildren__AbstractState_Object();

		/**
		 * The meta object literal for the '<em><b>Deepest Conflicting Transition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___DEEPEST_CONFLICTING_TRANSITION__OBJECT = eINSTANCE.getRegion__DeepestConflictingTransition__Object();

		/**
		 * The meta object literal for the '<em><b>Get Context Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___GET_CONTEXT_PATH__ABSTRACTSTATE = eINSTANCE.getRegion__GetContextPath__AbstractState();

		/**
		 * The meta object literal for the '<em><b>Get All Substates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___GET_ALL_SUBSTATES__ABSTRACTSTATE_OBJECT = eINSTANCE.getRegion__GetAllSubstates__AbstractState_Object();

		/**
		 * The meta object literal for the '<em><b>Save History State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___SAVE_HISTORY_STATE__OBJECT = eINSTANCE.getRegion__SaveHistoryState__Object();

		/**
		 * The meta object literal for the '<em><b>Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___DEEP_HISTORY = eINSTANCE.getRegion__DeepHistory();

		/**
		 * The meta object literal for the '<em><b>Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___DEEP_HISTORY__OBJECT = eINSTANCE.getRegion__DeepHistory__Object();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___HISTORY = eINSTANCE.getRegion__History();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___HISTORY__STATE = eINSTANCE.getRegion__History__State();

		/**
		 * The meta object literal for the '{@link StateMachineModuleProv.impl.AbstractStateImpl <em>Abstract State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModuleProv.impl.AbstractStateImpl
		 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getAbstractState()
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
		 * The meta object literal for the '<em><b>Owner Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATE__OWNER_REGION = eINSTANCE.getAbstractState_OwnerRegion();

		/**
		 * The meta object literal for the '{@link StateMachineModuleProv.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModuleProv.impl.StateImpl
		 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getState()
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
		 * The meta object literal for the '<em><b>Owned Regions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OWNED_REGIONS = eINSTANCE.getState_OwnedRegions();

		/**
		 * The meta object literal for the '<em><b>Entry State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___ENTRY_STATE__OBJECT = eINSTANCE.getState__EntryState__Object();

		/**
		 * The meta object literal for the '<em><b>Eval State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___EVAL_STATE__OBJECT = eINSTANCE.getState__EvalState__Object();

		/**
		 * The meta object literal for the '<em><b>Exit State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___EXIT_STATE__OBJECT = eINSTANCE.getState__ExitState__Object();

		/**
		 * The meta object literal for the '{@link StateMachineModuleProv.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModuleProv.impl.TransitionImpl
		 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getTransition()
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
		 * The meta object literal for the '<em><b>Eval Transition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___EVAL_TRANSITION__OBJECT = eINSTANCE.getTransition__EvalTransition__Object();

		/**
		 * The meta object literal for the '<em><b>Valid Guard</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___VALID_GUARD__OBJECT = eINSTANCE.getTransition__ValidGuard__Object();

		/**
		 * The meta object literal for the '<em><b>Already Fired</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___ALREADY_FIRED__OBJECT = eINSTANCE.getTransition__AlreadyFired__Object();

		/**
		 * The meta object literal for the '<em><b>Reset Fired</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___RESET_FIRED = eINSTANCE.getTransition__ResetFired();

		/**
		 * The meta object literal for the '<em><b>Fired</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___FIRED = eINSTANCE.getTransition__Fired();

		/**
		 * The meta object literal for the '<em><b>Fired</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___FIRED__BOOLEAN = eINSTANCE.getTransition__Fired__boolean();

		/**
		 * The meta object literal for the '{@link StateMachineModuleProv.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModuleProv.impl.TriggerImpl
		 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getTrigger()
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
		 * The meta object literal for the '<em><b>Eval Trigger</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRIGGER___EVAL_TRIGGER__OBJECT = eINSTANCE.getTrigger__EvalTrigger__Object();

		/**
		 * The meta object literal for the '{@link StateMachineModuleProv.impl.PseudostateImpl <em>Pseudostate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModuleProv.impl.PseudostateImpl
		 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getPseudostate()
		 * @generated
		 */
		EClass PSEUDOSTATE = eINSTANCE.getPseudostate();

		/**
		 * The meta object literal for the '{@link StateMachineModuleProv.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModuleProv.impl.InitialStateImpl
		 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link StateMachineModuleProv.impl.ForkImpl <em>Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModuleProv.impl.ForkImpl
		 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getFork()
		 * @generated
		 */
		EClass FORK = eINSTANCE.getFork();

		/**
		 * The meta object literal for the '{@link StateMachineModuleProv.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModuleProv.impl.JoinImpl
		 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '{@link StateMachineModuleProv.impl.ShallowHistoryImpl <em>Shallow History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModuleProv.impl.ShallowHistoryImpl
		 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getShallowHistory()
		 * @generated
		 */
		EClass SHALLOW_HISTORY = eINSTANCE.getShallowHistory();

		/**
		 * The meta object literal for the '{@link StateMachineModuleProv.impl.JunctionImpl <em>Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModuleProv.impl.JunctionImpl
		 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getJunction()
		 * @generated
		 */
		EClass JUNCTION = eINSTANCE.getJunction();

		/**
		 * The meta object literal for the '{@link StateMachineModuleProv.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModuleProv.impl.FinalStateImpl
		 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '<em><b>Exit State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FINAL_STATE___EXIT_STATE__OBJECT = eINSTANCE.getFinalState__ExitState__Object();

		/**
		 * The meta object literal for the '<em><b>Super exit State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FINAL_STATE___SUPER_EXIT_STATE__OBJECT = eINSTANCE.getFinalState__Super_exitState__Object();

		/**
		 * The meta object literal for the '{@link StateMachineModuleProv.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModuleProv.impl.ConstraintImpl
		 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Eval Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTRAINT___EVAL_CONSTRAINT__OBJECT = eINSTANCE.getConstraint__EvalConstraint__Object();

		/**
		 * The meta object literal for the '{@link StateMachineModuleProv.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModuleProv.impl.StatementImpl
		 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Eval</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATEMENT___EVAL__OBJECT = eINSTANCE.getStatement__Eval__Object();

		/**
		 * The meta object literal for the '{@link StateMachineModuleProv.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModuleProv.impl.ProgramImpl
		 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getProgram()
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
		 * The meta object literal for the '<em><b>Eval</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROGRAM___EVAL__OBJECT = eINSTANCE.getProgram__Eval__Object();

		/**
		 * The meta object literal for the '{@link StateMachineModuleProv.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachineModuleProv.impl.NamedElementImpl
		 * @see StateMachineModuleProv.impl.StateMachineModuleProvPackageImpl#getNamedElement()
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

	}

} //StateMachineModuleProvPackage

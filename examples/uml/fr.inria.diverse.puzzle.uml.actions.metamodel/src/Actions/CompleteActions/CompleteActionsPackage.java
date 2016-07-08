/**
 */
package Actions.CompleteActions;

import Actions.BasicActions.BasicActionsPackage;

import Actions.IntermediateActions.IntermediateActionsPackage;

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
 * @see Actions.CompleteActions.CompleteActionsFactory
 * @model kind="package"
 * @generated
 */
public interface CompleteActionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CompleteActions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.puzzle.uml/Actions/CompleteActions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CompleteActions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompleteActionsPackage eINSTANCE = Actions.CompleteActions.impl.CompleteActionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Actions.CompleteActions.impl.ReplyActionImpl <em>Reply Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.CompleteActions.impl.ReplyActionImpl
	 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReplyAction()
	 * @generated
	 */
	int REPLY_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__RETURN_INFORMATION = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reply Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__REPLY_VALUE = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reply To Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__REPLY_TO_CALL = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reply Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reply Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION_OPERATION_COUNT = BasicActionsPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.CompleteActions.impl.UnmarshallActionImpl <em>Unmarshall Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.CompleteActions.impl.UnmarshallActionImpl
	 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getUnmarshallAction()
	 * @generated
	 */
	int UNMARSHALL_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__OBJECT = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unmarshall Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__UNMARSHALL_TYPE = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__RESULT = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Unmarshall Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Unmarshall Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION_OPERATION_COUNT = BasicActionsPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.CompleteActions.impl.AcceptEventActionImpl <em>Accept Event Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.CompleteActions.impl.AcceptEventActionImpl
	 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getAcceptEventAction()
	 * @generated
	 */
	int ACCEPT_EVENT_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Unmarshall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__IS_UNMARSHALL = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__RESULT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__TRIGGER = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Accept Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Accept Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_OPERATION_COUNT = BasicActionsPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.CompleteActions.impl.AcceptCallActionImpl <em>Accept Call Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.CompleteActions.impl.AcceptCallActionImpl
	 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getAcceptCallAction()
	 * @generated
	 */
	int ACCEPT_CALL_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__CONTEXT = ACCEPT_EVENT_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__INPUT = ACCEPT_EVENT_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__OUTPUT = ACCEPT_EVENT_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Unmarshall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__IS_UNMARSHALL = ACCEPT_EVENT_ACTION__IS_UNMARSHALL;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__RESULT = ACCEPT_EVENT_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__TRIGGER = ACCEPT_EVENT_ACTION__TRIGGER;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__RETURN_INFORMATION = ACCEPT_EVENT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Accept Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION_FEATURE_COUNT = ACCEPT_EVENT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Accept Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION_OPERATION_COUNT = ACCEPT_EVENT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.CompleteActions.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.CompleteActions.impl.TriggerImpl
	 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 4;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Actions.CompleteActions.impl.ReadExtendActionImpl <em>Read Extend Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.CompleteActions.impl.ReadExtendActionImpl
	 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReadExtendAction()
	 * @generated
	 */
	int READ_EXTEND_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTEND_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTEND_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTEND_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTEND_ACTION__RESULT = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTEND_ACTION__CLASSIFIER = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Read Extend Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTEND_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Read Extend Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTEND_ACTION_OPERATION_COUNT = BasicActionsPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.CompleteActions.impl.ReclassifyObjectActionImpl <em>Reclassify Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.CompleteActions.impl.ReclassifyObjectActionImpl
	 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReclassifyObjectAction()
	 * @generated
	 */
	int RECLASSIFY_OBJECT_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Replace All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__OBJECT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Old Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER = BasicActionsPackage.ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reclassify Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Reclassify Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION_OPERATION_COUNT = BasicActionsPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.CompleteActions.impl.ReadlsClassifiedObjectActionImpl <em>Readls Classified Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.CompleteActions.impl.ReadlsClassifiedObjectActionImpl
	 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReadlsClassifiedObjectAction()
	 * @generated
	 */
	int READLS_CLASSIFIED_OBJECT_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READLS_CLASSIFIED_OBJECT_ACTION__RESULT = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READLS_CLASSIFIED_OBJECT_ACTION__OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Readls Classified Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READLS_CLASSIFIED_OBJECT_ACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Readls Classified Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READLS_CLASSIFIED_OBJECT_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Actions.CompleteActions.impl.StartClassifierBehaviorActionImpl <em>Start Classifier Behavior Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.CompleteActions.impl.StartClassifierBehaviorActionImpl
	 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getStartClassifierBehaviorAction()
	 * @generated
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__OBJECT = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start Classifier Behavior Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Start Classifier Behavior Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION_OPERATION_COUNT = BasicActionsPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.CompleteActions.impl.StartObjectBehaviorActionImpl <em>Start Object Behavior Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.CompleteActions.impl.StartObjectBehaviorActionImpl
	 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getStartObjectBehaviorAction()
	 * @generated
	 */
	int START_OBJECT_BEHAVIOR_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__CONTEXT = BasicActionsPackage.CALL_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__INPUT = BasicActionsPackage.CALL_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__OUTPUT = BasicActionsPackage.CALL_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__ARGUMENT = BasicActionsPackage.CALL_ACTION__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Is Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__IS_SYNCHRONOUS = BasicActionsPackage.CALL_ACTION__IS_SYNCHRONOUS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__RESULT = BasicActionsPackage.CALL_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__OBJECT = BasicActionsPackage.CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start Object Behavior Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION_FEATURE_COUNT = BasicActionsPackage.CALL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Start Object Behavior Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION_OPERATION_COUNT = BasicActionsPackage.CALL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.CompleteActions.impl.QualifierValueImpl <em>Qualifier Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.CompleteActions.impl.QualifierValueImpl
	 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getQualifierValue()
	 * @generated
	 */
	int QUALIFIER_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_VALUE__QUALIFIER = IntermediateActionsPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_VALUE__VALUE = IntermediateActionsPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qualifier Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_VALUE_FEATURE_COUNT = IntermediateActionsPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Qualifier Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_VALUE_OPERATION_COUNT = IntermediateActionsPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.CompleteActions.impl.ReadLinkObjectEndActionImpl <em>Read Link Object End Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.CompleteActions.impl.ReadLinkObjectEndActionImpl
	 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReadLinkObjectEndAction()
	 * @generated
	 */
	int READ_LINK_OBJECT_END_ACTION = 11;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__END = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__OBJECT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__RESULT = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Read Link Object End Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Read Link Object End Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION_OPERATION_COUNT = BasicActionsPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.CompleteActions.impl.ReadLinkObjectEndQualifierActionImpl <em>Read Link Object End Qualifier Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.CompleteActions.impl.ReadLinkObjectEndQualifierActionImpl
	 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReadLinkObjectEndQualifierAction()
	 * @generated
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Read Link Object End Qualifier Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Read Link Object End Qualifier Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION_OPERATION_COUNT = BasicActionsPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.CompleteActions.impl.CreateLinkObjectActionImpl <em>Create Link Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.CompleteActions.impl.CreateLinkObjectActionImpl
	 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getCreateLinkObjectAction()
	 * @generated
	 */
	int CREATE_LINK_OBJECT_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__CONTEXT = IntermediateActionsPackage.CREATE_LINK_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__INPUT = IntermediateActionsPackage.CREATE_LINK_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__OUTPUT = IntermediateActionsPackage.CREATE_LINK_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__INPUT_VALUE = IntermediateActionsPackage.CREATE_LINK_ACTION__INPUT_VALUE;

	/**
	 * The feature id for the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__END_DATA = IntermediateActionsPackage.CREATE_LINK_ACTION__END_DATA;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__RESULT = IntermediateActionsPackage.CREATE_LINK_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create Link Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION_FEATURE_COUNT = IntermediateActionsPackage.CREATE_LINK_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Create Link Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION_OPERATION_COUNT = IntermediateActionsPackage.CREATE_LINK_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.CompleteActions.impl.ReduceActionImpl <em>Reduce Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.CompleteActions.impl.ReduceActionImpl
	 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReduceAction()
	 * @generated
	 */
	int REDUCE_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__IS_ORDERED = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__RESULT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__COLLECTION = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reducer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__REDUCER = BasicActionsPackage.ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reduce Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Reduce Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION_OPERATION_COUNT = BasicActionsPackage.ACTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Actions.CompleteActions.ReplyAction <em>Reply Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reply Action</em>'.
	 * @see Actions.CompleteActions.ReplyAction
	 * @generated
	 */
	EClass getReplyAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.CompleteActions.ReplyAction#getReturnInformation <em>Return Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Information</em>'.
	 * @see Actions.CompleteActions.ReplyAction#getReturnInformation()
	 * @see #getReplyAction()
	 * @generated
	 */
	EReference getReplyAction_ReturnInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link Actions.CompleteActions.ReplyAction#getReplyValue <em>Reply Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reply Value</em>'.
	 * @see Actions.CompleteActions.ReplyAction#getReplyValue()
	 * @see #getReplyAction()
	 * @generated
	 */
	EReference getReplyAction_ReplyValue();

	/**
	 * Returns the meta object for the reference '{@link Actions.CompleteActions.ReplyAction#getReplyToCall <em>Reply To Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reply To Call</em>'.
	 * @see Actions.CompleteActions.ReplyAction#getReplyToCall()
	 * @see #getReplyAction()
	 * @generated
	 */
	EReference getReplyAction_ReplyToCall();

	/**
	 * Returns the meta object for class '{@link Actions.CompleteActions.UnmarshallAction <em>Unmarshall Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unmarshall Action</em>'.
	 * @see Actions.CompleteActions.UnmarshallAction
	 * @generated
	 */
	EClass getUnmarshallAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.CompleteActions.UnmarshallAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see Actions.CompleteActions.UnmarshallAction#getObject()
	 * @see #getUnmarshallAction()
	 * @generated
	 */
	EReference getUnmarshallAction_Object();

	/**
	 * Returns the meta object for the reference '{@link Actions.CompleteActions.UnmarshallAction#getUnmarshallType <em>Unmarshall Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unmarshall Type</em>'.
	 * @see Actions.CompleteActions.UnmarshallAction#getUnmarshallType()
	 * @see #getUnmarshallAction()
	 * @generated
	 */
	EReference getUnmarshallAction_UnmarshallType();

	/**
	 * Returns the meta object for the containment reference list '{@link Actions.CompleteActions.UnmarshallAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see Actions.CompleteActions.UnmarshallAction#getResult()
	 * @see #getUnmarshallAction()
	 * @generated
	 */
	EReference getUnmarshallAction_Result();

	/**
	 * Returns the meta object for class '{@link Actions.CompleteActions.AcceptEventAction <em>Accept Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Event Action</em>'.
	 * @see Actions.CompleteActions.AcceptEventAction
	 * @generated
	 */
	EClass getAcceptEventAction();

	/**
	 * Returns the meta object for the attribute '{@link Actions.CompleteActions.AcceptEventAction#isIsUnmarshall <em>Is Unmarshall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unmarshall</em>'.
	 * @see Actions.CompleteActions.AcceptEventAction#isIsUnmarshall()
	 * @see #getAcceptEventAction()
	 * @generated
	 */
	EAttribute getAcceptEventAction_IsUnmarshall();

	/**
	 * Returns the meta object for the containment reference list '{@link Actions.CompleteActions.AcceptEventAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see Actions.CompleteActions.AcceptEventAction#getResult()
	 * @see #getAcceptEventAction()
	 * @generated
	 */
	EReference getAcceptEventAction_Result();

	/**
	 * Returns the meta object for the containment reference list '{@link Actions.CompleteActions.AcceptEventAction#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see Actions.CompleteActions.AcceptEventAction#getTrigger()
	 * @see #getAcceptEventAction()
	 * @generated
	 */
	EReference getAcceptEventAction_Trigger();

	/**
	 * Returns the meta object for class '{@link Actions.CompleteActions.AcceptCallAction <em>Accept Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Call Action</em>'.
	 * @see Actions.CompleteActions.AcceptCallAction
	 * @generated
	 */
	EClass getAcceptCallAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.CompleteActions.AcceptCallAction#getReturnInformation <em>Return Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Information</em>'.
	 * @see Actions.CompleteActions.AcceptCallAction#getReturnInformation()
	 * @see #getAcceptCallAction()
	 * @generated
	 */
	EReference getAcceptCallAction_ReturnInformation();

	/**
	 * Returns the meta object for class '{@link Actions.CompleteActions.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see Actions.CompleteActions.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for class '{@link Actions.CompleteActions.ReadExtendAction <em>Read Extend Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Extend Action</em>'.
	 * @see Actions.CompleteActions.ReadExtendAction
	 * @generated
	 */
	EClass getReadExtendAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.CompleteActions.ReadExtendAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see Actions.CompleteActions.ReadExtendAction#getResult()
	 * @see #getReadExtendAction()
	 * @generated
	 */
	EReference getReadExtendAction_Result();

	/**
	 * Returns the meta object for the reference '{@link Actions.CompleteActions.ReadExtendAction#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see Actions.CompleteActions.ReadExtendAction#getClassifier()
	 * @see #getReadExtendAction()
	 * @generated
	 */
	EReference getReadExtendAction_Classifier();

	/**
	 * Returns the meta object for class '{@link Actions.CompleteActions.ReclassifyObjectAction <em>Reclassify Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reclassify Object Action</em>'.
	 * @see Actions.CompleteActions.ReclassifyObjectAction
	 * @generated
	 */
	EClass getReclassifyObjectAction();

	/**
	 * Returns the meta object for the attribute '{@link Actions.CompleteActions.ReclassifyObjectAction#isIsReplaceAll <em>Is Replace All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Replace All</em>'.
	 * @see Actions.CompleteActions.ReclassifyObjectAction#isIsReplaceAll()
	 * @see #getReclassifyObjectAction()
	 * @generated
	 */
	EAttribute getReclassifyObjectAction_IsReplaceAll();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.CompleteActions.ReclassifyObjectAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see Actions.CompleteActions.ReclassifyObjectAction#getObject()
	 * @see #getReclassifyObjectAction()
	 * @generated
	 */
	EReference getReclassifyObjectAction_Object();

	/**
	 * Returns the meta object for the reference list '{@link Actions.CompleteActions.ReclassifyObjectAction#getOldClassifier <em>Old Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Old Classifier</em>'.
	 * @see Actions.CompleteActions.ReclassifyObjectAction#getOldClassifier()
	 * @see #getReclassifyObjectAction()
	 * @generated
	 */
	EReference getReclassifyObjectAction_OldClassifier();

	/**
	 * Returns the meta object for the reference list '{@link Actions.CompleteActions.ReclassifyObjectAction#getNewClassifier <em>New Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>New Classifier</em>'.
	 * @see Actions.CompleteActions.ReclassifyObjectAction#getNewClassifier()
	 * @see #getReclassifyObjectAction()
	 * @generated
	 */
	EReference getReclassifyObjectAction_NewClassifier();

	/**
	 * Returns the meta object for class '{@link Actions.CompleteActions.ReadlsClassifiedObjectAction <em>Readls Classified Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Readls Classified Object Action</em>'.
	 * @see Actions.CompleteActions.ReadlsClassifiedObjectAction
	 * @generated
	 */
	EClass getReadlsClassifiedObjectAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.CompleteActions.ReadlsClassifiedObjectAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see Actions.CompleteActions.ReadlsClassifiedObjectAction#getResult()
	 * @see #getReadlsClassifiedObjectAction()
	 * @generated
	 */
	EReference getReadlsClassifiedObjectAction_Result();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.CompleteActions.ReadlsClassifiedObjectAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see Actions.CompleteActions.ReadlsClassifiedObjectAction#getObject()
	 * @see #getReadlsClassifiedObjectAction()
	 * @generated
	 */
	EReference getReadlsClassifiedObjectAction_Object();

	/**
	 * Returns the meta object for class '{@link Actions.CompleteActions.StartClassifierBehaviorAction <em>Start Classifier Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Classifier Behavior Action</em>'.
	 * @see Actions.CompleteActions.StartClassifierBehaviorAction
	 * @generated
	 */
	EClass getStartClassifierBehaviorAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.CompleteActions.StartClassifierBehaviorAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see Actions.CompleteActions.StartClassifierBehaviorAction#getObject()
	 * @see #getStartClassifierBehaviorAction()
	 * @generated
	 */
	EReference getStartClassifierBehaviorAction_Object();

	/**
	 * Returns the meta object for class '{@link Actions.CompleteActions.StartObjectBehaviorAction <em>Start Object Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Object Behavior Action</em>'.
	 * @see Actions.CompleteActions.StartObjectBehaviorAction
	 * @generated
	 */
	EClass getStartObjectBehaviorAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.CompleteActions.StartObjectBehaviorAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see Actions.CompleteActions.StartObjectBehaviorAction#getObject()
	 * @see #getStartObjectBehaviorAction()
	 * @generated
	 */
	EReference getStartObjectBehaviorAction_Object();

	/**
	 * Returns the meta object for class '{@link Actions.CompleteActions.QualifierValue <em>Qualifier Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualifier Value</em>'.
	 * @see Actions.CompleteActions.QualifierValue
	 * @generated
	 */
	EClass getQualifierValue();

	/**
	 * Returns the meta object for the reference '{@link Actions.CompleteActions.QualifierValue#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qualifier</em>'.
	 * @see Actions.CompleteActions.QualifierValue#getQualifier()
	 * @see #getQualifierValue()
	 * @generated
	 */
	EReference getQualifierValue_Qualifier();

	/**
	 * Returns the meta object for the reference '{@link Actions.CompleteActions.QualifierValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see Actions.CompleteActions.QualifierValue#getValue()
	 * @see #getQualifierValue()
	 * @generated
	 */
	EReference getQualifierValue_Value();

	/**
	 * Returns the meta object for class '{@link Actions.CompleteActions.ReadLinkObjectEndAction <em>Read Link Object End Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Link Object End Action</em>'.
	 * @see Actions.CompleteActions.ReadLinkObjectEndAction
	 * @generated
	 */
	EClass getReadLinkObjectEndAction();

	/**
	 * Returns the meta object for the reference '{@link Actions.CompleteActions.ReadLinkObjectEndAction#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see Actions.CompleteActions.ReadLinkObjectEndAction#getEnd()
	 * @see #getReadLinkObjectEndAction()
	 * @generated
	 */
	EReference getReadLinkObjectEndAction_End();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.CompleteActions.ReadLinkObjectEndAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see Actions.CompleteActions.ReadLinkObjectEndAction#getObject()
	 * @see #getReadLinkObjectEndAction()
	 * @generated
	 */
	EReference getReadLinkObjectEndAction_Object();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.CompleteActions.ReadLinkObjectEndAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see Actions.CompleteActions.ReadLinkObjectEndAction#getResult()
	 * @see #getReadLinkObjectEndAction()
	 * @generated
	 */
	EReference getReadLinkObjectEndAction_Result();

	/**
	 * Returns the meta object for class '{@link Actions.CompleteActions.ReadLinkObjectEndQualifierAction <em>Read Link Object End Qualifier Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Link Object End Qualifier Action</em>'.
	 * @see Actions.CompleteActions.ReadLinkObjectEndQualifierAction
	 * @generated
	 */
	EClass getReadLinkObjectEndQualifierAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.CompleteActions.ReadLinkObjectEndQualifierAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see Actions.CompleteActions.ReadLinkObjectEndQualifierAction#getObject()
	 * @see #getReadLinkObjectEndQualifierAction()
	 * @generated
	 */
	EReference getReadLinkObjectEndQualifierAction_Object();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.CompleteActions.ReadLinkObjectEndQualifierAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see Actions.CompleteActions.ReadLinkObjectEndQualifierAction#getResult()
	 * @see #getReadLinkObjectEndQualifierAction()
	 * @generated
	 */
	EReference getReadLinkObjectEndQualifierAction_Result();

	/**
	 * Returns the meta object for the reference '{@link Actions.CompleteActions.ReadLinkObjectEndQualifierAction#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qualifier</em>'.
	 * @see Actions.CompleteActions.ReadLinkObjectEndQualifierAction#getQualifier()
	 * @see #getReadLinkObjectEndQualifierAction()
	 * @generated
	 */
	EReference getReadLinkObjectEndQualifierAction_Qualifier();

	/**
	 * Returns the meta object for class '{@link Actions.CompleteActions.CreateLinkObjectAction <em>Create Link Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Link Object Action</em>'.
	 * @see Actions.CompleteActions.CreateLinkObjectAction
	 * @generated
	 */
	EClass getCreateLinkObjectAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.CompleteActions.CreateLinkObjectAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see Actions.CompleteActions.CreateLinkObjectAction#getResult()
	 * @see #getCreateLinkObjectAction()
	 * @generated
	 */
	EReference getCreateLinkObjectAction_Result();

	/**
	 * Returns the meta object for class '{@link Actions.CompleteActions.ReduceAction <em>Reduce Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduce Action</em>'.
	 * @see Actions.CompleteActions.ReduceAction
	 * @generated
	 */
	EClass getReduceAction();

	/**
	 * Returns the meta object for the attribute '{@link Actions.CompleteActions.ReduceAction#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see Actions.CompleteActions.ReduceAction#isIsOrdered()
	 * @see #getReduceAction()
	 * @generated
	 */
	EAttribute getReduceAction_IsOrdered();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.CompleteActions.ReduceAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see Actions.CompleteActions.ReduceAction#getResult()
	 * @see #getReduceAction()
	 * @generated
	 */
	EReference getReduceAction_Result();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.CompleteActions.ReduceAction#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection</em>'.
	 * @see Actions.CompleteActions.ReduceAction#getCollection()
	 * @see #getReduceAction()
	 * @generated
	 */
	EReference getReduceAction_Collection();

	/**
	 * Returns the meta object for the reference '{@link Actions.CompleteActions.ReduceAction#getReducer <em>Reducer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reducer</em>'.
	 * @see Actions.CompleteActions.ReduceAction#getReducer()
	 * @see #getReduceAction()
	 * @generated
	 */
	EReference getReduceAction_Reducer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompleteActionsFactory getCompleteActionsFactory();

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
		 * The meta object literal for the '{@link Actions.CompleteActions.impl.ReplyActionImpl <em>Reply Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.CompleteActions.impl.ReplyActionImpl
		 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReplyAction()
		 * @generated
		 */
		EClass REPLY_ACTION = eINSTANCE.getReplyAction();

		/**
		 * The meta object literal for the '<em><b>Return Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLY_ACTION__RETURN_INFORMATION = eINSTANCE.getReplyAction_ReturnInformation();

		/**
		 * The meta object literal for the '<em><b>Reply Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLY_ACTION__REPLY_VALUE = eINSTANCE.getReplyAction_ReplyValue();

		/**
		 * The meta object literal for the '<em><b>Reply To Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLY_ACTION__REPLY_TO_CALL = eINSTANCE.getReplyAction_ReplyToCall();

		/**
		 * The meta object literal for the '{@link Actions.CompleteActions.impl.UnmarshallActionImpl <em>Unmarshall Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.CompleteActions.impl.UnmarshallActionImpl
		 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getUnmarshallAction()
		 * @generated
		 */
		EClass UNMARSHALL_ACTION = eINSTANCE.getUnmarshallAction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNMARSHALL_ACTION__OBJECT = eINSTANCE.getUnmarshallAction_Object();

		/**
		 * The meta object literal for the '<em><b>Unmarshall Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNMARSHALL_ACTION__UNMARSHALL_TYPE = eINSTANCE.getUnmarshallAction_UnmarshallType();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNMARSHALL_ACTION__RESULT = eINSTANCE.getUnmarshallAction_Result();

		/**
		 * The meta object literal for the '{@link Actions.CompleteActions.impl.AcceptEventActionImpl <em>Accept Event Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.CompleteActions.impl.AcceptEventActionImpl
		 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getAcceptEventAction()
		 * @generated
		 */
		EClass ACCEPT_EVENT_ACTION = eINSTANCE.getAcceptEventAction();

		/**
		 * The meta object literal for the '<em><b>Is Unmarshall</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPT_EVENT_ACTION__IS_UNMARSHALL = eINSTANCE.getAcceptEventAction_IsUnmarshall();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_EVENT_ACTION__RESULT = eINSTANCE.getAcceptEventAction_Result();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_EVENT_ACTION__TRIGGER = eINSTANCE.getAcceptEventAction_Trigger();

		/**
		 * The meta object literal for the '{@link Actions.CompleteActions.impl.AcceptCallActionImpl <em>Accept Call Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.CompleteActions.impl.AcceptCallActionImpl
		 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getAcceptCallAction()
		 * @generated
		 */
		EClass ACCEPT_CALL_ACTION = eINSTANCE.getAcceptCallAction();

		/**
		 * The meta object literal for the '<em><b>Return Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_CALL_ACTION__RETURN_INFORMATION = eINSTANCE.getAcceptCallAction_ReturnInformation();

		/**
		 * The meta object literal for the '{@link Actions.CompleteActions.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.CompleteActions.impl.TriggerImpl
		 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '{@link Actions.CompleteActions.impl.ReadExtendActionImpl <em>Read Extend Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.CompleteActions.impl.ReadExtendActionImpl
		 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReadExtendAction()
		 * @generated
		 */
		EClass READ_EXTEND_ACTION = eINSTANCE.getReadExtendAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_EXTEND_ACTION__RESULT = eINSTANCE.getReadExtendAction_Result();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_EXTEND_ACTION__CLASSIFIER = eINSTANCE.getReadExtendAction_Classifier();

		/**
		 * The meta object literal for the '{@link Actions.CompleteActions.impl.ReclassifyObjectActionImpl <em>Reclassify Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.CompleteActions.impl.ReclassifyObjectActionImpl
		 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReclassifyObjectAction()
		 * @generated
		 */
		EClass RECLASSIFY_OBJECT_ACTION = eINSTANCE.getReclassifyObjectAction();

		/**
		 * The meta object literal for the '<em><b>Is Replace All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL = eINSTANCE.getReclassifyObjectAction_IsReplaceAll();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECLASSIFY_OBJECT_ACTION__OBJECT = eINSTANCE.getReclassifyObjectAction_Object();

		/**
		 * The meta object literal for the '<em><b>Old Classifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER = eINSTANCE.getReclassifyObjectAction_OldClassifier();

		/**
		 * The meta object literal for the '<em><b>New Classifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER = eINSTANCE.getReclassifyObjectAction_NewClassifier();

		/**
		 * The meta object literal for the '{@link Actions.CompleteActions.impl.ReadlsClassifiedObjectActionImpl <em>Readls Classified Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.CompleteActions.impl.ReadlsClassifiedObjectActionImpl
		 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReadlsClassifiedObjectAction()
		 * @generated
		 */
		EClass READLS_CLASSIFIED_OBJECT_ACTION = eINSTANCE.getReadlsClassifiedObjectAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READLS_CLASSIFIED_OBJECT_ACTION__RESULT = eINSTANCE.getReadlsClassifiedObjectAction_Result();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READLS_CLASSIFIED_OBJECT_ACTION__OBJECT = eINSTANCE.getReadlsClassifiedObjectAction_Object();

		/**
		 * The meta object literal for the '{@link Actions.CompleteActions.impl.StartClassifierBehaviorActionImpl <em>Start Classifier Behavior Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.CompleteActions.impl.StartClassifierBehaviorActionImpl
		 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getStartClassifierBehaviorAction()
		 * @generated
		 */
		EClass START_CLASSIFIER_BEHAVIOR_ACTION = eINSTANCE.getStartClassifierBehaviorAction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_CLASSIFIER_BEHAVIOR_ACTION__OBJECT = eINSTANCE.getStartClassifierBehaviorAction_Object();

		/**
		 * The meta object literal for the '{@link Actions.CompleteActions.impl.StartObjectBehaviorActionImpl <em>Start Object Behavior Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.CompleteActions.impl.StartObjectBehaviorActionImpl
		 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getStartObjectBehaviorAction()
		 * @generated
		 */
		EClass START_OBJECT_BEHAVIOR_ACTION = eINSTANCE.getStartObjectBehaviorAction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_OBJECT_BEHAVIOR_ACTION__OBJECT = eINSTANCE.getStartObjectBehaviorAction_Object();

		/**
		 * The meta object literal for the '{@link Actions.CompleteActions.impl.QualifierValueImpl <em>Qualifier Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.CompleteActions.impl.QualifierValueImpl
		 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getQualifierValue()
		 * @generated
		 */
		EClass QUALIFIER_VALUE = eINSTANCE.getQualifierValue();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIER_VALUE__QUALIFIER = eINSTANCE.getQualifierValue_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIER_VALUE__VALUE = eINSTANCE.getQualifierValue_Value();

		/**
		 * The meta object literal for the '{@link Actions.CompleteActions.impl.ReadLinkObjectEndActionImpl <em>Read Link Object End Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.CompleteActions.impl.ReadLinkObjectEndActionImpl
		 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReadLinkObjectEndAction()
		 * @generated
		 */
		EClass READ_LINK_OBJECT_END_ACTION = eINSTANCE.getReadLinkObjectEndAction();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_LINK_OBJECT_END_ACTION__END = eINSTANCE.getReadLinkObjectEndAction_End();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_LINK_OBJECT_END_ACTION__OBJECT = eINSTANCE.getReadLinkObjectEndAction_Object();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_LINK_OBJECT_END_ACTION__RESULT = eINSTANCE.getReadLinkObjectEndAction_Result();

		/**
		 * The meta object literal for the '{@link Actions.CompleteActions.impl.ReadLinkObjectEndQualifierActionImpl <em>Read Link Object End Qualifier Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.CompleteActions.impl.ReadLinkObjectEndQualifierActionImpl
		 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReadLinkObjectEndQualifierAction()
		 * @generated
		 */
		EClass READ_LINK_OBJECT_END_QUALIFIER_ACTION = eINSTANCE.getReadLinkObjectEndQualifierAction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT = eINSTANCE.getReadLinkObjectEndQualifierAction_Object();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT = eINSTANCE.getReadLinkObjectEndQualifierAction_Result();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER = eINSTANCE.getReadLinkObjectEndQualifierAction_Qualifier();

		/**
		 * The meta object literal for the '{@link Actions.CompleteActions.impl.CreateLinkObjectActionImpl <em>Create Link Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.CompleteActions.impl.CreateLinkObjectActionImpl
		 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getCreateLinkObjectAction()
		 * @generated
		 */
		EClass CREATE_LINK_OBJECT_ACTION = eINSTANCE.getCreateLinkObjectAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_LINK_OBJECT_ACTION__RESULT = eINSTANCE.getCreateLinkObjectAction_Result();

		/**
		 * The meta object literal for the '{@link Actions.CompleteActions.impl.ReduceActionImpl <em>Reduce Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.CompleteActions.impl.ReduceActionImpl
		 * @see Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReduceAction()
		 * @generated
		 */
		EClass REDUCE_ACTION = eINSTANCE.getReduceAction();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCE_ACTION__IS_ORDERED = eINSTANCE.getReduceAction_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCE_ACTION__RESULT = eINSTANCE.getReduceAction_Result();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCE_ACTION__COLLECTION = eINSTANCE.getReduceAction_Collection();

		/**
		 * The meta object literal for the '<em><b>Reducer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCE_ACTION__REDUCER = eINSTANCE.getReduceAction_Reducer();

	}

} //CompleteActionsPackage

/**
 */
package Actions.IntermediateActions;

import Actions.BasicActions.BasicActionsPackage;

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
 * @see Actions.IntermediateActions.IntermediateActionsFactory
 * @model kind="package"
 * @generated
 */
public interface IntermediateActionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IntermediateActions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.puzzle.uml/Actions/IntermediateActions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IntermediateActions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermediateActionsPackage eINSTANCE = Actions.IntermediateActions.impl.IntermediateActionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.BroadcastSignalActionImpl <em>Broadcast Signal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.BroadcastSignalActionImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getBroadcastSignalAction()
	 * @generated
	 */
	int BROADCAST_SIGNAL_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__CONTEXT = BasicActionsPackage.INVOCATION_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__INPUT = BasicActionsPackage.INVOCATION_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__OUTPUT = BasicActionsPackage.INVOCATION_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__ARGUMENT = BasicActionsPackage.INVOCATION_ACTION__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__SIGNAL = BasicActionsPackage.INVOCATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Broadcast Signal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION_FEATURE_COUNT = BasicActionsPackage.INVOCATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Broadcast Signal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION_OPERATION_COUNT = BasicActionsPackage.INVOCATION_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.SendObjectActionImpl <em>Send Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.SendObjectActionImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getSendObjectAction()
	 * @generated
	 */
	int SEND_OBJECT_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__CONTEXT = BasicActionsPackage.INVOCATION_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__INPUT = BasicActionsPackage.INVOCATION_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__OUTPUT = BasicActionsPackage.INVOCATION_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__ARGUMENT = BasicActionsPackage.INVOCATION_ACTION__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__TARGET = BasicActionsPackage.INVOCATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__REQUEST = BasicActionsPackage.INVOCATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Send Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION_FEATURE_COUNT = BasicActionsPackage.INVOCATION_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Send Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION_OPERATION_COUNT = BasicActionsPackage.INVOCATION_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.CreateObjectActionImpl <em>Create Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.CreateObjectActionImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getCreateObjectAction()
	 * @generated
	 */
	int CREATE_OBJECT_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__CLASSIFIER = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__RESULT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Create Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_OPERATION_COUNT = BasicActionsPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.DestroyObjectActionImpl <em>Destroy Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.DestroyObjectActionImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getDestroyObjectAction()
	 * @generated
	 */
	int DESTROY_OBJECT_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__TARGET = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Destroy Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Destroy Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION_OPERATION_COUNT = BasicActionsPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.TestIdentityActionImpl <em>Test Identity Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.TestIdentityActionImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getTestIdentityAction()
	 * @generated
	 */
	int TEST_IDENTITY_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__RESULT = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__FIRST = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__SECOND = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Test Identity Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Test Identity Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION_OPERATION_COUNT = BasicActionsPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.ReadSelfActionImpl <em>Read Self Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.ReadSelfActionImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getReadSelfAction()
	 * @generated
	 */
	int READ_SELF_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__RESULT = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Read Self Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Read Self Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION_OPERATION_COUNT = BasicActionsPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.ValueSpecificationActionImpl <em>Value Specification Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.ValueSpecificationActionImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getValueSpecificationAction()
	 * @generated
	 */
	int VALUE_SPECIFICATION_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__RESULT = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__VALUE = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Specification Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value Specification Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_OPERATION_COUNT = BasicActionsPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.StructuralFeatureActionImpl <em>Structural Feature Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.StructuralFeatureActionImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getStructuralFeatureAction()
	 * @generated
	 */
	int STRUCTURAL_FEATURE_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__OBJECT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_OPERATION_COUNT = BasicActionsPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.StructuralFeatureImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getStructuralFeature()
	 * @generated
	 */
	int STRUCTURAL_FEATURE = 8;

	/**
	 * The number of structural features of the '<em>Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.ReadStructuralFeatureActionImpl <em>Read Structural Feature Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.ReadStructuralFeatureActionImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getReadStructuralFeatureAction()
	 * @generated
	 */
	int READ_STRUCTURAL_FEATURE_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__CONTEXT = STRUCTURAL_FEATURE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__INPUT = STRUCTURAL_FEATURE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__OUTPUT = STRUCTURAL_FEATURE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE = STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__OBJECT = STRUCTURAL_FEATURE_ACTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__RESULT = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Read Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Read Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_OPERATION_COUNT = STRUCTURAL_FEATURE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.WriteStructuralFeatureActionImpl <em>Write Structural Feature Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.WriteStructuralFeatureActionImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getWriteStructuralFeatureAction()
	 * @generated
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__CONTEXT = STRUCTURAL_FEATURE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__INPUT = STRUCTURAL_FEATURE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__OUTPUT = STRUCTURAL_FEATURE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE = STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__OBJECT = STRUCTURAL_FEATURE_ACTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__VALUE = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__RESULT = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Write Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Write Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_OPERATION_COUNT = STRUCTURAL_FEATURE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.AddStructuralFeatureValueActionImpl <em>Add Structural Feature Value Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.AddStructuralFeatureValueActionImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getAddStructuralFeatureValueAction()
	 * @generated
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION = 11;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__CONTEXT = WRITE_STRUCTURAL_FEATURE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT = WRITE_STRUCTURAL_FEATURE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTPUT = WRITE_STRUCTURAL_FEATURE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__STRUCTURAL_FEATURE = WRITE_STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT = WRITE_STRUCTURAL_FEATURE_ACTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE = WRITE_STRUCTURAL_FEATURE_ACTION__VALUE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__RESULT = WRITE_STRUCTURAL_FEATURE_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Insert At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT = WRITE_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Structural Feature Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_FEATURE_COUNT = WRITE_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Add Structural Feature Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_OPERATION_COUNT = WRITE_STRUCTURAL_FEATURE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.RemoveStructuralFeatureValueActionImpl <em>Remove Structural Feature Value Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.RemoveStructuralFeatureValueActionImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getRemoveStructuralFeatureValueAction()
	 * @generated
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__CONTEXT = WRITE_STRUCTURAL_FEATURE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT = WRITE_STRUCTURAL_FEATURE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OUTPUT = WRITE_STRUCTURAL_FEATURE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__STRUCTURAL_FEATURE = WRITE_STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT = WRITE_STRUCTURAL_FEATURE_ACTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE = WRITE_STRUCTURAL_FEATURE_ACTION__VALUE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__RESULT = WRITE_STRUCTURAL_FEATURE_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Remove At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT = WRITE_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Structural Feature Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION_FEATURE_COUNT = WRITE_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remove Structural Feature Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION_OPERATION_COUNT = WRITE_STRUCTURAL_FEATURE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.ClearStructuralFeatureActionImpl <em>Clear Structural Feature Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.ClearStructuralFeatureActionImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getClearStructuralFeatureAction()
	 * @generated
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__CONTEXT = STRUCTURAL_FEATURE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__INPUT = STRUCTURAL_FEATURE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__OUTPUT = STRUCTURAL_FEATURE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE = STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__OBJECT = STRUCTURAL_FEATURE_ACTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__RESULT = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clear Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clear Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION_OPERATION_COUNT = STRUCTURAL_FEATURE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.LinkActionImpl <em>Link Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.LinkActionImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getLinkAction()
	 * @generated
	 */
	int LINK_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__INPUT_VALUE = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__END_DATA = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_OPERATION_COUNT = BasicActionsPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.ElementImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 21;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.LinkEndDataImpl <em>Link End Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.LinkEndDataImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getLinkEndData()
	 * @generated
	 */
	int LINK_END_DATA = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA__END = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA__QUALIFIER = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link End Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Link End Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.PropertyImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 16;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.ReadLinkActionImpl <em>Read Link Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.ReadLinkActionImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getReadLinkAction()
	 * @generated
	 */
	int READ_LINK_ACTION = 17;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__CONTEXT = LINK_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__INPUT = LINK_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__OUTPUT = LINK_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__INPUT_VALUE = LINK_ACTION__INPUT_VALUE;

	/**
	 * The feature id for the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__END_DATA = LINK_ACTION__END_DATA;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__RESULT = LINK_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Read Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION_FEATURE_COUNT = LINK_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Read Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION_OPERATION_COUNT = LINK_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.WriteLinkActionImpl <em>Write Link Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.WriteLinkActionImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getWriteLinkAction()
	 * @generated
	 */
	int WRITE_LINK_ACTION = 18;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__CONTEXT = LINK_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__INPUT = LINK_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__OUTPUT = LINK_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__INPUT_VALUE = LINK_ACTION__INPUT_VALUE;

	/**
	 * The feature id for the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__END_DATA = LINK_ACTION__END_DATA;

	/**
	 * The number of structural features of the '<em>Write Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION_FEATURE_COUNT = LINK_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Write Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION_OPERATION_COUNT = LINK_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.CreateLinkActionImpl <em>Create Link Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.CreateLinkActionImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getCreateLinkAction()
	 * @generated
	 */
	int CREATE_LINK_ACTION = 19;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__CONTEXT = WRITE_LINK_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__INPUT = WRITE_LINK_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__OUTPUT = WRITE_LINK_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__INPUT_VALUE = WRITE_LINK_ACTION__INPUT_VALUE;

	/**
	 * The feature id for the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__END_DATA = WRITE_LINK_ACTION__END_DATA;

	/**
	 * The number of structural features of the '<em>Create Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION_FEATURE_COUNT = WRITE_LINK_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION_OPERATION_COUNT = WRITE_LINK_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.LinkEndCreationDataImpl <em>Link End Creation Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.LinkEndCreationDataImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getLinkEndCreationData()
	 * @generated
	 */
	int LINK_END_CREATION_DATA = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__VALUE = LINK_END_DATA__VALUE;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__END = LINK_END_DATA__END;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__QUALIFIER = LINK_END_DATA__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Is Replace All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__IS_REPLACE_ALL = LINK_END_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Insert At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__INSERT_AT = LINK_END_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link End Creation Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA_FEATURE_COUNT = LINK_END_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Link End Creation Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA_OPERATION_COUNT = LINK_END_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.DestroyLinkActionImpl <em>Destroy Link Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.DestroyLinkActionImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getDestroyLinkAction()
	 * @generated
	 */
	int DESTROY_LINK_ACTION = 22;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__CONTEXT = WRITE_LINK_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__INPUT = WRITE_LINK_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__OUTPUT = WRITE_LINK_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__INPUT_VALUE = WRITE_LINK_ACTION__INPUT_VALUE;

	/**
	 * The feature id for the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__END_DATA = WRITE_LINK_ACTION__END_DATA;

	/**
	 * The number of structural features of the '<em>Destroy Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION_FEATURE_COUNT = WRITE_LINK_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Destroy Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION_OPERATION_COUNT = WRITE_LINK_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.IntermediateActions.impl.LinkEndDestructionDataImpl <em>Link End Destruction Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.IntermediateActions.impl.LinkEndDestructionDataImpl
	 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getLinkEndDestructionData()
	 * @generated
	 */
	int LINK_END_DESTRUCTION_DATA = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__VALUE = LINK_END_DATA__VALUE;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__END = LINK_END_DATA__END;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__QUALIFIER = LINK_END_DATA__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Is Destroy Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES = LINK_END_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destroy At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__DESTROY_AT = LINK_END_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link End Destruction Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA_FEATURE_COUNT = LINK_END_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Link End Destruction Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA_OPERATION_COUNT = LINK_END_DATA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.BroadcastSignalAction <em>Broadcast Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Broadcast Signal Action</em>'.
	 * @see Actions.IntermediateActions.BroadcastSignalAction
	 * @generated
	 */
	EClass getBroadcastSignalAction();

	/**
	 * Returns the meta object for the reference '{@link Actions.IntermediateActions.BroadcastSignalAction#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see Actions.IntermediateActions.BroadcastSignalAction#getSignal()
	 * @see #getBroadcastSignalAction()
	 * @generated
	 */
	EReference getBroadcastSignalAction_Signal();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.SendObjectAction <em>Send Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Object Action</em>'.
	 * @see Actions.IntermediateActions.SendObjectAction
	 * @generated
	 */
	EClass getSendObjectAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.SendObjectAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see Actions.IntermediateActions.SendObjectAction#getTarget()
	 * @see #getSendObjectAction()
	 * @generated
	 */
	EReference getSendObjectAction_Target();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.SendObjectAction#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see Actions.IntermediateActions.SendObjectAction#getRequest()
	 * @see #getSendObjectAction()
	 * @generated
	 */
	EReference getSendObjectAction_Request();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.CreateObjectAction <em>Create Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Object Action</em>'.
	 * @see Actions.IntermediateActions.CreateObjectAction
	 * @generated
	 */
	EClass getCreateObjectAction();

	/**
	 * Returns the meta object for the reference '{@link Actions.IntermediateActions.CreateObjectAction#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see Actions.IntermediateActions.CreateObjectAction#getClassifier()
	 * @see #getCreateObjectAction()
	 * @generated
	 */
	EReference getCreateObjectAction_Classifier();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.CreateObjectAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see Actions.IntermediateActions.CreateObjectAction#getResult()
	 * @see #getCreateObjectAction()
	 * @generated
	 */
	EReference getCreateObjectAction_Result();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.DestroyObjectAction <em>Destroy Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destroy Object Action</em>'.
	 * @see Actions.IntermediateActions.DestroyObjectAction
	 * @generated
	 */
	EClass getDestroyObjectAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.DestroyObjectAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see Actions.IntermediateActions.DestroyObjectAction#getTarget()
	 * @see #getDestroyObjectAction()
	 * @generated
	 */
	EReference getDestroyObjectAction_Target();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.TestIdentityAction <em>Test Identity Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Identity Action</em>'.
	 * @see Actions.IntermediateActions.TestIdentityAction
	 * @generated
	 */
	EClass getTestIdentityAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.TestIdentityAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see Actions.IntermediateActions.TestIdentityAction#getResult()
	 * @see #getTestIdentityAction()
	 * @generated
	 */
	EReference getTestIdentityAction_Result();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.TestIdentityAction#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see Actions.IntermediateActions.TestIdentityAction#getFirst()
	 * @see #getTestIdentityAction()
	 * @generated
	 */
	EReference getTestIdentityAction_First();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.TestIdentityAction#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second</em>'.
	 * @see Actions.IntermediateActions.TestIdentityAction#getSecond()
	 * @see #getTestIdentityAction()
	 * @generated
	 */
	EReference getTestIdentityAction_Second();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.ReadSelfAction <em>Read Self Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Self Action</em>'.
	 * @see Actions.IntermediateActions.ReadSelfAction
	 * @generated
	 */
	EClass getReadSelfAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.ReadSelfAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see Actions.IntermediateActions.ReadSelfAction#getResult()
	 * @see #getReadSelfAction()
	 * @generated
	 */
	EReference getReadSelfAction_Result();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.ValueSpecificationAction <em>Value Specification Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification Action</em>'.
	 * @see Actions.IntermediateActions.ValueSpecificationAction
	 * @generated
	 */
	EClass getValueSpecificationAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.ValueSpecificationAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see Actions.IntermediateActions.ValueSpecificationAction#getResult()
	 * @see #getValueSpecificationAction()
	 * @generated
	 */
	EReference getValueSpecificationAction_Result();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.ValueSpecificationAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see Actions.IntermediateActions.ValueSpecificationAction#getValue()
	 * @see #getValueSpecificationAction()
	 * @generated
	 */
	EReference getValueSpecificationAction_Value();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.StructuralFeatureAction <em>Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Feature Action</em>'.
	 * @see Actions.IntermediateActions.StructuralFeatureAction
	 * @generated
	 */
	EClass getStructuralFeatureAction();

	/**
	 * Returns the meta object for the reference '{@link Actions.IntermediateActions.StructuralFeatureAction#getStructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structural Feature</em>'.
	 * @see Actions.IntermediateActions.StructuralFeatureAction#getStructuralFeature()
	 * @see #getStructuralFeatureAction()
	 * @generated
	 */
	EReference getStructuralFeatureAction_StructuralFeature();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.StructuralFeatureAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see Actions.IntermediateActions.StructuralFeatureAction#getObject()
	 * @see #getStructuralFeatureAction()
	 * @generated
	 */
	EReference getStructuralFeatureAction_Object();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Feature</em>'.
	 * @see Actions.IntermediateActions.StructuralFeature
	 * @generated
	 */
	EClass getStructuralFeature();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.ReadStructuralFeatureAction <em>Read Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Structural Feature Action</em>'.
	 * @see Actions.IntermediateActions.ReadStructuralFeatureAction
	 * @generated
	 */
	EClass getReadStructuralFeatureAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.ReadStructuralFeatureAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see Actions.IntermediateActions.ReadStructuralFeatureAction#getResult()
	 * @see #getReadStructuralFeatureAction()
	 * @generated
	 */
	EReference getReadStructuralFeatureAction_Result();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.WriteStructuralFeatureAction <em>Write Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Structural Feature Action</em>'.
	 * @see Actions.IntermediateActions.WriteStructuralFeatureAction
	 * @generated
	 */
	EClass getWriteStructuralFeatureAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.WriteStructuralFeatureAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see Actions.IntermediateActions.WriteStructuralFeatureAction#getValue()
	 * @see #getWriteStructuralFeatureAction()
	 * @generated
	 */
	EReference getWriteStructuralFeatureAction_Value();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.WriteStructuralFeatureAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see Actions.IntermediateActions.WriteStructuralFeatureAction#getResult()
	 * @see #getWriteStructuralFeatureAction()
	 * @generated
	 */
	EReference getWriteStructuralFeatureAction_Result();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.AddStructuralFeatureValueAction <em>Add Structural Feature Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Structural Feature Value Action</em>'.
	 * @see Actions.IntermediateActions.AddStructuralFeatureValueAction
	 * @generated
	 */
	EClass getAddStructuralFeatureValueAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.AddStructuralFeatureValueAction#getInsertAt <em>Insert At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insert At</em>'.
	 * @see Actions.IntermediateActions.AddStructuralFeatureValueAction#getInsertAt()
	 * @see #getAddStructuralFeatureValueAction()
	 * @generated
	 */
	EReference getAddStructuralFeatureValueAction_InsertAt();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.RemoveStructuralFeatureValueAction <em>Remove Structural Feature Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Structural Feature Value Action</em>'.
	 * @see Actions.IntermediateActions.RemoveStructuralFeatureValueAction
	 * @generated
	 */
	EClass getRemoveStructuralFeatureValueAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.RemoveStructuralFeatureValueAction#getRemoveAt <em>Remove At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remove At</em>'.
	 * @see Actions.IntermediateActions.RemoveStructuralFeatureValueAction#getRemoveAt()
	 * @see #getRemoveStructuralFeatureValueAction()
	 * @generated
	 */
	EReference getRemoveStructuralFeatureValueAction_RemoveAt();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.ClearStructuralFeatureAction <em>Clear Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear Structural Feature Action</em>'.
	 * @see Actions.IntermediateActions.ClearStructuralFeatureAction
	 * @generated
	 */
	EClass getClearStructuralFeatureAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.ClearStructuralFeatureAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see Actions.IntermediateActions.ClearStructuralFeatureAction#getResult()
	 * @see #getClearStructuralFeatureAction()
	 * @generated
	 */
	EReference getClearStructuralFeatureAction_Result();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.LinkAction <em>Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Action</em>'.
	 * @see Actions.IntermediateActions.LinkAction
	 * @generated
	 */
	EClass getLinkAction();

	/**
	 * Returns the meta object for the containment reference list '{@link Actions.IntermediateActions.LinkAction#getInputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Value</em>'.
	 * @see Actions.IntermediateActions.LinkAction#getInputValue()
	 * @see #getLinkAction()
	 * @generated
	 */
	EReference getLinkAction_InputValue();

	/**
	 * Returns the meta object for the containment reference list '{@link Actions.IntermediateActions.LinkAction#getEndData <em>End Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End Data</em>'.
	 * @see Actions.IntermediateActions.LinkAction#getEndData()
	 * @see #getLinkAction()
	 * @generated
	 */
	EReference getLinkAction_EndData();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.LinkEndData <em>Link End Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link End Data</em>'.
	 * @see Actions.IntermediateActions.LinkEndData
	 * @generated
	 */
	EClass getLinkEndData();

	/**
	 * Returns the meta object for the reference '{@link Actions.IntermediateActions.LinkEndData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see Actions.IntermediateActions.LinkEndData#getValue()
	 * @see #getLinkEndData()
	 * @generated
	 */
	EReference getLinkEndData_Value();

	/**
	 * Returns the meta object for the reference '{@link Actions.IntermediateActions.LinkEndData#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see Actions.IntermediateActions.LinkEndData#getEnd()
	 * @see #getLinkEndData()
	 * @generated
	 */
	EReference getLinkEndData_End();

	/**
	 * Returns the meta object for the containment reference list '{@link Actions.IntermediateActions.LinkEndData#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualifier</em>'.
	 * @see Actions.IntermediateActions.LinkEndData#getQualifier()
	 * @see #getLinkEndData()
	 * @generated
	 */
	EReference getLinkEndData_Qualifier();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see Actions.IntermediateActions.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.ReadLinkAction <em>Read Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Link Action</em>'.
	 * @see Actions.IntermediateActions.ReadLinkAction
	 * @generated
	 */
	EClass getReadLinkAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.ReadLinkAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see Actions.IntermediateActions.ReadLinkAction#getResult()
	 * @see #getReadLinkAction()
	 * @generated
	 */
	EReference getReadLinkAction_Result();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.WriteLinkAction <em>Write Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Link Action</em>'.
	 * @see Actions.IntermediateActions.WriteLinkAction
	 * @generated
	 */
	EClass getWriteLinkAction();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.CreateLinkAction <em>Create Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Link Action</em>'.
	 * @see Actions.IntermediateActions.CreateLinkAction
	 * @generated
	 */
	EClass getCreateLinkAction();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.LinkEndCreationData <em>Link End Creation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link End Creation Data</em>'.
	 * @see Actions.IntermediateActions.LinkEndCreationData
	 * @generated
	 */
	EClass getLinkEndCreationData();

	/**
	 * Returns the meta object for the attribute '{@link Actions.IntermediateActions.LinkEndCreationData#isIsReplaceAll <em>Is Replace All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Replace All</em>'.
	 * @see Actions.IntermediateActions.LinkEndCreationData#isIsReplaceAll()
	 * @see #getLinkEndCreationData()
	 * @generated
	 */
	EAttribute getLinkEndCreationData_IsReplaceAll();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.LinkEndCreationData#getInsertAt <em>Insert At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insert At</em>'.
	 * @see Actions.IntermediateActions.LinkEndCreationData#getInsertAt()
	 * @see #getLinkEndCreationData()
	 * @generated
	 */
	EReference getLinkEndCreationData_InsertAt();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see Actions.IntermediateActions.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.DestroyLinkAction <em>Destroy Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destroy Link Action</em>'.
	 * @see Actions.IntermediateActions.DestroyLinkAction
	 * @generated
	 */
	EClass getDestroyLinkAction();

	/**
	 * Returns the meta object for class '{@link Actions.IntermediateActions.LinkEndDestructionData <em>Link End Destruction Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link End Destruction Data</em>'.
	 * @see Actions.IntermediateActions.LinkEndDestructionData
	 * @generated
	 */
	EClass getLinkEndDestructionData();

	/**
	 * Returns the meta object for the attribute '{@link Actions.IntermediateActions.LinkEndDestructionData#isIsDestroyDuplicates <em>Is Destroy Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Destroy Duplicates</em>'.
	 * @see Actions.IntermediateActions.LinkEndDestructionData#isIsDestroyDuplicates()
	 * @see #getLinkEndDestructionData()
	 * @generated
	 */
	EAttribute getLinkEndDestructionData_IsDestroyDuplicates();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.IntermediateActions.LinkEndDestructionData#getDestroyAt <em>Destroy At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destroy At</em>'.
	 * @see Actions.IntermediateActions.LinkEndDestructionData#getDestroyAt()
	 * @see #getLinkEndDestructionData()
	 * @generated
	 */
	EReference getLinkEndDestructionData_DestroyAt();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntermediateActionsFactory getIntermediateActionsFactory();

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
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.BroadcastSignalActionImpl <em>Broadcast Signal Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.BroadcastSignalActionImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getBroadcastSignalAction()
		 * @generated
		 */
		EClass BROADCAST_SIGNAL_ACTION = eINSTANCE.getBroadcastSignalAction();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROADCAST_SIGNAL_ACTION__SIGNAL = eINSTANCE.getBroadcastSignalAction_Signal();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.SendObjectActionImpl <em>Send Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.SendObjectActionImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getSendObjectAction()
		 * @generated
		 */
		EClass SEND_OBJECT_ACTION = eINSTANCE.getSendObjectAction();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_OBJECT_ACTION__TARGET = eINSTANCE.getSendObjectAction_Target();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_OBJECT_ACTION__REQUEST = eINSTANCE.getSendObjectAction_Request();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.CreateObjectActionImpl <em>Create Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.CreateObjectActionImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getCreateObjectAction()
		 * @generated
		 */
		EClass CREATE_OBJECT_ACTION = eINSTANCE.getCreateObjectAction();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_OBJECT_ACTION__CLASSIFIER = eINSTANCE.getCreateObjectAction_Classifier();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_OBJECT_ACTION__RESULT = eINSTANCE.getCreateObjectAction_Result();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.DestroyObjectActionImpl <em>Destroy Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.DestroyObjectActionImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getDestroyObjectAction()
		 * @generated
		 */
		EClass DESTROY_OBJECT_ACTION = eINSTANCE.getDestroyObjectAction();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESTROY_OBJECT_ACTION__TARGET = eINSTANCE.getDestroyObjectAction_Target();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.TestIdentityActionImpl <em>Test Identity Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.TestIdentityActionImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getTestIdentityAction()
		 * @generated
		 */
		EClass TEST_IDENTITY_ACTION = eINSTANCE.getTestIdentityAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_IDENTITY_ACTION__RESULT = eINSTANCE.getTestIdentityAction_Result();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_IDENTITY_ACTION__FIRST = eINSTANCE.getTestIdentityAction_First();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_IDENTITY_ACTION__SECOND = eINSTANCE.getTestIdentityAction_Second();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.ReadSelfActionImpl <em>Read Self Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.ReadSelfActionImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getReadSelfAction()
		 * @generated
		 */
		EClass READ_SELF_ACTION = eINSTANCE.getReadSelfAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_SELF_ACTION__RESULT = eINSTANCE.getReadSelfAction_Result();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.ValueSpecificationActionImpl <em>Value Specification Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.ValueSpecificationActionImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getValueSpecificationAction()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION_ACTION = eINSTANCE.getValueSpecificationAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SPECIFICATION_ACTION__RESULT = eINSTANCE.getValueSpecificationAction_Result();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SPECIFICATION_ACTION__VALUE = eINSTANCE.getValueSpecificationAction_Value();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.StructuralFeatureActionImpl <em>Structural Feature Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.StructuralFeatureActionImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getStructuralFeatureAction()
		 * @generated
		 */
		EClass STRUCTURAL_FEATURE_ACTION = eINSTANCE.getStructuralFeatureAction();

		/**
		 * The meta object literal for the '<em><b>Structural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE = eINSTANCE.getStructuralFeatureAction_StructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_FEATURE_ACTION__OBJECT = eINSTANCE.getStructuralFeatureAction_Object();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.StructuralFeatureImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getStructuralFeature()
		 * @generated
		 */
		EClass STRUCTURAL_FEATURE = eINSTANCE.getStructuralFeature();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.ReadStructuralFeatureActionImpl <em>Read Structural Feature Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.ReadStructuralFeatureActionImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getReadStructuralFeatureAction()
		 * @generated
		 */
		EClass READ_STRUCTURAL_FEATURE_ACTION = eINSTANCE.getReadStructuralFeatureAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_STRUCTURAL_FEATURE_ACTION__RESULT = eINSTANCE.getReadStructuralFeatureAction_Result();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.WriteStructuralFeatureActionImpl <em>Write Structural Feature Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.WriteStructuralFeatureActionImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getWriteStructuralFeatureAction()
		 * @generated
		 */
		EClass WRITE_STRUCTURAL_FEATURE_ACTION = eINSTANCE.getWriteStructuralFeatureAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_STRUCTURAL_FEATURE_ACTION__VALUE = eINSTANCE.getWriteStructuralFeatureAction_Value();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_STRUCTURAL_FEATURE_ACTION__RESULT = eINSTANCE.getWriteStructuralFeatureAction_Result();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.AddStructuralFeatureValueActionImpl <em>Add Structural Feature Value Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.AddStructuralFeatureValueActionImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getAddStructuralFeatureValueAction()
		 * @generated
		 */
		EClass ADD_STRUCTURAL_FEATURE_VALUE_ACTION = eINSTANCE.getAddStructuralFeatureValueAction();

		/**
		 * The meta object literal for the '<em><b>Insert At</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT = eINSTANCE.getAddStructuralFeatureValueAction_InsertAt();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.RemoveStructuralFeatureValueActionImpl <em>Remove Structural Feature Value Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.RemoveStructuralFeatureValueActionImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getRemoveStructuralFeatureValueAction()
		 * @generated
		 */
		EClass REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION = eINSTANCE.getRemoveStructuralFeatureValueAction();

		/**
		 * The meta object literal for the '<em><b>Remove At</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT = eINSTANCE.getRemoveStructuralFeatureValueAction_RemoveAt();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.ClearStructuralFeatureActionImpl <em>Clear Structural Feature Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.ClearStructuralFeatureActionImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getClearStructuralFeatureAction()
		 * @generated
		 */
		EClass CLEAR_STRUCTURAL_FEATURE_ACTION = eINSTANCE.getClearStructuralFeatureAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEAR_STRUCTURAL_FEATURE_ACTION__RESULT = eINSTANCE.getClearStructuralFeatureAction_Result();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.LinkActionImpl <em>Link Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.LinkActionImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getLinkAction()
		 * @generated
		 */
		EClass LINK_ACTION = eINSTANCE.getLinkAction();

		/**
		 * The meta object literal for the '<em><b>Input Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_ACTION__INPUT_VALUE = eINSTANCE.getLinkAction_InputValue();

		/**
		 * The meta object literal for the '<em><b>End Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_ACTION__END_DATA = eINSTANCE.getLinkAction_EndData();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.LinkEndDataImpl <em>Link End Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.LinkEndDataImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getLinkEndData()
		 * @generated
		 */
		EClass LINK_END_DATA = eINSTANCE.getLinkEndData();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_END_DATA__VALUE = eINSTANCE.getLinkEndData_Value();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_END_DATA__END = eINSTANCE.getLinkEndData_End();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_END_DATA__QUALIFIER = eINSTANCE.getLinkEndData_Qualifier();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.PropertyImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.ReadLinkActionImpl <em>Read Link Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.ReadLinkActionImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getReadLinkAction()
		 * @generated
		 */
		EClass READ_LINK_ACTION = eINSTANCE.getReadLinkAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_LINK_ACTION__RESULT = eINSTANCE.getReadLinkAction_Result();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.WriteLinkActionImpl <em>Write Link Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.WriteLinkActionImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getWriteLinkAction()
		 * @generated
		 */
		EClass WRITE_LINK_ACTION = eINSTANCE.getWriteLinkAction();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.CreateLinkActionImpl <em>Create Link Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.CreateLinkActionImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getCreateLinkAction()
		 * @generated
		 */
		EClass CREATE_LINK_ACTION = eINSTANCE.getCreateLinkAction();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.LinkEndCreationDataImpl <em>Link End Creation Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.LinkEndCreationDataImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getLinkEndCreationData()
		 * @generated
		 */
		EClass LINK_END_CREATION_DATA = eINSTANCE.getLinkEndCreationData();

		/**
		 * The meta object literal for the '<em><b>Is Replace All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_END_CREATION_DATA__IS_REPLACE_ALL = eINSTANCE.getLinkEndCreationData_IsReplaceAll();

		/**
		 * The meta object literal for the '<em><b>Insert At</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_END_CREATION_DATA__INSERT_AT = eINSTANCE.getLinkEndCreationData_InsertAt();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.ElementImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.DestroyLinkActionImpl <em>Destroy Link Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.DestroyLinkActionImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getDestroyLinkAction()
		 * @generated
		 */
		EClass DESTROY_LINK_ACTION = eINSTANCE.getDestroyLinkAction();

		/**
		 * The meta object literal for the '{@link Actions.IntermediateActions.impl.LinkEndDestructionDataImpl <em>Link End Destruction Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.IntermediateActions.impl.LinkEndDestructionDataImpl
		 * @see Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getLinkEndDestructionData()
		 * @generated
		 */
		EClass LINK_END_DESTRUCTION_DATA = eINSTANCE.getLinkEndDestructionData();

		/**
		 * The meta object literal for the '<em><b>Is Destroy Duplicates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES = eINSTANCE.getLinkEndDestructionData_IsDestroyDuplicates();

		/**
		 * The meta object literal for the '<em><b>Destroy At</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_END_DESTRUCTION_DATA__DESTROY_AT = eINSTANCE.getLinkEndDestructionData_DestroyAt();

	}

} //IntermediateActionsPackage

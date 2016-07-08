/**
 */
package Actions.StructuredActions;

import Actions.BasicActions.BasicActionsPackage;

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
 * @see Actions.StructuredActions.StructuredActionsFactory
 * @model kind="package"
 * @generated
 */
public interface StructuredActionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "StructuredActions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.puzzle.uml/Actions/StructuredActions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "StructuredActions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructuredActionsPackage eINSTANCE = Actions.StructuredActions.impl.StructuredActionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Actions.StructuredActions.impl.VariableActionImpl <em>Variable Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.StructuredActions.impl.VariableActionImpl
	 * @see Actions.StructuredActions.impl.StructuredActionsPackageImpl#getVariableAction()
	 * @generated
	 */
	int VARIABLE_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__VARIABLE = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION_OPERATION_COUNT = BasicActionsPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.StructuredActions.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.StructuredActions.impl.VariableImpl
	 * @see Actions.StructuredActions.impl.StructuredActionsPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Actions.StructuredActions.impl.ReadVariableActionImpl <em>Read Variable Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.StructuredActions.impl.ReadVariableActionImpl
	 * @see Actions.StructuredActions.impl.StructuredActionsPackageImpl#getReadVariableAction()
	 * @generated
	 */
	int READ_VARIABLE_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__CONTEXT = VARIABLE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__INPUT = VARIABLE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__OUTPUT = VARIABLE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__VARIABLE = VARIABLE_ACTION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__RESULT = VARIABLE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Read Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION_FEATURE_COUNT = VARIABLE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Read Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION_OPERATION_COUNT = VARIABLE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.StructuredActions.impl.WriteVariableActionImpl <em>Write Variable Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.StructuredActions.impl.WriteVariableActionImpl
	 * @see Actions.StructuredActions.impl.StructuredActionsPackageImpl#getWriteVariableAction()
	 * @generated
	 */
	int WRITE_VARIABLE_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__CONTEXT = VARIABLE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__INPUT = VARIABLE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__OUTPUT = VARIABLE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__VARIABLE = VARIABLE_ACTION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__VALUE = VARIABLE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Write Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION_FEATURE_COUNT = VARIABLE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Write Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION_OPERATION_COUNT = VARIABLE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.StructuredActions.impl.AddVariableValueActionImpl <em>Add Variable Value Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.StructuredActions.impl.AddVariableValueActionImpl
	 * @see Actions.StructuredActions.impl.StructuredActionsPackageImpl#getAddVariableValueAction()
	 * @generated
	 */
	int ADD_VARIABLE_VALUE_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__CONTEXT = WRITE_VARIABLE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__INPUT = WRITE_VARIABLE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__OUTPUT = WRITE_VARIABLE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__VARIABLE = WRITE_VARIABLE_ACTION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__VALUE = WRITE_VARIABLE_ACTION__VALUE;

	/**
	 * The feature id for the '<em><b>Insert At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__INSERT_AT = WRITE_VARIABLE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Variable Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION_FEATURE_COUNT = WRITE_VARIABLE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Add Variable Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION_OPERATION_COUNT = WRITE_VARIABLE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.StructuredActions.impl.RemoveVariableValueActionImpl <em>Remove Variable Value Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.StructuredActions.impl.RemoveVariableValueActionImpl
	 * @see Actions.StructuredActions.impl.StructuredActionsPackageImpl#getRemoveVariableValueAction()
	 * @generated
	 */
	int REMOVE_VARIABLE_VALUE_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__CONTEXT = WRITE_VARIABLE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__INPUT = WRITE_VARIABLE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__OUTPUT = WRITE_VARIABLE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__VARIABLE = WRITE_VARIABLE_ACTION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__VALUE = WRITE_VARIABLE_ACTION__VALUE;

	/**
	 * The feature id for the '<em><b>Remove At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT = WRITE_VARIABLE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Variable Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION_FEATURE_COUNT = WRITE_VARIABLE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remove Variable Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION_OPERATION_COUNT = WRITE_VARIABLE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.StructuredActions.impl.ClearVariableActionImpl <em>Clear Variable Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.StructuredActions.impl.ClearVariableActionImpl
	 * @see Actions.StructuredActions.impl.StructuredActionsPackageImpl#getClearVariableAction()
	 * @generated
	 */
	int CLEAR_VARIABLE_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__CONTEXT = VARIABLE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__INPUT = VARIABLE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__OUTPUT = VARIABLE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__VARIABLE = VARIABLE_ACTION__VARIABLE;

	/**
	 * The number of structural features of the '<em>Clear Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION_FEATURE_COUNT = VARIABLE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clear Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION_OPERATION_COUNT = VARIABLE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.StructuredActions.impl.RaiseExceptionActionImpl <em>Raise Exception Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.StructuredActions.impl.RaiseExceptionActionImpl
	 * @see Actions.StructuredActions.impl.StructuredActionsPackageImpl#getRaiseExceptionAction()
	 * @generated
	 */
	int RAISE_EXCEPTION_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__EXCEPTION = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raise Exception Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Raise Exception Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION_OPERATION_COUNT = BasicActionsPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Actions.StructuredActions.impl.ActionInputPinImpl <em>Action Input Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Actions.StructuredActions.impl.ActionInputPinImpl
	 * @see Actions.StructuredActions.impl.StructuredActionsPackageImpl#getActionInputPin()
	 * @generated
	 */
	int ACTION_INPUT_PIN = 8;

	/**
	 * The feature id for the '<em><b>From Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__FROM_ACTION = BasicActionsPackage.INPUT_PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN_FEATURE_COUNT = BasicActionsPackage.INPUT_PIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN_OPERATION_COUNT = BasicActionsPackage.INPUT_PIN_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Actions.StructuredActions.VariableAction <em>Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Action</em>'.
	 * @see Actions.StructuredActions.VariableAction
	 * @generated
	 */
	EClass getVariableAction();

	/**
	 * Returns the meta object for the reference '{@link Actions.StructuredActions.VariableAction#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see Actions.StructuredActions.VariableAction#getVariable()
	 * @see #getVariableAction()
	 * @generated
	 */
	EReference getVariableAction_Variable();

	/**
	 * Returns the meta object for class '{@link Actions.StructuredActions.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see Actions.StructuredActions.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for class '{@link Actions.StructuredActions.ReadVariableAction <em>Read Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Variable Action</em>'.
	 * @see Actions.StructuredActions.ReadVariableAction
	 * @generated
	 */
	EClass getReadVariableAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.StructuredActions.ReadVariableAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see Actions.StructuredActions.ReadVariableAction#getResult()
	 * @see #getReadVariableAction()
	 * @generated
	 */
	EReference getReadVariableAction_Result();

	/**
	 * Returns the meta object for class '{@link Actions.StructuredActions.WriteVariableAction <em>Write Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Variable Action</em>'.
	 * @see Actions.StructuredActions.WriteVariableAction
	 * @generated
	 */
	EClass getWriteVariableAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.StructuredActions.WriteVariableAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see Actions.StructuredActions.WriteVariableAction#getValue()
	 * @see #getWriteVariableAction()
	 * @generated
	 */
	EReference getWriteVariableAction_Value();

	/**
	 * Returns the meta object for class '{@link Actions.StructuredActions.AddVariableValueAction <em>Add Variable Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Variable Value Action</em>'.
	 * @see Actions.StructuredActions.AddVariableValueAction
	 * @generated
	 */
	EClass getAddVariableValueAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.StructuredActions.AddVariableValueAction#getInsertAt <em>Insert At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insert At</em>'.
	 * @see Actions.StructuredActions.AddVariableValueAction#getInsertAt()
	 * @see #getAddVariableValueAction()
	 * @generated
	 */
	EReference getAddVariableValueAction_InsertAt();

	/**
	 * Returns the meta object for class '{@link Actions.StructuredActions.RemoveVariableValueAction <em>Remove Variable Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Variable Value Action</em>'.
	 * @see Actions.StructuredActions.RemoveVariableValueAction
	 * @generated
	 */
	EClass getRemoveVariableValueAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.StructuredActions.RemoveVariableValueAction#getRemoveAt <em>Remove At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remove At</em>'.
	 * @see Actions.StructuredActions.RemoveVariableValueAction#getRemoveAt()
	 * @see #getRemoveVariableValueAction()
	 * @generated
	 */
	EReference getRemoveVariableValueAction_RemoveAt();

	/**
	 * Returns the meta object for class '{@link Actions.StructuredActions.ClearVariableAction <em>Clear Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear Variable Action</em>'.
	 * @see Actions.StructuredActions.ClearVariableAction
	 * @generated
	 */
	EClass getClearVariableAction();

	/**
	 * Returns the meta object for class '{@link Actions.StructuredActions.RaiseExceptionAction <em>Raise Exception Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raise Exception Action</em>'.
	 * @see Actions.StructuredActions.RaiseExceptionAction
	 * @generated
	 */
	EClass getRaiseExceptionAction();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.StructuredActions.RaiseExceptionAction#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception</em>'.
	 * @see Actions.StructuredActions.RaiseExceptionAction#getException()
	 * @see #getRaiseExceptionAction()
	 * @generated
	 */
	EReference getRaiseExceptionAction_Exception();

	/**
	 * Returns the meta object for class '{@link Actions.StructuredActions.ActionInputPin <em>Action Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Input Pin</em>'.
	 * @see Actions.StructuredActions.ActionInputPin
	 * @generated
	 */
	EClass getActionInputPin();

	/**
	 * Returns the meta object for the containment reference '{@link Actions.StructuredActions.ActionInputPin#getFromAction <em>From Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Action</em>'.
	 * @see Actions.StructuredActions.ActionInputPin#getFromAction()
	 * @see #getActionInputPin()
	 * @generated
	 */
	EReference getActionInputPin_FromAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructuredActionsFactory getStructuredActionsFactory();

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
		 * The meta object literal for the '{@link Actions.StructuredActions.impl.VariableActionImpl <em>Variable Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.StructuredActions.impl.VariableActionImpl
		 * @see Actions.StructuredActions.impl.StructuredActionsPackageImpl#getVariableAction()
		 * @generated
		 */
		EClass VARIABLE_ACTION = eINSTANCE.getVariableAction();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ACTION__VARIABLE = eINSTANCE.getVariableAction_Variable();

		/**
		 * The meta object literal for the '{@link Actions.StructuredActions.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.StructuredActions.impl.VariableImpl
		 * @see Actions.StructuredActions.impl.StructuredActionsPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '{@link Actions.StructuredActions.impl.ReadVariableActionImpl <em>Read Variable Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.StructuredActions.impl.ReadVariableActionImpl
		 * @see Actions.StructuredActions.impl.StructuredActionsPackageImpl#getReadVariableAction()
		 * @generated
		 */
		EClass READ_VARIABLE_ACTION = eINSTANCE.getReadVariableAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_VARIABLE_ACTION__RESULT = eINSTANCE.getReadVariableAction_Result();

		/**
		 * The meta object literal for the '{@link Actions.StructuredActions.impl.WriteVariableActionImpl <em>Write Variable Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.StructuredActions.impl.WriteVariableActionImpl
		 * @see Actions.StructuredActions.impl.StructuredActionsPackageImpl#getWriteVariableAction()
		 * @generated
		 */
		EClass WRITE_VARIABLE_ACTION = eINSTANCE.getWriteVariableAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_VARIABLE_ACTION__VALUE = eINSTANCE.getWriteVariableAction_Value();

		/**
		 * The meta object literal for the '{@link Actions.StructuredActions.impl.AddVariableValueActionImpl <em>Add Variable Value Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.StructuredActions.impl.AddVariableValueActionImpl
		 * @see Actions.StructuredActions.impl.StructuredActionsPackageImpl#getAddVariableValueAction()
		 * @generated
		 */
		EClass ADD_VARIABLE_VALUE_ACTION = eINSTANCE.getAddVariableValueAction();

		/**
		 * The meta object literal for the '<em><b>Insert At</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_VARIABLE_VALUE_ACTION__INSERT_AT = eINSTANCE.getAddVariableValueAction_InsertAt();

		/**
		 * The meta object literal for the '{@link Actions.StructuredActions.impl.RemoveVariableValueActionImpl <em>Remove Variable Value Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.StructuredActions.impl.RemoveVariableValueActionImpl
		 * @see Actions.StructuredActions.impl.StructuredActionsPackageImpl#getRemoveVariableValueAction()
		 * @generated
		 */
		EClass REMOVE_VARIABLE_VALUE_ACTION = eINSTANCE.getRemoveVariableValueAction();

		/**
		 * The meta object literal for the '<em><b>Remove At</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT = eINSTANCE.getRemoveVariableValueAction_RemoveAt();

		/**
		 * The meta object literal for the '{@link Actions.StructuredActions.impl.ClearVariableActionImpl <em>Clear Variable Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.StructuredActions.impl.ClearVariableActionImpl
		 * @see Actions.StructuredActions.impl.StructuredActionsPackageImpl#getClearVariableAction()
		 * @generated
		 */
		EClass CLEAR_VARIABLE_ACTION = eINSTANCE.getClearVariableAction();

		/**
		 * The meta object literal for the '{@link Actions.StructuredActions.impl.RaiseExceptionActionImpl <em>Raise Exception Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.StructuredActions.impl.RaiseExceptionActionImpl
		 * @see Actions.StructuredActions.impl.StructuredActionsPackageImpl#getRaiseExceptionAction()
		 * @generated
		 */
		EClass RAISE_EXCEPTION_ACTION = eINSTANCE.getRaiseExceptionAction();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAISE_EXCEPTION_ACTION__EXCEPTION = eINSTANCE.getRaiseExceptionAction_Exception();

		/**
		 * The meta object literal for the '{@link Actions.StructuredActions.impl.ActionInputPinImpl <em>Action Input Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Actions.StructuredActions.impl.ActionInputPinImpl
		 * @see Actions.StructuredActions.impl.StructuredActionsPackageImpl#getActionInputPin()
		 * @generated
		 */
		EClass ACTION_INPUT_PIN = eINSTANCE.getActionInputPin();

		/**
		 * The meta object literal for the '<em><b>From Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_INPUT_PIN__FROM_ACTION = eINSTANCE.getActionInputPin_FromAction();

	}

} //StructuredActionsPackage

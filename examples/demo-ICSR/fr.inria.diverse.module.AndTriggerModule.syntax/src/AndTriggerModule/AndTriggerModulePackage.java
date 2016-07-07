/**
 */
package AndTriggerModule;

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
 * @see AndTriggerModule.AndTriggerModuleFactory
 * @model kind="package"
 * @generated
 */
public interface AndTriggerModulePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AndTriggerModule";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "AndTriggerModule";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AndTriggerModule";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AndTriggerModulePackage eINSTANCE = AndTriggerModule.impl.AndTriggerModulePackageImpl.init();

	/**
	 * The meta object id for the '{@link AndTriggerModule.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AndTriggerModule.impl.TriggerImpl
	 * @see AndTriggerModule.impl.AndTriggerModulePackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 2;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 0;

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
	 * The meta object id for the '{@link AndTriggerModule.impl.AndTriggerImpl <em>And Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AndTriggerModule.impl.AndTriggerImpl
	 * @see AndTriggerModule.impl.AndTriggerModulePackageImpl#getAndTrigger()
	 * @generated
	 */
	int AND_TRIGGER = 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TRIGGER__LEFT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
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
	 * The operation id for the '<em>Eval Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TRIGGER___EVAL_TRIGGER__OBJECT = TRIGGER___EVAL_TRIGGER__OBJECT;

	/**
	 * The number of operations of the '<em>And Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AndTriggerModule.impl.DeepHistoryImpl <em>Deep History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AndTriggerModule.impl.DeepHistoryImpl
	 * @see AndTriggerModule.impl.AndTriggerModulePackageImpl#getDeepHistory()
	 * @generated
	 */
	int DEEP_HISTORY = 1;

	/**
	 * The number of structural features of the '<em>Deep History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEEP_HISTORY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Deep History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEEP_HISTORY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link AndTriggerModule.AndTrigger <em>And Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Trigger</em>'.
	 * @see AndTriggerModule.AndTrigger
	 * @generated
	 */
	EClass getAndTrigger();

	/**
	 * Returns the meta object for the reference '{@link AndTriggerModule.AndTrigger#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see AndTriggerModule.AndTrigger#getLeft()
	 * @see #getAndTrigger()
	 * @generated
	 */
	EReference getAndTrigger_Left();

	/**
	 * Returns the meta object for the reference '{@link AndTriggerModule.AndTrigger#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see AndTriggerModule.AndTrigger#getRight()
	 * @see #getAndTrigger()
	 * @generated
	 */
	EReference getAndTrigger_Right();

	/**
	 * Returns the meta object for class '{@link AndTriggerModule.DeepHistory <em>Deep History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deep History</em>'.
	 * @see AndTriggerModule.DeepHistory
	 * @generated
	 */
	EClass getDeepHistory();

	/**
	 * Returns the meta object for class '{@link AndTriggerModule.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see AndTriggerModule.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the '{@link AndTriggerModule.Trigger#evalTrigger(java.lang.Object) <em>Eval Trigger</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval Trigger</em>' operation.
	 * @see AndTriggerModule.Trigger#evalTrigger(java.lang.Object)
	 * @generated
	 */
	EOperation getTrigger__EvalTrigger__Object();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AndTriggerModuleFactory getAndTriggerModuleFactory();

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
		 * The meta object literal for the '{@link AndTriggerModule.impl.AndTriggerImpl <em>And Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AndTriggerModule.impl.AndTriggerImpl
		 * @see AndTriggerModule.impl.AndTriggerModulePackageImpl#getAndTrigger()
		 * @generated
		 */
		EClass AND_TRIGGER = eINSTANCE.getAndTrigger();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_TRIGGER__LEFT = eINSTANCE.getAndTrigger_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_TRIGGER__RIGHT = eINSTANCE.getAndTrigger_Right();

		/**
		 * The meta object literal for the '{@link AndTriggerModule.impl.DeepHistoryImpl <em>Deep History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AndTriggerModule.impl.DeepHistoryImpl
		 * @see AndTriggerModule.impl.AndTriggerModulePackageImpl#getDeepHistory()
		 * @generated
		 */
		EClass DEEP_HISTORY = eINSTANCE.getDeepHistory();

		/**
		 * The meta object literal for the '{@link AndTriggerModule.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AndTriggerModule.impl.TriggerImpl
		 * @see AndTriggerModule.impl.AndTriggerModulePackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Eval Trigger</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRIGGER___EVAL_TRIGGER__OBJECT = eINSTANCE.getTrigger__EvalTrigger__Object();

	}

} //AndTriggerModulePackage

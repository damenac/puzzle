/**
 */
package AndTriggerModuleProv;

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
 * @see AndTriggerModuleProv.AndTriggerModuleProvFactory
 * @model kind="package"
 * @generated
 */
public interface AndTriggerModuleProvPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AndTriggerModuleProv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "AndTriggerModuleProv";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AndTriggerModuleProv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AndTriggerModuleProvPackage eINSTANCE = AndTriggerModuleProv.impl.AndTriggerModuleProvPackageImpl.init();

	/**
	 * The meta object id for the '{@link AndTriggerModuleProv.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AndTriggerModuleProv.impl.TriggerImpl
	 * @see AndTriggerModuleProv.impl.AndTriggerModuleProvPackageImpl#getTrigger()
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
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AndTriggerModuleProv.impl.AndTriggerImpl <em>And Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AndTriggerModuleProv.impl.AndTriggerImpl
	 * @see AndTriggerModuleProv.impl.AndTriggerModuleProvPackageImpl#getAndTrigger()
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
	int AND_TRIGGER___EVAL_TRIGGER__OBJECT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link AndTriggerModuleProv.impl.DeepHistoryImpl <em>Deep History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AndTriggerModuleProv.impl.DeepHistoryImpl
	 * @see AndTriggerModuleProv.impl.AndTriggerModuleProvPackageImpl#getDeepHistory()
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
	 * Returns the meta object for class '{@link AndTriggerModuleProv.AndTrigger <em>And Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Trigger</em>'.
	 * @see AndTriggerModuleProv.AndTrigger
	 * @generated
	 */
	EClass getAndTrigger();

	/**
	 * Returns the meta object for the reference '{@link AndTriggerModuleProv.AndTrigger#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see AndTriggerModuleProv.AndTrigger#getLeft()
	 * @see #getAndTrigger()
	 * @generated
	 */
	EReference getAndTrigger_Left();

	/**
	 * Returns the meta object for the reference '{@link AndTriggerModuleProv.AndTrigger#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see AndTriggerModuleProv.AndTrigger#getRight()
	 * @see #getAndTrigger()
	 * @generated
	 */
	EReference getAndTrigger_Right();

	/**
	 * Returns the meta object for the '{@link AndTriggerModuleProv.AndTrigger#evalTrigger(java.lang.Object) <em>Eval Trigger</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval Trigger</em>' operation.
	 * @see AndTriggerModuleProv.AndTrigger#evalTrigger(java.lang.Object)
	 * @generated
	 */
	EOperation getAndTrigger__EvalTrigger__Object();

	/**
	 * Returns the meta object for class '{@link AndTriggerModuleProv.DeepHistory <em>Deep History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deep History</em>'.
	 * @see AndTriggerModuleProv.DeepHistory
	 * @generated
	 */
	EClass getDeepHistory();

	/**
	 * Returns the meta object for class '{@link AndTriggerModuleProv.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see AndTriggerModuleProv.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AndTriggerModuleProvFactory getAndTriggerModuleProvFactory();

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
		 * The meta object literal for the '{@link AndTriggerModuleProv.impl.AndTriggerImpl <em>And Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AndTriggerModuleProv.impl.AndTriggerImpl
		 * @see AndTriggerModuleProv.impl.AndTriggerModuleProvPackageImpl#getAndTrigger()
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
		 * The meta object literal for the '<em><b>Eval Trigger</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AND_TRIGGER___EVAL_TRIGGER__OBJECT = eINSTANCE.getAndTrigger__EvalTrigger__Object();

		/**
		 * The meta object literal for the '{@link AndTriggerModuleProv.impl.DeepHistoryImpl <em>Deep History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AndTriggerModuleProv.impl.DeepHistoryImpl
		 * @see AndTriggerModuleProv.impl.AndTriggerModuleProvPackageImpl#getDeepHistory()
		 * @generated
		 */
		EClass DEEP_HISTORY = eINSTANCE.getDeepHistory();

		/**
		 * The meta object literal for the '{@link AndTriggerModuleProv.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AndTriggerModuleProv.impl.TriggerImpl
		 * @see AndTriggerModuleProv.impl.AndTriggerModuleProvPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

	}

} //AndTriggerModuleProvPackage

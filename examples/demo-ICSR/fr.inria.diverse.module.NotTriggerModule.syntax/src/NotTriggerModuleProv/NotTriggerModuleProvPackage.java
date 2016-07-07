/**
 */
package NotTriggerModuleProv;

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
 * @see NotTriggerModuleProv.NotTriggerModuleProvFactory
 * @model kind="package"
 * @generated
 */
public interface NotTriggerModuleProvPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "NotTriggerModuleProv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "NotTriggerModuleProv";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NotTriggerModuleProv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NotTriggerModuleProvPackage eINSTANCE = NotTriggerModuleProv.impl.NotTriggerModuleProvPackageImpl.init();

	/**
	 * The meta object id for the '{@link NotTriggerModuleProv.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NotTriggerModuleProv.impl.TriggerImpl
	 * @see NotTriggerModuleProv.impl.NotTriggerModuleProvPackageImpl#getTrigger()
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
	 * The meta object id for the '{@link NotTriggerModuleProv.impl.NotTriggerImpl <em>Not Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NotTriggerModuleProv.impl.NotTriggerImpl
	 * @see NotTriggerModuleProv.impl.NotTriggerModuleProvPackageImpl#getNotTrigger()
	 * @generated
	 */
	int NOT_TRIGGER = 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
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
	 * The operation id for the '<em>Eval Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TRIGGER___EVAL_TRIGGER__OBJECT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link NotTriggerModuleProv.impl.OrTriggerImpl <em>Or Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NotTriggerModuleProv.impl.OrTriggerImpl
	 * @see NotTriggerModuleProv.impl.NotTriggerModuleProvPackageImpl#getOrTrigger()
	 * @generated
	 */
	int OR_TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TRIGGER__LEFT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
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
	 * The operation id for the '<em>Eval Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TRIGGER___EVAL_TRIGGER__OBJECT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link NotTriggerModuleProv.NotTrigger <em>Not Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Trigger</em>'.
	 * @see NotTriggerModuleProv.NotTrigger
	 * @generated
	 */
	EClass getNotTrigger();

	/**
	 * Returns the meta object for the reference '{@link NotTriggerModuleProv.NotTrigger#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger</em>'.
	 * @see NotTriggerModuleProv.NotTrigger#getTrigger()
	 * @see #getNotTrigger()
	 * @generated
	 */
	EReference getNotTrigger_Trigger();

	/**
	 * Returns the meta object for the '{@link NotTriggerModuleProv.NotTrigger#evalTrigger(java.lang.Object) <em>Eval Trigger</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval Trigger</em>' operation.
	 * @see NotTriggerModuleProv.NotTrigger#evalTrigger(java.lang.Object)
	 * @generated
	 */
	EOperation getNotTrigger__EvalTrigger__Object();

	/**
	 * Returns the meta object for class '{@link NotTriggerModuleProv.OrTrigger <em>Or Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Trigger</em>'.
	 * @see NotTriggerModuleProv.OrTrigger
	 * @generated
	 */
	EClass getOrTrigger();

	/**
	 * Returns the meta object for the reference '{@link NotTriggerModuleProv.OrTrigger#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see NotTriggerModuleProv.OrTrigger#getLeft()
	 * @see #getOrTrigger()
	 * @generated
	 */
	EReference getOrTrigger_Left();

	/**
	 * Returns the meta object for the reference '{@link NotTriggerModuleProv.OrTrigger#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see NotTriggerModuleProv.OrTrigger#getRight()
	 * @see #getOrTrigger()
	 * @generated
	 */
	EReference getOrTrigger_Right();

	/**
	 * Returns the meta object for the '{@link NotTriggerModuleProv.OrTrigger#evalTrigger(java.lang.Object) <em>Eval Trigger</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval Trigger</em>' operation.
	 * @see NotTriggerModuleProv.OrTrigger#evalTrigger(java.lang.Object)
	 * @generated
	 */
	EOperation getOrTrigger__EvalTrigger__Object();

	/**
	 * Returns the meta object for class '{@link NotTriggerModuleProv.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see NotTriggerModuleProv.Trigger
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
	NotTriggerModuleProvFactory getNotTriggerModuleProvFactory();

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
		 * The meta object literal for the '{@link NotTriggerModuleProv.impl.NotTriggerImpl <em>Not Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NotTriggerModuleProv.impl.NotTriggerImpl
		 * @see NotTriggerModuleProv.impl.NotTriggerModuleProvPackageImpl#getNotTrigger()
		 * @generated
		 */
		EClass NOT_TRIGGER = eINSTANCE.getNotTrigger();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_TRIGGER__TRIGGER = eINSTANCE.getNotTrigger_Trigger();

		/**
		 * The meta object literal for the '<em><b>Eval Trigger</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOT_TRIGGER___EVAL_TRIGGER__OBJECT = eINSTANCE.getNotTrigger__EvalTrigger__Object();

		/**
		 * The meta object literal for the '{@link NotTriggerModuleProv.impl.OrTriggerImpl <em>Or Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NotTriggerModuleProv.impl.OrTriggerImpl
		 * @see NotTriggerModuleProv.impl.NotTriggerModuleProvPackageImpl#getOrTrigger()
		 * @generated
		 */
		EClass OR_TRIGGER = eINSTANCE.getOrTrigger();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_TRIGGER__LEFT = eINSTANCE.getOrTrigger_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_TRIGGER__RIGHT = eINSTANCE.getOrTrigger_Right();

		/**
		 * The meta object literal for the '<em><b>Eval Trigger</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OR_TRIGGER___EVAL_TRIGGER__OBJECT = eINSTANCE.getOrTrigger__EvalTrigger__Object();

		/**
		 * The meta object literal for the '{@link NotTriggerModuleProv.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NotTriggerModuleProv.impl.TriggerImpl
		 * @see NotTriggerModuleProv.impl.NotTriggerModuleProvPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

	}

} //NotTriggerModuleProvPackage

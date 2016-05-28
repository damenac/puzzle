/**
 */
package complextriggers;

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
 * @see complextriggers.ComplextriggersFactory
 * @model kind="package"
 * @generated
 */
public interface ComplextriggersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "complextriggers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://complextriggers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "complextriggers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComplextriggersPackage eINSTANCE = complextriggers.impl.ComplextriggersPackageImpl.init();

	/**
	 * The meta object id for the '{@link complextriggers.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see complextriggers.impl.TriggerImpl
	 * @see complextriggers.impl.ComplextriggersPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 0;

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
	int TRIGGER___EVAL_TRIGGER__ELIST = 0;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link complextriggers.impl.NotTriggerImpl <em>Not Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see complextriggers.impl.NotTriggerImpl
	 * @see complextriggers.impl.ComplextriggersPackageImpl#getNotTrigger()
	 * @generated
	 */
	int NOT_TRIGGER = 1;

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
	 * The operation id for the '<em>Eval Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TRIGGER___EVAL_TRIGGER__ELIST = TRIGGER___EVAL_TRIGGER__ELIST;

	/**
	 * The number of operations of the '<em>Not Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link complextriggers.impl.AndTriggerImpl <em>And Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see complextriggers.impl.AndTriggerImpl
	 * @see complextriggers.impl.ComplextriggersPackageImpl#getAndTrigger()
	 * @generated
	 */
	int AND_TRIGGER = 2;

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
	 * The operation id for the '<em>Eval Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TRIGGER___EVAL_TRIGGER__ELIST = TRIGGER___EVAL_TRIGGER__ELIST;

	/**
	 * The number of operations of the '<em>And Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link complextriggers.impl.OrTriggerImpl <em>Or Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see complextriggers.impl.OrTriggerImpl
	 * @see complextriggers.impl.ComplextriggersPackageImpl#getOrTrigger()
	 * @generated
	 */
	int OR_TRIGGER = 3;

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
	 * The operation id for the '<em>Eval Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TRIGGER___EVAL_TRIGGER__ELIST = TRIGGER___EVAL_TRIGGER__ELIST;

	/**
	 * The number of operations of the '<em>Or Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link complextriggers.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see complextriggers.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the '{@link complextriggers.Trigger#evalTrigger(org.eclipse.emf.common.util.EList) <em>Eval Trigger</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval Trigger</em>' operation.
	 * @see complextriggers.Trigger#evalTrigger(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTrigger__EvalTrigger__EList();

	/**
	 * Returns the meta object for class '{@link complextriggers.NotTrigger <em>Not Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Trigger</em>'.
	 * @see complextriggers.NotTrigger
	 * @generated
	 */
	EClass getNotTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link complextriggers.NotTrigger#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see complextriggers.NotTrigger#getTrigger()
	 * @see #getNotTrigger()
	 * @generated
	 */
	EReference getNotTrigger_Trigger();

	/**
	 * Returns the meta object for class '{@link complextriggers.AndTrigger <em>And Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Trigger</em>'.
	 * @see complextriggers.AndTrigger
	 * @generated
	 */
	EClass getAndTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link complextriggers.AndTrigger#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see complextriggers.AndTrigger#getLeft()
	 * @see #getAndTrigger()
	 * @generated
	 */
	EReference getAndTrigger_Left();

	/**
	 * Returns the meta object for the containment reference '{@link complextriggers.AndTrigger#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see complextriggers.AndTrigger#getRight()
	 * @see #getAndTrigger()
	 * @generated
	 */
	EReference getAndTrigger_Right();

	/**
	 * Returns the meta object for class '{@link complextriggers.OrTrigger <em>Or Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Trigger</em>'.
	 * @see complextriggers.OrTrigger
	 * @generated
	 */
	EClass getOrTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link complextriggers.OrTrigger#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see complextriggers.OrTrigger#getLeft()
	 * @see #getOrTrigger()
	 * @generated
	 */
	EReference getOrTrigger_Left();

	/**
	 * Returns the meta object for the containment reference '{@link complextriggers.OrTrigger#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see complextriggers.OrTrigger#getRight()
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
	ComplextriggersFactory getComplextriggersFactory();

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
		 * The meta object literal for the '{@link complextriggers.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see complextriggers.impl.TriggerImpl
		 * @see complextriggers.impl.ComplextriggersPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Eval Trigger</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRIGGER___EVAL_TRIGGER__ELIST = eINSTANCE.getTrigger__EvalTrigger__EList();

		/**
		 * The meta object literal for the '{@link complextriggers.impl.NotTriggerImpl <em>Not Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see complextriggers.impl.NotTriggerImpl
		 * @see complextriggers.impl.ComplextriggersPackageImpl#getNotTrigger()
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
		 * The meta object literal for the '{@link complextriggers.impl.AndTriggerImpl <em>And Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see complextriggers.impl.AndTriggerImpl
		 * @see complextriggers.impl.ComplextriggersPackageImpl#getAndTrigger()
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
		 * The meta object literal for the '{@link complextriggers.impl.OrTriggerImpl <em>Or Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see complextriggers.impl.OrTriggerImpl
		 * @see complextriggers.impl.ComplextriggersPackageImpl#getOrTrigger()
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

} //ComplextriggersPackage

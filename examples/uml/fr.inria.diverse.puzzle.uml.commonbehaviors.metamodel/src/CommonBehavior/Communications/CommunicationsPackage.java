/**
 */
package CommonBehavior.Communications;

import CommonBehavior.BasicBehavior.BasicBehaviorPackage;

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
 * @see CommonBehavior.Communications.CommunicationsFactory
 * @model kind="package"
 * @generated
 */
public interface CommunicationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Communications";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.puzzle.uml/CommonBehavior/Communications";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Communications";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationsPackage eINSTANCE = CommonBehavior.Communications.impl.CommunicationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link CommonBehavior.Communications.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.Communications.impl.SignalImpl
	 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 0;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__OWNED_ATTRIBUTE = BasicBehaviorPackage.CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = BasicBehaviorPackage.CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = BasicBehaviorPackage.CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.Communications.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.Communications.impl.PropertyImpl
	 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 1;

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
	 * The meta object id for the '{@link CommonBehavior.Communications.impl.ReceptionImpl <em>Reception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.Communications.impl.ReceptionImpl
	 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getReception()
	 * @generated
	 */
	int RECEPTION = 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__METHOD = BasicBehaviorPackage.BEHAVIORAL_FEATURE__METHOD;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__CONCURRENCY = BasicBehaviorPackage.BEHAVIORAL_FEATURE__CONCURRENCY;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__SIGNAL = BasicBehaviorPackage.BEHAVIORAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_FEATURE_COUNT = BasicBehaviorPackage.BEHAVIORAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_OPERATION_COUNT = BasicBehaviorPackage.BEHAVIORAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.Communications.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.Communications.impl.InterfaceImpl
	 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OWNED_RECEPTION = BasicBehaviorPackage.CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = BasicBehaviorPackage.CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = BasicBehaviorPackage.CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.Communications.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.Communications.impl.NamedElementImpl
	 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.Communications.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.Communications.impl.TriggerImpl
	 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 5;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__EVENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.Communications.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.Communications.impl.PackageableElementImpl
	 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getPackageableElement()
	 * @generated
	 */
	int PACKAGEABLE_ELEMENT = 6;

	/**
	 * The number of structural features of the '<em>Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.Communications.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.Communications.impl.EventImpl
	 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 7;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.Communications.impl.MessageEventImpl <em>Message Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.Communications.impl.MessageEventImpl
	 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getMessageEvent()
	 * @generated
	 */
	int MESSAGE_EVENT = 8;

	/**
	 * The number of structural features of the '<em>Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.Communications.impl.AnyReceiveEventImpl <em>Any Receive Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.Communications.impl.AnyReceiveEventImpl
	 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getAnyReceiveEvent()
	 * @generated
	 */
	int ANY_RECEIVE_EVENT = 9;

	/**
	 * The number of structural features of the '<em>Any Receive Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT_FEATURE_COUNT = MESSAGE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Any Receive Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT_OPERATION_COUNT = MESSAGE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.Communications.impl.SignalEventImpl <em>Signal Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.Communications.impl.SignalEventImpl
	 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getSignalEvent()
	 * @generated
	 */
	int SIGNAL_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__SIGNAL = MESSAGE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signal Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT_FEATURE_COUNT = MESSAGE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Signal Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT_OPERATION_COUNT = MESSAGE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.Communications.impl.CallEventImpl <em>Call Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.Communications.impl.CallEventImpl
	 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getCallEvent()
	 * @generated
	 */
	int CALL_EVENT = 11;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT__OPERATION = MESSAGE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT_FEATURE_COUNT = MESSAGE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Call Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT_OPERATION_COUNT = MESSAGE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.Communications.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.Communications.impl.OperationImpl
	 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 12;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.Communications.impl.ChangeEventImpl <em>Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.Communications.impl.ChangeEventImpl
	 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getChangeEvent()
	 * @generated
	 */
	int CHANGE_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Change Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__CHANGE_EXPRESSION = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.Communications.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.Communications.impl.ValueSpecificationImpl
	 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getValueSpecification()
	 * @generated
	 */
	int VALUE_SPECIFICATION = 14;

	/**
	 * The number of structural features of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.Communications.CallConcurrencyFeature <em>Call Concurrency Feature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.Communications.CallConcurrencyFeature
	 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getCallConcurrencyFeature()
	 * @generated
	 */
	int CALL_CONCURRENCY_FEATURE = 15;


	/**
	 * Returns the meta object for class '{@link CommonBehavior.Communications.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see CommonBehavior.Communications.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonBehavior.Communications.Signal#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Attribute</em>'.
	 * @see CommonBehavior.Communications.Signal#getOwnedAttribute()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_OwnedAttribute();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.Communications.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see CommonBehavior.Communications.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.Communications.Reception <em>Reception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reception</em>'.
	 * @see CommonBehavior.Communications.Reception
	 * @generated
	 */
	EClass getReception();

	/**
	 * Returns the meta object for the reference '{@link CommonBehavior.Communications.Reception#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see CommonBehavior.Communications.Reception#getSignal()
	 * @see #getReception()
	 * @generated
	 */
	EReference getReception_Signal();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.Communications.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see CommonBehavior.Communications.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonBehavior.Communications.Interface#getOwnedReception <em>Owned Reception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Reception</em>'.
	 * @see CommonBehavior.Communications.Interface#getOwnedReception()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_OwnedReception();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.Communications.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see CommonBehavior.Communications.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.Communications.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see CommonBehavior.Communications.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the reference '{@link CommonBehavior.Communications.Trigger#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see CommonBehavior.Communications.Trigger#getEvent()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Event();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.Communications.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packageable Element</em>'.
	 * @see CommonBehavior.Communications.PackageableElement
	 * @generated
	 */
	EClass getPackageableElement();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.Communications.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see CommonBehavior.Communications.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.Communications.MessageEvent <em>Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Event</em>'.
	 * @see CommonBehavior.Communications.MessageEvent
	 * @generated
	 */
	EClass getMessageEvent();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.Communications.AnyReceiveEvent <em>Any Receive Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Receive Event</em>'.
	 * @see CommonBehavior.Communications.AnyReceiveEvent
	 * @generated
	 */
	EClass getAnyReceiveEvent();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.Communications.SignalEvent <em>Signal Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Event</em>'.
	 * @see CommonBehavior.Communications.SignalEvent
	 * @generated
	 */
	EClass getSignalEvent();

	/**
	 * Returns the meta object for the reference '{@link CommonBehavior.Communications.SignalEvent#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see CommonBehavior.Communications.SignalEvent#getSignal()
	 * @see #getSignalEvent()
	 * @generated
	 */
	EReference getSignalEvent_Signal();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.Communications.CallEvent <em>Call Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Event</em>'.
	 * @see CommonBehavior.Communications.CallEvent
	 * @generated
	 */
	EClass getCallEvent();

	/**
	 * Returns the meta object for the reference '{@link CommonBehavior.Communications.CallEvent#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see CommonBehavior.Communications.CallEvent#getOperation()
	 * @see #getCallEvent()
	 * @generated
	 */
	EReference getCallEvent_Operation();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.Communications.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see CommonBehavior.Communications.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.Communications.ChangeEvent <em>Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Event</em>'.
	 * @see CommonBehavior.Communications.ChangeEvent
	 * @generated
	 */
	EClass getChangeEvent();

	/**
	 * Returns the meta object for the reference '{@link CommonBehavior.Communications.ChangeEvent#getChangeExpression <em>Change Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Expression</em>'.
	 * @see CommonBehavior.Communications.ChangeEvent#getChangeExpression()
	 * @see #getChangeEvent()
	 * @generated
	 */
	EReference getChangeEvent_ChangeExpression();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.Communications.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification</em>'.
	 * @see CommonBehavior.Communications.ValueSpecification
	 * @generated
	 */
	EClass getValueSpecification();

	/**
	 * Returns the meta object for enum '{@link CommonBehavior.Communications.CallConcurrencyFeature <em>Call Concurrency Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Call Concurrency Feature</em>'.
	 * @see CommonBehavior.Communications.CallConcurrencyFeature
	 * @generated
	 */
	EEnum getCallConcurrencyFeature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommunicationsFactory getCommunicationsFactory();

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
		 * The meta object literal for the '{@link CommonBehavior.Communications.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.Communications.impl.SignalImpl
		 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Owned Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__OWNED_ATTRIBUTE = eINSTANCE.getSignal_OwnedAttribute();

		/**
		 * The meta object literal for the '{@link CommonBehavior.Communications.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.Communications.impl.PropertyImpl
		 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link CommonBehavior.Communications.impl.ReceptionImpl <em>Reception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.Communications.impl.ReceptionImpl
		 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getReception()
		 * @generated
		 */
		EClass RECEPTION = eINSTANCE.getReception();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEPTION__SIGNAL = eINSTANCE.getReception_Signal();

		/**
		 * The meta object literal for the '{@link CommonBehavior.Communications.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.Communications.impl.InterfaceImpl
		 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Owned Reception</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__OWNED_RECEPTION = eINSTANCE.getInterface_OwnedReception();

		/**
		 * The meta object literal for the '{@link CommonBehavior.Communications.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.Communications.impl.NamedElementImpl
		 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '{@link CommonBehavior.Communications.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.Communications.impl.TriggerImpl
		 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__EVENT = eINSTANCE.getTrigger_Event();

		/**
		 * The meta object literal for the '{@link CommonBehavior.Communications.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.Communications.impl.PackageableElementImpl
		 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getPackageableElement()
		 * @generated
		 */
		EClass PACKAGEABLE_ELEMENT = eINSTANCE.getPackageableElement();

		/**
		 * The meta object literal for the '{@link CommonBehavior.Communications.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.Communications.impl.EventImpl
		 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link CommonBehavior.Communications.impl.MessageEventImpl <em>Message Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.Communications.impl.MessageEventImpl
		 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getMessageEvent()
		 * @generated
		 */
		EClass MESSAGE_EVENT = eINSTANCE.getMessageEvent();

		/**
		 * The meta object literal for the '{@link CommonBehavior.Communications.impl.AnyReceiveEventImpl <em>Any Receive Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.Communications.impl.AnyReceiveEventImpl
		 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getAnyReceiveEvent()
		 * @generated
		 */
		EClass ANY_RECEIVE_EVENT = eINSTANCE.getAnyReceiveEvent();

		/**
		 * The meta object literal for the '{@link CommonBehavior.Communications.impl.SignalEventImpl <em>Signal Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.Communications.impl.SignalEventImpl
		 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getSignalEvent()
		 * @generated
		 */
		EClass SIGNAL_EVENT = eINSTANCE.getSignalEvent();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_EVENT__SIGNAL = eINSTANCE.getSignalEvent_Signal();

		/**
		 * The meta object literal for the '{@link CommonBehavior.Communications.impl.CallEventImpl <em>Call Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.Communications.impl.CallEventImpl
		 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getCallEvent()
		 * @generated
		 */
		EClass CALL_EVENT = eINSTANCE.getCallEvent();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_EVENT__OPERATION = eINSTANCE.getCallEvent_Operation();

		/**
		 * The meta object literal for the '{@link CommonBehavior.Communications.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.Communications.impl.OperationImpl
		 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link CommonBehavior.Communications.impl.ChangeEventImpl <em>Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.Communications.impl.ChangeEventImpl
		 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getChangeEvent()
		 * @generated
		 */
		EClass CHANGE_EVENT = eINSTANCE.getChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Change Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_EVENT__CHANGE_EXPRESSION = eINSTANCE.getChangeEvent_ChangeExpression();

		/**
		 * The meta object literal for the '{@link CommonBehavior.Communications.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.Communications.impl.ValueSpecificationImpl
		 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getValueSpecification()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

		/**
		 * The meta object literal for the '{@link CommonBehavior.Communications.CallConcurrencyFeature <em>Call Concurrency Feature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.Communications.CallConcurrencyFeature
		 * @see CommonBehavior.Communications.impl.CommunicationsPackageImpl#getCallConcurrencyFeature()
		 * @generated
		 */
		EEnum CALL_CONCURRENCY_FEATURE = eINSTANCE.getCallConcurrencyFeature();

	}

} //CommunicationsPackage

/**
 */
package Interactions.BasicInteractions;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see Interactions.BasicInteractions.BasicInteractionsFactory
 * @model kind="package"
 * @generated
 */
public interface BasicInteractionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BasicInteractions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.puzzle.uml/Interactions/BasicInteractions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BasicInteractions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicInteractionsPackage eINSTANCE = Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.BehaviorImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 0;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.NamedElementImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 7;

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
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.InteractionFragmentImpl <em>Interaction Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.InteractionFragmentImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getInteractionFragment()
	 * @generated
	 */
	int INTERACTION_FRAGMENT = 1;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__COVERED = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__GENERAL_ORDERING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__ENCLOSING_OPERAND = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interaction Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Interaction Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.ExecutionSpecificationImpl <em>Execution Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.ExecutionSpecificationImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getExecutionSpecification()
	 * @generated
	 */
	int EXECUTION_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__GENERAL_ORDERING = INTERACTION_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__ENCLOSING_OPERAND = INTERACTION_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__START = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__FINISH = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.OccurenceSpecificationImpl <em>Occurence Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.OccurenceSpecificationImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getOccurenceSpecification()
	 * @generated
	 */
	int OCCURENCE_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE_SPECIFICATION__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE_SPECIFICATION__GENERAL_ORDERING = INTERACTION_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE_SPECIFICATION__ENCLOSING_OPERAND = INTERACTION_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>To Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE_SPECIFICATION__TO_BEFORE = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE_SPECIFICATION__TO_AFTER = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Occurence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE_SPECIFICATION_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Occurence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE_SPECIFICATION_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.ConstraintImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 4;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.StateInvariantImpl <em>State Invariant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.StateInvariantImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getStateInvariant()
	 * @generated
	 */
	int STATE_INVARIANT = 5;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__GENERAL_ORDERING = INTERACTION_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__ENCLOSING_OPERAND = INTERACTION_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__INVARIANT = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.InteractionImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 6;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__COVERED = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__GENERAL_ORDERING = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ENCLOSING_OPERAND = BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__FRAGMENT = BEHAVIOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lifeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__LIFELINE = BEHAVIOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ACTION = BEHAVIOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Formal Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__FORMAL_GATE = BEHAVIOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.LifelineImpl <em>Lifeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.LifelineImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getLifeline()
	 * @generated
	 */
	int LIFELINE = 8;

	/**
	 * The feature id for the '<em><b>Covered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__COVERED_BY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__INTERACTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__REPRESENTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__SELECTOR = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Decomposed As</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__DECOMPOSED_AS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.ConnectableElementImpl <em>Connectable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.ConnectableElementImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getConnectableElement()
	 * @generated
	 */
	int CONNECTABLE_ELEMENT = 9;

	/**
	 * The number of structural features of the '<em>Connectable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Connectable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.ValueSpecificationImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getValueSpecification()
	 * @generated
	 */
	int VALUE_SPECIFICATION = 10;

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
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.MessageImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 11;

	/**
	 * The feature id for the '<em><b>Message Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_KIND = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_SORT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ARGUMENT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CONNECTOR = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SIGNATURE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Send Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SEND_EVENT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Receive Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__RECEIVE_EVENT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.ConnectorImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 12;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.MessageEndImpl <em>Message End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.MessageEndImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getMessageEnd()
	 * @generated
	 */
	int MESSAGE_END = 13;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END__MESSAGE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.ExecutionOccurrenceSpecificationImpl <em>Execution Occurrence Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.ExecutionOccurrenceSpecificationImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getExecutionOccurrenceSpecification()
	 * @generated
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION = 14;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__COVERED = OCCURENCE_SPECIFICATION__COVERED;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING = OCCURENCE_SPECIFICATION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND = OCCURENCE_SPECIFICATION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>To Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__TO_BEFORE = OCCURENCE_SPECIFICATION__TO_BEFORE;

	/**
	 * The feature id for the '<em><b>To After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__TO_AFTER = OCCURENCE_SPECIFICATION__TO_AFTER;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION = OCCURENCE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execution Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION_FEATURE_COUNT = OCCURENCE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Execution Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION_OPERATION_COUNT = OCCURENCE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.MessageOccurrenceSpecificationImpl <em>Message Occurrence Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.MessageOccurrenceSpecificationImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getMessageOccurrenceSpecification()
	 * @generated
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION = 15;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__COVERED = OCCURENCE_SPECIFICATION__COVERED;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING = OCCURENCE_SPECIFICATION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND = OCCURENCE_SPECIFICATION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>To Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE = OCCURENCE_SPECIFICATION__TO_BEFORE;

	/**
	 * The feature id for the '<em><b>To After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER = OCCURENCE_SPECIFICATION__TO_AFTER;

	/**
	 * The number of structural features of the '<em>Message Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION_FEATURE_COUNT = OCCURENCE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION_OPERATION_COUNT = OCCURENCE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.DestructionOccurrenceSpecificationImpl <em>Destruction Occurrence Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.DestructionOccurrenceSpecificationImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getDestructionOccurrenceSpecification()
	 * @generated
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION = 16;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__COVERED = MESSAGE_OCCURRENCE_SPECIFICATION__COVERED;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING = MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND = MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>To Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__TO_BEFORE = MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE;

	/**
	 * The feature id for the '<em><b>To After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__TO_AFTER = MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER;

	/**
	 * The number of structural features of the '<em>Destruction Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION_FEATURE_COUNT = MESSAGE_OCCURRENCE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Destruction Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION_OPERATION_COUNT = MESSAGE_OCCURRENCE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.BehaviorExecutionSpecificationImpl <em>Behavior Execution Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.BehaviorExecutionSpecificationImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getBehaviorExecutionSpecification()
	 * @generated
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION = 17;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__COVERED = EXECUTION_SPECIFICATION__COVERED;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__GENERAL_ORDERING = EXECUTION_SPECIFICATION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND = EXECUTION_SPECIFICATION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__START = EXECUTION_SPECIFICATION__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__FINISH = EXECUTION_SPECIFICATION__FINISH;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR = EXECUTION_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behavior Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION_FEATURE_COUNT = EXECUTION_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Behavior Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION_OPERATION_COUNT = EXECUTION_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.ActionImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 18;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.ActionExecutionSpecificationImpl <em>Action Execution Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.ActionExecutionSpecificationImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getActionExecutionSpecification()
	 * @generated
	 */
	int ACTION_EXECUTION_SPECIFICATION = 19;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__COVERED = EXECUTION_SPECIFICATION__COVERED;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__GENERAL_ORDERING = EXECUTION_SPECIFICATION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND = EXECUTION_SPECIFICATION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__START = EXECUTION_SPECIFICATION__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__FINISH = EXECUTION_SPECIFICATION__FINISH;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__ACTION = EXECUTION_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION_FEATURE_COUNT = EXECUTION_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION_OPERATION_COUNT = EXECUTION_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.impl.GeneralOrderingImpl <em>General Ordering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.impl.GeneralOrderingImpl
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getGeneralOrdering()
	 * @generated
	 */
	int GENERAL_ORDERING = 20;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING__AFTER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING__BEFORE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>General Ordering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>General Ordering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.MessageKind <em>Message Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.MessageKind
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getMessageKind()
	 * @generated
	 */
	int MESSAGE_KIND = 21;

	/**
	 * The meta object id for the '{@link Interactions.BasicInteractions.MessageSort <em>Message Sort</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.BasicInteractions.MessageSort
	 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getMessageSort()
	 * @generated
	 */
	int MESSAGE_SORT = 22;


	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see Interactions.BasicInteractions.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.InteractionFragment <em>Interaction Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Fragment</em>'.
	 * @see Interactions.BasicInteractions.InteractionFragment
	 * @generated
	 */
	EClass getInteractionFragment();

	/**
	 * Returns the meta object for the reference list '{@link Interactions.BasicInteractions.InteractionFragment#getCovered <em>Covered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Covered</em>'.
	 * @see Interactions.BasicInteractions.InteractionFragment#getCovered()
	 * @see #getInteractionFragment()
	 * @generated
	 */
	EReference getInteractionFragment_Covered();

	/**
	 * Returns the meta object for the containment reference list '{@link Interactions.BasicInteractions.InteractionFragment#getGeneralOrdering <em>General Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>General Ordering</em>'.
	 * @see Interactions.BasicInteractions.InteractionFragment#getGeneralOrdering()
	 * @see #getInteractionFragment()
	 * @generated
	 */
	EReference getInteractionFragment_GeneralOrdering();

	/**
	 * Returns the meta object for the container reference '{@link Interactions.BasicInteractions.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enclosing Operand</em>'.
	 * @see Interactions.BasicInteractions.InteractionFragment#getEnclosingOperand()
	 * @see #getInteractionFragment()
	 * @generated
	 */
	EReference getInteractionFragment_EnclosingOperand();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.ExecutionSpecification <em>Execution Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Specification</em>'.
	 * @see Interactions.BasicInteractions.ExecutionSpecification
	 * @generated
	 */
	EClass getExecutionSpecification();

	/**
	 * Returns the meta object for the reference '{@link Interactions.BasicInteractions.ExecutionSpecification#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see Interactions.BasicInteractions.ExecutionSpecification#getStart()
	 * @see #getExecutionSpecification()
	 * @generated
	 */
	EReference getExecutionSpecification_Start();

	/**
	 * Returns the meta object for the reference '{@link Interactions.BasicInteractions.ExecutionSpecification#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Finish</em>'.
	 * @see Interactions.BasicInteractions.ExecutionSpecification#getFinish()
	 * @see #getExecutionSpecification()
	 * @generated
	 */
	EReference getExecutionSpecification_Finish();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.OccurenceSpecification <em>Occurence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occurence Specification</em>'.
	 * @see Interactions.BasicInteractions.OccurenceSpecification
	 * @generated
	 */
	EClass getOccurenceSpecification();

	/**
	 * Returns the meta object for the reference list '{@link Interactions.BasicInteractions.OccurenceSpecification#getToBefore <em>To Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Before</em>'.
	 * @see Interactions.BasicInteractions.OccurenceSpecification#getToBefore()
	 * @see #getOccurenceSpecification()
	 * @generated
	 */
	EReference getOccurenceSpecification_ToBefore();

	/**
	 * Returns the meta object for the reference list '{@link Interactions.BasicInteractions.OccurenceSpecification#getToAfter <em>To After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To After</em>'.
	 * @see Interactions.BasicInteractions.OccurenceSpecification#getToAfter()
	 * @see #getOccurenceSpecification()
	 * @generated
	 */
	EReference getOccurenceSpecification_ToAfter();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see Interactions.BasicInteractions.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.StateInvariant <em>State Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Invariant</em>'.
	 * @see Interactions.BasicInteractions.StateInvariant
	 * @generated
	 */
	EClass getStateInvariant();

	/**
	 * Returns the meta object for the containment reference '{@link Interactions.BasicInteractions.StateInvariant#getInvariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invariant</em>'.
	 * @see Interactions.BasicInteractions.StateInvariant#getInvariant()
	 * @see #getStateInvariant()
	 * @generated
	 */
	EReference getStateInvariant_Invariant();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see Interactions.BasicInteractions.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for the containment reference list '{@link Interactions.BasicInteractions.Interaction#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragment</em>'.
	 * @see Interactions.BasicInteractions.Interaction#getFragment()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Fragment();

	/**
	 * Returns the meta object for the containment reference list '{@link Interactions.BasicInteractions.Interaction#getLifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lifeline</em>'.
	 * @see Interactions.BasicInteractions.Interaction#getLifeline()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Lifeline();

	/**
	 * Returns the meta object for the containment reference list '{@link Interactions.BasicInteractions.Interaction#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see Interactions.BasicInteractions.Interaction#getAction()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link Interactions.BasicInteractions.Interaction#getFormalGate <em>Formal Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formal Gate</em>'.
	 * @see Interactions.BasicInteractions.Interaction#getFormalGate()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_FormalGate();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see Interactions.BasicInteractions.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.Lifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifeline</em>'.
	 * @see Interactions.BasicInteractions.Lifeline
	 * @generated
	 */
	EClass getLifeline();

	/**
	 * Returns the meta object for the reference list '{@link Interactions.BasicInteractions.Lifeline#getCoveredBy <em>Covered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Covered By</em>'.
	 * @see Interactions.BasicInteractions.Lifeline#getCoveredBy()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_CoveredBy();

	/**
	 * Returns the meta object for the container reference '{@link Interactions.BasicInteractions.Lifeline#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interaction</em>'.
	 * @see Interactions.BasicInteractions.Lifeline#getInteraction()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_Interaction();

	/**
	 * Returns the meta object for the reference '{@link Interactions.BasicInteractions.Lifeline#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represents</em>'.
	 * @see Interactions.BasicInteractions.Lifeline#getRepresents()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_Represents();

	/**
	 * Returns the meta object for the containment reference '{@link Interactions.BasicInteractions.Lifeline#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see Interactions.BasicInteractions.Lifeline#getSelector()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_Selector();

	/**
	 * Returns the meta object for the reference '{@link Interactions.BasicInteractions.Lifeline#getDecomposedAs <em>Decomposed As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decomposed As</em>'.
	 * @see Interactions.BasicInteractions.Lifeline#getDecomposedAs()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_DecomposedAs();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.ConnectableElement <em>Connectable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectable Element</em>'.
	 * @see Interactions.BasicInteractions.ConnectableElement
	 * @generated
	 */
	EClass getConnectableElement();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification</em>'.
	 * @see Interactions.BasicInteractions.ValueSpecification
	 * @generated
	 */
	EClass getValueSpecification();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see Interactions.BasicInteractions.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link Interactions.BasicInteractions.Message#getMessageKind <em>Message Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Kind</em>'.
	 * @see Interactions.BasicInteractions.Message#getMessageKind()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MessageKind();

	/**
	 * Returns the meta object for the attribute '{@link Interactions.BasicInteractions.Message#getMessageSort <em>Message Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Sort</em>'.
	 * @see Interactions.BasicInteractions.Message#getMessageSort()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MessageSort();

	/**
	 * Returns the meta object for the containment reference list '{@link Interactions.BasicInteractions.Message#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see Interactions.BasicInteractions.Message#getArgument()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Argument();

	/**
	 * Returns the meta object for the reference '{@link Interactions.BasicInteractions.Message#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see Interactions.BasicInteractions.Message#getConnector()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Connector();

	/**
	 * Returns the meta object for the reference '{@link Interactions.BasicInteractions.Message#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature</em>'.
	 * @see Interactions.BasicInteractions.Message#getSignature()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Signature();

	/**
	 * Returns the meta object for the reference '{@link Interactions.BasicInteractions.Message#getSendEvent <em>Send Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Send Event</em>'.
	 * @see Interactions.BasicInteractions.Message#getSendEvent()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_SendEvent();

	/**
	 * Returns the meta object for the reference '{@link Interactions.BasicInteractions.Message#getReceiveEvent <em>Receive Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receive Event</em>'.
	 * @see Interactions.BasicInteractions.Message#getReceiveEvent()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_ReceiveEvent();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see Interactions.BasicInteractions.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.MessageEnd <em>Message End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message End</em>'.
	 * @see Interactions.BasicInteractions.MessageEnd
	 * @generated
	 */
	EClass getMessageEnd();

	/**
	 * Returns the meta object for the reference '{@link Interactions.BasicInteractions.MessageEnd#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see Interactions.BasicInteractions.MessageEnd#getMessage()
	 * @see #getMessageEnd()
	 * @generated
	 */
	EReference getMessageEnd_Message();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.ExecutionOccurrenceSpecification <em>Execution Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Occurrence Specification</em>'.
	 * @see Interactions.BasicInteractions.ExecutionOccurrenceSpecification
	 * @generated
	 */
	EClass getExecutionOccurrenceSpecification();

	/**
	 * Returns the meta object for the reference '{@link Interactions.BasicInteractions.ExecutionOccurrenceSpecification#getExecution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Execution</em>'.
	 * @see Interactions.BasicInteractions.ExecutionOccurrenceSpecification#getExecution()
	 * @see #getExecutionOccurrenceSpecification()
	 * @generated
	 */
	EReference getExecutionOccurrenceSpecification_Execution();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.MessageOccurrenceSpecification <em>Message Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Occurrence Specification</em>'.
	 * @see Interactions.BasicInteractions.MessageOccurrenceSpecification
	 * @generated
	 */
	EClass getMessageOccurrenceSpecification();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.DestructionOccurrenceSpecification <em>Destruction Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destruction Occurrence Specification</em>'.
	 * @see Interactions.BasicInteractions.DestructionOccurrenceSpecification
	 * @generated
	 */
	EClass getDestructionOccurrenceSpecification();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.BehaviorExecutionSpecification <em>Behavior Execution Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Execution Specification</em>'.
	 * @see Interactions.BasicInteractions.BehaviorExecutionSpecification
	 * @generated
	 */
	EClass getBehaviorExecutionSpecification();

	/**
	 * Returns the meta object for the reference '{@link Interactions.BasicInteractions.BehaviorExecutionSpecification#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see Interactions.BasicInteractions.BehaviorExecutionSpecification#getBehavior()
	 * @see #getBehaviorExecutionSpecification()
	 * @generated
	 */
	EReference getBehaviorExecutionSpecification_Behavior();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see Interactions.BasicInteractions.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.ActionExecutionSpecification <em>Action Execution Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Execution Specification</em>'.
	 * @see Interactions.BasicInteractions.ActionExecutionSpecification
	 * @generated
	 */
	EClass getActionExecutionSpecification();

	/**
	 * Returns the meta object for the reference '{@link Interactions.BasicInteractions.ActionExecutionSpecification#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see Interactions.BasicInteractions.ActionExecutionSpecification#getAction()
	 * @see #getActionExecutionSpecification()
	 * @generated
	 */
	EReference getActionExecutionSpecification_Action();

	/**
	 * Returns the meta object for class '{@link Interactions.BasicInteractions.GeneralOrdering <em>General Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Ordering</em>'.
	 * @see Interactions.BasicInteractions.GeneralOrdering
	 * @generated
	 */
	EClass getGeneralOrdering();

	/**
	 * Returns the meta object for the reference '{@link Interactions.BasicInteractions.GeneralOrdering#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>After</em>'.
	 * @see Interactions.BasicInteractions.GeneralOrdering#getAfter()
	 * @see #getGeneralOrdering()
	 * @generated
	 */
	EReference getGeneralOrdering_After();

	/**
	 * Returns the meta object for the reference '{@link Interactions.BasicInteractions.GeneralOrdering#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Before</em>'.
	 * @see Interactions.BasicInteractions.GeneralOrdering#getBefore()
	 * @see #getGeneralOrdering()
	 * @generated
	 */
	EReference getGeneralOrdering_Before();

	/**
	 * Returns the meta object for enum '{@link Interactions.BasicInteractions.MessageKind <em>Message Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Kind</em>'.
	 * @see Interactions.BasicInteractions.MessageKind
	 * @generated
	 */
	EEnum getMessageKind();

	/**
	 * Returns the meta object for enum '{@link Interactions.BasicInteractions.MessageSort <em>Message Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Sort</em>'.
	 * @see Interactions.BasicInteractions.MessageSort
	 * @generated
	 */
	EEnum getMessageSort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicInteractionsFactory getBasicInteractionsFactory();

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
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.BehaviorImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.InteractionFragmentImpl <em>Interaction Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.InteractionFragmentImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getInteractionFragment()
		 * @generated
		 */
		EClass INTERACTION_FRAGMENT = eINSTANCE.getInteractionFragment();

		/**
		 * The meta object literal for the '<em><b>Covered</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FRAGMENT__COVERED = eINSTANCE.getInteractionFragment_Covered();

		/**
		 * The meta object literal for the '<em><b>General Ordering</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FRAGMENT__GENERAL_ORDERING = eINSTANCE.getInteractionFragment_GeneralOrdering();

		/**
		 * The meta object literal for the '<em><b>Enclosing Operand</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FRAGMENT__ENCLOSING_OPERAND = eINSTANCE.getInteractionFragment_EnclosingOperand();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.ExecutionSpecificationImpl <em>Execution Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.ExecutionSpecificationImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getExecutionSpecification()
		 * @generated
		 */
		EClass EXECUTION_SPECIFICATION = eINSTANCE.getExecutionSpecification();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_SPECIFICATION__START = eINSTANCE.getExecutionSpecification_Start();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_SPECIFICATION__FINISH = eINSTANCE.getExecutionSpecification_Finish();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.OccurenceSpecificationImpl <em>Occurence Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.OccurenceSpecificationImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getOccurenceSpecification()
		 * @generated
		 */
		EClass OCCURENCE_SPECIFICATION = eINSTANCE.getOccurenceSpecification();

		/**
		 * The meta object literal for the '<em><b>To Before</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCURENCE_SPECIFICATION__TO_BEFORE = eINSTANCE.getOccurenceSpecification_ToBefore();

		/**
		 * The meta object literal for the '<em><b>To After</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCURENCE_SPECIFICATION__TO_AFTER = eINSTANCE.getOccurenceSpecification_ToAfter();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.ConstraintImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.StateInvariantImpl <em>State Invariant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.StateInvariantImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getStateInvariant()
		 * @generated
		 */
		EClass STATE_INVARIANT = eINSTANCE.getStateInvariant();

		/**
		 * The meta object literal for the '<em><b>Invariant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_INVARIANT__INVARIANT = eINSTANCE.getStateInvariant_Invariant();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.InteractionImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '<em><b>Fragment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__FRAGMENT = eINSTANCE.getInteraction_Fragment();

		/**
		 * The meta object literal for the '<em><b>Lifeline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__LIFELINE = eINSTANCE.getInteraction_Lifeline();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__ACTION = eINSTANCE.getInteraction_Action();

		/**
		 * The meta object literal for the '<em><b>Formal Gate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__FORMAL_GATE = eINSTANCE.getInteraction_FormalGate();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.NamedElementImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.LifelineImpl <em>Lifeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.LifelineImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getLifeline()
		 * @generated
		 */
		EClass LIFELINE = eINSTANCE.getLifeline();

		/**
		 * The meta object literal for the '<em><b>Covered By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__COVERED_BY = eINSTANCE.getLifeline_CoveredBy();

		/**
		 * The meta object literal for the '<em><b>Interaction</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__INTERACTION = eINSTANCE.getLifeline_Interaction();

		/**
		 * The meta object literal for the '<em><b>Represents</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__REPRESENTS = eINSTANCE.getLifeline_Represents();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__SELECTOR = eINSTANCE.getLifeline_Selector();

		/**
		 * The meta object literal for the '<em><b>Decomposed As</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__DECOMPOSED_AS = eINSTANCE.getLifeline_DecomposedAs();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.ConnectableElementImpl <em>Connectable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.ConnectableElementImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getConnectableElement()
		 * @generated
		 */
		EClass CONNECTABLE_ELEMENT = eINSTANCE.getConnectableElement();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.ValueSpecificationImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getValueSpecification()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.MessageImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Message Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE_KIND = eINSTANCE.getMessage_MessageKind();

		/**
		 * The meta object literal for the '<em><b>Message Sort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE_SORT = eINSTANCE.getMessage_MessageSort();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__ARGUMENT = eINSTANCE.getMessage_Argument();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__CONNECTOR = eINSTANCE.getMessage_Connector();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SIGNATURE = eINSTANCE.getMessage_Signature();

		/**
		 * The meta object literal for the '<em><b>Send Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SEND_EVENT = eINSTANCE.getMessage_SendEvent();

		/**
		 * The meta object literal for the '<em><b>Receive Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__RECEIVE_EVENT = eINSTANCE.getMessage_ReceiveEvent();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.ConnectorImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.MessageEndImpl <em>Message End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.MessageEndImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getMessageEnd()
		 * @generated
		 */
		EClass MESSAGE_END = eINSTANCE.getMessageEnd();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_END__MESSAGE = eINSTANCE.getMessageEnd_Message();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.ExecutionOccurrenceSpecificationImpl <em>Execution Occurrence Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.ExecutionOccurrenceSpecificationImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getExecutionOccurrenceSpecification()
		 * @generated
		 */
		EClass EXECUTION_OCCURRENCE_SPECIFICATION = eINSTANCE.getExecutionOccurrenceSpecification();

		/**
		 * The meta object literal for the '<em><b>Execution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION = eINSTANCE.getExecutionOccurrenceSpecification_Execution();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.MessageOccurrenceSpecificationImpl <em>Message Occurrence Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.MessageOccurrenceSpecificationImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getMessageOccurrenceSpecification()
		 * @generated
		 */
		EClass MESSAGE_OCCURRENCE_SPECIFICATION = eINSTANCE.getMessageOccurrenceSpecification();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.DestructionOccurrenceSpecificationImpl <em>Destruction Occurrence Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.DestructionOccurrenceSpecificationImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getDestructionOccurrenceSpecification()
		 * @generated
		 */
		EClass DESTRUCTION_OCCURRENCE_SPECIFICATION = eINSTANCE.getDestructionOccurrenceSpecification();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.BehaviorExecutionSpecificationImpl <em>Behavior Execution Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.BehaviorExecutionSpecificationImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getBehaviorExecutionSpecification()
		 * @generated
		 */
		EClass BEHAVIOR_EXECUTION_SPECIFICATION = eINSTANCE.getBehaviorExecutionSpecification();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR = eINSTANCE.getBehaviorExecutionSpecification_Behavior();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.ActionImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.ActionExecutionSpecificationImpl <em>Action Execution Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.ActionExecutionSpecificationImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getActionExecutionSpecification()
		 * @generated
		 */
		EClass ACTION_EXECUTION_SPECIFICATION = eINSTANCE.getActionExecutionSpecification();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_EXECUTION_SPECIFICATION__ACTION = eINSTANCE.getActionExecutionSpecification_Action();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.impl.GeneralOrderingImpl <em>General Ordering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.impl.GeneralOrderingImpl
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getGeneralOrdering()
		 * @generated
		 */
		EClass GENERAL_ORDERING = eINSTANCE.getGeneralOrdering();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_ORDERING__AFTER = eINSTANCE.getGeneralOrdering_After();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_ORDERING__BEFORE = eINSTANCE.getGeneralOrdering_Before();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.MessageKind <em>Message Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.MessageKind
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getMessageKind()
		 * @generated
		 */
		EEnum MESSAGE_KIND = eINSTANCE.getMessageKind();

		/**
		 * The meta object literal for the '{@link Interactions.BasicInteractions.MessageSort <em>Message Sort</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.BasicInteractions.MessageSort
		 * @see Interactions.BasicInteractions.impl.BasicInteractionsPackageImpl#getMessageSort()
		 * @generated
		 */
		EEnum MESSAGE_SORT = eINSTANCE.getMessageSort();

	}

} //BasicInteractionsPackage

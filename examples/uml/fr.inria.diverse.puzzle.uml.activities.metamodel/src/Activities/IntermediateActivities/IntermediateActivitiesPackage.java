/**
 */
package Activities.IntermediateActivities;

import Activities.BasicActivities.BasicActivitiesPackage;

import Activities.FundamentalActivities.FundamentalActivitiesPackage;

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
 * @see Activities.IntermediateActivities.IntermediateActivitiesFactory
 * @model kind="package"
 * @generated
 */
public interface IntermediateActivitiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IntermediateActivities";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.puzzle.uml/Activities/IntermediateActivities";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IntermediateActivities";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermediateActivitiesPackage eINSTANCE = Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link Activities.IntermediateActivities.impl.CentralBufferNodeImpl <em>Central Buffer Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.IntermediateActivities.impl.CentralBufferNodeImpl
	 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getCentralBufferNode()
	 * @generated
	 */
	int CENTRAL_BUFFER_NODE = 0;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__REDEFINED_ELEMENT = BasicActivitiesPackage.OBJECT_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__IN_GROUP = BasicActivitiesPackage.OBJECT_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__REDEFINED_NODE = BasicActivitiesPackage.OBJECT_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__INCOMING = BasicActivitiesPackage.OBJECT_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__OUTGOING = BasicActivitiesPackage.OBJECT_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__IN_PARTITION = BasicActivitiesPackage.OBJECT_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__IN_INTERRUPTIBLE_REGION = BasicActivitiesPackage.OBJECT_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__IN_STRUCTURED_NODE = BasicActivitiesPackage.OBJECT_NODE__IN_STRUCTURED_NODE;

	/**
	 * The number of structural features of the '<em>Central Buffer Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE_FEATURE_COUNT = BasicActivitiesPackage.OBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Central Buffer Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE_OPERATION_COUNT = BasicActivitiesPackage.OBJECT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.IntermediateActivities.impl.FinalNodeImpl <em>Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.IntermediateActivities.impl.FinalNodeImpl
	 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getFinalNode()
	 * @generated
	 */
	int FINAL_NODE = 1;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__REDEFINED_ELEMENT = BasicActivitiesPackage.CONTROL_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__IN_GROUP = BasicActivitiesPackage.CONTROL_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__REDEFINED_NODE = BasicActivitiesPackage.CONTROL_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__INCOMING = BasicActivitiesPackage.CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__OUTGOING = BasicActivitiesPackage.CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__IN_PARTITION = BasicActivitiesPackage.CONTROL_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__IN_INTERRUPTIBLE_REGION = BasicActivitiesPackage.CONTROL_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__IN_STRUCTURED_NODE = BasicActivitiesPackage.CONTROL_NODE__IN_STRUCTURED_NODE;

	/**
	 * The number of structural features of the '<em>Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_FEATURE_COUNT = BasicActivitiesPackage.CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_OPERATION_COUNT = BasicActivitiesPackage.CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.IntermediateActivities.impl.FlowFinalNodeImpl <em>Flow Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.IntermediateActivities.impl.FlowFinalNodeImpl
	 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getFlowFinalNode()
	 * @generated
	 */
	int FLOW_FINAL_NODE = 2;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__REDEFINED_ELEMENT = FINAL_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__IN_GROUP = FINAL_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__REDEFINED_NODE = FINAL_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__INCOMING = FINAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__OUTGOING = FINAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__IN_PARTITION = FINAL_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__IN_INTERRUPTIBLE_REGION = FINAL_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__IN_STRUCTURED_NODE = FINAL_NODE__IN_STRUCTURED_NODE;

	/**
	 * The number of structural features of the '<em>Flow Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_FEATURE_COUNT = FINAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flow Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_OPERATION_COUNT = FINAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.IntermediateActivities.impl.ForkNodeImpl <em>Fork Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.IntermediateActivities.impl.ForkNodeImpl
	 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getForkNode()
	 * @generated
	 */
	int FORK_NODE = 3;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__REDEFINED_ELEMENT = BasicActivitiesPackage.CONTROL_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__IN_GROUP = BasicActivitiesPackage.CONTROL_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__REDEFINED_NODE = BasicActivitiesPackage.CONTROL_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__INCOMING = BasicActivitiesPackage.CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__OUTGOING = BasicActivitiesPackage.CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__IN_PARTITION = BasicActivitiesPackage.CONTROL_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__IN_INTERRUPTIBLE_REGION = BasicActivitiesPackage.CONTROL_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__IN_STRUCTURED_NODE = BasicActivitiesPackage.CONTROL_NODE__IN_STRUCTURED_NODE;

	/**
	 * The number of structural features of the '<em>Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_FEATURE_COUNT = BasicActivitiesPackage.CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_OPERATION_COUNT = BasicActivitiesPackage.CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.IntermediateActivities.impl.JoinNodeImpl <em>Join Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.IntermediateActivities.impl.JoinNodeImpl
	 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getJoinNode()
	 * @generated
	 */
	int JOIN_NODE = 4;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__REDEFINED_ELEMENT = BasicActivitiesPackage.CONTROL_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__IN_GROUP = BasicActivitiesPackage.CONTROL_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__REDEFINED_NODE = BasicActivitiesPackage.CONTROL_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__INCOMING = BasicActivitiesPackage.CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__OUTGOING = BasicActivitiesPackage.CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__IN_PARTITION = BasicActivitiesPackage.CONTROL_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__IN_INTERRUPTIBLE_REGION = BasicActivitiesPackage.CONTROL_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__IN_STRUCTURED_NODE = BasicActivitiesPackage.CONTROL_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Is Combine Duplicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__IS_COMBINE_DUPLICATE = BasicActivitiesPackage.CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__JOIN_SPEC = BasicActivitiesPackage.CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_FEATURE_COUNT = BasicActivitiesPackage.CONTROL_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_OPERATION_COUNT = BasicActivitiesPackage.CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.IntermediateActivities.impl.MergeNodeImpl <em>Merge Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.IntermediateActivities.impl.MergeNodeImpl
	 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getMergeNode()
	 * @generated
	 */
	int MERGE_NODE = 5;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__REDEFINED_ELEMENT = BasicActivitiesPackage.CONTROL_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__IN_GROUP = BasicActivitiesPackage.CONTROL_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__REDEFINED_NODE = BasicActivitiesPackage.CONTROL_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__INCOMING = BasicActivitiesPackage.CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__OUTGOING = BasicActivitiesPackage.CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__IN_PARTITION = BasicActivitiesPackage.CONTROL_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__IN_INTERRUPTIBLE_REGION = BasicActivitiesPackage.CONTROL_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__IN_STRUCTURED_NODE = BasicActivitiesPackage.CONTROL_NODE__IN_STRUCTURED_NODE;

	/**
	 * The number of structural features of the '<em>Merge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_FEATURE_COUNT = BasicActivitiesPackage.CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_OPERATION_COUNT = BasicActivitiesPackage.CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.IntermediateActivities.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.IntermediateActivities.impl.DecisionNodeImpl
	 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getDecisionNode()
	 * @generated
	 */
	int DECISION_NODE = 6;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__REDEFINED_ELEMENT = BasicActivitiesPackage.CONTROL_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__IN_GROUP = BasicActivitiesPackage.CONTROL_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__REDEFINED_NODE = BasicActivitiesPackage.CONTROL_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__INCOMING = BasicActivitiesPackage.CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__OUTGOING = BasicActivitiesPackage.CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__IN_PARTITION = BasicActivitiesPackage.CONTROL_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__IN_INTERRUPTIBLE_REGION = BasicActivitiesPackage.CONTROL_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__IN_STRUCTURED_NODE = BasicActivitiesPackage.CONTROL_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Decision Input Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__DECISION_INPUT_FLOW = BasicActivitiesPackage.CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decision Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__DECISION_INPUT = BasicActivitiesPackage.CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decision Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_FEATURE_COUNT = BasicActivitiesPackage.CONTROL_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Decision Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_OPERATION_COUNT = BasicActivitiesPackage.CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.IntermediateActivities.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.IntermediateActivities.impl.ValueSpecificationImpl
	 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getValueSpecification()
	 * @generated
	 */
	int VALUE_SPECIFICATION = 7;

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
	 * The meta object id for the '{@link Activities.IntermediateActivities.impl.ActivityPartitionImpl <em>Activity Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.IntermediateActivities.impl.ActivityPartitionImpl
	 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getActivityPartition()
	 * @generated
	 */
	int ACTIVITY_PARTITION = 8;

	/**
	 * The feature id for the '<em><b>Subgroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__SUBGROUP = FundamentalActivitiesPackage.ACTIVITY_GROUP__SUBGROUP;

	/**
	 * The feature id for the '<em><b>Super Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__SUPER_GROUP = FundamentalActivitiesPackage.ACTIVITY_GROUP__SUPER_GROUP;

	/**
	 * The feature id for the '<em><b>In Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__IN_ACTIVITY = FundamentalActivitiesPackage.ACTIVITY_GROUP__IN_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__CONTAINED_NODE = FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_NODE;

	/**
	 * The feature id for the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__CONTAINED_EDGE = FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_EDGE;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__EDGE = FundamentalActivitiesPackage.ACTIVITY_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subpartition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__SUBPARTITION = FundamentalActivitiesPackage.ACTIVITY_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Partition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__SUPER_PARTITION = FundamentalActivitiesPackage.ACTIVITY_GROUP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__REPRESENTS = FundamentalActivitiesPackage.ACTIVITY_GROUP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__NODE = FundamentalActivitiesPackage.ACTIVITY_GROUP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION_FEATURE_COUNT = FundamentalActivitiesPackage.ACTIVITY_GROUP_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Activity Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION_OPERATION_COUNT = FundamentalActivitiesPackage.ACTIVITY_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.IntermediateActivities.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.IntermediateActivities.impl.ElementImpl
	 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 9;

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
	 * The meta object id for the '{@link Activities.IntermediateActivities.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.IntermediateActivities.impl.ConstraintImpl
	 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 10;

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
	 * The meta object id for the '{@link Activities.IntermediateActivities.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.IntermediateActivities.impl.StateImpl
	 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getState()
	 * @generated
	 */
	int STATE = 11;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Activities.IntermediateActivities.impl.DataStoreNodeImpl <em>Data Store Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.IntermediateActivities.impl.DataStoreNodeImpl
	 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getDataStoreNode()
	 * @generated
	 */
	int DATA_STORE_NODE = 12;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__REDEFINED_ELEMENT = CENTRAL_BUFFER_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__IN_GROUP = CENTRAL_BUFFER_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__REDEFINED_NODE = CENTRAL_BUFFER_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__INCOMING = CENTRAL_BUFFER_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__OUTGOING = CENTRAL_BUFFER_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__IN_PARTITION = CENTRAL_BUFFER_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__IN_INTERRUPTIBLE_REGION = CENTRAL_BUFFER_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__IN_STRUCTURED_NODE = CENTRAL_BUFFER_NODE__IN_STRUCTURED_NODE;

	/**
	 * The number of structural features of the '<em>Data Store Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE_FEATURE_COUNT = CENTRAL_BUFFER_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Store Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE_OPERATION_COUNT = CENTRAL_BUFFER_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.IntermediateActivities.impl.ParameterSetImpl <em>Parameter Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.IntermediateActivities.impl.ParameterSetImpl
	 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getParameterSet()
	 * @generated
	 */
	int PARAMETER_SET = 13;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET__PARAMETER = FundamentalActivitiesPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET__CONDITION = FundamentalActivitiesPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_FEATURE_COUNT = FundamentalActivitiesPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_OPERATION_COUNT = FundamentalActivitiesPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.IntermediateActivities.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.IntermediateActivities.impl.BehavioralFeatureImpl
	 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getBehavioralFeature()
	 * @generated
	 */
	int BEHAVIORAL_FEATURE = 14;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behavioral Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_FEATURE_COUNT = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Behavioral Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_OPERATION_COUNT = FundamentalActivitiesPackage.NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.IntermediateActivities.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.IntermediateActivities.impl.FeatureImpl
	 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 15;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Activities.IntermediateActivities.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.IntermediateActivities.impl.ClassImpl
	 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 16;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Activities.IntermediateActivities.impl.InterruptibleActivityRegionImpl <em>Interruptible Activity Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.IntermediateActivities.impl.InterruptibleActivityRegionImpl
	 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getInterruptibleActivityRegion()
	 * @generated
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION = 17;

	/**
	 * The feature id for the '<em><b>Subgroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__SUBGROUP = FundamentalActivitiesPackage.ACTIVITY_GROUP__SUBGROUP;

	/**
	 * The feature id for the '<em><b>Super Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__SUPER_GROUP = FundamentalActivitiesPackage.ACTIVITY_GROUP__SUPER_GROUP;

	/**
	 * The feature id for the '<em><b>In Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__IN_ACTIVITY = FundamentalActivitiesPackage.ACTIVITY_GROUP__IN_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE = FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_NODE;

	/**
	 * The feature id for the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_EDGE = FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_EDGE;

	/**
	 * The feature id for the '<em><b>Interrupting Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE = FundamentalActivitiesPackage.ACTIVITY_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__NODE = FundamentalActivitiesPackage.ACTIVITY_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interruptible Activity Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION_FEATURE_COUNT = FundamentalActivitiesPackage.ACTIVITY_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interruptible Activity Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION_OPERATION_COUNT = FundamentalActivitiesPackage.ACTIVITY_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.IntermediateActivities.ParameterEffectKind <em>Parameter Effect Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.IntermediateActivities.ParameterEffectKind
	 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getParameterEffectKind()
	 * @generated
	 */
	int PARAMETER_EFFECT_KIND = 18;


	/**
	 * Returns the meta object for class '{@link Activities.IntermediateActivities.CentralBufferNode <em>Central Buffer Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Central Buffer Node</em>'.
	 * @see Activities.IntermediateActivities.CentralBufferNode
	 * @generated
	 */
	EClass getCentralBufferNode();

	/**
	 * Returns the meta object for class '{@link Activities.IntermediateActivities.FinalNode <em>Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node</em>'.
	 * @see Activities.IntermediateActivities.FinalNode
	 * @generated
	 */
	EClass getFinalNode();

	/**
	 * Returns the meta object for class '{@link Activities.IntermediateActivities.FlowFinalNode <em>Flow Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Final Node</em>'.
	 * @see Activities.IntermediateActivities.FlowFinalNode
	 * @generated
	 */
	EClass getFlowFinalNode();

	/**
	 * Returns the meta object for class '{@link Activities.IntermediateActivities.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node</em>'.
	 * @see Activities.IntermediateActivities.ForkNode
	 * @generated
	 */
	EClass getForkNode();

	/**
	 * Returns the meta object for class '{@link Activities.IntermediateActivities.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node</em>'.
	 * @see Activities.IntermediateActivities.JoinNode
	 * @generated
	 */
	EClass getJoinNode();

	/**
	 * Returns the meta object for the attribute '{@link Activities.IntermediateActivities.JoinNode#isIsCombineDuplicate <em>Is Combine Duplicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Combine Duplicate</em>'.
	 * @see Activities.IntermediateActivities.JoinNode#isIsCombineDuplicate()
	 * @see #getJoinNode()
	 * @generated
	 */
	EAttribute getJoinNode_IsCombineDuplicate();

	/**
	 * Returns the meta object for the containment reference '{@link Activities.IntermediateActivities.JoinNode#getJoinSpec <em>Join Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Spec</em>'.
	 * @see Activities.IntermediateActivities.JoinNode#getJoinSpec()
	 * @see #getJoinNode()
	 * @generated
	 */
	EReference getJoinNode_JoinSpec();

	/**
	 * Returns the meta object for class '{@link Activities.IntermediateActivities.MergeNode <em>Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node</em>'.
	 * @see Activities.IntermediateActivities.MergeNode
	 * @generated
	 */
	EClass getMergeNode();

	/**
	 * Returns the meta object for class '{@link Activities.IntermediateActivities.DecisionNode <em>Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node</em>'.
	 * @see Activities.IntermediateActivities.DecisionNode
	 * @generated
	 */
	EClass getDecisionNode();

	/**
	 * Returns the meta object for the reference '{@link Activities.IntermediateActivities.DecisionNode#getDecisionInputFlow <em>Decision Input Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decision Input Flow</em>'.
	 * @see Activities.IntermediateActivities.DecisionNode#getDecisionInputFlow()
	 * @see #getDecisionNode()
	 * @generated
	 */
	EReference getDecisionNode_DecisionInputFlow();

	/**
	 * Returns the meta object for the reference '{@link Activities.IntermediateActivities.DecisionNode#getDecisionInput <em>Decision Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decision Input</em>'.
	 * @see Activities.IntermediateActivities.DecisionNode#getDecisionInput()
	 * @see #getDecisionNode()
	 * @generated
	 */
	EReference getDecisionNode_DecisionInput();

	/**
	 * Returns the meta object for class '{@link Activities.IntermediateActivities.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification</em>'.
	 * @see Activities.IntermediateActivities.ValueSpecification
	 * @generated
	 */
	EClass getValueSpecification();

	/**
	 * Returns the meta object for class '{@link Activities.IntermediateActivities.ActivityPartition <em>Activity Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Partition</em>'.
	 * @see Activities.IntermediateActivities.ActivityPartition
	 * @generated
	 */
	EClass getActivityPartition();

	/**
	 * Returns the meta object for the reference list '{@link Activities.IntermediateActivities.ActivityPartition#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edge</em>'.
	 * @see Activities.IntermediateActivities.ActivityPartition#getEdge()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EReference getActivityPartition_Edge();

	/**
	 * Returns the meta object for the containment reference list '{@link Activities.IntermediateActivities.ActivityPartition#getSubpartition <em>Subpartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subpartition</em>'.
	 * @see Activities.IntermediateActivities.ActivityPartition#getSubpartition()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EReference getActivityPartition_Subpartition();

	/**
	 * Returns the meta object for the container reference '{@link Activities.IntermediateActivities.ActivityPartition#getSuperPartition <em>Super Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Super Partition</em>'.
	 * @see Activities.IntermediateActivities.ActivityPartition#getSuperPartition()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EReference getActivityPartition_SuperPartition();

	/**
	 * Returns the meta object for the reference '{@link Activities.IntermediateActivities.ActivityPartition#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represents</em>'.
	 * @see Activities.IntermediateActivities.ActivityPartition#getRepresents()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EReference getActivityPartition_Represents();

	/**
	 * Returns the meta object for the reference list '{@link Activities.IntermediateActivities.ActivityPartition#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node</em>'.
	 * @see Activities.IntermediateActivities.ActivityPartition#getNode()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EReference getActivityPartition_Node();

	/**
	 * Returns the meta object for class '{@link Activities.IntermediateActivities.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see Activities.IntermediateActivities.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link Activities.IntermediateActivities.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see Activities.IntermediateActivities.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link Activities.IntermediateActivities.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see Activities.IntermediateActivities.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for class '{@link Activities.IntermediateActivities.DataStoreNode <em>Data Store Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Store Node</em>'.
	 * @see Activities.IntermediateActivities.DataStoreNode
	 * @generated
	 */
	EClass getDataStoreNode();

	/**
	 * Returns the meta object for class '{@link Activities.IntermediateActivities.ParameterSet <em>Parameter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Set</em>'.
	 * @see Activities.IntermediateActivities.ParameterSet
	 * @generated
	 */
	EClass getParameterSet();

	/**
	 * Returns the meta object for the reference list '{@link Activities.IntermediateActivities.ParameterSet#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see Activities.IntermediateActivities.ParameterSet#getParameter()
	 * @see #getParameterSet()
	 * @generated
	 */
	EReference getParameterSet_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link Activities.IntermediateActivities.ParameterSet#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see Activities.IntermediateActivities.ParameterSet#getCondition()
	 * @see #getParameterSet()
	 * @generated
	 */
	EReference getParameterSet_Condition();

	/**
	 * Returns the meta object for class '{@link Activities.IntermediateActivities.BehavioralFeature <em>Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Feature</em>'.
	 * @see Activities.IntermediateActivities.BehavioralFeature
	 * @generated
	 */
	EClass getBehavioralFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link Activities.IntermediateActivities.BehavioralFeature#getOwnedParameterSet <em>Owned Parameter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameter Set</em>'.
	 * @see Activities.IntermediateActivities.BehavioralFeature#getOwnedParameterSet()
	 * @see #getBehavioralFeature()
	 * @generated
	 */
	EReference getBehavioralFeature_OwnedParameterSet();

	/**
	 * Returns the meta object for class '{@link Activities.IntermediateActivities.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see Activities.IntermediateActivities.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for class '{@link Activities.IntermediateActivities.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see Activities.IntermediateActivities.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for class '{@link Activities.IntermediateActivities.InterruptibleActivityRegion <em>Interruptible Activity Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interruptible Activity Region</em>'.
	 * @see Activities.IntermediateActivities.InterruptibleActivityRegion
	 * @generated
	 */
	EClass getInterruptibleActivityRegion();

	/**
	 * Returns the meta object for the reference list '{@link Activities.IntermediateActivities.InterruptibleActivityRegion#getInterruptingEdge <em>Interrupting Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interrupting Edge</em>'.
	 * @see Activities.IntermediateActivities.InterruptibleActivityRegion#getInterruptingEdge()
	 * @see #getInterruptibleActivityRegion()
	 * @generated
	 */
	EReference getInterruptibleActivityRegion_InterruptingEdge();

	/**
	 * Returns the meta object for the reference list '{@link Activities.IntermediateActivities.InterruptibleActivityRegion#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node</em>'.
	 * @see Activities.IntermediateActivities.InterruptibleActivityRegion#getNode()
	 * @see #getInterruptibleActivityRegion()
	 * @generated
	 */
	EReference getInterruptibleActivityRegion_Node();

	/**
	 * Returns the meta object for enum '{@link Activities.IntermediateActivities.ParameterEffectKind <em>Parameter Effect Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Effect Kind</em>'.
	 * @see Activities.IntermediateActivities.ParameterEffectKind
	 * @generated
	 */
	EEnum getParameterEffectKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntermediateActivitiesFactory getIntermediateActivitiesFactory();

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
		 * The meta object literal for the '{@link Activities.IntermediateActivities.impl.CentralBufferNodeImpl <em>Central Buffer Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.IntermediateActivities.impl.CentralBufferNodeImpl
		 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getCentralBufferNode()
		 * @generated
		 */
		EClass CENTRAL_BUFFER_NODE = eINSTANCE.getCentralBufferNode();

		/**
		 * The meta object literal for the '{@link Activities.IntermediateActivities.impl.FinalNodeImpl <em>Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.IntermediateActivities.impl.FinalNodeImpl
		 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getFinalNode()
		 * @generated
		 */
		EClass FINAL_NODE = eINSTANCE.getFinalNode();

		/**
		 * The meta object literal for the '{@link Activities.IntermediateActivities.impl.FlowFinalNodeImpl <em>Flow Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.IntermediateActivities.impl.FlowFinalNodeImpl
		 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getFlowFinalNode()
		 * @generated
		 */
		EClass FLOW_FINAL_NODE = eINSTANCE.getFlowFinalNode();

		/**
		 * The meta object literal for the '{@link Activities.IntermediateActivities.impl.ForkNodeImpl <em>Fork Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.IntermediateActivities.impl.ForkNodeImpl
		 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getForkNode()
		 * @generated
		 */
		EClass FORK_NODE = eINSTANCE.getForkNode();

		/**
		 * The meta object literal for the '{@link Activities.IntermediateActivities.impl.JoinNodeImpl <em>Join Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.IntermediateActivities.impl.JoinNodeImpl
		 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getJoinNode()
		 * @generated
		 */
		EClass JOIN_NODE = eINSTANCE.getJoinNode();

		/**
		 * The meta object literal for the '<em><b>Is Combine Duplicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_NODE__IS_COMBINE_DUPLICATE = eINSTANCE.getJoinNode_IsCombineDuplicate();

		/**
		 * The meta object literal for the '<em><b>Join Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_NODE__JOIN_SPEC = eINSTANCE.getJoinNode_JoinSpec();

		/**
		 * The meta object literal for the '{@link Activities.IntermediateActivities.impl.MergeNodeImpl <em>Merge Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.IntermediateActivities.impl.MergeNodeImpl
		 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getMergeNode()
		 * @generated
		 */
		EClass MERGE_NODE = eINSTANCE.getMergeNode();

		/**
		 * The meta object literal for the '{@link Activities.IntermediateActivities.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.IntermediateActivities.impl.DecisionNodeImpl
		 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getDecisionNode()
		 * @generated
		 */
		EClass DECISION_NODE = eINSTANCE.getDecisionNode();

		/**
		 * The meta object literal for the '<em><b>Decision Input Flow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_NODE__DECISION_INPUT_FLOW = eINSTANCE.getDecisionNode_DecisionInputFlow();

		/**
		 * The meta object literal for the '<em><b>Decision Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_NODE__DECISION_INPUT = eINSTANCE.getDecisionNode_DecisionInput();

		/**
		 * The meta object literal for the '{@link Activities.IntermediateActivities.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.IntermediateActivities.impl.ValueSpecificationImpl
		 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getValueSpecification()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

		/**
		 * The meta object literal for the '{@link Activities.IntermediateActivities.impl.ActivityPartitionImpl <em>Activity Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.IntermediateActivities.impl.ActivityPartitionImpl
		 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getActivityPartition()
		 * @generated
		 */
		EClass ACTIVITY_PARTITION = eINSTANCE.getActivityPartition();

		/**
		 * The meta object literal for the '<em><b>Edge</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARTITION__EDGE = eINSTANCE.getActivityPartition_Edge();

		/**
		 * The meta object literal for the '<em><b>Subpartition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARTITION__SUBPARTITION = eINSTANCE.getActivityPartition_Subpartition();

		/**
		 * The meta object literal for the '<em><b>Super Partition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARTITION__SUPER_PARTITION = eINSTANCE.getActivityPartition_SuperPartition();

		/**
		 * The meta object literal for the '<em><b>Represents</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARTITION__REPRESENTS = eINSTANCE.getActivityPartition_Represents();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARTITION__NODE = eINSTANCE.getActivityPartition_Node();

		/**
		 * The meta object literal for the '{@link Activities.IntermediateActivities.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.IntermediateActivities.impl.ElementImpl
		 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link Activities.IntermediateActivities.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.IntermediateActivities.impl.ConstraintImpl
		 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link Activities.IntermediateActivities.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.IntermediateActivities.impl.StateImpl
		 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link Activities.IntermediateActivities.impl.DataStoreNodeImpl <em>Data Store Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.IntermediateActivities.impl.DataStoreNodeImpl
		 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getDataStoreNode()
		 * @generated
		 */
		EClass DATA_STORE_NODE = eINSTANCE.getDataStoreNode();

		/**
		 * The meta object literal for the '{@link Activities.IntermediateActivities.impl.ParameterSetImpl <em>Parameter Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.IntermediateActivities.impl.ParameterSetImpl
		 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getParameterSet()
		 * @generated
		 */
		EClass PARAMETER_SET = eINSTANCE.getParameterSet();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_SET__PARAMETER = eINSTANCE.getParameterSet_Parameter();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_SET__CONDITION = eINSTANCE.getParameterSet_Condition();

		/**
		 * The meta object literal for the '{@link Activities.IntermediateActivities.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.IntermediateActivities.impl.BehavioralFeatureImpl
		 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getBehavioralFeature()
		 * @generated
		 */
		EClass BEHAVIORAL_FEATURE = eINSTANCE.getBehavioralFeature();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET = eINSTANCE.getBehavioralFeature_OwnedParameterSet();

		/**
		 * The meta object literal for the '{@link Activities.IntermediateActivities.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.IntermediateActivities.impl.FeatureImpl
		 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '{@link Activities.IntermediateActivities.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.IntermediateActivities.impl.ClassImpl
		 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '{@link Activities.IntermediateActivities.impl.InterruptibleActivityRegionImpl <em>Interruptible Activity Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.IntermediateActivities.impl.InterruptibleActivityRegionImpl
		 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getInterruptibleActivityRegion()
		 * @generated
		 */
		EClass INTERRUPTIBLE_ACTIVITY_REGION = eINSTANCE.getInterruptibleActivityRegion();

		/**
		 * The meta object literal for the '<em><b>Interrupting Edge</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE = eINSTANCE.getInterruptibleActivityRegion_InterruptingEdge();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERRUPTIBLE_ACTIVITY_REGION__NODE = eINSTANCE.getInterruptibleActivityRegion_Node();

		/**
		 * The meta object literal for the '{@link Activities.IntermediateActivities.ParameterEffectKind <em>Parameter Effect Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.IntermediateActivities.ParameterEffectKind
		 * @see Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getParameterEffectKind()
		 * @generated
		 */
		EEnum PARAMETER_EFFECT_KIND = eINSTANCE.getParameterEffectKind();

	}

} //IntermediateActivitiesPackage

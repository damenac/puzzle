/**
 */
package Activities.StructuredActivities;

import Activities.FundamentalActivities.FundamentalActivitiesPackage;

import Activities.IntermediateActivities.IntermediateActivitiesPackage;

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
 * @see Activities.StructuredActivities.StructuredActivitiesFactory
 * @model kind="package"
 * @generated
 */
public interface StructuredActivitiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "StructuredActivities";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.puzzle.uml/Activities/StructuredActivities";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "StructuredActivities";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructuredActivitiesPackage eINSTANCE = Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl <em>Structured Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.StructuredActivities.impl.StructuredActivityNodeImpl
	 * @see Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl#getStructuredActivityNode()
	 * @generated
	 */
	int STRUCTURED_ACTIVITY_NODE = 0;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__IN_GROUP = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__INCOMING = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OUTGOING = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__IN_PARTITION = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__HANDLER = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Subgroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__SUBGROUP = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Super Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__SUPER_GROUP = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>In Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__IS_LOCALLY_REENTRANT = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__INPUT = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OUTPUT = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__ACTIVITY = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__VARIABLE = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__NODE = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__EDGE = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Structured Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT = FundamentalActivitiesPackage.NAMESPACE_FEATURE_COUNT + 26;

	/**
	 * The number of operations of the '<em>Structured Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE_OPERATION_COUNT = FundamentalActivitiesPackage.NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.StructuredActivities.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.StructuredActivities.impl.ExecutableNodeImpl
	 * @see Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl#getExecutableNode()
	 * @generated
	 */
	int EXECUTABLE_NODE = 1;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__REDEFINED_ELEMENT = FundamentalActivitiesPackage.ACTIVITY_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__IN_GROUP = FundamentalActivitiesPackage.ACTIVITY_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__REDEFINED_NODE = FundamentalActivitiesPackage.ACTIVITY_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__INCOMING = FundamentalActivitiesPackage.ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OUTGOING = FundamentalActivitiesPackage.ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__IN_PARTITION = FundamentalActivitiesPackage.ACTIVITY_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__IN_INTERRUPTIBLE_REGION = FundamentalActivitiesPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__IN_STRUCTURED_NODE = FundamentalActivitiesPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__HANDLER = FundamentalActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Executable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_FEATURE_COUNT = FundamentalActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Executable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_OPERATION_COUNT = FundamentalActivitiesPackage.ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.StructuredActivities.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.StructuredActivities.impl.MultiplicityElementImpl
	 * @see Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl#getMultiplicityElement()
	 * @generated
	 */
	int MULTIPLICITY_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Activities.StructuredActivities.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.StructuredActivities.impl.VariableImpl
	 * @see Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = MULTIPLICITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.StructuredActivities.impl.LoopNodeImpl <em>Loop Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.StructuredActivities.impl.LoopNodeImpl
	 * @see Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl#getLoopNode()
	 * @generated
	 */
	int LOOP_NODE = 4;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__REDEFINED_ELEMENT = STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__IN_GROUP = STRUCTURED_ACTIVITY_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__REDEFINED_NODE = STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__INCOMING = STRUCTURED_ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__OUTGOING = STRUCTURED_ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__IN_PARTITION = STRUCTURED_ACTIVITY_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__IN_INTERRUPTIBLE_REGION = STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__IN_STRUCTURED_NODE = STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__HANDLER = STRUCTURED_ACTIVITY_NODE__HANDLER;

	/**
	 * The feature id for the '<em><b>Subgroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__SUBGROUP = STRUCTURED_ACTIVITY_NODE__SUBGROUP;

	/**
	 * The feature id for the '<em><b>Super Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__SUPER_GROUP = STRUCTURED_ACTIVITY_NODE__SUPER_GROUP;

	/**
	 * The feature id for the '<em><b>In Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__IN_ACTIVITY = STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__CONTAINED_NODE = STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE;

	/**
	 * The feature id for the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__CONTAINED_EDGE = STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__IS_LOCALLY_REENTRANT = STRUCTURED_ACTIVITY_NODE__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__LOCAL_PRECONDITION = STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__LOCAL_POSTCONDITION = STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__INPUT = STRUCTURED_ACTIVITY_NODE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__OUTPUT = STRUCTURED_ACTIVITY_NODE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__ACTIVITY = STRUCTURED_ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__VARIABLE = STRUCTURED_ACTIVITY_NODE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__NODE = STRUCTURED_ACTIVITY_NODE__NODE;

	/**
	 * The feature id for the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__STRUCTURED_NODE_INPUT = STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__EDGE = STRUCTURED_ACTIVITY_NODE__EDGE;

	/**
	 * The feature id for the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__MUST_ISOLATE = STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE;

	/**
	 * The feature id for the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__STRUCTURED_NODE_OUTPUT = STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Tested First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__IS_TESTED_FIRST = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Setup Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__SETUP_PART = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__BODY_PART = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__TEST = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Decider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__DECIDER = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Loop Variable Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__LOOP_VARIABLE_INPUT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Loop Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__LOOP_VARIABLE = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Body Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__BODY_OUTPUT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__RESULT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Loop Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE_FEATURE_COUNT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Loop Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE_OPERATION_COUNT = STRUCTURED_ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.StructuredActivities.impl.OutputPinImpl <em>Output Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.StructuredActivities.impl.OutputPinImpl
	 * @see Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl#getOutputPin()
	 * @generated
	 */
	int OUTPUT_PIN = 5;

	/**
	 * The number of structural features of the '<em>Output Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Output Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Activities.StructuredActivities.impl.ConditionalNodeImpl <em>Conditional Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.StructuredActivities.impl.ConditionalNodeImpl
	 * @see Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl#getConditionalNode()
	 * @generated
	 */
	int CONDITIONAL_NODE = 6;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__REDEFINED_ELEMENT = STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__IN_GROUP = STRUCTURED_ACTIVITY_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__REDEFINED_NODE = STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__INCOMING = STRUCTURED_ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__OUTGOING = STRUCTURED_ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__IN_PARTITION = STRUCTURED_ACTIVITY_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__IN_INTERRUPTIBLE_REGION = STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__IN_STRUCTURED_NODE = STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__HANDLER = STRUCTURED_ACTIVITY_NODE__HANDLER;

	/**
	 * The feature id for the '<em><b>Subgroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__SUBGROUP = STRUCTURED_ACTIVITY_NODE__SUBGROUP;

	/**
	 * The feature id for the '<em><b>Super Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__SUPER_GROUP = STRUCTURED_ACTIVITY_NODE__SUPER_GROUP;

	/**
	 * The feature id for the '<em><b>In Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__IN_ACTIVITY = STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__CONTAINED_NODE = STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE;

	/**
	 * The feature id for the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__CONTAINED_EDGE = STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__IS_LOCALLY_REENTRANT = STRUCTURED_ACTIVITY_NODE__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__LOCAL_PRECONDITION = STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__LOCAL_POSTCONDITION = STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__INPUT = STRUCTURED_ACTIVITY_NODE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__OUTPUT = STRUCTURED_ACTIVITY_NODE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__ACTIVITY = STRUCTURED_ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__VARIABLE = STRUCTURED_ACTIVITY_NODE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__NODE = STRUCTURED_ACTIVITY_NODE__NODE;

	/**
	 * The feature id for the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__STRUCTURED_NODE_INPUT = STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__EDGE = STRUCTURED_ACTIVITY_NODE__EDGE;

	/**
	 * The feature id for the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__MUST_ISOLATE = STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE;

	/**
	 * The feature id for the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__STRUCTURED_NODE_OUTPUT = STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Determinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__IS_DETERMINATE = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Assumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__IS_ASSUMED = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__CLAUSE = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__TEST = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__BODY = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__RESULT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Conditional Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE_FEATURE_COUNT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Conditional Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE_OPERATION_COUNT = STRUCTURED_ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.StructuredActivities.impl.ClauseImpl <em>Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.StructuredActivities.impl.ClauseImpl
	 * @see Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl#getClause()
	 * @generated
	 */
	int CLAUSE = 7;

	/**
	 * The feature id for the '<em><b>Predecessor Clause</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__PREDECESSOR_CLAUSE = IntermediateActivitiesPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sucessor Clause</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__SUCESSOR_CLAUSE = IntermediateActivitiesPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Decider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__DECIDER = IntermediateActivitiesPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_FEATURE_COUNT = IntermediateActivitiesPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_OPERATION_COUNT = IntermediateActivitiesPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.StructuredActivities.impl.SequenceNodeImpl <em>Sequence Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.StructuredActivities.impl.SequenceNodeImpl
	 * @see Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl#getSequenceNode()
	 * @generated
	 */
	int SEQUENCE_NODE = 8;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__REDEFINED_ELEMENT = STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__IN_GROUP = STRUCTURED_ACTIVITY_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__REDEFINED_NODE = STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__INCOMING = STRUCTURED_ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__OUTGOING = STRUCTURED_ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__IN_PARTITION = STRUCTURED_ACTIVITY_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__IN_INTERRUPTIBLE_REGION = STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__IN_STRUCTURED_NODE = STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__HANDLER = STRUCTURED_ACTIVITY_NODE__HANDLER;

	/**
	 * The feature id for the '<em><b>Subgroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__SUBGROUP = STRUCTURED_ACTIVITY_NODE__SUBGROUP;

	/**
	 * The feature id for the '<em><b>Super Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__SUPER_GROUP = STRUCTURED_ACTIVITY_NODE__SUPER_GROUP;

	/**
	 * The feature id for the '<em><b>In Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__IN_ACTIVITY = STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__CONTAINED_NODE = STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE;

	/**
	 * The feature id for the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__CONTAINED_EDGE = STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__IS_LOCALLY_REENTRANT = STRUCTURED_ACTIVITY_NODE__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__LOCAL_PRECONDITION = STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__LOCAL_POSTCONDITION = STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__INPUT = STRUCTURED_ACTIVITY_NODE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__OUTPUT = STRUCTURED_ACTIVITY_NODE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__ACTIVITY = STRUCTURED_ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__VARIABLE = STRUCTURED_ACTIVITY_NODE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__NODE = STRUCTURED_ACTIVITY_NODE__NODE;

	/**
	 * The feature id for the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__STRUCTURED_NODE_INPUT = STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__EDGE = STRUCTURED_ACTIVITY_NODE__EDGE;

	/**
	 * The feature id for the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__MUST_ISOLATE = STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE;

	/**
	 * The feature id for the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__STRUCTURED_NODE_OUTPUT = STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT;

	/**
	 * The feature id for the '<em><b>Executable Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__EXECUTABLE_NODE = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE_FEATURE_COUNT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sequence Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE_OPERATION_COUNT = STRUCTURED_ACTIVITY_NODE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Activities.StructuredActivities.StructuredActivityNode <em>Structured Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Activity Node</em>'.
	 * @see Activities.StructuredActivities.StructuredActivityNode
	 * @generated
	 */
	EClass getStructuredActivityNode();

	/**
	 * Returns the meta object for the container reference '{@link Activities.StructuredActivities.StructuredActivityNode#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity</em>'.
	 * @see Activities.StructuredActivities.StructuredActivityNode#getActivity()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EReference getStructuredActivityNode_Activity();

	/**
	 * Returns the meta object for the containment reference list '{@link Activities.StructuredActivities.StructuredActivityNode#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see Activities.StructuredActivities.StructuredActivityNode#getVariable()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EReference getStructuredActivityNode_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link Activities.StructuredActivities.StructuredActivityNode#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see Activities.StructuredActivities.StructuredActivityNode#getNode()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EReference getStructuredActivityNode_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link Activities.StructuredActivities.StructuredActivityNode#getStructuredNodeInput <em>Structured Node Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structured Node Input</em>'.
	 * @see Activities.StructuredActivities.StructuredActivityNode#getStructuredNodeInput()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EReference getStructuredActivityNode_StructuredNodeInput();

	/**
	 * Returns the meta object for the containment reference list '{@link Activities.StructuredActivities.StructuredActivityNode#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edge</em>'.
	 * @see Activities.StructuredActivities.StructuredActivityNode#getEdge()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EReference getStructuredActivityNode_Edge();

	/**
	 * Returns the meta object for the attribute '{@link Activities.StructuredActivities.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Isolate</em>'.
	 * @see Activities.StructuredActivities.StructuredActivityNode#isMustIsolate()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EAttribute getStructuredActivityNode_MustIsolate();

	/**
	 * Returns the meta object for the containment reference list '{@link Activities.StructuredActivities.StructuredActivityNode#getStructuredNodeOutput <em>Structured Node Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structured Node Output</em>'.
	 * @see Activities.StructuredActivities.StructuredActivityNode#getStructuredNodeOutput()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EReference getStructuredActivityNode_StructuredNodeOutput();

	/**
	 * Returns the meta object for class '{@link Activities.StructuredActivities.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Node</em>'.
	 * @see Activities.StructuredActivities.ExecutableNode
	 * @generated
	 */
	EClass getExecutableNode();

	/**
	 * Returns the meta object for the containment reference list '{@link Activities.StructuredActivities.ExecutableNode#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handler</em>'.
	 * @see Activities.StructuredActivities.ExecutableNode#getHandler()
	 * @see #getExecutableNode()
	 * @generated
	 */
	EReference getExecutableNode_Handler();

	/**
	 * Returns the meta object for class '{@link Activities.StructuredActivities.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see Activities.StructuredActivities.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for class '{@link Activities.StructuredActivities.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Element</em>'.
	 * @see Activities.StructuredActivities.MultiplicityElement
	 * @generated
	 */
	EClass getMultiplicityElement();

	/**
	 * Returns the meta object for class '{@link Activities.StructuredActivities.LoopNode <em>Loop Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Node</em>'.
	 * @see Activities.StructuredActivities.LoopNode
	 * @generated
	 */
	EClass getLoopNode();

	/**
	 * Returns the meta object for the attribute '{@link Activities.StructuredActivities.LoopNode#isIsTestedFirst <em>Is Tested First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Tested First</em>'.
	 * @see Activities.StructuredActivities.LoopNode#isIsTestedFirst()
	 * @see #getLoopNode()
	 * @generated
	 */
	EAttribute getLoopNode_IsTestedFirst();

	/**
	 * Returns the meta object for the reference list '{@link Activities.StructuredActivities.LoopNode#getSetupPart <em>Setup Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Setup Part</em>'.
	 * @see Activities.StructuredActivities.LoopNode#getSetupPart()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_SetupPart();

	/**
	 * Returns the meta object for the reference list '{@link Activities.StructuredActivities.LoopNode#getBodyPart <em>Body Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body Part</em>'.
	 * @see Activities.StructuredActivities.LoopNode#getBodyPart()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_BodyPart();

	/**
	 * Returns the meta object for the reference list '{@link Activities.StructuredActivities.LoopNode#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test</em>'.
	 * @see Activities.StructuredActivities.LoopNode#getTest()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_Test();

	/**
	 * Returns the meta object for the reference '{@link Activities.StructuredActivities.LoopNode#getDecider <em>Decider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decider</em>'.
	 * @see Activities.StructuredActivities.LoopNode#getDecider()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_Decider();

	/**
	 * Returns the meta object for the containment reference list '{@link Activities.StructuredActivities.LoopNode#getLoopVariableInput <em>Loop Variable Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop Variable Input</em>'.
	 * @see Activities.StructuredActivities.LoopNode#getLoopVariableInput()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_LoopVariableInput();

	/**
	 * Returns the meta object for the reference list '{@link Activities.StructuredActivities.LoopNode#getLoopVariable <em>Loop Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Loop Variable</em>'.
	 * @see Activities.StructuredActivities.LoopNode#getLoopVariable()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_LoopVariable();

	/**
	 * Returns the meta object for the reference list '{@link Activities.StructuredActivities.LoopNode#getBodyOutput <em>Body Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body Output</em>'.
	 * @see Activities.StructuredActivities.LoopNode#getBodyOutput()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_BodyOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link Activities.StructuredActivities.LoopNode#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see Activities.StructuredActivities.LoopNode#getResult()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_Result();

	/**
	 * Returns the meta object for class '{@link Activities.StructuredActivities.OutputPin <em>Output Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Pin</em>'.
	 * @see Activities.StructuredActivities.OutputPin
	 * @generated
	 */
	EClass getOutputPin();

	/**
	 * Returns the meta object for class '{@link Activities.StructuredActivities.ConditionalNode <em>Conditional Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Node</em>'.
	 * @see Activities.StructuredActivities.ConditionalNode
	 * @generated
	 */
	EClass getConditionalNode();

	/**
	 * Returns the meta object for the attribute '{@link Activities.StructuredActivities.ConditionalNode#isIsDeterminate <em>Is Determinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Determinate</em>'.
	 * @see Activities.StructuredActivities.ConditionalNode#isIsDeterminate()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EAttribute getConditionalNode_IsDeterminate();

	/**
	 * Returns the meta object for the attribute '{@link Activities.StructuredActivities.ConditionalNode#isIsAssumed <em>Is Assumed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Assumed</em>'.
	 * @see Activities.StructuredActivities.ConditionalNode#isIsAssumed()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EAttribute getConditionalNode_IsAssumed();

	/**
	 * Returns the meta object for the containment reference list '{@link Activities.StructuredActivities.ConditionalNode#getClause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clause</em>'.
	 * @see Activities.StructuredActivities.ConditionalNode#getClause()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EReference getConditionalNode_Clause();

	/**
	 * Returns the meta object for the reference list '{@link Activities.StructuredActivities.ConditionalNode#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test</em>'.
	 * @see Activities.StructuredActivities.ConditionalNode#getTest()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EReference getConditionalNode_Test();

	/**
	 * Returns the meta object for the reference list '{@link Activities.StructuredActivities.ConditionalNode#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body</em>'.
	 * @see Activities.StructuredActivities.ConditionalNode#getBody()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EReference getConditionalNode_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link Activities.StructuredActivities.ConditionalNode#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see Activities.StructuredActivities.ConditionalNode#getResult()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EReference getConditionalNode_Result();

	/**
	 * Returns the meta object for class '{@link Activities.StructuredActivities.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clause</em>'.
	 * @see Activities.StructuredActivities.Clause
	 * @generated
	 */
	EClass getClause();

	/**
	 * Returns the meta object for the reference list '{@link Activities.StructuredActivities.Clause#getPredecessorClause <em>Predecessor Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predecessor Clause</em>'.
	 * @see Activities.StructuredActivities.Clause#getPredecessorClause()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_PredecessorClause();

	/**
	 * Returns the meta object for the reference list '{@link Activities.StructuredActivities.Clause#getSucessorClause <em>Sucessor Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sucessor Clause</em>'.
	 * @see Activities.StructuredActivities.Clause#getSucessorClause()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_SucessorClause();

	/**
	 * Returns the meta object for the reference '{@link Activities.StructuredActivities.Clause#getDecider <em>Decider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decider</em>'.
	 * @see Activities.StructuredActivities.Clause#getDecider()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_Decider();

	/**
	 * Returns the meta object for class '{@link Activities.StructuredActivities.SequenceNode <em>Sequence Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Node</em>'.
	 * @see Activities.StructuredActivities.SequenceNode
	 * @generated
	 */
	EClass getSequenceNode();

	/**
	 * Returns the meta object for the containment reference list '{@link Activities.StructuredActivities.SequenceNode#getExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executable Node</em>'.
	 * @see Activities.StructuredActivities.SequenceNode#getExecutableNode()
	 * @see #getSequenceNode()
	 * @generated
	 */
	EReference getSequenceNode_ExecutableNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructuredActivitiesFactory getStructuredActivitiesFactory();

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
		 * The meta object literal for the '{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl <em>Structured Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.StructuredActivities.impl.StructuredActivityNodeImpl
		 * @see Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl#getStructuredActivityNode()
		 * @generated
		 */
		EClass STRUCTURED_ACTIVITY_NODE = eINSTANCE.getStructuredActivityNode();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_ACTIVITY_NODE__ACTIVITY = eINSTANCE.getStructuredActivityNode_Activity();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_ACTIVITY_NODE__VARIABLE = eINSTANCE.getStructuredActivityNode_Variable();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_ACTIVITY_NODE__NODE = eINSTANCE.getStructuredActivityNode_Node();

		/**
		 * The meta object literal for the '<em><b>Structured Node Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT = eINSTANCE.getStructuredActivityNode_StructuredNodeInput();

		/**
		 * The meta object literal for the '<em><b>Edge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_ACTIVITY_NODE__EDGE = eINSTANCE.getStructuredActivityNode_Edge();

		/**
		 * The meta object literal for the '<em><b>Must Isolate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE = eINSTANCE.getStructuredActivityNode_MustIsolate();

		/**
		 * The meta object literal for the '<em><b>Structured Node Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT = eINSTANCE.getStructuredActivityNode_StructuredNodeOutput();

		/**
		 * The meta object literal for the '{@link Activities.StructuredActivities.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.StructuredActivities.impl.ExecutableNodeImpl
		 * @see Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl#getExecutableNode()
		 * @generated
		 */
		EClass EXECUTABLE_NODE = eINSTANCE.getExecutableNode();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_NODE__HANDLER = eINSTANCE.getExecutableNode_Handler();

		/**
		 * The meta object literal for the '{@link Activities.StructuredActivities.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.StructuredActivities.impl.VariableImpl
		 * @see Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '{@link Activities.StructuredActivities.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.StructuredActivities.impl.MultiplicityElementImpl
		 * @see Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl#getMultiplicityElement()
		 * @generated
		 */
		EClass MULTIPLICITY_ELEMENT = eINSTANCE.getMultiplicityElement();

		/**
		 * The meta object literal for the '{@link Activities.StructuredActivities.impl.LoopNodeImpl <em>Loop Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.StructuredActivities.impl.LoopNodeImpl
		 * @see Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl#getLoopNode()
		 * @generated
		 */
		EClass LOOP_NODE = eINSTANCE.getLoopNode();

		/**
		 * The meta object literal for the '<em><b>Is Tested First</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_NODE__IS_TESTED_FIRST = eINSTANCE.getLoopNode_IsTestedFirst();

		/**
		 * The meta object literal for the '<em><b>Setup Part</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__SETUP_PART = eINSTANCE.getLoopNode_SetupPart();

		/**
		 * The meta object literal for the '<em><b>Body Part</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__BODY_PART = eINSTANCE.getLoopNode_BodyPart();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__TEST = eINSTANCE.getLoopNode_Test();

		/**
		 * The meta object literal for the '<em><b>Decider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__DECIDER = eINSTANCE.getLoopNode_Decider();

		/**
		 * The meta object literal for the '<em><b>Loop Variable Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__LOOP_VARIABLE_INPUT = eINSTANCE.getLoopNode_LoopVariableInput();

		/**
		 * The meta object literal for the '<em><b>Loop Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__LOOP_VARIABLE = eINSTANCE.getLoopNode_LoopVariable();

		/**
		 * The meta object literal for the '<em><b>Body Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__BODY_OUTPUT = eINSTANCE.getLoopNode_BodyOutput();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__RESULT = eINSTANCE.getLoopNode_Result();

		/**
		 * The meta object literal for the '{@link Activities.StructuredActivities.impl.OutputPinImpl <em>Output Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.StructuredActivities.impl.OutputPinImpl
		 * @see Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl#getOutputPin()
		 * @generated
		 */
		EClass OUTPUT_PIN = eINSTANCE.getOutputPin();

		/**
		 * The meta object literal for the '{@link Activities.StructuredActivities.impl.ConditionalNodeImpl <em>Conditional Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.StructuredActivities.impl.ConditionalNodeImpl
		 * @see Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl#getConditionalNode()
		 * @generated
		 */
		EClass CONDITIONAL_NODE = eINSTANCE.getConditionalNode();

		/**
		 * The meta object literal for the '<em><b>Is Determinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_NODE__IS_DETERMINATE = eINSTANCE.getConditionalNode_IsDeterminate();

		/**
		 * The meta object literal for the '<em><b>Is Assumed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_NODE__IS_ASSUMED = eINSTANCE.getConditionalNode_IsAssumed();

		/**
		 * The meta object literal for the '<em><b>Clause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_NODE__CLAUSE = eINSTANCE.getConditionalNode_Clause();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_NODE__TEST = eINSTANCE.getConditionalNode_Test();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_NODE__BODY = eINSTANCE.getConditionalNode_Body();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_NODE__RESULT = eINSTANCE.getConditionalNode_Result();

		/**
		 * The meta object literal for the '{@link Activities.StructuredActivities.impl.ClauseImpl <em>Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.StructuredActivities.impl.ClauseImpl
		 * @see Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl#getClause()
		 * @generated
		 */
		EClass CLAUSE = eINSTANCE.getClause();

		/**
		 * The meta object literal for the '<em><b>Predecessor Clause</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__PREDECESSOR_CLAUSE = eINSTANCE.getClause_PredecessorClause();

		/**
		 * The meta object literal for the '<em><b>Sucessor Clause</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__SUCESSOR_CLAUSE = eINSTANCE.getClause_SucessorClause();

		/**
		 * The meta object literal for the '<em><b>Decider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__DECIDER = eINSTANCE.getClause_Decider();

		/**
		 * The meta object literal for the '{@link Activities.StructuredActivities.impl.SequenceNodeImpl <em>Sequence Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.StructuredActivities.impl.SequenceNodeImpl
		 * @see Activities.StructuredActivities.impl.StructuredActivitiesPackageImpl#getSequenceNode()
		 * @generated
		 */
		EClass SEQUENCE_NODE = eINSTANCE.getSequenceNode();

		/**
		 * The meta object literal for the '<em><b>Executable Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_NODE__EXECUTABLE_NODE = eINSTANCE.getSequenceNode_ExecutableNode();

	}

} //StructuredActivitiesPackage

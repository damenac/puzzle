/**
 */
package Activities.ExtraStructuredActivities;

import Activities.BasicActivities.BasicActivitiesPackage;

import Activities.IntermediateActivities.IntermediateActivitiesPackage;

import Activities.StructuredActivities.StructuredActivitiesPackage;

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
 * @see Activities.ExtraStructuredActivities.ExtraStructuredActivitiesFactory
 * @model kind="package"
 * @generated
 */
public interface ExtraStructuredActivitiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ExtraStructuredActivities";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.puzzle.uml/Activities/ExtraStructuredActivities";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ExtraStructuredActivities";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtraStructuredActivitiesPackage eINSTANCE = Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link Activities.ExtraStructuredActivities.impl.ExceptionHandlerImpl <em>Exception Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.ExtraStructuredActivities.impl.ExceptionHandlerImpl
	 * @see Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl#getExceptionHandler()
	 * @generated
	 */
	int EXCEPTION_HANDLER = 0;

	/**
	 * The feature id for the '<em><b>Handler Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__HANDLER_BODY = IntermediateActivitiesPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protected Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__PROTECTED_NODE = IntermediateActivitiesPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exception Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__EXCEPTION_INPUT = IntermediateActivitiesPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exception Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__EXCEPTION_TYPE = IntermediateActivitiesPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Exception Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER_FEATURE_COUNT = IntermediateActivitiesPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Exception Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER_OPERATION_COUNT = IntermediateActivitiesPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.ExtraStructuredActivities.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.ExtraStructuredActivities.impl.ClassifierImpl
	 * @see Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 1;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Activities.ExtraStructuredActivities.impl.ExpansionRegionImpl <em>Expansion Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.ExtraStructuredActivities.impl.ExpansionRegionImpl
	 * @see Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl#getExpansionRegion()
	 * @generated
	 */
	int EXPANSION_REGION = 2;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__REDEFINED_ELEMENT = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__IN_GROUP = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__REDEFINED_NODE = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__INCOMING = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__OUTGOING = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__IN_PARTITION = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__IN_INTERRUPTIBLE_REGION = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__IN_STRUCTURED_NODE = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__HANDLER = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__HANDLER;

	/**
	 * The feature id for the '<em><b>Subgroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__SUBGROUP = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP;

	/**
	 * The feature id for the '<em><b>Super Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__SUPER_GROUP = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP;

	/**
	 * The feature id for the '<em><b>In Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__IN_ACTIVITY = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__CONTAINED_NODE = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE;

	/**
	 * The feature id for the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__CONTAINED_EDGE = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__IS_LOCALLY_REENTRANT = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__LOCAL_PRECONDITION = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__LOCAL_POSTCONDITION = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__INPUT = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__OUTPUT = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__ACTIVITY = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__VARIABLE = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__NODE = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NODE;

	/**
	 * The feature id for the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__STRUCTURED_NODE_INPUT = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__EDGE = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE;

	/**
	 * The feature id for the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__MUST_ISOLATE = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE;

	/**
	 * The feature id for the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__STRUCTURED_NODE_OUTPUT = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__MODE = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__INPUT_ELEMENT = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__OUTPUT_ELEMENT = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Expansion Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION_FEATURE_COUNT = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Expansion Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION_OPERATION_COUNT = StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.ExtraStructuredActivities.impl.ExpansionNodeImpl <em>Expansion Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.ExtraStructuredActivities.impl.ExpansionNodeImpl
	 * @see Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl#getExpansionNode()
	 * @generated
	 */
	int EXPANSION_NODE = 3;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__REDEFINED_ELEMENT = BasicActivitiesPackage.OBJECT_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__IN_GROUP = BasicActivitiesPackage.OBJECT_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__REDEFINED_NODE = BasicActivitiesPackage.OBJECT_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__INCOMING = BasicActivitiesPackage.OBJECT_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__OUTGOING = BasicActivitiesPackage.OBJECT_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__IN_PARTITION = BasicActivitiesPackage.OBJECT_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__IN_INTERRUPTIBLE_REGION = BasicActivitiesPackage.OBJECT_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__IN_STRUCTURED_NODE = BasicActivitiesPackage.OBJECT_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Region As Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__REGION_AS_INPUT = BasicActivitiesPackage.OBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region As Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__REGION_AS_OUTPUT = BasicActivitiesPackage.OBJECT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expansion Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE_FEATURE_COUNT = BasicActivitiesPackage.OBJECT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expansion Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE_OPERATION_COUNT = BasicActivitiesPackage.OBJECT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Activities.ExtraStructuredActivities.ExpansionKind <em>Expansion Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Activities.ExtraStructuredActivities.ExpansionKind
	 * @see Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl#getExpansionKind()
	 * @generated
	 */
	int EXPANSION_KIND = 4;


	/**
	 * Returns the meta object for class '{@link Activities.ExtraStructuredActivities.ExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Handler</em>'.
	 * @see Activities.ExtraStructuredActivities.ExceptionHandler
	 * @generated
	 */
	EClass getExceptionHandler();

	/**
	 * Returns the meta object for the reference '{@link Activities.ExtraStructuredActivities.ExceptionHandler#getHandlerBody <em>Handler Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Handler Body</em>'.
	 * @see Activities.ExtraStructuredActivities.ExceptionHandler#getHandlerBody()
	 * @see #getExceptionHandler()
	 * @generated
	 */
	EReference getExceptionHandler_HandlerBody();

	/**
	 * Returns the meta object for the container reference '{@link Activities.ExtraStructuredActivities.ExceptionHandler#getProtectedNode <em>Protected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Protected Node</em>'.
	 * @see Activities.ExtraStructuredActivities.ExceptionHandler#getProtectedNode()
	 * @see #getExceptionHandler()
	 * @generated
	 */
	EReference getExceptionHandler_ProtectedNode();

	/**
	 * Returns the meta object for the reference '{@link Activities.ExtraStructuredActivities.ExceptionHandler#getExceptionInput <em>Exception Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exception Input</em>'.
	 * @see Activities.ExtraStructuredActivities.ExceptionHandler#getExceptionInput()
	 * @see #getExceptionHandler()
	 * @generated
	 */
	EReference getExceptionHandler_ExceptionInput();

	/**
	 * Returns the meta object for the reference list '{@link Activities.ExtraStructuredActivities.ExceptionHandler#getExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exception Type</em>'.
	 * @see Activities.ExtraStructuredActivities.ExceptionHandler#getExceptionType()
	 * @see #getExceptionHandler()
	 * @generated
	 */
	EReference getExceptionHandler_ExceptionType();

	/**
	 * Returns the meta object for class '{@link Activities.ExtraStructuredActivities.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see Activities.ExtraStructuredActivities.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for class '{@link Activities.ExtraStructuredActivities.ExpansionRegion <em>Expansion Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expansion Region</em>'.
	 * @see Activities.ExtraStructuredActivities.ExpansionRegion
	 * @generated
	 */
	EClass getExpansionRegion();

	/**
	 * Returns the meta object for the attribute '{@link Activities.ExtraStructuredActivities.ExpansionRegion#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see Activities.ExtraStructuredActivities.ExpansionRegion#getMode()
	 * @see #getExpansionRegion()
	 * @generated
	 */
	EAttribute getExpansionRegion_Mode();

	/**
	 * Returns the meta object for the reference list '{@link Activities.ExtraStructuredActivities.ExpansionRegion#getInputElement <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Element</em>'.
	 * @see Activities.ExtraStructuredActivities.ExpansionRegion#getInputElement()
	 * @see #getExpansionRegion()
	 * @generated
	 */
	EReference getExpansionRegion_InputElement();

	/**
	 * Returns the meta object for the reference list '{@link Activities.ExtraStructuredActivities.ExpansionRegion#getOutputElement <em>Output Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Element</em>'.
	 * @see Activities.ExtraStructuredActivities.ExpansionRegion#getOutputElement()
	 * @see #getExpansionRegion()
	 * @generated
	 */
	EReference getExpansionRegion_OutputElement();

	/**
	 * Returns the meta object for class '{@link Activities.ExtraStructuredActivities.ExpansionNode <em>Expansion Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expansion Node</em>'.
	 * @see Activities.ExtraStructuredActivities.ExpansionNode
	 * @generated
	 */
	EClass getExpansionNode();

	/**
	 * Returns the meta object for the reference '{@link Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsInput <em>Region As Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region As Input</em>'.
	 * @see Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsInput()
	 * @see #getExpansionNode()
	 * @generated
	 */
	EReference getExpansionNode_RegionAsInput();

	/**
	 * Returns the meta object for the reference '{@link Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region As Output</em>'.
	 * @see Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsOutput()
	 * @see #getExpansionNode()
	 * @generated
	 */
	EReference getExpansionNode_RegionAsOutput();

	/**
	 * Returns the meta object for enum '{@link Activities.ExtraStructuredActivities.ExpansionKind <em>Expansion Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expansion Kind</em>'.
	 * @see Activities.ExtraStructuredActivities.ExpansionKind
	 * @generated
	 */
	EEnum getExpansionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtraStructuredActivitiesFactory getExtraStructuredActivitiesFactory();

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
		 * The meta object literal for the '{@link Activities.ExtraStructuredActivities.impl.ExceptionHandlerImpl <em>Exception Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.ExtraStructuredActivities.impl.ExceptionHandlerImpl
		 * @see Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl#getExceptionHandler()
		 * @generated
		 */
		EClass EXCEPTION_HANDLER = eINSTANCE.getExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Handler Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_HANDLER__HANDLER_BODY = eINSTANCE.getExceptionHandler_HandlerBody();

		/**
		 * The meta object literal for the '<em><b>Protected Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_HANDLER__PROTECTED_NODE = eINSTANCE.getExceptionHandler_ProtectedNode();

		/**
		 * The meta object literal for the '<em><b>Exception Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_HANDLER__EXCEPTION_INPUT = eINSTANCE.getExceptionHandler_ExceptionInput();

		/**
		 * The meta object literal for the '<em><b>Exception Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_HANDLER__EXCEPTION_TYPE = eINSTANCE.getExceptionHandler_ExceptionType();

		/**
		 * The meta object literal for the '{@link Activities.ExtraStructuredActivities.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.ExtraStructuredActivities.impl.ClassifierImpl
		 * @see Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '{@link Activities.ExtraStructuredActivities.impl.ExpansionRegionImpl <em>Expansion Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.ExtraStructuredActivities.impl.ExpansionRegionImpl
		 * @see Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl#getExpansionRegion()
		 * @generated
		 */
		EClass EXPANSION_REGION = eINSTANCE.getExpansionRegion();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPANSION_REGION__MODE = eINSTANCE.getExpansionRegion_Mode();

		/**
		 * The meta object literal for the '<em><b>Input Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPANSION_REGION__INPUT_ELEMENT = eINSTANCE.getExpansionRegion_InputElement();

		/**
		 * The meta object literal for the '<em><b>Output Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPANSION_REGION__OUTPUT_ELEMENT = eINSTANCE.getExpansionRegion_OutputElement();

		/**
		 * The meta object literal for the '{@link Activities.ExtraStructuredActivities.impl.ExpansionNodeImpl <em>Expansion Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.ExtraStructuredActivities.impl.ExpansionNodeImpl
		 * @see Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl#getExpansionNode()
		 * @generated
		 */
		EClass EXPANSION_NODE = eINSTANCE.getExpansionNode();

		/**
		 * The meta object literal for the '<em><b>Region As Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPANSION_NODE__REGION_AS_INPUT = eINSTANCE.getExpansionNode_RegionAsInput();

		/**
		 * The meta object literal for the '<em><b>Region As Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPANSION_NODE__REGION_AS_OUTPUT = eINSTANCE.getExpansionNode_RegionAsOutput();

		/**
		 * The meta object literal for the '{@link Activities.ExtraStructuredActivities.ExpansionKind <em>Expansion Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Activities.ExtraStructuredActivities.ExpansionKind
		 * @see Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl#getExpansionKind()
		 * @generated
		 */
		EEnum EXPANSION_KIND = eINSTANCE.getExpansionKind();

	}

} //ExtraStructuredActivitiesPackage

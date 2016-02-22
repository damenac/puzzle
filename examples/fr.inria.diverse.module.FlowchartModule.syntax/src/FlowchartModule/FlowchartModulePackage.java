/**
 */
package FlowchartModule;

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
 * @see FlowchartModule.FlowchartModuleFactory
 * @model kind="package"
 * @generated
 */
public interface FlowchartModulePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FlowchartModule";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "FlowchartModule";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "FlowchartModule";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowchartModulePackage eINSTANCE = FlowchartModule.impl.FlowchartModulePackageImpl.init();

	/**
	 * The meta object id for the '{@link FlowchartModule.impl.FlowchartImpl <em>Flowchart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FlowchartModule.impl.FlowchartImpl
	 * @see FlowchartModule.impl.FlowchartModulePackageImpl#getFlowchart()
	 * @generated
	 */
	int FLOWCHART = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWCHART__NODES = 0;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWCHART__ARCS = 1;

	/**
	 * The number of structural features of the '<em>Flowchart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWCHART_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Flowchart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWCHART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FlowchartModule.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FlowchartModule.impl.NodeImpl
	 * @see FlowchartModule.impl.FlowchartModulePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTGOING = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INCOMING = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FlowchartModule.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FlowchartModule.impl.ArcImpl
	 * @see FlowchartModule.impl.FlowchartModulePackageImpl#getArc()
	 * @generated
	 */
	int ARC = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FlowchartModule.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FlowchartModule.impl.ActionImpl
	 * @see FlowchartModule.impl.FlowchartModulePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 3;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Do Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DO_PROGRAM = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FlowchartModule.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FlowchartModule.impl.DecisionImpl
	 * @see FlowchartModule.impl.FlowchartModulePackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 4;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__GUARD = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FlowchartModule.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FlowchartModule.impl.StartImpl
	 * @see FlowchartModule.impl.FlowchartModulePackageImpl#getStart()
	 * @generated
	 */
	int START = 5;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__INCOMING = NODE__INCOMING;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FlowchartModule.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FlowchartModule.impl.EndImpl
	 * @see FlowchartModule.impl.FlowchartModulePackageImpl#getEnd()
	 * @generated
	 */
	int END = 6;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__INCOMING = NODE__INCOMING;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FlowchartModule.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FlowchartModule.impl.ProgramImpl
	 * @see FlowchartModule.impl.FlowchartModulePackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 7;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Eval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM___EVAL__OBJECT = 0;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link FlowchartModule.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FlowchartModule.impl.ConstraintImpl
	 * @see FlowchartModule.impl.FlowchartModulePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 8;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Eval Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___EVAL_CONSTRAINT__OBJECT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link FlowchartModule.Flowchart <em>Flowchart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flowchart</em>'.
	 * @see FlowchartModule.Flowchart
	 * @generated
	 */
	EClass getFlowchart();

	/**
	 * Returns the meta object for the containment reference list '{@link FlowchartModule.Flowchart#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see FlowchartModule.Flowchart#getNodes()
	 * @see #getFlowchart()
	 * @generated
	 */
	EReference getFlowchart_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link FlowchartModule.Flowchart#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see FlowchartModule.Flowchart#getArcs()
	 * @see #getFlowchart()
	 * @generated
	 */
	EReference getFlowchart_Arcs();

	/**
	 * Returns the meta object for class '{@link FlowchartModule.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see FlowchartModule.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link FlowchartModule.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see FlowchartModule.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link FlowchartModule.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see FlowchartModule.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Incoming();

	/**
	 * Returns the meta object for class '{@link FlowchartModule.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see FlowchartModule.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the reference '{@link FlowchartModule.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see FlowchartModule.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Source();

	/**
	 * Returns the meta object for the reference '{@link FlowchartModule.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see FlowchartModule.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Target();

	/**
	 * Returns the meta object for class '{@link FlowchartModule.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see FlowchartModule.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference '{@link FlowchartModule.Action#getDoProgram <em>Do Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do Program</em>'.
	 * @see FlowchartModule.Action#getDoProgram()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_DoProgram();

	/**
	 * Returns the meta object for class '{@link FlowchartModule.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see FlowchartModule.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the containment reference '{@link FlowchartModule.Decision#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see FlowchartModule.Decision#getGuard()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Guard();

	/**
	 * Returns the meta object for class '{@link FlowchartModule.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see FlowchartModule.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for class '{@link FlowchartModule.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see FlowchartModule.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for class '{@link FlowchartModule.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see FlowchartModule.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the '{@link FlowchartModule.Program#eval(java.lang.Object) <em>Eval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval</em>' operation.
	 * @see FlowchartModule.Program#eval(java.lang.Object)
	 * @generated
	 */
	EOperation getProgram__Eval__Object();

	/**
	 * Returns the meta object for class '{@link FlowchartModule.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see FlowchartModule.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the '{@link FlowchartModule.Constraint#evalConstraint(java.lang.Object) <em>Eval Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval Constraint</em>' operation.
	 * @see FlowchartModule.Constraint#evalConstraint(java.lang.Object)
	 * @generated
	 */
	EOperation getConstraint__EvalConstraint__Object();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlowchartModuleFactory getFlowchartModuleFactory();

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
		 * The meta object literal for the '{@link FlowchartModule.impl.FlowchartImpl <em>Flowchart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FlowchartModule.impl.FlowchartImpl
		 * @see FlowchartModule.impl.FlowchartModulePackageImpl#getFlowchart()
		 * @generated
		 */
		EClass FLOWCHART = eINSTANCE.getFlowchart();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOWCHART__NODES = eINSTANCE.getFlowchart_Nodes();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOWCHART__ARCS = eINSTANCE.getFlowchart_Arcs();

		/**
		 * The meta object literal for the '{@link FlowchartModule.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FlowchartModule.impl.NodeImpl
		 * @see FlowchartModule.impl.FlowchartModulePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
		 * The meta object literal for the '{@link FlowchartModule.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FlowchartModule.impl.ArcImpl
		 * @see FlowchartModule.impl.FlowchartModulePackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__SOURCE = eINSTANCE.getArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TARGET = eINSTANCE.getArc_Target();

		/**
		 * The meta object literal for the '{@link FlowchartModule.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FlowchartModule.impl.ActionImpl
		 * @see FlowchartModule.impl.FlowchartModulePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Do Program</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__DO_PROGRAM = eINSTANCE.getAction_DoProgram();

		/**
		 * The meta object literal for the '{@link FlowchartModule.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FlowchartModule.impl.DecisionImpl
		 * @see FlowchartModule.impl.FlowchartModulePackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__GUARD = eINSTANCE.getDecision_Guard();

		/**
		 * The meta object literal for the '{@link FlowchartModule.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FlowchartModule.impl.StartImpl
		 * @see FlowchartModule.impl.FlowchartModulePackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '{@link FlowchartModule.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FlowchartModule.impl.EndImpl
		 * @see FlowchartModule.impl.FlowchartModulePackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '{@link FlowchartModule.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FlowchartModule.impl.ProgramImpl
		 * @see FlowchartModule.impl.FlowchartModulePackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Eval</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROGRAM___EVAL__OBJECT = eINSTANCE.getProgram__Eval__Object();

		/**
		 * The meta object literal for the '{@link FlowchartModule.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FlowchartModule.impl.ConstraintImpl
		 * @see FlowchartModule.impl.FlowchartModulePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Eval Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTRAINT___EVAL_CONSTRAINT__OBJECT = eINSTANCE.getConstraint__EvalConstraint__Object();

	}

} //FlowchartModulePackage

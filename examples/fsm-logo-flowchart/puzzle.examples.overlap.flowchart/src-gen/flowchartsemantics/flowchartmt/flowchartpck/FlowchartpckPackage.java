/**
 */
package flowchartsemantics.flowchartmt.flowchartpck;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckFactory
 * @model kind="package"
 * @generated
 */
public interface FlowchartpckPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flowchartpck";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://flowchartmt/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "flowchartpck";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowchartpckPackage eINSTANCE = flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl.init();

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.NamedElementImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartImpl <em>Flowchart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getFlowchart()
	 * @generated
	 */
	int FLOWCHART = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWCHART__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWCHART__NODES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWCHART__ARCS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flowchart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWCHART_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.NodeImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INCOMING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.ArcImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 3;

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
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.ActionImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = NODE__NAME;

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
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.DecisionImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__NAME = NODE__NAME;

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
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.StartImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getStart()
	 * @generated
	 */
	int START = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__NAME = NODE__NAME;

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
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.EndImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getEnd()
	 * @generated
	 */
	int END = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__NAME = NODE__NAME;

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
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.ConstraintImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getConstraint()
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
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.RelationalConstraintImpl <em>Relational Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.RelationalConstraintImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getRelationalConstraint()
	 * @generated
	 */
	int RELATIONAL_CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONSTRAINT__EXPRESSION = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relational Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.ExpressionImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 10;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.LiteralImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 11;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.IntegerLitImpl <em>Integer Lit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.IntegerLitImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getIntegerLit()
	 * @generated
	 */
	int INTEGER_LIT = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LIT__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Lit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LIT_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.StringLitImpl <em>String Lit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.StringLitImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getStringLit()
	 * @generated
	 */
	int STRING_LIT = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LIT__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Lit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LIT_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.BoolLitImpl <em>Bool Lit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.BoolLitImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getBoolLit()
	 * @generated
	 */
	int BOOL_LIT = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_LIT__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Lit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_LIT_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.ArithmeticExpressionImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getArithmeticExpression()
	 * @generated
	 */
	int ARITHMETIC_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.RelationalExpressionImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getRelationalExpression()
	 * @generated
	 */
	int RELATIONAL_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.VarReferenceImpl <em>Var Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.VarReferenceImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getVarReference()
	 * @generated
	 */
	int VAR_REFERENCE = 17;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REFERENCE__KEY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.StatementImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 18;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.ProgramImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 19;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.ConditionalImpl <em>Conditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.ConditionalImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getConditional()
	 * @generated
	 */
	int CONDITIONAL = 20;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.LoopImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 21;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BODY = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__GUARD = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.ConsoleOutputImpl <em>Console Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.ConsoleOutputImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getConsoleOutput()
	 * @generated
	 */
	int CONSOLE_OUTPUT = 22;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLE_OUTPUT__INPUT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Console Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLE_OUTPUT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.PrintlnImpl <em>Println</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.PrintlnImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getPrintln()
	 * @generated
	 */
	int PRINTLN = 23;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTLN__INPUT = CONSOLE_OUTPUT__INPUT;

	/**
	 * The number of structural features of the '<em>Println</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTLN_FEATURE_COUNT = CONSOLE_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.PrintImpl <em>Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.PrintImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getPrint()
	 * @generated
	 */
	int PRINT = 24;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__INPUT = CONSOLE_OUTPUT__INPUT;

	/**
	 * The number of structural features of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_FEATURE_COUNT = CONSOLE_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.AssignationImpl <em>Assignation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.AssignationImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getAssignation()
	 * @generated
	 */
	int ASSIGNATION = 25;

	/**
	 * The feature id for the '<em><b>Var Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNATION__VAR_REF = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNATION__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.WaitImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 26;

	/**
	 * The feature id for the '<em><b>Miliseconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__MILISECONDS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.VarDeclImpl <em>Var Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.VarDeclImpl
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getVarDecl()
	 * @generated
	 */
	int VAR_DECL = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL__EXPR = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.ArithmeticOperator
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getArithmeticOperator()
	 * @generated
	 */
	int ARITHMETIC_OPERATOR = 28;

	/**
	 * The meta object id for the '{@link flowchartsemantics.flowchartmt.flowchartpck.RelationalOperator <em>Relational Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchartsemantics.flowchartmt.flowchartpck.RelationalOperator
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getRelationalOperator()
	 * @generated
	 */
	int RELATIONAL_OPERATOR = 29;

	/**
	 * The meta object id for the '<em>Hashtable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Hashtable
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getHashtable()
	 * @generated
	 */
	int HASHTABLE = 30;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 31;


	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link flowchartsemantics.flowchartmt.flowchartpck.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.Flowchart <em>Flowchart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flowchart</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Flowchart
	 * @generated
	 */
	EClass getFlowchart();

	/**
	 * Returns the meta object for the containment reference list '{@link flowchartsemantics.flowchartmt.flowchartpck.Flowchart#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Flowchart#getNodes()
	 * @see #getFlowchart()
	 * @generated
	 */
	EReference getFlowchart_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link flowchartsemantics.flowchartmt.flowchartpck.Flowchart#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Flowchart#getArcs()
	 * @see #getFlowchart()
	 * @generated
	 */
	EReference getFlowchart_Arcs();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link flowchartsemantics.flowchartmt.flowchartpck.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link flowchartsemantics.flowchartmt.flowchartpck.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Incoming();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the reference '{@link flowchartsemantics.flowchartmt.flowchartpck.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Source();

	/**
	 * Returns the meta object for the reference '{@link flowchartsemantics.flowchartmt.flowchartpck.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Target();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference '{@link flowchartsemantics.flowchartmt.flowchartpck.Action#getDoProgram <em>Do Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do Program</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Action#getDoProgram()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_DoProgram();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the containment reference '{@link flowchartsemantics.flowchartmt.flowchartpck.Decision#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Decision#getGuard()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Guard();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.RelationalConstraint <em>Relational Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Constraint</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.RelationalConstraint
	 * @generated
	 */
	EClass getRelationalConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link flowchartsemantics.flowchartmt.flowchartpck.RelationalConstraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.RelationalConstraint#getExpression()
	 * @see #getRelationalConstraint()
	 * @generated
	 */
	EReference getRelationalConstraint_Expression();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.IntegerLit <em>Integer Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Lit</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.IntegerLit
	 * @generated
	 */
	EClass getIntegerLit();

	/**
	 * Returns the meta object for the attribute '{@link flowchartsemantics.flowchartmt.flowchartpck.IntegerLit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.IntegerLit#getValue()
	 * @see #getIntegerLit()
	 * @generated
	 */
	EAttribute getIntegerLit_Value();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.StringLit <em>String Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Lit</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.StringLit
	 * @generated
	 */
	EClass getStringLit();

	/**
	 * Returns the meta object for the attribute '{@link flowchartsemantics.flowchartmt.flowchartpck.StringLit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.StringLit#getValue()
	 * @see #getStringLit()
	 * @generated
	 */
	EAttribute getStringLit_Value();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.BoolLit <em>Bool Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Lit</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.BoolLit
	 * @generated
	 */
	EClass getBoolLit();

	/**
	 * Returns the meta object for the attribute '{@link flowchartsemantics.flowchartmt.flowchartpck.BoolLit#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.BoolLit#isValue()
	 * @see #getBoolLit()
	 * @generated
	 */
	EAttribute getBoolLit_Value();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.ArithmeticExpression <em>Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Expression</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.ArithmeticExpression
	 * @generated
	 */
	EClass getArithmeticExpression();

	/**
	 * Returns the meta object for the containment reference '{@link flowchartsemantics.flowchartmt.flowchartpck.ArithmeticExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.ArithmeticExpression#getLeft()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EReference getArithmeticExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link flowchartsemantics.flowchartmt.flowchartpck.ArithmeticExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.ArithmeticExpression#getRight()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EReference getArithmeticExpression_Right();

	/**
	 * Returns the meta object for the attribute '{@link flowchartsemantics.flowchartmt.flowchartpck.ArithmeticExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.ArithmeticExpression#getOperator()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EAttribute getArithmeticExpression_Operator();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Expression</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.RelationalExpression
	 * @generated
	 */
	EClass getRelationalExpression();

	/**
	 * Returns the meta object for the attribute '{@link flowchartsemantics.flowchartmt.flowchartpck.RelationalExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.RelationalExpression#getOperator()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EAttribute getRelationalExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link flowchartsemantics.flowchartmt.flowchartpck.RelationalExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.RelationalExpression#getLeft()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link flowchartsemantics.flowchartmt.flowchartpck.RelationalExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.RelationalExpression#getRight()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_Right();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.VarReference <em>Var Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Reference</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.VarReference
	 * @generated
	 */
	EClass getVarReference();

	/**
	 * Returns the meta object for the attribute '{@link flowchartsemantics.flowchartmt.flowchartpck.VarReference#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.VarReference#getKey()
	 * @see #getVarReference()
	 * @generated
	 */
	EAttribute getVarReference_Key();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link flowchartsemantics.flowchartmt.flowchartpck.Program#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Program#getStatements()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Statements();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Conditional
	 * @generated
	 */
	EClass getConditional();

	/**
	 * Returns the meta object for the containment reference '{@link flowchartsemantics.flowchartmt.flowchartpck.Conditional#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Conditional#getCondition()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link flowchartsemantics.flowchartmt.flowchartpck.Conditional#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Conditional#getBody()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_Body();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link flowchartsemantics.flowchartmt.flowchartpck.Loop#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Loop#getBody()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Body();

	/**
	 * Returns the meta object for the containment reference '{@link flowchartsemantics.flowchartmt.flowchartpck.Loop#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Loop#getGuard()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Guard();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.ConsoleOutput <em>Console Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Console Output</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.ConsoleOutput
	 * @generated
	 */
	EClass getConsoleOutput();

	/**
	 * Returns the meta object for the attribute '{@link flowchartsemantics.flowchartmt.flowchartpck.ConsoleOutput#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.ConsoleOutput#getInput()
	 * @see #getConsoleOutput()
	 * @generated
	 */
	EAttribute getConsoleOutput_Input();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.Println <em>Println</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Println</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Println
	 * @generated
	 */
	EClass getPrintln();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.Print <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Print
	 * @generated
	 */
	EClass getPrint();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.Assignation <em>Assignation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignation</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Assignation
	 * @generated
	 */
	EClass getAssignation();

	/**
	 * Returns the meta object for the reference '{@link flowchartsemantics.flowchartmt.flowchartpck.Assignation#getVarRef <em>Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var Ref</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Assignation#getVarRef()
	 * @see #getAssignation()
	 * @generated
	 */
	EReference getAssignation_VarRef();

	/**
	 * Returns the meta object for the containment reference '{@link flowchartsemantics.flowchartmt.flowchartpck.Assignation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Assignation#getExpression()
	 * @see #getAssignation()
	 * @generated
	 */
	EReference getAssignation_Expression();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for the attribute '{@link flowchartsemantics.flowchartmt.flowchartpck.Wait#getMiliseconds <em>Miliseconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Miliseconds</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Wait#getMiliseconds()
	 * @see #getWait()
	 * @generated
	 */
	EAttribute getWait_Miliseconds();

	/**
	 * Returns the meta object for class '{@link flowchartsemantics.flowchartmt.flowchartpck.VarDecl <em>Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Decl</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.VarDecl
	 * @generated
	 */
	EClass getVarDecl();

	/**
	 * Returns the meta object for the attribute '{@link flowchartsemantics.flowchartmt.flowchartpck.VarDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.VarDecl#getName()
	 * @see #getVarDecl()
	 * @generated
	 */
	EAttribute getVarDecl_Name();

	/**
	 * Returns the meta object for the containment reference '{@link flowchartsemantics.flowchartmt.flowchartpck.VarDecl#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.VarDecl#getExpr()
	 * @see #getVarDecl()
	 * @generated
	 */
	EReference getVarDecl_Expr();

	/**
	 * Returns the meta object for enum '{@link flowchartsemantics.flowchartmt.flowchartpck.ArithmeticOperator <em>Arithmetic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arithmetic Operator</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.ArithmeticOperator
	 * @generated
	 */
	EEnum getArithmeticOperator();

	/**
	 * Returns the meta object for enum '{@link flowchartsemantics.flowchartmt.flowchartpck.RelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relational Operator</em>'.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.RelationalOperator
	 * @generated
	 */
	EEnum getRelationalOperator();

	/**
	 * Returns the meta object for data type '{@link java.util.Hashtable <em>Hashtable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hashtable</em>'.
	 * @see java.util.Hashtable
	 * @model instanceClass="java.util.Hashtable"
	 * @generated
	 */
	EDataType getHashtable();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlowchartpckFactory getFlowchartpckFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.NamedElementImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartImpl <em>Flowchart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getFlowchart()
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
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.NodeImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getNode()
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
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.ArcImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getArc()
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
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.ActionImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getAction()
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
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.DecisionImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getDecision()
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
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.StartImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.EndImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.ConstraintImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.RelationalConstraintImpl <em>Relational Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.RelationalConstraintImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getRelationalConstraint()
		 * @generated
		 */
		EClass RELATIONAL_CONSTRAINT = eINSTANCE.getRelationalConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONSTRAINT__EXPRESSION = eINSTANCE.getRelationalConstraint_Expression();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.ExpressionImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.LiteralImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.IntegerLitImpl <em>Integer Lit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.IntegerLitImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getIntegerLit()
		 * @generated
		 */
		EClass INTEGER_LIT = eINSTANCE.getIntegerLit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LIT__VALUE = eINSTANCE.getIntegerLit_Value();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.StringLitImpl <em>String Lit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.StringLitImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getStringLit()
		 * @generated
		 */
		EClass STRING_LIT = eINSTANCE.getStringLit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LIT__VALUE = eINSTANCE.getStringLit_Value();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.BoolLitImpl <em>Bool Lit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.BoolLitImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getBoolLit()
		 * @generated
		 */
		EClass BOOL_LIT = eINSTANCE.getBoolLit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_LIT__VALUE = eINSTANCE.getBoolLit_Value();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.ArithmeticExpressionImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getArithmeticExpression()
		 * @generated
		 */
		EClass ARITHMETIC_EXPRESSION = eINSTANCE.getArithmeticExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_EXPRESSION__LEFT = eINSTANCE.getArithmeticExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_EXPRESSION__RIGHT = eINSTANCE.getArithmeticExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_EXPRESSION__OPERATOR = eINSTANCE.getArithmeticExpression_Operator();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.RelationalExpressionImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getRelationalExpression()
		 * @generated
		 */
		EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_EXPRESSION__OPERATOR = eINSTANCE.getRelationalExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__LEFT = eINSTANCE.getRelationalExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__RIGHT = eINSTANCE.getRelationalExpression_Right();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.VarReferenceImpl <em>Var Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.VarReferenceImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getVarReference()
		 * @generated
		 */
		EClass VAR_REFERENCE = eINSTANCE.getVarReference();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_REFERENCE__KEY = eINSTANCE.getVarReference_Key();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.StatementImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.ProgramImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__STATEMENTS = eINSTANCE.getProgram_Statements();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.ConditionalImpl <em>Conditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.ConditionalImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getConditional()
		 * @generated
		 */
		EClass CONDITIONAL = eINSTANCE.getConditional();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__CONDITION = eINSTANCE.getConditional_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__BODY = eINSTANCE.getConditional_Body();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.LoopImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__BODY = eINSTANCE.getLoop_Body();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__GUARD = eINSTANCE.getLoop_Guard();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.ConsoleOutputImpl <em>Console Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.ConsoleOutputImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getConsoleOutput()
		 * @generated
		 */
		EClass CONSOLE_OUTPUT = eINSTANCE.getConsoleOutput();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSOLE_OUTPUT__INPUT = eINSTANCE.getConsoleOutput_Input();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.PrintlnImpl <em>Println</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.PrintlnImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getPrintln()
		 * @generated
		 */
		EClass PRINTLN = eINSTANCE.getPrintln();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.PrintImpl <em>Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.PrintImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getPrint()
		 * @generated
		 */
		EClass PRINT = eINSTANCE.getPrint();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.AssignationImpl <em>Assignation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.AssignationImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getAssignation()
		 * @generated
		 */
		EClass ASSIGNATION = eINSTANCE.getAssignation();

		/**
		 * The meta object literal for the '<em><b>Var Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNATION__VAR_REF = eINSTANCE.getAssignation_VarRef();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNATION__EXPRESSION = eINSTANCE.getAssignation_Expression();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.WaitImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getWait()
		 * @generated
		 */
		EClass WAIT = eINSTANCE.getWait();

		/**
		 * The meta object literal for the '<em><b>Miliseconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT__MILISECONDS = eINSTANCE.getWait_Miliseconds();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.impl.VarDeclImpl <em>Var Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.VarDeclImpl
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getVarDecl()
		 * @generated
		 */
		EClass VAR_DECL = eINSTANCE.getVarDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_DECL__NAME = eINSTANCE.getVarDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_DECL__EXPR = eINSTANCE.getVarDecl_Expr();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.ArithmeticOperator
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getArithmeticOperator()
		 * @generated
		 */
		EEnum ARITHMETIC_OPERATOR = eINSTANCE.getArithmeticOperator();

		/**
		 * The meta object literal for the '{@link flowchartsemantics.flowchartmt.flowchartpck.RelationalOperator <em>Relational Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchartsemantics.flowchartmt.flowchartpck.RelationalOperator
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getRelationalOperator()
		 * @generated
		 */
		EEnum RELATIONAL_OPERATOR = eINSTANCE.getRelationalOperator();

		/**
		 * The meta object literal for the '<em>Hashtable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Hashtable
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getHashtable()
		 * @generated
		 */
		EDataType HASHTABLE = eINSTANCE.getHashtable();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see flowchartsemantics.flowchartmt.flowchartpck.impl.FlowchartpckPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

	}

} //FlowchartpckPackage

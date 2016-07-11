/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.Action;
import CompleteDSLPckg.Activity;
import CompleteDSLPckg.ActivityEdge;
import CompleteDSLPckg.ActivityGroup;
import CompleteDSLPckg.ActivityNode;
import CompleteDSLPckg.ActivityPartition;
import CompleteDSLPckg.Classifier;
import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.ExceptionHandler;
import CompleteDSLPckg.ExecutableNode;
import CompleteDSLPckg.InputPin;
import CompleteDSLPckg.InterruptibleActivityRegion;
import CompleteDSLPckg.OutputPin;
import CompleteDSLPckg.RedefinableElement;
import CompleteDSLPckg.StructuredActivityNode;
import CompleteDSLPckg.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getInGroup <em>In Group</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getRedefinedNode <em>Redefined Node</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getHandler <em>Handler</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getInActivity <em>In Activity</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getContainedEdge <em>Contained Edge</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getContext <em>Context</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getInput <em>Input</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#isMustIsolate <em>Must Isolate</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getNode <em>Node</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getStructuredNodeInput <em>Structured Node Input</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredActivityNodeImpl#getStructuredNodeOutput <em>Structured Node Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredActivityNodeImpl extends NamespaceImpl implements StructuredActivityNode {
	/**
	 * The default value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEAF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected boolean isLeaf = IS_LEAF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRedefinedElement() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<RedefinableElement> redefinedElement;

	/**
	 * The cached value of the '{@link #getRedefinitionContext() <em>Redefinition Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitionContext()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> redefinitionContext;

	/**
	 * The cached value of the '{@link #getInGroup() <em>In Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityGroup> inGroup;

	/**
	 * The cached value of the '{@link #getRedefinedNode() <em>Redefined Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> redefinedNode;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> outgoing;

	/**
	 * The cached value of the '{@link #getInPartition() <em>In Partition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPartition()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPartition> inPartition;

	/**
	 * The cached value of the '{@link #getInInterruptibleRegion() <em>In Interruptible Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInInterruptibleRegion()
	 * @generated
	 * @ordered
	 */
	protected InterruptibleActivityRegion inInterruptibleRegion;

	/**
	 * The cached value of the '{@link #getInStructuredNode() <em>In Structured Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInStructuredNode()
	 * @generated
	 * @ordered
	 */
	protected StructuredActivityNode inStructuredNode;

	/**
	 * The cached value of the '{@link #getHandler() <em>Handler</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandler()
	 * @generated
	 * @ordered
	 */
	protected EList<ExceptionHandler> handler;

	/**
	 * The cached value of the '{@link #getSubgroup() <em>Subgroup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubgroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityGroup> subgroup;

	/**
	 * The cached value of the '{@link #getSuperGroup() <em>Super Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperGroup()
	 * @generated
	 * @ordered
	 */
	protected ActivityGroup superGroup;

	/**
	 * The cached value of the '{@link #getInActivity() <em>In Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity inActivity;

	/**
	 * The cached value of the '{@link #getContainedNode() <em>Contained Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> containedNode;

	/**
	 * The cached value of the '{@link #getContainedEdge() <em>Contained Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> containedEdge;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Classifier context;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> output;

	/**
	 * The default value of the '{@link #isMustIsolate() <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustIsolate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_ISOLATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMustIsolate() <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustIsolate()
	 * @generated
	 * @ordered
	 */
	protected boolean mustIsolate = MUST_ISOLATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity activity;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variable;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> node;

	/**
	 * The cached value of the '{@link #getStructuredNodeInput() <em>Structured Node Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredNodeInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> structuredNodeInput;

	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> edge;

	/**
	 * The cached value of the '{@link #getStructuredNodeOutput() <em>Structured Node Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredNodeOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> structuredNodeOutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteDSLPckgPackage.eINSTANCE.getStructuredActivityNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLeaf() {
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RedefinableElement> getRedefinedElement() {
		if (redefinedElement == null) {
			redefinedElement = new EObjectResolvingEList<RedefinableElement>(RedefinableElement.class, this, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT);
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRedefinitionContext() {
		if (redefinitionContext == null) {
			redefinitionContext = new EObjectResolvingEList<Classifier>(Classifier.class, this, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT);
		}
		return redefinitionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getInGroup() {
		if (inGroup == null) {
			inGroup = new EObjectResolvingEList<ActivityGroup>(ActivityGroup.class, this, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP);
		}
		return inGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getRedefinedNode() {
		if (redefinedNode == null) {
			redefinedNode = new EObjectResolvingEList<ActivityNode>(ActivityNode.class, this, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE);
		}
		return redefinedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectResolvingEList<ActivityEdge>(ActivityEdge.class, this, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__INCOMING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectResolvingEList<ActivityEdge>(ActivityEdge.class, this, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPartition> getInPartition() {
		if (inPartition == null) {
			inPartition = new EObjectResolvingEList<ActivityPartition>(ActivityPartition.class, this, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION);
		}
		return inPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion getInInterruptibleRegion() {
		if (inInterruptibleRegion != null && inInterruptibleRegion.eIsProxy()) {
			InternalEObject oldInInterruptibleRegion = (InternalEObject)inInterruptibleRegion;
			inInterruptibleRegion = (InterruptibleActivityRegion)eResolveProxy(oldInInterruptibleRegion);
			if (inInterruptibleRegion != oldInInterruptibleRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION, oldInInterruptibleRegion, inInterruptibleRegion));
			}
		}
		return inInterruptibleRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion basicGetInInterruptibleRegion() {
		return inInterruptibleRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInInterruptibleRegion(InterruptibleActivityRegion newInInterruptibleRegion) {
		InterruptibleActivityRegion oldInInterruptibleRegion = inInterruptibleRegion;
		inInterruptibleRegion = newInInterruptibleRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION, oldInInterruptibleRegion, inInterruptibleRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getInStructuredNode() {
		if (inStructuredNode != null && inStructuredNode.eIsProxy()) {
			InternalEObject oldInStructuredNode = (InternalEObject)inStructuredNode;
			inStructuredNode = (StructuredActivityNode)eResolveProxy(oldInStructuredNode);
			if (inStructuredNode != oldInStructuredNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE, oldInStructuredNode, inStructuredNode));
			}
		}
		return inStructuredNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode basicGetInStructuredNode() {
		return inStructuredNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInStructuredNode(StructuredActivityNode newInStructuredNode) {
		StructuredActivityNode oldInStructuredNode = inStructuredNode;
		inStructuredNode = newInStructuredNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE, oldInStructuredNode, inStructuredNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExceptionHandler> getHandler() {
		if (handler == null) {
			handler = new EObjectContainmentEList<ExceptionHandler>(ExceptionHandler.class, this, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__HANDLER);
		}
		return handler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getSubgroup() {
		if (subgroup == null) {
			subgroup = new EObjectContainmentEList<ActivityGroup>(ActivityGroup.class, this, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP);
		}
		return subgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getSuperGroup() {
		if (superGroup != null && superGroup.eIsProxy()) {
			InternalEObject oldSuperGroup = (InternalEObject)superGroup;
			superGroup = (ActivityGroup)eResolveProxy(oldSuperGroup);
			if (superGroup != oldSuperGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP, oldSuperGroup, superGroup));
			}
		}
		return superGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup basicGetSuperGroup() {
		return superGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperGroup(ActivityGroup newSuperGroup) {
		ActivityGroup oldSuperGroup = superGroup;
		superGroup = newSuperGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP, oldSuperGroup, superGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getInActivity() {
		if (inActivity != null && inActivity.eIsProxy()) {
			InternalEObject oldInActivity = (InternalEObject)inActivity;
			inActivity = (Activity)eResolveProxy(oldInActivity);
			if (inActivity != oldInActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY, oldInActivity, inActivity));
			}
		}
		return inActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetInActivity() {
		return inActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInActivity(Activity newInActivity) {
		Activity oldInActivity = inActivity;
		inActivity = newInActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY, oldInActivity, inActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getContainedNode() {
		if (containedNode == null) {
			containedNode = new EObjectResolvingEList<ActivityNode>(ActivityNode.class, this, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE);
		}
		return containedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getContainedEdge() {
		if (containedEdge == null) {
			containedEdge = new EObjectResolvingEList<ActivityEdge>(ActivityEdge.class, this, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE);
		}
		return containedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (Classifier)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Classifier newContext) {
		Classifier oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<InputPin>(InputPin.class, this, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMustIsolate() {
		return mustIsolate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustIsolate(boolean newMustIsolate) {
		boolean oldMustIsolate = mustIsolate;
		mustIsolate = newMustIsolate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE, oldMustIsolate, mustIsolate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		if (activity != null && activity.eIsProxy()) {
			InternalEObject oldActivity = (InternalEObject)activity;
			activity = (Activity)eResolveProxy(oldActivity);
			if (activity != oldActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY, oldActivity, activity));
			}
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		Activity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY, oldActivity, activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<Variable>(Variable.class, this, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<ActivityNode>(ActivityNode.class, this, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getStructuredNodeInput() {
		if (structuredNodeInput == null) {
			structuredNodeInput = new EObjectContainmentEList<InputPin>(InputPin.class, this, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT);
		}
		return structuredNodeInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getEdge() {
		if (edge == null) {
			edge = new EObjectContainmentEList<ActivityEdge>(ActivityEdge.class, this, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__EDGE);
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getStructuredNodeOutput() {
		if (structuredNodeOutput == null) {
			structuredNodeOutput = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT);
		}
		return structuredNodeOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__HANDLER:
				return ((InternalEList<?>)getHandler()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP:
				return ((InternalEList<?>)getSubgroup()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				return ((InternalEList<?>)getStructuredNodeInput()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				return ((InternalEList<?>)getStructuredNodeOutput()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IS_LEAF:
				return isIsLeaf();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP:
				return getInGroup();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE:
				return getRedefinedNode();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__INCOMING:
				return getIncoming();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING:
				return getOutgoing();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION:
				return getInPartition();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				if (resolve) return getInInterruptibleRegion();
				return basicGetInInterruptibleRegion();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				if (resolve) return getInStructuredNode();
				return basicGetInStructuredNode();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__HANDLER:
				return getHandler();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP:
				return getSubgroup();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				if (resolve) return getSuperGroup();
				return basicGetSuperGroup();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				if (resolve) return getInActivity();
				return basicGetInActivity();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return getContainedNode();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return getContainedEdge();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__INPUT:
				return getInput();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT:
				return getOutput();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				return isMustIsolate();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return getVariable();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				return getNode();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				return getStructuredNodeInput();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				return getEdge();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				return getStructuredNodeOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				getRedefinedElement().addAll((Collection<? extends RedefinableElement>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				getRedefinitionContext().addAll((Collection<? extends Classifier>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP:
				getInGroup().clear();
				getInGroup().addAll((Collection<? extends ActivityGroup>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE:
				getRedefinedNode().clear();
				getRedefinedNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION:
				getInPartition().clear();
				getInPartition().addAll((Collection<? extends ActivityPartition>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				setInInterruptibleRegion((InterruptibleActivityRegion)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__HANDLER:
				getHandler().clear();
				getHandler().addAll((Collection<? extends ExceptionHandler>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP:
				getSubgroup().clear();
				getSubgroup().addAll((Collection<? extends ActivityGroup>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				setSuperGroup((ActivityGroup)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				setInActivity((Activity)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				getContainedNode().clear();
				getContainedNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				getContainedEdge().clear();
				getContainedEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT:
				setContext((Classifier)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends InputPin>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				setMustIsolate((Boolean)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Variable>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				getStructuredNodeInput().clear();
				getStructuredNodeInput().addAll((Collection<? extends InputPin>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				getEdge().clear();
				getEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				getStructuredNodeOutput().clear();
				getStructuredNodeOutput().addAll((Collection<? extends OutputPin>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP:
				getInGroup().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE:
				getRedefinedNode().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__INCOMING:
				getIncoming().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING:
				getOutgoing().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION:
				getInPartition().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				setInInterruptibleRegion((InterruptibleActivityRegion)null);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__HANDLER:
				getHandler().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP:
				getSubgroup().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				setSuperGroup((ActivityGroup)null);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				setInActivity((Activity)null);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				getContainedNode().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				getContainedEdge().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT:
				setContext((Classifier)null);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__INPUT:
				getInput().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT:
				getOutput().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
				setActivity((Activity)null);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				getVariable().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				getNode().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				getStructuredNodeInput().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				getEdge().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				getStructuredNodeOutput().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT:
				return redefinedElement != null && !redefinedElement.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT:
				return redefinitionContext != null && !redefinitionContext.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP:
				return inGroup != null && !inGroup.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE:
				return redefinedNode != null && !redefinedNode.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION:
				return inPartition != null && !inPartition.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegion != null;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return inStructuredNode != null;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__HANDLER:
				return handler != null && !handler.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP:
				return subgroup != null && !subgroup.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				return superGroup != null;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				return inActivity != null;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return containedNode != null && !containedNode.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return containedEdge != null && !containedEdge.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT:
				return context != null;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__INPUT:
				return input != null && !input.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT:
				return output != null && !output.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				return mustIsolate != MUST_ISOLATE_EDEFAULT;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
				return activity != null;
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return variable != null && !variable.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				return node != null && !node.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				return structuredNodeInput != null && !structuredNodeInput.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				return edge != null && !edge.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				return structuredNodeOutput != null && !structuredNodeOutput.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IS_LEAF: return CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT: return CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT: return CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == ActivityNode.class) {
			switch (derivedFeatureID) {
				case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP: return CompleteDSLPckgPackage.ACTIVITY_NODE__IN_GROUP;
				case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE: return CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINED_NODE;
				case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__INCOMING: return CompleteDSLPckgPackage.ACTIVITY_NODE__INCOMING;
				case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING: return CompleteDSLPckgPackage.ACTIVITY_NODE__OUTGOING;
				case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION: return CompleteDSLPckgPackage.ACTIVITY_NODE__IN_PARTITION;
				case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION: return CompleteDSLPckgPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;
				case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE: return CompleteDSLPckgPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE;
				default: return -1;
			}
		}
		if (baseClass == ExecutableNode.class) {
			switch (derivedFeatureID) {
				case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__HANDLER: return CompleteDSLPckgPackage.EXECUTABLE_NODE__HANDLER;
				default: return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (derivedFeatureID) {
				case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP: return CompleteDSLPckgPackage.ACTIVITY_GROUP__SUBGROUP;
				case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP: return CompleteDSLPckgPackage.ACTIVITY_GROUP__SUPER_GROUP;
				case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY: return CompleteDSLPckgPackage.ACTIVITY_GROUP__IN_ACTIVITY;
				case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE: return CompleteDSLPckgPackage.ACTIVITY_GROUP__CONTAINED_NODE;
				case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE: return CompleteDSLPckgPackage.ACTIVITY_GROUP__CONTAINED_EDGE;
				default: return -1;
			}
		}
		if (baseClass == Action.class) {
			switch (derivedFeatureID) {
				case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT: return CompleteDSLPckgPackage.ACTION__CONTEXT;
				case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__INPUT: return CompleteDSLPckgPackage.ACTION__INPUT;
				case CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT: return CompleteDSLPckgPackage.ACTION__OUTPUT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__IS_LEAF: return CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IS_LEAF;
				case CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT;
				case CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == ActivityNode.class) {
			switch (baseFeatureID) {
				case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_GROUP: return CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP;
				case CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINED_NODE: return CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE;
				case CompleteDSLPckgPackage.ACTIVITY_NODE__INCOMING: return CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__INCOMING;
				case CompleteDSLPckgPackage.ACTIVITY_NODE__OUTGOING: return CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING;
				case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_PARTITION: return CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION;
				case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION: return CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;
				case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE: return CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE;
				default: return -1;
			}
		}
		if (baseClass == ExecutableNode.class) {
			switch (baseFeatureID) {
				case CompleteDSLPckgPackage.EXECUTABLE_NODE__HANDLER: return CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__HANDLER;
				default: return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (baseFeatureID) {
				case CompleteDSLPckgPackage.ACTIVITY_GROUP__SUBGROUP: return CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP;
				case CompleteDSLPckgPackage.ACTIVITY_GROUP__SUPER_GROUP: return CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP;
				case CompleteDSLPckgPackage.ACTIVITY_GROUP__IN_ACTIVITY: return CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY;
				case CompleteDSLPckgPackage.ACTIVITY_GROUP__CONTAINED_NODE: return CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE;
				case CompleteDSLPckgPackage.ACTIVITY_GROUP__CONTAINED_EDGE: return CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE;
				default: return -1;
			}
		}
		if (baseClass == Action.class) {
			switch (baseFeatureID) {
				case CompleteDSLPckgPackage.ACTION__CONTEXT: return CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT;
				case CompleteDSLPckgPackage.ACTION__INPUT: return CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__INPUT;
				case CompleteDSLPckgPackage.ACTION__OUTPUT: return CompleteDSLPckgPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isLeaf: ");
		result.append(isLeaf);
		result.append(", mustIsolate: ");
		result.append(mustIsolate);
		result.append(')');
		return result.toString();
	}

} //StructuredActivityNodeImpl

/**
 */
package Activities.StructuredActivities.impl;

import Activities.BasicActivities.ActivityEdge;
import Activities.BasicActivities.BasicActivitiesPackage;
import Activities.BasicActivities.RedefinableElement;

import Activities.CompleteStructuredActivities.InputPin;

import Activities.ExtraStructuredActivities.ExceptionHandler;
import Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage;

import Activities.FundamentalActivities.Action;
import Activities.FundamentalActivities.Activity;
import Activities.FundamentalActivities.ActivityGroup;
import Activities.FundamentalActivities.ActivityNode;
import Activities.FundamentalActivities.FundamentalActivitiesPackage;
import Activities.FundamentalActivities.NamedElement;

import Activities.FundamentalActivities.impl.NamespaceImpl;

import Activities.IntermediateActivities.ActivityPartition;
import Activities.IntermediateActivities.Constraint;
import Activities.IntermediateActivities.IntermediateActivitiesPackage;
import Activities.IntermediateActivities.InterruptibleActivityRegion;

import Activities.StructuredActivities.ExecutableNode;
import Activities.StructuredActivities.OutputPin;
import Activities.StructuredActivities.StructuredActivitiesPackage;
import Activities.StructuredActivities.StructuredActivityNode;
import Activities.StructuredActivities.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getInGroup <em>In Group</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getRedefinedNode <em>Redefined Node</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getHandler <em>Handler</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getInActivity <em>In Activity</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getContainedEdge <em>Contained Edge</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#isIsLocallyReentrant <em>Is Locally Reentrant</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getLocalPrecondition <em>Local Precondition</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getLocalPostcondition <em>Local Postcondition</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getInput <em>Input</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getNode <em>Node</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getStructuredNodeInput <em>Structured Node Input</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#isMustIsolate <em>Must Isolate</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.StructuredActivityNodeImpl#getStructuredNodeOutput <em>Structured Node Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredActivityNodeImpl extends NamespaceImpl implements StructuredActivityNode {
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
	 * The default value of the '{@link #isIsLocallyReentrant() <em>Is Locally Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocallyReentrant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOCALLY_REENTRANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLocallyReentrant() <em>Is Locally Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocallyReentrant()
	 * @generated
	 * @ordered
	 */
	protected boolean isLocallyReentrant = IS_LOCALLY_REENTRANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocalPrecondition() <em>Local Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> localPrecondition;

	/**
	 * The cached value of the '{@link #getLocalPostcondition() <em>Local Postcondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPostcondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> localPostcondition;

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
		return StructuredActivitiesPackage.Literals.STRUCTURED_ACTIVITY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RedefinableElement> getRedefinedElement() {
		if (redefinedElement == null) {
			redefinedElement = new EObjectResolvingEList<RedefinableElement>(RedefinableElement.class, this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT);
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getInGroup() {
		if (inGroup == null) {
			inGroup = new EObjectWithInverseResolvingEList.ManyInverse<ActivityGroup>(ActivityGroup.class, this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP, FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_NODE);
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
			redefinedNode = new EObjectResolvingEList<ActivityNode>(ActivityNode.class, this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE);
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
			incoming = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INCOMING, BasicActivitiesPackage.ACTIVITY_EDGE__TARGET);
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
			outgoing = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING, BasicActivitiesPackage.ACTIVITY_EDGE__SOURCE);
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
			inPartition = new EObjectWithInverseResolvingEList.ManyInverse<ActivityPartition>(ActivityPartition.class, this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION, IntermediateActivitiesPackage.ACTIVITY_PARTITION__NODE);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION, oldInInterruptibleRegion, inInterruptibleRegion));
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
	public NotificationChain basicSetInInterruptibleRegion(InterruptibleActivityRegion newInInterruptibleRegion, NotificationChain msgs) {
		InterruptibleActivityRegion oldInInterruptibleRegion = inInterruptibleRegion;
		inInterruptibleRegion = newInInterruptibleRegion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION, oldInInterruptibleRegion, newInInterruptibleRegion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInInterruptibleRegion(InterruptibleActivityRegion newInInterruptibleRegion) {
		if (newInInterruptibleRegion != inInterruptibleRegion) {
			NotificationChain msgs = null;
			if (inInterruptibleRegion != null)
				msgs = ((InternalEObject)inInterruptibleRegion).eInverseRemove(this, IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE, InterruptibleActivityRegion.class, msgs);
			if (newInInterruptibleRegion != null)
				msgs = ((InternalEObject)newInInterruptibleRegion).eInverseAdd(this, IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE, InterruptibleActivityRegion.class, msgs);
			msgs = basicSetInInterruptibleRegion(newInInterruptibleRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION, newInInterruptibleRegion, newInInterruptibleRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getInStructuredNode() {
		if (eContainerFeatureID() != StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE) return null;
		return (StructuredActivityNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInStructuredNode(StructuredActivityNode newInStructuredNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInStructuredNode, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInStructuredNode(StructuredActivityNode newInStructuredNode) {
		if (newInStructuredNode != eInternalContainer() || (eContainerFeatureID() != StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE && newInStructuredNode != null)) {
			if (EcoreUtil.isAncestor(this, newInStructuredNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInStructuredNode != null)
				msgs = ((InternalEObject)newInStructuredNode).eInverseAdd(this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NODE, StructuredActivityNode.class, msgs);
			msgs = basicSetInStructuredNode(newInStructuredNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE, newInStructuredNode, newInStructuredNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExceptionHandler> getHandler() {
		if (handler == null) {
			handler = new EObjectContainmentWithInverseEList<ExceptionHandler>(ExceptionHandler.class, this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__HANDLER, ExtraStructuredActivitiesPackage.EXCEPTION_HANDLER__PROTECTED_NODE);
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
			subgroup = new EObjectContainmentWithInverseEList<ActivityGroup>(ActivityGroup.class, this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP, FundamentalActivitiesPackage.ACTIVITY_GROUP__SUPER_GROUP);
		}
		return subgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getSuperGroup() {
		if (eContainerFeatureID() != StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP) return null;
		return (ActivityGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperGroup(ActivityGroup newSuperGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuperGroup, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperGroup(ActivityGroup newSuperGroup) {
		if (newSuperGroup != eInternalContainer() || (eContainerFeatureID() != StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP && newSuperGroup != null)) {
			if (EcoreUtil.isAncestor(this, newSuperGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperGroup != null)
				msgs = ((InternalEObject)newSuperGroup).eInverseAdd(this, FundamentalActivitiesPackage.ACTIVITY_GROUP__SUBGROUP, ActivityGroup.class, msgs);
			msgs = basicSetSuperGroup(newSuperGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP, newSuperGroup, newSuperGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getInActivity() {
		if (eContainerFeatureID() != StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY) return null;
		return (Activity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInActivity(Activity newInActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInActivity, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInActivity(Activity newInActivity) {
		if (newInActivity != eInternalContainer() || (eContainerFeatureID() != StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY && newInActivity != null)) {
			if (EcoreUtil.isAncestor(this, newInActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInActivity != null)
				msgs = ((InternalEObject)newInActivity).eInverseAdd(this, FundamentalActivitiesPackage.ACTIVITY__GROUP, Activity.class, msgs);
			msgs = basicSetInActivity(newInActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY, newInActivity, newInActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getContainedNode() {
		if (containedNode == null) {
			containedNode = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNode>(ActivityNode.class, this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE, FundamentalActivitiesPackage.ACTIVITY_NODE__IN_GROUP);
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
			containedEdge = new EObjectWithInverseResolvingEList.ManyInverse<ActivityEdge>(ActivityEdge.class, this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE, BasicActivitiesPackage.ACTIVITY_EDGE__IN_GROUP);
		}
		return containedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLocallyReentrant() {
		return isLocallyReentrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLocallyReentrant(boolean newIsLocallyReentrant) {
		boolean oldIsLocallyReentrant = isLocallyReentrant;
		isLocallyReentrant = newIsLocallyReentrant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IS_LOCALLY_REENTRANT, oldIsLocallyReentrant, isLocallyReentrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getLocalPrecondition() {
		if (localPrecondition == null) {
			localPrecondition = new EObjectContainmentEList<Constraint>(Constraint.class, this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION);
		}
		return localPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getLocalPostcondition() {
		if (localPostcondition == null) {
			localPostcondition = new EObjectContainmentEList<Constraint>(Constraint.class, this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION);
		}
		return localPostcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<InputPin>(InputPin.class, this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INPUT);
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
			output = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		if (eContainerFeatureID() != StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY) return null;
		return (Activity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivity, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		if (newActivity != eInternalContainer() || (eContainerFeatureID() != StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY && newActivity != null)) {
			if (EcoreUtil.isAncestor(this, newActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, FundamentalActivitiesPackage.ACTIVITY__STRUCTURED_NODE, Activity.class, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<Variable>(Variable.class, this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE);
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
			node = new EObjectContainmentWithInverseEList<ActivityNode>(ActivityNode.class, this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NODE, FundamentalActivitiesPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE);
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
			structuredNodeInput = new EObjectContainmentEList<InputPin>(InputPin.class, this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT);
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
			edge = new EObjectContainmentWithInverseEList<ActivityEdge>(ActivityEdge.class, this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE, BasicActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE);
		}
		return edge;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE, oldMustIsolate, mustIsolate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getStructuredNodeOutput() {
		if (structuredNodeOutput == null) {
			structuredNodeOutput = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT);
		}
		return structuredNodeOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInGroup()).basicAdd(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInPartition()).basicAdd(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				if (inInterruptibleRegion != null)
					msgs = ((InternalEObject)inInterruptibleRegion).eInverseRemove(this, IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE, InterruptibleActivityRegion.class, msgs);
				return basicSetInInterruptibleRegion((InterruptibleActivityRegion)otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInStructuredNode((StructuredActivityNode)otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__HANDLER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHandler()).basicAdd(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubgroup()).basicAdd(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuperGroup((ActivityGroup)otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInActivity((Activity)otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedNode()).basicAdd(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedEdge()).basicAdd(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivity((Activity)otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNode()).basicAdd(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdge()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP:
				return ((InternalEList<?>)getInGroup()).basicRemove(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION:
				return ((InternalEList<?>)getInPartition()).basicRemove(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return basicSetInInterruptibleRegion(null, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return basicSetInStructuredNode(null, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__HANDLER:
				return ((InternalEList<?>)getHandler()).basicRemove(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP:
				return ((InternalEList<?>)getSubgroup()).basicRemove(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				return basicSetSuperGroup(null, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				return basicSetInActivity(null, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return ((InternalEList<?>)getContainedNode()).basicRemove(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return ((InternalEList<?>)getContainedEdge()).basicRemove(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
				return ((InternalEList<?>)getLocalPrecondition()).basicRemove(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
				return ((InternalEList<?>)getLocalPostcondition()).basicRemove(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
				return basicSetActivity(null, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				return ((InternalEList<?>)getStructuredNodeInput()).basicRemove(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return eInternalContainer().eInverseRemove(this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NODE, StructuredActivityNode.class, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				return eInternalContainer().eInverseRemove(this, FundamentalActivitiesPackage.ACTIVITY_GROUP__SUBGROUP, ActivityGroup.class, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				return eInternalContainer().eInverseRemove(this, FundamentalActivitiesPackage.ACTIVITY__GROUP, Activity.class, msgs);
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
				return eInternalContainer().eInverseRemove(this, FundamentalActivitiesPackage.ACTIVITY__STRUCTURED_NODE, Activity.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP:
				return getInGroup();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE:
				return getRedefinedNode();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INCOMING:
				return getIncoming();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING:
				return getOutgoing();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION:
				return getInPartition();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				if (resolve) return getInInterruptibleRegion();
				return basicGetInInterruptibleRegion();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__HANDLER:
				return getHandler();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP:
				return getSubgroup();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				return getSuperGroup();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				return getInActivity();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return getContainedNode();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return getContainedEdge();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IS_LOCALLY_REENTRANT:
				return isIsLocallyReentrant();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
				return getLocalPrecondition();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
				return getLocalPostcondition();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INPUT:
				return getInput();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT:
				return getOutput();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
				return getActivity();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return getVariable();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				return getNode();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				return getStructuredNodeInput();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				return getEdge();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				return isMustIsolate();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
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
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				getRedefinedElement().addAll((Collection<? extends RedefinableElement>)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP:
				getInGroup().clear();
				getInGroup().addAll((Collection<? extends ActivityGroup>)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE:
				getRedefinedNode().clear();
				getRedefinedNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION:
				getInPartition().clear();
				getInPartition().addAll((Collection<? extends ActivityPartition>)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				setInInterruptibleRegion((InterruptibleActivityRegion)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__HANDLER:
				getHandler().clear();
				getHandler().addAll((Collection<? extends ExceptionHandler>)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP:
				getSubgroup().clear();
				getSubgroup().addAll((Collection<? extends ActivityGroup>)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				setSuperGroup((ActivityGroup)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				setInActivity((Activity)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				getContainedNode().clear();
				getContainedNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				getContainedEdge().clear();
				getContainedEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IS_LOCALLY_REENTRANT:
				setIsLocallyReentrant((Boolean)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
				getLocalPrecondition().clear();
				getLocalPrecondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
				getLocalPostcondition().clear();
				getLocalPostcondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends InputPin>)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Variable>)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				getStructuredNodeInput().clear();
				getStructuredNodeInput().addAll((Collection<? extends InputPin>)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				getEdge().clear();
				getEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				setMustIsolate((Boolean)newValue);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
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
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP:
				getInGroup().clear();
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE:
				getRedefinedNode().clear();
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INCOMING:
				getIncoming().clear();
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING:
				getOutgoing().clear();
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION:
				getInPartition().clear();
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				setInInterruptibleRegion((InterruptibleActivityRegion)null);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__HANDLER:
				getHandler().clear();
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP:
				getSubgroup().clear();
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				setSuperGroup((ActivityGroup)null);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				setInActivity((Activity)null);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				getContainedNode().clear();
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				getContainedEdge().clear();
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IS_LOCALLY_REENTRANT:
				setIsLocallyReentrant(IS_LOCALLY_REENTRANT_EDEFAULT);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
				getLocalPrecondition().clear();
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
				getLocalPostcondition().clear();
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INPUT:
				getInput().clear();
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT:
				getOutput().clear();
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
				setActivity((Activity)null);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				getVariable().clear();
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				getNode().clear();
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				getStructuredNodeInput().clear();
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				getEdge().clear();
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
				return;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
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
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT:
				return redefinedElement != null && !redefinedElement.isEmpty();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP:
				return inGroup != null && !inGroup.isEmpty();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE:
				return redefinedNode != null && !redefinedNode.isEmpty();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION:
				return inPartition != null && !inPartition.isEmpty();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegion != null;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__HANDLER:
				return handler != null && !handler.isEmpty();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP:
				return subgroup != null && !subgroup.isEmpty();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				return getSuperGroup() != null;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				return getInActivity() != null;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return containedNode != null && !containedNode.isEmpty();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return containedEdge != null && !containedEdge.isEmpty();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IS_LOCALLY_REENTRANT:
				return isLocallyReentrant != IS_LOCALLY_REENTRANT_EDEFAULT;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
				return localPrecondition != null && !localPrecondition.isEmpty();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
				return localPostcondition != null && !localPostcondition.isEmpty();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INPUT:
				return input != null && !input.isEmpty();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT:
				return output != null && !output.isEmpty();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
				return getActivity() != null;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return variable != null && !variable.isEmpty();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				return node != null && !node.isEmpty();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				return structuredNodeInput != null && !structuredNodeInput.isEmpty();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				return edge != null && !edge.isEmpty();
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				return mustIsolate != MUST_ISOLATE_EDEFAULT;
			case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT: return BasicActivitiesPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == ActivityNode.class) {
			switch (derivedFeatureID) {
				case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP: return FundamentalActivitiesPackage.ACTIVITY_NODE__IN_GROUP;
				case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE: return FundamentalActivitiesPackage.ACTIVITY_NODE__REDEFINED_NODE;
				case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INCOMING: return FundamentalActivitiesPackage.ACTIVITY_NODE__INCOMING;
				case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING: return FundamentalActivitiesPackage.ACTIVITY_NODE__OUTGOING;
				case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION: return FundamentalActivitiesPackage.ACTIVITY_NODE__IN_PARTITION;
				case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION: return FundamentalActivitiesPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;
				case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE: return FundamentalActivitiesPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE;
				default: return -1;
			}
		}
		if (baseClass == ExecutableNode.class) {
			switch (derivedFeatureID) {
				case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__HANDLER: return StructuredActivitiesPackage.EXECUTABLE_NODE__HANDLER;
				default: return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (derivedFeatureID) {
				case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP: return FundamentalActivitiesPackage.ACTIVITY_GROUP__SUBGROUP;
				case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP: return FundamentalActivitiesPackage.ACTIVITY_GROUP__SUPER_GROUP;
				case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY: return FundamentalActivitiesPackage.ACTIVITY_GROUP__IN_ACTIVITY;
				case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE: return FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_NODE;
				case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE: return FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_EDGE;
				default: return -1;
			}
		}
		if (baseClass == Action.class) {
			switch (derivedFeatureID) {
				case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IS_LOCALLY_REENTRANT: return FundamentalActivitiesPackage.ACTION__IS_LOCALLY_REENTRANT;
				case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION: return FundamentalActivitiesPackage.ACTION__LOCAL_PRECONDITION;
				case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION: return FundamentalActivitiesPackage.ACTION__LOCAL_POSTCONDITION;
				case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INPUT: return FundamentalActivitiesPackage.ACTION__INPUT;
				case StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT: return FundamentalActivitiesPackage.ACTION__OUTPUT;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case BasicActivitiesPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == ActivityNode.class) {
			switch (baseFeatureID) {
				case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_GROUP: return StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP;
				case FundamentalActivitiesPackage.ACTIVITY_NODE__REDEFINED_NODE: return StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE;
				case FundamentalActivitiesPackage.ACTIVITY_NODE__INCOMING: return StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INCOMING;
				case FundamentalActivitiesPackage.ACTIVITY_NODE__OUTGOING: return StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING;
				case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_PARTITION: return StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION;
				case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION: return StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;
				case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE: return StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE;
				default: return -1;
			}
		}
		if (baseClass == ExecutableNode.class) {
			switch (baseFeatureID) {
				case StructuredActivitiesPackage.EXECUTABLE_NODE__HANDLER: return StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__HANDLER;
				default: return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (baseFeatureID) {
				case FundamentalActivitiesPackage.ACTIVITY_GROUP__SUBGROUP: return StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP;
				case FundamentalActivitiesPackage.ACTIVITY_GROUP__SUPER_GROUP: return StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP;
				case FundamentalActivitiesPackage.ACTIVITY_GROUP__IN_ACTIVITY: return StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY;
				case FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_NODE: return StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE;
				case FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_EDGE: return StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE;
				default: return -1;
			}
		}
		if (baseClass == Action.class) {
			switch (baseFeatureID) {
				case FundamentalActivitiesPackage.ACTION__IS_LOCALLY_REENTRANT: return StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IS_LOCALLY_REENTRANT;
				case FundamentalActivitiesPackage.ACTION__LOCAL_PRECONDITION: return StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION;
				case FundamentalActivitiesPackage.ACTION__LOCAL_POSTCONDITION: return StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION;
				case FundamentalActivitiesPackage.ACTION__INPUT: return StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INPUT;
				case FundamentalActivitiesPackage.ACTION__OUTPUT: return StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT;
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
		result.append(" (isLocallyReentrant: ");
		result.append(isLocallyReentrant);
		result.append(", mustIsolate: ");
		result.append(mustIsolate);
		result.append(')');
		return result.toString();
	}

} //StructuredActivityNodeImpl

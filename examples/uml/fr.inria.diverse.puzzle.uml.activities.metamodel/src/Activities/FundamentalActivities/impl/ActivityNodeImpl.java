/**
 */
package Activities.FundamentalActivities.impl;

import Activities.BasicActivities.ActivityEdge;
import Activities.BasicActivities.BasicActivitiesPackage;
import Activities.BasicActivities.RedefinableElement;

import Activities.FundamentalActivities.ActivityGroup;
import Activities.FundamentalActivities.ActivityNode;
import Activities.FundamentalActivities.FundamentalActivitiesPackage;

import Activities.IntermediateActivities.ActivityPartition;
import Activities.IntermediateActivities.IntermediateActivitiesPackage;
import Activities.IntermediateActivities.InterruptibleActivityRegion;

import Activities.StructuredActivities.StructuredActivitiesPackage;
import Activities.StructuredActivities.StructuredActivityNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityNodeImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityNodeImpl#getInGroup <em>In Group</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityNodeImpl#getRedefinedNode <em>Redefined Node</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityNodeImpl#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityNodeImpl#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityNodeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityNodeImpl extends NamedElementImpl implements ActivityNode {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FundamentalActivitiesPackage.Literals.ACTIVITY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RedefinableElement> getRedefinedElement() {
		if (redefinedElement == null) {
			redefinedElement = new EObjectResolvingEList<RedefinableElement>(RedefinableElement.class, this, FundamentalActivitiesPackage.ACTIVITY_NODE__REDEFINED_ELEMENT);
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
			inGroup = new EObjectWithInverseResolvingEList.ManyInverse<ActivityGroup>(ActivityGroup.class, this, FundamentalActivitiesPackage.ACTIVITY_NODE__IN_GROUP, FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_NODE);
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
			redefinedNode = new EObjectResolvingEList<ActivityNode>(ActivityNode.class, this, FundamentalActivitiesPackage.ACTIVITY_NODE__REDEFINED_NODE);
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
			incoming = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, FundamentalActivitiesPackage.ACTIVITY_NODE__INCOMING, BasicActivitiesPackage.ACTIVITY_EDGE__TARGET);
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
			outgoing = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, FundamentalActivitiesPackage.ACTIVITY_NODE__OUTGOING, BasicActivitiesPackage.ACTIVITY_EDGE__SOURCE);
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
			inPartition = new EObjectWithInverseResolvingEList.ManyInverse<ActivityPartition>(ActivityPartition.class, this, FundamentalActivitiesPackage.ACTIVITY_NODE__IN_PARTITION, IntermediateActivitiesPackage.ACTIVITY_PARTITION__NODE);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FundamentalActivitiesPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION, oldInInterruptibleRegion, inInterruptibleRegion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FundamentalActivitiesPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION, oldInInterruptibleRegion, newInInterruptibleRegion);
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
			eNotify(new ENotificationImpl(this, Notification.SET, FundamentalActivitiesPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION, newInInterruptibleRegion, newInInterruptibleRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getInStructuredNode() {
		if (eContainerFeatureID() != FundamentalActivitiesPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE) return null;
		return (StructuredActivityNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInStructuredNode(StructuredActivityNode newInStructuredNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInStructuredNode, FundamentalActivitiesPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInStructuredNode(StructuredActivityNode newInStructuredNode) {
		if (newInStructuredNode != eInternalContainer() || (eContainerFeatureID() != FundamentalActivitiesPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE && newInStructuredNode != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, FundamentalActivitiesPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE, newInStructuredNode, newInStructuredNode));
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
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_GROUP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInGroup()).basicAdd(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY_NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY_NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_PARTITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInPartition()).basicAdd(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				if (inInterruptibleRegion != null)
					msgs = ((InternalEObject)inInterruptibleRegion).eInverseRemove(this, IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE, InterruptibleActivityRegion.class, msgs);
				return basicSetInInterruptibleRegion((InterruptibleActivityRegion)otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInStructuredNode((StructuredActivityNode)otherEnd, msgs);
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
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_GROUP:
				return ((InternalEList<?>)getInGroup()).basicRemove(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY_NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY_NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_PARTITION:
				return ((InternalEList<?>)getInPartition()).basicRemove(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return basicSetInInterruptibleRegion(null, msgs);
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return basicSetInStructuredNode(null, msgs);
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
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return eInternalContainer().eInverseRemove(this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NODE, StructuredActivityNode.class, msgs);
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
			case FundamentalActivitiesPackage.ACTIVITY_NODE__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_GROUP:
				return getInGroup();
			case FundamentalActivitiesPackage.ACTIVITY_NODE__REDEFINED_NODE:
				return getRedefinedNode();
			case FundamentalActivitiesPackage.ACTIVITY_NODE__INCOMING:
				return getIncoming();
			case FundamentalActivitiesPackage.ACTIVITY_NODE__OUTGOING:
				return getOutgoing();
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_PARTITION:
				return getInPartition();
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				if (resolve) return getInInterruptibleRegion();
				return basicGetInInterruptibleRegion();
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode();
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
			case FundamentalActivitiesPackage.ACTIVITY_NODE__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				getRedefinedElement().addAll((Collection<? extends RedefinableElement>)newValue);
				return;
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_GROUP:
				getInGroup().clear();
				getInGroup().addAll((Collection<? extends ActivityGroup>)newValue);
				return;
			case FundamentalActivitiesPackage.ACTIVITY_NODE__REDEFINED_NODE:
				getRedefinedNode().clear();
				getRedefinedNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case FundamentalActivitiesPackage.ACTIVITY_NODE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case FundamentalActivitiesPackage.ACTIVITY_NODE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_PARTITION:
				getInPartition().clear();
				getInPartition().addAll((Collection<? extends ActivityPartition>)newValue);
				return;
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				setInInterruptibleRegion((InterruptibleActivityRegion)newValue);
				return;
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
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
			case FundamentalActivitiesPackage.ACTIVITY_NODE__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				return;
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_GROUP:
				getInGroup().clear();
				return;
			case FundamentalActivitiesPackage.ACTIVITY_NODE__REDEFINED_NODE:
				getRedefinedNode().clear();
				return;
			case FundamentalActivitiesPackage.ACTIVITY_NODE__INCOMING:
				getIncoming().clear();
				return;
			case FundamentalActivitiesPackage.ACTIVITY_NODE__OUTGOING:
				getOutgoing().clear();
				return;
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_PARTITION:
				getInPartition().clear();
				return;
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				setInInterruptibleRegion((InterruptibleActivityRegion)null);
				return;
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
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
			case FundamentalActivitiesPackage.ACTIVITY_NODE__REDEFINED_ELEMENT:
				return redefinedElement != null && !redefinedElement.isEmpty();
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_GROUP:
				return inGroup != null && !inGroup.isEmpty();
			case FundamentalActivitiesPackage.ACTIVITY_NODE__REDEFINED_NODE:
				return redefinedNode != null && !redefinedNode.isEmpty();
			case FundamentalActivitiesPackage.ACTIVITY_NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case FundamentalActivitiesPackage.ACTIVITY_NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_PARTITION:
				return inPartition != null && !inPartition.isEmpty();
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegion != null;
			case FundamentalActivitiesPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
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
				case FundamentalActivitiesPackage.ACTIVITY_NODE__REDEFINED_ELEMENT: return BasicActivitiesPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
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
				case BasicActivitiesPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return FundamentalActivitiesPackage.ACTIVITY_NODE__REDEFINED_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActivityNodeImpl

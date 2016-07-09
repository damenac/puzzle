/**
 */
package Activities.IntermediateActivities.impl;

import Activities.BasicActivities.ActivityEdge;
import Activities.BasicActivities.BasicActivitiesPackage;

import Activities.FundamentalActivities.ActivityNode;
import Activities.FundamentalActivities.FundamentalActivitiesPackage;

import Activities.FundamentalActivities.impl.ActivityGroupImpl;

import Activities.IntermediateActivities.ActivityPartition;
import Activities.IntermediateActivities.Element;
import Activities.IntermediateActivities.IntermediateActivitiesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Activities.IntermediateActivities.impl.ActivityPartitionImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link Activities.IntermediateActivities.impl.ActivityPartitionImpl#getSubpartition <em>Subpartition</em>}</li>
 *   <li>{@link Activities.IntermediateActivities.impl.ActivityPartitionImpl#getSuperPartition <em>Super Partition</em>}</li>
 *   <li>{@link Activities.IntermediateActivities.impl.ActivityPartitionImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link Activities.IntermediateActivities.impl.ActivityPartitionImpl#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityPartitionImpl extends ActivityGroupImpl implements ActivityPartition {
	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> edge;

	/**
	 * The cached value of the '{@link #getSubpartition() <em>Subpartition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpartition()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPartition> subpartition;

	/**
	 * The cached value of the '{@link #getRepresents() <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents()
	 * @generated
	 * @ordered
	 */
	protected Element represents;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> node;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActivitiesPackage.Literals.ACTIVITY_PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getEdge() {
		if (edge == null) {
			edge = new EObjectWithInverseResolvingEList.ManyInverse<ActivityEdge>(ActivityEdge.class, this, IntermediateActivitiesPackage.ACTIVITY_PARTITION__EDGE, BasicActivitiesPackage.ACTIVITY_EDGE__IN_PARTITION);
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPartition> getSubpartition() {
		if (subpartition == null) {
			subpartition = new EObjectContainmentWithInverseEList<ActivityPartition>(ActivityPartition.class, this, IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUBPARTITION, IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION);
		}
		return subpartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getSuperPartition() {
		if (eContainerFeatureID() != IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION) return null;
		return (ActivityPartition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperPartition(ActivityPartition newSuperPartition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuperPartition, IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperPartition(ActivityPartition newSuperPartition) {
		if (newSuperPartition != eInternalContainer() || (eContainerFeatureID() != IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION && newSuperPartition != null)) {
			if (EcoreUtil.isAncestor(this, newSuperPartition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperPartition != null)
				msgs = ((InternalEObject)newSuperPartition).eInverseAdd(this, IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUBPARTITION, ActivityPartition.class, msgs);
			msgs = basicSetSuperPartition(newSuperPartition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION, newSuperPartition, newSuperPartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getRepresents() {
		if (represents != null && represents.eIsProxy()) {
			InternalEObject oldRepresents = (InternalEObject)represents;
			represents = (Element)eResolveProxy(oldRepresents);
			if (represents != oldRepresents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateActivitiesPackage.ACTIVITY_PARTITION__REPRESENTS, oldRepresents, represents));
			}
		}
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetRepresents() {
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents(Element newRepresents) {
		Element oldRepresents = represents;
		represents = newRepresents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.ACTIVITY_PARTITION__REPRESENTS, oldRepresents, represents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNode() {
		if (node == null) {
			node = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNode>(ActivityNode.class, this, IntermediateActivitiesPackage.ACTIVITY_PARTITION__NODE, FundamentalActivitiesPackage.ACTIVITY_NODE__IN_PARTITION);
		}
		return node;
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
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdge()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUBPARTITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubpartition()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuperPartition((ActivityPartition)otherEnd, msgs);
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNode()).basicAdd(otherEnd, msgs);
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
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__EDGE:
				return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUBPARTITION:
				return ((InternalEList<?>)getSubpartition()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				return basicSetSuperPartition(null, msgs);
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
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
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				return eInternalContainer().eInverseRemove(this, IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUBPARTITION, ActivityPartition.class, msgs);
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
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__EDGE:
				return getEdge();
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUBPARTITION:
				return getSubpartition();
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				return getSuperPartition();
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__REPRESENTS:
				if (resolve) return getRepresents();
				return basicGetRepresents();
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__NODE:
				return getNode();
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
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__EDGE:
				getEdge().clear();
				getEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUBPARTITION:
				getSubpartition().clear();
				getSubpartition().addAll((Collection<? extends ActivityPartition>)newValue);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				setSuperPartition((ActivityPartition)newValue);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__REPRESENTS:
				setRepresents((Element)newValue);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends ActivityNode>)newValue);
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
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__EDGE:
				getEdge().clear();
				return;
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUBPARTITION:
				getSubpartition().clear();
				return;
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				setSuperPartition((ActivityPartition)null);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__REPRESENTS:
				setRepresents((Element)null);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__NODE:
				getNode().clear();
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
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__EDGE:
				return edge != null && !edge.isEmpty();
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUBPARTITION:
				return subpartition != null && !subpartition.isEmpty();
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				return getSuperPartition() != null;
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__REPRESENTS:
				return represents != null;
			case IntermediateActivitiesPackage.ACTIVITY_PARTITION__NODE:
				return node != null && !node.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityPartitionImpl

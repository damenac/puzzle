/**
 */
package Activities.FundamentalActivities.impl;

import Activities.BasicActivities.ActivityEdge;
import Activities.BasicActivities.BasicActivitiesPackage;

import Activities.FundamentalActivities.Activity;
import Activities.FundamentalActivities.ActivityGroup;
import Activities.FundamentalActivities.ActivityNode;
import Activities.FundamentalActivities.FundamentalActivitiesPackage;

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
 * An implementation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityGroupImpl#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityGroupImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityGroupImpl#getInActivity <em>In Activity</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityGroupImpl#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityGroupImpl#getContainedEdge <em>Contained Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityGroupImpl extends NamedElementImpl implements ActivityGroup {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FundamentalActivitiesPackage.Literals.ACTIVITY_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getSubgroup() {
		if (subgroup == null) {
			subgroup = new EObjectContainmentWithInverseEList<ActivityGroup>(ActivityGroup.class, this, FundamentalActivitiesPackage.ACTIVITY_GROUP__SUBGROUP, FundamentalActivitiesPackage.ACTIVITY_GROUP__SUPER_GROUP);
		}
		return subgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getSuperGroup() {
		if (eContainerFeatureID() != FundamentalActivitiesPackage.ACTIVITY_GROUP__SUPER_GROUP) return null;
		return (ActivityGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperGroup(ActivityGroup newSuperGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuperGroup, FundamentalActivitiesPackage.ACTIVITY_GROUP__SUPER_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperGroup(ActivityGroup newSuperGroup) {
		if (newSuperGroup != eInternalContainer() || (eContainerFeatureID() != FundamentalActivitiesPackage.ACTIVITY_GROUP__SUPER_GROUP && newSuperGroup != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, FundamentalActivitiesPackage.ACTIVITY_GROUP__SUPER_GROUP, newSuperGroup, newSuperGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getInActivity() {
		if (eContainerFeatureID() != FundamentalActivitiesPackage.ACTIVITY_GROUP__IN_ACTIVITY) return null;
		return (Activity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInActivity(Activity newInActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInActivity, FundamentalActivitiesPackage.ACTIVITY_GROUP__IN_ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInActivity(Activity newInActivity) {
		if (newInActivity != eInternalContainer() || (eContainerFeatureID() != FundamentalActivitiesPackage.ACTIVITY_GROUP__IN_ACTIVITY && newInActivity != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, FundamentalActivitiesPackage.ACTIVITY_GROUP__IN_ACTIVITY, newInActivity, newInActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getContainedNode() {
		if (containedNode == null) {
			containedNode = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNode>(ActivityNode.class, this, FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_NODE, FundamentalActivitiesPackage.ACTIVITY_NODE__IN_GROUP);
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
			containedEdge = new EObjectWithInverseResolvingEList.ManyInverse<ActivityEdge>(ActivityEdge.class, this, FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_EDGE, BasicActivitiesPackage.ACTIVITY_EDGE__IN_GROUP);
		}
		return containedEdge;
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
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__SUBGROUP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubgroup()).basicAdd(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__SUPER_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuperGroup((ActivityGroup)otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__IN_ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInActivity((Activity)otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedNode()).basicAdd(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedEdge()).basicAdd(otherEnd, msgs);
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
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__SUBGROUP:
				return ((InternalEList<?>)getSubgroup()).basicRemove(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__SUPER_GROUP:
				return basicSetSuperGroup(null, msgs);
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__IN_ACTIVITY:
				return basicSetInActivity(null, msgs);
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_NODE:
				return ((InternalEList<?>)getContainedNode()).basicRemove(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_EDGE:
				return ((InternalEList<?>)getContainedEdge()).basicRemove(otherEnd, msgs);
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
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__SUPER_GROUP:
				return eInternalContainer().eInverseRemove(this, FundamentalActivitiesPackage.ACTIVITY_GROUP__SUBGROUP, ActivityGroup.class, msgs);
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__IN_ACTIVITY:
				return eInternalContainer().eInverseRemove(this, FundamentalActivitiesPackage.ACTIVITY__GROUP, Activity.class, msgs);
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
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__SUBGROUP:
				return getSubgroup();
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__SUPER_GROUP:
				return getSuperGroup();
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__IN_ACTIVITY:
				return getInActivity();
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_NODE:
				return getContainedNode();
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_EDGE:
				return getContainedEdge();
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
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__SUBGROUP:
				getSubgroup().clear();
				getSubgroup().addAll((Collection<? extends ActivityGroup>)newValue);
				return;
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__SUPER_GROUP:
				setSuperGroup((ActivityGroup)newValue);
				return;
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__IN_ACTIVITY:
				setInActivity((Activity)newValue);
				return;
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_NODE:
				getContainedNode().clear();
				getContainedNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_EDGE:
				getContainedEdge().clear();
				getContainedEdge().addAll((Collection<? extends ActivityEdge>)newValue);
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
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__SUBGROUP:
				getSubgroup().clear();
				return;
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__SUPER_GROUP:
				setSuperGroup((ActivityGroup)null);
				return;
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__IN_ACTIVITY:
				setInActivity((Activity)null);
				return;
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_NODE:
				getContainedNode().clear();
				return;
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_EDGE:
				getContainedEdge().clear();
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
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__SUBGROUP:
				return subgroup != null && !subgroup.isEmpty();
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__SUPER_GROUP:
				return getSuperGroup() != null;
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__IN_ACTIVITY:
				return getInActivity() != null;
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_NODE:
				return containedNode != null && !containedNode.isEmpty();
			case FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_EDGE:
				return containedEdge != null && !containedEdge.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityGroupImpl

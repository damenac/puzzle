/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.Activity;
import CompleteDSLPckg.ActivityEdge;
import CompleteDSLPckg.ActivityGroup;
import CompleteDSLPckg.ActivityNode;
import CompleteDSLPckg.CompleteDSLPckgPackage;

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
 * An implementation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompleteDSLPckg.impl.ActivityGroupImpl#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ActivityGroupImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ActivityGroupImpl#getInActivity <em>In Activity</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ActivityGroupImpl#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ActivityGroupImpl#getContainedEdge <em>Contained Edge</em>}</li>
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
		return CompleteDSLPckgPackage.eINSTANCE.getActivityGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getSubgroup() {
		if (subgroup == null) {
			subgroup = new EObjectContainmentEList<ActivityGroup>(ActivityGroup.class, this, CompleteDSLPckgPackage.ACTIVITY_GROUP__SUBGROUP);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.ACTIVITY_GROUP__SUPER_GROUP, oldSuperGroup, superGroup));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.ACTIVITY_GROUP__SUPER_GROUP, oldSuperGroup, superGroup));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.ACTIVITY_GROUP__IN_ACTIVITY, oldInActivity, inActivity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.ACTIVITY_GROUP__IN_ACTIVITY, oldInActivity, inActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getContainedNode() {
		if (containedNode == null) {
			containedNode = new EObjectResolvingEList<ActivityNode>(ActivityNode.class, this, CompleteDSLPckgPackage.ACTIVITY_GROUP__CONTAINED_NODE);
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
			containedEdge = new EObjectResolvingEList<ActivityEdge>(ActivityEdge.class, this, CompleteDSLPckgPackage.ACTIVITY_GROUP__CONTAINED_EDGE);
		}
		return containedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__SUBGROUP:
				return ((InternalEList<?>)getSubgroup()).basicRemove(otherEnd, msgs);
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
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__SUBGROUP:
				return getSubgroup();
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__SUPER_GROUP:
				if (resolve) return getSuperGroup();
				return basicGetSuperGroup();
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__IN_ACTIVITY:
				if (resolve) return getInActivity();
				return basicGetInActivity();
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__CONTAINED_NODE:
				return getContainedNode();
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__CONTAINED_EDGE:
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
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__SUBGROUP:
				getSubgroup().clear();
				getSubgroup().addAll((Collection<? extends ActivityGroup>)newValue);
				return;
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__SUPER_GROUP:
				setSuperGroup((ActivityGroup)newValue);
				return;
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__IN_ACTIVITY:
				setInActivity((Activity)newValue);
				return;
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__CONTAINED_NODE:
				getContainedNode().clear();
				getContainedNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__CONTAINED_EDGE:
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
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__SUBGROUP:
				getSubgroup().clear();
				return;
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__SUPER_GROUP:
				setSuperGroup((ActivityGroup)null);
				return;
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__IN_ACTIVITY:
				setInActivity((Activity)null);
				return;
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__CONTAINED_NODE:
				getContainedNode().clear();
				return;
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__CONTAINED_EDGE:
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
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__SUBGROUP:
				return subgroup != null && !subgroup.isEmpty();
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__SUPER_GROUP:
				return superGroup != null;
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__IN_ACTIVITY:
				return inActivity != null;
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__CONTAINED_NODE:
				return containedNode != null && !containedNode.isEmpty();
			case CompleteDSLPckgPackage.ACTIVITY_GROUP__CONTAINED_EDGE:
				return containedEdge != null && !containedEdge.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityGroupImpl

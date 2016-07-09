/**
 */
package Activities.IntermediateActivities.impl;

import Activities.BasicActivities.ActivityEdge;
import Activities.BasicActivities.BasicActivitiesPackage;

import Activities.FundamentalActivities.ActivityNode;
import Activities.FundamentalActivities.FundamentalActivitiesPackage;

import Activities.FundamentalActivities.impl.ActivityGroupImpl;

import Activities.IntermediateActivities.IntermediateActivitiesPackage;
import Activities.IntermediateActivities.InterruptibleActivityRegion;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interruptible Activity Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Activities.IntermediateActivities.impl.InterruptibleActivityRegionImpl#getInterruptingEdge <em>Interrupting Edge</em>}</li>
 *   <li>{@link Activities.IntermediateActivities.impl.InterruptibleActivityRegionImpl#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterruptibleActivityRegionImpl extends ActivityGroupImpl implements InterruptibleActivityRegion {
	/**
	 * The cached value of the '{@link #getInterruptingEdge() <em>Interrupting Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptingEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> interruptingEdge;

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
	protected InterruptibleActivityRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActivitiesPackage.Literals.INTERRUPTIBLE_ACTIVITY_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getInterruptingEdge() {
		if (interruptingEdge == null) {
			interruptingEdge = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE, BasicActivitiesPackage.ACTIVITY_EDGE__INTERRUPTS);
		}
		return interruptingEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNode() {
		if (node == null) {
			node = new EObjectWithInverseResolvingEList<ActivityNode>(ActivityNode.class, this, IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE, FundamentalActivitiesPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION);
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
			case IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterruptingEdge()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE:
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
			case IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return ((InternalEList<?>)getInterruptingEdge()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return getInterruptingEdge();
			case IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE:
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
			case IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				getInterruptingEdge().clear();
				getInterruptingEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE:
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
			case IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				getInterruptingEdge().clear();
				return;
			case IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE:
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
			case IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return interruptingEdge != null && !interruptingEdge.isEmpty();
			case IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE:
				return node != null && !node.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterruptibleActivityRegionImpl

/**
 */
package StateMachines.BehaviorStateMachines.impl;

import StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage;
import StateMachines.BehaviorStateMachines.Pseudostate;
import StateMachines.BehaviorStateMachines.Region;
import StateMachines.BehaviorStateMachines.State;
import StateMachines.BehaviorStateMachines.StateMachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link StateMachines.BehaviorStateMachines.impl.StateMachineImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.impl.StateMachineImpl#getConnectionPoint <em>Connection Point</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.impl.StateMachineImpl#getSubmachineState <em>Submachine State</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.impl.StateMachineImpl#getExtendedStateMachine <em>Extended State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineImpl extends BehaviorImpl implements StateMachine {
	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> region;

	/**
	 * The cached value of the '{@link #getConnectionPoint() <em>Connection Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Pseudostate> connectionPoint;

	/**
	 * The cached value of the '{@link #getSubmachineState() <em>Submachine State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmachineState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> submachineState;

	/**
	 * The cached value of the '{@link #getExtendedStateMachine() <em>Extended State Machine</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedStateMachine()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> extendedStateMachine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorStateMachinesPackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getRegion() {
		if (region == null) {
			region = new EObjectContainmentWithInverseEList<Region>(Region.class, this, BehaviorStateMachinesPackage.STATE_MACHINE__REGION, BehaviorStateMachinesPackage.REGION__STATE_MACHINE);
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pseudostate> getConnectionPoint() {
		if (connectionPoint == null) {
			connectionPoint = new EObjectContainmentEList<Pseudostate>(Pseudostate.class, this, BehaviorStateMachinesPackage.STATE_MACHINE__CONNECTION_POINT);
		}
		return connectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getSubmachineState() {
		if (submachineState == null) {
			submachineState = new EObjectWithInverseResolvingEList<State>(State.class, this, BehaviorStateMachinesPackage.STATE_MACHINE__SUBMACHINE_STATE, BehaviorStateMachinesPackage.STATE__SUBMACHINE);
		}
		return submachineState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getExtendedStateMachine() {
		if (extendedStateMachine == null) {
			extendedStateMachine = new EObjectResolvingEList<StateMachine>(StateMachine.class, this, BehaviorStateMachinesPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE);
		}
		return extendedStateMachine;
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
			case BehaviorStateMachinesPackage.STATE_MACHINE__REGION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegion()).basicAdd(otherEnd, msgs);
			case BehaviorStateMachinesPackage.STATE_MACHINE__SUBMACHINE_STATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubmachineState()).basicAdd(otherEnd, msgs);
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
			case BehaviorStateMachinesPackage.STATE_MACHINE__REGION:
				return ((InternalEList<?>)getRegion()).basicRemove(otherEnd, msgs);
			case BehaviorStateMachinesPackage.STATE_MACHINE__CONNECTION_POINT:
				return ((InternalEList<?>)getConnectionPoint()).basicRemove(otherEnd, msgs);
			case BehaviorStateMachinesPackage.STATE_MACHINE__SUBMACHINE_STATE:
				return ((InternalEList<?>)getSubmachineState()).basicRemove(otherEnd, msgs);
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
			case BehaviorStateMachinesPackage.STATE_MACHINE__REGION:
				return getRegion();
			case BehaviorStateMachinesPackage.STATE_MACHINE__CONNECTION_POINT:
				return getConnectionPoint();
			case BehaviorStateMachinesPackage.STATE_MACHINE__SUBMACHINE_STATE:
				return getSubmachineState();
			case BehaviorStateMachinesPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				return getExtendedStateMachine();
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
			case BehaviorStateMachinesPackage.STATE_MACHINE__REGION:
				getRegion().clear();
				getRegion().addAll((Collection<? extends Region>)newValue);
				return;
			case BehaviorStateMachinesPackage.STATE_MACHINE__CONNECTION_POINT:
				getConnectionPoint().clear();
				getConnectionPoint().addAll((Collection<? extends Pseudostate>)newValue);
				return;
			case BehaviorStateMachinesPackage.STATE_MACHINE__SUBMACHINE_STATE:
				getSubmachineState().clear();
				getSubmachineState().addAll((Collection<? extends State>)newValue);
				return;
			case BehaviorStateMachinesPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				getExtendedStateMachine().clear();
				getExtendedStateMachine().addAll((Collection<? extends StateMachine>)newValue);
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
			case BehaviorStateMachinesPackage.STATE_MACHINE__REGION:
				getRegion().clear();
				return;
			case BehaviorStateMachinesPackage.STATE_MACHINE__CONNECTION_POINT:
				getConnectionPoint().clear();
				return;
			case BehaviorStateMachinesPackage.STATE_MACHINE__SUBMACHINE_STATE:
				getSubmachineState().clear();
				return;
			case BehaviorStateMachinesPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				getExtendedStateMachine().clear();
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
			case BehaviorStateMachinesPackage.STATE_MACHINE__REGION:
				return region != null && !region.isEmpty();
			case BehaviorStateMachinesPackage.STATE_MACHINE__CONNECTION_POINT:
				return connectionPoint != null && !connectionPoint.isEmpty();
			case BehaviorStateMachinesPackage.STATE_MACHINE__SUBMACHINE_STATE:
				return submachineState != null && !submachineState.isEmpty();
			case BehaviorStateMachinesPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				return extendedStateMachine != null && !extendedStateMachine.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateMachineImpl

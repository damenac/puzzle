/**
 */
package fsm.impl;

import fsm.AbstractState;
import fsm.FsmPackage;
import fsm.Region;
import fsm.StateMachine;
import fsm.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fsm.impl.RegionImpl#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link fsm.impl.RegionImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link fsm.impl.RegionImpl#getOwnerStateMachine <em>Owner State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionImpl extends NamedElementImpl implements Region {
	/**
	 * The cached value of the '{@link #getSubvertex() <em>Subvertex</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubvertex()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractState> subvertex;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmPackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractState> getSubvertex() {
		if (subvertex == null) {
			subvertex = new EObjectContainmentWithInverseEList<AbstractState>(AbstractState.class, this, FsmPackage.REGION__SUBVERTEX, FsmPackage.ABSTRACT_STATE__OWNER_REGION);
		}
		return subvertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, FsmPackage.REGION__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getOwnerStateMachine() {
		if (eContainerFeatureID() != FsmPackage.REGION__OWNER_STATE_MACHINE) return null;
		return (StateMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerStateMachine(StateMachine newOwnerStateMachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerStateMachine, FsmPackage.REGION__OWNER_STATE_MACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerStateMachine(StateMachine newOwnerStateMachine) {
		if (newOwnerStateMachine != eInternalContainer() || (eContainerFeatureID() != FsmPackage.REGION__OWNER_STATE_MACHINE && newOwnerStateMachine != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerStateMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerStateMachine != null)
				msgs = ((InternalEObject)newOwnerStateMachine).eInverseAdd(this, FsmPackage.STATE_MACHINE__REGIONS, StateMachine.class, msgs);
			msgs = basicSetOwnerStateMachine(newOwnerStateMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.REGION__OWNER_STATE_MACHINE, newOwnerStateMachine, newOwnerStateMachine));
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
			case FsmPackage.REGION__SUBVERTEX:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubvertex()).basicAdd(otherEnd, msgs);
			case FsmPackage.REGION__OWNER_STATE_MACHINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerStateMachine((StateMachine)otherEnd, msgs);
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
			case FsmPackage.REGION__SUBVERTEX:
				return ((InternalEList<?>)getSubvertex()).basicRemove(otherEnd, msgs);
			case FsmPackage.REGION__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case FsmPackage.REGION__OWNER_STATE_MACHINE:
				return basicSetOwnerStateMachine(null, msgs);
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
			case FsmPackage.REGION__OWNER_STATE_MACHINE:
				return eInternalContainer().eInverseRemove(this, FsmPackage.STATE_MACHINE__REGIONS, StateMachine.class, msgs);
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
			case FsmPackage.REGION__SUBVERTEX:
				return getSubvertex();
			case FsmPackage.REGION__TRANSITIONS:
				return getTransitions();
			case FsmPackage.REGION__OWNER_STATE_MACHINE:
				return getOwnerStateMachine();
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
			case FsmPackage.REGION__SUBVERTEX:
				getSubvertex().clear();
				getSubvertex().addAll((Collection<? extends AbstractState>)newValue);
				return;
			case FsmPackage.REGION__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case FsmPackage.REGION__OWNER_STATE_MACHINE:
				setOwnerStateMachine((StateMachine)newValue);
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
			case FsmPackage.REGION__SUBVERTEX:
				getSubvertex().clear();
				return;
			case FsmPackage.REGION__TRANSITIONS:
				getTransitions().clear();
				return;
			case FsmPackage.REGION__OWNER_STATE_MACHINE:
				setOwnerStateMachine((StateMachine)null);
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
			case FsmPackage.REGION__SUBVERTEX:
				return subvertex != null && !subvertex.isEmpty();
			case FsmPackage.REGION__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case FsmPackage.REGION__OWNER_STATE_MACHINE:
				return getOwnerStateMachine() != null;
		}
		return super.eIsSet(featureID);
	}

} //RegionImpl

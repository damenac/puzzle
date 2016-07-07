/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.AbstractState;
import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.Region;
import CompleteDSLPckg.StateMachine;
import CompleteDSLPckg.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompleteDSLPckg.impl.RegionImpl#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.RegionImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.RegionImpl#getOwnerStateMachine <em>Owner State Machine</em>}</li>
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
	 * The cached value of the '{@link #getOwnerStateMachine() <em>Owner State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerStateMachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine ownerStateMachine;

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
		return CompleteDSLPckgPackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractState> getSubvertex() {
		if (subvertex == null) {
			subvertex = new EObjectContainmentEList<AbstractState>(AbstractState.class, this, CompleteDSLPckgPackage.REGION__SUBVERTEX);
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
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, CompleteDSLPckgPackage.REGION__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getOwnerStateMachine() {
		if (ownerStateMachine != null && ownerStateMachine.eIsProxy()) {
			InternalEObject oldOwnerStateMachine = (InternalEObject)ownerStateMachine;
			ownerStateMachine = (StateMachine)eResolveProxy(oldOwnerStateMachine);
			if (ownerStateMachine != oldOwnerStateMachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.REGION__OWNER_STATE_MACHINE, oldOwnerStateMachine, ownerStateMachine));
			}
		}
		return ownerStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetOwnerStateMachine() {
		return ownerStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerStateMachine(StateMachine newOwnerStateMachine) {
		StateMachine oldOwnerStateMachine = ownerStateMachine;
		ownerStateMachine = newOwnerStateMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.REGION__OWNER_STATE_MACHINE, oldOwnerStateMachine, ownerStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompleteDSLPckgPackage.REGION__SUBVERTEX:
				return ((InternalEList<?>)getSubvertex()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.REGION__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
			case CompleteDSLPckgPackage.REGION__SUBVERTEX:
				return getSubvertex();
			case CompleteDSLPckgPackage.REGION__TRANSITIONS:
				return getTransitions();
			case CompleteDSLPckgPackage.REGION__OWNER_STATE_MACHINE:
				if (resolve) return getOwnerStateMachine();
				return basicGetOwnerStateMachine();
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
			case CompleteDSLPckgPackage.REGION__SUBVERTEX:
				getSubvertex().clear();
				getSubvertex().addAll((Collection<? extends AbstractState>)newValue);
				return;
			case CompleteDSLPckgPackage.REGION__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case CompleteDSLPckgPackage.REGION__OWNER_STATE_MACHINE:
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
			case CompleteDSLPckgPackage.REGION__SUBVERTEX:
				getSubvertex().clear();
				return;
			case CompleteDSLPckgPackage.REGION__TRANSITIONS:
				getTransitions().clear();
				return;
			case CompleteDSLPckgPackage.REGION__OWNER_STATE_MACHINE:
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
			case CompleteDSLPckgPackage.REGION__SUBVERTEX:
				return subvertex != null && !subvertex.isEmpty();
			case CompleteDSLPckgPackage.REGION__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case CompleteDSLPckgPackage.REGION__OWNER_STATE_MACHINE:
				return ownerStateMachine != null;
		}
		return super.eIsSet(featureID);
	}

} //RegionImpl

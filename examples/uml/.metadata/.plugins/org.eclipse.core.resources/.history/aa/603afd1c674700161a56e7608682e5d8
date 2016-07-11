/**
 */
package StateMachines.BehaviorStateMachines.impl;

import StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage;
import StateMachines.BehaviorStateMachines.Classifier;
import StateMachines.BehaviorStateMachines.Region;
import StateMachines.BehaviorStateMachines.State;
import StateMachines.BehaviorStateMachines.StateMachine;
import StateMachines.BehaviorStateMachines.Transition;
import StateMachines.BehaviorStateMachines.Vertex;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link StateMachines.BehaviorStateMachines.impl.RegionImpl#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.impl.RegionImpl#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.impl.RegionImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.impl.RegionImpl#getState <em>State</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.impl.RegionImpl#getExtendedRegion <em>Extended Region</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.impl.RegionImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionImpl extends NamespaceImpl implements Region {
	/**
	 * The cached value of the '{@link #getSubvertex() <em>Subvertex</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubvertex()
	 * @generated
	 * @ordered
	 */
	protected EList<Vertex> subvertex;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The cached value of the '{@link #getExtendedRegion() <em>Extended Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedRegion()
	 * @generated
	 * @ordered
	 */
	protected Region extendedRegion;

	/**
	 * The cached value of the '{@link #getRedefinitionContext() <em>Redefinition Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitionContext()
	 * @generated
	 * @ordered
	 */
	protected Classifier redefinitionContext;

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
		return BehaviorStateMachinesPackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getSubvertex() {
		if (subvertex == null) {
			subvertex = new EObjectContainmentWithInverseEList<Vertex>(Vertex.class, this, BehaviorStateMachinesPackage.REGION__SUBVERTEX, BehaviorStateMachinesPackage.VERTEX__CONTAINER);
		}
		return subvertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStateMachine() {
		if (eContainerFeatureID() != BehaviorStateMachinesPackage.REGION__STATE_MACHINE) return null;
		return (StateMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine(StateMachine newStateMachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStateMachine, BehaviorStateMachinesPackage.REGION__STATE_MACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(StateMachine newStateMachine) {
		if (newStateMachine != eInternalContainer() || (eContainerFeatureID() != BehaviorStateMachinesPackage.REGION__STATE_MACHINE && newStateMachine != null)) {
			if (EcoreUtil.isAncestor(this, newStateMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateMachine != null)
				msgs = ((InternalEObject)newStateMachine).eInverseAdd(this, BehaviorStateMachinesPackage.STATE_MACHINE__REGION, StateMachine.class, msgs);
			msgs = basicSetStateMachine(newStateMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorStateMachinesPackage.REGION__STATE_MACHINE, newStateMachine, newStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, BehaviorStateMachinesPackage.REGION__TRANSITION, BehaviorStateMachinesPackage.TRANSITION__CONTAINER);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		if (eContainerFeatureID() != BehaviorStateMachinesPackage.REGION__STATE) return null;
		return (State)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(State newState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newState, BehaviorStateMachinesPackage.REGION__STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		if (newState != eInternalContainer() || (eContainerFeatureID() != BehaviorStateMachinesPackage.REGION__STATE && newState != null)) {
			if (EcoreUtil.isAncestor(this, newState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, BehaviorStateMachinesPackage.STATE__REGION, State.class, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorStateMachinesPackage.REGION__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getExtendedRegion() {
		if (extendedRegion != null && extendedRegion.eIsProxy()) {
			InternalEObject oldExtendedRegion = (InternalEObject)extendedRegion;
			extendedRegion = (Region)eResolveProxy(oldExtendedRegion);
			if (extendedRegion != oldExtendedRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorStateMachinesPackage.REGION__EXTENDED_REGION, oldExtendedRegion, extendedRegion));
			}
		}
		return extendedRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetExtendedRegion() {
		return extendedRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedRegion(Region newExtendedRegion) {
		Region oldExtendedRegion = extendedRegion;
		extendedRegion = newExtendedRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorStateMachinesPackage.REGION__EXTENDED_REGION, oldExtendedRegion, extendedRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinitionContext() {
		if (redefinitionContext != null && redefinitionContext.eIsProxy()) {
			InternalEObject oldRedefinitionContext = (InternalEObject)redefinitionContext;
			redefinitionContext = (Classifier)eResolveProxy(oldRedefinitionContext);
			if (redefinitionContext != oldRedefinitionContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorStateMachinesPackage.REGION__REDEFINITION_CONTEXT, oldRedefinitionContext, redefinitionContext));
			}
		}
		return redefinitionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetRedefinitionContext() {
		return redefinitionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinitionContext(Classifier newRedefinitionContext) {
		Classifier oldRedefinitionContext = redefinitionContext;
		redefinitionContext = newRedefinitionContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorStateMachinesPackage.REGION__REDEFINITION_CONTEXT, oldRedefinitionContext, redefinitionContext));
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
			case BehaviorStateMachinesPackage.REGION__SUBVERTEX:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubvertex()).basicAdd(otherEnd, msgs);
			case BehaviorStateMachinesPackage.REGION__STATE_MACHINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStateMachine((StateMachine)otherEnd, msgs);
			case BehaviorStateMachinesPackage.REGION__TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransition()).basicAdd(otherEnd, msgs);
			case BehaviorStateMachinesPackage.REGION__STATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetState((State)otherEnd, msgs);
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
			case BehaviorStateMachinesPackage.REGION__SUBVERTEX:
				return ((InternalEList<?>)getSubvertex()).basicRemove(otherEnd, msgs);
			case BehaviorStateMachinesPackage.REGION__STATE_MACHINE:
				return basicSetStateMachine(null, msgs);
			case BehaviorStateMachinesPackage.REGION__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
			case BehaviorStateMachinesPackage.REGION__STATE:
				return basicSetState(null, msgs);
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
			case BehaviorStateMachinesPackage.REGION__STATE_MACHINE:
				return eInternalContainer().eInverseRemove(this, BehaviorStateMachinesPackage.STATE_MACHINE__REGION, StateMachine.class, msgs);
			case BehaviorStateMachinesPackage.REGION__STATE:
				return eInternalContainer().eInverseRemove(this, BehaviorStateMachinesPackage.STATE__REGION, State.class, msgs);
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
			case BehaviorStateMachinesPackage.REGION__SUBVERTEX:
				return getSubvertex();
			case BehaviorStateMachinesPackage.REGION__STATE_MACHINE:
				return getStateMachine();
			case BehaviorStateMachinesPackage.REGION__TRANSITION:
				return getTransition();
			case BehaviorStateMachinesPackage.REGION__STATE:
				return getState();
			case BehaviorStateMachinesPackage.REGION__EXTENDED_REGION:
				if (resolve) return getExtendedRegion();
				return basicGetExtendedRegion();
			case BehaviorStateMachinesPackage.REGION__REDEFINITION_CONTEXT:
				if (resolve) return getRedefinitionContext();
				return basicGetRedefinitionContext();
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
			case BehaviorStateMachinesPackage.REGION__SUBVERTEX:
				getSubvertex().clear();
				getSubvertex().addAll((Collection<? extends Vertex>)newValue);
				return;
			case BehaviorStateMachinesPackage.REGION__STATE_MACHINE:
				setStateMachine((StateMachine)newValue);
				return;
			case BehaviorStateMachinesPackage.REGION__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends Transition>)newValue);
				return;
			case BehaviorStateMachinesPackage.REGION__STATE:
				setState((State)newValue);
				return;
			case BehaviorStateMachinesPackage.REGION__EXTENDED_REGION:
				setExtendedRegion((Region)newValue);
				return;
			case BehaviorStateMachinesPackage.REGION__REDEFINITION_CONTEXT:
				setRedefinitionContext((Classifier)newValue);
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
			case BehaviorStateMachinesPackage.REGION__SUBVERTEX:
				getSubvertex().clear();
				return;
			case BehaviorStateMachinesPackage.REGION__STATE_MACHINE:
				setStateMachine((StateMachine)null);
				return;
			case BehaviorStateMachinesPackage.REGION__TRANSITION:
				getTransition().clear();
				return;
			case BehaviorStateMachinesPackage.REGION__STATE:
				setState((State)null);
				return;
			case BehaviorStateMachinesPackage.REGION__EXTENDED_REGION:
				setExtendedRegion((Region)null);
				return;
			case BehaviorStateMachinesPackage.REGION__REDEFINITION_CONTEXT:
				setRedefinitionContext((Classifier)null);
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
			case BehaviorStateMachinesPackage.REGION__SUBVERTEX:
				return subvertex != null && !subvertex.isEmpty();
			case BehaviorStateMachinesPackage.REGION__STATE_MACHINE:
				return getStateMachine() != null;
			case BehaviorStateMachinesPackage.REGION__TRANSITION:
				return transition != null && !transition.isEmpty();
			case BehaviorStateMachinesPackage.REGION__STATE:
				return getState() != null;
			case BehaviorStateMachinesPackage.REGION__EXTENDED_REGION:
				return extendedRegion != null;
			case BehaviorStateMachinesPackage.REGION__REDEFINITION_CONTEXT:
				return redefinitionContext != null;
		}
		return super.eIsSet(featureID);
	}

} //RegionImpl

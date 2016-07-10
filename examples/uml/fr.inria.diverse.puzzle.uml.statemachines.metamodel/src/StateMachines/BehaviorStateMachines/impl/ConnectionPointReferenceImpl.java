/**
 */
package StateMachines.BehaviorStateMachines.impl;

import StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage;
import StateMachines.BehaviorStateMachines.ConnectionPointReference;
import StateMachines.BehaviorStateMachines.Pseudostate;
import StateMachines.BehaviorStateMachines.State;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Point Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link StateMachines.BehaviorStateMachines.impl.ConnectionPointReferenceImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.impl.ConnectionPointReferenceImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.impl.ConnectionPointReferenceImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionPointReferenceImpl extends VertexImpl implements ConnectionPointReference {
	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected Pseudostate exit;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected Pseudostate entry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPointReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorStateMachinesPackage.Literals.CONNECTION_POINT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate getExit() {
		if (exit != null && exit.eIsProxy()) {
			InternalEObject oldExit = (InternalEObject)exit;
			exit = (Pseudostate)eResolveProxy(oldExit);
			if (exit != oldExit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__EXIT, oldExit, exit));
			}
		}
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate basicGetExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExit(Pseudostate newExit) {
		Pseudostate oldExit = exit;
		exit = newExit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__EXIT, oldExit, exit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate getEntry() {
		if (entry != null && entry.eIsProxy()) {
			InternalEObject oldEntry = (InternalEObject)entry;
			entry = (Pseudostate)eResolveProxy(oldEntry);
			if (entry != oldEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__ENTRY, oldEntry, entry));
			}
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate basicGetEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(Pseudostate newEntry) {
		Pseudostate oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__ENTRY, oldEntry, entry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		if (eContainerFeatureID() != BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__STATE) return null;
		return (State)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(State newState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newState, BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		if (newState != eInternalContainer() || (eContainerFeatureID() != BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__STATE && newState != null)) {
			if (EcoreUtil.isAncestor(this, newState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, BehaviorStateMachinesPackage.STATE__CONNECTION, State.class, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__STATE:
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
			case BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__STATE:
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
			case BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__STATE:
				return eInternalContainer().eInverseRemove(this, BehaviorStateMachinesPackage.STATE__CONNECTION, State.class, msgs);
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
			case BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__EXIT:
				if (resolve) return getExit();
				return basicGetExit();
			case BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__ENTRY:
				if (resolve) return getEntry();
				return basicGetEntry();
			case BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__STATE:
				return getState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__EXIT:
				setExit((Pseudostate)newValue);
				return;
			case BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__ENTRY:
				setEntry((Pseudostate)newValue);
				return;
			case BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__STATE:
				setState((State)newValue);
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
			case BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__EXIT:
				setExit((Pseudostate)null);
				return;
			case BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__ENTRY:
				setEntry((Pseudostate)null);
				return;
			case BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__STATE:
				setState((State)null);
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
			case BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__EXIT:
				return exit != null;
			case BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__ENTRY:
				return entry != null;
			case BehaviorStateMachinesPackage.CONNECTION_POINT_REFERENCE__STATE:
				return getState() != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionPointReferenceImpl

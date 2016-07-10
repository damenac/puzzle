/**
 */
package StateMachines.ProtocolStateMachines.impl;

import StateMachines.BehaviorStateMachines.Constraint;

import StateMachines.BehaviorStateMachines.impl.TransitionImpl;

import StateMachines.ProtocolStateMachines.Operation;
import StateMachines.ProtocolStateMachines.ProtocolStateMachinesPackage;
import StateMachines.ProtocolStateMachines.ProtocolTransition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link StateMachines.ProtocolStateMachines.impl.ProtocolTransitionImpl#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link StateMachines.ProtocolStateMachines.impl.ProtocolTransitionImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link StateMachines.ProtocolStateMachines.impl.ProtocolTransitionImpl#getReferred <em>Referred</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolTransitionImpl extends TransitionImpl implements ProtocolTransition {
	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint preCondition;

	/**
	 * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint postCondition;

	/**
	 * The cached value of the '{@link #getReferred() <em>Referred</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferred()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> referred;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtocolStateMachinesPackage.Literals.PROTOCOL_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPreCondition() {
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreCondition(Constraint newPreCondition, NotificationChain msgs) {
		Constraint oldPreCondition = preCondition;
		preCondition = newPreCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__PRE_CONDITION, oldPreCondition, newPreCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreCondition(Constraint newPreCondition) {
		if (newPreCondition != preCondition) {
			NotificationChain msgs = null;
			if (preCondition != null)
				msgs = ((InternalEObject)preCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__PRE_CONDITION, null, msgs);
			if (newPreCondition != null)
				msgs = ((InternalEObject)newPreCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__PRE_CONDITION, null, msgs);
			msgs = basicSetPreCondition(newPreCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__PRE_CONDITION, newPreCondition, newPreCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPostCondition() {
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostCondition(Constraint newPostCondition, NotificationChain msgs) {
		Constraint oldPostCondition = postCondition;
		postCondition = newPostCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__POST_CONDITION, oldPostCondition, newPostCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostCondition(Constraint newPostCondition) {
		if (newPostCondition != postCondition) {
			NotificationChain msgs = null;
			if (postCondition != null)
				msgs = ((InternalEObject)postCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__POST_CONDITION, null, msgs);
			if (newPostCondition != null)
				msgs = ((InternalEObject)newPostCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__POST_CONDITION, null, msgs);
			msgs = basicSetPostCondition(newPostCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__POST_CONDITION, newPostCondition, newPostCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getReferred() {
		if (referred == null) {
			referred = new EObjectResolvingEList<Operation>(Operation.class, this, ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__REFERRED);
		}
		return referred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__PRE_CONDITION:
				return basicSetPreCondition(null, msgs);
			case ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__POST_CONDITION:
				return basicSetPostCondition(null, msgs);
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
			case ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__PRE_CONDITION:
				return getPreCondition();
			case ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__POST_CONDITION:
				return getPostCondition();
			case ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__REFERRED:
				return getReferred();
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
			case ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__PRE_CONDITION:
				setPreCondition((Constraint)newValue);
				return;
			case ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__POST_CONDITION:
				setPostCondition((Constraint)newValue);
				return;
			case ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__REFERRED:
				getReferred().clear();
				getReferred().addAll((Collection<? extends Operation>)newValue);
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
			case ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__PRE_CONDITION:
				setPreCondition((Constraint)null);
				return;
			case ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__POST_CONDITION:
				setPostCondition((Constraint)null);
				return;
			case ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__REFERRED:
				getReferred().clear();
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
			case ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__PRE_CONDITION:
				return preCondition != null;
			case ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__POST_CONDITION:
				return postCondition != null;
			case ProtocolStateMachinesPackage.PROTOCOL_TRANSITION__REFERRED:
				return referred != null && !referred.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProtocolTransitionImpl

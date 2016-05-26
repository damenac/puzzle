/**
 */
package fsm.impl;

import fsm.Block;
import fsm.FsmPackage;
import fsm.State;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fsm.impl.StateImpl#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link fsm.impl.StateImpl#getDoAction <em>Do Action</em>}</li>
 *   <li>{@link fsm.impl.StateImpl#getExitAction <em>Exit Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends AbstractStateImpl implements State {
	/**
	 * The cached value of the '{@link #getEntryAction() <em>Entry Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryAction()
	 * @generated
	 * @ordered
	 */
	protected Block entryAction;
	/**
	 * The cached value of the '{@link #getDoAction() <em>Do Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoAction()
	 * @generated
	 * @ordered
	 */
	protected Block doAction;

	/**
	 * The cached value of the '{@link #getExitAction() <em>Exit Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitAction()
	 * @generated
	 * @ordered
	 */
	protected Block exitAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getEntryAction() {
		return entryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryAction(Block newEntryAction, NotificationChain msgs) {
		Block oldEntryAction = entryAction;
		entryAction = newEntryAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FsmPackage.STATE__ENTRY_ACTION, oldEntryAction, newEntryAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryAction(Block newEntryAction) {
		if (newEntryAction != entryAction) {
			NotificationChain msgs = null;
			if (entryAction != null)
				msgs = ((InternalEObject)entryAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FsmPackage.STATE__ENTRY_ACTION, null, msgs);
			if (newEntryAction != null)
				msgs = ((InternalEObject)newEntryAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FsmPackage.STATE__ENTRY_ACTION, null, msgs);
			msgs = basicSetEntryAction(newEntryAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.STATE__ENTRY_ACTION, newEntryAction, newEntryAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getDoAction() {
		return doAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoAction(Block newDoAction, NotificationChain msgs) {
		Block oldDoAction = doAction;
		doAction = newDoAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FsmPackage.STATE__DO_ACTION, oldDoAction, newDoAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoAction(Block newDoAction) {
		if (newDoAction != doAction) {
			NotificationChain msgs = null;
			if (doAction != null)
				msgs = ((InternalEObject)doAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FsmPackage.STATE__DO_ACTION, null, msgs);
			if (newDoAction != null)
				msgs = ((InternalEObject)newDoAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FsmPackage.STATE__DO_ACTION, null, msgs);
			msgs = basicSetDoAction(newDoAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.STATE__DO_ACTION, newDoAction, newDoAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getExitAction() {
		return exitAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExitAction(Block newExitAction, NotificationChain msgs) {
		Block oldExitAction = exitAction;
		exitAction = newExitAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FsmPackage.STATE__EXIT_ACTION, oldExitAction, newExitAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitAction(Block newExitAction) {
		if (newExitAction != exitAction) {
			NotificationChain msgs = null;
			if (exitAction != null)
				msgs = ((InternalEObject)exitAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FsmPackage.STATE__EXIT_ACTION, null, msgs);
			if (newExitAction != null)
				msgs = ((InternalEObject)newExitAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FsmPackage.STATE__EXIT_ACTION, null, msgs);
			msgs = basicSetExitAction(newExitAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.STATE__EXIT_ACTION, newExitAction, newExitAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FsmPackage.STATE__ENTRY_ACTION:
				return basicSetEntryAction(null, msgs);
			case FsmPackage.STATE__DO_ACTION:
				return basicSetDoAction(null, msgs);
			case FsmPackage.STATE__EXIT_ACTION:
				return basicSetExitAction(null, msgs);
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
			case FsmPackage.STATE__ENTRY_ACTION:
				return getEntryAction();
			case FsmPackage.STATE__DO_ACTION:
				return getDoAction();
			case FsmPackage.STATE__EXIT_ACTION:
				return getExitAction();
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
			case FsmPackage.STATE__ENTRY_ACTION:
				setEntryAction((Block)newValue);
				return;
			case FsmPackage.STATE__DO_ACTION:
				setDoAction((Block)newValue);
				return;
			case FsmPackage.STATE__EXIT_ACTION:
				setExitAction((Block)newValue);
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
			case FsmPackage.STATE__ENTRY_ACTION:
				setEntryAction((Block)null);
				return;
			case FsmPackage.STATE__DO_ACTION:
				setDoAction((Block)null);
				return;
			case FsmPackage.STATE__EXIT_ACTION:
				setExitAction((Block)null);
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
			case FsmPackage.STATE__ENTRY_ACTION:
				return entryAction != null;
			case FsmPackage.STATE__DO_ACTION:
				return doAction != null;
			case FsmPackage.STATE__EXIT_ACTION:
				return exitAction != null;
		}
		return super.eIsSet(featureID);
	}

} //StateImpl

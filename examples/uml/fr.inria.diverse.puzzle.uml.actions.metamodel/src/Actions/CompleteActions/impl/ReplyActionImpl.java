/**
 */
package Actions.CompleteActions.impl;

import Actions.BasicActions.InputPin;

import Actions.BasicActions.impl.ActionImpl;

import Actions.CompleteActions.CompleteActionsPackage;
import Actions.CompleteActions.ReplyAction;
import Actions.CompleteActions.Trigger;

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
 * An implementation of the model object '<em><b>Reply Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Actions.CompleteActions.impl.ReplyActionImpl#getReturnInformation <em>Return Information</em>}</li>
 *   <li>{@link Actions.CompleteActions.impl.ReplyActionImpl#getReplyValue <em>Reply Value</em>}</li>
 *   <li>{@link Actions.CompleteActions.impl.ReplyActionImpl#getReplyToCall <em>Reply To Call</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReplyActionImpl extends ActionImpl implements ReplyAction {
	/**
	 * The cached value of the '{@link #getReturnInformation() <em>Return Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnInformation()
	 * @generated
	 * @ordered
	 */
	protected InputPin returnInformation;

	/**
	 * The cached value of the '{@link #getReplyValue() <em>Reply Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyValue()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> replyValue;

	/**
	 * The cached value of the '{@link #getReplyToCall() <em>Reply To Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyToCall()
	 * @generated
	 * @ordered
	 */
	protected Trigger replyToCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplyActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteActionsPackage.Literals.REPLY_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getReturnInformation() {
		return returnInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnInformation(InputPin newReturnInformation, NotificationChain msgs) {
		InputPin oldReturnInformation = returnInformation;
		returnInformation = newReturnInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompleteActionsPackage.REPLY_ACTION__RETURN_INFORMATION, oldReturnInformation, newReturnInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnInformation(InputPin newReturnInformation) {
		if (newReturnInformation != returnInformation) {
			NotificationChain msgs = null;
			if (returnInformation != null)
				msgs = ((InternalEObject)returnInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompleteActionsPackage.REPLY_ACTION__RETURN_INFORMATION, null, msgs);
			if (newReturnInformation != null)
				msgs = ((InternalEObject)newReturnInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompleteActionsPackage.REPLY_ACTION__RETURN_INFORMATION, null, msgs);
			msgs = basicSetReturnInformation(newReturnInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteActionsPackage.REPLY_ACTION__RETURN_INFORMATION, newReturnInformation, newReturnInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getReplyValue() {
		if (replyValue == null) {
			replyValue = new EObjectContainmentEList<InputPin>(InputPin.class, this, CompleteActionsPackage.REPLY_ACTION__REPLY_VALUE);
		}
		return replyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getReplyToCall() {
		if (replyToCall != null && replyToCall.eIsProxy()) {
			InternalEObject oldReplyToCall = (InternalEObject)replyToCall;
			replyToCall = (Trigger)eResolveProxy(oldReplyToCall);
			if (replyToCall != oldReplyToCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteActionsPackage.REPLY_ACTION__REPLY_TO_CALL, oldReplyToCall, replyToCall));
			}
		}
		return replyToCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger basicGetReplyToCall() {
		return replyToCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplyToCall(Trigger newReplyToCall) {
		Trigger oldReplyToCall = replyToCall;
		replyToCall = newReplyToCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteActionsPackage.REPLY_ACTION__REPLY_TO_CALL, oldReplyToCall, replyToCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompleteActionsPackage.REPLY_ACTION__RETURN_INFORMATION:
				return basicSetReturnInformation(null, msgs);
			case CompleteActionsPackage.REPLY_ACTION__REPLY_VALUE:
				return ((InternalEList<?>)getReplyValue()).basicRemove(otherEnd, msgs);
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
			case CompleteActionsPackage.REPLY_ACTION__RETURN_INFORMATION:
				return getReturnInformation();
			case CompleteActionsPackage.REPLY_ACTION__REPLY_VALUE:
				return getReplyValue();
			case CompleteActionsPackage.REPLY_ACTION__REPLY_TO_CALL:
				if (resolve) return getReplyToCall();
				return basicGetReplyToCall();
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
			case CompleteActionsPackage.REPLY_ACTION__RETURN_INFORMATION:
				setReturnInformation((InputPin)newValue);
				return;
			case CompleteActionsPackage.REPLY_ACTION__REPLY_VALUE:
				getReplyValue().clear();
				getReplyValue().addAll((Collection<? extends InputPin>)newValue);
				return;
			case CompleteActionsPackage.REPLY_ACTION__REPLY_TO_CALL:
				setReplyToCall((Trigger)newValue);
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
			case CompleteActionsPackage.REPLY_ACTION__RETURN_INFORMATION:
				setReturnInformation((InputPin)null);
				return;
			case CompleteActionsPackage.REPLY_ACTION__REPLY_VALUE:
				getReplyValue().clear();
				return;
			case CompleteActionsPackage.REPLY_ACTION__REPLY_TO_CALL:
				setReplyToCall((Trigger)null);
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
			case CompleteActionsPackage.REPLY_ACTION__RETURN_INFORMATION:
				return returnInformation != null;
			case CompleteActionsPackage.REPLY_ACTION__REPLY_VALUE:
				return replyValue != null && !replyValue.isEmpty();
			case CompleteActionsPackage.REPLY_ACTION__REPLY_TO_CALL:
				return replyToCall != null;
		}
		return super.eIsSet(featureID);
	}

} //ReplyActionImpl

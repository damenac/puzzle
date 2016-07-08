/**
 */
package Actions.StructuredActions.impl;

import Actions.BasicActions.Action;

import Actions.BasicActions.impl.InputPinImpl;

import Actions.StructuredActions.ActionInputPin;
import Actions.StructuredActions.StructuredActionsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Input Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Actions.StructuredActions.impl.ActionInputPinImpl#getFromAction <em>From Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionInputPinImpl extends InputPinImpl implements ActionInputPin {
	/**
	 * The cached value of the '{@link #getFromAction() <em>From Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAction()
	 * @generated
	 * @ordered
	 */
	protected Action fromAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionInputPinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredActionsPackage.Literals.ACTION_INPUT_PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getFromAction() {
		return fromAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromAction(Action newFromAction, NotificationChain msgs) {
		Action oldFromAction = fromAction;
		fromAction = newFromAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructuredActionsPackage.ACTION_INPUT_PIN__FROM_ACTION, oldFromAction, newFromAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromAction(Action newFromAction) {
		if (newFromAction != fromAction) {
			NotificationChain msgs = null;
			if (fromAction != null)
				msgs = ((InternalEObject)fromAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructuredActionsPackage.ACTION_INPUT_PIN__FROM_ACTION, null, msgs);
			if (newFromAction != null)
				msgs = ((InternalEObject)newFromAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructuredActionsPackage.ACTION_INPUT_PIN__FROM_ACTION, null, msgs);
			msgs = basicSetFromAction(newFromAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredActionsPackage.ACTION_INPUT_PIN__FROM_ACTION, newFromAction, newFromAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuredActionsPackage.ACTION_INPUT_PIN__FROM_ACTION:
				return basicSetFromAction(null, msgs);
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
			case StructuredActionsPackage.ACTION_INPUT_PIN__FROM_ACTION:
				return getFromAction();
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
			case StructuredActionsPackage.ACTION_INPUT_PIN__FROM_ACTION:
				setFromAction((Action)newValue);
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
			case StructuredActionsPackage.ACTION_INPUT_PIN__FROM_ACTION:
				setFromAction((Action)null);
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
			case StructuredActionsPackage.ACTION_INPUT_PIN__FROM_ACTION:
				return fromAction != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionInputPinImpl

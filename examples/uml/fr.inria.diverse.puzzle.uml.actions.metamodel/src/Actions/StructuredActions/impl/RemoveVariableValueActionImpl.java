/**
 */
package Actions.StructuredActions.impl;

import Actions.BasicActions.InputPin;

import Actions.StructuredActions.RemoveVariableValueAction;
import Actions.StructuredActions.StructuredActionsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Variable Value Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Actions.StructuredActions.impl.RemoveVariableValueActionImpl#getRemoveAt <em>Remove At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoveVariableValueActionImpl extends WriteVariableActionImpl implements RemoveVariableValueAction {
	/**
	 * The cached value of the '{@link #getRemoveAt() <em>Remove At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveAt()
	 * @generated
	 * @ordered
	 */
	protected InputPin removeAt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveVariableValueActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredActionsPackage.Literals.REMOVE_VARIABLE_VALUE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getRemoveAt() {
		return removeAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveAt(InputPin newRemoveAt, NotificationChain msgs) {
		InputPin oldRemoveAt = removeAt;
		removeAt = newRemoveAt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructuredActionsPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT, oldRemoveAt, newRemoveAt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveAt(InputPin newRemoveAt) {
		if (newRemoveAt != removeAt) {
			NotificationChain msgs = null;
			if (removeAt != null)
				msgs = ((InternalEObject)removeAt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructuredActionsPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT, null, msgs);
			if (newRemoveAt != null)
				msgs = ((InternalEObject)newRemoveAt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructuredActionsPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT, null, msgs);
			msgs = basicSetRemoveAt(newRemoveAt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredActionsPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT, newRemoveAt, newRemoveAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuredActionsPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT:
				return basicSetRemoveAt(null, msgs);
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
			case StructuredActionsPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT:
				return getRemoveAt();
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
			case StructuredActionsPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT:
				setRemoveAt((InputPin)newValue);
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
			case StructuredActionsPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT:
				setRemoveAt((InputPin)null);
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
			case StructuredActionsPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT:
				return removeAt != null;
		}
		return super.eIsSet(featureID);
	}

} //RemoveVariableValueActionImpl

/**
 */
package Actions.CompleteActions.impl;

import Actions.BasicActions.OutputPin;

import Actions.BasicActions.impl.ActionImpl;

import Actions.CompleteActions.AcceptEventAction;
import Actions.CompleteActions.CompleteActionsPackage;
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
 * An implementation of the model object '<em><b>Accept Event Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Actions.CompleteActions.impl.AcceptEventActionImpl#isIsUnmarshall <em>Is Unmarshall</em>}</li>
 *   <li>{@link Actions.CompleteActions.impl.AcceptEventActionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link Actions.CompleteActions.impl.AcceptEventActionImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcceptEventActionImpl extends ActionImpl implements AcceptEventAction {
	/**
	 * The default value of the '{@link #isIsUnmarshall() <em>Is Unmarshall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnmarshall()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNMARSHALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnmarshall() <em>Is Unmarshall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnmarshall()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnmarshall = IS_UNMARSHALL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> result;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> trigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptEventActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteActionsPackage.Literals.ACCEPT_EVENT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnmarshall() {
		return isUnmarshall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnmarshall(boolean newIsUnmarshall) {
		boolean oldIsUnmarshall = isUnmarshall;
		isUnmarshall = newIsUnmarshall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteActionsPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL, oldIsUnmarshall, isUnmarshall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, CompleteActionsPackage.ACCEPT_EVENT_ACTION__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getTrigger() {
		if (trigger == null) {
			trigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, CompleteActionsPackage.ACCEPT_EVENT_ACTION__TRIGGER);
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompleteActionsPackage.ACCEPT_EVENT_ACTION__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
			case CompleteActionsPackage.ACCEPT_EVENT_ACTION__TRIGGER:
				return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
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
			case CompleteActionsPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL:
				return isIsUnmarshall();
			case CompleteActionsPackage.ACCEPT_EVENT_ACTION__RESULT:
				return getResult();
			case CompleteActionsPackage.ACCEPT_EVENT_ACTION__TRIGGER:
				return getTrigger();
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
			case CompleteActionsPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL:
				setIsUnmarshall((Boolean)newValue);
				return;
			case CompleteActionsPackage.ACCEPT_EVENT_ACTION__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case CompleteActionsPackage.ACCEPT_EVENT_ACTION__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends Trigger>)newValue);
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
			case CompleteActionsPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL:
				setIsUnmarshall(IS_UNMARSHALL_EDEFAULT);
				return;
			case CompleteActionsPackage.ACCEPT_EVENT_ACTION__RESULT:
				getResult().clear();
				return;
			case CompleteActionsPackage.ACCEPT_EVENT_ACTION__TRIGGER:
				getTrigger().clear();
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
			case CompleteActionsPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL:
				return isUnmarshall != IS_UNMARSHALL_EDEFAULT;
			case CompleteActionsPackage.ACCEPT_EVENT_ACTION__RESULT:
				return result != null && !result.isEmpty();
			case CompleteActionsPackage.ACCEPT_EVENT_ACTION__TRIGGER:
				return trigger != null && !trigger.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isUnmarshall: ");
		result.append(isUnmarshall);
		result.append(')');
		return result.toString();
	}

} //AcceptEventActionImpl

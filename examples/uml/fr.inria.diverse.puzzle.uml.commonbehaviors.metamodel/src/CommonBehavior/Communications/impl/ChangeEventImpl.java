/**
 */
package CommonBehavior.Communications.impl;

import CommonBehavior.Communications.ChangeEvent;
import CommonBehavior.Communications.CommunicationsPackage;
import CommonBehavior.Communications.ValueSpecification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CommonBehavior.Communications.impl.ChangeEventImpl#getChangeExpression <em>Change Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeEventImpl extends EventImpl implements ChangeEvent {
	/**
	 * The cached value of the '{@link #getChangeExpression() <em>Change Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeExpression()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification changeExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationsPackage.Literals.CHANGE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getChangeExpression() {
		if (changeExpression != null && changeExpression.eIsProxy()) {
			InternalEObject oldChangeExpression = (InternalEObject)changeExpression;
			changeExpression = (ValueSpecification)eResolveProxy(oldChangeExpression);
			if (changeExpression != oldChangeExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommunicationsPackage.CHANGE_EVENT__CHANGE_EXPRESSION, oldChangeExpression, changeExpression));
			}
		}
		return changeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetChangeExpression() {
		return changeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeExpression(ValueSpecification newChangeExpression) {
		ValueSpecification oldChangeExpression = changeExpression;
		changeExpression = newChangeExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationsPackage.CHANGE_EVENT__CHANGE_EXPRESSION, oldChangeExpression, changeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommunicationsPackage.CHANGE_EVENT__CHANGE_EXPRESSION:
				if (resolve) return getChangeExpression();
				return basicGetChangeExpression();
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
			case CommunicationsPackage.CHANGE_EVENT__CHANGE_EXPRESSION:
				setChangeExpression((ValueSpecification)newValue);
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
			case CommunicationsPackage.CHANGE_EVENT__CHANGE_EXPRESSION:
				setChangeExpression((ValueSpecification)null);
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
			case CommunicationsPackage.CHANGE_EVENT__CHANGE_EXPRESSION:
				return changeExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ChangeEventImpl

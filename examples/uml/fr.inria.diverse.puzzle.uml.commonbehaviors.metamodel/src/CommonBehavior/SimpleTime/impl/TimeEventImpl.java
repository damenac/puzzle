/**
 */
package CommonBehavior.SimpleTime.impl;

import CommonBehavior.SimpleTime.SimpleTimePackage;
import CommonBehavior.SimpleTime.TimeEvent;
import CommonBehavior.SimpleTime.TimeExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CommonBehavior.SimpleTime.impl.TimeEventImpl#isIsRelative <em>Is Relative</em>}</li>
 *   <li>{@link CommonBehavior.SimpleTime.impl.TimeEventImpl#getWhen <em>When</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeEventImpl extends MinimalEObjectImpl.Container implements TimeEvent {
	/**
	 * The default value of the '{@link #isIsRelative() <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRelative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RELATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRelative() <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRelative()
	 * @generated
	 * @ordered
	 */
	protected boolean isRelative = IS_RELATIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected TimeExpression when;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleTimePackage.Literals.TIME_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRelative() {
		return isRelative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRelative(boolean newIsRelative) {
		boolean oldIsRelative = isRelative;
		isRelative = newIsRelative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleTimePackage.TIME_EVENT__IS_RELATIVE, oldIsRelative, isRelative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeExpression getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(TimeExpression newWhen, NotificationChain msgs) {
		TimeExpression oldWhen = when;
		when = newWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleTimePackage.TIME_EVENT__WHEN, oldWhen, newWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(TimeExpression newWhen) {
		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleTimePackage.TIME_EVENT__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleTimePackage.TIME_EVENT__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleTimePackage.TIME_EVENT__WHEN, newWhen, newWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleTimePackage.TIME_EVENT__WHEN:
				return basicSetWhen(null, msgs);
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
			case SimpleTimePackage.TIME_EVENT__IS_RELATIVE:
				return isIsRelative();
			case SimpleTimePackage.TIME_EVENT__WHEN:
				return getWhen();
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
			case SimpleTimePackage.TIME_EVENT__IS_RELATIVE:
				setIsRelative((Boolean)newValue);
				return;
			case SimpleTimePackage.TIME_EVENT__WHEN:
				setWhen((TimeExpression)newValue);
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
			case SimpleTimePackage.TIME_EVENT__IS_RELATIVE:
				setIsRelative(IS_RELATIVE_EDEFAULT);
				return;
			case SimpleTimePackage.TIME_EVENT__WHEN:
				setWhen((TimeExpression)null);
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
			case SimpleTimePackage.TIME_EVENT__IS_RELATIVE:
				return isRelative != IS_RELATIVE_EDEFAULT;
			case SimpleTimePackage.TIME_EVENT__WHEN:
				return when != null;
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
		result.append(" (isRelative: ");
		result.append(isRelative);
		result.append(')');
		return result.toString();
	}

} //TimeEventImpl

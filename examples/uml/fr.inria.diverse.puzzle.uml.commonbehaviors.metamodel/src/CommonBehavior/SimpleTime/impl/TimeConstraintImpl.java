/**
 */
package CommonBehavior.SimpleTime.impl;

import CommonBehavior.SimpleTime.SimpleTimePackage;
import CommonBehavior.SimpleTime.TimeConstraint;
import CommonBehavior.SimpleTime.TimeInterval;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CommonBehavior.SimpleTime.impl.TimeConstraintImpl#isFirstEvent <em>First Event</em>}</li>
 *   <li>{@link CommonBehavior.SimpleTime.impl.TimeConstraintImpl#getTimeSpecification <em>Time Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeConstraintImpl extends IntervalConstraintImpl implements TimeConstraint {
	/**
	 * The default value of the '{@link #isFirstEvent() <em>First Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirstEvent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIRST_EVENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFirstEvent() <em>First Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirstEvent()
	 * @generated
	 * @ordered
	 */
	protected boolean firstEvent = FIRST_EVENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeSpecification() <em>Time Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSpecification()
	 * @generated
	 * @ordered
	 */
	protected TimeInterval timeSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleTimePackage.Literals.TIME_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFirstEvent() {
		return firstEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstEvent(boolean newFirstEvent) {
		boolean oldFirstEvent = firstEvent;
		firstEvent = newFirstEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleTimePackage.TIME_CONSTRAINT__FIRST_EVENT, oldFirstEvent, firstEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval getTimeSpecification() {
		if (timeSpecification != null && timeSpecification.eIsProxy()) {
			InternalEObject oldTimeSpecification = (InternalEObject)timeSpecification;
			timeSpecification = (TimeInterval)eResolveProxy(oldTimeSpecification);
			if (timeSpecification != oldTimeSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleTimePackage.TIME_CONSTRAINT__TIME_SPECIFICATION, oldTimeSpecification, timeSpecification));
			}
		}
		return timeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval basicGetTimeSpecification() {
		return timeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSpecification(TimeInterval newTimeSpecification) {
		TimeInterval oldTimeSpecification = timeSpecification;
		timeSpecification = newTimeSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleTimePackage.TIME_CONSTRAINT__TIME_SPECIFICATION, oldTimeSpecification, timeSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleTimePackage.TIME_CONSTRAINT__FIRST_EVENT:
				return isFirstEvent();
			case SimpleTimePackage.TIME_CONSTRAINT__TIME_SPECIFICATION:
				if (resolve) return getTimeSpecification();
				return basicGetTimeSpecification();
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
			case SimpleTimePackage.TIME_CONSTRAINT__FIRST_EVENT:
				setFirstEvent((Boolean)newValue);
				return;
			case SimpleTimePackage.TIME_CONSTRAINT__TIME_SPECIFICATION:
				setTimeSpecification((TimeInterval)newValue);
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
			case SimpleTimePackage.TIME_CONSTRAINT__FIRST_EVENT:
				setFirstEvent(FIRST_EVENT_EDEFAULT);
				return;
			case SimpleTimePackage.TIME_CONSTRAINT__TIME_SPECIFICATION:
				setTimeSpecification((TimeInterval)null);
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
			case SimpleTimePackage.TIME_CONSTRAINT__FIRST_EVENT:
				return firstEvent != FIRST_EVENT_EDEFAULT;
			case SimpleTimePackage.TIME_CONSTRAINT__TIME_SPECIFICATION:
				return timeSpecification != null;
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
		result.append(" (firstEvent: ");
		result.append(firstEvent);
		result.append(')');
		return result.toString();
	}

} //TimeConstraintImpl

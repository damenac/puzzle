/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.TimeExpression;
import CompleteDSLPckg.TimeInterval;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompleteDSLPckg.impl.TimeIntervalImpl#getTimeMax <em>Time Max</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.TimeIntervalImpl#getTimeMin <em>Time Min</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeIntervalImpl extends IntervalImpl implements TimeInterval {
	/**
	 * The cached value of the '{@link #getTimeMax() <em>Time Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeMax()
	 * @generated
	 * @ordered
	 */
	protected TimeExpression timeMax;

	/**
	 * The cached value of the '{@link #getTimeMin() <em>Time Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeMin()
	 * @generated
	 * @ordered
	 */
	protected TimeExpression timeMin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteDSLPckgPackage.eINSTANCE.getTimeInterval();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeExpression getTimeMax() {
		if (timeMax != null && timeMax.eIsProxy()) {
			InternalEObject oldTimeMax = (InternalEObject)timeMax;
			timeMax = (TimeExpression)eResolveProxy(oldTimeMax);
			if (timeMax != oldTimeMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.TIME_INTERVAL__TIME_MAX, oldTimeMax, timeMax));
			}
		}
		return timeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeExpression basicGetTimeMax() {
		return timeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeMax(TimeExpression newTimeMax) {
		TimeExpression oldTimeMax = timeMax;
		timeMax = newTimeMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.TIME_INTERVAL__TIME_MAX, oldTimeMax, timeMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeExpression getTimeMin() {
		if (timeMin != null && timeMin.eIsProxy()) {
			InternalEObject oldTimeMin = (InternalEObject)timeMin;
			timeMin = (TimeExpression)eResolveProxy(oldTimeMin);
			if (timeMin != oldTimeMin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.TIME_INTERVAL__TIME_MIN, oldTimeMin, timeMin));
			}
		}
		return timeMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeExpression basicGetTimeMin() {
		return timeMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeMin(TimeExpression newTimeMin) {
		TimeExpression oldTimeMin = timeMin;
		timeMin = newTimeMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.TIME_INTERVAL__TIME_MIN, oldTimeMin, timeMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompleteDSLPckgPackage.TIME_INTERVAL__TIME_MAX:
				if (resolve) return getTimeMax();
				return basicGetTimeMax();
			case CompleteDSLPckgPackage.TIME_INTERVAL__TIME_MIN:
				if (resolve) return getTimeMin();
				return basicGetTimeMin();
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
			case CompleteDSLPckgPackage.TIME_INTERVAL__TIME_MAX:
				setTimeMax((TimeExpression)newValue);
				return;
			case CompleteDSLPckgPackage.TIME_INTERVAL__TIME_MIN:
				setTimeMin((TimeExpression)newValue);
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
			case CompleteDSLPckgPackage.TIME_INTERVAL__TIME_MAX:
				setTimeMax((TimeExpression)null);
				return;
			case CompleteDSLPckgPackage.TIME_INTERVAL__TIME_MIN:
				setTimeMin((TimeExpression)null);
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
			case CompleteDSLPckgPackage.TIME_INTERVAL__TIME_MAX:
				return timeMax != null;
			case CompleteDSLPckgPackage.TIME_INTERVAL__TIME_MIN:
				return timeMin != null;
		}
		return super.eIsSet(featureID);
	}

} //TimeIntervalImpl

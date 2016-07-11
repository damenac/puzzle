/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.Duration;
import CompleteDSLPckg.DurationInterval;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompleteDSLPckg.impl.DurationIntervalImpl#getDurationMax <em>Duration Max</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.DurationIntervalImpl#getDurationMin <em>Duration Min</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationIntervalImpl extends IntervalImpl implements DurationInterval {
	/**
	 * The cached value of the '{@link #getDurationMax() <em>Duration Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationMax()
	 * @generated
	 * @ordered
	 */
	protected Duration durationMax;

	/**
	 * The cached value of the '{@link #getDurationMin() <em>Duration Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationMin()
	 * @generated
	 * @ordered
	 */
	protected Duration durationMin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteDSLPckgPackage.eINSTANCE.getDurationInterval();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDurationMax() {
		if (durationMax != null && durationMax.eIsProxy()) {
			InternalEObject oldDurationMax = (InternalEObject)durationMax;
			durationMax = (Duration)eResolveProxy(oldDurationMax);
			if (durationMax != oldDurationMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.DURATION_INTERVAL__DURATION_MAX, oldDurationMax, durationMax));
			}
		}
		return durationMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration basicGetDurationMax() {
		return durationMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationMax(Duration newDurationMax) {
		Duration oldDurationMax = durationMax;
		durationMax = newDurationMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.DURATION_INTERVAL__DURATION_MAX, oldDurationMax, durationMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDurationMin() {
		if (durationMin != null && durationMin.eIsProxy()) {
			InternalEObject oldDurationMin = (InternalEObject)durationMin;
			durationMin = (Duration)eResolveProxy(oldDurationMin);
			if (durationMin != oldDurationMin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.DURATION_INTERVAL__DURATION_MIN, oldDurationMin, durationMin));
			}
		}
		return durationMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration basicGetDurationMin() {
		return durationMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationMin(Duration newDurationMin) {
		Duration oldDurationMin = durationMin;
		durationMin = newDurationMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.DURATION_INTERVAL__DURATION_MIN, oldDurationMin, durationMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompleteDSLPckgPackage.DURATION_INTERVAL__DURATION_MAX:
				if (resolve) return getDurationMax();
				return basicGetDurationMax();
			case CompleteDSLPckgPackage.DURATION_INTERVAL__DURATION_MIN:
				if (resolve) return getDurationMin();
				return basicGetDurationMin();
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
			case CompleteDSLPckgPackage.DURATION_INTERVAL__DURATION_MAX:
				setDurationMax((Duration)newValue);
				return;
			case CompleteDSLPckgPackage.DURATION_INTERVAL__DURATION_MIN:
				setDurationMin((Duration)newValue);
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
			case CompleteDSLPckgPackage.DURATION_INTERVAL__DURATION_MAX:
				setDurationMax((Duration)null);
				return;
			case CompleteDSLPckgPackage.DURATION_INTERVAL__DURATION_MIN:
				setDurationMin((Duration)null);
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
			case CompleteDSLPckgPackage.DURATION_INTERVAL__DURATION_MAX:
				return durationMax != null;
			case CompleteDSLPckgPackage.DURATION_INTERVAL__DURATION_MIN:
				return durationMin != null;
		}
		return super.eIsSet(featureID);
	}

} //DurationIntervalImpl

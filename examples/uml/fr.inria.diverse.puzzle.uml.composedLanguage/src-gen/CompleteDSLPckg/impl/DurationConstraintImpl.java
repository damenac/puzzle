/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.DurationConstraint;
import CompleteDSLPckg.DurationInterval;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompleteDSLPckg.impl.DurationConstraintImpl#isFirstEvent <em>First Event</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.DurationConstraintImpl#getDurationSpecification <em>Duration Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationConstraintImpl extends IntervalConstraintImpl implements DurationConstraint {
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
	 * The cached value of the '{@link #getDurationSpecification() <em>Duration Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationSpecification()
	 * @generated
	 * @ordered
	 */
	protected DurationInterval durationSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteDSLPckgPackage.eINSTANCE.getDurationConstraint();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.DURATION_CONSTRAINT__FIRST_EVENT, oldFirstEvent, firstEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationInterval getDurationSpecification() {
		if (durationSpecification != null && durationSpecification.eIsProxy()) {
			InternalEObject oldDurationSpecification = (InternalEObject)durationSpecification;
			durationSpecification = (DurationInterval)eResolveProxy(oldDurationSpecification);
			if (durationSpecification != oldDurationSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.DURATION_CONSTRAINT__DURATION_SPECIFICATION, oldDurationSpecification, durationSpecification));
			}
		}
		return durationSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationInterval basicGetDurationSpecification() {
		return durationSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationSpecification(DurationInterval newDurationSpecification) {
		DurationInterval oldDurationSpecification = durationSpecification;
		durationSpecification = newDurationSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.DURATION_CONSTRAINT__DURATION_SPECIFICATION, oldDurationSpecification, durationSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompleteDSLPckgPackage.DURATION_CONSTRAINT__FIRST_EVENT:
				return isFirstEvent();
			case CompleteDSLPckgPackage.DURATION_CONSTRAINT__DURATION_SPECIFICATION:
				if (resolve) return getDurationSpecification();
				return basicGetDurationSpecification();
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
			case CompleteDSLPckgPackage.DURATION_CONSTRAINT__FIRST_EVENT:
				setFirstEvent((Boolean)newValue);
				return;
			case CompleteDSLPckgPackage.DURATION_CONSTRAINT__DURATION_SPECIFICATION:
				setDurationSpecification((DurationInterval)newValue);
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
			case CompleteDSLPckgPackage.DURATION_CONSTRAINT__FIRST_EVENT:
				setFirstEvent(FIRST_EVENT_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.DURATION_CONSTRAINT__DURATION_SPECIFICATION:
				setDurationSpecification((DurationInterval)null);
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
			case CompleteDSLPckgPackage.DURATION_CONSTRAINT__FIRST_EVENT:
				return firstEvent != FIRST_EVENT_EDEFAULT;
			case CompleteDSLPckgPackage.DURATION_CONSTRAINT__DURATION_SPECIFICATION:
				return durationSpecification != null;
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

} //DurationConstraintImpl

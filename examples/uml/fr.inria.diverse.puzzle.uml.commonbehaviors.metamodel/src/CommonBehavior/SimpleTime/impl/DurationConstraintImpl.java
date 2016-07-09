/**
 */
package CommonBehavior.SimpleTime.impl;

import CommonBehavior.SimpleTime.DurationConstraint;
import CommonBehavior.SimpleTime.DurationInterval;
import CommonBehavior.SimpleTime.SimpleTimePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CommonBehavior.SimpleTime.impl.DurationConstraintImpl#getFirstEvent <em>First Event</em>}</li>
 *   <li>{@link CommonBehavior.SimpleTime.impl.DurationConstraintImpl#getDurationSpecification <em>Duration Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationConstraintImpl extends IntervalConstraintImpl implements DurationConstraint {
	/**
	 * The cached value of the '{@link #getFirstEvent() <em>First Event</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> firstEvent;

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
		return SimpleTimePackage.Literals.DURATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boolean> getFirstEvent() {
		if (firstEvent == null) {
			firstEvent = new EDataTypeUniqueEList<Boolean>(Boolean.class, this, SimpleTimePackage.DURATION_CONSTRAINT__FIRST_EVENT);
		}
		return firstEvent;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleTimePackage.DURATION_CONSTRAINT__DURATION_SPECIFICATION, oldDurationSpecification, durationSpecification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleTimePackage.DURATION_CONSTRAINT__DURATION_SPECIFICATION, oldDurationSpecification, durationSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleTimePackage.DURATION_CONSTRAINT__FIRST_EVENT:
				return getFirstEvent();
			case SimpleTimePackage.DURATION_CONSTRAINT__DURATION_SPECIFICATION:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimpleTimePackage.DURATION_CONSTRAINT__FIRST_EVENT:
				getFirstEvent().clear();
				getFirstEvent().addAll((Collection<? extends Boolean>)newValue);
				return;
			case SimpleTimePackage.DURATION_CONSTRAINT__DURATION_SPECIFICATION:
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
			case SimpleTimePackage.DURATION_CONSTRAINT__FIRST_EVENT:
				getFirstEvent().clear();
				return;
			case SimpleTimePackage.DURATION_CONSTRAINT__DURATION_SPECIFICATION:
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
			case SimpleTimePackage.DURATION_CONSTRAINT__FIRST_EVENT:
				return firstEvent != null && !firstEvent.isEmpty();
			case SimpleTimePackage.DURATION_CONSTRAINT__DURATION_SPECIFICATION:
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

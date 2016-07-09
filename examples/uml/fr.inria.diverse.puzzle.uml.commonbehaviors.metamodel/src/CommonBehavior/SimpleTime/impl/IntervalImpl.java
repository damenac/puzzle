/**
 */
package CommonBehavior.SimpleTime.impl;

import CommonBehavior.Communications.ValueSpecification;

import CommonBehavior.Communications.impl.ValueSpecificationImpl;

import CommonBehavior.SimpleTime.Interval;
import CommonBehavior.SimpleTime.SimpleTimePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CommonBehavior.SimpleTime.impl.IntervalImpl#getMax <em>Max</em>}</li>
 *   <li>{@link CommonBehavior.SimpleTime.impl.IntervalImpl#getMin <em>Min</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntervalImpl extends ValueSpecificationImpl implements Interval {
	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification max;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification min;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleTimePackage.Literals.INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMax() {
		if (max != null && max.eIsProxy()) {
			InternalEObject oldMax = (InternalEObject)max;
			max = (ValueSpecification)eResolveProxy(oldMax);
			if (max != oldMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleTimePackage.INTERVAL__MAX, oldMax, max));
			}
		}
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(ValueSpecification newMax) {
		ValueSpecification oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleTimePackage.INTERVAL__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMin() {
		if (min != null && min.eIsProxy()) {
			InternalEObject oldMin = (InternalEObject)min;
			min = (ValueSpecification)eResolveProxy(oldMin);
			if (min != oldMin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleTimePackage.INTERVAL__MIN, oldMin, min));
			}
		}
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(ValueSpecification newMin) {
		ValueSpecification oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleTimePackage.INTERVAL__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleTimePackage.INTERVAL__MAX:
				if (resolve) return getMax();
				return basicGetMax();
			case SimpleTimePackage.INTERVAL__MIN:
				if (resolve) return getMin();
				return basicGetMin();
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
			case SimpleTimePackage.INTERVAL__MAX:
				setMax((ValueSpecification)newValue);
				return;
			case SimpleTimePackage.INTERVAL__MIN:
				setMin((ValueSpecification)newValue);
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
			case SimpleTimePackage.INTERVAL__MAX:
				setMax((ValueSpecification)null);
				return;
			case SimpleTimePackage.INTERVAL__MIN:
				setMin((ValueSpecification)null);
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
			case SimpleTimePackage.INTERVAL__MAX:
				return max != null;
			case SimpleTimePackage.INTERVAL__MIN:
				return min != null;
		}
		return super.eIsSet(featureID);
	}

} //IntervalImpl

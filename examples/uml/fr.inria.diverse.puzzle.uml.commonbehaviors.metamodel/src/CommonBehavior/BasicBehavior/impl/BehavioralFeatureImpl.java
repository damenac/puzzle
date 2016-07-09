/**
 */
package CommonBehavior.BasicBehavior.impl;

import CommonBehavior.BasicBehavior.BasicBehaviorPackage;
import CommonBehavior.BasicBehavior.Behavior;
import CommonBehavior.BasicBehavior.BehavioralFeature;

import CommonBehavior.Communications.CallConcurrencyFeature;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CommonBehavior.BasicBehavior.impl.BehavioralFeatureImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link CommonBehavior.BasicBehavior.impl.BehavioralFeatureImpl#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehavioralFeatureImpl extends MinimalEObjectImpl.Container implements BehavioralFeature {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> method;

	/**
	 * The default value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected static final CallConcurrencyFeature CONCURRENCY_EDEFAULT = CallConcurrencyFeature.SEQUENTIAL;

	/**
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected CallConcurrencyFeature concurrency = CONCURRENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicBehaviorPackage.Literals.BEHAVIORAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getMethod() {
		if (method == null) {
			method = new EObjectWithInverseResolvingEList<Behavior>(Behavior.class, this, BasicBehaviorPackage.BEHAVIORAL_FEATURE__METHOD, BasicBehaviorPackage.BEHAVIOR__SPECIFICATION);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConcurrencyFeature getConcurrency() {
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrency(CallConcurrencyFeature newConcurrency) {
		CallConcurrencyFeature oldConcurrency = concurrency;
		concurrency = newConcurrency == null ? CONCURRENCY_EDEFAULT : newConcurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicBehaviorPackage.BEHAVIORAL_FEATURE__CONCURRENCY, oldConcurrency, concurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicBehaviorPackage.BEHAVIORAL_FEATURE__METHOD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethod()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicBehaviorPackage.BEHAVIORAL_FEATURE__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
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
			case BasicBehaviorPackage.BEHAVIORAL_FEATURE__METHOD:
				return getMethod();
			case BasicBehaviorPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				return getConcurrency();
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
			case BasicBehaviorPackage.BEHAVIORAL_FEATURE__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends Behavior>)newValue);
				return;
			case BasicBehaviorPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				setConcurrency((CallConcurrencyFeature)newValue);
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
			case BasicBehaviorPackage.BEHAVIORAL_FEATURE__METHOD:
				getMethod().clear();
				return;
			case BasicBehaviorPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				setConcurrency(CONCURRENCY_EDEFAULT);
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
			case BasicBehaviorPackage.BEHAVIORAL_FEATURE__METHOD:
				return method != null && !method.isEmpty();
			case BasicBehaviorPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				return concurrency != CONCURRENCY_EDEFAULT;
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
		result.append(" (concurrency: ");
		result.append(concurrency);
		result.append(')');
		return result.toString();
	}

} //BehavioralFeatureImpl

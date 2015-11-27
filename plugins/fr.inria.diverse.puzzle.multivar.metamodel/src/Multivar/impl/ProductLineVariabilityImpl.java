/**
 */
package Multivar.impl;

import Multivar.LanguageFeature;
import Multivar.MultivarPackage;
import Multivar.ProductLineVariability;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Line Variability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Multivar.impl.ProductLineVariabilityImpl#getRootFeature <em>Root Feature</em>}</li>
 *   <li>{@link Multivar.impl.ProductLineVariabilityImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductLineVariabilityImpl extends MinimalEObjectImpl.Container implements ProductLineVariability {
	/**
	 * The cached value of the '{@link #getRootFeature() <em>Root Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootFeature()
	 * @generated
	 * @ordered
	 */
	protected LanguageFeature rootFeature;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<LanguageFeature> features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductLineVariabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultivarPackage.Literals.PRODUCT_LINE_VARIABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageFeature getRootFeature() {
		if (rootFeature != null && rootFeature.eIsProxy()) {
			InternalEObject oldRootFeature = (InternalEObject)rootFeature;
			rootFeature = (LanguageFeature)eResolveProxy(oldRootFeature);
			if (rootFeature != oldRootFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MultivarPackage.PRODUCT_LINE_VARIABILITY__ROOT_FEATURE, oldRootFeature, rootFeature));
			}
		}
		return rootFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageFeature basicGetRootFeature() {
		return rootFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootFeature(LanguageFeature newRootFeature) {
		LanguageFeature oldRootFeature = rootFeature;
		rootFeature = newRootFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultivarPackage.PRODUCT_LINE_VARIABILITY__ROOT_FEATURE, oldRootFeature, rootFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LanguageFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<LanguageFeature>(LanguageFeature.class, this, MultivarPackage.PRODUCT_LINE_VARIABILITY__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MultivarPackage.PRODUCT_LINE_VARIABILITY__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case MultivarPackage.PRODUCT_LINE_VARIABILITY__ROOT_FEATURE:
				if (resolve) return getRootFeature();
				return basicGetRootFeature();
			case MultivarPackage.PRODUCT_LINE_VARIABILITY__FEATURES:
				return getFeatures();
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
			case MultivarPackage.PRODUCT_LINE_VARIABILITY__ROOT_FEATURE:
				setRootFeature((LanguageFeature)newValue);
				return;
			case MultivarPackage.PRODUCT_LINE_VARIABILITY__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends LanguageFeature>)newValue);
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
			case MultivarPackage.PRODUCT_LINE_VARIABILITY__ROOT_FEATURE:
				setRootFeature((LanguageFeature)null);
				return;
			case MultivarPackage.PRODUCT_LINE_VARIABILITY__FEATURES:
				getFeatures().clear();
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
			case MultivarPackage.PRODUCT_LINE_VARIABILITY__ROOT_FEATURE:
				return rootFeature != null;
			case MultivarPackage.PRODUCT_LINE_VARIABILITY__FEATURES:
				return features != null && !features.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductLineVariabilityImpl

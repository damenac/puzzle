/**
 */
package vm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import vm.LanguageFeatureModel;
import vm.LanguageProductLine;
import vm.OrthogonalVariabilityModel;
import vm.VmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language Product Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vm.impl.LanguageProductLineImpl#getFunctionalVariability <em>Functional Variability</em>}</li>
 *   <li>{@link vm.impl.LanguageProductLineImpl#getSemanticalVariability <em>Semantical Variability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LanguageProductLineImpl extends MinimalEObjectImpl.Container implements LanguageProductLine {
	/**
	 * The cached value of the '{@link #getFunctionalVariability() <em>Functional Variability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalVariability()
	 * @generated
	 * @ordered
	 */
	protected LanguageFeatureModel functionalVariability;

	/**
	 * The cached value of the '{@link #getSemanticalVariability() <em>Semantical Variability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticalVariability()
	 * @generated
	 * @ordered
	 */
	protected OrthogonalVariabilityModel semanticalVariability;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageProductLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmPackage.Literals.LANGUAGE_PRODUCT_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageFeatureModel getFunctionalVariability() {
		return functionalVariability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionalVariability(LanguageFeatureModel newFunctionalVariability, NotificationChain msgs) {
		LanguageFeatureModel oldFunctionalVariability = functionalVariability;
		functionalVariability = newFunctionalVariability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmPackage.LANGUAGE_PRODUCT_LINE__FUNCTIONAL_VARIABILITY, oldFunctionalVariability, newFunctionalVariability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionalVariability(LanguageFeatureModel newFunctionalVariability) {
		if (newFunctionalVariability != functionalVariability) {
			NotificationChain msgs = null;
			if (functionalVariability != null)
				msgs = ((InternalEObject)functionalVariability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmPackage.LANGUAGE_PRODUCT_LINE__FUNCTIONAL_VARIABILITY, null, msgs);
			if (newFunctionalVariability != null)
				msgs = ((InternalEObject)newFunctionalVariability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmPackage.LANGUAGE_PRODUCT_LINE__FUNCTIONAL_VARIABILITY, null, msgs);
			msgs = basicSetFunctionalVariability(newFunctionalVariability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.LANGUAGE_PRODUCT_LINE__FUNCTIONAL_VARIABILITY, newFunctionalVariability, newFunctionalVariability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrthogonalVariabilityModel getSemanticalVariability() {
		return semanticalVariability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemanticalVariability(OrthogonalVariabilityModel newSemanticalVariability, NotificationChain msgs) {
		OrthogonalVariabilityModel oldSemanticalVariability = semanticalVariability;
		semanticalVariability = newSemanticalVariability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmPackage.LANGUAGE_PRODUCT_LINE__SEMANTICAL_VARIABILITY, oldSemanticalVariability, newSemanticalVariability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemanticalVariability(OrthogonalVariabilityModel newSemanticalVariability) {
		if (newSemanticalVariability != semanticalVariability) {
			NotificationChain msgs = null;
			if (semanticalVariability != null)
				msgs = ((InternalEObject)semanticalVariability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmPackage.LANGUAGE_PRODUCT_LINE__SEMANTICAL_VARIABILITY, null, msgs);
			if (newSemanticalVariability != null)
				msgs = ((InternalEObject)newSemanticalVariability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmPackage.LANGUAGE_PRODUCT_LINE__SEMANTICAL_VARIABILITY, null, msgs);
			msgs = basicSetSemanticalVariability(newSemanticalVariability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.LANGUAGE_PRODUCT_LINE__SEMANTICAL_VARIABILITY, newSemanticalVariability, newSemanticalVariability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VmPackage.LANGUAGE_PRODUCT_LINE__FUNCTIONAL_VARIABILITY:
				return basicSetFunctionalVariability(null, msgs);
			case VmPackage.LANGUAGE_PRODUCT_LINE__SEMANTICAL_VARIABILITY:
				return basicSetSemanticalVariability(null, msgs);
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
			case VmPackage.LANGUAGE_PRODUCT_LINE__FUNCTIONAL_VARIABILITY:
				return getFunctionalVariability();
			case VmPackage.LANGUAGE_PRODUCT_LINE__SEMANTICAL_VARIABILITY:
				return getSemanticalVariability();
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
			case VmPackage.LANGUAGE_PRODUCT_LINE__FUNCTIONAL_VARIABILITY:
				setFunctionalVariability((LanguageFeatureModel)newValue);
				return;
			case VmPackage.LANGUAGE_PRODUCT_LINE__SEMANTICAL_VARIABILITY:
				setSemanticalVariability((OrthogonalVariabilityModel)newValue);
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
			case VmPackage.LANGUAGE_PRODUCT_LINE__FUNCTIONAL_VARIABILITY:
				setFunctionalVariability((LanguageFeatureModel)null);
				return;
			case VmPackage.LANGUAGE_PRODUCT_LINE__SEMANTICAL_VARIABILITY:
				setSemanticalVariability((OrthogonalVariabilityModel)null);
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
			case VmPackage.LANGUAGE_PRODUCT_LINE__FUNCTIONAL_VARIABILITY:
				return functionalVariability != null;
			case VmPackage.LANGUAGE_PRODUCT_LINE__SEMANTICAL_VARIABILITY:
				return semanticalVariability != null;
		}
		return super.eIsSet(featureID);
	}

} //LanguageProductLineImpl

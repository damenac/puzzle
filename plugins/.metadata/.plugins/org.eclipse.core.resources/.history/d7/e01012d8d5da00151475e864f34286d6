/**
 */
package vm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vm.PAbstractSyntax;
import vm.PLanguageModule;
import vm.PSemantics;
import vm.VmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PLanguage Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vm.impl.PLanguageModuleImpl#getAs <em>As</em>}</li>
 *   <li>{@link vm.impl.PLanguageModuleImpl#getSem <em>Sem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PLanguageModuleImpl extends PNamedElementImpl implements PLanguageModule {
	/**
	 * The cached value of the '{@link #getAs() <em>As</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAs()
	 * @generated
	 * @ordered
	 */
	protected PAbstractSyntax as;

	/**
	 * The cached value of the '{@link #getSem() <em>Sem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSem()
	 * @generated
	 * @ordered
	 */
	protected PSemantics sem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PLanguageModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmPackage.Literals.PLANGUAGE_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PAbstractSyntax getAs() {
		return as;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAs(PAbstractSyntax newAs, NotificationChain msgs) {
		PAbstractSyntax oldAs = as;
		as = newAs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmPackage.PLANGUAGE_MODULE__AS, oldAs, newAs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAs(PAbstractSyntax newAs) {
		if (newAs != as) {
			NotificationChain msgs = null;
			if (as != null)
				msgs = ((InternalEObject)as).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmPackage.PLANGUAGE_MODULE__AS, null, msgs);
			if (newAs != null)
				msgs = ((InternalEObject)newAs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmPackage.PLANGUAGE_MODULE__AS, null, msgs);
			msgs = basicSetAs(newAs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.PLANGUAGE_MODULE__AS, newAs, newAs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSemantics getSem() {
		return sem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSem(PSemantics newSem, NotificationChain msgs) {
		PSemantics oldSem = sem;
		sem = newSem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmPackage.PLANGUAGE_MODULE__SEM, oldSem, newSem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSem(PSemantics newSem) {
		if (newSem != sem) {
			NotificationChain msgs = null;
			if (sem != null)
				msgs = ((InternalEObject)sem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmPackage.PLANGUAGE_MODULE__SEM, null, msgs);
			if (newSem != null)
				msgs = ((InternalEObject)newSem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmPackage.PLANGUAGE_MODULE__SEM, null, msgs);
			msgs = basicSetSem(newSem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.PLANGUAGE_MODULE__SEM, newSem, newSem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VmPackage.PLANGUAGE_MODULE__AS:
				return basicSetAs(null, msgs);
			case VmPackage.PLANGUAGE_MODULE__SEM:
				return basicSetSem(null, msgs);
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
			case VmPackage.PLANGUAGE_MODULE__AS:
				return getAs();
			case VmPackage.PLANGUAGE_MODULE__SEM:
				return getSem();
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
			case VmPackage.PLANGUAGE_MODULE__AS:
				setAs((PAbstractSyntax)newValue);
				return;
			case VmPackage.PLANGUAGE_MODULE__SEM:
				setSem((PSemantics)newValue);
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
			case VmPackage.PLANGUAGE_MODULE__AS:
				setAs((PAbstractSyntax)null);
				return;
			case VmPackage.PLANGUAGE_MODULE__SEM:
				setSem((PSemantics)null);
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
			case VmPackage.PLANGUAGE_MODULE__AS:
				return as != null;
			case VmPackage.PLANGUAGE_MODULE__SEM:
				return sem != null;
		}
		return super.eIsSet(featureID);
	}

} //PLanguageModuleImpl

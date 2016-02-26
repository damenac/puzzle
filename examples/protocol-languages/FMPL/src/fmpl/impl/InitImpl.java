/**
 */
package fmpl.impl;

import fmpl.Automata;
import fmpl.FmplPackage;
import fmpl.Init;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fmpl.impl.InitImpl#getAutomata <em>Automata</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InitImpl extends ExpressionImpl implements Init {
	/**
	 * The cached value of the '{@link #getAutomata() <em>Automata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomata()
	 * @generated
	 * @ordered
	 */
	protected Automata automata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmplPackage.Literals.INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Automata getAutomata() {
		if (automata != null && automata.eIsProxy()) {
			InternalEObject oldAutomata = (InternalEObject)automata;
			automata = (Automata)eResolveProxy(oldAutomata);
			if (automata != oldAutomata) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FmplPackage.INIT__AUTOMATA, oldAutomata, automata));
			}
		}
		return automata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Automata basicGetAutomata() {
		return automata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomata(Automata newAutomata) {
		Automata oldAutomata = automata;
		automata = newAutomata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmplPackage.INIT__AUTOMATA, oldAutomata, automata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FmplPackage.INIT__AUTOMATA:
				if (resolve) return getAutomata();
				return basicGetAutomata();
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
			case FmplPackage.INIT__AUTOMATA:
				setAutomata((Automata)newValue);
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
			case FmplPackage.INIT__AUTOMATA:
				setAutomata((Automata)null);
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
			case FmplPackage.INIT__AUTOMATA:
				return automata != null;
		}
		return super.eIsSet(featureID);
	}

} //InitImpl

/**
 */
package fmpl.impl;

import fmpl.FmplPackage;
import fmpl.VarReference;
import fmpl.Write;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Write</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fmpl.impl.WriteImpl#getInitBit <em>Init Bit</em>}</li>
 *   <li>{@link fmpl.impl.WriteImpl#getLength <em>Length</em>}</li>
 *   <li>{@link fmpl.impl.WriteImpl#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WriteImpl extends ExpressionImpl implements Write {
	/**
	 * The default value of the '{@link #getInitBit() <em>Init Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitBit()
	 * @generated
	 * @ordered
	 */
	protected static final int INIT_BIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitBit() <em>Init Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitBit()
	 * @generated
	 * @ordered
	 */
	protected int initBit = INIT_BIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVar() <em>Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected VarReference var;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmplPackage.Literals.WRITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitBit() {
		return initBit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitBit(int newInitBit) {
		int oldInitBit = initBit;
		initBit = newInitBit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmplPackage.WRITE__INIT_BIT, oldInitBit, initBit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmplPackage.WRITE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarReference getVar() {
		if (var != null && var.eIsProxy()) {
			InternalEObject oldVar = (InternalEObject)var;
			var = (VarReference)eResolveProxy(oldVar);
			if (var != oldVar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FmplPackage.WRITE__VAR, oldVar, var));
			}
		}
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarReference basicGetVar() {
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVar(VarReference newVar) {
		VarReference oldVar = var;
		var = newVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmplPackage.WRITE__VAR, oldVar, var));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FmplPackage.WRITE__INIT_BIT:
				return getInitBit();
			case FmplPackage.WRITE__LENGTH:
				return getLength();
			case FmplPackage.WRITE__VAR:
				if (resolve) return getVar();
				return basicGetVar();
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
			case FmplPackage.WRITE__INIT_BIT:
				setInitBit((Integer)newValue);
				return;
			case FmplPackage.WRITE__LENGTH:
				setLength((Integer)newValue);
				return;
			case FmplPackage.WRITE__VAR:
				setVar((VarReference)newValue);
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
			case FmplPackage.WRITE__INIT_BIT:
				setInitBit(INIT_BIT_EDEFAULT);
				return;
			case FmplPackage.WRITE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case FmplPackage.WRITE__VAR:
				setVar((VarReference)null);
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
			case FmplPackage.WRITE__INIT_BIT:
				return initBit != INIT_BIT_EDEFAULT;
			case FmplPackage.WRITE__LENGTH:
				return length != LENGTH_EDEFAULT;
			case FmplPackage.WRITE__VAR:
				return var != null;
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
		result.append(" (initBit: ");
		result.append(initBit);
		result.append(", length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} //WriteImpl

/**
 */
package flowchartpck.impl;

import flowchartpck.Action;
import flowchartpck.FlowchartpckPackage;
import flowchartpck.Program;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link flowchartpck.impl.ActionImpl#getDoProgram <em>Do Program</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends NodeImpl implements Action {
	/**
	 * The cached value of the '{@link #getDoProgram() <em>Do Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoProgram()
	 * @generated
	 * @ordered
	 */
	protected Program doProgram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowchartpckPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program getDoProgram() {
		return doProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoProgram(Program newDoProgram, NotificationChain msgs) {
		Program oldDoProgram = doProgram;
		doProgram = newDoProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowchartpckPackage.ACTION__DO_PROGRAM, oldDoProgram, newDoProgram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoProgram(Program newDoProgram) {
		if (newDoProgram != doProgram) {
			NotificationChain msgs = null;
			if (doProgram != null)
				msgs = ((InternalEObject)doProgram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowchartpckPackage.ACTION__DO_PROGRAM, null, msgs);
			if (newDoProgram != null)
				msgs = ((InternalEObject)newDoProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowchartpckPackage.ACTION__DO_PROGRAM, null, msgs);
			msgs = basicSetDoProgram(newDoProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowchartpckPackage.ACTION__DO_PROGRAM, newDoProgram, newDoProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowchartpckPackage.ACTION__DO_PROGRAM:
				return basicSetDoProgram(null, msgs);
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
			case FlowchartpckPackage.ACTION__DO_PROGRAM:
				return getDoProgram();
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
			case FlowchartpckPackage.ACTION__DO_PROGRAM:
				setDoProgram((Program)newValue);
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
			case FlowchartpckPackage.ACTION__DO_PROGRAM:
				setDoProgram((Program)null);
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
			case FlowchartpckPackage.ACTION__DO_PROGRAM:
				return doProgram != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionImpl

/**
 */
package Interactions.BasicInteractions.impl;

import Interactions.BasicInteractions.BasicInteractionsPackage;
import Interactions.BasicInteractions.ExecutionSpecification;
import Interactions.BasicInteractions.OccurenceSpecification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Interactions.BasicInteractions.impl.ExecutionSpecificationImpl#getStart <em>Start</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.impl.ExecutionSpecificationImpl#getFinish <em>Finish</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExecutionSpecificationImpl extends InteractionFragmentImpl implements ExecutionSpecification {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected OccurenceSpecification start;

	/**
	 * The cached value of the '{@link #getFinish() <em>Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinish()
	 * @generated
	 * @ordered
	 */
	protected OccurenceSpecification finish;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicInteractionsPackage.Literals.EXECUTION_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurenceSpecification getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (OccurenceSpecification)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicInteractionsPackage.EXECUTION_SPECIFICATION__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurenceSpecification basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(OccurenceSpecification newStart) {
		OccurenceSpecification oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicInteractionsPackage.EXECUTION_SPECIFICATION__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurenceSpecification getFinish() {
		if (finish != null && finish.eIsProxy()) {
			InternalEObject oldFinish = (InternalEObject)finish;
			finish = (OccurenceSpecification)eResolveProxy(oldFinish);
			if (finish != oldFinish) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicInteractionsPackage.EXECUTION_SPECIFICATION__FINISH, oldFinish, finish));
			}
		}
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurenceSpecification basicGetFinish() {
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinish(OccurenceSpecification newFinish) {
		OccurenceSpecification oldFinish = finish;
		finish = newFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicInteractionsPackage.EXECUTION_SPECIFICATION__FINISH, oldFinish, finish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicInteractionsPackage.EXECUTION_SPECIFICATION__START:
				if (resolve) return getStart();
				return basicGetStart();
			case BasicInteractionsPackage.EXECUTION_SPECIFICATION__FINISH:
				if (resolve) return getFinish();
				return basicGetFinish();
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
			case BasicInteractionsPackage.EXECUTION_SPECIFICATION__START:
				setStart((OccurenceSpecification)newValue);
				return;
			case BasicInteractionsPackage.EXECUTION_SPECIFICATION__FINISH:
				setFinish((OccurenceSpecification)newValue);
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
			case BasicInteractionsPackage.EXECUTION_SPECIFICATION__START:
				setStart((OccurenceSpecification)null);
				return;
			case BasicInteractionsPackage.EXECUTION_SPECIFICATION__FINISH:
				setFinish((OccurenceSpecification)null);
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
			case BasicInteractionsPackage.EXECUTION_SPECIFICATION__START:
				return start != null;
			case BasicInteractionsPackage.EXECUTION_SPECIFICATION__FINISH:
				return finish != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutionSpecificationImpl

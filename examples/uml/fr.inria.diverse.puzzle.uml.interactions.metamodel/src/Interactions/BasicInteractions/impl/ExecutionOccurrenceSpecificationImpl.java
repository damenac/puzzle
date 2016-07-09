/**
 */
package Interactions.BasicInteractions.impl;

import Interactions.BasicInteractions.BasicInteractionsPackage;
import Interactions.BasicInteractions.ExecutionOccurrenceSpecification;
import Interactions.BasicInteractions.ExecutionSpecification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Interactions.BasicInteractions.impl.ExecutionOccurrenceSpecificationImpl#getExecution <em>Execution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionOccurrenceSpecificationImpl extends OccurenceSpecificationImpl implements ExecutionOccurrenceSpecification {
	/**
	 * The cached value of the '{@link #getExecution() <em>Execution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution()
	 * @generated
	 * @ordered
	 */
	protected ExecutionSpecification execution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionOccurrenceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicInteractionsPackage.Literals.EXECUTION_OCCURRENCE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionSpecification getExecution() {
		if (execution != null && execution.eIsProxy()) {
			InternalEObject oldExecution = (InternalEObject)execution;
			execution = (ExecutionSpecification)eResolveProxy(oldExecution);
			if (execution != oldExecution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicInteractionsPackage.EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION, oldExecution, execution));
			}
		}
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionSpecification basicGetExecution() {
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecution(ExecutionSpecification newExecution) {
		ExecutionSpecification oldExecution = execution;
		execution = newExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicInteractionsPackage.EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION, oldExecution, execution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicInteractionsPackage.EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION:
				if (resolve) return getExecution();
				return basicGetExecution();
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
			case BasicInteractionsPackage.EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION:
				setExecution((ExecutionSpecification)newValue);
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
			case BasicInteractionsPackage.EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION:
				setExecution((ExecutionSpecification)null);
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
			case BasicInteractionsPackage.EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION:
				return execution != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutionOccurrenceSpecificationImpl

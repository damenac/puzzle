/**
 */
package fsm.impl;

import fsm.Conditional;
import fsm.Expression;
import fsm.FsmPackage;
import fsm.Program;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fsm.impl.ConditionalImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link fsm.impl.ConditionalImpl#getThenInstructions <em>Then Instructions</em>}</li>
 *   <li>{@link fsm.impl.ConditionalImpl#getElseInstructions <em>Else Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalImpl extends StatementImpl implements Conditional {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getThenInstructions() <em>Then Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenInstructions()
	 * @generated
	 * @ordered
	 */
	protected Program thenInstructions;

	/**
	 * The cached value of the '{@link #getElseInstructions() <em>Else Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseInstructions()
	 * @generated
	 * @ordered
	 */
	protected Program elseInstructions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmPackage.Literals.CONDITIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FsmPackage.CONDITIONAL__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FsmPackage.CONDITIONAL__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FsmPackage.CONDITIONAL__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.CONDITIONAL__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program getThenInstructions() {
		return thenInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThenInstructions(Program newThenInstructions, NotificationChain msgs) {
		Program oldThenInstructions = thenInstructions;
		thenInstructions = newThenInstructions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FsmPackage.CONDITIONAL__THEN_INSTRUCTIONS, oldThenInstructions, newThenInstructions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenInstructions(Program newThenInstructions) {
		if (newThenInstructions != thenInstructions) {
			NotificationChain msgs = null;
			if (thenInstructions != null)
				msgs = ((InternalEObject)thenInstructions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FsmPackage.CONDITIONAL__THEN_INSTRUCTIONS, null, msgs);
			if (newThenInstructions != null)
				msgs = ((InternalEObject)newThenInstructions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FsmPackage.CONDITIONAL__THEN_INSTRUCTIONS, null, msgs);
			msgs = basicSetThenInstructions(newThenInstructions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.CONDITIONAL__THEN_INSTRUCTIONS, newThenInstructions, newThenInstructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program getElseInstructions() {
		return elseInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseInstructions(Program newElseInstructions, NotificationChain msgs) {
		Program oldElseInstructions = elseInstructions;
		elseInstructions = newElseInstructions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FsmPackage.CONDITIONAL__ELSE_INSTRUCTIONS, oldElseInstructions, newElseInstructions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseInstructions(Program newElseInstructions) {
		if (newElseInstructions != elseInstructions) {
			NotificationChain msgs = null;
			if (elseInstructions != null)
				msgs = ((InternalEObject)elseInstructions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FsmPackage.CONDITIONAL__ELSE_INSTRUCTIONS, null, msgs);
			if (newElseInstructions != null)
				msgs = ((InternalEObject)newElseInstructions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FsmPackage.CONDITIONAL__ELSE_INSTRUCTIONS, null, msgs);
			msgs = basicSetElseInstructions(newElseInstructions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.CONDITIONAL__ELSE_INSTRUCTIONS, newElseInstructions, newElseInstructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FsmPackage.CONDITIONAL__CONDITION:
				return basicSetCondition(null, msgs);
			case FsmPackage.CONDITIONAL__THEN_INSTRUCTIONS:
				return basicSetThenInstructions(null, msgs);
			case FsmPackage.CONDITIONAL__ELSE_INSTRUCTIONS:
				return basicSetElseInstructions(null, msgs);
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
			case FsmPackage.CONDITIONAL__CONDITION:
				return getCondition();
			case FsmPackage.CONDITIONAL__THEN_INSTRUCTIONS:
				return getThenInstructions();
			case FsmPackage.CONDITIONAL__ELSE_INSTRUCTIONS:
				return getElseInstructions();
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
			case FsmPackage.CONDITIONAL__CONDITION:
				setCondition((Expression)newValue);
				return;
			case FsmPackage.CONDITIONAL__THEN_INSTRUCTIONS:
				setThenInstructions((Program)newValue);
				return;
			case FsmPackage.CONDITIONAL__ELSE_INSTRUCTIONS:
				setElseInstructions((Program)newValue);
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
			case FsmPackage.CONDITIONAL__CONDITION:
				setCondition((Expression)null);
				return;
			case FsmPackage.CONDITIONAL__THEN_INSTRUCTIONS:
				setThenInstructions((Program)null);
				return;
			case FsmPackage.CONDITIONAL__ELSE_INSTRUCTIONS:
				setElseInstructions((Program)null);
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
			case FsmPackage.CONDITIONAL__CONDITION:
				return condition != null;
			case FsmPackage.CONDITIONAL__THEN_INSTRUCTIONS:
				return thenInstructions != null;
			case FsmPackage.CONDITIONAL__ELSE_INSTRUCTIONS:
				return elseInstructions != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalImpl

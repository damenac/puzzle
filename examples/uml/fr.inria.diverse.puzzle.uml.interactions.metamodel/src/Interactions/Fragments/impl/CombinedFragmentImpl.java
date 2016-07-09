/**
 */
package Interactions.Fragments.impl;

import Interactions.Fragments.CombinedFragment;
import Interactions.Fragments.FragmentsPackage;
import Interactions.Fragments.Gate;
import Interactions.Fragments.InteractionOperand;
import Interactions.Fragments.InteractionOperandKind;

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
 * An implementation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Interactions.Fragments.impl.CombinedFragmentImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link Interactions.Fragments.impl.CombinedFragmentImpl#getInteractionOperator <em>Interaction Operator</em>}</li>
 *   <li>{@link Interactions.Fragments.impl.CombinedFragmentImpl#getCfragmentGate <em>Cfragment Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CombinedFragmentImpl extends MinimalEObjectImpl.Container implements CombinedFragment {
	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected InteractionOperand operand;

	/**
	 * The default value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionOperator()
	 * @generated
	 * @ordered
	 */
	protected static final InteractionOperandKind INTERACTION_OPERATOR_EDEFAULT = InteractionOperandKind.SEQ;

	/**
	 * The cached value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionOperator()
	 * @generated
	 * @ordered
	 */
	protected InteractionOperandKind interactionOperator = INTERACTION_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCfragmentGate() <em>Cfragment Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfragmentGate()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> cfragmentGate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FragmentsPackage.Literals.COMBINED_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getOperand() {
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperand(InteractionOperand newOperand, NotificationChain msgs) {
		InteractionOperand oldOperand = operand;
		operand = newOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FragmentsPackage.COMBINED_FRAGMENT__OPERAND, oldOperand, newOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand(InteractionOperand newOperand) {
		if (newOperand != operand) {
			NotificationChain msgs = null;
			if (operand != null)
				msgs = ((InternalEObject)operand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FragmentsPackage.COMBINED_FRAGMENT__OPERAND, null, msgs);
			if (newOperand != null)
				msgs = ((InternalEObject)newOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FragmentsPackage.COMBINED_FRAGMENT__OPERAND, null, msgs);
			msgs = basicSetOperand(newOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FragmentsPackage.COMBINED_FRAGMENT__OPERAND, newOperand, newOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperandKind getInteractionOperator() {
		return interactionOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionOperator(InteractionOperandKind newInteractionOperator) {
		InteractionOperandKind oldInteractionOperator = interactionOperator;
		interactionOperator = newInteractionOperator == null ? INTERACTION_OPERATOR_EDEFAULT : newInteractionOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FragmentsPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR, oldInteractionOperator, interactionOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getCfragmentGate() {
		if (cfragmentGate == null) {
			cfragmentGate = new EObjectContainmentEList<Gate>(Gate.class, this, FragmentsPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE);
		}
		return cfragmentGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FragmentsPackage.COMBINED_FRAGMENT__OPERAND:
				return basicSetOperand(null, msgs);
			case FragmentsPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				return ((InternalEList<?>)getCfragmentGate()).basicRemove(otherEnd, msgs);
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
			case FragmentsPackage.COMBINED_FRAGMENT__OPERAND:
				return getOperand();
			case FragmentsPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				return getInteractionOperator();
			case FragmentsPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				return getCfragmentGate();
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
			case FragmentsPackage.COMBINED_FRAGMENT__OPERAND:
				setOperand((InteractionOperand)newValue);
				return;
			case FragmentsPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				setInteractionOperator((InteractionOperandKind)newValue);
				return;
			case FragmentsPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				getCfragmentGate().clear();
				getCfragmentGate().addAll((Collection<? extends Gate>)newValue);
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
			case FragmentsPackage.COMBINED_FRAGMENT__OPERAND:
				setOperand((InteractionOperand)null);
				return;
			case FragmentsPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				setInteractionOperator(INTERACTION_OPERATOR_EDEFAULT);
				return;
			case FragmentsPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				getCfragmentGate().clear();
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
			case FragmentsPackage.COMBINED_FRAGMENT__OPERAND:
				return operand != null;
			case FragmentsPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				return interactionOperator != INTERACTION_OPERATOR_EDEFAULT;
			case FragmentsPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				return cfragmentGate != null && !cfragmentGate.isEmpty();
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
		result.append(" (interactionOperator: ");
		result.append(interactionOperator);
		result.append(')');
		return result.toString();
	}

} //CombinedFragmentImpl

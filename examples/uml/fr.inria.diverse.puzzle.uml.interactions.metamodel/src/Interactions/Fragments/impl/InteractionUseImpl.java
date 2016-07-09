/**
 */
package Interactions.Fragments.impl;

import Interactions.BasicInteractions.Interaction;
import Interactions.BasicInteractions.ValueSpecification;

import Interactions.BasicInteractions.impl.InteractionFragmentImpl;

import Interactions.Fragments.FragmentsPackage;
import Interactions.Fragments.Gate;
import Interactions.Fragments.InteractionUse;
import Interactions.Fragments.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Interactions.Fragments.impl.InteractionUseImpl#getActualGate <em>Actual Gate</em>}</li>
 *   <li>{@link Interactions.Fragments.impl.InteractionUseImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link Interactions.Fragments.impl.InteractionUseImpl#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link Interactions.Fragments.impl.InteractionUseImpl#getReturnValueRecipient <em>Return Value Recipient</em>}</li>
 *   <li>{@link Interactions.Fragments.impl.InteractionUseImpl#getRefersTo <em>Refers To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionUseImpl extends InteractionFragmentImpl implements InteractionUse {
	/**
	 * The cached value of the '{@link #getActualGate() <em>Actual Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualGate()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> actualGate;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSpecification> argument;

	/**
	 * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification returnValue;

	/**
	 * The cached value of the '{@link #getReturnValueRecipient() <em>Return Value Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValueRecipient()
	 * @generated
	 * @ordered
	 */
	protected Property returnValueRecipient;

	/**
	 * The cached value of the '{@link #getRefersTo() <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo()
	 * @generated
	 * @ordered
	 */
	protected Interaction refersTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FragmentsPackage.Literals.INTERACTION_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getActualGate() {
		if (actualGate == null) {
			actualGate = new EObjectContainmentEList<Gate>(Gate.class, this, FragmentsPackage.INTERACTION_USE__ACTUAL_GATE);
		}
		return actualGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList<ValueSpecification>(ValueSpecification.class, this, FragmentsPackage.INTERACTION_USE__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getReturnValue() {
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnValue(ValueSpecification newReturnValue, NotificationChain msgs) {
		ValueSpecification oldReturnValue = returnValue;
		returnValue = newReturnValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FragmentsPackage.INTERACTION_USE__RETURN_VALUE, oldReturnValue, newReturnValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnValue(ValueSpecification newReturnValue) {
		if (newReturnValue != returnValue) {
			NotificationChain msgs = null;
			if (returnValue != null)
				msgs = ((InternalEObject)returnValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FragmentsPackage.INTERACTION_USE__RETURN_VALUE, null, msgs);
			if (newReturnValue != null)
				msgs = ((InternalEObject)newReturnValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FragmentsPackage.INTERACTION_USE__RETURN_VALUE, null, msgs);
			msgs = basicSetReturnValue(newReturnValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FragmentsPackage.INTERACTION_USE__RETURN_VALUE, newReturnValue, newReturnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getReturnValueRecipient() {
		if (returnValueRecipient != null && returnValueRecipient.eIsProxy()) {
			InternalEObject oldReturnValueRecipient = (InternalEObject)returnValueRecipient;
			returnValueRecipient = (Property)eResolveProxy(oldReturnValueRecipient);
			if (returnValueRecipient != oldReturnValueRecipient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FragmentsPackage.INTERACTION_USE__RETURN_VALUE_RECIPIENT, oldReturnValueRecipient, returnValueRecipient));
			}
		}
		return returnValueRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetReturnValueRecipient() {
		return returnValueRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnValueRecipient(Property newReturnValueRecipient) {
		Property oldReturnValueRecipient = returnValueRecipient;
		returnValueRecipient = newReturnValueRecipient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FragmentsPackage.INTERACTION_USE__RETURN_VALUE_RECIPIENT, oldReturnValueRecipient, returnValueRecipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getRefersTo() {
		if (refersTo != null && refersTo.eIsProxy()) {
			InternalEObject oldRefersTo = (InternalEObject)refersTo;
			refersTo = (Interaction)eResolveProxy(oldRefersTo);
			if (refersTo != oldRefersTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FragmentsPackage.INTERACTION_USE__REFERS_TO, oldRefersTo, refersTo));
			}
		}
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction basicGetRefersTo() {
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersTo(Interaction newRefersTo) {
		Interaction oldRefersTo = refersTo;
		refersTo = newRefersTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FragmentsPackage.INTERACTION_USE__REFERS_TO, oldRefersTo, refersTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FragmentsPackage.INTERACTION_USE__ACTUAL_GATE:
				return ((InternalEList<?>)getActualGate()).basicRemove(otherEnd, msgs);
			case FragmentsPackage.INTERACTION_USE__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
			case FragmentsPackage.INTERACTION_USE__RETURN_VALUE:
				return basicSetReturnValue(null, msgs);
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
			case FragmentsPackage.INTERACTION_USE__ACTUAL_GATE:
				return getActualGate();
			case FragmentsPackage.INTERACTION_USE__ARGUMENT:
				return getArgument();
			case FragmentsPackage.INTERACTION_USE__RETURN_VALUE:
				return getReturnValue();
			case FragmentsPackage.INTERACTION_USE__RETURN_VALUE_RECIPIENT:
				if (resolve) return getReturnValueRecipient();
				return basicGetReturnValueRecipient();
			case FragmentsPackage.INTERACTION_USE__REFERS_TO:
				if (resolve) return getRefersTo();
				return basicGetRefersTo();
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
			case FragmentsPackage.INTERACTION_USE__ACTUAL_GATE:
				getActualGate().clear();
				getActualGate().addAll((Collection<? extends Gate>)newValue);
				return;
			case FragmentsPackage.INTERACTION_USE__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case FragmentsPackage.INTERACTION_USE__RETURN_VALUE:
				setReturnValue((ValueSpecification)newValue);
				return;
			case FragmentsPackage.INTERACTION_USE__RETURN_VALUE_RECIPIENT:
				setReturnValueRecipient((Property)newValue);
				return;
			case FragmentsPackage.INTERACTION_USE__REFERS_TO:
				setRefersTo((Interaction)newValue);
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
			case FragmentsPackage.INTERACTION_USE__ACTUAL_GATE:
				getActualGate().clear();
				return;
			case FragmentsPackage.INTERACTION_USE__ARGUMENT:
				getArgument().clear();
				return;
			case FragmentsPackage.INTERACTION_USE__RETURN_VALUE:
				setReturnValue((ValueSpecification)null);
				return;
			case FragmentsPackage.INTERACTION_USE__RETURN_VALUE_RECIPIENT:
				setReturnValueRecipient((Property)null);
				return;
			case FragmentsPackage.INTERACTION_USE__REFERS_TO:
				setRefersTo((Interaction)null);
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
			case FragmentsPackage.INTERACTION_USE__ACTUAL_GATE:
				return actualGate != null && !actualGate.isEmpty();
			case FragmentsPackage.INTERACTION_USE__ARGUMENT:
				return argument != null && !argument.isEmpty();
			case FragmentsPackage.INTERACTION_USE__RETURN_VALUE:
				return returnValue != null;
			case FragmentsPackage.INTERACTION_USE__RETURN_VALUE_RECIPIENT:
				return returnValueRecipient != null;
			case FragmentsPackage.INTERACTION_USE__REFERS_TO:
				return refersTo != null;
		}
		return super.eIsSet(featureID);
	}

} //InteractionUseImpl

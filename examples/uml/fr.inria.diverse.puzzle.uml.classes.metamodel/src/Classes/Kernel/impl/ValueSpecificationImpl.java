/**
 */
package Classes.Kernel.impl;

import Classes.Kernel.Constraint;
import Classes.Kernel.InstanceSpecification;
import Classes.Kernel.KernelPackage;
import Classes.Kernel.MultiplicityElement;
import Classes.Kernel.Slot;
import Classes.Kernel.ValueSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Kernel.impl.ValueSpecificationImpl#getOwningUpper <em>Owning Upper</em>}</li>
 *   <li>{@link Classes.Kernel.impl.ValueSpecificationImpl#getOwningLower <em>Owning Lower</em>}</li>
 *   <li>{@link Classes.Kernel.impl.ValueSpecificationImpl#getOwningConstraint <em>Owning Constraint</em>}</li>
 *   <li>{@link Classes.Kernel.impl.ValueSpecificationImpl#getOwningSlot <em>Owning Slot</em>}</li>
 *   <li>{@link Classes.Kernel.impl.ValueSpecificationImpl#getOwningInstanceSpec <em>Owning Instance Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ValueSpecificationImpl extends TypedElementImpl implements ValueSpecification {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.VALUE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityElement getOwningUpper() {
		if (eContainerFeatureID() != KernelPackage.VALUE_SPECIFICATION__OWNING_UPPER) return null;
		return (MultiplicityElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningUpper(MultiplicityElement newOwningUpper, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningUpper, KernelPackage.VALUE_SPECIFICATION__OWNING_UPPER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningUpper(MultiplicityElement newOwningUpper) {
		if (newOwningUpper != eInternalContainer() || (eContainerFeatureID() != KernelPackage.VALUE_SPECIFICATION__OWNING_UPPER && newOwningUpper != null)) {
			if (EcoreUtil.isAncestor(this, newOwningUpper))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningUpper != null)
				msgs = ((InternalEObject)newOwningUpper).eInverseAdd(this, KernelPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE, MultiplicityElement.class, msgs);
			msgs = basicSetOwningUpper(newOwningUpper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.VALUE_SPECIFICATION__OWNING_UPPER, newOwningUpper, newOwningUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityElement getOwningLower() {
		if (eContainerFeatureID() != KernelPackage.VALUE_SPECIFICATION__OWNING_LOWER) return null;
		return (MultiplicityElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningLower(MultiplicityElement newOwningLower, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningLower, KernelPackage.VALUE_SPECIFICATION__OWNING_LOWER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningLower(MultiplicityElement newOwningLower) {
		if (newOwningLower != eInternalContainer() || (eContainerFeatureID() != KernelPackage.VALUE_SPECIFICATION__OWNING_LOWER && newOwningLower != null)) {
			if (EcoreUtil.isAncestor(this, newOwningLower))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningLower != null)
				msgs = ((InternalEObject)newOwningLower).eInverseAdd(this, KernelPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE, MultiplicityElement.class, msgs);
			msgs = basicSetOwningLower(newOwningLower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.VALUE_SPECIFICATION__OWNING_LOWER, newOwningLower, newOwningLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getOwningConstraint() {
		if (eContainerFeatureID() != KernelPackage.VALUE_SPECIFICATION__OWNING_CONSTRAINT) return null;
		return (Constraint)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningConstraint(Constraint newOwningConstraint, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningConstraint, KernelPackage.VALUE_SPECIFICATION__OWNING_CONSTRAINT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningConstraint(Constraint newOwningConstraint) {
		if (newOwningConstraint != eInternalContainer() || (eContainerFeatureID() != KernelPackage.VALUE_SPECIFICATION__OWNING_CONSTRAINT && newOwningConstraint != null)) {
			if (EcoreUtil.isAncestor(this, newOwningConstraint))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningConstraint != null)
				msgs = ((InternalEObject)newOwningConstraint).eInverseAdd(this, KernelPackage.CONSTRAINT__SPECIFICATION, Constraint.class, msgs);
			msgs = basicSetOwningConstraint(newOwningConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.VALUE_SPECIFICATION__OWNING_CONSTRAINT, newOwningConstraint, newOwningConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot getOwningSlot() {
		if (eContainerFeatureID() != KernelPackage.VALUE_SPECIFICATION__OWNING_SLOT) return null;
		return (Slot)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningSlot(Slot newOwningSlot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningSlot, KernelPackage.VALUE_SPECIFICATION__OWNING_SLOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningSlot(Slot newOwningSlot) {
		if (newOwningSlot != eInternalContainer() || (eContainerFeatureID() != KernelPackage.VALUE_SPECIFICATION__OWNING_SLOT && newOwningSlot != null)) {
			if (EcoreUtil.isAncestor(this, newOwningSlot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningSlot != null)
				msgs = ((InternalEObject)newOwningSlot).eInverseAdd(this, KernelPackage.SLOT__VALUE, Slot.class, msgs);
			msgs = basicSetOwningSlot(newOwningSlot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.VALUE_SPECIFICATION__OWNING_SLOT, newOwningSlot, newOwningSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification getOwningInstanceSpec() {
		if (eContainerFeatureID() != KernelPackage.VALUE_SPECIFICATION__OWNING_INSTANCE_SPEC) return null;
		return (InstanceSpecification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningInstanceSpec(InstanceSpecification newOwningInstanceSpec, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningInstanceSpec, KernelPackage.VALUE_SPECIFICATION__OWNING_INSTANCE_SPEC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningInstanceSpec(InstanceSpecification newOwningInstanceSpec) {
		if (newOwningInstanceSpec != eInternalContainer() || (eContainerFeatureID() != KernelPackage.VALUE_SPECIFICATION__OWNING_INSTANCE_SPEC && newOwningInstanceSpec != null)) {
			if (EcoreUtil.isAncestor(this, newOwningInstanceSpec))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningInstanceSpec != null)
				msgs = ((InternalEObject)newOwningInstanceSpec).eInverseAdd(this, KernelPackage.INSTANCE_SPECIFICATION__SPECIFICATION, InstanceSpecification.class, msgs);
			msgs = basicSetOwningInstanceSpec(newOwningInstanceSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.VALUE_SPECIFICATION__OWNING_INSTANCE_SPEC, newOwningInstanceSpec, newOwningInstanceSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KernelPackage.VALUE_SPECIFICATION__OWNING_UPPER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningUpper((MultiplicityElement)otherEnd, msgs);
			case KernelPackage.VALUE_SPECIFICATION__OWNING_LOWER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningLower((MultiplicityElement)otherEnd, msgs);
			case KernelPackage.VALUE_SPECIFICATION__OWNING_CONSTRAINT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningConstraint((Constraint)otherEnd, msgs);
			case KernelPackage.VALUE_SPECIFICATION__OWNING_SLOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningSlot((Slot)otherEnd, msgs);
			case KernelPackage.VALUE_SPECIFICATION__OWNING_INSTANCE_SPEC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningInstanceSpec((InstanceSpecification)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KernelPackage.VALUE_SPECIFICATION__OWNING_UPPER:
				return basicSetOwningUpper(null, msgs);
			case KernelPackage.VALUE_SPECIFICATION__OWNING_LOWER:
				return basicSetOwningLower(null, msgs);
			case KernelPackage.VALUE_SPECIFICATION__OWNING_CONSTRAINT:
				return basicSetOwningConstraint(null, msgs);
			case KernelPackage.VALUE_SPECIFICATION__OWNING_SLOT:
				return basicSetOwningSlot(null, msgs);
			case KernelPackage.VALUE_SPECIFICATION__OWNING_INSTANCE_SPEC:
				return basicSetOwningInstanceSpec(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case KernelPackage.VALUE_SPECIFICATION__OWNING_UPPER:
				return eInternalContainer().eInverseRemove(this, KernelPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE, MultiplicityElement.class, msgs);
			case KernelPackage.VALUE_SPECIFICATION__OWNING_LOWER:
				return eInternalContainer().eInverseRemove(this, KernelPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE, MultiplicityElement.class, msgs);
			case KernelPackage.VALUE_SPECIFICATION__OWNING_CONSTRAINT:
				return eInternalContainer().eInverseRemove(this, KernelPackage.CONSTRAINT__SPECIFICATION, Constraint.class, msgs);
			case KernelPackage.VALUE_SPECIFICATION__OWNING_SLOT:
				return eInternalContainer().eInverseRemove(this, KernelPackage.SLOT__VALUE, Slot.class, msgs);
			case KernelPackage.VALUE_SPECIFICATION__OWNING_INSTANCE_SPEC:
				return eInternalContainer().eInverseRemove(this, KernelPackage.INSTANCE_SPECIFICATION__SPECIFICATION, InstanceSpecification.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KernelPackage.VALUE_SPECIFICATION__OWNING_UPPER:
				return getOwningUpper();
			case KernelPackage.VALUE_SPECIFICATION__OWNING_LOWER:
				return getOwningLower();
			case KernelPackage.VALUE_SPECIFICATION__OWNING_CONSTRAINT:
				return getOwningConstraint();
			case KernelPackage.VALUE_SPECIFICATION__OWNING_SLOT:
				return getOwningSlot();
			case KernelPackage.VALUE_SPECIFICATION__OWNING_INSTANCE_SPEC:
				return getOwningInstanceSpec();
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
			case KernelPackage.VALUE_SPECIFICATION__OWNING_UPPER:
				setOwningUpper((MultiplicityElement)newValue);
				return;
			case KernelPackage.VALUE_SPECIFICATION__OWNING_LOWER:
				setOwningLower((MultiplicityElement)newValue);
				return;
			case KernelPackage.VALUE_SPECIFICATION__OWNING_CONSTRAINT:
				setOwningConstraint((Constraint)newValue);
				return;
			case KernelPackage.VALUE_SPECIFICATION__OWNING_SLOT:
				setOwningSlot((Slot)newValue);
				return;
			case KernelPackage.VALUE_SPECIFICATION__OWNING_INSTANCE_SPEC:
				setOwningInstanceSpec((InstanceSpecification)newValue);
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
			case KernelPackage.VALUE_SPECIFICATION__OWNING_UPPER:
				setOwningUpper((MultiplicityElement)null);
				return;
			case KernelPackage.VALUE_SPECIFICATION__OWNING_LOWER:
				setOwningLower((MultiplicityElement)null);
				return;
			case KernelPackage.VALUE_SPECIFICATION__OWNING_CONSTRAINT:
				setOwningConstraint((Constraint)null);
				return;
			case KernelPackage.VALUE_SPECIFICATION__OWNING_SLOT:
				setOwningSlot((Slot)null);
				return;
			case KernelPackage.VALUE_SPECIFICATION__OWNING_INSTANCE_SPEC:
				setOwningInstanceSpec((InstanceSpecification)null);
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
			case KernelPackage.VALUE_SPECIFICATION__OWNING_UPPER:
				return getOwningUpper() != null;
			case KernelPackage.VALUE_SPECIFICATION__OWNING_LOWER:
				return getOwningLower() != null;
			case KernelPackage.VALUE_SPECIFICATION__OWNING_CONSTRAINT:
				return getOwningConstraint() != null;
			case KernelPackage.VALUE_SPECIFICATION__OWNING_SLOT:
				return getOwningSlot() != null;
			case KernelPackage.VALUE_SPECIFICATION__OWNING_INSTANCE_SPEC:
				return getOwningInstanceSpec() != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueSpecificationImpl

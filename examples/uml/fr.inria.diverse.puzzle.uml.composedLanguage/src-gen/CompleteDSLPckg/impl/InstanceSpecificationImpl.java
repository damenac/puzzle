/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.Classifier;
import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.InstanceSpecification;
import CompleteDSLPckg.Slot;
import CompleteDSLPckg.ValueSpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompleteDSLPckg.impl.InstanceSpecificationImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.InstanceSpecificationImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.InstanceSpecificationImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceSpecificationImpl extends PackageableElementImpl implements InstanceSpecification {
	/**
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<Slot> slot;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification specification;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> classifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteDSLPckgPackage.eINSTANCE.getInstanceSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slot> getSlot() {
		if (slot == null) {
			slot = new EObjectContainmentWithInverseEList<Slot>(Slot.class, this, CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__SLOT, CompleteDSLPckgPackage.SLOT__OWNING_INSTACE);
		}
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(ValueSpecification newSpecification, NotificationChain msgs) {
		ValueSpecification oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__SPECIFICATION, oldSpecification, newSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(ValueSpecification newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, CompleteDSLPckgPackage.VALUE_SPECIFICATION__OWNING_INSTANCE_SPEC, ValueSpecification.class, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, CompleteDSLPckgPackage.VALUE_SPECIFICATION__OWNING_INSTANCE_SPEC, ValueSpecification.class, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getClassifier() {
		if (classifier == null) {
			classifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__CLASSIFIER);
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__SLOT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSlot()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__SPECIFICATION:
				if (specification != null)
					msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__SPECIFICATION, null, msgs);
				return basicSetSpecification((ValueSpecification)otherEnd, msgs);
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
			case CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__SLOT:
				return ((InternalEList<?>)getSlot()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__SPECIFICATION:
				return basicSetSpecification(null, msgs);
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
			case CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__SLOT:
				return getSlot();
			case CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__SPECIFICATION:
				return getSpecification();
			case CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__CLASSIFIER:
				return getClassifier();
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
			case CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__SLOT:
				getSlot().clear();
				getSlot().addAll((Collection<? extends Slot>)newValue);
				return;
			case CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__SPECIFICATION:
				setSpecification((ValueSpecification)newValue);
				return;
			case CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__CLASSIFIER:
				getClassifier().clear();
				getClassifier().addAll((Collection<? extends Classifier>)newValue);
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
			case CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__SLOT:
				getSlot().clear();
				return;
			case CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__SPECIFICATION:
				setSpecification((ValueSpecification)null);
				return;
			case CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__CLASSIFIER:
				getClassifier().clear();
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
			case CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__SLOT:
				return slot != null && !slot.isEmpty();
			case CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__SPECIFICATION:
				return specification != null;
			case CompleteDSLPckgPackage.INSTANCE_SPECIFICATION__CLASSIFIER:
				return classifier != null && !classifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstanceSpecificationImpl

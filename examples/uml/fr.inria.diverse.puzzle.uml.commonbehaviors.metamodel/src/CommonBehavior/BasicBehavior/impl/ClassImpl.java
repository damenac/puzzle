/**
 */
package CommonBehavior.BasicBehavior.impl;

import CommonBehavior.BasicBehavior.BasicBehaviorPackage;
import CommonBehavior.BasicBehavior.Behavior;
import CommonBehavior.BasicBehavior.BehavioredClassifier;

import CommonBehavior.Communications.Reception;

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
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CommonBehavior.BasicBehavior.impl.ClassImpl#getOwnedBehavior <em>Owned Behavior</em>}</li>
 *   <li>{@link CommonBehavior.BasicBehavior.impl.ClassImpl#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link CommonBehavior.BasicBehavior.impl.ClassImpl#getOwnedReception <em>Owned Reception</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassImpl extends ClassifierImpl implements CommonBehavior.BasicBehavior.Class {
	/**
	 * The cached value of the '{@link #getOwnedBehavior() <em>Owned Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> ownedBehavior;

	/**
	 * The cached value of the '{@link #getClassifierBehavior() <em>Classifier Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior classifierBehavior;

	/**
	 * The cached value of the '{@link #getOwnedReception() <em>Owned Reception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedReception()
	 * @generated
	 * @ordered
	 */
	protected EList<Reception> ownedReception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicBehaviorPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getOwnedBehavior() {
		if (ownedBehavior == null) {
			ownedBehavior = new EObjectContainmentEList<Behavior>(Behavior.class, this, BasicBehaviorPackage.CLASS__OWNED_BEHAVIOR);
		}
		return ownedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getClassifierBehavior() {
		if (classifierBehavior != null && classifierBehavior.eIsProxy()) {
			InternalEObject oldClassifierBehavior = (InternalEObject)classifierBehavior;
			classifierBehavior = (Behavior)eResolveProxy(oldClassifierBehavior);
			if (classifierBehavior != oldClassifierBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicBehaviorPackage.CLASS__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
			}
		}
		return classifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetClassifierBehavior() {
		return classifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierBehavior(Behavior newClassifierBehavior) {
		Behavior oldClassifierBehavior = classifierBehavior;
		classifierBehavior = newClassifierBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicBehaviorPackage.CLASS__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reception> getOwnedReception() {
		if (ownedReception == null) {
			ownedReception = new EObjectContainmentEList<Reception>(Reception.class, this, BasicBehaviorPackage.CLASS__OWNED_RECEPTION);
		}
		return ownedReception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicBehaviorPackage.CLASS__OWNED_BEHAVIOR:
				return ((InternalEList<?>)getOwnedBehavior()).basicRemove(otherEnd, msgs);
			case BasicBehaviorPackage.CLASS__OWNED_RECEPTION:
				return ((InternalEList<?>)getOwnedReception()).basicRemove(otherEnd, msgs);
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
			case BasicBehaviorPackage.CLASS__OWNED_BEHAVIOR:
				return getOwnedBehavior();
			case BasicBehaviorPackage.CLASS__CLASSIFIER_BEHAVIOR:
				if (resolve) return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case BasicBehaviorPackage.CLASS__OWNED_RECEPTION:
				return getOwnedReception();
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
			case BasicBehaviorPackage.CLASS__OWNED_BEHAVIOR:
				getOwnedBehavior().clear();
				getOwnedBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case BasicBehaviorPackage.CLASS__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case BasicBehaviorPackage.CLASS__OWNED_RECEPTION:
				getOwnedReception().clear();
				getOwnedReception().addAll((Collection<? extends Reception>)newValue);
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
			case BasicBehaviorPackage.CLASS__OWNED_BEHAVIOR:
				getOwnedBehavior().clear();
				return;
			case BasicBehaviorPackage.CLASS__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case BasicBehaviorPackage.CLASS__OWNED_RECEPTION:
				getOwnedReception().clear();
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
			case BasicBehaviorPackage.CLASS__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case BasicBehaviorPackage.CLASS__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case BasicBehaviorPackage.CLASS__OWNED_RECEPTION:
				return ownedReception != null && !ownedReception.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BehavioredClassifier.class) {
			switch (derivedFeatureID) {
				case BasicBehaviorPackage.CLASS__OWNED_BEHAVIOR: return BasicBehaviorPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;
				case BasicBehaviorPackage.CLASS__CLASSIFIER_BEHAVIOR: return BasicBehaviorPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BehavioredClassifier.class) {
			switch (baseFeatureID) {
				case BasicBehaviorPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR: return BasicBehaviorPackage.CLASS__OWNED_BEHAVIOR;
				case BasicBehaviorPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR: return BasicBehaviorPackage.CLASS__CLASSIFIER_BEHAVIOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ClassImpl

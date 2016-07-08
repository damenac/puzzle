/**
 */
package Classes.impl;

import Classes.ClassesPackage;
import Classes.Classifier;
import Classes.Substitution;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.SubstitutionImpl#getSubstitutingClassifier <em>Substituting Classifier</em>}</li>
 *   <li>{@link Classes.impl.SubstitutionImpl#getContract <em>Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstitutionImpl extends RealizationImpl implements Substitution {
	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected Classifier contract;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.SUBSTITUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSubstitutingClassifier() {
		if (eContainerFeatureID() != ClassesPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER) return null;
		return (Classifier)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstitutingClassifier(Classifier newSubstitutingClassifier, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSubstitutingClassifier, ClassesPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitutingClassifier(Classifier newSubstitutingClassifier) {
		if (newSubstitutingClassifier != eInternalContainer() || (eContainerFeatureID() != ClassesPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER && newSubstitutingClassifier != null)) {
			if (EcoreUtil.isAncestor(this, newSubstitutingClassifier))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSubstitutingClassifier != null)
				msgs = ((InternalEObject)newSubstitutingClassifier).eInverseAdd(this, ClassesPackage.CLASSIFIER__SUBSTITUTION, Classifier.class, msgs);
			msgs = basicSetSubstitutingClassifier(newSubstitutingClassifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER, newSubstitutingClassifier, newSubstitutingClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getContract() {
		if (contract != null && contract.eIsProxy()) {
			InternalEObject oldContract = (InternalEObject)contract;
			contract = (Classifier)eResolveProxy(oldContract);
			if (contract != oldContract) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.SUBSTITUTION__CONTRACT, oldContract, contract));
			}
		}
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetContract() {
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContract(Classifier newContract) {
		Classifier oldContract = contract;
		contract = newContract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.SUBSTITUTION__CONTRACT, oldContract, contract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassesPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSubstitutingClassifier((Classifier)otherEnd, msgs);
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
			case ClassesPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER:
				return basicSetSubstitutingClassifier(null, msgs);
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
			case ClassesPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER:
				return eInternalContainer().eInverseRemove(this, ClassesPackage.CLASSIFIER__SUBSTITUTION, Classifier.class, msgs);
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
			case ClassesPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER:
				return getSubstitutingClassifier();
			case ClassesPackage.SUBSTITUTION__CONTRACT:
				if (resolve) return getContract();
				return basicGetContract();
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
			case ClassesPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER:
				setSubstitutingClassifier((Classifier)newValue);
				return;
			case ClassesPackage.SUBSTITUTION__CONTRACT:
				setContract((Classifier)newValue);
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
			case ClassesPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER:
				setSubstitutingClassifier((Classifier)null);
				return;
			case ClassesPackage.SUBSTITUTION__CONTRACT:
				setContract((Classifier)null);
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
			case ClassesPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER:
				return getSubstitutingClassifier() != null;
			case ClassesPackage.SUBSTITUTION__CONTRACT:
				return contract != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstitutionImpl

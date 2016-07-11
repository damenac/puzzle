/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.Classifier;
import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.Component;
import CompleteDSLPckg.ComponentRealization;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompleteDSLPckg.impl.ComponentRealizationImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ComponentRealizationImpl#getRealizingClassifier <em>Realizing Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentRealizationImpl extends RealizationImpl implements ComponentRealization {
	/**
	 * The cached value of the '{@link #getAbstraction() <em>Abstraction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstraction()
	 * @generated
	 * @ordered
	 */
	protected Component abstraction;

	/**
	 * The cached value of the '{@link #getRealizingClassifier() <em>Realizing Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> realizingClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteDSLPckgPackage.eINSTANCE.getComponentRealization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getAbstraction() {
		if (abstraction != null && abstraction.eIsProxy()) {
			InternalEObject oldAbstraction = (InternalEObject)abstraction;
			abstraction = (Component)eResolveProxy(oldAbstraction);
			if (abstraction != oldAbstraction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.COMPONENT_REALIZATION__ABSTRACTION, oldAbstraction, abstraction));
			}
		}
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetAbstraction() {
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstraction(Component newAbstraction) {
		Component oldAbstraction = abstraction;
		abstraction = newAbstraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.COMPONENT_REALIZATION__ABSTRACTION, oldAbstraction, abstraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRealizingClassifier() {
		if (realizingClassifier == null) {
			realizingClassifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, CompleteDSLPckgPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER);
		}
		return realizingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompleteDSLPckgPackage.COMPONENT_REALIZATION__ABSTRACTION:
				if (resolve) return getAbstraction();
				return basicGetAbstraction();
			case CompleteDSLPckgPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER:
				return getRealizingClassifier();
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
			case CompleteDSLPckgPackage.COMPONENT_REALIZATION__ABSTRACTION:
				setAbstraction((Component)newValue);
				return;
			case CompleteDSLPckgPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER:
				getRealizingClassifier().clear();
				getRealizingClassifier().addAll((Collection<? extends Classifier>)newValue);
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
			case CompleteDSLPckgPackage.COMPONENT_REALIZATION__ABSTRACTION:
				setAbstraction((Component)null);
				return;
			case CompleteDSLPckgPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER:
				getRealizingClassifier().clear();
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
			case CompleteDSLPckgPackage.COMPONENT_REALIZATION__ABSTRACTION:
				return abstraction != null;
			case CompleteDSLPckgPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER:
				return realizingClassifier != null && !realizingClassifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentRealizationImpl

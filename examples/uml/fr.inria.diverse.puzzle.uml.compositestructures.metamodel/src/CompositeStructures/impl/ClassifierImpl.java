/**
 */
package CompositeStructures.impl;

import CompositeStructures.Classifier;
import CompositeStructures.CollaborationUse;
import CompositeStructures.CompositeStructuresPackage;
import CompositeStructures.Feature;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompositeStructures.impl.ClassifierImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link CompositeStructures.impl.ClassifierImpl#getCollaborationUse <em>Collaboration Use</em>}</li>
 *   <li>{@link CompositeStructures.impl.ClassifierImpl#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassifierImpl extends NamespaceImpl implements Classifier {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feature;

	/**
	 * The cached value of the '{@link #getCollaborationUse() <em>Collaboration Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationUse()
	 * @generated
	 * @ordered
	 */
	protected EList<CollaborationUse> collaborationUse;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected CollaborationUse representation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositeStructuresPackage.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectWithInverseResolvingEList.ManyInverse<Feature>(Feature.class, this, CompositeStructuresPackage.CLASSIFIER__FEATURE, CompositeStructuresPackage.FEATURE__FEATURING_CLASSIFIER);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollaborationUse> getCollaborationUse() {
		if (collaborationUse == null) {
			collaborationUse = new EObjectContainmentEList<CollaborationUse>(CollaborationUse.class, this, CompositeStructuresPackage.CLASSIFIER__COLLABORATION_USE);
		}
		return collaborationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse getRepresentation() {
		if (representation != null && representation.eIsProxy()) {
			InternalEObject oldRepresentation = (InternalEObject)representation;
			representation = (CollaborationUse)eResolveProxy(oldRepresentation);
			if (representation != oldRepresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositeStructuresPackage.CLASSIFIER__REPRESENTATION, oldRepresentation, representation));
			}
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse basicGetRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(CollaborationUse newRepresentation) {
		CollaborationUse oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositeStructuresPackage.CLASSIFIER__REPRESENTATION, oldRepresentation, representation));
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
			case CompositeStructuresPackage.CLASSIFIER__FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeature()).basicAdd(otherEnd, msgs);
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
			case CompositeStructuresPackage.CLASSIFIER__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
			case CompositeStructuresPackage.CLASSIFIER__COLLABORATION_USE:
				return ((InternalEList<?>)getCollaborationUse()).basicRemove(otherEnd, msgs);
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
			case CompositeStructuresPackage.CLASSIFIER__FEATURE:
				return getFeature();
			case CompositeStructuresPackage.CLASSIFIER__COLLABORATION_USE:
				return getCollaborationUse();
			case CompositeStructuresPackage.CLASSIFIER__REPRESENTATION:
				if (resolve) return getRepresentation();
				return basicGetRepresentation();
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
			case CompositeStructuresPackage.CLASSIFIER__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case CompositeStructuresPackage.CLASSIFIER__COLLABORATION_USE:
				getCollaborationUse().clear();
				getCollaborationUse().addAll((Collection<? extends CollaborationUse>)newValue);
				return;
			case CompositeStructuresPackage.CLASSIFIER__REPRESENTATION:
				setRepresentation((CollaborationUse)newValue);
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
			case CompositeStructuresPackage.CLASSIFIER__FEATURE:
				getFeature().clear();
				return;
			case CompositeStructuresPackage.CLASSIFIER__COLLABORATION_USE:
				getCollaborationUse().clear();
				return;
			case CompositeStructuresPackage.CLASSIFIER__REPRESENTATION:
				setRepresentation((CollaborationUse)null);
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
			case CompositeStructuresPackage.CLASSIFIER__FEATURE:
				return feature != null && !feature.isEmpty();
			case CompositeStructuresPackage.CLASSIFIER__COLLABORATION_USE:
				return collaborationUse != null && !collaborationUse.isEmpty();
			case CompositeStructuresPackage.CLASSIFIER__REPRESENTATION:
				return representation != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassifierImpl

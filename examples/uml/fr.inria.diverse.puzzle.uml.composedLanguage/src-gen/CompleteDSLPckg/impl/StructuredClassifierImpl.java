/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.ConnectableElement;
import CompleteDSLPckg.Connector;
import CompleteDSLPckg.Property;
import CompleteDSLPckg.StructuredClassifier;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompleteDSLPckg.impl.StructuredClassifierImpl#getOwnedConnector <em>Owned Connector</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredClassifierImpl#getRole <em>Role</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredClassifierImpl#getStructuredOwnedAttribute <em>Structured Owned Attribute</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StructuredClassifierImpl#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredClassifierImpl extends ClassifierImpl implements StructuredClassifier {
	/**
	 * The cached value of the '{@link #getOwnedConnector() <em>Owned Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> ownedConnector;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectableElement> role;

	/**
	 * The cached value of the '{@link #getStructuredOwnedAttribute() <em>Structured Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> structuredOwnedAttribute;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> part;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteDSLPckgPackage.eINSTANCE.getStructuredClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getOwnedConnector() {
		if (ownedConnector == null) {
			ownedConnector = new EObjectContainmentEList<Connector>(Connector.class, this, CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR);
		}
		return ownedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectableElement> getRole() {
		if (role == null) {
			role = new EObjectResolvingEList<ConnectableElement>(ConnectableElement.class, this, CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getStructuredOwnedAttribute() {
		if (structuredOwnedAttribute == null) {
			structuredOwnedAttribute = new EObjectContainmentEList<Property>(Property.class, this, CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__STRUCTURED_OWNED_ATTRIBUTE);
		}
		return structuredOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getPart() {
		if (part == null) {
			part = new EObjectResolvingEList<Property>(Property.class, this, CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				return ((InternalEList<?>)getOwnedConnector()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__STRUCTURED_OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getStructuredOwnedAttribute()).basicRemove(otherEnd, msgs);
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
			case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				return getOwnedConnector();
			case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__ROLE:
				return getRole();
			case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__STRUCTURED_OWNED_ATTRIBUTE:
				return getStructuredOwnedAttribute();
			case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__PART:
				return getPart();
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
			case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				getOwnedConnector().addAll((Collection<? extends Connector>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends ConnectableElement>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__STRUCTURED_OWNED_ATTRIBUTE:
				getStructuredOwnedAttribute().clear();
				getStructuredOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends Property>)newValue);
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
			case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__ROLE:
				getRole().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__STRUCTURED_OWNED_ATTRIBUTE:
				getStructuredOwnedAttribute().clear();
				return;
			case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__PART:
				getPart().clear();
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
			case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__ROLE:
				return role != null && !role.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__STRUCTURED_OWNED_ATTRIBUTE:
				return structuredOwnedAttribute != null && !structuredOwnedAttribute.isEmpty();
			case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__PART:
				return part != null && !part.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructuredClassifierImpl

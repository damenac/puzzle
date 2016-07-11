/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.Behavior;
import CompleteDSLPckg.BehavioredClassifier;
import CompleteDSLPckg.Classifier;
import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.ConnectableElement;
import CompleteDSLPckg.Connector;
import CompleteDSLPckg.EncapsulatedClassifier;
import CompleteDSLPckg.InterfaceRealization;
import CompleteDSLPckg.Operation;
import CompleteDSLPckg.Port;
import CompleteDSLPckg.Property;
import CompleteDSLPckg.Reception;
import CompleteDSLPckg.StructuredClassifier;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompleteDSLPckg.impl.ClassImpl#getInterfaceRealization <em>Interface Realization</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassImpl#getOwnedBehavior <em>Owned Behavior</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassImpl#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassImpl#getOwnedConnector <em>Owned Connector</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassImpl#getRole <em>Role</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassImpl#getStructuredOwnedAttribute <em>Structured Owned Attribute</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassImpl#getPart <em>Part</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassImpl#getOwnedPort <em>Owned Port</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassImpl#getNestedClassifier <em>Nested Classifier</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassImpl#getOwnedReception <em>Owned Reception</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends ClassifierImpl implements CompleteDSLPckg.Class {
	/**
	 * The cached value of the '{@link #getInterfaceRealization() <em>Interface Realization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceRealization()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceRealization> interfaceRealization;

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
	 * The cached value of the '{@link #getOwnedPort() <em>Owned Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ownedPort;

	/**
	 * The cached value of the '{@link #getNestedClassifier() <em>Nested Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> nestedClassifier;

	/**
	 * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperation;

	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected EList<CompleteDSLPckg.Class> superClass;

	/**
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedAttribute;

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
		return CompleteDSLPckgPackage.eINSTANCE.getClass_();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceRealization> getInterfaceRealization() {
		if (interfaceRealization == null) {
			interfaceRealization = new EObjectContainmentWithInverseEList<InterfaceRealization>(InterfaceRealization.class, this, CompleteDSLPckgPackage.CLASS__INTERFACE_REALIZATION, CompleteDSLPckgPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER);
		}
		return interfaceRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getOwnedBehavior() {
		if (ownedBehavior == null) {
			ownedBehavior = new EObjectContainmentEList<Behavior>(Behavior.class, this, CompleteDSLPckgPackage.CLASS__OWNED_BEHAVIOR);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.CLASS__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.CLASS__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getOwnedConnector() {
		if (ownedConnector == null) {
			ownedConnector = new EObjectContainmentEList<Connector>(Connector.class, this, CompleteDSLPckgPackage.CLASS__OWNED_CONNECTOR);
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
			role = new EObjectResolvingEList<ConnectableElement>(ConnectableElement.class, this, CompleteDSLPckgPackage.CLASS__ROLE);
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
			structuredOwnedAttribute = new EObjectContainmentEList<Property>(Property.class, this, CompleteDSLPckgPackage.CLASS__STRUCTURED_OWNED_ATTRIBUTE);
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
			part = new EObjectResolvingEList<Property>(Property.class, this, CompleteDSLPckgPackage.CLASS__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getOwnedPort() {
		if (ownedPort == null) {
			ownedPort = new EObjectContainmentEList<Port>(Port.class, this, CompleteDSLPckgPackage.CLASS__OWNED_PORT);
		}
		return ownedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getNestedClassifier() {
		if (nestedClassifier == null) {
			nestedClassifier = new EObjectContainmentEList<Classifier>(Classifier.class, this, CompleteDSLPckgPackage.CLASS__NESTED_CLASSIFIER);
		}
		return nestedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, CompleteDSLPckgPackage.CLASS__OWNED_OPERATION, CompleteDSLPckgPackage.OPERATION__CLASS);
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompleteDSLPckg.Class> getSuperClass() {
		if (superClass == null) {
			superClass = new EObjectResolvingEList<CompleteDSLPckg.Class>(CompleteDSLPckg.Class.class, this, CompleteDSLPckgPackage.CLASS__SUPER_CLASS);
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectWithInverseResolvingEList<Property>(Property.class, this, CompleteDSLPckgPackage.CLASS__OWNED_ATTRIBUTE, CompleteDSLPckgPackage.PROPERTY__CLASS);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reception> getOwnedReception() {
		if (ownedReception == null) {
			ownedReception = new EObjectContainmentEList<Reception>(Reception.class, this, CompleteDSLPckgPackage.CLASS__OWNED_RECEPTION);
		}
		return ownedReception;
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
			case CompleteDSLPckgPackage.CLASS__INTERFACE_REALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfaceRealization()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASS__OWNED_OPERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedOperation()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASS__OWNED_ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedAttribute()).basicAdd(otherEnd, msgs);
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
			case CompleteDSLPckgPackage.CLASS__INTERFACE_REALIZATION:
				return ((InternalEList<?>)getInterfaceRealization()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASS__OWNED_BEHAVIOR:
				return ((InternalEList<?>)getOwnedBehavior()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASS__OWNED_CONNECTOR:
				return ((InternalEList<?>)getOwnedConnector()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASS__STRUCTURED_OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getStructuredOwnedAttribute()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASS__OWNED_PORT:
				return ((InternalEList<?>)getOwnedPort()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASS__NESTED_CLASSIFIER:
				return ((InternalEList<?>)getNestedClassifier()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASS__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASS__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASS__OWNED_RECEPTION:
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
			case CompleteDSLPckgPackage.CLASS__INTERFACE_REALIZATION:
				return getInterfaceRealization();
			case CompleteDSLPckgPackage.CLASS__OWNED_BEHAVIOR:
				return getOwnedBehavior();
			case CompleteDSLPckgPackage.CLASS__CLASSIFIER_BEHAVIOR:
				if (resolve) return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case CompleteDSLPckgPackage.CLASS__OWNED_CONNECTOR:
				return getOwnedConnector();
			case CompleteDSLPckgPackage.CLASS__ROLE:
				return getRole();
			case CompleteDSLPckgPackage.CLASS__STRUCTURED_OWNED_ATTRIBUTE:
				return getStructuredOwnedAttribute();
			case CompleteDSLPckgPackage.CLASS__PART:
				return getPart();
			case CompleteDSLPckgPackage.CLASS__OWNED_PORT:
				return getOwnedPort();
			case CompleteDSLPckgPackage.CLASS__NESTED_CLASSIFIER:
				return getNestedClassifier();
			case CompleteDSLPckgPackage.CLASS__OWNED_OPERATION:
				return getOwnedOperation();
			case CompleteDSLPckgPackage.CLASS__SUPER_CLASS:
				return getSuperClass();
			case CompleteDSLPckgPackage.CLASS__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case CompleteDSLPckgPackage.CLASS__OWNED_RECEPTION:
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
			case CompleteDSLPckgPackage.CLASS__INTERFACE_REALIZATION:
				getInterfaceRealization().clear();
				getInterfaceRealization().addAll((Collection<? extends InterfaceRealization>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASS__OWNED_BEHAVIOR:
				getOwnedBehavior().clear();
				getOwnedBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASS__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case CompleteDSLPckgPackage.CLASS__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				getOwnedConnector().addAll((Collection<? extends Connector>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASS__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends ConnectableElement>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASS__STRUCTURED_OWNED_ATTRIBUTE:
				getStructuredOwnedAttribute().clear();
				getStructuredOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASS__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends Property>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASS__OWNED_PORT:
				getOwnedPort().clear();
				getOwnedPort().addAll((Collection<? extends Port>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASS__NESTED_CLASSIFIER:
				getNestedClassifier().clear();
				getNestedClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASS__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASS__SUPER_CLASS:
				getSuperClass().clear();
				getSuperClass().addAll((Collection<? extends CompleteDSLPckg.Class>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASS__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASS__OWNED_RECEPTION:
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
			case CompleteDSLPckgPackage.CLASS__INTERFACE_REALIZATION:
				getInterfaceRealization().clear();
				return;
			case CompleteDSLPckgPackage.CLASS__OWNED_BEHAVIOR:
				getOwnedBehavior().clear();
				return;
			case CompleteDSLPckgPackage.CLASS__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case CompleteDSLPckgPackage.CLASS__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				return;
			case CompleteDSLPckgPackage.CLASS__ROLE:
				getRole().clear();
				return;
			case CompleteDSLPckgPackage.CLASS__STRUCTURED_OWNED_ATTRIBUTE:
				getStructuredOwnedAttribute().clear();
				return;
			case CompleteDSLPckgPackage.CLASS__PART:
				getPart().clear();
				return;
			case CompleteDSLPckgPackage.CLASS__OWNED_PORT:
				getOwnedPort().clear();
				return;
			case CompleteDSLPckgPackage.CLASS__NESTED_CLASSIFIER:
				getNestedClassifier().clear();
				return;
			case CompleteDSLPckgPackage.CLASS__OWNED_OPERATION:
				getOwnedOperation().clear();
				return;
			case CompleteDSLPckgPackage.CLASS__SUPER_CLASS:
				getSuperClass().clear();
				return;
			case CompleteDSLPckgPackage.CLASS__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case CompleteDSLPckgPackage.CLASS__OWNED_RECEPTION:
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
			case CompleteDSLPckgPackage.CLASS__INTERFACE_REALIZATION:
				return interfaceRealization != null && !interfaceRealization.isEmpty();
			case CompleteDSLPckgPackage.CLASS__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case CompleteDSLPckgPackage.CLASS__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case CompleteDSLPckgPackage.CLASS__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
			case CompleteDSLPckgPackage.CLASS__ROLE:
				return role != null && !role.isEmpty();
			case CompleteDSLPckgPackage.CLASS__STRUCTURED_OWNED_ATTRIBUTE:
				return structuredOwnedAttribute != null && !structuredOwnedAttribute.isEmpty();
			case CompleteDSLPckgPackage.CLASS__PART:
				return part != null && !part.isEmpty();
			case CompleteDSLPckgPackage.CLASS__OWNED_PORT:
				return ownedPort != null && !ownedPort.isEmpty();
			case CompleteDSLPckgPackage.CLASS__NESTED_CLASSIFIER:
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case CompleteDSLPckgPackage.CLASS__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case CompleteDSLPckgPackage.CLASS__SUPER_CLASS:
				return superClass != null && !superClass.isEmpty();
			case CompleteDSLPckgPackage.CLASS__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case CompleteDSLPckgPackage.CLASS__OWNED_RECEPTION:
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
				case CompleteDSLPckgPackage.CLASS__INTERFACE_REALIZATION: return CompleteDSLPckgPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION;
				case CompleteDSLPckgPackage.CLASS__OWNED_BEHAVIOR: return CompleteDSLPckgPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;
				case CompleteDSLPckgPackage.CLASS__CLASSIFIER_BEHAVIOR: return CompleteDSLPckgPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == StructuredClassifier.class) {
			switch (derivedFeatureID) {
				case CompleteDSLPckgPackage.CLASS__OWNED_CONNECTOR: return CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR;
				case CompleteDSLPckgPackage.CLASS__ROLE: return CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__ROLE;
				case CompleteDSLPckgPackage.CLASS__STRUCTURED_OWNED_ATTRIBUTE: return CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__STRUCTURED_OWNED_ATTRIBUTE;
				case CompleteDSLPckgPackage.CLASS__PART: return CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__PART;
				default: return -1;
			}
		}
		if (baseClass == EncapsulatedClassifier.class) {
			switch (derivedFeatureID) {
				case CompleteDSLPckgPackage.CLASS__OWNED_PORT: return CompleteDSLPckgPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT;
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
				case CompleteDSLPckgPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION: return CompleteDSLPckgPackage.CLASS__INTERFACE_REALIZATION;
				case CompleteDSLPckgPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR: return CompleteDSLPckgPackage.CLASS__OWNED_BEHAVIOR;
				case CompleteDSLPckgPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR: return CompleteDSLPckgPackage.CLASS__CLASSIFIER_BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == StructuredClassifier.class) {
			switch (baseFeatureID) {
				case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR: return CompleteDSLPckgPackage.CLASS__OWNED_CONNECTOR;
				case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__ROLE: return CompleteDSLPckgPackage.CLASS__ROLE;
				case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__STRUCTURED_OWNED_ATTRIBUTE: return CompleteDSLPckgPackage.CLASS__STRUCTURED_OWNED_ATTRIBUTE;
				case CompleteDSLPckgPackage.STRUCTURED_CLASSIFIER__PART: return CompleteDSLPckgPackage.CLASS__PART;
				default: return -1;
			}
		}
		if (baseClass == EncapsulatedClassifier.class) {
			switch (baseFeatureID) {
				case CompleteDSLPckgPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT: return CompleteDSLPckgPackage.CLASS__OWNED_PORT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ClassImpl

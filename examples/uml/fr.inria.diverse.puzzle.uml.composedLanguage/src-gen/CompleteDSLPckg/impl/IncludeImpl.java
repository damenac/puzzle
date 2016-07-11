/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.Dependency;
import CompleteDSLPckg.Include;
import CompleteDSLPckg.NamedElement;
import CompleteDSLPckg.Namespace;
import CompleteDSLPckg.UseCase;
import CompleteDSLPckg.VisibilityKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompleteDSLPckg.impl.IncludeImpl#getName <em>Name</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.IncludeImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.IncludeImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.IncludeImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.IncludeImpl#getClientDependency <em>Client Dependency</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.IncludeImpl#getIncludingCase <em>Including Case</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.IncludeImpl#getAddition <em>Addition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludeImpl extends DirectedRelationshipImpl implements Include {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PACKAGE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClientDependency() <em>Client Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> clientDependency;

	/**
	 * The cached value of the '{@link #getIncludingCase() <em>Including Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludingCase()
	 * @generated
	 * @ordered
	 */
	protected UseCase includingCase;

	/**
	 * The cached value of the '{@link #getAddition() <em>Addition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddition()
	 * @generated
	 * @ordered
	 */
	protected UseCase addition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteDSLPckgPackage.eINSTANCE.getInclude();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.INCLUDE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedName(String newQualifiedName) {
		String oldQualifiedName = qualifiedName;
		qualifiedName = newQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.INCLUDE__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.INCLUDE__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		if (eContainerFeatureID() != CompleteDSLPckgPackage.INCLUDE__NAMESPACE) return null;
		return (Namespace)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespace(Namespace newNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNamespace, CompleteDSLPckgPackage.INCLUDE__NAMESPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(Namespace newNamespace) {
		if (newNamespace != eInternalContainer() || (eContainerFeatureID() != CompleteDSLPckgPackage.INCLUDE__NAMESPACE && newNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNamespace != null)
				msgs = ((InternalEObject)newNamespace).eInverseAdd(this, CompleteDSLPckgPackage.NAMESPACE__OWNED_MEMBER, Namespace.class, msgs);
			msgs = basicSetNamespace(newNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.INCLUDE__NAMESPACE, newNamespace, newNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getClientDependency() {
		if (clientDependency == null) {
			clientDependency = new EObjectWithInverseResolvingEList.ManyInverse<Dependency>(Dependency.class, this, CompleteDSLPckgPackage.INCLUDE__CLIENT_DEPENDENCY, CompleteDSLPckgPackage.DEPENDENCY__CLIENT);
		}
		return clientDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getIncludingCase() {
		if (includingCase != null && includingCase.eIsProxy()) {
			InternalEObject oldIncludingCase = (InternalEObject)includingCase;
			includingCase = (UseCase)eResolveProxy(oldIncludingCase);
			if (includingCase != oldIncludingCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.INCLUDE__INCLUDING_CASE, oldIncludingCase, includingCase));
			}
		}
		return includingCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetIncludingCase() {
		return includingCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludingCase(UseCase newIncludingCase) {
		UseCase oldIncludingCase = includingCase;
		includingCase = newIncludingCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.INCLUDE__INCLUDING_CASE, oldIncludingCase, includingCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getAddition() {
		if (addition != null && addition.eIsProxy()) {
			InternalEObject oldAddition = (InternalEObject)addition;
			addition = (UseCase)eResolveProxy(oldAddition);
			if (addition != oldAddition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.INCLUDE__ADDITION, oldAddition, addition));
			}
		}
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetAddition() {
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddition(UseCase newAddition) {
		UseCase oldAddition = addition;
		addition = newAddition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.INCLUDE__ADDITION, oldAddition, addition));
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
			case CompleteDSLPckgPackage.INCLUDE__NAMESPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNamespace((Namespace)otherEnd, msgs);
			case CompleteDSLPckgPackage.INCLUDE__CLIENT_DEPENDENCY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClientDependency()).basicAdd(otherEnd, msgs);
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
			case CompleteDSLPckgPackage.INCLUDE__NAMESPACE:
				return basicSetNamespace(null, msgs);
			case CompleteDSLPckgPackage.INCLUDE__CLIENT_DEPENDENCY:
				return ((InternalEList<?>)getClientDependency()).basicRemove(otherEnd, msgs);
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
			case CompleteDSLPckgPackage.INCLUDE__NAMESPACE:
				return eInternalContainer().eInverseRemove(this, CompleteDSLPckgPackage.NAMESPACE__OWNED_MEMBER, Namespace.class, msgs);
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
			case CompleteDSLPckgPackage.INCLUDE__NAME:
				return getName();
			case CompleteDSLPckgPackage.INCLUDE__QUALIFIED_NAME:
				return getQualifiedName();
			case CompleteDSLPckgPackage.INCLUDE__VISIBILITY:
				return getVisibility();
			case CompleteDSLPckgPackage.INCLUDE__NAMESPACE:
				return getNamespace();
			case CompleteDSLPckgPackage.INCLUDE__CLIENT_DEPENDENCY:
				return getClientDependency();
			case CompleteDSLPckgPackage.INCLUDE__INCLUDING_CASE:
				if (resolve) return getIncludingCase();
				return basicGetIncludingCase();
			case CompleteDSLPckgPackage.INCLUDE__ADDITION:
				if (resolve) return getAddition();
				return basicGetAddition();
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
			case CompleteDSLPckgPackage.INCLUDE__NAME:
				setName((String)newValue);
				return;
			case CompleteDSLPckgPackage.INCLUDE__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case CompleteDSLPckgPackage.INCLUDE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case CompleteDSLPckgPackage.INCLUDE__NAMESPACE:
				setNamespace((Namespace)newValue);
				return;
			case CompleteDSLPckgPackage.INCLUDE__CLIENT_DEPENDENCY:
				getClientDependency().clear();
				getClientDependency().addAll((Collection<? extends Dependency>)newValue);
				return;
			case CompleteDSLPckgPackage.INCLUDE__INCLUDING_CASE:
				setIncludingCase((UseCase)newValue);
				return;
			case CompleteDSLPckgPackage.INCLUDE__ADDITION:
				setAddition((UseCase)newValue);
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
			case CompleteDSLPckgPackage.INCLUDE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.INCLUDE__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.INCLUDE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.INCLUDE__NAMESPACE:
				setNamespace((Namespace)null);
				return;
			case CompleteDSLPckgPackage.INCLUDE__CLIENT_DEPENDENCY:
				getClientDependency().clear();
				return;
			case CompleteDSLPckgPackage.INCLUDE__INCLUDING_CASE:
				setIncludingCase((UseCase)null);
				return;
			case CompleteDSLPckgPackage.INCLUDE__ADDITION:
				setAddition((UseCase)null);
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
			case CompleteDSLPckgPackage.INCLUDE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CompleteDSLPckgPackage.INCLUDE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case CompleteDSLPckgPackage.INCLUDE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case CompleteDSLPckgPackage.INCLUDE__NAMESPACE:
				return getNamespace() != null;
			case CompleteDSLPckgPackage.INCLUDE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case CompleteDSLPckgPackage.INCLUDE__INCLUDING_CASE:
				return includingCase != null;
			case CompleteDSLPckgPackage.INCLUDE__ADDITION:
				return addition != null;
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case CompleteDSLPckgPackage.INCLUDE__NAME: return CompleteDSLPckgPackage.NAMED_ELEMENT__NAME;
				case CompleteDSLPckgPackage.INCLUDE__QUALIFIED_NAME: return CompleteDSLPckgPackage.NAMED_ELEMENT__QUALIFIED_NAME;
				case CompleteDSLPckgPackage.INCLUDE__VISIBILITY: return CompleteDSLPckgPackage.NAMED_ELEMENT__VISIBILITY;
				case CompleteDSLPckgPackage.INCLUDE__NAMESPACE: return CompleteDSLPckgPackage.NAMED_ELEMENT__NAMESPACE;
				case CompleteDSLPckgPackage.INCLUDE__CLIENT_DEPENDENCY: return CompleteDSLPckgPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CompleteDSLPckgPackage.NAMED_ELEMENT__NAME: return CompleteDSLPckgPackage.INCLUDE__NAME;
				case CompleteDSLPckgPackage.NAMED_ELEMENT__QUALIFIED_NAME: return CompleteDSLPckgPackage.INCLUDE__QUALIFIED_NAME;
				case CompleteDSLPckgPackage.NAMED_ELEMENT__VISIBILITY: return CompleteDSLPckgPackage.INCLUDE__VISIBILITY;
				case CompleteDSLPckgPackage.NAMED_ELEMENT__NAMESPACE: return CompleteDSLPckgPackage.INCLUDE__NAMESPACE;
				case CompleteDSLPckgPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY: return CompleteDSLPckgPackage.INCLUDE__CLIENT_DEPENDENCY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", qualifiedName: ");
		result.append(qualifiedName);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //IncludeImpl

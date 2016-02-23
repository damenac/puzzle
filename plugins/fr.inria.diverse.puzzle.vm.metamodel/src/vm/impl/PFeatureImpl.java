/**
 */
package vm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import vm.PFeature;
import vm.PFeatureGroup;
import vm.PLanguageModule;
import vm.VmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PFeature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vm.impl.PFeatureImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link vm.impl.PFeatureImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link vm.impl.PFeatureImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link vm.impl.PFeatureImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link vm.impl.PFeatureImpl#getParentGroup <em>Parent Group</em>}</li>
 *   <li>{@link vm.impl.PFeatureImpl#getImplementationModule <em>Implementation Module</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PFeatureImpl extends PNamedElementImpl implements PFeature {
	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<PFeature> children;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<PFeatureGroup> groups;

	/**
	 * The cached value of the '{@link #getParentGroup() <em>Parent Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentGroup()
	 * @generated
	 * @ordered
	 */
	protected PFeatureGroup parentGroup;

	/**
	 * The cached value of the '{@link #getImplementationModule() <em>Implementation Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationModule()
	 * @generated
	 * @ordered
	 */
	protected PLanguageModule implementationModule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmPackage.Literals.PFEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.PFEATURE__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PFeature> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<PFeature>(PFeature.class, this, VmPackage.PFEATURE__CHILDREN, VmPackage.PFEATURE__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PFeature getParent() {
		if (eContainerFeatureID() != VmPackage.PFEATURE__PARENT) return null;
		return (PFeature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(PFeature newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, VmPackage.PFEATURE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(PFeature newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != VmPackage.PFEATURE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, VmPackage.PFEATURE__CHILDREN, PFeature.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.PFEATURE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PFeatureGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<PFeatureGroup>(PFeatureGroup.class, this, VmPackage.PFEATURE__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PFeatureGroup getParentGroup() {
		if (parentGroup != null && parentGroup.eIsProxy()) {
			InternalEObject oldParentGroup = (InternalEObject)parentGroup;
			parentGroup = (PFeatureGroup)eResolveProxy(oldParentGroup);
			if (parentGroup != oldParentGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmPackage.PFEATURE__PARENT_GROUP, oldParentGroup, parentGroup));
			}
		}
		return parentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PFeatureGroup basicGetParentGroup() {
		return parentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentGroup(PFeatureGroup newParentGroup, NotificationChain msgs) {
		PFeatureGroup oldParentGroup = parentGroup;
		parentGroup = newParentGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmPackage.PFEATURE__PARENT_GROUP, oldParentGroup, newParentGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentGroup(PFeatureGroup newParentGroup) {
		if (newParentGroup != parentGroup) {
			NotificationChain msgs = null;
			if (parentGroup != null)
				msgs = ((InternalEObject)parentGroup).eInverseRemove(this, VmPackage.PFEATURE_GROUP__FEATURES, PFeatureGroup.class, msgs);
			if (newParentGroup != null)
				msgs = ((InternalEObject)newParentGroup).eInverseAdd(this, VmPackage.PFEATURE_GROUP__FEATURES, PFeatureGroup.class, msgs);
			msgs = basicSetParentGroup(newParentGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.PFEATURE__PARENT_GROUP, newParentGroup, newParentGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLanguageModule getImplementationModule() {
		return implementationModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementationModule(PLanguageModule newImplementationModule, NotificationChain msgs) {
		PLanguageModule oldImplementationModule = implementationModule;
		implementationModule = newImplementationModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmPackage.PFEATURE__IMPLEMENTATION_MODULE, oldImplementationModule, newImplementationModule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationModule(PLanguageModule newImplementationModule) {
		if (newImplementationModule != implementationModule) {
			NotificationChain msgs = null;
			if (implementationModule != null)
				msgs = ((InternalEObject)implementationModule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmPackage.PFEATURE__IMPLEMENTATION_MODULE, null, msgs);
			if (newImplementationModule != null)
				msgs = ((InternalEObject)newImplementationModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmPackage.PFEATURE__IMPLEMENTATION_MODULE, null, msgs);
			msgs = basicSetImplementationModule(newImplementationModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.PFEATURE__IMPLEMENTATION_MODULE, newImplementationModule, newImplementationModule));
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
			case VmPackage.PFEATURE__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case VmPackage.PFEATURE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((PFeature)otherEnd, msgs);
			case VmPackage.PFEATURE__PARENT_GROUP:
				if (parentGroup != null)
					msgs = ((InternalEObject)parentGroup).eInverseRemove(this, VmPackage.PFEATURE_GROUP__FEATURES, PFeatureGroup.class, msgs);
				return basicSetParentGroup((PFeatureGroup)otherEnd, msgs);
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
			case VmPackage.PFEATURE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case VmPackage.PFEATURE__PARENT:
				return basicSetParent(null, msgs);
			case VmPackage.PFEATURE__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case VmPackage.PFEATURE__PARENT_GROUP:
				return basicSetParentGroup(null, msgs);
			case VmPackage.PFEATURE__IMPLEMENTATION_MODULE:
				return basicSetImplementationModule(null, msgs);
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
			case VmPackage.PFEATURE__PARENT:
				return eInternalContainer().eInverseRemove(this, VmPackage.PFEATURE__CHILDREN, PFeature.class, msgs);
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
			case VmPackage.PFEATURE__MANDATORY:
				return isMandatory();
			case VmPackage.PFEATURE__CHILDREN:
				return getChildren();
			case VmPackage.PFEATURE__PARENT:
				return getParent();
			case VmPackage.PFEATURE__GROUPS:
				return getGroups();
			case VmPackage.PFEATURE__PARENT_GROUP:
				if (resolve) return getParentGroup();
				return basicGetParentGroup();
			case VmPackage.PFEATURE__IMPLEMENTATION_MODULE:
				return getImplementationModule();
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
			case VmPackage.PFEATURE__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case VmPackage.PFEATURE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends PFeature>)newValue);
				return;
			case VmPackage.PFEATURE__PARENT:
				setParent((PFeature)newValue);
				return;
			case VmPackage.PFEATURE__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends PFeatureGroup>)newValue);
				return;
			case VmPackage.PFEATURE__PARENT_GROUP:
				setParentGroup((PFeatureGroup)newValue);
				return;
			case VmPackage.PFEATURE__IMPLEMENTATION_MODULE:
				setImplementationModule((PLanguageModule)newValue);
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
			case VmPackage.PFEATURE__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case VmPackage.PFEATURE__CHILDREN:
				getChildren().clear();
				return;
			case VmPackage.PFEATURE__PARENT:
				setParent((PFeature)null);
				return;
			case VmPackage.PFEATURE__GROUPS:
				getGroups().clear();
				return;
			case VmPackage.PFEATURE__PARENT_GROUP:
				setParentGroup((PFeatureGroup)null);
				return;
			case VmPackage.PFEATURE__IMPLEMENTATION_MODULE:
				setImplementationModule((PLanguageModule)null);
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
			case VmPackage.PFEATURE__MANDATORY:
				return mandatory != MANDATORY_EDEFAULT;
			case VmPackage.PFEATURE__CHILDREN:
				return children != null && !children.isEmpty();
			case VmPackage.PFEATURE__PARENT:
				return getParent() != null;
			case VmPackage.PFEATURE__GROUPS:
				return groups != null && !groups.isEmpty();
			case VmPackage.PFEATURE__PARENT_GROUP:
				return parentGroup != null;
			case VmPackage.PFEATURE__IMPLEMENTATION_MODULE:
				return implementationModule != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (mandatory: ");
		result.append(mandatory);
		result.append(')');
		return result.toString();
	}

} //PFeatureImpl

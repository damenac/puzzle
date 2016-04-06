/**
 */
package vm.impl;

import PuzzleADL.LanguageModule;

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

import vm.LanguageFeature;
import vm.LanguageFeatureGroup;
import vm.SemanticVariationPoint;
import vm.VmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vm.impl.LanguageFeatureImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link vm.impl.LanguageFeatureImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link vm.impl.LanguageFeatureImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link vm.impl.LanguageFeatureImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link vm.impl.LanguageFeatureImpl#getParentGroup <em>Parent Group</em>}</li>
 *   <li>{@link vm.impl.LanguageFeatureImpl#getImplementationModule <em>Implementation Module</em>}</li>
 *   <li>{@link vm.impl.LanguageFeatureImpl#isSelected <em>Selected</em>}</li>
 *   <li>{@link vm.impl.LanguageFeatureImpl#getSemanticVariationPoint <em>Semantic Variation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LanguageFeatureImpl extends NamedElementImpl implements LanguageFeature {
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
	protected EList<LanguageFeature> children;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<LanguageFeatureGroup> groups;

	/**
	 * The cached value of the '{@link #getParentGroup() <em>Parent Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentGroup()
	 * @generated
	 * @ordered
	 */
	protected LanguageFeatureGroup parentGroup;

	/**
	 * The cached value of the '{@link #getImplementationModule() <em>Implementation Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationModule()
	 * @generated
	 * @ordered
	 */
	protected LanguageModule implementationModule;

	/**
	 * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean selected = SELECTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemanticVariationPoint() <em>Semantic Variation Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticVariationPoint()
	 * @generated
	 * @ordered
	 */
	protected SemanticVariationPoint semanticVariationPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmPackage.Literals.LANGUAGE_FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.LANGUAGE_FEATURE__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LanguageFeature> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<LanguageFeature>(LanguageFeature.class, this, VmPackage.LANGUAGE_FEATURE__CHILDREN, VmPackage.LANGUAGE_FEATURE__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageFeature getParent() {
		if (eContainerFeatureID() != VmPackage.LANGUAGE_FEATURE__PARENT) return null;
		return (LanguageFeature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(LanguageFeature newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, VmPackage.LANGUAGE_FEATURE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(LanguageFeature newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != VmPackage.LANGUAGE_FEATURE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, VmPackage.LANGUAGE_FEATURE__CHILDREN, LanguageFeature.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.LANGUAGE_FEATURE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LanguageFeatureGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<LanguageFeatureGroup>(LanguageFeatureGroup.class, this, VmPackage.LANGUAGE_FEATURE__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageFeatureGroup getParentGroup() {
		if (parentGroup != null && parentGroup.eIsProxy()) {
			InternalEObject oldParentGroup = (InternalEObject)parentGroup;
			parentGroup = (LanguageFeatureGroup)eResolveProxy(oldParentGroup);
			if (parentGroup != oldParentGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmPackage.LANGUAGE_FEATURE__PARENT_GROUP, oldParentGroup, parentGroup));
			}
		}
		return parentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageFeatureGroup basicGetParentGroup() {
		return parentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentGroup(LanguageFeatureGroup newParentGroup, NotificationChain msgs) {
		LanguageFeatureGroup oldParentGroup = parentGroup;
		parentGroup = newParentGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmPackage.LANGUAGE_FEATURE__PARENT_GROUP, oldParentGroup, newParentGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentGroup(LanguageFeatureGroup newParentGroup) {
		if (newParentGroup != parentGroup) {
			NotificationChain msgs = null;
			if (parentGroup != null)
				msgs = ((InternalEObject)parentGroup).eInverseRemove(this, VmPackage.LANGUAGE_FEATURE_GROUP__FEATURES, LanguageFeatureGroup.class, msgs);
			if (newParentGroup != null)
				msgs = ((InternalEObject)newParentGroup).eInverseAdd(this, VmPackage.LANGUAGE_FEATURE_GROUP__FEATURES, LanguageFeatureGroup.class, msgs);
			msgs = basicSetParentGroup(newParentGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.LANGUAGE_FEATURE__PARENT_GROUP, newParentGroup, newParentGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageModule getImplementationModule() {
		if (implementationModule != null && implementationModule.eIsProxy()) {
			InternalEObject oldImplementationModule = (InternalEObject)implementationModule;
			implementationModule = (LanguageModule)eResolveProxy(oldImplementationModule);
			if (implementationModule != oldImplementationModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmPackage.LANGUAGE_FEATURE__IMPLEMENTATION_MODULE, oldImplementationModule, implementationModule));
			}
		}
		return implementationModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageModule basicGetImplementationModule() {
		return implementationModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationModule(LanguageModule newImplementationModule) {
		LanguageModule oldImplementationModule = implementationModule;
		implementationModule = newImplementationModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.LANGUAGE_FEATURE__IMPLEMENTATION_MODULE, oldImplementationModule, implementationModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(boolean newSelected) {
		boolean oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.LANGUAGE_FEATURE__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticVariationPoint getSemanticVariationPoint() {
		if (semanticVariationPoint != null && semanticVariationPoint.eIsProxy()) {
			InternalEObject oldSemanticVariationPoint = (InternalEObject)semanticVariationPoint;
			semanticVariationPoint = (SemanticVariationPoint)eResolveProxy(oldSemanticVariationPoint);
			if (semanticVariationPoint != oldSemanticVariationPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmPackage.LANGUAGE_FEATURE__SEMANTIC_VARIATION_POINT, oldSemanticVariationPoint, semanticVariationPoint));
			}
		}
		return semanticVariationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticVariationPoint basicGetSemanticVariationPoint() {
		return semanticVariationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemanticVariationPoint(SemanticVariationPoint newSemanticVariationPoint, NotificationChain msgs) {
		SemanticVariationPoint oldSemanticVariationPoint = semanticVariationPoint;
		semanticVariationPoint = newSemanticVariationPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmPackage.LANGUAGE_FEATURE__SEMANTIC_VARIATION_POINT, oldSemanticVariationPoint, newSemanticVariationPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemanticVariationPoint(SemanticVariationPoint newSemanticVariationPoint) {
		if (newSemanticVariationPoint != semanticVariationPoint) {
			NotificationChain msgs = null;
			if (semanticVariationPoint != null)
				msgs = ((InternalEObject)semanticVariationPoint).eInverseRemove(this, VmPackage.SEMANTIC_VARIATION_POINT__FEATURE, SemanticVariationPoint.class, msgs);
			if (newSemanticVariationPoint != null)
				msgs = ((InternalEObject)newSemanticVariationPoint).eInverseAdd(this, VmPackage.SEMANTIC_VARIATION_POINT__FEATURE, SemanticVariationPoint.class, msgs);
			msgs = basicSetSemanticVariationPoint(newSemanticVariationPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.LANGUAGE_FEATURE__SEMANTIC_VARIATION_POINT, newSemanticVariationPoint, newSemanticVariationPoint));
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
			case VmPackage.LANGUAGE_FEATURE__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case VmPackage.LANGUAGE_FEATURE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((LanguageFeature)otherEnd, msgs);
			case VmPackage.LANGUAGE_FEATURE__PARENT_GROUP:
				if (parentGroup != null)
					msgs = ((InternalEObject)parentGroup).eInverseRemove(this, VmPackage.LANGUAGE_FEATURE_GROUP__FEATURES, LanguageFeatureGroup.class, msgs);
				return basicSetParentGroup((LanguageFeatureGroup)otherEnd, msgs);
			case VmPackage.LANGUAGE_FEATURE__SEMANTIC_VARIATION_POINT:
				if (semanticVariationPoint != null)
					msgs = ((InternalEObject)semanticVariationPoint).eInverseRemove(this, VmPackage.SEMANTIC_VARIATION_POINT__FEATURE, SemanticVariationPoint.class, msgs);
				return basicSetSemanticVariationPoint((SemanticVariationPoint)otherEnd, msgs);
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
			case VmPackage.LANGUAGE_FEATURE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case VmPackage.LANGUAGE_FEATURE__PARENT:
				return basicSetParent(null, msgs);
			case VmPackage.LANGUAGE_FEATURE__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case VmPackage.LANGUAGE_FEATURE__PARENT_GROUP:
				return basicSetParentGroup(null, msgs);
			case VmPackage.LANGUAGE_FEATURE__SEMANTIC_VARIATION_POINT:
				return basicSetSemanticVariationPoint(null, msgs);
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
			case VmPackage.LANGUAGE_FEATURE__PARENT:
				return eInternalContainer().eInverseRemove(this, VmPackage.LANGUAGE_FEATURE__CHILDREN, LanguageFeature.class, msgs);
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
			case VmPackage.LANGUAGE_FEATURE__MANDATORY:
				return isMandatory();
			case VmPackage.LANGUAGE_FEATURE__CHILDREN:
				return getChildren();
			case VmPackage.LANGUAGE_FEATURE__PARENT:
				return getParent();
			case VmPackage.LANGUAGE_FEATURE__GROUPS:
				return getGroups();
			case VmPackage.LANGUAGE_FEATURE__PARENT_GROUP:
				if (resolve) return getParentGroup();
				return basicGetParentGroup();
			case VmPackage.LANGUAGE_FEATURE__IMPLEMENTATION_MODULE:
				if (resolve) return getImplementationModule();
				return basicGetImplementationModule();
			case VmPackage.LANGUAGE_FEATURE__SELECTED:
				return isSelected();
			case VmPackage.LANGUAGE_FEATURE__SEMANTIC_VARIATION_POINT:
				if (resolve) return getSemanticVariationPoint();
				return basicGetSemanticVariationPoint();
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
			case VmPackage.LANGUAGE_FEATURE__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case VmPackage.LANGUAGE_FEATURE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends LanguageFeature>)newValue);
				return;
			case VmPackage.LANGUAGE_FEATURE__PARENT:
				setParent((LanguageFeature)newValue);
				return;
			case VmPackage.LANGUAGE_FEATURE__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends LanguageFeatureGroup>)newValue);
				return;
			case VmPackage.LANGUAGE_FEATURE__PARENT_GROUP:
				setParentGroup((LanguageFeatureGroup)newValue);
				return;
			case VmPackage.LANGUAGE_FEATURE__IMPLEMENTATION_MODULE:
				setImplementationModule((LanguageModule)newValue);
				return;
			case VmPackage.LANGUAGE_FEATURE__SELECTED:
				setSelected((Boolean)newValue);
				return;
			case VmPackage.LANGUAGE_FEATURE__SEMANTIC_VARIATION_POINT:
				setSemanticVariationPoint((SemanticVariationPoint)newValue);
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
			case VmPackage.LANGUAGE_FEATURE__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case VmPackage.LANGUAGE_FEATURE__CHILDREN:
				getChildren().clear();
				return;
			case VmPackage.LANGUAGE_FEATURE__PARENT:
				setParent((LanguageFeature)null);
				return;
			case VmPackage.LANGUAGE_FEATURE__GROUPS:
				getGroups().clear();
				return;
			case VmPackage.LANGUAGE_FEATURE__PARENT_GROUP:
				setParentGroup((LanguageFeatureGroup)null);
				return;
			case VmPackage.LANGUAGE_FEATURE__IMPLEMENTATION_MODULE:
				setImplementationModule((LanguageModule)null);
				return;
			case VmPackage.LANGUAGE_FEATURE__SELECTED:
				setSelected(SELECTED_EDEFAULT);
				return;
			case VmPackage.LANGUAGE_FEATURE__SEMANTIC_VARIATION_POINT:
				setSemanticVariationPoint((SemanticVariationPoint)null);
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
			case VmPackage.LANGUAGE_FEATURE__MANDATORY:
				return mandatory != MANDATORY_EDEFAULT;
			case VmPackage.LANGUAGE_FEATURE__CHILDREN:
				return children != null && !children.isEmpty();
			case VmPackage.LANGUAGE_FEATURE__PARENT:
				return getParent() != null;
			case VmPackage.LANGUAGE_FEATURE__GROUPS:
				return groups != null && !groups.isEmpty();
			case VmPackage.LANGUAGE_FEATURE__PARENT_GROUP:
				return parentGroup != null;
			case VmPackage.LANGUAGE_FEATURE__IMPLEMENTATION_MODULE:
				return implementationModule != null;
			case VmPackage.LANGUAGE_FEATURE__SELECTED:
				return selected != SELECTED_EDEFAULT;
			case VmPackage.LANGUAGE_FEATURE__SEMANTIC_VARIATION_POINT:
				return semanticVariationPoint != null;
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
		result.append(", selected: ");
		result.append(selected);
		result.append(')');
		return result.toString();
	}

} //LanguageFeatureImpl

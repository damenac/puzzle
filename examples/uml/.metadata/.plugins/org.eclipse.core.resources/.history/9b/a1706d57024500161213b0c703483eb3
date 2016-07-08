/**
 */
package Classes.AssociationClasses.impl;

import Classes.AssociationClasses.AssociationClass;
import Classes.AssociationClasses.AssociationClassesPackage;

import Classes.Kernel.Association;
import Classes.Kernel.Element;
import Classes.Kernel.KernelPackage;
import Classes.Kernel.Property;
import Classes.Kernel.Relationship;

import Classes.Kernel.impl.ClassImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.AssociationClasses.impl.AssociationClassImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link Classes.AssociationClasses.impl.AssociationClassImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link Classes.AssociationClasses.impl.AssociationClassImpl#getNavigableOwnedEnd <em>Navigable Owned End</em>}</li>
 *   <li>{@link Classes.AssociationClasses.impl.AssociationClassImpl#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link Classes.AssociationClasses.impl.AssociationClassImpl#getOwnedEnd <em>Owned End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationClassImpl extends ClassImpl implements AssociationClass {
	/**
	 * The cached value of the '{@link #getRelatedElement() <em>Related Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> relatedElement;

	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNavigableOwnedEnd() <em>Navigable Owned End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigableOwnedEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> navigableOwnedEnd;

	/**
	 * The cached value of the '{@link #getMemberEnd() <em>Member End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> memberEnd;

	/**
	 * The cached value of the '{@link #getOwnedEnd() <em>Owned End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssociationClassesPackage.Literals.ASSOCIATION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelatedElement() {
		if (relatedElement == null) {
			relatedElement = new EObjectResolvingEList<Element>(Element.class, this, AssociationClassesPackage.ASSOCIATION_CLASS__RELATED_ELEMENT);
		}
		return relatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssociationClassesPackage.ASSOCIATION_CLASS__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getNavigableOwnedEnd() {
		if (navigableOwnedEnd == null) {
			navigableOwnedEnd = new EObjectResolvingEList<Property>(Property.class, this, AssociationClassesPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END);
		}
		return navigableOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getMemberEnd() {
		if (memberEnd == null) {
			memberEnd = new EObjectWithInverseResolvingEList<Property>(Property.class, this, AssociationClassesPackage.ASSOCIATION_CLASS__MEMBER_END, KernelPackage.PROPERTY__ASSOCIATION);
		}
		return memberEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedEnd() {
		if (ownedEnd == null) {
			ownedEnd = new EObjectContainmentWithInverseEList<Property>(Property.class, this, AssociationClassesPackage.ASSOCIATION_CLASS__OWNED_END, KernelPackage.PROPERTY__OWNING_ASSOCIATION);
		}
		return ownedEnd;
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
			case AssociationClassesPackage.ASSOCIATION_CLASS__MEMBER_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemberEnd()).basicAdd(otherEnd, msgs);
			case AssociationClassesPackage.ASSOCIATION_CLASS__OWNED_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedEnd()).basicAdd(otherEnd, msgs);
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
			case AssociationClassesPackage.ASSOCIATION_CLASS__MEMBER_END:
				return ((InternalEList<?>)getMemberEnd()).basicRemove(otherEnd, msgs);
			case AssociationClassesPackage.ASSOCIATION_CLASS__OWNED_END:
				return ((InternalEList<?>)getOwnedEnd()).basicRemove(otherEnd, msgs);
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
			case AssociationClassesPackage.ASSOCIATION_CLASS__RELATED_ELEMENT:
				return getRelatedElement();
			case AssociationClassesPackage.ASSOCIATION_CLASS__IS_DERIVED:
				return isIsDerived();
			case AssociationClassesPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END:
				return getNavigableOwnedEnd();
			case AssociationClassesPackage.ASSOCIATION_CLASS__MEMBER_END:
				return getMemberEnd();
			case AssociationClassesPackage.ASSOCIATION_CLASS__OWNED_END:
				return getOwnedEnd();
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
			case AssociationClassesPackage.ASSOCIATION_CLASS__RELATED_ELEMENT:
				getRelatedElement().clear();
				getRelatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case AssociationClassesPackage.ASSOCIATION_CLASS__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case AssociationClassesPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END:
				getNavigableOwnedEnd().clear();
				getNavigableOwnedEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case AssociationClassesPackage.ASSOCIATION_CLASS__MEMBER_END:
				getMemberEnd().clear();
				getMemberEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case AssociationClassesPackage.ASSOCIATION_CLASS__OWNED_END:
				getOwnedEnd().clear();
				getOwnedEnd().addAll((Collection<? extends Property>)newValue);
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
			case AssociationClassesPackage.ASSOCIATION_CLASS__RELATED_ELEMENT:
				getRelatedElement().clear();
				return;
			case AssociationClassesPackage.ASSOCIATION_CLASS__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case AssociationClassesPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END:
				getNavigableOwnedEnd().clear();
				return;
			case AssociationClassesPackage.ASSOCIATION_CLASS__MEMBER_END:
				getMemberEnd().clear();
				return;
			case AssociationClassesPackage.ASSOCIATION_CLASS__OWNED_END:
				getOwnedEnd().clear();
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
			case AssociationClassesPackage.ASSOCIATION_CLASS__RELATED_ELEMENT:
				return relatedElement != null && !relatedElement.isEmpty();
			case AssociationClassesPackage.ASSOCIATION_CLASS__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case AssociationClassesPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END:
				return navigableOwnedEnd != null && !navigableOwnedEnd.isEmpty();
			case AssociationClassesPackage.ASSOCIATION_CLASS__MEMBER_END:
				return memberEnd != null && !memberEnd.isEmpty();
			case AssociationClassesPackage.ASSOCIATION_CLASS__OWNED_END:
				return ownedEnd != null && !ownedEnd.isEmpty();
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
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case AssociationClassesPackage.ASSOCIATION_CLASS__RELATED_ELEMENT: return KernelPackage.RELATIONSHIP__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (derivedFeatureID) {
				case AssociationClassesPackage.ASSOCIATION_CLASS__IS_DERIVED: return KernelPackage.ASSOCIATION__IS_DERIVED;
				case AssociationClassesPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END: return KernelPackage.ASSOCIATION__NAVIGABLE_OWNED_END;
				case AssociationClassesPackage.ASSOCIATION_CLASS__MEMBER_END: return KernelPackage.ASSOCIATION__MEMBER_END;
				case AssociationClassesPackage.ASSOCIATION_CLASS__OWNED_END: return KernelPackage.ASSOCIATION__OWNED_END;
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
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case KernelPackage.RELATIONSHIP__RELATED_ELEMENT: return AssociationClassesPackage.ASSOCIATION_CLASS__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseFeatureID) {
				case KernelPackage.ASSOCIATION__IS_DERIVED: return AssociationClassesPackage.ASSOCIATION_CLASS__IS_DERIVED;
				case KernelPackage.ASSOCIATION__NAVIGABLE_OWNED_END: return AssociationClassesPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END;
				case KernelPackage.ASSOCIATION__MEMBER_END: return AssociationClassesPackage.ASSOCIATION_CLASS__MEMBER_END;
				case KernelPackage.ASSOCIATION__OWNED_END: return AssociationClassesPackage.ASSOCIATION_CLASS__OWNED_END;
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
		result.append(" (isDerived: ");
		result.append(isDerived);
		result.append(')');
		return result.toString();
	}

} //AssociationClassImpl

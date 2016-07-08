/**
 */
package Classes.impl;

import Classes.ClassesPackage;
import Classes.Dependency;
import Classes.DirectedRelationship;
import Classes.Element;
import Classes.NamedElement;
import Classes.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.DependencyImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link Classes.impl.DependencyImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link Classes.impl.DependencyImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Classes.impl.DependencyImpl#getClient <em>Client</em>}</li>
 *   <li>{@link Classes.impl.DependencyImpl#getSupplier <em>Supplier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyImpl extends PackageableElementImpl implements Dependency {
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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> source;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> client;

	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> supplier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelatedElement() {
		if (relatedElement == null) {
			relatedElement = new EObjectResolvingEList<Element>(Element.class, this, ClassesPackage.DEPENDENCY__RELATED_ELEMENT);
		}
		return relatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<Element>(Element.class, this, ClassesPackage.DEPENDENCY__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<Element>(Element.class, this, ClassesPackage.DEPENDENCY__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getClient() {
		if (client == null) {
			client = new EObjectWithInverseResolvingEList.ManyInverse<NamedElement>(NamedElement.class, this, ClassesPackage.DEPENDENCY__CLIENT, ClassesPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY);
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getSupplier() {
		if (supplier == null) {
			supplier = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, ClassesPackage.DEPENDENCY__SUPPLIER);
		}
		return supplier;
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
			case ClassesPackage.DEPENDENCY__CLIENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClient()).basicAdd(otherEnd, msgs);
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
			case ClassesPackage.DEPENDENCY__CLIENT:
				return ((InternalEList<?>)getClient()).basicRemove(otherEnd, msgs);
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
			case ClassesPackage.DEPENDENCY__RELATED_ELEMENT:
				return getRelatedElement();
			case ClassesPackage.DEPENDENCY__TARGET:
				return getTarget();
			case ClassesPackage.DEPENDENCY__SOURCE:
				return getSource();
			case ClassesPackage.DEPENDENCY__CLIENT:
				return getClient();
			case ClassesPackage.DEPENDENCY__SUPPLIER:
				return getSupplier();
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
			case ClassesPackage.DEPENDENCY__RELATED_ELEMENT:
				getRelatedElement().clear();
				getRelatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case ClassesPackage.DEPENDENCY__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Element>)newValue);
				return;
			case ClassesPackage.DEPENDENCY__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Element>)newValue);
				return;
			case ClassesPackage.DEPENDENCY__CLIENT:
				getClient().clear();
				getClient().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case ClassesPackage.DEPENDENCY__SUPPLIER:
				getSupplier().clear();
				getSupplier().addAll((Collection<? extends NamedElement>)newValue);
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
			case ClassesPackage.DEPENDENCY__RELATED_ELEMENT:
				getRelatedElement().clear();
				return;
			case ClassesPackage.DEPENDENCY__TARGET:
				getTarget().clear();
				return;
			case ClassesPackage.DEPENDENCY__SOURCE:
				getSource().clear();
				return;
			case ClassesPackage.DEPENDENCY__CLIENT:
				getClient().clear();
				return;
			case ClassesPackage.DEPENDENCY__SUPPLIER:
				getSupplier().clear();
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
			case ClassesPackage.DEPENDENCY__RELATED_ELEMENT:
				return relatedElement != null && !relatedElement.isEmpty();
			case ClassesPackage.DEPENDENCY__TARGET:
				return target != null && !target.isEmpty();
			case ClassesPackage.DEPENDENCY__SOURCE:
				return source != null && !source.isEmpty();
			case ClassesPackage.DEPENDENCY__CLIENT:
				return client != null && !client.isEmpty();
			case ClassesPackage.DEPENDENCY__SUPPLIER:
				return supplier != null && !supplier.isEmpty();
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
				case ClassesPackage.DEPENDENCY__RELATED_ELEMENT: return ClassesPackage.RELATIONSHIP__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (derivedFeatureID) {
				case ClassesPackage.DEPENDENCY__TARGET: return ClassesPackage.DIRECTED_RELATIONSHIP__TARGET;
				case ClassesPackage.DEPENDENCY__SOURCE: return ClassesPackage.DIRECTED_RELATIONSHIP__SOURCE;
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
				case ClassesPackage.RELATIONSHIP__RELATED_ELEMENT: return ClassesPackage.DEPENDENCY__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (baseFeatureID) {
				case ClassesPackage.DIRECTED_RELATIONSHIP__TARGET: return ClassesPackage.DEPENDENCY__TARGET;
				case ClassesPackage.DIRECTED_RELATIONSHIP__SOURCE: return ClassesPackage.DEPENDENCY__SOURCE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DependencyImpl

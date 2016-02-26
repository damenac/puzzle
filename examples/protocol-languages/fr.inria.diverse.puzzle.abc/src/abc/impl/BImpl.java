/**
 */
package abc.impl;

import abc.AbcPackage;
import abc.B;
import abc.C;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xyz.X;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link abc.impl.BImpl#getCes <em>Ces</em>}</li>
 *   <li>{@link abc.impl.BImpl#getXes <em>Xes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BImpl extends MinimalEObjectImpl.Container implements B {
	/**
	 * The cached value of the '{@link #getCes() <em>Ces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCes()
	 * @generated
	 * @ordered
	 */
	protected EList<C> ces;

	/**
	 * The cached value of the '{@link #getXes() <em>Xes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXes()
	 * @generated
	 * @ordered
	 */
	protected EList<X> xes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbcPackage.Literals.B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<C> getCes() {
		if (ces == null) {
			ces = new EObjectContainmentEList<C>(C.class, this, AbcPackage.B__CES);
		}
		return ces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<X> getXes() {
		if (xes == null) {
			xes = new EObjectContainmentEList<X>(X.class, this, AbcPackage.B__XES);
		}
		return xes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbcPackage.B__CES:
				return ((InternalEList<?>)getCes()).basicRemove(otherEnd, msgs);
			case AbcPackage.B__XES:
				return ((InternalEList<?>)getXes()).basicRemove(otherEnd, msgs);
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
			case AbcPackage.B__CES:
				return getCes();
			case AbcPackage.B__XES:
				return getXes();
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
			case AbcPackage.B__CES:
				getCes().clear();
				getCes().addAll((Collection<? extends C>)newValue);
				return;
			case AbcPackage.B__XES:
				getXes().clear();
				getXes().addAll((Collection<? extends X>)newValue);
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
			case AbcPackage.B__CES:
				getCes().clear();
				return;
			case AbcPackage.B__XES:
				getXes().clear();
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
			case AbcPackage.B__CES:
				return ces != null && !ces.isEmpty();
			case AbcPackage.B__XES:
				return xes != null && !xes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BImpl

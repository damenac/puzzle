/**
 */
package vm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vm.OrthogonalVariabilityModel;
import vm.SemanticVariationPoint;
import vm.VmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orthogonal Variability Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vm.impl.OrthogonalVariabilityModelImpl#getSemanticVariationPoints <em>Semantic Variation Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrthogonalVariabilityModelImpl extends MinimalEObjectImpl.Container implements OrthogonalVariabilityModel {
	/**
	 * The cached value of the '{@link #getSemanticVariationPoints() <em>Semantic Variation Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticVariationPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticVariationPoint> semanticVariationPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrthogonalVariabilityModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmPackage.Literals.ORTHOGONAL_VARIABILITY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticVariationPoint> getSemanticVariationPoints() {
		if (semanticVariationPoints == null) {
			semanticVariationPoints = new EObjectContainmentEList<SemanticVariationPoint>(SemanticVariationPoint.class, this, VmPackage.ORTHOGONAL_VARIABILITY_MODEL__SEMANTIC_VARIATION_POINTS);
		}
		return semanticVariationPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VmPackage.ORTHOGONAL_VARIABILITY_MODEL__SEMANTIC_VARIATION_POINTS:
				return ((InternalEList<?>)getSemanticVariationPoints()).basicRemove(otherEnd, msgs);
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
			case VmPackage.ORTHOGONAL_VARIABILITY_MODEL__SEMANTIC_VARIATION_POINTS:
				return getSemanticVariationPoints();
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
			case VmPackage.ORTHOGONAL_VARIABILITY_MODEL__SEMANTIC_VARIATION_POINTS:
				getSemanticVariationPoints().clear();
				getSemanticVariationPoints().addAll((Collection<? extends SemanticVariationPoint>)newValue);
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
			case VmPackage.ORTHOGONAL_VARIABILITY_MODEL__SEMANTIC_VARIATION_POINTS:
				getSemanticVariationPoints().clear();
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
			case VmPackage.ORTHOGONAL_VARIABILITY_MODEL__SEMANTIC_VARIATION_POINTS:
				return semanticVariationPoints != null && !semanticVariationPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrthogonalVariabilityModelImpl

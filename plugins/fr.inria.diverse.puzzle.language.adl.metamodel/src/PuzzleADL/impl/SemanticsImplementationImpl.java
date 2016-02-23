/**
 */
package PuzzleADL.impl;

import PuzzleADL.PuzzleADLPackage;
import PuzzleADL.SemanticsImplementation;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantics Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link PuzzleADL.impl.SemanticsImplementationImpl#getAspectsIdentifiers <em>Aspects Identifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SemanticsImplementationImpl extends MinimalEObjectImpl.Container implements SemanticsImplementation {
	/**
	 * The cached value of the '{@link #getAspectsIdentifiers() <em>Aspects Identifiers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectsIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> aspectsIdentifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticsImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PuzzleADLPackage.Literals.SEMANTICS_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAspectsIdentifiers() {
		if (aspectsIdentifiers == null) {
			aspectsIdentifiers = new EDataTypeUniqueEList<String>(String.class, this, PuzzleADLPackage.SEMANTICS_IMPLEMENTATION__ASPECTS_IDENTIFIERS);
		}
		return aspectsIdentifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PuzzleADLPackage.SEMANTICS_IMPLEMENTATION__ASPECTS_IDENTIFIERS:
				return getAspectsIdentifiers();
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
			case PuzzleADLPackage.SEMANTICS_IMPLEMENTATION__ASPECTS_IDENTIFIERS:
				getAspectsIdentifiers().clear();
				getAspectsIdentifiers().addAll((Collection<? extends String>)newValue);
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
			case PuzzleADLPackage.SEMANTICS_IMPLEMENTATION__ASPECTS_IDENTIFIERS:
				getAspectsIdentifiers().clear();
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
			case PuzzleADLPackage.SEMANTICS_IMPLEMENTATION__ASPECTS_IDENTIFIERS:
				return aspectsIdentifiers != null && !aspectsIdentifiers.isEmpty();
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
		result.append(" (aspectsIdentifiers: ");
		result.append(aspectsIdentifiers);
		result.append(')');
		return result.toString();
	}

} //SemanticsImplementationImpl

/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.GeneralOrdering;
import CompleteDSLPckg.OccurenceSpecification;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occurence Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompleteDSLPckg.impl.OccurenceSpecificationImpl#getToBefore <em>To Before</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.OccurenceSpecificationImpl#getToAfter <em>To After</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OccurenceSpecificationImpl extends InteractionFragmentImpl implements OccurenceSpecification {
	/**
	 * The cached value of the '{@link #getToBefore() <em>To Before</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBefore()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralOrdering> toBefore;

	/**
	 * The cached value of the '{@link #getToAfter() <em>To After</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAfter()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralOrdering> toAfter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccurenceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteDSLPckgPackage.eINSTANCE.getOccurenceSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getToBefore() {
		if (toBefore == null) {
			toBefore = new EObjectResolvingEList<GeneralOrdering>(GeneralOrdering.class, this, CompleteDSLPckgPackage.OCCURENCE_SPECIFICATION__TO_BEFORE);
		}
		return toBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getToAfter() {
		if (toAfter == null) {
			toAfter = new EObjectResolvingEList<GeneralOrdering>(GeneralOrdering.class, this, CompleteDSLPckgPackage.OCCURENCE_SPECIFICATION__TO_AFTER);
		}
		return toAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompleteDSLPckgPackage.OCCURENCE_SPECIFICATION__TO_BEFORE:
				return getToBefore();
			case CompleteDSLPckgPackage.OCCURENCE_SPECIFICATION__TO_AFTER:
				return getToAfter();
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
			case CompleteDSLPckgPackage.OCCURENCE_SPECIFICATION__TO_BEFORE:
				getToBefore().clear();
				getToBefore().addAll((Collection<? extends GeneralOrdering>)newValue);
				return;
			case CompleteDSLPckgPackage.OCCURENCE_SPECIFICATION__TO_AFTER:
				getToAfter().clear();
				getToAfter().addAll((Collection<? extends GeneralOrdering>)newValue);
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
			case CompleteDSLPckgPackage.OCCURENCE_SPECIFICATION__TO_BEFORE:
				getToBefore().clear();
				return;
			case CompleteDSLPckgPackage.OCCURENCE_SPECIFICATION__TO_AFTER:
				getToAfter().clear();
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
			case CompleteDSLPckgPackage.OCCURENCE_SPECIFICATION__TO_BEFORE:
				return toBefore != null && !toBefore.isEmpty();
			case CompleteDSLPckgPackage.OCCURENCE_SPECIFICATION__TO_AFTER:
				return toAfter != null && !toAfter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OccurenceSpecificationImpl

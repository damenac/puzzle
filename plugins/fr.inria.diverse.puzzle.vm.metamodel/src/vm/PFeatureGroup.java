/**
 */
package vm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PFeature Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vm.PFeatureGroup#getFeatures <em>Features</em>}</li>
 *   <li>{@link vm.PFeatureGroup#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see vm.VmPackage#getPFeatureGroup()
 * @model
 * @generated
 */
public interface PFeatureGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link vm.PFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see vm.VmPackage#getPFeatureGroup_Features()
	 * @model required="true"
	 * @generated
	 */
	EList<PFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link vm.PGroupKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see vm.PGroupKind
	 * @see #setKind(PGroupKind)
	 * @see vm.VmPackage#getPFeatureGroup_Kind()
	 * @model
	 * @generated
	 */
	PGroupKind getKind();

	/**
	 * Sets the value of the '{@link vm.PFeatureGroup#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see vm.PGroupKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PGroupKind value);

} // PFeatureGroup

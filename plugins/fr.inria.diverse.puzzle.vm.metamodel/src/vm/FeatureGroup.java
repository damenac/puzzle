/**
 */
package vm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vm.FeatureGroup#getFeatures <em>Features</em>}</li>
 *   <li>{@link vm.FeatureGroup#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see vm.VmPackage#getFeatureGroup()
 * @model
 * @generated
 */
public interface FeatureGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link vm.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see vm.VmPackage#getFeatureGroup_Features()
	 * @model required="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link vm.GroupKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see vm.GroupKind
	 * @see #setKind(GroupKind)
	 * @see vm.VmPackage#getFeatureGroup_Kind()
	 * @model
	 * @generated
	 */
	GroupKind getKind();

	/**
	 * Sets the value of the '{@link vm.FeatureGroup#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see vm.GroupKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(GroupKind value);

} // FeatureGroup

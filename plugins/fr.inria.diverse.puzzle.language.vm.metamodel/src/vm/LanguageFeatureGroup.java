/**
 */
package vm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Feature Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vm.LanguageFeatureGroup#getFeatures <em>Features</em>}</li>
 *   <li>{@link vm.LanguageFeatureGroup#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see vm.VmPackage#getLanguageFeatureGroup()
 * @model
 * @generated
 */
public interface LanguageFeatureGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link vm.LanguageFeature}.
	 * It is bidirectional and its opposite is '{@link vm.LanguageFeature#getParentGroup <em>Parent Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see vm.VmPackage#getLanguageFeatureGroup_Features()
	 * @see vm.LanguageFeature#getParentGroup
	 * @model opposite="parentGroup" required="true"
	 * @generated
	 */
	EList<LanguageFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(LanguageFeatureGroupCardinality)
	 * @see vm.VmPackage#getLanguageFeatureGroup_Cardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LanguageFeatureGroupCardinality getCardinality();

	/**
	 * Sets the value of the '{@link vm.LanguageFeatureGroup#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(LanguageFeatureGroupCardinality value);

} // LanguageFeatureGroup

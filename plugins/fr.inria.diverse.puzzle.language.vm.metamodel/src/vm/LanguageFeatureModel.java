/**
 */
package vm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Feature Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vm.LanguageFeatureModel#getRootFeature <em>Root Feature</em>}</li>
 *   <li>{@link vm.LanguageFeatureModel#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see vm.VmPackage#getLanguageFeatureModel()
 * @model
 * @generated
 */
public interface LanguageFeatureModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Root Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Feature</em>' containment reference.
	 * @see #setRootFeature(LanguageFeature)
	 * @see vm.VmPackage#getLanguageFeatureModel_RootFeature()
	 * @model containment="true"
	 * @generated
	 */
	LanguageFeature getRootFeature();

	/**
	 * Sets the value of the '{@link vm.LanguageFeatureModel#getRootFeature <em>Root Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Feature</em>' containment reference.
	 * @see #getRootFeature()
	 * @generated
	 */
	void setRootFeature(LanguageFeature value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link vm.LanguageConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see vm.VmPackage#getLanguageFeatureModel_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<LanguageConstraint> getConstraints();

} // LanguageFeatureModel

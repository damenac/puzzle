/**
 */
package Multivar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Line Variability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Multivar.ProductLineVariability#getRootFeature <em>Root Feature</em>}</li>
 *   <li>{@link Multivar.ProductLineVariability#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see Multivar.MultivarPackage#getProductLineVariability()
 * @model
 * @generated
 */
public interface ProductLineVariability extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Feature</em>' reference.
	 * @see #setRootFeature(LanguageFeature)
	 * @see Multivar.MultivarPackage#getProductLineVariability_RootFeature()
	 * @model required="true"
	 * @generated
	 */
	LanguageFeature getRootFeature();

	/**
	 * Sets the value of the '{@link Multivar.ProductLineVariability#getRootFeature <em>Root Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Feature</em>' reference.
	 * @see #getRootFeature()
	 * @generated
	 */
	void setRootFeature(LanguageFeature value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link Multivar.LanguageFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see Multivar.MultivarPackage#getProductLineVariability_Features()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LanguageFeature> getFeatures();

} // ProductLineVariability

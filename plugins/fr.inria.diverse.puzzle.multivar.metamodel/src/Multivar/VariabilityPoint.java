/**
 */
package Multivar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variability Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Multivar.VariabilityPoint#getVariations <em>Variations</em>}</li>
 *   <li>{@link Multivar.VariabilityPoint#getInvolvedFeatures <em>Involved Features</em>}</li>
 *   <li>{@link Multivar.VariabilityPoint#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see Multivar.MultivarPackage#getVariabilityPoint()
 * @model
 * @generated
 */
public interface VariabilityPoint extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Variations</b></em>' containment reference list.
	 * The list contents are of type {@link Multivar.Variation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variations</em>' containment reference list.
	 * @see Multivar.MultivarPackage#getVariabilityPoint_Variations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Variation> getVariations();

	/**
	 * Returns the value of the '<em><b>Involved Features</b></em>' reference list.
	 * The list contents are of type {@link Multivar.LanguageFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved Features</em>' reference list.
	 * @see Multivar.MultivarPackage#getVariabilityPoint_InvolvedFeatures()
	 * @model
	 * @generated
	 */
	EList<LanguageFeature> getInvolvedFeatures();

	/**
	 * Returns the value of the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' reference.
	 * @see #setDefault(Variation)
	 * @see Multivar.MultivarPackage#getVariabilityPoint_Default()
	 * @model required="true"
	 * @generated
	 */
	Variation getDefault();

	/**
	 * Sets the value of the '{@link Multivar.VariabilityPoint#getDefault <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(Variation value);

} // VariabilityPoint

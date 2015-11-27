/**
 */
package Multivar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional Child</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Multivar.OptionalChild#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see Multivar.MultivarPackage#getOptionalChild()
 * @model
 * @generated
 */
public interface OptionalChild extends Relation {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(LanguageFeature)
	 * @see Multivar.MultivarPackage#getOptionalChild_Feature()
	 * @model required="true"
	 * @generated
	 */
	LanguageFeature getFeature();

	/**
	 * Sets the value of the '{@link Multivar.OptionalChild#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(LanguageFeature value);

} // OptionalChild

/**
 */
package vm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Feature Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vm.LanguageFeatureRef#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see vm.VmPackage#getLanguageFeatureRef()
 * @model
 * @generated
 */
public interface LanguageFeatureRef extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(LanguageFeature)
	 * @see vm.VmPackage#getLanguageFeatureRef_Ref()
	 * @model
	 * @generated
	 */
	LanguageFeature getRef();

	/**
	 * Sets the value of the '{@link vm.LanguageFeatureRef#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(LanguageFeature value);

} // LanguageFeatureRef

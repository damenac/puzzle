/**
 */
package Multivar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Multivar.Variation#getModule <em>Module</em>}</li>
 *   <li>{@link Multivar.Variation#isDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see Multivar.MultivarPackage#getVariation()
 * @model
 * @generated
 */
public interface Variation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' attribute.
	 * @see #setModule(String)
	 * @see Multivar.MultivarPackage#getVariation_Module()
	 * @model
	 * @generated
	 */
	String getModule();

	/**
	 * Sets the value of the '{@link Multivar.Variation#getModule <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' attribute.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(String value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(boolean)
	 * @see Multivar.MultivarPackage#getVariation_Default()
	 * @model
	 * @generated
	 */
	boolean isDefault();

	/**
	 * Sets the value of the '{@link Multivar.Variation#isDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #isDefault()
	 * @generated
	 */
	void setDefault(boolean value);

} // Variation

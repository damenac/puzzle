/**
 */
package vm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vm.LanguageModule#getAs <em>As</em>}</li>
 *   <li>{@link vm.LanguageModule#getSem <em>Sem</em>}</li>
 * </ul>
 * </p>
 *
 * @see vm.VmPackage#getLanguageModule()
 * @model
 * @generated
 */
public interface LanguageModule extends PNamedElement {
	/**
	 * Returns the value of the '<em><b>As</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As</em>' containment reference.
	 * @see #setAs(AbstractSyntax)
	 * @see vm.VmPackage#getLanguageModule_As()
	 * @model containment="true"
	 * @generated
	 */
	AbstractSyntax getAs();

	/**
	 * Sets the value of the '{@link vm.LanguageModule#getAs <em>As</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As</em>' containment reference.
	 * @see #getAs()
	 * @generated
	 */
	void setAs(AbstractSyntax value);

	/**
	 * Returns the value of the '<em><b>Sem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sem</em>' containment reference.
	 * @see #setSem(Semantics)
	 * @see vm.VmPackage#getLanguageModule_Sem()
	 * @model containment="true"
	 * @generated
	 */
	Semantics getSem();

	/**
	 * Sets the value of the '{@link vm.LanguageModule#getSem <em>Sem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sem</em>' containment reference.
	 * @see #getSem()
	 * @generated
	 */
	void setSem(Semantics value);

} // LanguageModule

/**
 */
package vm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PLanguage Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vm.PLanguageModule#getAs <em>As</em>}</li>
 *   <li>{@link vm.PLanguageModule#getSem <em>Sem</em>}</li>
 * </ul>
 * </p>
 *
 * @see vm.VmPackage#getPLanguageModule()
 * @model
 * @generated
 */
public interface PLanguageModule extends PNamedElement {
	/**
	 * Returns the value of the '<em><b>As</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As</em>' containment reference.
	 * @see #setAs(PAbstractSyntax)
	 * @see vm.VmPackage#getPLanguageModule_As()
	 * @model containment="true"
	 * @generated
	 */
	PAbstractSyntax getAs();

	/**
	 * Sets the value of the '{@link vm.PLanguageModule#getAs <em>As</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As</em>' containment reference.
	 * @see #getAs()
	 * @generated
	 */
	void setAs(PAbstractSyntax value);

	/**
	 * Returns the value of the '<em><b>Sem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sem</em>' containment reference.
	 * @see #setSem(PSemantics)
	 * @see vm.VmPackage#getPLanguageModule_Sem()
	 * @model containment="true"
	 * @generated
	 */
	PSemantics getSem();

	/**
	 * Sets the value of the '{@link vm.PLanguageModule#getSem <em>Sem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sem</em>' containment reference.
	 * @see #getSem()
	 * @generated
	 */
	void setSem(PSemantics value);

} // PLanguageModule

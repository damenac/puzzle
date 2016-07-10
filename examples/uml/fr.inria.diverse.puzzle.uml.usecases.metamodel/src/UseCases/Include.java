/**
 */
package UseCases;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UseCases.Include#getIncludingCase <em>Including Case</em>}</li>
 *   <li>{@link UseCases.Include#getAddition <em>Addition</em>}</li>
 * </ul>
 * </p>
 *
 * @see UseCases.UseCasesPackage#getInclude()
 * @model
 * @generated
 */
public interface Include extends DirectedRelationship, NamedElement {
	/**
	 * Returns the value of the '<em><b>Including Case</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UseCases.UseCase#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Including Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Including Case</em>' reference.
	 * @see #setIncludingCase(UseCase)
	 * @see UseCases.UseCasesPackage#getInclude_IncludingCase()
	 * @see UseCases.UseCase#getInclude
	 * @model opposite="include" required="true"
	 * @generated
	 */
	UseCase getIncludingCase();

	/**
	 * Sets the value of the '{@link UseCases.Include#getIncludingCase <em>Including Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Including Case</em>' reference.
	 * @see #getIncludingCase()
	 * @generated
	 */
	void setIncludingCase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Addition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addition</em>' reference.
	 * @see #setAddition(UseCase)
	 * @see UseCases.UseCasesPackage#getInclude_Addition()
	 * @model required="true"
	 * @generated
	 */
	UseCase getAddition();

	/**
	 * Sets the value of the '{@link UseCases.Include#getAddition <em>Addition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addition</em>' reference.
	 * @see #getAddition()
	 * @generated
	 */
	void setAddition(UseCase value);

} // Include

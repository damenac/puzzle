/**
 */
package fmpl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fmpl.Cond#getIf <em>If</em>}</li>
 *   <li>{@link fmpl.Cond#getThen <em>Then</em>}</li>
 * </ul>
 * </p>
 *
 * @see fmpl.FmplPackage#getCond()
 * @model
 * @generated
 */
public interface Cond extends Expression {
	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(Relational)
	 * @see fmpl.FmplPackage#getCond_If()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Relational getIf();

	/**
	 * Sets the value of the '{@link fmpl.Cond#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(Relational value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(Expression)
	 * @see fmpl.FmplPackage#getCond_Then()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getThen();

	/**
	 * Sets the value of the '{@link fmpl.Cond#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(Expression value);

} // Cond

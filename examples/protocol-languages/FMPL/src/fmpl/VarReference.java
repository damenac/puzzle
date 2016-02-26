/**
 */
package fmpl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fmpl.VarReference#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fmpl.FmplPackage#getVarReference()
 * @model
 * @generated
 */
public interface VarReference extends Expression {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(VarDeclaration)
	 * @see fmpl.FmplPackage#getVarReference_Name()
	 * @model
	 * @generated
	 */
	VarDeclaration getName();

	/**
	 * Sets the value of the '{@link fmpl.VarReference#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(VarDeclaration value);

} // VarReference

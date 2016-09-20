/**
 */
package Variables;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Variables.Assignation#getRef <em>Ref</em>}</li>
 *   <li>{@link Variables.Assignation#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see Variables.VariablesPackage#getAssignation()
 * @model
 * @generated
 */
public interface Assignation extends Instruction {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(VarDecl)
	 * @see Variables.VariablesPackage#getAssignation_Ref()
	 * @model required="true"
	 * @generated
	 */
	VarDecl getRef();

	/**
	 * Sets the value of the '{@link Variables.Assignation#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(VarDecl value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see Variables.VariablesPackage#getAssignation_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link Variables.Assignation#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

} // Assignation

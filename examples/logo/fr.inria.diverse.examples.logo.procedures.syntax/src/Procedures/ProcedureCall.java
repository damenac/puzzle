/**
 */
package Procedures;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Procedures.ProcedureCall#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see Procedures.ProceduresPackage#getProcedureCall()
 * @model
 * @generated
 */
public interface ProcedureCall extends Expression {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Procedure)
	 * @see Procedures.ProceduresPackage#getProcedureCall_Ref()
	 * @model
	 * @generated
	 */
	Procedure getRef();

	/**
	 * Sets the value of the '{@link Procedures.ProcedureCall#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Procedure value);

} // ProcedureCall

/**
 */
package fmpl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fmpl.Write#getInitBit <em>Init Bit</em>}</li>
 *   <li>{@link fmpl.Write#getLength <em>Length</em>}</li>
 *   <li>{@link fmpl.Write#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see fmpl.FmplPackage#getWrite()
 * @model
 * @generated
 */
public interface Write extends Expression {
	/**
	 * Returns the value of the '<em><b>Init Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Bit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Bit</em>' attribute.
	 * @see #setInitBit(int)
	 * @see fmpl.FmplPackage#getWrite_InitBit()
	 * @model required="true"
	 * @generated
	 */
	int getInitBit();

	/**
	 * Sets the value of the '{@link fmpl.Write#getInitBit <em>Init Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Bit</em>' attribute.
	 * @see #getInitBit()
	 * @generated
	 */
	void setInitBit(int value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see fmpl.FmplPackage#getWrite_Length()
	 * @model required="true"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link fmpl.Write#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' reference.
	 * @see #setVar(VarReference)
	 * @see fmpl.FmplPackage#getWrite_Var()
	 * @model required="true"
	 * @generated
	 */
	VarReference getVar();

	/**
	 * Sets the value of the '{@link fmpl.Write#getVar <em>Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(VarReference value);

} // Write

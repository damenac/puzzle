/**
 */
package fmpl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fmpl.Read#getInitBit <em>Init Bit</em>}</li>
 *   <li>{@link fmpl.Read#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see fmpl.FmplPackage#getRead()
 * @model
 * @generated
 */
public interface Read extends Expression {
	/**
	 * Returns the value of the '<em><b>Init Bit</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Bit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Bit</em>' attribute.
	 * @see #setInitBit(int)
	 * @see fmpl.FmplPackage#getRead_InitBit()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getInitBit();

	/**
	 * Sets the value of the '{@link fmpl.Read#getInitBit <em>Init Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Bit</em>' attribute.
	 * @see #getInitBit()
	 * @generated
	 */
	void setInitBit(int value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see fmpl.FmplPackage#getRead_Length()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link fmpl.Read#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

} // Read

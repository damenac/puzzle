/**
 */
package Logo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetic Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Logo.ArithmeticExpr#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see Logo.LogoPackage#getArithmeticExpr()
 * @model
 * @generated
 */
public interface ArithmeticExpr extends BinaryExpr {

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link Logo.ArithmeticOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see Logo.ArithmeticOperator
	 * @see #setOperator(ArithmeticOperator)
	 * @see Logo.LogoPackage#getArithmeticExpr_Operator()
	 * @model
	 * @generated
	 */
	ArithmeticOperator getOperator();

	/**
	 * Sets the value of the '{@link Logo.ArithmeticExpr#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see Logo.ArithmeticOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ArithmeticOperator value);
} // ArithmeticExpr

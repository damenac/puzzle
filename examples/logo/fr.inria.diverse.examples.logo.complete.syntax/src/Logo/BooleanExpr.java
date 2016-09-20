/**
 */
package Logo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Logo.BooleanExpr#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see Logo.LogoPackage#getBooleanExpr()
 * @model
 * @generated
 */
public interface BooleanExpr extends BinaryExpr {

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link Logo.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see Logo.BooleanOperator
	 * @see #setOperator(BooleanOperator)
	 * @see Logo.LogoPackage#getBooleanExpr_Operator()
	 * @model
	 * @generated
	 */
	BooleanOperator getOperator();

	/**
	 * Sets the value of the '{@link Logo.BooleanExpr#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see Logo.BooleanOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BooleanOperator value);
} // BooleanExpr

/**
 */
package ExpressionPck;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ExpressionPck.RelationalExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link ExpressionPck.RelationalExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link ExpressionPck.RelationalExpression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see ExpressionPck.ExpressionPckPackage#getRelationalExpression()
 * @model
 * @generated
 */
public interface RelationalExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ExpressionPck.RelationalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see ExpressionPck.RelationalOperator
	 * @see #setOperator(RelationalOperator)
	 * @see ExpressionPck.ExpressionPckPackage#getRelationalExpression_Operator()
	 * @model
	 * @generated
	 */
	RelationalOperator getOperator();

	/**
	 * Sets the value of the '{@link ExpressionPck.RelationalExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see ExpressionPck.RelationalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(RelationalOperator value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see ExpressionPck.ExpressionPckPackage#getRelationalExpression_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link ExpressionPck.RelationalExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see ExpressionPck.ExpressionPckPackage#getRelationalExpression_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link ExpressionPck.RelationalExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // RelationalExpression

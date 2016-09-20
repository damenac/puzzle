/**
 */
package simpleconstraints;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simpleconstraints.RelationalExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link simpleconstraints.RelationalExpression#getRight <em>Right</em>}</li>
 *   <li>{@link simpleconstraints.RelationalExpression#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see simpleconstraints.SimpleconstraintsPackage#getRelationalExpression()
 * @model
 * @generated
 */
public interface RelationalExpression extends BooleanExpr {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(BooleanExpr)
	 * @see simpleconstraints.SimpleconstraintsPackage#getRelationalExpression_Left()
	 * @model containment="true"
	 * @generated
	 */
	BooleanExpr getLeft();

	/**
	 * Sets the value of the '{@link simpleconstraints.RelationalExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(BooleanExpr value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(BooleanExpr)
	 * @see simpleconstraints.SimpleconstraintsPackage#getRelationalExpression_Right()
	 * @model containment="true"
	 * @generated
	 */
	BooleanExpr getRight();

	/**
	 * Sets the value of the '{@link simpleconstraints.RelationalExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(BooleanExpr value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link simpleconstraints.OperationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see simpleconstraints.OperationKind
	 * @see #setOp(OperationKind)
	 * @see simpleconstraints.SimpleconstraintsPackage#getRelationalExpression_Op()
	 * @model
	 * @generated
	 */
	OperationKind getOp();

	/**
	 * Sets the value of the '{@link simpleconstraints.RelationalExpression#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see simpleconstraints.OperationKind
	 * @see #getOp()
	 * @generated
	 */
	void setOp(OperationKind value);

} // RelationalExpression

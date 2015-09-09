/**
 */
package vm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PBinary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vm.PBinaryExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link vm.PBinaryExpression#getRight <em>Right</em>}</li>
 *   <li>{@link vm.PBinaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see vm.VmPackage#getPBinaryExpression()
 * @model
 * @generated
 */
public interface PBinaryExpression extends PBooleanExpression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(PBooleanExpression)
	 * @see vm.VmPackage#getPBinaryExpression_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PBooleanExpression getLeft();

	/**
	 * Sets the value of the '{@link vm.PBinaryExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(PBooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(PBooleanExpression)
	 * @see vm.VmPackage#getPBinaryExpression_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PBooleanExpression getRight();

	/**
	 * Sets the value of the '{@link vm.PBinaryExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(PBooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link vm.PBinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see vm.PBinaryOperator
	 * @see #setOperator(PBinaryOperator)
	 * @see vm.VmPackage#getPBinaryExpression_Operator()
	 * @model
	 * @generated
	 */
	PBinaryOperator getOperator();

	/**
	 * Sets the value of the '{@link vm.PBinaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see vm.PBinaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(PBinaryOperator value);

} // PBinaryExpression

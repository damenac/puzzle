/**
 */
package CommonBehavior.SimpleTime;

import CommonBehavior.Communications.ValueSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CommonBehavior.SimpleTime.TimeExpression#getExpr <em>Expr</em>}</li>
 *   <li>{@link CommonBehavior.SimpleTime.TimeExpression#getObservation <em>Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getTimeExpression()
 * @model
 * @generated
 */
public interface TimeExpression extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(ValueSpecification)
	 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getTimeExpression_Expr()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getExpr();

	/**
	 * Sets the value of the '{@link CommonBehavior.SimpleTime.TimeExpression#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' reference list.
	 * The list contents are of type {@link CommonBehavior.SimpleTime.Observation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation</em>' reference list.
	 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getTimeExpression_Observation()
	 * @model
	 * @generated
	 */
	EList<Observation> getObservation();

} // TimeExpression

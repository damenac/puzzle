/**
 */
package flowchartsemantics.flowchartmt.flowchartpck;

import java.util.Hashtable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link flowchartsemantics.flowchartmt.flowchartpck.RelationalConstraint#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getRelationalConstraint()
 * @model
 * @generated
 */
public interface RelationalConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getRelationalConstraint_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link flowchartsemantics.flowchartmt.flowchartpck.RelationalConstraint#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextDataType="flowchartsemantics.flowchartmt.flowchartpck.Hashtable"
	 * @generated
	 */
	boolean evalConstraint(Hashtable context);

} // RelationalConstraint

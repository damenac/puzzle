/**
 */
package flowchartsemantics.flowchartmt.flowchartpck;

import java.util.Hashtable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link flowchartsemantics.flowchartmt.flowchartpck.Decision#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getDecision()
 * @model
 * @generated
 */
public interface Decision extends Node {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Constraint)
	 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getDecision_Guard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constraint getGuard();

	/**
	 * Sets the value of the '{@link flowchartsemantics.flowchartmt.flowchartpck.Decision#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Constraint value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextDataType="flowchartsemantics.flowchartmt.flowchartpck.Hashtable"
	 * @generated
	 */
	void eval(Hashtable context);

} // Decision

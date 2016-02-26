/**
 */
package flowchartsemantics.flowchartmt.flowchartpck;

import java.util.Hashtable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link flowchartsemantics.flowchartmt.flowchartpck.Loop#getBody <em>Body</em>}</li>
 *   <li>{@link flowchartsemantics.flowchartmt.flowchartpck.Loop#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Statement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Program)
	 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getLoop_Body()
	 * @model containment="true"
	 * @generated
	 */
	Program getBody();

	/**
	 * Sets the value of the '{@link flowchartsemantics.flowchartmt.flowchartpck.Loop#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Program value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Expression)
	 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getLoop_Guard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getGuard();

	/**
	 * Sets the value of the '{@link flowchartsemantics.flowchartmt.flowchartpck.Loop#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Expression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextDataType="flowchartsemantics.flowchartmt.flowchartpck.Hashtable"
	 * @generated
	 */
	void eval(Hashtable context);

} // Loop

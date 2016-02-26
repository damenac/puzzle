/**
 */
package flowchartsemantics.flowchartmt.flowchartpck;

import java.util.Hashtable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link flowchartsemantics.flowchartmt.flowchartpck.BoolLit#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getBoolLit()
 * @model
 * @generated
 */
public interface BoolLit extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getBoolLit_Value()
	 * @model
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link flowchartsemantics.flowchartmt.flowchartpck.BoolLit#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="flowchartsemantics.flowchartmt.flowchartpck.Object" contextDataType="flowchartsemantics.flowchartmt.flowchartpck.Hashtable"
	 * @generated
	 */
	Object eval(Hashtable context);

} // BoolLit

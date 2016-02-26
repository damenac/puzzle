/**
 */
package flowchartsemantics.flowchartmt.flowchartpck;

import java.util.Hashtable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link flowchartsemantics.flowchartmt.flowchartpck.Arc#getSource <em>Source</em>}</li>
 *   <li>{@link flowchartsemantics.flowchartmt.flowchartpck.Arc#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link flowchartsemantics.flowchartmt.flowchartpck.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getArc_Source()
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Node#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link flowchartsemantics.flowchartmt.flowchartpck.Arc#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link flowchartsemantics.flowchartmt.flowchartpck.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getArc_Target()
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Node#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link flowchartsemantics.flowchartmt.flowchartpck.Arc#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextDataType="flowchartsemantics.flowchartmt.flowchartpck.Hashtable"
	 * @generated
	 */
	void eval(Hashtable context);

} // Arc

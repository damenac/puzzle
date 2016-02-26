/**
 */
package flowchartsemantics.flowchartmt.flowchartpck;

import java.util.Hashtable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link flowchartsemantics.flowchartmt.flowchartpck.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link flowchartsemantics.flowchartmt.flowchartpck.Node#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link flowchartsemantics.flowchartmt.flowchartpck.Arc}.
	 * It is bidirectional and its opposite is '{@link flowchartsemantics.flowchartmt.flowchartpck.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getNode_Outgoing()
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Arc#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Arc> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link flowchartsemantics.flowchartmt.flowchartpck.Arc}.
	 * It is bidirectional and its opposite is '{@link flowchartsemantics.flowchartmt.flowchartpck.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getNode_Incoming()
	 * @see flowchartsemantics.flowchartmt.flowchartpck.Arc#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Arc> getIncoming();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextDataType="flowchartsemantics.flowchartmt.flowchartpck.Hashtable"
	 * @generated
	 */
	void eval(Hashtable context);

} // Node

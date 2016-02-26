/**
 */
package flowchartsemantics.flowchartmt.flowchartpck;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flowchart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link flowchartsemantics.flowchartmt.flowchartpck.Flowchart#getNodes <em>Nodes</em>}</li>
 *   <li>{@link flowchartsemantics.flowchartmt.flowchartpck.Flowchart#getArcs <em>Arcs</em>}</li>
 * </ul>
 * </p>
 *
 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getFlowchart()
 * @model
 * @generated
 */
public interface Flowchart extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link flowchartsemantics.flowchartmt.flowchartpck.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getFlowchart_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link flowchartsemantics.flowchartmt.flowchartpck.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getFlowchart_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void exec();

} // Flowchart

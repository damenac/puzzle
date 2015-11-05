/**
 */
package FlowchartModule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flowchart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FlowchartModule.Flowchart#getNodes <em>Nodes</em>}</li>
 *   <li>{@link FlowchartModule.Flowchart#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see FlowchartModule.FlowchartModulePackage#getFlowchart()
 * @model
 * @generated
 */
public interface Flowchart extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link FlowchartModule.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see FlowchartModule.FlowchartModulePackage#getFlowchart_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link FlowchartModule.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see FlowchartModule.FlowchartModulePackage#getFlowchart_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getTransitions();

} // Flowchart

/**
 */
package FlowchartModule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FlowchartModule.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link FlowchartModule.Node#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see FlowchartModule.FlowchartModulePackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link FlowchartModule.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see FlowchartModule.FlowchartModulePackage#getNode_Outgoing()
	 * @model
	 * @generated
	 */
	EList<Arc> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link FlowchartModule.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see FlowchartModule.FlowchartModulePackage#getNode_Incoming()
	 * @model
	 * @generated
	 */
	EList<Arc> getIncoming();

} // Node

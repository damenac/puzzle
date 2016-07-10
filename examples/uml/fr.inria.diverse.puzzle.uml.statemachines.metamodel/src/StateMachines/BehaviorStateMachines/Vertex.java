/**
 */
package StateMachines.BehaviorStateMachines;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link StateMachines.BehaviorStateMachines.Vertex#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.Vertex#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.Vertex#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getVertex()
 * @model abstract="true"
 * @generated
 */
public interface Vertex extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link StateMachines.BehaviorStateMachines.Transition}.
	 * It is bidirectional and its opposite is '{@link StateMachines.BehaviorStateMachines.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getVertex_Outgoing()
	 * @see StateMachines.BehaviorStateMachines.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link StateMachines.BehaviorStateMachines.Transition}.
	 * It is bidirectional and its opposite is '{@link StateMachines.BehaviorStateMachines.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getVertex_Incoming()
	 * @see StateMachines.BehaviorStateMachines.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link StateMachines.BehaviorStateMachines.Region#getSubvertex <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Region)
	 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getVertex_Container()
	 * @see StateMachines.BehaviorStateMachines.Region#getSubvertex
	 * @model opposite="subvertex" transient="false"
	 * @generated
	 */
	Region getContainer();

	/**
	 * Sets the value of the '{@link StateMachines.BehaviorStateMachines.Vertex#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Region value);

} // Vertex

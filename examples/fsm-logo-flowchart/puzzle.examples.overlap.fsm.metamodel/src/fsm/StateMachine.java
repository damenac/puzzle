/**
 */
package fsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fsm.StateMachine#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link fsm.StateMachine#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link fsm.StateMachine#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fsm.FsmPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link fsm.AbstractState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subvertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see fsm.FsmPackage#getStateMachine_Subvertex()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractState> getSubvertex();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link fsm.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see fsm.FsmPackage#getStateMachine_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fsm.FsmPackage#getStateMachine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fsm.StateMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // StateMachine

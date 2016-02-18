/**
 */
package StateMachinesProv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link StateMachinesProv.AbstractState#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link StateMachinesProv.AbstractState#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see StateMachinesProv.StateMachinesPackage#getAbstractState()
 * @model abstract="true"
 * @generated
 */
public interface AbstractState extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link StateMachinesProv.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see StateMachinesProv.StateMachinesPackage#getAbstractState_Incoming()
	 * @model
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link StateMachinesProv.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see StateMachinesProv.StateMachinesPackage#getAbstractState_Outgoing()
	 * @model
	 * @generated
	 */
	EList<Transition> getOutgoing();

} // AbstractState

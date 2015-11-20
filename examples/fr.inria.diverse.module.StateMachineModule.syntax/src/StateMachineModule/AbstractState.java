/**
 */
package StateMachineModule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link StateMachineModule.AbstractState#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link StateMachineModule.AbstractState#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link StateMachineModule.AbstractState#getOwnerRegion <em>Owner Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see StateMachineModule.StateMachineModulePackage#getAbstractState()
 * @model abstract="true"
 * @generated
 */
public interface AbstractState extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link StateMachineModule.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see StateMachineModule.StateMachineModulePackage#getAbstractState_Incoming()
	 * @model
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link StateMachineModule.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see StateMachineModule.StateMachineModulePackage#getAbstractState_Outgoing()
	 * @model
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Owner Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Region</em>' reference.
	 * @see #setOwnerRegion(Region)
	 * @see StateMachineModule.StateMachineModulePackage#getAbstractState_OwnerRegion()
	 * @model required="true"
	 * @generated
	 */
	Region getOwnerRegion();

	/**
	 * Sets the value of the '{@link StateMachineModule.AbstractState#getOwnerRegion <em>Owner Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Region</em>' reference.
	 * @see #getOwnerRegion()
	 * @generated
	 */
	void setOwnerRegion(Region value);

} // AbstractState

/**
 */
package Interactions.BasicInteractions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Interactions.BasicInteractions.Message#getMessageKind <em>Message Kind</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.Message#getMessageSort <em>Message Sort</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.Message#getArgument <em>Argument</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.Message#getConnector <em>Connector</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.Message#getSignature <em>Signature</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.Message#getSendEvent <em>Send Event</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.Message#getReceiveEvent <em>Receive Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Message Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link Interactions.BasicInteractions.MessageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Kind</em>' attribute.
	 * @see Interactions.BasicInteractions.MessageKind
	 * @see #setMessageKind(MessageKind)
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getMessage_MessageKind()
	 * @model
	 * @generated
	 */
	MessageKind getMessageKind();

	/**
	 * Sets the value of the '{@link Interactions.BasicInteractions.Message#getMessageKind <em>Message Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Kind</em>' attribute.
	 * @see Interactions.BasicInteractions.MessageKind
	 * @see #getMessageKind()
	 * @generated
	 */
	void setMessageKind(MessageKind value);

	/**
	 * Returns the value of the '<em><b>Message Sort</b></em>' attribute.
	 * The literals are from the enumeration {@link Interactions.BasicInteractions.MessageSort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Sort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Sort</em>' attribute.
	 * @see Interactions.BasicInteractions.MessageSort
	 * @see #setMessageSort(MessageSort)
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getMessage_MessageSort()
	 * @model
	 * @generated
	 */
	MessageSort getMessageSort();

	/**
	 * Sets the value of the '{@link Interactions.BasicInteractions.Message#getMessageSort <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Sort</em>' attribute.
	 * @see Interactions.BasicInteractions.MessageSort
	 * @see #getMessageSort()
	 * @generated
	 */
	void setMessageSort(MessageSort value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link Interactions.BasicInteractions.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getMessage_Argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSpecification> getArgument();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(Connector)
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getMessage_Connector()
	 * @model
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link Interactions.BasicInteractions.Message#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' reference.
	 * @see #setSignature(NamedElement)
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getMessage_Signature()
	 * @model
	 * @generated
	 */
	NamedElement getSignature();

	/**
	 * Sets the value of the '{@link Interactions.BasicInteractions.Message#getSignature <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Send Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Event</em>' reference.
	 * @see #setSendEvent(MessageEnd)
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getMessage_SendEvent()
	 * @model
	 * @generated
	 */
	MessageEnd getSendEvent();

	/**
	 * Sets the value of the '{@link Interactions.BasicInteractions.Message#getSendEvent <em>Send Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Event</em>' reference.
	 * @see #getSendEvent()
	 * @generated
	 */
	void setSendEvent(MessageEnd value);

	/**
	 * Returns the value of the '<em><b>Receive Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Event</em>' reference.
	 * @see #setReceiveEvent(MessageEnd)
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getMessage_ReceiveEvent()
	 * @model
	 * @generated
	 */
	MessageEnd getReceiveEvent();

	/**
	 * Sets the value of the '{@link Interactions.BasicInteractions.Message#getReceiveEvent <em>Receive Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Event</em>' reference.
	 * @see #getReceiveEvent()
	 * @generated
	 */
	void setReceiveEvent(MessageEnd value);

} // Message

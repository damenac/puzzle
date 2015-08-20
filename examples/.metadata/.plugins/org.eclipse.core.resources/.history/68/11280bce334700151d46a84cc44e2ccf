/**
 */
package rhapsody;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rhapsody.AbstractState#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link rhapsody.AbstractState#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link rhapsody.AbstractState#getOwnerRegion <em>Owner Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see rhapsody.RhapsodyPackage#getAbstractState()
 * @model abstract="true"
 * @generated
 */
public interface AbstractState extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link rhapsody.Transition}.
	 * It is bidirectional and its opposite is '{@link rhapsody.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see rhapsody.RhapsodyPackage#getAbstractState_Incoming()
	 * @see rhapsody.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link rhapsody.Transition}.
	 * It is bidirectional and its opposite is '{@link rhapsody.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see rhapsody.RhapsodyPackage#getAbstractState_Outgoing()
	 * @see rhapsody.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Owner Region</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rhapsody.Region#getSubvertex <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Region</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Region</em>' container reference.
	 * @see #setOwnerRegion(Region)
	 * @see rhapsody.RhapsodyPackage#getAbstractState_OwnerRegion()
	 * @see rhapsody.Region#getSubvertex
	 * @model opposite="subvertex" required="true" transient="false"
	 * @generated
	 */
	Region getOwnerRegion();

	/**
	 * Sets the value of the '{@link rhapsody.AbstractState#getOwnerRegion <em>Owner Region</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Region</em>' container reference.
	 * @see #getOwnerRegion()
	 * @generated
	 */
	void setOwnerRegion(Region value);

} // AbstractState

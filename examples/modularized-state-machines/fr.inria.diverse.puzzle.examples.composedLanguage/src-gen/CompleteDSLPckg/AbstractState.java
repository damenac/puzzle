/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.AbstractState#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link CompleteDSLPckg.AbstractState#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link CompleteDSLPckg.AbstractState#getOwnerRegion <em>Owner Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getAbstractState()
 * @model abstract="true"
 * @generated
 */
public interface AbstractState extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Transition}.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getAbstractState_Incoming()
	 * @see CompleteDSLPckg.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Transition}.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getAbstractState_Outgoing()
	 * @see CompleteDSLPckg.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Owner Region</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.Region#getSubvertex <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Region</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Region</em>' container reference.
	 * @see #setOwnerRegion(Region)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getAbstractState_OwnerRegion()
	 * @see CompleteDSLPckg.Region#getSubvertex
	 * @model opposite="subvertex" required="true" transient="false"
	 * @generated
	 */
	Region getOwnerRegion();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.AbstractState#getOwnerRegion <em>Owner Region</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Region</em>' container reference.
	 * @see #getOwnerRegion()
	 * @generated
	 */
	void setOwnerRegion(Region value);

} // AbstractState

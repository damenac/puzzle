/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.ProtocolTransition#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link CompleteDSLPckg.ProtocolTransition#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link CompleteDSLPckg.ProtocolTransition#getReferred <em>Referred</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getProtocolTransition()
 * @model
 * @generated
 */
public interface ProtocolTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Condition</em>' containment reference.
	 * @see #setPreCondition(Constraint)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getProtocolTransition_PreCondition()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getPreCondition();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ProtocolTransition#getPreCondition <em>Pre Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition</em>' containment reference.
	 * @see #getPreCondition()
	 * @generated
	 */
	void setPreCondition(Constraint value);

	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Condition</em>' containment reference.
	 * @see #setPostCondition(Constraint)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getProtocolTransition_PostCondition()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getPostCondition();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ProtocolTransition#getPostCondition <em>Post Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Condition</em>' containment reference.
	 * @see #getPostCondition()
	 * @generated
	 */
	void setPostCondition(Constraint value);

	/**
	 * Returns the value of the '<em><b>Referred</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getProtocolTransition_Referred()
	 * @model
	 * @generated
	 */
	EList<Operation> getReferred();

} // ProtocolTransition

/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.StateMachine#getRegions <em>Regions</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Region}.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.Region#getOwnerStateMachine <em>Owner State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getStateMachine_Regions()
	 * @see CompleteDSLPckg.Region#getOwnerStateMachine
	 * @model opposite="ownerStateMachine" containment="true"
	 * @generated
	 */
	EList<Region> getRegions();

} // StateMachine

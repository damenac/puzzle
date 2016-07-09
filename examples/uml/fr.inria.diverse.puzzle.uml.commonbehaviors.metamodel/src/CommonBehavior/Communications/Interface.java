/**
 */
package CommonBehavior.Communications;

import CommonBehavior.BasicBehavior.Classifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CommonBehavior.Communications.Interface#getOwnedReception <em>Owned Reception</em>}</li>
 * </ul>
 * </p>
 *
 * @see CommonBehavior.Communications.CommunicationsPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Classifier {
	/**
	 * Returns the value of the '<em><b>Owned Reception</b></em>' containment reference list.
	 * The list contents are of type {@link CommonBehavior.Communications.Reception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Reception</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Reception</em>' containment reference list.
	 * @see CommonBehavior.Communications.CommunicationsPackage#getInterface_OwnedReception()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reception> getOwnedReception();

} // Interface

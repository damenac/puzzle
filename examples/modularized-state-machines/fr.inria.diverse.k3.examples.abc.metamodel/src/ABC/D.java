/**
 */
package ABC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ABC.D#getAes <em>Aes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ABC.ABCPackage#getD()
 * @model
 * @generated
 */
public interface D extends EObject {
	/**
	 * Returns the value of the '<em><b>Aes</b></em>' containment reference list.
	 * The list contents are of type {@link ABC.A}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aes</em>' containment reference list.
	 * @see ABC.ABCPackage#getD_Aes()
	 * @model containment="true"
	 * @generated
	 */
	EList<A> getAes();

} // D

/**
 */
package CompositeStructures;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompositeStructures.InvocationAction#getOnPort <em>On Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompositeStructures.CompositeStructuresPackage#getInvocationAction()
 * @model abstract="true"
 * @generated
 */
public interface InvocationAction extends EObject {
	/**
	 * Returns the value of the '<em><b>On Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Port</em>' reference.
	 * @see #setOnPort(Port)
	 * @see CompositeStructures.CompositeStructuresPackage#getInvocationAction_OnPort()
	 * @model
	 * @generated
	 */
	Port getOnPort();

	/**
	 * Sets the value of the '{@link CompositeStructures.InvocationAction#getOnPort <em>On Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Port</em>' reference.
	 * @see #getOnPort()
	 * @generated
	 */
	void setOnPort(Port value);

} // InvocationAction

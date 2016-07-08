/**
 */
package Components;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Components.ConnectorEnd#getPartWithPort <em>Part With Port</em>}</li>
 *   <li>{@link Components.ConnectorEnd#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see Components.ComponentsPackage#getConnectorEnd()
 * @model
 * @generated
 */
public interface ConnectorEnd extends EObject {
	/**
	 * Returns the value of the '<em><b>Part With Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part With Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part With Port</em>' reference.
	 * @see #setPartWithPort(Property)
	 * @see Components.ComponentsPackage#getConnectorEnd_PartWithPort()
	 * @model
	 * @generated
	 */
	Property getPartWithPort();

	/**
	 * Sets the value of the '{@link Components.ConnectorEnd#getPartWithPort <em>Part With Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part With Port</em>' reference.
	 * @see #getPartWithPort()
	 * @generated
	 */
	void setPartWithPort(Property value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(ConnectableElement)
	 * @see Components.ComponentsPackage#getConnectorEnd_Role()
	 * @model required="true"
	 * @generated
	 */
	ConnectableElement getRole();

	/**
	 * Sets the value of the '{@link Components.ConnectorEnd#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(ConnectableElement value);

} // ConnectorEnd

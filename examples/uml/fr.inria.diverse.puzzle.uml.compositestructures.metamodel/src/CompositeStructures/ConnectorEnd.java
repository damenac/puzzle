/**
 */
package CompositeStructures;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompositeStructures.ConnectorEnd#getType <em>Type</em>}</li>
 *   <li>{@link CompositeStructures.ConnectorEnd#getRole <em>Role</em>}</li>
 *   <li>{@link CompositeStructures.ConnectorEnd#getDefiningEnd <em>Defining End</em>}</li>
 *   <li>{@link CompositeStructures.ConnectorEnd#getPartWithPort <em>Part With Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompositeStructures.CompositeStructuresPackage#getConnectorEnd()
 * @model
 * @generated
 */
public interface ConnectorEnd extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Association)
	 * @see CompositeStructures.CompositeStructuresPackage#getConnectorEnd_Type()
	 * @model
	 * @generated
	 */
	Association getType();

	/**
	 * Sets the value of the '{@link CompositeStructures.ConnectorEnd#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Association value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CompositeStructures.ConnectableElement#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(ConnectableElement)
	 * @see CompositeStructures.CompositeStructuresPackage#getConnectorEnd_Role()
	 * @see CompositeStructures.ConnectableElement#getEnd
	 * @model opposite="end" required="true"
	 * @generated
	 */
	ConnectableElement getRole();

	/**
	 * Sets the value of the '{@link CompositeStructures.ConnectorEnd#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(ConnectableElement value);

	/**
	 * Returns the value of the '<em><b>Defining End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defining End</em>' reference.
	 * @see #setDefiningEnd(Property)
	 * @see CompositeStructures.CompositeStructuresPackage#getConnectorEnd_DefiningEnd()
	 * @model
	 * @generated
	 */
	Property getDefiningEnd();

	/**
	 * Sets the value of the '{@link CompositeStructures.ConnectorEnd#getDefiningEnd <em>Defining End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining End</em>' reference.
	 * @see #getDefiningEnd()
	 * @generated
	 */
	void setDefiningEnd(Property value);

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
	 * @see CompositeStructures.CompositeStructuresPackage#getConnectorEnd_PartWithPort()
	 * @model
	 * @generated
	 */
	Property getPartWithPort();

	/**
	 * Sets the value of the '{@link CompositeStructures.ConnectorEnd#getPartWithPort <em>Part With Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part With Port</em>' reference.
	 * @see #getPartWithPort()
	 * @generated
	 */
	void setPartWithPort(Property value);

} // ConnectorEnd

/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.ConnectorEnd#getPartWithPort <em>Part With Port</em>}</li>
 *   <li>{@link CompleteDSLPckg.ConnectorEnd#getRole <em>Role</em>}</li>
 *   <li>{@link CompleteDSLPckg.ConnectorEnd#getType <em>Type</em>}</li>
 *   <li>{@link CompleteDSLPckg.ConnectorEnd#getDefiningEnd <em>Defining End</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getConnectorEnd()
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
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getConnectorEnd_PartWithPort()
	 * @model
	 * @generated
	 */
	Property getPartWithPort();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ConnectorEnd#getPartWithPort <em>Part With Port</em>}' reference.
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
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getConnectorEnd_Role()
	 * @model required="true"
	 * @generated
	 */
	ConnectableElement getRole();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ConnectorEnd#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(ConnectableElement value);

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
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getConnectorEnd_Type()
	 * @model
	 * @generated
	 */
	Association getType();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ConnectorEnd#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Association value);

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
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getConnectorEnd_DefiningEnd()
	 * @model
	 * @generated
	 */
	Property getDefiningEnd();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ConnectorEnd#getDefiningEnd <em>Defining End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining End</em>' reference.
	 * @see #getDefiningEnd()
	 * @generated
	 */
	void setDefiningEnd(Property value);

} // ConnectorEnd

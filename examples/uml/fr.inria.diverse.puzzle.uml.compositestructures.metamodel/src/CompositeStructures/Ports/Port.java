/**
 */
package CompositeStructures.Ports;

import CompositeStructures.InternalStructures.Property;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompositeStructures.Ports.Port#isIsBehavior <em>Is Behavior</em>}</li>
 *   <li>{@link CompositeStructures.Ports.Port#isIsService <em>Is Service</em>}</li>
 *   <li>{@link CompositeStructures.Ports.Port#isIsConjugated <em>Is Conjugated</em>}</li>
 *   <li>{@link CompositeStructures.Ports.Port#getRequired <em>Required</em>}</li>
 *   <li>{@link CompositeStructures.Ports.Port#getProvided <em>Provided</em>}</li>
 *   <li>{@link CompositeStructures.Ports.Port#getRedefinedPort <em>Redefined Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompositeStructures.Ports.PortsPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends Property {
	/**
	 * Returns the value of the '<em><b>Is Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Behavior</em>' attribute.
	 * @see #setIsBehavior(boolean)
	 * @see CompositeStructures.Ports.PortsPackage#getPort_IsBehavior()
	 * @model
	 * @generated
	 */
	boolean isIsBehavior();

	/**
	 * Sets the value of the '{@link CompositeStructures.Ports.Port#isIsBehavior <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Behavior</em>' attribute.
	 * @see #isIsBehavior()
	 * @generated
	 */
	void setIsBehavior(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Service</em>' attribute.
	 * @see #setIsService(boolean)
	 * @see CompositeStructures.Ports.PortsPackage#getPort_IsService()
	 * @model
	 * @generated
	 */
	boolean isIsService();

	/**
	 * Sets the value of the '{@link CompositeStructures.Ports.Port#isIsService <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Service</em>' attribute.
	 * @see #isIsService()
	 * @generated
	 */
	void setIsService(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Conjugated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Conjugated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Conjugated</em>' attribute.
	 * @see #setIsConjugated(boolean)
	 * @see CompositeStructures.Ports.PortsPackage#getPort_IsConjugated()
	 * @model
	 * @generated
	 */
	boolean isIsConjugated();

	/**
	 * Sets the value of the '{@link CompositeStructures.Ports.Port#isIsConjugated <em>Is Conjugated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Conjugated</em>' attribute.
	 * @see #isIsConjugated()
	 * @generated
	 */
	void setIsConjugated(boolean value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference list.
	 * The list contents are of type {@link CompositeStructures.Ports.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' reference list.
	 * @see CompositeStructures.Ports.PortsPackage#getPort_Required()
	 * @model
	 * @generated
	 */
	EList<Interface> getRequired();

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' reference list.
	 * The list contents are of type {@link CompositeStructures.Ports.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided</em>' reference list.
	 * @see CompositeStructures.Ports.PortsPackage#getPort_Provided()
	 * @model
	 * @generated
	 */
	EList<Interface> getProvided();

	/**
	 * Returns the value of the '<em><b>Redefined Port</b></em>' reference list.
	 * The list contents are of type {@link CompositeStructures.Ports.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Port</em>' reference list.
	 * @see CompositeStructures.Ports.PortsPackage#getPort_RedefinedPort()
	 * @model
	 * @generated
	 */
	EList<Port> getRedefinedPort();

} // Port

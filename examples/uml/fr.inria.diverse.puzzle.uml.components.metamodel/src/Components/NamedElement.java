/**
 */
package Components;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Components.NamedElement#getClientDependency <em>Client Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see Components.ComponentsPackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Client Dependency</b></em>' reference list.
	 * The list contents are of type {@link Components.Dependency}.
	 * It is bidirectional and its opposite is '{@link Components.Dependency#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Dependency</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Dependency</em>' reference list.
	 * @see Components.ComponentsPackage#getNamedElement_ClientDependency()
	 * @see Components.Dependency#getClient
	 * @model opposite="client"
	 * @generated
	 */
	EList<Dependency> getClientDependency();

} // NamedElement

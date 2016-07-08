/**
 */
package Components;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Components.Dependency#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link Components.Dependency#getClient <em>Client</em>}</li>
 * </ul>
 * </p>
 *
 * @see Components.ComponentsPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference list.
	 * The list contents are of type {@link Components.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference list.
	 * @see Components.ComponentsPackage#getDependency_Supplier()
	 * @model required="true"
	 * @generated
	 */
	EList<NamedElement> getSupplier();

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference list.
	 * The list contents are of type {@link Components.NamedElement}.
	 * It is bidirectional and its opposite is '{@link Components.NamedElement#getClientDependency <em>Client Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference list.
	 * @see Components.ComponentsPackage#getDependency_Client()
	 * @see Components.NamedElement#getClientDependency
	 * @model opposite="clientDependency" required="true"
	 * @generated
	 */
	EList<NamedElement> getClient();

} // Dependency

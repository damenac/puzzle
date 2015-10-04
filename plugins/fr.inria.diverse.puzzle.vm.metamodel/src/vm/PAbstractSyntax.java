/**
 */
package vm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PAbstract Syntax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vm.PAbstractSyntax#getEcorePath <em>Ecore Path</em>}</li>
 *   <li>{@link vm.PAbstractSyntax#getEcoreProject <em>Ecore Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see vm.VmPackage#getPAbstractSyntax()
 * @model
 * @generated
 */
public interface PAbstractSyntax extends EObject {
	/**
	 * Returns the value of the '<em><b>Ecore Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Path</em>' attribute.
	 * @see #setEcorePath(String)
	 * @see vm.VmPackage#getPAbstractSyntax_EcorePath()
	 * @model
	 * @generated
	 */
	String getEcorePath();

	/**
	 * Sets the value of the '{@link vm.PAbstractSyntax#getEcorePath <em>Ecore Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Path</em>' attribute.
	 * @see #getEcorePath()
	 * @generated
	 */
	void setEcorePath(String value);

	/**
	 * Returns the value of the '<em><b>Ecore Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Project</em>' attribute.
	 * @see #setEcoreProject(String)
	 * @see vm.VmPackage#getPAbstractSyntax_EcoreProject()
	 * @model
	 * @generated
	 */
	String getEcoreProject();

	/**
	 * Sets the value of the '{@link vm.PAbstractSyntax#getEcoreProject <em>Ecore Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Project</em>' attribute.
	 * @see #getEcoreProject()
	 * @generated
	 */
	void setEcoreProject(String value);

} // PAbstractSyntax

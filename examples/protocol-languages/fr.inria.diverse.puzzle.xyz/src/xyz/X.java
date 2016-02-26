/**
 */
package xyz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>X</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xyz.X#getYes <em>Yes</em>}</li>
 * </ul>
 * </p>
 *
 * @see xyz.XyzPackage#getX()
 * @model
 * @generated
 */
public interface X extends EObject {
	/**
	 * Returns the value of the '<em><b>Yes</b></em>' containment reference list.
	 * The list contents are of type {@link xyz.Y}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yes</em>' containment reference list.
	 * @see xyz.XyzPackage#getX_Yes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Y> getYes();

} // X

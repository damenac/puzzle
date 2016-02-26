/**
 */
package xyz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Y</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xyz.Y#getZes <em>Zes</em>}</li>
 * </ul>
 * </p>
 *
 * @see xyz.XyzPackage#getY()
 * @model
 * @generated
 */
public interface Y extends EObject {
	/**
	 * Returns the value of the '<em><b>Zes</b></em>' containment reference list.
	 * The list contents are of type {@link xyz.Z}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zes</em>' containment reference list.
	 * @see xyz.XyzPackage#getY_Zes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Z> getZes();

} // Y

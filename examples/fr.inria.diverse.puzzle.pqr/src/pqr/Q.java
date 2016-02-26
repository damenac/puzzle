/**
 */
package pqr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Q</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pqr.Q#getRes <em>Res</em>}</li>
 * </ul>
 * </p>
 *
 * @see pqr.PqrPackage#getQ()
 * @model
 * @generated
 */
public interface Q extends EObject {
	/**
	 * Returns the value of the '<em><b>Res</b></em>' containment reference list.
	 * The list contents are of type {@link pqr.R}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res</em>' containment reference list.
	 * @see pqr.PqrPackage#getQ_Res()
	 * @model containment="true"
	 * @generated
	 */
	EList<R> getRes();

} // Q

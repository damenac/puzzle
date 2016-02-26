/**
 */
package pqr;

import abc.B;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pqr.P#getPes <em>Pes</em>}</li>
 * </ul>
 * </p>
 *
 * @see pqr.PqrPackage#getP()
 * @model
 * @generated
 */
public interface P extends B {
	/**
	 * Returns the value of the '<em><b>Pes</b></em>' containment reference list.
	 * The list contents are of type {@link pqr.P}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pes</em>' containment reference list.
	 * @see pqr.PqrPackage#getP_Pes()
	 * @model containment="true"
	 * @generated
	 */
	EList<P> getPes();

} // P

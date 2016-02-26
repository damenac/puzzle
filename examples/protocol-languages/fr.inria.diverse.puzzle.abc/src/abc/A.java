/**
 */
package abc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link abc.A#getBes <em>Bes</em>}</li>
 * </ul>
 * </p>
 *
 * @see abc.AbcPackage#getA()
 * @model
 * @generated
 */
public interface A extends EObject {
	/**
	 * Returns the value of the '<em><b>Bes</b></em>' containment reference list.
	 * The list contents are of type {@link abc.B}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bes</em>' containment reference list.
	 * @see abc.AbcPackage#getA_Bes()
	 * @model containment="true"
	 * @generated
	 */
	EList<B> getBes();

} // A

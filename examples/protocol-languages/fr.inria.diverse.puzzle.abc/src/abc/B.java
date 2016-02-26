/**
 */
package abc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import xyz.X;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link abc.B#getCes <em>Ces</em>}</li>
 *   <li>{@link abc.B#getXes <em>Xes</em>}</li>
 * </ul>
 * </p>
 *
 * @see abc.AbcPackage#getB()
 * @model
 * @generated
 */
public interface B extends EObject {
	/**
	 * Returns the value of the '<em><b>Ces</b></em>' containment reference list.
	 * The list contents are of type {@link abc.C}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ces</em>' containment reference list.
	 * @see abc.AbcPackage#getB_Ces()
	 * @model containment="true"
	 * @generated
	 */
	EList<C> getCes();

	/**
	 * Returns the value of the '<em><b>Xes</b></em>' containment reference list.
	 * The list contents are of type {@link xyz.X}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xes</em>' containment reference list.
	 * @see abc.AbcPackage#getB_Xes()
	 * @model containment="true"
	 * @generated
	 */
	EList<X> getXes();

} // B

/**
 */
package PuzzleADL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PuzzleADL.InterfaceBinding#getFrom <em>From</em>}</li>
 *   <li>{@link PuzzleADL.InterfaceBinding#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see PuzzleADL.PuzzleADLPackage#getInterfaceBinding()
 * @model
 * @generated
 */
public interface InterfaceBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(RequiredInterface)
	 * @see PuzzleADL.PuzzleADLPackage#getInterfaceBinding_From()
	 * @model required="true"
	 * @generated
	 */
	RequiredInterface getFrom();

	/**
	 * Sets the value of the '{@link PuzzleADL.InterfaceBinding#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(RequiredInterface value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(ProvidedInterface)
	 * @see PuzzleADL.PuzzleADLPackage#getInterfaceBinding_To()
	 * @model required="true"
	 * @generated
	 */
	ProvidedInterface getTo();

	/**
	 * Sets the value of the '{@link PuzzleADL.InterfaceBinding#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ProvidedInterface value);

} // InterfaceBinding

/**
 */
package PuzzleADL;

import fr.inria.diverse.melange.metamodel.melange.Language;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PuzzleADL.CompositionLink#getLeft <em>Left</em>}</li>
 *   <li>{@link PuzzleADL.CompositionLink#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see PuzzleADL.PuzzleADLPackage#getCompositionLink()
 * @model abstract="true"
 * @generated
 */
public interface CompositionLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Language)
	 * @see PuzzleADL.PuzzleADLPackage#getCompositionLink_Left()
	 * @model required="true"
	 * @generated
	 */
	Language getLeft();

	/**
	 * Sets the value of the '{@link PuzzleADL.CompositionLink#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Language value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Language)
	 * @see PuzzleADL.PuzzleADLPackage#getCompositionLink_Right()
	 * @model required="true"
	 * @generated
	 */
	Language getRight();

	/**
	 * Sets the value of the '{@link PuzzleADL.CompositionLink#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Language value);

} // CompositionLink

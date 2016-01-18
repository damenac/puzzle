/**
 */
package fr.inria.diverse.puzzle.adl.language.puzzle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.puzzle.adl.language.puzzle.LanguageBinding#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.diverse.puzzle.adl.language.puzzle.LanguageBinding#getBinding <em>Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.puzzle.adl.language.puzzle.PuzzlePackage#getLanguageBinding()
 * @model
 * @generated
 */
public interface LanguageBinding extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.inria.diverse.puzzle.adl.language.puzzle.PuzzlePackage#getLanguageBinding_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.inria.diverse.puzzle.adl.language.puzzle.LanguageBinding#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.diverse.puzzle.adl.language.puzzle.Binding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binding</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binding</em>' containment reference list.
   * @see fr.inria.diverse.puzzle.adl.language.puzzle.PuzzlePackage#getLanguageBinding_Binding()
   * @model containment="true"
   * @generated
   */
  EList<Binding> getBinding();

} // LanguageBinding

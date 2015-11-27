/**
 */
package fr.inria.diverse.puzzle.adl.language;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Puzzle Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.puzzle.adl.language.PuzzleComposition#getMelangeFile <em>Melange File</em>}</li>
 *   <li>{@link fr.inria.diverse.puzzle.adl.language.PuzzleComposition#getComposites <em>Composites</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.puzzle.adl.language.LanguagePackage#getPuzzleComposition()
 * @model
 * @generated
 */
public interface PuzzleComposition extends EObject
{
  /**
   * Returns the value of the '<em><b>Melange File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Melange File</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Melange File</em>' attribute.
   * @see #setMelangeFile(String)
   * @see fr.inria.diverse.puzzle.adl.language.LanguagePackage#getPuzzleComposition_MelangeFile()
   * @model
   * @generated
   */
  String getMelangeFile();

  /**
   * Sets the value of the '{@link fr.inria.diverse.puzzle.adl.language.PuzzleComposition#getMelangeFile <em>Melange File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Melange File</em>' attribute.
   * @see #getMelangeFile()
   * @generated
   */
  void setMelangeFile(String value);

  /**
   * Returns the value of the '<em><b>Composites</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.diverse.puzzle.adl.language.CompositeLanguage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composites</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composites</em>' containment reference list.
   * @see fr.inria.diverse.puzzle.adl.language.LanguagePackage#getPuzzleComposition_Composites()
   * @model containment="true"
   * @generated
   */
  EList<CompositeLanguage> getComposites();

} // PuzzleComposition

/**
 */
package fr.inria.diverse.puzzle.language.binding;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Melange Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.puzzle.language.binding.MelangeImport#getMelangeFile <em>Melange File</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.puzzle.language.binding.BindingPackage#getMelangeImport()
 * @model
 * @generated
 */
public interface MelangeImport extends EObject
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
   * @see fr.inria.diverse.puzzle.language.binding.BindingPackage#getMelangeImport_MelangeFile()
   * @model
   * @generated
   */
  String getMelangeFile();

  /**
   * Sets the value of the '{@link fr.inria.diverse.puzzle.language.binding.MelangeImport#getMelangeFile <em>Melange File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Melange File</em>' attribute.
   * @see #getMelangeFile()
   * @generated
   */
  void setMelangeFile(String value);

} // MelangeImport

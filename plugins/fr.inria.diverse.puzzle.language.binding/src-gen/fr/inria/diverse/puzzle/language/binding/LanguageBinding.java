/**
 */
package fr.inria.diverse.puzzle.language.binding;

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
 *   <li>{@link fr.inria.diverse.puzzle.language.binding.LanguageBinding#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.diverse.puzzle.language.binding.LanguageBinding#getMelangeImport <em>Melange Import</em>}</li>
 *   <li>{@link fr.inria.diverse.puzzle.language.binding.LanguageBinding#getBinding <em>Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.puzzle.language.binding.BindingPackage#getLanguageBinding()
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
   * @see fr.inria.diverse.puzzle.language.binding.BindingPackage#getLanguageBinding_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.inria.diverse.puzzle.language.binding.LanguageBinding#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Melange Import</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Melange Import</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Melange Import</em>' containment reference.
   * @see #setMelangeImport(MelangeImport)
   * @see fr.inria.diverse.puzzle.language.binding.BindingPackage#getLanguageBinding_MelangeImport()
   * @model containment="true"
   * @generated
   */
  MelangeImport getMelangeImport();

  /**
   * Sets the value of the '{@link fr.inria.diverse.puzzle.language.binding.LanguageBinding#getMelangeImport <em>Melange Import</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Melange Import</em>' containment reference.
   * @see #getMelangeImport()
   * @generated
   */
  void setMelangeImport(MelangeImport value);

  /**
   * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.diverse.puzzle.language.binding.Binding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binding</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binding</em>' containment reference list.
   * @see fr.inria.diverse.puzzle.language.binding.BindingPackage#getLanguageBinding_Binding()
   * @model containment="true"
   * @generated
   */
  EList<Binding> getBinding();

} // LanguageBinding

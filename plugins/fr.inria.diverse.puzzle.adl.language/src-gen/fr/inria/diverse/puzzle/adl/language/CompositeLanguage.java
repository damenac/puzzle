/**
 */
package fr.inria.diverse.puzzle.adl.language;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.puzzle.adl.language.CompositeLanguage#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.diverse.puzzle.adl.language.CompositeLanguage#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.puzzle.adl.language.LanguagePackage#getCompositeLanguage()
 * @model
 * @generated
 */
public interface CompositeLanguage extends EObject
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
   * @see fr.inria.diverse.puzzle.adl.language.LanguagePackage#getCompositeLanguage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.inria.diverse.puzzle.adl.language.CompositeLanguage#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Links</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.diverse.puzzle.adl.language.Connector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links</em>' containment reference list.
   * @see fr.inria.diverse.puzzle.adl.language.LanguagePackage#getCompositeLanguage_Links()
   * @model containment="true"
   * @generated
   */
  EList<Connector> getLinks();

} // CompositeLanguage

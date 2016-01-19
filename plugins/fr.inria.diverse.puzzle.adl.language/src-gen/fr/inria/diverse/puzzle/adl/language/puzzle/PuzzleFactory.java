/**
 */
package fr.inria.diverse.puzzle.adl.language.puzzle;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.puzzle.adl.language.puzzle.PuzzlePackage
 * @generated
 */
public interface PuzzleFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PuzzleFactory eINSTANCE = fr.inria.diverse.puzzle.adl.language.puzzle.impl.PuzzleFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Language Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Language Binding</em>'.
   * @generated
   */
  LanguageBinding createLanguageBinding();

  /**
   * Returns a new object of class '<em>Melange Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Melange Import</em>'.
   * @generated
   */
  MelangeImport createMelangeImport();

  /**
   * Returns a new object of class '<em>Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binding</em>'.
   * @generated
   */
  Binding createBinding();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PuzzlePackage getPuzzlePackage();

} //PuzzleFactory

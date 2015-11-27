/**
 */
package fr.inria.diverse.puzzle.adl.language;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.puzzle.adl.language.LanguagePackage
 * @generated
 */
public interface LanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LanguageFactory eINSTANCE = fr.inria.diverse.puzzle.adl.language.impl.LanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Puzzle Composition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Puzzle Composition</em>'.
   * @generated
   */
  PuzzleComposition createPuzzleComposition();

  /**
   * Returns a new object of class '<em>Composite Language</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite Language</em>'.
   * @generated
   */
  CompositeLanguage createCompositeLanguage();

  /**
   * Returns a new object of class '<em>Connector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connector</em>'.
   * @generated
   */
  Connector createConnector();

  /**
   * Returns a new object of class '<em>Aggregation Connector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aggregation Connector</em>'.
   * @generated
   */
  AggregationConnector createAggregationConnector();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LanguagePackage getLanguagePackage();

} //LanguageFactory

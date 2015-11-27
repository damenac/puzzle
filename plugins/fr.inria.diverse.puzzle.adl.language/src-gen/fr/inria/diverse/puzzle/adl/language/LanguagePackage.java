/**
 */
package fr.inria.diverse.puzzle.adl.language;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.puzzle.adl.language.LanguageFactory
 * @model kind="package"
 * @generated
 */
public interface LanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "language";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.inria.fr/diverse/puzzle/adl/Language";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "language";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LanguagePackage eINSTANCE = fr.inria.diverse.puzzle.adl.language.impl.LanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link fr.inria.diverse.puzzle.adl.language.impl.PuzzleCompositionImpl <em>Puzzle Composition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.puzzle.adl.language.impl.PuzzleCompositionImpl
   * @see fr.inria.diverse.puzzle.adl.language.impl.LanguagePackageImpl#getPuzzleComposition()
   * @generated
   */
  int PUZZLE_COMPOSITION = 0;

  /**
   * The feature id for the '<em><b>Melange File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUZZLE_COMPOSITION__MELANGE_FILE = 0;

  /**
   * The feature id for the '<em><b>Composites</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUZZLE_COMPOSITION__COMPOSITES = 1;

  /**
   * The number of structural features of the '<em>Puzzle Composition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUZZLE_COMPOSITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.diverse.puzzle.adl.language.impl.CompositeLanguageImpl <em>Composite Language</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.puzzle.adl.language.impl.CompositeLanguageImpl
   * @see fr.inria.diverse.puzzle.adl.language.impl.LanguagePackageImpl#getCompositeLanguage()
   * @generated
   */
  int COMPOSITE_LANGUAGE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_LANGUAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_LANGUAGE__LINKS = 1;

  /**
   * The number of structural features of the '<em>Composite Language</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_LANGUAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.diverse.puzzle.adl.language.impl.ConnectorImpl <em>Connector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.puzzle.adl.language.impl.ConnectorImpl
   * @see fr.inria.diverse.puzzle.adl.language.impl.LanguagePackageImpl#getConnector()
   * @generated
   */
  int CONNECTOR = 2;

  /**
   * The number of structural features of the '<em>Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.inria.diverse.puzzle.adl.language.impl.AggregationConnectorImpl <em>Aggregation Connector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.puzzle.adl.language.impl.AggregationConnectorImpl
   * @see fr.inria.diverse.puzzle.adl.language.impl.LanguagePackageImpl#getAggregationConnector()
   * @generated
   */
  int AGGREGATION_CONNECTOR = 3;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATION_CONNECTOR__LEFT = CONNECTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATION_CONNECTOR__RIGHT = CONNECTOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Aggregation Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATION_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link fr.inria.diverse.puzzle.adl.language.PuzzleComposition <em>Puzzle Composition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Puzzle Composition</em>'.
   * @see fr.inria.diverse.puzzle.adl.language.PuzzleComposition
   * @generated
   */
  EClass getPuzzleComposition();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.puzzle.adl.language.PuzzleComposition#getMelangeFile <em>Melange File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Melange File</em>'.
   * @see fr.inria.diverse.puzzle.adl.language.PuzzleComposition#getMelangeFile()
   * @see #getPuzzleComposition()
   * @generated
   */
  EAttribute getPuzzleComposition_MelangeFile();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.diverse.puzzle.adl.language.PuzzleComposition#getComposites <em>Composites</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Composites</em>'.
   * @see fr.inria.diverse.puzzle.adl.language.PuzzleComposition#getComposites()
   * @see #getPuzzleComposition()
   * @generated
   */
  EReference getPuzzleComposition_Composites();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.puzzle.adl.language.CompositeLanguage <em>Composite Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Language</em>'.
   * @see fr.inria.diverse.puzzle.adl.language.CompositeLanguage
   * @generated
   */
  EClass getCompositeLanguage();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.puzzle.adl.language.CompositeLanguage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.diverse.puzzle.adl.language.CompositeLanguage#getName()
   * @see #getCompositeLanguage()
   * @generated
   */
  EAttribute getCompositeLanguage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.diverse.puzzle.adl.language.CompositeLanguage#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links</em>'.
   * @see fr.inria.diverse.puzzle.adl.language.CompositeLanguage#getLinks()
   * @see #getCompositeLanguage()
   * @generated
   */
  EReference getCompositeLanguage_Links();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.puzzle.adl.language.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connector</em>'.
   * @see fr.inria.diverse.puzzle.adl.language.Connector
   * @generated
   */
  EClass getConnector();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.puzzle.adl.language.AggregationConnector <em>Aggregation Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aggregation Connector</em>'.
   * @see fr.inria.diverse.puzzle.adl.language.AggregationConnector
   * @generated
   */
  EClass getAggregationConnector();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.puzzle.adl.language.AggregationConnector#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see fr.inria.diverse.puzzle.adl.language.AggregationConnector#getLeft()
   * @see #getAggregationConnector()
   * @generated
   */
  EAttribute getAggregationConnector_Left();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.puzzle.adl.language.AggregationConnector#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see fr.inria.diverse.puzzle.adl.language.AggregationConnector#getRight()
   * @see #getAggregationConnector()
   * @generated
   */
  EAttribute getAggregationConnector_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LanguageFactory getLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.inria.diverse.puzzle.adl.language.impl.PuzzleCompositionImpl <em>Puzzle Composition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.puzzle.adl.language.impl.PuzzleCompositionImpl
     * @see fr.inria.diverse.puzzle.adl.language.impl.LanguagePackageImpl#getPuzzleComposition()
     * @generated
     */
    EClass PUZZLE_COMPOSITION = eINSTANCE.getPuzzleComposition();

    /**
     * The meta object literal for the '<em><b>Melange File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PUZZLE_COMPOSITION__MELANGE_FILE = eINSTANCE.getPuzzleComposition_MelangeFile();

    /**
     * The meta object literal for the '<em><b>Composites</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PUZZLE_COMPOSITION__COMPOSITES = eINSTANCE.getPuzzleComposition_Composites();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.puzzle.adl.language.impl.CompositeLanguageImpl <em>Composite Language</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.puzzle.adl.language.impl.CompositeLanguageImpl
     * @see fr.inria.diverse.puzzle.adl.language.impl.LanguagePackageImpl#getCompositeLanguage()
     * @generated
     */
    EClass COMPOSITE_LANGUAGE = eINSTANCE.getCompositeLanguage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPOSITE_LANGUAGE__NAME = eINSTANCE.getCompositeLanguage_Name();

    /**
     * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_LANGUAGE__LINKS = eINSTANCE.getCompositeLanguage_Links();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.puzzle.adl.language.impl.ConnectorImpl <em>Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.puzzle.adl.language.impl.ConnectorImpl
     * @see fr.inria.diverse.puzzle.adl.language.impl.LanguagePackageImpl#getConnector()
     * @generated
     */
    EClass CONNECTOR = eINSTANCE.getConnector();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.puzzle.adl.language.impl.AggregationConnectorImpl <em>Aggregation Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.puzzle.adl.language.impl.AggregationConnectorImpl
     * @see fr.inria.diverse.puzzle.adl.language.impl.LanguagePackageImpl#getAggregationConnector()
     * @generated
     */
    EClass AGGREGATION_CONNECTOR = eINSTANCE.getAggregationConnector();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGGREGATION_CONNECTOR__LEFT = eINSTANCE.getAggregationConnector_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGGREGATION_CONNECTOR__RIGHT = eINSTANCE.getAggregationConnector_Right();

  }

} //LanguagePackage

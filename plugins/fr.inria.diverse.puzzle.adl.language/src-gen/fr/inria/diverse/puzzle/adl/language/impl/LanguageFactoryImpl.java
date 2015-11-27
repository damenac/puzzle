/**
 */
package fr.inria.diverse.puzzle.adl.language.impl;

import fr.inria.diverse.puzzle.adl.language.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LanguageFactoryImpl extends EFactoryImpl implements LanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LanguageFactory init()
  {
    try
    {
      LanguageFactory theLanguageFactory = (LanguageFactory)EPackage.Registry.INSTANCE.getEFactory(LanguagePackage.eNS_URI);
      if (theLanguageFactory != null)
      {
        return theLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LanguagePackage.PUZZLE_COMPOSITION: return createPuzzleComposition();
      case LanguagePackage.COMPOSITE_LANGUAGE: return createCompositeLanguage();
      case LanguagePackage.CONNECTOR: return createConnector();
      case LanguagePackage.AGGREGATION_CONNECTOR: return createAggregationConnector();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PuzzleComposition createPuzzleComposition()
  {
    PuzzleCompositionImpl puzzleComposition = new PuzzleCompositionImpl();
    return puzzleComposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeLanguage createCompositeLanguage()
  {
    CompositeLanguageImpl compositeLanguage = new CompositeLanguageImpl();
    return compositeLanguage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Connector createConnector()
  {
    ConnectorImpl connector = new ConnectorImpl();
    return connector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AggregationConnector createAggregationConnector()
  {
    AggregationConnectorImpl aggregationConnector = new AggregationConnectorImpl();
    return aggregationConnector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguagePackage getLanguagePackage()
  {
    return (LanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LanguagePackage getPackage()
  {
    return LanguagePackage.eINSTANCE;
  }

} //LanguageFactoryImpl

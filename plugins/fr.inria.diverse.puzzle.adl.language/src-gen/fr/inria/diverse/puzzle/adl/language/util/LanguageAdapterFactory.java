/**
 */
package fr.inria.diverse.puzzle.adl.language.util;

import fr.inria.diverse.puzzle.adl.language.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.puzzle.adl.language.LanguagePackage
 * @generated
 */
public class LanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LanguageSwitch<Adapter> modelSwitch =
    new LanguageSwitch<Adapter>()
    {
      @Override
      public Adapter casePuzzleComposition(PuzzleComposition object)
      {
        return createPuzzleCompositionAdapter();
      }
      @Override
      public Adapter caseCompositeLanguage(CompositeLanguage object)
      {
        return createCompositeLanguageAdapter();
      }
      @Override
      public Adapter caseConnector(Connector object)
      {
        return createConnectorAdapter();
      }
      @Override
      public Adapter caseAggregationConnector(AggregationConnector object)
      {
        return createAggregationConnectorAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.inria.diverse.puzzle.adl.language.PuzzleComposition <em>Puzzle Composition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.diverse.puzzle.adl.language.PuzzleComposition
   * @generated
   */
  public Adapter createPuzzleCompositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.diverse.puzzle.adl.language.CompositeLanguage <em>Composite Language</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.diverse.puzzle.adl.language.CompositeLanguage
   * @generated
   */
  public Adapter createCompositeLanguageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.diverse.puzzle.adl.language.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.diverse.puzzle.adl.language.Connector
   * @generated
   */
  public Adapter createConnectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.diverse.puzzle.adl.language.AggregationConnector <em>Aggregation Connector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.diverse.puzzle.adl.language.AggregationConnector
   * @generated
   */
  public Adapter createAggregationConnectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LanguageAdapterFactory

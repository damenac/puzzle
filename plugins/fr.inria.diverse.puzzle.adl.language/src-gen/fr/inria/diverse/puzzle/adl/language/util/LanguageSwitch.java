/**
 */
package fr.inria.diverse.puzzle.adl.language.util;

import fr.inria.diverse.puzzle.adl.language.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.puzzle.adl.language.LanguagePackage
 * @generated
 */
public class LanguageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LanguagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LanguagePackage.PUZZLE_COMPOSITION:
      {
        PuzzleComposition puzzleComposition = (PuzzleComposition)theEObject;
        T result = casePuzzleComposition(puzzleComposition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LanguagePackage.COMPOSITE_LANGUAGE:
      {
        CompositeLanguage compositeLanguage = (CompositeLanguage)theEObject;
        T result = caseCompositeLanguage(compositeLanguage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LanguagePackage.CONNECTOR:
      {
        Connector connector = (Connector)theEObject;
        T result = caseConnector(connector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LanguagePackage.AGGREGATION_CONNECTOR:
      {
        AggregationConnector aggregationConnector = (AggregationConnector)theEObject;
        T result = caseAggregationConnector(aggregationConnector);
        if (result == null) result = caseConnector(aggregationConnector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Puzzle Composition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Puzzle Composition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePuzzleComposition(PuzzleComposition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Language</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Language</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeLanguage(CompositeLanguage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnector(Connector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aggregation Connector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aggregation Connector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAggregationConnector(AggregationConnector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LanguageSwitch

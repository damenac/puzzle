/**
 */
package fr.inria.diverse.puzzle.adl.language;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.puzzle.adl.language.AggregationConnector#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.inria.diverse.puzzle.adl.language.AggregationConnector#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.puzzle.adl.language.LanguagePackage#getAggregationConnector()
 * @model
 * @generated
 */
public interface AggregationConnector extends Connector
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' attribute.
   * @see #setLeft(String)
   * @see fr.inria.diverse.puzzle.adl.language.LanguagePackage#getAggregationConnector_Left()
   * @model
   * @generated
   */
  String getLeft();

  /**
   * Sets the value of the '{@link fr.inria.diverse.puzzle.adl.language.AggregationConnector#getLeft <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' attribute.
   * @see #getLeft()
   * @generated
   */
  void setLeft(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' attribute.
   * @see #setRight(String)
   * @see fr.inria.diverse.puzzle.adl.language.LanguagePackage#getAggregationConnector_Right()
   * @model
   * @generated
   */
  String getRight();

  /**
   * Sets the value of the '{@link fr.inria.diverse.puzzle.adl.language.AggregationConnector#getRight <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' attribute.
   * @see #getRight()
   * @generated
   */
  void setRight(String value);

} // AggregationConnector

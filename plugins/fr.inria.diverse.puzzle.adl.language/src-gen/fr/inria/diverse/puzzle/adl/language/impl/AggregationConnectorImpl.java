/**
 */
package fr.inria.diverse.puzzle.adl.language.impl;

import fr.inria.diverse.puzzle.adl.language.AggregationConnector;
import fr.inria.diverse.puzzle.adl.language.LanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.puzzle.adl.language.impl.AggregationConnectorImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.inria.diverse.puzzle.adl.language.impl.AggregationConnectorImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregationConnectorImpl extends ConnectorImpl implements AggregationConnector
{
  /**
   * The default value of the '{@link #getLeft() <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected static final String LEFT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected String left = LEFT_EDEFAULT;

  /**
   * The default value of the '{@link #getRight() <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected static final String RIGHT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected String right = RIGHT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AggregationConnectorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LanguagePackage.Literals.AGGREGATION_CONNECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(String newLeft)
  {
    String oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.AGGREGATION_CONNECTOR__LEFT, oldLeft, left));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(String newRight)
  {
    String oldRight = right;
    right = newRight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.AGGREGATION_CONNECTOR__RIGHT, oldRight, right));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LanguagePackage.AGGREGATION_CONNECTOR__LEFT:
        return getLeft();
      case LanguagePackage.AGGREGATION_CONNECTOR__RIGHT:
        return getRight();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LanguagePackage.AGGREGATION_CONNECTOR__LEFT:
        setLeft((String)newValue);
        return;
      case LanguagePackage.AGGREGATION_CONNECTOR__RIGHT:
        setRight((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LanguagePackage.AGGREGATION_CONNECTOR__LEFT:
        setLeft(LEFT_EDEFAULT);
        return;
      case LanguagePackage.AGGREGATION_CONNECTOR__RIGHT:
        setRight(RIGHT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LanguagePackage.AGGREGATION_CONNECTOR__LEFT:
        return LEFT_EDEFAULT == null ? left != null : !LEFT_EDEFAULT.equals(left);
      case LanguagePackage.AGGREGATION_CONNECTOR__RIGHT:
        return RIGHT_EDEFAULT == null ? right != null : !RIGHT_EDEFAULT.equals(right);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (left: ");
    result.append(left);
    result.append(", right: ");
    result.append(right);
    result.append(')');
    return result.toString();
  }

} //AggregationConnectorImpl

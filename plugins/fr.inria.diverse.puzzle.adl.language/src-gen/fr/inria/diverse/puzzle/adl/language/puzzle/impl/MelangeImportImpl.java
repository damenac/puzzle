/**
 */
package fr.inria.diverse.puzzle.adl.language.puzzle.impl;

import fr.inria.diverse.puzzle.adl.language.puzzle.MelangeImport;
import fr.inria.diverse.puzzle.adl.language.puzzle.PuzzlePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Melange Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.puzzle.adl.language.puzzle.impl.MelangeImportImpl#getMelangeFile <em>Melange File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MelangeImportImpl extends MinimalEObjectImpl.Container implements MelangeImport
{
  /**
   * The default value of the '{@link #getMelangeFile() <em>Melange File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMelangeFile()
   * @generated
   * @ordered
   */
  protected static final String MELANGE_FILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMelangeFile() <em>Melange File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMelangeFile()
   * @generated
   * @ordered
   */
  protected String melangeFile = MELANGE_FILE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MelangeImportImpl()
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
    return PuzzlePackage.Literals.MELANGE_IMPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMelangeFile()
  {
    return melangeFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMelangeFile(String newMelangeFile)
  {
    String oldMelangeFile = melangeFile;
    melangeFile = newMelangeFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PuzzlePackage.MELANGE_IMPORT__MELANGE_FILE, oldMelangeFile, melangeFile));
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
      case PuzzlePackage.MELANGE_IMPORT__MELANGE_FILE:
        return getMelangeFile();
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
      case PuzzlePackage.MELANGE_IMPORT__MELANGE_FILE:
        setMelangeFile((String)newValue);
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
      case PuzzlePackage.MELANGE_IMPORT__MELANGE_FILE:
        setMelangeFile(MELANGE_FILE_EDEFAULT);
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
      case PuzzlePackage.MELANGE_IMPORT__MELANGE_FILE:
        return MELANGE_FILE_EDEFAULT == null ? melangeFile != null : !MELANGE_FILE_EDEFAULT.equals(melangeFile);
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
    result.append(" (melangeFile: ");
    result.append(melangeFile);
    result.append(')');
    return result.toString();
  }

} //MelangeImportImpl

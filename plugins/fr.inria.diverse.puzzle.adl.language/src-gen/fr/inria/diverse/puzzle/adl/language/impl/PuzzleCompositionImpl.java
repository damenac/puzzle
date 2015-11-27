/**
 */
package fr.inria.diverse.puzzle.adl.language.impl;

import fr.inria.diverse.puzzle.adl.language.CompositeLanguage;
import fr.inria.diverse.puzzle.adl.language.LanguagePackage;
import fr.inria.diverse.puzzle.adl.language.PuzzleComposition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Puzzle Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.puzzle.adl.language.impl.PuzzleCompositionImpl#getMelangeFile <em>Melange File</em>}</li>
 *   <li>{@link fr.inria.diverse.puzzle.adl.language.impl.PuzzleCompositionImpl#getComposites <em>Composites</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PuzzleCompositionImpl extends MinimalEObjectImpl.Container implements PuzzleComposition
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
   * The cached value of the '{@link #getComposites() <em>Composites</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposites()
   * @generated
   * @ordered
   */
  protected EList<CompositeLanguage> composites;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PuzzleCompositionImpl()
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
    return LanguagePackage.Literals.PUZZLE_COMPOSITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.PUZZLE_COMPOSITION__MELANGE_FILE, oldMelangeFile, melangeFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CompositeLanguage> getComposites()
  {
    if (composites == null)
    {
      composites = new EObjectContainmentEList<CompositeLanguage>(CompositeLanguage.class, this, LanguagePackage.PUZZLE_COMPOSITION__COMPOSITES);
    }
    return composites;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LanguagePackage.PUZZLE_COMPOSITION__COMPOSITES:
        return ((InternalEList<?>)getComposites()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case LanguagePackage.PUZZLE_COMPOSITION__MELANGE_FILE:
        return getMelangeFile();
      case LanguagePackage.PUZZLE_COMPOSITION__COMPOSITES:
        return getComposites();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LanguagePackage.PUZZLE_COMPOSITION__MELANGE_FILE:
        setMelangeFile((String)newValue);
        return;
      case LanguagePackage.PUZZLE_COMPOSITION__COMPOSITES:
        getComposites().clear();
        getComposites().addAll((Collection<? extends CompositeLanguage>)newValue);
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
      case LanguagePackage.PUZZLE_COMPOSITION__MELANGE_FILE:
        setMelangeFile(MELANGE_FILE_EDEFAULT);
        return;
      case LanguagePackage.PUZZLE_COMPOSITION__COMPOSITES:
        getComposites().clear();
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
      case LanguagePackage.PUZZLE_COMPOSITION__MELANGE_FILE:
        return MELANGE_FILE_EDEFAULT == null ? melangeFile != null : !MELANGE_FILE_EDEFAULT.equals(melangeFile);
      case LanguagePackage.PUZZLE_COMPOSITION__COMPOSITES:
        return composites != null && !composites.isEmpty();
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

} //PuzzleCompositionImpl

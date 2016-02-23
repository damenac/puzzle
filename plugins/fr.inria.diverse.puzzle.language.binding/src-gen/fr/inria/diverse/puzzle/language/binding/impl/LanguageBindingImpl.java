/**
 */
package fr.inria.diverse.puzzle.language.binding.impl;

import fr.inria.diverse.puzzle.language.binding.Binding;
import fr.inria.diverse.puzzle.language.binding.BindingPackage;
import fr.inria.diverse.puzzle.language.binding.LanguageBinding;
import fr.inria.diverse.puzzle.language.binding.MelangeImport;

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
 * An implementation of the model object '<em><b>Language Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.puzzle.language.binding.impl.LanguageBindingImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.diverse.puzzle.language.binding.impl.LanguageBindingImpl#getMelangeImport <em>Melange Import</em>}</li>
 *   <li>{@link fr.inria.diverse.puzzle.language.binding.impl.LanguageBindingImpl#getBinding <em>Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LanguageBindingImpl extends MinimalEObjectImpl.Container implements LanguageBinding
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getMelangeImport() <em>Melange Import</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMelangeImport()
   * @generated
   * @ordered
   */
  protected MelangeImport melangeImport;

  /**
   * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinding()
   * @generated
   * @ordered
   */
  protected EList<Binding> binding;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LanguageBindingImpl()
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
    return BindingPackage.Literals.LANGUAGE_BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.LANGUAGE_BINDING__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MelangeImport getMelangeImport()
  {
    return melangeImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMelangeImport(MelangeImport newMelangeImport, NotificationChain msgs)
  {
    MelangeImport oldMelangeImport = melangeImport;
    melangeImport = newMelangeImport;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BindingPackage.LANGUAGE_BINDING__MELANGE_IMPORT, oldMelangeImport, newMelangeImport);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMelangeImport(MelangeImport newMelangeImport)
  {
    if (newMelangeImport != melangeImport)
    {
      NotificationChain msgs = null;
      if (melangeImport != null)
        msgs = ((InternalEObject)melangeImport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BindingPackage.LANGUAGE_BINDING__MELANGE_IMPORT, null, msgs);
      if (newMelangeImport != null)
        msgs = ((InternalEObject)newMelangeImport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BindingPackage.LANGUAGE_BINDING__MELANGE_IMPORT, null, msgs);
      msgs = basicSetMelangeImport(newMelangeImport, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.LANGUAGE_BINDING__MELANGE_IMPORT, newMelangeImport, newMelangeImport));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Binding> getBinding()
  {
    if (binding == null)
    {
      binding = new EObjectContainmentEList<Binding>(Binding.class, this, BindingPackage.LANGUAGE_BINDING__BINDING);
    }
    return binding;
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
      case BindingPackage.LANGUAGE_BINDING__MELANGE_IMPORT:
        return basicSetMelangeImport(null, msgs);
      case BindingPackage.LANGUAGE_BINDING__BINDING:
        return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
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
      case BindingPackage.LANGUAGE_BINDING__NAME:
        return getName();
      case BindingPackage.LANGUAGE_BINDING__MELANGE_IMPORT:
        return getMelangeImport();
      case BindingPackage.LANGUAGE_BINDING__BINDING:
        return getBinding();
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
      case BindingPackage.LANGUAGE_BINDING__NAME:
        setName((String)newValue);
        return;
      case BindingPackage.LANGUAGE_BINDING__MELANGE_IMPORT:
        setMelangeImport((MelangeImport)newValue);
        return;
      case BindingPackage.LANGUAGE_BINDING__BINDING:
        getBinding().clear();
        getBinding().addAll((Collection<? extends Binding>)newValue);
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
      case BindingPackage.LANGUAGE_BINDING__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BindingPackage.LANGUAGE_BINDING__MELANGE_IMPORT:
        setMelangeImport((MelangeImport)null);
        return;
      case BindingPackage.LANGUAGE_BINDING__BINDING:
        getBinding().clear();
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
      case BindingPackage.LANGUAGE_BINDING__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BindingPackage.LANGUAGE_BINDING__MELANGE_IMPORT:
        return melangeImport != null;
      case BindingPackage.LANGUAGE_BINDING__BINDING:
        return binding != null && !binding.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //LanguageBindingImpl

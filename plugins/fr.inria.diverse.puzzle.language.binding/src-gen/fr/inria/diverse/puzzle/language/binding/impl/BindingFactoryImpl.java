/**
 */
package fr.inria.diverse.puzzle.language.binding.impl;

import fr.inria.diverse.puzzle.language.binding.*;

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
public class BindingFactoryImpl extends EFactoryImpl implements BindingFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BindingFactory init()
  {
    try
    {
      BindingFactory theBindingFactory = (BindingFactory)EPackage.Registry.INSTANCE.getEFactory(BindingPackage.eNS_URI);
      if (theBindingFactory != null)
      {
        return theBindingFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BindingFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingFactoryImpl()
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
      case BindingPackage.LANGUAGE_BINDING: return createLanguageBinding();
      case BindingPackage.MELANGE_IMPORT: return createMelangeImport();
      case BindingPackage.BINDING: return createBinding();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageBinding createLanguageBinding()
  {
    LanguageBindingImpl languageBinding = new LanguageBindingImpl();
    return languageBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MelangeImport createMelangeImport()
  {
    MelangeImportImpl melangeImport = new MelangeImportImpl();
    return melangeImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingPackage getBindingPackage()
  {
    return (BindingPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BindingPackage getPackage()
  {
    return BindingPackage.eINSTANCE;
  }

} //BindingFactoryImpl

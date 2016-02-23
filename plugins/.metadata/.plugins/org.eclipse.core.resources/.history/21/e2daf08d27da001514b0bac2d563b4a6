/**
 */
package fr.inria.diverse.puzzle.adl.language.puzzle.impl;

import fr.inria.diverse.puzzle.adl.language.puzzle.*;

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
public class PuzzleFactoryImpl extends EFactoryImpl implements PuzzleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PuzzleFactory init()
  {
    try
    {
      PuzzleFactory thePuzzleFactory = (PuzzleFactory)EPackage.Registry.INSTANCE.getEFactory(PuzzlePackage.eNS_URI);
      if (thePuzzleFactory != null)
      {
        return thePuzzleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PuzzleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PuzzleFactoryImpl()
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
      case PuzzlePackage.LANGUAGE_BINDING: return createLanguageBinding();
      case PuzzlePackage.MELANGE_IMPORT: return createMelangeImport();
      case PuzzlePackage.BINDING: return createBinding();
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
  public PuzzlePackage getPuzzlePackage()
  {
    return (PuzzlePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PuzzlePackage getPackage()
  {
    return PuzzlePackage.eINSTANCE;
  }

} //PuzzleFactoryImpl

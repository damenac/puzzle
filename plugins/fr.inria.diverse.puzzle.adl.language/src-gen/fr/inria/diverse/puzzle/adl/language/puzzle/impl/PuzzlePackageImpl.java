/**
 */
package fr.inria.diverse.puzzle.adl.language.puzzle.impl;

import fr.inria.diverse.puzzle.adl.language.puzzle.Binding;
import fr.inria.diverse.puzzle.adl.language.puzzle.LanguageBinding;
import fr.inria.diverse.puzzle.adl.language.puzzle.MelangeImport;
import fr.inria.diverse.puzzle.adl.language.puzzle.PuzzleFactory;
import fr.inria.diverse.puzzle.adl.language.puzzle.PuzzlePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PuzzlePackageImpl extends EPackageImpl implements PuzzlePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass languageBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass melangeImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindingEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.inria.diverse.puzzle.adl.language.puzzle.PuzzlePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PuzzlePackageImpl()
  {
    super(eNS_URI, PuzzleFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PuzzlePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PuzzlePackage init()
  {
    if (isInited) return (PuzzlePackage)EPackage.Registry.INSTANCE.getEPackage(PuzzlePackage.eNS_URI);

    // Obtain or create and register package
    PuzzlePackageImpl thePuzzlePackage = (PuzzlePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PuzzlePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PuzzlePackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePuzzlePackage.createPackageContents();

    // Initialize created meta-data
    thePuzzlePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePuzzlePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PuzzlePackage.eNS_URI, thePuzzlePackage);
    return thePuzzlePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLanguageBinding()
  {
    return languageBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLanguageBinding_Name()
  {
    return (EAttribute)languageBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLanguageBinding_MelangeImport()
  {
    return (EReference)languageBindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLanguageBinding_Binding()
  {
    return (EReference)languageBindingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMelangeImport()
  {
    return melangeImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMelangeImport_MelangeFile()
  {
    return (EAttribute)melangeImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinding()
  {
    return bindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinding_Left()
  {
    return (EAttribute)bindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinding_Right()
  {
    return (EAttribute)bindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PuzzleFactory getPuzzleFactory()
  {
    return (PuzzleFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    languageBindingEClass = createEClass(LANGUAGE_BINDING);
    createEAttribute(languageBindingEClass, LANGUAGE_BINDING__NAME);
    createEReference(languageBindingEClass, LANGUAGE_BINDING__MELANGE_IMPORT);
    createEReference(languageBindingEClass, LANGUAGE_BINDING__BINDING);

    melangeImportEClass = createEClass(MELANGE_IMPORT);
    createEAttribute(melangeImportEClass, MELANGE_IMPORT__MELANGE_FILE);

    bindingEClass = createEClass(BINDING);
    createEAttribute(bindingEClass, BINDING__LEFT);
    createEAttribute(bindingEClass, BINDING__RIGHT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(languageBindingEClass, LanguageBinding.class, "LanguageBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLanguageBinding_Name(), ecorePackage.getEString(), "name", null, 0, 1, LanguageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLanguageBinding_MelangeImport(), this.getMelangeImport(), null, "melangeImport", null, 0, 1, LanguageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLanguageBinding_Binding(), this.getBinding(), null, "binding", null, 0, -1, LanguageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(melangeImportEClass, MelangeImport.class, "MelangeImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMelangeImport_MelangeFile(), ecorePackage.getEString(), "melangeFile", null, 0, 1, MelangeImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBinding_Left(), ecorePackage.getEString(), "left", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinding_Right(), ecorePackage.getEString(), "right", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PuzzlePackageImpl

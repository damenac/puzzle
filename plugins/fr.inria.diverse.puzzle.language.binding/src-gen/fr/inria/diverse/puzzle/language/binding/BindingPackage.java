/**
 */
package fr.inria.diverse.puzzle.language.binding;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.puzzle.language.binding.BindingFactory
 * @model kind="package"
 * @generated
 */
public interface BindingPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "binding";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.inria.fr/diverse/puzzle/language/Binding";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "binding";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BindingPackage eINSTANCE = fr.inria.diverse.puzzle.language.binding.impl.BindingPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.inria.diverse.puzzle.language.binding.impl.LanguageBindingImpl <em>Language Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.puzzle.language.binding.impl.LanguageBindingImpl
   * @see fr.inria.diverse.puzzle.language.binding.impl.BindingPackageImpl#getLanguageBinding()
   * @generated
   */
  int LANGUAGE_BINDING = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_BINDING__NAME = 0;

  /**
   * The feature id for the '<em><b>Melange Import</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_BINDING__MELANGE_IMPORT = 1;

  /**
   * The feature id for the '<em><b>Binding</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_BINDING__BINDING = 2;

  /**
   * The number of structural features of the '<em>Language Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_BINDING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.inria.diverse.puzzle.language.binding.impl.MelangeImportImpl <em>Melange Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.puzzle.language.binding.impl.MelangeImportImpl
   * @see fr.inria.diverse.puzzle.language.binding.impl.BindingPackageImpl#getMelangeImport()
   * @generated
   */
  int MELANGE_IMPORT = 1;

  /**
   * The feature id for the '<em><b>Melange File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MELANGE_IMPORT__MELANGE_FILE = 0;

  /**
   * The number of structural features of the '<em>Melange Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MELANGE_IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.inria.diverse.puzzle.language.binding.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.puzzle.language.binding.impl.BindingImpl
   * @see fr.inria.diverse.puzzle.language.binding.impl.BindingPackageImpl#getBinding()
   * @generated
   */
  int BINDING = 2;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__RIGHT = 1;

  /**
   * The number of structural features of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link fr.inria.diverse.puzzle.language.binding.LanguageBinding <em>Language Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Language Binding</em>'.
   * @see fr.inria.diverse.puzzle.language.binding.LanguageBinding
   * @generated
   */
  EClass getLanguageBinding();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.puzzle.language.binding.LanguageBinding#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.diverse.puzzle.language.binding.LanguageBinding#getName()
   * @see #getLanguageBinding()
   * @generated
   */
  EAttribute getLanguageBinding_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.diverse.puzzle.language.binding.LanguageBinding#getMelangeImport <em>Melange Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Melange Import</em>'.
   * @see fr.inria.diverse.puzzle.language.binding.LanguageBinding#getMelangeImport()
   * @see #getLanguageBinding()
   * @generated
   */
  EReference getLanguageBinding_MelangeImport();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.diverse.puzzle.language.binding.LanguageBinding#getBinding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Binding</em>'.
   * @see fr.inria.diverse.puzzle.language.binding.LanguageBinding#getBinding()
   * @see #getLanguageBinding()
   * @generated
   */
  EReference getLanguageBinding_Binding();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.puzzle.language.binding.MelangeImport <em>Melange Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Melange Import</em>'.
   * @see fr.inria.diverse.puzzle.language.binding.MelangeImport
   * @generated
   */
  EClass getMelangeImport();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.puzzle.language.binding.MelangeImport#getMelangeFile <em>Melange File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Melange File</em>'.
   * @see fr.inria.diverse.puzzle.language.binding.MelangeImport#getMelangeFile()
   * @see #getMelangeImport()
   * @generated
   */
  EAttribute getMelangeImport_MelangeFile();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.puzzle.language.binding.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding</em>'.
   * @see fr.inria.diverse.puzzle.language.binding.Binding
   * @generated
   */
  EClass getBinding();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.puzzle.language.binding.Binding#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see fr.inria.diverse.puzzle.language.binding.Binding#getLeft()
   * @see #getBinding()
   * @generated
   */
  EAttribute getBinding_Left();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.puzzle.language.binding.Binding#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see fr.inria.diverse.puzzle.language.binding.Binding#getRight()
   * @see #getBinding()
   * @generated
   */
  EAttribute getBinding_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BindingFactory getBindingFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.inria.diverse.puzzle.language.binding.impl.LanguageBindingImpl <em>Language Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.puzzle.language.binding.impl.LanguageBindingImpl
     * @see fr.inria.diverse.puzzle.language.binding.impl.BindingPackageImpl#getLanguageBinding()
     * @generated
     */
    EClass LANGUAGE_BINDING = eINSTANCE.getLanguageBinding();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LANGUAGE_BINDING__NAME = eINSTANCE.getLanguageBinding_Name();

    /**
     * The meta object literal for the '<em><b>Melange Import</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANGUAGE_BINDING__MELANGE_IMPORT = eINSTANCE.getLanguageBinding_MelangeImport();

    /**
     * The meta object literal for the '<em><b>Binding</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANGUAGE_BINDING__BINDING = eINSTANCE.getLanguageBinding_Binding();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.puzzle.language.binding.impl.MelangeImportImpl <em>Melange Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.puzzle.language.binding.impl.MelangeImportImpl
     * @see fr.inria.diverse.puzzle.language.binding.impl.BindingPackageImpl#getMelangeImport()
     * @generated
     */
    EClass MELANGE_IMPORT = eINSTANCE.getMelangeImport();

    /**
     * The meta object literal for the '<em><b>Melange File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MELANGE_IMPORT__MELANGE_FILE = eINSTANCE.getMelangeImport_MelangeFile();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.puzzle.language.binding.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.puzzle.language.binding.impl.BindingImpl
     * @see fr.inria.diverse.puzzle.language.binding.impl.BindingPackageImpl#getBinding()
     * @generated
     */
    EClass BINDING = eINSTANCE.getBinding();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING__LEFT = eINSTANCE.getBinding_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING__RIGHT = eINSTANCE.getBinding_Right();

  }

} //BindingPackage

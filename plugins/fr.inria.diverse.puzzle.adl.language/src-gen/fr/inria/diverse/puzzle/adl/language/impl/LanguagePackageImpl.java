/**
 */
package fr.inria.diverse.puzzle.adl.language.impl;

import fr.inria.diverse.puzzle.adl.language.AggregationConnector;
import fr.inria.diverse.puzzle.adl.language.CompositeLanguage;
import fr.inria.diverse.puzzle.adl.language.Connector;
import fr.inria.diverse.puzzle.adl.language.LanguageFactory;
import fr.inria.diverse.puzzle.adl.language.LanguagePackage;
import fr.inria.diverse.puzzle.adl.language.PuzzleComposition;

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
public class LanguagePackageImpl extends EPackageImpl implements LanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass puzzleCompositionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositeLanguageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass connectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aggregationConnectorEClass = null;

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
   * @see fr.inria.diverse.puzzle.adl.language.LanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private LanguagePackageImpl()
  {
    super(eNS_URI, LanguageFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link LanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LanguagePackage init()
  {
    if (isInited) return (LanguagePackage)EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI);

    // Obtain or create and register package
    LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LanguagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LanguagePackage.eNS_URI, theLanguagePackage);
    return theLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPuzzleComposition()
  {
    return puzzleCompositionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPuzzleComposition_MelangeFile()
  {
    return (EAttribute)puzzleCompositionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPuzzleComposition_Composites()
  {
    return (EReference)puzzleCompositionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositeLanguage()
  {
    return compositeLanguageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCompositeLanguage_Name()
  {
    return (EAttribute)compositeLanguageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeLanguage_Links()
  {
    return (EReference)compositeLanguageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConnector()
  {
    return connectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAggregationConnector()
  {
    return aggregationConnectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAggregationConnector_Left()
  {
    return (EAttribute)aggregationConnectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAggregationConnector_Right()
  {
    return (EAttribute)aggregationConnectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageFactory getLanguageFactory()
  {
    return (LanguageFactory)getEFactoryInstance();
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
    puzzleCompositionEClass = createEClass(PUZZLE_COMPOSITION);
    createEAttribute(puzzleCompositionEClass, PUZZLE_COMPOSITION__MELANGE_FILE);
    createEReference(puzzleCompositionEClass, PUZZLE_COMPOSITION__COMPOSITES);

    compositeLanguageEClass = createEClass(COMPOSITE_LANGUAGE);
    createEAttribute(compositeLanguageEClass, COMPOSITE_LANGUAGE__NAME);
    createEReference(compositeLanguageEClass, COMPOSITE_LANGUAGE__LINKS);

    connectorEClass = createEClass(CONNECTOR);

    aggregationConnectorEClass = createEClass(AGGREGATION_CONNECTOR);
    createEAttribute(aggregationConnectorEClass, AGGREGATION_CONNECTOR__LEFT);
    createEAttribute(aggregationConnectorEClass, AGGREGATION_CONNECTOR__RIGHT);
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
    aggregationConnectorEClass.getESuperTypes().add(this.getConnector());

    // Initialize classes and features; add operations and parameters
    initEClass(puzzleCompositionEClass, PuzzleComposition.class, "PuzzleComposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPuzzleComposition_MelangeFile(), ecorePackage.getEString(), "melangeFile", null, 0, 1, PuzzleComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPuzzleComposition_Composites(), this.getCompositeLanguage(), null, "composites", null, 0, -1, PuzzleComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compositeLanguageEClass, CompositeLanguage.class, "CompositeLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCompositeLanguage_Name(), ecorePackage.getEString(), "name", null, 0, 1, CompositeLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompositeLanguage_Links(), this.getConnector(), null, "links", null, 0, -1, CompositeLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(aggregationConnectorEClass, AggregationConnector.class, "AggregationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAggregationConnector_Left(), ecorePackage.getEString(), "left", null, 0, 1, AggregationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAggregationConnector_Right(), ecorePackage.getEString(), "right", null, 0, 1, AggregationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //LanguagePackageImpl

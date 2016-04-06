/**
 */
package PuzzleADL.impl;

import PuzzleADL.AbstractSyntaxImplementation;
import PuzzleADL.InterfaceBinding;
import PuzzleADL.LanguageArchitecture;
import PuzzleADL.LanguageModule;
import PuzzleADL.NamedElement;
import PuzzleADL.ProvidedInterface;
import PuzzleADL.PuzzleADLFactory;
import PuzzleADL.PuzzleADLPackage;
import PuzzleADL.RequiredInterface;

import PuzzleADL.SemanticsImplementation;
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
public class PuzzleADLPackageImpl extends EPackageImpl implements PuzzleADLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSyntaxImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticsImplementationEClass = null;

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
	 * @see PuzzleADL.PuzzleADLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PuzzleADLPackageImpl() {
		super(eNS_URI, PuzzleADLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PuzzleADLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PuzzleADLPackage init() {
		if (isInited) return (PuzzleADLPackage)EPackage.Registry.INSTANCE.getEPackage(PuzzleADLPackage.eNS_URI);

		// Obtain or create and register package
		PuzzleADLPackageImpl thePuzzleADLPackage = (PuzzleADLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PuzzleADLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PuzzleADLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePuzzleADLPackage.createPackageContents();

		// Initialize created meta-data
		thePuzzleADLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePuzzleADLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PuzzleADLPackage.eNS_URI, thePuzzleADLPackage);
		return thePuzzleADLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageArchitecture() {
		return languageArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageArchitecture_LanguageModules() {
		return (EReference)languageArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageArchitecture_InterfaceBindings() {
		return (EReference)languageArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageModule() {
		return languageModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageModule_RequiredInterface() {
		return (EReference)languageModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageModule_ProvidedInterface() {
		return (EReference)languageModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageModule_AbstractSyntax() {
		return (EReference)languageModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageModule_SemanticsImplementation() {
		return (EReference)languageModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredInterface() {
		return requiredInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredInterface_EcorePath() {
		return (EAttribute)requiredInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredInterface_EcoreRelativePath() {
		return (EAttribute)requiredInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedInterface() {
		return providedInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidedInterface_EcorePath() {
		return (EAttribute)providedInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidedInterface_EcoreRelativePath() {
		return (EAttribute)providedInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceBinding() {
		return interfaceBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceBinding_From() {
		return (EReference)interfaceBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceBinding_To() {
		return (EReference)interfaceBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSyntaxImplementation() {
		return abstractSyntaxImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSyntaxImplementation_EcorePath() {
		return (EAttribute)abstractSyntaxImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSyntaxImplementation_EcoreRelativePath() {
		return (EAttribute)abstractSyntaxImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticsImplementation() {
		return semanticsImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticsImplementation_AspectsIdentifiers() {
		return (EAttribute)semanticsImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuzzleADLFactory getPuzzleADLFactory() {
		return (PuzzleADLFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		languageArchitectureEClass = createEClass(LANGUAGE_ARCHITECTURE);
		createEReference(languageArchitectureEClass, LANGUAGE_ARCHITECTURE__LANGUAGE_MODULES);
		createEReference(languageArchitectureEClass, LANGUAGE_ARCHITECTURE__INTERFACE_BINDINGS);

		languageModuleEClass = createEClass(LANGUAGE_MODULE);
		createEReference(languageModuleEClass, LANGUAGE_MODULE__REQUIRED_INTERFACE);
		createEReference(languageModuleEClass, LANGUAGE_MODULE__PROVIDED_INTERFACE);
		createEReference(languageModuleEClass, LANGUAGE_MODULE__ABSTRACT_SYNTAX);
		createEReference(languageModuleEClass, LANGUAGE_MODULE__SEMANTICS_IMPLEMENTATION);

		requiredInterfaceEClass = createEClass(REQUIRED_INTERFACE);
		createEAttribute(requiredInterfaceEClass, REQUIRED_INTERFACE__ECORE_PATH);
		createEAttribute(requiredInterfaceEClass, REQUIRED_INTERFACE__ECORE_RELATIVE_PATH);

		providedInterfaceEClass = createEClass(PROVIDED_INTERFACE);
		createEAttribute(providedInterfaceEClass, PROVIDED_INTERFACE__ECORE_PATH);
		createEAttribute(providedInterfaceEClass, PROVIDED_INTERFACE__ECORE_RELATIVE_PATH);

		interfaceBindingEClass = createEClass(INTERFACE_BINDING);
		createEReference(interfaceBindingEClass, INTERFACE_BINDING__FROM);
		createEReference(interfaceBindingEClass, INTERFACE_BINDING__TO);

		abstractSyntaxImplementationEClass = createEClass(ABSTRACT_SYNTAX_IMPLEMENTATION);
		createEAttribute(abstractSyntaxImplementationEClass, ABSTRACT_SYNTAX_IMPLEMENTATION__ECORE_PATH);
		createEAttribute(abstractSyntaxImplementationEClass, ABSTRACT_SYNTAX_IMPLEMENTATION__ECORE_RELATIVE_PATH);

		semanticsImplementationEClass = createEClass(SEMANTICS_IMPLEMENTATION);
		createEAttribute(semanticsImplementationEClass, SEMANTICS_IMPLEMENTATION__ASPECTS_IDENTIFIERS);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		languageArchitectureEClass.getESuperTypes().add(this.getNamedElement());
		languageModuleEClass.getESuperTypes().add(this.getNamedElement());
		requiredInterfaceEClass.getESuperTypes().add(this.getNamedElement());
		providedInterfaceEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageArchitectureEClass, LanguageArchitecture.class, "LanguageArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLanguageArchitecture_LanguageModules(), this.getLanguageModule(), null, "languageModules", null, 0, -1, LanguageArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageArchitecture_InterfaceBindings(), this.getInterfaceBinding(), null, "interfaceBindings", null, 0, -1, LanguageArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageModuleEClass, LanguageModule.class, "LanguageModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLanguageModule_RequiredInterface(), this.getRequiredInterface(), null, "requiredInterface", null, 0, 1, LanguageModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageModule_ProvidedInterface(), this.getProvidedInterface(), null, "providedInterface", null, 0, 1, LanguageModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageModule_AbstractSyntax(), this.getAbstractSyntaxImplementation(), null, "abstractSyntax", null, 1, 1, LanguageModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageModule_SemanticsImplementation(), this.getSemanticsImplementation(), null, "semanticsImplementation", null, 0, -1, LanguageModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredInterfaceEClass, RequiredInterface.class, "RequiredInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequiredInterface_EcorePath(), ecorePackage.getEString(), "ecorePath", null, 0, 1, RequiredInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredInterface_EcoreRelativePath(), ecorePackage.getEString(), "ecoreRelativePath", null, 0, 1, RequiredInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedInterfaceEClass, ProvidedInterface.class, "ProvidedInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProvidedInterface_EcorePath(), ecorePackage.getEString(), "ecorePath", null, 0, 1, ProvidedInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidedInterface_EcoreRelativePath(), ecorePackage.getEString(), "ecoreRelativePath", null, 0, 1, ProvidedInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceBindingEClass, InterfaceBinding.class, "InterfaceBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceBinding_From(), this.getRequiredInterface(), null, "from", null, 1, 1, InterfaceBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceBinding_To(), this.getProvidedInterface(), null, "to", null, 1, 1, InterfaceBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractSyntaxImplementationEClass, AbstractSyntaxImplementation.class, "AbstractSyntaxImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractSyntaxImplementation_EcorePath(), ecorePackage.getEString(), "ecorePath", null, 0, 1, AbstractSyntaxImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractSyntaxImplementation_EcoreRelativePath(), ecorePackage.getEString(), "ecoreRelativePath", null, 0, 1, AbstractSyntaxImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semanticsImplementationEClass, SemanticsImplementation.class, "SemanticsImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemanticsImplementation_AspectsIdentifiers(), ecorePackage.getEString(), "aspectsIdentifiers", null, 0, -1, SemanticsImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PuzzleADLPackageImpl

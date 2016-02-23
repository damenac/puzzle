/**
 */
package PuzzleADL;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see PuzzleADL.PuzzleADLFactory
 * @model kind="package"
 * @generated
 */
public interface PuzzleADLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PuzzleADL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.puzzle.language.adl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PuzzleADL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PuzzleADLPackage eINSTANCE = PuzzleADL.impl.PuzzleADLPackageImpl.init();

	/**
	 * The meta object id for the '{@link PuzzleADL.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PuzzleADL.impl.NamedElementImpl
	 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PuzzleADL.impl.LanguageArchitectureImpl <em>Language Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PuzzleADL.impl.LanguageArchitectureImpl
	 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getLanguageArchitecture()
	 * @generated
	 */
	int LANGUAGE_ARCHITECTURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARCHITECTURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Language Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARCHITECTURE__LANGUAGE_MODULES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARCHITECTURE__INTERFACE_BINDINGS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Language Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARCHITECTURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Language Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARCHITECTURE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PuzzleADL.impl.LanguageModuleImpl <em>Language Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PuzzleADL.impl.LanguageModuleImpl
	 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getLanguageModule()
	 * @generated
	 */
	int LANGUAGE_MODULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_MODULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Required Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_MODULE__REQUIRED_INTERFACE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_MODULE__PROVIDED_INTERFACE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Syntax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_MODULE__ABSTRACT_SYNTAX = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Semantics Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_MODULE__SEMANTICS_IMPLEMENTATION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Language Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_MODULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Language Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_MODULE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PuzzleADL.impl.RequiredInterfaceImpl <em>Required Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PuzzleADL.impl.RequiredInterfaceImpl
	 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getRequiredInterface()
	 * @generated
	 */
	int REQUIRED_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ecore Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE__ECORE_PATH = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Required Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PuzzleADL.impl.ProvidedInterfaceImpl <em>Provided Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PuzzleADL.impl.ProvidedInterfaceImpl
	 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getProvidedInterface()
	 * @generated
	 */
	int PROVIDED_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ecore Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__ECORE_PATH = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provided Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Provided Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PuzzleADL.impl.InterfaceBindingImpl <em>Interface Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PuzzleADL.impl.InterfaceBindingImpl
	 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getInterfaceBinding()
	 * @generated
	 */
	int INTERFACE_BINDING = 5;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BINDING__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BINDING__TO = 1;

	/**
	 * The number of structural features of the '<em>Interface Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BINDING_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link PuzzleADL.impl.AbstractSyntaxImplementationImpl <em>Abstract Syntax Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PuzzleADL.impl.AbstractSyntaxImplementationImpl
	 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getAbstractSyntaxImplementation()
	 * @generated
	 */
	int ABSTRACT_SYNTAX_IMPLEMENTATION = 6;

	/**
	 * The feature id for the '<em><b>Ecore Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX_IMPLEMENTATION__ECORE_PATH = 0;

	/**
	 * The number of structural features of the '<em>Abstract Syntax Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX_IMPLEMENTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Syntax Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX_IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PuzzleADL.impl.SemanticsImplementationImpl <em>Semantics Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PuzzleADL.impl.SemanticsImplementationImpl
	 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getSemanticsImplementation()
	 * @generated
	 */
	int SEMANTICS_IMPLEMENTATION = 7;

	/**
	 * The feature id for the '<em><b>Aspects Identifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTICS_IMPLEMENTATION__ASPECTS_IDENTIFIERS = 0;

	/**
	 * The number of structural features of the '<em>Semantics Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTICS_IMPLEMENTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Semantics Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTICS_IMPLEMENTATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link PuzzleADL.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see PuzzleADL.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link PuzzleADL.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PuzzleADL.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link PuzzleADL.LanguageArchitecture <em>Language Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Architecture</em>'.
	 * @see PuzzleADL.LanguageArchitecture
	 * @generated
	 */
	EClass getLanguageArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link PuzzleADL.LanguageArchitecture#getLanguageModules <em>Language Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Language Modules</em>'.
	 * @see PuzzleADL.LanguageArchitecture#getLanguageModules()
	 * @see #getLanguageArchitecture()
	 * @generated
	 */
	EReference getLanguageArchitecture_LanguageModules();

	/**
	 * Returns the meta object for the containment reference list '{@link PuzzleADL.LanguageArchitecture#getInterfaceBindings <em>Interface Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Bindings</em>'.
	 * @see PuzzleADL.LanguageArchitecture#getInterfaceBindings()
	 * @see #getLanguageArchitecture()
	 * @generated
	 */
	EReference getLanguageArchitecture_InterfaceBindings();

	/**
	 * Returns the meta object for class '{@link PuzzleADL.LanguageModule <em>Language Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Module</em>'.
	 * @see PuzzleADL.LanguageModule
	 * @generated
	 */
	EClass getLanguageModule();

	/**
	 * Returns the meta object for the containment reference '{@link PuzzleADL.LanguageModule#getRequiredInterface <em>Required Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Interface</em>'.
	 * @see PuzzleADL.LanguageModule#getRequiredInterface()
	 * @see #getLanguageModule()
	 * @generated
	 */
	EReference getLanguageModule_RequiredInterface();

	/**
	 * Returns the meta object for the containment reference '{@link PuzzleADL.LanguageModule#getProvidedInterface <em>Provided Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provided Interface</em>'.
	 * @see PuzzleADL.LanguageModule#getProvidedInterface()
	 * @see #getLanguageModule()
	 * @generated
	 */
	EReference getLanguageModule_ProvidedInterface();

	/**
	 * Returns the meta object for the containment reference '{@link PuzzleADL.LanguageModule#getAbstractSyntax <em>Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Syntax</em>'.
	 * @see PuzzleADL.LanguageModule#getAbstractSyntax()
	 * @see #getLanguageModule()
	 * @generated
	 */
	EReference getLanguageModule_AbstractSyntax();

	/**
	 * Returns the meta object for the containment reference '{@link PuzzleADL.LanguageModule#getSemanticsImplementation <em>Semantics Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Semantics Implementation</em>'.
	 * @see PuzzleADL.LanguageModule#getSemanticsImplementation()
	 * @see #getLanguageModule()
	 * @generated
	 */
	EReference getLanguageModule_SemanticsImplementation();

	/**
	 * Returns the meta object for class '{@link PuzzleADL.RequiredInterface <em>Required Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Interface</em>'.
	 * @see PuzzleADL.RequiredInterface
	 * @generated
	 */
	EClass getRequiredInterface();

	/**
	 * Returns the meta object for the attribute '{@link PuzzleADL.RequiredInterface#getEcorePath <em>Ecore Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ecore Path</em>'.
	 * @see PuzzleADL.RequiredInterface#getEcorePath()
	 * @see #getRequiredInterface()
	 * @generated
	 */
	EAttribute getRequiredInterface_EcorePath();

	/**
	 * Returns the meta object for class '{@link PuzzleADL.ProvidedInterface <em>Provided Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Interface</em>'.
	 * @see PuzzleADL.ProvidedInterface
	 * @generated
	 */
	EClass getProvidedInterface();

	/**
	 * Returns the meta object for the attribute '{@link PuzzleADL.ProvidedInterface#getEcorePath <em>Ecore Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ecore Path</em>'.
	 * @see PuzzleADL.ProvidedInterface#getEcorePath()
	 * @see #getProvidedInterface()
	 * @generated
	 */
	EAttribute getProvidedInterface_EcorePath();

	/**
	 * Returns the meta object for class '{@link PuzzleADL.InterfaceBinding <em>Interface Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Binding</em>'.
	 * @see PuzzleADL.InterfaceBinding
	 * @generated
	 */
	EClass getInterfaceBinding();

	/**
	 * Returns the meta object for the reference '{@link PuzzleADL.InterfaceBinding#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see PuzzleADL.InterfaceBinding#getFrom()
	 * @see #getInterfaceBinding()
	 * @generated
	 */
	EReference getInterfaceBinding_From();

	/**
	 * Returns the meta object for the reference '{@link PuzzleADL.InterfaceBinding#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see PuzzleADL.InterfaceBinding#getTo()
	 * @see #getInterfaceBinding()
	 * @generated
	 */
	EReference getInterfaceBinding_To();

	/**
	 * Returns the meta object for class '{@link PuzzleADL.AbstractSyntaxImplementation <em>Abstract Syntax Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Syntax Implementation</em>'.
	 * @see PuzzleADL.AbstractSyntaxImplementation
	 * @generated
	 */
	EClass getAbstractSyntaxImplementation();

	/**
	 * Returns the meta object for the attribute '{@link PuzzleADL.AbstractSyntaxImplementation#getEcorePath <em>Ecore Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ecore Path</em>'.
	 * @see PuzzleADL.AbstractSyntaxImplementation#getEcorePath()
	 * @see #getAbstractSyntaxImplementation()
	 * @generated
	 */
	EAttribute getAbstractSyntaxImplementation_EcorePath();

	/**
	 * Returns the meta object for class '{@link PuzzleADL.SemanticsImplementation <em>Semantics Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantics Implementation</em>'.
	 * @see PuzzleADL.SemanticsImplementation
	 * @generated
	 */
	EClass getSemanticsImplementation();

	/**
	 * Returns the meta object for the attribute list '{@link PuzzleADL.SemanticsImplementation#getAspectsIdentifiers <em>Aspects Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Aspects Identifiers</em>'.
	 * @see PuzzleADL.SemanticsImplementation#getAspectsIdentifiers()
	 * @see #getSemanticsImplementation()
	 * @generated
	 */
	EAttribute getSemanticsImplementation_AspectsIdentifiers();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PuzzleADLFactory getPuzzleADLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link PuzzleADL.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PuzzleADL.impl.NamedElementImpl
		 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link PuzzleADL.impl.LanguageArchitectureImpl <em>Language Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PuzzleADL.impl.LanguageArchitectureImpl
		 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getLanguageArchitecture()
		 * @generated
		 */
		EClass LANGUAGE_ARCHITECTURE = eINSTANCE.getLanguageArchitecture();

		/**
		 * The meta object literal for the '<em><b>Language Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_ARCHITECTURE__LANGUAGE_MODULES = eINSTANCE.getLanguageArchitecture_LanguageModules();

		/**
		 * The meta object literal for the '<em><b>Interface Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_ARCHITECTURE__INTERFACE_BINDINGS = eINSTANCE.getLanguageArchitecture_InterfaceBindings();

		/**
		 * The meta object literal for the '{@link PuzzleADL.impl.LanguageModuleImpl <em>Language Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PuzzleADL.impl.LanguageModuleImpl
		 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getLanguageModule()
		 * @generated
		 */
		EClass LANGUAGE_MODULE = eINSTANCE.getLanguageModule();

		/**
		 * The meta object literal for the '<em><b>Required Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_MODULE__REQUIRED_INTERFACE = eINSTANCE.getLanguageModule_RequiredInterface();

		/**
		 * The meta object literal for the '<em><b>Provided Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_MODULE__PROVIDED_INTERFACE = eINSTANCE.getLanguageModule_ProvidedInterface();

		/**
		 * The meta object literal for the '<em><b>Abstract Syntax</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_MODULE__ABSTRACT_SYNTAX = eINSTANCE.getLanguageModule_AbstractSyntax();

		/**
		 * The meta object literal for the '<em><b>Semantics Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_MODULE__SEMANTICS_IMPLEMENTATION = eINSTANCE.getLanguageModule_SemanticsImplementation();

		/**
		 * The meta object literal for the '{@link PuzzleADL.impl.RequiredInterfaceImpl <em>Required Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PuzzleADL.impl.RequiredInterfaceImpl
		 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getRequiredInterface()
		 * @generated
		 */
		EClass REQUIRED_INTERFACE = eINSTANCE.getRequiredInterface();

		/**
		 * The meta object literal for the '<em><b>Ecore Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_INTERFACE__ECORE_PATH = eINSTANCE.getRequiredInterface_EcorePath();

		/**
		 * The meta object literal for the '{@link PuzzleADL.impl.ProvidedInterfaceImpl <em>Provided Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PuzzleADL.impl.ProvidedInterfaceImpl
		 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getProvidedInterface()
		 * @generated
		 */
		EClass PROVIDED_INTERFACE = eINSTANCE.getProvidedInterface();

		/**
		 * The meta object literal for the '<em><b>Ecore Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDED_INTERFACE__ECORE_PATH = eINSTANCE.getProvidedInterface_EcorePath();

		/**
		 * The meta object literal for the '{@link PuzzleADL.impl.InterfaceBindingImpl <em>Interface Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PuzzleADL.impl.InterfaceBindingImpl
		 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getInterfaceBinding()
		 * @generated
		 */
		EClass INTERFACE_BINDING = eINSTANCE.getInterfaceBinding();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_BINDING__FROM = eINSTANCE.getInterfaceBinding_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_BINDING__TO = eINSTANCE.getInterfaceBinding_To();

		/**
		 * The meta object literal for the '{@link PuzzleADL.impl.AbstractSyntaxImplementationImpl <em>Abstract Syntax Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PuzzleADL.impl.AbstractSyntaxImplementationImpl
		 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getAbstractSyntaxImplementation()
		 * @generated
		 */
		EClass ABSTRACT_SYNTAX_IMPLEMENTATION = eINSTANCE.getAbstractSyntaxImplementation();

		/**
		 * The meta object literal for the '<em><b>Ecore Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SYNTAX_IMPLEMENTATION__ECORE_PATH = eINSTANCE.getAbstractSyntaxImplementation_EcorePath();

		/**
		 * The meta object literal for the '{@link PuzzleADL.impl.SemanticsImplementationImpl <em>Semantics Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PuzzleADL.impl.SemanticsImplementationImpl
		 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getSemanticsImplementation()
		 * @generated
		 */
		EClass SEMANTICS_IMPLEMENTATION = eINSTANCE.getSemanticsImplementation();

		/**
		 * The meta object literal for the '<em><b>Aspects Identifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTICS_IMPLEMENTATION__ASPECTS_IDENTIFIERS = eINSTANCE.getSemanticsImplementation_AspectsIdentifiers();

	}

} //PuzzleADLPackage

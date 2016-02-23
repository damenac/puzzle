/**
 */
package PuzzleADL.impl;

import PuzzleADL.*;

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
public class PuzzleADLFactoryImpl extends EFactoryImpl implements PuzzleADLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PuzzleADLFactory init() {
		try {
			PuzzleADLFactory thePuzzleADLFactory = (PuzzleADLFactory)EPackage.Registry.INSTANCE.getEFactory(PuzzleADLPackage.eNS_URI);
			if (thePuzzleADLFactory != null) {
				return thePuzzleADLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PuzzleADLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuzzleADLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PuzzleADLPackage.NAMED_ELEMENT: return createNamedElement();
			case PuzzleADLPackage.LANGUAGE_ARCHITECTURE: return createLanguageArchitecture();
			case PuzzleADLPackage.LANGUAGE_MODULE: return createLanguageModule();
			case PuzzleADLPackage.REQUIRED_INTERFACE: return createRequiredInterface();
			case PuzzleADLPackage.PROVIDED_INTERFACE: return createProvidedInterface();
			case PuzzleADLPackage.INTERFACE_BINDING: return createInterfaceBinding();
			case PuzzleADLPackage.ABSTRACT_SYNTAX_IMPLEMENTATION: return createAbstractSyntaxImplementation();
			case PuzzleADLPackage.SEMANTICS_IMPLEMENTATION: return createSemanticsImplementation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageArchitecture createLanguageArchitecture() {
		LanguageArchitectureImpl languageArchitecture = new LanguageArchitectureImpl();
		return languageArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageModule createLanguageModule() {
		LanguageModuleImpl languageModule = new LanguageModuleImpl();
		return languageModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredInterface createRequiredInterface() {
		RequiredInterfaceImpl requiredInterface = new RequiredInterfaceImpl();
		return requiredInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedInterface createProvidedInterface() {
		ProvidedInterfaceImpl providedInterface = new ProvidedInterfaceImpl();
		return providedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceBinding createInterfaceBinding() {
		InterfaceBindingImpl interfaceBinding = new InterfaceBindingImpl();
		return interfaceBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSyntaxImplementation createAbstractSyntaxImplementation() {
		AbstractSyntaxImplementationImpl abstractSyntaxImplementation = new AbstractSyntaxImplementationImpl();
		return abstractSyntaxImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticsImplementation createSemanticsImplementation() {
		SemanticsImplementationImpl semanticsImplementation = new SemanticsImplementationImpl();
		return semanticsImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuzzleADLPackage getPuzzleADLPackage() {
		return (PuzzleADLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PuzzleADLPackage getPackage() {
		return PuzzleADLPackage.eINSTANCE;
	}

} //PuzzleADLFactoryImpl

/**
 */
package Multivar.impl;

import Multivar.*;

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
public class MultivarFactoryImpl extends EFactoryImpl implements MultivarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultivarFactory init() {
		try {
			MultivarFactory theMultivarFactory = (MultivarFactory)EPackage.Registry.INSTANCE.getEFactory(MultivarPackage.eNS_URI);
			if (theMultivarFactory != null) {
				return theMultivarFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MultivarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultivarFactoryImpl() {
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
			case MultivarPackage.NAMED_ELEMENT: return createNamedElement();
			case MultivarPackage.LANGUAGE_PRODUCT_LINE: return createLanguageProductLine();
			case MultivarPackage.PRODUCT_LINE_VARIABILITY: return createProductLineVariability();
			case MultivarPackage.LANGUAGE_FEATURE: return createLanguageFeature();
			case MultivarPackage.MANDATORY_CHILD: return createMandatoryChild();
			case MultivarPackage.OPTIONAL_CHILD: return createOptionalChild();
			case MultivarPackage.OR_GROUP_CHILD: return createOrGroupChild();
			case MultivarPackage.ALTERNATIVE_GROUP: return createAlternativeGroup();
			case MultivarPackage.LANGUAGE_VARIABILITY: return createLanguageVariability();
			case MultivarPackage.VARIABILITY_POINT: return createVariabilityPoint();
			case MultivarPackage.VARIATION: return createVariation();
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
	public LanguageProductLine createLanguageProductLine() {
		LanguageProductLineImpl languageProductLine = new LanguageProductLineImpl();
		return languageProductLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductLineVariability createProductLineVariability() {
		ProductLineVariabilityImpl productLineVariability = new ProductLineVariabilityImpl();
		return productLineVariability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageFeature createLanguageFeature() {
		LanguageFeatureImpl languageFeature = new LanguageFeatureImpl();
		return languageFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryChild createMandatoryChild() {
		MandatoryChildImpl mandatoryChild = new MandatoryChildImpl();
		return mandatoryChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalChild createOptionalChild() {
		OptionalChildImpl optionalChild = new OptionalChildImpl();
		return optionalChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrGroupChild createOrGroupChild() {
		OrGroupChildImpl orGroupChild = new OrGroupChildImpl();
		return orGroupChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeGroup createAlternativeGroup() {
		AlternativeGroupImpl alternativeGroup = new AlternativeGroupImpl();
		return alternativeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageVariability createLanguageVariability() {
		LanguageVariabilityImpl languageVariability = new LanguageVariabilityImpl();
		return languageVariability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityPoint createVariabilityPoint() {
		VariabilityPointImpl variabilityPoint = new VariabilityPointImpl();
		return variabilityPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variation createVariation() {
		VariationImpl variation = new VariationImpl();
		return variation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultivarPackage getMultivarPackage() {
		return (MultivarPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MultivarPackage getPackage() {
		return MultivarPackage.eINSTANCE;
	}

} //MultivarFactoryImpl

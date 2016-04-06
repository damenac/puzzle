/**
 */
package vm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see vm.VmPackage
 * @generated
 */
public interface VmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmFactory eINSTANCE = vm.impl.VmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Language Product Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Product Line</em>'.
	 * @generated
	 */
	LanguageProductLine createLanguageProductLine();

	/**
	 * Returns a new object of class '<em>Language Feature Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Feature Model</em>'.
	 * @generated
	 */
	LanguageFeatureModel createLanguageFeatureModel();

	/**
	 * Returns a new object of class '<em>Language Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Feature</em>'.
	 * @generated
	 */
	LanguageFeature createLanguageFeature();

	/**
	 * Returns a new object of class '<em>Language Feature Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Feature Group</em>'.
	 * @generated
	 */
	LanguageFeatureGroup createLanguageFeatureGroup();

	/**
	 * Returns a new object of class '<em>Language Feature Group Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Feature Group Cardinality</em>'.
	 * @generated
	 */
	LanguageFeatureGroupCardinality createLanguageFeatureGroupCardinality();

	/**
	 * Returns a new object of class '<em>Language Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Constraint</em>'.
	 * @generated
	 */
	LanguageConstraint createLanguageConstraint();

	/**
	 * Returns a new object of class '<em>Language Feature Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Feature Ref</em>'.
	 * @generated
	 */
	LanguageFeatureRef createLanguageFeatureRef();

	/**
	 * Returns a new object of class '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Expression</em>'.
	 * @generated
	 */
	UnaryExpression createUnaryExpression();

	/**
	 * Returns a new object of class '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Expression</em>'.
	 * @generated
	 */
	BinaryExpression createBinaryExpression();

	/**
	 * Returns a new object of class '<em>Orthogonal Variability Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orthogonal Variability Model</em>'.
	 * @generated
	 */
	OrthogonalVariabilityModel createOrthogonalVariabilityModel();

	/**
	 * Returns a new object of class '<em>Semantic Variation Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Variation Point</em>'.
	 * @generated
	 */
	SemanticVariationPoint createSemanticVariationPoint();

	/**
	 * Returns a new object of class '<em>Semantic Interpretation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Interpretation</em>'.
	 * @generated
	 */
	SemanticInterpretation createSemanticInterpretation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VmPackage getVmPackage();

} //VmFactory

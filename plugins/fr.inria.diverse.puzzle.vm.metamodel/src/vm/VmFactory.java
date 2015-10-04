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
	 * Returns a new object of class '<em>PFeature Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PFeature Model</em>'.
	 * @generated
	 */
	PFeatureModel createPFeatureModel();

	/**
	 * Returns a new object of class '<em>PFeature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PFeature</em>'.
	 * @generated
	 */
	PFeature createPFeature();

	/**
	 * Returns a new object of class '<em>PFeature Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PFeature Group</em>'.
	 * @generated
	 */
	PFeatureGroup createPFeatureGroup();

	/**
	 * Returns a new object of class '<em>PFeature Group Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PFeature Group Cardinality</em>'.
	 * @generated
	 */
	PFeatureGroupCardinality createPFeatureGroupCardinality();

	/**
	 * Returns a new object of class '<em>PConstraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PConstraint</em>'.
	 * @generated
	 */
	PConstraint createPConstraint();

	/**
	 * Returns a new object of class '<em>PFeature Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PFeature Ref</em>'.
	 * @generated
	 */
	PFeatureRef createPFeatureRef();

	/**
	 * Returns a new object of class '<em>PUnary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PUnary Expression</em>'.
	 * @generated
	 */
	PUnaryExpression createPUnaryExpression();

	/**
	 * Returns a new object of class '<em>PBinary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PBinary Expression</em>'.
	 * @generated
	 */
	PBinaryExpression createPBinaryExpression();

	/**
	 * Returns a new object of class '<em>PLanguage Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PLanguage Module</em>'.
	 * @generated
	 */
	PLanguageModule createPLanguageModule();

	/**
	 * Returns a new object of class '<em>PAbstract Syntax</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PAbstract Syntax</em>'.
	 * @generated
	 */
	PAbstractSyntax createPAbstractSyntax();

	/**
	 * Returns a new object of class '<em>PSemantics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PSemantics</em>'.
	 * @generated
	 */
	PSemantics createPSemantics();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VmPackage getVmPackage();

} //VmFactory

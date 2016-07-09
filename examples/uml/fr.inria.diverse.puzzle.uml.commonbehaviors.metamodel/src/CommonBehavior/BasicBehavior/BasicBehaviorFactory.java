/**
 */
package CommonBehavior.BasicBehavior;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage
 * @generated
 */
public interface BasicBehaviorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicBehaviorFactory eINSTANCE = CommonBehavior.BasicBehavior.impl.BasicBehaviorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Behaviored Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behaviored Classifier</em>'.
	 * @generated
	 */
	BehavioredClassifier createBehavioredClassifier();

	/**
	 * Returns a new object of class '<em>Opaque Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Behavior</em>'.
	 * @generated
	 */
	OpaqueBehavior createOpaqueBehavior();

	/**
	 * Returns a new object of class '<em>Function Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Behavior</em>'.
	 * @generated
	 */
	FunctionBehavior createFunctionBehavior();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Opaque Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Expression</em>'.
	 * @generated
	 */
	OpaqueExpression createOpaqueExpression();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasicBehaviorPackage getBasicBehaviorPackage();

} //BasicBehaviorFactory

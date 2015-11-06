/**
 */
package ConstraintModule;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ConstraintModule.ConstraintModulePackage
 * @generated
 */
public interface ConstraintModuleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintModuleFactory eINSTANCE = ConstraintModule.impl.ConstraintModuleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Relational Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Constraint</em>'.
	 * @generated
	 */
	RelationalConstraint createRelationalConstraint();

	/**
	 * Returns a new object of class '<em>Integer Lit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Lit</em>'.
	 * @generated
	 */
	IntegerLit createIntegerLit();

	/**
	 * Returns a new object of class '<em>String Lit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Lit</em>'.
	 * @generated
	 */
	StringLit createStringLit();

	/**
	 * Returns a new object of class '<em>Bool Lit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bool Lit</em>'.
	 * @generated
	 */
	BoolLit createBoolLit();

	/**
	 * Returns a new object of class '<em>Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetic Expression</em>'.
	 * @generated
	 */
	ArithmeticExpression createArithmeticExpression();

	/**
	 * Returns a new object of class '<em>Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Expression</em>'.
	 * @generated
	 */
	RelationalExpression createRelationalExpression();

	/**
	 * Returns a new object of class '<em>Var Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Reference</em>'.
	 * @generated
	 */
	VarReference createVarReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConstraintModulePackage getConstraintModulePackage();

} //ConstraintModuleFactory

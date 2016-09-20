/**
 */
package BinaryExpressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see BinaryExpressions.BinaryExpressionsPackage
 * @generated
 */
public interface BinaryExpressionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BinaryExpressionsFactory eINSTANCE = BinaryExpressions.impl.BinaryExpressionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Arithmetic Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetic Expr</em>'.
	 * @generated
	 */
	ArithmeticExpr createArithmeticExpr();

	/**
	 * Returns a new object of class '<em>Boolean Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Expr</em>'.
	 * @generated
	 */
	BooleanExpr createBooleanExpr();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BinaryExpressionsPackage getBinaryExpressionsPackage();

} //BinaryExpressionsFactory

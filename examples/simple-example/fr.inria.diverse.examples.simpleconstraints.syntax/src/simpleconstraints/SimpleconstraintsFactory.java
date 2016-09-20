/**
 */
package simpleconstraints;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see simpleconstraints.SimpleconstraintsPackage
 * @generated
 */
public interface SimpleconstraintsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleconstraintsFactory eINSTANCE = simpleconstraints.impl.SimpleconstraintsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer</em>'.
	 * @generated
	 */
	Integer createInteger();

	/**
	 * Returns a new object of class '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean</em>'.
	 * @generated
	 */
	Boolean createBoolean();

	/**
	 * Returns a new object of class '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String</em>'.
	 * @generated
	 */
	String createString();

	/**
	 * Returns a new object of class '<em>Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real</em>'.
	 * @generated
	 */
	Real createReal();

	/**
	 * Returns a new object of class '<em>Stmt Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stmt Block</em>'.
	 * @generated
	 */
	StmtBlock createStmtBlock();

	/**
	 * Returns a new object of class '<em>Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Expression</em>'.
	 * @generated
	 */
	RelationalExpression createRelationalExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimpleconstraintsPackage getSimpleconstraintsPackage();

} //SimpleconstraintsFactory

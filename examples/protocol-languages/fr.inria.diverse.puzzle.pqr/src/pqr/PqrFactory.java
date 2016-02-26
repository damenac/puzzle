/**
 */
package pqr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pqr.PqrPackage
 * @generated
 */
public interface PqrFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PqrFactory eINSTANCE = pqr.impl.PqrFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>P</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>P</em>'.
	 * @generated
	 */
	P createP();

	/**
	 * Returns a new object of class '<em>Q</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Q</em>'.
	 * @generated
	 */
	Q createQ();

	/**
	 * Returns a new object of class '<em>R</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>R</em>'.
	 * @generated
	 */
	R createR();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PqrPackage getPqrPackage();

} //PqrFactory

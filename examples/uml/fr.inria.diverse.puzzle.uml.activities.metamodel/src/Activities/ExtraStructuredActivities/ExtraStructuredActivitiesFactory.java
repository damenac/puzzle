/**
 */
package Activities.ExtraStructuredActivities;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage
 * @generated
 */
public interface ExtraStructuredActivitiesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtraStructuredActivitiesFactory eINSTANCE = Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Handler</em>'.
	 * @generated
	 */
	ExceptionHandler createExceptionHandler();

	/**
	 * Returns a new object of class '<em>Expansion Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expansion Region</em>'.
	 * @generated
	 */
	ExpansionRegion createExpansionRegion();

	/**
	 * Returns a new object of class '<em>Expansion Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expansion Node</em>'.
	 * @generated
	 */
	ExpansionNode createExpansionNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExtraStructuredActivitiesPackage getExtraStructuredActivitiesPackage();

} //ExtraStructuredActivitiesFactory

/**
 */
package AndTriggerModuleProv;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see AndTriggerModuleProv.AndTriggerModuleProvPackage
 * @generated
 */
public interface AndTriggerModuleProvFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AndTriggerModuleProvFactory eINSTANCE = AndTriggerModuleProv.impl.AndTriggerModuleProvFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>And Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Trigger</em>'.
	 * @generated
	 */
	AndTrigger createAndTrigger();

	/**
	 * Returns a new object of class '<em>Deep History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deep History</em>'.
	 * @generated
	 */
	DeepHistory createDeepHistory();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AndTriggerModuleProvPackage getAndTriggerModuleProvPackage();

} //AndTriggerModuleProvFactory

/**
 */
package AndTriggerModuleReq;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see AndTriggerModuleReq.AndTriggerModuleReqPackage
 * @generated
 */
public interface AndTriggerModuleReqFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AndTriggerModuleReqFactory eINSTANCE = AndTriggerModuleReq.impl.AndTriggerModuleReqFactoryImpl.init();

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
	AndTriggerModuleReqPackage getAndTriggerModuleReqPackage();

} //AndTriggerModuleReqFactory

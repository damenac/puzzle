/**
 */
package complextriggers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see complextriggers.ComplextriggersPackage
 * @generated
 */
public interface ComplextriggersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComplextriggersFactory eINSTANCE = complextriggers.impl.ComplextriggersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>Not Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Trigger</em>'.
	 * @generated
	 */
	NotTrigger createNotTrigger();

	/**
	 * Returns a new object of class '<em>And Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Trigger</em>'.
	 * @generated
	 */
	AndTrigger createAndTrigger();

	/**
	 * Returns a new object of class '<em>Or Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Trigger</em>'.
	 * @generated
	 */
	OrTrigger createOrTrigger();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComplextriggersPackage getComplextriggersPackage();

} //ComplextriggersFactory

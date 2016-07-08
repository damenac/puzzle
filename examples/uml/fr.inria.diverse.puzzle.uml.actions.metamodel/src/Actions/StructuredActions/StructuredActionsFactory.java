/**
 */
package Actions.StructuredActions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Actions.StructuredActions.StructuredActionsPackage
 * @generated
 */
public interface StructuredActionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructuredActionsFactory eINSTANCE = Actions.StructuredActions.impl.StructuredActionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Read Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Variable Action</em>'.
	 * @generated
	 */
	ReadVariableAction createReadVariableAction();

	/**
	 * Returns a new object of class '<em>Write Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Write Variable Action</em>'.
	 * @generated
	 */
	WriteVariableAction createWriteVariableAction();

	/**
	 * Returns a new object of class '<em>Add Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Variable Value Action</em>'.
	 * @generated
	 */
	AddVariableValueAction createAddVariableValueAction();

	/**
	 * Returns a new object of class '<em>Remove Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Variable Value Action</em>'.
	 * @generated
	 */
	RemoveVariableValueAction createRemoveVariableValueAction();

	/**
	 * Returns a new object of class '<em>Clear Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clear Variable Action</em>'.
	 * @generated
	 */
	ClearVariableAction createClearVariableAction();

	/**
	 * Returns a new object of class '<em>Raise Exception Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raise Exception Action</em>'.
	 * @generated
	 */
	RaiseExceptionAction createRaiseExceptionAction();

	/**
	 * Returns a new object of class '<em>Action Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Input Pin</em>'.
	 * @generated
	 */
	ActionInputPin createActionInputPin();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StructuredActionsPackage getStructuredActionsPackage();

} //StructuredActionsFactory

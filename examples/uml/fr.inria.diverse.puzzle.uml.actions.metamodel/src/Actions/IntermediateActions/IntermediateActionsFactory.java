/**
 */
package Actions.IntermediateActions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Actions.IntermediateActions.IntermediateActionsPackage
 * @generated
 */
public interface IntermediateActionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermediateActionsFactory eINSTANCE = Actions.IntermediateActions.impl.IntermediateActionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Broadcast Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Broadcast Signal Action</em>'.
	 * @generated
	 */
	BroadcastSignalAction createBroadcastSignalAction();

	/**
	 * Returns a new object of class '<em>Send Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Object Action</em>'.
	 * @generated
	 */
	SendObjectAction createSendObjectAction();

	/**
	 * Returns a new object of class '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Object Action</em>'.
	 * @generated
	 */
	CreateObjectAction createCreateObjectAction();

	/**
	 * Returns a new object of class '<em>Destroy Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destroy Object Action</em>'.
	 * @generated
	 */
	DestroyObjectAction createDestroyObjectAction();

	/**
	 * Returns a new object of class '<em>Test Identity Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Identity Action</em>'.
	 * @generated
	 */
	TestIdentityAction createTestIdentityAction();

	/**
	 * Returns a new object of class '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Self Action</em>'.
	 * @generated
	 */
	ReadSelfAction createReadSelfAction();

	/**
	 * Returns a new object of class '<em>Value Specification Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Specification Action</em>'.
	 * @generated
	 */
	ValueSpecificationAction createValueSpecificationAction();

	/**
	 * Returns a new object of class '<em>Read Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Structural Feature Action</em>'.
	 * @generated
	 */
	ReadStructuralFeatureAction createReadStructuralFeatureAction();

	/**
	 * Returns a new object of class '<em>Add Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Structural Feature Value Action</em>'.
	 * @generated
	 */
	AddStructuralFeatureValueAction createAddStructuralFeatureValueAction();

	/**
	 * Returns a new object of class '<em>Remove Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Structural Feature Value Action</em>'.
	 * @generated
	 */
	RemoveStructuralFeatureValueAction createRemoveStructuralFeatureValueAction();

	/**
	 * Returns a new object of class '<em>Clear Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clear Structural Feature Action</em>'.
	 * @generated
	 */
	ClearStructuralFeatureAction createClearStructuralFeatureAction();

	/**
	 * Returns a new object of class '<em>Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Action</em>'.
	 * @generated
	 */
	LinkAction createLinkAction();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Link Action</em>'.
	 * @generated
	 */
	ReadLinkAction createReadLinkAction();

	/**
	 * Returns a new object of class '<em>Create Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Link Action</em>'.
	 * @generated
	 */
	CreateLinkAction createCreateLinkAction();

	/**
	 * Returns a new object of class '<em>Link End Creation Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link End Creation Data</em>'.
	 * @generated
	 */
	LinkEndCreationData createLinkEndCreationData();

	/**
	 * Returns a new object of class '<em>Destroy Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destroy Link Action</em>'.
	 * @generated
	 */
	DestroyLinkAction createDestroyLinkAction();

	/**
	 * Returns a new object of class '<em>Link End Destruction Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link End Destruction Data</em>'.
	 * @generated
	 */
	LinkEndDestructionData createLinkEndDestructionData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IntermediateActionsPackage getIntermediateActionsPackage();

} //IntermediateActionsFactory

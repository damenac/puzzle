/**
 */
package Actions.CompleteActions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Actions.CompleteActions.CompleteActionsPackage
 * @generated
 */
public interface CompleteActionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompleteActionsFactory eINSTANCE = Actions.CompleteActions.impl.CompleteActionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reply Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reply Action</em>'.
	 * @generated
	 */
	ReplyAction createReplyAction();

	/**
	 * Returns a new object of class '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unmarshall Action</em>'.
	 * @generated
	 */
	UnmarshallAction createUnmarshallAction();

	/**
	 * Returns a new object of class '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accept Event Action</em>'.
	 * @generated
	 */
	AcceptEventAction createAcceptEventAction();

	/**
	 * Returns a new object of class '<em>Accept Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accept Call Action</em>'.
	 * @generated
	 */
	AcceptCallAction createAcceptCallAction();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>Read Extend Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Extend Action</em>'.
	 * @generated
	 */
	ReadExtendAction createReadExtendAction();

	/**
	 * Returns a new object of class '<em>Reclassify Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reclassify Object Action</em>'.
	 * @generated
	 */
	ReclassifyObjectAction createReclassifyObjectAction();

	/**
	 * Returns a new object of class '<em>Readls Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Readls Classified Object Action</em>'.
	 * @generated
	 */
	ReadlsClassifiedObjectAction createReadlsClassifiedObjectAction();

	/**
	 * Returns a new object of class '<em>Start Classifier Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Classifier Behavior Action</em>'.
	 * @generated
	 */
	StartClassifierBehaviorAction createStartClassifierBehaviorAction();

	/**
	 * Returns a new object of class '<em>Start Object Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Object Behavior Action</em>'.
	 * @generated
	 */
	StartObjectBehaviorAction createStartObjectBehaviorAction();

	/**
	 * Returns a new object of class '<em>Qualifier Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualifier Value</em>'.
	 * @generated
	 */
	QualifierValue createQualifierValue();

	/**
	 * Returns a new object of class '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Link Object End Action</em>'.
	 * @generated
	 */
	ReadLinkObjectEndAction createReadLinkObjectEndAction();

	/**
	 * Returns a new object of class '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Link Object End Qualifier Action</em>'.
	 * @generated
	 */
	ReadLinkObjectEndQualifierAction createReadLinkObjectEndQualifierAction();

	/**
	 * Returns a new object of class '<em>Create Link Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Link Object Action</em>'.
	 * @generated
	 */
	CreateLinkObjectAction createCreateLinkObjectAction();

	/**
	 * Returns a new object of class '<em>Reduce Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reduce Action</em>'.
	 * @generated
	 */
	ReduceAction createReduceAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CompleteActionsPackage getCompleteActionsPackage();

} //CompleteActionsFactory

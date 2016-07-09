/**
 */
package Interactions.BasicInteractions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Interactions.BasicInteractions.BasicInteractionsPackage
 * @generated
 */
public interface BasicInteractionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicInteractionsFactory eINSTANCE = Interactions.BasicInteractions.impl.BasicInteractionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Occurence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Occurence Specification</em>'.
	 * @generated
	 */
	OccurenceSpecification createOccurenceSpecification();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>State Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Invariant</em>'.
	 * @generated
	 */
	StateInvariant createStateInvariant();

	/**
	 * Returns a new object of class '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction</em>'.
	 * @generated
	 */
	Interaction createInteraction();

	/**
	 * Returns a new object of class '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lifeline</em>'.
	 * @generated
	 */
	Lifeline createLifeline();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Execution Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Occurrence Specification</em>'.
	 * @generated
	 */
	ExecutionOccurrenceSpecification createExecutionOccurrenceSpecification();

	/**
	 * Returns a new object of class '<em>Message Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Occurrence Specification</em>'.
	 * @generated
	 */
	MessageOccurrenceSpecification createMessageOccurrenceSpecification();

	/**
	 * Returns a new object of class '<em>Destruction Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destruction Occurrence Specification</em>'.
	 * @generated
	 */
	DestructionOccurrenceSpecification createDestructionOccurrenceSpecification();

	/**
	 * Returns a new object of class '<em>Behavior Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Execution Specification</em>'.
	 * @generated
	 */
	BehaviorExecutionSpecification createBehaviorExecutionSpecification();

	/**
	 * Returns a new object of class '<em>Action Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Execution Specification</em>'.
	 * @generated
	 */
	ActionExecutionSpecification createActionExecutionSpecification();

	/**
	 * Returns a new object of class '<em>General Ordering</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Ordering</em>'.
	 * @generated
	 */
	GeneralOrdering createGeneralOrdering();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasicInteractionsPackage getBasicInteractionsPackage();

} //BasicInteractionsFactory

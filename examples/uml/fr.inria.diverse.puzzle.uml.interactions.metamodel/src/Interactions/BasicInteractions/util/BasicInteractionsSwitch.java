/**
 */
package Interactions.BasicInteractions.util;

import Interactions.BasicInteractions.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Interactions.BasicInteractions.BasicInteractionsPackage
 * @generated
 */
public class BasicInteractionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasicInteractionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicInteractionsSwitch() {
		if (modelPackage == null) {
			modelPackage = BasicInteractionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BasicInteractionsPackage.BEHAVIOR: {
				Behavior behavior = (Behavior)theEObject;
				T result = caseBehavior(behavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.INTERACTION_FRAGMENT: {
				InteractionFragment interactionFragment = (InteractionFragment)theEObject;
				T result = caseInteractionFragment(interactionFragment);
				if (result == null) result = caseNamedElement(interactionFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.EXECUTION_SPECIFICATION: {
				ExecutionSpecification executionSpecification = (ExecutionSpecification)theEObject;
				T result = caseExecutionSpecification(executionSpecification);
				if (result == null) result = caseInteractionFragment(executionSpecification);
				if (result == null) result = caseNamedElement(executionSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.OCCURENCE_SPECIFICATION: {
				OccurenceSpecification occurenceSpecification = (OccurenceSpecification)theEObject;
				T result = caseOccurenceSpecification(occurenceSpecification);
				if (result == null) result = caseInteractionFragment(occurenceSpecification);
				if (result == null) result = caseNamedElement(occurenceSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.STATE_INVARIANT: {
				StateInvariant stateInvariant = (StateInvariant)theEObject;
				T result = caseStateInvariant(stateInvariant);
				if (result == null) result = caseInteractionFragment(stateInvariant);
				if (result == null) result = caseNamedElement(stateInvariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.INTERACTION: {
				Interaction interaction = (Interaction)theEObject;
				T result = caseInteraction(interaction);
				if (result == null) result = caseBehavior(interaction);
				if (result == null) result = caseInteractionFragment(interaction);
				if (result == null) result = caseNamedElement(interaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.LIFELINE: {
				Lifeline lifeline = (Lifeline)theEObject;
				T result = caseLifeline(lifeline);
				if (result == null) result = caseNamedElement(lifeline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.CONNECTABLE_ELEMENT: {
				ConnectableElement connectableElement = (ConnectableElement)theEObject;
				T result = caseConnectableElement(connectableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.VALUE_SPECIFICATION: {
				ValueSpecification valueSpecification = (ValueSpecification)theEObject;
				T result = caseValueSpecification(valueSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = caseNamedElement(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.MESSAGE_END: {
				MessageEnd messageEnd = (MessageEnd)theEObject;
				T result = caseMessageEnd(messageEnd);
				if (result == null) result = caseNamedElement(messageEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.EXECUTION_OCCURRENCE_SPECIFICATION: {
				ExecutionOccurrenceSpecification executionOccurrenceSpecification = (ExecutionOccurrenceSpecification)theEObject;
				T result = caseExecutionOccurrenceSpecification(executionOccurrenceSpecification);
				if (result == null) result = caseOccurenceSpecification(executionOccurrenceSpecification);
				if (result == null) result = caseInteractionFragment(executionOccurrenceSpecification);
				if (result == null) result = caseNamedElement(executionOccurrenceSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION: {
				MessageOccurrenceSpecification messageOccurrenceSpecification = (MessageOccurrenceSpecification)theEObject;
				T result = caseMessageOccurrenceSpecification(messageOccurrenceSpecification);
				if (result == null) result = caseOccurenceSpecification(messageOccurrenceSpecification);
				if (result == null) result = caseInteractionFragment(messageOccurrenceSpecification);
				if (result == null) result = caseNamedElement(messageOccurrenceSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION: {
				DestructionOccurrenceSpecification destructionOccurrenceSpecification = (DestructionOccurrenceSpecification)theEObject;
				T result = caseDestructionOccurrenceSpecification(destructionOccurrenceSpecification);
				if (result == null) result = caseMessageOccurrenceSpecification(destructionOccurrenceSpecification);
				if (result == null) result = caseOccurenceSpecification(destructionOccurrenceSpecification);
				if (result == null) result = caseInteractionFragment(destructionOccurrenceSpecification);
				if (result == null) result = caseNamedElement(destructionOccurrenceSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.BEHAVIOR_EXECUTION_SPECIFICATION: {
				BehaviorExecutionSpecification behaviorExecutionSpecification = (BehaviorExecutionSpecification)theEObject;
				T result = caseBehaviorExecutionSpecification(behaviorExecutionSpecification);
				if (result == null) result = caseExecutionSpecification(behaviorExecutionSpecification);
				if (result == null) result = caseInteractionFragment(behaviorExecutionSpecification);
				if (result == null) result = caseNamedElement(behaviorExecutionSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.ACTION_EXECUTION_SPECIFICATION: {
				ActionExecutionSpecification actionExecutionSpecification = (ActionExecutionSpecification)theEObject;
				T result = caseActionExecutionSpecification(actionExecutionSpecification);
				if (result == null) result = caseExecutionSpecification(actionExecutionSpecification);
				if (result == null) result = caseInteractionFragment(actionExecutionSpecification);
				if (result == null) result = caseNamedElement(actionExecutionSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicInteractionsPackage.GENERAL_ORDERING: {
				GeneralOrdering generalOrdering = (GeneralOrdering)theEObject;
				T result = caseGeneralOrdering(generalOrdering);
				if (result == null) result = caseNamedElement(generalOrdering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFragment(InteractionFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionSpecification(ExecutionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occurence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occurence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccurenceSpecification(OccurenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Invariant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateInvariant(StateInvariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifeline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifeline(Lifeline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectableElement(ConnectableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecification(ValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageEnd(MessageEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionOccurrenceSpecification(ExecutionOccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageOccurrenceSpecification(MessageOccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destruction Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destruction Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestructionOccurrenceSpecification(DestructionOccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Execution Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorExecutionSpecification(BehaviorExecutionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Execution Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionExecutionSpecification(ActionExecutionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Ordering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Ordering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralOrdering(GeneralOrdering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BasicInteractionsSwitch

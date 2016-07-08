/**
 */
package Actions.CompleteActions.util;

import Actions.BasicActions.Action;
import Actions.BasicActions.CallAction;
import Actions.BasicActions.InvocationAction;
import Actions.BasicActions.NamedElement;

import Actions.CompleteActions.*;

import Actions.IntermediateActions.CreateLinkAction;
import Actions.IntermediateActions.Element;
import Actions.IntermediateActions.LinkAction;
import Actions.IntermediateActions.WriteLinkAction;

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
 * @see Actions.CompleteActions.CompleteActionsPackage
 * @generated
 */
public class CompleteActionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CompleteActionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteActionsSwitch() {
		if (modelPackage == null) {
			modelPackage = CompleteActionsPackage.eINSTANCE;
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
			case CompleteActionsPackage.REPLY_ACTION: {
				ReplyAction replyAction = (ReplyAction)theEObject;
				T result = caseReplyAction(replyAction);
				if (result == null) result = caseAction(replyAction);
				if (result == null) result = caseNamedElement(replyAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteActionsPackage.UNMARSHALL_ACTION: {
				UnmarshallAction unmarshallAction = (UnmarshallAction)theEObject;
				T result = caseUnmarshallAction(unmarshallAction);
				if (result == null) result = caseAction(unmarshallAction);
				if (result == null) result = caseNamedElement(unmarshallAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteActionsPackage.ACCEPT_EVENT_ACTION: {
				AcceptEventAction acceptEventAction = (AcceptEventAction)theEObject;
				T result = caseAcceptEventAction(acceptEventAction);
				if (result == null) result = caseAction(acceptEventAction);
				if (result == null) result = caseNamedElement(acceptEventAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteActionsPackage.ACCEPT_CALL_ACTION: {
				AcceptCallAction acceptCallAction = (AcceptCallAction)theEObject;
				T result = caseAcceptCallAction(acceptCallAction);
				if (result == null) result = caseAcceptEventAction(acceptCallAction);
				if (result == null) result = caseAction(acceptCallAction);
				if (result == null) result = caseNamedElement(acceptCallAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteActionsPackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteActionsPackage.READ_EXTEND_ACTION: {
				ReadExtendAction readExtendAction = (ReadExtendAction)theEObject;
				T result = caseReadExtendAction(readExtendAction);
				if (result == null) result = caseAction(readExtendAction);
				if (result == null) result = caseNamedElement(readExtendAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION: {
				ReclassifyObjectAction reclassifyObjectAction = (ReclassifyObjectAction)theEObject;
				T result = caseReclassifyObjectAction(reclassifyObjectAction);
				if (result == null) result = caseAction(reclassifyObjectAction);
				if (result == null) result = caseNamedElement(reclassifyObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteActionsPackage.READLS_CLASSIFIED_OBJECT_ACTION: {
				ReadlsClassifiedObjectAction readlsClassifiedObjectAction = (ReadlsClassifiedObjectAction)theEObject;
				T result = caseReadlsClassifiedObjectAction(readlsClassifiedObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteActionsPackage.START_CLASSIFIER_BEHAVIOR_ACTION: {
				StartClassifierBehaviorAction startClassifierBehaviorAction = (StartClassifierBehaviorAction)theEObject;
				T result = caseStartClassifierBehaviorAction(startClassifierBehaviorAction);
				if (result == null) result = caseAction(startClassifierBehaviorAction);
				if (result == null) result = caseNamedElement(startClassifierBehaviorAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteActionsPackage.START_OBJECT_BEHAVIOR_ACTION: {
				StartObjectBehaviorAction startObjectBehaviorAction = (StartObjectBehaviorAction)theEObject;
				T result = caseStartObjectBehaviorAction(startObjectBehaviorAction);
				if (result == null) result = caseCallAction(startObjectBehaviorAction);
				if (result == null) result = caseInvocationAction(startObjectBehaviorAction);
				if (result == null) result = caseAction(startObjectBehaviorAction);
				if (result == null) result = caseNamedElement(startObjectBehaviorAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteActionsPackage.QUALIFIER_VALUE: {
				QualifierValue qualifierValue = (QualifierValue)theEObject;
				T result = caseQualifierValue(qualifierValue);
				if (result == null) result = caseElement(qualifierValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteActionsPackage.READ_LINK_OBJECT_END_ACTION: {
				ReadLinkObjectEndAction readLinkObjectEndAction = (ReadLinkObjectEndAction)theEObject;
				T result = caseReadLinkObjectEndAction(readLinkObjectEndAction);
				if (result == null) result = caseAction(readLinkObjectEndAction);
				if (result == null) result = caseNamedElement(readLinkObjectEndAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteActionsPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION: {
				ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction = (ReadLinkObjectEndQualifierAction)theEObject;
				T result = caseReadLinkObjectEndQualifierAction(readLinkObjectEndQualifierAction);
				if (result == null) result = caseAction(readLinkObjectEndQualifierAction);
				if (result == null) result = caseNamedElement(readLinkObjectEndQualifierAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteActionsPackage.CREATE_LINK_OBJECT_ACTION: {
				CreateLinkObjectAction createLinkObjectAction = (CreateLinkObjectAction)theEObject;
				T result = caseCreateLinkObjectAction(createLinkObjectAction);
				if (result == null) result = caseCreateLinkAction(createLinkObjectAction);
				if (result == null) result = caseWriteLinkAction(createLinkObjectAction);
				if (result == null) result = caseLinkAction(createLinkObjectAction);
				if (result == null) result = caseAction(createLinkObjectAction);
				if (result == null) result = caseNamedElement(createLinkObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteActionsPackage.REDUCE_ACTION: {
				ReduceAction reduceAction = (ReduceAction)theEObject;
				T result = caseReduceAction(reduceAction);
				if (result == null) result = caseAction(reduceAction);
				if (result == null) result = caseNamedElement(reduceAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reply Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reply Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplyAction(ReplyAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unmarshall Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnmarshallAction(UnmarshallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptEventAction(AcceptEventAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Call Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptCallAction(AcceptCallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Extend Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Extend Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadExtendAction(ReadExtendAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reclassify Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reclassify Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReclassifyObjectAction(ReclassifyObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Readls Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Readls Classified Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadlsClassifiedObjectAction(ReadlsClassifiedObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Classifier Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Classifier Behavior Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartClassifierBehaviorAction(StartClassifierBehaviorAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Object Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Object Behavior Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartObjectBehaviorAction(StartObjectBehaviorAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifier Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifier Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifierValue(QualifierValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Link Object End Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadLinkObjectEndAction(ReadLinkObjectEndAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Link Object End Qualifier Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadLinkObjectEndQualifierAction(ReadLinkObjectEndQualifierAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Link Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Link Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateLinkObjectAction(CreateLinkObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduce Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduce Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReduceAction(ReduceAction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Invocation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocationAction(InvocationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallAction(CallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkAction(LinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteLinkAction(WriteLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateLinkAction(CreateLinkAction object) {
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

} //CompleteActionsSwitch

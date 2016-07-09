/**
 */
package CommonBehavior.SimpleTime.util;

import CommonBehavior.BasicBehavior.Constraint;

import CommonBehavior.Communications.PackageableElement;
import CommonBehavior.Communications.ValueSpecification;

import CommonBehavior.SimpleTime.*;

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
 * @see CommonBehavior.SimpleTime.SimpleTimePackage
 * @generated
 */
public class SimpleTimeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimpleTimePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTimeSwitch() {
		if (modelPackage == null) {
			modelPackage = SimpleTimePackage.eINSTANCE;
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
			case SimpleTimePackage.TIME_EVENT: {
				TimeEvent timeEvent = (TimeEvent)theEObject;
				T result = caseTimeEvent(timeEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleTimePackage.TIME_EXPRESSION: {
				TimeExpression timeExpression = (TimeExpression)theEObject;
				T result = caseTimeExpression(timeExpression);
				if (result == null) result = caseValueSpecification(timeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleTimePackage.OBSERVATION: {
				Observation observation = (Observation)theEObject;
				T result = caseObservation(observation);
				if (result == null) result = casePackageableElement(observation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleTimePackage.TIME_OBSERVATION: {
				TimeObservation timeObservation = (TimeObservation)theEObject;
				T result = caseTimeObservation(timeObservation);
				if (result == null) result = caseObservation(timeObservation);
				if (result == null) result = casePackageableElement(timeObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleTimePackage.DURATION_OBSERVATION: {
				DurationObservation durationObservation = (DurationObservation)theEObject;
				T result = caseDurationObservation(durationObservation);
				if (result == null) result = caseObservation(durationObservation);
				if (result == null) result = casePackageableElement(durationObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleTimePackage.DURATION: {
				Duration duration = (Duration)theEObject;
				T result = caseDuration(duration);
				if (result == null) result = caseValueSpecification(duration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleTimePackage.INTERVAL: {
				Interval interval = (Interval)theEObject;
				T result = caseInterval(interval);
				if (result == null) result = caseValueSpecification(interval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleTimePackage.TIME_INTERVAL: {
				TimeInterval timeInterval = (TimeInterval)theEObject;
				T result = caseTimeInterval(timeInterval);
				if (result == null) result = caseInterval(timeInterval);
				if (result == null) result = caseValueSpecification(timeInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleTimePackage.DURATION_INTERVAL: {
				DurationInterval durationInterval = (DurationInterval)theEObject;
				T result = caseDurationInterval(durationInterval);
				if (result == null) result = caseInterval(durationInterval);
				if (result == null) result = caseValueSpecification(durationInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleTimePackage.INTERVAL_CONSTRAINT: {
				IntervalConstraint intervalConstraint = (IntervalConstraint)theEObject;
				T result = caseIntervalConstraint(intervalConstraint);
				if (result == null) result = caseConstraint(intervalConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleTimePackage.TIME_CONSTRAINT: {
				TimeConstraint timeConstraint = (TimeConstraint)theEObject;
				T result = caseTimeConstraint(timeConstraint);
				if (result == null) result = caseIntervalConstraint(timeConstraint);
				if (result == null) result = caseConstraint(timeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleTimePackage.DURATION_CONSTRAINT: {
				DurationConstraint durationConstraint = (DurationConstraint)theEObject;
				T result = caseDurationConstraint(durationConstraint);
				if (result == null) result = caseIntervalConstraint(durationConstraint);
				if (result == null) result = caseConstraint(durationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeEvent(TimeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeExpression(TimeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeObservation(TimeObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationObservation(DurationObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuration(Duration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterval(Interval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeInterval(TimeInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationInterval(DurationInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervalConstraint(IntervalConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeConstraint(TimeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationConstraint(DurationConstraint object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageableElement(PackageableElement object) {
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

} //SimpleTimeSwitch

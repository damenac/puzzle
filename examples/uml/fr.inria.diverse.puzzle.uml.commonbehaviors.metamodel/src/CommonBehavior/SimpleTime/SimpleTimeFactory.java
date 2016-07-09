/**
 */
package CommonBehavior.SimpleTime;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CommonBehavior.SimpleTime.SimpleTimePackage
 * @generated
 */
public interface SimpleTimeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleTimeFactory eINSTANCE = CommonBehavior.SimpleTime.impl.SimpleTimeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Time Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Event</em>'.
	 * @generated
	 */
	TimeEvent createTimeEvent();

	/**
	 * Returns a new object of class '<em>Time Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Expression</em>'.
	 * @generated
	 */
	TimeExpression createTimeExpression();

	/**
	 * Returns a new object of class '<em>Time Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Observation</em>'.
	 * @generated
	 */
	TimeObservation createTimeObservation();

	/**
	 * Returns a new object of class '<em>Duration Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duration Observation</em>'.
	 * @generated
	 */
	DurationObservation createDurationObservation();

	/**
	 * Returns a new object of class '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duration</em>'.
	 * @generated
	 */
	Duration createDuration();

	/**
	 * Returns a new object of class '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interval</em>'.
	 * @generated
	 */
	Interval createInterval();

	/**
	 * Returns a new object of class '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Interval</em>'.
	 * @generated
	 */
	TimeInterval createTimeInterval();

	/**
	 * Returns a new object of class '<em>Duration Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duration Interval</em>'.
	 * @generated
	 */
	DurationInterval createDurationInterval();

	/**
	 * Returns a new object of class '<em>Interval Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interval Constraint</em>'.
	 * @generated
	 */
	IntervalConstraint createIntervalConstraint();

	/**
	 * Returns a new object of class '<em>Time Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Constraint</em>'.
	 * @generated
	 */
	TimeConstraint createTimeConstraint();

	/**
	 * Returns a new object of class '<em>Duration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duration Constraint</em>'.
	 * @generated
	 */
	DurationConstraint createDurationConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimpleTimePackage getSimpleTimePackage();

} //SimpleTimeFactory

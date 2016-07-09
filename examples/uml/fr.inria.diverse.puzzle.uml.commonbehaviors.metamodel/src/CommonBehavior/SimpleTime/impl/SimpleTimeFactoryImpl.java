/**
 */
package CommonBehavior.SimpleTime.impl;

import CommonBehavior.SimpleTime.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleTimeFactoryImpl extends EFactoryImpl implements SimpleTimeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpleTimeFactory init() {
		try {
			SimpleTimeFactory theSimpleTimeFactory = (SimpleTimeFactory)EPackage.Registry.INSTANCE.getEFactory(SimpleTimePackage.eNS_URI);
			if (theSimpleTimeFactory != null) {
				return theSimpleTimeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimpleTimeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTimeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimpleTimePackage.TIME_EVENT: return createTimeEvent();
			case SimpleTimePackage.TIME_EXPRESSION: return createTimeExpression();
			case SimpleTimePackage.TIME_OBSERVATION: return createTimeObservation();
			case SimpleTimePackage.DURATION_OBSERVATION: return createDurationObservation();
			case SimpleTimePackage.DURATION: return createDuration();
			case SimpleTimePackage.INTERVAL: return createInterval();
			case SimpleTimePackage.TIME_INTERVAL: return createTimeInterval();
			case SimpleTimePackage.DURATION_INTERVAL: return createDurationInterval();
			case SimpleTimePackage.INTERVAL_CONSTRAINT: return createIntervalConstraint();
			case SimpleTimePackage.TIME_CONSTRAINT: return createTimeConstraint();
			case SimpleTimePackage.DURATION_CONSTRAINT: return createDurationConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEvent createTimeEvent() {
		TimeEventImpl timeEvent = new TimeEventImpl();
		return timeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeExpression createTimeExpression() {
		TimeExpressionImpl timeExpression = new TimeExpressionImpl();
		return timeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeObservation createTimeObservation() {
		TimeObservationImpl timeObservation = new TimeObservationImpl();
		return timeObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationObservation createDurationObservation() {
		DurationObservationImpl durationObservation = new DurationObservationImpl();
		return durationObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDuration() {
		DurationImpl duration = new DurationImpl();
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		IntervalImpl interval = new IntervalImpl();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval createTimeInterval() {
		TimeIntervalImpl timeInterval = new TimeIntervalImpl();
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationInterval createDurationInterval() {
		DurationIntervalImpl durationInterval = new DurationIntervalImpl();
		return durationInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalConstraint createIntervalConstraint() {
		IntervalConstraintImpl intervalConstraint = new IntervalConstraintImpl();
		return intervalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConstraint createTimeConstraint() {
		TimeConstraintImpl timeConstraint = new TimeConstraintImpl();
		return timeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationConstraint createDurationConstraint() {
		DurationConstraintImpl durationConstraint = new DurationConstraintImpl();
		return durationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTimePackage getSimpleTimePackage() {
		return (SimpleTimePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimpleTimePackage getPackage() {
		return SimpleTimePackage.eINSTANCE;
	}

} //SimpleTimeFactoryImpl

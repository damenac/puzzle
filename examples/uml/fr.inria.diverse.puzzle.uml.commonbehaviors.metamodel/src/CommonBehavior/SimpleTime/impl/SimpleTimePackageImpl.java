/**
 */
package CommonBehavior.SimpleTime.impl;

import CommonBehavior.BasicBehavior.BasicBehaviorPackage;

import CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl;

import CommonBehavior.Communications.CommunicationsPackage;

import CommonBehavior.Communications.impl.CommunicationsPackageImpl;

import CommonBehavior.SimpleTime.Duration;
import CommonBehavior.SimpleTime.DurationConstraint;
import CommonBehavior.SimpleTime.DurationInterval;
import CommonBehavior.SimpleTime.DurationObservation;
import CommonBehavior.SimpleTime.Interval;
import CommonBehavior.SimpleTime.IntervalConstraint;
import CommonBehavior.SimpleTime.Observation;
import CommonBehavior.SimpleTime.SimpleTimeFactory;
import CommonBehavior.SimpleTime.SimpleTimePackage;
import CommonBehavior.SimpleTime.TimeConstraint;
import CommonBehavior.SimpleTime.TimeEvent;
import CommonBehavior.SimpleTime.TimeExpression;
import CommonBehavior.SimpleTime.TimeInterval;
import CommonBehavior.SimpleTime.TimeObservation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleTimePackageImpl extends EPackageImpl implements SimpleTimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationConstraintEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see CommonBehavior.SimpleTime.SimpleTimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimpleTimePackageImpl() {
		super(eNS_URI, SimpleTimeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SimpleTimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimpleTimePackage init() {
		if (isInited) return (SimpleTimePackage)EPackage.Registry.INSTANCE.getEPackage(SimpleTimePackage.eNS_URI);

		// Obtain or create and register package
		SimpleTimePackageImpl theSimpleTimePackage = (SimpleTimePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimpleTimePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimpleTimePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasicBehaviorPackageImpl theBasicBehaviorPackage = (BasicBehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorPackage.eNS_URI) instanceof BasicBehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorPackage.eNS_URI) : BasicBehaviorPackage.eINSTANCE);
		CommunicationsPackageImpl theCommunicationsPackage = (CommunicationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommunicationsPackage.eNS_URI) instanceof CommunicationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommunicationsPackage.eNS_URI) : CommunicationsPackage.eINSTANCE);

		// Create package meta-data objects
		theSimpleTimePackage.createPackageContents();
		theBasicBehaviorPackage.createPackageContents();
		theCommunicationsPackage.createPackageContents();

		// Initialize created meta-data
		theSimpleTimePackage.initializePackageContents();
		theBasicBehaviorPackage.initializePackageContents();
		theCommunicationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimpleTimePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimpleTimePackage.eNS_URI, theSimpleTimePackage);
		return theSimpleTimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeEvent() {
		return timeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEvent_IsRelative() {
		return (EAttribute)timeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeEvent_When() {
		return (EReference)timeEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeExpression() {
		return timeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeExpression_Expr() {
		return (EReference)timeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeExpression_Observation() {
		return (EReference)timeExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservation() {
		return observationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeObservation() {
		return timeObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeObservation_FirstEvent() {
		return (EAttribute)timeObservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeObservation_Event() {
		return (EReference)timeObservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationObservation() {
		return durationObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDurationObservation_FirstEvent() {
		return (EAttribute)durationObservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDurationObservation_Event() {
		return (EReference)durationObservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuration() {
		return durationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDuration_Expr() {
		return (EReference)durationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDuration_Observation() {
		return (EReference)durationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterval() {
		return intervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_Max() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_Min() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeInterval() {
		return timeIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeInterval_TimeMax() {
		return (EReference)timeIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeInterval_TimeMin() {
		return (EReference)timeIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationInterval() {
		return durationIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDurationInterval_DurationMax() {
		return (EReference)durationIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDurationInterval_DurationMin() {
		return (EReference)durationIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervalConstraint() {
		return intervalConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntervalConstraint_Specification() {
		return (EReference)intervalConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeConstraint() {
		return timeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeConstraint_FirstEvent() {
		return (EAttribute)timeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeConstraint_TimeSpecification() {
		return (EReference)timeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationConstraint() {
		return durationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDurationConstraint_FirstEvent() {
		return (EAttribute)durationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDurationConstraint_DurationSpecification() {
		return (EReference)durationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTimeFactory getSimpleTimeFactory() {
		return (SimpleTimeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		timeEventEClass = createEClass(TIME_EVENT);
		createEAttribute(timeEventEClass, TIME_EVENT__IS_RELATIVE);
		createEReference(timeEventEClass, TIME_EVENT__WHEN);

		timeExpressionEClass = createEClass(TIME_EXPRESSION);
		createEReference(timeExpressionEClass, TIME_EXPRESSION__EXPR);
		createEReference(timeExpressionEClass, TIME_EXPRESSION__OBSERVATION);

		observationEClass = createEClass(OBSERVATION);

		timeObservationEClass = createEClass(TIME_OBSERVATION);
		createEAttribute(timeObservationEClass, TIME_OBSERVATION__FIRST_EVENT);
		createEReference(timeObservationEClass, TIME_OBSERVATION__EVENT);

		durationObservationEClass = createEClass(DURATION_OBSERVATION);
		createEAttribute(durationObservationEClass, DURATION_OBSERVATION__FIRST_EVENT);
		createEReference(durationObservationEClass, DURATION_OBSERVATION__EVENT);

		durationEClass = createEClass(DURATION);
		createEReference(durationEClass, DURATION__EXPR);
		createEReference(durationEClass, DURATION__OBSERVATION);

		intervalEClass = createEClass(INTERVAL);
		createEReference(intervalEClass, INTERVAL__MAX);
		createEReference(intervalEClass, INTERVAL__MIN);

		timeIntervalEClass = createEClass(TIME_INTERVAL);
		createEReference(timeIntervalEClass, TIME_INTERVAL__TIME_MAX);
		createEReference(timeIntervalEClass, TIME_INTERVAL__TIME_MIN);

		durationIntervalEClass = createEClass(DURATION_INTERVAL);
		createEReference(durationIntervalEClass, DURATION_INTERVAL__DURATION_MAX);
		createEReference(durationIntervalEClass, DURATION_INTERVAL__DURATION_MIN);

		intervalConstraintEClass = createEClass(INTERVAL_CONSTRAINT);
		createEReference(intervalConstraintEClass, INTERVAL_CONSTRAINT__SPECIFICATION);

		timeConstraintEClass = createEClass(TIME_CONSTRAINT);
		createEAttribute(timeConstraintEClass, TIME_CONSTRAINT__FIRST_EVENT);
		createEReference(timeConstraintEClass, TIME_CONSTRAINT__TIME_SPECIFICATION);

		durationConstraintEClass = createEClass(DURATION_CONSTRAINT);
		createEAttribute(durationConstraintEClass, DURATION_CONSTRAINT__FIRST_EVENT);
		createEReference(durationConstraintEClass, DURATION_CONSTRAINT__DURATION_SPECIFICATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommunicationsPackage theCommunicationsPackage = (CommunicationsPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationsPackage.eNS_URI);
		BasicBehaviorPackage theBasicBehaviorPackage = (BasicBehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		timeExpressionEClass.getESuperTypes().add(theCommunicationsPackage.getValueSpecification());
		observationEClass.getESuperTypes().add(theCommunicationsPackage.getPackageableElement());
		timeObservationEClass.getESuperTypes().add(this.getObservation());
		durationObservationEClass.getESuperTypes().add(this.getObservation());
		durationEClass.getESuperTypes().add(theCommunicationsPackage.getValueSpecification());
		intervalEClass.getESuperTypes().add(theCommunicationsPackage.getValueSpecification());
		timeIntervalEClass.getESuperTypes().add(this.getInterval());
		durationIntervalEClass.getESuperTypes().add(this.getInterval());
		intervalConstraintEClass.getESuperTypes().add(theBasicBehaviorPackage.getConstraint());
		timeConstraintEClass.getESuperTypes().add(this.getIntervalConstraint());
		durationConstraintEClass.getESuperTypes().add(this.getIntervalConstraint());

		// Initialize classes, features, and operations; add parameters
		initEClass(timeEventEClass, TimeEvent.class, "TimeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeEvent_IsRelative(), ecorePackage.getEBoolean(), "isRelative", null, 0, 1, TimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeEvent_When(), this.getTimeExpression(), null, "when", null, 1, 1, TimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeExpressionEClass, TimeExpression.class, "TimeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeExpression_Expr(), theCommunicationsPackage.getValueSpecification(), null, "expr", null, 0, 1, TimeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeExpression_Observation(), this.getObservation(), null, "observation", null, 0, -1, TimeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observationEClass, Observation.class, "Observation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeObservationEClass, TimeObservation.class, "TimeObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeObservation_FirstEvent(), ecorePackage.getEBoolean(), "firstEvent", null, 0, 1, TimeObservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeObservation_Event(), theCommunicationsPackage.getNamedElement(), null, "event", null, 1, 1, TimeObservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durationObservationEClass, DurationObservation.class, "DurationObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDurationObservation_FirstEvent(), ecorePackage.getEBoolean(), "firstEvent", null, 0, 2, DurationObservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDurationObservation_Event(), theCommunicationsPackage.getNamedElement(), null, "event", null, 1, 2, DurationObservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDuration_Expr(), theCommunicationsPackage.getValueSpecification(), null, "expr", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDuration_Observation(), this.getObservation(), null, "observation", null, 0, -1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intervalEClass, Interval.class, "Interval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterval_Max(), theCommunicationsPackage.getValueSpecification(), null, "max", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterval_Min(), theCommunicationsPackage.getValueSpecification(), null, "min", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeIntervalEClass, TimeInterval.class, "TimeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeInterval_TimeMax(), this.getTimeExpression(), null, "timeMax", null, 1, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeInterval_TimeMin(), this.getTimeExpression(), null, "timeMin", null, 1, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durationIntervalEClass, DurationInterval.class, "DurationInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDurationInterval_DurationMax(), this.getDuration(), null, "durationMax", null, 1, 1, DurationInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDurationInterval_DurationMin(), this.getDuration(), null, "durationMin", null, 1, 1, DurationInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intervalConstraintEClass, IntervalConstraint.class, "IntervalConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntervalConstraint_Specification(), this.getInterval(), null, "specification", null, 1, 1, IntervalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeConstraintEClass, TimeConstraint.class, "TimeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeConstraint_FirstEvent(), ecorePackage.getEBoolean(), "firstEvent", null, 0, 1, TimeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeConstraint_TimeSpecification(), this.getTimeInterval(), null, "timeSpecification", null, 1, 1, TimeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durationConstraintEClass, DurationConstraint.class, "DurationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDurationConstraint_FirstEvent(), ecorePackage.getEBoolean(), "firstEvent", null, 0, 2, DurationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDurationConstraint_DurationSpecification(), this.getDurationInterval(), null, "durationSpecification", null, 1, 1, DurationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SimpleTimePackageImpl

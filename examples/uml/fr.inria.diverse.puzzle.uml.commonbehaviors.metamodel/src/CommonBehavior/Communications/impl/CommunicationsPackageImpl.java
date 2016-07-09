/**
 */
package CommonBehavior.Communications.impl;

import CommonBehavior.BasicBehavior.BasicBehaviorPackage;

import CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl;

import CommonBehavior.Communications.AnyReceiveEvent;
import CommonBehavior.Communications.CallConcurrencyFeature;
import CommonBehavior.Communications.CallEvent;
import CommonBehavior.Communications.ChangeEvent;
import CommonBehavior.Communications.CommunicationsFactory;
import CommonBehavior.Communications.CommunicationsPackage;
import CommonBehavior.Communications.Event;
import CommonBehavior.Communications.Interface;
import CommonBehavior.Communications.MessageEvent;
import CommonBehavior.Communications.NamedElement;
import CommonBehavior.Communications.Operation;
import CommonBehavior.Communications.PackageableElement;
import CommonBehavior.Communications.Property;
import CommonBehavior.Communications.Reception;
import CommonBehavior.Communications.Signal;
import CommonBehavior.Communications.SignalEvent;
import CommonBehavior.Communications.Trigger;
import CommonBehavior.Communications.ValueSpecification;

import CommonBehavior.SimpleTime.SimpleTimePackage;

import CommonBehavior.SimpleTime.impl.SimpleTimePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationsPackageImpl extends EPackageImpl implements CommunicationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyReceiveEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum callConcurrencyFeatureEEnum = null;

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
	 * @see CommonBehavior.Communications.CommunicationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommunicationsPackageImpl() {
		super(eNS_URI, CommunicationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommunicationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommunicationsPackage init() {
		if (isInited) return (CommunicationsPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationsPackage.eNS_URI);

		// Obtain or create and register package
		CommunicationsPackageImpl theCommunicationsPackage = (CommunicationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommunicationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommunicationsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasicBehaviorPackageImpl theBasicBehaviorPackage = (BasicBehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorPackage.eNS_URI) instanceof BasicBehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorPackage.eNS_URI) : BasicBehaviorPackage.eINSTANCE);
		SimpleTimePackageImpl theSimpleTimePackage = (SimpleTimePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SimpleTimePackage.eNS_URI) instanceof SimpleTimePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SimpleTimePackage.eNS_URI) : SimpleTimePackage.eINSTANCE);

		// Create package meta-data objects
		theCommunicationsPackage.createPackageContents();
		theBasicBehaviorPackage.createPackageContents();
		theSimpleTimePackage.createPackageContents();

		// Initialize created meta-data
		theCommunicationsPackage.initializePackageContents();
		theBasicBehaviorPackage.initializePackageContents();
		theSimpleTimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommunicationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommunicationsPackage.eNS_URI, theCommunicationsPackage);
		return theCommunicationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignal() {
		return signalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignal_OwnedAttribute() {
		return (EReference)signalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReception() {
		return receptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReception_Signal() {
		return (EReference)receptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedReception() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Event() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageableElement() {
		return packageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageEvent() {
		return messageEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyReceiveEvent() {
		return anyReceiveEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalEvent() {
		return signalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalEvent_Signal() {
		return (EReference)signalEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallEvent() {
		return callEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallEvent_Operation() {
		return (EReference)callEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeEvent() {
		return changeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeEvent_ChangeExpression() {
		return (EReference)changeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecification() {
		return valueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCallConcurrencyFeature() {
		return callConcurrencyFeatureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationsFactory getCommunicationsFactory() {
		return (CommunicationsFactory)getEFactoryInstance();
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
		signalEClass = createEClass(SIGNAL);
		createEReference(signalEClass, SIGNAL__OWNED_ATTRIBUTE);

		propertyEClass = createEClass(PROPERTY);

		receptionEClass = createEClass(RECEPTION);
		createEReference(receptionEClass, RECEPTION__SIGNAL);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__OWNED_RECEPTION);

		namedElementEClass = createEClass(NAMED_ELEMENT);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__EVENT);

		packageableElementEClass = createEClass(PACKAGEABLE_ELEMENT);

		eventEClass = createEClass(EVENT);

		messageEventEClass = createEClass(MESSAGE_EVENT);

		anyReceiveEventEClass = createEClass(ANY_RECEIVE_EVENT);

		signalEventEClass = createEClass(SIGNAL_EVENT);
		createEReference(signalEventEClass, SIGNAL_EVENT__SIGNAL);

		callEventEClass = createEClass(CALL_EVENT);
		createEReference(callEventEClass, CALL_EVENT__OPERATION);

		operationEClass = createEClass(OPERATION);

		changeEventEClass = createEClass(CHANGE_EVENT);
		createEReference(changeEventEClass, CHANGE_EVENT__CHANGE_EXPRESSION);

		valueSpecificationEClass = createEClass(VALUE_SPECIFICATION);

		// Create enums
		callConcurrencyFeatureEEnum = createEEnum(CALL_CONCURRENCY_FEATURE);
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
		BasicBehaviorPackage theBasicBehaviorPackage = (BasicBehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		signalEClass.getESuperTypes().add(theBasicBehaviorPackage.getClassifier());
		receptionEClass.getESuperTypes().add(theBasicBehaviorPackage.getBehavioralFeature());
		interfaceEClass.getESuperTypes().add(theBasicBehaviorPackage.getClassifier());
		triggerEClass.getESuperTypes().add(this.getNamedElement());
		eventEClass.getESuperTypes().add(this.getPackageableElement());
		messageEventEClass.getESuperTypes().add(this.getEvent());
		anyReceiveEventEClass.getESuperTypes().add(this.getMessageEvent());
		signalEventEClass.getESuperTypes().add(this.getMessageEvent());
		callEventEClass.getESuperTypes().add(this.getMessageEvent());
		changeEventEClass.getESuperTypes().add(this.getEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_OwnedAttribute(), this.getProperty(), null, "ownedAttribute", null, 0, -1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(receptionEClass, Reception.class, "Reception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReception_Signal(), this.getSignal(), null, "signal", null, 1, 1, Reception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_OwnedReception(), this.getReception(), null, "ownedReception", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_Event(), this.getEvent(), null, "event", null, 1, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageableElementEClass, PackageableElement.class, "PackageableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageEventEClass, MessageEvent.class, "MessageEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anyReceiveEventEClass, AnyReceiveEvent.class, "AnyReceiveEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signalEventEClass, SignalEvent.class, "SignalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalEvent_Signal(), this.getSignal(), null, "signal", null, 1, 1, SignalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callEventEClass, CallEvent.class, "CallEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallEvent_Operation(), this.getOperation(), null, "operation", null, 1, 1, CallEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeEventEClass, ChangeEvent.class, "ChangeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeEvent_ChangeExpression(), this.getValueSpecification(), null, "changeExpression", null, 1, 1, ChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueSpecificationEClass, ValueSpecification.class, "ValueSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(callConcurrencyFeatureEEnum, CallConcurrencyFeature.class, "CallConcurrencyFeature");
		addEEnumLiteral(callConcurrencyFeatureEEnum, CallConcurrencyFeature.SEQUENTIAL);
		addEEnumLiteral(callConcurrencyFeatureEEnum, CallConcurrencyFeature.GUARDED);
		addEEnumLiteral(callConcurrencyFeatureEEnum, CallConcurrencyFeature.CONCURRENT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Required
		createRequiredAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Required</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRequiredAnnotations() {
		String source = "Required";	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (interfaceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (namedElementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (packageableElementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (valueSpecificationEClass, 
		   source, 
		   new String[] {
		   });
	}

} //CommunicationsPackageImpl

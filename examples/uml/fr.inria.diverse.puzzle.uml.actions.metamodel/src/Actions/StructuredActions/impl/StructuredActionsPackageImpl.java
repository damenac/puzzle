/**
 */
package Actions.StructuredActions.impl;

import Actions.BasicActions.BasicActionsPackage;

import Actions.BasicActions.impl.BasicActionsPackageImpl;

import Actions.CompleteActions.CompleteActionsPackage;

import Actions.CompleteActions.impl.CompleteActionsPackageImpl;

import Actions.IntermediateActions.IntermediateActionsPackage;

import Actions.IntermediateActions.impl.IntermediateActionsPackageImpl;

import Actions.StructuredActions.ActionInputPin;
import Actions.StructuredActions.AddVariableValueAction;
import Actions.StructuredActions.ClearVariableAction;
import Actions.StructuredActions.RaiseExceptionAction;
import Actions.StructuredActions.ReadVariableAction;
import Actions.StructuredActions.RemoveVariableValueAction;
import Actions.StructuredActions.StructuredActionsFactory;
import Actions.StructuredActions.StructuredActionsPackage;
import Actions.StructuredActions.Variable;
import Actions.StructuredActions.VariableAction;
import Actions.StructuredActions.WriteVariableAction;

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
public class StructuredActionsPackageImpl extends EPackageImpl implements StructuredActionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readVariableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeVariableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addVariableValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeVariableValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearVariableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raiseExceptionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionInputPinEClass = null;

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
	 * @see Actions.StructuredActions.StructuredActionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StructuredActionsPackageImpl() {
		super(eNS_URI, StructuredActionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StructuredActionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StructuredActionsPackage init() {
		if (isInited) return (StructuredActionsPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredActionsPackage.eNS_URI);

		// Obtain or create and register package
		StructuredActionsPackageImpl theStructuredActionsPackage = (StructuredActionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StructuredActionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StructuredActionsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		IntermediateActionsPackageImpl theIntermediateActionsPackage = (IntermediateActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) instanceof IntermediateActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) : IntermediateActionsPackage.eINSTANCE);
		CompleteActionsPackageImpl theCompleteActionsPackage = (CompleteActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompleteActionsPackage.eNS_URI) instanceof CompleteActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompleteActionsPackage.eNS_URI) : CompleteActionsPackage.eINSTANCE);

		// Create package meta-data objects
		theStructuredActionsPackage.createPackageContents();
		theBasicActionsPackage.createPackageContents();
		theIntermediateActionsPackage.createPackageContents();
		theCompleteActionsPackage.createPackageContents();

		// Initialize created meta-data
		theStructuredActionsPackage.initializePackageContents();
		theBasicActionsPackage.initializePackageContents();
		theIntermediateActionsPackage.initializePackageContents();
		theCompleteActionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStructuredActionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StructuredActionsPackage.eNS_URI, theStructuredActionsPackage);
		return theStructuredActionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAction() {
		return variableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAction_Variable() {
		return (EReference)variableActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadVariableAction() {
		return readVariableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadVariableAction_Result() {
		return (EReference)readVariableActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteVariableAction() {
		return writeVariableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteVariableAction_Value() {
		return (EReference)writeVariableActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddVariableValueAction() {
		return addVariableValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddVariableValueAction_InsertAt() {
		return (EReference)addVariableValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveVariableValueAction() {
		return removeVariableValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveVariableValueAction_RemoveAt() {
		return (EReference)removeVariableValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearVariableAction() {
		return clearVariableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRaiseExceptionAction() {
		return raiseExceptionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRaiseExceptionAction_Exception() {
		return (EReference)raiseExceptionActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionInputPin() {
		return actionInputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionInputPin_FromAction() {
		return (EReference)actionInputPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActionsFactory getStructuredActionsFactory() {
		return (StructuredActionsFactory)getEFactoryInstance();
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
		variableActionEClass = createEClass(VARIABLE_ACTION);
		createEReference(variableActionEClass, VARIABLE_ACTION__VARIABLE);

		variableEClass = createEClass(VARIABLE);

		readVariableActionEClass = createEClass(READ_VARIABLE_ACTION);
		createEReference(readVariableActionEClass, READ_VARIABLE_ACTION__RESULT);

		writeVariableActionEClass = createEClass(WRITE_VARIABLE_ACTION);
		createEReference(writeVariableActionEClass, WRITE_VARIABLE_ACTION__VALUE);

		addVariableValueActionEClass = createEClass(ADD_VARIABLE_VALUE_ACTION);
		createEReference(addVariableValueActionEClass, ADD_VARIABLE_VALUE_ACTION__INSERT_AT);

		removeVariableValueActionEClass = createEClass(REMOVE_VARIABLE_VALUE_ACTION);
		createEReference(removeVariableValueActionEClass, REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT);

		clearVariableActionEClass = createEClass(CLEAR_VARIABLE_ACTION);

		raiseExceptionActionEClass = createEClass(RAISE_EXCEPTION_ACTION);
		createEReference(raiseExceptionActionEClass, RAISE_EXCEPTION_ACTION__EXCEPTION);

		actionInputPinEClass = createEClass(ACTION_INPUT_PIN);
		createEReference(actionInputPinEClass, ACTION_INPUT_PIN__FROM_ACTION);
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
		BasicActionsPackage theBasicActionsPackage = (BasicActionsPackage)EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		variableActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		readVariableActionEClass.getESuperTypes().add(this.getVariableAction());
		writeVariableActionEClass.getESuperTypes().add(this.getVariableAction());
		addVariableValueActionEClass.getESuperTypes().add(this.getWriteVariableAction());
		removeVariableValueActionEClass.getESuperTypes().add(this.getWriteVariableAction());
		clearVariableActionEClass.getESuperTypes().add(this.getVariableAction());
		raiseExceptionActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		actionInputPinEClass.getESuperTypes().add(theBasicActionsPackage.getInputPin());

		// Initialize classes, features, and operations; add parameters
		initEClass(variableActionEClass, VariableAction.class, "VariableAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableAction_Variable(), this.getVariable(), null, "variable", null, 1, 1, VariableAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(readVariableActionEClass, ReadVariableAction.class, "ReadVariableAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadVariableAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, ReadVariableAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(writeVariableActionEClass, WriteVariableAction.class, "WriteVariableAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWriteVariableAction_Value(), theBasicActionsPackage.getInputPin(), null, "value", null, 0, 1, WriteVariableAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addVariableValueActionEClass, AddVariableValueAction.class, "AddVariableValueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddVariableValueAction_InsertAt(), theBasicActionsPackage.getInputPin(), null, "insertAt", null, 0, 1, AddVariableValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeVariableValueActionEClass, RemoveVariableValueAction.class, "RemoveVariableValueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveVariableValueAction_RemoveAt(), theBasicActionsPackage.getInputPin(), null, "removeAt", null, 0, 1, RemoveVariableValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clearVariableActionEClass, ClearVariableAction.class, "ClearVariableAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(raiseExceptionActionEClass, RaiseExceptionAction.class, "RaiseExceptionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRaiseExceptionAction_Exception(), theBasicActionsPackage.getInputPin(), null, "exception", null, 1, 1, RaiseExceptionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionInputPinEClass, ActionInputPin.class, "ActionInputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionInputPin_FromAction(), theBasicActionsPackage.getAction(), null, "fromAction", null, 1, 1, ActionInputPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (variableEClass, 
		   source, 
		   new String[] {
		   });
	}

} //StructuredActionsPackageImpl

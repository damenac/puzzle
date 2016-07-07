/**
 */
package StateMachineModuleProv.impl;

import StateMachineModuleProv.AbstractState;
import StateMachineModuleProv.Constraint;
import StateMachineModuleProv.FinalState;
import StateMachineModuleProv.Fork;
import StateMachineModuleProv.InitialState;
import StateMachineModuleProv.Join;
import StateMachineModuleProv.Junction;
import StateMachineModuleProv.NamedElement;
import StateMachineModuleProv.Program;
import StateMachineModuleProv.Pseudostate;
import StateMachineModuleProv.Region;
import StateMachineModuleProv.ShallowHistory;
import StateMachineModuleProv.State;
import StateMachineModuleProv.StateMachine;
import StateMachineModuleProv.StateMachineModuleProvFactory;
import StateMachineModuleProv.StateMachineModuleProvPackage;
import StateMachineModuleProv.Statement;
import StateMachineModuleProv.Transition;
import StateMachineModuleProv.Trigger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateMachineModuleProvPackageImpl extends EPackageImpl implements StateMachineModuleProvPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

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
	private EClass pseudostateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shallowHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass junctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

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
	 * @see StateMachineModuleProv.StateMachineModuleProvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StateMachineModuleProvPackageImpl() {
		super(eNS_URI, StateMachineModuleProvFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StateMachineModuleProvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StateMachineModuleProvPackage init() {
		if (isInited) return (StateMachineModuleProvPackage)EPackage.Registry.INSTANCE.getEPackage(StateMachineModuleProvPackage.eNS_URI);

		// Obtain or create and register package
		StateMachineModuleProvPackageImpl theStateMachineModuleProvPackage = (StateMachineModuleProvPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StateMachineModuleProvPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StateMachineModuleProvPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theStateMachineModuleProvPackage.createPackageContents();

		// Initialize created meta-data
		theStateMachineModuleProvPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStateMachineModuleProvPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StateMachineModuleProvPackage.eNS_URI, theStateMachineModuleProvPackage);
		return theStateMachineModuleProvPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachine() {
		return stateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Regions() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Subvertex() {
		return (EReference)regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Transitions() {
		return (EReference)regionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_OwnerState() {
		return (EReference)regionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__InitRegion__Object() {
		return regionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__GetContextPathByRegion() {
		return regionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__Step__Object_Object() {
		return regionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__RemoveStatesFromContext__Object_Object() {
		return regionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__AddStatesToContext__Object_Object() {
		return regionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__GetCurrentState__Object_Object() {
		return regionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__GetActiveTransitions__AbstractState_Object() {
		return regionEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__FindOldActiveStates__Object_Transition_Object() {
		return regionEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__FindNewActiveStates__Object_Transition_Object_Object() {
		return regionEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__FindNewActiveTransitions__Object_Transition_Object() {
		return regionEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__GetAllParents__AbstractState_Object() {
		return regionEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__GetAllChildren__AbstractState_Object() {
		return regionEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__DeepestConflictingTransition__Object() {
		return regionEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__GetContextPath__AbstractState() {
		return regionEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__GetAllSubstates__AbstractState_Object() {
		return regionEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__SaveHistoryState__Object() {
		return regionEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__DeepHistory() {
		return regionEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__DeepHistory__Object() {
		return regionEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__History() {
		return regionEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__History__State() {
		return regionEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractState() {
		return abstractStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractState_Incoming() {
		return (EReference)abstractStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractState_Outgoing() {
		return (EReference)abstractStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractState_OwnerRegion() {
		return (EReference)abstractStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_DoActivity() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Entry() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Exit() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_OwnedRegions() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__EntryState__Object() {
		return stateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__EvalState__Object() {
		return stateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__ExitState__Object() {
		return stateEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Trigger() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Effect() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Guard() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__EvalTransition__Object() {
		return transitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__ValidGuard__Object() {
		return transitionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__AlreadyFired__Object() {
		return transitionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__ResetFired() {
		return transitionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__Fired() {
		return transitionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__Fired__boolean() {
		return transitionEClass.getEOperations().get(5);
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
	public EAttribute getTrigger_Expression() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrigger__EvalTrigger__Object() {
		return triggerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPseudostate() {
		return pseudostateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialState() {
		return initialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFork() {
		return forkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoin() {
		return joinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShallowHistory() {
		return shallowHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJunction() {
		return junctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalState() {
		return finalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFinalState__ExitState__Object() {
		return finalStateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFinalState__Super_exitState__Object() {
		return finalStateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstraint__EvalConstraint__Object() {
		return constraintEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStatement__Eval__Object() {
		return statementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Statements() {
		return (EReference)programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgram__Eval__Object() {
		return programEClass.getEOperations().get(0);
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
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineModuleProvFactory getStateMachineModuleProvFactory() {
		return (StateMachineModuleProvFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__REGIONS);

		regionEClass = createEClass(REGION);
		createEReference(regionEClass, REGION__SUBVERTEX);
		createEReference(regionEClass, REGION__TRANSITIONS);
		createEReference(regionEClass, REGION__OWNER_STATE);
		createEOperation(regionEClass, REGION___INIT_REGION__OBJECT);
		createEOperation(regionEClass, REGION___GET_CONTEXT_PATH_BY_REGION);
		createEOperation(regionEClass, REGION___STEP__OBJECT_OBJECT);
		createEOperation(regionEClass, REGION___REMOVE_STATES_FROM_CONTEXT__OBJECT_OBJECT);
		createEOperation(regionEClass, REGION___ADD_STATES_TO_CONTEXT__OBJECT_OBJECT);
		createEOperation(regionEClass, REGION___GET_CURRENT_STATE__OBJECT_OBJECT);
		createEOperation(regionEClass, REGION___GET_ACTIVE_TRANSITIONS__ABSTRACTSTATE_OBJECT);
		createEOperation(regionEClass, REGION___FIND_OLD_ACTIVE_STATES__OBJECT_TRANSITION_OBJECT);
		createEOperation(regionEClass, REGION___FIND_NEW_ACTIVE_STATES__OBJECT_TRANSITION_OBJECT_OBJECT);
		createEOperation(regionEClass, REGION___FIND_NEW_ACTIVE_TRANSITIONS__OBJECT_TRANSITION_OBJECT);
		createEOperation(regionEClass, REGION___GET_ALL_PARENTS__ABSTRACTSTATE_OBJECT);
		createEOperation(regionEClass, REGION___GET_ALL_CHILDREN__ABSTRACTSTATE_OBJECT);
		createEOperation(regionEClass, REGION___DEEPEST_CONFLICTING_TRANSITION__OBJECT);
		createEOperation(regionEClass, REGION___GET_CONTEXT_PATH__ABSTRACTSTATE);
		createEOperation(regionEClass, REGION___GET_ALL_SUBSTATES__ABSTRACTSTATE_OBJECT);
		createEOperation(regionEClass, REGION___SAVE_HISTORY_STATE__OBJECT);
		createEOperation(regionEClass, REGION___DEEP_HISTORY);
		createEOperation(regionEClass, REGION___DEEP_HISTORY__OBJECT);
		createEOperation(regionEClass, REGION___HISTORY);
		createEOperation(regionEClass, REGION___HISTORY__STATE);

		abstractStateEClass = createEClass(ABSTRACT_STATE);
		createEReference(abstractStateEClass, ABSTRACT_STATE__INCOMING);
		createEReference(abstractStateEClass, ABSTRACT_STATE__OUTGOING);
		createEReference(abstractStateEClass, ABSTRACT_STATE__OWNER_REGION);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__DO_ACTIVITY);
		createEReference(stateEClass, STATE__ENTRY);
		createEReference(stateEClass, STATE__EXIT);
		createEReference(stateEClass, STATE__OWNED_REGIONS);
		createEOperation(stateEClass, STATE___ENTRY_STATE__OBJECT);
		createEOperation(stateEClass, STATE___EVAL_STATE__OBJECT);
		createEOperation(stateEClass, STATE___EXIT_STATE__OBJECT);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__TRIGGER);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__EFFECT);
		createEReference(transitionEClass, TRANSITION__GUARD);
		createEOperation(transitionEClass, TRANSITION___EVAL_TRANSITION__OBJECT);
		createEOperation(transitionEClass, TRANSITION___VALID_GUARD__OBJECT);
		createEOperation(transitionEClass, TRANSITION___ALREADY_FIRED__OBJECT);
		createEOperation(transitionEClass, TRANSITION___RESET_FIRED);
		createEOperation(transitionEClass, TRANSITION___FIRED);
		createEOperation(transitionEClass, TRANSITION___FIRED__BOOLEAN);

		triggerEClass = createEClass(TRIGGER);
		createEAttribute(triggerEClass, TRIGGER__EXPRESSION);
		createEOperation(triggerEClass, TRIGGER___EVAL_TRIGGER__OBJECT);

		pseudostateEClass = createEClass(PSEUDOSTATE);

		initialStateEClass = createEClass(INITIAL_STATE);

		forkEClass = createEClass(FORK);

		joinEClass = createEClass(JOIN);

		shallowHistoryEClass = createEClass(SHALLOW_HISTORY);

		junctionEClass = createEClass(JUNCTION);

		finalStateEClass = createEClass(FINAL_STATE);
		createEOperation(finalStateEClass, FINAL_STATE___EXIT_STATE__OBJECT);
		createEOperation(finalStateEClass, FINAL_STATE___SUPER_EXIT_STATE__OBJECT);

		constraintEClass = createEClass(CONSTRAINT);
		createEOperation(constraintEClass, CONSTRAINT___EVAL_CONSTRAINT__OBJECT);

		statementEClass = createEClass(STATEMENT);
		createEOperation(statementEClass, STATEMENT___EVAL__OBJECT);

		programEClass = createEClass(PROGRAM);
		createEReference(programEClass, PROGRAM__STATEMENTS);
		createEOperation(programEClass, PROGRAM___EVAL__OBJECT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stateMachineEClass.getESuperTypes().add(this.getNamedElement());
		regionEClass.getESuperTypes().add(this.getNamedElement());
		abstractStateEClass.getESuperTypes().add(this.getNamedElement());
		stateEClass.getESuperTypes().add(this.getAbstractState());
		transitionEClass.getESuperTypes().add(this.getNamedElement());
		pseudostateEClass.getESuperTypes().add(this.getAbstractState());
		initialStateEClass.getESuperTypes().add(this.getPseudostate());
		forkEClass.getESuperTypes().add(this.getPseudostate());
		joinEClass.getESuperTypes().add(this.getPseudostate());
		shallowHistoryEClass.getESuperTypes().add(this.getPseudostate());
		junctionEClass.getESuperTypes().add(this.getPseudostate());
		finalStateEClass.getESuperTypes().add(this.getState());
		programEClass.getESuperTypes().add(this.getStatement());

		// Initialize classes, features, and operations; add parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Regions(), this.getRegion(), null, "regions", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegion_Subvertex(), this.getAbstractState(), null, "subvertex", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_OwnerState(), this.getState(), null, "ownerState", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getRegion__InitRegion__Object(), null, "initRegion", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRegion__GetContextPathByRegion(), ecorePackage.getEString(), "getContextPathByRegion", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRegion__Step__Object_Object(), null, "step", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "events", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRegion__RemoveStatesFromContext__Object_Object(), null, "removeStatesFromContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "toRemove", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRegion__AddStatesToContext__Object_Object(), null, "addStatesToContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "newStates", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRegion__GetCurrentState__Object_Object(), ecorePackage.getEJavaObject(), "getCurrentState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "events", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRegion__GetActiveTransitions__AbstractState_Object(), ecorePackage.getEJavaObject(), "getActiveTransitions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractState(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "events", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRegion__FindOldActiveStates__Object_Transition_Object(), null, "findOldActiveStates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "oldActiveStates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTransition(), "selectedTransition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRegion__FindNewActiveStates__Object_Transition_Object_Object(), null, "findNewActiveStates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "newActiveStates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTransition(), "selectedTransition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "currentActiveTransitions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRegion__FindNewActiveTransitions__Object_Transition_Object(), null, "findNewActiveTransitions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "newActiveTransitions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTransition(), "selectedTransition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRegion__GetAllParents__AbstractState_Object(), null, "getAllParents", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractState(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "parents", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRegion__GetAllChildren__AbstractState_Object(), null, "getAllChildren", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractState(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "children", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRegion__DeepestConflictingTransition__Object(), ecorePackage.getEBoolean(), "deepestConflictingTransition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "activeTransitions", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRegion__GetContextPath__AbstractState(), ecorePackage.getEString(), "getContextPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractState(), "_vertex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRegion__GetAllSubstates__AbstractState_Object(), null, "getAllSubstates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractState(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "children", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRegion__SaveHistoryState__Object(), null, "saveHistoryState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRegion__DeepHistory(), ecorePackage.getEJavaObject(), "deepHistory", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRegion__DeepHistory__Object(), null, "deepHistory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "deepHistory", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRegion__History(), this.getState(), "history", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRegion__History__State(), null, "history", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getState(), "history", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractStateEClass, AbstractState.class, "AbstractState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractState_Incoming(), this.getTransition(), null, "incoming", null, 0, -1, AbstractState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractState_Outgoing(), this.getTransition(), null, "outgoing", null, 0, -1, AbstractState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractState_OwnerRegion(), this.getRegion(), null, "ownerRegion", null, 1, 1, AbstractState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_DoActivity(), this.getProgram(), null, "doActivity", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Entry(), this.getProgram(), null, "entry", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Exit(), this.getProgram(), null, "exit", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_OwnedRegions(), this.getRegion(), null, "ownedRegions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getState__EntryState__Object(), null, "entryState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getState__EvalState__Object(), null, "evalState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getState__ExitState__Object(), null, "exitState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Trigger(), this.getTrigger(), null, "trigger", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getAbstractState(), null, "target", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getAbstractState(), null, "source", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Effect(), this.getStatement(), null, "effect", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Guard(), this.getConstraint(), null, "guard", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTransition__EvalTransition__Object(), null, "evalTransition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTransition__ValidGuard__Object(), ecorePackage.getEBoolean(), "validGuard", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTransition__AlreadyFired__Object(), ecorePackage.getEBoolean(), "alreadyFired", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTransition__ResetFired(), null, "resetFired", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTransition__Fired(), ecorePackage.getEBoolean(), "fired", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTransition__Fired__boolean(), null, "fired", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "fired", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrigger_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTrigger__EvalTrigger__Object(), ecorePackage.getEBoolean(), "evalTrigger", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "events", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pseudostateEClass, Pseudostate.class, "Pseudostate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkEClass, Fork.class, "Fork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(joinEClass, Join.class, "Join", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shallowHistoryEClass, ShallowHistory.class, "ShallowHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(junctionEClass, Junction.class, "Junction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getFinalState__ExitState__Object(), null, "exitState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFinalState__Super_exitState__Object(), null, "super_exitState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getConstraint__EvalConstraint__Object(), ecorePackage.getEBoolean(), "evalConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getStatement__Eval__Object(), null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgram_Statements(), this.getStatement(), null, "statements", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getProgram__Eval__Object(), null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //StateMachineModuleProvPackageImpl

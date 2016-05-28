/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.*;

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
public class CompleteDSLPckgFactoryImpl extends EFactoryImpl implements CompleteDSLPckgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompleteDSLPckgFactory init() {
		try {
			CompleteDSLPckgFactory theCompleteDSLPckgFactory = (CompleteDSLPckgFactory)EPackage.Registry.INSTANCE.getEFactory(CompleteDSLPckgPackage.eNS_URI);
			if (theCompleteDSLPckgFactory != null) {
				return theCompleteDSLPckgFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CompleteDSLPckgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteDSLPckgFactoryImpl() {
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
			case CompleteDSLPckgPackage.STATE_MACHINE: return createStateMachine();
			case CompleteDSLPckgPackage.REGION: return createRegion();
			case CompleteDSLPckgPackage.STATE: return createState();
			case CompleteDSLPckgPackage.TRANSITION: return createTransition();
			case CompleteDSLPckgPackage.TRIGGER: return createTrigger();
			case CompleteDSLPckgPackage.INITIAL_STATE: return createInitialState();
			case CompleteDSLPckgPackage.FINAL_STATE: return createFinalState();
			case CompleteDSLPckgPackage.NAMED_ELEMENT: return createNamedElement();
			case CompleteDSLPckgPackage.BLOCK: return createBlock();
			case CompleteDSLPckgPackage.NOT_TRIGGER: return createNotTrigger();
			case CompleteDSLPckgPackage.AND_TRIGGER: return createAndTrigger();
			case CompleteDSLPckgPackage.OR_TRIGGER: return createOrTrigger();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotTrigger createNotTrigger() {
		NotTriggerImpl notTrigger = new NotTriggerImpl();
		return notTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndTrigger createAndTrigger() {
		AndTriggerImpl andTrigger = new AndTriggerImpl();
		return andTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrTrigger createOrTrigger() {
		OrTriggerImpl orTrigger = new OrTriggerImpl();
		return orTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteDSLPckgPackage getCompleteDSLPckgPackage() {
		return (CompleteDSLPckgPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CompleteDSLPckgPackage getPackage() {
		return CompleteDSLPckgPackage.eINSTANCE;
	}

} //CompleteDSLPckgFactoryImpl

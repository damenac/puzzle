/**
 */
package Actions.CompleteActions.impl;

import Actions.CompleteActions.*;

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
public class CompleteActionsFactoryImpl extends EFactoryImpl implements CompleteActionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompleteActionsFactory init() {
		try {
			CompleteActionsFactory theCompleteActionsFactory = (CompleteActionsFactory)EPackage.Registry.INSTANCE.getEFactory(CompleteActionsPackage.eNS_URI);
			if (theCompleteActionsFactory != null) {
				return theCompleteActionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CompleteActionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteActionsFactoryImpl() {
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
			case CompleteActionsPackage.REPLY_ACTION: return createReplyAction();
			case CompleteActionsPackage.UNMARSHALL_ACTION: return createUnmarshallAction();
			case CompleteActionsPackage.ACCEPT_EVENT_ACTION: return createAcceptEventAction();
			case CompleteActionsPackage.ACCEPT_CALL_ACTION: return createAcceptCallAction();
			case CompleteActionsPackage.TRIGGER: return createTrigger();
			case CompleteActionsPackage.READ_EXTEND_ACTION: return createReadExtendAction();
			case CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION: return createReclassifyObjectAction();
			case CompleteActionsPackage.READLS_CLASSIFIED_OBJECT_ACTION: return createReadlsClassifiedObjectAction();
			case CompleteActionsPackage.START_CLASSIFIER_BEHAVIOR_ACTION: return createStartClassifierBehaviorAction();
			case CompleteActionsPackage.START_OBJECT_BEHAVIOR_ACTION: return createStartObjectBehaviorAction();
			case CompleteActionsPackage.QUALIFIER_VALUE: return createQualifierValue();
			case CompleteActionsPackage.READ_LINK_OBJECT_END_ACTION: return createReadLinkObjectEndAction();
			case CompleteActionsPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION: return createReadLinkObjectEndQualifierAction();
			case CompleteActionsPackage.CREATE_LINK_OBJECT_ACTION: return createCreateLinkObjectAction();
			case CompleteActionsPackage.REDUCE_ACTION: return createReduceAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyAction createReplyAction() {
		ReplyActionImpl replyAction = new ReplyActionImpl();
		return replyAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnmarshallAction createUnmarshallAction() {
		UnmarshallActionImpl unmarshallAction = new UnmarshallActionImpl();
		return unmarshallAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventAction createAcceptEventAction() {
		AcceptEventActionImpl acceptEventAction = new AcceptEventActionImpl();
		return acceptEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptCallAction createAcceptCallAction() {
		AcceptCallActionImpl acceptCallAction = new AcceptCallActionImpl();
		return acceptCallAction;
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
	public ReadExtendAction createReadExtendAction() {
		ReadExtendActionImpl readExtendAction = new ReadExtendActionImpl();
		return readExtendAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReclassifyObjectAction createReclassifyObjectAction() {
		ReclassifyObjectActionImpl reclassifyObjectAction = new ReclassifyObjectActionImpl();
		return reclassifyObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadlsClassifiedObjectAction createReadlsClassifiedObjectAction() {
		ReadlsClassifiedObjectActionImpl readlsClassifiedObjectAction = new ReadlsClassifiedObjectActionImpl();
		return readlsClassifiedObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartClassifierBehaviorAction createStartClassifierBehaviorAction() {
		StartClassifierBehaviorActionImpl startClassifierBehaviorAction = new StartClassifierBehaviorActionImpl();
		return startClassifierBehaviorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartObjectBehaviorAction createStartObjectBehaviorAction() {
		StartObjectBehaviorActionImpl startObjectBehaviorAction = new StartObjectBehaviorActionImpl();
		return startObjectBehaviorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierValue createQualifierValue() {
		QualifierValueImpl qualifierValue = new QualifierValueImpl();
		return qualifierValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkObjectEndAction createReadLinkObjectEndAction() {
		ReadLinkObjectEndActionImpl readLinkObjectEndAction = new ReadLinkObjectEndActionImpl();
		return readLinkObjectEndAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkObjectEndQualifierAction createReadLinkObjectEndQualifierAction() {
		ReadLinkObjectEndQualifierActionImpl readLinkObjectEndQualifierAction = new ReadLinkObjectEndQualifierActionImpl();
		return readLinkObjectEndQualifierAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateLinkObjectAction createCreateLinkObjectAction() {
		CreateLinkObjectActionImpl createLinkObjectAction = new CreateLinkObjectActionImpl();
		return createLinkObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReduceAction createReduceAction() {
		ReduceActionImpl reduceAction = new ReduceActionImpl();
		return reduceAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteActionsPackage getCompleteActionsPackage() {
		return (CompleteActionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CompleteActionsPackage getPackage() {
		return CompleteActionsPackage.eINSTANCE;
	}

} //CompleteActionsFactoryImpl

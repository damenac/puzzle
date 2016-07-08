/**
 */
package Actions.CompleteActions.impl;

import Actions.BasicActions.BasicActionsPackage;

import Actions.BasicActions.impl.BasicActionsPackageImpl;

import Actions.CompleteActions.AcceptCallAction;
import Actions.CompleteActions.AcceptEventAction;
import Actions.CompleteActions.CompleteActionsFactory;
import Actions.CompleteActions.CompleteActionsPackage;
import Actions.CompleteActions.CreateLinkObjectAction;
import Actions.CompleteActions.QualifierValue;
import Actions.CompleteActions.ReadExtendAction;
import Actions.CompleteActions.ReadLinkObjectEndAction;
import Actions.CompleteActions.ReadLinkObjectEndQualifierAction;
import Actions.CompleteActions.ReadlsClassifiedObjectAction;
import Actions.CompleteActions.ReclassifyObjectAction;
import Actions.CompleteActions.ReduceAction;
import Actions.CompleteActions.ReplyAction;
import Actions.CompleteActions.StartClassifierBehaviorAction;
import Actions.CompleteActions.StartObjectBehaviorAction;
import Actions.CompleteActions.Trigger;
import Actions.CompleteActions.UnmarshallAction;

import Actions.IntermediateActions.IntermediateActionsPackage;

import Actions.IntermediateActions.impl.IntermediateActionsPackageImpl;

import Actions.StructuredActions.StructuredActionsPackage;

import Actions.StructuredActions.impl.StructuredActionsPackageImpl;

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
public class CompleteActionsPackageImpl extends EPackageImpl implements CompleteActionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replyActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unmarshallActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptCallActionEClass = null;

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
	private EClass readExtendActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reclassifyObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readlsClassifiedObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startClassifierBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startObjectBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifierValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkObjectEndActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkObjectEndQualifierActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createLinkObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reduceActionEClass = null;

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
	 * @see Actions.CompleteActions.CompleteActionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CompleteActionsPackageImpl() {
		super(eNS_URI, CompleteActionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CompleteActionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CompleteActionsPackage init() {
		if (isInited) return (CompleteActionsPackage)EPackage.Registry.INSTANCE.getEPackage(CompleteActionsPackage.eNS_URI);

		// Obtain or create and register package
		CompleteActionsPackageImpl theCompleteActionsPackage = (CompleteActionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CompleteActionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CompleteActionsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		IntermediateActionsPackageImpl theIntermediateActionsPackage = (IntermediateActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) instanceof IntermediateActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) : IntermediateActionsPackage.eINSTANCE);
		StructuredActionsPackageImpl theStructuredActionsPackage = (StructuredActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructuredActionsPackage.eNS_URI) instanceof StructuredActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructuredActionsPackage.eNS_URI) : StructuredActionsPackage.eINSTANCE);

		// Create package meta-data objects
		theCompleteActionsPackage.createPackageContents();
		theBasicActionsPackage.createPackageContents();
		theIntermediateActionsPackage.createPackageContents();
		theStructuredActionsPackage.createPackageContents();

		// Initialize created meta-data
		theCompleteActionsPackage.initializePackageContents();
		theBasicActionsPackage.initializePackageContents();
		theIntermediateActionsPackage.initializePackageContents();
		theStructuredActionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCompleteActionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CompleteActionsPackage.eNS_URI, theCompleteActionsPackage);
		return theCompleteActionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplyAction() {
		return replyActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyAction_ReturnInformation() {
		return (EReference)replyActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyAction_ReplyValue() {
		return (EReference)replyActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyAction_ReplyToCall() {
		return (EReference)replyActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnmarshallAction() {
		return unmarshallActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnmarshallAction_Object() {
		return (EReference)unmarshallActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnmarshallAction_UnmarshallType() {
		return (EReference)unmarshallActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnmarshallAction_Result() {
		return (EReference)unmarshallActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventAction() {
		return acceptEventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcceptEventAction_IsUnmarshall() {
		return (EAttribute)acceptEventActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptEventAction_Result() {
		return (EReference)acceptEventActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptEventAction_Trigger() {
		return (EReference)acceptEventActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptCallAction() {
		return acceptCallActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptCallAction_ReturnInformation() {
		return (EReference)acceptCallActionEClass.getEStructuralFeatures().get(0);
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
	public EClass getReadExtendAction() {
		return readExtendActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadExtendAction_Result() {
		return (EReference)readExtendActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadExtendAction_Classifier() {
		return (EReference)readExtendActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReclassifyObjectAction() {
		return reclassifyObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReclassifyObjectAction_IsReplaceAll() {
		return (EAttribute)reclassifyObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReclassifyObjectAction_Object() {
		return (EReference)reclassifyObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReclassifyObjectAction_OldClassifier() {
		return (EReference)reclassifyObjectActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReclassifyObjectAction_NewClassifier() {
		return (EReference)reclassifyObjectActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadlsClassifiedObjectAction() {
		return readlsClassifiedObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadlsClassifiedObjectAction_Result() {
		return (EReference)readlsClassifiedObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadlsClassifiedObjectAction_Object() {
		return (EReference)readlsClassifiedObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartClassifierBehaviorAction() {
		return startClassifierBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartClassifierBehaviorAction_Object() {
		return (EReference)startClassifierBehaviorActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartObjectBehaviorAction() {
		return startObjectBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartObjectBehaviorAction_Object() {
		return (EReference)startObjectBehaviorActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifierValue() {
		return qualifierValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifierValue_Qualifier() {
		return (EReference)qualifierValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifierValue_Value() {
		return (EReference)qualifierValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkObjectEndAction() {
		return readLinkObjectEndActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndAction_End() {
		return (EReference)readLinkObjectEndActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndAction_Object() {
		return (EReference)readLinkObjectEndActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndAction_Result() {
		return (EReference)readLinkObjectEndActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkObjectEndQualifierAction() {
		return readLinkObjectEndQualifierActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndQualifierAction_Object() {
		return (EReference)readLinkObjectEndQualifierActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndQualifierAction_Result() {
		return (EReference)readLinkObjectEndQualifierActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndQualifierAction_Qualifier() {
		return (EReference)readLinkObjectEndQualifierActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateLinkObjectAction() {
		return createLinkObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateLinkObjectAction_Result() {
		return (EReference)createLinkObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReduceAction() {
		return reduceActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReduceAction_IsOrdered() {
		return (EAttribute)reduceActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceAction_Result() {
		return (EReference)reduceActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceAction_Collection() {
		return (EReference)reduceActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceAction_Reducer() {
		return (EReference)reduceActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteActionsFactory getCompleteActionsFactory() {
		return (CompleteActionsFactory)getEFactoryInstance();
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
		replyActionEClass = createEClass(REPLY_ACTION);
		createEReference(replyActionEClass, REPLY_ACTION__RETURN_INFORMATION);
		createEReference(replyActionEClass, REPLY_ACTION__REPLY_VALUE);
		createEReference(replyActionEClass, REPLY_ACTION__REPLY_TO_CALL);

		unmarshallActionEClass = createEClass(UNMARSHALL_ACTION);
		createEReference(unmarshallActionEClass, UNMARSHALL_ACTION__OBJECT);
		createEReference(unmarshallActionEClass, UNMARSHALL_ACTION__UNMARSHALL_TYPE);
		createEReference(unmarshallActionEClass, UNMARSHALL_ACTION__RESULT);

		acceptEventActionEClass = createEClass(ACCEPT_EVENT_ACTION);
		createEAttribute(acceptEventActionEClass, ACCEPT_EVENT_ACTION__IS_UNMARSHALL);
		createEReference(acceptEventActionEClass, ACCEPT_EVENT_ACTION__RESULT);
		createEReference(acceptEventActionEClass, ACCEPT_EVENT_ACTION__TRIGGER);

		acceptCallActionEClass = createEClass(ACCEPT_CALL_ACTION);
		createEReference(acceptCallActionEClass, ACCEPT_CALL_ACTION__RETURN_INFORMATION);

		triggerEClass = createEClass(TRIGGER);

		readExtendActionEClass = createEClass(READ_EXTEND_ACTION);
		createEReference(readExtendActionEClass, READ_EXTEND_ACTION__RESULT);
		createEReference(readExtendActionEClass, READ_EXTEND_ACTION__CLASSIFIER);

		reclassifyObjectActionEClass = createEClass(RECLASSIFY_OBJECT_ACTION);
		createEAttribute(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL);
		createEReference(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__OBJECT);
		createEReference(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER);
		createEReference(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER);

		readlsClassifiedObjectActionEClass = createEClass(READLS_CLASSIFIED_OBJECT_ACTION);
		createEReference(readlsClassifiedObjectActionEClass, READLS_CLASSIFIED_OBJECT_ACTION__RESULT);
		createEReference(readlsClassifiedObjectActionEClass, READLS_CLASSIFIED_OBJECT_ACTION__OBJECT);

		startClassifierBehaviorActionEClass = createEClass(START_CLASSIFIER_BEHAVIOR_ACTION);
		createEReference(startClassifierBehaviorActionEClass, START_CLASSIFIER_BEHAVIOR_ACTION__OBJECT);

		startObjectBehaviorActionEClass = createEClass(START_OBJECT_BEHAVIOR_ACTION);
		createEReference(startObjectBehaviorActionEClass, START_OBJECT_BEHAVIOR_ACTION__OBJECT);

		qualifierValueEClass = createEClass(QUALIFIER_VALUE);
		createEReference(qualifierValueEClass, QUALIFIER_VALUE__QUALIFIER);
		createEReference(qualifierValueEClass, QUALIFIER_VALUE__VALUE);

		readLinkObjectEndActionEClass = createEClass(READ_LINK_OBJECT_END_ACTION);
		createEReference(readLinkObjectEndActionEClass, READ_LINK_OBJECT_END_ACTION__END);
		createEReference(readLinkObjectEndActionEClass, READ_LINK_OBJECT_END_ACTION__OBJECT);
		createEReference(readLinkObjectEndActionEClass, READ_LINK_OBJECT_END_ACTION__RESULT);

		readLinkObjectEndQualifierActionEClass = createEClass(READ_LINK_OBJECT_END_QUALIFIER_ACTION);
		createEReference(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT);
		createEReference(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT);
		createEReference(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER);

		createLinkObjectActionEClass = createEClass(CREATE_LINK_OBJECT_ACTION);
		createEReference(createLinkObjectActionEClass, CREATE_LINK_OBJECT_ACTION__RESULT);

		reduceActionEClass = createEClass(REDUCE_ACTION);
		createEAttribute(reduceActionEClass, REDUCE_ACTION__IS_ORDERED);
		createEReference(reduceActionEClass, REDUCE_ACTION__RESULT);
		createEReference(reduceActionEClass, REDUCE_ACTION__COLLECTION);
		createEReference(reduceActionEClass, REDUCE_ACTION__REDUCER);
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
		IntermediateActionsPackage theIntermediateActionsPackage = (IntermediateActionsPackage)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		replyActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		unmarshallActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		acceptEventActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		acceptCallActionEClass.getESuperTypes().add(this.getAcceptEventAction());
		readExtendActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		reclassifyObjectActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		startClassifierBehaviorActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		startObjectBehaviorActionEClass.getESuperTypes().add(theBasicActionsPackage.getCallAction());
		qualifierValueEClass.getESuperTypes().add(theIntermediateActionsPackage.getElement());
		readLinkObjectEndActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		readLinkObjectEndQualifierActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		createLinkObjectActionEClass.getESuperTypes().add(theIntermediateActionsPackage.getCreateLinkAction());
		reduceActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(replyActionEClass, ReplyAction.class, "ReplyAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReplyAction_ReturnInformation(), theBasicActionsPackage.getInputPin(), null, "returnInformation", null, 1, 1, ReplyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplyAction_ReplyValue(), theBasicActionsPackage.getInputPin(), null, "replyValue", null, 0, -1, ReplyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplyAction_ReplyToCall(), this.getTrigger(), null, "replyToCall", null, 1, 1, ReplyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unmarshallActionEClass, UnmarshallAction.class, "UnmarshallAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnmarshallAction_Object(), theBasicActionsPackage.getInputPin(), null, "object", null, 1, 1, UnmarshallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnmarshallAction_UnmarshallType(), theBasicActionsPackage.getClassifier(), null, "unmarshallType", null, 1, 1, UnmarshallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnmarshallAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, -1, UnmarshallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acceptEventActionEClass, AcceptEventAction.class, "AcceptEventAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcceptEventAction_IsUnmarshall(), ecorePackage.getEBoolean(), "isUnmarshall", null, 0, 1, AcceptEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcceptEventAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 0, -1, AcceptEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcceptEventAction_Trigger(), this.getTrigger(), null, "trigger", null, 1, -1, AcceptEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acceptCallActionEClass, AcceptCallAction.class, "AcceptCallAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcceptCallAction_ReturnInformation(), theBasicActionsPackage.getOutputPin(), null, "returnInformation", null, 1, 1, AcceptCallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(readExtendActionEClass, ReadExtendAction.class, "ReadExtendAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadExtendAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, ReadExtendAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReadExtendAction_Classifier(), theBasicActionsPackage.getClassifier(), null, "classifier", null, 1, 1, ReadExtendAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reclassifyObjectActionEClass, ReclassifyObjectAction.class, "ReclassifyObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReclassifyObjectAction_IsReplaceAll(), ecorePackage.getEBoolean(), "isReplaceAll", null, 0, 1, ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReclassifyObjectAction_Object(), theBasicActionsPackage.getInputPin(), null, "object", null, 1, 1, ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReclassifyObjectAction_OldClassifier(), theBasicActionsPackage.getClassifier(), null, "oldClassifier", null, 0, -1, ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReclassifyObjectAction_NewClassifier(), theBasicActionsPackage.getClassifier(), null, "newClassifier", null, 0, -1, ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readlsClassifiedObjectActionEClass, ReadlsClassifiedObjectAction.class, "ReadlsClassifiedObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadlsClassifiedObjectAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, ReadlsClassifiedObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReadlsClassifiedObjectAction_Object(), theBasicActionsPackage.getInputPin(), null, "object", null, 1, 1, ReadlsClassifiedObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startClassifierBehaviorActionEClass, StartClassifierBehaviorAction.class, "StartClassifierBehaviorAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartClassifierBehaviorAction_Object(), theBasicActionsPackage.getInputPin(), null, "object", null, 1, 1, StartClassifierBehaviorAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startObjectBehaviorActionEClass, StartObjectBehaviorAction.class, "StartObjectBehaviorAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartObjectBehaviorAction_Object(), theBasicActionsPackage.getInputPin(), null, "object", null, 1, 1, StartObjectBehaviorAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualifierValueEClass, QualifierValue.class, "QualifierValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualifierValue_Qualifier(), theIntermediateActionsPackage.getProperty(), null, "qualifier", null, 1, 1, QualifierValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualifierValue_Value(), theBasicActionsPackage.getInputPin(), null, "value", null, 1, 1, QualifierValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readLinkObjectEndActionEClass, ReadLinkObjectEndAction.class, "ReadLinkObjectEndAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadLinkObjectEndAction_End(), theIntermediateActionsPackage.getProperty(), null, "end", null, 1, 1, ReadLinkObjectEndAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReadLinkObjectEndAction_Object(), theBasicActionsPackage.getInputPin(), null, "object", null, 1, 1, ReadLinkObjectEndAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReadLinkObjectEndAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, ReadLinkObjectEndAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readLinkObjectEndQualifierActionEClass, ReadLinkObjectEndQualifierAction.class, "ReadLinkObjectEndQualifierAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadLinkObjectEndQualifierAction_Object(), theBasicActionsPackage.getInputPin(), null, "object", null, 1, 1, ReadLinkObjectEndQualifierAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReadLinkObjectEndQualifierAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, ReadLinkObjectEndQualifierAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReadLinkObjectEndQualifierAction_Qualifier(), theIntermediateActionsPackage.getProperty(), null, "qualifier", null, 1, 1, ReadLinkObjectEndQualifierAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createLinkObjectActionEClass, CreateLinkObjectAction.class, "CreateLinkObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateLinkObjectAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, CreateLinkObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reduceActionEClass, ReduceAction.class, "ReduceAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReduceAction_IsOrdered(), ecorePackage.getEBoolean(), "isOrdered", null, 0, 1, ReduceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReduceAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, ReduceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReduceAction_Collection(), theBasicActionsPackage.getInputPin(), null, "collection", null, 1, 1, ReduceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReduceAction_Reducer(), theBasicActionsPackage.getBehavior(), null, "reducer", null, 1, 1, ReduceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (triggerEClass, 
		   source, 
		   new String[] {
		   });
	}

} //CompleteActionsPackageImpl

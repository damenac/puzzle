/**
 */
package Actions.IntermediateActions.impl;

import Actions.BasicActions.BasicActionsPackage;

import Actions.BasicActions.impl.BasicActionsPackageImpl;

import Actions.CompleteActions.CompleteActionsPackage;

import Actions.CompleteActions.impl.CompleteActionsPackageImpl;

import Actions.IntermediateActions.AddStructuralFeatureValueAction;
import Actions.IntermediateActions.BroadcastSignalAction;
import Actions.IntermediateActions.ClearStructuralFeatureAction;
import Actions.IntermediateActions.CreateLinkAction;
import Actions.IntermediateActions.CreateObjectAction;
import Actions.IntermediateActions.DestroyLinkAction;
import Actions.IntermediateActions.DestroyObjectAction;
import Actions.IntermediateActions.Element;
import Actions.IntermediateActions.IntermediateActionsFactory;
import Actions.IntermediateActions.IntermediateActionsPackage;
import Actions.IntermediateActions.LinkAction;
import Actions.IntermediateActions.LinkEndCreationData;
import Actions.IntermediateActions.LinkEndData;
import Actions.IntermediateActions.LinkEndDestructionData;
import Actions.IntermediateActions.Property;
import Actions.IntermediateActions.ReadLinkAction;
import Actions.IntermediateActions.ReadSelfAction;
import Actions.IntermediateActions.ReadStructuralFeatureAction;
import Actions.IntermediateActions.RemoveStructuralFeatureValueAction;
import Actions.IntermediateActions.SendObjectAction;
import Actions.IntermediateActions.StructuralFeature;
import Actions.IntermediateActions.StructuralFeatureAction;
import Actions.IntermediateActions.TestIdentityAction;
import Actions.IntermediateActions.ValueSpecificationAction;
import Actions.IntermediateActions.WriteLinkAction;
import Actions.IntermediateActions.WriteStructuralFeatureAction;

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
public class IntermediateActionsPackageImpl extends EPackageImpl implements IntermediateActionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass broadcastSignalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destroyObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testIdentityActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readSelfActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addStructuralFeatureValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeStructuralFeatureValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndDataEClass = null;

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
	private EClass readLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndCreationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destroyLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndDestructionDataEClass = null;

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
	 * @see Actions.IntermediateActions.IntermediateActionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntermediateActionsPackageImpl() {
		super(eNS_URI, IntermediateActionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IntermediateActionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IntermediateActionsPackage init() {
		if (isInited) return (IntermediateActionsPackage)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI);

		// Obtain or create and register package
		IntermediateActionsPackageImpl theIntermediateActionsPackage = (IntermediateActionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntermediateActionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntermediateActionsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		CompleteActionsPackageImpl theCompleteActionsPackage = (CompleteActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompleteActionsPackage.eNS_URI) instanceof CompleteActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompleteActionsPackage.eNS_URI) : CompleteActionsPackage.eINSTANCE);
		StructuredActionsPackageImpl theStructuredActionsPackage = (StructuredActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructuredActionsPackage.eNS_URI) instanceof StructuredActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructuredActionsPackage.eNS_URI) : StructuredActionsPackage.eINSTANCE);

		// Create package meta-data objects
		theIntermediateActionsPackage.createPackageContents();
		theBasicActionsPackage.createPackageContents();
		theCompleteActionsPackage.createPackageContents();
		theStructuredActionsPackage.createPackageContents();

		// Initialize created meta-data
		theIntermediateActionsPackage.initializePackageContents();
		theBasicActionsPackage.initializePackageContents();
		theCompleteActionsPackage.initializePackageContents();
		theStructuredActionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntermediateActionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntermediateActionsPackage.eNS_URI, theIntermediateActionsPackage);
		return theIntermediateActionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBroadcastSignalAction() {
		return broadcastSignalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroadcastSignalAction_Signal() {
		return (EReference)broadcastSignalActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendObjectAction() {
		return sendObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendObjectAction_Target() {
		return (EReference)sendObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendObjectAction_Request() {
		return (EReference)sendObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateObjectAction() {
		return createObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateObjectAction_Classifier() {
		return (EReference)createObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateObjectAction_Result() {
		return (EReference)createObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestroyObjectAction() {
		return destroyObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDestroyObjectAction_Target() {
		return (EReference)destroyObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestIdentityAction() {
		return testIdentityActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_Result() {
		return (EReference)testIdentityActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_First() {
		return (EReference)testIdentityActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_Second() {
		return (EReference)testIdentityActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadSelfAction() {
		return readSelfActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadSelfAction_Result() {
		return (EReference)readSelfActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecificationAction() {
		return valueSpecificationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSpecificationAction_Result() {
		return (EReference)valueSpecificationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSpecificationAction_Value() {
		return (EReference)valueSpecificationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeatureAction() {
		return structuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralFeatureAction_StructuralFeature() {
		return (EReference)structuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralFeatureAction_Object() {
		return (EReference)structuralFeatureActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeature() {
		return structuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadStructuralFeatureAction() {
		return readStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadStructuralFeatureAction_Result() {
		return (EReference)readStructuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteStructuralFeatureAction() {
		return writeStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteStructuralFeatureAction_Value() {
		return (EReference)writeStructuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteStructuralFeatureAction_Result() {
		return (EReference)writeStructuralFeatureActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddStructuralFeatureValueAction() {
		return addStructuralFeatureValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddStructuralFeatureValueAction_InsertAt() {
		return (EReference)addStructuralFeatureValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveStructuralFeatureValueAction() {
		return removeStructuralFeatureValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveStructuralFeatureValueAction_RemoveAt() {
		return (EReference)removeStructuralFeatureValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearStructuralFeatureAction() {
		return clearStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearStructuralFeatureAction_Result() {
		return (EReference)clearStructuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkAction() {
		return linkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkAction_InputValue() {
		return (EReference)linkActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkAction_EndData() {
		return (EReference)linkActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndData() {
		return linkEndDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndData_Value() {
		return (EReference)linkEndDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndData_End() {
		return (EReference)linkEndDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndData_Qualifier() {
		return (EReference)linkEndDataEClass.getEStructuralFeatures().get(2);
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
	public EClass getReadLinkAction() {
		return readLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkAction_Result() {
		return (EReference)readLinkActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteLinkAction() {
		return writeLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateLinkAction() {
		return createLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndCreationData() {
		return linkEndCreationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkEndCreationData_IsReplaceAll() {
		return (EAttribute)linkEndCreationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndCreationData_InsertAt() {
		return (EReference)linkEndCreationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestroyLinkAction() {
		return destroyLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndDestructionData() {
		return linkEndDestructionDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkEndDestructionData_IsDestroyDuplicates() {
		return (EAttribute)linkEndDestructionDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndDestructionData_DestroyAt() {
		return (EReference)linkEndDestructionDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActionsFactory getIntermediateActionsFactory() {
		return (IntermediateActionsFactory)getEFactoryInstance();
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
		broadcastSignalActionEClass = createEClass(BROADCAST_SIGNAL_ACTION);
		createEReference(broadcastSignalActionEClass, BROADCAST_SIGNAL_ACTION__SIGNAL);

		sendObjectActionEClass = createEClass(SEND_OBJECT_ACTION);
		createEReference(sendObjectActionEClass, SEND_OBJECT_ACTION__TARGET);
		createEReference(sendObjectActionEClass, SEND_OBJECT_ACTION__REQUEST);

		createObjectActionEClass = createEClass(CREATE_OBJECT_ACTION);
		createEReference(createObjectActionEClass, CREATE_OBJECT_ACTION__CLASSIFIER);
		createEReference(createObjectActionEClass, CREATE_OBJECT_ACTION__RESULT);

		destroyObjectActionEClass = createEClass(DESTROY_OBJECT_ACTION);
		createEReference(destroyObjectActionEClass, DESTROY_OBJECT_ACTION__TARGET);

		testIdentityActionEClass = createEClass(TEST_IDENTITY_ACTION);
		createEReference(testIdentityActionEClass, TEST_IDENTITY_ACTION__RESULT);
		createEReference(testIdentityActionEClass, TEST_IDENTITY_ACTION__FIRST);
		createEReference(testIdentityActionEClass, TEST_IDENTITY_ACTION__SECOND);

		readSelfActionEClass = createEClass(READ_SELF_ACTION);
		createEReference(readSelfActionEClass, READ_SELF_ACTION__RESULT);

		valueSpecificationActionEClass = createEClass(VALUE_SPECIFICATION_ACTION);
		createEReference(valueSpecificationActionEClass, VALUE_SPECIFICATION_ACTION__RESULT);
		createEReference(valueSpecificationActionEClass, VALUE_SPECIFICATION_ACTION__VALUE);

		structuralFeatureActionEClass = createEClass(STRUCTURAL_FEATURE_ACTION);
		createEReference(structuralFeatureActionEClass, STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE);
		createEReference(structuralFeatureActionEClass, STRUCTURAL_FEATURE_ACTION__OBJECT);

		structuralFeatureEClass = createEClass(STRUCTURAL_FEATURE);

		readStructuralFeatureActionEClass = createEClass(READ_STRUCTURAL_FEATURE_ACTION);
		createEReference(readStructuralFeatureActionEClass, READ_STRUCTURAL_FEATURE_ACTION__RESULT);

		writeStructuralFeatureActionEClass = createEClass(WRITE_STRUCTURAL_FEATURE_ACTION);
		createEReference(writeStructuralFeatureActionEClass, WRITE_STRUCTURAL_FEATURE_ACTION__VALUE);
		createEReference(writeStructuralFeatureActionEClass, WRITE_STRUCTURAL_FEATURE_ACTION__RESULT);

		addStructuralFeatureValueActionEClass = createEClass(ADD_STRUCTURAL_FEATURE_VALUE_ACTION);
		createEReference(addStructuralFeatureValueActionEClass, ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT);

		removeStructuralFeatureValueActionEClass = createEClass(REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION);
		createEReference(removeStructuralFeatureValueActionEClass, REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT);

		clearStructuralFeatureActionEClass = createEClass(CLEAR_STRUCTURAL_FEATURE_ACTION);
		createEReference(clearStructuralFeatureActionEClass, CLEAR_STRUCTURAL_FEATURE_ACTION__RESULT);

		linkActionEClass = createEClass(LINK_ACTION);
		createEReference(linkActionEClass, LINK_ACTION__INPUT_VALUE);
		createEReference(linkActionEClass, LINK_ACTION__END_DATA);

		linkEndDataEClass = createEClass(LINK_END_DATA);
		createEReference(linkEndDataEClass, LINK_END_DATA__VALUE);
		createEReference(linkEndDataEClass, LINK_END_DATA__END);
		createEReference(linkEndDataEClass, LINK_END_DATA__QUALIFIER);

		propertyEClass = createEClass(PROPERTY);

		readLinkActionEClass = createEClass(READ_LINK_ACTION);
		createEReference(readLinkActionEClass, READ_LINK_ACTION__RESULT);

		writeLinkActionEClass = createEClass(WRITE_LINK_ACTION);

		createLinkActionEClass = createEClass(CREATE_LINK_ACTION);

		linkEndCreationDataEClass = createEClass(LINK_END_CREATION_DATA);
		createEAttribute(linkEndCreationDataEClass, LINK_END_CREATION_DATA__IS_REPLACE_ALL);
		createEReference(linkEndCreationDataEClass, LINK_END_CREATION_DATA__INSERT_AT);

		elementEClass = createEClass(ELEMENT);

		destroyLinkActionEClass = createEClass(DESTROY_LINK_ACTION);

		linkEndDestructionDataEClass = createEClass(LINK_END_DESTRUCTION_DATA);
		createEAttribute(linkEndDestructionDataEClass, LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES);
		createEReference(linkEndDestructionDataEClass, LINK_END_DESTRUCTION_DATA__DESTROY_AT);
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
		CompleteActionsPackage theCompleteActionsPackage = (CompleteActionsPackage)EPackage.Registry.INSTANCE.getEPackage(CompleteActionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		broadcastSignalActionEClass.getESuperTypes().add(theBasicActionsPackage.getInvocationAction());
		sendObjectActionEClass.getESuperTypes().add(theBasicActionsPackage.getInvocationAction());
		createObjectActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		destroyObjectActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		testIdentityActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		readSelfActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		valueSpecificationActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		structuralFeatureActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		readStructuralFeatureActionEClass.getESuperTypes().add(this.getStructuralFeatureAction());
		writeStructuralFeatureActionEClass.getESuperTypes().add(this.getStructuralFeatureAction());
		addStructuralFeatureValueActionEClass.getESuperTypes().add(this.getWriteStructuralFeatureAction());
		removeStructuralFeatureValueActionEClass.getESuperTypes().add(this.getWriteStructuralFeatureAction());
		clearStructuralFeatureActionEClass.getESuperTypes().add(this.getStructuralFeatureAction());
		linkActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		linkEndDataEClass.getESuperTypes().add(this.getElement());
		readLinkActionEClass.getESuperTypes().add(this.getLinkAction());
		writeLinkActionEClass.getESuperTypes().add(this.getLinkAction());
		createLinkActionEClass.getESuperTypes().add(this.getWriteLinkAction());
		linkEndCreationDataEClass.getESuperTypes().add(this.getLinkEndData());
		destroyLinkActionEClass.getESuperTypes().add(this.getWriteLinkAction());
		linkEndDestructionDataEClass.getESuperTypes().add(this.getLinkEndData());

		// Initialize classes, features, and operations; add parameters
		initEClass(broadcastSignalActionEClass, BroadcastSignalAction.class, "BroadcastSignalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBroadcastSignalAction_Signal(), theBasicActionsPackage.getSignal(), null, "signal", null, 1, 1, BroadcastSignalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendObjectActionEClass, SendObjectAction.class, "SendObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendObjectAction_Target(), theBasicActionsPackage.getInputPin(), null, "target", null, 1, 1, SendObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendObjectAction_Request(), theBasicActionsPackage.getInputPin(), null, "request", null, 1, 1, SendObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createObjectActionEClass, CreateObjectAction.class, "CreateObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateObjectAction_Classifier(), theBasicActionsPackage.getClassifier(), null, "classifier", null, 1, 1, CreateObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateObjectAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, CreateObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(destroyObjectActionEClass, DestroyObjectAction.class, "DestroyObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDestroyObjectAction_Target(), theBasicActionsPackage.getInputPin(), null, "target", null, 1, 1, DestroyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testIdentityActionEClass, TestIdentityAction.class, "TestIdentityAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestIdentityAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, TestIdentityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestIdentityAction_First(), theBasicActionsPackage.getInputPin(), null, "first", null, 1, 1, TestIdentityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestIdentityAction_Second(), theBasicActionsPackage.getInputPin(), null, "second", null, 1, 1, TestIdentityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readSelfActionEClass, ReadSelfAction.class, "ReadSelfAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadSelfAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, ReadSelfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueSpecificationActionEClass, ValueSpecificationAction.class, "ValueSpecificationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSpecificationAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, ValueSpecificationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueSpecificationAction_Value(), theBasicActionsPackage.getValueSpecification(), null, "value", null, 1, 1, ValueSpecificationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuralFeatureActionEClass, StructuralFeatureAction.class, "StructuralFeatureAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuralFeatureAction_StructuralFeature(), this.getStructuralFeature(), null, "structuralFeature", null, 1, 1, StructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuralFeatureAction_Object(), theBasicActionsPackage.getInputPin(), null, "object", null, 1, 1, StructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuralFeatureEClass, StructuralFeature.class, "StructuralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(readStructuralFeatureActionEClass, ReadStructuralFeatureAction.class, "ReadStructuralFeatureAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadStructuralFeatureAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, ReadStructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(writeStructuralFeatureActionEClass, WriteStructuralFeatureAction.class, "WriteStructuralFeatureAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWriteStructuralFeatureAction_Value(), theBasicActionsPackage.getInputPin(), null, "value", null, 0, 1, WriteStructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWriteStructuralFeatureAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 0, 1, WriteStructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addStructuralFeatureValueActionEClass, AddStructuralFeatureValueAction.class, "AddStructuralFeatureValueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddStructuralFeatureValueAction_InsertAt(), theBasicActionsPackage.getInputPin(), null, "insertAt", null, 0, 1, AddStructuralFeatureValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeStructuralFeatureValueActionEClass, RemoveStructuralFeatureValueAction.class, "RemoveStructuralFeatureValueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveStructuralFeatureValueAction_RemoveAt(), theBasicActionsPackage.getInputPin(), null, "removeAt", null, 0, 1, RemoveStructuralFeatureValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clearStructuralFeatureActionEClass, ClearStructuralFeatureAction.class, "ClearStructuralFeatureAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClearStructuralFeatureAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 0, 1, ClearStructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkActionEClass, LinkAction.class, "LinkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkAction_InputValue(), theBasicActionsPackage.getInputPin(), null, "inputValue", null, 1, -1, LinkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkAction_EndData(), this.getLinkEndData(), null, "endData", null, 2, -1, LinkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEndDataEClass, LinkEndData.class, "LinkEndData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkEndData_Value(), theBasicActionsPackage.getInputPin(), null, "value", null, 0, 1, LinkEndData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkEndData_End(), this.getProperty(), null, "end", null, 1, 1, LinkEndData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkEndData_Qualifier(), theCompleteActionsPackage.getQualifierValue(), null, "qualifier", null, 0, -1, LinkEndData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(readLinkActionEClass, ReadLinkAction.class, "ReadLinkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadLinkAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, ReadLinkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(writeLinkActionEClass, WriteLinkAction.class, "WriteLinkAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createLinkActionEClass, CreateLinkAction.class, "CreateLinkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEndCreationDataEClass, LinkEndCreationData.class, "LinkEndCreationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkEndCreationData_IsReplaceAll(), ecorePackage.getEBoolean(), "isReplaceAll", null, 0, 1, LinkEndCreationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkEndCreationData_InsertAt(), theBasicActionsPackage.getInputPin(), null, "insertAt", null, 0, 1, LinkEndCreationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(destroyLinkActionEClass, DestroyLinkAction.class, "DestroyLinkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEndDestructionDataEClass, LinkEndDestructionData.class, "LinkEndDestructionData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkEndDestructionData_IsDestroyDuplicates(), ecorePackage.getEBoolean(), "isDestroyDuplicates", null, 0, 1, LinkEndDestructionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkEndDestructionData_DestroyAt(), theBasicActionsPackage.getInputPin(), null, "destroyAt", null, 0, 1, LinkEndDestructionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (structuralFeatureEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (elementEClass, 
		   source, 
		   new String[] {
		   });
	}

} //IntermediateActionsPackageImpl
